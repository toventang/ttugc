package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47940a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod */
public final class LoadFeedsMethod extends BaseBridgeMethod implements AbstractC33974au, AbstractC47950a {

    /* renamed from: c */
    public static final C35066a f82738c = new C35066a((byte) 0);

    /* renamed from: b */
    public String f82739b = "";

    /* renamed from: d */
    private final String f82740d = "loadFeeds";

    /* renamed from: e */
    private final AbstractC89244h f82741e = C89250i.m154773a((AbstractC89171a) new C35067b(this));

    static {
        Covode.recordClassIndex(42187);
    }

    /* renamed from: g */
    private final C47940a m71681g() {
        return (C47940a) this.f82741e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod$a */
    public static final class C35066a {
        static {
            Covode.recordClassIndex(42188);
        }

        private C35066a() {
        }

        public /* synthetic */ C35066a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82740d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod$b */
    static final class C35067b extends AbstractC89220m implements AbstractC89171a<C47940a> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsMethod f82742a;

        static {
            Covode.recordClassIndex(42189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35067b(LoadFeedsMethod loadFeedsMethod) {
            super(0);
            this.f82742a = loadFeedsMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47940a invoke() {
            return C47940a.C47941a.m90937a(new C47953a(), this.f82742a.f82739b, this.f82742a);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        super.mo25721a();
        m71681g().f111047a.dispose();
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.w0, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadFeedsMethod(C16248b bVar) {
        super(bVar);
        AbstractC1196i lifecycle;
        C89219l.m154721d(bVar, "");
        Context e = mo26893e();
        AbstractC1204m mVar = (AbstractC1204m) (!(e instanceof AbstractC1204m) ? null : e);
        if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a
    /* renamed from: b */
    public final void mo61900b(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        mo61865a(str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        int i = 1;
        boolean z = false;
        if (jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            String optString = jSONObject.optString("react_id");
            C89219l.m154716b(optString, "");
            this.f82739b = optString;
            String optString2 = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            m71681g().mData.f111066a.clear();
            C47940a g = m71681g();
            C89219l.m154716b(optString2, "");
            Context e = mo26893e();
            Objects.requireNonNull(e, "null cannot be cast to non-null type android.app.Activity");
            g.mo79955a(optString2, optInt, optInt2, (Activity) e);
            z = true;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject2.put("code", i);
        aVar.mo61874a(jSONObject2);
    }
}
