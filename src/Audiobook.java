public class Audiobook extends Book{

    private int duration;
    public Audiobook(int id, String a, String t, int d){
        super(id, a, t);
        this.duration = d;
    }

    public double getDuration() {
        return duration;
    }

    /*@Override
    public String toString() {
        return getId() +
                ", " + getAuthor() +
                ", " + getTitle() + ", " + duration;

    }*/
   @Override
    public String toString() {
        return super.toString() + ", " + duration;
    }
}
