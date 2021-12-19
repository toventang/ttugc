package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.m */
final /* synthetic */ class C68593m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153462a;

    static {
        Covode.recordClassIndex(80849);
    }

    C68593m(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153462a = i18nSettingNewVersionActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153462a;
        if (((C68546a) i18nSettingNewVersionActivity.f153530o.f95762k).f153374k != null) {
            ((C68546a) i18nSettingNewVersionActivity.f153530o.f95762k).f153374k.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
        }
    }
}
