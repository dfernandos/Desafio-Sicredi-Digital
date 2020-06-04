package Utils;

import java.util.Objects;

public class SimulationValues {

    private String valorAplicar;
    private String valorInvestir;
    private String tempo;

    public SimulationValues(String valorAplicar, String valorInvestir, String tempo) {
        this.valorAplicar = valorAplicar;
        this.valorInvestir = valorInvestir;
        this.tempo = tempo;
    }

    public String getValorAplicar() {
        return valorAplicar;
    }

    public void setValorAplicar(String valorAplicar) {
        this.valorAplicar = valorAplicar;
    }

    public String getValorInvestir() {
        return valorInvestir;
    }

    public void setValorInvestir(String valorInvestir) {
        this.valorInvestir = valorInvestir;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimulationValues)) return false;
        SimulationValues simulationValues = (SimulationValues) o;
        return Objects.equals(getValorAplicar(), simulationValues.getValorAplicar()) &&
                Objects.equals(getValorInvestir(), simulationValues.getValorInvestir()) &&
                Objects.equals(getTempo(), simulationValues.getTempo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValorAplicar(), getValorInvestir(), getTempo());
    }

    @Override
    public String toString() {
        return "Simulator{" +
                "valorAplicar='" + valorAplicar + '\'' +
                ", valorInvestir='" + valorInvestir + '\'' +
                ", tempo='" + tempo + '\'' +
                '}';
    }
}
