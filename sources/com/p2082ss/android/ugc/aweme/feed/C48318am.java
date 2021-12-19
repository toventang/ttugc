package com.p2082ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.am */
public class C48318am {

    /* renamed from: a */
    static volatile boolean f111968a;

    /* renamed from: b */
    private static volatile boolean f111969b;

    static {
        Covode.recordClassIndex(57060);
    }

    /* renamed from: a */
    private static void m91760a() {
        MethodCollector.m26663i(5694);
        if (!f111969b) {
            synchronized (C48318am.class) {
                try {
                    if (!f111969b) {
                        f111969b = true;
                        C17873f.m33096d().mo143289d(C48320ao.f111974a);
                        C49907s.m93687a(C48321ap.f111975a);
                    }
                } finally {
                    MethodCollector.m26664o(5694);
                }
            }
            return;
        }
        MethodCollector.m26664o(5694);
    }

    /* renamed from: a */
    public static void m91762a(boolean z) {
        if (z) {
            m91760a();
        }
        if (f111968a != z) {
            f111968a = z;
        }
    }

    /* renamed from: a */
    public static void m91761a(String str, String str2) {
        if (f111968a && !TextUtils.isEmpty(str)) {
            C1731i.m5640b(new CallableC48319an(C49907s.m93688b(), C49907s.f115050b.name(), str, str2), C39162r.m79452a());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m91759a(String str, String str2, String str3, String str4) {
        JSONObject a = new C39163s().mo67941a("top_activity", str).mo67941a("feed_tab", str2).mo67941a("err_code", str3).mo67941a("play_sess", String.valueOf(str4)).mo67942a();
        try {
            a.put("preloader_type", C80695q.m139909b());
        } catch (Exception e) {
            C13468b.m24210a(e);
        }
        C39162r.onEvent(MobClick.obtain().setEventName("video_prepare_error").setLabelName("perf_monitor").setJsonObject(a));
        C39162r.m79461a("video_prepare_error", a);
        C59227a.m108848a("video_prepare_error", a);
        C34888b.m71266b("video_prepare_error", a);
        return null;
    }
}
