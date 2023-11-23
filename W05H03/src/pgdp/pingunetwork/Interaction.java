package pgdp.pingunetwork;

// TODO: Fülle diese Klasse entsprechend der Aufgabenstellung
public class Interaction {
    private User user;
    private int interactionType;
    public Interaction(User user , int interactionType){
        this.interactionType = interactionType;
        this.user = user;
    }

    public int getInteractionType() {
        return interactionType;
    }

    public User getUser() {
        return user;
    }
}
