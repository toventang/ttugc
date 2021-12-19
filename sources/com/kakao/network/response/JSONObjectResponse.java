package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public class JSONObjectResponse {
    private ResponseBody body;

    static {
        Covode.recordClassIndex(33956);
    }

    public JSONObjectResponse() {
    }

    /* access modifiers changed from: protected */
    public ResponseBody getBody() {
        return this.body;
    }

    public JSONObjectResponse(String str) {
        this.body = new ResponseBody(str);
    }
}
