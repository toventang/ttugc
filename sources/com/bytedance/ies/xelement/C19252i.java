package com.bytedance.ies.xelement;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.i */
public final class C19252i {

    /* renamed from: c */
    public static final C19253a f45470c = new C19253a((byte) 0);

    /* renamed from: a */
    ViewTreeObserver.OnScrollChangedListener f45471a;

    /* renamed from: b */
    final RecyclerView.AbstractC1371n f45472b = new C19255c(this);

    /* renamed from: d */
    private int f45473d = -1;

    /* renamed from: e */
    private int f45474e;

    static {
        Covode.recordClassIndex(22020);
    }

    /* renamed from: com.bytedance.ies.xelement.i$a */
    public static final class C19253a {
        static {
            Covode.recordClassIndex(22021);
        }

        private C19253a() {
        }

        public /* synthetic */ C19253a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m35959a(View view) {
            if (view == null || view.getVisibility() != 0) {
                return false;
            }
            return view.getGlobalVisibleRect(new Rect());
        }
    }

    /* renamed from: com.bytedance.ies.xelement.i$b */
    static final class ViewTreeObserver$OnScrollChangedListenerC19254b implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        public final RecyclerView f45475a;

        /* renamed from: b */
        public final C19252i f45476b;

        static {
            Covode.recordClassIndex(22022);
        }

        public final void onScrollChanged() {
            if (C19253a.m35959a(this.f45475a)) {
                RecyclerView.AbstractC1362i layoutManager = this.f45475a.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int k = linearLayoutManager.mo4371k();
                    int m = linearLayoutManager.mo4373m();
                    if (k != -1 && m - k >= 0) {
                        this.f45476b.mo30601a(k, m);
                    }
                }
            }
        }

        public ViewTreeObserver$OnScrollChangedListenerC19254b(RecyclerView recyclerView, C19252i iVar) {
            C89219l.m154719c(recyclerView, "");
            C89219l.m154719c(iVar, "");
            this.f45475a = recyclerView;
            this.f45476b = iVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.i$c */
    public static final class C19255c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C19252i f45477a;

        static {
            Covode.recordClassIndex(22023);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19255c(C19252i iVar) {
            this.f45477a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager;
            C89219l.m154719c(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (C19253a.m35959a(recyclerView) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                int k = linearLayoutManager.mo4371k();
                int m = linearLayoutManager.mo4373m();
                if (k != -1 && m - k >= 0) {
                    this.f45477a.mo30601a(k, m);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo30601a(int i, int i2) {
        if (i2 - i >= 0) {
            int i3 = this.f45473d;
            if (i3 == -1) {
                this.f45473d = i;
                this.f45474e = i2;
                while (i < i2 + 1) {
                    i++;
                }
                return;
            }
            if (i != i3) {
                this.f45473d = i;
            }
            if (i2 != this.f45474e) {
                this.f45474e = i2;
            }
        }
    }
}
