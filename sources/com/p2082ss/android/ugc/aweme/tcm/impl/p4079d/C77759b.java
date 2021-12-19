package com.p2082ss.android.ugc.aweme.tcm.impl.p4079d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.d.b */
public final class C77759b {

    /* renamed from: a */
    public static final BrandedContentToolSchema f174378a = null;

    /* renamed from: b */
    public static final C77759b f174379b = new C77759b();

    private C77759b() {
    }

    static {
        Covode.recordClassIndex(90820);
    }

    /* renamed from: a */
    public static final BrandedContentToolSchema m135850a() {
        try {
            return (BrandedContentToolSchema) SettingsManager.m29616a().mo25397a("branded_content_tool_schema", BrandedContentToolSchema.class, f174378a);
        } catch (Exception unused) {
            return null;
        }
    }
}
