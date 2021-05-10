package builder;

public interface Builder {
    
    public void reset();
    public void buildFundamento();
    public void buildParedes();
    public void buildJanelas();
    public void buildTelhado();
    public void buildGaragem();
    public void buildMuro();
    public void buildJardim();
    public void buildEstatuas();
    public Casa getResult();
    
}
