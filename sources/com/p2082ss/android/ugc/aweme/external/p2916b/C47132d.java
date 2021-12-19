package com.p2082ss.android.ugc.aweme.external.p2916b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PhotoMvAnchorConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.StickerDownloadConfig;
import com.p2082ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.b.d */
public final class C47132d extends AbstractC47116c {
    static {
        Covode.recordClassIndex(55736);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public final void recordActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$a */
    public static final class C47133a implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ C47132d f109752a;

        /* renamed from: b */
        final /* synthetic */ StickerDownloadConfig f109753b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f109754c;

        /* renamed from: d */
        final /* synthetic */ Context f109755d;

        static {
            Covode.recordClassIndex(55737);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            AbstractC89171a<C89391z> onSuccess = this.f109753b.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
            Intent a = C47132d.m90334a(this.f109754c);
            if (effect2 != null) {
                a.putExtra("reuse_mvtheme_enter", true);
                a.putExtra("extra_bind_mv_id", effect2.getEffectId());
                Objects.requireNonNull(effect2, "null cannot be cast to non-null type android.os.Parcelable");
                a.putExtra("extra_mv_effect", (Parcelable) effect2);
            }
            AbstractC89171a<C89391z> onSuccess2 = this.f109753b.getOnSuccess();
            if (onSuccess2 != null) {
                onSuccess2.invoke();
            }
            this.f109752a.f109706a.mo70083a((C69905c) null);
            this.f109752a.f109706a.mo110456f();
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f109755d, a);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            AbstractC89172b<Integer, C89391z> onFail = this.f109753b.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
            }
        }

        C47133a(C47132d dVar, StickerDownloadConfig stickerDownloadConfig, RecordConfig recordConfig, Context context) {
            this.f109752a = dVar;
            this.f109753b = stickerDownloadConfig;
            this.f109754c = recordConfig;
            this.f109755d = context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public final void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(stickerDownloadConfig, "");
        if (!TextUtils.isEmpty(stickerDownloadConfig.getStickerId())) {
            m90338a(context, stickerDownloadConfig, new C47133a(this, stickerDownloadConfig, recordConfig, context));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public final void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(photoMvAnchorConfig, "");
        this.f109706a.mo70083a((C69905c) null);
        this.f109706a.mo110456f();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChoosePhotoActivity((Activity) context, m90334a(recordConfig), photoMvAnchorConfig);
    }
}
