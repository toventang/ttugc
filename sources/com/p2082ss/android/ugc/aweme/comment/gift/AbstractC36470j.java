package com.p2082ss.android.ugc.aweme.comment.gift;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.j */
public abstract class AbstractC36470j extends RecyclerView.AbstractC1369l {

    /* renamed from: a */
    private Scroller f86219a;

    /* renamed from: b */
    private final RecyclerView.AbstractC1371n f86220b = new RecyclerView.AbstractC1371n() {
        /* class com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j.C364711 */

        /* renamed from: a */
        boolean f86222a;

        static {
            Covode.recordClassIndex(43769);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                if (!this.f86222a) {
                    this.f86222a = AbstractC36470j.this.mo63797a();
                } else {
                    this.f86222a = false;
                }
            } else if (i == 1) {
                this.f86222a = false;
            }
        }
    };

    /* renamed from: c */
    protected RecyclerView f86221c;

    static {
        Covode.recordClassIndex(43768);
    }

    /* renamed from: a */
    public abstract int mo63793a(RecyclerView.AbstractC1362i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo63776a(RecyclerView.AbstractC1362i iVar);

    /* renamed from: a */
    public abstract int[] mo63794a(RecyclerView.AbstractC1362i iVar, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo63797a() {
        RecyclerView.AbstractC1362i layoutManager;
        View a;
        RecyclerView recyclerView = this.f86221c;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (a = mo63776a(layoutManager)) == null) {
            return false;
        }
        int[] a2 = mo63794a(layoutManager, a);
        if (a2[0] == 0 && a2[1] == 0) {
            return false;
        }
        this.f86221c.mo4395a(a2[0], a2[1]);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1481r mo63795b(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f86221c.getContext()) {
            /* class com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j.C364722 */

            static {
                Covode.recordClassIndex(43770);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                AbstractC36470j jVar = AbstractC36470j.this;
                int[] a = jVar.mo63794a(jVar.f86221c.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5010a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo4780a(i, i2, a2, this.f4912b);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo63796a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f86221c;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4418b(this.f86220b);
                this.f86221c.setOnFlingListener(null);
            }
            this.f86221c = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f86221c.mo4405a(this.f86220b);
                this.f86221c.setOnFlingListener(this);
                this.f86219a = new Scroller(this.f86221c.getContext(), new DecelerateInterpolator());
                mo63797a();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1369l
    /* renamed from: a */
    public final boolean mo4749a(int i, int i2) {
        C1481r b;
        int a;
        RecyclerView.AbstractC1362i layoutManager = this.f86221c.getLayoutManager();
        if (layoutManager == null || this.f86221c.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f86221c.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (b = mo63795b(layoutManager)) == null || (a = mo63793a(layoutManager, i, i2)) == -1) {
            return false;
        }
        b.f4515g = a;
        layoutManager.mo4695a(b);
        return true;
    }
}
