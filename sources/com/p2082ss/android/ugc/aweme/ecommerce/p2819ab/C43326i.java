package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.i */
public final class C43326i {

    /* renamed from: a */
    public static final C43322e f101116a = new C43322e((byte) 0);

    /* renamed from: b */
    public static final C43326i f101117b = new C43326i();

    private C43326i() {
    }

    /* renamed from: a */
    public static final int m86444a() {
        return m86445b().f101103b * 1000;
    }

    static {
        Covode.recordClassIndex(51540);
    }

    /* renamed from: b */
    public static final C43322e m86445b() {
        SettingsManager a = SettingsManager.m29616a();
        C43322e eVar = f101116a;
        C43322e eVar2 = (C43322e) a.mo25397a("ecom_pdp_settings_config", C43322e.class, eVar);
        return eVar2 == null ? eVar : eVar2;
    }
}
