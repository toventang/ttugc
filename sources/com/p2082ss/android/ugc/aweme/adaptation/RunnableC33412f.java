package com.p2082ss.android.ugc.aweme.adaptation;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;

/* renamed from: com.ss.android.ugc.aweme.adaptation.f */
final /* synthetic */ class RunnableC33412f implements Runnable {

    /* renamed from: a */
    private final int f79421a;

    /* renamed from: b */
    private final View f79422b;

    /* renamed from: c */
    private final View f79423c;

    /* renamed from: d */
    private final boolean f79424d;

    /* renamed from: e */
    private final View f79425e;

    /* renamed from: f */
    private final C33403c.AbstractC33408d f79426f;

    static {
        Covode.recordClassIndex(40269);
    }

    RunnableC33412f(int i, View view, View view2, boolean z, View view3, C33403c.AbstractC33408d dVar) {
        this.f79421a = i;
        this.f79422b = view;
        this.f79423c = view2;
        this.f79424d = z;
        this.f79425e = view3;
        this.f79426f = dVar;
    }

    public final void run() {
        int i = this.f79421a;
        View view = this.f79422b;
        View view2 = this.f79423c;
        boolean z = this.f79424d;
        View view3 = this.f79425e;
        C33403c.AbstractC33408d dVar = this.f79426f;
        int a = C34728n.m70946a((double) C33403c.f79373c);
        if (i == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != a) {
                layoutParams.bottomMargin = a;
                view.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2.height != a) {
            layoutParams2.height = a;
            view2.setLayoutParams(layoutParams2);
        }
        if (z) {
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            C33403c.C33406b.f79409a.f79387l.f79407e = rect;
        }
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != a) {
                layoutParams3.height = a;
                layoutParams3.topMargin = -a;
                view3.setLayoutParams(layoutParams3);
            }
        }
        if (dVar != null) {
            dVar.mo59484a();
        }
    }
}
