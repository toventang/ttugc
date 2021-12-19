package com.p2082ss.android.ugc.aweme.deeplink.p2735d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.p2141e.C29905b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.commercialize.C37638d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2618a.C38550a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.deeplink.d.a */
public final class C41037a {

    /* renamed from: a */
    private Context f95924a;

    /* renamed from: b */
    private Intent f95925b;

    static {
        Covode.recordClassIndex(48907);
    }

    /* renamed from: a */
    private static NetworkUtils.EnumC29835h m82656a(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    /* renamed from: b */
    public final void mo70247b(Uri uri) {
        if (uri.toString().startsWith(AbstractC37639a.AbstractC37640a.f89002a)) {
            C1731i.m5640b(new CallableC41038b(this, uri), C1731i.f5562a);
        }
        C38550a.m78168a(uri);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo70248c(Uri uri) {
        AwemeRawAd awemeRawAd = C37638d.f88998a.f88999b;
        C37638d.f88998a.f88999b = null;
        if (awemeRawAd == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("tag");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "draw_ad";
        }
        C38182f.C38184b b = C38182f.m77418a().mo66498b(awemeRawAd);
        b.f90211a = queryParameter;
        b.f90212b = "open_url_appback";
        b.mo66495a(this.f95924a);
        C18129a.m33746a(queryParameter, "open_url_appback", awemeRawAd).mo28902c();
        return null;
    }

    /* renamed from: a */
    public static void m82657a(Uri uri) {
        String queryParameter = uri.getQueryParameter("appParam");
        if (queryParameter != null) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter);
                String optString = jSONObject.optString("__type__");
                String optString2 = jSONObject.optString("position");
                String optString3 = jSONObject.optString("iid");
                String optString4 = jSONObject.optString("wxshare_count");
                String optString5 = jSONObject.optString("parent_group_id");
                String optString6 = jSONObject.optString("webid");
                C39163s sVar = new C39163s();
                sVar.mo67941a("__type__", optString);
                sVar.mo67941a("position", optString2);
                sVar.mo67941a("iid", optString3);
                if (!C13627m.m24498a(optString4)) {
                    sVar.mo67941a("wxshare_count", optString4);
                }
                sVar.mo67941a("parent_group_id", optString5);
                if (!C13627m.m24498a(optString6)) {
                    sVar.mo67941a("webid", optString6);
                }
                C39162r.onEvent(new MobClick().setEventName("open_url").setLabelName("scheme").setJsonObject(sVar.mo67942a()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C41037a(Context context, Intent intent) {
        this.f95924a = context;
        this.f95925b = intent;
    }

    /* renamed from: a */
    public final void mo70246a(boolean z, Uri uri) {
        C29902a.m60273a().notifyOnDeeplink(z, this.f95924a, this.f95925b, uri);
    }

    /* renamed from: a */
    private static Uri m82655a(Uri uri, C41058p pVar) {
        String str = pVar.f95976a;
        if (TextUtils.isEmpty(str)) {
            str = uri.getQueryParameter("gd_label");
        }
        if (TextUtils.isEmpty(str)) {
            str = uri.getQueryParameter("launch_method");
        }
        if (TextUtils.isEmpty(str)) {
            str = "link_direct";
        }
        pVar.mo70265a(str);
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", pVar.f95976a).appendQueryParameter("page_source", pVar.f95977b).appendQueryParameter("enter_to", pVar.f95978c).appendQueryParameter("platform", pVar.f95979d).appendQueryParameter("from_user_id", pVar.f95980e);
        if (!TextUtils.isEmpty(pVar.f95982g)) {
            appendQueryParameter.appendQueryParameter("link_id", pVar.f95982g);
        }
        if (!TextUtils.isEmpty(pVar.f95983h)) {
            appendQueryParameter.appendQueryParameter("referrer_url", pVar.f95983h);
        }
        if (!TextUtils.isEmpty(pVar.f95984i)) {
            appendQueryParameter.appendQueryParameter("params_url", pVar.f95984i);
        }
        if (!TextUtils.isEmpty(pVar.f95981f)) {
            appendQueryParameter.appendQueryParameter("to_user_id", pVar.f95981f);
        }
        appendQueryParameter.appendQueryParameter("needlaunchlog", "true");
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    public final void mo70245a(Uri uri, boolean z) {
        String str;
        String queryParameter = uri.getQueryParameter("label");
        String queryParameter2 = uri.getQueryParameter("push_id");
        uri.getQueryParameter("gd_label");
        if (queryParameter != null || z) {
            JSONObject jSONObject = new JSONObject();
            String str2 = "0";
            if (TextUtils.isEmpty(uri.getLastPathSegment())) {
                str = str2;
            } else {
                str = uri.getLastPathSegment();
            }
            try {
                jSONObject.put("network_type", NetworkUtils.getNetworkAccessType(m82656a(this.f95924a)).toUpperCase(Locale.getDefault()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                MobClick eventName = MobClick.obtain().setEventName("push");
                String str3 = "";
                if (queryParameter == null) {
                    queryParameter = str3;
                }
                MobClick labelName = eventName.setLabelName(queryParameter);
                if (queryParameter2 != null) {
                    str3 = queryParameter2;
                }
                MobClick value = labelName.setValue(str3);
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                C39162r.onEvent(value.setExtValueString(str2).setJsonObject(jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C41040d.m82678a(z, queryParameter2, str, jSONObject, this.f95925b);
        }
        C33830n.m70667a("aweme_app_performance", "main_page_time", (float) (System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h));
    }

    /* renamed from: a */
    public final void mo70244a(Uri uri, C41058p pVar, boolean z) {
        IUgCommonService j = UgCommonServiceImpl.m138290j();
        if (j.mo123111i()) {
            j.mo123110h().mo123167a(uri, z, pVar, C41039c.m82669a(), C41039c.f95929b - C41039c.f95928a, C41039c.f95930c);
        } else {
            C29905b.m60282a(this.f95924a).mo52217a(m82655a(uri, pVar));
        }
    }
}
