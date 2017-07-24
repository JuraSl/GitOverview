package net.prospect.gitOverview;

/**
 * Created by User on 24/07/2017.
 */
public class BaseEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNwew(){
        return (this.id == null);
    }
}
