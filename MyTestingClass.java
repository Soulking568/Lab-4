import java.util.Random;

class MyTestingClass {
    private String data;

    public MyTestingClass(String data) {
        this.data = data;
    }

    // Custom hashCode implementation
    @Override
    public int hashCode() {
        int hash = 0;
        for (char c : data.toCharArray()) {
            hash += (int) c;
        }
        return hash;
    }

    @Override
    public String toString() {
        return data;
    }
}

class Student {
    // Student class implementation
}


