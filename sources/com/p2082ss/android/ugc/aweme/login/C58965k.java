package com.p2082ss.android.ugc.aweme.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.live.AbstractC58646i;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.login.k */
public final /* synthetic */ class C58965k implements AbstractC68041bz.AbstractC68043a {

    /* renamed from: a */
    static final AbstractC68041bz.AbstractC68043a f134206a = new C58965k();

    static {
        Covode.recordClassIndex(69292);
    }

    private C58965k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz.AbstractC68043a
    /* renamed from: a */
    public final void mo96447a(C68174d dVar) {
        AbstractC58646i k = LiveOuterService.m107269s().mo95837k();
        if (k != null && k.mo95877a() != null) {
            k.mo95877a().mo95869a(SettingsManager.m29616a().mo25400a("can_be_live_podcast", false));
        }
    }
}
