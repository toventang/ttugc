package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod */
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public final C18288a f182386a;

    static {
        Covode.recordClassIndex(94958);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public OpenThirdLoginVerifyMethod(C18288a aVar) {
        super(aVar);
        this.f182386a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod$a */
    static final class C81565a implements AbstractC34467b {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f182387a;

        /* renamed from: b */
        final /* synthetic */ String f182388b;

        static {
            Covode.recordClassIndex(94959);
        }

        C81565a(BaseCommonJavaMethod.AbstractC47813a aVar, String str) {
            this.f182387a = aVar;
            this.f182388b = str;
        }

        /* renamed from: a */
        private static String m141435a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
        /* renamed from: a */
        public final boolean mo60905a(int i, int i2, Intent intent) {
            if (i2 == -1 && i == 10000) {
                String a = m141435a(intent, "access_token");
                if (a == null) {
                    a = "";
                }
                C89219l.m154716b(a, "");
                String a2 = m141435a(intent, "access_token_secret");
                if (a2 == null) {
                    a2 = "";
                }
                C89219l.m154716b(a2, "");
                String a3 = m141435a(intent, "code");
                if (a3 == null) {
                    a3 = "";
                }
                C89219l.m154716b(a3, "");
                String a4 = m141435a(intent, "platform_id");
                if (a4 == null) {
                    a4 = "";
                }
                C89219l.m154716b(a4, "");
                if (!C89219l.m154714a((Object) a, (Object) "") || !C89219l.m154714a((Object) a2, (Object) "") || !C89219l.m154714a((Object) a3, (Object) "")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (C89219l.m154714a((Object) "line", (Object) this.f182388b)) {
                            jSONObject.put("access_token", Uri.encode(a));
                            jSONObject.put("access_token_secret", Uri.encode(a2));
                            jSONObject.put("code", Uri.encode(a3));
                        } else {
                            jSONObject.put("access_token", a);
                            jSONObject.put("access_token_secret", a2);
                            jSONObject.put("code", a3);
                        }
                        jSONObject.put("platform", this.f182388b);
                        jSONObject.put("platform_app_id", a4);
                        BaseCommonJavaMethod.AbstractC47813a aVar = this.f182387a;
                        if (aVar != null) {
                            aVar.mo79886a((Object) jSONObject);
                        }
                    } catch (JSONException unused) {
                        BaseCommonJavaMethod.AbstractC47813a aVar2 = this.f182387a;
                        if (aVar2 != null) {
                            aVar2.mo79885a(0, "failed");
                        }
                        return true;
                    }
                } else {
                    BaseCommonJavaMethod.AbstractC47813a aVar3 = this.f182387a;
                    if (aVar3 != null) {
                        aVar3.mo79885a(0, "");
                    }
                    return true;
                }
            } else {
                BaseCommonJavaMethod.AbstractC47813a aVar4 = this.f182387a;
                if (aVar4 != null) {
                    aVar4.mo79885a(0, "");
                }
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (this.mContextRef != null && this.f182386a != null) {
            if (jSONObject != null) {
                str = jSONObject.getString("platform");
            } else {
                str = null;
            }
            Context context = (Context) this.mContextRef.get();
            if (context instanceof CrossPlatformActivity) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
                crossPlatformActivity.setActivityResultListener(new C81565a(aVar, str));
                Intent authorizeActivityStartIntent = C31575b.m65863e().getAuthorizeActivityStartIntent(crossPlatformActivity);
                authorizeActivityStartIntent.putExtra("platform", str);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                crossPlatformActivity.startActivityForResult(authorizeActivityStartIntent, 10000);
            } else if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        }
    }
}
