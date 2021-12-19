package com.p2082ss.android.ugc.aweme.legoImp;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.net.C61337e;
import com.p2082ss.android.ugc.aweme.net.InterceptorProvider;
import com.p2082ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p2082ss.android.ugc.aweme.net.interceptor.CommonTimeOutInterceptor;
import com.p2082ss.android.ugc.aweme.net.monitor.C61429d;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61381b;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61384c;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61392i;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61393j;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61394k;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61395l;
import com.p2082ss.android.ugc.aweme.network.C61464a;
import com.p2082ss.android.ugc.aweme.network.C61484b;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.utils.InterceptorHolder;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider */
public final class NetworkConfigProvider implements INetworkConfigProvider {

    /* renamed from: a */
    private final AbstractC89244h f132722a = C89250i.m154773a((AbstractC89171a) new C58273a(this));

    static {
        Covode.recordClassIndex(68345);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a */
    static final class C58273a extends AbstractC89220m implements AbstractC89171a<C61464a> {

        /* renamed from: a */
        final /* synthetic */ NetworkConfigProvider f132723a;

        static {
            Covode.recordClassIndex(68346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58273a(NetworkConfigProvider networkConfigProvider) {
            super(0);
            this.f132723a = networkConfigProvider;
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a$a */
        static final class C58274a extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            public static final C58274a f132724a = new C58274a();

            static {
                Covode.recordClassIndex(68347);
            }

            C58274a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ String invoke() {
                return C58071d.m104913g();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a$c */
        static final class C58276c extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C58276c f132726a = new C58276c();

            static {
                Covode.recordClassIndex(68349);
            }

            C58276c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a$d */
        static final class C58277d extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C58277d f132727a = new C58277d();

            static {
                Covode.recordClassIndex(68350);
            }

            C58277d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return -1;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider$a$b */
        static final class C58275b extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            public static final C58275b f132725a = new C58275b();

            static {
                Covode.recordClassIndex(68348);
            }

            C58275b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(C16048b.m29633a().mo25412a(true, "enable_api_libra", 0));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61464a invoke() {
            Context a = C17867d.m33078a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
            C61484b bVar = new C61484b((Application) a);
            bVar.f139572a = new IESNetDepend();
            bVar.f139573b = C61337e.f139304a;
            bVar.f139576e = C17867d.f42595s;
            bVar.f139575d = C17867d.m33081b();
            bVar.f139574c = C17867d.f42590n;
            bVar.f139586o = new C61429d(C17867d.m33078a());
            bVar.f139577f = C29736b.f70920a;
            NetworkConfigProvider.m105242a(bVar);
            SecApiImpl.m119993a().initTask();
            C58274a aVar = C58274a.f132724a;
            C89219l.m154721d(aVar, "");
            bVar.f139581j = aVar;
            C58275b bVar2 = C58275b.f132725a;
            C89219l.m154721d(bVar2, "");
            bVar.f139583l = bVar2;
            C58276c cVar = C58276c.f132726a;
            C89219l.m154721d(cVar, "");
            bVar.f139584m = cVar;
            C58277d dVar = C58277d.f132727a;
            C89219l.m154721d(dVar, "");
            bVar.f139585n = dVar;
            return new C61464a(bVar);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider
    /* renamed from: a */
    public final C61464a mo28814a() {
        return (C61464a) this.f132722a.getValue();
    }

    /* renamed from: b */
    public static INetworkConfigProvider m105243b() {
        MethodCollector.m26663i(1576);
        Object a = C81908b.m141854a(INetworkConfigProvider.class, false);
        if (a != null) {
            INetworkConfigProvider iNetworkConfigProvider = (INetworkConfigProvider) a;
            MethodCollector.m26664o(1576);
            return iNetworkConfigProvider;
        }
        if (C81908b.f183286cj == null) {
            synchronized (INetworkConfigProvider.class) {
                try {
                    if (C81908b.f183286cj == null) {
                        C81908b.f183286cj = new NetworkConfigProvider();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1576);
                    throw th;
                }
            }
        }
        NetworkConfigProvider networkConfigProvider = (NetworkConfigProvider) C81908b.f183286cj;
        MethodCollector.m26664o(1576);
        return networkConfigProvider;
    }

    /* renamed from: a */
    public static void m105242a(C61484b bVar) {
        bVar.f139587p.mo29023a(new C61394k()).mo29023a(new C61395l()).mo29023a(new C61381b()).mo29023a(new C61393j()).mo29023a(new C61384c()).mo29023a(new C61392i());
        InterceptorProvider e = InterceptorHolder.m138948e();
        C89219l.m154716b(e, "");
        List<AbstractC22021a> a = e.mo98922a();
        if (a != null) {
            for (T t : a) {
                C89219l.m154716b(t, "");
                C89219l.m154721d(t, "");
                bVar.f139580i.add(t);
            }
        }
        RetrofitUtils.m43285a(new CommonTimeOutInterceptor());
    }
}
