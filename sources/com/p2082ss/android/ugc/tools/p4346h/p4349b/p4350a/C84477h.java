package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84459p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.p4658f.AbstractC90149a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.a.h */
public final class C84477h extends AbstractC84455l {

    /* renamed from: b */
    public static final C84478a f188834b = new C84478a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f188835a = C89250i.m154773a((AbstractC89171a) C84483f.f188846a);

    static {
        Covode.recordClassIndex(98442);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$a */
    public static final class C84478a {
        static {
            Covode.recordClassIndex(98443);
        }

        private C84478a() {
        }

        public /* synthetic */ C84478a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$f */
    static final class C84483f extends AbstractC89220m implements AbstractC89171a<C90208y> {

        /* renamed from: a */
        public static final C84483f f188846a = new C84483f();

        static {
            Covode.recordClassIndex(98448);
        }

        C84483f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C90208y invoke() {
            return new C90208y.C90210a().mo145101c().mo145088a(15, TimeUnit.SECONDS).mo145103d();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$d */
    static final class C84481d<T> implements AbstractC88433f<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84459p f188840a;

        /* renamed from: b */
        final /* synthetic */ String f188841b;

        /* renamed from: c */
        final /* synthetic */ long f188842c;

        static {
            Covode.recordClassIndex(98446);
        }

        C84481d(AbstractC84459p pVar, String str, long j) {
            this.f188840a = pVar;
            this.f188841b = str;
            this.f188842c = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89391z zVar) {
            AbstractC84459p pVar = this.f188840a;
            if (pVar != null) {
                pVar.mo86086a(this.f188841b, System.currentTimeMillis() - this.f188842c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$e */
    static final class C84482e<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84459p f188843a;

        /* renamed from: b */
        final /* synthetic */ String f188844b;

        /* renamed from: c */
        final /* synthetic */ long f188845c;

        static {
            Covode.recordClassIndex(98447);
        }

        C84482e(AbstractC84459p pVar, String str, long j) {
            this.f188843a = pVar;
            this.f188844b = str;
            this.f188845c = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            AbstractC84459p pVar = this.f188843a;
            if (pVar != null) {
                String str = this.f188844b;
                long currentTimeMillis = System.currentTimeMillis() - this.f188845c;
                if (!(th2 instanceof Exception)) {
                    th2 = null;
                }
                pVar.mo86087a(str, currentTimeMillis, (Exception) th2, (Integer) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$b */
    static final class C84479b<T> implements AbstractC88407af<AbstractC90031ad> {

        /* renamed from: a */
        final /* synthetic */ C84477h f188836a;

        /* renamed from: b */
        final /* synthetic */ Request f188837b;

        static {
            Covode.recordClassIndex(98444);
        }

        C84479b(C84477h hVar, Request request) {
            this.f188836a = hVar;
            this.f188837b = request;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<AbstractC90031ad> adVar) {
            C89219l.m154721d(adVar, "");
            try {
                C90029ac b = ((C90208y) this.f188836a.f188835a.getValue()).mo144767a(this.f188837b).mo144709b();
                C89219l.m154716b(b, "");
                if (b.mo144720a()) {
                    AbstractC90031ad adVar2 = b.f204111g;
                    if (adVar2 != null) {
                        adVar.mo142931a(adVar2);
                    } else {
                        adVar.mo142932a(new Exception("response body null, status code is: " + b.f204107c));
                    }
                } else {
                    adVar.mo142932a(new Exception("status code error, status code is: " + b.f204107c));
                }
            } catch (Exception e) {
                adVar.mo142932a(e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.h$c */
    static final class C84480c<T, R> implements AbstractC88434g<AbstractC90031ad, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84477h f188838a;

        /* renamed from: b */
        final /* synthetic */ String f188839b;

        static {
            Covode.recordClassIndex(98445);
        }

        C84480c(C84477h hVar, String str) {
            this.f188838a = hVar;
            this.f188839b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C89391z apply(AbstractC90031ad adVar) {
            MethodCollector.m26663i(5489);
            AbstractC90031ad adVar2 = adVar;
            C89219l.m154721d(adVar2, "");
            InputStream byteStream = adVar2.byteStream();
            C89219l.m154716b(byteStream, "");
            File file = new File(this.f188839b);
            AbstractC90149a.f204692a.mo144936b(file).close();
            try {
                InputStream inputStream = byteStream;
                if (file.exists()) {
                    C84477h.m145311a(file);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            C89146c.m154636a(fileOutputStream, null);
                            C89146c.m154636a(byteStream, null);
                            C89391z zVar = C89391z.f203057a;
                            MethodCollector.m26664o(5489);
                            return zVar;
                        }
                    }
                } catch (Throwable th) {
                    C89146c.m154636a(fileOutputStream, th);
                    MethodCollector.m26664o(5489);
                    throw th;
                }
            } catch (Throwable th2) {
                C89146c.m154636a(byteStream, th);
                MethodCollector.m26664o(5489);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    static boolean m145311a(File file) {
        MethodCollector.m26663i(5900);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5900);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5900);
        return delete;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l
    /* renamed from: a */
    public final void mo121393a(String str, String str2, AbstractC84459p pVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88403ab.m153596a((AbstractC88407af) new C84479b(this, new Request.C90016a().mo144691a(str).mo144698a())).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(new C84480c(this, str2)).mo142915a(new C84481d(pVar, str, currentTimeMillis), new C84482e(pVar, str, currentTimeMillis));
    }
}
