package com.bytedance.android.live.design.widget.p235b;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.widget.b.c */
public abstract class AbstractC4125c<T extends View> {

    /* renamed from: h */
    protected final T f11526h;

    static {
        Covode.recordClassIndex(4684);
    }

    /* renamed from: a */
    public abstract void mo9512a(TypedArray typedArray);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int[] mo9513a();

    public AbstractC4125c(T t) {
        this.f11526h = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo9631f(int i) {
        TypedArray obtainStyledAttributes = this.f11526h.getContext().obtainStyledAttributes(i, mo9513a());
        mo9512a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo9537a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = this.f11526h.getContext().obtainStyledAttributes(attributeSet, mo9513a(), i, i2);
        mo9512a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
