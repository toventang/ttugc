package org.eclipse.mat.json;

import com.bytedance.covode.number.Covode;

public class JSONException extends Exception {
    static {
        Covode.recordClassIndex(106500);
    }

    public JSONException(String str) {
        super(str);
    }
}
