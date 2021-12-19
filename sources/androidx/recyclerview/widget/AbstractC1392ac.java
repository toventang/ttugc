package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.ac */
public abstract class AbstractC1392ac extends RecyclerView.AbstractC1369l {

    /* renamed from: a */
    RecyclerView f4622a;

    /* renamed from: b */
    private Scroller f4623b;

    /* renamed from: c */
    private final RecyclerView.AbstractC1371n f4624c = new RecyclerView.AbstractC1371n() {
        /* class androidx.recyclerview.widget.AbstractC1392ac.C13931 */

        /* renamed from: a */
        boolean f4625a;

        static {
            Covode.recordClassIndex(1531);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            super.mo4753a(recyclerView, i);
            if (i == 0 && this.f4625a) {
                this.f4625a = false;
                AbstractC1392ac.this.mo4856a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4625a = true;
            }
        }
    };

    static {
        Covode.recordClassIndex(1530);
    }

    /* renamed from: a */
    public abstract int mo4854a(RecyclerView.AbstractC1362i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo4855a(RecyclerView.AbstractC1362i iVar);

    /* renamed from: a */
    public abstract int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4856a() {
        RecyclerView.AbstractC1362i layoutManager;
        View a;
        RecyclerView recyclerView = this.f4622a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a = mo4855a(layoutManager)) != null) {
            int[] a2 = mo4858a(layoutManager, a);
            if (a2[0] != 0 || a2[1] != 0) {
                this.f4622a.mo4395a(a2[0], a2[1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.AbstractC1375r mo4859b(RecyclerView.AbstractC1362i iVar) {
        return mo4861c(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1481r mo4861c(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f4622a.getContext()) {
            /* class androidx.recyclerview.widget.AbstractC1392ac.C13942 */

            static {
                Covode.recordClassIndex(1532);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                if (AbstractC1392ac.this.f4622a != null) {
                    AbstractC1392ac acVar = AbstractC1392ac.this;
                    int[] a = acVar.mo4858a(acVar.f4622a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int a2 = mo5010a(Math.max(Math.abs(i), Math.abs(i2)));
                    if (a2 > 0) {
                        aVar.mo4780a(i, i2, a2, this.f4912b);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public void mo4857a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4622a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4418b(this.f4624c);
                this.f4622a.setOnFlingListener(null);
            }
            this.f4622a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f4622a.mo4405a(this.f4624c);
                this.f4622a.setOnFlingListener(this);
                this.f4623b = new Scroller(this.f4622a.getContext(), new DecelerateInterpolator());
                mo4856a();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: b */
    public final int[] mo4860b(int i, int i2) {
        this.f4623b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f4623b.getFinalX(), this.f4623b.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1369l
    /* renamed from: a */
    public final boolean mo4749a(int i, int i2) {
        RecyclerView.AbstractC1375r b;
        int a;
        RecyclerView.AbstractC1362i layoutManager = this.f4622a.getLayoutManager();
        if (layoutManager == null || this.f4622a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4622a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (b = mo4859b(layoutManager)) == null || (a = mo4854a(layoutManager, i, i2)) == -1) {
            return false;
        }
        b.f4515g = a;
        layoutManager.mo4695a(b);
        return true;
    }
}
