package com.bytedance.ies.p1208im.core.p1228i;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.i.a */
public final class C17595a implements AbstractC17452e, AbstractC17469a {

    /* renamed from: a */
    public static final C17595a f42083a;

    /* renamed from: b */
    private static final AbstractC89244h f42084b = C89250i.m154773a((AbstractC89171a) C17596a.f42085a);

    /* renamed from: b */
    private static CopyOnWriteArraySet<AbstractC17469a> m32641b() {
        return (CopyOnWriteArraySet) f42084b.getValue();
    }

    private C17595a() {
    }

    /* renamed from: com.bytedance.ies.im.core.i.a$a */
    static final class C17596a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17469a>> {

        /* renamed from: a */
        public static final C17596a f42085a = new C17596a();

        static {
            Covode.recordClassIndex(20085);
        }

        C17596a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17469a> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(20084);
        C17595a aVar = new C17595a();
        f42083a = aVar;
        C17415a.m32257d().mo27857a(aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: a */
    public final boolean mo27858a() {
        return C17415a.m32257d().mo27858a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: a */
    public final void mo27857a(AbstractC17469a aVar) {
        C89219l.m154721d(aVar, "");
        m32641b().add(aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27898a(C17470b bVar) {
        C89219l.m154721d(bVar, "");
        C17415a.m32255b().mo27836b("WsBridge", "onStateChanged: ".concat(String.valueOf(bVar)));
        Iterator<T> it = m32641b().iterator();
        while (it.hasNext()) {
            it.next().mo27898a(bVar);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: b */
    public final void mo27859b(WsChannelMsg wsChannelMsg) {
        C89219l.m154721d(wsChannelMsg, "");
        C17415a.m32255b().mo27827a("WsBridge", "sendMsg: " + wsChannelMsg.f33468f + ", " + wsChannelMsg.f33469g);
        C17415a.m32257d().mo27859b(wsChannelMsg);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27899a(String str) {
        C17415a.m32255b().mo27836b("WsBridge", "onLogConnectEvent: ".concat(String.valueOf(str)));
        Iterator<T> it = m32641b().iterator();
        while (it.hasNext()) {
            it.next().mo27899a(str);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27897a(WsChannelMsg wsChannelMsg, C19608bd bdVar) {
        C89219l.m154721d(wsChannelMsg, "");
        C17415a.m32255b().mo27827a("WsBridge", "onReceivedMsg: " + wsChannelMsg.f33468f + ", " + wsChannelMsg.f33469g);
        Iterator<T> it = m32641b().iterator();
        while (it.hasNext()) {
            it.next().mo27897a(wsChannelMsg, bdVar);
        }
    }
}
