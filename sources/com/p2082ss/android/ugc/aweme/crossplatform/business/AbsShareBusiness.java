package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness */
public abstract class AbsShareBusiness extends BusinessService.Business {

    /* renamed from: a */
    public WebSharePackage f94912a;

    /* renamed from: b */
    List<String> f94913b = C27404ap.m54809a("copylink", "qrcode", "browser", "refresh");

    /* renamed from: c */
    List<Object> f94914c;

    /* renamed from: d */
    public String f94915d = this.f94935k.f95068a.f95054c;

    /* renamed from: e */
    String f94916e;

    /* renamed from: f */
    String f94917f;

    /* renamed from: g */
    public C40568a f94918g;

    /* renamed from: h */
    public WebView f94919h;

    static {
        Covode.recordClassIndex(48387);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo69697b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo69695a() {
        return this.f94933i.mo67263h();
    }

    /* renamed from: c */
    public final void mo69698c() {
        C88391a.m153580a(C88392a.f200660a).mo142900a(new RunnableC40586b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$a */
    public final class C40568a {
        static {
            Covode.recordClassIndex(48390);
        }

        private C40568a() {
        }

        public /* synthetic */ C40568a(AbsShareBusiness absShareBusiness, byte b) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ JSONException -> 0x0041 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showSource(java.lang.String r7, java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.C40568a.showSource(java.lang.String, java.lang.String):void");
        }
    }

    AbsShareBusiness(C40589e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Boolean mo69696b(String str) {
        if (!str.contains("__SEGMENTATION__")) {
            return null;
        }
        try {
            String[] split = URLDecoder.decode(str, "UTF-8").split("__SEGMENTATION__");
            this.f94918g.showSource(split[1], split[2]);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69693a(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        hashMap.put("previous_page", this.f94935k.f95068a.f95057f);
        String str4 = "";
        if (TextUtils.isEmpty(this.f94935k.f95068a.f95056e)) {
            str2 = str4;
        } else {
            str2 = this.f94935k.f95068a.f95056e;
        }
        hashMap.put("group_id", str2);
        if (!TextUtils.isEmpty(this.f94935k.f95068a.f95056e)) {
            str4 = UGCMonitor.TYPE_ARTICLE;
        }
        hashMap.put("webview_type", str4);
        WebSharePackage webSharePackage = this.f94912a;
        if (webSharePackage == null || TextUtils.isEmpty(webSharePackage.f155491h)) {
            str3 = this.f94915d;
        } else {
            str3 = this.f94912a.f155491h;
        }
        hashMap.put("url", str3);
        C39162r.m79460a("h5_share", hashMap);
    }

    /* renamed from: a */
    private static String m81865a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }

    /* renamed from: a */
    public final void mo69694a(String str, JSONObject jSONObject) {
        Collection<? extends String> collection;
        boolean z = this.f94933i instanceof AbstractC40547m;
        this.f94912a = WebSharePackage.C69244a.m122383a(this.f94936l, str, jSONObject, this.f94915d, "");
        String a = m81865a(jSONObject, "qrcode");
        this.f94917f = m81865a(jSONObject, "sharetips");
        this.f94914c = (List) new C27910f().mo46671a(m81865a(jSONObject, "aweme:shareChannels"), new C27895a<List<Object>>() {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.C405661 */

            static {
                Covode.recordClassIndex(48388);
            }
        }.type);
        if (TextUtils.isEmpty(a) || (!TextUtils.equals("1", a) && !TextUtils.equals(a, "true"))) {
            this.f94913b.remove("qrcode");
        }
        this.f94916e = m81865a(jSONObject, "innerUrl");
        String str2 = this.f94912a.f155491h;
        if (!TextUtils.isEmpty(this.f94916e)) {
            str2 = this.f94916e;
        } else if (!TextUtils.isEmpty(this.f94915d)) {
            str2 = this.f94915d;
        }
        if (!TextUtils.equals(str2, this.f94912a.f155491h)) {
            this.f94912a.f155492i.putString("url_for_im_share", str2);
        }
        String a2 = m81865a(jSONObject, "shareitems");
        if (!(a2 == null || (collection = (Collection) new C27910f().mo46671a(a2, new C27895a<List<String>>() {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.C405672 */

            static {
                Covode.recordClassIndex(48389);
            }
        }.type)) == null)) {
            this.f94913b.clear();
            this.f94913b.addAll(collection);
        }
        mo69698c();
    }
}
