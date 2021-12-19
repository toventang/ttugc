package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.j */
public final class C68368j extends C39088c<AbstractC39085b<C68348f>, AbstractC68351c> {
    static {
        Covode.recordClassIndex(80596);
    }

    public C68368j() {
        mo67838a(new AbstractC39085b<C68348f>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j.C683691 */

            static {
                Covode.recordClassIndex(80597);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j.C683691.CallableC683701 */

                    static {
                        Covode.recordClassIndex(80598);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PushSettingsApiManager.m120628a();
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        if (this.f92286h != null && (t = this.f92286h.mData) != null && this.f92287i != null) {
            C36145b.m73641b().mo63265a(C17867d.m33078a(), "last_user_setting_version", t.f152946I);
            ((AbstractC68351c) this.f92287i).mo68831a((C68348f) t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC68351c) this.f92287i).mo68832a(exc);
        }
    }
}
