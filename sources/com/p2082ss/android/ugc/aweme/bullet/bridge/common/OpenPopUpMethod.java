package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPopUpMethod */
public final class OpenPopUpMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35040a f82653b = new C35040a((byte) 0);

    /* renamed from: c */
    private final String f82654c;

    /* renamed from: d */
    private AbstractC35316c f82655d;

    static {
        Covode.recordClassIndex(42142);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPopUpMethod$a */
    public static final class C35040a {
        static {
            Covode.recordClassIndex(42143);
        }

        private C35040a() {
        }

        public /* synthetic */ C35040a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82654c;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC35316c cVar = this.f82655d;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.f82655d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("url", "");
        Activity activity = null;
        String optString2 = jSONObject.optString("data", null);
        Context e = mo26893e();
        if (e instanceof Activity) {
            activity = e;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            AbstractC35316c cVar = this.f82655d;
            if (cVar == null) {
                IBulletService f = BulletService.m71938f();
                C89219l.m154716b(optString, "");
                this.f82655d = f.mo61851a(activity2, optString, optString2, 0, 0);
            } else {
                cVar.mo62167a(activity2);
            }
        }
        aVar.mo61872a("");
    }
}
