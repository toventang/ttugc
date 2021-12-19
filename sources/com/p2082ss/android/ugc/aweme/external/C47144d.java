package com.p2082ss.android.ugc.aweme.external;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.video.IActivityNameService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.external.d */
public final class C47144d implements IActivityNameService {

    /* renamed from: a */
    public static final AbstractC89244h f109767a = C89250i.m154773a((AbstractC89171a) C47146b.f109769a);

    /* renamed from: b */
    public static final C47145a f109768b = new C47145a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.external.d$a */
    public static final class C47145a {
        static {
            Covode.recordClassIndex(55749);
        }

        private C47145a() {
        }

        public /* synthetic */ C47145a(byte b) {
            this();
        }
    }

    private C47144d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getDraftBoxActivity() {
        return DraftBoxActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoEditActivityClass() {
        return VEVideoPublishEditActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoPublishActivityClass() {
        return VideoPublishActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoPublishPreviewActivityClass() {
        return VEVideoPublishPreviewActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordPermissionActivityClass() {
        return VideoRecordPermissionActivity.class;
    }

    /* renamed from: com.ss.android.ugc.aweme.external.d$b */
    static final class C47146b extends AbstractC89220m implements AbstractC89171a<C47144d> {

        /* renamed from: a */
        public static final C47146b f109769a = new C47146b();

        static {
            Covode.recordClassIndex(55750);
        }

        C47146b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47144d invoke() {
            return new C47144d((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(55748);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordActivityClass() {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return FTCVideoRecordNewActivity.class;
        }
        return VideoRecordNewActivity.class;
    }

    public /* synthetic */ C47144d(byte b) {
        this();
    }
}
