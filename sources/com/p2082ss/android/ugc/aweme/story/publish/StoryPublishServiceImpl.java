package com.p2082ss.android.ugc.aweme.story.publish;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.p2082ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.story.draft.C76726b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77023d;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.publish.foreground.C77443a;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77409c;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl */
public final class StoryPublishServiceImpl implements IStoryPublishService {
    static {
        Covode.recordClassIndex(90418);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isStoryPublishing() {
        return C77390a.m135329b();
    }

    /* renamed from: a */
    public static IStoryPublishService m135314a() {
        MethodCollector.m26663i(5556);
        Object a = C81908b.m141854a(IStoryPublishService.class, false);
        if (a != null) {
            IStoryPublishService iStoryPublishService = (IStoryPublishService) a;
            MethodCollector.m26664o(5556);
            return iStoryPublishService;
        }
        if (C81908b.f183384en == null) {
            synchronized (IStoryPublishService.class) {
                try {
                    if (C81908b.f183384en == null) {
                        C81908b.f183384en = new StoryPublishServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5556);
                    throw th;
                }
            }
        }
        StoryPublishServiceImpl storyPublishServiceImpl = (StoryPublishServiceImpl) C81908b.f183384en;
        MethodCollector.m26664o(5556);
        return storyPublishServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void addPublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        C77023d.f172808a.add(iStoryPublishAnimateListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final AbstractC72685x getState(String str) {
        C89219l.m154721d(str, "");
        return C77390a.m135328b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishAnimateListener(IStoryPublishAnimateListener iStoryPublishAnimateListener) {
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        C89219l.m154721d(iStoryPublishAnimateListener, "");
        C77023d.f172808a.remove(iStoryPublishAnimateListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void removePublishTask(String str) {
        C89219l.m154721d(str, "");
        C72479d.m127866a(C72477c.f162474a).mo114743e();
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C77388a(str, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl$a */
    static final class C77388a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f173636a;

        /* renamed from: b */
        final /* synthetic */ String f173637b;

        static {
            Covode.recordClassIndex(90419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77388a(String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f173637b = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77388a(this.f173637b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77388a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            BaseShortVideoContext baseShortVideoContext;
            String str;
            if (this.f173636a == 0) {
                C89382r.m154942a(obj);
                C72678q c = C77390a.m135331c(this.f173637b);
                VideoPublishEditModel videoPublishEditModel = null;
                if (c != null) {
                    baseShortVideoContext = c.f162938k;
                } else {
                    baseShortVideoContext = null;
                }
                if (baseShortVideoContext instanceof VideoPublishEditModel) {
                    videoPublishEditModel = baseShortVideoContext;
                }
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (!(videoPublishEditModel2 == null || (str = videoPublishEditModel2.sessionId) == null)) {
                    C89219l.m154716b(str, "");
                    C43223c a = C76726b.m134303a(str);
                    if (a != null) {
                        C76726b.m134308a(a);
                        C43225d.m86337g(a);
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean isPublishing(Context context) {
        C89219l.m154721d(context, "");
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        if ((!publishService.isParallelPublishEnabled() || publishService.isParallelPublishTaskFinished()) && !isStoryPublishing()) {
            C70005cr.m123611a();
            if (C70005cr.m123616g()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean retryPublish(String str) {
        C89219l.m154721d(str, "");
        C77409c d = C77390a.m135334d(str);
        if (d != null) {
            d.f173688e.putBoolean("publish_retry", true);
        }
        boolean a = C77390a.m135327a(str);
        if (a) {
            C89219l.m154721d(str, "");
            C77409c cVar = C77390a.f173641d.get(str);
            if (cVar != null) {
                C77390a.m135325a(new C77443a(C89070n.m154516a(new ScheduleInfo(cVar.f173687d, cVar.f173688e))), str, false);
            }
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean addCallback(String str, AbstractC72639k kVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        return C77390a.m135325a(kVar, str, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final boolean removeCallback(String str, AbstractC72639k kVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        return C77390a.m135324a(kVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void getCover(String str, StoryCoverExtractConfig storyCoverExtractConfig, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        boolean z;
        C89219l.m154721d(str, "");
        C89219l.m154721d(storyCoverExtractConfig, "");
        C89219l.m154721d(bVar, "");
        C72678q c = C77390a.m135331c(str);
        if (c != null && (c.f162938k instanceof VideoPublishEditModel)) {
            BaseShortVideoContext baseShortVideoContext = c.f162938k;
            if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                baseShortVideoContext = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (!(videoPublishEditModel == null || videoPublishEditModel.ttStoryUploadModel == null)) {
                BaseShortVideoContext baseShortVideoContext2 = c.f162938k;
                Objects.requireNonNull(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext2;
                TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel2.ttStoryUploadModel;
                if (tTStoryUploadModel == null || tTStoryUploadModel.getContentType() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                EditPreviewInfo previewInfo = videoPublishEditModel2.getPreviewInfo();
                C89219l.m154716b(previewInfo, "");
                C77148a.m134753a(previewInfo, z, storyCoverExtractConfig, bVar);
                return;
            }
        }
        bVar.invoke(null);
    }
}
