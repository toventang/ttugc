package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.g */
public final class C68359g extends C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> {
    static {
        Covode.recordClassIndex(80587);
    }

    public C68359g() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68359g.C683601 */

            static {
                Covode.recordClassIndex(80588);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr.length < 2 || objArr.length > 5) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = (String) objArr[0];
                final int intValue = ((Integer) objArr[1]).intValue();
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68359g.C683601.CallableC683611 */

                    static {
                        Covode.recordClassIndex(80589);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        if (objArr.length == 2) {
                            return PushSettingsApiManager.m120630b(str, intValue);
                        }
                        if (objArr.length == 3 && (objArr[2] instanceof Integer)) {
                            return PushSettingsApiManager.m120626a(str, intValue, ((Integer) objArr[2]).intValue());
                        }
                        if (objArr.length == 4) {
                            PushSettingsApiManager.m120630b(str, intValue);
                            Object[] objArr2 = objArr;
                            return PushSettingsApiManager.m120630b((String) objArr2[2], ((Integer) objArr2[3]).intValue());
                        } else if (objArr.length != 5) {
                            return PushSettingsApiManager.m120627a(str, intValue, (String) objArr[2]);
                        } else {
                            PushSettingsApiManager.m120626a(str, intValue, ((Integer) objArr[4]).intValue());
                            Object[] objArr3 = objArr;
                            return PushSettingsApiManager.m120630b((String) objArr3[2], ((Integer) objArr3[3]).intValue());
                        }
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
