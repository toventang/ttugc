package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.g */
public final class C76231g<T, VH extends C76210a<T>> implements AbstractC76235h<T, VH> {

    /* renamed from: a */
    final SparseArray<AbstractC89172b<ViewGroup, VH>> f171244a = new SparseArray<>();

    /* renamed from: b */
    final List<C76232a<VH>> f171245b;

    /* renamed from: c */
    private int f171246c = 11513600;

    static {
        Covode.recordClassIndex(89181);
    }

    public C76231g() {
        C76233b bVar = C76233b.f171250a;
        C76234c cVar = C76234c.f171251a;
        int i = this.f171246c;
        this.f171246c = i + 1;
        this.f171245b = C89070n.m154524c(new C76232a(bVar, cVar, i));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.g$b */
    static final class C76233b extends AbstractC89220m implements AbstractC89172b<ViewGroup, VH> {

        /* renamed from: a */
        public static final C76233b f171250a = new C76233b();

        static {
            Covode.recordClassIndex(89183);
        }

        C76233b() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new C76221c(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.g$c */
    static final class C76234c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C76234c f171251a = new C76234c();

        static {
            Covode.recordClassIndex(89184);
        }

        C76234c() {
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

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76235h
    /* renamed from: a */
    public final void mo119957a(AbstractC89172b<? super Integer, Boolean> bVar, AbstractC89172b<? super ViewGroup, ? extends VH> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        int size = this.f171245b.size();
        int i = this.f171246c;
        this.f171246c = i + 1;
        this.f171245b.add(size - 1, new C76232a<>(bVar2, bVar, i));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.g$a */
    static final class C76232a<VH> {

        /* renamed from: a */
        public final AbstractC89172b<ViewGroup, VH> f171247a;

        /* renamed from: b */
        public final AbstractC89172b<Integer, Boolean> f171248b;

        /* renamed from: c */
        public final int f171249c;

        static {
            Covode.recordClassIndex(89182);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76232a)) {
                return false;
            }
            C76232a aVar = (C76232a) obj;
            return C89219l.m154714a(this.f171247a, aVar.f171247a) && C89219l.m154714a(this.f171248b, aVar.f171248b) && this.f171249c == aVar.f171249c;
        }

        public final int hashCode() {
            AbstractC89172b<ViewGroup, VH> bVar = this.f171247a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            AbstractC89172b<Integer, Boolean> bVar2 = this.f171248b;
            if (bVar2 != null) {
                i = bVar2.hashCode();
            }
            return ((hashCode + i) * 31) + this.f171249c;
        }

        public final String toString() {
            return "HolderCreator(factory=" + this.f171247a + ", typeMatcher=" + this.f171248b + ", viewType=" + this.f171249c + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.ViewGroup, ? extends VH> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public C76232a(AbstractC89172b<? super ViewGroup, ? extends VH> bVar, AbstractC89172b<? super Integer, Boolean> bVar2, int i) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            this.f171247a = bVar;
            this.f171248b = bVar2;
            this.f171249c = i;
        }
    }
}
