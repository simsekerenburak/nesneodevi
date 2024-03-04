public class Marathon {

    public static void main(String[] args) {
        String[] students = {"Kadir", "Gökhan","Hakan", "Suzan", "Pınar", "Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] times = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        StudentManager manager = new StudentManager(students, times);

        manager.printTopThree();
        manager.classifyStudents();
    }
}