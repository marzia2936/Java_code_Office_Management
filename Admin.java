
package officemanagementsystem;


public class Admin {
    void check_working_hour(Employee e1){
        
        if(e1.working_hour>8){
            System.out.println("New work assignment");
        }
        else{
        System.out.println("Do Previous Work");
    }
    }
}
