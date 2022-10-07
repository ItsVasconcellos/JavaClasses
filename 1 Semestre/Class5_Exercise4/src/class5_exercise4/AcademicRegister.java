/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5_exercise4;

/**
 *
 * @author Fernando
 */
public class AcademicRegister {

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public static void setNumeroMatricula(int aNumeroMatricula) {
        numeroMatricula = aNumeroMatricula;
    }
    private String name;
    private int courseCode;
    private float percentualBilling; 
    private static int numeroMatricula;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public float getPercentualBilling() {
        return percentualBilling;
    }

    public void setPercentualBilling(float percentualBilling) {
        this.percentualBilling = percentualBilling;
    }
    
    public AcademicRegister(String name, int courseCode, float percentualBilling )
    {
        numeroMatricula++;
        this.name = name;
        this.courseCode = courseCode;
        this.percentualBilling = percentualBilling;
    }
    
    public AcademicRegister()
    {
        numeroMatricula++;
    }
}
