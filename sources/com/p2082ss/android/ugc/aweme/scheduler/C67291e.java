package com.p2082ss.android.ugc.aweme.scheduler;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.p2082ss.android.ugc.aweme.publish.p3617d.C65605a;
import com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.settings.C68749o;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69745a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74090h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72690y;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72677p;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73925y;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.e */
public final class C67291e {
    static {
        Covode.recordClassIndex(78914);
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.e$a */
    public static final class C67292a implements AbstractC67289c {

        /* renamed from: a */
        public AbstractC74088f f150783a;

        /* renamed from: b */
        final /* synthetic */ RunnableC67311i.C67312a f150784b;

        /* renamed from: c */
        final /* synthetic */ IPublishServiceFactory f150785c;

        /* renamed from: d */
        final /* synthetic */ AbstractC71893j f150786d;

        /* renamed from: e */
        final /* synthetic */ String f150787e;

        static {
            Covode.recordClassIndex(78915);
        }

        @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67289c
        /* renamed from: a */
        public final void mo106121a() {
            m119220e();
        }

        @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67289c
        /* renamed from: b */
        public final void mo106123b() {
            AbstractC74088f fVar = this.f150783a;
            if (fVar != null) {
                fVar.mo116440d();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67289c
        /* renamed from: c */
        public final void mo106124c() {
            AbstractC74088f fVar = this.f150783a;
            if (fVar != null) {
                fVar.mo116449j();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67289c
        /* renamed from: d */
        public final void mo106125d() {
            AbstractC74088f fVar = this.f150783a;
            if (fVar != null) {
                fVar.mo116450k();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.e$a$a */
        public static final class C67293a implements AbstractC74304x<C69831ai> {

            /* renamed from: a */
            final /* synthetic */ C67292a f150788a;

            /* renamed from: b */
            final /* synthetic */ AbstractC72639k f150789b;

            static {
                Covode.recordClassIndex(78916);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onParallelPublishCancel() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onParallelPublishPause() {
                this.f150789b.onStageUpdate("STAGE_SYNTHETIC_PAUSE", new AbstractC72606ah.C72607a(new AbstractC72690y.C72691a("")), this.f150788a.f150784b.f150844f);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onParallelPublishResume() {
                this.f150789b.onStageUpdate("STAGE_SYNTHETIC_RESUME", new AbstractC72606ah.C72607a(new AbstractC72690y.C72691a("")), this.f150788a.f150784b.f150844f);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onSynthetiseSuccess(String str) {
                C89219l.m154721d(str, "");
                this.f150789b.onStageUpdate("STAGE_SYNTHETIC", new AbstractC72606ah.C72607a(new AbstractC72690y.C72691a(str)), null);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onError(C71818ev evVar) {
                boolean z;
                boolean z2;
                C89219l.m154721d(evVar, "");
                C89219l.m154721d(evVar, "");
                Throwable cause = evVar.getCause();
                if ((!(cause instanceof C71798ef) || ((C71798ef) cause).getCode() != -66666) && (!(cause instanceof C73925y) || ((C73925y) cause).getErrorCode() != -39993)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f150789b.onFinish(AbstractC72623d.C72624a.f162804a, null);
                } else {
                    C73991bj.m130131b("PublishScheduler | PublishFailed: " + C27258s.m54268b(evVar));
                    if (this.f150788a.f150784b.f150844f.f162935h == 0) {
                        evVar.setRecover(true);
                    }
                    int i = this.f150788a.f150784b.f150844f.f162935h;
                    BaseShortVideoContext baseShortVideoContext = this.f150788a.f150784b.f150844f.f162938k;
                    C72678q qVar = this.f150788a.f150784b.f150844f;
                    C89219l.m154721d(evVar, "");
                    C89219l.m154721d(baseShortVideoContext, "");
                    C89219l.m154721d(qVar, "");
                    if (i == 0) {
                        m119227a(((VideoPublishEditModel) baseShortVideoContext).creationId, false, qVar);
                    }
                    this.f150789b.onFinish(new AbstractC72623d.C72625b(new C72677p("", "", evVar.isUserNetworkBad(), evVar.getCause(), Boolean.valueOf(evVar.isRecover()))), null);
                    C39078ad a = C63238c.f143593t.mo93787a(this.f150788a.f150784b.f150844f.f162938k);
                    if (C63238c.f143593t.mo93793a(a)) {
                        C63238c.f143593t.mo93790a(null, a, "", 20016);
                    }
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("publish", "PublishScheduler | PublishFailed: " + C27258s.m54268b(evVar));
                    if (!(evVar.getCause() instanceof C65605a)) {
                        z2 = false;
                        C63253l.f143623a.mo73315k().getPublishXService().reportPublishFailure(evVar, z2);
                    }
                }
                z2 = true;
                C63253l.f143623a.mo73315k().getPublishXService().reportPublishFailure(evVar, z2);
            }

            C67293a(C67292a aVar, AbstractC72639k kVar) {
                this.f150788a = aVar;
                this.f150789b = kVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onProgressUpdate(int i, boolean z) {
                this.f150789b.onProgress(i, Boolean.valueOf(z));
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
            public final void onSuccess(C69831ai aiVar, boolean z) {
                String str;
                String str2;
                C89219l.m154721d(aiVar, "");
                if (this.f150788a.f150784b.f150844f.f162935h == 0) {
                    BaseShortVideoContext baseShortVideoContext = this.f150788a.f150784b.f150844f.f162938k;
                    Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                    C63238c.f143591r.mo93934a(aiVar, baseShortVideoContext.getVideoLength());
                    aiVar.setVideoCoverPath((String) C89070n.m154583g((List) this.f150788a.f150784b.f150844f.f162937j));
                }
                this.f150789b.onFinish(new AbstractC72623d.C72626c(aiVar), Boolean.valueOf(z));
                int i = this.f150788a.f150784b.f150844f.f162935h;
                BaseShortVideoContext baseShortVideoContext2 = this.f150788a.f150784b.f150844f.f162938k;
                C89219l.m154721d(baseShortVideoContext2, "");
                if (!(aiVar == null || aiVar.mSaveModel == null)) {
                    AVUploadSaveModel aVUploadSaveModel = aiVar.mSaveModel;
                    C89219l.m154716b(aVUploadSaveModel, "");
                    if (aVUploadSaveModel.isSaveLocal()) {
                        C69745a a = C63238c.f143597x.mo93912a(aiVar);
                        if (a != null) {
                            str = a.aid;
                            C89219l.m154716b(str, "");
                        } else {
                            str = "";
                        }
                        if (i != 0 || !(baseShortVideoContext2 instanceof VideoPublishEditModel)) {
                            str2 = "";
                        } else {
                            str2 = C70968bl.m125249a((VideoPublishEditModel) baseShortVideoContext2);
                        }
                        C39162r.m79460a("download_publish_finish", new C84425b().mo129403a("scene_id", 1004).mo129406a("group_id", str).mo129406a("content_type", str2).mo129406a("download_type", "self").mo129406a("download_method", "download_with_publish").f188764a);
                    }
                }
                int i2 = this.f150788a.f150784b.f150844f.f162935h;
                BaseShortVideoContext baseShortVideoContext3 = this.f150788a.f150784b.f150844f.f162938k;
                String str3 = this.f150788a.f150784b.f150844f.f162928a;
                C72678q qVar = this.f150788a.f150784b.f150844f;
                C89219l.m154721d(baseShortVideoContext3, "");
                C89219l.m154721d(str3, "");
                C89219l.m154721d(qVar, "");
                C39163s sVar = new C39163s();
                if (i2 == 0) {
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext3;
                    sVar.mo67941a("bitrate", String.valueOf(C65357b.m117047c())).mo67941a("duration", String.valueOf(videoPublishEditModel.getVideoLength())).mo67941a("resolution", String.valueOf(videoPublishEditModel.videoWidth()) + "x" + videoPublishEditModel.videoHeight()).mo67941a("shoot_way", str3);
                    m119227a(videoPublishEditModel.creationId, true, qVar);
                }
                C63238c.f143593t.mo93795b(this.f150788a.f150784b.f150844f.f162938k);
            }

            /* renamed from: a */
            private static void m119227a(String str, boolean z, C72678q qVar) {
                if (qVar.f162931d) {
                    C84425b a = new C84425b().mo129403a("is_success", z ? 1 : 0);
                    if (str == null) {
                        str = "";
                    }
                    C39162r.m79460a("publish_retry_status", a.mo129406a("creation_id", str).mo129403a("is_story", qVar.f162939l ? 1 : 0).f188764a);
                }
            }
        }

        /* renamed from: e */
        private final void m119220e() {
            AbstractC74304x<C69831ai> a;
            int i = this.f150784b.f150844f.f162930c;
            if (i == 0) {
                if (!this.f150784b.f150844f.f162939l && (a = this.f150785c.mo104633a(this.f150784b.f150844f.f162935h, this.f150784b.f150844f.f162938k)) != null) {
                    C67296h.m119239b(new C67294f(a), this.f150787e);
                }
                m119221f();
                AbstractC74088f fVar = this.f150783a;
                if (fVar != null) {
                    fVar.mo116434a(this.f150784b.f150844f.f162938k);
                    return;
                }
                return;
            }
            AbstractC74088f fVar2 = this.f150783a;
            if (fVar2 != null) {
                fVar2.mo116435a(this.f150784b.f150844f.f162938k, i);
            }
        }

        /* renamed from: f */
        private final void m119221f() {
            String str;
            if (C68749o.m121186a()) {
                if (this.f150784b.f150844f.f162938k instanceof VideoPublishEditModel) {
                    BaseShortVideoContext baseShortVideoContext = this.f150784b.f150844f.f162938k;
                    Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                    str = baseShortVideoContext.getDraftPrimaryKey();
                } else {
                    str = null;
                }
                C67296h.m119243c("setRecoverKey ".concat(String.valueOf(str)));
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (C68747m.m121180a()) {
                    C63244g.m114602a().mo73287o().mo104793m().mo104827b(str);
                } else {
                    C63244g.m114602a().mo73287o().mo104793m().mo104825a(str);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67289c
        /* renamed from: a */
        public final void mo106122a(AbstractC72639k kVar) {
            C89219l.m154721d(kVar, "");
            C74090h hVar = new C74090h();
            boolean z = false;
            hVar.f166340a.put("split_video_count", 0);
            hVar.f166340a.put("is_shoutouts", Boolean.valueOf(this.f150784b.f150844f.f162933f));
            BaseShortVideoContext baseShortVideoContext = this.f150784b.f150844f.f162938k;
            TTStoryUploadModel tTStoryUploadModel = null;
            if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                baseShortVideoContext = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (videoPublishEditModel != null) {
                tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            }
            Map<String, Object> map = hVar.f166340a;
            if (tTStoryUploadModel != null) {
                z = true;
            }
            map.put("is_story", Boolean.valueOf(z));
            this.f150783a = this.f150785c.mo104632a(this.f150784b.f150844f.f162930c, this.f150786d, this.f150784b.f150844f.f162935h, this.f150784b.f150844f.f162934g, this.f150784b.f150844f.f162928a, this.f150784b.f150844f.f162931d, hVar, new C67293a(this, kVar));
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("initPublisher", "publisher type is " + this.f150783a);
            m119220e();
        }

        C67292a(RunnableC67311i.C67312a aVar, IPublishServiceFactory iPublishServiceFactory, AbstractC71893j jVar, String str) {
            this.f150784b = aVar;
            this.f150785c = iPublishServiceFactory;
            this.f150786d = jVar;
            this.f150787e = str;
        }
    }
}
