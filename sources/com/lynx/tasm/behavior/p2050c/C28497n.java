package com.lynx.tasm.behavior.p2050c;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.p2043a.p2045b.C28410c;
import com.lynx.tasm.p2043a.p2046c.C28422a;

/* renamed from: com.lynx.tasm.behavior.c.n */
public final class C28497n extends AbstractC28488f {

    /* renamed from: a */
    private final int f67011a;

    /* renamed from: c */
    private final int f67012c;

    /* renamed from: d */
    private final int f67013d;

    /* renamed from: e */
    private final int f67014e;

    /* renamed from: f */
    private final int f67015f;

    /* renamed from: g */
    private final int f67016g;

    /* renamed from: h */
    private final int f67017h;

    /* renamed from: i */
    private final int f67018i;

    /* renamed from: j */
    private final int f67019j;

    /* renamed from: k */
    private final int f67020k;

    /* renamed from: l */
    private final int f67021l;

    /* renamed from: m */
    private final int f67022m;

    /* renamed from: n */
    private final int f67023n;

    /* renamed from: o */
    private final int f67024o;

    /* renamed from: p */
    private final int f67025p;

    /* renamed from: q */
    private final int f67026q;

    /* renamed from: r */
    private final Rect f67027r;

    /* renamed from: s */
    private final float[] f67028s;

    /* renamed from: t */
    private final float f67029t;

    static {
        Covode.recordClassIndex(34495);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        LynxBaseUI lynxBaseUI;
        LynxUI lynxUI;
        LynxBaseUI lynxBaseUI2;
        int i = this.f67006b.f67007a;
        int i2 = this.f67011a;
        int i3 = this.f67012c;
        int i4 = this.f67013d;
        int i5 = this.f67014e;
        int i6 = this.f67015f;
        int i7 = this.f67017h;
        int i8 = this.f67016g;
        int i9 = this.f67018i;
        int i10 = this.f67023n;
        int i11 = this.f67024o;
        int i12 = this.f67025p;
        int i13 = this.f67026q;
        int i14 = this.f67020k;
        int i15 = this.f67019j;
        int i16 = this.f67021l;
        int i17 = this.f67022m;
        Rect rect = this.f67027r;
        float[] fArr = this.f67028s;
        float f = this.f67029t;
        LynxBaseUI lynxBaseUI3 = qVar.f67113e.get(Integer.valueOf(i));
        if (lynxBaseUI3 == null) {
            qVar.f67111c.mo48666a(new RuntimeException("can't find ui tag is:".concat(String.valueOf(i))));
            return;
        }
        boolean z = lynxBaseUI3 instanceof UIShadowProxy;
        if (z) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI3).f67262a;
        } else {
            lynxBaseUI = lynxBaseUI3;
        }
        lynxBaseUI.updateLayoutSize(i4, i5);
        C28422a transitionAnimator = lynxBaseUI3.getTransitionAnimator();
        String str = "UIOwner.updateLayout." + lynxBaseUI3.mTagName;
        TraceEvent.m56864a(0, str);
        if (transitionAnimator != null && transitionAnimator.mo48866b() && !qVar.f67115g && !lynxBaseUI3.mIsFirstAnimatedReady) {
            transitionAnimator.mo48863a(lynxBaseUI3, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
            qVar.f67110b.invalidate();
        } else if (!lynxBaseUI3.enableLayoutAnimation() || qVar.f67115g || (i == qVar.f67109a && (i != qVar.f67109a || !qVar.f67116h))) {
            lynxBaseUI3.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        } else {
            C28410c layoutAnimator = lynxBaseUI3.getLayoutAnimator();
            if (z) {
                lynxUI = (LynxUI) ((UIShadowProxy) lynxBaseUI3).f67262a;
            } else {
                lynxUI = (LynxUI) lynxBaseUI3;
            }
            layoutAnimator.mo48848a(lynxUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
            qVar.f67110b.invalidate();
        }
        if (z) {
            lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI3).f67262a;
        } else {
            lynxBaseUI2 = lynxBaseUI3;
        }
        lynxBaseUI2.onAnimatedNodeReady();
        lynxBaseUI3.updateSticky(fArr);
        lynxBaseUI3.mMaxHeight = f;
        TraceEvent.m56869b(0, str);
    }

    public C28497n(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float[] fArr, float f) {
        super(i, 5);
        this.f67011a = i2;
        this.f67012c = i3;
        this.f67013d = i4;
        this.f67014e = i5;
        this.f67015f = i6;
        this.f67016g = i8;
        this.f67018i = i9;
        this.f67017h = i7;
        this.f67023n = i10;
        this.f67024o = i11;
        this.f67025p = i12;
        this.f67026q = i13;
        this.f67019j = i15;
        this.f67022m = i17;
        this.f67020k = i14;
        this.f67021l = i16;
        this.f67027r = rect;
        this.f67028s = fArr;
        this.f67029t = f;
    }
}
