package com.bytedance.android.livesdk.p640t;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.t.a */
public final class C10890a {

    /* renamed from: a */
    public static final C10890a f26160a = new C10890a();

    /* renamed from: com.bytedance.android.livesdk.t.a$a */
    public enum EnumC10891a {
        NORMAL_VIDEO("normal_video_live"),
        LINE_UP("video_anchor_order"),
        LINK_MIC_ANCHOR("video_anchor_connect"),
        LINK_MIC_PK("video_anchor_pk"),
        LINK_MIC_GUEST("video_anchor_guest_connect");
        

        /* renamed from: b */
        private final String f26162b;

        public final String getDesc() {
            return this.f26162b;
        }

        static {
            Covode.recordClassIndex(12496);
        }

        private EnumC10891a(String str) {
            this.f26162b = str;
        }
    }

    private C10890a() {
    }

    static {
        Covode.recordClassIndex(12495);
    }

    /* renamed from: b */
    public static EnumC10891a m19496b() {
        if (m19497c()) {
            return EnumC10891a.LINE_UP;
        }
        return m19498d();
    }

    /* renamed from: c */
    private static boolean m19497c() {
        return ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom();
    }

    /* renamed from: a */
    public static long m19495a() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        return b.mo13161c();
    }

    /* renamed from: d */
    private static EnumC10891a m19498d() {
        AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
        AbstractC4409b bVar = (AbstractC4409b) a;
        if (bVar.isBattling()) {
            return EnumC10891a.LINK_MIC_PK;
        }
        if (bVar.getLinkedGuestNum() > 0) {
            return EnumC10891a.LINK_MIC_GUEST;
        }
        if (bVar.isInCoHost()) {
            return EnumC10891a.LINK_MIC_ANCHOR;
        }
        return EnumC10891a.NORMAL_VIDEO;
    }
}
