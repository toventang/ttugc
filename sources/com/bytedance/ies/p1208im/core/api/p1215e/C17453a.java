package com.bytedance.ies.p1208im.core.api.p1215e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.ies.im.core.api.e.a */
public final class C17453a {
    static {
        Covode.recordClassIndex(19940);
    }

    /* renamed from: com.bytedance.ies.im.core.api.e.a$a */
    public static final class C17454a implements AbstractC19479b<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f41789a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f41790b;

        static {
            Covode.recordClassIndex(19941);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            AbstractC89172b bVar = this.f41790b;
            if (bVar != null) {
                bVar.invoke(uVar);
            }
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27861a(T t) {
            AbstractC89172b bVar = this.f41789a;
            if (bVar != null) {
                bVar.invoke(t);
            }
        }

        C17454a(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f41789a = bVar;
            this.f41790b = bVar2;
        }
    }

    /* renamed from: a */
    public static final boolean m32408a(Collection<? extends Object> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m32409b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final long m32404a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long j = -1;
        if (z) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
            return j;
        } catch (Throwable th) {
            C17415a.m32255b().mo27834a(th);
            return j;
        }
    }

    /* renamed from: a */
    public static final List<Long> m32407a(List<String> list) {
        if (list == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m32404a((String) it.next())));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final <T> AbstractC19479b<T> m32406a(AbstractC89172b<? super T, C89391z> bVar, AbstractC89172b<? super C19672u, C89391z> bVar2) {
        return new C17454a(bVar, bVar2);
    }

    /* renamed from: a */
    public static final <T> long m32405a(String str, AbstractC19479b<T> bVar) {
        long a = m32404a(str);
        if (a <= 0 && bVar != null) {
            bVar.mo27860a(C19672u.m36755a().mo31629a(-100000).mo31630a("uid invalid: ".concat(String.valueOf(str))).f46736a);
        }
        return a;
    }
}
