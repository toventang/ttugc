package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public interface IAdThirdTrackerDepend {
    static {
        Covode.recordClassIndex(18385);
    }

    void track(String str, List<String> list, Long l, String str2, JSONObject jSONObject);
}
