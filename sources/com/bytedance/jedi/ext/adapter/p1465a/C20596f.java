package com.bytedance.jedi.ext.adapter.p1465a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20573f;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20574g;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20578i;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20579j;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20580k;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20581l;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20585o;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20590q;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.View$OnAttachStateChangeListenerC20591r;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.f */
public class C20596f extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f48746a;

    /* renamed from: b */
    final C20580k f48747b;

    /* renamed from: c */
    final C20578i f48748c;

    /* renamed from: d */
    final C20585o f48749d;

    /* renamed from: e */
    final C20574g f48750e;

    /* renamed from: f */
    final View$OnAttachStateChangeListenerC20591r f48751f = new View$OnAttachStateChangeListenerC20591r((byte) 0);

    /* renamed from: g */
    private final AbstractC20573f[] f48752g;

    /* renamed from: h */
    private boolean f48753h;

    /* renamed from: i */
    private final C20597a f48754i;

    static {
        Covode.recordClassIndex(24128);
    }

    /* renamed from: a */
    public static boolean m38829a(int i) {
        return 15990784 <= i && 16252928 >= i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154719c(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m38828a(this, viewGroup, i);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.f$a */
    public static final class C20597a extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ C20596f f48755a;

        static {
            Covode.recordClassIndex(24129);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f48755a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C20597a(C20596f fVar) {
            this.f48755a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            mo4658a(i, i2, (Object) null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C20596f fVar = this.f48755a;
            fVar.notifyItemRangeInserted(i + fVar.f48747b.mo33857c(), i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C20596f fVar = this.f48755a;
            fVar.notifyItemRangeRemoved(i + fVar.f48747b.mo33857c(), i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                C20596f fVar = this.f48755a;
                fVar.notifyItemMoved(fVar.f48747b.mo33857c() + i + i4, this.f48755a.f48747b.mo33857c() + i2 + i4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C20596f fVar = this.f48755a;
            fVar.notifyItemRangeChanged(i + fVar.f48747b.mo33857c(), i2, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33876a() {
        if (this.f48751f.f48743a != null && this.f48750e.mo33864g()) {
            AbstractC20582m.C20583a.m38804a(this.f48750e);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private final void m38830b() {
        RecyclerView recyclerView;
        RecyclerView.AbstractC1362i layoutManager;
        if (!this.f48753h && (recyclerView = this.f48751f.f48743a) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            C89219l.m154709a((Object) layoutManager, "");
            this.f48753h = true;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.mo4320a(new C20600d(this, layoutManager, gridLayoutManager.f4321g));
            }
            this.f48749d.mo33865a(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.f48746a.getItemCount() == 0) {
            return this.f48750e.mo33857c();
        }
        return this.f48746a.getItemCount() + this.f48747b.mo33857c() + this.f48748c.mo33857c() + this.f48749d.mo33857c();
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.f$b */
    static final class C20598b extends AbstractC89220m implements AbstractC89172b<ViewGroup, C20579j> {

        /* renamed from: a */
        final /* synthetic */ View f48756a;

        static {
            Covode.recordClassIndex(24130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20598b(View view) {
            super(1);
            this.f48756a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C20579j invoke(ViewGroup viewGroup) {
            C89219l.m154719c(viewGroup, "");
            return new C20579j(this.f48756a);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.f$c */
    static final class C20599c extends AbstractC89220m implements AbstractC89172b<ViewGroup, C20581l> {

        /* renamed from: a */
        final /* synthetic */ View f48757a;

        static {
            Covode.recordClassIndex(24131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20599c(View view) {
            super(1);
            this.f48757a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C20581l invoke(ViewGroup viewGroup) {
            C89219l.m154719c(viewGroup, "");
            return new C20581l(this.f48757a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33881c(int i) {
        if (this.f48749d.mo33864g()) {
            this.f48749d.mo33866b(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154719c(cVar, "");
        super.registerAdapterDataObserver(cVar);
        this.f48746a.registerAdapterDataObserver(this.f48754i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154719c(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f48746a.unregisterAdapterDataObserver(this.f48754i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        if (m38829a(getItemViewType(i))) {
            return super.getItemId(i);
        }
        return this.f48746a.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f48751f.mo33872a(recyclerView);
        m38830b();
        this.f48746a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154719c(viewHolder, "");
        if (m38829a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f48746a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154719c(viewHolder, "");
        if (m38829a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f48746a.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154719c(viewHolder, "");
        if (m38829a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f48746a.onViewRecycled(viewHolder);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.f$d */
    public static final class C20600d extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C20596f f48758e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.AbstractC1362i f48759f;

        /* renamed from: g */
        final /* synthetic */ GridLayoutManager.AbstractC1337c f48760g;

        static {
            Covode.recordClassIndex(24132);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (C20596f.m38829a(this.f48758e.getItemViewType(i))) {
                return ((GridLayoutManager) this.f48759f).f4316b;
            }
            GridLayoutManager.AbstractC1337c cVar = this.f48760g;
            if (cVar != null) {
                return cVar.mo4342a(i - this.f48758e.f48747b.mo33857c());
            }
            return 1;
        }

        C20600d(C20596f fVar, RecyclerView.AbstractC1362i iVar, GridLayoutManager.AbstractC1337c cVar) {
            this.f48758e = fVar;
            this.f48759f = iVar;
            this.f48760g = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f48751f.mo33873b(recyclerView);
        if (this.f48753h) {
            C20585o oVar = this.f48749d;
            C89219l.m154719c(recyclerView, "");
            C20590q qVar = oVar.f48729j;
            C89219l.m154719c(recyclerView, "");
            qVar.f48735a.mo33873b(recyclerView);
            qVar.mo33871c(recyclerView);
        }
        this.f48753h = false;
        this.f48746a.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: androidx.recyclerview.widget.RecyclerView$a<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20596f(RecyclerView.AbstractC1350a<?> aVar) {
        C89219l.m154719c(aVar, "");
        this.f48746a = aVar;
        C20580k kVar = new C20580k();
        this.f48747b = kVar;
        C20578i iVar = new C20578i();
        this.f48748c = iVar;
        C20585o oVar = new C20585o();
        this.f48749d = oVar;
        C20574g gVar = new C20574g(kVar, iVar);
        this.f48750e = gVar;
        this.f48752g = new AbstractC20573f[]{kVar, iVar, oVar, gVar};
        setHasStableIds(aVar.mHasStableIds);
        this.f48754i = new C20597a(this);
    }

    /* renamed from: b */
    public final void mo33880b(int i) {
        if (this.f48749d.f48727h != i) {
            boolean g = this.f48749d.mo33864g();
            C20585o oVar = this.f48749d;
            oVar.f48727h = i;
            C20590q qVar = oVar.f48729j;
            if (i == 241 || i == 242) {
                RecyclerView recyclerView = qVar.f48735a.f48743a;
                if (recyclerView != null) {
                    qVar.mo33871c(recyclerView);
                }
            } else {
                RecyclerView recyclerView2 = qVar.f48735a.f48743a;
                if (recyclerView2 != null) {
                    qVar.mo33870b(recyclerView2);
                }
            }
            boolean g2 = this.f48749d.mo33864g();
            this.f48749d.mo33866b(241);
            if (this.f48751f.f48743a == null) {
                return;
            }
            if (g) {
                if (!g2) {
                    notifyItemRemoved(this.f48746a.getItemCount() + this.f48747b.mo33857c() + this.f48748c.mo33857c());
                }
            } else if (g2 && !g) {
                notifyItemInserted(this.f48746a.getItemCount() + this.f48747b.mo33857c() + this.f48748c.mo33857c());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder b;
        View view;
        C89219l.m154719c(viewHolder, "");
        AbstractC20573f[] fVarArr = this.f48752g;
        int length = fVarArr.length;
        int i = 0;
        while (true) {
            StaggeredGridLayoutManager.C1385b bVar = null;
            if (i < length) {
                AbstractC20573f fVar = fVarArr[i];
                if (fVar.mo33862e() == viewHolder.getItemViewType()) {
                    super.onViewAttachedToWindow(viewHolder);
                    if (!fVar.mo33855a() && (b = fVar.mo33856b()) != null && (view = b.itemView) != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof StaggeredGridLayoutManager.C1385b) {
                            bVar = layoutParams;
                        }
                        StaggeredGridLayoutManager.C1385b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.f4602b = true;
                            fVar.mo33854a(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            } else {
                this.f48746a.onViewAttachedToWindow(viewHolder);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (this.f48746a.getItemCount() == 0 && this.f48750e.mo33864g()) {
            C20574g gVar = this.f48750e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return gVar.f48716j.mo33862e();
                    }
                } else if ((gVar.f48714h == 241 || (gVar.f48713g & 1) != 1 || !gVar.f48715i.mo33864g() || (gVar.f48713g & 2) != 2) && gVar.f48714h != 241 && (gVar.f48713g & 1) == 1 && (!gVar.f48715i.mo33864g() || (gVar.f48713g & 2) != 2)) {
                    return gVar.f48716j.mo33862e();
                }
            } else if (gVar.f48715i.mo33864g() && (gVar.f48713g & 2) == 2) {
                return gVar.f48715i.mo33862e();
            } else {
                if ((gVar.f48714h == 241 || (gVar.f48713g & 1) != 1) && gVar.f48716j.mo33864g() && (gVar.f48713g & 4) == 4) {
                    return gVar.f48716j.mo33862e();
                }
            }
            return gVar.f48710d;
        } else if (i == 0 && this.f48747b.mo33864g()) {
            return this.f48747b.f48721c;
        } else {
            int itemCount = this.f48746a.getItemCount() + this.f48747b.mo33857c();
            if (i == itemCount && this.f48748c.mo33864g()) {
                return this.f48748c.f48720c;
            }
            if (i != itemCount + this.f48748c.mo33857c() || !this.f48749d.mo33864g()) {
                return this.f48746a.getItemViewType(i - this.f48747b.mo33857c());
            }
            return this.f48749d.f48723d;
        }
    }

    /* renamed from: a */
    public final void mo33879a(int... iArr) {
        C89219l.m154719c(iArr, "");
        int i = this.f48750e.f48713g;
        int i2 = 1;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i3 = iArr[0];
        int a = C89064i.m154474a(iArr);
        if (a > 0) {
            while (true) {
                i3 |= iArr[i2];
                if (i2 == a) {
                    break;
                }
                i2++;
            }
        }
        if (i != i3) {
            this.f48750e.f48713g = i3;
            mo33876a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154719c(viewHolder, "");
        C89219l.m154719c(list, "");
        if (!(this.f48746a.getItemCount() == 0 || this.f48749d.mo33857c() == 0 || i != getItemCount() - 2)) {
            C20585o oVar = this.f48749d;
            if (oVar.f48727h == 242 || oVar.f48727h == 244) {
                oVar.mo33867c(241);
            } else if (oVar.f48727h == 243) {
                oVar.f48729j.f48736b = true;
            }
        }
        if (!m38829a(viewHolder.getItemViewType())) {
            this.f48746a.onBindViewHolder(viewHolder, i - this.f48747b.mo33857c(), list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m38828a(C20596f fVar, ViewGroup viewGroup, int i) {
        boolean z;
        AbstractC20573f fVar2;
        RecyclerView.ViewHolder viewHolder;
        boolean z2;
        MethodCollector.m26663i(7953);
        C89219l.m154719c(viewGroup, "");
        fVar.m38830b();
        AbstractC20573f[] fVarArr = fVar.f48752g;
        int length = fVarArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                fVar2 = null;
                break;
            }
            fVar2 = fVarArr[i2];
            if (fVar2.mo33862e() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i2++;
        }
        if (fVar2 == null || (viewHolder = fVar2.mo33859a(viewGroup)) == null) {
            viewHolder = fVar.f48746a.onCreateViewHolder(viewGroup, i);
            C89219l.m154709a((Object) viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(7953);
        return viewHolder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33877a(AbstractC20582m mVar, View view, View view2, int i) {
        if (view != null) {
            mVar.mo33858d();
            notifyItemRemoved(i);
        }
        if (view2 != null) {
            notifyItemInserted(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33878a(AbstractC20582m mVar, AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar, AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar2, int i) {
        if (bVar != null) {
            mVar.mo33858d();
            notifyItemRemoved(i);
        }
        if (bVar2 != null) {
            notifyItemInserted(i);
        }
    }
}
