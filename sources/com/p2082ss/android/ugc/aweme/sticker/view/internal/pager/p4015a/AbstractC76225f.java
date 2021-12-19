package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f */
public abstract class AbstractC76225f<T> extends RecyclerView.AbstractC1350a<C76210a<T>> {

    /* renamed from: a */
    private final C76231g<T, C76210a<T>> f171233a;

    /* renamed from: h */
    public List<T> f171234h = new ArrayList();

    /* renamed from: i */
    public int f171235i;

    /* renamed from: j */
    public final AbstractC76397b<T> f171236j;

    /* renamed from: k */
    public final C75572h f171237k;

    static {
        Covode.recordClassIndex(89175);
    }

    /* renamed from: a */
    public void mo119948a(C76210a<T> aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m133658a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f171234h.size() + 2;
    }

    /* renamed from: a */
    public int mo119954a(T t) {
        return this.f171236j.mo120097b(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f$b */
    public static final class C76227b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C76227b f171240a = new C76227b();

        static {
            Covode.recordClassIndex(89177);
        }

        C76227b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z;
            if (num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public final void mo119956b(List<? extends T> list) {
        C89219l.m154721d(list, "");
        this.f171234h = C89070n.m154585g((Collection) list);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f$a */
    public static final class C76226a extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ AbstractC76225f f171238e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.AbstractC1362i f171239f;

        static {
            Covode.recordClassIndex(89176);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            AbstractC76225f fVar = this.f171238e;
            if (i == 0 || i == fVar.getItemCount() - 1) {
                return ((GridLayoutManager) this.f171239f).f4316b;
            }
            return 1;
        }

        C76226a(AbstractC76225f fVar, RecyclerView.AbstractC1362i iVar) {
            this.f171238e = fVar;
            this.f171239f = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f$d */
    public static final class C76229d extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76225f f171242a;

        static {
            Covode.recordClassIndex(89179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76229d(AbstractC76225f fVar) {
            super(1);
            this.f171242a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z = true;
            if (num.intValue() != this.f171242a.getItemCount() - 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public void mo119951a(AbstractC76235h<T, C76210a<T>> hVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar, "");
        hVar.mo119957a(C76227b.f171240a, new C76228c(this));
        hVar.mo119957a(new C76229d(this), new C76230e(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo4320a(new C76226a(this, layoutManager));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f$c */
    public static final class C76228c extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<T>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76225f f171241a;

        static {
            Covode.recordClassIndex(89178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76228c(AbstractC76225f fVar) {
            super(1);
            this.f171241a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            AbstractC89172b<? super ViewGroup, ? extends View> bVar;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC76225f fVar = this.f171241a;
            C89219l.m154721d(viewGroup2, "");
            C75572h hVar = fVar.f171237k;
            if (hVar == null || (bVar = hVar.f169837k) == null) {
                return new C76224e(viewGroup2, 5);
            }
            return new C76210a((View) bVar.invoke(viewGroup2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f$e */
    public static final class C76230e extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<T>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76225f f171243a;

        static {
            Covode.recordClassIndex(89180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76230e(AbstractC76225f fVar) {
            super(1);
            this.f171243a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            AbstractC89172b<? super ViewGroup, ? extends View> bVar;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC76225f fVar = this.f171243a;
            C89219l.m154721d(viewGroup2, "");
            C75572h hVar = fVar.f171237k;
            if (hVar == null || (bVar = hVar.f169838l) == null) {
                return new C76224e(viewGroup2, 10);
            }
            return new C76210a((View) bVar.invoke(viewGroup2));
        }
    }

    /* renamed from: a */
    public final T mo119955a(int i) {
        if (i >= getItemCount()) {
            return null;
        }
        List<T> list = this.f171234h;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int min = Math.min(i - 1, this.f171234h.size() - 1);
        List<T> list2 = this.f171234h;
        if (min >= 0) {
            i2 = min;
        }
        return list2.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        T t;
        C76231g<T, C76210a<T>> gVar = this.f171233a;
        Iterator<T> it = gVar.f171245b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f171248b.invoke(Integer.valueOf(i)).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            AbstractC89172b<ViewGroup, VH> bVar = t2.f171247a;
            int i2 = t2.f171249c;
            if (gVar.f171244a.get(i2) == null) {
                gVar.f171244a.put(i2, bVar);
            }
            return i2;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    /* renamed from: a */
    public void mo119952a(List<? extends T> list) {
        C89219l.m154721d(list, "");
        mo119956b(list);
        notifyDataSetChanged();
    }

    public AbstractC76225f(AbstractC76397b<T> bVar, C75572h hVar) {
        C89219l.m154721d(bVar, "");
        this.f171236j = bVar;
        this.f171237k = hVar;
        C76231g<T, C76210a<T>> gVar = new C76231g<>();
        mo119951a((AbstractC76235h) gVar);
        this.f171233a = gVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(C76210a<T> aVar, int i) {
        C89219l.m154721d(aVar, "");
        T a = mo119955a(i);
        if (a != null) {
            C89378p<EnumC84444c, Integer> a2 = this.f171236j.mo120095a(a);
            aVar.mo119946a(a, a2.component1(), a2.component2(), i, this.f171235i);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m133658a(AbstractC76225f fVar, ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        C76231g<T, C76210a<T>> gVar = fVar.f171233a;
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (gVar.f171244a.indexOfKey(i) >= 0) {
            AbstractC89172b<ViewGroup, VH> bVar = gVar.f171244a.get(i);
            C89219l.m154716b(bVar, "");
            VH invoke = bVar.invoke(viewGroup);
            fVar.mo119948a((C76210a) invoke);
            try {
                if (invoke.itemView.getParent() != null) {
                    try {
                        z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(invoke.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) invoke.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(invoke.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = invoke.getClass().getName();
            return invoke;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i + " is registered").toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void onBindViewHolder(C76210a<T> aVar, int i, List<Object> list) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            Object g = C89070n.m154583g((List) list);
            C89378p<EnumC84444c, Integer> a = this.f171236j.mo120095a((T) g);
            aVar.mo119947b(g, a.component1(), a.component2());
            return;
        }
        super.onBindViewHolder(aVar, i, list);
    }
}
