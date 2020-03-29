package com.ballew.StateInfoApi.misc;

import com.ballew.StateInfoApi.domain.State;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQLGenerator {

    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\jball\\Desktop\\StateInfoApi\\StateData.tsv";

        File f = new File(path);
        Scanner scan = new Scanner(f);
        List<State> states = new ArrayList<>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] tokens = line.split("\t");
            states.add(new State(tokens[0], tokens[1], tokens[2], Integer.valueOf(tokens[3]), Integer.valueOf(tokens[4]), tokens[5]));
        }

        states.forEach(i -> {
            String sql = "INSERT INTO STATE_INFO (State_Name, State_Abrv, State_Capital, Capital_Since, Capital_Population, Fun_Fact) " +
                    "VALUES ('" + i.getName() + "', '" + i.getAbbreviation() + "', '" + i.getCapital() + "', '" + i.getCapitalSince() + "','" + i.getCapitalPopulation() + "','" + i.getFunFact().replace("'","") + "');";
            System.out.println(sql);
        });
    }
}
