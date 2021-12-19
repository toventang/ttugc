package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57235c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.f */
public final /* synthetic */ class C57342f implements AbstractC57235c {

    /* renamed from: a */
    private final MusicClassWidget f130714a;

    static {
        Covode.recordClassIndex(67253);
    }

    C57342f(MusicClassWidget musicClassWidget) {
        this.f130714a = musicClassWidget;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57235c
    /* renamed from: a */
    public final void mo94453a(C57110d dVar) {
        MusicClassWidget musicClassWidget = this.f130714a;
        Intent intent = new Intent(musicClassWidget.f80270b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", dVar.f130024a);
        intent.putExtra("music_class_name", dVar.f130025b);
        intent.putExtra("music_category_is_hot", dVar.f130028e);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.f130686j);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", dVar.f130029f);
        musicClassWidget.mo60205a(intent, musicClassWidget.f130685i);
        C57268c.m103829a(dVar.f130025b, "click_category_list", "", "change_music_page", dVar.f130024a);
    }
}
