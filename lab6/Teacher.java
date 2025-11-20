// Name : Ryan Lowry
// Date : 20/11/2025
// Student Number : C00305950
public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAXCOURSES = 10;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAXCOURSES];
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // course already exists
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        int courseIndex = numCourses; // initialize to "not found"

        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                courseIndex = i;
                break;
            }
        }

        if (courseIndex == numCourses) {
            return false; // not found
        } else {
            for (int i = courseIndex; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
        }

        numCourses--;
        return true;
    }
}
