package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;

/* renamed from: com.ss.android.ugc.aweme.common.a.k */
public final class C39072k implements RecyclerView.AbstractC1370m {

    /* renamed from: a */
    public boolean f92268a;

    /* renamed from: b */
    private RecyclerView f92269b;

    /* renamed from: c */
    private AbstractC39063h.AbstractC39067a f92270c;

    /* renamed from: d */
    private boolean f92271d;

    /* renamed from: e */
    private int f92272e;

    /* renamed from: f */
    private float f92273f;

    static {
        Covode.recordClassIndex(46688);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final void mo4750a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: b */
    public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public C39072k(RecyclerView recyclerView, AbstractC39063h.AbstractC39067a aVar) {
        this.f92269b = recyclerView;
        this.f92270c = aVar;
        this.f92272e = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        this.f92269b.mo4404a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f92273f = motionEvent.getY();
            this.f92271d = true;
        }
        RecyclerView recyclerView2 = this.f92269b;
        if (recyclerView2 != null && this.f92268a && this.f92271d && !recyclerView2.canScrollVertically(1) && this.f92273f - motionEvent.getY() > ((float) this.f92272e)) {
            AbstractC39063h.AbstractC39067a aVar = this.f92270c;
            if (aVar != null) {
                aVar.mo62679l();
            }
            this.f92268a = false;
            this.f92271d = false;
        }
        return false;
    }
}
