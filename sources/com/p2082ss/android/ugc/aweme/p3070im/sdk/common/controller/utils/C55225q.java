package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q */
public final class C55225q {
    static {
        Covode.recordClassIndex(64972);
    }

    /* renamed from: a */
    public static boolean m100990a(String str) {
        if (str == null || !str.toLowerCase().equals("gif")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m100991b(String str) {
        if (str == null || !str.toLowerCase().equals("webp")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m100988a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m100989a(remoteImageView, urlModel, i, i2, null);
    }

    /* renamed from: a */
    public static void m100989a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, AbstractC24641d dVar) {
        C24246a aVar;
        if (remoteImageView != null && remoteImageView.getContext() != null) {
            if (!remoteImageView.hasHierarchy()) {
                aVar = new C24247b(remoteImageView.getContext().getResources()).mo39973a();
            } else {
                aVar = (C24246a) remoteImageView.getHierarchy();
            }
            aVar.mo39966c(i2);
            aVar.mo39970d(i);
            remoteImageView.setHierarchy(aVar);
            C55198a.m100931a(remoteImageView, urlModel, dVar);
        }
    }
}
