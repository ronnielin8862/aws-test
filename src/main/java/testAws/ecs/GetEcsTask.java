package testAws.ecs;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.ecs.EcsClient;
import software.amazon.awssdk.services.ecs.model.DescribeTasksRequest;
import software.amazon.awssdk.services.ecs.model.DescribeTasksResponse;
import software.amazon.awssdk.services.ecs.model.ListTasksRequest;
import software.amazon.awssdk.services.ecs.model.ListTasksResponse;


//@Component
//public class GetEcsTask implements CommandLineRunner {

//  @Override
//  public void run(String... args) {
//
//    var ecs = EcsClient.builder().build();
//    ListTasksRequest resp = ListTasksRequest.builder().cluster("obp-uat-apn1-api-cluster").build();
//    ListTasksResponse listTasks = ecs.listTasks(resp);
//    //todo 創建一個物件接收task
//    List<String> responseList = Arrays.asList(listTasks.toString().split(":"));
//    String taskDefinition = responseList.stream().filter(str -> str.contains("task-definition")).map(task -> task.split("/",1)).toString();
//    System.out.println("222");
//    DescribeTasksRequest des = DescribeTasksRequest.builder()
//        .cluster("obp-ut-apn1-api-cluster")
//        .tasks("285f34f65a664658a1d87888072303f7")
//        .build();
//    System.out.println("333");
////    DescribeTasksResponse resp = ecs.describeTasks(des);
//    System.out.println("444");
////    System.out.println(resp.tasks().toString());
//    System.out.println("555");
//
//  }

//}
