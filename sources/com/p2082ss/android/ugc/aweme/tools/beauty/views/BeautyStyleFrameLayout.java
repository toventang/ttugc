package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.tools.view.style.StyleFrameLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautyStyleFrameLayout */
public final class BeautyStyleFrameLayout extends StyleFrameLayout {

    /* renamed from: a */
    private int f175178a;

    static {
        Covode.recordClassIndex(91160);
    }

    public BeautyStyleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo121888a(float f) {
        C84966b a = C84966b.C84967a.m146038a().mo129755b(this.f175178a).mo129753a(this.f175178a, 0);
        a.mo129752a(0);
        a.mo129754a(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        setBackground(a.mo129750a());
    }

    private /* synthetic */ BeautyStyleFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BeautyStyleFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        boolean z;
        float f;
        boolean z2;
        C89219l.m154721d(context, "");
        this.f175178a = context.getResources().getColor(R.color.u8);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            z = obtainStyledAttributes.getBoolean(1, false);
            f = obtainStyledAttributes.getDimension(15, 0.0f);
            z2 = obtainStyledAttributes.getBoolean(25, false);
            this.f175178a = obtainStyledAttributes.getColor(0, this.f175178a);
            boolean z3 = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
            if (!z3) {
                return;
            }
        } else {
            z = false;
            f = 0.0f;
            z2 = false;
        }
        C84966b a = C84966b.C84967a.m146038a().mo129755b(this.f175178a).mo129753a(this.f175178a, 0);
        if (z) {
            a.mo129752a(1);
        } else {
            a.mo129752a(0);
            if (z2) {
                a.mo129754a(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a.mo129751a(f);
            }
        }
        GradientDrawable a2 = a.mo129750a();
        if (a2 != null) {
            setBackground(a2);
        }
    }
}
