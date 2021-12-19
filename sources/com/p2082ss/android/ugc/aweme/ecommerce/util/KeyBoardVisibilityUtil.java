package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil */
public final class KeyBoardVisibilityUtil implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC33974au {

    /* renamed from: a */
    public boolean f106081a;

    /* renamed from: b */
    public final AbstractC1196i f106082b;

    /* renamed from: c */
    public final Window f106083c;

    /* renamed from: d */
    public final View f106084d;

    /* renamed from: e */
    public final AbstractC89183m<Boolean, Integer, C89391z> f106085e;

    /* renamed from: f */
    private final int f106086f;

    /* renamed from: g */
    private final int f106087g;

    /* renamed from: h */
    private final Rect f106088h;

    static {
        Covode.recordClassIndex(54043);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        mo76761a();
    }

    /* renamed from: a */
    public final void mo76761a() {
        int i = Build.VERSION.SDK_INT;
        this.f106084d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        float f = (float) this.f106087g;
        Resources resources = this.f106084d.getResources();
        C89219l.m154716b(resources, "");
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        this.f106084d.getWindowVisibleDisplayFrame(this.f106088h);
        View rootView = this.f106084d.getRootView();
        C89219l.m154716b(rootView, "");
        if (rootView.getHeight() - (this.f106088h.bottom - this.f106088h.top) < applyDimension) {
            z = false;
        }
        if (z != this.f106081a) {
            this.f106081a = z;
            this.f106085e.invoke(Boolean.valueOf(z), Integer.valueOf(this.f106088h.bottom));
        }
    }

    public /* synthetic */ KeyBoardVisibilityUtil(ActivityC0580d dVar, AbstractC89183m mVar) {
        this(dVar, 240, mVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KeyBoardVisibilityUtil(androidx.core.app.ActivityC0580d r9, java.lang.Integer r10, p4600h.p4611f.p4612a.AbstractC89183m<? super java.lang.Boolean, ? super java.lang.Integer, p4600h.C89391z> r11) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r2)
            r7 = r11
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r2)
            androidx.lifecycle.i r3 = r9.getLifecycle()
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r2)
            android.view.Window r4 = r9.getWindow()
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r2)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r9.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            android.view.View r5 = r1.getChildAt(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r2)
            r2 = r8
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil.<init>(androidx.core.app.d, java.lang.Integer, h.f.a.m):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super java.lang.Boolean, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyBoardVisibilityUtil(AbstractC1196i iVar, Window window, View view, Integer num, AbstractC89183m<? super Boolean, ? super Integer, C89391z> mVar) {
        int i;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(window, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        this.f106082b = iVar;
        this.f106083c = window;
        this.f106084d = view;
        this.f106085e = mVar;
        this.f106086f = 100;
        if (Build.VERSION.SDK_INT >= 21) {
            i = 48;
        } else {
            i = 0;
        }
        this.f106087g = 100 + i;
        this.f106088h = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        iVar.mo4012a(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
