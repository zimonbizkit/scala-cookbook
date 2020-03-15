package objects

import com.PackageObjectsModel._ // doing the import as usual and not as package object level, will need to fix this
// it might be because I don't put the objects in its own package/folder

object PackageObjects {
  def main(args: Array[String]): Unit = {
    echo("Hello, world")
    echo(MAGIC_NUM)
    echo(Margin.LEFT)

    // use our MutableMap type (scala.collection.mutable.Map)
    val mm = MutableMap("name" -> "Al")
    mm += ("password" -> "123")
    for ((k,v) <- mm) printf("key: %s, value: %s\n", k, v)

  }
}
