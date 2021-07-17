package testAws.ecs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.ecs.EcsClient;
import software.amazon.awssdk.services.ecs.model.ListTasksRequest;
import software.amazon.awssdk.services.ecs.model.ListTasksResponse;

//@Component
//public class ListTasks implements CommandLineRunner {
//
//  @Override
//  public void run(String... args) {
//
//    System.out.println("111");
//    var ecs = EcsClient.builder().build();
//    ListTasksRequest resp = ListTasksRequest.builder().cluster("obp-uat-apn1-api-cluster").build();
//
//    ListTasksResponse response = ecs.listTasks(resp);
////    response.
////    response.getValueForField("task-definition", listTaskDTO);
//    System.out.println("ListTasksRequest ~~ " + ecs.listTasks(resp));
//
//  }
//
//}
