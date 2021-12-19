package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47808d;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod */
public final class BulletGetAppInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35057a f82715b = new C35057a((byte) 0);

    /* renamed from: c */
    private final String f82716c = "uniAppInfo";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82717d = AbstractC16183k.EnumC16184a.PUBLIC;

    static {
        Covode.recordClassIndex(42169);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod$a */
    public static final class C35057a {
        static {
            Covode.recordClassIndex(42170);
        }

        private C35057a() {
        }

        public /* synthetic */ C35057a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82717d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82716c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82717d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletGetAppInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString("permissionGroup");
        this.f38923a.mo25832c(C18288a.class);
        for (T t : C47808d.m90825a(optString).entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        aVar.mo61872a((Object) jSONObject2);
    }
}
