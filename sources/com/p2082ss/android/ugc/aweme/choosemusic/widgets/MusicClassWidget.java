package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35887ag;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36021p;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60712b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget */
public class MusicClassWidget extends ListItemWidget<C36021p> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public int f85214h;

    /* renamed from: i */
    public int f85215i;

    /* renamed from: j */
    public int f85216j;

    /* renamed from: k */
    public int f85217k;

    static {
        Covode.recordClassIndex(43317);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("list", (AbstractC1214u<C33942b>) this);
        this.f85216j = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
    }

    public MusicClassWidget(int i) {
        this.f85217k = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (((ListItemWidget) this).f80253a != null) {
            String str = bVar2.f80277a;
            str.hashCode();
            if (str.equals("list")) {
                m73514a((List) bVar2.mo60212a());
            }
        }
    }

    /* renamed from: a */
    private void m73514a(List<Object> list) {
        if (list != null && list.size() > 0) {
            ((C36021p) ((ListItemWidget) this).f80253a).mo63187a(((C35887ag) list.get(this.f85214h)).f84687a, this.f85216j);
            ((C36021p) ((ListItemWidget) this).f80253a).f85079e = new AbstractC60712b() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget.C360661 */

                static {
                    Covode.recordClassIndex(43318);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60712b
                /* renamed from: a */
                public final void mo63222a(View view) {
                    if (view.getId() == R.id.f67) {
                        Intent intent = new Intent(MusicClassWidget.this.f80270b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f85216j);
                        intent.putExtra("sound_page_scene", MusicClassWidget.this.f85217k);
                        MusicClassWidget musicClassWidget = MusicClassWidget.this;
                        musicClassWidget.mo60205a(intent, musicClassWidget.f85215i);
                    }
                }
            };
            ((C36021p) ((ListItemWidget) this).f80253a).f85080f = new C36074f(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        m73514a((List) this.f80273e.mo60192a("list"));
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60204a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f85215i) {
            mo60208d().setResult(-1, intent);
            mo60208d().finish();
        }
    }
}
