package com.bytedance.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21732b;
import com.bytedance.provider.AbstractC21747h;
import com.bytedance.provider.C21741g;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.track.b */
public interface AbstractC22883b<T extends AbstractC21747h> extends AbstractC21747h {
    static {
        Covode.recordClassIndex(26788);
    }

    /* renamed from: b */
    T mo37219b();

    /* renamed from: com.bytedance.track.b$a */
    public static final class C22884a {
        static {
            Covode.recordClassIndex(26789);
        }

        /* renamed from: com.bytedance.track.b$a$a */
        static final class C22885a extends AbstractC89220m implements AbstractC89172b<AbstractC21747h, AbstractC21747h> {

            /* renamed from: a */
            final /* synthetic */ AbstractC21747h f54031a;

            static {
                Covode.recordClassIndex(26790);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22885a(AbstractC21747h hVar) {
                super(1);
                this.f54031a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ AbstractC21747h invoke(AbstractC21747h hVar) {
                C89219l.m154719c(hVar, "");
                return this.f54031a;
            }
        }

        /* renamed from: a */
        public static <T extends AbstractC21747h> void m43138a(AbstractC22883b<T> bVar, AbstractC89171a<? extends T> aVar) {
            C89219l.m154719c(aVar, "");
            CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet = C21741g.f51510d.get(bVar.mo35386a());
            if (!(copyOnWriteArraySet instanceof Set)) {
                copyOnWriteArraySet = null;
            }
            CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
            if (copyOnWriteArraySet2 != null) {
                AbstractC21747h hVar = (AbstractC21747h) aVar.invoke();
                Iterator<T> it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    it.next().mo35379a(new C22885a(hVar));
                }
            }
        }
    }
}
