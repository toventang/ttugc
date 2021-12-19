package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import androidx.core.graphics.drawable.C0708d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78103d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.em */
public final /* synthetic */ class RunnableC73643em implements Runnable {

    /* renamed from: a */
    private final C73560cj f165471a;

    /* renamed from: b */
    private final String f165472b;

    static {
        Covode.recordClassIndex(86381);
    }

    RunnableC73643em(C73560cj cjVar, String str) {
        this.f165471a = cjVar;
        this.f165472b = str;
    }

    public final void run() {
        C73560cj cjVar = this.f165471a;
        String str = this.f165472b;
        int width = cjVar.f165346u.getWidth();
        Bitmap a = C78103d.m136526a(str, width, (int) (((float) width) / ((((float) cjVar.f165268K.videoWidth()) * 1.0f) / ((float) cjVar.f165268K.videoHeight()))));
        if (a != null && cjVar.isAdded()) {
            cjVar.f165346u.setImageDrawable(C0708d.m2514a(cjVar.requireActivity().getResources(), cjVar.f165268K.getCoverPublishModel().getEffectTextModel().mergeCoverText(a)));
        }
    }
}
