package Student_tutionCalculator;

public class Tution_calculator {
    public static void main(String[] args) {
        byte studentGradeLevel = 8;
        int BaseFees =30000;
        boolean isAcademicTopper = true;

        int discountpercent;
        if(studentGradeLevel >=9 && studentGradeLevel <=12){
        
           if (isAcademicTopper) {
             discountpercent =20;
           }

            else{
                discountpercent = 10;
            }
        }
            
            else if (studentGradeLevel>=6 && studentGradeLevel <=8) {
                discountpercent =5;

            }else{
                discountpercent =0;
            }
            if(studentGradeLevel==10){
                discountpercent+=3.0;
            }
            else if(studentGradeLevel==12){
                discountpercent   +=5.0;

            }

             int  discountAmount =(discountpercent/100)*BaseFees;
             int finalTutionFee = BaseFees- discountAmount;
            System.out.println("Grade Level:"+ studentGradeLevel);
            System.out.println("Academic Topper:"+ isAcademicTopper);
            System.out.println("BaseFees:"+ BaseFees);
            System.out.println("Final Tution Fee:"+ finalTutionFee);    

        }
    }


             
    
    


