package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.C0700b;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.internal.h */
public class C26678h extends FrameLayout {

    /* renamed from: a */
    Drawable f63210a;

    /* renamed from: b */
    Rect f63211b;

    /* renamed from: c */
    private Rect f63212c;

    static {
        Covode.recordClassIndex(32134);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44183a(C0753ad adVar) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f63210a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f63210a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f63211b != null && this.f63210a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f63212c.set(0, 0, width, this.f63211b.top);
            this.f63210a.setBounds(this.f63212c);
            this.f63210a.draw(canvas);
            this.f63212c.set(0, height - this.f63211b.bottom, width, height);
            this.f63210a.setBounds(this.f63212c);
            this.f63210a.draw(canvas);
            this.f63212c.set(0, this.f63211b.top, this.f63211b.left, height - this.f63211b.bottom);
            this.f63210a.setBounds(this.f63212c);
            this.f63210a.draw(canvas);
            this.f63212c.set(width - this.f63211b.right, this.f63211b.top, width, height - this.f63211b.bottom);
            this.f63210a.setBounds(this.f63212c);
            this.f63210a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public C26678h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C26678h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(11300);
        this.f63212c = new Rect();
        TypedArray a = C26685k.m52976a(context, attributeSet, new int[]{R.attr.x5}, i, R.style.r0, new int[0]);
        this.f63210a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.google.android.material.internal.C26678h.C266791 */

            static {
                Covode.recordClassIndex(32135);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                if (C26678h.this.f63211b == null) {
                    C26678h.this.f63211b = new Rect();
                }
                C26678h.this.f63211b.set(adVar.mo2865a(), adVar.mo2867b(), adVar.mo2868c(), adVar.mo2869d());
                C26678h.this.mo44183a(adVar);
                C26678h hVar = C26678h.this;
                boolean z = true;
                if ((!adVar.f2888b.mo2883g().equals(C0700b.f2758a)) && C26678h.this.f63210a != null) {
                    z = false;
                }
                hVar.setWillNotDraw(z);
                C0792v.m2764c(C26678h.this);
                return adVar.f2888b.mo2878c();
            }
        });
        MethodCollector.m26664o(11300);
    }
}
