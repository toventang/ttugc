package com.p2082ss.android.ugc.aweme.sharer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.c */
public final class C69583c {

    /* renamed from: a */
    public static final C69583c f155417a = new C69583c();

    /* renamed from: b */
    private static final Map<String, IChannelApi> f155418b = new LinkedHashMap();

    private C69583c() {
    }

    static {
        Covode.recordClassIndex(81929);
        for (IChannelApi iChannelApi : ServiceManager.get().getServices(IChannelApi.class)) {
            Map<String, IChannelApi> map = f155418b;
            String a = iChannelApi.mo109795a();
            C89219l.m154716b(iChannelApi, "");
            map.put(a, iChannelApi);
        }
    }

    /* renamed from: a */
    public static AbstractC69581b m122807a(String str, C69584d dVar) {
        C89219l.m154721d(str, "");
        IChannelApi iChannelApi = f155418b.get(str);
        if (iChannelApi != null) {
            return iChannelApi.mo109794a(dVar);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m122808a(String str, C69584d dVar, C69684e.C69686b bVar) {
        AbstractC69581b a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        IChannelApi iChannelApi = f155418b.get(str);
        if (iChannelApi == null || (a = iChannelApi.mo109794a(dVar)) == null) {
            return false;
        }
        bVar.mo109823a(a);
        return true;
    }
}
