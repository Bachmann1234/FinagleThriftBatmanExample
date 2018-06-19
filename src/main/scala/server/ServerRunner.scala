package server

import com.twitter.finagle._
import com.twitter.util.Await

object ServerRunner {
  def main(args:Array[String]): Unit = {
    println("**********************************************")
    val server: ListeningServer = Thrift.server.serveIface(
      "localhost:8080",
      new BatmanServerImpl
    )
    println("**********************************************")
    Await.ready(server)
  }
}