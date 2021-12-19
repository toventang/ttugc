package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65495r;
import com.p2082ss.android.ugc.aweme.property.C65496s;
import com.p2082ss.android.ugc.aweme.property.C65497t;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3812e.C70995a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73260r;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m */
public final class C73234m extends AbstractC73198a {

    /* renamed from: u */
    public static final C73235a f164471u = new C73235a((byte) 0);

    /* renamed from: q */
    public AbstractC88412b f164472q;

    /* renamed from: r */
    public AbstractC88412b f164473r;

    /* renamed from: s */
    public final C70995a f164474s = new C70995a();

    /* renamed from: t */
    public volatile boolean f164475t;

    static {
        Covode.recordClassIndex(85952);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: h */
    public final void mo115744h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$a */
    public static final class C73235a {
        static {
            Covode.recordClassIndex(85953);
        }

        private C73235a() {
        }

        public /* synthetic */ C73235a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$g */
    public static final class C73242g implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C73234m f164482a;

        static {
            Covode.recordClassIndex(85960);
        }

        C73242g(C73234m mVar) {
            this.f164482a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f164482a.mo115739c(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$e */
    static final class C73239e<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C73234m f164479a;

        static {
            Covode.recordClassIndex(85957);
        }

        C73239e(C73234m mVar) {
            this.f164479a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$e$a */
        static final class C73240a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ AbstractC88405ad f164480a;

            static {
                Covode.recordClassIndex(85958);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73240a(AbstractC88405ad adVar) {
                super(0);
                this.f164480a = adVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                AbstractC88405ad adVar = this.f164480a;
                C89219l.m154716b(adVar, "");
                return Boolean.valueOf(adVar.isDisposed());
            }
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<String> adVar) {
            C89219l.m154721d(adVar, "");
            if (!C84902i.m145892a(this.f164479a.f164380b)) {
                this.f164479a.mo115730a(20);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C73230i<String> a = this.f164479a.mo115729a().mo115774a(this.f164479a.f164392n, this.f164479a.f164393o, C65497t.m117221a(), C65495r.m117219a(), C65496s.m117220a(), new C73240a(adVar));
                this.f164479a.f164387i.f164406c = SystemClock.elapsedRealtime() - elapsedRealtime;
                C73208d dVar = this.f164479a.f164387i;
                double d = (double) this.f164479a.f164387i.f164406c;
                double d2 = (double) this.f164479a.f164393o;
                Double.isNaN(d);
                Double.isNaN(d2);
                dVar.f164410g = d / d2;
                C84911q.m145928d("NewRecognizeCaptionPresenter step " + C73234m.m129234b(20) + " end failedCode: " + a.f164466a + " failedMsg " + a.f164467b);
                C84911q.m145928d("NewRecognizeCaptionPresenter preprocess extractAudio " + ((String) a.f164468c));
                if (this.f164479a.f164475t) {
                    this.f164479a.f164387i.f164416m = SystemClock.elapsedRealtime() - this.f164479a.f164391m;
                }
                if (!adVar.isDisposed()) {
                    if (a.mo115765a()) {
                        this.f164479a.f164387i.f164419p = 20;
                        this.f164479a.mo115732a(a.f164466a, a.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164479a.f164380b = a.f164468c;
                    C73234m mVar = this.f164479a;
                    T t = a.f164468c;
                    if (t == null) {
                        C89219l.m154715b();
                    }
                    mVar.f164388j = new File((String) t).length() / 1024;
                    this.f164479a.f164474s.getData(this.f164479a.f164392n);
                    adVar.mo142931a((String) a.f164468c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$j */
    public static final class C73246j<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C73234m f164487a;

        /* renamed from: b */
        final /* synthetic */ boolean f164488b;

        /* renamed from: c */
        final /* synthetic */ boolean f164489c;

        static {
            Covode.recordClassIndex(85964);
        }

        C73246j(C73234m mVar, boolean z, boolean z2) {
            this.f164487a = mVar;
            this.f164488b = z;
            this.f164489c = z2;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$j$a */
        static final class C73247a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ AbstractC88405ad f164490a;

            static {
                Covode.recordClassIndex(85965);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73247a(AbstractC88405ad adVar) {
                super(0);
                this.f164490a = adVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                AbstractC88405ad adVar = this.f164490a;
                C89219l.m154716b(adVar, "");
                return Boolean.valueOf(adVar.isDisposed());
            }
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<List<C75313h>> adVar) {
            String str = "";
            C89219l.m154721d(adVar, str);
            if (this.f164487a.f164379a == null) {
                if (!this.f164488b) {
                    adVar.mo142932a(new RuntimeException());
                    return;
                }
                this.f164487a.mo115730a(10);
                C73230i<C65614f> j = this.f164487a.mo115746j();
                this.f164487a.mo115731a(10, j.f164466a, j.f164467b);
                this.f164487a.f164387i.f164415l = this.f164487a.f164387i.f164405b;
                if (!adVar.isDisposed()) {
                    if (j.mo115765a()) {
                        this.f164487a.mo115732a(j.f164466a, j.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!C84902i.m145892a(this.f164487a.f164380b)) {
                if (!this.f164489c) {
                    adVar.mo142932a(new RuntimeException());
                    return;
                }
                this.f164487a.mo115730a(20);
                C73230i<String> a = this.f164487a.mo115729a().mo115774a(this.f164487a.f164392n, this.f164487a.f164393o, C65497t.m117221a(), C65495r.m117219a(), C65496s.m117220a(), new C73247a(adVar));
                this.f164487a.mo115731a(20, a.f164466a, a.f164467b);
                this.f164487a.f164387i.f164416m = this.f164487a.f164387i.f164406c;
                if (!adVar.isDisposed()) {
                    if (a.mo115765a()) {
                        this.f164487a.mo115732a(a.f164466a, a.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164487a.f164380b = a.f164468c;
                    C84911q.m145928d("NewRecognizeCaptionPresenter audioFile " + this.f164487a.f164380b);
                    C73234m mVar = this.f164487a;
                    T t = a.f164468c;
                    if (t == null) {
                        C89219l.m154715b();
                    }
                    mVar.f164388j = new File((String) t).length() / 1024;
                    this.f164487a.f164474s.getData(this.f164487a.f164392n);
                } else {
                    return;
                }
            }
            String str2 = this.f164487a.f164381c;
            if (str2 == null || str2.length() == 0) {
                this.f164487a.mo115730a(30);
                C73234m mVar2 = this.f164487a;
                C65614f fVar = mVar2.f164379a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                String str3 = fVar.f147888c;
                if (str3 == null) {
                    str3 = str;
                }
                mVar2.mo115734a(str3);
                this.f164487a.mo115729a();
                String str4 = this.f164487a.f164380b;
                if (str4 == null) {
                    str4 = str;
                }
                C65614f fVar2 = this.f164487a.f164379a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                C73230i<String> a2 = C73260r.m129319a(str4, fVar2);
                this.f164487a.mo115731a(30, a2.f164466a, a2.f164467b);
                if (!adVar.isDisposed()) {
                    if (a2.mo115765a()) {
                        this.f164487a.mo115732a(a2.f164466a, a2.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164487a.f164381c = a2.f164468c;
                    C84911q.m145928d("NewRecognizeCaptionPresenter tosKey " + this.f164487a.f164381c);
                } else {
                    return;
                }
            }
            String str5 = this.f164487a.f164382d;
            if (str5 == null || str5.length() == 0) {
                this.f164487a.mo115730a(40);
                C73260r a3 = this.f164487a.mo115729a();
                String str6 = this.f164487a.f164381c;
                if (str6 == null) {
                    C89219l.m154715b();
                }
                C73230i<String> a4 = a3.mo115776a(str6, this.f164487a.f164386h.getMaxLines(), this.f164487a.f164386h.getWordsPerLine());
                this.f164487a.mo115731a(40, a4.f164466a, a4.f164467b);
                if (!adVar.isDisposed()) {
                    if (a4.mo115765a()) {
                        this.f164487a.mo115732a(a4.f164466a, a4.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164487a.f164382d = a4.f164468c;
                    C84911q.m145928d("NewRecognizeCaptionPresenter taskId " + this.f164487a.f164382d);
                } else {
                    return;
                }
            }
            if (this.f164487a.f164383e == null) {
                this.f164487a.mo115730a(50);
                C73260r a5 = this.f164487a.mo115729a();
                String str7 = this.f164487a.f164382d;
                if (str7 != null) {
                    str = str7;
                }
                C73230i<List<C75313h>> a6 = a5.mo115775a(str);
                this.f164487a.mo115731a(50, a6.f164466a, a6.f164467b);
                if (!adVar.isDisposed()) {
                    if (a6.mo115765a()) {
                        this.f164487a.mo115732a(a6.f164466a, a6.f164467b);
                        adVar.mo142932a(new C73259q(50, a6.f164466a));
                        return;
                    }
                    this.f164487a.f164383e = a6.f164468c;
                } else {
                    return;
                }
            }
            List<C75313h> list = this.f164487a.f164383e;
            if (list == null) {
                C89219l.m154715b();
            }
            adVar.mo142931a(list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: e */
    public final boolean mo115741e() {
        return this.f164474s.hasChanged(this.f164392n);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: f */
    public final void mo115742f() {
        this.f164475t = true;
        this.f164391m = SystemClock.elapsedRealtime();
        AbstractC88412b bVar = this.f164472q;
        if (bVar == null || bVar.isDisposed()) {
            m129292a(this.f164385g, true, true);
            this.f164475t = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: g */
    public final void mo115743g() {
        AbstractC88412b bVar = this.f164473r;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = this.f164473r;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            mo115729a().mo115777b();
        }
    }

    /* renamed from: k */
    public final void mo115771k() {
        if (this.f164475t) {
            m129292a(Math.min(this.f164385g, (this.f164385g - SystemClock.elapsedRealtime()) + this.f164391m), false, false);
            this.f164475t = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: d */
    public final void mo115740d() {
        AbstractC88412b bVar = this.f164472q;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = this.f164472q;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            mo115729a().mo115777b();
        }
        C73260r.C73261a.m129327a();
        this.f164388j = 0;
        mo115734a("");
        this.f164380b = null;
        this.f164381c = null;
        this.f164382d = null;
        this.f164383e = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: c */
    public final void mo115738c() {
        AbstractC88412b bVar = this.f164472q;
        if (bVar == null || bVar.isDisposed()) {
            mo115733a(new C73208d());
            AbstractC88403ab b = AbstractC88403ab.m153596a((AbstractC88407af) new C73241f(this)).mo142918b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            AbstractC88403ab b2 = AbstractC88403ab.m153596a((AbstractC88407af) new C73239e(this)).mo142918b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b2, "");
            this.f164472q = AbstractC88403ab.m153598a(b, b2, C73236b.f164476a).mo142907a(this.f164385g, TimeUnit.MILLISECONDS).mo142915a(new C73237c(this), new C73238d(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$c */
    static final class C73237c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73234m f164477a;

        static {
            Covode.recordClassIndex(85955);
        }

        C73237c(C73234m mVar) {
            this.f164477a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f164477a.mo115771k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$d */
    static final class C73238d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73234m f164478a;

        static {
            Covode.recordClassIndex(85956);
        }

        C73238d(C73234m mVar) {
            this.f164478a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f164478a.mo115771k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$h */
    public static final class C73243h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73234m f164483a;

        static {
            Covode.recordClassIndex(85961);
        }

        C73243h(C73234m mVar) {
            this.f164483a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<C75313h> list = (List) obj;
            C73234m mVar = this.f164483a;
            C89219l.m154716b(list, "");
            mVar.mo115736a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$i */
    public static final class C73244i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73234m f164484a;

        static {
            Covode.recordClassIndex(85962);
        }

        C73244i(C73234m mVar) {
            this.f164484a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            C80558hx.m139642a(0, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73234m.C73244i.C732451 */

                /* renamed from: a */
                final /* synthetic */ C73244i f164485a;

                static {
                    Covode.recordClassIndex(85963);
                }

                {
                    this.f164485a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C73234m mVar = this.f164485a.f164484a;
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    mVar.mo115735a(th);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: a */
    public final void mo115730a(int i) {
        this.f164390l = SystemClock.elapsedRealtime();
        this.f164387i.f164419p = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$f */
    static final class C73241f<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C73234m f164481a;

        static {
            Covode.recordClassIndex(85959);
        }

        C73241f(C73234m mVar) {
            this.f164481a = mVar;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<C65614f> adVar) {
            C89219l.m154721d(adVar, "");
            if (this.f164481a.f164379a == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C73230i<C65614f> j = this.f164481a.mo115746j();
                this.f164481a.f164387i.f164405b = SystemClock.elapsedRealtime() - elapsedRealtime;
                C84911q.m145928d("NewRecognizeCaptionPresenter step " + C73234m.m129234b(10) + " end failedCode: " + j.f164466a + " failedMsg " + j.f164467b);
                C84911q.m145928d("NewRecognizeCaptionPresenter preprocess getAuthKey");
                if (this.f164481a.f164475t) {
                    this.f164481a.f164387i.f164415l = SystemClock.elapsedRealtime() - this.f164481a.f164391m;
                }
                if (!adVar.isDisposed()) {
                    if (j.mo115765a()) {
                        this.f164481a.f164387i.f164419p = 10;
                        this.f164481a.mo115732a(j.f164466a, j.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164481a.f164379a = j.f164468c;
                    T t = j.f164468c;
                    if (t == null) {
                        C89219l.m154715b();
                    }
                    adVar.mo142931a((C65614f) t);
                    return;
                }
                return;
            }
            C65614f fVar = this.f164481a.f164379a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            adVar.mo142931a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: c */
    public final void mo115739c(int i) {
        this.f164387i.f164404a = SystemClock.elapsedRealtime() - this.f164391m;
        C73208d dVar = this.f164387i;
        double d = (double) this.f164387i.f164404a;
        double d2 = (double) this.f164393o;
        Double.isNaN(d);
        Double.isNaN(d2);
        dVar.f164414k = d / d2;
        C73208d dVar2 = this.f164387i;
        String str = this.f164381c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        dVar2.mo115750a(str);
        C73208d dVar3 = this.f164387i;
        String str3 = this.f164382d;
        if (str3 != null) {
            str2 = str3;
        }
        dVar3.mo115751b(str2);
        this.f164387i.f164422s = this.f164388j;
        this.f164387i.mo115752c(this.f164389k);
        C73210e.m129263a(i, this.f164387i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.m$b */
    static final class C73236b<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C73236b f164476a = new C73236b();

        static {
            Covode.recordClassIndex(85954);
        }

        C73236b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(obj2, "");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73234m(VideoPublishEditModel videoPublishEditModel, int i) {
        super(videoPublishEditModel, i);
        C89219l.m154721d(videoPublishEditModel, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: a */
    public final void mo115731a(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("NewRecognizeCaptionPresenter step " + m129234b(i) + " end failedCode: " + i2 + " failedMsg " + str);
        mo115745i();
    }

    /* renamed from: a */
    private final void m129292a(long j, boolean z, boolean z2) {
        AbstractC88403ab a = AbstractC88403ab.m153596a((AbstractC88407af) new C73246j(this, z, z2));
        C89219l.m154716b(a, "");
        this.f164473r = a.mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142907a(j, TimeUnit.MILLISECONDS).mo142919b((AbstractC88428a) new C73242g(this)).mo142915a(new C73243h(this), new C73244i(this));
    }
}
