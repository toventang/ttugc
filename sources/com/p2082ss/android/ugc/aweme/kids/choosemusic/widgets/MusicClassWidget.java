package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57255q;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57314l;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget */
public class MusicClassWidget extends ListItemWidget<C57314l> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public int f130684h;

    /* renamed from: i */
    public int f130685i;

    /* renamed from: j */
    public int f130686j;

    static {
        Covode.recordClassIndex(67241);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("list", (AbstractC1214u<C33942b>) this);
        this.f130686j = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (((ListItemWidget) this).f80253a != null) {
            String str = bVar2.f80277a;
            str.hashCode();
            if (str.equals("list")) {
                m103936a((List) bVar2.mo60212a());
            }
        }
    }

    /* renamed from: a */
    private void m103936a(List<Object> list) {
        if (list != null && list.size() > 0) {
            ((C57314l) ((ListItemWidget) this).f80253a).mo94529a(((C57255q) list.get(this.f130684h)).f130418a, this.f130686j);
            ((C57314l) ((ListItemWidget) this).f80253a).f130604e = new AbstractC57079b() {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget.C573331 */

                static {
                    Covode.recordClassIndex(67242);
                }

                @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b
                /* renamed from: a */
                public final void mo94239a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
                    if (view.getId() == R.id.f67) {
                        Intent intent = new Intent(MusicClassWidget.this.f80270b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f130686j);
                        MusicClassWidget musicClassWidget = MusicClassWidget.this;
                        musicClassWidget.mo60205a(intent, musicClassWidget.f130685i);
                    }
                }
            };
            ((C57314l) ((ListItemWidget) this).f80253a).f130605f = new C57342f(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        m103936a((List) this.f80273e.mo60192a("list"));
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60204a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f130685i) {
            mo60208d().setResult(-1, intent);
            mo60208d().finish();
        }
    }
}
