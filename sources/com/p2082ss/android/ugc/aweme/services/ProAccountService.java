package com.p2082ss.android.ugc.aweme.services;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p2082ss.android.ugc.aweme.account.base.ExecutorC31589a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.services.ProAccountService */
public class ProAccountService extends BaseProAccountService implements AbstractC33974au {
    static {
        Covode.recordClassIndex(79709);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseProAccountService, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseProAccountService
    public void switchBusinessAccount(String str, final IAccountService.AbstractC31277g gVar) {
        super.switchBusinessAccount(str, gVar);
        C27646l.m55298a(AccountApiInModule.f75517b.switchBusinessAccount(str), new AbstractC27645k<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.services.ProAccountService.C678732 */

            static {
                Covode.recordClassIndex(79711);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public void onFailure(Throwable th) {
                IAccountService.AbstractC31277g gVar = gVar;
                if (gVar != null) {
                    gVar.onResult(14, 3, null);
                }
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (gVar != null) {
                    if (baseResponse == null || baseResponse.status_code != 0) {
                        gVar.onResult(14, 3, null);
                    } else {
                        gVar.onResult(14, 1, null);
                    }
                }
            }
        }, ExecutorC31589a.f75546a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseProAccountService, com.p2082ss.android.ugc.aweme.AbstractC34930bs
    public void switchProAccount(int i, String str, String str2, int i2, final IAccountService.AbstractC31277g gVar) {
        super.switchProAccount(i, str, str2, i2, gVar);
        C27646l.m55298a(AccountApiInModule.f75517b.switchProAccount(i, str, str2, i2), new AbstractC27645k<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.services.ProAccountService.C678721 */

            static {
                Covode.recordClassIndex(79710);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public void onFailure(Throwable th) {
                IAccountService.AbstractC31277g gVar = gVar;
                if (gVar != null) {
                    gVar.onResult(14, 3, null);
                }
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (gVar != null) {
                    if (baseResponse == null || baseResponse.status_code != 0) {
                        gVar.onResult(14, 3, null);
                    } else {
                        gVar.onResult(14, 1, null);
                    }
                }
            }
        }, ExecutorC31589a.f75546a);
    }
}
