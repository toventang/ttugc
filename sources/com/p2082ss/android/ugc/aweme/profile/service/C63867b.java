package com.p2082ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.service.b */
public final class C63867b implements AbstractC63870e {

    /* renamed from: a */
    public static final C63867b f144793a = new C63867b();

    /* renamed from: b */
    private final /* synthetic */ AbstractC63870e f144794b = C63873h.f144797a.bridgeService();

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void checkToTransformMusDraft() {
        this.f144794b.checkToTransformMusDraft();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC63985aq createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3) {
        return this.f144794b.createAwemeListFragment(i, i2, str, str2, z, z2, z3);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC34586a createMyProfileFragment() {
        return this.f144794b.createMyProfileFragment();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void enterMyFavorites(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        this.f144794b.enterMyFavorites(activity, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final AbstractC63744f getBulletABHelper() {
        return this.f144794b.getBulletABHelper();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final boolean needShowSafeInfoNotice() {
        return this.f144794b.needShowSafeInfoNotice();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void onFeedStop() {
        this.f144794b.onFeedStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final boolean shouldShowI18nRecommendUserDialogOnMyPrifile() {
        return this.f144794b.shouldShowI18nRecommendUserDialogOnMyPrifile();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void startThirdSocialActivity(Context context, User user, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        this.f144794b.startThirdSocialActivity(context, user, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63870e
    public final void switchToBioUrl(Activity activity, String str) {
        this.f144794b.switchToBioUrl(activity, str);
    }

    static {
        Covode.recordClassIndex(75292);
    }

    private C63867b() {
    }
}
