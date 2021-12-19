package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import p4600h.C89378p;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.m */
public final class C72402m {

    /* renamed from: a */
    static final C89378p<PointF, PointF> f162308a = new C89378p<>(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));

    static {
        Covode.recordClassIndex(85075);
    }

    /* renamed from: a */
    public static final AbstractC72352c m127682a(View view) {
        if (view == null || !(view instanceof AbstractC72352c)) {
            return null;
        }
        return (AbstractC72352c) view;
    }

    /* renamed from: a */
    public static final boolean m127683a(MediaModel mediaModel) {
        if (mediaModel == null || !mediaModel.mo96674b() || !m127684b(mediaModel) || C74002bq.m130147a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static final boolean m127684b(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        int b = C89271h.m154769b(mediaModel.f134672l, mediaModel.f134673m);
        int c = C89271h.m154772c(mediaModel.f134672l, mediaModel.f134673m);
        if (b >= 4096 || c >= 2160) {
            return true;
        }
        return false;
    }
}
