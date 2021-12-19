package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47805a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35071a f82751b = new C35071a((byte) 0);

    /* renamed from: c */
    private final String f82752c = "openBrowser";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82753d = AbstractC16183k.EnumC16184a.PROTECT;

    static {
        Covode.recordClassIndex(42195);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$a */
    public static final class C35071a {
        static {
            Covode.recordClassIndex(42196);
        }

        private C35071a() {
        }

        public /* synthetic */ C35071a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82753d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82752c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82753d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenBrowserMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b */
    static final class C35072b implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ Context f82754a;

        static {
            Covode.recordClassIndex(42197);
        }

        C35072b(Context context) {
            this.f82754a = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final void sendLog(boolean z) {
            String str;
            C38182f.C38184b a = C38182f.m77418a();
            a.f90211a = "draw_ad";
            String str2 = "deeplink_success";
            if (z) {
                str = str2;
            } else {
                str = "deeplink_failed";
            }
            a.f90212b = str;
            a.mo66495a(this.f82754a);
            if (!z) {
                str2 = "deeplink_failed";
            }
            C18129a.m33747a("draw_ad", str2, "0", "", "0").mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            Context e = mo26893e();
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                C89219l.m154716b(string, "");
                if (string != null) {
                    String lowerCase = string.toLowerCase();
                    C89219l.m154716b(lowerCase, "");
                    if (C89361p.m154874b(lowerCase, "http://", false) || C89361p.m154874b(lowerCase, "https://", false)) {
                        String string2 = jSONObject.getString("url");
                        Context e2 = mo26893e();
                        if (e2 != null && jSONObject.optBoolean("use_external_browser", false)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string2));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ResolveInfo resolveActivity = e2.getPackageManager().resolveActivity(intent, 65536);
                            if (resolveActivity != null) {
                                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                                C84349a.m145093a(intent, e2);
                                e2.startActivity(intent);
                            }
                        }
                        jSONObject.put(StringSet.type, "webview");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", string2);
                        jSONObject.put("args", jSONObject2);
                        C47805a.m90818a(e2, jSONObject);
                    } else if (e != null) {
                        if (C38767w.m78643a(e, string, false)) {
                            C38182f.C38184b a = C38182f.m77418a();
                            a.f90211a = "draw_ad";
                            a.f90212b = "open_url_app";
                            a.mo66495a(e);
                            C18129a.m33747a("draw_ad", "open_url_app", "0", "", "0").mo28902c();
                            C38767w.m78630a(new C35072b(e));
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", 1);
                    aVar.mo61874a(jSONObject3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            aVar.mo61871a(0, "");
        } catch (Exception unused) {
            aVar.mo61871a(0, "");
        }
    }
}
