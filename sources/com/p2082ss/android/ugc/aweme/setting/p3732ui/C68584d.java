package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.d */
final /* synthetic */ class C68584d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153453a;

    static {
        Covode.recordClassIndex(80840);
    }

    C68584d(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153453a = i18nSettingNewVersionActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f153453a;
        if (((C68546a) i18nSettingNewVersionActivity.f153530o.f95762k).f153374k != null) {
            ((C68546a) i18nSettingNewVersionActivity.f153530o.f95762k).f153374k.setAlpha(255 - ((int) (valueAnimator.getAnimatedFraction() * 255.0f)));
        }
    }
}
