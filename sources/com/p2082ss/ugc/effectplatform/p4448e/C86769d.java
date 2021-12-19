package com.p2082ss.ugc.effectplatform.p4448e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4449f.C86781a;
import com.p2082ss.ugc.effectplatform.p4449f.C86783c;
import com.p2082ss.ugc.effectplatform.p4449f.C86784d;
import com.p2082ss.ugc.effectplatform.p4449f.C86786f;
import com.p2082ss.ugc.effectplatform.p4449f.C86787g;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import p4519d.p4520a.p4530d.p4531a.C88053j;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.e.d */
public final class C86769d {

    /* renamed from: a */
    public static final C86771b f195671a = new C86771b((byte) 0);

    /* renamed from: b */
    private AbstractC86700d f195672b;

    /* renamed from: c */
    private AbstractC86779j f195673c;

    /* renamed from: d */
    private AbstractC86778i f195674d;

    /* renamed from: e */
    private EnumC86773f f195675e;

    static {
        Covode.recordClassIndex(102468);
    }

    /* renamed from: com.ss.ugc.effectplatform.e.d$b */
    public static final class C86771b {
        static {
            Covode.recordClassIndex(102470);
        }

        private C86771b() {
        }

        public /* synthetic */ C86771b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.e.d$a */
    public static final class C86770a {

        /* renamed from: a */
        public AbstractC86779j f195676a;

        /* renamed from: b */
        public AbstractC86700d f195677b;

        /* renamed from: c */
        private EnumC86773f f195678c;

        /* renamed from: d */
        private AbstractC86778i f195679d;

        static {
            Covode.recordClassIndex(102469);
        }

        /* renamed from: a */
        public final C86769d mo140028a() {
            if (this.f195677b == null) {
                throw new IllegalArgumentException("networkClient is required to setup!");
            } else if (this.f195676a != null) {
                AbstractC86700d dVar = this.f195677b;
                if (dVar == null) {
                    C89219l.m154710a("networkClient");
                }
                AbstractC86779j jVar = this.f195676a;
                if (jVar == null) {
                    C89219l.m154710a("writeDisk");
                }
                return new C86769d(dVar, jVar, this.f195679d, this.f195678c, (byte) 0);
            } else {
                throw new IllegalArgumentException("cacheStrategy is required to setup!");
            }
        }

        /* renamed from: a */
        public final C86770a mo140025a(EnumC86773f fVar) {
            this.f195678c = fVar;
            return this;
        }

        /* renamed from: a */
        public final C86770a mo140024a(AbstractC86700d dVar) {
            C89219l.m154719c(dVar, "");
            this.f195677b = dVar;
            return this;
        }

        /* renamed from: a */
        public final C86770a mo140026a(AbstractC86778i iVar) {
            C89219l.m154719c(iVar, "");
            this.f195679d = iVar;
            return this;
        }

        /* renamed from: a */
        public final C86770a mo140027a(AbstractC86779j jVar) {
            C89219l.m154719c(jVar, "");
            this.f195676a = jVar;
            return this;
        }
    }

    /* renamed from: a */
    private final void m150324a(String str, long j) {
        String str2;
        StringBuilder sb = new StringBuilder();
        EnumC86773f fVar = this.f195675e;
        if (fVar != null) {
            str2 = fVar.name();
        } else {
            str2 = null;
        }
        C88060b.m153135a("DownloadManager", sb.append(str2).append("-->").append(str).append(" , cost ").append(j).append(" mills.").toString());
    }

    /* renamed from: a */
    public final long mo140023a(String str, AbstractC86768c cVar) {
        C89219l.m154719c(str, "");
        C88060b.m153135a("DownloadManager", "downloadUrl=" + str + " start");
        C86772e eVar = new C86772e();
        long currentTimeMillis = System.currentTimeMillis();
        if (!C87007u.m150697a(str)) {
            C86702f fVar = null;
            try {
                fVar = this.f195672b.fetchFromNetwork(new C86701e(str, EnumC86699c.GET, null, null, false, 28));
                if (fVar != null && fVar.f195517a == 200) {
                    eVar.f195681b = System.currentTimeMillis() - currentTimeMillis;
                    m150324a("fetchInputStream success! url: ".concat(String.valueOf(str)), eVar.f195681b);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    try {
                        String a = this.f195673c.mo140021a(new C86767b(fVar.f195518b), fVar.f195519c, cVar);
                        if (a == null) {
                            return -1;
                        }
                        long a2 = C86994k.m150669a(a);
                        eVar.f195684e = a2;
                        eVar.f195682c = System.currentTimeMillis() - currentTimeMillis2;
                        if (a2 > 0) {
                            m150324a("writeToDisk success! url: ".concat(String.valueOf(str)), eVar.f195682c);
                            AbstractC86778i iVar = this.f195674d;
                            if (iVar == null) {
                                eVar.f195680a = System.currentTimeMillis() - currentTimeMillis;
                                m150324a("unnecessary to unzip, download success", eVar.f195680a);
                                cVar.mo140020a(eVar);
                                return a2;
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            try {
                                boolean a3 = iVar.mo140030a(a);
                                eVar.f195683d = System.currentTimeMillis() - currentTimeMillis3;
                                eVar.f195680a = System.currentTimeMillis() - currentTimeMillis;
                                if (a3) {
                                    m150324a("unzip success! url: ".concat(String.valueOf(str)), eVar.f195683d);
                                    m150324a("download success! url: ".concat(String.valueOf(str)), eVar.f195680a);
                                    cVar.mo140020a(eVar);
                                    return a2;
                                }
                                eVar.f195685f = new C86786f("unzip file failed!");
                                m150324a("unzip failed! url: ".concat(String.valueOf(str)), eVar.f195683d);
                                m150324a("download failed! url: ".concat(String.valueOf(str)), eVar.f195680a);
                                cVar.mo140020a(eVar);
                                return -1;
                            } catch (Exception e) {
                                if ((e instanceof C86783c) || (e instanceof C86781a) || (e instanceof C88053j) || (e instanceof C86786f)) {
                                    throw e;
                                }
                                throw new C86786f(C89204ab.m154669a(e.getClass()).mo143614c() + ':' + e.getMessage());
                            }
                        } else {
                            m150324a("writeToDisk failed! url: ".concat(String.valueOf(str)), eVar.f195682c);
                            eVar.f195680a = System.currentTimeMillis() - currentTimeMillis;
                            eVar.f195685f = new C88053j("write file to disk failed!");
                            cVar.mo140020a(eVar);
                            return a2;
                        }
                    } catch (Exception e2) {
                        if ((e2 instanceof C86783c) || (e2 instanceof C86781a) || (e2 instanceof C88053j)) {
                            throw e2;
                        }
                        throw new C88053j(C89204ab.m154669a(e2.getClass()).mo143614c() + ':' + e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                eVar.f195685f = new C86784d(400, C89204ab.m154669a(e3.getClass()).mo143614c() + ':' + e3.getMessage());
            }
            eVar.f195680a = System.currentTimeMillis() - currentTimeMillis;
            if (fVar != null) {
                int i = fVar.f195517a;
                String str2 = fVar.f195520d;
                if (str2 == null) {
                    str2 = "status code is " + fVar.f195517a;
                }
                eVar.f195685f = new C86784d(i, str2);
            }
            m150324a("fetchFromNetwork failed! url: ".concat(String.valueOf(str)), eVar.f195680a);
            cVar.mo140020a(eVar);
            return -1;
        }
        eVar.f195680a = System.currentTimeMillis() - currentTimeMillis;
        eVar.f195685f = new C86787g("invalid url");
        m150324a("download failed! url: ".concat(String.valueOf(str)), eVar.f195680a);
        cVar.mo140020a(eVar);
        return -1;
    }

    private C86769d(AbstractC86700d dVar, AbstractC86779j jVar, AbstractC86778i iVar, EnumC86773f fVar) {
        this.f195672b = dVar;
        this.f195673c = jVar;
        this.f195674d = iVar;
        this.f195675e = fVar;
    }

    public /* synthetic */ C86769d(AbstractC86700d dVar, AbstractC86779j jVar, AbstractC86778i iVar, EnumC86773f fVar, byte b) {
        this(dVar, jVar, iVar, fVar);
    }
}
