package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34913br;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.services.BasePasswordService */
public abstract class BasePasswordService implements AbstractC33974au, AbstractC34913br {
    private boolean mKeepCallback;
    private AbstractC1204m mLifeOwner;
    private IAccountService.AbstractC31277g mResult;

    static {
        Covode.recordClassIndex(79593);
    }

    public AbstractC34913br keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        AbstractC1204m mVar = this.mLifeOwner;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        IAccountService.AbstractC31277g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void setPassword(Activity activity, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }
}
