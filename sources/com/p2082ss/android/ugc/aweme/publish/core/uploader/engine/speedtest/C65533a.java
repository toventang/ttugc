package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.property.C65448ed;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.p3615a.C65525a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65613e;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65671b;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73844ad;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.bduploader.BDNetworkRouter;
import com.p2082ss.bduploader.BDNetworkRouterListener;
import com.p2082ss.bduploader.BDUploadResolver;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.a */
public final class C65533a extends AbstractC65670a {

    /* renamed from: a */
    public static final C65534a f147767a = new C65534a((byte) 0);

    /* renamed from: b */
    private BDNetworkRouter f147768b;

    static {
        Covode.recordClassIndex(77024);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: a */
    public final void mo104688a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.a$a */
    public static final class C65534a {
        static {
            Covode.recordClassIndex(77025);
        }

        private C65534a() {
        }

        public /* synthetic */ C65534a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: b */
    public final void mo104692b() {
        BDNetworkRouter bDNetworkRouter = this.f147768b;
        if (bDNetworkRouter == null) {
            C89219l.m154710a("mActualNetworkRouter");
        }
        bDNetworkRouter.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: c */
    public final void mo104693c() {
        BDNetworkRouter bDNetworkRouter = this.f147768b;
        if (bDNetworkRouter == null) {
            C89219l.m154710a("mActualNetworkRouter");
        }
        bDNetworkRouter.stop();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: d */
    public final void mo104694d() {
        BDNetworkRouter bDNetworkRouter = this.f147768b;
        if (bDNetworkRouter == null) {
            C89219l.m154710a("mActualNetworkRouter");
        }
        bDNetworkRouter.close();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: a */
    public final void mo104689a(int i) {
        BDNetworkRouter bDNetworkRouter = this.f147768b;
        if (bDNetworkRouter == null) {
            C89219l.m154710a("mActualNetworkRouter");
        }
        bDNetworkRouter.setRouteWeight(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: a */
    public final void mo104691a(AbstractC65671b bVar) {
        C89219l.m154721d(bVar, "");
        BDNetworkRouter bDNetworkRouter = this.f147768b;
        if (bDNetworkRouter == null) {
            C89219l.m154710a("mActualNetworkRouter");
        }
        bDNetworkRouter.setListener(new C65535b(this, bVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.a$b */
    public static final class C65535b implements BDNetworkRouterListener {

        /* renamed from: a */
        final /* synthetic */ C65533a f147769a;

        /* renamed from: b */
        final /* synthetic */ AbstractC65671b f147770b;

        static {
            Covode.recordClassIndex(77026);
        }

        C65535b(C65533a aVar, AbstractC65671b bVar) {
            this.f147769a = aVar;
            this.f147770b = bVar;
        }

        @Override // com.p2082ss.bduploader.BDNetworkRouterListener
        public final int networkRouteCheckNetState(int i, int i2) {
            return this.f147770b.mo104735a();
        }

        @Override // com.p2082ss.bduploader.BDNetworkRouterListener
        public final void onRouteContext(int i, int i2, String str) {
            if (i == 0) {
                AbstractC65671b bVar = this.f147770b;
                if (str == null) {
                    str = "";
                }
                bVar.mo104736a(5, i2, str);
            } else if (i == 1) {
                AbstractC65671b bVar2 = this.f147770b;
                if (str == null) {
                    str = "";
                }
                bVar2.mo104736a(1, i2, str);
            } else if (i != 2) {
                C84911q.m145926b("BDPublishNetworkRouter : ".concat("error vidContextType onSpeedVidContext"));
                C22708a.m42800a("BDPublishNetworkRouter : ".concat("error vidContextType onSpeedVidContext"));
            } else {
                AbstractC65671b bVar3 = this.f147770b;
                if (str == null) {
                    str = "";
                }
                bVar3.mo104736a(3, i2, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a
    /* renamed from: a */
    public final void mo104690a(C65611c cVar, int i) {
        C89219l.m154721d(cVar, "");
        C65614f fVar = cVar.f147851a;
        if (fVar != null) {
            C89219l.m154716b(fVar, "");
            C65614f.C65615a aVar = fVar.f147883F;
            if (aVar != null) {
                C89219l.m154716b(aVar, "");
                BDNetworkRouter bDNetworkRouter = new BDNetworkRouter(i);
                this.f147768b = bDNetworkRouter;
                bDNetworkRouter.setTopAccessKey(aVar.f147912a);
                BDNetworkRouter bDNetworkRouter2 = this.f147768b;
                if (bDNetworkRouter2 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter2.setTopSecretKey(aVar.f147913b);
                BDNetworkRouter bDNetworkRouter3 = this.f147768b;
                if (bDNetworkRouter3 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter3.setTopSessionToken(aVar.f147914c);
                BDNetworkRouter bDNetworkRouter4 = this.f147768b;
                if (bDNetworkRouter4 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter4.setSpaceName(aVar.f147915d);
                BDNetworkRouter bDNetworkRouter5 = this.f147768b;
                if (bDNetworkRouter5 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter5.setMaxFailTime(fVar.f147893h);
                BDNetworkRouter bDNetworkRouter6 = this.f147768b;
                if (bDNetworkRouter6 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter6.setUploadDomain(fVar.f147888c);
                BDNetworkRouter bDNetworkRouter7 = this.f147768b;
                if (bDNetworkRouter7 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter7.setRWTimeout(fVar.f147889d);
                BDNetworkRouter bDNetworkRouter8 = this.f147768b;
                if (bDNetworkRouter8 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter8.setFileRetryCount(fVar.f147892g);
                BDNetworkRouter bDNetworkRouter9 = this.f147768b;
                if (bDNetworkRouter9 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter9.setTcpOpenTimeOutMilliSec(fVar.f147900o);
                BDNetworkRouter bDNetworkRouter10 = this.f147768b;
                if (bDNetworkRouter10 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter10.setEnableExternDNS(fVar.f147896k);
                BDUploadResolver.setEnableTTNetDNS(fVar.f147898m);
                C65613e eVar = cVar.f147852b;
                if (eVar != null) {
                    BDUploadResolver.setDNSType(eVar.f147871f, eVar.f147872g, eVar.f147873h, eVar.f147874i, eVar.f147875j);
                    BDUploadResolver.setDNSServer(eVar.f147876k, eVar.f147877l);
                }
                BDNetworkRouter bDNetworkRouter11 = this.f147768b;
                if (bDNetworkRouter11 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                C73844ad adVar = new C73844ad();
                adVar.mo116304b();
                adVar.mo116303a(fVar);
                bDNetworkRouter11.setServerParameter(adVar.mo116301a() + C65448ed.m117169a());
                BDNetworkRouter bDNetworkRouter12 = this.f147768b;
                if (bDNetworkRouter12 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter12.setEnableHttps(fVar.f147895j);
                int a = C65525a.m117254a(fVar.f147884G);
                int a2 = C65525a.m117254a(fVar.f147885H);
                BDNetworkRouter bDNetworkRouter13 = this.f147768b;
                if (bDNetworkRouter13 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter13.setNetworkType(403, a);
                BDNetworkRouter bDNetworkRouter14 = this.f147768b;
                if (bDNetworkRouter14 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter14.setNetworkType(404, a2);
                if (fVar.f147903r == 1) {
                    BDNetworkRouter bDNetworkRouter15 = this.f147768b;
                    if (bDNetworkRouter15 == null) {
                        C89219l.m154710a("mActualNetworkRouter");
                    }
                    bDNetworkRouter15.setDataTransportProtocol(2);
                    return;
                }
                BDNetworkRouter bDNetworkRouter16 = this.f147768b;
                if (bDNetworkRouter16 == null) {
                    C89219l.m154710a("mActualNetworkRouter");
                }
                bDNetworkRouter16.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
