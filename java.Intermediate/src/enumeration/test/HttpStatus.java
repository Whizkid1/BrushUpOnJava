package enumeration.test;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    //자동 private
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        if (code == 200) {
            return true;
        }
        return false;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] httpStatuses = HttpStatus.values();
//        HttpStatus httpStatus;
//        for (HttpStatus hs : httpStatuses) {
//            if (hs.code == code) {
////                httpStatus = hs;
//                httpStatus = HttpStatus.valueOf(hs.name());
//                break;
//            }
//        }
//        return httpStatus;

        for (HttpStatus hs : httpStatuses) {
        // -> for (HttpStatus hs : HttpStatus.values()) 가능
        // -> for (HttpStatus hs : values()) 가능
            if (hs.code == code) {
                return hs;
            }
        }
        return null;
    }
}
