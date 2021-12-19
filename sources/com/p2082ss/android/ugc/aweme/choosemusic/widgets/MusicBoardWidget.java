package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
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
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35990t;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36017m;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget */
public class MusicBoardWidget extends ListItemWidget<C36017m> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public AbstractC35827b f85199h;

    /* renamed from: i */
    public int f85200i;

    /* renamed from: j */
    int f85201j = -1;

    /* renamed from: k */
    public int f85202k = -1;

    /* renamed from: l */
    public int f85203l;

    /* renamed from: m */
    int f85204m;

    /* renamed from: n */
    C35754b f85205n;

    /* renamed from: o */
    List<MusicModel> f85206o;

    /* renamed from: p */
    public AbstractC60731k<C35757c> f85207p;

    /* renamed from: q */
    boolean[] f85208q = new boolean[3];

    /* renamed from: r */
    boolean[] f85209r = new boolean[3];

    /* renamed from: s */
    int f85210s;

    /* renamed from: t */
    public MusicDownloadPlayHelper.AbstractC61086a f85211t = new C36071c(this);

    /* renamed from: u */
    private ViewPager.AbstractC1579e f85212u = new ViewPager.AbstractC1579e() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget.C360651 */

        static {
            Covode.recordClassIndex(43316);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            MusicBoardWidget.this.f85200i = i;
            for (int i2 = 0; i2 < MusicBoardWidget.this.f85209r.length; i2++) {
                MusicBoardWidget.this.f85209r[i2] = MusicBoardWidget.this.f85208q[i2];
            }
            MusicBoardWidget.this.mo63220f();
        }
    };

    static {
        Covode.recordClassIndex(43315);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: g */
    public final void mo63221g() {
        this.f85199h.mo62875a((MusicModel) null);
    }

    /* renamed from: e */
    public final void mo63219e() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f85209r;
            if (i < zArr.length) {
                this.f85208q[i] = false;
                zArr[i] = false;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("list", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this).mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
        this.f85204m = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
    }

    /* renamed from: f */
    public final void mo63220f() {
        int i;
        if (!C13603b.m24435a((Collection) this.f85206o)) {
            int i2 = this.f85200i;
            if (i2 * 3 < 0) {
                i = 0;
            } else {
                i = i2 * 3;
            }
            int min = Math.min(i + 3, this.f85206o.size());
            for (int i3 = i; i3 < min; i3++) {
                boolean[] zArr = this.f85209r;
                int i4 = i3 - i;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    MusicModel musicModel = this.f85206o.get(i3);
                    if (musicModel != null) {
                        C35936b.m73312a(this.f85205n, musicModel.getMusicId(), i3);
                    }
                }
            }
        }
    }

    public MusicBoardWidget(int i) {
        this.f85210s = i;
    }

    /* renamed from: a */
    private void m73505a(List<Object> list) {
        if (list != null && this.f85202k < list.size()) {
            m73506a(((C35884ad) list.get(this.f85202k)).f84680b, ((C35884ad) list.get(this.f85202k)).f84679a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        m73505a((List) this.f80273e.mo60192a("list"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        ArrayList<C36050s> musicItemViews;
        MusicModel.CollectionType collectionType;
        ArrayList<C36050s> musicItemViews2;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        int i = 0;
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
                C35755a aVar = (C35755a) bVar2.mo60212a();
                if (((aVar.f84357a == 1 && this.f85202k == aVar.f84358b) || aVar.f84357a == 0) && ((ListItemWidget) this).f80253a != null) {
                    C36017m mVar = (C36017m) ((ListItemWidget) this).f80253a;
                    int i2 = 0;
                    while (i2 < mVar.f85055d.getChildCount() && (r0 = (C35990t) mVar.f85055d.getChildAt(i2)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                        Iterator<C36050s> it = musicItemViews.iterator();
                        while (it.hasNext()) {
                            C36050s next = it.next();
                            MusicModel musicModel = aVar.f84361e;
                            if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next.f85027w != null && musicModel.getMusicId().equals(next.f85027w.getMusicId())) {
                                MusicModel musicModel2 = next.f85027w;
                                if (aVar.f84360d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                next.mo63158d();
                                return;
                            }
                        }
                        i2++;
                    }
                    return;
                }
                return;
            case 1:
                m73507b(((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue(), ((Integer) this.f80273e.mo60195b("music_index", (Object) -1)).intValue());
                this.f80273e.mo60191a("music_position", (Object) -1);
                this.f80273e.mo60191a("music_index", (Object) -1);
                mo63221g();
                return;
            case 2:
                if (((ListItemWidget) this).f80253a != null) {
                    m73505a((List) bVar2.mo60212a());
                    return;
                }
                return;
            case 3:
                if (((ListItemWidget) this).f80253a != null) {
                    C36017m mVar2 = (C36017m) ((ListItemWidget) this).f80253a;
                    int i3 = this.f85201j;
                    boolean booleanValue = ((Boolean) this.f80273e.mo60192a("music_loading")).booleanValue();
                    if (i3 >= 0) {
                        while (i < mVar2.f85055d.getChildCount() && (r0 = (C35990t) mVar2.f85055d.getChildAt(i)) != null && (musicItemViews2 = r0.getMusicItemViews()) != null) {
                            Iterator<C36050s> it2 = musicItemViews2.iterator();
                            while (it2.hasNext()) {
                                C36050s next2 = it2.next();
                                if (next2.f85028x == i3) {
                                    next2.mo63155a(booleanValue, true);
                                    return;
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m73507b(((Integer) this.f80273e.mo60192a("music_position")).intValue(), ((Integer) this.f80273e.mo60192a("music_index")).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo63218a(int i, int i2) {
        if (((ListItemWidget) this).f80253a != null) {
            ((C36017m) ((ListItemWidget) this).f80253a).mo63180a(i, i2, this.f85208q, this.f85209r);
            mo63220f();
        }
    }

    /* renamed from: a */
    private void m73506a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list == null || musicCollectionItem == null) {
            ViewGroup.LayoutParams layoutParams = ((C36017m) ((ListItemWidget) this).f80253a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((C36017m) ((ListItemWidget) this).f80253a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f85202k == 0) {
            ((C36017m) ((ListItemWidget) this).f80253a).mo63184b();
        } else {
            ((C36017m) ((ListItemWidget) this).f80253a).mo63179a();
        }
        this.f85206o = list;
        C35754b bVar = new C35754b("change_music_page", musicCollectionItem.mcName, "", C35936b.f84812a);
        this.f85205n = bVar;
        bVar.mo62804a(musicCollectionItem.mcId);
        ((C36017m) ((ListItemWidget) this).f80253a).mo63181a(this.f85212u);
        ((C36017m) ((ListItemWidget) this).f80253a).mo63183a(musicCollectionItem, list, this.f85200i, this.f85201j, this.f85202k, this.f85205n, musicCollectionItem.isHot);
        ((C36017m) ((ListItemWidget) this).f80253a).mo63182a(new C36072d(this, musicCollectionItem), this.f85207p);
    }

    /* renamed from: b */
    private void m73507b(int i, int i2) {
        int i3;
        ArrayList<C36050s> musicItemViews;
        if (((ListItemWidget) this).f80253a != null) {
            C36017m mVar = (C36017m) ((ListItemWidget) this).f80253a;
            int i4 = this.f85201j;
            if (i == this.f85202k) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            mVar.f85059h = i3;
            if (i4 >= 0) {
                int i5 = 0;
                while (i5 < mVar.f85055d.getChildCount() && (r0 = (C35990t) mVar.f85055d.getChildAt(i5)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                    Iterator<C36050s> it = musicItemViews.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C36050s next = it.next();
                        if (next.f85028x == i4) {
                            next.mo63155a(false, false);
                            break;
                        }
                    }
                    i5++;
                }
            }
        }
        if (i != this.f85202k) {
            this.f85201j = -1;
        } else if (this.f85201j == i2) {
            this.f85199h.mo62875a((MusicModel) null);
        } else {
            this.f85201j = i2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60204a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f85203l) {
            mo60208d().setResult(-1, intent);
            mo60208d().finish();
        }
    }
}
