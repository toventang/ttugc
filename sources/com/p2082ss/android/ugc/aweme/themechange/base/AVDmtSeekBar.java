package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar */
public final class AVDmtSeekBar extends FilterBeautySeekBar {

    /* renamed from: h */
    private ClipDrawable f174485h;

    static {
        Covode.recordClassIndex(90864);
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        ClipDrawable clipDrawable = this.f174485h;
        if (clipDrawable != null) {
            clipDrawable.setLevel((i * 10000) / getMax());
        }
    }

    private /* synthetic */ AVDmtSeekBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtSeekBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 16842875);
        boolean z;
        int i;
        int i2;
        int i3;
        C89219l.m154721d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            i = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            i3 = (int) obtainStyledAttributes.getDimension(41, 0.0f);
            i2 = (int) obtainStyledAttributes.getDimension(40, 0.0f);
            z = obtainStyledAttributes.getBoolean(37, false);
        } else {
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        int i4 = C77795c.f174518a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i4);
        gradientDrawable.setStroke(0, i4);
        gradientDrawable.setSize(i3, i2);
        setThumb(gradientDrawable);
        if (Build.VERSION.SDK_INT >= 21) {
            setSplitTrack(true);
        }
        int c2 = C0643b.m2378c(getContext(), R.color.bh);
        ClipDrawable clipDrawable = new ClipDrawable(C84916a.m145947a(c2, c2, 0, i), 3, 1);
        this.f174485h = clipDrawable;
        clipDrawable.setLevel((getProgress() * 10000) / getMax());
        int c3 = C0643b.m2378c(getContext(), R.color.ad);
        Drawable a = C84916a.m145947a(c3, c3, 0, i);
        Drawable[] drawableArr = new Drawable[2];
        C89219l.m154716b(a, "");
        drawableArr[0] = a;
        ClipDrawable clipDrawable2 = this.f174485h;
        if (clipDrawable2 == null) {
            C89219l.m154715b();
        }
        drawableArr[1] = clipDrawable2;
        setProgressDrawable(new LayerDrawable(drawableArr));
        if (z) {
            setTextColor(C77795c.m135909a());
        }
    }
}
