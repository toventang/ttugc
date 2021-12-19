package com.lynx.tasm.behavior.p2052ui.utils;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.utils.C28916c;
import com.lynx.tasm.utils.C28924i;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.ui.utils.a */
public class C28682a extends C28690e {

    /* renamed from: a */
    public WeakReference<LynxUI> f67639a;

    /* renamed from: b */
    public PointF f67640b;

    /* renamed from: c */
    public float f67641c;

    /* renamed from: i */
    private C28924i.C28925a f67642i;

    static {
        Covode.recordClassIndex(34758);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0230, code lost:
        if (r10.equals("rotateZ") == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02aa, code lost:
        if (r10.equals("rotate") == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02ae, code lost:
        r12 = com.lynx.tasm.behavior.p2052ui.utils.C28693h.m57448a(r1);
        r5[0] = java.lang.Math.cos(r12);
        r5[1] = java.lang.Math.sin(r12);
        r5[4] = -java.lang.Math.sin(r12);
        r5[5] = java.lang.Math.cos(r12);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49766a(java.util.List<com.lynx.tasm.behavior.p2052ui.utils.C28695i> r104) {
        /*
        // Method dump skipped, instructions count: 2250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.C28682a.mo49766a(java.util.List):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.utils.C28690e
    /* renamed from: a */
    public final BackgroundDrawable mo49765a() {
        LynxUI lynxUI = this.f67639a.get();
        if (lynxUI == null) {
            return null;
        }
        BackgroundDrawable a = super.mo49765a();
        Drawable background = lynxUI.mView.getBackground();
        C28696j.m57472a(lynxUI.mView, null);
        if (background == null) {
            C28696j.m57472a(lynxUI.mView, a);
        } else {
            C28696j.m57472a(lynxUI.mView, new LayerDrawable(new Drawable[]{a, background}));
        }
        return a;
    }

    /* renamed from: b */
    public final void mo49767b() {
        float f;
        LynxUI lynxUI = this.f67639a.get();
        if (lynxUI != null) {
            PointF pointF = this.f67640b;
            float f2 = 0.0f;
            if (pointF != null) {
                f = 0.0f + this.f67640b.y;
                f2 = pointF.x + 0.0f;
            } else {
                f = 0.0f;
            }
            C28924i.C28925a aVar = this.f67642i;
            if (aVar != null) {
                f2 += C28916c.m57918a((float) aVar.f68356d[0]);
                f += C28916c.m57918a((float) this.f67642i.f68356d[1]);
            }
            lynxUI.mView.setTranslationX(f2);
            lynxUI.mView.setTranslationY(f);
        }
    }

    public C28682a(LynxUI lynxUI, AbstractC28520j jVar) {
        super(jVar);
        this.f67639a = new WeakReference<>(lynxUI);
    }
}
