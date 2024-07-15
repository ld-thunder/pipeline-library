def call() {
    def clouds = ["kubernetes"]
    int randomIndex = new Random().nextInt(clouds.size())
    return clouds[randomIndex]
}
