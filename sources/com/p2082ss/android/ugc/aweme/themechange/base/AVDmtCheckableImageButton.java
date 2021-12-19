package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.CheckableImageButton;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton */
public final class AVDmtCheckableImageButton extends CheckableImageButton {

    /* renamed from: a */
    private Drawable f174429a;

    /* renamed from: b */
    private Drawable f174430b;

    /* renamed from: c */
    private boolean f174431c;

    static {
        Covode.recordClassIndex(90854);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.google.android.material.internal.CheckableImageButton
    public final void toggle() {
        Drawable drawable;
        super.toggle();
        if (isChecked()) {
            drawable = this.f174429a;
        } else {
            drawable = this.f174430b;
        }
        setImageDrawable(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtCheckableImageButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f174431c = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            obtainStyledAttributes.getBoolean(27, false);
            this.f174431c = obtainStyledAttributes.getBoolean(6, true);
            this.f174429a = obtainStyledAttributes.getDrawable(33);
            this.f174430b = obtainStyledAttributes.getDrawable(44);
            if (this.f174431c) {
                this.f174429a = C77795c.m135911a(this.f174429a);
                this.f174430b = C77795c.m135911a(this.f174430b);
            }
            setImageDrawable(this.f174430b);
        }
    }
}
