package com.bytedance.ies.p1208im.core.p1227h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.p1404a.C19497k;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.h.a */
public final class C17594a {

    /* renamed from: a */
    public static final C17594a f42082a = new C17594a();

    private C17594a() {
    }

    static {
        Covode.recordClassIndex(20083);
    }

    /* renamed from: a */
    public static String m32638a() {
        String string = Keva.getRepo("ies_im_core").getString("token", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: b */
    public static C19497k m32640b() {
        try {
            String string = Keva.getRepo("ies_im_core").getString("mix_link_config_2", "");
            if (string == null) {
                return null;
            }
            if (string.length() == 0) {
                return null;
            }
            return (C19497k) C80342dg.m139301a(string, C19497k.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m32639a(String str) {
        Keva repo = Keva.getRepo("ies_im_core");
        if (str == null) {
            str = "";
        }
        repo.storeString("token", str);
    }
}
