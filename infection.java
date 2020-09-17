public class infection {
  int month;
  int day;
  int year;
  String zone;
  int cleanZone;
  char gender;
  String age;
  int cleanAge;
  String status;
  boolean confirmed;
  int caseNumber;

  // Constructer with Date input as String
  infection(int caseNumber, String date, String zone, String gender, String age, String status, String confirmed) {
    this.caseNumber = caseNumber;
    this.zone = zone;
    //Sets gender int
    if(gender.equals("Male")){
      this.gender = 'M';
    }else{
      this.gender = 'F';
    }
    this.age = age;
    this.status = status;
    //Case confermation set
    if(confirmed.equals("Confirmed")){
      this.confirmed = true;
    }else{
      this.confirmed = false;
    }
    setDate(date);
    this.cleanAge = setAge(age);
    this.cleanZone = setZone(zone);
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

  int setAge(String age){
    if(age.contains("Under")){
      return 0;
    }
    else if(age.contains("+")){
      return 85;
    }
    else if(age.contains("Unknown")){
      return -1;
    }
    else{
      String[] ageA = age.split("-");
      String[] ageB = ageA[1].split(" ");
      return (Integer.parseInt(ageA[0]) + Integer.parseInt(ageB[0]))/2;
    }

  }

  int setZone(String zone){
    if(zone.equals("Calgary Zone")){
      return 3;
    }
    else if(zone.equals("Edmonton Zone")){
      return 1;
    }
    else if(zone.equals("Central Zone")){
      return 2;
    }
    else if(zone.equals("North Zone")){
      return 0;
    }
    else if(zone.equals("South Zone")){
      return 4;
    }
    else{
      return -1;
    }
  }
}