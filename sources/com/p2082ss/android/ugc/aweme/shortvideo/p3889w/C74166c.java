package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69903by;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c */
public final class C74166c implements AbstractC74163b {

    /* renamed from: a */
    public static final C74166c f166567a = new C74166c();

    private C74166c() {
    }

    static {
        Covode.recordClassIndex(86925);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74163b
    /* renamed from: a */
    public final long mo116636a(CameraComponentModel cameraComponentModel) {
        long j;
        long j2;
        C89219l.m154721d(cameraComponentModel, "");
        if (cameraComponentModel.f155664t) {
            j = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();
        } else {
            j = 15000;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        String str = cameraComponentModel.f155669y;
        if (cVar == null || str == null || str.length() == 0) {
            j2 = cameraComponentModel.f155651g;
        } else {
            j = Math.min(j, C69903by.m123467a(cVar, str));
            j2 = cameraComponentModel.f155651g;
        }
        return j - j2;
    }
}
