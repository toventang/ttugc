package com.p2082ss.android.ugc.playerkit;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.playerkit.a */
public final class C84175a {

    /* renamed from: a */
    public static final C84175a f187857a = new C84175a();

    /* renamed from: b */
    private static final String[] f187858b = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c */
    private Map<String, Long> f187859c = new LinkedHashMap();

    private C84175a() {
    }

    static {
        Covode.recordClassIndex(98077);
    }

    /* renamed from: a */
    public final void mo128994a(String str, String str2) {
        m144757a(str, str2, SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private synchronized void m144757a(String str, String str2, long j) {
        MethodCollector.m26663i(11347);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(11347);
            return;
        }
        if ("player_try_play".equals(str2)) {
            this.f187859c.clear();
        } else if (this.f187859c.containsKey(str2)) {
            MethodCollector.m26664o(11347);
            return;
        }
        Map<String, Long> map = this.f187859c;
        if (map != null) {
            map.put(str2, Long.valueOf(j));
        }
        MethodCollector.m26664o(11347);
    }
}
