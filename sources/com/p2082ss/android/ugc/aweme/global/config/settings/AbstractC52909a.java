package com.p2082ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.a */
public interface AbstractC52909a {
    static {
        Covode.recordClassIndex(62317);
    }

    /* renamed from: a */
    void mo61665a(IESSettingsProxy iESSettingsProxy);

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.a$a */
    public static class C52910a implements AbstractC52909a {

        /* renamed from: a */
        AbstractC52909a f121683a;

        static {
            Covode.recordClassIndex(62318);
        }

        C52910a(AbstractC52909a aVar) {
            this.f121683a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
        /* renamed from: a */
        public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
            AbstractC52909a aVar = this.f121683a;
            if (aVar != null) {
                aVar.mo61665a(iESSettingsProxy);
            }
        }
    }
}
