package testAws.s3;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.core.sync.ResponseTransformer;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;

public class S3GetObject extends S3Operation<Optional<ResponseBytes>> {
    private static final Logger log = LoggerFactory.getLogger(S3GetObject.class);
    final String bucket;
    final String key;

    public Optional<ResponseBytes> operate() throws IllegalArgumentException, AwsServiceException {
      if (isStringEmpty(this.bucket)) {
        throw new IllegalArgumentException("empty bucket:" + this.bucket);
      } else if (isStringEmpty(this.key)) {
        throw new IllegalArgumentException("empty key:" + this.key);
      } else {
        GetObjectRequest req = GetObjectRequest.builder().bucket(this.bucket).key(this.key).build();

        try {
          ResponseBytes<GetObjectResponse> responseBytes = (ResponseBytes)this.getClient().getObject(req, ResponseTransformer
              .toBytes());
          GetObjectResponse resp = (GetObjectResponse)responseBytes.response();
          boolean isSuccess = resp.sdkHttpResponse().isSuccessful();
          if (!isSuccess) {
            throw AwsServiceException.builder().message("aws unsuccessful response").build();
          } else {
            log.info("success, bucket:{}, key:{}", this.bucket, this.key);
            return Optional.ofNullable(responseBytes);
          }
        } catch (AwsServiceException var5) {
          log.error("exception:{}, bucket:{}, key:{}", new Object[]{var5.getMessage(), this.bucket, this.key});
          return Optional.empty();
        }
      }
    }

    S3GetObject(String bucket, String key) {
      this.bucket = bucket;
      this.key = key;
    }

    public static S3GetObject.S3GetObjectBuilder builder() {
      return new S3GetObject.S3GetObjectBuilder();
    }

    public static class S3GetObjectBuilder {
      private String bucket;
      private String key;

      S3GetObjectBuilder() {
      }

      public S3GetObject.S3GetObjectBuilder bucket(String bucket) {
        this.bucket = bucket;
        return this;
      }

      public S3GetObject.S3GetObjectBuilder key(String key) {
        this.key = key;
        return this;
      }

      public S3GetObject build() {
        return new S3GetObject(this.bucket, this.key);
      }

      public String toString() {
        return "testAws.s3.S3GetObject.S3GetObjectBuilder(bucket=" + this.bucket + ", key=" + this.key + ")";
      }
    }
  }



