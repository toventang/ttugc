package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.j */
public final class C11729j {
    static {
        Covode.recordClassIndex(13417);
    }

    /* renamed from: b */
    public static final boolean m20685b(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar == EnumC11728i.VIDEO) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m20686c(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar != EnumC11728i.VIDEO) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m20687d(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar == EnumC11728i.AUDIO) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m20688e(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar == EnumC11728i.THIRD_PARTY) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m20689f(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar == EnumC11728i.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m20690g(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar != EnumC11728i.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m20684a(EnumC11728i iVar) {
        C89219l.m154721d(iVar, "");
        int i = C11730k.f28064a[iVar.ordinal()];
        if (i == 1) {
            return "video_live";
        }
        if (i == 2) {
            return "third_party";
        }
        if (i != 3) {
            return "";
        }
        return "screen_share";
    }
}
