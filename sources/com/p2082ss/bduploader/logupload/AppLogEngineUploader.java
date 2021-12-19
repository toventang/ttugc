package com.p2082ss.bduploader.logupload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bduploader.BDUploadLog;
import com.p2082ss.bduploader.BDUploadUtil;
import com.p2082ss.bduploader.UploadEventManager;
import com.p2082ss.bduploader.net.BDUploadThreadPool;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.logupload.AppLogEngineUploader */
public class AppLogEngineUploader implements VideoEventEngineUploader {
    static {
        Covode.recordClassIndex(100811);
    }

    /* renamed from: com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147848xfe52d14f(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147849xfe52d150(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_logupload_AppLogEngineUploader_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147850xfe52d154(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bduploader.logupload.AppLogEngineUploader$Holder */
    public static class Holder {
        public static final AppLogEngineUploader instance = new AppLogEngineUploader();

        private Holder() {
        }

        static {
            Covode.recordClassIndex(100813);
        }
    }

    private AppLogEngineUploader() {
    }

    public static AppLogEngineUploader getInstance() {
        return Holder.instance;
    }

    static void logPrint(final JSONObject jSONObject) {
        BDUploadThreadPool.addExecuteTask(new Runnable() {
            /* class com.p2082ss.bduploader.logupload.AppLogEngineUploader.RunnableC860631 */

            static {
                Covode.recordClassIndex(100812);
            }

            public final void run() {
                if (jSONObject != null) {
                    BDUploadLog.m147838i("ttmn", "++++++++++++++++");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (next != null) {
                                BDUploadLog.m147838i("ttmn", "++++:" + next + ":" + jSONObject.get(next));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    BDUploadLog.m147838i("ttmn", "++++++++++++++++++++");
                }
            }
        });
    }

    @Override // com.p2082ss.bduploader.logupload.VideoEventEngineUploader
    public void onEventV3(String str, JSONObject jSONObject) {
        m147850xfe52d154("ttmn", "onEventV3 monitorName ".concat(String.valueOf(str)));
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            logPrint(jSONObject);
            if (BDUploadUtil.eventEngineUploader != null) {
                BDUploadUtil.eventEngineUploader.onEventV3(str, setJsonValue(jSONObject, "upload_log_type", "2"));
                return;
            }
            JSONObject jsonValue = setJsonValue(jSONObject, "upload_log_type", "1");
            try {
                Class.forName("com.ss.android.common.c.a").getMethod("a", String.class, JSONObject.class).invoke(null, str, jsonValue);
            } catch (Exception e) {
                UploadEventManager.instance.putEvent(setJsonValue(jSONObject, "upload_log_type", "0"));
                e.printStackTrace();
                m147849xfe52d150("ttmn", "upload error ".concat(String.valueOf(e)));
            }
        }
    }

    private JSONObject setJsonValue(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            m147848xfe52d14f("ttmn", "key" + str + "value" + str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
