package itvdn.a_creational.d_Prototype;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Prototype {

    public int id;

    public Prototype(int id){
        this.id = id;
    }

    public abstract Prototype clone();


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
}
