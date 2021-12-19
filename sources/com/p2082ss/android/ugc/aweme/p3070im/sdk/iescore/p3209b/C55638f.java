package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b;

import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.p2082ss.android.ugc.aweme.common.net.C39156k;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61540c;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.websocket.p4394a.p4395a.C85623d;
import com.p2082ss.android.websocket.p4394a.p4395a.C85624e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.f */
public final class C55638f implements AbstractC13651e, AbstractC17452e {

    /* renamed from: a */
    public static final C55638f f126899a;

    /* renamed from: b */
    private static final AbstractC89244h f126900b = C89250i.m154773a((AbstractC89171a) C55640b.f126905a);

    /* renamed from: c */
    private static C17470b f126901c;

    /* renamed from: b */
    public static CopyOnWriteArraySet<AbstractC17469a> m101378b() {
        return (CopyOnWriteArraySet) f126900b.getValue();
    }

    private C55638f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.f$b */
    static final class C55640b extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17469a>> {

        /* renamed from: a */
        public static final C55640b f126905a = new C55640b();

        static {
            Covode.recordClassIndex(65422);
        }

        C55640b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17469a> invoke() {
            return new CopyOnWriteArraySet(new LinkedHashSet());
        }
    }

    /* renamed from: c */
    private static String m101379c() {
        String lastWsConnectUrl = C55076b.m100723b().getLastWsConnectUrl();
        if (lastWsConnectUrl == null) {
            return "";
        }
        return lastWsConnectUrl;
    }

    static {
        Covode.recordClassIndex(65420);
        C55638f fVar = new C55638f();
        f126899a = fVar;
        if (C61540c.m111453b()) {
            C56244a.m102193e("WsDependImpl", "init ignored by reversing ws");
        } else {
            C55076b.m100723b().registerWsListener(fVar);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: a */
    public final boolean mo27858a() {
        C17470b bVar = f126901c;
        if (bVar == null || bVar.f41827a != EnumC13655c.CONNECTED) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: a */
    public final void mo27857a(AbstractC17469a aVar) {
        C89219l.m154721d(aVar, "");
        m101378b().add(aVar);
    }

    @Override // com.bytedance.common.wschannel.app.AbstractC13651e
    /* renamed from: a */
    public final void mo21945a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            Iterator<T> it = m101378b().iterator();
            while (it.hasNext()) {
                it.next().mo27897a(wsChannelMsg, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.f$a */
    static final class C55639a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126902a;

        /* renamed from: b */
        final /* synthetic */ String f126903b;

        /* renamed from: c */
        final /* synthetic */ C85624e f126904c;

        static {
            Covode.recordClassIndex(65421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55639a(String str, C85624e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126903b = str;
            this.f126904c = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55639a(this.f126903b, this.f126904c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55639a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f126902a == 0) {
                C89382r.m154942a(obj);
                AbstractC81915c.m141874a(new C39156k(new C85623d(this.f126903b, this.f126904c)));
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e
    /* renamed from: b */
    public final void mo27859b(WsChannelMsg wsChannelMsg) {
        C89219l.m154721d(wsChannelMsg, "");
        if (C61540c.m111453b()) {
            C56244a.m102193e("WsDependImpl", "sendMsg ignored by reversing ws");
            return;
        }
        String c = m101379c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        C89219l.m154716b(localTestApi, "");
        if (localTestApi.isPPEEnable()) {
            String pPELane = localTestApi.getPPELane();
            C89219l.m154716b(pPELane, "");
            linkedHashMap.put("X-Tt-Env", pPELane);
            linkedHashMap.put("X-USE-PPE", "1");
        }
        if (localTestApi.enableBoe()) {
            String boeLane = localTestApi.getBoeLane();
            C89219l.m154716b(boeLane, "");
            linkedHashMap.put("X-Tt-Env", boeLane);
        }
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.f33470h;
        if (list != null) {
            for (T t : list) {
                C89219l.m154716b(t, "");
                String str = t.f33478a;
                C89219l.m154716b(str, "");
                String str2 = t.f33479b;
                C89219l.m154716b(str2, "");
                linkedHashMap.put(str, str2);
            }
        }
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C55639a(c, new C85624e(c, wsChannelMsg.f33468f, wsChannelMsg.f33466d, wsChannelMsg.f33469g, wsChannelMsg.mo22159a(), wsChannelMsg.f33472j, wsChannelMsg.f33471i, linkedHashMap), null), 3);
    }

    @Override // com.bytedance.common.wschannel.app.AbstractC13651e
    /* renamed from: a */
    public final void mo21944a(C13654b bVar, JSONObject jSONObject) {
        if (bVar != null) {
            EnumC13655c cVar = bVar.f33173b;
            C89219l.m154716b(cVar, "");
            f126901c = new C17470b(cVar, m101379c());
            for (T t : m101378b()) {
                C17470b bVar2 = f126901c;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                t.mo27898a(bVar2);
            }
        }
    }
}
