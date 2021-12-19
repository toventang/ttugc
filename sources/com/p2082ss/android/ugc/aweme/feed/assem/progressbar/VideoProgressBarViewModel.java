package com.p2082ss.android.ugc.aweme.feed.assem.progressbar;

import android.view.KeyEvent;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50462h;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel */
public final class VideoProgressBarViewModel extends FeedBaseViewModel<C48951m> {

    /* renamed from: l */
    public static final C48897a f112788l = new C48897a((byte) 0);

    /* renamed from: k */
    public long f112789k;

    static {
        Covode.recordClassIndex(57684);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel$a */
    public static final class C48897a {
        static {
            Covode.recordClassIndex(57685);
        }

        private C48897a() {
        }

        public /* synthetic */ C48897a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48951m();
    }

    /* renamed from: a */
    public final void mo80723a(boolean z) {
        mo20662a(new C48901e(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel$d */
    static final class C48900d extends AbstractC89220m implements AbstractC89172b<C48951m, C48951m> {

        /* renamed from: a */
        final /* synthetic */ boolean f112795a;

        static {
            Covode.recordClassIndex(57688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48900d(boolean z) {
            super(1);
            this.f112795a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48951m invoke(C48951m mVar) {
            C48951m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            return C48951m.m92133a(mVar2, 0, false, this.f112795a, 0, 0, 27);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel$e */
    static final class C48901e extends AbstractC89220m implements AbstractC89172b<C48951m, C48951m> {

        /* renamed from: a */
        final /* synthetic */ boolean f112796a;

        static {
            Covode.recordClassIndex(57689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48901e(boolean z) {
            super(1);
            this.f112796a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48951m invoke(C48951m mVar) {
            C48951m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            return C48951m.m92133a(mVar2, 0, this.f112796a, false, 0, 0, 29);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel$b */
    static final class C48898b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f112790a;

        /* renamed from: b */
        final /* synthetic */ VideoProgressBarViewModel f112791b;

        /* renamed from: c */
        final /* synthetic */ boolean f112792c;

        static {
            Covode.recordClassIndex(57686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48898b(VideoProgressBarViewModel videoProgressBarViewModel, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f112791b = videoProgressBarViewModel;
            this.f112792c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C48898b(this.f112791b, this.f112792c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C48898b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            String fromGroupId;
            if (this.f112790a == 0) {
                C89382r.m154942a(obj);
                if (this.f112792c) {
                    str = "up";
                } else {
                    str = "down";
                }
                VideoItemParams videoItemParams2 = (VideoItemParams) this.f112791b.mo23342g();
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                } else {
                    aweme = null;
                }
                String str2 = "";
                if (!(aweme == null || (videoItemParams = (VideoItemParams) this.f112791b.mo23342g()) == null || (aweme2 = videoItemParams.mAweme) == null || (fromGroupId = aweme2.getFromGroupId()) == null)) {
                    str2 = fromGroupId;
                }
                C39162r.m79460a("adjust_volumn", new C33744d().mo59983a("enter_from", this.f112791b.f112231p).mo59983a("to_status", str).mo59983a("group_id", str2).f79943a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel$c */
    static final class C48899c extends AbstractC89220m implements AbstractC89172b<C48951m, C48951m> {

        /* renamed from: a */
        final /* synthetic */ VideoProgressBarViewModel f112793a;

        /* renamed from: b */
        final /* synthetic */ C50458e f112794b;

        static {
            Covode.recordClassIndex(57687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48899c(VideoProgressBarViewModel videoProgressBarViewModel, C50458e eVar) {
            super(1);
            this.f112793a = videoProgressBarViewModel;
            this.f112794b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48951m invoke(C48951m mVar) {
            int i;
            Aweme aweme;
            Video video;
            Aweme aweme2;
            Video video2;
            C48951m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.f112793a.mo23342g();
            int i2 = 0;
            if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null || (video2 = aweme2.getVideo()) == null) {
                i = 0;
            } else {
                i = video2.getDuration();
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) this.f112793a.mo23342g();
            if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (video = aweme.getVideo()) == null)) {
                i2 = video.getDuration();
            }
            double d = (double) i2;
            double d2 = (double) this.f112794b.f116542d;
            Double.isNaN(d2);
            Double.isNaN(d);
            return C48951m.m92133a(mVar2, 0, false, false, (int) (d * (d2 / 100.0d)), i, 7);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (((com.p2082ss.android.ugc.aweme.main.AbstractC59105l) r0).mo96549n() != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80724a(boolean r9, android.app.Activity r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel.mo80724a(boolean, android.app.Activity):boolean");
    }

    /* renamed from: a */
    public final void mo80722a(int i, KeyEvent keyEvent, boolean z) {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        C50462h hVar = new C50462h(aweme, this.f112231p, ((FeedBaseViewModel) this).f112230o, i, keyEvent);
        hVar.f116553a = z;
        AbstractC81915c.m141874a(hVar);
    }
}
