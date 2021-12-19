package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

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
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57252n;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57288l;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57310i;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget */
public class MusicBoardWidget extends ListItemWidget<C57310i> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public AbstractC57234b f130670h;

    /* renamed from: i */
    public int f130671i;

    /* renamed from: j */
    int f130672j = -1;

    /* renamed from: k */
    public int f130673k = -1;

    /* renamed from: l */
    public int f130674l;

    /* renamed from: m */
    int f130675m;

    /* renamed from: n */
    C57171a f130676n;

    /* renamed from: o */
    List<MusicModel> f130677o;

    /* renamed from: p */
    public AbstractC57080c<C57192b> f130678p;

    /* renamed from: q */
    boolean[] f130679q = new boolean[3];

    /* renamed from: r */
    boolean[] f130680r = new boolean[3];

    /* renamed from: s */
    public C57136d.AbstractC57141a f130681s = new C57339c(this);

    /* renamed from: t */
    private ViewPager.AbstractC1579e f130682t = new ViewPager.AbstractC1579e() {
        /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget.C573321 */

        static {
            Covode.recordClassIndex(67240);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            MusicBoardWidget.this.f130671i = i;
            for (int i2 = 0; i2 < MusicBoardWidget.this.f130680r.length; i2++) {
                MusicBoardWidget.this.f130680r[i2] = MusicBoardWidget.this.f130679q[i2];
            }
            MusicBoardWidget.this.mo94551f();
        }
    };

    static {
        Covode.recordClassIndex(67239);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: g */
    public final void mo94552g() {
        this.f130670h.mo94416a((MusicModel) null);
    }

    /* renamed from: e */
    public final void mo94550e() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f130680r;
            if (i < zArr.length) {
                this.f130679q[i] = false;
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
        this.f130675m = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
    }

    /* renamed from: f */
    public final void mo94551f() {
        int i;
        if (!C13603b.m24435a((Collection) this.f130677o)) {
            int i2 = this.f130671i;
            if (i2 * 3 < 0) {
                i = 0;
            } else {
                i = i2 * 3;
            }
            int min = Math.min(i + 3, this.f130677o.size());
            for (int i3 = i; i3 < min; i3++) {
                boolean[] zArr = this.f130680r;
                int i4 = i3 - i;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    MusicModel musicModel = this.f130677o.get(i3);
                    if (musicModel != null) {
                        C57268c.m103827a(this.f130676n, musicModel.getMusicId(), i3, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m103927a(List<Object> list) {
        if (list != null && this.f130673k < list.size()) {
            m103928a(((C57252n) list.get(this.f130673k)).f130411b, ((C57252n) list.get(this.f130673k)).f130410a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        m103927a((List) this.f80273e.mo60192a("list"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        ArrayList<C57320o> musicItemViews;
        MusicModel.CollectionType collectionType;
        ArrayList<C57320o> musicItemViews2;
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
                C57191a aVar = (C57191a) bVar2.mo60212a();
                if (((aVar.f130231a == 1 && this.f130673k == aVar.f130232b) || aVar.f130231a == 0) && ((ListItemWidget) this).f80253a != null) {
                    C57310i iVar = (C57310i) ((ListItemWidget) this).f80253a;
                    int i2 = 0;
                    while (i2 < iVar.f130580d.getChildCount() && (r0 = (C57288l) iVar.f130580d.getChildAt(i2)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                        Iterator<C57320o> it = musicItemViews.iterator();
                        while (it.hasNext()) {
                            C57320o next = it.next();
                            MusicModel musicModel = aVar.f130235e;
                            if (musicModel != null && !TextUtils.isEmpty(musicModel.getMusicId()) && next.f130555u != null && musicModel.getMusicId().equals(next.f130555u.getMusicId())) {
                                MusicModel musicModel2 = next.f130555u;
                                if (aVar.f130234d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                next.mo94505c();
                                return;
                            }
                        }
                        i2++;
                    }
                    return;
                }
                return;
            case 1:
                m103929b(((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue(), ((Integer) this.f80273e.mo60195b("music_index", (Object) -1)).intValue());
                this.f80273e.mo60191a("music_position", (Object) -1);
                this.f80273e.mo60191a("music_index", (Object) -1);
                mo94552g();
                return;
            case 2:
                if (((ListItemWidget) this).f80253a != null) {
                    m103927a((List) bVar2.mo60212a());
                    return;
                }
                return;
            case 3:
                if (((ListItemWidget) this).f80253a != null) {
                    C57310i iVar2 = (C57310i) ((ListItemWidget) this).f80253a;
                    int i3 = this.f130672j;
                    boolean booleanValue = ((Boolean) this.f80273e.mo60192a("music_loading")).booleanValue();
                    if (i3 >= 0) {
                        while (i < iVar2.f130580d.getChildCount() && (r0 = (C57288l) iVar2.f130580d.getChildAt(i)) != null && (musicItemViews2 = r0.getMusicItemViews()) != null) {
                            Iterator<C57320o> it2 = musicItemViews2.iterator();
                            while (it2.hasNext()) {
                                C57320o next2 = it2.next();
                                if (next2.f130556v == i3) {
                                    next2.mo94503a(booleanValue, true);
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
                m103929b(((Integer) this.f80273e.mo60192a("music_position")).intValue(), ((Integer) this.f80273e.mo60192a("music_index")).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo94549a(int i, int i2) {
        if (((ListItemWidget) this).f80253a != null) {
            ((C57310i) ((ListItemWidget) this).f80253a).mo94522a(i, i2, this.f130679q, this.f130680r);
            mo94551f();
        }
    }

    /* renamed from: a */
    private void m103928a(List<MusicModel> list, C57110d dVar) {
        if (list == null || dVar == null) {
            ViewGroup.LayoutParams layoutParams = ((C57310i) ((ListItemWidget) this).f80253a).itemView.getLayoutParams();
            layoutParams.height = 0;
            ((C57310i) ((ListItemWidget) this).f80253a).itemView.setLayoutParams(layoutParams);
            return;
        }
        if (this.f130673k == 0) {
            ((C57310i) ((ListItemWidget) this).f80253a).mo94526b();
        } else {
            ((C57310i) ((ListItemWidget) this).f80253a).mo94521a();
        }
        this.f130677o = list;
        C57171a aVar = new C57171a("change_music_page", dVar.f130025b, "", C57268c.f130442a);
        this.f130676n = aVar;
        aVar.mo94370a(dVar.f130024a);
        ((C57310i) ((ListItemWidget) this).f80253a).mo94523a(this.f130682t);
        ((C57310i) ((ListItemWidget) this).f80253a).mo94524a(dVar, list, this.f130671i, this.f130672j, this.f130673k, this.f130676n, dVar.f130028e);
        ((C57310i) ((ListItemWidget) this).f80253a).mo94525a(new C57340d(this, dVar), this.f130678p);
    }

    /* renamed from: b */
    private void m103929b(int i, int i2) {
        int i3;
        ArrayList<C57320o> musicItemViews;
        if (((ListItemWidget) this).f80253a != null) {
            C57310i iVar = (C57310i) ((ListItemWidget) this).f80253a;
            int i4 = this.f130672j;
            if (i == this.f130673k) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            iVar.f130584h = i3;
            if (i4 >= 0) {
                int i5 = 0;
                while (i5 < iVar.f130580d.getChildCount() && (r0 = (C57288l) iVar.f130580d.getChildAt(i5)) != null && (musicItemViews = r0.getMusicItemViews()) != null) {
                    Iterator<C57320o> it = musicItemViews.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C57320o next = it.next();
                        if (next.f130556v == i4) {
                            next.mo94503a(false, false);
                            break;
                        }
                    }
                    i5++;
                }
            }
        }
        if (i != this.f130673k) {
            this.f130672j = -1;
        } else if (this.f130672j == i2) {
            this.f130670h.mo94416a((MusicModel) null);
        } else {
            this.f130672j = i2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60204a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f130674l) {
            mo60208d().setResult(-1, intent);
            mo60208d().finish();
        }
    }
}
