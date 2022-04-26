package example.myapp

class TowerTank(override var height: Int, var diameter: Int):Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * Math.PI).toInt()
        set(value) {
            height = ((value * 1000 / Math.PI) / (width / 2 * length / 2)).toInt()
        }
    override var water:Double = volume * 0.8
    override val shape = "cylinder"
}