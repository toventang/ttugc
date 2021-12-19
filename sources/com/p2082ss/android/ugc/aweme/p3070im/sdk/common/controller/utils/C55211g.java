package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.g */
public final class C55211g {

    /* renamed from: a */
    public CharSequence f126281a;

    /* renamed from: b */
    public final List<CharSequence> f126282b = new ArrayList();

    /* renamed from: c */
    public final List<Object[]> f126283c = new ArrayList();

    /* renamed from: d */
    public final Context f126284d;

    static {
        Covode.recordClassIndex(64956);
    }

    /* renamed from: a */
    public final Spanned mo92198a() {
        int i;
        CharSequence charSequence = this.f126281a;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequence.length()) {
                if (charSequence.charAt(i2) == '%' && (i = i2 + 1) < charSequence.length() && charSequence.charAt(i) == 's') {
                    i2 += 2;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(this.f126282b.get(i3));
                    int length2 = spannableStringBuilder.length();
                    for (Object obj : this.f126283c.get(i3)) {
                        spannableStringBuilder.setSpan(obj, length, length2, 33);
                    }
                    i3++;
                } else {
                    spannableStringBuilder.append(charSequence.charAt(i2));
                    i2++;
                }
            }
            return spannableStringBuilder;
        }
        throw new NullPointerException("string can not be null");
    }

    public C55211g(Context context) {
        C89219l.m154721d(context, "");
        this.f126284d = context;
    }
}
