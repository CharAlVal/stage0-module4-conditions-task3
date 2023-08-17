package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int perCent;
        if(salary <= 10000){
            perCent = ((salary/2)/10)*3;
            System.out.println(salary-perCent);
        }
        if(salary > 10000 && salary <= 20000){
            perCent = (salary/100)*18;
            System.out.println(salary-perCent);
        }
        if(salary > 20000){
            perCent = (salary/10)*2;
            System.out.println(salary-perCent);
        }
        if(salary == 0){
            System.out.println("wrong input!");
        }
    }
}
