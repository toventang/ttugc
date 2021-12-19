package com.p2082ss.android.ugc.aweme.social.widget.p3919b;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21732b;
import com.bytedance.provider.AbstractC21747h;
import com.bytedance.provider.C21741g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.b.a */
public interface AbstractC74745a extends AbstractC21747h {
    static {
        Covode.recordClassIndex(87588);
    }

    /* renamed from: a */
    Object mo117795a(AbstractC89124d<? super C89391z> dVar);

    /* renamed from: a */
    void mo117796a(List<? extends User> list);

    /* renamed from: b */
    List<User> mo117797b();

    /* renamed from: c */
    long mo117798c();

    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.a$a */
    public static final class C74746a {
        static {
            Covode.recordClassIndex(87589);
        }

        /* renamed from: a */
        public static void m131235a(AbstractC74745a aVar, AbstractC89171a<C89391z> aVar2) {
            C89219l.m154721d(aVar2, "");
            C89219l.m154719c(aVar2, "");
            CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet = C21741g.f51510d.get(aVar.mo35386a());
            if (!(copyOnWriteArraySet instanceof Set)) {
                copyOnWriteArraySet = null;
            }
            CopyOnWriteArraySet<AbstractC21732b<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
            if (copyOnWriteArraySet2 != null) {
                aVar2.invoke();
                Iterator<T> it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    it.next().mo35379a(new AbstractC21747h.C21748a.C21749a(aVar));
                }
            }
        }
    }
}
