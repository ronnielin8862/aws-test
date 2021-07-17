package testAws.s3;

import java.util.Arrays;
import java.util.Objects;
import software.amazon.awssdk.services.s3.S3Client;

public abstract class S3Operation<T> {

    private S3Client client = (S3Client)S3Client.builder().build();
    protected static final String SEPARATOR = "/";

    protected S3Operation() {
    }

    protected S3Client getClient() {
      return this.client;
    }

    protected static boolean isAnyStringEmpty(String... args) {
      return Objects.isNull(args) ? true : Arrays.stream(args).anyMatch(S3Operation::isStringEmpty);
    }

    protected static boolean isStringEmpty(String str) {
      return Objects.isNull(str) || str.length() == 0;
    }


  }
