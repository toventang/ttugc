package com.bytedance.ies.p1208im.core.p1225f;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1217g.C17459a;
import com.bytedance.ies.p1208im.core.p1221b.HandlerC17488e;
import com.bytedance.ies.p1208im.core.p1222c.C17494b;
import com.bytedance.ies.p1208im.core.p1224e.C17511c;
import com.bytedance.ies.p1208im.core.p1224e.C17520f;
import com.bytedance.ies.p1208im.core.p1224e.C17523g;
import com.bytedance.ies.p1208im.core.p1228i.C17595a;
import com.bytedance.librarian.Librarian;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1431d.p1432a.AbstractC19950a;
import com.bytedance.p1399im.core.internal.p1431d.p1432a.C19951b;
import com.bytedance.p1399im.core.internal.p1431d.p1432a.C19953c;
import com.bytedance.p1399im.core.internal.utils.AbstractC20003k;
import com.bytedance.p1399im.core.p1404a.AbstractC19477a;
import com.bytedance.p1399im.core.p1404a.AbstractC19482c;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1416h.AbstractC19704c;
import com.bytedance.p1399im.core.proto.Response;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.IMCoreDependProxyService;
import java.util.ArrayList;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.b */
public final class C17554b extends AbstractC19477a {

    /* renamed from: a */
    public static final C17554b f41999a = new C17554b();

    /* renamed from: b */
    private static volatile boolean f42000b;

    private C17554b() {
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: j */
    public final AbstractC19482c mo27969j() {
        return C17559c.f42008a;
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: d */
    public final String mo27963d() {
        return HandlerC17488e.m32471c();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: i */
    public final boolean mo27968i() {
        return C17595a.f42083a.mo27858a();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: m */
    public final boolean mo27972m() {
        return m32527p();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: n */
    public final boolean mo27973n() {
        return m32527p();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: o */
    public final boolean mo27974o() {
        return m32527p();
    }

    static {
        Covode.recordClassIndex(20043);
    }

    /* renamed from: p */
    private static boolean m32527p() {
        if (C17560d.f42009a) {
            return false;
        }
        C17415a.m32259f();
        return false;
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: b */
    public final AbstractC19704c mo27960b() {
        return IMCoreDependProxyService.m101313h().mo27909g();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: e */
    public final boolean mo27964e() {
        return C17415a.m32256c().mo27844a();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: f */
    public final String mo27965f() {
        return C17415a.m32254a().mo27848d();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: g */
    public final boolean mo27966g() {
        return C17415a.m32254a().mo27856l();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: h */
    public final int mo27967h() {
        return C17415a.m32254a().mo27846b();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: k */
    public final Map<String, String> mo27970k() {
        return C89041ag.m154429c(C17523g.m32497a());
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: c */
    public final String mo27962c() {
        String str;
        C17418c b = C17415a.m32258e().mo27823b();
        if (b == null || (str = b.f41776b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: l */
    public final void mo27971l() {
        if (!f42000b) {
            if (C33914o.f80220b.get("wcdb") == null) {
                Librarian.m38964a("wcdb", false, (Context) null);
            }
            f42000b = true;
        }
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final long mo27953a() {
        long parseLong = Long.parseLong(C17415a.m32258e().mo27825d());
        if (parseLong <= 0) {
            C17415a.m32255b().mo27838c("SDKBridge", "getUid uid invalid: " + C17415a.m32258e().mo27825d() + ", " + C17415a.m32258e().mo27822a());
        }
        return parseLong;
    }

    /* renamed from: com.bytedance.ies.im.core.f.b$a */
    static final class C17555a extends AbstractC89220m implements AbstractC89172b<AbstractC17429c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f42001a;

        /* renamed from: b */
        final /* synthetic */ int f42002b;

        static {
            Covode.recordClassIndex(20044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17555a(int i, int i2) {
            super(1);
            this.f42001a = i;
            this.f42002b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17429c cVar) {
            AbstractC17429c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.mo27805a(this.f42001a, this.f42002b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.f.b$b */
    static final class C17556b extends AbstractC89220m implements AbstractC89172b<AbstractC17429c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f42003a;

        /* renamed from: b */
        final /* synthetic */ int f42004b;

        static {
            Covode.recordClassIndex(20045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17556b(int i, int i2) {
            super(1);
            this.f42003a = i;
            this.f42004b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17429c cVar) {
            AbstractC17429c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.mo27810b(this.f42003a, this.f42004b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.f.b$c */
    static final class C17557c extends AbstractC89220m implements AbstractC89172b<Response, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19950a f42005a;

        static {
            Covode.recordClassIndex(20046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17557c(AbstractC19950a aVar) {
            super(1);
            this.f42005a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Response response) {
            Response response2 = response;
            AbstractC19950a aVar = this.f42005a;
            if (aVar != null) {
                C19953c.C19954a aVar2 = new C19953c.C19954a();
                aVar2.f47463a.f47459a = 200;
                aVar2.f47463a.f47462d = response2;
                aVar.mo31835a(aVar2.f47463a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final AbstractC20003k mo27954a(String str) {
        if (!((Boolean) C17494b.f41875b.getValue()).booleanValue() || str == null) {
            return null;
        }
        return new C17569f(str);
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final void mo27955a(int i) {
        C17415a.m32255b().mo27838c("SDKBridge", "onTokenInvalid: ".concat(String.valueOf(i)));
        HandlerC17488e eVar = HandlerC17488e.f41863c;
        C17415a.m32255b().mo27838c("TokenManager", "onSDKTokenInvalid: " + HandlerC17488e.m32471c());
        eVar.mo27918f();
    }

    /* renamed from: com.bytedance.ies.im.core.f.b$d */
    static final class C17558d extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17459a f42006a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19950a f42007b;

        static {
            Covode.recordClassIndex(20047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17558d(C17459a aVar, AbstractC19950a aVar2) {
            super(1);
            this.f42006a = aVar;
            this.f42007b = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            Throwable th;
            C19672u uVar2 = uVar;
            C17415a.m32255b().mo27838c("SDKBridge", "sendHttp failed: " + this.f42006a.f41811a + ", " + uVar2);
            AbstractC19950a aVar = this.f42007b;
            if (aVar != null) {
                Throwable th2 = null;
                if (uVar2 != null) {
                    th = uVar2.f46735h;
                } else {
                    th = null;
                }
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    if (uVar2 != null) {
                        th2 = uVar2.f46735h;
                    }
                    exc = new Exception(th2);
                }
                aVar.mo31836a(exc);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final void mo27959a(C19978k kVar) {
        if (kVar != null) {
            kVar.mo31868k();
        }
        C17415a.m32259f();
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final void mo27956a(int i, int i2) {
        C17415a.m32259f().mo27808a(new C17555a(i, i2));
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: b */
    public final void mo27961b(int i, int i2) {
        C17415a.m32259f().mo27808a(new C17556b(i, i2));
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final void mo27958a(C19951b bVar, AbstractC19950a aVar) {
        if (bVar == null) {
            C17415a.m32255b().mo27838c("SDKBridge", "sendHttp request null");
            return;
        }
        C17459a.C17460a aVar2 = new C17459a.C17460a();
        String str = bVar.f47453a;
        C17459a<REQUEST_BODY> aVar3 = aVar2.f41817a;
        if (str == null) {
            str = "";
        }
        aVar3.f41811a = str;
        String str2 = bVar.f47454b;
        C17459a<REQUEST_BODY> aVar4 = aVar2.f41817a;
        if (str2 == null) {
            str2 = "";
        }
        aVar4.f41812b = str2;
        String str3 = bVar.f47455c;
        C89219l.m154721d("Content-Type", "");
        aVar2.f41818b.put("Content-Type", str3);
        REQUEST_BODY request_body = (REQUEST_BODY) bVar.f47457e;
        C89219l.m154716b(request_body, "");
        aVar2.f41817a.f41815e = request_body;
        C17511c b = C17520f.m32494b();
        C22944d dVar = null;
        if (!(b == null || !b.f41909a || b.f41915g == 0)) {
            dVar = new C22944d();
            dVar.f35406i = b.f41916h;
        }
        aVar2.f41817a.f41816f = dVar;
        aVar2.f41817a.f41813c = C89041ag.m154429c(aVar2.f41818b);
        aVar2.f41817a.f41814d = C89041ag.m154429c(aVar2.f41819c);
        C17459a<REQUEST_BODY> aVar5 = aVar2.f41817a;
        C17415a.m32256c().mo27841a(aVar5, C17453a.m32406a(new C17557c(aVar), new C17558d(aVar5, aVar)));
    }

    @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
    /* renamed from: a */
    public final void mo27957a(int i, long j, String str, byte[] bArr) {
        boolean a = C17595a.f42083a.mo27858a();
        C17415a.m32255b().mo27836b("SDKBridge", "send by ws: ".concat(String.valueOf(a)));
        if (a) {
            ArrayList arrayList = new ArrayList();
            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
            msgHeader.f33478a = "cmd";
            msgHeader.f33479b = String.valueOf(i);
            arrayList.add(msgHeader);
            WsChannelMsg.MsgHeader msgHeader2 = new WsChannelMsg.MsgHeader();
            msgHeader2.f33478a = "seq_id";
            msgHeader2.f33479b = String.valueOf(j);
            arrayList.add(msgHeader2);
            WsChannelMsg wsChannelMsg = new WsChannelMsg();
            wsChannelMsg.f33470h = arrayList;
            wsChannelMsg.f33468f = 5;
            wsChannelMsg.f33466d = j;
            wsChannelMsg.f33467e = 0;
            wsChannelMsg.f33469g = 1;
            wsChannelMsg.f33473k = bArr;
            wsChannelMsg.f33472j = "pb";
            wsChannelMsg.f33471i = str;
            C17595a.f42083a.mo27859b(wsChannelMsg);
        }
    }
}
