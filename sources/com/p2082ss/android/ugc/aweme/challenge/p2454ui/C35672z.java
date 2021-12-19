package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.setting.C68193o;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.z */
public class C35672z extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private int f84160a;

    /* renamed from: b */
    private int f84161b;

    /* renamed from: c */
    private int[] f84162c = new int[2];

    /* renamed from: d */
    private int f84163d = ViewConfiguration.get(C17867d.m33078a()).getScaledTouchSlop();

    /* renamed from: e */
    private C35673a f84164e;

    static {
        Covode.recordClassIndex(42896);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.z$a */
    class C35673a {

        /* renamed from: a */
        public int f84165a = -1;

        /* renamed from: b */
        public int f84166b = -1;

        /* renamed from: c */
        public int f84167c = -1;

        static {
            Covode.recordClassIndex(42897);
        }

        C35673a() {
        }
    }

    /* renamed from: a */
    private void m72818a(Context context) {
        if (this.f84161b == 0) {
            this.f84161b = C13628n.m24504a(context);
        }
    }

    /* renamed from: b */
    private void m72821b(Context context) {
        if (this.f84160a == 0) {
            this.f84160a = C13628n.m24521b(context);
        }
    }

    /* renamed from: a */
    private static boolean m72820a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m72819a(RecyclerView recyclerView) {
        AbstractC39062g gVar;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder a = recyclerView.mo4393a(recyclerView.getChildAt(i));
                if ((a instanceof AbstractC39062g) && (gVar = (AbstractC39062g) a) != null) {
                    gVar.as_();
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m72823b(RecyclerView recyclerView) {
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f4334j == 1) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).f4560e != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    private void m72824c(RecyclerView recyclerView, boolean z) {
        int i;
        m72821b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f84162c);
        recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f84162c[1];
        int min = Math.min(this.f84160a, recyclerView.getHeight() + i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder a = recyclerView.mo4393a(childAt);
            if (m72820a(a)) {
                AbstractC39062g gVar = (AbstractC39062g) a;
                if (!gVar.mo66995e()) {
                    if (z) {
                        gVar.mo62381c();
                    }
                }
                int p = RecyclerView.AbstractC1362i.m4432p(childAt);
                int r = RecyclerView.AbstractC1362i.m4434r(childAt);
                int height = childAt.getHeight();
                if (p >= 0) {
                    int i4 = r + i2;
                    if (i4 > min) {
                        i = height - (i4 - min);
                    } else {
                        i = height;
                    }
                } else if (r <= min) {
                    i = p + height;
                }
                if (i * 4 > height * 3) {
                    gVar.mo66990a(true);
                    gVar.au_();
                } else {
                    gVar.mo66990a(false);
                    gVar.as_();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public void mo4753a(RecyclerView recyclerView, int i) {
        super.mo4753a(recyclerView, i);
        if (i == 0) {
            mo62697a(recyclerView, false);
        }
    }

    /* renamed from: b */
    private void m72822b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        m72818a(recyclerView.getContext());
        m72821b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f84162c);
        recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f84162c[0];
        int min = Math.min(this.f84161b, recyclerView.getWidth() + i2);
        int height = recyclerView.getHeight();
        int[] iArr = this.f84162c;
        if (iArr[1] + (height >> 2) <= 0 || this.f84160a - iArr[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder a = recyclerView.mo4393a(childAt);
            if (m72820a(a)) {
                AbstractC39062g gVar = (AbstractC39062g) a;
                if (!gVar.mo66995e()) {
                    if (z) {
                        gVar.mo62381c();
                    }
                }
                if (!z2) {
                    int o = RecyclerView.AbstractC1362i.m4431o(childAt);
                    int q = RecyclerView.AbstractC1362i.m4433q(childAt);
                    int width = childAt.getWidth();
                    if (o >= 0) {
                        int i4 = q + i2;
                        if (i4 > min) {
                            i = width - (i4 - min);
                        } else {
                            i = width;
                        }
                    } else if (q <= min) {
                        i = o + width;
                    }
                    if (i * 4 > width * 3) {
                        gVar.mo66990a(true);
                        gVar.au_();
                    }
                }
                gVar.mo66990a(false);
                gVar.as_();
            }
        }
    }

    /* renamed from: a */
    public final void mo62697a(RecyclerView recyclerView, boolean z) {
        if (m72823b(recyclerView)) {
            m72824c(recyclerView, z);
        } else {
            m72822b(recyclerView, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        int scrollState = recyclerView.getScrollState();
        if (this.f84164e == null) {
            this.f84164e = new C35673a();
        }
        if (scrollState != 0) {
            return;
        }
        if (this.f84164e.f84165a != scrollState || this.f84164e.f84166b != i || this.f84164e.f84167c != i2) {
            this.f84164e.f84165a = scrollState;
            this.f84164e.f84166b = i;
            this.f84164e.f84167c = i2;
            C17867d.m33078a();
            if (C68193o.m120445a()) {
                if (m72823b(recyclerView)) {
                    i = i2;
                }
                if (Math.abs(i) <= this.f84163d) {
                    mo62697a(recyclerView, false);
                }
            }
        }
    }
}
