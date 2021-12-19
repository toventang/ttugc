package com.p2082ss.android.ugc.tools.view.p4363b;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;

/* renamed from: com.ss.android.ugc.tools.view.b.e */
public final class C84931e implements RecyclerView.AbstractC1370m {

    /* renamed from: a */
    public boolean f189777a;

    /* renamed from: b */
    private RecyclerView f189778b;

    /* renamed from: c */
    private AbstractC84926c.AbstractC84928a f189779c;

    /* renamed from: d */
    private boolean f189780d;

    /* renamed from: e */
    private int f189781e;

    /* renamed from: f */
    private float f189782f;

    static {
        Covode.recordClassIndex(98925);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final void mo4750a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: b */
    public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public C84931e(RecyclerView recyclerView, AbstractC84926c.AbstractC84928a aVar) {
        this.f189778b = recyclerView;
        this.f189779c = aVar;
        this.f189781e = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        this.f189778b.mo4404a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f189782f = motionEvent.getY();
            this.f189780d = true;
        }
        RecyclerView recyclerView2 = this.f189778b;
        if (recyclerView2 != null && this.f189777a && this.f189780d && !recyclerView2.canScrollVertically(1) && this.f189782f - motionEvent.getY() > ((float) this.f189781e)) {
            AbstractC84926c.AbstractC84928a aVar = this.f189779c;
            if (aVar != null) {
                aVar.mo112467a();
            }
            this.f189777a = false;
            this.f189780d = false;
        }
        return false;
    }
}
