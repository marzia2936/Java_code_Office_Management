
package officemanagementsystem;

public class Main {

    
    public static void main(String[] args) {
        
        Employee e1 = new Employee(101,8,"morning");
        Document d1 = new Document("good");
        Admin a1 = new Admin();
        a1.check_working_hour(e1);
        e1.check_document_status(d1);
        
    }
    
}
