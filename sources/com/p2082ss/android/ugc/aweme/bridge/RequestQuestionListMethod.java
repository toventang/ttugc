package com.p2082ss.android.ugc.aweme.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.util.C80135k;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.RequestQuestionListMethod */
public final class RequestQuestionListMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private AbstractC88412b f82393b;

    /* renamed from: c */
    private final String f82394c = "requestQuestionList";

    static {
        Covode.recordClassIndex(41943);
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
        return this.f82394c;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC88412b bVar;
        AbstractC88412b bVar2 = this.f82393b;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f82393b) != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.RequestQuestionListMethod$a */
    static final class C34925a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82395a;

        static {
            Covode.recordClassIndex(41944);
        }

        C34925a(AbstractC16183k.AbstractC16185b bVar) {
            this.f82395a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C34927a.m71314a(this.f82395a, (JSONObject) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.RequestQuestionListMethod$b */
    static final class C34926b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82396a;

        static {
            Covode.recordClassIndex(41945);
        }

        C34926b(AbstractC16183k.AbstractC16185b bVar) {
            this.f82396a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C34927a.m71313a(this.f82396a, (Throwable) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestQuestionListMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        AbstractC88412b bVar2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        int optInt = jSONObject.optInt("count");
        int optInt2 = jSONObject.optInt("offset");
        String optString = jSONObject.optString("extra");
        boolean optBoolean = jSONObject.optBoolean("need_complete_aweme_list");
        boolean optBoolean2 = jSONObject.optBoolean("use_cache");
        AbstractC88412b bVar3 = this.f82393b;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar2 = this.f82393b) == null)) {
            bVar2.dispose();
        }
        this.f82393b = C80135k.m138901a(optInt, optInt2, optString, optBoolean, !optBoolean2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C34925a(bVar), new C34926b(bVar));
    }
}
