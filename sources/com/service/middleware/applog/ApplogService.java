package com.service.middleware.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface ApplogService extends IService {
    static {
        Covode.recordClassIndex(35084);
    }

    void onEvent(Context context, String str);

    void onEvent(Context context, String str, String str2);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z);

    void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject);

    void registerHeaderCustomCallback(AbstractC28934a aVar);
}
