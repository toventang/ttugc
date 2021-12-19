package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35956a;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget */
public class MusicBannerWidget extends Widget implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: a */
    C35956a f85196a;

    /* renamed from: h */
    private int f85197h;

    /* renamed from: i */
    private int f85198i;

    static {
        Covode.recordClassIndex(43314);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f80273e.mo60189a("data_banner", (AbstractC1214u<C33942b>) this);
        this.f85197h = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    public MusicBannerWidget(int i) {
        this.f85198i = i;
    }

    /* renamed from: a */
    private void m73503a(List<Banner> list) {
        if (list == null || list.size() <= 0) {
            this.f80272d.setVisibility(8);
            return;
        }
        this.f80272d.setVisibility(0);
        this.f85196a.mo63090a(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (this.f85196a != null && bVar2 != null) {
            m73503a((List) bVar2.mo60212a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        this.f85196a = new C35956a(view, this.f85197h, this.f85198i);
        m73503a((List) this.f80273e.mo60192a("data_banner"));
    }
}
