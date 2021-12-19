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
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65674b;
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

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d */
public final class C65567d implements AbstractC65597g {

    /* renamed from: a */
    public static final C65568a f147804a = new C65568a((byte) 0);

    /* renamed from: b */
    private final C65569b f147805b = new C65569b();

    /* renamed from: c */
    private final int f147806c = C65602k.m117392a();

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b */
    public static final class C65569b {

        /* renamed from: a */
        public AbstractC88412b f147807a;

        /* renamed from: b */
        public AbstractC65673a f147808b;

        /* renamed from: c */
        public final C65598h f147809c = new C65598h(C65452eg.m117171a(), (byte) 0);

        /* renamed from: d */
        private AbstractC65570a f147810d = new AbstractC65570a.C65578e(this);

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$d */
        public final /* synthetic */ class RunnableC65593d implements Runnable {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f147832a;

            static {
                Covode.recordClassIndex(77084);
            }

            RunnableC65593d(AbstractC89171a aVar) {
                this.f147832a = aVar;
            }

            public final /* synthetic */ void run() {
                C89219l.m154716b(this.f147832a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(77060);
        }

        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a */
        public static abstract class AbstractC65570a {

            /* renamed from: a */
            public final C65569b f147811a;

            static {
                Covode.recordClassIndex(77061);
            }

            /* renamed from: a */
            public void mo104750a() {
                mo104756e();
            }

            /* renamed from: b */
            public void mo104753b() {
                mo104756e();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b */
            public static abstract class AbstractC65573b extends AbstractC65570a {
                static {
                    Covode.recordClassIndex(77064);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104750a() {
                    this.f147811a.mo104749f();
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b$a */
                public static final class C65574a extends AbstractC65573b {

                    /* renamed from: b */
                    public final C65600i f147814b;

                    static {
                        Covode.recordClassIndex(77065);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                    /* renamed from: e */
                    public final String mo104756e() {
                        return "Cancel";
                    }

                    public final String toString() {
                        return "Cancel:" + this.f147814b;
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65574a(C65569b bVar, C65600i iVar) {
                        super(bVar, (byte) 0);
                        C89219l.m154721d(bVar, "");
                        this.f147814b = iVar;
                    }
                }

                private AbstractC65573b(C65569b bVar) {
                    super(bVar, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$b$b */
                public static final class C65575b extends AbstractC65573b {
                    static {
                        Covode.recordClassIndex(77066);
                    }

                    public final String toString() {
                        return "Failed";
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C65575b(C65569b bVar) {
                        super(bVar, (byte) 0);
                        C89219l.m154721d(bVar, "");
                    }
                }

                public /* synthetic */ AbstractC65573b(C65569b bVar, byte b) {
                    this(bVar);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$c */
            public static final class C65576c extends AbstractC65570a {

                /* renamed from: b */
                public final C65600i f147815b;

                static {
                    Covode.recordClassIndex(77067);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: e */
                public final String mo104756e() {
                    return "FastResult";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: b */
                public final void mo104753b() {
                    this.f147811a.mo104743a(this.f147815b);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: c */
                public final void mo104754c() {
                    C84911q.m145926b("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                    C22708a.m42800a("BDUploadSpeedProbe : ".concat("invalid on fast result"));
                }

                public final String toString() {
                    return "FastResult:" + this.f147815b;
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104751a(C65571a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f147811a.mo104745b(aVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104752a(C65576c cVar) {
                    C89219l.m154721d(cVar, "");
                    this.f147811a.mo104742a((AbstractC65570a) cVar);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65576c(C65569b bVar, C65600i iVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(iVar, "");
                    this.f147815b = iVar;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$d */
            public static final class C65577d extends AbstractC65570a {
                static {
                    Covode.recordClassIndex(77068);
                }

                public final String toString() {
                    return "Invalid";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104750a() {
                    this.f147811a.mo104749f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65577d(C65569b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$e */
            public static final class C65578e extends AbstractC65570a {
                static {
                    Covode.recordClassIndex(77069);
                }

                public final String toString() {
                    return "New";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104750a() {
                    this.f147811a.mo104749f();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65578e(C65569b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$f */
            public static final class C65579f extends AbstractC65570a {
                static {
                    Covode.recordClassIndex(77070);
                }

                public final String toString() {
                    return "Running";
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: b */
                public final void mo104753b() {
                    this.f147811a.mo104743a((C65600i) null);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: d */
                public final void mo104755d() {
                    this.f147811a.mo104742a(new AbstractC65573b.C65575b(this.f147811a));
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: c */
                public final void mo104754c() {
                    C84911q.m145926b("BDUploadSpeedProbe : ".concat("invalid on running"));
                    C22708a.m42800a("BDUploadSpeedProbe : ".concat("invalid on running"));
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65579f(C65569b bVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104751a(C65571a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f147811a.mo104745b(aVar);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104752a(C65576c cVar) {
                    C89219l.m154721d(cVar, "");
                    this.f147811a.mo104742a((AbstractC65570a) cVar);
                }
            }

            /* renamed from: d */
            public void mo104755d() {
                m117354a("failed on not running");
            }

            /* renamed from: e */
            public String mo104756e() {
                return toString();
            }

            /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$a */
            public static final class C65571a extends AbstractC65570a {

                /* renamed from: b */
                public final C65600i f147812b;

                static {
                    Covode.recordClassIndex(77062);
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: e */
                public final String mo104756e() {
                    return "Complete";
                }

                /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$a$a$a */
                static final class C65572a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C65571a f147813a;

                    static {
                        Covode.recordClassIndex(77063);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C65572a(C65571a aVar) {
                        super(0);
                        this.f147813a = aVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f147813a.f147811a.mo104749f();
                        return C89391z.f203057a;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.AbstractC65570a
                /* renamed from: a */
                public final void mo104750a() {
                    C65598h hVar;
                    hVar.m117390a((C65598h) this.f147811a.f147809c.f147837c, (AbstractC89171a) new C65572a(this));
                }

                public final String toString() {
                    return "Complete:" + this.f147812b;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65571a(C65569b bVar, C65600i iVar) {
                    super(bVar, (byte) 0);
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(iVar, "");
                    this.f147812b = iVar;
                }
            }

            /* renamed from: c */
            public void mo104754c() {
                this.f147811a.mo104742a(new C65577d(this.f147811a));
            }

            private AbstractC65570a(C65569b bVar) {
                this.f147811a = bVar;
            }

            /* renamed from: a */
            public void mo104751a(C65571a aVar) {
                C89219l.m154721d(aVar, "");
                m117354a("complete on not running or fast result");
            }

            /* renamed from: a */
            private static void m117354a(String str) {
                C84911q.m145926b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
                C22708a.m42800a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }

            /* renamed from: a */
            public void mo104752a(C65576c cVar) {
                C89219l.m154721d(cVar, "");
                m117354a("fastResult on not running");
            }

            public /* synthetic */ AbstractC65570a(C65569b bVar, byte b) {
                this(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$b */
        public static final class C65580b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65569b f147816a;

            static {
                Covode.recordClassIndex(77071);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65580b(C65569b bVar) {
                super(0);
                this.f147816a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC88412b bVar = this.f147816a.f147807a;
                if (bVar != null) {
                    bVar.dispose();
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: b */
        public final synchronized void mo104744b() {
            MethodCollector.m26663i(10305);
            this.f147810d.mo104750a();
            MethodCollector.m26664o(10305);
        }

        /* renamed from: c */
        public final synchronized void mo104746c() {
            MethodCollector.m26663i(10458);
            this.f147810d.mo104753b();
            MethodCollector.m26664o(10458);
        }

        /* renamed from: d */
        public final synchronized void mo104747d() {
            MethodCollector.m26663i(10622);
            this.f147810d.mo104754c();
            MethodCollector.m26664o(10622);
        }

        /* renamed from: e */
        public final synchronized void mo104748e() {
            MethodCollector.m26663i(6893);
            this.f147810d.mo104755d();
            MethodCollector.m26664o(6893);
        }

        /* renamed from: f */
        public final void mo104749f() {
            mo104742a(new AbstractC65570a.C65579f(this));
            m117340a(new C65581c(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$b$c */
        public static final class C65581c extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65569b f147817a;

            static {
                Covode.recordClassIndex(77072);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65581c(C65569b bVar) {
                super(0);
                this.f147817a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                final C655852 r0 = new AbstractC89172b<C65611c, AbstractC88979t<C65600i>>(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655852 */

                    /* renamed from: a */
                    final /* synthetic */ C65581c f147821a;

                    static {
                        Covode.recordClassIndex(77076);
                    }

                    {
                        this.f147821a = r2;
                    }

                    /* renamed from: a */
                    public final AbstractC88979t<C65600i> invoke(final C65611c cVar) {
                        C89219l.m154721d(cVar, "");
                        AbstractC88979t<C65600i> a = AbstractC88979t.m154294a(new AbstractC88983w(this) {
                            /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655852.C655861 */

                            /* renamed from: a */
                            final /* synthetic */ C655852 f147822a;

                            static {
                                Covode.recordClassIndex(77077);
                            }

                            {
                                this.f147822a = r1;
                            }

                            @Override // p4560f.p4561a.AbstractC88983w
                            public final void subscribe(final AbstractC88982v<C65600i> vVar) {
                                C89219l.m154721d(vVar, "");
                                AbstractC65673a aVar = this.f147822a.f147821a.f147817a.f147808b;
                                if (aVar != null) {
                                    C65569b.m117341a("restart speedProbe, may close anr");
                                    aVar.mo104701c();
                                }
                                final long currentTimeMillis = System.currentTimeMillis();
                                AbstractC65673a d = C63244g.m114602a().mo73287o().mo104791k().mo104833d();
                                d.mo104698a(cVar);
                                d.mo104699a(new AbstractC65674b(this) {
                                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655852.C655861.C655871 */

                                    /* renamed from: a */
                                    final /* synthetic */ C655861 f147824a;

                                    static {
                                        Covode.recordClassIndex(77078);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65674b
                                    /* renamed from: a */
                                    public final int mo104765a() {
                                        C65614f fVar = cVar.f147851a;
                                        if (fVar != null) {
                                            C89219l.m154716b(fVar, "");
                                            return C73849b.m129923a(fVar, "BDUploadSpeedProbe");
                                        }
                                        throw new IllegalArgumentException("upload video config is null");
                                    }

                                    {
                                        this.f147824a = r1;
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.v */
                                    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65674b
                                    /* renamed from: a */
                                    public final void mo104766a(int i, int i2, String str) {
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
                                                    C65569b.m117341a("error vidContextType onSpeedVidContext");
                                                    return;
                                                }
                                            }
                                        }
                                        vVar.mo143031a(new C65600i((long) i2, str, true, currentTimeMillis, System.currentTimeMillis()));
                                        vVar.mo143023a();
                                    }
                                });
                                int a = C65454ei.m117173a();
                                int a2 = C65453eh.m117172a();
                                int a3 = C65602k.m117392a();
                                C65569b.m117342a("startSpeedTest size:" + a + " retryCount:" + a2 + " mode:" + a3 + " singleHostTotalTimeout:" + C65603l.m117393a(), false);
                                d.mo104702d();
                                d.mo104697a();
                                this.f147822a.f147821a.f147817a.f147808b = d;
                            }
                        });
                        C89219l.m154716b(a, "");
                        return a;
                    }
                };
                final C655883 r4 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655883 */

                    /* renamed from: a */
                    final /* synthetic */ C65581c f147827a;

                    static {
                        Covode.recordClassIndex(77079);
                    }

                    {
                        this.f147827a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        mo104767a();
                        return C89391z.f203057a;
                    }

                    /* renamed from: a */
                    public final void mo104767a() {
                        C65569b.m117342a("close speedProbe start", true);
                        AbstractC65673a aVar = this.f147827a.f147817a.f147808b;
                        if (aVar != null) {
                            aVar.mo104700b();
                        }
                        AbstractC65673a aVar2 = this.f147827a.f147817a.f147808b;
                        if (aVar2 != null) {
                            aVar2.mo104701c();
                        }
                        this.f147827a.f147817a.f147808b = null;
                        C65569b.m117342a("close speedProbe finish", true);
                    }
                };
                this.f147817a.f147807a = C655821.m117378a().mo143267a((AbstractC88434g<? super C65611c, ? extends AbstractC88984x<? extends R>>) new AbstractC88434g() {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655894 */

                    static {
                        Covode.recordClassIndex(77080);
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        C65611c cVar = (C65611c) obj;
                        C89219l.m154721d(cVar, "");
                        return r0.invoke(cVar);
                    }
                }, false).mo143262a(new AbstractC88428a() {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655905 */

                    static {
                        Covode.recordClassIndex(77081);
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88428a
                    /* renamed from: a */
                    public final void mo8579a() {
                        r4.mo104767a();
                    }
                }).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655916 */

                    /* renamed from: a */
                    final /* synthetic */ C65581c f147830a;

                    static {
                        Covode.recordClassIndex(77082);
                    }

                    {
                        this.f147830a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C65600i iVar = (C65600i) obj;
                        if (iVar.f147841c) {
                            C65569b bVar = this.f147830a.f147817a;
                            C65569b bVar2 = this.f147830a.f147817a;
                            C89219l.m154716b(iVar, "");
                            bVar.mo104740a(new AbstractC65570a.C65571a(bVar2, iVar));
                            return;
                        }
                        C65569b bVar3 = this.f147830a.f147817a;
                        C65569b bVar4 = this.f147830a.f147817a;
                        C89219l.m154716b(iVar, "");
                        bVar3.mo104741a(new AbstractC65570a.C65576c(bVar4, iVar));
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d.C65569b.C65581c.C655927 */

                    /* renamed from: a */
                    final /* synthetic */ C65581c f147831a;

                    static {
                        Covode.recordClassIndex(77083);
                    }

                    {
                        this.f147831a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f147831a.f147817a.mo104748e();
                    }
                });
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final synchronized AbstractC65570a mo104739a() {
            AbstractC65570a aVar;
            MethodCollector.m26663i(9975);
            aVar = this.f147810d;
            MethodCollector.m26664o(9975);
            return aVar;
        }

        /* renamed from: a */
        private static void m117340a(AbstractC89171a<C89391z> aVar) {
            C40780g.m82248e().execute(new RunnableC65593d(aVar));
        }

        /* renamed from: b */
        public final void mo104745b(AbstractC65570a.C65571a aVar) {
            this.f147809c.f147836a = System.currentTimeMillis();
            mo104742a((AbstractC65570a) aVar);
        }

        /* renamed from: a */
        public static void m117341a(String str) {
            C84911q.m145926b("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            C22708a.m42800a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        public final synchronized void mo104740a(AbstractC65570a.C65571a aVar) {
            MethodCollector.m26663i(6749);
            this.f147810d.mo104751a(aVar);
            MethodCollector.m26664o(6749);
        }

        /* renamed from: a */
        public final synchronized void mo104741a(AbstractC65570a.C65576c cVar) {
            MethodCollector.m26663i(10623);
            this.f147810d.mo104752a(cVar);
            MethodCollector.m26664o(10623);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo104742a(AbstractC65570a aVar) {
            m117342a(this.f147810d.mo104756e() + " change to " + aVar, true);
            this.f147810d = aVar;
        }

        /* renamed from: a */
        public final void mo104743a(C65600i iVar) {
            mo104742a(new AbstractC65570a.AbstractC65573b.C65574a(this, iVar));
            m117340a(new C65580b(this));
        }

        /* renamed from: a */
        public static void m117342a(String str, boolean z) {
            if (z) {
                C84911q.m145921a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(77058);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$a */
    public static final class C65568a {
        static {
            Covode.recordClassIndex(77059);
        }

        private C65568a() {
        }

        public /* synthetic */ C65568a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: c */
    public final void mo104707c() {
        m117335a("call cancel", false);
        this.f147805b.mo104746c();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: d */
    public final boolean mo104708d() {
        m117335a("call invalid", true);
        if (this.f147806c == 1) {
            m117335a("client route mode not need invalid context", true);
            return false;
        }
        this.f147805b.mo104747d();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: a */
    public final void mo104705a() {
        if (C65376bp.m117072a() && !C63244g.m114602a().mo73255A().mo93901a()) {
            m117335a("call start", false);
            this.f147805b.mo104744b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g
    /* renamed from: b */
    public final UploadSpeedInfo mo104706b() {
        UploadSpeedInfo uploadSpeedInfo;
        mo104707c();
        C65569b.AbstractC65570a a = this.f147805b.mo104739a();
        if (a instanceof C65569b.AbstractC65570a.C65571a) {
            uploadSpeedInfo = C65594c.m117384a(((C65569b.AbstractC65570a.C65571a) a).f147812b);
        } else if (a instanceof C65569b.AbstractC65570a.C65578e) {
            uploadSpeedInfo = new UploadSpeedInfo(-6, null, 0, 0, 0, 30, null);
        } else if (a instanceof C65569b.AbstractC65570a.C65577d) {
            uploadSpeedInfo = new UploadSpeedInfo(-7, null, 0, 0, 0, 30, null);
        } else if (a instanceof C65569b.AbstractC65570a.AbstractC65573b.C65574a) {
            C65569b.AbstractC65570a.AbstractC65573b.C65574a aVar = (C65569b.AbstractC65570a.AbstractC65573b.C65574a) a;
            if (aVar.f147814b == null) {
                uploadSpeedInfo = new UploadSpeedInfo(-5, null, 0, 0, 0, 30, null);
            } else {
                uploadSpeedInfo = C65594c.m117384a(aVar.f147814b);
            }
        } else if (a instanceof C65569b.AbstractC65570a.AbstractC65573b.C65575b) {
            uploadSpeedInfo = new UploadSpeedInfo(-4, null, 0, 0, 0, 30, null);
        } else if ((a instanceof C65569b.AbstractC65570a.C65579f) || (a instanceof C65569b.AbstractC65570a.C65576c)) {
            C84911q.m145926b("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            C22708a.m42800a("BDUploadSpeedProbe : ".concat("get speed when running and fast result"));
            uploadSpeedInfo = new UploadSpeedInfo(-8, null, 0, 0, 0, 30, null);
        } else {
            throw new C89376n();
        }
        m117335a("getSpeed:".concat(String.valueOf(uploadSpeedInfo)), false);
        return uploadSpeedInfo;
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.d$c */
    static final class C65594c extends AbstractC89220m implements AbstractC89172b<C65600i, UploadSpeedInfo> {

        /* renamed from: a */
        public static final C65594c f147833a = new C65594c();

        static {
            Covode.recordClassIndex(77085);
        }

        C65594c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UploadSpeedInfo invoke(C65600i iVar) {
            return m117384a(iVar);
        }

        /* renamed from: a */
        public static UploadSpeedInfo m117384a(C65600i iVar) {
            C89219l.m154721d(iVar, "");
            return new UploadSpeedInfo(iVar.f147839a, iVar.f147840b, iVar.f147842d, iVar.f147843e, 0, 16, null);
        }
    }

    /* renamed from: a */
    private static void m117335a(String str, boolean z) {
        if (z) {
            C84911q.m145921a("BDUploadSpeedProbe : ".concat(String.valueOf(str)));
        }
    }
}
