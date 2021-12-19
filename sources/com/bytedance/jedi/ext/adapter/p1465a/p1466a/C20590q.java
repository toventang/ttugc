package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.q */
public final class C20590q implements RecyclerView.AbstractC1370m {

    /* renamed from: a */
    public final View$OnAttachStateChangeListenerC20591r f48735a = new View$OnAttachStateChangeListenerC20591r((byte) 0);

    /* renamed from: b */
    public volatile boolean f48736b;

    /* renamed from: c */
    private float f48737c;

    /* renamed from: d */
    private boolean f48738d;

    /* renamed from: e */
    private int f48739e;

    /* renamed from: f */
    private boolean f48740f = true;

    /* renamed from: g */
    private AtomicBoolean f48741g = new AtomicBoolean(false);

    /* renamed from: h */
    private final C20585o f48742h;

    static {
        Covode.recordClassIndex(24122);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final void mo4750a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: b */
    public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C89219l.m154719c(recyclerView, "");
        C89219l.m154719c(motionEvent, "");
    }

    public C20590q(C20585o oVar) {
        C89219l.m154719c(oVar, "");
        this.f48742h = oVar;
    }

    /* renamed from: b */
    public final void mo33870b(RecyclerView recyclerView) {
        if (!this.f48741g.get()) {
            recyclerView.mo4404a(this);
            this.f48741g.set(true);
        }
    }

    /* renamed from: c */
    public final void mo33871c(RecyclerView recyclerView) {
        if (this.f48741g.get()) {
            recyclerView.mo4417b(this);
            this.f48741g.set(false);
        }
    }

    /* renamed from: a */
    public final void mo33869a(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48735a.mo33872a(recyclerView);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        C89219l.m154709a((Object) viewConfiguration, "");
        this.f48739e = viewConfiguration.getScaledTouchSlop();
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        boolean z = false;
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f4334j == 1) {
                z = true;
            }
            this.f48740f = z;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).f4560e == 1) {
                z = true;
            }
            this.f48740f = z;
        }
        if (this.f48742h.f48727h == 243 || this.f48742h.f48727h == 244) {
            mo33870b(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean canScrollHorizontally;
        C89219l.m154719c(recyclerView, "");
        C89219l.m154719c(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            this.f48737c = motionEvent.getY();
            this.f48738d = true;
        }
        RecyclerView recyclerView2 = this.f48735a.f48743a;
        if (recyclerView2 != null && this.f48736b && this.f48738d && this.f48737c - motionEvent.getY() > ((float) this.f48739e)) {
            if (this.f48740f) {
                canScrollHorizontally = recyclerView2.canScrollVertically(1);
            } else {
                canScrollHorizontally = recyclerView2.canScrollHorizontally(1);
            }
            if (!canScrollHorizontally) {
                C20585o oVar = this.f48742h;
                if (oVar.mo33868f()) {
                    oVar.mo33867c(244);
                } else {
                    oVar.mo33867c(241);
                }
                this.f48736b = false;
                this.f48738d = false;
            }
        }
        return false;
    }
}
