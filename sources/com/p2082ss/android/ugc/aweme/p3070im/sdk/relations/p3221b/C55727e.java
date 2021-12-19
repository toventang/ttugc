package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b;

import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.e */
public final class C55727e {

    /* renamed from: a */
    public static final C55727e f127099a = new C55727e();

    private C55727e() {
    }

    static {
        Covode.recordClassIndex(65513);
    }

    /* renamed from: b */
    private static void m101481b(TextView textView, String str, String str2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        textView.setText(C55726d.m101479a(C0643b.m2378c(textView.getContext(), R.color.bh), str, str2, 0));
    }

    /* renamed from: a */
    public static void m101480a(TextView textView, String str, String str2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str2, "");
        if (str2.length() == 0 || str == null || str.length() == 0) {
            textView.setText(str);
            return;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        String lowerCase2 = str2.toLowerCase();
        C89219l.m154716b(lowerCase2, "");
        int a = C89361p.m154888a((CharSequence) lowerCase, lowerCase2, 0, false, 6);
        if (a == -1) {
            textView.setText(str);
            return;
        }
        int c = C89271h.m154772c(str2.length() + a, str.length());
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(a, c);
        C89219l.m154716b(substring, "");
        m101481b(textView, str, substring);
    }
}
