package com.p2082ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM */
public final class VideoMusicTitleVM extends FeedBaseViewModel<C48863x> {

    /* renamed from: k */
    boolean f112642k;

    static {
        Covode.recordClassIndex(57560);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM$a */
    static final class RunnableC48775a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicTitleVM f112643a;

        static {
            Covode.recordClassIndex(57561);
        }

        RunnableC48775a(VideoMusicTitleVM videoMusicTitleVM) {
            this.f112643a = videoMusicTitleVM;
        }

        public final void run() {
            this.f112643a.mo20662a(C487761.f112644a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM$b */
    static final class RunnableC48777b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicTitleVM f112645a;

        static {
            Covode.recordClassIndex(57563);
        }

        RunnableC48777b(VideoMusicTitleVM videoMusicTitleVM) {
            this.f112645a = videoMusicTitleVM;
        }

        public final void run() {
            this.f112645a.mo20662a(C487781.f112646a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM$c */
    static final class RunnableC48779c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoMusicTitleVM f112647a;

        static {
            Covode.recordClassIndex(57565);
        }

        RunnableC48779c(VideoMusicTitleVM videoMusicTitleVM) {
            this.f112647a = videoMusicTitleVM;
        }

        public final void run() {
            this.f112647a.mo20662a(C487801.f112648a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48863x();
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
    public final /* synthetic */ C48863x mo80488a(C48863x xVar, VideoItemParams videoItemParams) {
        Music music;
        boolean z;
        C48863x xVar2 = xVar;
        C89219l.m154721d(xVar2, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        AwemeRawAd awemeRawAd = null;
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
        Aweme aweme3 = videoItemParams.mAweme;
        if (aweme3 != null) {
            awemeRawAd = aweme3.getAwemeRawAd();
        }
        return C48863x.m92094a(xVar2, music, z, awemeRawAd, false, false, false, 56);
    }
}
