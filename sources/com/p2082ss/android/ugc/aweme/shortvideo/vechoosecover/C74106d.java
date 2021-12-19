package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.d */
final /* synthetic */ class C74106d implements AbstractC1214u {

    /* renamed from: a */
    private final ChooseCoverActivity f166381a;

    static {
        Covode.recordClassIndex(86859);
    }

    C74106d(ChooseCoverActivity chooseCoverActivity) {
        this.f166381a = chooseCoverActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f166381a.f166353h.setImageBitmap((Bitmap) obj);
    }
}
