package com.p2082ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.sdk.service.CommerceService;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.a */
public final class C37533a {

    /* renamed from: a */
    public static final C37533a f88654a = new C37533a();

    private C37533a() {
    }

    static {
        Covode.recordClassIndex(44925);
    }

    /* renamed from: a */
    public static final ICommerceService m75656a() {
        ICommerceService createICommerceServicebyMonsterPlugin = CommerceService.createICommerceServicebyMonsterPlugin(false);
        if (createICommerceServicebyMonsterPlugin == null) {
            return new EmptyCommerceService();
        }
        return createICommerceServicebyMonsterPlugin;
    }
}
