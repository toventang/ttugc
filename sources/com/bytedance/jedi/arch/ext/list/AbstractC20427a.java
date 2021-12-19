package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.a */
public interface AbstractC20427a<T> {
    static {
        Covode.recordClassIndex(23948);
    }

    /* renamed from: a */
    C20431b<T> mo33761a();

    /* renamed from: a */
    T mo33762a(int i);

    /* renamed from: a */
    void mo33763a(List<? extends T> list, AbstractC89171a<C89391z> aVar);

    /* renamed from: com.bytedance.jedi.arch.ext.list.a$a */
    public static final class C20428a {
        static {
            Covode.recordClassIndex(23949);
        }

        /* renamed from: a */
        public static <T> T m38638a(AbstractC20427a<T> aVar, int i, boolean z) {
            return aVar.mo33761a().mo33767a(i, z);
        }

        /* renamed from: a */
        public static <T> void m38639a(AbstractC20427a<T> aVar, List<? extends T> list, AbstractC89171a<C89391z> aVar2) {
            C89219l.m154719c(list, "");
            C20431b<T> a = aVar.mo33761a();
            C89219l.m154719c(list, "");
            a.f48357b++;
            int i = a.f48357b;
            List<? extends T> list2 = a.f48358c;
            if (list == list2) {
                return;
            }
            if (list.isEmpty()) {
                int size = list2.size();
                a.f48358c = C89086z.INSTANCE;
                a.f48359d.mo3775b(0, size);
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else if (list2.isEmpty()) {
                a.f48358c = list;
                a.f48359d.mo3773a(0, list.size());
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                a.f48360e.f48370a.execute(new C20431b.RunnableC20432a(a, list2, list, i, aVar2));
            }
        }
    }
}
