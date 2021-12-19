package com.bytedance.sdk.bdlynx.p1687e;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.e.a */
public final class C22634a implements AbstractC22656d {
    static {
        Covode.recordClassIndex(26451);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.e.a$a */
    static final class C22635a extends AbstractC89220m implements AbstractC89172b<List<? extends String>, String> {

        /* renamed from: a */
        public static final C22635a f53457a = new C22635a();

        static {
            Covode.recordClassIndex(26452);
        }

        C22635a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154719c(list2, "");
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                String next = it.next();
                while (it.hasNext()) {
                    next = next + ((String) it.next());
                }
                return next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22656d
    /* renamed from: a */
    public final String mo36916a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        return (String) C22635a.f53457a.invoke(C89070n.m154522b(str, str2));
    }
}
