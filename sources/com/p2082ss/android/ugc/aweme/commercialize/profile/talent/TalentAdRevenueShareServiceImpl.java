package com.p2082ss.android.ugc.aweme.commercialize.profile.talent;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.AbstractC18134b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.C18133a;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ProfileAdTalentShareApi;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.C38482b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.C38484d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.EnumC38483c;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl */
public final class TalentAdRevenueShareServiceImpl implements ITalentAdRevenueShareService {

    /* renamed from: f */
    public static final C38477a f90885f = new C38477a((byte) 0);

    /* renamed from: a */
    public final ArrayList<String> f90886a = new ArrayList<>();

    /* renamed from: b */
    public int f90887b;

    /* renamed from: c */
    public int f90888c = -1;

    /* renamed from: d */
    public int f90889d = -1;

    /* renamed from: e */
    public boolean f90890e;

    /* renamed from: g */
    private boolean f90891g;

    /* renamed from: h */
    private boolean f90892h;

    /* renamed from: i */
    private String f90893i;

    /* renamed from: j */
    private AbstractC18134b f90894j;

    static {
        Covode.recordClassIndex(45987);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl$a */
    public static final class C38477a {
        static {
            Covode.recordClassIndex(45988);
        }

        private C38477a() {
        }

        public /* synthetic */ C38477a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: b */
    public final List<String> mo67032b() {
        return this.f90886a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: c */
    public final boolean mo67033c() {
        return this.f90891g;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final int mo67023a() {
        int a = SettingsManager.m29616a().mo25394a("creator_monetization_ad_upload_item_threshold", 5);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: d */
    public final void mo67034d() {
        this.f90886a.clear();
        this.f90888c = -1;
        this.f90889d = -1;
        this.f90890e = false;
        this.f90891g = false;
        this.f90893i = null;
        C18133a.f43191a.mo28907b(this.f90894j);
    }

    /* renamed from: e */
    public static ITalentAdRevenueShareService m77931e() {
        MethodCollector.m26663i(13611);
        Object a = C81908b.m141854a(ITalentAdRevenueShareService.class, false);
        if (a != null) {
            ITalentAdRevenueShareService iTalentAdRevenueShareService = (ITalentAdRevenueShareService) a;
            MethodCollector.m26664o(13611);
            return iTalentAdRevenueShareService;
        }
        if (C81908b.f183189as == null) {
            synchronized (ITalentAdRevenueShareService.class) {
                try {
                    if (C81908b.f183189as == null) {
                        C81908b.f183189as = new TalentAdRevenueShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13611);
                    throw th;
                }
            }
        }
        TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = (TalentAdRevenueShareServiceImpl) C81908b.f183189as;
        MethodCollector.m26664o(13611);
        return talentAdRevenueShareServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl$c */
    public static final class C38479c implements AbstractC18134b {

        /* renamed from: a */
        final /* synthetic */ TalentAdRevenueShareServiceImpl f90898a;

        static {
            Covode.recordClassIndex(45990);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38479c(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl) {
            this.f90898a = talentAdRevenueShareServiceImpl;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.p1268a.p1269a.AbstractC18134b
        /* renamed from: a */
        public final void mo28563a(String str, String str2, String str3, JSONObject jSONObject) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(jSONObject, "");
            this.f90898a.mo67028a(str3, jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl$b */
    public static final class C38478b implements AbstractC27645k<C38484d> {

        /* renamed from: a */
        final /* synthetic */ TalentAdRevenueShareServiceImpl f90895a;

        /* renamed from: b */
        final /* synthetic */ int f90896b;

        /* renamed from: c */
        final /* synthetic */ AbstractC38487d f90897c;

        static {
            Covode.recordClassIndex(45989);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            this.f90895a.f90888c = this.f90896b;
            this.f90895a.f90890e = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C38484d dVar) {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            C38484d dVar2 = dVar;
            this.f90895a.f90890e = false;
            if (dVar2 != null) {
                this.f90895a.f90888c = this.f90896b;
                this.f90895a.f90889d = this.f90896b;
                this.f90895a.f90887b = dVar2.f90905a;
                List<C38482b> list = dVar2.f90906b;
                if (list != null) {
                    for (C38482b bVar : list) {
                        if (!(bVar == null || (aweme = bVar.f90902b) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                            ArrayList<String> arrayList = this.f90895a.f90886a;
                            C89219l.m154716b(awemeRawAd, "");
                            arrayList.add(awemeRawAd.getCreativeIdStr());
                        }
                    }
                }
            }
            this.f90897c.mo67044a(dVar2);
        }

        C38478b(TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl, int i, AbstractC38487d dVar) {
            this.f90895a = talentAdRevenueShareServiceImpl;
            this.f90896b = i;
            this.f90897c = dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67025a(String str) {
        if (str != null && C89219l.m154714a(C89070n.m154586h((List) this.f90886a), (Object) str)) {
            this.f90886a.remove(str);
            this.f90892h = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67024a(AwemeRawAd awemeRawAd) {
        C89219l.m154721d(awemeRawAd, "");
        if (this.f90891g) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("filter_words", "not interested");
            jSONObject2.put("unified_dislike", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = awemeRawAd;
            aVar.f90225d = jSONObject;
            C38585e.m78291a("draw_ad", "dislike", aVar.mo66507a(), awemeRawAd);
            C18129a.m33746a("draw_ad", "dislike", awemeRawAd).mo28897a("filter_words", "not interested").mo28897a("unified_dislike", 1).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final boolean mo67031a(int i) {
        int i2;
        int i3 = this.f90887b;
        if (i3 <= 0) {
            return false;
        }
        int i4 = this.f90888c;
        if (i4 < 0) {
            return true;
        }
        if (i <= i4) {
            return false;
        }
        if (i4 != this.f90889d || this.f90892h) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i - i4 >= i3 + i2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67026a(String str, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(awemeRawAd, "");
        C38187i.C38188a aVar = new C38187i.C38188a();
        aVar.f90222a = awemeRawAd;
        aVar.f90223b = str;
        C38585e.m78291a("draw_ad", "otherclick", aVar.mo66507a(), awemeRawAd);
        C18129a.m33746a("draw_ad", "otherclick", awemeRawAd).mo28900b("refer", str).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67028a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (str != null && jSONObject != null) {
            try {
                if (TextUtils.isEmpty(this.f90893i)) {
                    return;
                }
                if (this.f90886a.contains(str)) {
                    String optString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(optString);
                    }
                    jSONObject2.put("creator_uid", this.f90893i);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67029a(JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        C89219l.m154721d(jSONObject, str4);
        C89219l.m154721d(awemeRawAd, str4);
        if (awemeRawAd.getCreativeIdStr() != null && C89219l.m154714a((Object) awemeRawAd.getCreativeIdStr(), C89070n.m154586h((List) this.f90886a))) {
            int i = 0;
            if (jSONObject.opt("reason_id") != null) {
                i = jSONObject.optInt("reason_id");
            }
            if (jSONObject.opt("report_from") != null) {
                str = jSONObject.optString("report_from");
                C89219l.m154716b(str, str4);
            } else {
                str = str4;
            }
            if (jSONObject.opt("screenshot_uri") != null) {
                str2 = jSONObject.optString("screenshot_uri");
                C89219l.m154716b(str2, str4);
            } else {
                str2 = str4;
            }
            if (jSONObject.opt("description") != null) {
                str3 = jSONObject.optString("description");
                C89219l.m154716b(str3, str4);
            } else {
                str3 = str4;
            }
            int hashCode = str.hashCode();
            if (hashCode != -1755408457) {
                if (hashCode != -326696768) {
                    if (hashCode == 1820422063 && str.equals("creative")) {
                        str4 = "share_ad";
                    }
                } else if (str.equals("long_press")) {
                    str4 = "draw_ad";
                }
            } else if (str.equals("landing_page")) {
                str4 = "landing_ad";
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reason_id", i);
            jSONObject3.put("screenshot_url", str2);
            jSONObject3.put("description", str3);
            jSONObject2.put("ad_extra_data", jSONObject3);
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = awemeRawAd;
            aVar.f90225d = jSONObject2;
            C38585e.m78291a(str4, "report", aVar.mo66507a(), awemeRawAd);
            C18129a.m33746a(str4, "report", awemeRawAd).mo28897a("reason_id", Integer.valueOf(i)).mo28897a("screenshot_url", str2).mo28897a("description", str3).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67030a(boolean z, String str) {
        this.f90891g = z;
        this.f90893i = str;
        this.f90894j = new C38479c(this);
        C18133a.f43191a.mo28905a(this.f90894j);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    /* renamed from: a */
    public final void mo67027a(String str, List<String> list, int i, EnumC38483c cVar, AbstractC38487d dVar) {
        int i2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        if (!this.f90890e) {
            String str2 = "[";
            for (String str3 : list) {
                if (true ^ C89219l.m154714a((Object) str2, (Object) "[")) {
                    str2 = str2 + ",";
                }
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str2 + str3;
                }
            }
            String str4 = str2 + "]";
            Integer num = null;
            if (cVar == EnumC38483c.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE && (i2 = this.f90889d) >= 0) {
                num = Integer.valueOf(i - i2);
            }
            this.f90890e = true;
            this.f90892h = false;
            Object a = RetrofitFactory.m33635a().mo28817b(ProfileAdTalentShareApi.C38476a.f90883a).mo28832d().mo28858a(ProfileAdTalentShareApi.class);
            C89219l.m154716b(a, "");
            C27646l.m55298a(((ProfileAdTalentShareApi) a).getTalentProfileAd(str, str4, i, cVar.getSOURCE(), num), new C38478b(this, i, dVar), ExecutorC34605m.f81660a);
        }
    }
}
