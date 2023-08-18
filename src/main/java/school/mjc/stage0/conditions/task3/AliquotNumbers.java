package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        float result = first % second;
        if(result == 0.0f){
            System.out.println("Aliquot");
        }else{
            System.out.println("Not aliquot");
        }
    }
}
