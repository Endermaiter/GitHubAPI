import org.kohsuke.github.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {


        try {
            GitHub github = null;
            GitHub gitub = new GitHubBuilder().withOAuthToken("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").build();
            //GHRepository repo2 = github.createRepository("nuevo_repositorio_con_java").create();
            GHRepository rep = github.createRepository("nuevo_repositorio_con_java","Este es mi primer repositorio creado con java", "https://github.com/Endermaiter",true/*public*/);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
