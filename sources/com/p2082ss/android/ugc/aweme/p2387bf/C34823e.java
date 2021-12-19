package com.p2082ss.android.ugc.aweme.p2387bf;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.bf.e */
public final /* synthetic */ class C34823e implements AbstractC52909a {

    /* renamed from: a */
    public static final AbstractC52909a f82260a = new C34823e();

    static {
        Covode.recordClassIndex(41831);
    }

    private C34823e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
    /* renamed from: a */
    public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
        MethodCollector.m26663i(1585);
        boolean z = false;
        SharedPreferences.Editor edit = C17867d.m33078a().getSharedPreferences("keva_switch_repo", 0).edit();
        if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
            z = true;
        }
        edit.putBoolean("keva_switch", z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist())).apply();
        iESSettingsProxy.getKevaBlacklist();
        MethodCollector.m26664o(1585);
    }
}
