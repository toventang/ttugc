package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16463f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod */
public final class ComponentDidMountMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35060a f82724b = new C35060a((byte) 0);

    /* renamed from: c */
    private final String f82725c = "componentDidMount";

    static {
        Covode.recordClassIndex(42175);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod$a */
    public static final class C35060a {
        static {
            Covode.recordClassIndex(42176);
        }

        private C35060a() {
        }

        public /* synthetic */ C35060a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82725c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentDidMountMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (mo61868i() != EnumC16723b.WEB && (mo61867h() instanceof AbstractC16463f)) {
            AbstractC16208i h = mo61867h();
            Objects.requireNonNull(h, "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitContainerApi");
            ((AbstractC16463f) h).mo26114m();
        }
    }
}
