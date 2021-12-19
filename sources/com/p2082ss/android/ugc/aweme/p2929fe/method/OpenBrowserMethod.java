package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47805a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47858a f110862a = new C47858a((byte) 0);

    static {
        Covode.recordClassIndex(56521);
    }

    private OpenBrowserMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$a */
    public static final class C47858a {
        static {
            Covode.recordClassIndex(56522);
        }

        private C47858a() {
        }

        public /* synthetic */ C47858a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenBrowserMethod() {
        this((C18288a) null);
    }

    public OpenBrowserMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b */
    static final class C47859b implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ Context f110863a;

        static {
            Covode.recordClassIndex(56523);
        }

        C47859b(Context context) {
            this.f110863a = context;
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
            a.mo66495a(this.f110863a);
            if (!z) {
                str2 = "deeplink_failed";
            }
            C18129a.m33747a("draw_ad", str2, "0", "", "0").mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context context = (Context) this.mContextRef.get();
        try {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                C89219l.m154716b(string, "");
                if (string != null) {
                    String lowerCase = string.toLowerCase();
                    C89219l.m154716b(lowerCase, "");
                    if (C89361p.m154874b(lowerCase, "http://", false) || C89361p.m154874b(lowerCase, "https://", false)) {
                        Context context2 = (Context) this.mContextRef.get();
                        String string2 = jSONObject.getString("url");
                        if (context2 != null && jSONObject.optBoolean("use_external_browser", false)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string2));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ResolveInfo resolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                            if (resolveActivity != null) {
                                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                                C84349a.m145093a(intent, context2);
                                context2.startActivity(intent);
                            }
                        }
                        jSONObject.put(StringSet.type, "webview");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", string2);
                        jSONObject.put("args", jSONObject2);
                        C47805a.m90818a(context2, jSONObject);
                    } else if (context != null) {
                        if (C38767w.m78643a(context, string, false)) {
                            C38182f.C38184b a = C38182f.m77418a();
                            a.f90211a = "draw_ad";
                            a.f90212b = "open_url_app";
                            a.mo66495a(context);
                            C18129a.m33747a("draw_ad", "open_url_app", "0", "", "0").mo28902c();
                            C38767w.m78630a(new C47859b(context));
                        }
                    }
                    aVar.mo79886a("");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            aVar.mo79885a(0, "");
        } catch (Exception unused) {
            aVar.mo79885a(0, "");
        }
    }
}
