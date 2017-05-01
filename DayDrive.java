import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;



public class DayDrive extends Application {
    public void start(Stage primaryStage){
        String []array= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        ChoiceDialog <String> dialog= new ChoiceDialog<>(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
        dialog.showAndWait();
    	Day day=new Day();
       System.out.println("Next day is " + day.nextDay(dialog.getResult()));
       System.out.println(" Previous Day is " + day.PreviousDay(dialog.getResult()));
       TextInputDialog input = new TextInputDialog();
       input.setContentText("How many days Do you want to add?");
       input.showAndWait();
       int num = Integer.parseInt(input.getResult());
       System.out.println("The Calculated Day is " + day.CalculateDay(dialog.getResult(), num));
}
}