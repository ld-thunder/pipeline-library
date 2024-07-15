def clouds = ["kubernetes"]
def call() {
    int randomIndex = new Random().nextInt(clouds.size())
    return clouds[randomIndex]
}
