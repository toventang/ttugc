package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65448ed;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.p3615a.C65525a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65613e;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65674b;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73844ad;
import com.p2082ss.bduploader.BDNetworkSpeedTest;
import com.p2082ss.bduploader.BDNetworkSpeedTestListener;
import com.p2082ss.bduploader.BDUploadResolver;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.b */
public final class C65536b extends AbstractC65673a {

    /* renamed from: a */
    public static final C65537a f147771a = new C65537a((byte) 0);

    /* renamed from: b */
    private BDNetworkSpeedTest f147772b;

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: d */
    public final void mo104702d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.b$a */
    public static final class C65537a {
        static {
            Covode.recordClassIndex(77028);
        }

        private C65537a() {
        }

        public /* synthetic */ C65537a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: a */
    public final void mo104697a() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f147772b;
        if (bDNetworkSpeedTest == null) {
            C89219l.m154710a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: b */
    public final void mo104700b() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f147772b;
        if (bDNetworkSpeedTest == null) {
            C89219l.m154710a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.stop();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: c */
    public final void mo104701c() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f147772b;
        if (bDNetworkSpeedTest == null) {
            C89219l.m154710a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.close();
    }

    static {
        Covode.recordClassIndex(77027);
        C65525a.m117255a();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.b$b */
    public static final class C65538b implements BDNetworkSpeedTestListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC65674b f147773a;

        static {
            Covode.recordClassIndex(77029);
        }

        C65538b(AbstractC65674b bVar) {
            this.f147773a = bVar;
        }

        @Override // com.p2082ss.bduploader.BDNetworkSpeedTestListener
        public final int speedTestCheckNetState(int i, int i2) {
            return this.f147773a.mo104765a();
        }

        @Override // com.p2082ss.bduploader.BDNetworkSpeedTestListener
        public final void onSpeedTestContext(int i, int i2, String str) {
            if (i == 0) {
                AbstractC65674b bVar = this.f147773a;
                if (str == null) {
                    str = "";
                }
                bVar.mo104766a(0, i2, str);
            } else if (i == 1) {
                AbstractC65674b bVar2 = this.f147773a;
                if (str == null) {
                    str = "";
                }
                bVar2.mo104766a(2, i2, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: a */
    public final void mo104699a(AbstractC65674b bVar) {
        C89219l.m154721d(bVar, "");
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f147772b;
        if (bDNetworkSpeedTest == null) {
            C89219l.m154710a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.setListener(new C65538b(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a
    /* renamed from: a */
    public final void mo104698a(C65611c cVar) {
        C89219l.m154721d(cVar, "");
        C65614f fVar = cVar.f147851a;
        if (fVar != null) {
            C89219l.m154716b(fVar, "");
            C65614f.C65615a aVar = fVar.f147883F;
            if (aVar != null) {
                C89219l.m154716b(aVar, "");
                BDNetworkSpeedTest bDNetworkSpeedTest = new BDNetworkSpeedTest();
                this.f147772b = bDNetworkSpeedTest;
                bDNetworkSpeedTest.setTopAccessKey(aVar.f147912a);
                BDNetworkSpeedTest bDNetworkSpeedTest2 = this.f147772b;
                if (bDNetworkSpeedTest2 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest2.setTopSecretKey(aVar.f147913b);
                BDNetworkSpeedTest bDNetworkSpeedTest3 = this.f147772b;
                if (bDNetworkSpeedTest3 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest3.setTopSessionToken(aVar.f147914c);
                BDNetworkSpeedTest bDNetworkSpeedTest4 = this.f147772b;
                if (bDNetworkSpeedTest4 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest4.setSpaceName(aVar.f147915d);
                BDNetworkSpeedTest bDNetworkSpeedTest5 = this.f147772b;
                if (bDNetworkSpeedTest5 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest5.setMaxFailTime(fVar.f147893h);
                BDNetworkSpeedTest bDNetworkSpeedTest6 = this.f147772b;
                if (bDNetworkSpeedTest6 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest6.setUploadDomain(fVar.f147888c);
                BDNetworkSpeedTest bDNetworkSpeedTest7 = this.f147772b;
                if (bDNetworkSpeedTest7 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest7.setRWTimeout(fVar.f147889d);
                BDNetworkSpeedTest bDNetworkSpeedTest8 = this.f147772b;
                if (bDNetworkSpeedTest8 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest8.setFileRetryCount(fVar.f147892g);
                BDNetworkSpeedTest bDNetworkSpeedTest9 = this.f147772b;
                if (bDNetworkSpeedTest9 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest9.setTcpOpenTimeOutMilliSec(fVar.f147900o);
                BDNetworkSpeedTest bDNetworkSpeedTest10 = this.f147772b;
                if (bDNetworkSpeedTest10 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest10.setEnableExternDNS(fVar.f147896k);
                BDUploadResolver.setEnableTTNetDNS(fVar.f147898m);
                C65613e eVar = cVar.f147852b;
                if (eVar != null) {
                    BDUploadResolver.setDNSType(eVar.f147871f, eVar.f147872g, eVar.f147873h, eVar.f147874i, eVar.f147875j);
                    BDUploadResolver.setDNSServer(eVar.f147876k, eVar.f147877l);
                }
                BDNetworkSpeedTest bDNetworkSpeedTest11 = this.f147772b;
                if (bDNetworkSpeedTest11 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                C73844ad adVar = new C73844ad();
                adVar.mo116304b();
                adVar.mo116303a(fVar);
                bDNetworkSpeedTest11.setServerParameter(adVar.mo116301a() + C65448ed.m117169a());
                BDNetworkSpeedTest bDNetworkSpeedTest12 = this.f147772b;
                if (bDNetworkSpeedTest12 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest12.setEnableHttps(fVar.f147895j);
                int a = C65525a.m117254a(fVar.f147884G);
                int a2 = C65525a.m117254a(fVar.f147885H);
                BDNetworkSpeedTest bDNetworkSpeedTest13 = this.f147772b;
                if (bDNetworkSpeedTest13 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest13.setNetworkType(403, a);
                BDNetworkSpeedTest bDNetworkSpeedTest14 = this.f147772b;
                if (bDNetworkSpeedTest14 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest14.setNetworkType(404, a2);
                if (fVar.f147903r == 1) {
                    BDNetworkSpeedTest bDNetworkSpeedTest15 = this.f147772b;
                    if (bDNetworkSpeedTest15 == null) {
                        C89219l.m154710a("mActualSpeedTest");
                    }
                    bDNetworkSpeedTest15.setDataTransportProtocol(2);
                    return;
                }
                BDNetworkSpeedTest bDNetworkSpeedTest16 = this.f147772b;
                if (bDNetworkSpeedTest16 == null) {
                    C89219l.m154710a("mActualSpeedTest");
                }
                bDNetworkSpeedTest16.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
