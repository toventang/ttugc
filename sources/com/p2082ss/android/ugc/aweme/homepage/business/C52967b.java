package com.p2082ss.android.ugc.aweme.homepage.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.b */
public final class C52967b {

    /* renamed from: a */
    private static AbstractC58264w f121800a;

    static {
        Covode.recordClassIndex(62498);
    }

    /* renamed from: a */
    public static AbstractC58264w m97879a(Hox hox) {
        if (f121800a == null) {
            f121800a = new PreloadMainTask(hox);
        }
        return f121800a;
    }
}
