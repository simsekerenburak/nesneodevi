import java.util.Arrays;

class StudentManager {
    private String[] students;
    private int[] times;

    public StudentManager(String[] students, int[] times) {
        this.students = students;
        this.times = times;
    }

    public void printTopThree() {
        System.out.println("İlk üç dereceyi alan öğrenciler:");
        int[] sortedTimes = Arrays.copyOf(times, times.length);
        Arrays.sort(sortedTimes);
        for (int i = 0; i < 3; i++) {
            int index = indexOf(times, sortedTimes[i]);
            System.out.println(students[index] + ": " + times[index]);
        }
    }
    public void classifyStudents() {
        int classA = 0, classB = 0, classC = 0;
        for (int time : times) {
            if (time >= 200 && time < 300) {
                classA++;
            } else if (time >= 300 && time < 400) {
                classB++;
            } else {
                classC++;
            }
        }
        System.out.println("A → " + classA + ", B → " + classB + ", C → " + classC);
    }

    private int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private int findLowestTimeIndex() {
        int minIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int findSecondBestIndex() {
        int bestTimeIndex = findLowestTimeIndex();
        int bestTime = times[bestTimeIndex];
        int secondBestTime = Integer.MAX_VALUE;
        for (int time : times) {
            if (time > bestTime && time < secondBestTime) {
                secondBestTime = time;
            }
        }
        return indexOf(times, secondBestTime);
    }
}
