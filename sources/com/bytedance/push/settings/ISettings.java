package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface ISettings {
    static {
        Covode.recordClassIndex(25540);
    }

    void registerValChanged(Context context, String str, String str2, AbstractC21887a aVar);

    void unregisterValChanged(AbstractC21887a aVar);

    void updateSettings(Context context, JSONObject jSONObject);
}
