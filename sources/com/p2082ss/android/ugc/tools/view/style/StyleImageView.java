package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.StyleImageView */
public class StyleImageView extends AppCompatImageView {

    /* renamed from: a */
    private boolean f189869a;

    /* renamed from: b */
    private boolean f189870b;

    /* renamed from: c */
    private int f189871c;

    /* renamed from: d */
    private int f189872d;

    /* renamed from: e */
    private int f189873e;

    /* renamed from: f */
    private int f189874f;

    static {
        Covode.recordClassIndex(98960);
    }

    public StyleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public final void setDefaultTintColor(int i) {
        this.f189871c = i;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        m146025a(drawable);
    }

    public final void setSelectTintColor(int i) {
        this.f189872d = i;
    }

    public final void setUnSelectTintColor(int i) {
        this.f189873e = i;
    }

    public final void setEnableSelectionTint(boolean z) {
        this.f189870b = z;
        if (!z) {
            this.f189874f = this.f189871c;
        }
    }

    public final void setEnableTint(boolean z) {
        boolean z2 = this.f189869a;
        this.f189869a = z;
        if (!z2 && z) {
            m146025a(getDrawable());
        }
    }

    /* renamed from: a */
    private final void m146025a(Drawable drawable) {
        if (this.f189869a) {
            super.setImageDrawable(C84981g.m146053a(drawable, this.f189874f));
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.f189870b) {
            if (z) {
                i = this.f189872d;
            } else {
                i = this.f189873e;
            }
            this.f189874f = i;
            m146025a(getDrawable());
        }
    }

    private /* synthetic */ StyleImageView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleImageView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f189869a = obtainStyledAttributes.getBoolean(5, true);
            this.f189870b = obtainStyledAttributes.getBoolean(3, true);
            this.f189871c = obtainStyledAttributes.getColor(22, context.getResources().getColor(R.color.ua));
            this.f189872d = obtainStyledAttributes.getColor(23, context.getResources().getColor(R.color.ua));
            this.f189873e = obtainStyledAttributes.getColor(24, context.getResources().getColor(R.color.ub));
            obtainStyledAttributes.recycle();
        } else {
            this.f189869a = true;
            this.f189870b = true;
            this.f189871c = context.getResources().getColor(R.color.ua);
            this.f189872d = context.getResources().getColor(R.color.ua);
            this.f189873e = context.getResources().getColor(R.color.ub);
        }
        this.f189874f = this.f189871c;
        if (this.f189869a) {
            m146025a(getDrawable());
        }
    }
}
