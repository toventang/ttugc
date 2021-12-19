package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.h */
final /* synthetic */ class C36048h implements MusicDownloadPlayHelper.AbstractC61086a {

    /* renamed from: a */
    private final RecyclerMusicBoardWidget f85156a;

    static {
        Covode.recordClassIndex(43296);
    }

    C36048h(RecyclerMusicBoardWidget recyclerMusicBoardWidget) {
        this.f85156a = recyclerMusicBoardWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.AbstractC61086a
    /* renamed from: a */
    public final void mo62754a() {
        this.f85156a.f80273e.mo60191a("music_loading", (Object) false);
    }
}
