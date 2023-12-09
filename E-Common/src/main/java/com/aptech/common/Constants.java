//package com.aptech.common;
//
//public class Constants {
//public static final String S3_BASE_URI;
//
//	static {
//		String bucketName = System.getenv("AWS_BUCKET_NAME");
//		String region = System.getenv("AWS_REGION");
//		String pattern = "https://%s.s3.%s.amazonaws.com";
//
//		S3_BASE_URI = bucketName == null ? "" : String.format(pattern, bucketName, region);
//	}
//}
package com.aptech.common;

public class Constants {
    public static final String DRIVE_BASE_URI;

    static {
//        String folderId = System.getenv("GOOGLE_DRIVE_FOLDER_ID");
        String folderId = System.getenv("1L6iyfkQZV2u68abRfyV1BeLBBCiGwVFd");
        String pattern = "https://drive.google.com/drive/folders/%s";

        DRIVE_BASE_URI = folderId == null ? "" : String.format(pattern, folderId);
    }
}
