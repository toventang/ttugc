package com.p2082ss.android.ugc.aweme.services;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34930bs;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.services.BaseProAccountService */
public class BaseProAccountService implements AbstractC33974au, AbstractC34930bs {
    private AbstractC1204m mLifeOwner;
    private IAccountService.AbstractC31277g mResult;

    static {
        Covode.recordClassIndex(79594);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    public void switchBusinessAccount(String str, IAccountService.AbstractC31277g gVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34930bs
    public void switchProAccount(int i, String str, String str2, int i2, IAccountService.AbstractC31277g gVar) {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        AbstractC1204m mVar = this.mLifeOwner;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        IAccountService.AbstractC31277g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i, i2, obj);
        }
    }
}
