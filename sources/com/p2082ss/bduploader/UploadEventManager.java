package com.p2082ss.bduploader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.logupload.AppLogEngineUploader;
import com.p2082ss.bduploader.logupload.VideoEventEngineUploader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.UploadEventManager */
public enum UploadEventManager {
    instance;
    
    private boolean mEnableUseEngineUploader = true;
    private VideoEventEngineUploader mEngineUploader;
    private JSONArray mJsonArray = new JSONArray();

    /* renamed from: com_ss_bduploader_UploadEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147847x822fa356(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(100810);
    }

    public final JSONArray popAllEvents() {
        MethodCollector.m26663i(6507);
        JSONArray jSONArray = this.mJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mJsonArray = new JSONArray();
            } finally {
                MethodCollector.m26664o(6507);
            }
        }
        return jSONArray;
    }

    public final void setUseEngineUploader(boolean z) {
        this.mEnableUseEngineUploader = z;
    }

    public final synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        MethodCollector.m26663i(6366);
        this.mEngineUploader = videoEventEngineUploader;
        MethodCollector.m26664o(6366);
    }

    public final void putEvent(JSONObject jSONObject) {
        MethodCollector.m26663i(6659);
        synchronized (UploadEventManager.class) {
            try {
                m147847x822fa356("ttmn", "putEvent");
                this.mJsonArray.put(jSONObject);
            } finally {
                MethodCollector.m26664o(6659);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void addEvent(JSONObject jSONObject) {
        String string;
        MethodCollector.m26663i(6508);
        synchronized (UploadEventManager.class) {
            if (jSONObject != null) {
                try {
                    if (this.mEngineUploader == null || !this.mEnableUseEngineUploader) {
                        this.mJsonArray.put(jSONObject);
                    } else {
                        try {
                            string = jSONObject.getString("event");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(string)) {
                            this.mEngineUploader.onEventV3(string, jSONObject);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6508);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(6508);
    }

    private UploadEventManager() {
        setEngineUploader(AppLogEngineUploader.getInstance());
    }
}
