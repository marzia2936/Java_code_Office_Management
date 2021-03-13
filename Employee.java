
package officemanagementsystem;

public class Employee {
    int emp_id;
    int working_hour;
    String shift;
    
    Employee(int e, int w,String s){
        emp_id=e;
        working_hour=w;
        shift=s;
    }
    
    
 void check_document_status(Document d1){
     if(d1.status=="good"){
         System.out.println("We can deal");
     }
     else if(d1.status=="done"){
         System.out.println("Proceed");
     }
 }   
 
    
}
