package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod */
public final class SetNativeItemMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35046a f82666b = new C35046a((byte) 0);

    /* renamed from: c */
    private final String f82667c = "setNativeItem";

    static {
        Covode.recordClassIndex(42152);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod$a */
    public static final class C35046a {
        static {
            Covode.recordClassIndex(42153);
        }

        private C35046a() {
        }

        public /* synthetic */ C35046a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82667c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetNativeItemMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            if (C47809e.C47810a.f110762a.mo79874a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo61872a((Object) null);
            } else {
                aVar.mo61871a(-1, "");
            }
        } catch (Exception e) {
            aVar.mo61871a(-1, "");
            e.printStackTrace();
        }
    }
}
