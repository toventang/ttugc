package com.p2082ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.a */
public final class C66371a {

    /* renamed from: a */
    public static final List<String> f149270a = C89070n.m154522b("v16.tiktokv.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com");

    /* renamed from: b */
    public static final List<String> f149271b = C89070n.m154522b("tiktok.com", "tiktokv.com");

    /* renamed from: c */
    public static final C66371a f149272c = new C66371a();

    private C66371a() {
    }

    static {
        Covode.recordClassIndex(77903);
    }

    /* renamed from: a */
    public static final boolean m118060a(String str) {
        if (str == null) {
            return false;
        }
        Iterator<T> it = f149271b.iterator();
        while (it.hasNext()) {
            if (C89361p.m154908a((CharSequence) str, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
