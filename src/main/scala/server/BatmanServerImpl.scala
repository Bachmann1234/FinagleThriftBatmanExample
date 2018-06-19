package server

import thrift.{BatmanServer, Case, Location}
import com.twitter.util.{Future, FuturePool}

class BatmanServerImpl extends BatmanServer.MethodPerEndpoint {
  // stub implementation just to get some data going
  override def ping(): Future[String] = FuturePool.unboundedPool {
    println("Hello World!")
    "Pong"
  }

  override def getVillain(villainId: Int) = FuturePool.unboundedPool {
    thrift.Villain.apply(2, "Two-face")
  }

  override def addVillian(name: String, description: String, hideoutLocation: Location) = FuturePool.unboundedPool {
    thrift.Villain.apply(1, "Joker")
  }

  override def saveCase(caseToSave: Case): Future[Boolean] = FuturePool.unboundedPool {
    true
  }
}
