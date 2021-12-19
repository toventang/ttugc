package com.p2082ss.android.ugc.aweme.node;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.AbstractC15498b;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.node.a */
public final class C61522a extends AbstractC15498b {

    /* renamed from: a */
    public final ActivityC0945e f139656a;

    static {
        Covode.recordClassIndex(72188);
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: b */
    public final boolean mo25228b() {
        return true;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return C34792be.f82124c;
    }

    public C61522a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f139656a = eVar;
        mo25225a(new MainPageNode(eVar));
        mo25225a(new ProfilePageNode(eVar));
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: a */
    public final void mo25226a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        ScrollSwitchStateManager.C52950a.m97811a(this.f139656a).mo89342a(str, bundle.getBoolean(C34792be.f82127f, false));
    }
}
