package com.p2082ss.android.ugc.aweme.base.arch;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.C20641d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.e */
public abstract class AbstractC34492e<T> extends AbstractC34491d<JediViewHolder<? extends AbstractC20467g, T>> implements AbstractC20427a<T> {

    /* renamed from: d */
    private final C20431b<T> f81478d;

    static {
        Covode.recordClassIndex(41450);
    }

    /* renamed from: a */
    public abstract JediViewHolder<? extends AbstractC20467g, T> mo60934a(ViewGroup viewGroup);

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final C20431b<T> mo33761a() {
        return this.f81478d;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f81478d.mo33766a() + mo60937d();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.arch.e$b */
    static final class C34494b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, T>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34492e f81480a;

        static {
            Covode.recordClassIndex(41452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34494b(AbstractC34492e eVar) {
            super(1);
            this.f81480a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return this.f81480a.mo60934a(viewGroup2);
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final T mo33762a(int i) {
        return (T) AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: b */
    public final T mo60932b(int i) {
        return this.f81478d.mo33767a(i - mo60937d(), true);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.arch.e$a */
    static final class C34493a extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34492e f81479a;

        static {
            Covode.recordClassIndex(41451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34493a(AbstractC34492e eVar) {
            super(1);
            this.f81479a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.f81479a.mo60937d());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, T>> gVar) {
        C89219l.m154721d(gVar, "");
        gVar.mo33892a(new C34494b(this));
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final void mo33763a(List<? extends T> list, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(list, "");
        AbstractC20427a.C20428a.m38639a(this, list, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractC34492e(AbstractC1204m mVar, C1445j.AbstractC1451e<T> eVar, C20438e.AbstractC20440b bVar) {
        this(mVar, (C20438e) null, C89219l.m154719c(eVar, ""));
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(eVar, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC34492e(AbstractC1204m mVar, C20438e eVar, C20435c<T> cVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(cVar, "");
        this.f81478d = new C20431b<>(new C20641d(this, new C34493a(this)), cVar, eVar);
    }
}
