package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod */
public final class BdturingMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35001a f82575b = new C35001a((byte) 0);

    static {
        Covode.recordClassIndex(42080);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "popTuringVerifyView";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod$a */
    public static final class C35001a {
        static {
            Covode.recordClassIndex(42081);
        }

        private C35001a() {
        }

        public /* synthetic */ C35001a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod$b */
    public static final class C35002b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82576a;

        static {
            Covode.recordClassIndex(42082);
        }

        C35002b(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82576a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            this.f82576a.mo61872a(Integer.valueOf(i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BdturingMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Activity activity;
        String str = "";
        C89219l.m154721d(jSONObject, str);
        C89219l.m154721d(aVar, str);
        AbstractC17045g f = mo26894f();
        if (f != null) {
            activity = f.mo26816a();
        } else {
            activity = null;
        }
        String optString = jSONObject.optString("decision");
        if (optString != null) {
            str = optString;
        }
        if (activity == null || TextUtils.isEmpty(str)) {
            aVar.mo61872a((Object) 1);
        } else {
            SecApiImpl.m119993a().popCaptchaV2(activity, str, new C35002b(aVar));
        }
    }
}
