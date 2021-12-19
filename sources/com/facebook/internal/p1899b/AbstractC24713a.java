package com.facebook.internal.p1899b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b.a */
public interface AbstractC24713a extends Serializable {
    static {
        Covode.recordClassIndex(28866);
    }

    JSONObject convertToJSONObject();

    String getEventName();

    EnumC24724b getLogCategory();
}
