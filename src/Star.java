public class Star {
    private String actorName;
    private String characterName;

    public Star(String actorName, String characterName) {
        this.actorName = actorName;
        this.characterName = characterName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String toString() {
        return actorName+" casted as "+characterName;
    }
}
