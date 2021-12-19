package com.p2082ss.android.ugc.aweme.bullet.utils;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1 */
public final class BulletMethodAdapter$javaMethodToBullet$1 extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    final /* synthetic */ AbstractC18293d f83315b;

    /* renamed from: c */
    final /* synthetic */ String f83316c;

    /* renamed from: d */
    final /* synthetic */ AbstractC16183k.EnumC16184a f83317d;

    /* renamed from: e */
    final /* synthetic */ C16248b f83318e;

    /* renamed from: f */
    private final String f83319f;

    /* renamed from: g */
    private AbstractC16183k.EnumC16184a f83320g;

    /* renamed from: h */
    private boolean f83321h = true;

    static {
        Covode.recordClassIndex(42464);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f83320g;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    public final boolean bh_() {
        return this.f83321h;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f83319f;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f83320g = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("res");
        C18297h a = m71423a(jSONObject);
        this.f83315b.call(a, optJSONObject);
        this.f83321h = a.f43676i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BulletMethodAdapter$javaMethodToBullet$1(AbstractC18293d dVar, String str, AbstractC16183k.EnumC16184a aVar, C16248b bVar, C16248b bVar2) {
        super(bVar2);
        this.f83315b = dVar;
        this.f83316c = str;
        this.f83317d = aVar;
        this.f83318e = bVar;
        this.f83319f = str;
        this.f83320g = aVar;
    }
}
