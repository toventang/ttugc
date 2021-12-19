package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SetStatusBarMethod */
public final class SetStatusBarMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35090a f82802b = new C35090a((byte) 0);

    /* renamed from: c */
    private final String f82803c = "setStatusBar";

    static {
        Covode.recordClassIndex(42226);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SetStatusBarMethod$a */
    public static final class C35090a {
        static {
            Covode.recordClassIndex(42227);
        }

        private C35090a() {
        }

        public /* synthetic */ C35090a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82803c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetStatusBarMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("style");
        boolean optBoolean = jSONObject.optBoolean("hidden", false);
        if (optString == null || optString.length() == 0 || ((!C89219l.m154714a((Object) optString, (Object) "dark")) && (!C89219l.m154714a((Object) optString, (Object) "light")))) {
            aVar.mo61871a(-1, "Style must be light or dark!");
            return;
        }
        Context context = (Context) this.f38923a.mo25832c(Context.class);
        if (context == null) {
            aVar.mo61871a(-2, "Missing activity context [1]");
            return;
        }
        Activity a = C34470e.m70451a(context);
        if (a == null) {
            aVar.mo61871a(-2, "Missing activity context [2]");
            return;
        }
        int hashCode = optString.hashCode();
        if (hashCode != 3075958) {
            if (hashCode == 102970646 && optString.equals("light")) {
                C80534hh.m139607a(a, false);
            }
        } else if (optString.equals("dark")) {
            C80534hh.m139607a(a, true);
        }
        if (optBoolean) {
            C80534hh.m139605a(a);
        }
        aVar.mo61874a(new JSONObject());
    }
}
