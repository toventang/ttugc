package com.p2082ss.android.ugc.aweme.miniapp.p3440a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C28022o;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.miniapp.a.b */
public final class C59267b {

    /* renamed from: a */
    public static final C28022o f135481a;

    /* renamed from: b */
    public static final C59267b f135482b = new C59267b();

    /* renamed from: c */
    private static final C28022o f135483c;

    private C59267b() {
    }

    /* renamed from: a */
    public static C28022o m108967a() {
        return (C28022o) SettingsManager.m29616a().mo25397a("resso_control_list", C28022o.class, f135481a);
    }

    static {
        Covode.recordClassIndex(69633);
        C28022o oVar = new C28022o();
        f135483c = oVar;
        C28022o oVar2 = new C28022o();
        oVar2.mo46801a(StringSet.name, "UMG");
        oVar2.mo46800a("show_interval_in_millSeconds", (Number) 86400000);
        oVar2.mo46800a("max_finish_count", (Number) 10);
        oVar.mo46797a("id1", oVar2);
        f135481a = oVar;
    }
}
