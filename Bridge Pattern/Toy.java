package Ex;

abstract class Toy {
    Material material;
    public Toy(Material m) {this.material = m;}
    abstract void showType();
    void showDetails() {
        showType();
        material.Type();
    }
}
