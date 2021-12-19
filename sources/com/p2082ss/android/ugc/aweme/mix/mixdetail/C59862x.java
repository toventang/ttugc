package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mix.AbstractC59400b;
import java.util.ArrayList;
import java.util.Collections;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.x */
public final class C59862x extends C1465n.AbstractC1471a {

    /* renamed from: d */
    public static final C59863a f136354d = new C59863a((byte) 0);

    /* renamed from: a */
    public boolean f136355a;

    /* renamed from: b */
    public PowerList f136356b;

    /* renamed from: c */
    public AbstractC59400b f136357c;

    static {
        Covode.recordClassIndex(70267);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4988a(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: b */
    public final boolean mo4993b() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.x$a */
    public static final class C59863a {
        static {
            Covode.recordClassIndex(70268);
        }

        private C59863a() {
        }

        public /* synthetic */ C59863a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final boolean mo4990a() {
        return this.f136355a;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4989a(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0 && (viewHolder instanceof AbstractC59861w)) {
            ((AbstractC59861w) viewHolder).mo97098a();
        }
        super.mo4989a(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final int mo4986a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            return C1465n.AbstractC1471a.m4990b(15, 0);
        }
        return C1465n.AbstractC1471a.m4990b(3, 48);
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: d */
    public final void mo4996d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        super.mo4996d(recyclerView, viewHolder);
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        view.setAlpha(1.0f);
        if (viewHolder instanceof AbstractC59861w) {
            ((AbstractC59861w) viewHolder).mo97099b();
        }
    }

    public C59862x(PowerList powerList, AbstractC59400b bVar, boolean z) {
        C89219l.m154721d(powerList, "");
        C89219l.m154721d(bVar, "");
        this.f136356b = powerList;
        this.f136357c = bVar;
        this.f136355a = z;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: b */
    public final boolean mo4994b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        int headerCount = this.f136356b.getHeaderCount();
        int adapterPosition = viewHolder.getAdapterPosition() - headerCount;
        int adapterPosition2 = viewHolder2.getAdapterPosition() - headerCount;
        viewHolder.getAdapterPosition();
        viewHolder2.getAdapterPosition();
        this.f136357c.mo97074a(adapterPosition, adapterPosition2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f136356b.getState().mo28140c());
        Collections.swap(arrayList, adapterPosition, adapterPosition2);
        this.f136356b.getState().mo28141c(arrayList);
        RecyclerView.AbstractC1350a adapter = this.f136356b.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        String a = this.f136357c.mo97073a();
        String b = this.f136357c.mo97075b();
        C89219l.m154721d(a, "");
        C89219l.m154721d(b, "");
        C39162r.m79460a("reorder_playlist", new C33744d().mo59983a("enter_from", a).mo59983a("enter_method", b).f79943a);
        return true;
    }

    @Override // androidx.recyclerview.widget.C1465n.AbstractC1471a
    /* renamed from: a */
    public final void mo4987a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(viewHolder, "");
        if (i == 1) {
            float abs = Math.abs(f);
            View view = viewHolder.itemView;
            C89219l.m154716b(view, "");
            View view2 = viewHolder.itemView;
            C89219l.m154716b(view2, "");
            view2.setAlpha(1.0f - (abs / ((float) view.getWidth())));
            View view3 = viewHolder.itemView;
            C89219l.m154716b(view3, "");
            view3.setTranslationX(f);
            return;
        }
        super.mo4987a(canvas, recyclerView, viewHolder, f, f2, i, z);
    }
}
