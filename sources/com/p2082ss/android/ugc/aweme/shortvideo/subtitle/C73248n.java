package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73260r;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n */
public final class C73248n extends AbstractC73198a {

    /* renamed from: r */
    public static final C73249a f164491r = new C73249a((byte) 0);

    /* renamed from: q */
    public AbstractC88412b f164492q;

    static {
        Covode.recordClassIndex(85966);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: c */
    public final void mo115738c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: d */
    public final void mo115740d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: e */
    public final boolean mo115741e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$a */
    public static final class C73249a {
        static {
            Covode.recordClassIndex(85967);
        }

        private C73249a() {
        }

        public /* synthetic */ C73249a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$e */
    static final class C73254e<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ C73248n f164498a;

        static {
            Covode.recordClassIndex(85972);
        }

        C73254e(C73248n nVar) {
            this.f164498a = nVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$e$b */
        static final class C73256b extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C73256b f164500a = new C73256b();

            static {
                Covode.recordClassIndex(85974);
            }

            C73256b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$e$a */
        static final class C73255a extends AbstractC89220m implements AbstractC89171a<C73230i<C65616g>> {

            /* renamed from: a */
            final /* synthetic */ C73254e f164499a;

            static {
                Covode.recordClassIndex(85973);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73255a(C73254e eVar) {
                super(0);
                this.f164499a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C73230i<C65616g> invoke() {
                this.f164499a.f164498a.mo115729a();
                return C73260r.m129318a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<List<C75313h>> adVar) {
            String str;
            String str2 = "";
            C89219l.m154721d(adVar, str2);
            if (this.f164498a.f164379a == null) {
                this.f164498a.mo115730a(10);
                C73230i a = C73248n.m129233a(new C73255a(this));
                if (!a.mo115765a()) {
                    if (a.f164468c instanceof C65611c) {
                        C73248n nVar = this.f164498a;
                        T t = a.f164468c;
                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                        nVar.f164379a = t.f147851a;
                        if (this.f164498a.f164379a == null) {
                            a = new C73230i(2, "parse upload config failed", null, 4);
                        } else {
                            C73248n nVar2 = this.f164498a;
                            C65614f fVar = nVar2.f164379a;
                            if (fVar == null || (str = fVar.f147888c) == null) {
                                str = str2;
                            }
                            nVar2.mo115734a(str);
                        }
                    } else {
                        a = new C73230i(2, "upload config is empty", null, 4);
                    }
                }
                this.f164498a.mo115731a(10, a.f164466a, a.f164467b);
                if (!adVar.isDisposed()) {
                    if (a.mo115765a()) {
                        this.f164498a.mo115732a(a.f164466a, a.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!C84902i.m145892a(this.f164498a.f164380b)) {
                this.f164498a.mo115730a(20);
                C73230i<String> a2 = this.f164498a.mo115729a().mo115774a(this.f164498a.f164392n, this.f164498a.f164393o, 16000, 128000, 2, C73256b.f164500a);
                this.f164498a.mo115731a(20, a2.f164466a, a2.f164467b);
                if (!adVar.isDisposed()) {
                    if (a2.mo115765a()) {
                        this.f164498a.mo115732a(a2.f164466a, a2.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164498a.f164380b = a2.f164468c;
                    C84911q.m145928d("OldRecognizeCaptionPresenter audioFile " + this.f164498a.f164380b);
                    C73248n nVar3 = this.f164498a;
                    T t2 = a2.f164468c;
                    if (t2 == null) {
                        C89219l.m154715b();
                    }
                    nVar3.f164388j = new File((String) t2).length() / 1024;
                } else {
                    return;
                }
            }
            String str3 = this.f164498a.f164381c;
            if (str3 == null || str3.length() == 0) {
                this.f164498a.mo115730a(30);
                C73248n nVar4 = this.f164498a;
                C65614f fVar2 = nVar4.f164379a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                String str4 = fVar2.f147888c;
                if (str4 == null) {
                    str4 = str2;
                }
                nVar4.mo115734a(str4);
                this.f164498a.mo115729a();
                String str5 = this.f164498a.f164380b;
                if (str5 == null) {
                    str5 = str2;
                }
                C65614f fVar3 = this.f164498a.f164379a;
                if (fVar3 == null) {
                    C89219l.m154715b();
                }
                C73230i<String> a3 = C73260r.m129319a(str5, fVar3);
                this.f164498a.mo115731a(30, a3.f164466a, a3.f164467b);
                if (!adVar.isDisposed()) {
                    if (a3.mo115765a()) {
                        this.f164498a.mo115732a(a3.f164466a, a3.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164498a.f164381c = a3.f164468c;
                    C84911q.m145928d("OldRecognizeCaptionPresenter tosKey " + this.f164498a.f164381c);
                } else {
                    return;
                }
            }
            String str6 = this.f164498a.f164382d;
            if (str6 == null || str6.length() == 0) {
                this.f164498a.mo115730a(40);
                C73260r a4 = this.f164498a.mo115729a();
                String str7 = this.f164498a.f164381c;
                if (str7 == null) {
                    C89219l.m154715b();
                }
                C73230i<String> a5 = a4.mo115776a(str7, this.f164498a.f164386h.getMaxLines(), this.f164498a.f164386h.getWordsPerLine());
                this.f164498a.mo115731a(40, a5.f164466a, a5.f164467b);
                if (!adVar.isDisposed()) {
                    if (a5.mo115765a()) {
                        this.f164498a.mo115732a(a5.f164466a, a5.f164467b);
                        adVar.mo142932a(new RuntimeException());
                        return;
                    }
                    this.f164498a.f164382d = a5.f164468c;
                    C84911q.m145928d("OldRecognizeCaptionPresenter taskId " + this.f164498a.f164382d);
                } else {
                    return;
                }
            }
            if (this.f164498a.f164383e == null) {
                this.f164498a.mo115730a(50);
                C73260r a6 = this.f164498a.mo115729a();
                String str8 = this.f164498a.f164382d;
                if (str8 != null) {
                    str2 = str8;
                }
                C73230i<List<C75313h>> a7 = a6.mo115775a(str2);
                this.f164498a.mo115731a(50, a7.f164466a, a7.f164467b);
                if (!adVar.isDisposed()) {
                    if (a7.mo115765a()) {
                        this.f164498a.mo115732a(a7.f164466a, a7.f164467b);
                        adVar.mo142932a(new C73259q(50, a7.f164466a));
                        return;
                    }
                    this.f164498a.f164383e = a7.f164468c;
                } else {
                    return;
                }
            }
            List<C75313h> list = this.f164498a.f164383e;
            if (list == null) {
                C89219l.m154715b();
            }
            adVar.mo142931a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$b */
    static final class C73250b implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C73248n f164493a;

        static {
            Covode.recordClassIndex(85968);
        }

        C73250b(C73248n nVar) {
            this.f164493a = nVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f164493a.mo115739c(3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: g */
    public final void mo115743g() {
        AbstractC88412b bVar;
        AbstractC88412b bVar2 = this.f164492q;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f164492q) != null) {
            bVar.dispose();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: h */
    public final void mo115744h() {
        C73260r.C73261a.m129327a();
        this.f164388j = 0;
        mo115734a("");
        this.f164379a = null;
        this.f164380b = null;
        this.f164381c = null;
        this.f164382d = null;
        this.f164383e = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: f */
    public final void mo115742f() {
        AbstractC88412b bVar = this.f164492q;
        if (bVar == null || bVar.isDisposed()) {
            this.f164391m = SystemClock.elapsedRealtime();
            mo115733a(new C73208d());
            AbstractC88403ab a = AbstractC88403ab.m153596a((AbstractC88407af) new C73254e(this));
            C89219l.m154716b(a, "");
            AbstractC88412b a2 = a.mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142907a(this.f164385g, TimeUnit.MILLISECONDS).mo142919b((AbstractC88428a) new C73250b(this)).mo142915a(new C73251c(this), new C73252d(this));
            C89219l.m154716b(a2, "");
            this.f164492q = a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$c */
    static final class C73251c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73248n f164494a;

        static {
            Covode.recordClassIndex(85969);
        }

        C73251c(C73248n nVar) {
            this.f164494a = nVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<C75313h> list = (List) obj;
            C73248n nVar = this.f164494a;
            C89219l.m154716b(list, "");
            nVar.mo115736a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.n$d */
    static final class C73252d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73248n f164495a;

        static {
            Covode.recordClassIndex(85970);
        }

        C73252d(C73248n nVar) {
            this.f164495a = nVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73248n.C73252d.C732531 */

                /* renamed from: a */
                final /* synthetic */ C73252d f164496a;

                static {
                    Covode.recordClassIndex(85971);
                }

                {
                    this.f164496a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C73248n nVar = this.f164496a.f164495a;
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    nVar.mo115735a(th);
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
        this.f164387i.f164415l = this.f164387i.f164405b;
        this.f164387i.f164416m = this.f164387i.f164406c;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73248n(VideoPublishEditModel videoPublishEditModel, int i) {
        super(videoPublishEditModel, i);
        C89219l.m154721d(videoPublishEditModel, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a
    /* renamed from: a */
    public final void mo115731a(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("OldRecognizeCaptionPresenter step " + m129234b(i) + " end failedCode: " + i2 + " failedMsg: " + str);
        mo115745i();
    }
}
