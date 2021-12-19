package com.bytedance.ies.bullet.p1129c.p1132c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.p */
public final class C16220p {

    /* renamed from: a */
    public static final C16220p f38984a = new C16220p();

    /* renamed from: b */
    private static final Map<String, String> f38985b;

    private C16220p() {
    }

    static {
        Covode.recordClassIndex(18513);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("com.bytedance.ies.bullet.kit.rn.IRnKitApi", "com.bytedance.ies.bullet.kit.rn.RnKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.lynx.ILynxKitApi", "com.bytedance.ies.bullet.kit.lynx.LynxKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.web.IWebKitApi", "com.bytedance.ies.bullet.kit.web.WebKitApi");
        f38985b = linkedHashMap;
    }

    /* renamed from: a */
    public static AbstractC16203d<AbstractC16214m, AbstractC16204e, AbstractC16208i, AbstractC16206g> m30143a(String str) {
        String str2 = "";
        C89219l.m154719c(str, str2);
        try {
            String str3 = f38985b.get(str);
            if (str3 != null) {
                str2 = str3;
            }
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance != null) {
                return (AbstractC16203d) newInstance;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Throwable unused) {
            return null;
        }
    }
}
