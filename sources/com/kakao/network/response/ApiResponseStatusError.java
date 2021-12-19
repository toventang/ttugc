package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.exception.ResponseStatusError;

public class ApiResponseStatusError extends ResponseStatusError {
    private static final long serialVersionUID = 3702596857996303483L;
    private final int errorCode;
    private final String errorMsg;
    private ResponseBody errorResponse;
    private final int httpStatusCode;

    static {
        Covode.recordClassIndex(33951);
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ResponseBody getErrorResponse() {
        return this.errorResponse;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApiResponseStatusError(int i, String str, int i2) {
        super(str);
        this.errorCode = i;
        this.errorMsg = str;
        this.httpStatusCode = i2;
    }

    public ApiResponseStatusError(int i, String str, int i2, ResponseBody responseBody) {
        this(i, str, i2);
        this.errorResponse = responseBody;
    }
}
