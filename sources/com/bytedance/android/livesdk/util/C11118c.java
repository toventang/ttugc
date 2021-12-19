package com.bytedance.android.livesdk.util;

import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.util.c */
public final class C11118c {

    /* renamed from: a */
    public static final C11118c f26726a = new C11118c();

    /* renamed from: com.bytedance.android.livesdk.util.c$a */
    public enum EnumC11119a {
        ENTER_GIFT_PANEL(EnumC0044d.TT_LIVING_ENTER_GIFT_PANEL, 1000),
        LIVE_SLIDE(EnumC0044d.TT_LIVING_SCROLL, 1000),
        ENTER_LIVE_ROOM(EnumC0044d.DY_TAB_LIVING_LOAD, 2500),
        ENTER_BROADCAST_ROOM(EnumC0044d.DY_TAB_LIVING_LOAD, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        

        /* renamed from: b */
        private final EnumC0044d f26728b;

        /* renamed from: c */
        private final int f26729c;

        public final EnumC0044d getTargetScene() {
            return this.f26728b;
        }

        public final int getTimeout() {
            return this.f26729c;
        }

        static {
            Covode.recordClassIndex(12743);
        }

        private EnumC11119a(EnumC0044d dVar, int i) {
            this.f26728b = dVar;
            this.f26729c = i;
        }
    }

    private C11118c() {
    }

    static {
        Covode.recordClassIndex(12742);
        C0004a.m4a(C3966y.m9669e());
    }

    /* renamed from: a */
    public static void m19750a(EnumC11119a aVar) {
        C89219l.m154721d(aVar, "");
        if (VBoostEnableSetting.INSTANCE.isEnable()) {
            C0004a.m2a(aVar.getTargetScene(), aVar.getTimeout());
        }
    }
}
