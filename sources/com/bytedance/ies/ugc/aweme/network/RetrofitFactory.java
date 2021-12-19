package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.p987c.C14665a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.p2082ss.android.account.token.TTTokenInterceptor;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.api.C33652o;
import com.p2082ss.android.ugc.aweme.app.api.C33655r;
import com.p2082ss.android.ugc.aweme.app.api.OkClient;
import com.p2082ss.android.ugc.aweme.app.api.p2318a.C33607a;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.net.cache.C61322g;
import com.p2082ss.android.ugc.aweme.net.cache.IesCacheInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.CommonParamsCheckInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import com.p2082ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61380a;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61385d;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61386e;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61387f;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61388g;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61389h;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61397m;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import com.p2082ss.android.ugc.aweme.utils.C80399eo;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public class RetrofitFactory implements IRetrofitFactory {

    /* renamed from: a */
    private static NetworkPartnerGroup f43031a;

    static {
        Covode.recordClassIndex(20713);
    }

    /* renamed from: a */
    public static IRetrofitFactory m33635a() {
        MethodCollector.m26663i(11098);
        Object a = C81908b.m141854a(IRetrofitFactory.class, false);
        if (a != null) {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) a;
            MethodCollector.m26664o(11098);
            return iRetrofitFactory;
        }
        if (C81908b.f183397f == null) {
            synchronized (IRetrofitFactory.class) {
                try {
                    if (C81908b.f183397f == null) {
                        C81908b.f183397f = new RetrofitFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11098);
                    throw th;
                }
            }
        }
        RetrofitFactory retrofitFactory = (RetrofitFactory) C81908b.f183397f;
        MethodCollector.m26664o(11098);
        return retrofitFactory;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    /* renamed from: b */
    public final AbstractC18096e mo28817b(String str) {
        return new C18077a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.IRetrofitFactory
    /* renamed from: a */
    public final AbstractC18099f mo28816a(String str) {
        return mo28817b(str).mo28832d();
    }

    /* renamed from: a */
    private static C22092q m33637a(C22092q.C22094a aVar) {
        if (C61410h.m111181a().f139422a) {
            try {
                AbstractC22025a.AbstractC22026a aVar2 = (AbstractC22025a.AbstractC22026a) Reflect.m24529on(aVar).field("clientProvider", new Class[0]).get();
                AbstractC22025a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof C14722o) || (aVar3 instanceof C14665a)) {
                    return aVar.mo35894a();
                }
            } catch (Throwable th) {
                C80399eo.m139373a(th, "error occured.");
            }
        }
        C22092q a = aVar.mo35894a();
        if (a.f52140g != null) {
            a.f52140g.add(new TTNetMonitorInterceptor());
            a.f52140g.set(0, new BeforeHandleRequestInterceptor(a.f52140g.get(0)));
        }
        return a;
    }

    /* renamed from: a */
    static C22092q m33636a(C18077a aVar) {
        NetworkPartnerGroup a;
        if (aVar == null) {
            return null;
        }
        C22092q.C22094a aVar2 = new C22092q.C22094a();
        List<AbstractC22043e.AbstractC22044a> a2 = m33638a(m33638a(aVar.f43037f, C33655r.class), C33607a.class);
        if (!C34717d.m70908a(a2)) {
            for (AbstractC22043e.AbstractC22044a aVar3 : a2) {
                aVar2.mo35891a(aVar3);
            }
        }
        if (!C34717d.m70908a(aVar.f43038g)) {
            for (AbstractC22019c.AbstractC22020a aVar4 : aVar.f43038g) {
                aVar2.mo35888a(aVar4);
            }
        }
        aVar2.mo35893a(new ExecutorC14760a());
        aVar2.mo35892a(aVar.f43032a);
        if (!aVar.f43034c) {
            aVar2.mo35889a(new IesCacheInterceptor());
            if (aVar.f43042k > 0) {
                aVar.mo28824a((AbstractC18185b) new C61387f(aVar.f43042k));
            }
            aVar.mo28824a((AbstractC18185b) new C61389h(aVar.f43040i));
            NetworkPartnerGroup networkPartnerGroup = f43031a;
            if (networkPartnerGroup != null) {
                a = networkPartnerGroup.mo29021a();
            } else {
                NetworkPartnerGroup a3 = new NetworkPartnerGroup().mo29023a(C61388g.f139377a).mo29023a(C61380a.f139369a).mo29022a(C18100g.m33701a().f139544q.mo99140a()).mo29023a(C61397m.f139390a).mo29023a(C61385d.f139374a).mo29023a(C61386e.f139375a);
                f43031a = a3;
                a = a3.mo29021a();
            }
            NetworkPartnerGroup a4 = a.mo29022a(aVar.f43041j);
            StringBuilder append = a4.f43294f.append("create Interceptor, ");
            C89219l.m154716b(append, "");
            a4.mo29024a(append).append("\n");
            aVar2.mo35889a(new NetworkPartnerGroup.PartnerInterceptor(a4));
            if (!C34717d.m70908a(C18100g.m33701a().f139537j)) {
                for (AbstractC22021a aVar5 : C18100g.m33701a().f139537j) {
                    aVar2.mo35889a(aVar5);
                }
            }
            aVar2.mo35889a(new TTTokenInterceptor());
            for (AbstractC22021a aVar6 : aVar.f43036e) {
                aVar2.mo35889a(aVar6);
            }
        }
        aVar2.mo35889a(new SsInterceptor());
        aVar2.mo35889a(new TTNetInitInterceptor());
        if (!aVar.f43034c) {
            aVar2.mo35889a(new CommonParamsCheckInterceptor());
        }
        if (aVar.f43033b) {
            aVar2.mo35890a(new OkClient());
        } else {
            aVar2.mo35890a(new C33652o());
        }
        aVar2.f52147a = C61322g.f139273a;
        return m33637a(aVar2);
    }

    /* renamed from: a */
    private static List<AbstractC22043e.AbstractC22044a> m33638a(List<AbstractC22043e.AbstractC22044a> list, Class cls) {
        if (C34717d.m70908a(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC22043e.AbstractC22044a aVar = null;
        for (AbstractC22043e.AbstractC22044a aVar2 : list) {
            if (cls.isInstance(aVar2)) {
                aVar = aVar2;
            } else if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(0, aVar);
        }
        return arrayList;
    }
}
