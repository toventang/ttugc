package com.p2082ss.android.ugc.aweme.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior */
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {

    /* renamed from: a */
    public static final C62852a f142530a = new C62852a((byte) 0);

    /* renamed from: q */
    private Integer f142531q;

    static {
        Covode.recordClassIndex(73679);
    }

    /* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior$a */
    public static final class C62852a {
        static {
            Covode.recordClassIndex(73680);
        }

        private C62852a() {
        }

        public /* synthetic */ C62852a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        C89219l.m154721d(coordinatorLayout, "");
        C89219l.m154721d(v, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(iArr, "");
        if (Integer.valueOf(view.getId()) == this.f142531q) {
            super.mo2521a(coordinatorLayout, v, view, i, i2, iArr);
        }
    }
}
