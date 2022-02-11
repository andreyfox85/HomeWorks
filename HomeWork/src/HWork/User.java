package HWork;

public class User {
    private String name;
    private int rightAnswersCount;

    public User(String name) {
        this.name = name;
    }

    private int wrongAnswersCount;
    public int getWrongAnswersCount() {
        return wrongAnswersCount;
    }
    public void setWrongAnswersCount(int wrongAnswersCount) {
        this.wrongAnswersCount = wrongAnswersCount;
    }
    public User(int wrongAnswersCount) {
        this.wrongAnswersCount = wrongAnswersCount;
    }
    public int getRightAnswersCount() {
        return rightAnswersCount;
    }
    public void setRightAnswersCount() {
        if (rightAnswersCount<0){
            System.out.println("Right answer count can not be < 0");
            return;
        }
        this.rightAnswersCount = rightAnswersCount;
    }

    public String getName() {
        return name;
    }
    public User() {
    }
    public void setName(String name) {
        if (name.length()<1){
            System.out.println("Name is not valid");
            return;}

        this.name = name;
    }

}