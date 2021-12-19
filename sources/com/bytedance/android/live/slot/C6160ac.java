package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.slot.ac */
public final class C6160ac {

    /* renamed from: a */
    public static long f15386a;

    /* renamed from: b */
    public static final C6160ac f15387b = new C6160ac();

    /* renamed from: c */
    private static String f15388c = "";

    /* renamed from: d */
    private static String f15389d = "";

    private C6160ac() {
    }

    /* renamed from: c */
    private static String m13405c() {
        if (m13404b()) {
            return "1";
        }
        return "0";
    }

    /* renamed from: a */
    public final void mo12081a() {
        f15386a = 0;
        m13402a("");
        m13403b("");
    }

    static {
        Covode.recordClassIndex(6866);
    }

    /* renamed from: b */
    public static boolean m13404b() {
        if (C89219l.m154714a((Object) f15389d, (Object) "ec_shop") || C89219l.m154714a((Object) f15388c, (Object) "ec_shop")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m13402a(String str) {
        C6523c cVar;
        C89219l.m154721d(str, "");
        f15388c = str;
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (hVar != null && (cVar = hVar.f16312d) != null) {
            cVar.mo12672a(m13405c());
        }
    }

    /* renamed from: b */
    public static void m13403b(String str) {
        C6523c cVar;
        C89219l.m154721d(str, "");
        f15389d = str;
        C6529h hVar = (C6529h) DataChannelGlobal.f42558d.mo28324b(C6532j.class);
        if (hVar != null && (cVar = hVar.f16312d) != null) {
            cVar.mo12672a(m13405c());
        }
    }
}
