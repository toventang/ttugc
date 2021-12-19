package com.p2082ss.android.ugc.aweme.plugin.aab;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18117b;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.service.AbstractC18128a;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1544b.C21409a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31332l;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31343o;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a.C31301a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a.C31304d;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31305a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31308d;
import com.p2082ss.android.ugc.aweme.plugin.aab.C63126b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl */
public class AabPluginServiceImpl implements IPluginService {

    /* renamed from: a */
    private static final C63126b f143460a = C63126b.f143463c;

    static {
        Covode.recordClassIndex(73968);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: b */
    public final boolean mo28892b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: c */
    public final AbstractC18128a mo28893c() {
        m114070e();
        return new C63125a();
    }

    /* renamed from: d */
    public static IPluginService m114069d() {
        MethodCollector.m26663i(5806);
        Object a = C81908b.m141854a(IPluginService.class, false);
        if (a != null) {
            IPluginService iPluginService = (IPluginService) a;
            MethodCollector.m26664o(5806);
            return iPluginService;
        }
        if (C81908b.f183276cZ == null) {
            synchronized (IPluginService.class) {
                try {
                    if (C81908b.f183276cZ == null) {
                        C81908b.f183276cZ = new AabPluginServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5806);
                    throw th;
                }
            }
        }
        AabPluginServiceImpl aabPluginServiceImpl = (AabPluginServiceImpl) C81908b.f183276cZ;
        MethodCollector.m26664o(5806);
        return aabPluginServiceImpl;
    }

    /* renamed from: e */
    private static boolean m114070e() {
        if (C63126b.f143461a.get() == 3) {
            return true;
        }
        int i = C63126b.f143461a.get();
        if (i == 0 ? C63126b.f143461a.compareAndSet(0, 1) : i == 1) {
            C63126b.m114081a();
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: a */
    public final List<String> mo28887a() {
        m114070e();
        ArrayList arrayList = new ArrayList();
        Map<String, C21409a> a = C21411c.m40191a();
        if (a != null) {
            for (C21409a aVar : a.values()) {
                if (aVar.f50790c == 5) {
                    arrayList.add(aVar.f50788a);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: a */
    public final boolean mo28890a(String str) {
        m114070e();
        return C31343o.m65555a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: a */
    public final void mo28888a(C18117b bVar) {
        C89219l.m154721d(bVar, "");
        int i = C63126b.f143461a.get();
        if (i == 0) {
            C63126b.f143462b = bVar;
            if (!C63126b.f143461a.compareAndSet(0, 1)) {
                return;
            }
            if (bVar.f43138b) {
                C63126b.m114081a();
            } else {
                C1731i.m5640b(C63126b.CallableC63127a.f143464a, C1731i.f5562a);
            }
        } else if (i == 1) {
            C63126b.f143462b = bVar;
            if (bVar.f43138b) {
                C63126b.m114081a();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: a */
    public final void mo28889a(C18119c cVar) {
        AbstractC31339n dVar;
        AbstractC31332l aVar;
        m114070e();
        C89219l.m154721d(cVar, "");
        Locale locale = cVar.f43149h;
        String str = cVar.f43142a;
        boolean z = cVar.f43144c;
        C18115a aVar2 = cVar.f43147f;
        if (aVar2 == null) {
            aVar2 = new C18115a.C18116a().mo28875a();
        }
        AbstractC31339n.C31340a.C31341a aVar3 = new AbstractC31339n.C31340a.C31341a(cVar, z);
        if (locale != null) {
            C89219l.m154716b(aVar2, "");
            dVar = new C31308d(locale, z, aVar3, aVar2);
        } else {
            C89219l.m154716b(str, "");
            C89219l.m154716b(aVar2, "");
            dVar = new C31304d(str, z, aVar3, aVar2);
        }
        dVar.f75087k = cVar.f43146e;
        dVar.f75079c = cVar.f43148g;
        if (dVar instanceof C31308d) {
            aVar = new C31305a((C31308d) dVar);
        } else {
            aVar = new C31301a((C31304d) dVar);
        }
        aVar.mo57300a();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    /* renamed from: a */
    public final boolean mo28891a(String str, String str2) {
        m114070e();
        return C21411c.f50797a.mo35003a(str, str2);
    }
}
