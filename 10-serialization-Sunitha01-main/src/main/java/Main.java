import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){

        // TODO instantiate your classes and  set the fields
        Sandwitch object = new Sandwitch("lamb", "mozerella","rye","olives");
        String filename = "sandwitch.ser";

        CoffeMaker coffee = new CoffeMaker(2,1,1);
        XmlMapper xmlMapper = new XmlMapper();

        Person person1 = new Person("peter",10);
        Gson gson = new Gson();

        // TODO serialize your objects to a file using native Java serialization.  Use .ser as the file extension
        try
        {

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);

            out.close();
            file.close();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        // TODO deserialize your objects from the ser files back into objects
        try
        {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);


            object = (Sandwitch)in.readObject();

            in.close();
            file.close();


            System.out.println(object);

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }




        // TODO serialize your objects to a file using xml serialization.  Use .xml as the file extension
        try {


            String xmlString = xmlMapper.writeValueAsString(coffee);
            File xmlOutput = new File("coffee.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();

        }
        catch (IOException ex){
            ex.printStackTrace();

        }
        // TODO deserialize your objects from the xml files back into objects
        try {
            String readContent = new String(Files.readAllBytes(Paths.get("coffee.xml")));
            CoffeMaker c = xmlMapper.readValue(readContent, CoffeMaker.class);
            System.out.println(c);
        }
        catch (JsonProcessingException e){
        e.printStackTrace();

    }
        catch (IOException ex){
            ex.printStackTrace();

        }

        // TODO serialize your objects to a file using Json serialization (via Google Gson).  Use .json as the file extension
        try{


           
            Writer writer = new FileWriter("Person.json");
            gson.toJson(person1, writer);
            writer.close();


        }
        catch (IOException ex){
            ex.printStackTrace();

        }

        // TODO deserialize your objects from the json files back into objects
        try{
            Person p = gson.fromJson(new FileReader("Person.json"),Person.class);
            System.out.println(p);
        }
        catch (IOException ex){
            ex.printStackTrace();

        }
    }
}

