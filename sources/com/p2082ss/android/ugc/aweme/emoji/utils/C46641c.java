package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.c */
public final class C46641c {
    static {
        Covode.recordClassIndex(55233);
    }

    /* renamed from: a */
    public static String m90023a() {
        return C46650j.m90056b("STICKER", 0, "0") + "/static/";
    }

    /* renamed from: b */
    public static String m90026b(C46534a aVar) {
        return m90024a(aVar.getResourcesId(), aVar.getVersion(), aVar.getId(), aVar.getAnimateType());
    }

    /* renamed from: c */
    public static String m90027c(C46534a aVar) {
        return aVar.getId() + "." + aVar.getStaticType();
    }

    /* renamed from: a */
    public static String m90025a(C46534a aVar) {
        return C46650j.m90056b("STICKER", aVar.getResourcesId(), aVar.getVersion()) + "/static/" + aVar.getId() + "." + aVar.getStaticType();
    }

    /* renamed from: a */
    public static String m90024a(long j, String str, long j2, String str2) {
        return C46650j.m90056b("STICKER", j, str) + "/animate/" + j2 + "." + str2;
    }
}
