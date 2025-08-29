import AST.Program;
import Visitor.visitor;
import HtmlGenerator.HtmlBuilder;
import antler.AngularLexer;
import antler.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("Compiler_Project-main/src/Test");
        File[] files = folder.listFiles();

        for (int i = 0; i < files.length; i++) {
            String source = files[i].getPath();
            System.out.println("معالجة الملف: " + source);

            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            Program program = (Program) new visitor().visit(tree);

            // طباعة AST
            System.out.println("=== شجرة التحليل المجردة (AST) ===");
            System.out.println(program);

            // بناء صفحة HTML
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            htmlBuilder.buildFromProgram(program, source);

            // حفظ صفحة HTML
            String outputFileName = "output_" + (i + 1) + ".html";
            htmlBuilder.saveToFile(outputFileName);

            System.out.println("=== تم إنشاء صفحة HTML: " + outputFileName + " ===\n");
        }
    }
}
