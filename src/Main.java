import java.util.Date;
public class Main {
    public static void main(String[]args){
        String patientName="stacy Mason";
        boolean hasInsurance=false;
        double temp=102.2;
        int numVisits=5;
        int copayAmount=40;
        Date nextAppointmentDate = new Date();
        long contactNumber= 1240387000;
        System.out.println("Patient Details:");
        System.out.println("patientName: " +patientName);
        System.out.println("patient has insurance: "+hasInsurance);
        System.out.println("Body temprature: "+temp);
        System.out.println("Number of visits: "+numVisits);
        System.out.println("The copay amount is "+copayAmount);
        System.out.println("The next appointment date is : "+ "2021-19-02");
        System.out.println("contact number of the patient is: "+contactNumber);

    }

}
