package com.bytedance.android.live.publicscreen.impl.p396c;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.c.a */
public final class C5908a implements AbstractC5913d {

    /* renamed from: b */
    private int f14786b;

    static {
        Covode.recordClassIndex(6516);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d
    /* renamed from: a */
    public final int mo11771a() {
        return AbstractC5913d.C5914a.f14800b;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d
    /* renamed from: b */
    public final Spannable mo11772b() {
        String valueOf = String.valueOf(this.f14786b);
        if (this.f14786b >= 99) {
            valueOf = valueOf + "+";
        }
        SpannableString spannableString = new SpannableString("");
        spannableString.setSpan(new ForegroundColorSpan(C3966y.m9663b((int) R.color.yb)), 1, valueOf.length() + 1, 33);
        return spannableString;
    }

    public C5908a(int i) {
        this.f14786b = i;
    }
}
