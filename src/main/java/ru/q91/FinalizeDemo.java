package ru.q91;

public class FinalizeDemo {
    public static void main(String[] args) {
        User user1=new User(1);
        user1=null;

        User user2=new User(2);
        Object user3=user2;
//        user2=user1;
        System.gc();
    }
}

class User{
    private int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(" delete - "+id);
        } finally {
            super.finalize();
        }

    }
}
