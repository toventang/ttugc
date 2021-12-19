package com.p2082ss.android.ugc.aweme.editSticker.compile;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.d */
final /* synthetic */ class CallableC45861d implements Callable {

    /* renamed from: a */
    private final AbstractC45860c f106830a;

    /* renamed from: b */
    private final int f106831b;

    /* renamed from: c */
    private final int f106832c;

    /* renamed from: d */
    private final View f106833d;

    /* renamed from: e */
    private final View f106834e;

    /* renamed from: f */
    private final int f106835f;

    /* renamed from: g */
    private final int f106836g;

    static {
        Covode.recordClassIndex(54385);
    }

    CallableC45861d(AbstractC45860c cVar, int i, int i2, View view, View view2, int i3, int i4) {
        this.f106830a = cVar;
        this.f106831b = i;
        this.f106832c = i2;
        this.f106833d = view;
        this.f106834e = view2;
        this.f106835f = i3;
        this.f106836g = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.m26663i(10511);
        int i = this.f106831b;
        int i2 = this.f106832c;
        View view = this.f106833d;
        View view2 = this.f106834e;
        int i3 = this.f106835f;
        int i4 = this.f106836g;
        if (i == 0) {
            i = C45866d.m88490c().f106818a;
        }
        if (i2 == 0) {
            i2 = C45866d.m88490c().f106819b;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C45863f fVar = new C45863f(i, i2, i3, i4);
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int childCount2 = viewGroup.getChildCount() - 1; childCount2 >= 0; childCount2--) {
            if (viewGroup.getChildAt(childCount2) != view2) {
                viewArr[childCount2] = viewGroup.getChildAt(childCount2);
                viewGroup.removeViewAt(childCount2);
            }
        }
        int visibility = view2.getVisibility();
        if (visibility != 0) {
            view2.setVisibility(0);
        }
        view2.invalidate();
        viewGroup.invalidate();
        Object invoke = fVar.invoke(viewGroup);
        if (visibility != 0) {
            view2.setVisibility(visibility);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View view3 = viewArr[i5];
            if (view3 != null) {
                viewGroup.addView(view3, i5);
            }
        }
        C45864g gVar = new C45864g((Bitmap) invoke, Integer.valueOf(viewGroup.indexOfChild(view2)));
        MethodCollector.m26664o(10511);
        return gVar;
    }
}
