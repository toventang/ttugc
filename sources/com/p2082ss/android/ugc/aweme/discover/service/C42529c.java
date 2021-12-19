package com.p2082ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.service.c */
public final class C42529c {

    /* renamed from: a */
    public static final C42529c f99168a = new C42529c();

    private C42529c() {
    }

    static {
        Covode.recordClassIndex(50620);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.service.c$a */
    public static final class View$OnAttachStateChangeListenerC42530a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f99169a;

        /* renamed from: b */
        final /* synthetic */ Context f99170b;

        /* renamed from: c */
        final /* synthetic */ View.OnClickListener f99171c;

        /* renamed from: d */
        final /* synthetic */ List f99172d;

        static {
            Covode.recordClassIndex(50621);
        }

        public final void onViewAttachedToWindow(View view) {
            RecyclerView.AbstractC1362i layoutManager;
            RecyclerView.AbstractC1350a adapter;
            int[] iArr = new int[2];
            RecyclerView recyclerView = this.f99169a;
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || !(adapter instanceof C42528b))) {
                iArr = ((C42528b) adapter).f99165b;
            }
            RecyclerView recyclerView2 = this.f99169a;
            if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).mo4347a(iArr[0], iArr[1]);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
            if (r8 == r6) goto L_0x0064;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onViewDetachedFromWindow(android.view.View r12) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.service.C42529c.View$OnAttachStateChangeListenerC42530a.onViewDetachedFromWindow(android.view.View):void");
        }

        View$OnAttachStateChangeListenerC42530a(RecyclerView recyclerView, Context context, View.OnClickListener onClickListener, List list) {
            this.f99169a = recyclerView;
            this.f99170b = context;
            this.f99171c = onClickListener;
            this.f99172d = list;
        }
    }
}
