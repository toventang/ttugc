package com.bytedance.ies.bullet.p1129c.p1132c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1139f.AbstractC16254a;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.i */
public interface AbstractC16208i extends AbstractC16576j {
    static {
        Covode.recordClassIndex(18501);
    }

    /* renamed from: a */
    C16238z mo25762a();

    /* renamed from: a */
    <T extends AbstractC16741q> T mo25763a(Class<T> cls);

    /* renamed from: a */
    void mo25764a(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    /* renamed from: a */
    void mo25765a(String str, List<String> list, List<? extends JSONObject> list2);

    /* renamed from: a */
    void mo25766a(Throwable th);

    /* renamed from: a */
    void mo25767a(List<String> list, AbstractC16253f fVar);

    /* renamed from: b */
    <T extends AbstractC16568c> T mo25768b(Class<T> cls);

    /* renamed from: b */
    EnumC16723b mo25769b();

    /* renamed from: c */
    C16248b mo25770c();

    /* renamed from: d */
    List<String> mo25771d();

    /* renamed from: e */
    Uri mo25772e();

    /* renamed from: h */
    boolean mo25773h();

    /* renamed from: i */
    void mo25774i();

    /* renamed from: j */
    void mo25775j();

    /* renamed from: k */
    void mo25776k();

    /* renamed from: l */
    void mo25777l();

    /* renamed from: o_ */
    AbstractC16741q mo25778o_();

    void onEvent(AbstractC16191p pVar);

    /* renamed from: p_ */
    Uri mo25780p_();

    /* renamed from: com.bytedance.ies.bullet.c.c.i$a */
    public static final class C16209a {
        static {
            Covode.recordClassIndex(18502);
        }

        /* renamed from: a */
        public static void m30121a(AbstractC16208i iVar, String str, EnumC16586p pVar, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(pVar, "");
            C89219l.m154719c(str2, "");
            AbstractC16576j.C16578b.m30777a(iVar, str, pVar, str2);
        }

        /* renamed from: a */
        public static void m30122a(AbstractC16208i iVar, Throwable th, String str) {
            C89219l.m154719c(th, "");
            C89219l.m154719c(str, "");
            AbstractC16576j.C16578b.m30780a(iVar, th, str);
        }

        /* renamed from: a */
        public static void m30120a(AbstractC16208i iVar) {
            AbstractC16254a aVar = (AbstractC16254a) iVar.mo25770c().mo25832c(AbstractC16254a.class);
            if (aVar != null && iVar.mo25780p_() != null && iVar.mo25778o_() != null) {
                Uri p_ = iVar.mo25780p_();
                if (p_ == null) {
                    C89219l.m154707a();
                }
                AbstractC16741q o_ = iVar.mo25778o_();
                if (o_ == null) {
                    C89219l.m154707a();
                }
                aVar.mo25839a(iVar, p_, o_);
            }
        }
    }
}
