package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.IPowerPreload;
import com.bytedance.ies.ugc.network.partner.p1276b.C18202h;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.net.preload.C61454a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl */
public final class PowerPreloadServiceImpl implements IPowerPreload {
    static {
        Covode.recordClassIndex(72109);
    }

    /* renamed from: a */
    public static IPowerPreload m111300a() {
        MethodCollector.m26663i(9157);
        Object a = C81908b.m141854a(IPowerPreload.class, false);
        if (a != null) {
            IPowerPreload iPowerPreload = (IPowerPreload) a;
            MethodCollector.m26664o(9157);
            return iPowerPreload;
        }
        if (C81908b.f183267cQ == null) {
            synchronized (IPowerPreload.class) {
                try {
                    if (C81908b.f183267cQ == null) {
                        C81908b.f183267cQ = new PowerPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9157);
                    throw th;
                }
            }
        }
        PowerPreloadServiceImpl powerPreloadServiceImpl = (PowerPreloadServiceImpl) C81908b.f183267cQ;
        MethodCollector.m26664o(9157);
        return powerPreloadServiceImpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: androidx.c.e<java.lang.String, com.ss.android.ugc.aweme.net.preload.e> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.ugc.aweme.network.IPowerPreload
    /* renamed from: a */
    public final void mo28815a(String str, Map<String, String> map) {
        C61462f fVar;
        String str2;
        boolean z;
        C89219l.m154721d(str, "");
        if (str.length() != 0) {
            C89219l.m154721d(str, "");
            C61454a.C61455a aVar = C61454a.f139507b;
            if (aVar != null) {
                C89219l.m154721d(str, "");
                if (str.length() != 0) {
                    Set<String> keySet = aVar.f139514a.mo2098c().keySet();
                    ArrayList<Object> arrayList = new ArrayList();
                    for (T t : keySet) {
                        C61461e a = aVar.f139514a.mo2091a(t.toString());
                        if (!(a == null || (fVar = a.f139521a) == null || (str2 = fVar.f139525w) == null || str2.length() == 0)) {
                            C18202h a2 = C18202h.m33867a(str2);
                            if (map == null) {
                                z = C89219l.m154714a((Object) C61454a.C61455a.m111304b(str), (Object) C61454a.C61455a.m111304b(a2.f43370e.mo29049a()));
                            } else {
                                z = true;
                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    String a3 = a2.f43371f.mo29052a(entry.getKey());
                                    if (a3 == null) {
                                        a3 = "";
                                    }
                                    if (!C89219l.m154714a((Object) a3, (Object) entry.getValue())) {
                                        z = false;
                                    }
                                }
                            }
                            if (z) {
                                arrayList.add(t);
                            }
                        }
                    }
                    for (Object obj : arrayList) {
                        aVar.f139514a.mo2097b(obj);
                    }
                }
            }
        }
    }
}
