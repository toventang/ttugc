package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.v */
public final class C50557v {

    /* renamed from: a */
    public static String f116846a;

    /* renamed from: b */
    public static boolean f116847b;

    /* renamed from: c */
    public static final C50557v f116848c = new C50557v();

    private C50557v() {
    }

    static {
        Covode.recordClassIndex(59704);
    }

    /* renamed from: a */
    public static final void m94786a(String str, AbstractC89183m<? super String, ? super String, ? extends Object> mVar) {
        String str2;
        C89219l.m154721d(mVar, "");
        if (TextUtils.equals(str, "sticker_profile_detail") && (str2 = f116846a) != null) {
            mVar.invoke("prop_id", str2);
        }
    }

    /* renamed from: b */
    public static final void m94787b(String str, AbstractC89183m<? super String, ? super String, ? extends Object> mVar) {
        String str2;
        C89219l.m154721d(mVar, "");
        if (TextUtils.equals(str, "sticker_profile_detail")) {
            mVar.invoke("enter_method", "profile_tab_anchor");
            if (f116847b) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            mVar.invoke("enter_from", str2);
        }
    }
}
