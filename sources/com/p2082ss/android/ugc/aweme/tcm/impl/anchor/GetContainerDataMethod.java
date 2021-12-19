package com.p2082ss.android.ugc.aweme.tcm.impl.anchor;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.anchor.GetContainerDataMethod */
public final class GetContainerDataMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C77738a f174320b = new C77738a((byte) 0);

    /* renamed from: c */
    private final String f174321c = "getContainerData";

    static {
        Covode.recordClassIndex(90795);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.anchor.GetContainerDataMethod$a */
    public static final class C77738a {
        static {
            Covode.recordClassIndex(90796);
        }

        private C77738a() {
        }

        public /* synthetic */ C77738a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f174321c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetContainerDataMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        jSONObject2.put("group_id", repo.getString("group_id", ""));
        jSONObject2.put("anchor_extra", repo.getString("anchor_extra", ""));
        aVar.mo61872a((Object) jSONObject2);
    }
}
