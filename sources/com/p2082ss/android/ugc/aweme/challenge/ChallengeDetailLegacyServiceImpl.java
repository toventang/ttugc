package com.p2082ss.android.ugc.aweme.challenge;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33920b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.utils.C80232az;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl */
public class ChallengeDetailLegacyServiceImpl implements IChallengeDetailLegacyService {
    static {
        Covode.recordClassIndex(42666);
    }

    /* renamed from: a */
    public static IChallengeDetailLegacyService m72544a() {
        MethodCollector.m26663i(7559);
        Object a = C81908b.m141854a(IChallengeDetailLegacyService.class, false);
        if (a != null) {
            IChallengeDetailLegacyService iChallengeDetailLegacyService = (IChallengeDetailLegacyService) a;
            MethodCollector.m26664o(7559);
            return iChallengeDetailLegacyService;
        }
        if (C81908b.f183141X == null) {
            synchronized (IChallengeDetailLegacyService.class) {
                try {
                    if (C81908b.f183141X == null) {
                        C81908b.f183141X = new ChallengeDetailLegacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7559);
                    throw th;
                }
            }
        }
        ChallengeDetailLegacyServiceImpl challengeDetailLegacyServiceImpl = (ChallengeDetailLegacyServiceImpl) C81908b.f183141X;
        MethodCollector.m26664o(7559);
        return challengeDetailLegacyServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService
    /* renamed from: a */
    public final void mo57211a(ImageView imageView) {
        imageView.setImageResource(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService
    /* renamed from: a */
    public final void mo57208a(Activity activity, Bundle bundle) {
        HeaderDetailActivity.m115631a(activity, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService
    /* renamed from: a */
    public final void mo57209a(Context context, String str) {
        C33920b.m69459a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService
    /* renamed from: a */
    public final void mo57212a(String str, String str2, String str3, boolean z) {
        C67446h.f151111a.mo106204a(str, str2, str3, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService
    /* renamed from: a */
    public final void mo57210a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        C80232az.m139069a(viewGroup, imageView, textView, i, i2, z, z2, animatorListenerAdapter);
    }
}
