//package testAws.s3;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.stream.Collectors;
//import software.amazon.awssdk.awscore.exception.AwsServiceException;
//import software.amazon.awssdk.core.ResponseBytes;
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
//import testAws.s3.S3GetObject;
//
//public class TestS3Function {
//
//
//  public static void main(String[] args) throws IOException {
//
//    S3Client s3Client = S3Client.builder().build();
//
////  createS3Bucket(s3Client);
//
//    getObject(s3Client);
//
//  }
//
//
//  public static void getObject(S3Client s3Client) throws IOException {
//
////    GetObjectRequest getObjectRequest = GetObjectRequest.builder().bucket("obp-dev-tokyo-gp-original")
////        .key("TransactionDaily/original/GP_TRANSACTION_20200722_001.json").build();
////
////    ResponseInputStream<GetObjectResponse> responseResponseInputStream = s3Client.getObject(getObjectRequest);
////
////    byte[] bytes = responseResponseInputStream.readAllBytes();
//
//    String bucket = "obp-dev-tokyo-gp-original";
//
//    String fileName = "GP_TRANSACTION_20200722_999.json";
//
//    String key = "TransactionDaily/original/";
//
//    try (InputStream is = getS3File(bucket, key + fileName)) {
//
//      System.out.println("key+fileName = " + key + fileName);
//
//      String result = new BufferedReader(new InputStreamReader(is))
//          .lines().collect(Collectors.joining("\n"));
//
//      System.out.println("result = " + result);
//
//      ObjectMapper objectMapper = new ObjectMapper();
//
//      final GpTransactionDTO transactionDTOs = objectMapper.readValue(result, GpTransactionDTO.class);
////          Arrays.asList(objectMapper
////          .readValue(is,GpTransactionDTO[].class));
//
//      System.out.println("transactionDTOs = " + transactionDTOs);
////
////    String str = new String(bytes, StandardCharsets.UTF_8);
////
////    System.out.println("str = " + str);
////
////    JSONObject jsonObject = new JSONObject(str);
////
////    JSONArray objectJSONArray = jsonObject.getJSONArray("Report_Entry");
////    JSONObject jsonObject1 = objectJSONArray.getJSONObject(0);
////
////    String s = jsonObject1.get("INVOICE_DATE").toString();
////
////    System.out.println("uu = " + s);
//
//    }
//  }
//
//  public static void createS3Bucket(S3Client s3Client){
//
//    CreateBucketRequest createBucketRequest = CreateBucketRequest.builder()
//        .bucket("test-bucket-5566-cant-die")
//        .build();
//
//
//    s3Client.createBucket(createBucketRequest);
//  }
//
//  private static InputStream getS3File(String bucket, String key)
//      throws AwsServiceException, IllegalArgumentException {
//
//    return S3GetObject.builder().bucket(bucket).key(key).build().operate()
//        .map(ResponseBytes::asInputStream)
//        .orElseThrow(() -> new IllegalArgumentException("Unknown InputStream"));
//  }
//}
