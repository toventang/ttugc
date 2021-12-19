package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81987b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.j */
public final class C49518j {

    /* renamed from: a */
    public static C81987b f113893a;

    /* renamed from: b */
    public static final C49518j f113894b = new C49518j();

    private C49518j() {
    }

    static {
        Covode.recordClassIndex(58332);
    }

    /* renamed from: a */
    public static final C81987b m92754a() {
        try {
            C81987b bVar = (C81987b) SettingsManager.m29616a().mo25396a("network_monitor_config", C81987b.class);
            if (bVar == null) {
                return new C81987b(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            }
            return bVar;
        } catch (Throwable unused) {
        }
    }
}
