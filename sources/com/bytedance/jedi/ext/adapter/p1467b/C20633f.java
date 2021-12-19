package com.bytedance.jedi.ext.adapter.p1467b;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.internal.C20657a;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.b.f */
public class C20633f<VH extends AbstractC20630e<?>> implements AbstractC20638g<VH> {

    /* renamed from: a */
    private final SparseArray<AbstractC89172b<ViewGroup, VH>> f48797a = new SparseArray<>();

    /* renamed from: b */
    public final C20657a f48798b;

    /* renamed from: c */
    private int f48799c = 11513600;

    /* renamed from: d */
    private final List<C20634a<VH>> f48800d;

    static {
        Covode.recordClassIndex(24165);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo33888a(int i) {
        return null;
    }

    /* renamed from: a */
    public VH mo33891a(VH vh) {
        C89219l.m154719c(vh, "");
        return vh;
    }

    public C20633f() {
        C20635b bVar = new C20635b(this);
        C20636c cVar = C20636c.f48806a;
        int i = this.f48799c;
        this.f48799c = i + 1;
        this.f48800d = C89070n.m154524c(new C20634a(bVar, cVar, i));
        this.f48798b = new C20657a();
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.f$b */
    static final class C20635b extends AbstractC89220m implements AbstractC89172b<ViewGroup, VH> {

        /* renamed from: a */
        final /* synthetic */ C20633f f48805a;

        static {
            Covode.recordClassIndex(24167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20635b(C20633f fVar) {
            super(1);
            this.f48805a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            return this.f48805a.mo33889a(viewGroup2);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.f$c */
    static final class C20636c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C20636c f48806a = new C20636c();

        static {
            Covode.recordClassIndex(24168);
        }

        C20636c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.b.f$d */
    static final class C20637d extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C20637d f48807a = new C20637d();

        static {
            Covode.recordClassIndex(24169);
        }

        C20637d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    /* renamed from: b */
    public final void mo33896b(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48798b.mo33913b(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo33889a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        return new C20625a(viewGroup);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: android.util.SparseArray<h.f.a.b<android.view.ViewGroup, VH extends com.bytedance.jedi.ext.adapter.b.e<?>>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final int mo33895b(int i) {
        T t;
        Iterator<T> it = this.f48800d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f48802b.invoke(Integer.valueOf(i)).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            AbstractC89172b<ViewGroup, VH> bVar = t2.f48801a;
            int i2 = t2.f48803c;
            if (this.f48797a.get(i2) == null) {
                this.f48797a.put(i2, bVar);
            }
            return i2;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g
    /* renamed from: a */
    public final AbstractC20638g<VH> mo33892a(AbstractC89172b<? super ViewGroup, ? extends VH> bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC89172b<ViewGroup, VH> bVar2 = this.f48797a.get(0);
        if (bVar2 == null) {
            this.f48800d.add(this.f48800d.size() - 1, new C20634a<>(bVar, C20637d.f48807a, 0, null));
            this.f48797a.put(0, bVar);
            return this;
        }
        throw new IllegalArgumentException(("factory's viewType 0 " + bVar2.getClass().getSimpleName() + " is already registered").toString());
    }

    /* renamed from: a */
    public final void mo33894a(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48798b.mo33912a(recyclerView);
        for (T t : this.f48800d) {
            int i = t.f48803c;
            AbstractC89183m<Integer, RecyclerView, C89391z> mVar = t.f48804d;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(i), recyclerView);
            }
        }
    }

    /* renamed from: a */
    public final VH mo33890a(ViewGroup viewGroup, int i) {
        C89219l.m154719c(viewGroup, "");
        VH a = mo33888a(i);
        if (a != null) {
            return a;
        }
        if (this.f48797a.indexOfKey(i) >= 0) {
            AbstractC89172b<ViewGroup, VH> bVar = this.f48797a.get(i);
            C89219l.m154709a((Object) bVar, "");
            VH invoke = bVar.invoke(viewGroup);
            mo33891a(invoke);
            return invoke;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i + " is registered").toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.ext.adapter.b.f$a */
    public static final class C20634a<VH> {

        /* renamed from: a */
        public final AbstractC89172b<ViewGroup, VH> f48801a;

        /* renamed from: b */
        public final AbstractC89172b<Integer, Boolean> f48802b;

        /* renamed from: c */
        public final int f48803c;

        /* renamed from: d */
        public final AbstractC89183m<Integer, RecyclerView, C89391z> f48804d;

        static {
            Covode.recordClassIndex(24166);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20634a)) {
                return false;
            }
            C20634a aVar = (C20634a) obj;
            return C89219l.m154714a(this.f48801a, aVar.f48801a) && C89219l.m154714a(this.f48802b, aVar.f48802b) && this.f48803c == aVar.f48803c && C89219l.m154714a(this.f48804d, aVar.f48804d);
        }

        public final int hashCode() {
            AbstractC89172b<ViewGroup, VH> bVar = this.f48801a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            AbstractC89172b<Integer, Boolean> bVar2 = this.f48802b;
            int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f48803c) * 31;
            AbstractC89183m<Integer, RecyclerView, C89391z> mVar = this.f48804d;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "HolderCreator(factory=" + this.f48801a + ", typeMatcher=" + this.f48802b + ", viewType=" + this.f48803c + ", onAttachedToRecyclerView=" + this.f48804d + ")";
        }

        public /* synthetic */ C20634a(AbstractC89172b bVar, AbstractC89172b bVar2, int i) {
            this(bVar, bVar2, i, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.ViewGroup, ? extends VH> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super androidx.recyclerview.widget.RecyclerView, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C20634a(AbstractC89172b<? super ViewGroup, ? extends VH> bVar, AbstractC89172b<? super Integer, Boolean> bVar2, int i, AbstractC89183m<? super Integer, ? super RecyclerView, C89391z> mVar) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(bVar2, "");
            this.f48801a = bVar;
            this.f48802b = bVar2;
            this.f48803c = i;
            this.f48804d = mVar;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g
    /* renamed from: a */
    public final AbstractC20638g<VH> mo33893a(AbstractC89172b<? super Integer, Boolean> bVar, AbstractC89183m<? super Integer, ? super RecyclerView, C89391z> mVar, AbstractC89172b<? super ViewGroup, ? extends VH> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        int size = this.f48800d.size();
        int i = this.f48799c;
        this.f48799c = i + 1;
        this.f48800d.add(size - 1, new C20634a<>(bVar2, bVar, i, mVar));
        return this;
    }

    /* renamed from: a */
    public static void m38860a(VH vh, Object obj, int i, List<Object> list) {
        C89219l.m154719c(vh, "");
        if (obj != null) {
            vh.mo33823b(obj, i, list);
        }
    }
}
