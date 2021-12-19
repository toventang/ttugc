package com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance;

import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.api.UserGrowthDataApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.a */
public final class C50418a {

    /* renamed from: a */
    public static String f116405a;

    /* renamed from: b */
    public static final Keva f116406b;

    /* renamed from: c */
    public static final HashMap<String, Object> f116407c;

    /* renamed from: d */
    public static final HashMap<String, Object> f116408d;

    /* renamed from: e */
    public static final HashMap<String, Object> f116409e;

    /* renamed from: f */
    public static final HashSet<Integer> f116410f = new HashSet<>();

    /* renamed from: g */
    public static NewUserProgressModel.ProgressBarInfo f116411g;

    /* renamed from: h */
    public static NewUserProgressModel.SwipeUpText f116412h;

    /* renamed from: i */
    public static String f116413i;

    /* renamed from: j */
    public static int f116414j;

    /* renamed from: k */
    public static int f116415k;

    /* renamed from: l */
    public static String f116416l = "";

    /* renamed from: m */
    public static AbstractC88412b f116417m;

    /* renamed from: n */
    public static final C50419a f116418n = new C50419a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.a$a */
    public static final class C50419a {
        static {
            Covode.recordClassIndex(59552);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.a$a$a */
        public static final class C50420a implements AbstractC88986z<NewUserProgressModel> {
            static {
                Covode.recordClassIndex(59553);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C89219l.m154721d(th, "");
            }

            C50420a() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                C89219l.m154721d(bVar, "");
                C50418a.f116417m = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(NewUserProgressModel newUserProgressModel) {
                NewUserProgressModel newUserProgressModel2 = newUserProgressModel;
                C89219l.m154721d(newUserProgressModel2, "");
                C50418a.f116406b.storeBoolean("response_received", true);
                NewUserProgressModel.ProgressBarInfo progressBarInfo = newUserProgressModel2.getProgressBarInfo();
                NewUserProgressModel.SwipeUpText swipeUpText = newUserProgressModel2.getSwipeUpText();
                String b = new C27910f().mo46674b(progressBarInfo);
                String b2 = new C27910f().mo46674b(swipeUpText);
                C89219l.m154716b(b2, "");
                C50418a.f116416l = b2;
                if (C80537hk.m139613a(b)) {
                    C50418a.f116411g = (NewUserProgressModel.ProgressBarInfo) new C27910f().mo46670a(b, NewUserProgressModel.ProgressBarInfo.class);
                    C50418a.f116406b.storeBoolean("first_init", true);
                    C50418a.f116406b.storeString("progress_bar_data", b);
                }
                if (C80537hk.m139613a(C50418a.f116416l)) {
                    C50418a.f116412h = (NewUserProgressModel.SwipeUpText) new C27910f().mo46670a(C50418a.f116416l, NewUserProgressModel.SwipeUpText.class);
                }
                C50418a.f116406b.storeBoolean("response_caching_complete", true);
            }
        }

        private C50419a() {
        }

        /* renamed from: a */
        public static void m94566a() {
            C50418a.f116415k = 0;
            C50418a.f116410f.clear();
        }

        /* renamed from: d */
        public static String m94575d() {
            NewUserProgressModel.SwipeUpText swipeUpText = C50418a.f116412h;
            if (swipeUpText != null) {
                return swipeUpText.getSubTitle();
            }
            return null;
        }

        /* renamed from: c */
        public static String m94574c() {
            String title;
            NewUserProgressModel.SwipeUpText swipeUpText = C50418a.f116412h;
            if (swipeUpText == null || (title = swipeUpText.getTitle()) == null) {
                return null;
            }
            return C89361p.m154873b(title, "%d", "20", true);
        }

        /* renamed from: e */
        private static boolean m94576e() {
            if (C50418a.f116414j > 100 || C50418a.f116406b.getBoolean("progress_dismissed_by_user", false)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static void m94573b() {
            if (!C50418a.f116406b.contains("response_caching_complete")) {
                ((UserGrowthDataApi.NewUserProgressDataApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(UserGrowthDataApi.NewUserProgressDataApi.class)).getGuidanceProgressBarData().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C50420a());
            }
        }

        public /* synthetic */ C50419a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m94567a(double d) {
            if (d > 2.0d) {
                if (C50418a.f116414j <= 100) {
                    C50418a.f116414j += 5;
                }
                C50418a.f116407c.put(C50418a.f116413i, Integer.valueOf(C50418a.f116414j));
                C50418a.f116406b.storeString("progress_map_key", new JSONObject(C50418a.f116407c).toString());
            }
            m94566a();
        }

        /* renamed from: a */
        private static boolean m94571a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            if (!C39223a.m79588b().mo68596d()) {
                return false;
            }
            String f = C39223a.m79588b().mo68598f();
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            if (TextUtils.isEmpty(f) || !TextUtils.equals(f, aid)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static void m94570a(JSONObject jSONObject, HashMap<String, Object> hashMap) {
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        }

        /* renamed from: a */
        public static void m94568a(int i, double d) {
            if (i < C50418a.f116415k || C50418a.f116414j > 100) {
                C50418a.f116415k = i;
                return;
            }
            C50418a.f116415k = i;
            if (d > 2.0d && !C50418a.f116410f.contains(Integer.valueOf(i))) {
                C50418a.f116410f.add(Integer.valueOf(i));
                if (C50418a.f116414j <= 100) {
                    C50418a.f116414j += 5;
                }
                C50418a.f116407c.put(C50418a.f116413i, Integer.valueOf(C50418a.f116414j));
                C50418a.f116406b.storeString("progress_map_key", new JSONObject(C50418a.f116407c).toString());
            }
        }

        /* renamed from: a */
        public static boolean m94572a(Aweme aweme, String str) {
            RoomFeedCellStruct roomFeedCellStruct;
            LiveRoomStruct newLiveRoomData;
            C89219l.m154721d(str, "");
            C50418a.f116405a = str;
            if (aweme != null && !aweme.isAd() && !aweme.isRelieve() && !C50545m.m94770g(aweme) && !C50539g.m94744a(aweme) && (((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null || newLiveRoomData.warningTag == null) && !m94576e() && !m94571a(aweme) && C50418a.f116411g != null)) {
                NewUserProgressModel.ProgressBarInfo progressBarInfo = C50418a.f116411g;
                if (progressBarInfo == null) {
                    C89219l.m154715b();
                }
                if (C11279p.m20012a(progressBarInfo.getShouldShowProgressBar())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static void m94569a(int i, String str, boolean z) {
            String str2;
            C89219l.m154721d(str, "");
            C33744d dVar = new C33744d();
            String str3 = C50418a.f116405a;
            if (str3 == null) {
                C89219l.m154710a("enterFrom");
            }
            C33744d a = dVar.mo59983a("enter_from", str3).mo59980a("progress_pct", i).mo59983a("group_id", str);
            if (z) {
                str2 = "turnoff";
            } else {
                str2 = "keep";
            }
            C39162r.m79460a("close_nuf_progress_turnoff_popup", a.mo59983a("enter_method", str2).f79943a);
        }
    }

    /* renamed from: a */
    public static final void m94565a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        f116413i = curUserId;
        Keva keva = f116406b;
        keva.erase("progress_bar_data");
        keva.erase("response_caching_complete");
        keva.erase("response_received");
        C50419a.m94573b();
        HashMap<String, Object> hashMap = f116407c;
        hashMap.put(f116413i, 5);
        f116414j = 5;
        keva.storeString("progress_map_key", new JSONObject(hashMap).toString());
        keva.storeBoolean("progress_dismissed_by_user", false);
        keva.storeInt("milestone_progress_reported", -1);
    }

    static {
        Covode.recordClassIndex(59551);
        Keva repo = Keva.getRepo("guidance_progress_bar");
        f116406b = repo;
        HashMap<String, Object> hashMap = new HashMap<>();
        f116407c = hashMap;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        f116408d = hashMap2;
        HashMap<String, Object> hashMap3 = new HashMap<>();
        f116409e = hashMap3;
        f116413i = "0";
        f116414j = 5;
        if (repo.contains("progress_map_key")) {
            C50419a.m94570a(new JSONObject(repo.getString("progress_map_key", "")), hashMap);
        }
        if (repo.contains("progress_dismiss_key")) {
            C50419a.m94570a(new JSONObject(repo.getString("progress_dismiss_key", "")), hashMap2);
        }
        if (repo.contains("progress_milestone_key")) {
            C50419a.m94570a(new JSONObject(repo.getString("progress_milestone_key", "")), hashMap3);
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        f116413i = curUserId;
        if (hashMap.containsKey(curUserId)) {
            Object obj = hashMap.get(f116413i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            f116414j = ((Integer) obj).intValue();
        } else {
            hashMap.put(f116413i, 5);
            f116414j = 5;
        }
        if (hashMap2.containsKey(f116413i)) {
            Object obj2 = hashMap2.get(f116413i);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            repo.storeBoolean("progress_dismissed_by_user", ((Boolean) obj2).booleanValue());
        } else {
            repo.storeBoolean("progress_dismissed_by_user", false);
        }
        if (hashMap3.containsKey(f116413i)) {
            Object obj3 = hashMap3.get(f116413i);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            repo.storeInt("milestone_progress_reported", ((Integer) obj3).intValue());
        } else {
            repo.storeInt("milestone_progress_reported", -1);
        }
        if (repo.contains("progress_bar_data")) {
            f116411g = (NewUserProgressModel.ProgressBarInfo) new C27910f().mo46670a(repo.getString("progress_bar_data", ""), NewUserProgressModel.ProgressBarInfo.class);
        }
    }
}
