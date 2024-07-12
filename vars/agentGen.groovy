def call(String podTemplate, String cloud, String container, Closure body) {
  def label = UUID.randomUUID().toString()
  def podYaml = libraryResource podTemplate
  podTemplate(
    name: label,
    label: label,
    yaml: podYaml,
    cloud: cloud,
    )
    {
    node(label) {
      container(container) {
        body()
      }
    }
  }
}
