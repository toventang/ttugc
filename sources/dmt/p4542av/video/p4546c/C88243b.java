package dmt.p4542av.video.p4546c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.c.b */
public final class C88243b {

    /* renamed from: c */
    public static volatile C88243b f200281c;

    /* renamed from: d */
    public static final C88244a f200282d = new C88244a((byte) 0);

    /* renamed from: a */
    public boolean f200283a = true;

    /* renamed from: b */
    public final Application f200284b;

    /* renamed from: e */
    private boolean f200285e;

    /* renamed from: f */
    private final AbstractC89244h f200286f = C89250i.m154773a((AbstractC89171a) new C88247c(this));

    /* renamed from: g */
    private final AbstractC89244h f200287g = C89250i.m154773a((AbstractC89171a) new C88245b(this));

    static {
        Covode.recordClassIndex(104278);
    }

    /* renamed from: c */
    private final C30731d.AbstractC30735d m153353c() {
        return (C30731d.AbstractC30735d) this.f200286f.getValue();
    }

    /* renamed from: d */
    private final DownloadableModelSupportLibraryLoader m153354d() {
        return (DownloadableModelSupportLibraryLoader) this.f200287g.getValue();
    }

    /* renamed from: dmt.av.video.c.b$a */
    public static final class C88244a {
        static {
            Covode.recordClassIndex(104279);
        }

        private C88244a() {
        }

        public /* synthetic */ C88244a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C88243b mo142775a(Application application) {
            C88243b bVar;
            MethodCollector.m26663i(5164);
            C89219l.m154721d(application, "");
            C88243b bVar2 = C88243b.f200281c;
            if (bVar2 == null) {
                synchronized (this) {
                    try {
                        bVar = C88243b.f200281c;
                        if (bVar == null) {
                            bVar = new C88243b(application);
                            C88243b.f200281c = bVar;
                        }
                    } finally {
                        MethodCollector.m26664o(5164);
                    }
                }
                return bVar;
            }
            MethodCollector.m26664o(5164);
            return bVar2;
        }
    }

    /* renamed from: dmt.av.video.c.b$b */
    static final class C88245b extends AbstractC89220m implements AbstractC89171a<DownloadableModelSupportLibraryLoader> {

        /* renamed from: a */
        final /* synthetic */ C88243b f200288a;

        static {
            Covode.recordClassIndex(104280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88245b(C88243b bVar) {
            super(0);
            this.f200288a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DownloadableModelSupportLibraryLoader invoke() {
            return new DownloadableModelSupportLibraryLoader(this) {
                /* class dmt.p4542av.video.p4546c.C88243b.C88245b.C882461 */

                /* renamed from: a */
                final /* synthetic */ C88245b f200289a;

                static {
                    Covode.recordClassIndex(104281);
                }

                {
                    this.f200289a = r1;
                }

                @Override // com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
                public final void loadLibrary(String str) {
                    Librarian.m38963a(str, this.f200289a.f200288a.f200284b);
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo142773a() {
        C30731d.f73583c = m153353c();
        DownloadableModelSupport.setLibraryLoader(m153354d());
    }

    /* renamed from: dmt.av.video.c.b$c */
    static final class C88247c extends AbstractC89220m implements AbstractC89171a<C30731d.AbstractC30735d> {

        /* renamed from: a */
        final /* synthetic */ C88243b f200290a;

        static {
            Covode.recordClassIndex(104282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88247c(C88243b bVar) {
            super(0);
            this.f200290a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C30731d.AbstractC30735d invoke() {
            C63244g.m114602a().mo73295w();
            C73991bj.m130128a("So decompress: TELibraryLoaderManager, using normal library");
            return new C88242a(this.f200290a.f200283a);
        }
    }

    /* renamed from: b */
    public final void mo142774b() {
        if (!this.f200285e) {
            C30731d.f73583c = m153353c();
            DownloadableModelSupport.setLibraryLoader(m153354d());
            this.f200285e = true;
        }
    }

    public C88243b(Application application) {
        C89219l.m154721d(application, "");
        this.f200284b = application;
    }
}
