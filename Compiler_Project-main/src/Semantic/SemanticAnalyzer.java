package Semantic;

import SymbolTable.Row;
import SymbolTable.SymbolTable;

import java.util.*;

public class SemanticAnalyzer {

    private final SymbolTable symbolTable;

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void analyze() {
        List<Row> rows = symbolTable.getRows();

        List<String> seenClasses = new ArrayList<>();
        Set<String> seenFunctions = new HashSet<>();
        Set<String> seenParameters = new HashSet<>();

        for (Row row : rows)
        {
            if(row.getType().equals("ClassName"))
            seenClasses.add(row.getValue());
        }
        System.out.println(seenClasses);
        for (Row row : rows) {
            String type = row.getType();
            String value = row.getValue();

            if(type == "ClassName"){
                for (int i=0 ; i<seenClasses.size() ; i++){
                    if(Objects.equals(seenClasses.get(i), value)){
                        seenClasses.remove(i);
                    }
                }
                if(seenClasses.contains(value)){
                    System.err.println("Semantic Error: Duplicate class definition '" + value + "'");
                }
            }
        }

        if(!checkSelectoreExists()){
            System.err.println("Semantic Error: No Selector");
        }


    }

    public boolean  checkSelectoreExists(){
        int selectorCounters = 0 ;

        for (Row row : symbolTable.getRows()){
            if(row.getType().equals("Selector")){
                selectorCounters++;
            }
        }
        if(selectorCounters == 0){
            return  false;
        }else {
            return  true;
        }
    }
}
