package com.p2082ss.android.ugc.aweme.shoutouts;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.f */
public final class C74424f {

    /* renamed from: a */
    public static final C74424f f167368a = new C74424f();

    private C74424f() {
    }

    static {
        Covode.recordClassIndex(87202);
    }

    /* renamed from: a */
    public static String m130880a() {
        return C63244g.m114602a().mo73279g().mo69470c().mo69477c("shoutout");
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.f$a */
    static final class C74425a<T> implements AbstractC1214u {

        /* renamed from: a */
        public static final C74425a f167369a = new C74425a();

        static {
            Covode.recordClassIndex(87203);
        }

        C74425a() {
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C51423a.m95787a("receive prepare done event in publish preview page");
        }
    }

    /* renamed from: a */
    public static boolean m130882a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mShoutOutsData == null) {
            return false;
        }
        return C89219l.m154714a((Object) videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), (Object) C74418d.MODE_SEND);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130881a(androidx.appcompat.app.ActivityC0218d r13, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, dmt.p4542av.video.C88303z r15, androidx.lifecycle.C1205n r16, android.view.SurfaceView r17) {
        /*
        // Method dump skipped, instructions count: 704
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shoutouts.C74424f.m130881a(androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, dmt.av.video.z, androidx.lifecycle.n, android.view.SurfaceView):void");
    }
}
