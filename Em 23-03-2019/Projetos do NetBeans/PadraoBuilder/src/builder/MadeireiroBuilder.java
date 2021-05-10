package builder;

public class MadeireiroBuilder implements Builder {
    
    private Casa casa;

    @Override
    public void reset() {
        this.casa = new Casa();
        this.casa.setDescricao("****Casa de Madeira****\n");
    }

    @Override
    public void buildFundamento() {
        this.casa.setDescricao(this.casa.getDescricao() + "Fundamento de Concreto\n");
    }

    @Override
    public void buildParedes() {
        this.casa.setDescricao(this.casa.getDescricao() + "Paredes de Madeira\n");
    }

    @Override
    public void buildJanelas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Janelas de Madeira\n");
    }

    @Override
    public void buildTelhado() {
        this.casa.setDescricao(this.casa.getDescricao() + "Telhado de Madeira\n");
    }

    @Override
    public void buildGaragem() {
        this.casa.setDescricao(this.casa.getDescricao() + "Garegem de Madeira\n");
    }

    @Override
    public void buildMuro() {
        this.casa.setDescricao(this.casa.getDescricao() + "Muro de Madeira\n");
    }

    @Override
    public void buildJardim() {
        this.casa.setDescricao(this.casa.getDescricao() + "Jardim com árvores normais\n");
    }

    @Override
    public void buildEstatuas() {
        this.casa.setDescricao(this.casa.getDescricao() + "Estatuas de Madeira\n");
    }

    @Override
    public Casa getResult() {
        return this.casa;
    }
    
}
