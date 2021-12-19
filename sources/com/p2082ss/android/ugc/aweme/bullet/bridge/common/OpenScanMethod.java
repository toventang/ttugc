package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod */
public final class OpenScanMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35041a f82656b = new C35041a((byte) 0);

    /* renamed from: c */
    private final String f82657c = "scan";

    static {
        Covode.recordClassIndex(42144);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod$a */
    public static final class C35041a {
        static {
            Covode.recordClassIndex(42145);
        }

        private C35041a() {
        }

        public /* synthetic */ C35041a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82657c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenScanMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        JSONObject jSONObject2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "h5").f79943a);
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        QRCodePermissionActivity.m118193a(mo26893e());
        if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self") && (mo26893e() instanceof Activity)) {
            Context e = mo26893e();
            Objects.requireNonNull(e, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) e).finish();
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        aVar.mo61874a(jSONObject3);
    }
}
