package com.bytedance.android.livesdk.p604qa;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p604qa.C10262i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.qa.x */
final /* synthetic */ class C10286x implements AbstractC88433f {

    /* renamed from: a */
    private final C10262i.C10271f f24874a;

    /* renamed from: b */
    private final ImageView f24875b;

    /* renamed from: c */
    private final TextView f24876c;

    static {
        Covode.recordClassIndex(11852);
    }

    C10286x(C10262i.C10271f fVar, ImageView imageView, TextView textView) {
        this.f24874a = fVar;
        this.f24875b = imageView;
        this.f24876c = textView;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10262i.C10271f fVar = this.f24874a;
        ImageView imageView = this.f24875b;
        TextView textView = this.f24876c;
        Throwable th = (Throwable) obj;
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                C11226ao.m19883a(C3966y.m9669e(), aVar.getPrompt(), 0);
            }
        }
        if (fVar.f24844e.booleanValue()) {
            fVar.f24845f++;
            C10262i.C10271f.m18744a(imageView, textView, 2131234847, R.attr.am9, fVar.f24845f);
        } else {
            fVar.f24845f--;
            C10262i.C10271f.m18744a(imageView, textView, 2131234549, R.attr.amt, fVar.f24845f);
        }
        fVar.f24846g = false;
    }
}
