package com.p2082ss.android.ugc.aweme.services;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService */
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    private final Handler handler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(79570);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_AbsApiMonitorService_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m120108x8d35d002(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79571);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final void addALog(String str, C22099u<?> uVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(uVar, "");
        try {
            List<C22027b> list = uVar.f52261a.f52042d;
            C89219l.m154721d(str, "");
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getQueryParameter("device_id"))) {
                return;
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("aid"))) {
                if (list != null) {
                    ALog.m59865d("API_URL_HEADER", "URL: " + str + "\r\nHEADER" + list.toString());
                }
            }
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
        }
    }

    public final void apiMonitor(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("path", parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", str3);
                jSONObject.put("requestid", str2);
                jSONObject.put("debug", false);
                C34611o.m70671b("api_error_service_log", "", jSONObject);
                m120108x8d35d002("ApiMonitor", "apifail url=" + str + ",body=" + str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
