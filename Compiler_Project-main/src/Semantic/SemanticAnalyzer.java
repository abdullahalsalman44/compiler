package Semantic;

import SymbolTable.Row;
import SymbolTable.SymbolTable;

import java.util.*;

public class SemanticAnalyzer {

    private final SymbolTable symbolTable;
    Set<String> selectors = new HashSet<>();
    Set<String> duplicatedSelectors = new HashSet<>();
    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void analyze() {
        List<Row> rows = symbolTable.getRows();
<<<<<<< HEAD
        Set<String> classNames = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Row row : rows) {
            if ("ClassName".equals(row.getType())) {
                String className = row.getName();
                if (!classNames.add(className)) {
                    duplicates.add(className);
=======

            Set<String> classNames = new HashSet<>();
            Set<String> duplicates = new HashSet<>();

            for (Row row : rows) {
                if ("ClassName".equals(row.getType())) {
                    String className = row.getName();
                    if (!classNames.add(className)) {
                         duplicates.add(className);
                    }
>>>>>>> 77b6bd24897e9d08bec92ae4079c7c1381b8f9e6
                }
            }
        }
        for (String dup : duplicates) {
            System.err.println("Semantic Error: Duplicate class definition '" + dup + "'");
        }
        if(!checkSelectoreExists()){
            System.err.println("Semantic Error: No Selector");
        }
        if (!checkDirectiveAray()){
            System.err.println("Semantic Error: Array not found");
        }
        for (Row row : rows){
            if("Selector".equals(row.getType())){
                if(checkSelectorDuplication(row))
                    System.err.println("Semantic Error: Duplicate selector definition '" + row.getValue() + "'");
<<<<<<< HEAD
            }
        }
        checkExportsAreDeclared();
    }
    private void checkExportsAreDeclared() {
        // Map to track module declarations and exports
        Map<String, Set<String>> moduleDeclarations = new HashMap<>();
        Map<String, Set<String>> moduleExports = new HashMap<>();

        // First pass: collect all declarations and exports
        for (Row row : symbolTable.getRows()) {
            if (row.getType().equals("DECLARATION") && row.getModuleName() != null) {
                moduleDeclarations
                        .computeIfAbsent(row.getModuleName(), k -> new HashSet<>())
                        .add(row.getName());
            } else if (row.getType().equals("EXPORT") && row.getModuleName() != null) {
                moduleExports
                        .computeIfAbsent(row.getModuleName(), k -> new HashSet<>())
                        .add(row.getName());
=======
>>>>>>> 77b6bd24897e9d08bec92ae4079c7c1381b8f9e6
            }
        }

        // Second pass: verify exports are declared
        for (Map.Entry<String, Set<String>> entry : moduleExports.entrySet()) {
            String moduleName = entry.getKey();
            Set<String> exports = entry.getValue();
            Set<String> declarations = moduleDeclarations.getOrDefault(moduleName, new HashSet<>());

<<<<<<< HEAD
            for (String export : exports) {
                if (!declarations.contains(export)) {
                    System.err.println("Semantic Error: Export '" + export +
                            "' is not declared in NgModule '" + moduleName + "'");
                }
            }
        }
    }
=======
        checkExportsAreDeclared();


    }
    private void checkExportsAreDeclared() {
        // Map to track module declarations and exports
        Map<String, Set<String>> moduleDeclarations = new HashMap<>();
        Map<String, Set<String>> moduleExports = new HashMap<>();

        // First pass: collect all declarations and exports
        for (Row row : symbolTable.getRows()) {
            if (row.getType().equals("DECLARATION") && row.getModuleName() != null) {
                moduleDeclarations
                        .computeIfAbsent(row.getModuleName(), k -> new HashSet<>())
                        .add(row.getName());
            } else if (row.getType().equals("EXPORT") && row.getModuleName() != null) {
                moduleExports
                        .computeIfAbsent(row.getModuleName(), k -> new HashSet<>())
                        .add(row.getName());
            }
        }

        // Second pass: verify exports are declared
        for (Map.Entry<String, Set<String>> entry : moduleExports.entrySet()) {
            String moduleName = entry.getKey();
            Set<String> exports = entry.getValue();
            Set<String> declarations = moduleDeclarations.getOrDefault(moduleName, new HashSet<>());

            for (String export : exports) {
                if (!declarations.contains(export)) {
                    System.err.println("Semantic Error: Export '" + export +
                            "' is not declared in NgModule '" + moduleName + "'");
                }
            }
        }
    }
>>>>>>> 77b6bd24897e9d08bec92ae4079c7c1381b8f9e6
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

    public  boolean checkDirectiveAray(){
        for (Row row : symbolTable.getRows()){
            int counter=0;
            if(row.getType().equals("directive") ){
                if(row.getName().equals("*ngFor")){
                    String attValue = row.getValue();
                    int indexOf = attValue.indexOf("of");

                    if(indexOf != -1){
                        String arrayName = attValue.substring(indexOf + 3 , attValue.length()-1);
                        for (Row row1 : symbolTable.getRows()){
                            if(row1.getType().equals("array")){
                                System.out.println(arrayName);
                                if(row1.getName().equals(arrayName)){
                                    counter++;
                                }
                            }
                        }
                        if (counter == 0){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public  boolean checkSelectorDuplication(Row row) {
<<<<<<< HEAD
        String selectorValue = row.getValue();
        if (!selectors.add(selectorValue)) {
            duplicatedSelectors.add(selectorValue);
        }
=======
                String selectorValue = row.getValue();
                if (!selectors.add(selectorValue)) {
                    duplicatedSelectors.add(selectorValue);
                }
>>>>>>> 77b6bd24897e9d08bec92ae4079c7c1381b8f9e6
        return !duplicatedSelectors.isEmpty();
    }
}