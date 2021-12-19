package com.p2082ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33794i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68359g;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68365i;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j;

/* renamed from: com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl */
public abstract class BaseSettingServiceImpl implements ISettingService {
    static {
        Covode.recordClassIndex(80654);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public String getReleaseBuildString() {
        return C33794i.m69145a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePrivateSettingChangePresenter() {
        return new C68359g();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePushSettingChangePresenter() {
        return new C68365i();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    public C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter() {
        return new C68368j();
    }
}
