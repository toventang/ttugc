package com.bytedance.ies.bullet.p1129c.p1132c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16614as;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.j */
public interface AbstractC16210j {
    static {
        Covode.recordClassIndex(18503);
    }

    /* renamed from: a */
    void mo25781a(AbstractC16208i iVar);

    /* renamed from: a */
    void mo25782a(AbstractC16208i iVar, Uri uri);

    /* renamed from: a */
    void mo25783a(AbstractC16208i iVar, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    /* renamed from: a */
    void mo25784a(AbstractC16208i iVar, Throwable th);

    /* renamed from: com.bytedance.ies.bullet.c.c.j$a */
    public static final class C16211a {
        static {
            Covode.recordClassIndex(18504);
        }

        /* renamed from: a */
        public static void m30127a(AbstractC16208i iVar) {
            C89219l.m154719c(iVar, "");
            throw new C16614as("An operation is not implemented");
        }

        /* renamed from: b */
        public static void m30130b(AbstractC16208i iVar) {
            C89219l.m154719c(iVar, "");
            throw new C16614as("An operation is not implemented");
        }

        /* renamed from: a */
        public static void m30128a(AbstractC16208i iVar, Uri uri) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(uri, "");
            throw new C16614as("An operation is not implemented");
        }

        /* renamed from: a */
        public static void m30129a(AbstractC16208i iVar, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(bVar2, "");
            bVar.invoke(uri);
        }
    }
}
