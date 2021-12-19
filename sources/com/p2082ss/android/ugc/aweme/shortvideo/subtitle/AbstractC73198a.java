package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65413cw;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.setting.C68076f;
import com.p2082ss.android.ugc.aweme.setting.CaptionConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a */
public abstract class AbstractC73198a {

    /* renamed from: p */
    public static final C73199a f164378p = new C73199a((byte) 0);

    /* renamed from: a */
    public C65614f f164379a;

    /* renamed from: b */
    public String f164380b;

    /* renamed from: c */
    public String f164381c;

    /* renamed from: d */
    public String f164382d;

    /* renamed from: e */
    public List<C75313h> f164383e;

    /* renamed from: f */
    public AbstractC73232k f164384f;

    /* renamed from: g */
    public final long f164385g = C65413cw.m117132a();

    /* renamed from: h */
    public final CaptionConfig f164386h;

    /* renamed from: i */
    public C73208d f164387i;

    /* renamed from: j */
    public long f164388j;

    /* renamed from: k */
    public String f164389k;

    /* renamed from: l */
    public volatile long f164390l;

    /* renamed from: m */
    public volatile long f164391m;

    /* renamed from: n */
    public final VideoPublishEditModel f164392n;

    /* renamed from: o */
    public final int f164393o;

    /* renamed from: q */
    private final AbstractC89244h f164394q;

    /* renamed from: r */
    private final AbstractC89244h f164395r;

    static {
        Covode.recordClassIndex(85916);
    }

    /* renamed from: b */
    public static String m129234b(int i) {
        return i != 10 ? i != 20 ? i != 30 ? i != 40 ? i != 50 ? "started_step" : "query_task" : "submit_task" : "upload_audio" : "extract_audio" : "get_auth_key";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C73260r mo115729a() {
        return (C73260r) this.f164394q.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo115730a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo115731a(int i, int i2, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C73205b mo115737b() {
        return (C73205b) this.f164395r.getValue();
    }

    /* renamed from: c */
    public abstract void mo115738c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo115739c(int i);

    /* renamed from: d */
    public abstract void mo115740d();

    /* renamed from: e */
    public abstract boolean mo115741e();

    /* renamed from: f */
    public abstract void mo115742f();

    /* renamed from: g */
    public abstract void mo115743g();

    /* renamed from: h */
    public abstract void mo115744h();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$a */
    public static final class C73199a {
        static {
            Covode.recordClassIndex(85917);
        }

        private C73199a() {
        }

        public /* synthetic */ C73199a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$b */
    static final class C73200b extends AbstractC89220m implements AbstractC89171a<C73205b> {

        /* renamed from: a */
        public static final C73200b f164396a = new C73200b();

        static {
            Covode.recordClassIndex(85918);
        }

        C73200b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73205b invoke() {
            return new C73205b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$d */
    static final class C73203d extends AbstractC89220m implements AbstractC89171a<C73260r> {

        /* renamed from: a */
        public static final C73203d f164399a = new C73203d();

        static {
            Covode.recordClassIndex(85921);
        }

        C73203d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73260r invoke() {
            return new C73260r();
        }
    }

    /* renamed from: k */
    private long mo115771k() {
        return SystemClock.elapsedRealtime() - this.f164390l;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$c */
    static final class C73201c extends AbstractC89220m implements AbstractC89171a<C73230i<C65614f>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC73198a f164397a;

        static {
            Covode.recordClassIndex(85919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73201c(AbstractC73198a aVar) {
            super(0);
            this.f164397a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.a$c$a */
        public static final class C73202a extends AbstractC89220m implements AbstractC89171a<C73230i<C65616g>> {

            /* renamed from: a */
            final /* synthetic */ C73201c f164398a;

            static {
                Covode.recordClassIndex(85920);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73202a(C73201c cVar) {
                super(0);
                this.f164398a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C73230i<C65616g> invoke() {
                this.f164398a.f164397a.mo115729a();
                return C73260r.m129318a();
            }
        }

        /* renamed from: a */
        public final C73230i<C65614f> invoke() {
            String str;
            C73230i a = AbstractC73198a.m129233a(new C73202a(this));
            if (!a.mo115765a()) {
                if (a.f164468c instanceof C65611c) {
                    this.f164397a.mo115737b().mo115748a(System.currentTimeMillis());
                    C73205b b = this.f164397a.mo115737b();
                    C27910f G = C63244g.m114602a().mo73261G();
                    T t = a.f164468c;
                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                    String b2 = G.mo46674b(t);
                    String str2 = "";
                    C89219l.m154716b(b2, str2);
                    b.mo115749a(b2);
                    AbstractC73198a aVar = this.f164397a;
                    T t2 = a.f164468c;
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                    aVar.f164379a = t2.f147851a;
                    if (this.f164397a.f164379a == null) {
                        a = new C73230i(2, "parse upload config failed", null, 4);
                    } else {
                        AbstractC73198a aVar2 = this.f164397a;
                        C65614f fVar = aVar2.f164379a;
                        if (!(fVar == null || (str = fVar.f147888c) == null)) {
                            str2 = str;
                        }
                        aVar2.mo115734a(str2);
                    }
                } else {
                    a = new C73230i(2, "upload config is empty", null, 4);
                }
            }
            if (this.f164397a.f164379a != null) {
                return new C73230i<>(0, null, this.f164397a.f164379a, 3);
            }
            return new C73230i<>(a.f164466a, a.f164467b, null, 4);
        }
    }

    /* renamed from: l */
    private double m129236l() {
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f164390l);
        double d = (double) this.f164393o;
        Double.isNaN(elapsedRealtime);
        Double.isNaN(d);
        return elapsedRealtime / d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo115745i() {
        int i = this.f164387i.f164419p;
        if (i == 10) {
            this.f164387i.f164405b = mo115771k();
        } else if (i == 20) {
            this.f164387i.f164406c = mo115771k();
            this.f164387i.f164410g = m129236l();
        } else if (i == 30) {
            this.f164387i.f164407d = mo115771k();
            this.f164387i.f164411h = m129236l();
        } else if (i == 40) {
            this.f164387i.f164408e = mo115771k();
            this.f164387i.f164412i = m129236l();
        } else if (i == 50) {
            this.f164387i.f164409f = mo115771k();
            this.f164387i.f164413j = m129236l();
        }
    }

    /* renamed from: j */
    public final C73230i<C65614f> mo115746j() {
        C73201c cVar = new C73201c(this);
        if (System.currentTimeMillis() - mo115737b().f164402a.getLong("authkey_store_time", 0) <= SettingsManager.m29616a().mo25395a("caption_authkey_expire_time", 86400000L)) {
            String string = mo115737b().f164402a.getString("authkey_value", "");
            C89219l.m154716b(string, "");
            if (string.length() > 0) {
                C65611c cVar2 = (C65611c) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(string, C65611c.class);
                C89219l.m154716b(cVar2, "");
                C65614f fVar = cVar2.f147851a;
                this.f164379a = fVar;
                if (fVar != null) {
                    C84911q.m145928d("BaseRecognizeCaptionPresenter get authKey from local");
                    return new C73230i<>(0, "", this.f164379a);
                }
            }
        }
        C73230i<C65614f> a = cVar.invoke();
        C84911q.m145928d("BaseRecognizeCaptionPresenter get authKey from server");
        return a;
    }

    /* renamed from: a */
    public static <T> C73230i<T> m129233a(AbstractC89171a<C73230i<T>> aVar) {
        C73230i<T> invoke;
        C89219l.m154721d(aVar, "");
        int i = 0;
        do {
            invoke = aVar.invoke();
            if (invoke.f164466a == 0) {
                return invoke;
            }
            i++;
        } while (i < 3);
        if (invoke == null) {
            return new C73230i<>(-1, null, null, 6);
        }
        return invoke;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115733a(C73208d dVar) {
        C89219l.m154721d(dVar, "");
        this.f164387i = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115734a(String str) {
        C89219l.m154721d(str, "");
        this.f164389k = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115735a(Throwable th) {
        C89219l.m154721d(th, "");
        C84911q.m145924a(th);
        if (th instanceof TimeoutException) {
            C70968bl.m125252a(this.f164392n, this.f164393o, this.f164391m, "exceed");
            mo115739c(2);
            AbstractC73232k kVar = this.f164384f;
            if (kVar != null) {
                kVar.mo115701L();
            }
        } else if (th instanceof C73259q) {
            C73259q qVar = (C73259q) th;
            if (qVar.getStep() == 50 && qVar.getErrorCode() == 2172) {
                AbstractC73232k kVar2 = this.f164384f;
                if (kVar2 != null) {
                    kVar2.mo115702M();
                }
            } else {
                AbstractC73232k kVar3 = this.f164384f;
                if (kVar3 != null) {
                    kVar3.mo115701L();
                }
            }
            C70968bl.m125252a(this.f164392n, this.f164393o, this.f164391m, "error");
            mo115739c(1);
        } else {
            C70968bl.m125252a(this.f164392n, this.f164393o, this.f164391m, "error");
            mo115739c(1);
            AbstractC73232k kVar4 = this.f164384f;
            if (kVar4 != null) {
                kVar4.mo115701L();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115736a(List<C75313h> list) {
        String str;
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            AbstractC73232k kVar = this.f164384f;
            if (kVar != null) {
                kVar.mo115702M();
            }
            str = "empty";
        } else {
            AbstractC73232k kVar2 = this.f164384f;
            if (kVar2 != null) {
                kVar2.mo115705a(list);
            }
            str = "succeed";
        }
        C70968bl.m125252a(this.f164392n, this.f164393o, this.f164391m, str);
        this.f164387i.f164419p = 0;
        mo115739c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115732a(int i, String str) {
        C89219l.m154721d(str, "");
        this.f164387i.f164420q = i;
        C73208d dVar = this.f164387i;
        C89219l.m154721d(str, "");
        dVar.f164421r = str;
    }

    public AbstractC73198a(VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f164392n = videoPublishEditModel;
        this.f164393o = i;
        CaptionConfig a = C68076f.m120375a();
        this.f164386h = a == null ? new CaptionConfig(80, 1) : a;
        this.f164394q = C89250i.m154773a((AbstractC89171a) C73203d.f164399a);
        this.f164387i = new C73208d();
        this.f164389k = "";
        this.f164395r = C89250i.m154773a((AbstractC89171a) C73200b.f164396a);
    }
}
