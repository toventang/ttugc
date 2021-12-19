package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PhotoMvAnchorConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl */
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion(null);
    public static final AbstractC89244h INSTANCE$delegate = C89250i.m154773a((AbstractC89171a) VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(80034);
        }

        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return (VideoRecordEntranceServiceImpl) VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private VideoRecordEntranceServiceImpl() {
    }

    static {
        Covode.recordClassIndex(80033);
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(C89214g gVar) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startChangeBanMusicEditActivity(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C72724a.m128203a().mo62202c(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Activity activity, Intent intent) {
        C63238c.f143570H.mo101685a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(activity, intent));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        if (TextUtils.isEmpty(C74007f.m130159a(intent, "shoot_way"))) {
            intent.putExtra("shoot_way", "super_entrance");
        }
        intent.putExtra("translation_type", 3);
        C74007f.m130161a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Context context, Intent intent) {
        C63238c.f143570H.mo101685a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(context, intent));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startChoosePhotoActivity(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(photoMvAnchorConfig, "");
        C63238c.f143570H.mo101685a(new VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1(activity, intent, photoMvAnchorConfig));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        C63238c.f143570H.mo101685a(new VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(context, intent, z, z2, z3));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C63238c.f143570H.mo101685a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(activity, intent, z, z2, z3));
    }
}
