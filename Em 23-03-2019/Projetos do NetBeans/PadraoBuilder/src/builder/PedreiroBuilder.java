package builder;

public class PedreiroBuilder implements Builder{
    
    private Casa casa;

    @Override
    public void reset() {
        this.casa = new Casa();
        this.casa.setDescricao("****Casa de Pedra****\n");
    }

    @Override
    public void buildFundamento() {
        this.casa.setDescricao(this.casa.getDescricao() + "Fundamento de Pedra\n");
    }

    @Override
    public void buildParedes() {
        this.casa.setDescricao(this.casa.getDescricao() + "Paredes de Alvenaria\n");
    }

    @Override
    public void buildJanelas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Janelas de pedra\n");
    }

    @Override
    public void buildTelhado() {
        this.casa.setDescricao(this.casa.getDescricao() + "Telhado de concreto\n");
    }

    @Override
    public void buildGaragem() {
        this.casa.setDescricao(this.casa.getDescricao() + "Garegem de Alvenaria\n");
    }

    @Override
    public void buildMuro() {
        this.casa.setDescricao(this.casa.getDescricao() + "Muro de Pedra\n");
    }

    @Override
    public void buildJardim() {
        this.casa.setDescricao(this.casa.getDescricao() + "Jardim com árvores petríficadas\n");
    }

    @Override
    public void buildEstatuas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Estatuas de Pedra\n");
    }

    @Override
    public Casa getResult() {
        return this.casa;
    }
    
}
