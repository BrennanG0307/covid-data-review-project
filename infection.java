public class infection {
  int month;
  int day;
  int year;
  String zone;
  int gender;
  String age;
  String status;
  boolean confirmed;
  int caseNumber;

  // Constructer with Date input as String
  infection(int caseNumber, String date, String zone, String gender, String age, String status, String confirmed) {
    this.caseNumber = caseNumber;
    this.zone = zone;
    //Sets gender int
    if(gender.equals("Male")){
      this.gender = 0;
    }else{
      this.gender = 1;
    }
    this.age = age;
    this.status = status;
    //Case confermation set
    if(confirmed.equals("Confirmed")){
      this.confirmed = true;
    }else{
      this.confirmed = false;
    }
    //setDate(date);
  }

  void setDate(String date) {
    String[] seperatedDate = date.split("-");
    this.year = Integer.parseInt(seperatedDate[0]);
    this.month = Integer.parseInt(seperatedDate[1]);
    this.day = Integer.parseInt(seperatedDate[2]);
  }

  void printInfection() {
    System.out.println(confirmed);
  }
}