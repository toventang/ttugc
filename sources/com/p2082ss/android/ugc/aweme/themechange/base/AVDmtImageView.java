package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageView */
public class AVDmtImageView extends AppCompatImageView {

    /* renamed from: a */
    public boolean f174478a;

    /* renamed from: b */
    private boolean f174479b;

    /* renamed from: c */
    private int f174480c;

    static {
        Covode.recordClassIndex(90858);
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public final void setChangeColor(boolean z) {
        this.f174478a = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f174478a) {
            drawable = C77795c.m135912a(drawable, this.f174480c);
        }
        super.setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        int a;
        super.setSelected(z);
        if (z) {
            a = C77795c.f174518a;
        } else {
            a = C77795c.m135909a();
        }
        this.f174480c = a;
        setImageDrawable(getDrawable());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVDmtImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int a;
        C89219l.m154721d(context, "");
        this.f174478a = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f174479b = obtainStyledAttributes.getBoolean(27, false);
            this.f174478a = obtainStyledAttributes.getBoolean(6, true);
            if (obtainStyledAttributes.getBoolean(11, true)) {
                a = C77795c.f174518a;
            } else {
                a = C77795c.m135909a();
            }
            this.f174480c = a;
        }
        if (this.f174478a) {
            setImageDrawable(C77795c.m135912a(getDrawable(), this.f174480c));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtImageView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
