package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.sortmethods.Burbuja;
import sample.sortmethods.Merge;
import sample.sortmethods.Quicksort;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Gui_Controller implements Initializable {

    @FXML Button btnTest;

    FileChooser fileChooser = new FileChooser();
    File file;
    Stage stage = new Stage();
    FileReader fr;
    BufferedReader br;
    String txtDatos;

    int [] array;

    @FXML private void CargarArchivo(){
        file = fileChooser.showOpenDialog(stage);
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            txtDatos = br.readLine();

            br.close();

        } catch (FileNotFoundException e){

        } catch (IOException e) {

        }

        String[] strings = txtDatos.split(",");
        /*
        for (int i = 0; i < strings.length; i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        */

        int a = 0;
        array = new int[strings.length];
        for (String s:strings) {

            array[a] = Integer.parseInt(s);
            a++;
            //System.out.println(s);
        }


        btnTest.setDisable(false);
    }

    @FXML private void runTest(){
        Burbuja burbuja = new Burbuja();
        Merge merge = new Merge();
        Quicksort quicksort = new Quicksort();

        quicksort.sort(array);

        //merge.merge_sort(array);

        //burbuja.Bubblesort(array);

    }

    @Override
    public void initialize(URL arg, ResourceBundle rb) {

    }
}
