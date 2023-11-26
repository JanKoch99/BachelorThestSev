public class Programming {
    Integer variableDefault = 0;

    void incrementVariableDefault() {
        System.out.println(this.variableDefault);
        this.variableOne ++;
    }

    void clearVariable() {
        this.variableOne = 0; //Variable should get cleared to 0
    }

    void printVariable() {
        System.out.println(this.variableDefault);
    }
}