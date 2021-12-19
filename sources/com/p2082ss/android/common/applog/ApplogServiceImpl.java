package com.p2082ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.service.middleware.applog.AbstractC28934a;
import com.service.middleware.applog.ApplogService;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.ApplogServiceImpl */
public class ApplogServiceImpl implements ApplogService {
    public static final String TAG = ApplogServiceImpl.class.getSimpleName();
    public static volatile AbstractC28934a cachedHeaderCustomTimelyCallback = null;
    public static volatile boolean isServicePrepared = false;

    /* renamed from: com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m59956xe4f680ce(String str, String str2) {
        return 0;
    }

    public static void handleCachedData() {
        if (isServicePrepared && cachedHeaderCustomTimelyCallback != null) {
            AppLog.registerHeaderCustomCallback(cachedHeaderCustomTimelyCallback);
        }
    }

    static {
        Covode.recordClassIndex(36167);
    }

    @Override // com.service.middleware.applog.ApplogService
    public void registerHeaderCustomCallback(AbstractC28934a aVar) {
        if (isServicePrepared) {
            AppLog.registerHeaderCustomCallback(aVar);
        } else {
            cachedHeaderCustomTimelyCallback = aVar;
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str) {
        if (isServicePrepared) {
            C29807s.m60041a(context, "event_v1", str, null, 0, 0, false, null);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2) {
        if (isServicePrepared) {
            C29807s.m60041a(context, "event_v1", str, str2, 0, 0, false, null);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        if (isServicePrepared) {
            C29807s.m60041a(context, str, str2, str3, j, j2, false, null);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (isServicePrepared) {
            C29807s.m60041a(context, str, str2, str3, j, j2, false, jSONObject);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z) {
        if (isServicePrepared) {
            C29807s.m60041a(context, str, str2, str3, j, j2, z, null);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (isServicePrepared) {
            C29807s.m60041a(context, str, str2, str3, j, j2, z, jSONObject);
        } else {
            m59956xe4f680ce(TAG, "ApplogService not prepared!");
        }
    }
}
