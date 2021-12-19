package com.bytedance.tux.icon;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class TuxIconView extends AppCompatImageView {

    /* renamed from: a */
    public C23001b f54825a;

    static {
        Covode.recordClassIndex(27095);
    }

    public TuxIconView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    public final void mo37657a() {
        C23001b bVar = this.f54825a;
        bVar.f54443d = null;
        Drawable drawable = bVar.f54440a;
        if (drawable != null) {
            drawable.setColorFilter(null);
            drawable.setAlpha(255);
            bVar.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo37658a(boolean z) {
        this.f54825a.mo37376b(z);
    }

    public final void setTintColor(int i) {
        this.f54825a.mo37377c(i);
    }

    public final void setIconHeight(int i) {
        this.f54825a.mo37375b(i);
        m43671a(this.f54825a);
    }

    public final void setIconRes(int i) {
        setTuxIcon(C23005c.m43393a(new C23167a(this, i)));
    }

    public final void setIconWidth(int i) {
        this.f54825a.mo37371a(i);
        m43671a(this.f54825a);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof C23001b) {
            this.f54825a = (C23001b) drawable;
        }
    }

    public final void setTintColorRes(int i) {
        C23001b bVar = this.f54825a;
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        bVar.mo37372a(context, i);
    }

    /* renamed from: a */
    private final void m43671a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
            return;
        }
        setImageDrawable(null);
        setImageDrawable(drawable);
    }

    public final void setTuxIcon(C22999a aVar) {
        if (aVar == null) {
            setImageDrawable(null);
            return;
        }
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        C23001b a = aVar.mo37368a(context);
        setImageDrawable(a);
        this.f54825a = a;
    }

    /* renamed from: com.bytedance.tux.icon.TuxIconView$a */
    static final class C23167a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxIconView f54831a;

        /* renamed from: b */
        final /* synthetic */ int f54832b;

        static {
            Covode.recordClassIndex(27097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23167a(TuxIconView tuxIconView, int i) {
            super(1);
            this.f54831a = tuxIconView;
            this.f54832b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54832b;
            aVar2.f54434d = this.f54831a.f54825a.f54443d;
            aVar2.f54432b = this.f54831a.f54825a.getIntrinsicWidth();
            aVar2.f54433c = this.f54831a.f54825a.getIntrinsicHeight();
            aVar2.f54436f = this.f54831a.f54825a.f54442c;
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap6, R.attr.ap9, R.attr.ape, R.attr.apl, R.attr.arj}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        final C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        if (obtainStyledAttributes.hasValue(4)) {
            eVar.element = (T) Integer.valueOf(obtainStyledAttributes.getColor(4, 0));
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        final boolean z = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        C23001b a = C23005c.m43393a(new AbstractC89172b<C22999a, C89391z>() {
            /* class com.bytedance.tux.icon.TuxIconView.C231661 */

            static {
                Covode.recordClassIndex(27096);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C22999a aVar) {
                C22999a aVar2 = aVar;
                C89219l.m154719c(aVar2, "");
                aVar2.f54431a = resourceId;
                aVar2.f54434d = eVar.element;
                aVar2.f54432b = dimensionPixelSize;
                aVar2.f54433c = dimensionPixelSize2;
                aVar2.f54436f = z;
                return C89391z.f203057a;
            }
        }).mo37368a(context);
        this.f54825a = a;
        setImageDrawable(a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.bv : i);
    }
}
