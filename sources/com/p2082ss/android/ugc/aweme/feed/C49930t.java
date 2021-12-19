package com.p2082ss.android.ugc.aweme.feed;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.t */
public final class C49930t {

    /* renamed from: a */
    public static long f115092a;

    /* renamed from: b */
    public static boolean f115093b;

    static {
        Covode.recordClassIndex(59041);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.t$a */
    public static class C49931a implements AppLog.AbstractC29762h {
        static {
            Covode.recordClassIndex(59042);
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: a */
        public final void mo29090a(long j, String str, JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: b */
        public final void mo29091b(long j, String str, JSONObject jSONObject) {
        }

        private C49931a() {
        }

        public /* synthetic */ C49931a(byte b) {
            this();
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: a */
        public final void mo29089a(long j) {
            String currentSessionId = AppLog.getCurrentSessionId();
            if (!C17873f.f42636l && C49930t.f115092a != 0 && SystemClock.uptimeMillis() - C49930t.f115092a >= 20000) {
                JSONObject a = new C39163s().mo67941a("0vv_session_id", currentSessionId).mo67942a();
                C39162r.onEvent(MobClick.obtain().setEventName("0vv_hot_launch").setLabelName("perf_monitor").setJsonObject(a));
                C39162r.m79463b("0vv_hot_launch", a);
            }
        }
    }
}
