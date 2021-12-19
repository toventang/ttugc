package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.e */
public final class C68353e extends C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> {
    static {
        Covode.recordClassIndex(80581);
    }

    public C68353e() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68353e.C683541 */

            static {
                Covode.recordClassIndex(80582);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final int intValue = ((Integer) objArr[0]).intValue();
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68353e.C683541.CallableC683551 */

                    static {
                        Covode.recordClassIndex(80583);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PushSettingsApiManager.m120629b(intValue);
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
