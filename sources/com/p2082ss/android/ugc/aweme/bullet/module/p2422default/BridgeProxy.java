package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.BridgeProxy */
public final class BridgeProxy extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C35233a f83244c = new C35233a((byte) 0);

    /* renamed from: b */
    public final AbstractC89172b<C16248b, AbstractC16183k> f83245b;

    /* renamed from: d */
    private String f83246d;

    /* renamed from: e */
    private AbstractC16183k f83247e;

    static {
        Covode.recordClassIndex(42395);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.BridgeProxy$a */
    public static final class C35233a {
        static {
            Covode.recordClassIndex(42396);
        }

        private C35233a() {
        }

        public /* synthetic */ C35233a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f83246d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        Class<?> cls;
        super.mo25721a();
        AbstractC16183k kVar = this.f83247e;
        if (kVar != null) {
            kVar.mo25721a();
        }
        AbstractC16183k kVar2 = this.f83247e;
        if (kVar2 != null && (cls = kVar2.getClass()) != null) {
            cls.getSimpleName();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        super.mo61866a(jSONObject, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        Class<?> cls;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        if (this.f83247e == null) {
            String str = this.f83246d;
            C89219l.m154721d(str, "");
            C89219l.m154714a((Object) this.f83246d, (Object) str);
            if (this.f83247e != null) {
                C89041ag.m154415a();
            } else {
                AbstractC16183k invoke = this.f83245b.invoke(this.f38923a);
                this.f83247e = invoke;
                C89041ag.m154412a(C89387v.m154943a(str, invoke));
            }
        }
        AbstractC16183k kVar = this.f83247e;
        if (kVar != null) {
            kVar.mo25748a(jSONObject, bVar);
        }
        AbstractC16183k kVar2 = this.f83247e;
        if (kVar2 != null && (cls = kVar2.getClass()) != null) {
            cls.getSimpleName();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends com.bytedance.ies.bullet.c.c.a.k> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BridgeProxy(String str, C16248b bVar, AbstractC89172b<? super C16248b, ? extends AbstractC16183k> bVar2) {
        super(bVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83245b = bVar2;
        this.f83246d = str;
    }
}
