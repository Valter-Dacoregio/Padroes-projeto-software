package builder;

public class Director {
    
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void mudarBuilder(Builder novoBuilder) {
        this.builder = novoBuilder;
    }
    
    public void makeCasaSimples() {
        this.builder.reset();
        this.builder.buildFundamento();
        this.builder.buildParedes();
        this.builder.buildJanelas();
        this.builder.buildTelhado();
    }
    
    public void makeCasaCompleta() {
        this.makeCasaSimples();
        this.builder.buildGaragem();
    }
    
    public void makeCasaSuperCompleta() {
        this.makeCasaCompleta();
        this.builder.buildMuro();
        this.builder.buildJardim();
        this.builder.buildEstatuas();
    }
    
}
