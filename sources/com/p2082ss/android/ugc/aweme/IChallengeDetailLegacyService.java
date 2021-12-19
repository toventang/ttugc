package com.p2082ss.android.ugc.aweme;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.IChallengeDetailLegacyService */
public interface IChallengeDetailLegacyService {
    static {
        Covode.recordClassIndex(37947);
    }

    /* renamed from: a */
    void mo57208a(Activity activity, Bundle bundle);

    /* renamed from: a */
    void mo57209a(Context context, String str);

    /* renamed from: a */
    void mo57210a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo57211a(ImageView imageView);

    /* renamed from: a */
    void mo57212a(String str, String str2, String str3, boolean z);
}
