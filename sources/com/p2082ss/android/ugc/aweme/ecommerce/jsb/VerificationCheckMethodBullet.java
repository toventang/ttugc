package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethodBullet */
public final class VerificationCheckMethodBullet extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f103969b = "verificationCheck";

    /* renamed from: c */
    private AbstractC16183k.EnumC16184a f103970c = AbstractC16183k.EnumC16184a.PROTECT;

    static {
        Covode.recordClassIndex(52916);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f103970c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f103969b;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f103970c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerificationCheckMethodBullet(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethodBullet$a */
    public static final class C44554a extends C67837a {

        /* renamed from: a */
        final /* synthetic */ int f103971a;

        /* renamed from: b */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f103972b;

        static {
            Covode.recordClassIndex(52917);
        }

        C44554a(int i, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f103971a = i;
            this.f103972b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            BaseBridgeMethod.AbstractC34965a aVar = this.f103972b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", z);
            aVar.mo61872a((Object) jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        int optInt = jSONObject.optInt("verifyCode");
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            SecApiImpl.m119993a().popCaptcha(activity, optInt, new C44554a(optInt, aVar));
        }
    }
}
