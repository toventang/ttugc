package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46872eb;
import com.p2082ss.android.ugc.aweme.experiment.C46967gd;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.shortcut.C69712e;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.m */
public final class C68813m extends AbstractC68806f {
    static {
        Covode.recordClassIndex(81090);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.AbstractC68806f
    /* renamed from: b */
    public final void mo109263b(final IESSettingsProxy iESSettingsProxy) {
        SettingsRequestServiceImpl.m65417i().mo57275a(C17873f.m33102j());
        if (C46872eb.f109220d || C46967gd.m90247a()) {
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.settingsrequest.C68813m.RunnableC688141 */

                static {
                    Covode.recordClassIndex(81091);
                }

                public final void run() {
                    C60180e.f137181g.mo97853a();
                }
            }, 16);
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.settingsrequest.C68813m.RunnableC688152 */

                static {
                    Covode.recordClassIndex(81092);
                }

                public final void run() {
                    C39223a.m79588b().mo68593a(iESSettingsProxy);
                }
            }, 32);
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.settingsrequest.C68813m.RunnableC688163 */

                static {
                    Covode.recordClassIndex(81093);
                }

                public final void run() {
                    C69712e.m123124a(true);
                }
            }, 48);
            return;
        }
        C60180e.f137181g.mo97853a();
        C39223a.m79588b().mo68593a(iESSettingsProxy);
        C69712e.m123124a(true);
    }
}
