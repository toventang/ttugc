package com.p2082ss.android.ugc.aweme.notification.utils;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.q */
public final class C62278q {
    static {
        Covode.recordClassIndex(73052);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.q$a */
    public static final class C62279a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f141347a;

        /* renamed from: b */
        final /* synthetic */ SwipeRefreshLayout f141348b;

        static {
            Covode.recordClassIndex(73053);
        }

        C62279a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
            this.f141347a = recyclerView;
            this.f141348b = swipeRefreshLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            Boolean valueOf;
            int a;
            boolean z2;
            boolean z3;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            RecyclerView.AbstractC1362i layoutManager = this.f141347a.getLayoutManager();
            if (layoutManager != null) {
                C89219l.m154716b(layoutManager, "");
                if (layoutManager instanceof LinearLayoutManager) {
                    if (((LinearLayoutManager) layoutManager).mo4372l() <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    valueOf = Boolean.valueOf(z3);
                } else if (layoutManager instanceof GridLayoutManager) {
                    if (((LinearLayoutManager) layoutManager).mo4372l() <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    valueOf = Boolean.valueOf(z2);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int i3 = staggeredGridLayoutManager.f4556a;
                    int[] iArr = new int[i3];
                    for (int i4 = 0; i4 < staggeredGridLayoutManager.f4556a; i4++) {
                        StaggeredGridLayoutManager.C1386c cVar = staggeredGridLayoutManager.f4557b[i4];
                        if (StaggeredGridLayoutManager.this.f4561f) {
                            a = cVar.mo4822a(cVar.f4603a.size() - 1, -1, true);
                        } else {
                            a = cVar.mo4822a(0, cVar.f4603a.size(), true);
                        }
                        iArr[i4] = a;
                    }
                    C89219l.m154716b(iArr, "");
                    int i5 = 0;
                    for (int i6 = 0; i6 < i3; i6++) {
                        if (iArr[i6] <= 0) {
                            i5++;
                        }
                    }
                    if (i5 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf = Boolean.valueOf(z);
                } else {
                    return;
                }
                if (valueOf != null && (this.f141348b.isEnabled() ^ valueOf.booleanValue())) {
                    if (valueOf.booleanValue()) {
                        this.f141348b.setEnabled(true);
                    } else if (!this.f141348b.mRefreshing) {
                        this.f141348b.setEnabled(false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m112666a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        if (recyclerView != null && swipeRefreshLayout != null) {
            recyclerView.setOverScrollMode(0);
            recyclerView.mo4405a(new C62279a(recyclerView, swipeRefreshLayout));
        }
    }
}
