package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1 */
public final class Strategy$lifecycleObserver$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC45271m f105462a;

    static {
        Covode.recordClassIndex(53685);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tiktokec_fallback_is_reconstructed", this.f105462a.f105516k ? 1 : 0);
        jSONObject.put("tiktokec_fallback_type", this.f105462a.f105512g.toString());
        Uri uri = this.f105462a.f105513h;
        if (uri != null) {
            jSONObject.put("tiktokec_fallback_scheme", uri.getScheme() + "://" + uri.getAuthority() + uri.getPath());
        }
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).postEvent("rd_tiktokec_fallback_reconstructed", jSONObject);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    Strategy$lifecycleObserver$1(AbstractC45271m mVar) {
        this.f105462a = mVar;
    }
}
