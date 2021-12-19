package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod */
public final class OpenPhoneAreaMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82650b = "choosePhoneArea";

    /* renamed from: c */
    private AbstractC16183k.EnumC16184a f82651c = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(42140);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82651c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82650b;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod$a */
    public static final class C35039a implements AbstractC34292ax {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82652a;

        static {
            Covode.recordClassIndex(42141);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
        public final void onExit() {
        }

        C35039a(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82652a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34292ax
        public final void onChanged(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            jSONObject.put("code", 1);
            BaseBridgeMethod.AbstractC34965a aVar = this.f82652a;
            if (aVar != null) {
                aVar.mo61874a(jSONObject);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82651c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenPhoneAreaMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C35039a aVar2 = new C35039a(aVar);
        AbstractC34892bo b = C31575b.m65860b();
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        b.openCountryListActivity((Activity) e, aVar2);
    }
}
