package com.p2082ss.android.ugc.aweme.music.p3470e;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61134a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61135b;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.settings.C68758v;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84158e;
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

/* renamed from: com.ss.android.ugc.aweme.music.e.g */
public final class C60770g implements AbstractC60753a {

    /* renamed from: q */
    public static final C60771a f138086q = new C60771a((byte) 0);

    /* renamed from: b */
    public final Context f138087b;

    /* renamed from: c */
    public final String f138088c;

    /* renamed from: d */
    public final String f138089d;

    /* renamed from: e */
    public final String f138090e;

    /* renamed from: f */
    public final boolean f138091f;

    /* renamed from: g */
    public final AbstractC60755b f138092g;

    /* renamed from: h */
    public boolean f138093h;

    /* renamed from: i */
    public long f138094i;

    /* renamed from: j */
    public C60769f f138095j;

    /* renamed from: k */
    public final MusicModel f138096k;

    /* renamed from: l */
    public final AbstractC61065b f138097l;

    /* renamed from: m */
    public final CountDownLatch f138098m;

    /* renamed from: n */
    public boolean f138099n;

    /* renamed from: o */
    public String f138100o;

    /* renamed from: p */
    public int f138101p;

    /* renamed from: r */
    private final AbstractC89244h f138102r;

    /* renamed from: s */
    private final AbstractC89244h f138103s;

    /* renamed from: t */
    private final AbstractC89244h f138104t;

    /* renamed from: u */
    private final boolean f138105u;

    static {
        Covode.recordClassIndex(71327);
    }

    /* renamed from: c */
    public final IExternalService mo98189c() {
        return (IExternalService) this.f138102r.getValue();
    }

    /* renamed from: d */
    public final IAVPerformance mo98190d() {
        return (IAVPerformance) this.f138103s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$a */
    public static final class C60771a {
        static {
            Covode.recordClassIndex(71328);
        }

        private C60771a() {
        }

        public /* synthetic */ C60771a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$d */
    static final class C60776d extends AbstractC89220m implements AbstractC89171a<IExternalService> {

        /* renamed from: a */
        public static final C60776d f138114a = new C60776d();

        static {
            Covode.recordClassIndex(71333);
        }

        C60776d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.m113114a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$b */
    static final class C60772b extends AbstractC89220m implements AbstractC89171a<IAVPerformance> {

        /* renamed from: a */
        final /* synthetic */ C60770g f138106a;

        static {
            Covode.recordClassIndex(71329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60772b(C60770g gVar) {
            super(0);
            this.f138106a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVPerformance invoke() {
            return this.f138106a.mo98189c().provideAVPerformance();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.e.g$e */
    public static final class CallableC60777e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60770g f138115a;

        /* renamed from: b */
        final /* synthetic */ boolean f138116b;

        static {
            Covode.recordClassIndex(71334);
        }

        CallableC60777e(C60770g gVar, boolean z) {
            this.f138115a = gVar;
            this.f138116b = z;
        }

        /* renamed from: a */
        private static boolean m110323a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (this.f138115a.f138099n) {
                if (this.f138116b) {
                    i = R.string.b8k;
                } else {
                    i = R.string.d_z;
                }
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m110323a();
                }
                if (!C58029j.f132256h) {
                    i = R.string.dcq;
                }
                new C79459a(this.f138115a.f138087b).mo123050a(i).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$f */
    static final class C60778f extends AbstractC89220m implements AbstractC89171a<ITakeInSameOptimize> {

        /* renamed from: a */
        final /* synthetic */ C60770g f138117a;

        static {
            Covode.recordClassIndex(71335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60778f(C60770g gVar) {
            super(0);
            this.f138117a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ITakeInSameOptimize invoke() {
            return this.f138117a.mo98189c().provideTakeInSameOptimize();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60753a
    /* renamed from: a */
    public final void mo98167a() {
        this.f138092g.mo98172b();
        this.f138095j = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$c */
    public static final class C60773c implements AbstractC61065b {

        /* renamed from: a */
        final /* synthetic */ C60770g f138107a;

        static {
            Covode.recordClassIndex(71330);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69324a() {
            C60769f fVar = this.f138107a.f138095j;
            if (fVar != null) {
                String str = this.f138107a.f138088c;
                C89219l.m154716b(str, "");
                fVar.mo98185b(str, this.f138107a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: b */
        public final void mo69328b() {
            C60769f fVar = this.f138107a.f138095j;
            if (fVar != null) {
                String str = this.f138107a.f138088c;
                C89219l.m154716b(str, "");
                fVar.mo98184a(str, this.f138107a);
            }
            C73991bj.m130128a("Download Music start, id: " + this.f138107a.f138088c + " time: " + System.currentTimeMillis());
        }

        /* renamed from: com.ss.android.ugc.aweme.music.e.g$c$a */
        public static final class C60774a implements IAVInfoService.IGetInfoCallback<Integer> {

            /* renamed from: a */
            final /* synthetic */ C60773c f138108a;

            /* renamed from: b */
            final /* synthetic */ long f138109b;

            /* renamed from: c */
            final /* synthetic */ String f138110c;

            /* renamed from: d */
            final /* synthetic */ long f138111d;

            /* renamed from: e */
            final /* synthetic */ long f138112e;

            static {
                Covode.recordClassIndex(71331);
            }

            /* renamed from: com.ss.android.ugc.aweme.music.e.g$c$a$a */
            static final class C60775a extends AbstractC89220m implements AbstractC89172b<MusicWaveBean, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C60774a f138113a;

                static {
                    Covode.recordClassIndex(71332);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C60775a(C60774a aVar) {
                    super(1);
                    this.f138113a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(MusicWaveBean musicWaveBean) {
                    mo98191a(musicWaveBean);
                    return C89391z.f203057a;
                }

                /* renamed from: a */
                public final void mo98191a(MusicWaveBean musicWaveBean) {
                    this.f138113a.f138108a.f138107a.mo98190d().step("av_music_download", "audio2wavebean");
                    CountDownLatch countDownLatch = this.f138113a.f138108a.f138107a.f138098m;
                    if (countDownLatch != null) {
                        try {
                            Boolean.valueOf(countDownLatch.await(1500, TimeUnit.MILLISECONDS));
                        } catch (Exception e) {
                            C73991bj.m130131b("Download Music, countDownLatch await error: ".concat(String.valueOf(e)));
                        }
                    }
                    this.f138113a.f138108a.f138107a.mo98190d().step("av_music_download", "await countDownLatch");
                    C73991bj.m130128a("Download Music get wave data duration: " + (System.currentTimeMillis() - this.f138113a.f138112e) + " currentTime: " + System.currentTimeMillis());
                    if (this.f138113a.f138108a.f138107a.f138091f) {
                        this.f138113a.f138108a.f138107a.f138097l.mo69325a(100);
                    }
                    this.f138113a.f138108a.f138107a.mo98190d().end("av_music_download", "fetch end");
                    C60769f fVar = this.f138113a.f138108a.f138107a.f138095j;
                    if (fVar != null) {
                        String str = this.f138113a.f138108a.f138107a.f138088c;
                        C89219l.m154716b(str, "");
                        fVar.mo98185b(str, this.f138113a.f138108a.f138107a);
                    }
                    this.f138113a.f138108a.f138107a.f138097l.mo69327a(this.f138113a.f138110c, musicWaveBean);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Integer num) {
                double d;
                int intValue = num.intValue();
                this.f138108a.f138107a.mo98190d().step("av_music_download", "music audioLegal");
                if (intValue < 0) {
                    this.f138108a.f138107a.mo98188a(false);
                    this.f138108a.f138107a.mo98187a((Integer) -2, "", "", intValue, this.f138109b, C80313cs.m139235d(this.f138110c));
                    this.f138108a.f138107a.f138097l.mo69326a(this.f138108a.f138107a.mo98186a((Integer) -2));
                    return;
                }
                C60770g gVar = this.f138108a.f138107a;
                long j = this.f138111d;
                long j2 = this.f138109b;
                String str = gVar.f138089d;
                boolean isNeedSetCookie = gVar.f138096k.isNeedSetCookie();
                String str2 = gVar.f138100o;
                boolean z = gVar.f138093h;
                if (j == 0) {
                    d = 0.0d;
                } else {
                    d = (double) (j2 / j);
                }
                C12290b.m22060a("aweme_music_download_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(j)).mo59974a("downloadStrategy", Integer.valueOf(MusicService.m81198m().mo69314c())).mo59972a("speed", Double.valueOf(d)).mo59975a("size", Long.valueOf(j2)).mo59976a("fileUri", "").mo59976a("fileUrlList", str).mo59976a("hostname", C60826d.m110424a("")).mo59971a("is_private", Boolean.valueOf(isNeedSetCookie)).mo59971a("isUseTTPlayer", Boolean.valueOf(C68758v.m121190a())).mo59976a("trace", str2).mo59971a("isHitCache", Boolean.valueOf(z)).mo59977a());
                String str3 = gVar.f138088c;
                String str4 = gVar.f138100o;
                String str5 = gVar.f138089d;
                Long valueOf = Long.valueOf(j);
                C33744d a = new C33744d().mo59983a("music_id", str3).mo59983a("enter_from", str4).mo59983a("url", str5).mo59982a("time", valueOf).mo59982a("size", Long.valueOf(j2));
                IMusicService m = MusicService.m81198m();
                C89219l.m154716b(m, "");
                C39162r.m79460a("download_music_succeed", a.mo59980a("download_strategy", m.mo69314c()).mo59982a("is_use_tt_player", Boolean.valueOf(C68758v.m121190a())).f79943a);
                C51423a.m95787a(gVar.f138100o + ", MusicDownloadSuccess: musicId=" + gVar.f138088c + ',' + " url=" + gVar.f138089d + ',' + " curUrl=" + "" + " isPrivate=" + gVar.f138096k.isNeedSetCookie());
                new C60775a(this).mo98191a(null);
            }

            C60774a(C60773c cVar, long j, String str, long j2, long j3) {
                this.f138108a = cVar;
                this.f138109b = j;
                this.f138110c = str;
                this.f138111d = j2;
                this.f138112e = j3;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C60773c(C60770g gVar) {
            this.f138107a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69325a(int i) {
            if (!this.f138107a.f138091f) {
                this.f138107a.f138097l.mo69325a(i);
            } else if (i > 99) {
                this.f138107a.f138097l.mo69325a(99);
            } else {
                this.f138107a.f138097l.mo69325a(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69326a(C84125a aVar) {
            boolean z;
            C89219l.m154721d(aVar, "");
            C60770g gVar = this.f138107a;
            if (aVar == null || !(aVar.getErrorCode() == 1006 || aVar.getErrorCode() == 1007)) {
                z = false;
            } else {
                z = true;
            }
            gVar.mo98188a(z);
            C60770g.m110309a(this.f138107a, Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg(), aVar.getErrorUrl(), (String) null, 56);
            this.f138107a.f138097l.mo69326a(this.f138107a.mo98186a(Integer.valueOf(aVar.getErrorCode())));
            C60769f fVar = this.f138107a.f138095j;
            if (fVar != null) {
                String str = this.f138107a.f138088c;
                C89219l.m154716b(str, "");
                fVar.mo98185b(str, this.f138107a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
            long j;
            C89219l.m154721d(str, "");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f138107a.f138094i < 0) {
                j = -1;
            } else {
                j = currentTimeMillis - this.f138107a.f138094i;
            }
            this.f138107a.mo98190d().step("av_music_download", "fetch onSuccess");
            C73991bj.m130128a("Download Music onsuccess, id: " + this.f138107a.f138088c + " ，duration: " + j + ", musicFile:" + str);
            if (!C80720e.m139927b(str)) {
                this.f138107a.mo98188a(false);
                C60770g.m110309a(this.f138107a, (Integer) 1063, "file not exist", (String) null, (String) null, 60);
                this.f138107a.f138097l.mo69326a(this.f138107a.mo98186a((Integer) 1063));
                return;
            }
            this.f138107a.mo98189c().abilityService().infoService().audioLegal(str, this.f138107a.f138101p, new C60774a(this, C60770g.m110308a(str), str, j, currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60753a
    /* renamed from: b */
    public final void mo98168b() {
        AbstractC60755b bVar = this.f138092g;
        String str = this.f138088c;
        C89219l.m154716b(str, "");
        bVar.mo98171a(str);
        this.f138097l.mo69324a();
        String str2 = this.f138100o;
        String str3 = this.f138088c;
        C12290b.m22060a("aweme_music_download_error_rate", 1, new C33743c().mo59976a("trace", str2).mo59976a("music_id", str3).mo59976a("fileUrlList", this.f138089d).mo59974a("downloadStrategy", Integer.valueOf(MusicService.m81198m().mo69314c())).mo59971a("is_private", Boolean.valueOf(this.f138096k.isNeedSetCookie())).mo59971a("isUseTTPlayer", Boolean.valueOf(C68758v.m121190a())).mo59971a("isHitCache", Boolean.valueOf(this.f138093h)).mo59977a());
    }

    /* renamed from: a */
    public static long m110308a(String str) {
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
    public final C84125a mo98186a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        return new C84125a(i, this.f138087b.getString(R.string.d_z));
    }

    /* renamed from: a */
    public final void mo98188a(boolean z) {
        C1731i.m5640b(new CallableC60777e(this, z), C1731i.f5564c);
    }

    /* renamed from: a */
    static /* synthetic */ void m110309a(C60770g gVar, Integer num, String str, String str2, String str3, int i) {
        String str4 = str2;
        String str5 = "";
        if ((i & 4) != 0) {
            str4 = str5;
        }
        if ((i & 32) == 0) {
            str5 = str3;
        }
        gVar.mo98187a(num, str, str4, 0, 0, str5);
    }

    /* renamed from: a */
    public final void mo98187a(Integer num, String str, String str2, int i, long j, String str3) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        String str4 = this.f138088c;
        String str5 = this.f138089d;
        String str6 = this.f138100o;
        boolean isNeedSetCookie = this.f138096k.isNeedSetCookie();
        boolean z = this.f138093h;
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C61134a.m110748a();
        }
        boolean z2 = C58029j.f132256h;
        if (z2) {
            C12290b.m22060a("aweme_music_download_error_rate", i2, new C33743c().mo59976a("hostname", C60826d.m110424a(str2)).mo59976a("trace", str6).mo59976a("music_id", str4).mo59976a("fileUrlList", str5).mo59974a("downloadStrategy", Integer.valueOf(MusicService.m81198m().mo69314c())).mo59976a("fileMagic", str3).mo59976a("code", String.valueOf(i)).mo59975a("size", Long.valueOf(j)).mo59971a("is_private", Boolean.valueOf(isNeedSetCookie)).mo59971a("isUseTTPlayer", Boolean.valueOf(C68758v.m121190a())).mo59976a("errorDesc", str).mo59971a("isHitCache", Boolean.valueOf(z)).mo59977a());
        } else {
            z2 = false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str2);
            jSONObject.put("is_network_available", z2);
            jSONObject.put("isUseTTPlayer", C68758v.m121190a());
            jSONObject.put("isHitCache", z);
            C34611o.m70671b("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Context context = this.f138087b;
        C89219l.m154716b(context, "");
        String str7 = this.f138088c;
        String str8 = this.f138100o;
        String str9 = this.f138089d;
        C89219l.m154721d(context, "");
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C61135b.m110751a();
        }
        boolean z3 = C58029j.f132256h;
        C24801b bVar = C24801b.C24802a.f58850a;
        C89219l.m154716b(bVar, "");
        int b = (int) bVar.mo40616b();
        C33744d a = new C33744d().mo59983a("music_id", str7).mo59983a("enter_from", str8).mo59983a("url", str9);
        IMusicService m = MusicService.m81198m();
        C89219l.m154716b(m, "");
        C39162r.m79460a("download_music_failed", a.mo59980a("download_strategy", m.mo69314c()).mo59983a("fail_reason", str).mo59980a("net_speed", b).mo59982a("is_use_tt_player", Boolean.valueOf(C68758v.m121190a())).mo59982a("isNetworkAvailable", Boolean.valueOf(z3)).f79943a);
        C51423a.m95787a(this.f138100o + ", MusicDownloadError: errocode=" + num + "errorMsg=" + str + "musicId=" + this.f138088c + ',' + " url=" + this.f138089d + ',' + " curUrl=" + str2 + " isPrivate=" + this.f138096k.isNeedSetCookie() + " fileMagic=" + str3 + " fileSize=" + j + " veErrorCode=" + i);
    }

    public C60770g(Context context, MusicModel musicModel, AbstractC61065b bVar, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i) {
        boolean z3;
        C89219l.m154721d(context, "");
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(bVar, "");
        this.f138096k = musicModel;
        this.f138097l = bVar;
        this.f138098m = countDownLatch;
        this.f138105u = z;
        this.f138099n = z2;
        this.f138100o = str;
        this.f138101p = i;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f138087b = applicationContext;
        this.f138088c = musicModel.getMusicId();
        this.f138089d = C60768e.m110299a(musicModel.getUrl());
        C84158e a = C84158e.m144733a();
        C89219l.m154716b(a, "");
        this.f138090e = a.mo128988c();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f138091f = z3;
        this.f138092g = C60779h.m110324a();
        this.f138094i = -1;
        this.f138102r = C89250i.m154773a((AbstractC89171a) C60776d.f138114a);
        this.f138103s = C89250i.m154773a((AbstractC89171a) new C60772b(this));
        this.f138104t = C89250i.m154773a((AbstractC89171a) new C60778f(this));
    }
}
