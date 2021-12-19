package com.p2082ss.android.ugc.aweme.publish.p3624h;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65513c;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65604d;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69787n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73789r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72588aa;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72692z;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.c */
public final class C65634c implements AbstractC65604d {

    /* renamed from: a */
    private final AbstractC89244h f147955a = C89250i.m154773a((AbstractC89171a) C65635a.f147956a);

    static {
        Covode.recordClassIndex(77125);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.c$a */
    static final class C65635a extends AbstractC89220m implements AbstractC89171a<C65633b> {

        /* renamed from: a */
        public static final C65635a f147956a = new C65635a();

        static {
            Covode.recordClassIndex(77126);
        }

        C65635a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65633b invoke() {
            return new C65633b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65604d
    /* renamed from: a */
    public final AbstractC65513c mo104772a() {
        return (C65633b) this.f147955a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.c$b */
    static final class C65636b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f147957a;

        /* renamed from: b */
        final /* synthetic */ int f147958b = 1;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f147959c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f147960d;

        static {
            Covode.recordClassIndex(77127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65636b(VideoPublishEditModel videoPublishEditModel, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(0);
            this.f147957a = videoPublishEditModel;
            this.f147959c = bVar;
            this.f147960d = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            final C43223c a = C73560cj.m129685a(this.f147957a);
            C89219l.m154716b(a, "");
            C70005cr.m123611a().f156496p = a.mo73726r();
            C69787n.m123312a(new AbstractC69783m.C69786c(a, this.f147958b, this.f147957a, new IDraftService.DraftSaveListener(this) {
                /* class com.p2082ss.android.ugc.aweme.publish.p3624h.C65634c.C65636b.C656371 */

                /* renamed from: a */
                final /* synthetic */ C65636b f147961a;

                static {
                    Covode.recordClassIndex(77128);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveSuccess() {
                    C63244g.m114602a().mo73275c().mo101844a(a, true);
                    C63238c.f143566D.mo73308d().mo101651a().mo101660b(a);
                    Application application = C63238c.f143574a;
                    C89219l.m154716b(application, "");
                    if (application != null) {
                        new C72692z(application, new C72588aa(application, this.f147961a.f147957a)).mo114966a(a);
                    }
                    this.f147961a.f147959c.invoke(a);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                    C89219l.m154721d(draftSaveResult, "");
                    this.f147961a.f147960d.invoke(draftSaveResult);
                }

                {
                    this.f147961a = r1;
                }
            }));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65604d
    /* renamed from: a */
    public final void mo104773a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C73789r.m129848a(videoPublishEditModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65604d
    /* renamed from: a */
    public final void mo104774a(VideoPublishEditModel videoPublishEditModel, AbstractC89172b<? super C43223c, C89391z> bVar, AbstractC89172b<? super DraftSaveResult, C89391z> bVar2) {
        int i;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        Application application = C63238c.f143574a;
        C89219l.m154716b(application, "");
        C65636b bVar3 = new C65636b(videoPublishEditModel, bVar, bVar2);
        if (!videoPublishEditModel.isMultiVideoEdit()) {
            bVar3.invoke();
        } else if (C84902i.m145892a(videoPublishEditModel.multiEditVideoRecordData.coverImagePath)) {
            bVar3.invoke();
        } else {
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            C89219l.m154716b(curMultiEditVideoRecordData, "");
            VERecordData a = C71493a.m126273a(curMultiEditVideoRecordData);
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel.getCurMultiEditVideoRecordData();
            C89219l.m154716b(curMultiEditVideoRecordData2, "");
            Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
            C89219l.m154716b(playInOutTime, "");
            a.mo130356a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            int i2 = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000.0f);
            if (videoPublishEditModel.isUseTimeReverseEffect()) {
                int intValue = ((Number) playInOutTime.second).intValue();
                Object obj = playInOutTime.first;
                C89219l.m154716b(obj, "");
                i = (intValue - ((Number) obj).intValue()) - i2;
            } else {
                i = i2;
            }
            int dimensionPixelOffset = application.getResources().getDimensionPixelOffset(R.dimen.j6);
            VEUtils.getVideoThumb(a, i, dimensionPixelOffset, (int) (((float) dimensionPixelOffset) / ((((float) videoPublishEditModel.videoWidth()) * 1.0f) / ((float) videoPublishEditModel.videoHeight()))), false, new C65638c(videoPublishEditModel, application, bVar3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.c$c */
    static final class C65638c implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f147963a;

        /* renamed from: b */
        final /* synthetic */ Context f147964b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f147965c;

        static {
            Covode.recordClassIndex(77129);
        }

        C65638c(VideoPublishEditModel videoPublishEditModel, Context context, AbstractC89171a aVar) {
            this.f147963a = videoPublishEditModel;
            this.f147964b = context;
            this.f147965c = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(6664);
            C89219l.m154721d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = this.f147963a.getCoverPublishModel().getEffectTextModel();
            C89219l.m154716b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            AbstractC0706b a = C0708d.m2514a(this.f147964b.getResources(), mergeCoverText);
            C89219l.m154716b(a, "");
            a.mo2738a(C13628n.m24520b(C63238c.f143574a, 4.0f));
            if (TextUtils.isEmpty(this.f147963a.multiEditVideoRecordData.coverImagePath)) {
                this.f147963a.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
            }
            String str = this.f147963a.multiEditVideoRecordData.coverImagePath;
            C89219l.m154716b(str, "");
            C71429d.m126155a(mergeCoverText, str);
            this.f147965c.invoke();
            MethodCollector.m26664o(6664);
            return false;
        }
    }
}
