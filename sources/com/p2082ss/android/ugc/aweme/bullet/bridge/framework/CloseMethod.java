package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16670u;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33119b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.CloseMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod */
public final class CloseMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35059a f82721b = new C35059a((byte) 0);

    /* renamed from: c */
    private final String f82722c = "close";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82723d = AbstractC16183k.EnumC16184a.PUBLIC;

    static {
        Covode.recordClassIndex(42173);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod$a */
    public static final class C35059a {
        static {
            Covode.recordClassIndex(42174);
        }

        private C35059a() {
        }

        public /* synthetic */ C35059a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82723d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82722c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82723d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        boolean z;
        boolean z2;
        WebView webView;
        AbstractC16670u uVar;
        C16238z a;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16208i h = mo61867h();
        if (h == null || (a = h.mo25762a()) == null) {
            str = null;
        } else {
            str = a.f39033a;
        }
        int i = 0;
        if (str == null || str.length() == 0 || (uVar = (AbstractC16670u) C16622e.C16623a.m30858a().mo26346a(AbstractC16670u.class)) == null || !uVar.mo26457a(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.mo61874a(jSONObject2);
            return;
        }
        IShoppingAdsService d = ShoppingAdsServiceImpl.m76354d();
        if (d != null && d.mo65747a(mo26893e())) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            aVar.mo61874a(jSONObject3);
        } else if (mo61868i() == EnumC16723b.WEB || mo61868i() == EnumC16723b.LYNX) {
            String optString = jSONObject.optString("reactId");
            if (optString == null || optString.length() == 0 || optString == null) {
                z2 = false;
            } else {
                Activity a2 = mo61864a(optString);
                if (a2 != null) {
                    a2.finish();
                }
                z2 = true;
            }
            Context e = mo26893e();
            if (e instanceof Activity) {
                Activity activity = (Activity) e;
                if (!activity.isFinishing()) {
                    if (e instanceof C17873f.AbstractC17876c) {
                        if (mo61868i() == EnumC16723b.LYNX) {
                            AbstractC16208i h2 = mo61867h();
                            if (h2 != null) {
                                i = h2.hashCode();
                            }
                        } else {
                            C18288a j = mo61869j();
                            if (!(j == null || (webView = j.f43654d) == null)) {
                                i = webView.hashCode();
                            }
                        }
                        AbstractC81915c.m141874a(new CloseMethod.C47821b(i));
                        AbstractC81915c.m141874a(new C33119b(i));
                    } else if (!z2) {
                        activity.finish();
                    }
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", 1);
            aVar.mo61874a(jSONObject4);
        } else {
            Activity a3 = mo61864a(jSONObject.optString("reactId"));
            if (a3 != null) {
                a3.finish();
                aVar.mo61872a((Object) null);
                return;
            }
            aVar.mo61871a(-1, "the target activity doesn't exist");
        }
    }
}
