package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.net.Uri;
import androidx.browser.p024a.C0479c;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.utils.C80557hw;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet */
public final class OpenThirdPartyAppMethodBullet extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C44548a f103949b = new C44548a((byte) 0);

    /* renamed from: c */
    private final String f103950c = "openThirdPartyApp";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f103951d = AbstractC16183k.EnumC16184a.PROTECT;

    static {
        Covode.recordClassIndex(52902);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet$a */
    public static final class C44548a {
        static {
            Covode.recordClassIndex(52903);
        }

        private C44548a() {
        }

        public /* synthetic */ C44548a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f103951d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f103950c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f103951d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenThirdPartyAppMethodBullet(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("packageName");
        if (C80557hw.m139640a(C17867d.m33078a(), optString2)) {
            try {
                C0479c.C0480a aVar2 = new C0479c.C0480a();
                aVar2.mo2041a().f1822a.setPackage(optString2);
                aVar2.mo2041a().mo2040a(mo26893e(), Uri.parse(optString));
                aVar.mo61872a((Object) new JSONObject());
            } catch (Exception e) {
                aVar.mo61871a(-1, e.toString());
            }
        } else {
            aVar.mo61871a(-1, "app not installed");
        }
    }
}
