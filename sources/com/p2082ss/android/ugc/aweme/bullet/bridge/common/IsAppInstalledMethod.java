package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.utils.C80557hw;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod */
public final class IsAppInstalledMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35024a f82619b = new C35024a((byte) 0);

    /* renamed from: c */
    private final String f82620c = "isAppInstall";

    static {
        Covode.recordClassIndex(42116);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod$a */
    public static final class C35024a {
        static {
            Covode.recordClassIndex(42117);
        }

        private C35024a() {
        }

        public /* synthetic */ C35024a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82620c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IsAppInstalledMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String string = jSONObject.getString("packageName");
        if (C80557hw.m139640a(C17867d.m33078a(), string)) {
            aVar.mo61872a((Object) new JSONObject());
        } else {
            aVar.mo61871a(-1, string);
        }
    }
}
