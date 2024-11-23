package models;



public class Producer  {
    private String firsName;
    private String lastName;

    public Producer() {
    }

    public Producer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return
                "firsName='" + firsName +
                ", lastName='" + lastName
                ;
    }



}
