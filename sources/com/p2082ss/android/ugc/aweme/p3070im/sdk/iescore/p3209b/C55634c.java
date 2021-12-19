package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c;
import com.bytedance.ies.p1208im.core.api.p1216f.C17458d;
import com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b;
import com.bytedance.ies.p1208im.core.api.p1217g.C17459a;
import com.bytedance.ies.p1208im.core.api.p1217g.C17464d;
import com.bytedance.ies.p1208im.core.api.p1217g.EnumC17463c;
import com.bytedance.ies.p1208im.core.api.p1217g.EnumC17465e;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.proto.Request;
import com.bytedance.p1399im.core.proto.Response;
import com.p2082ss.android.ugc.aweme.common.net.C39151f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.api.PlatformApi;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.c */
public final class C55634c implements AbstractC17450c, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C55634c f126894a;

    /* renamed from: b */
    private static final AbstractC89244h f126895b = C89250i.m154773a((AbstractC89171a) C55635a.f126896a);

    /* renamed from: b */
    private static CopyOnWriteArraySet<AbstractC17462b> m101361b() {
        return (CopyOnWriteArraySet) f126895b.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(347, new RunnableC90250g(C55634c.class, "onNetworkEvent", C39151f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C55634c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.c$a */
    static final class C55635a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17462b>> {

        /* renamed from: a */
        public static final C55635a f126896a = new C55635a();

        static {
            Covode.recordClassIndex(65417);
        }

        C55635a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17462b> invoke() {
            return new CopyOnWriteArraySet(new LinkedHashSet());
        }
    }

    static {
        Covode.recordClassIndex(65416);
        C55634c cVar = new C55634c();
        f126894a = cVar;
        EventBus.m156966a(EventBus.m156962a(), cVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
    /* renamed from: a */
    public final boolean mo27844a() {
        return C80422fe.m139425a(C17867d.m33078a());
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
    /* renamed from: a */
    public final void mo27842a(AbstractC17462b bVar) {
        C89219l.m154721d(bVar, "");
        m101361b().add(bVar);
    }

    @AbstractC90264r
    public final void onNetworkEvent(C39151f fVar) {
        EnumC17463c cVar;
        EnumC17465e eVar;
        C89219l.m154721d(fVar, "");
        if (C80422fe.m139425a(C17867d.m33078a())) {
            cVar = EnumC17463c.CONNECTED;
        } else {
            cVar = EnumC17463c.DISCONNECTED;
        }
        int i = fVar.f92366a;
        if (i == 1) {
            eVar = EnumC17465e.MOBILE;
        } else if (i != 2) {
            eVar = EnumC17465e.UNKNOWN;
        } else {
            eVar = EnumC17465e.WIFI;
        }
        Iterator<T> it = m101361b().iterator();
        while (it.hasNext()) {
            it.next().mo27778a(new C17464d(cVar, eVar));
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
    /* renamed from: a */
    public final void mo27841a(C17459a<Request> aVar, AbstractC19479b<Response> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        PlatformApi.f126880a.mo27841a(aVar, bVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
    /* renamed from: a */
    public final void mo27843a(boolean z, AbstractC19479b<C17458d> bVar) {
        C89219l.m154721d(bVar, "");
        PlatformApi.f126880a.mo27843a(z, bVar);
    }
}
