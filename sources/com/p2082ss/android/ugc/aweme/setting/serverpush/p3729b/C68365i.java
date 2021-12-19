package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.i */
public final class C68365i extends C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> {
    static {
        Covode.recordClassIndex(80593);
    }

    public C68365i() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68365i.C683661 */

            static {
                Covode.recordClassIndex(80594);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 2) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = (String) objArr[0];
                final int intValue = ((Integer) objArr[1]).intValue();
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68365i.C683661.CallableC683671 */

                    static {
                        Covode.recordClassIndex(80595);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PushSettingsApiManager.m120625a(str, intValue);
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92286h.mData != null && this.f92287i != null) {
            ((AbstractC68350b) this.f92287i).aD_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC68350b) this.f92287i).cm_();
        }
    }
}
