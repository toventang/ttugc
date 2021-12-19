package com.bytedance.analytics.p124a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p125b.C2594b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.analytics.a.f */
public final class View$OnAttachStateChangeListenerC2587f implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private static C2588a f7801a = new C2588a((byte) 0);

    /* renamed from: com.bytedance.analytics.a.f$a */
    static class C2588a extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(2975);
        }

        private C2588a() {
        }

        /* synthetic */ C2588a(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                C2594b.m7541a("**** RecyclerView IDLE ****");
                C2581b.m7530a();
            }
        }
    }

    static {
        Covode.recordClassIndex(2974);
    }

    public final void onViewAttachedToWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).mo4405a(f7801a);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).mo4418b(f7801a);
        }
    }
}
