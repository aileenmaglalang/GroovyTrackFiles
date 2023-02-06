class ETL {
  static transform(Map<String, Collection<String>> input) {
    input.collectEntries { key, value ->
      value.collect { it.toLowerCase() }.collectEntries { [(it): key as int] }
    }
  }
}