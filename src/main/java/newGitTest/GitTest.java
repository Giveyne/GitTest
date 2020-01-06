package newGitTest;

public class GitTest {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "id=" + id +
                '}';
    }
    public boolean isNew (){
        return (this.id == null);
    }
}
