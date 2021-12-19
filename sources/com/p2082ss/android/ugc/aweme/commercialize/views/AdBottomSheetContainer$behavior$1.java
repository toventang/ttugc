package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$behavior$1 */
public final class AdBottomSheetContainer$behavior$1 extends BottomSheetBehavior<FrameLayout> {

    /* renamed from: r */
    final /* synthetic */ AdBottomSheetContainer f91560r;

    static {
        Covode.recordClassIndex(46315);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    AdBottomSheetContainer$behavior$1(AdBottomSheetContainer adBottomSheetContainer) {
        this.f91560r = adBottomSheetContainer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int] */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final /* synthetic */ boolean mo2524a(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, int i) {
        AdBottomSheetContainer.AbstractC38772b callback;
        FrameLayout frameLayout2 = frameLayout;
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(frameLayout2, "");
        if (this.f62896j == 3 && (callback = this.f91560r.getCallback()) != null) {
            callback.mo67308a();
        }
        return super.mo2524a(coordinatorLayout, frameLayout2, i);
    }
}
