package com.p2082ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2019b.C27895a;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness */
public abstract class AbsShareBusiness extends BulletBusinessService.Business {

    /* renamed from: j */
    public static final C35105a f82842j = new C35105a((byte) 0);

    /* renamed from: a */
    public List<Object> f82843a;

    /* renamed from: b */
    public WebSharePackage f82844b;

    /* renamed from: c */
    public List<String> f82845c;

    /* renamed from: d */
    public String f82846d;

    /* renamed from: e */
    public boolean f82847e;

    /* renamed from: f */
    public String f82848f;

    /* renamed from: g */
    public String f82849g;

    /* renamed from: h */
    public C35106b f82850h = new C35106b();

    /* renamed from: i */
    C35226e f82851i;

    static {
        Covode.recordClassIndex(42247);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61926a();

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$a */
    public static final class C35105a {
        static {
            Covode.recordClassIndex(42248);
        }

        private C35105a() {
        }

        public /* synthetic */ C35105a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$c */
    public static final class C35107c extends C27895a<List<? extends Object>> {
        static {
            Covode.recordClassIndex(42250);
        }

        C35107c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$e */
    public static final class C35109e extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(42252);
        }

        C35109e() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$d */
    public static final class RunnableC35108d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsShareBusiness f82853a;

        static {
            Covode.recordClassIndex(42251);
        }

        RunnableC35108d(AbsShareBusiness absShareBusiness) {
            this.f82853a = absShareBusiness;
        }

        public final void run() {
            this.f82853a.mo61926a();
        }
    }

    /* renamed from: b */
    public final void mo61928b() {
        C88391a.m153580a(C88392a.f200660a).mo142900a(new RunnableC35108d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$b */
    public final class C35106b {
        static {
            Covode.recordClassIndex(42249);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C35106b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ JSONException -> 0x004a }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showSource(java.lang.String r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.business.AbsShareBusiness.C35106b.showSource(java.lang.String, java.lang.String):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsShareBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        ArrayList a = C27404ap.m54809a("copylink", "qrcode", "browser", "refresh");
        C89219l.m154716b(a, "");
        this.f82845c = a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61927a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        C89219l.m154721d(str, str6);
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        C35226e eVar = this.f82851i;
        if (eVar == null || (str2 = eVar.mo62116g()) == null) {
            str2 = str6;
        }
        hashMap.put("previous_page", str2);
        C35226e eVar2 = this.f82851i;
        if (eVar2 == null || (str3 = eVar2.mo62117h()) == null) {
            str3 = str6;
        }
        hashMap.put("group_id", str3);
        C35226e eVar3 = this.f82851i;
        String str7 = null;
        if (eVar3 != null) {
            str4 = eVar3.mo62117h();
        } else {
            str4 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str5 = str6;
        } else {
            str5 = UGCMonitor.TYPE_ARTICLE;
        }
        hashMap.put("webview_type", str5);
        WebSharePackage webSharePackage = this.f82844b;
        if (webSharePackage != null) {
            str7 = webSharePackage.f155491h;
        }
        if (TextUtils.isEmpty(str7)) {
            String str8 = this.f82846d;
            if (str8 != null) {
                str6 = str8;
            }
        } else {
            WebSharePackage webSharePackage2 = this.f82844b;
            if (webSharePackage2 == null) {
                C89219l.m154715b();
            }
            str6 = webSharePackage2.f155491h;
        }
        hashMap.put("url", str6);
        C39162r.m79460a("h5_share", hashMap);
    }

    /* renamed from: a */
    static String m71779a(JSONObject jSONObject, String str) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(str)) == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }
}
