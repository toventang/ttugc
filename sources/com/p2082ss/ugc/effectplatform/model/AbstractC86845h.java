package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.model.h */
public abstract class AbstractC86845h<T> {
    static {
        Covode.recordClassIndex(102570);
    }

    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public final boolean checkStatusCode() {
        if (getStatusCode() == 0) {
            return true;
        }
        return false;
    }

    public boolean checkValue() {
        if (getResponseData() != null) {
            return true;
        }
        return false;
    }
}
