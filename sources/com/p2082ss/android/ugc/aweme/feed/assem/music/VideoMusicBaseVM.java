package com.p2082ss.android.ugc.aweme.feed.assem.music;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.EnumC37642b;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM */
public final class VideoMusicBaseVM extends FeedBaseViewModel<C48781a> {
    static {
        Covode.recordClassIndex(57551);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48781a();
    }

    /* renamed from: i */
    public final void mo80681i() {
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            mo20662a(new C48768a(videoItemParams, this));
        }
    }

    /* renamed from: h */
    public final boolean mo23343h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
            Music music = aweme.getMusic();
            User author = aweme.getAuthor();
            if (!aweme.isLawCriticalCountry() || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM$a */
    static final class C48768a extends AbstractC89220m implements AbstractC89172b<C48781a, C48781a> {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f112633a;

        /* renamed from: b */
        final /* synthetic */ VideoMusicBaseVM f112634b;

        static {
            Covode.recordClassIndex(57552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48768a(VideoItemParams videoItemParams, VideoMusicBaseVM videoMusicBaseVM) {
            super(1);
            this.f112633a = videoItemParams;
            this.f112634b = videoMusicBaseVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48781a invoke(C48781a aVar) {
            C48781a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return this.f112634b.mo23372a((AbstractC12853j) aVar2, this.f112633a);
        }
    }

    /* renamed from: a */
    private static EnumC37642b m92060a(int i) {
        if (i == R.id.coj || i == R.id.col) {
            return EnumC37642b.TITLE;
        }
        if (i == R.id.cnl) {
            return EnumC37642b.ICON;
        }
        return null;
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (android.text.TextUtils.equals(r1, r0.getOwnerId()) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80680a(android.content.Context r18, int r19) {
        /*
        // Method dump skipped, instructions count: 1051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM.mo80680a(android.content.Context, int):void");
    }
}
