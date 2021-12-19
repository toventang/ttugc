package com.p2082ss.android.ugc.aweme.app.p2324e.p2327c;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22058l;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.p1703d.C22940b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.e.c.a */
public final class C33738a {

    /* renamed from: a */
    public static final C33738a f79928a = new C33738a();

    private C33738a() {
    }

    static {
        Covode.recordClassIndex(40633);
    }

    /* renamed from: a */
    private static String m69062a(AbstractC21983b<TypedInput> bVar, C22099u<TypedInput> uVar) {
        if (!(bVar == null || uVar == null || !(bVar instanceof AbstractC22058l))) {
            ((AbstractC22058l) bVar).doCollect();
            C22028c cVar = uVar.f52261a;
            C89219l.m154716b(cVar, "");
            Object obj = cVar.f52044f;
            if (obj instanceof C22940b) {
                return ((C22940b) obj).f35382y;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m69063a(String str, long j, int i, String str2, AbstractC21983b<TypedInput> bVar, C22099u<TypedInput> uVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m69064a(str, j, i, str2, bVar, uVar, null);
    }

    /* renamed from: a */
    public static final void m69065a(String str, long j, int i, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C12290b.m22060a("downloader_monitor", i, new C33743c().mo59975a("duration", Long.valueOf(System.currentTimeMillis() - j)).mo59976a("downloader_scene", str2).mo59976a("request_log", str3).mo59976a("error_msg", str4).mo59976a("network_client", str).mo59977a());
    }

    /* renamed from: a */
    public static final void m69064a(String str, long j, int i, String str2, AbstractC21983b<TypedInput> bVar, C22099u<TypedInput> uVar, String str3) {
        C89219l.m154721d(str, "");
        m69065a(str, j, i, str2, m69062a(bVar, uVar), str3);
    }
}
