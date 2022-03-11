//Main Application File CSCE 3513 Team 6 Project

//Main method
public class App{
    View view;
    Database DB;

    //Constructor 
    public App() throws ClassNotFoundException{
        this.DB = new Database();
        this.view = new View(this.DB);
    }

    //Launch Method
    public void launch(){
        view.launch();
    }
    public static void main(String args[]) throws ClassNotFoundException{
        App app = new App();
        app.launch();
    }

}