package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.p024a.C0479c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.utils.C80557hw;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.m */
public final class C45572m {

    /* renamed from: a */
    public static final C45572m f106126a = new C45572m();

    private C45572m() {
    }

    static {
        Covode.recordClassIndex(54065);
    }

    /* renamed from: a */
    public static boolean m88116a(String str) {
        C89219l.m154721d(str, "");
        if (C89361p.m154870a((CharSequence) str)) {
            return false;
        }
        return C80557hw.m139640a(C17867d.m33078a(), str);
    }

    /* renamed from: a */
    public static boolean m88115a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!C80557hw.m139640a(C17867d.m33078a(), str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                C0479c.C0480a aVar = new C0479c.C0480a();
                aVar.mo2041a().f1822a.setPackage(str);
                aVar.mo2041a().mo2040a(context, Uri.parse(str2));
            } else {
                Intent a = C29843f.m60127a(context, str);
                C84349a.m145093a(a, context);
                context.startActivity(a);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
