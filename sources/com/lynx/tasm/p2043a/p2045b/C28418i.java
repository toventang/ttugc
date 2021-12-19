package com.lynx.tasm.p2043a.p2045b;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.tasm.a.b.i */
public class C28418i extends Animation implements AbstractC28415f {

    /* renamed from: a */
    private final LynxUI f66802a;

    /* renamed from: b */
    private final View f66803b;

    /* renamed from: c */
    private final int f66804c;

    /* renamed from: d */
    private final int f66805d;

    /* renamed from: e */
    private final int f66806e;

    /* renamed from: f */
    private final int f66807f;

    /* renamed from: g */
    private final int f66808g;

    /* renamed from: h */
    private final int f66809h;

    /* renamed from: i */
    private final int f66810i;

    /* renamed from: j */
    private final int f66811j;

    /* renamed from: k */
    private final int f66812k;

    /* renamed from: l */
    private final int f66813l;

    /* renamed from: m */
    private final int f66814m;

    /* renamed from: n */
    private final int f66815n;

    /* renamed from: o */
    private final Rect f66816o;

    /* renamed from: p */
    private float f66817p;

    /* renamed from: q */
    private float f66818q;

    /* renamed from: r */
    private float f66819r;

    /* renamed from: s */
    private float f66820s;

    /* renamed from: t */
    private int f66821t;

    /* renamed from: u */
    private int f66822u;

    /* renamed from: v */
    private int f66823v;

    /* renamed from: w */
    private int f66824w;

    static {
        Covode.recordClassIndex(34408);
    }

    public boolean willChangeBounds() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f66802a.updateLayout(Math.round(this.f66817p + (this.f66819r * f)), Math.round(this.f66818q + (this.f66820s * f)), Math.round(((float) this.f66821t) + (((float) this.f66823v) * f)), Math.round(((float) this.f66822u) + (((float) this.f66824w) * f)), this.f66804c, this.f66805d, this.f66806e, this.f66807f, this.f66808g, this.f66809h, this.f66810i, this.f66811j, this.f66812k, this.f66813l, this.f66814m, this.f66815n, this.f66816o);
    }

    @Override // com.lynx.tasm.p2043a.p2045b.AbstractC28415f
    /* renamed from: a */
    public final void mo48855a(int i, int i2, int i3, int i4) {
        m56827b(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m56827b(int i, int i2, int i3, int i4) {
        this.f66817p = ((float) this.f66802a.getOriginLeft()) - this.f66802a.getTranslationX();
        this.f66818q = ((float) this.f66802a.getOriginTop()) - this.f66802a.getTranslationY();
        this.f66821t = this.f66802a.getWidth();
        int height = this.f66802a.getHeight();
        this.f66822u = height;
        this.f66819r = ((float) i) - this.f66817p;
        this.f66820s = ((float) i2) - this.f66818q;
        this.f66823v = i3 - this.f66821t;
        this.f66824w = i4 - height;
    }

    public C28418i(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.f66802a = lynxUI;
        this.f66803b = lynxUI.mView;
        this.f66804c = i5;
        this.f66805d = i6;
        this.f66806e = i7;
        this.f66807f = i8;
        this.f66808g = i9;
        this.f66809h = i10;
        this.f66810i = i11;
        this.f66811j = i12;
        this.f66812k = i13;
        this.f66813l = i14;
        this.f66814m = i15;
        this.f66815n = i16;
        this.f66816o = rect;
        m56827b(i, i2, i3, i4);
    }
}
