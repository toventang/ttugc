package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ai */
public final class C38163ai {

    /* renamed from: a */
    public static final C38163ai f90140a = new C38163ai();

    private C38163ai() {
    }

    static {
        Covode.recordClassIndex(45642);
    }

    /* renamed from: a */
    public static final void m77367a(String str) {
        int a;
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (TextUtils.equals(parse.getHost(), "stickers") && (a = C89361p.m154885a((CharSequence) str, "/") + 1) < str.length()) {
                String substring = str.substring(a);
                C89219l.m154716b(substring, "");
                C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_from", "draw_ad").mo59983a("prop_id", substring).f79943a);
            }
        }
    }
}
