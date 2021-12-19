package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.n */
public interface AbstractC16188n extends AbstractC16246a {
    static {
        Covode.recordClassIndex(18481);
    }

    /* renamed from: a */
    void mo25740a(AbstractC16188n nVar, boolean z);

    /* renamed from: a */
    void mo25741a(AbstractC89183m<? super List<? extends AbstractC16188n>, ? super AbstractC16192q, C89391z> mVar);

    /* renamed from: a */
    void mo25742a(List<String> list, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b<? super Throwable, C89391z> bVar);

    /* renamed from: b */
    String mo25743b();

    /* renamed from: c */
    Map<String, AbstractC16188n> mo25744c();

    /* renamed from: d */
    Map<String, AbstractC16192q> mo25745d();

    /* renamed from: com.bytedance.ies.bullet.c.c.a.n$a */
    public static final class C16189a extends Exception {
        static {
            Covode.recordClassIndex(18482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16189a(String str) {
            super(str + " not found");
            C89219l.m154719c(str, "");
        }
    }
}
