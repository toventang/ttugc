package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35828c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.f */
public final /* synthetic */ class C36074f implements AbstractC35828c {

    /* renamed from: a */
    private final MusicClassWidget f85239a;

    static {
        Covode.recordClassIndex(43327);
    }

    C36074f(MusicClassWidget musicClassWidget) {
        this.f85239a = musicClassWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35828c
    /* renamed from: a */
    public final void mo62935a(MusicCollectionItem musicCollectionItem) {
        MusicClassWidget musicClassWidget = this.f85239a;
        Intent intent = new Intent(musicClassWidget.f80270b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.f85216j);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", musicCollectionItem.level);
        intent.putExtra("sound_page_scene", musicClassWidget.f85217k);
        musicClassWidget.mo60205a(intent, musicClassWidget.f85215i);
        C35936b.m73319a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
    }
}
