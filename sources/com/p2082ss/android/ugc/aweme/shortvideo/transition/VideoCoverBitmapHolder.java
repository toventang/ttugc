package com.p2082ss.android.ugc.aweme.shortvideo.transition;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder */
public class VideoCoverBitmapHolder implements AbstractC33974au {

    /* renamed from: a */
    public static Bitmap f164604a;

    static {
        Covode.recordClassIndex(86014);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        if (f164604a != null) {
            f164604a = null;
        }
    }
}
