package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65376bp;
import com.p2082ss.android.ugc.aweme.property.C65452eg;
import com.p2082ss.android.ugc.aweme.property.C65453eh;
import com.p2082ss.android.ugc.aweme.property.C65454ei;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65671b;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73849b;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c */
public final class C65539c implements AbstractC65597g {

    /* renamed from: a */
    public static final C65540a f147774a = new C65540a((byte) 0);

    /* renamed from: b */
    private final C65541b f147775b = new C65541b();

    /* renamed from: c */
    private final int f147776c = C65602k.m117392a();

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b */
    public static final class C65541b {

        /* renamed from: a */
        public AbstractC88412b f147777a;

        /* renamed from: b */
        public AbstractC65670a f147778b;

        /* renamed from: c */
        public final C65598h f147779c = new C65598h(C65452eg.m117171a(), (byte) 0);

        /* renamed from: d */
        private AbstractC65542a f147780d = new AbstractC65542a.C65550e(this);

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$d */
        public final /* synthetic */ class RunnableC65565d implements Runnable {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f147802a;

            static {
                Covode.recordClassIndex(77056);
            }

            RunnableC65565d(AbstractC89171a aVar) {
                this.f147802a = aVar;
            }

            public final /* synthetic */ void run() {
                C89219l.m154716b(this.f147802a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(77032);
        }

        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a */
        public static abstract class AbstractC65542a {

            /* renamed from: a */
            public final C65541b f147781a;

            static {
                Covode.recordClassIndex(77033);
            }

            /* renamed from: a */
            public void mo104720a() {
                mo104726e();
            }

            /* renamed from: b */
            public void mo104723b() {
                mo104726e();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b */
            public static abstract class AbstractC65545b extends AbstractC65542a {
                static {
                    Covode.recordClassIndex(77036);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104720a() {
                    this.f147781a.mo104719f();
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b$a */
                public static final class C65546a extends AbstractC65545b {

                    /* renamed from: b */
                    public final C65600i f147784b;

                    static {
                        Covode.recordClassIndex(77037);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                    /* renamed from: e */
                    public final String mo104726e() {
                        return "Cancel";
                    }

                    public final String toString() {
                        return "Cancel:" + this.f147784b;
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65546a(C65541b bVar, C65600i iVar) {
                        super(bVar, (byte) 0);
                        C89219l.m154721d(bVar, "");
                        this.f147784b = iVar;
                    }
                }

                private AbstractC65545b(C65541b bVar) {
                    super(bVar, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$b$b */
                public static final class C65547b extends AbstractC65545b {
                    static {
                        Covode.recordClassIndex(77038);
                    }

                    public final String toString() {
                        return "Failed";
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65547b(C65541b bVar) {
                        super(bVar, (byte) 0);
                        C89219l.m154721d(bVar, "");
                    }
                }

                public /* synthetic */ AbstractC65545b(C65541b bVar, byte b) {
                    this(bVar);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$c */
            public static final class C65548c extends AbstractC65542a {

                /* renamed from: b */
                public final C65600i f147785b;

                static {
                    Covode.recordClassIndex(77039);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: e */
                public final String mo104726e() {
                    return "FastResult";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: b */
                public final void mo104723b() {
                    this.f147781a.mo104713a(this.f147785b);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: c */
                public final void mo104724c() {
                    C84911q.m145926b("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                    C22708a.m42800a("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                }

                public final String toString() {
                    return "FastResult:" + this.f147785b;
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104721a(C65543a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f147781a.mo104715b(aVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104722a(C65548c cVar) {
                    C89219l.m154721d(cVar, "");
                    this.f147781a.mo104712a((AbstractC65542a) cVar);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65548c(C65541b bVar, C65600i iVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(iVar, "");
                    this.f147785b = iVar;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$d */
            public static final class C65549d extends AbstractC65542a {
                static {
                    Covode.recordClassIndex(77040);
                }

                public final String toString() {
                    return "Invalid";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104720a() {
                    this.f147781a.mo104719f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65549d(C65541b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$e */
            public static final class C65550e extends AbstractC65542a {
                static {
                    Covode.recordClassIndex(77041);
                }

                public final String toString() {
                    return "New";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104720a() {
                    this.f147781a.mo104719f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65550e(C65541b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$f */
            public static final class C65551f extends AbstractC65542a {
                static {
                    Covode.recordClassIndex(77042);
                }

                public final String toString() {
                    return "Running";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: b */
                public final void mo104723b() {
                    this.f147781a.mo104713a((C65600i) null);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: d */
                public final void mo104725d() {
                    this.f147781a.mo104712a(new AbstractC65545b.C65547b(this.f147781a));
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: c */
                public final void mo104724c() {
                    C84911q.m145926b("BDUploadSpeedProbe : ".concat("invalid on running"));
                    C22708a.m42800a("BDUploadSpeedProbe : ".concat("invalid on running"));
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65551f(C65541b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104721a(C65543a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f147781a.mo104715b(aVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104722a(C65548c cVar) {
                    C89219l.m154721d(cVar, "");
                    this.f147781a.mo104712a((AbstractC65542a) cVar);
                }
            }

            /* renamed from: d */
            public void mo104725d() {
                m117304a("failed on not running");
            }

            /* renamed from: e */
            public String mo104726e() {
                return toString();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$a */
            public static final class C65543a extends AbstractC65542a {

                /* renamed from: b */
                public final C65600i f147782b;

                static {
                    Covode.recordClassIndex(77034);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: e */
                public final String mo104726e() {
                    return "Complete";
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$a$a$a */
                static final class C65544a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C65543a f147783a;

                    static {
                        Covode.recordClassIndex(77035);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C65544a(C65543a aVar) {
                        super(0);
                        this.f147783a = aVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f147783a.f147781a.mo104719f();
                        return C89391z.f203057a;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.AbstractC65542a
                /* renamed from: a */
                public final void mo104720a() {
                    C65598h hVar;
                    hVar.m117390a((C65598h) this.f147781a.f147779c.f147837c, (AbstractC89171a) new C65544a(this));
                }

                public final String toString() {
                    return "Complete:" + this.f147782b;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65543a(C65541b bVar, C65600i iVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(iVar, "");
                    this.f147782b = iVar;
                }
            }

            /* renamed from: c */
            public void mo104724c() {
                this.f147781a.mo104712a(new C65549d(this.f147781a));
            }

            private AbstractC65542a(C65541b bVar) {
                this.f147781a = bVar;
            }

            /* renamed from: a */
            public void mo104721a(C65543a aVar) {
                C89219l.m154721d(aVar, "");
                m117304a("complete on not running or fast result");
            }

            /* renamed from: a */
            private static void m117304a(String str) {
                C84911q.m145926b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
                C22708a.m42800a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }

            /* renamed from: a */
            public void mo104722a(C65548c cVar) {
                C89219l.m154721d(cVar, "");
                m117304a("fastResult on not running");
            }

            public /* synthetic */ AbstractC65542a(C65541b bVar, byte b) {
                this(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$b */
        public static final class C65552b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65541b f147786a;

            static {
                Covode.recordClassIndex(77043);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65552b(C65541b bVar) {
                super(0);
                this.f147786a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC88412b bVar = this.f147786a.f147777a;
                if (bVar != null) {
                    bVar.dispose();
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: b */
        public final synchronized void mo104714b() {
            MethodCollector.m26663i(11225);
            this.f147780d.mo104720a();
            MethodCollector.m26664o(11225);
        }

        /* renamed from: c */
        public final synchronized void mo104716c() {
            MethodCollector.m26663i(11373);
            this.f147780d.mo104723b();
            MethodCollector.m26664o(11373);
        }

        /* renamed from: d */
        public final synchronized void mo104717d() {
            MethodCollector.m26663i(11534);
            this.f147780d.mo104724c();
            MethodCollector.m26664o(11534);
        }

        /* renamed from: e */
        public final synchronized void mo104718e() {
            MethodCollector.m26663i(12008);
            this.f147780d.mo104725d();
            MethodCollector.m26664o(12008);
        }

        /* renamed from: f */
        public final void mo104719f() {
            mo104712a(new AbstractC65542a.C65551f(this));
            m117290a(new C65553c(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$b$c */
        public static final class C65553c extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65541b f147787a;

            static {
                Covode.recordClassIndex(77044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65553c(C65541b bVar) {
                super(0);
                this.f147787a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                final C655572 r0 = new AbstractC89172b<C65611c, AbstractC88979t<C65600i>>(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655572 */

                    /* renamed from: a */
                    final /* synthetic */ C65553c f147791a;

                    static {
                        Covode.recordClassIndex(77048);
                    }

                    {
                        this.f147791a = r2;
                    }

                    /* renamed from: a */
                    public final AbstractC88979t<C65600i> invoke(final C65611c cVar) {
                        C89219l.m154721d(cVar, "");
                        AbstractC88979t<C65600i> a = AbstractC88979t.m154294a(new AbstractC88983w(this) {
                            /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655572.C655581 */

                            /* renamed from: a */
                            final /* synthetic */ C655572 f147792a;

                            static {
                                Covode.recordClassIndex(77049);
                            }

                            {
                                this.f147792a = r1;
                            }

                            @Override // p4560f.p4561a.AbstractC88983w
                            public final void subscribe(final AbstractC88982v<C65600i> vVar) {
                                int i;
                                C89219l.m154721d(vVar, "");
                                AbstractC65670a aVar = this.f147792a.f147791a.f147787a.f147778b;
                                if (aVar != null) {
                                    C65541b.m117291a("restart speedProbe, may close anr");
                                    aVar.mo104694d();
                                }
                                final long currentTimeMillis = System.currentTimeMillis();
                                AbstractC65670a e = C63244g.m114602a().mo73287o().mo104791k().mo104834e();
                                ClientUploadRouterModel a = C65595e.m117385a();
                                C65611c cVar = cVar;
                                if (a != null) {
                                    i = a.getMode();
                                } else {
                                    i = 0;
                                }
                                e.mo104690a(cVar, i);
                                e.mo104691a(new AbstractC65671b(this) {
                                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655572.C655581.C655591 */

                                    /* renamed from: a */
                                    final /* synthetic */ C655581 f147794a;

                                    static {
                                        Covode.recordClassIndex(77050);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65671b
                                    /* renamed from: a */
                                    public final int mo104735a() {
                                        C65614f fVar = cVar.f147851a;
                                        if (fVar != null) {
                                            C89219l.m154716b(fVar, "");
                                            return C73849b.m129923a(fVar, "BDUploadSpeedProbe");
                                        }
                                        throw new IllegalArgumentException("upload video config is null");
                                    }

                                    {
                                        this.f147794a = r1;
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.v */
                                    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65671b
                                    /* renamed from: a */
                                    public final void mo104736a(int i, int i2, String str) {
                                        boolean z;
                                        boolean z2;
                                        C89219l.m154721d(str, "");
                                        boolean z3 = false;
                                        if (!(i == 0 || i == 1)) {
                                            if (i == 2 || i == 3) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (i == 4) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                                if (i == 5) {
                                                    z3 = true;
                                                }
                                            }
                                            if (0 == 0) {
                                                if (z2 || z3) {
                                                    vVar.mo143031a(new C65600i((long) i2, str, false, currentTimeMillis, System.currentTimeMillis()));
                                                    return;
                                                } else if (z) {
                                                    vVar.mo143104b(new C65601j());
                                                    return;
                                                } else {
                                                    C65541b.m117291a("error vidContextType onSpeedVidContext");
                                                    return;
                                                }
                                            }
                                        }
                                        vVar.mo143031a(new C65600i((long) i2, str, true, currentTimeMillis, System.currentTimeMillis()));
                                        vVar.mo143023a();
                                    }
                                });
                                if (a != null) {
                                    C65541b.m117292a("setNetworkRoutMode mode:" + a.getMode() + " weight:" + a.getWeight(), true);
                                    e.mo104689a(a.getWeight());
                                }
                                int a2 = C65454ei.m117173a();
                                int a3 = C65453eh.m117172a();
                                int a4 = C65602k.m117392a();
                                C65541b.m117292a("startSpeedTest size:" + a2 + " retryCount:" + a3 + " mode:" + a4 + " singleHostTotalTimeout:" + C65603l.m117393a(), false);
                                e.mo104688a();
                                e.mo104692b();
                                this.f147792a.f147791a.f147787a.f147778b = e;
                            }
                        });
                        C89219l.m154716b(a, "");
                        return a;
                    }
                };
                final C655603 r4 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655603 */

                    /* renamed from: a */
                    final /* synthetic */ C65553c f147797a;

                    static {
                        Covode.recordClassIndex(77051);
                    }

                    {
                        this.f147797a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        mo104737a();
                        return C89391z.f203057a;
                    }

                    /* renamed from: a */
                    public final void mo104737a() {
                        C65541b.m117292a("close speedProbe start", true);
                        AbstractC65670a aVar = this.f147797a.f147787a.f147778b;
                        if (aVar != null) {
                            aVar.mo104693c();
                        }
                        AbstractC65670a aVar2 = this.f147797a.f147787a.f147778b;
                        if (aVar2 != null) {
                            aVar2.mo104694d();
                        }
                        this.f147797a.f147787a.f147778b = null;
                        C65541b.m117292a("close speedProbe finish", true);
                    }
                };
                this.f147787a.f147777a = C655541.m117328a().mo143267a((AbstractC88434g<? super C65611c, ? extends AbstractC88984x<? extends R>>) new AbstractC88434g() {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655614 */

                    static {
                        Covode.recordClassIndex(77052);
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        C65611c cVar = (C65611c) obj;
                        C89219l.m154721d(cVar, "");
                        return r0.invoke(cVar);
                    }
                }, false).mo143262a(new AbstractC88428a() {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655625 */

                    static {
                        Covode.recordClassIndex(77053);
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88428a
                    /* renamed from: a */
                    public final void mo8579a() {
                        r4.mo104737a();
                    }
                }).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655636 */

                    /* renamed from: a */
                    final /* synthetic */ C65553c f147800a;

                    static {
                        Covode.recordClassIndex(77054);
                    }

                    {
                        this.f147800a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C65600i iVar = (C65600i) obj;
                        if (iVar.f147841c) {
                            C65541b bVar = this.f147800a.f147787a;
                            C65541b bVar2 = this.f147800a.f147787a;
                            C89219l.m154716b(iVar, "");
                            bVar.mo104710a(new AbstractC65542a.C65543a(bVar2, iVar));
                            return;
                        }
                        C65541b bVar3 = this.f147800a.f147787a;
                        C65541b bVar4 = this.f147800a.f147787a;
                        C89219l.m154716b(iVar, "");
                        bVar3.mo104711a(new AbstractC65542a.C65548c(bVar4, iVar));
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c.C65541b.C65553c.C655647 */

                    /* renamed from: a */
                    final /* synthetic */ C65553c f147801a;

                    static {
                        Covode.recordClassIndex(77055);
                    }

                    {
                        this.f147801a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f147801a.f147787a.mo104718e();
                    }
                });
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final synchronized AbstractC65542a mo104709a() {
            AbstractC65542a aVar;
            MethodCollector.m26663i(11074);
            aVar = this.f147780d;
            MethodCollector.m26664o(11074);
            return aVar;
        }

        /* renamed from: a */
        private static void m117290a(AbstractC89171a<C89391z> aVar) {
            C40780g.m82248e().execute(new RunnableC65565d(aVar));
        }

        /* renamed from: b */
        public final void mo104715b(AbstractC65542a.C65543a aVar) {
            this.f147779c.f147836a = System.currentTimeMillis();
            mo104712a((AbstractC65542a) aVar);
        }

        /* renamed from: a */
        public static void m117291a(String str) {
            C84911q.m145926b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            C22708a.m42800a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        public final synchronized void mo104710a(AbstractC65542a.C65543a aVar) {
            MethodCollector.m26663i(11860);
            this.f147780d.mo104721a(aVar);
            MethodCollector.m26664o(11860);
        }

        /* renamed from: a */
        public final synchronized void mo104711a(AbstractC65542a.C65548c cVar) {
            MethodCollector.m26663i(11692);
            this.f147780d.mo104722a(cVar);
            MethodCollector.m26664o(11692);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo104712a(AbstractC65542a aVar) {
            m117292a(this.f147780d.mo104726e() + " change to " + aVar, true);
            this.f147780d = aVar;
        }

        /* renamed from: a */
        public final void mo104713a(C65600i iVar) {
            mo104712a(new AbstractC65542a.AbstractC65545b.C65546a(this, iVar));
            m117290a(new C65552b(this));
        }

        /* renamed from: a */
        public static void m117292a(String str, boolean z) {
            if (z) {
                C84911q.m145921a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(77030);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$a */
    public static final class C65540a {
        static {
            Covode.recordClassIndex(77031);
        }

        private C65540a() {
        }

        public /* synthetic */ C65540a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: c */
    public final void mo104707c() {
        m117285a("call cancel", false);
        this.f147775b.mo104716c();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: d */
    public final boolean mo104708d() {
        m117285a("call invalid", true);
        if (this.f147776c == 1) {
            m117285a("client route mode not need invalid context", true);
            return false;
        }
        this.f147775b.mo104717d();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: a */
    public final void mo104705a() {
        if (C65376bp.m117072a() && !C63244g.m114602a().mo73255A().mo93901a()) {
            m117285a("call start", false);
            this.f147775b.mo104714b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: b */
    public final UploadSpeedInfo mo104706b() {
        UploadSpeedInfo uploadSpeedInfo;
        mo104707c();
        C65541b.AbstractC65542a a = this.f147775b.mo104709a();
        if (a instanceof C65541b.AbstractC65542a.C65543a) {
            uploadSpeedInfo = C65566c.m117334a(((C65541b.AbstractC65542a.C65543a) a).f147782b);
        } else if (a instanceof C65541b.AbstractC65542a.C65550e) {
            uploadSpeedInfo = new UploadSpeedInfo(-6, null, 0, 0, 0, 30, null);
        } else if (a instanceof C65541b.AbstractC65542a.C65549d) {
            uploadSpeedInfo = new UploadSpeedInfo(-7, null, 0, 0, 0, 30, null);
        } else if (a instanceof C65541b.AbstractC65542a.AbstractC65545b.C65546a) {
            C65541b.AbstractC65542a.AbstractC65545b.C65546a aVar = (C65541b.AbstractC65542a.AbstractC65545b.C65546a) a;
            if (aVar.f147784b == null) {
                uploadSpeedInfo = new UploadSpeedInfo(-5, null, 0, 0, 0, 30, null);
            } else {
                uploadSpeedInfo = C65566c.m117334a(aVar.f147784b);
            }
        } else if (a instanceof C65541b.AbstractC65542a.AbstractC65545b.C65547b) {
            uploadSpeedInfo = new UploadSpeedInfo(-4, null, 0, 0, 0, 30, null);
        } else if ((a instanceof C65541b.AbstractC65542a.C65551f) || (a instanceof C65541b.AbstractC65542a.C65548c)) {
            C84911q.m145926b("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            C22708a.m42800a("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            uploadSpeedInfo = new UploadSpeedInfo(-8, null, 0, 0, 0, 30, null);
        } else {
            throw new C89376n();
        }
        m117285a("getSpeed:".concat(String.valueOf(uploadSpeedInfo)), false);
        return uploadSpeedInfo;
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.c$c */
    static final class C65566c extends AbstractC89220m implements AbstractC89172b<C65600i, UploadSpeedInfo> {

        /* renamed from: a */
        public static final C65566c f147803a = new C65566c();

        static {
            Covode.recordClassIndex(77057);
        }

        C65566c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UploadSpeedInfo invoke(C65600i iVar) {
            return m117334a(iVar);
        }

        /* renamed from: a */
        public static UploadSpeedInfo m117334a(C65600i iVar) {
            C89219l.m154721d(iVar, "");
            return new UploadSpeedInfo(iVar.f147839a, iVar.f147840b, iVar.f147842d, iVar.f147843e, 0, 16, null);
        }
    }

    /* renamed from: a */
    private static void m117285a(String str, boolean z) {
        if (z) {
            C84911q.m145921a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }
    }
}
