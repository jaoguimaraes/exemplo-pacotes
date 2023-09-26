package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }
    public void preparandoCombo(){
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONAR O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONAR FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    public void fritarIngredienteslanche() {
        System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}