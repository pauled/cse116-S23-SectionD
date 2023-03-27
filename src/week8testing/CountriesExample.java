package week8testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountriesExample {
    public static ArrayList<String> readFile(String filename){
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e){
            return new ArrayList<>();
        }
    }

    public static HashMap<String,ArrayList<City>> loadCountries(){
        HashMap<String,ArrayList<City>> countries=new HashMap<>();
        ArrayList<String> lines=readFile("data/cities.csv");
        lines.remove(0);
        for (String line : lines){
            ArrayList<String> splits=new ArrayList<>(Arrays.asList(line.split(",")));
            System.out.println(splits);
        }
        return countries;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<City>> countries=loadCountries();
    }
}
