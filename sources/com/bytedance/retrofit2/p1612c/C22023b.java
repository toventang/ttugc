package com.bytedance.retrofit2.p1612c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.feed.C50562y;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.android.ugc.aweme.p2404bs.C34933c;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.c.b */
public final class C22023b implements AbstractC22021a.AbstractC22022a {

    /* renamed from: a */
    public final int f52017a;

    /* renamed from: b */
    public C22096s f52018b;

    /* renamed from: c */
    private final List<AbstractC22021a> f52019c;

    /* renamed from: d */
    private final Request f52020d;

    /* renamed from: e */
    private final AbstractC21983b f52021e;

    /* renamed from: f */
    private int f52022f;

    static {
        Covode.recordClassIndex(25712);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a.AbstractC22022a
    /* renamed from: a */
    public final Request mo35809a() {
        return this.f52020d;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a.AbstractC22022a
    /* renamed from: b */
    public final AbstractC21983b mo35811b() {
        return this.f52021e;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a.AbstractC22022a
    /* renamed from: c */
    public final C22096s mo35812c() {
        return this.f52018b;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a.AbstractC22022a
    /* renamed from: a */
    public final C22099u mo35810a(Request request) {
        C22096s sVar;
        String str;
        C22096s sVar2 = this.f52018b;
        if (!(sVar2 instanceof C34932b)) {
            sVar = new C34932b(sVar2.f52180g, sVar2.f52181h);
            sVar.f52174a = sVar2.f52174a;
            sVar.f52179f = sVar2.f52179f;
            sVar.f52180g = sVar2.f52180g;
            sVar.f52181h = sVar2.f52181h;
            sVar.f52182i = sVar2.f52182i;
            sVar.f52184k = sVar2.f52184k;
            sVar.f52185l = sVar2.f52185l;
            sVar.f52186m = sVar2.f52186m;
            sVar.f52187n = sVar2.f52187n;
            sVar.f52188o = sVar2.f52188o;
            sVar.f52190q = sVar2.f52190q;
            sVar.f52191r = sVar2.f52191r;
            sVar.f52192s = sVar2.f52192s;
            sVar.f52193t = sVar2.f52193t;
            sVar.f52194u = sVar2.f52194u;
            sVar.f52195v = sVar2.f52195v;
            sVar.f52196w = sVar2.f52196w;
            sVar.f52199z = sVar2.f52199z;
            sVar.f52158A = sVar2.f52158A;
            sVar.f52159B = sVar2.f52159B;
            sVar.f52161D = sVar2.f52161D;
            sVar.f52162E = sVar2.f52162E;
            sVar.f52163F = sVar2.f52163F;
            sVar.f52164G = sVar2.f52164G;
            sVar.f52165H = sVar2.f52165H;
            sVar.f52166I = sVar2.f52166I;
            sVar.f52167J = sVar2.f52167J;
            sVar.f52168K = sVar2.f52168K;
            sVar.f52170M = sVar2.f52170M;
            this.f52018b = sVar;
        } else {
            sVar = sVar2;
        }
        if (this.f52017a < this.f52019c.size()) {
            int i = this.f52022f + 1;
            this.f52022f = i;
            if (i > 1) {
                for (AbstractC22021a aVar : this.f52019c) {
                    if (aVar instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) aVar).resetExecuted();
                    }
                }
            }
            C22023b bVar = new C22023b(this.f52019c, this.f52017a + 1, request, this.f52021e, this.f52018b);
            AbstractC22021a aVar2 = this.f52019c.get(this.f52017a);
            request.getUrl();
            C22099u intercept = aVar2.intercept(bVar);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + aVar2 + " returned null");
            } else if (intercept.f52261a != null) {
                if (Integer.valueOf(this.f52017a).intValue() == 0 && intercept.f52261a != null && (intercept.f52261a.f52044f instanceof C14612a)) {
                    C14612a aVar3 = (C14612a) intercept.f52261a.f52044f;
                    if (aVar3.f35365h > 0 && (sVar instanceof C34932b)) {
                        C34932b bVar2 = (C34932b) sVar;
                        bVar2.f82413U = System.currentTimeMillis();
                        bVar2.f82414V = SystemClock.uptimeMillis() - bVar2.f82418Z;
                        C22027b a = intercept.f52261a.mo35844a("x-tt-logid");
                        if (a == null || a.f52038b == null) {
                            str = "";
                        } else {
                            str = a.f52038b;
                        }
                        C34933c.m71322a(request, str, aVar3, bVar2);
                        if (request != null && C58945a.C58947b.f134185a.f134176c && C48331e.m91790a(request)) {
                            long j = aVar3.f35361d - aVar3.f35360c;
                            long j2 = aVar3.f35362e - aVar3.f35361d;
                            long j3 = aVar3.f35363f - aVar3.f35362e;
                            long j4 = aVar3.f35365h - aVar3.f35363f;
                            long j5 = bVar2.f82414V;
                            long j6 = bVar2.f82413U - bVar2.f52180g;
                            C58945a.C58947b.f134185a.mo96428b("feed_api_to_net_api", aVar3.f35360c, false);
                            C58945a.C58947b.f134185a.mo96423a("feed_net_api_to_interceptors", j);
                            C58945a.C58947b.f134185a.mo96423a("feed_interceptors_pre_duration", j2);
                            C58945a.C58947b.f134185a.mo96423a("feed_network_to_response", j3);
                            C58945a.C58947b.f134185a.mo96423a("feed_read_response_duration", j4);
                            C58945a.C58947b.f134185a.mo96423a("feed_interceptors_post_duration", j5);
                            C58945a.C58947b.f134185a.mo96423a("feed_net_api_total", j6);
                            C50562y.m94795a(bVar2);
                            if (aVar3.f35367j > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_dns_duration", aVar3.f35367j);
                            }
                            if (aVar3.f35368k > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_connect_duration", aVar3.f35368k);
                            }
                            if (aVar3.f35369l > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_ssl_duration", aVar3.f35369l);
                            }
                            if (aVar3.f35370m > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_send_duration", aVar3.f35370m);
                            }
                            if (aVar3.f35374q > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_timing_waiting", aVar3.f35374q);
                            }
                            if (aVar3.f35372o > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_receive_duration", aVar3.f35372o);
                            }
                            if (aVar3.f35375r > 0) {
                                C58945a.C58947b.f134185a.mo96423a("feed_cronet_total", aVar3.f35375r);
                            }
                        }
                    }
                }
                return intercept;
            } else {
                throw new IllegalStateException("interceptor " + aVar2 + " returned a ssResponse with no body");
            }
        } else {
            throw new AssertionError();
        }
    }

    public C22023b(List<AbstractC22021a> list, int i, Request request, AbstractC21983b bVar, C22096s sVar) {
        this.f52019c = list;
        this.f52017a = i;
        this.f52020d = request;
        this.f52021e = bVar;
        this.f52018b = sVar;
    }
}
