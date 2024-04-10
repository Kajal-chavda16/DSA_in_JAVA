

public class Student implements Comparable<Student> {
    int rollno ;
    float marks ;

    public Student(int rollno , float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public String toString(){
        return marks + " ";
    }

    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks) ;
        return diff ;
        
        // if diff == 0 ; both are equal
        // if diff < 0 ; than o is bigger than o is smaller
    }
}
