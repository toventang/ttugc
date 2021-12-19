package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.cf */
public enum EnumC35462cf {
    GUEST_MODE_ENABLED("guest_mode", new C40883cy(AccountExperimentLayerServiceImpl.m65977b().mo57061a(), 10), true, C354631.f83643a),
    DEPRIORITIZE_VK("deprioritize_vk", new C40883cy(AccountExperimentLayerServiceImpl.m65977b().mo57061a(), 100), true, C354642.f83644a),
    MAKE_LOGIN_PAGE_DEFAULT("make_login_page_default", new C40883cy(AccountExperimentLayerServiceImpl.m65977b().mo57061a(), 100), false, C354653.f83645a);
    

    /* renamed from: b */
    private final String f83639b;

    /* renamed from: c */
    private final C40883cy f83640c;

    /* renamed from: d */
    private final boolean f83641d;

    /* renamed from: e */
    private final AbstractC89171a<Boolean> f83642e;

    public final String getId() {
        return this.f83639b;
    }

    public final boolean getNewUserOnly() {
        return this.f83641d;
    }

    public final C40883cy getPercentAllocation() {
        return this.f83640c;
    }

    public final AbstractC89171a<Boolean> getShouldFilterProvider() {
        return this.f83642e;
    }

    static {
        Covode.recordClassIndex(42647);
    }

    private EnumC35462cf(String str, C40883cy cyVar, boolean z, AbstractC89171a aVar) {
        this.f83639b = str;
        this.f83640c = cyVar;
        this.f83641d = z;
        this.f83642e = aVar;
    }
}
