package com.p2082ss.android.ugc.aweme.attribution;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.attribution.a */
public final class C33970a {

    /* renamed from: a */
    static Aweme f80345a;

    /* renamed from: b */
    static Keva f80346b;

    /* renamed from: c */
    static long f80347c;

    /* renamed from: d */
    static final Handler f80348d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public static final AbstractC74934a f80349e = new C33971a();

    /* renamed from: f */
    public static final C33970a f80350f;

    /* renamed from: g */
    private static boolean f80351g;

    /* renamed from: h */
    private static boolean f80352h;

    /* renamed from: i */
    private static boolean f80353i = f80346b.getBoolean("video_consume_10_minutes", false);

    /* renamed from: j */
    private static boolean f80354j;

    /* renamed from: k */
    private static Keva f80355k;

    /* renamed from: l */
    private static boolean f80356l;

    /* renamed from: m */
    private static final Runnable f80357m = new RunnableC33973b();

    /* renamed from: com.ss.android.ugc.aweme.attribution.a$a */
    public static final class C33971a implements AbstractC74934a {
        static {
            Covode.recordClassIndex(40898);
        }

        C33971a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a
        /* renamed from: c */
        public final void mo60240c() {
            C33970a.m69561a();
            C33970a.m69562c();
        }

        /* renamed from: com.ss.android.ugc.aweme.attribution.a$a$a */
        static final class RunnableC33972a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f80358a;

            static {
                Covode.recordClassIndex(40899);
            }

            RunnableC33972a(long j) {
                this.f80358a = j;
            }

            public final void run() {
                C33970a.f80346b.storeLong("video_consume_time_name", this.f80358a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a
        /* renamed from: a */
        public final void mo60237a() {
            C33970a.f80345a = null;
            C33970a.m69561a();
            C33970a.m69562c();
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a
        /* renamed from: b */
        public final void mo60239b() {
            C33970a.f80350f.mo60236b();
            C58254p.f132679a.post(new RunnableC33972a(C33970a.f80347c));
            C33970a.m69562c();
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.api.AbstractC74934a
        /* renamed from: a */
        public final void mo60238a(Aweme aweme) {
            C33970a.f80345a = aweme;
            C33970a.m69562c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.attribution.a$b */
    public static final class RunnableC33973b implements Runnable {
        static {
            Covode.recordClassIndex(40900);
        }

        RunnableC33973b() {
        }

        public final void run() {
            Aweme a;
            String str;
            C89219l.m154716b(C81079v.m140776O(), "");
            Activity j = C17873f.m33102j();
            if ((j instanceof ActivityC0945e) && (a = AwemeChangeCallBack.m108593a((ActivityC0945e) j)) != null) {
                String aid = a.getAid();
                Aweme aweme = C33970a.f80345a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(aid, str)) {
                    C33970a.f80347c++;
                }
            }
            C33970a.f80348d.postDelayed(this, 1000);
        }
    }

    private C33970a() {
    }

    /* renamed from: a */
    public static void m69561a() {
        if (f80352h && !f80351g) {
            f80351g = true;
            f80348d.postDelayed(f80357m, 1000);
        }
    }

    /* renamed from: b */
    public final void mo60236b() {
        if (f80351g) {
            f80351g = false;
            f80348d.removeCallbacks(f80357m);
        }
        m69563d();
    }

    /* renamed from: c */
    public static void m69562c() {
        if (f80352h && f80356l) {
            new C79459a(C17867d.m33078a()).mo123052a("" + f80347c).mo123053a();
        }
    }

    static {
        Covode.recordClassIndex(40897);
        C33970a aVar = new C33970a();
        f80350f = aVar;
        f80355k = Keva.getRepo("deliverAdKeva");
        Keva repo = Keva.getRepo("keva_video_consume");
        C89219l.m154716b(repo, "");
        f80346b = repo;
        f80347c = repo.getLong("video_consume_time_name", 0);
        boolean z = f80346b.getBoolean("video_consume_15_minutes", false);
        f80354j = z;
        f80352h = !z;
        Keva repo2 = Keva.getRepo("deliverAdKeva");
        f80355k = repo2;
        f80356l = repo2.getBoolean("webtoon_platform_enabled", false);
        aVar.m69563d();
    }

    /* renamed from: d */
    private final void m69563d() {
        AbstractC79589c a = UgCommonServiceImpl.m138290j().mo123092a();
        if (f80347c >= 600 && !f80353i) {
            f80353i = true;
            a.mo123119d("af_playtime_10min");
            f80346b.storeBoolean("video_consume_10_minutes", true);
            m69562c();
        }
        if (f80347c >= 900 && !f80354j) {
            f80354j = true;
            a.mo123119d("af_playtime_15min");
            f80346b.storeBoolean("video_consume_15_minutes", true);
            m69562c();
            f80352h = false;
            mo60236b();
        }
    }
}
