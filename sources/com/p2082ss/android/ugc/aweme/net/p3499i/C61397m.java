package com.p2082ss.android.ugc.aweme.net.p3499i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.zstd.C18114c;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18195b;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18201g;
import com.bytedance.retrofit2.C22096s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.i.m */
public final class C61397m implements AbstractC18185b.AbstractC18189d, AbstractC18185b.AbstractC18190e, AbstractC18185b.AbstractC18192f {

    /* renamed from: a */
    public static final C61397m f139390a = new C61397m();

    private C61397m() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72030);
    }

    /* renamed from: a */
    private Object m111149a(C18182a aVar) {
        C89219l.m154721d(aVar, "");
        return AbstractC18185b.AbstractC18190e.C18191a.m33840a(this, aVar);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        String b = C18114c.f43110a.mo28873b(fVar.f43342b.f43370e.mo29049a());
        if (b != null) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar, "");
            AbstractC18185b.C18188c.m33837a(this, aVar, b);
            fVar.f43343c.mo29048b("accept-encoding", "gzip, deflate, br, ttzip");
            if (!TextUtils.isEmpty(b)) {
                fVar.f43343c.mo29048b("ttzip-version", b);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18192f
    /* renamed from: a */
    public final void mo29044a(C18201g<?> gVar, C18182a aVar) {
        C22096s sVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        Object a = m111149a(aVar);
        if (!(a instanceof String)) {
            a = null;
        }
        String str = (String) a;
        if (str != null && (sVar = aVar.f43319b) != null) {
            C18195b bVar = gVar.f43358d;
            C34611o.m70668a("zstd_api_all", new C33743c().mo59976a("path", gVar.f43355a.f43370e.mo29049a()).mo59976a("logid", bVar.mo29045a("x-tt-logid")).mo59976a("request_ttzip_version", str).mo59976a("response_ttzip_version", bVar.mo29045a("ttzip-version")).mo59975a("stream_read_size", sVar.f52170M.get("streamReadByteCount")).mo59975a("received_size", sVar.f52170M.get("receivedByteCount")).mo59975a("stream_read_time", sVar.f52170M.get("streamReadTime")).mo59975a("err_code", sVar.f52170M.get("zstd_err_code")).mo59977a());
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18189d
    /* renamed from: a */
    public final boolean mo29042a(C18199f fVar, C18182a aVar, Throwable th, boolean z) {
        C22096s sVar;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(th, "");
        Object a = m111149a(aVar);
        if (!(a instanceof String)) {
            a = null;
        }
        String str = (String) a;
        if (str == null || (sVar = aVar.f43319b) == null) {
            return false;
        }
        C18195b bVar = fVar.f43343c;
        C34611o.m70668a("zstd_api_all", new C33743c().mo59976a("path", fVar.f43342b.f43370e.mo29049a()).mo59976a("logid", bVar.mo29045a("x-tt-logid")).mo59976a("request_ttzip_version", str).mo59976a("response_ttzip_version", bVar.mo29045a("ttzip-version")).mo59975a("stream_read_size", sVar.f52170M.get("streamReadByteCount")).mo59975a("received_size", sVar.f52170M.get("receivedByteCount")).mo59975a("stream_read_time", sVar.f52170M.get("streamReadTime")).mo59975a("err_code", sVar.f52170M.get("zstd_err_code")).mo59976a("err_msg", th.getMessage()).mo59977a());
        return false;
    }
}
