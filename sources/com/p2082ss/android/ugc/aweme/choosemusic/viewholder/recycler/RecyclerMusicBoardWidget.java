package com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35884ad;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36030a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.AbstractC36034b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.C36041f;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.RecyclerMusicBoardWidget */
public class RecyclerMusicBoardWidget extends ListItemWidget<C36041f> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public AbstractC35827b f85104h;

    /* renamed from: i */
    public int f85105i;

    /* renamed from: j */
    int f85106j = -1;

    /* renamed from: k */
    public int f85107k = -1;

    /* renamed from: l */
    public int f85108l;

    /* renamed from: m */
    int f85109m;

    /* renamed from: n */
    C35754b f85110n;

    /* renamed from: o */
    List<MusicModel> f85111o;

    /* renamed from: p */
    public AbstractC60731k<C35757c> f85112p;

    /* renamed from: q */
    boolean[] f85113q = new boolean[3];

    /* renamed from: r */
    boolean[] f85114r = new boolean[3];

    /* renamed from: s */
    int f85115s;

    /* renamed from: t */
    private ViewPager.AbstractC1579e f85116t = new ViewPager.AbstractC1579e() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.RecyclerMusicBoardWidget.C360291 */

        static {
            Covode.recordClassIndex(43277);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            RecyclerMusicBoardWidget.this.f85105i = i;
            for (int i2 = 0; i2 < RecyclerMusicBoardWidget.this.f85114r.length; i2++) {
                RecyclerMusicBoardWidget.this.f85114r[i2] = RecyclerMusicBoardWidget.this.f85113q[i2];
            }
            RecyclerMusicBoardWidget.this.mo63193f();
        }
    };

    static {
        Covode.recordClassIndex(43276);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: g */
    public final void mo63194g() {
        this.f85104h.mo62875a((MusicModel) null);
    }

    /* renamed from: e */
    public final void mo63192e() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f85114r;
            if (i < zArr.length) {
                this.f85113q[i] = false;
                zArr[i] = false;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo63193f() {
        if (!C13603b.m24435a((Collection) this.f85111o)) {
            int i = this.f85105i;
            if (i < 0) {
                i = 0;
            }
            int min = Math.min(i + 3, this.f85111o.size());
            for (int i2 = i; i2 < min; i2++) {
                boolean[] zArr = this.f85114r;
                int i3 = i2 - i;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    MusicModel musicModel = this.f85111o.get(i2);
                    if (musicModel != null) {
                        C35936b.m73312a(this.f85110n, musicModel.getMusicId(), i2);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("list", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this).mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
        this.f85109m = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
    }

    public RecyclerMusicBoardWidget(int i) {
        this.f85115s = i;
    }

    /* renamed from: a */
    private void m73456a(List<Object> list) {
        if (list != null && this.f85107k < list.size()) {
            m73457a(((C35884ad) list.get(this.f85107k)).f84680b, ((C35884ad) list.get(this.f85107k)).f84679a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        m73456a((List) this.f80273e.mo60192a("list"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        MusicModel.CollectionType collectionType;
        C36038c a;
        AbstractC36030a aVar;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c = 0;
                    break;
                }
                break;
            case -1322093457:
                if (str.equals("play_compeleted")) {
                    c = 1;
                    break;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    c = 2;
                    break;
                }
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c = 3;
                    break;
                }
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C35755a aVar2 = (C35755a) bVar2.mo60212a();
                if (((aVar2.f84357a == 1 && this.f85107k == aVar2.f84358b) || aVar2.f84357a == 0) && ((ListItemWidget) this).f80253a != null) {
                    C36041f fVar = (C36041f) ((ListItemWidget) this).f80253a;
                    int childCount = fVar.f85132b.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        RecyclerView.ViewHolder f = fVar.f85132b.mo4451f(i);
                        if (f instanceof C36050s) {
                            AbstractC35998a aVar3 = (AbstractC35998a) f;
                            MusicModel musicModel = aVar2.f84361e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || aVar3.f85027w == null)) {
                                String musicId = musicModel.getMusicId();
                                MusicModel musicModel2 = aVar3.f85027w;
                                C89219l.m154716b(musicModel2, "");
                                if (C89219l.m154714a((Object) musicId, (Object) musicModel2.getMusicId())) {
                                    MusicModel musicModel3 = aVar3.f85027w;
                                    C89219l.m154716b(musicModel3, "");
                                    if (aVar2.f84360d == 1) {
                                        collectionType = MusicModel.CollectionType.COLLECTED;
                                    } else {
                                        collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                    }
                                    musicModel3.setCollectionType(collectionType);
                                    aVar3.mo63158d();
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                m73458b(((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue(), ((Integer) this.f80273e.mo60195b("music_index", (Object) -1)).intValue());
                this.f80273e.mo60191a("music_position", (Object) -1);
                this.f80273e.mo60191a("music_index", (Object) -1);
                mo63194g();
                return;
            case 2:
                if (((ListItemWidget) this).f80253a != null) {
                    m73456a((List) bVar2.mo60212a());
                    return;
                }
                return;
            case 3:
                if (((ListItemWidget) this).f80253a != null) {
                    C36041f fVar2 = (C36041f) ((ListItemWidget) this).f80253a;
                    int i2 = this.f85106j;
                    boolean booleanValue = ((Boolean) this.f80273e.mo60192a("music_loading")).booleanValue();
                    if (i2 >= 0 && (a = fVar2.f85133c.mo63207a(i2)) != null) {
                        C36041f.C36045c cVar = fVar2.f85133c;
                        AbstractC36034b.C36036b bVar3 = AbstractC36034b.C36036b.f85122a;
                        if (booleanValue) {
                            aVar = AbstractC36030a.C36032b.f85119a;
                        } else {
                            aVar = AbstractC36030a.C36031a.f85118a;
                        }
                        cVar.mo63208a(i2, C36038c.m73465a(a, null, aVar, bVar3, 1));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m73458b(((Integer) this.f80273e.mo60192a("music_position")).intValue(), ((Integer) this.f80273e.mo60192a("music_index")).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo63191a(int i, int i2) {
        if (((ListItemWidget) this).f80253a != null) {
            ((C36041f) ((ListItemWidget) this).f80253a).mo63202a(i, i2, this.f85113q, this.f85114r);
            mo63193f();
        }
    }

    /* renamed from: a */
    private void m73457a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = ((C36041f) ((ListItemWidget) this).f80253a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((C36041f) ((ListItemWidget) this).f80253a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f85107k == 0) {
            ((C36041f) ((ListItemWidget) this).f80253a).mo63205b();
        } else {
            ((C36041f) ((ListItemWidget) this).f80253a).mo63201a();
        }
        this.f85111o = list;
        C35754b bVar = new C35754b("change_music_page", musicCollectionItem.mcName, "", C35936b.f84812a);
        this.f85110n = bVar;
        bVar.mo62804a(musicCollectionItem.mcId);
        ((C36041f) ((ListItemWidget) this).f80253a).f85135e = this.f85116t;
        ((C36041f) ((ListItemWidget) this).f80253a).mo63204a(musicCollectionItem, list, this.f85105i, this.f85106j, this.f85107k, this.f85110n, musicCollectionItem.isHot);
        ((C36041f) ((ListItemWidget) this).f80253a).mo63203a(new C36047g(this, musicCollectionItem), this.f85112p);
    }

    /* renamed from: b */
    private void m73458b(int i, int i2) {
        int i3;
        C36038c a;
        if (((ListItemWidget) this).f80253a != null) {
            C36041f fVar = (C36041f) ((ListItemWidget) this).f80253a;
            int i4 = this.f85106j;
            if (i == this.f85107k) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            fVar.f85139i = i3;
            if (i4 >= 0 && (a = fVar.f85133c.mo63207a(i4)) != null) {
                fVar.f85133c.mo63208a(i4, C36038c.m73465a(a, null, AbstractC36030a.C36031a.f85118a, AbstractC36034b.C36035a.f85121a, 1));
            }
        }
        if (i != this.f85107k) {
            this.f85106j = -1;
        } else if (this.f85106j == i2) {
            this.f85104h.mo62875a((MusicModel) null);
        } else {
            this.f85106j = i2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60204a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f85108l) {
            mo60208d().setResult(-1, intent);
            mo60208d().finish();
        }
    }
}
