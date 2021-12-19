package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.interest.C49701a;
import com.p2082ss.android.ugc.aweme.feed.interest.InterestApi;
import com.p2082ss.android.ugc.aweme.feed.interest.p2950a.C49702a;
import com.p2082ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Arrays;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.dy */
public final class C46864dy {

    /* renamed from: a */
    public static final String f109191a = "";

    /* renamed from: b */
    public static final String f109192b = "InterestSelectExperiment";

    /* renamed from: c */
    public static volatile String f109193c;

    /* renamed from: d */
    static final Keva f109194d = Keva.getRepo("interest_select");

    /* renamed from: e */
    public static final AbstractC89244h f109195e = C89250i.m154773a((AbstractC89171a) C46865a.f109209a);

    /* renamed from: f */
    public static int f109196f;

    /* renamed from: g */
    public static boolean f109197g = true;

    /* renamed from: h */
    public static volatile boolean f109198h;

    /* renamed from: i */
    static volatile Aweme f109199i;

    /* renamed from: j */
    public static final C46864dy f109200j = new C46864dy();

    /* renamed from: k */
    private static final String f109201k = "{\"group\": 1,\"start_index\": 4,\"skip_n\": 3,\"skip_s\": 3}";

    /* renamed from: l */
    private static final String f109202l = "{\"group\": 2,\"skip_n\": 3,\"skip_s\": 3}";

    /* renamed from: m */
    private static final String f109203m = "interest_select";

    /* renamed from: n */
    private static final String f109204n = "keva_key_video_seen_once";

    /* renamed from: o */
    private static final String f109205o = "keva_key_video_seen_once_new";

    /* renamed from: p */
    private static final boolean f109206p = C16048b.m29633a().mo25421a(true, "user_interest_show_strategy_android_mock", false);

    /* renamed from: q */
    private static final C46862dx f109207q;

    /* renamed from: r */
    private static final AbstractC89244h f109208r = C89250i.m154773a((AbstractC89171a) C46866b.f109210a);

    private C46864dy() {
    }

    /* renamed from: b */
    public static int m90173b() {
        try {
            C46862dx dxVar = f109207q;
            if (dxVar != null) {
                return dxVar.f109184a;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m90174c() {
        try {
            C46862dx dxVar = f109207q;
            if (dxVar != null) {
                return dxVar.f109185b;
            }
            return 4;
        } catch (Throwable unused) {
            return 4;
        }
    }

    /* renamed from: g */
    public static int m90176g() {
        try {
            C46862dx dxVar = f109207q;
            if (dxVar != null) {
                return dxVar.f109187d;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    /* renamed from: h */
    public static int m90177h() {
        try {
            C46862dx dxVar = f109207q;
            if (dxVar != null) {
                return dxVar.f109186c;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dy$b */
    static final class C46866b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46866b f109210a = new C46866b();

        static {
            Covode.recordClassIndex(55467);
        }

        C46866b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C46864dy.f109194d.getBoolean(C46864dy.m90171a(), true));
        }
    }

    /* renamed from: d */
    public static boolean m90175d() {
        return ((Boolean) f109208r.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo79348e() {
        if (m90173b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo79349f() {
        if (m90173b() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dy$a */
    static final class C46865a extends AbstractC89220m implements AbstractC89171a<InterestApi> {

        /* renamed from: a */
        public static final C46865a f109209a = new C46865a();

        static {
            Covode.recordClassIndex(55466);
        }

        C46865a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InterestApi invoke() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(InterestApi.class);
            C89219l.m154716b(create, "");
            return create;
        }
    }

    /* renamed from: a */
    public static String m90171a() {
        boolean z;
        Integer num;
        try {
            C46862dx dxVar = f109207q;
            if (dxVar != null) {
                num = Integer.valueOf(dxVar.f109190g);
            } else {
                num = null;
            }
            z = C89219l.m154714a((Object) num, (Object) 1);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return f109205o;
        }
        return f109204n;
    }

    static {
        Covode.recordClassIndex(55465);
        String a = C16048b.m29633a().mo25417a(false, "user_interest_show_strategy", "");
        GsonProvider c = GsonHolder.m138943c();
        C89219l.m154716b(c, "");
        C46862dx dxVar = (C46862dx) c.mo123620b().mo46670a(a, C46862dx.class);
        C51423a.m95791b(4, "InterestSelectExperiment", "get experiment,raw:" + a + ",end:" + dxVar);
        f109207q = dxVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dy$d */
    public static final class C46868d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C46868d f109212a = new C46868d();

        static {
            Covode.recordClassIndex(55469);
        }

        C46868d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95790a((Throwable) obj);
        }
    }

    /* renamed from: a */
    public static void m90172a(Context context) {
        if (!(context instanceof ActivityC0945e) || f109199i == null) {
            C51423a.m95791b(4, f109192b, "not insert cause aweme is null or other reason,just ignore");
            return;
        }
        C39162r.m79460a("enable_interest_lable", new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("user_id", C49701a.m93115a()).f79943a);
        Aweme aweme = f109199i;
        if (aweme != null) {
            C51423a.m95791b(4, f109192b, "insert aid:" + aweme.getAid());
            InterestViewModel.C49703a.m93116a((ActivityC0945e) context).f114386a.postValue(aweme);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dy$c */
    public static final class C46867c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C46867c f109211a = new C46867c();

        static {
            Covode.recordClassIndex(55468);
        }

        C46867c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            Integer num2;
            C49702a aVar = (C49702a) obj;
            String str = null;
            if (aVar == null || (num2 = aVar.f114378a) == null || num2.intValue() != 0) {
                StringBuilder append = new StringBuilder().append(C46864dy.f109192b).append(",status:");
                if (aVar != null) {
                    num = aVar.f114378a;
                } else {
                    num = null;
                }
                StringBuilder append2 = append.append(num).append(",msg:");
                if (aVar != null) {
                    str = aVar.f114379b;
                }
                String sb = append2.append(str).toString();
                C51423a.m95791b(6, C46864dy.f109192b, sb);
                throw new RuntimeException(sb);
            }
            C51423a.m95791b(4, C46864dy.f109192b, "request ok");
            Aweme aweme = aVar.f114381d;
            if (aweme != null && aweme.getAid() != null && aVar.f114380c != null) {
                C51423a.m95791b(4, C46864dy.f109192b, "requestId:" + aVar.getRequestId() + ",logPb:" + aVar.f114384g);
                aVar.setRequestId("user_interest_show_strategy");
                C48027ac.C48028a.f111257a.mo80056a(aVar.getRequestId(), aVar.f114384g);
                C49710k.m93123a(Arrays.asList(aVar.f114381d), aVar.getRequestId(), 0);
                C46864dy.f109199i = aVar.f114381d;
                if (C46864dy.f109200j.mo79348e()) {
                    C46864dy.m90172a(C17873f.m33102j());
                }
            }
        }
    }
}
