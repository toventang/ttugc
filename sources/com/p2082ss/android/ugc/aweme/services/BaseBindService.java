package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34877bj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.bean.C31594a;
import com.p2082ss.android.ugc.aweme.account.bean.C31595b;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import java.util.ArrayList;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.services.BaseBindService */
public abstract class BaseBindService implements AbstractC33974au, AbstractC34877bj {
    private boolean mKeepCallback;
    private AbstractC1204m mLifeOwner;
    private IAccountService.AbstractC31277g mResult;

    static {
        Covode.recordClassIndex(79588);
    }

    public void bind(ActivityC0218d dVar, C31594a aVar, AbstractC34877bj.AbstractC34878a aVar2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
    }

    public void checkVcdPhoneRequired(AbstractC27235f<Boolean, C89391z> fVar) {
    }

    public C31595b getBindToken(Context context, C31594a aVar) {
        return null;
    }

    public AbstractC34877bj keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public void syncAllVideos(Context context, C31594a aVar, AbstractC34877bj.AbstractC34878a aVar2) {
    }

    public void unBind(Context context, C31594a aVar, AbstractC34877bj.AbstractC34878a aVar2) {
    }

    public void unBindWithApi(Context context, C31594a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
    }

    public boolean hasPlatformBound() {
        return C30223b.f72086a.mo53667a();
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

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, AuthorizeActivity.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public boolean isPlatformBound(String str) {
        return C30223b.f72086a.mo53668a(str);
    }

    public void returnResult(int i, int i2, Object obj) {
        IAccountService.AbstractC31277g gVar = this.mResult;
        if (gVar != null) {
            gVar.onResult(i, i2, obj);
        }
        this.mResult = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof AbstractC1204m)) {
            AbstractC1204m mVar = (AbstractC1204m) activity;
            this.mLifeOwner = mVar;
            mVar.getLifecycle().mo4012a(this);
        }
        this.mKeepCallback = false;
    }
}
