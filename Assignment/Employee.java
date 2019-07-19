package Assignment;

public class Employee {
    public void getinfo(int salary , int time){
        int wsalary=salary;
        int wtime=time;

        System.out.println("The salary is "+wsalary+" dollars and the hours worked is "+ wtime);
    }

    public void addSal(int salary){
        if(salary<500){
            int wsalary = 10+salary;
            System.out.println(wsalary);
        }
    }

    public void addWork(int time , int salary){
        if(time>6){
            int wsalary= salary + 5;
            System.out.println(wsalary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getinfo(200,8);
        emp.addSal(400);
        emp.addWork(9,455);

    }
}
