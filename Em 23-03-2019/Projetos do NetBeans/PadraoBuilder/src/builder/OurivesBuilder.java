package builder;

public class OurivesBuilder implements Builder{
    
    private Casa casa;

    @Override
    public void reset() {
        this.casa = new Casa();
        this.casa.setDescricao("****Casa Preciosa****\n");
    }

    @Override
    public void buildFundamento() {
        this.casa.setDescricao(this.casa.getDescricao() + "Fundamento de Diamantes\n");
    }

    @Override
    public void buildParedes() {
        this.casa.setDescricao(this.casa.getDescricao() + "Paredes de Ruby\n");
    }

    @Override
    public void buildJanelas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Janelas de Quartzo\n");
    }

    @Override
    public void buildTelhado() {
        this.casa.setDescricao(this.casa.getDescricao() + "Telhado de Prata\n");
    }

    @Override
    public void buildGaragem() {
        this.casa.setDescricao(this.casa.getDescricao() + "Garegem de Ouro\n");
    }

    @Override
    public void buildMuro() {
        this.casa.setDescricao(this.casa.getDescricao() + "Muro de brilhantes\n");
    }

    @Override
    public void buildJardim() {
        this.casa.setDescricao(this.casa.getDescricao() + "Jardim com árvores douradas\n");
    }

    @Override
    public void buildEstatuas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Estatuas de Bronze\n");
    }

    @Override
    public Casa getResult() {
        return this.casa;
    }
    
}
