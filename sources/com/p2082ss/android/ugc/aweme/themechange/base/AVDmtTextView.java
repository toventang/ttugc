package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.tools.view.style.EnumC84965a;
import com.p2082ss.android.ugc.tools.view.widget.AVTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTextView */
public final class AVDmtTextView extends AVTextView {

    /* renamed from: a */
    private boolean f174491a;

    /* renamed from: b */
    private boolean f174492b;

    /* renamed from: c */
    private boolean f174493c;

    /* renamed from: e */
    private boolean f174494e;

    /* renamed from: f */
    private boolean f174495f;

    /* renamed from: g */
    private int f174496g;

    /* renamed from: h */
    private int f174497h;

    /* renamed from: i */
    private int f174498i;

    /* renamed from: j */
    private boolean f174499j;

    /* renamed from: k */
    private Typeface f174500k;

    /* renamed from: l */
    private boolean f174501l;

    /* renamed from: m */
    private boolean f174502m;

    static {
        Covode.recordClassIndex(90868);
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final void mo796a() {
        if (C84370a.f188623l.f188630f) {
            setTextSize(12.0f);
            mo121359b();
            return;
        }
        setTextSize(11.0f);
        setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: b */
    public final void mo121359b() {
        if (this.f174500k == null) {
            this.f174500k = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
        }
        Typeface typeface = this.f174500k;
        if (typeface != null) {
            setTypeface(typeface);
        } else {
            setTypeface(getTypeface(), 1);
        }
    }

    public final void setSelectTextColor(int i) {
        this.f174496g = i;
    }

    public final void setStatusTextColor(int i) {
        this.f174498i = i;
        mo121358a(this.f174502m);
    }

    public final void setOldPanelStyle(boolean z) {
        this.f174491a = z;
        int i = C77795c.f174518a;
        this.f174496g = i;
        int i2 = (16777215 & i) | Integer.MIN_VALUE;
        this.f174497h = i2;
        if (!this.f174495f) {
            i = i2;
        }
        setTextColor(i);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.f174494e) {
            if (z) {
                i = this.f174496g;
            } else {
                i = this.f174497h;
            }
            setTextColor(i);
        }
    }

    /* renamed from: a */
    public final void mo121358a(boolean z) {
        this.f174502m = z;
        if (!z) {
            setTextColor(this.f174496g);
        } else if (this.f174492b) {
            setTextColor(this.f174498i);
        }
    }

    public final void setEnableUI(boolean z) {
        if (!z) {
            setTextColor(C0643b.m2378c(getContext(), R.color.ac));
        } else if (!this.f174502m) {
            setTextColor(this.f174496g);
        } else if (this.f174492b) {
            setTextColor(this.f174498i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f174492b = true;
        this.f174495f = true;
        this.f174499j = true;
        this.f174500k = C84980f.m146052a(EnumC84965a.MEDIUM.getFONT_NAME());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f174491a = obtainStyledAttributes.getBoolean(27, false);
            this.f174492b = obtainStyledAttributes.getBoolean(2, true);
            this.f174493c = obtainStyledAttributes.getBoolean(7, false);
            this.f174494e = obtainStyledAttributes.getBoolean(10, false);
            this.f174495f = obtainStyledAttributes.getBoolean(11, true);
            this.f174499j = obtainStyledAttributes.getBoolean(6, true);
            this.f174501l = obtainStyledAttributes.getBoolean(34, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f174501l) {
            setBackgroundDrawable(C77795c.f174521d.mo121373a(context, attributeSet));
        }
        this.f174498i = C0643b.m2378c(getContext(), R.color.bh);
        int i = C77795c.f174518a;
        this.f174496g = i;
        int i2 = (16777215 & i) | Integer.MIN_VALUE;
        this.f174497h = i2;
        if (this.f174499j) {
            setTextColor(!this.f174495f ? i2 : i);
        }
    }
}
