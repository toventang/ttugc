package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.f */
public final class C72432f extends C1465n.AbstractC1471a {

    /* renamed from: a */
    public final AbstractC72425c f162368a;

    /* renamed from: b */
    private boolean f162369b;

    /* renamed from: c */
    private boolean f162370c;

    static {
        Covode.recordClassIndex(85106);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4988a(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
    }

    public C72432f(AbstractC72425c cVar) {
        C89219l.m154721d(cVar, "");
        this.f162368a = cVar;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final int mo4986a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        return C1465n.AbstractC1471a.m4990b(15, 0);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4989a(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(i == 0 || viewHolder == null)) {
            C70082m.m123742a(C63247i.f143610a, 100);
            AbstractC72425c cVar = this.f162368a;
            C89219l.m154721d(viewHolder, "");
            AbstractC72425c.C72427b bVar = (AbstractC72425c.C72427b) viewHolder;
            if (bVar.f162359f != null) {
                bVar.f162359f.setScaleX(1.0f);
                bVar.f162359f.setScaleY(1.0f);
            }
            cVar.f162351d = viewHolder.getAdapterPosition();
        }
        super.mo4989a(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: d */
    public final void mo4996d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        AbstractC72425c cVar = this.f162368a;
        C89219l.m154721d(viewHolder, "");
        if (cVar.f162351d != -1) {
            AbstractC72425c.C72427b bVar = (AbstractC72425c.C72427b) viewHolder;
            if (bVar.f162359f != null) {
                bVar.f162359f.setScaleY(1.0f);
                bVar.f162359f.setScaleX(1.0f);
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (!(adapterPosition == cVar.f162351d || cVar.f162353f == null)) {
                AbstractC72431e eVar = cVar.f162353f;
                if (eVar == null) {
                    C89219l.m154715b();
                }
                eVar.mo114399a(cVar.f162351d, adapterPosition);
            }
            cVar.f162351d = -1;
        }
        super.mo4996d(recyclerView, viewHolder);
        this.f162369b = false;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: b */
    public final boolean mo4994b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        C70082m.m123742a(C63247i.f143610a, 50);
        this.f162368a.mo114496a(viewHolder, viewHolder2);
        this.f162369b = true;
        return true;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4987a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float f3 = f2;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        double height = (double) view.getHeight();
        Double.isNaN(height);
        double d = (height * 0.25d) / 2.0d;
        View view2 = viewHolder.itemView;
        C89219l.m154716b(view2, "");
        double top = (double) view2.getTop();
        Double.isNaN(top);
        double d2 = (double) f3;
        Double.isNaN(d2);
        double d3 = (top - d) + d2;
        View view3 = viewHolder.itemView;
        C89219l.m154716b(view3, "");
        double height2 = (double) (((float) view3.getHeight()) * 1.25f);
        Double.isNaN(height2);
        double d4 = height2 + d3;
        if (d3 < 0.0d) {
            View view4 = viewHolder.itemView;
            C89219l.m154716b(view4, "");
            double top2 = (double) view4.getTop();
            Double.isNaN(top2);
            f3 = -((float) (top2 - d));
        } else if (d4 > ((double) recyclerView.getHeight())) {
            double bottom = (double) recyclerView.getBottom();
            double bottom2 = (double) view.getBottom();
            Double.isNaN(bottom2);
            Double.isNaN(bottom);
            f3 = (float) (bottom - (bottom2 + d));
        }
        if (i != 2 || z) {
            super.mo4987a(canvas, recyclerView, viewHolder, f, f3, i, z);
            this.f162370c = true;
        } else if (this.f162370c) {
            this.f162370c = false;
            C89219l.m154721d(viewHolder, "");
            ViewPropertyAnimator scaleY = viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
            C89219l.m154716b(scaleY, "");
            scaleY.translationX(0.0f).translationY(0.0f).setDuration(m4988a(recyclerView, 8)).start();
        }
    }
}
