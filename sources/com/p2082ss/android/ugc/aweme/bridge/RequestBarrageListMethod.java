package com.p2082ss.android.ugc.aweme.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.util.C80141m;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.RequestBarrageListMethod */
public final class RequestBarrageListMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private AbstractC88412b f82389b;

    /* renamed from: c */
    private final String f82390c = "requestBarrageList";

    static {
        Covode.recordClassIndex(41940);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82390c;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC88412b bVar;
        AbstractC88412b bVar2 = this.f82389b;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f82389b) != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.RequestBarrageListMethod$a */
    static final class C34923a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82391a;

        static {
            Covode.recordClassIndex(41941);
        }

        C34923a(AbstractC16183k.AbstractC16185b bVar) {
            this.f82391a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C34927a.m71314a(this.f82391a, (JSONObject) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.RequestBarrageListMethod$b */
    static final class C34924b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82392a;

        static {
            Covode.recordClassIndex(41942);
        }

        C34924b(AbstractC16183k.AbstractC16185b bVar) {
            this.f82392a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C34927a.m71313a(this.f82392a, (Throwable) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestBarrageListMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        AbstractC88412b bVar2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        AbstractC88412b bVar3 = this.f82389b;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar2 = this.f82389b) == null)) {
            bVar2.dispose();
        }
        this.f82389b = C80141m.m138904a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C34923a(bVar), new C34924b(bVar));
    }
}
