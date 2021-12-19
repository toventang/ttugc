package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethodBullet */
public final class GetInfoByOCRMethodBullet extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C44546a f103944b = new C44546a((byte) 0);

    /* renamed from: c */
    private final String f103945c = "pipo.getInfoByOcr";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f103946d = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(52898);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethodBullet$a */
    public static final class C44546a {
        static {
            Covode.recordClassIndex(52899);
        }

        private C44546a() {
        }

        public /* synthetic */ C44546a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f103946d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f103945c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f103946d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetInfoByOCRMethodBullet(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        GetInfoByOCRMethod.C44539a.m87273b(jSONObject, null, aVar);
    }
}
