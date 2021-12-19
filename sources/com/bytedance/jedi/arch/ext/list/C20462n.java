package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.n */
public final class C20462n {
    static {
        Covode.recordClassIndex(23983);
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.n$a */
    public static final class C20463a extends AbstractC89220m implements AbstractC89183m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C20463a f48404a = new C20463a();

        static {
            Covode.recordClassIndex(23984);
        }

        C20463a() {
            super(2);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C89219l.m154719c(list, "");
            C89219l.m154719c(list2, "");
            return C89070n.m154572d((Collection) list, (Iterable) list2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.n$b */
    public static final class C20464b extends AbstractC89220m implements AbstractC89183m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C20464b f48405a = new C20464b();

        static {
            Covode.recordClassIndex(23985);
        }

        C20464b() {
            super(2);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(list, "");
            if (!list.isEmpty()) {
                return list;
            }
            return obj;
        }
    }
}
