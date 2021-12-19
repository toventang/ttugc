package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.model.b */
public class C86837b {
    public String message;
    public int status_code;

    static {
        Covode.recordClassIndex(102562);
    }

    public boolean checkValue() {
        return true;
    }

    public String toString() {
        return "BaseNetResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + '}';
    }
}
