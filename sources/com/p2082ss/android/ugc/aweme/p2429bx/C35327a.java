package com.p2082ss.android.ugc.aweme.p2429bx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71823d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73766c;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72595ac;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bx.a */
public final class C35327a implements AbstractC72725b {
    static {
        Covode.recordClassIndex(42495);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final boolean mo62198a(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        return C73766c.m129818a(intent).mo116239a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final Intent mo62189a(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        return MvChoosePhotoActivity.C72040a.m127135a(activity, bundle, 2, 1001);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: b */
    public final void mo62199b(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C84412c.m145201a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: c */
    public final void mo62201c(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C74007f.m130177c((Context) activity, intent);
        C84412c.m145201a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: e */
    public final void mo62204e(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        VEVideoPublishEditActivity.m125011a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62190a(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        intent.setClass(activity, VideoRecordPermissionActivity.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: c */
    public final void mo62202c(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        VEVideoPublishEditActivity.m125012a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: d */
    public final void mo62203d(Activity activity, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C74007f.m130177c((Context) activity, intent);
        C84412c.m145199a(activity, intent, 1002);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: b */
    public final void mo62200b(Context context, Intent intent) {
        Class<?> cls;
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            C71823d.m126815a();
            C72595ac.m128075a();
            C63244g.m114602a().mo73287o().mo104781a();
            C63244g.m114602a().mo73287o().mo104797q().mo104812a();
            cls = VideoPublishActivity.class;
        } else {
            cls = FTCVideoPublishActivity.class;
        }
        intent.setClass(context, cls);
        C84412c.m145201a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62191a(Activity activity, Intent intent, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C71823d.m126815a();
        C72595ac.m128075a();
        C63244g.m114602a().mo73287o().mo104781a();
        C63244g.m114602a().mo73287o().mo104797q().mo104812a();
        intent.setClass(activity, VideoPublishActivity.class);
        C84412c.m145199a(activity, intent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62192a(Activity activity, Intent intent, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        C63244g.m114602a().mo73275c().mo101846a(z);
        intent.setClass(activity, DraftBoxActivity.class);
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62195a(Activity activity, StitchParams stitchParams, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(stitchParams, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(stitchParams, "");
        Intent intent = new Intent();
        intent.setClass(activity, StitchTrimmingActivity.class);
        intent.putExtra("stitch_params", (Parcelable) stitchParams);
        if (str == null) {
            str = UUID.randomUUID().toString();
            C89219l.m154716b(str, "");
        }
        intent.putExtra("creation_id", str);
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62196a(Context context, Intent intent, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        VECutVideoActivity.C70013a.m123649a(context, intent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62193a(Activity activity, Bundle bundle, int i, int i2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        activity.startActivityForResult(MvChoosePhotoActivity.C72040a.m127135a(activity, bundle, i, i2), i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    public final void mo62194a(Activity activity, MediaModel mediaModel, Effect effect, ShortVideoCommonParams shortVideoCommonParams) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(mediaModel, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(mediaModel, "");
        C24413h e = C24428k.m46551a().mo40247e();
        C89219l.m154716b(e, "");
        e.f57868a.mo40200a(CustomStickerPreviewActivity.C56710a.C56711a.f129258a);
        Intent intent = new Intent();
        intent.setClass(activity, CustomStickerPreviewActivity.class);
        intent.putExtra("preview_sticker_params", mediaModel);
        if (!(effect instanceof Parcelable)) {
            effect = null;
        }
        intent.putExtra("custom_sticker", (Parcelable) effect);
        intent.putExtra("shoot_way", shortVideoCommonParams.shootWay);
        intent.putExtra("content_source", shortVideoCommonParams.contentSource);
        intent.putExtra("content_type", shortVideoCommonParams.contentType);
        intent.putExtra("creation_id", shortVideoCommonParams.creationId);
        activity.startActivityForResult(intent, 10004);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r1 != null) goto L_0x0033;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3854r.AbstractC72725b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62197a(android.content.Context r9, android.content.Intent r10, int r11, p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r12) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2429bx.C35327a.mo62197a(android.content.Context, android.content.Intent, int, h.f.a.a):void");
    }
}
