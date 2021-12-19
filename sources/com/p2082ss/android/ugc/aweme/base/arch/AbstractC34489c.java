package com.p2082ss.android.ugc.aweme.base.arch;

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
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.c */
public abstract class AbstractC34489c<T> extends AbstractC34491d<JediViewHolder<? extends AbstractC20467g, ?>> implements AbstractC20427a<T> {

    /* renamed from: d */
    private final C20431b<T> f81475d;

    static {
        Covode.recordClassIndex(41447);
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final C20431b<T> mo33761a() {
        return this.f81475d;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f81475d.mo33766a() + mo60937d();
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final T mo33762a(int i) {
        return (T) AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
    }

    /* renamed from: a */
    public final void mo60931a(List<? extends T> list) {
        C89219l.m154721d(list, "");
        C89219l.m154719c(list, "");
        mo33763a(list, (AbstractC89171a<C89391z>) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: b */
    public final T mo60932b(int i) {
        return this.f81475d.mo33767a(i - mo60937d(), true);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.arch.c$a */
    static final class C34490a extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34489c f81476a;

        static {
            Covode.recordClassIndex(41448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34490a(AbstractC34489c cVar) {
            super(1);
            this.f81476a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.f81476a.mo60937d());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private AbstractC34489c(AbstractC1204m mVar, C1445j.AbstractC1451e<T> eVar) {
        this(mVar, (C20438e) null, C89219l.m154719c(eVar, ""));
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(eVar, "");
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final void mo33763a(List<? extends T> list, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(list, "");
        AbstractC20427a.C20428a.m38639a(this, list, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC34489c(AbstractC1204m mVar, C1445j.AbstractC1451e eVar, int i) {
        this(mVar, (i & 2) != 0 ? new C34487a() : eVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC34489c(AbstractC1204m mVar, C20438e eVar, C20435c<T> cVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(cVar, "");
        this.f81475d = new C20431b<>(new C20641d(this, new C34490a(this)), cVar, (C20438e) null);
    }
}
