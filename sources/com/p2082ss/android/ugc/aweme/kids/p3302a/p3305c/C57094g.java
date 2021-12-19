package com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.p3311a.C57131a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.c.g */
public final class C57094g implements AbstractC57086b {

    /* renamed from: q */
    public static final C57095a f129981q = new C57095a((byte) 0);

    /* renamed from: b */
    public final Context f129982b;

    /* renamed from: c */
    public final String f129983c;

    /* renamed from: d */
    final String f129984d;

    /* renamed from: e */
    public final String f129985e;

    /* renamed from: f */
    public final boolean f129986f;

    /* renamed from: g */
    public final AbstractC57088c f129987g;

    /* renamed from: h */
    public boolean f129988h;

    /* renamed from: i */
    public long f129989i;

    /* renamed from: j */
    public C57093f f129990j;

    /* renamed from: k */
    public final MusicModel f129991k;

    /* renamed from: l */
    public final AbstractC57123a f129992l;

    /* renamed from: m */
    public final CountDownLatch f129993m;

    /* renamed from: n */
    public boolean f129994n;

    /* renamed from: o */
    public String f129995o;

    /* renamed from: p */
    public int f129996p;

    /* renamed from: r */
    private final AbstractC89244h f129997r;

    /* renamed from: s */
    private final AbstractC89244h f129998s;

    /* renamed from: t */
    private final AbstractC89244h f129999t;

    /* renamed from: u */
    private final boolean f130000u;

    static {
        Covode.recordClassIndex(66988);
    }

    /* renamed from: c */
    public final IExternalService mo94252c() {
        return (IExternalService) this.f129997r.getValue();
    }

    /* renamed from: d */
    public final IAVPerformance mo94253d() {
        return (IAVPerformance) this.f129998s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$a */
    public static final class C57095a {
        static {
            Covode.recordClassIndex(66989);
        }

        private C57095a() {
        }

        public /* synthetic */ C57095a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$d */
    static final class C57100d extends AbstractC89220m implements AbstractC89171a<IExternalService> {

        /* renamed from: a */
        public static final C57100d f130009a = new C57100d();

        static {
            Covode.recordClassIndex(66994);
        }

        C57100d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.m113114a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$b */
    static final class C57096b extends AbstractC89220m implements AbstractC89171a<IAVPerformance> {

        /* renamed from: a */
        final /* synthetic */ C57094g f130001a;

        static {
            Covode.recordClassIndex(66990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57096b(C57094g gVar) {
            super(0);
            this.f130001a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVPerformance invoke() {
            return this.f130001a.mo94252c().provideAVPerformance();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$e */
    public static final class CallableC57101e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57094g f130010a;

        /* renamed from: b */
        final /* synthetic */ boolean f130011b;

        static {
            Covode.recordClassIndex(66995);
        }

        CallableC57101e(C57094g gVar, boolean z) {
            this.f130010a = gVar;
            this.f130011b = z;
        }

        /* renamed from: a */
        private static boolean m103475a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (this.f130010a.f129994n) {
                if (this.f130011b) {
                    i = R.string.b8k;
                } else {
                    i = R.string.d_z;
                }
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m103475a();
                }
                if (!C58029j.f132256h) {
                    i = R.string.dcq;
                }
                new C79459a(this.f130010a.f129982b).mo123050a(i).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$f */
    static final class C57102f extends AbstractC89220m implements AbstractC89171a<ITakeInSameOptimize> {

        /* renamed from: a */
        final /* synthetic */ C57094g f130012a;

        static {
            Covode.recordClassIndex(66996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57102f(C57094g gVar) {
            super(0);
            this.f130012a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ITakeInSameOptimize invoke() {
            return this.f130012a.mo94252c().provideTakeInSameOptimize();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57086b
    /* renamed from: a */
    public final void mo94242a() {
        this.f129987g.mo94244a();
        this.f129990j = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$c */
    public static final class C57097c implements AbstractC57123a {

        /* renamed from: a */
        final /* synthetic */ C57094g f130002a;

        static {
            Covode.recordClassIndex(66991);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: b */
        public final void mo94232b() {
            C57093f fVar = this.f130002a.f129990j;
            if (fVar != null) {
                String str = this.f130002a.f129983c;
                C89219l.m154716b(str, "");
                fVar.mo94248b(str, this.f130002a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94228a() {
            C57093f fVar = this.f130002a.f129990j;
            if (fVar != null) {
                String str = this.f130002a.f129983c;
                C89219l.m154716b(str, "");
                fVar.mo94247a(str, this.f130002a);
            }
            C73991bj.m130128a("Download Music start, id: " + this.f130002a.f129983c + " time: " + System.currentTimeMillis());
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$c$a */
        public static final class C57098a implements IAVInfoService.IGetInfoCallback<Integer> {

            /* renamed from: a */
            final /* synthetic */ C57097c f130003a;

            /* renamed from: b */
            final /* synthetic */ long f130004b;

            /* renamed from: c */
            final /* synthetic */ String f130005c;

            /* renamed from: d */
            final /* synthetic */ long f130006d;

            /* renamed from: e */
            final /* synthetic */ long f130007e;

            static {
                Covode.recordClassIndex(66992);
            }

            /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$c$a$a */
            static final class C57099a extends AbstractC89220m implements AbstractC89172b<MusicWaveBean, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C57098a f130008a;

                static {
                    Covode.recordClassIndex(66993);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C57099a(C57098a aVar) {
                    super(1);
                    this.f130008a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(MusicWaveBean musicWaveBean) {
                    mo94254a(musicWaveBean);
                    return C89391z.f203057a;
                }

                /* renamed from: a */
                public final void mo94254a(MusicWaveBean musicWaveBean) {
                    this.f130008a.f130003a.f130002a.mo94253d().step("av_music_download", "audio2wavebean");
                    CountDownLatch countDownLatch = this.f130008a.f130003a.f130002a.f129993m;
                    if (countDownLatch != null) {
                        try {
                            Boolean.valueOf(countDownLatch.await(1500, TimeUnit.MILLISECONDS));
                        } catch (Exception e) {
                            C73991bj.m130131b("Download Music, countDownLatch await error: ".concat(String.valueOf(e)));
                        }
                    }
                    this.f130008a.f130003a.f130002a.mo94253d().step("av_music_download", "await countDownLatch");
                    C73991bj.m130128a("Download Music get wave data duration: " + (System.currentTimeMillis() - this.f130008a.f130007e) + " currentTime: " + System.currentTimeMillis());
                    if (this.f130008a.f130003a.f130002a.f129986f) {
                        this.f130008a.f130003a.f130002a.f129992l.mo94229a(100);
                    }
                    this.f130008a.f130003a.f130002a.mo94253d().end("av_music_download", "fetch end");
                    C57093f fVar = this.f130008a.f130003a.f130002a.f129990j;
                    if (fVar != null) {
                        String str = this.f130008a.f130003a.f130002a.f129983c;
                        C89219l.m154716b(str, "");
                        fVar.mo94248b(str, this.f130008a.f130003a.f130002a);
                    }
                    this.f130008a.f130003a.f130002a.f129992l.mo94231a(this.f130008a.f130005c, musicWaveBean);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Integer num) {
                double d;
                int intValue = num.intValue();
                this.f130003a.f130002a.mo94253d().step("av_music_download", "music audioLegal");
                if (intValue < 0) {
                    this.f130003a.f130002a.mo94251a(false);
                    this.f130003a.f130002a.mo94250a((Integer) -2, "", "", intValue, this.f130004b, C80313cs.m139235d(this.f130005c));
                    this.f130003a.f130002a.f129992l.mo94230a(this.f130003a.f130002a.mo94249a((Integer) -2));
                    return;
                }
                C57094g gVar = this.f130003a.f130002a;
                long j = this.f130006d;
                long j2 = this.f130004b;
                String str = gVar.f129984d;
                boolean isNeedSetCookie = gVar.f129991k.isNeedSetCookie();
                String str2 = gVar.f129995o;
                boolean z = gVar.f129988h;
                if (j == 0) {
                    d = 0.0d;
                } else {
                    d = (double) (j2 / j);
                }
                C12290b.m22060a("aweme_music_download_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(j)).mo59974a("downloadStrategy", (Integer) 3).mo59972a("speed", Double.valueOf(d)).mo59975a("size", Long.valueOf(j2)).mo59976a("fileUri", "").mo59976a("fileUrlList", str).mo59976a("hostname", C57147c.m103542a("")).mo59971a("is_private", Boolean.valueOf(isNeedSetCookie)).mo59971a("isUseTTPlayer", (Boolean) false).mo59976a("trace", str2).mo59971a("isHitCache", Boolean.valueOf(z)).mo59977a());
                C51423a.m95787a(gVar.f129995o + ", MusicDownloadSuccess: musicId=" + gVar.f129983c + ',' + " url=" + gVar.f129984d + ',' + " curUrl=" + "" + " isPrivate=" + gVar.f129991k.isNeedSetCookie());
                new C57099a(this).mo94254a(null);
            }

            C57098a(C57097c cVar, long j, String str, long j2, long j3) {
                this.f130003a = cVar;
                this.f130004b = j;
                this.f130005c = str;
                this.f130006d = j2;
                this.f130007e = j3;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C57097c(C57094g gVar) {
            this.f130002a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94229a(int i) {
            if (!this.f130002a.f129986f) {
                this.f130002a.f129992l.mo94229a(i);
            } else if (i > 99) {
                this.f130002a.f129992l.mo94229a(99);
            } else {
                this.f130002a.f129992l.mo94229a(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94230a(C57154a aVar) {
            boolean z;
            C89219l.m154721d(aVar, "");
            C57094g gVar = this.f130002a;
            if (aVar == null || !(aVar.getErrorCode() == 1006 || aVar.getErrorCode() == 1007)) {
                z = false;
            } else {
                z = true;
            }
            gVar.mo94251a(z);
            C57094g.m103461a(this.f130002a, Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg(), aVar.getErrorUrl(), (String) null, 56);
            this.f130002a.f129992l.mo94230a(this.f130002a.mo94249a(Integer.valueOf(aVar.getErrorCode())));
            C57093f fVar = this.f130002a.f129990j;
            if (fVar != null) {
                String str = this.f130002a.f129983c;
                C89219l.m154716b(str, "");
                fVar.mo94248b(str, this.f130002a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94231a(String str, MusicWaveBean musicWaveBean) {
            long j;
            C89219l.m154721d(str, "");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f130002a.f129989i < 0) {
                j = -1;
            } else {
                j = currentTimeMillis - this.f130002a.f129989i;
            }
            this.f130002a.mo94253d().step("av_music_download", "fetch onSuccess");
            C73991bj.m130128a("Download Music onsuccess, id: " + this.f130002a.f129983c + " ，duration: " + j);
            if (!C80720e.m139927b(str)) {
                this.f130002a.mo94251a(false);
                C57094g.m103461a(this.f130002a, (Integer) 1063, "file not exist", (String) null, (String) null, 60);
                this.f130002a.f129992l.mo94230a(this.f130002a.mo94249a((Integer) 1063));
                return;
            }
            this.f130002a.mo94252c().abilityService().infoService().audioLegal(str, this.f130002a.f129996p, new C57098a(this, C57094g.m103460a(str), str, j, currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57086b
    /* renamed from: b */
    public final void mo94243b() {
        AbstractC57088c cVar = this.f129987g;
        String str = this.f129983c;
        C89219l.m154716b(str, "");
        cVar.mo94246a(str);
        this.f129992l.mo94232b();
        String str2 = this.f129995o;
        String str3 = this.f129983c;
        C12290b.m22060a("aweme_music_download_error_rate", 1, new C33743c().mo59976a("trace", str2).mo59976a("music_id", str3).mo59976a("fileUrlList", this.f129984d).mo59974a("downloadStrategy", (Integer) 3).mo59971a("is_private", Boolean.valueOf(this.f129991k.isNeedSetCookie())).mo59971a("isUseTTPlayer", (Boolean) false).mo59971a("isHitCache", Boolean.valueOf(this.f129988h)).mo59977a());
    }

    /* renamed from: a */
    public static long m103460a(String str) {
        try {
            return new File(str).length();
        } catch (Exception e) {
            String str2 = "Download Music, getFileSize fail " + e.getMessage();
            C89219l.m154721d(str2, "");
            C51423a.m95791b(6, "Music", str2);
            return -1;
        }
    }

    /* renamed from: a */
    public final C57154a mo94249a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        return new C57154a(i, this.f129982b.getString(R.string.d_z));
    }

    /* renamed from: a */
    public final void mo94251a(boolean z) {
        C1731i.m5640b(new CallableC57101e(this, z), C1731i.f5564c);
    }

    /* renamed from: a */
    static /* synthetic */ void m103461a(C57094g gVar, Integer num, String str, String str2, String str3, int i) {
        String str4 = str2;
        String str5 = "";
        if ((i & 4) != 0) {
            str4 = str5;
        }
        if ((i & 32) == 0) {
            str5 = str3;
        }
        gVar.mo94250a(num, str, str4, 0, 0, str5);
    }

    /* renamed from: a */
    public final void mo94250a(Integer num, String str, String str2, int i, long j, String str3) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        String str4 = this.f129983c;
        String str5 = this.f129984d;
        String str6 = this.f129995o;
        boolean isNeedSetCookie = this.f129991k.isNeedSetCookie();
        boolean z = this.f129988h;
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C57131a.m103506a();
        }
        boolean z2 = C58029j.f132256h;
        if (z2) {
            C12290b.m22060a("aweme_music_download_error_rate", i2, new C33743c().mo59976a("hostname", C57147c.m103542a(str2)).mo59976a("trace", str6).mo59976a("music_id", str4).mo59976a("fileUrlList", str5).mo59974a("downloadStrategy", (Integer) 3).mo59976a("fileMagic", str3).mo59976a("code", String.valueOf(i)).mo59975a("size", Long.valueOf(j)).mo59971a("is_private", Boolean.valueOf(isNeedSetCookie)).mo59971a("isUseTTPlayer", (Boolean) false).mo59976a("errorDesc", str).mo59971a("isHitCache", Boolean.valueOf(z)).mo59977a());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str2);
            jSONObject.put("is_network_available", z2);
            jSONObject.put("isUseTTPlayer", false);
            jSONObject.put("isHitCache", z);
            C34611o.m70671b("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C51423a.m95787a(this.f129995o + ", MusicDownloadError: errocode=" + num + "errorMsg=" + str + "musicId=" + this.f129983c + ',' + " url=" + this.f129984d + ',' + " curUrl=" + str2 + " isPrivate=" + this.f129991k.isNeedSetCookie() + " fileMagic=" + str3 + " fileSize=" + j + " veErrorCode=" + i);
    }

    public C57094g(Context context, MusicModel musicModel, AbstractC57123a aVar, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i) {
        boolean z3;
        C89219l.m154721d(context, "");
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(aVar, "");
        this.f129991k = musicModel;
        this.f129992l = aVar;
        this.f129993m = countDownLatch;
        this.f130000u = z;
        this.f129994n = z2;
        this.f129995o = str;
        this.f129996p = i;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f129982b = applicationContext;
        this.f129983c = musicModel.getMusicId();
        this.f129984d = C57092e.m103455a(musicModel.getUrl());
        C57166d a = C57166d.m103601a();
        C89219l.m154716b(a, "");
        this.f129985e = a.mo94368b();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f129986f = z3;
        this.f129987g = new C57103h((byte) 0);
        this.f129989i = -1;
        this.f129997r = C89250i.m154773a((AbstractC89171a) C57100d.f130009a);
        this.f129998s = C89250i.m154773a((AbstractC89171a) new C57096b(this));
        this.f129999t = C89250i.m154773a((AbstractC89171a) new C57102f(this));
    }
}
