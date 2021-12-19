package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a;

import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.C55290a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.C55298d;
import java.util.Collections;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.b */
public abstract class AbstractC55295b<VH extends RecyclerView.ViewHolder, T> extends AbstractC39060f<T> implements AbstractC55297c<T> {

    /* renamed from: a */
    private final C55290a<T> f126418a;

    static {
        Covode.recordClassIndex(65052);
    }

    /* renamed from: m */
    public int mo92317m() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55297c
    /* renamed from: l */
    public final C55290a<T> mo92316l() {
        return this.f126418a;
    }

    public /* synthetic */ AbstractC55295b() {
        this(new C55302f());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public int getItemCount() {
        int i;
        List<? extends T> list = this.f126418a.f126406c;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + mo92317m();
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<? extends T>, java.util.List<T> */
    /* renamed from: n */
    public final List<T> mo92318n() {
        List list = (List<? extends T>) mo92316l().f126406c;
        if (list != null) {
            return list;
        }
        List<T> emptyList = Collections.emptyList();
        C89219l.m154716b(emptyList, "");
        return emptyList;
    }

    /* renamed from: e */
    public final void mo92314e(List<? extends T> list) {
        C55290a<T> l = mo92316l();
        l.f126406c = list;
        l.f126407d.mo92320a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.b$a */
    static final class C55296a extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC55295b f126419a;

        static {
            Covode.recordClassIndex(65053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55296a(AbstractC55295b bVar) {
            super(1);
            this.f126419a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + this.f126419a.mo92317m());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private AbstractC55295b(C1445j.AbstractC1451e<T> eVar) {
        this(new C55298d.C55299a(eVar).mo92319a());
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar, "");
    }

    private AbstractC55295b(C55298d<T> dVar) {
        C89219l.m154721d(dVar, "");
        this.f126418a = new C55290a<>(new C55301e(this, new C55296a(this)), dVar);
        this.f92274v = false;
    }

    /* renamed from: a */
    public final T mo92313a(int i) {
        if (i >= mo92317m() && i < getItemCount()) {
            C55290a<T> aVar = this.f126418a;
            int m = i - mo92317m();
            List<? extends T> list = aVar.f126406c;
            if (list != null && m < list.size() && m >= 0) {
                return (T) list.get(m);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55297c
    /* renamed from: f */
    public final void mo92315f(List<? extends T> list) {
        C55290a<T> l = mo92316l();
        l.f126405b++;
        int i = l.f126405b;
        List<? extends T> list2 = l.f126406c;
        if (list == list2) {
            return;
        }
        if (list == null) {
            if (list2 == null) {
                C89219l.m154715b();
            }
            int size = list2.size();
            l.f126406c = null;
            l.f126407d.mo3775b(0, size);
        } else if (list2 == null) {
            l.f126406c = list;
            l.f126407d.mo3773a(0, list.size());
        } else {
            l.f126408e.f126421b.execute(new C55290a.RunnableC55292b(l, list2, list, i, null));
        }
    }
}
