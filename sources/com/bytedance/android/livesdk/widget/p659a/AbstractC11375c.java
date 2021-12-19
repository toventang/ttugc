package com.bytedance.android.livesdk.widget.p659a;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.a.c */
public abstract class AbstractC11375c extends RecyclerView.AbstractC1369l {

    /* renamed from: a */
    private Scroller f27333a;

    /* renamed from: b */
    private final RecyclerView.AbstractC1371n f27334b = new RecyclerView.AbstractC1371n() {
        /* class com.bytedance.android.livesdk.widget.p659a.AbstractC11375c.C113761 */

        /* renamed from: a */
        boolean f27336a;

        static {
            Covode.recordClassIndex(13032);
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
                if (!this.f27336a) {
                    this.f27336a = AbstractC11375c.this.mo18254a();
                } else {
                    this.f27336a = false;
                }
            } else if (i == 1) {
                this.f27336a = false;
            }
        }
    };

    /* renamed from: d */
    protected RecyclerView f27335d;

    static {
        Covode.recordClassIndex(13031);
    }

    /* renamed from: a */
    public abstract int mo16876a(RecyclerView.AbstractC1362i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo16877a(RecyclerView.AbstractC1362i iVar);

    /* renamed from: a */
    public abstract int[] mo18245a(RecyclerView.AbstractC1362i iVar, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo18254a() {
        RecyclerView.AbstractC1362i layoutManager;
        View a;
        RecyclerView recyclerView = this.f27335d;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (a = mo16877a(layoutManager)) == null) {
            return false;
        }
        int[] a2 = mo18245a(layoutManager, a);
        if (a2[0] == 0 && a2[1] == 0) {
            return false;
        }
        this.f27335d.mo4395a(a2[0], a2[1]);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1481r mo18246b(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f27335d.getContext()) {
            /* class com.bytedance.android.livesdk.widget.p659a.AbstractC11375c.C113772 */

            static {
                Covode.recordClassIndex(13033);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                AbstractC11375c cVar = AbstractC11375c.this;
                int[] a = cVar.mo18245a(cVar.f27335d.getLayoutManager(), view);
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
    public final void mo18253a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f27335d;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4418b(this.f27334b);
                this.f27335d.setOnFlingListener(null);
            }
            this.f27335d = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f27335d.mo4405a(this.f27334b);
                this.f27335d.setOnFlingListener(this);
                this.f27333a = new Scroller(this.f27335d.getContext(), new DecelerateInterpolator());
                mo18254a();
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
        RecyclerView.AbstractC1362i layoutManager = this.f27335d.getLayoutManager();
        if (layoutManager == null || this.f27335d.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f27335d.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (b = mo18246b(layoutManager)) == null || (a = mo16876a(layoutManager, i, i2)) == -1) {
            return false;
        }
        b.f4515g = a;
        layoutManager.mo4695a(b);
        return true;
    }
}
