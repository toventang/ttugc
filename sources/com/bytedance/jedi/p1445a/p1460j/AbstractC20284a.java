package com.bytedance.jedi.p1445a.p1460j;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1461k.AbstractC20292c;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.jedi.a.j.a */
public interface AbstractC20284a {
    static {
        Covode.recordClassIndex(23792);
    }

    /* renamed from: a */
    <K, V, K1, V1> AbstractC20292c mo33647a(AbstractC20168e<K, V> eVar, AbstractC20168e<K1, V1> eVar2, AbstractC20272a<K, V, K1, V1> aVar);

    /* renamed from: com.bytedance.jedi.a.j.a$a */
    public static final class C20285a {
        static {
            Covode.recordClassIndex(23793);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.j.a$a$a */
        public static final class C20286a extends AbstractC89220m implements AbstractC89187q<K, V, V1, V1> {

            /* renamed from: a */
            public static final C20286a f48130a = new C20286a();

            static {
                Covode.recordClassIndex(23794);
            }

            C20286a() {
                super(3);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final V1 invoke(K k, V v, V1 v1) {
                return ((v instanceof Object) && v != 0) ? v : v1;
            }
        }
    }
}
