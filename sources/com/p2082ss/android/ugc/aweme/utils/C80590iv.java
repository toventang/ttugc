package com.p2082ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.iv */
public final class C80590iv {
    static {
        Covode.recordClassIndex(93863);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.iv$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC80591a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f180212a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f180213b;

        static {
            Covode.recordClassIndex(93864);
        }

        public final void onGlobalLayout() {
            this.f180212a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f180213b.invoke();
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC80591a(View view, AbstractC89171a aVar) {
            this.f180212a = view;
            this.f180213b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.iv$b */
    public static final class View$OnLayoutChangeListenerC80592b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f180214a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f180215b;

        static {
            Covode.recordClassIndex(93865);
        }

        View$OnLayoutChangeListenerC80592b(View view, AbstractC89171a aVar) {
            this.f180214a = view;
            this.f180215b = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f180214a.removeOnLayoutChangeListener(this);
            this.f180215b.invoke();
        }
    }

    /* renamed from: a */
    public static final void m139730a(View view, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (view != null) {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC80592b(view, aVar));
        }
    }
}
