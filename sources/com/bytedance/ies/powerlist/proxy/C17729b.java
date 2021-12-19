package com.bytedance.ies.powerlist.proxy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.powerlist.proxy.b */
public final class C17729b {

    /* renamed from: a */
    private final AbstractC89244h f42399a = C89250i.m154773a((AbstractC89171a) C17732c.f42404a);

    static {
        Covode.recordClassIndex(20290);
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<ListVMProxy<?, ?>> mo28197a() {
        return (CopyOnWriteArrayList) this.f42399a.getValue();
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.b$c */
    static final class C17732c extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<ListVMProxy<?, ?>>> {

        /* renamed from: a */
        public static final C17732c f42404a = new C17732c();

        static {
            Covode.recordClassIndex(20293);
        }

        C17732c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<ListVMProxy<?, ?>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.b$b */
    public static final class C17731b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C17729b f42402a;

        /* renamed from: b */
        final /* synthetic */ ListVMProxy f42403b;

        static {
            Covode.recordClassIndex(20292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17731b(C17729b bVar, ListVMProxy listVMProxy) {
            super(0);
            this.f42402a = bVar;
            this.f42403b = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f42402a.mo28197a().indexOf(this.f42403b));
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.b$a */
    public static final class C17730a extends AbstractC89220m implements AbstractC89172b<AbstractC17641a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17729b f42400a;

        /* renamed from: b */
        final /* synthetic */ ListVMProxy f42401b;

        static {
            Covode.recordClassIndex(20291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17730a(C17729b bVar, ListVMProxy listVMProxy) {
            super(1);
            this.f42400a = bVar;
            this.f42401b = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17641a aVar) {
            int indexOf;
            if (aVar != null && (indexOf = this.f42400a.mo28197a().indexOf(this.f42401b)) >= 0) {
                ListVMProxy listVMProxy = this.f42401b;
                C89219l.m154719c(aVar, "");
                AbstractC22874b<R, ITEM> bVar = listVMProxy.f42388c;
                if (bVar != null) {
                    bVar.mo23356a(indexOf, aVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo28198a(int i, int i2) {
        ListVMProxy[] listVMProxyArr = new ListVMProxy[i2];
        Arrays.fill(listVMProxyArr, (Object) null);
        if (mo28197a().size() >= i) {
            mo28197a().addAll(i, C89064i.m154508i(listVMProxyArr));
        }
    }

    /* renamed from: b */
    public final void mo28199b(int i, int i2) {
        if (mo28197a().size() > i) {
            List<ListVMProxy<?, ?>> subList = mo28197a().subList(i, C89271h.m154772c(i2 + i, mo28197a().size()));
            C89219l.m154709a((Object) subList, "");
            int size = subList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ListVMProxy<?, ?> remove = mo28197a().remove(i);
                if (remove != null) {
                    remove.mo28196d();
                }
            }
        }
    }
}
