package com.bytedance.ies.xbridge.p1317i.p1319b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c;
import com.bytedance.ies.xbridge.base.runtime.p1293b.EnumC18434f;
import com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18440b;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18442d;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18446f;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g;
import com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18590b;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18615c;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18617d;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.b.b */
public final class C18598b extends AbstractC18590b {

    /* renamed from: a */
    public final String f44293a = "XDownloadFileMethod";

    static {
        Covode.recordClassIndex(21292);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.b$a */
    static final class RunnableC18599a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC18590b.AbstractC18591a f44294a;

        static {
            Covode.recordClassIndex(21293);
        }

        RunnableC18599a(AbstractC18590b.AbstractC18591a aVar) {
            this.f44294a = aVar;
        }

        public final void run() {
            this.f44294a.mo29674a("file path already exist");
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.b$b */
    static final class RunnableC18600b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C18598b f44295a;

        /* renamed from: b */
        final /* synthetic */ C18615c f44296b;

        /* renamed from: c */
        final /* synthetic */ EnumC18483e f44297c;

        /* renamed from: d */
        final /* synthetic */ AbstractC18590b.AbstractC18591a f44298d;

        /* renamed from: e */
        final /* synthetic */ String f44299e;

        static {
            Covode.recordClassIndex(21294);
        }

        RunnableC18600b(C18598b bVar, C18615c cVar, EnumC18483e eVar, AbstractC18590b.AbstractC18591a aVar, String str) {
            this.f44295a = bVar;
            this.f44296b = cVar;
            this.f44297c = eVar;
            this.f44298d = aVar;
            this.f44299e = str;
        }

        /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a */
        public static final class C18601a implements AbstractC18440b {

            /* renamed from: a */
            final /* synthetic */ RunnableC18600b f44300a;

            static {
                Covode.recordClassIndex(21295);
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$a */
            static final class RunnableC18602a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18601a f44301a;

                static {
                    Covode.recordClassIndex(21296);
                }

                RunnableC18602a(C18601a aVar) {
                    this.f44301a = aVar;
                }

                public final void run() {
                    this.f44301a.f44300a.f44298d.mo29674a("connection failed");
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$b */
            static final class RunnableC18603b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18601a f44302a;

                /* renamed from: b */
                final /* synthetic */ String f44303b;

                static {
                    Covode.recordClassIndex(21297);
                }

                RunnableC18603b(C18601a aVar, String str) {
                    this.f44302a = aVar;
                    this.f44303b = str;
                }

                public final void run() {
                    AbstractC18590b.AbstractC18591a aVar = this.f44302a.f44300a.f44298d;
                    String str = this.f44303b;
                    if (str == null) {
                        str = "body is null";
                    }
                    aVar.mo29674a(str);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$d */
            static final class RunnableC18605d implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18601a f44307a;

                /* renamed from: b */
                final /* synthetic */ Exception f44308b;

                static {
                    Covode.recordClassIndex(21299);
                }

                RunnableC18605d(C18601a aVar, Exception exc) {
                    this.f44307a = aVar;
                    this.f44308b = exc;
                }

                public final void run() {
                    AbstractC18590b.AbstractC18591a aVar = this.f44307a.f44300a.f44298d;
                    String message = this.f44308b.getMessage();
                    if (message == null) {
                        message = "store file exception";
                    }
                    aVar.mo29674a(message);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$c */
            static final class RunnableC18604c implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18601a f44304a;

                /* renamed from: b */
                final /* synthetic */ String f44305b;

                /* renamed from: c */
                final /* synthetic */ LinkedHashMap f44306c;

                static {
                    Covode.recordClassIndex(21298);
                }

                RunnableC18604c(C18601a aVar, String str, LinkedHashMap linkedHashMap) {
                    this.f44304a = aVar;
                    this.f44305b = str;
                    this.f44306c = linkedHashMap;
                }

                public final void run() {
                    AbstractC18590b.AbstractC18591a aVar = this.f44304a.f44300a.f44298d;
                    C18617d dVar = new C18617d();
                    dVar.f44346a = this.f44305b;
                    dVar.f44347b = this.f44306c;
                    dVar.f44348c = this.f44304a.f44300a.f44299e;
                    aVar.mo29673a(dVar, "");
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C18601a(RunnableC18600b bVar) {
                this.f44300a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[Catch:{ IOException -> 0x00db }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4 A[Catch:{ IOException -> 0x00db }] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00e3  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x00ed A[Catch:{ IOException -> 0x00f6 }] */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2 A[Catch:{ IOException -> 0x00f6 }] */
            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18440b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo29474a(com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a r11) {
                /*
                // Method dump skipped, instructions count: 254
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.p1317i.p1319b.C18598b.RunnableC18600b.C18601a.mo29474a(com.bytedance.ies.xbridge.base.runtime.b.a):void");
            }
        }

        public final void run() {
            IHostNetworkDepend iHostNetworkDepend;
            C18465b bVar;
            String a = C18442d.m34304a(this.f44296b.mo29687a(), this.f44296b.f44343c, this.f44297c);
            LinkedHashMap<String, String> a2 = C18442d.m34305a(this.f44296b.f44344d);
            C18601a aVar = new C18601a(this);
            C18465b bVar2 = (C18465b) this.f44295a.mo29616a(C18465b.class);
            if ((bVar2 == null || (iHostNetworkDepend = bVar2.f44106i) == null) && ((bVar = C18465b.f44096l) == null || (iHostNetworkDepend = bVar.f44106i) == null)) {
                iHostNetworkDepend = new C18446f();
            }
            C89219l.m154719c(a, "");
            C89219l.m154719c(a2, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(iHostNetworkDepend, "");
            C18429c a3 = new C18429c(a).mo29466a(a2);
            a3.f44040b = true;
            C89219l.m154719c(iHostNetworkDepend, "");
            aVar.mo29474a(C18448g.m34313b(EnumC18434f.DOWNLOAD, a3, iHostNetworkDepend));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r0 != null) goto L_0x0076;
     */
    @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18590b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29672a(com.bytedance.ies.xbridge.p1317i.p1320c.C18615c r11, com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18590b.AbstractC18591a r12, com.bytedance.ies.xbridge.EnumC18483e r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.p1317i.p1319b.C18598b.mo29672a(com.bytedance.ies.xbridge.i.c.c, com.bytedance.ies.xbridge.i.a.b$a, com.bytedance.ies.xbridge.e):void");
    }
}
