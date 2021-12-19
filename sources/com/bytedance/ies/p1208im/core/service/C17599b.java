package com.bytedance.ies.p1208im.core.service;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.ies.p1208im.core.api.p1213c.AbstractC17446a;
import com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b;
import com.bytedance.ies.p1208im.core.p1221b.C17472a;
import com.bytedance.ies.p1208im.core.p1221b.C17486c;
import com.bytedance.ies.p1208im.core.p1221b.C17487d;
import com.bytedance.ies.p1208im.core.p1221b.HandlerC17488e;
import com.bytedance.ies.p1208im.core.p1224e.C17514e;
import com.bytedance.ies.p1208im.core.p1224e.C17551t;
import com.bytedance.ies.p1208im.core.p1225f.C17560d;
import com.bytedance.ies.p1208im.core.p1228i.C17595a;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.AbstractC19670s;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.service.b */
public final class C17599b implements AbstractC17467b {

    /* renamed from: a */
    public static final C17600a f42088a = new C17600a((byte) 0);

    static {
        Covode.recordClassIndex(20089);
    }

    /* renamed from: com.bytedance.ies.im.core.service.b$a */
    public static final class C17600a {
        static {
            Covode.recordClassIndex(20090);
        }

        private C17600a() {
        }

        public /* synthetic */ C17600a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: d */
    public final Context mo27896d() {
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        return a.f46156a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: b */
    public final void mo27891b() {
        C17415a.m32255b().mo27836b("PlatformService", "onTokenSDKReady");
        HandlerC17488e.f41863c.mo27913a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: c */
    public final void mo27895c() {
        C17514e.EnumC17515a aVar = C17514e.EnumC17515a.IM_BIZ;
        C89219l.m154721d(aVar, "");
        C17415a.m32255b().mo27836b("SDKMessagePuller", "manualPullMessage: ".concat(String.valueOf(aVar)));
        AbstractC89568bz unused = C89624i.m155555a(C17514e.f41920a, null, null, new C17514e.C17517c(null), 3);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27885a() {
        C17486c cVar = C17486c.f41859b;
        C17415a.m32255b().mo27836b("PlatformManager", "initPlatform: " + C17486c.f41858a + ", 0, " + (SystemClock.elapsedRealtime() - IMCoreProxyService.f42086a));
        if (!C17486c.f41858a) {
            C17415a.m32258e().mo27821a(cVar);
            C17415a.m32256c().mo27842a(cVar);
            C17595a.f42083a.mo27857a(cVar);
            C17486c.f41858a = true;
            C17551t tVar = C17551t.f41995a;
            C17595a.f42083a.mo27857a(tVar);
            HandlerC17488e.m32469a(tVar);
            C17415a.m32258e().mo27821a(tVar);
            C17560d.f42010b.mo27976a();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27886a(AbstractC17425d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
        C17472a.m32450a().add(dVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: b */
    public final void mo27892b(AbstractC19670s sVar) {
        C89219l.m154721d(sVar, "");
        C20014q.m37816a().f47557c = null;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27888a(AbstractC19670s sVar) {
        C89219l.m154721d(sVar, "");
        C20014q.m37816a().f47557c = sVar;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: b */
    public final void mo27894b(int[] iArr) {
        C89219l.m154721d(iArr, "");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        a.mo31141b().f46279s = iArr;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27887a(AbstractC17446a.EnumC17447a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        C17415a.m32255b().mo27836b("PlatformManager", "onBizSceneChanged: ".concat(String.valueOf(aVar)));
        int i = C17487d.f41860a[aVar.ordinal()];
        if (i == 1) {
            C17560d.f42010b.mo27977b();
            HandlerC17488e.f41863c.mo27915b();
        } else if (i == 2) {
            C17560d.f42010b.mo27977b();
            HandlerC17488e.f41863c.mo27915b();
        } else if (i == 3) {
            C17560d.f42010b.mo27977b();
            HandlerC17488e.f41863c.mo27915b();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27890a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        a.mo31141b().f46280t = iArr;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: a */
    public final void mo27889a(String str, AbstractC17425d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C20014q.m37816a().mo31897a(str, dVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b
    /* renamed from: b */
    public final void mo27893b(String str, AbstractC17425d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C20014q.m37816a().mo31906b(str, dVar);
    }
}
