package com.bytedance.android.livesdk.utils;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import java.util.EnumMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.ak */
public final class C11221ak {

    /* renamed from: a */
    public static final Map<EnumC11222a, Long> f26864a = new EnumMap(EnumC11222a.class);

    /* renamed from: b */
    public static final C11221ak f26865b = new C11221ak();

    /* renamed from: com.bytedance.android.livesdk.utils.ak$a */
    public enum EnumC11222a {
        PANEL_GIFT("gift"),
        PANEL_PROFILE("profile"),
        PANEL_HOURLY("hourly"),
        PANEL_QA("qa"),
        PANEL_LINK("link"),
        PANEL_HASHTAG_ANCHOR("panel_hashtag_anchor"),
        PANEL_HASHTAG_AUDIENCE("panel_hashtag_audience"),
        PANEL_BEAUTY_FILTER("panel_beauty_filter"),
        DEFAULT("default");
        

        /* renamed from: b */
        private final String f26867b;

        public final String getValue() {
            return this.f26867b;
        }

        static {
            Covode.recordClassIndex(12850);
        }

        private EnumC11222a(String str) {
            this.f26867b = str;
        }
    }

    private C11221ak() {
    }

    static {
        Covode.recordClassIndex(12849);
    }

    /* renamed from: c */
    private static boolean m19876c(EnumC11222a aVar) {
        if (aVar != EnumC11222a.DEFAULT) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m19874a(EnumC11222a aVar) {
        C89219l.m154721d(aVar, "");
        if (!m19875b(aVar)) {
            f26864a.put(aVar, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: b */
    public static boolean m19875b(EnumC11222a aVar) {
        if (PanelOpenCostTimesSetting.INSTANCE.getValue().f22808a && m19876c(aVar) && aVar != null) {
            return false;
        }
        return true;
    }
}
