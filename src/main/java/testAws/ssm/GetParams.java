//package testAws.ssm;
//
//import java.util.Iterator;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import software.amazon.awssdk.services.ssm.SsmClient;
//import software.amazon.awssdk.services.ssm.model.DescribeParametersRequest;
//import software.amazon.awssdk.services.ssm.model.DescribeParametersResponse;
//import software.amazon.awssdk.services.ssm.model.ParameterMetadata;
//import software.amazon.awssdk.services.ssm.model.SsmException;
//
//@Component
//public class GetParams implements CommandLineRunner {
//
//  @Value("${abc.test}")
//  private String test;
//
//  @Value("${bbb}")
//  private String testBBB;
//
//  public void testGetSSM() {
//    System.out.println("start");
//    System.out.println("test = " + test);
//    System.out.println("testBBB = " + testBBB);
//  }
//
//  @Override
//  public void run(String... args) {
//    SsmClient ssmClient = SsmClient.builder()
//        .build();
//    describeParams(ssmClient);
//    ssmClient.close();
//
//    System.out.println("#####");
//    testGetSSM();
//  }
//
//  //測試程式實際抓取ssm的帳號、區域
//  public static void describeParams(SsmClient ssmClient) {
//
//    try {
//      // Create a DescribeParametersRequest object
//      DescribeParametersRequest desRequest = DescribeParametersRequest.builder()
//          .maxResults(10)
//          .build();
//
//      // Get SSM Parameters (you can define them in the AWS Console)
//      DescribeParametersResponse desResponse = ssmClient.describeParameters(desRequest);
//
//      List<ParameterMetadata> params = desResponse.parameters();
//
//      //Iterate through the list
//      Iterator<ParameterMetadata> paramIterator = params.iterator();
//      while(paramIterator.hasNext()) {
//        ParameterMetadata paraMeta = paramIterator.next();
//        System.out.println(paraMeta.name());
//        System.out.println(paraMeta.description());
//      }
//    } catch (SsmException e) {
//      e.getStackTrace();
//    }
//  }
//}
