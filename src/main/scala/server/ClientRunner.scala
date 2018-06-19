package server
import com.twitter.finagle._
import _root_.thrift.BatmanServer
import _root_.thrift.BatmanServer.Ping
import _root_.thrift.BatmanServer.GetVillain
import com.twitter.util.{Await, Future}

object ClientRunner {
    def main(args:Array[String]): Unit = {
      println("*************************************************************")
      val client: BatmanServer.ServicePerEndpoint =
        Thrift.client.servicePerEndpoint[BatmanServer.ServicePerEndpoint](
          "localhost:8080",
          "thrift_client"
        )
      println("**********************************************")
      val pingResult: Future[Ping.SuccessType] = client.ping(
        Ping.Args()
      )
      println(Await.result(pingResult))
      val villianResult: Future[GetVillain.SuccessType] = client.getVillain(
        GetVillain.Args(1)
      )
      println(Await.result(villianResult))
    }
}
