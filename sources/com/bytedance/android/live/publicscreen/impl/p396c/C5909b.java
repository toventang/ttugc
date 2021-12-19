package com.bytedance.android.live.publicscreen.impl.p396c;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.c.b */
public final class C5909b implements AbstractC5913d {

    /* renamed from: b */
    private int f14787b;

    static {
        Covode.recordClassIndex(6517);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d
    /* renamed from: a */
    public final int mo11771a() {
        return AbstractC5913d.C5914a.f14799a;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d
    /* renamed from: b */
    public final Spannable mo11772b() {
        String valueOf = String.valueOf(this.f14787b);
        if (this.f14787b >= 99) {
            valueOf = valueOf + "+";
        }
        SpannableString spannableString = new SpannableString(C3966y.m9660a((int) R.string.glk, valueOf));
        spannableString.setSpan(new ForegroundColorSpan(C3966y.m9663b((int) R.color.yb)), 1, valueOf.length() + 1, 33);
        return spannableString;
    }

    public C5909b(int i) {
        this.f14787b = i;
    }
}
