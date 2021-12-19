package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.model.KeyboardModel;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.KeyboardChangeMethod */
public final class KeyboardChangeMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f100081b = "KeyboardChange";

    static {
        Covode.recordClassIndex(51036);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100081b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardChangeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            int optInt = jSONObject.optInt("pop_up");
            Activity j = C17873f.m33102j();
            if (j != null && (j instanceof ActivityC0945e)) {
                AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) j, (C1175ad.AbstractC1177b) null).mo3983a(KeyboardModel.class);
                C89219l.m154716b(a, "");
                ((KeyboardModel) a).getKeyboardStatus().setValue(Integer.valueOf(optInt));
            }
            aVar.mo61872a((Object) new JSONObject());
        } catch (Exception e) {
            C42912b.m85668a(e, "KeyboardChange");
            aVar.mo61871a(0, e.getMessage());
            e.printStackTrace();
        }
    }
}
