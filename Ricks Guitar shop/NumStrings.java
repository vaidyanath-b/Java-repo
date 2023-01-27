public enum NumStrings {
    
    TWELVE;

    public String toString() {
        switch(this)
        {
            case TWELVE : return "12";
            default : return "no such strings";
        }
    }
}
