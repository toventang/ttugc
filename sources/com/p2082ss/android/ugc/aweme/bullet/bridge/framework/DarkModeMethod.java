package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod */
public final class DarkModeMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35061a f82726b = new C35061a((byte) 0);

    /* renamed from: c */
    private final String f82727c = "darkMode";

    static {
        Covode.recordClassIndex(42177);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod$a */
    public static final class C35061a {
        static {
            Covode.recordClassIndex(42178);
        }

        private C35061a() {
        }

        public /* synthetic */ C35061a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82727c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkModeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("enable");
        try {
            Context e = mo26893e();
            Window window = null;
            if (!(e instanceof Activity)) {
                e = null;
            }
            Activity activity = (Activity) e;
            if (activity != null) {
                window = activity.getWindow();
            }
            C80533hg.m139603a(activity, window, TextUtils.equals(optString, "true"));
            aVar.mo61872a(new C28022o());
        } catch (Exception unused) {
            aVar.mo61871a(0, "");
        }
    }
}
