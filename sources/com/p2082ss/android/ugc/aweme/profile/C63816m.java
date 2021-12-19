package com.p2082ss.android.ugc.aweme.profile;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.m */
final /* synthetic */ class C63816m implements AbstractC1214u {

    /* renamed from: a */
    private final C63810k f144666a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f144667b;

    static {
        Covode.recordClassIndex(75144);
    }

    C63816m(C63810k kVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f144666a = kVar;
        this.f144667b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C63810k kVar = this.f144666a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f144667b;
        Integer num = (Integer) obj;
        if (kVar.getActivity() != null && num != null && num.intValue() != 0 && C63810k.m115413a(kVar.f144641l)) {
            kVar.f144641l = kVar.mo102374a(kVar.f144641l, 0);
            AbstractC1214u<Integer> uVar = kVar.f144640k;
            C89219l.m154721d(uVar, "");
            scrollSwitchStateManager.f121763e.removeObserver(uVar);
            C29819a.m60077a("lazy_do_aweme_changed", new JSONObject());
        }
    }
}
