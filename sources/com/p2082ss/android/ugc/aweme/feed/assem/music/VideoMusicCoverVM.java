package com.p2082ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM */
public final class VideoMusicCoverVM extends FeedBaseViewModel<C48823m> {

    /* renamed from: k */
    boolean f112635k;

    static {
        Covode.recordClassIndex(57553);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM$a */
    static final class RunnableC48769a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicCoverVM f112636a;

        static {
            Covode.recordClassIndex(57554);
        }

        RunnableC48769a(VideoMusicCoverVM videoMusicCoverVM) {
            this.f112636a = videoMusicCoverVM;
        }

        public final void run() {
            this.f112636a.mo20662a(C487701.f112637a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM$b */
    static final class RunnableC48771b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicCoverVM f112638a;

        static {
            Covode.recordClassIndex(57556);
        }

        RunnableC48771b(VideoMusicCoverVM videoMusicCoverVM) {
            this.f112638a = videoMusicCoverVM;
        }

        public final void run() {
            this.f112638a.mo20662a(C487721.f112639a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM$c */
    static final class RunnableC48773c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicCoverVM f112640a;

        static {
            Covode.recordClassIndex(57558);
        }

        RunnableC48773c(VideoMusicCoverVM videoMusicCoverVM) {
            this.f112640a = videoMusicCoverVM;
        }

        public final void run() {
            this.f112640a.mo20662a(C487741.f112641a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48823m();
    }

    /* renamed from: h */
    static boolean m92066h() {
        return C16048b.m29633a().mo25421a(true, "anim_opt", false);
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48823m mo80488a(C48823m mVar, VideoItemParams videoItemParams) {
        Music music;
        boolean z;
        C48823m mVar2 = mVar;
        C89219l.m154721d(mVar2, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        Aweme aweme2 = videoItemParams.mAweme;
        if (aweme2 == null || !aweme2.isScheduleVideo()) {
            z = false;
        } else {
            z = true;
        }
        return C48823m.m92084a(mVar2, music, z, false, false, false, false, 60);
    }
}
