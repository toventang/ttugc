package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.f.e */
public final class C63775e {
    static {
        Covode.recordClassIndex(75103);
    }

    /* renamed from: a */
    private static String m115329a(int i) {
        if (i == 0) {
            return "aweme/v1/aweme/post";
        }
        if (i == 1) {
            return "aweme/v1/aweme/favorite";
        }
        return "urlTagByType/".concat(String.valueOf(i));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m115328a(int i, String str) {
        try {
            C33744d a = new C33744d().mo59980a("request_type", i).mo59983a("to_user_id", str);
            C39162r.m79460a("aweme_profile_list_request_data", a.f79943a);
            C51423a.m95791b(4, "request:" + m115329a(i), a.f79943a.toString());
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m115330a(int i, String str, FeedItemList feedItemList) {
        C1731i.m5640b(new CallableC63779i(i, str, feedItemList), C39162r.m79452a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m115335b(int i, boolean z, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C33830n.m70668a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m115334b(int i, String str, FeedItemList feedItemList) {
        String str2;
        LogPbBean logPbBean;
        try {
            C33744d a = new C33744d().mo59980a("request_type", i).mo59983a("to_user_id", str);
            if (feedItemList == null || feedItemList.getItems() == null) {
                C33744d a2 = a.mo59983a("is_empty", "true");
                if (feedItemList != null) {
                    str2 = feedItemList.getRequestId();
                } else {
                    str2 = "";
                }
                C33744d a3 = a2.mo59983a("request_id", str2);
                if (feedItemList != null) {
                    logPbBean = feedItemList.logPb;
                } else {
                    logPbBean = null;
                }
                a3.mo59982a("log_pb", logPbBean);
            } else {
                a.mo59980a("size", feedItemList.getItems().size()).mo59982a("log_pb", feedItemList.logPb).mo59983a("request_id", feedItemList.getRequestId());
            }
            C39162r.m79460a("aweme_profile_list_response_data", a.f79943a);
            if (feedItemList != null) {
                C51423a.m95791b(4, "response:" + m115329a(i), a.f79943a.toString());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m115331a(int i, boolean z, int i2) {
        C1731i.m5640b(new CallableC63778h(i, z, i2), C39162r.m79452a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m115336b(int i, boolean z, Exception exc) {
        String exc2;
        String exc3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            if (exc instanceof C34485a) {
                exc3 = ((C34485a) exc).getResponse();
            } else {
                exc3 = exc.toString();
            }
            jSONObject.put("errorMsg", exc3);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C33830n.m70668a("aweme_favorite_list_data_log", jSONObject2);
        String str = "response:fail:" + m115329a(i);
        C33744d a = new C33744d().mo59982a("loadMore", Boolean.valueOf(z));
        if (exc instanceof C34485a) {
            exc2 = ((C34485a) exc).getResponse();
        } else {
            exc2 = exc.toString();
        }
        C51423a.m95791b(4, str, a.mo59983a("errorMsg", exc2).f79943a.toString());
        return null;
    }

    /* renamed from: a */
    public static void m115333a(int i, boolean z, Exception exc) {
        C1731i.m5640b(new CallableC63777g(i, z, exc), C39162r.m79452a());
    }

    /* renamed from: a */
    public static void m115332a(int i, boolean z, int i2, long j, long j2, int i3) {
        C1731i.m5640b(new CallableC63776f(i, z, i2, j, j2, i3), C39162r.m79452a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m115327a(int i, int i2, boolean z, int i3, long j, long j2, int i4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("status_code", i);
            jSONObject.put("pageType", i2);
            jSONObject.put("loadMore", z);
            jSONObject.put("hasMore", String.valueOf(i3));
            jSONObject.put("maxCursor", String.valueOf(j));
            jSONObject.put("minCursor", String.valueOf(j2));
            jSONObject.put("listCount", String.valueOf(i4));
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C33830n.m70668a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }
}
