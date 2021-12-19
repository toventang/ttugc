package com.p2082ss.android.ugc.aweme.player.sdk.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.util.b */
public final class C63083b {

    /* renamed from: a */
    public static final C63083b f143380a = new C63083b();

    /* renamed from: b */
    private static final String[] f143381b = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c */
    private Map<String, Map<String, Long>> f143382c = new LinkedHashMap<String, Map<String, Long>>() {
        /* class com.p2082ss.android.ugc.aweme.player.sdk.util.C63083b.C630841 */

        static {
            Covode.recordClassIndex(73924);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Map<String, Long>> entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }
    };

    private C63083b() {
    }

    static {
        Covode.recordClassIndex(73923);
    }

    /* renamed from: a */
    public final void mo101239a(String str, String str2) {
        m114015a(str, str2, System.currentTimeMillis());
    }

    /* renamed from: a */
    private synchronized void m114015a(String str, String str2, long j) {
        Map<String, Long> map;
        MethodCollector.m26663i(6839);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6839);
            return;
        }
        if ("player_try_play".equals(str2)) {
            this.f143382c.remove(str);
            map = new LinkedHashMap<>();
            this.f143382c.put(str, map);
        } else {
            map = this.f143382c.get(str);
            if (map == null || map.containsKey(str2)) {
                MethodCollector.m26664o(6839);
                return;
            }
        }
        map.put(str2, Long.valueOf(j));
        MethodCollector.m26664o(6839);
    }
}
