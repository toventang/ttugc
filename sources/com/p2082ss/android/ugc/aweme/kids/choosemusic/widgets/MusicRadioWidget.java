package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57252n;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget */
public final class MusicRadioWidget extends ListItemWidget<C57321p> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public C57171a f130688h;

    /* renamed from: i */
    public int f130689i = -1;

    /* renamed from: j */
    public AbstractC57234b f130690j;

    /* renamed from: k */
    public AbstractC57080c<C57192b> f130691k;

    /* renamed from: l */
    public AbstractC57237e f130692l;

    /* renamed from: m */
    private int f130693m = -1;

    /* renamed from: n */
    private boolean f130694n;

    static {
        Covode.recordClassIndex(67243);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget$b */
    public static final class C57336b implements C57321p.AbstractC57329b {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f130698a;

        static {
            Covode.recordClassIndex(67246);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.AbstractC57329b
        /* renamed from: a */
        public final void mo94545a() {
            this.f130698a.mo94553e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57336b(MusicRadioWidget musicRadioWidget) {
            this.f130698a = musicRadioWidget;
        }
    }

    /* renamed from: f */
    public final void mo94554f() {
        AbstractC57234b bVar = this.f130690j;
        if (bVar != null) {
            bVar.mo94416a((MusicModel) null);
        }
    }

    /* renamed from: e */
    public final void mo94553e() {
        if (!this.f130694n) {
            this.f130694n = true;
            this.f80273e.mo60191a("should_load_more_pick", (Object) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("music_index", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("status_pick_load_more", (AbstractC1214u<C33942b>) this).mo60189a("pick_list_more", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this).mo60189a("play_error", (AbstractC1214u<C33942b>) this).mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo60183a(aVar);
        List list = (List) this.f80273e.mo60192a("list");
        C57171a aVar2 = new C57171a("change_music_page", "my_fm", "click_start_your_fm", C57268c.f130442a);
        this.f130688h = aVar2;
        aVar2.f130166h = true;
        if (list != null && this.f130689i < list.size()) {
            Object obj = list.get(this.f130689i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.model.MusicBlockItem");
            List<MusicModel> list2 = ((C57252n) obj).f130411b;
            C57321p pVar = (C57321p) ((ListItemWidget) this).f80253a;
            pVar.f130642q = list2;
            List<MusicModel> list3 = pVar.f130642q;
            if (list3 != null && !list3.isEmpty()) {
                pVar.mo94533a(pVar.f130643r, false);
            }
            C57334a aVar3 = new C57334a(this, list2);
            C89219l.m154721d(aVar3, "");
            ((C57321p) ((ListItemWidget) this).f80253a).f130640o = aVar3;
        }
        ((C57321p) ((ListItemWidget) this).f80253a).f130641p = this.f130691k;
        ((C57321p) ((ListItemWidget) this).f80253a).f130639n = new C57336b(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (((ListItemWidget) this).f80253a != null) {
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            String str = bVar2.f80277a;
            String str2 = null;
            int i = -1;
            switch (str.hashCode()) {
                case -1322093457:
                    if (str.equals("play_compeleted")) {
                        Object a = bVar2.mo60212a();
                        MusicModel c = ((C57321p) ((ListItemWidget) this).f80253a).mo94538c();
                        if (c != null) {
                            str2 = c.getMusicId();
                        }
                        if (C89219l.m154714a(a, (Object) str2)) {
                            this.f80273e.mo60191a("music_position", (Object) -1);
                            this.f80273e.mo60191a("music_index", (Object) -1);
                            return;
                        }
                        return;
                    }
                    return;
                case -60075939:
                    if (str.equals("status_pick_load_more")) {
                        this.f130694n = false;
                        ((C57321p) ((ListItemWidget) this).f80253a).mo94535a((List<? extends MusicModel>) null);
                        return;
                    }
                    return;
                case 502104354:
                    if (str.equals("music_loading")) {
                        Integer num = (Integer) this.f80273e.mo60192a("music_position");
                        if (num != null) {
                            i = num.intValue();
                        }
                        if (this.f130689i == i) {
                            Object a2 = this.f80273e.mo60192a("music_loading");
                            C89219l.m154716b(a2, "");
                            ((C57321p) ((ListItemWidget) this).f80253a).mo94536a(true, ((Boolean) a2).booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 945257400:
                    if (str.equals("pick_list_more")) {
                        this.f130694n = false;
                        ((C57321p) ((ListItemWidget) this).f80253a).mo94535a((List) bVar2.mo60212a());
                        return;
                    }
                    return;
                case 1579846200:
                    if (str.equals("music_index")) {
                        Integer num2 = (Integer) this.f80273e.mo60195b("music_position", (Object) -1);
                        Integer num3 = (Integer) this.f80273e.mo60195b("music_index", (Object) -1);
                        int i2 = this.f130689i;
                        if (num2 != null && num2.intValue() == i2) {
                            int i3 = this.f130693m;
                            if (num3 != null && i3 == num3.intValue()) {
                                ((C57321p) ((ListItemWidget) this).f80253a).mo94536a(false, false);
                                AbstractC57234b bVar3 = this.f130690j;
                                if (bVar3 != null) {
                                    bVar3.mo94416a((MusicModel) null);
                                    return;
                                }
                                return;
                            }
                            C89219l.m154716b(num3, "");
                            this.f130693m = num3.intValue();
                            return;
                        }
                        ((C57321p) ((ListItemWidget) this).f80253a).mo94536a(false, false);
                        this.f130693m = -1;
                        return;
                    }
                    return;
                case 1912965437:
                    if (str.equals("play_error")) {
                        Object a3 = bVar2.mo60212a();
                        MusicModel c2 = ((C57321p) ((ListItemWidget) this).f80253a).mo94538c();
                        if (c2 != null) {
                            str2 = c2.getMusicId();
                        }
                        if (C89219l.m154714a(a3, (Object) str2)) {
                            this.f80273e.mo60191a("music_position", (Object) -1);
                            this.f80273e.mo60191a("music_index", (Object) -1);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget$a */
    static final class C57334a implements AbstractC57079b {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f130695a;

        /* renamed from: b */
        final /* synthetic */ List f130696b;

        static {
            Covode.recordClassIndex(67244);
        }

        C57334a(MusicRadioWidget musicRadioWidget, List list) {
            this.f130695a = musicRadioWidget;
            this.f130696b = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b
        /* renamed from: a */
        public final void mo94239a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            MusicModel musicModel2;
            String str2;
            if (viewHolder instanceof C57321p) {
                if (musicModel == null) {
                    List list = this.f130696b;
                    if (list == null || list.isEmpty()) {
                        this.f130695a.mo94553e();
                        return;
                    }
                    return;
                }
                C89219l.m154716b(view, "");
                int id = view.getId();
                if (id == R.id.bxo) {
                    Activity j = C17873f.m33102j();
                    if (j != null) {
                        C89219l.m154716b(j.getString(R.string.bs5), "");
                    }
                    C57321p pVar = (C57321p) viewHolder;
                    List<MusicModel> list2 = pVar.f130642q;
                    MusicModel musicModel3 = null;
                    if (!(list2 == null || C89070n.m154561b((List) list2, pVar.f130643r) == null)) {
                        List<MusicModel> list3 = pVar.f130642q;
                        if (list3 != null) {
                            musicModel2 = (MusicModel) C89070n.m154561b((List) list3, pVar.f130643r);
                        } else {
                            musicModel2 = null;
                        }
                        if (C57147c.m103544a(musicModel2, pVar.f130644s, true)) {
                            AbstractC57080c<C57192b> cVar = pVar.f130641p;
                            if (cVar != null) {
                                List<MusicModel> list4 = pVar.f130642q;
                                if (list4 != null) {
                                    musicModel3 = (MusicModel) C89070n.m154561b((List) list4, pVar.f130643r);
                                }
                                if (pVar.f130645t) {
                                    str2 = "unfollow_type";
                                } else {
                                    str2 = "follow_type";
                                }
                                cVar.mo94240a(new C57192b(musicModel3, str2, 0, pVar.f130643r));
                            }
                            pVar.f130645t = !pVar.f130645t;
                            CheckableImageView checkableImageView = pVar.f130634i;
                            if (checkableImageView != null) {
                                checkableImageView.mo98607b();
                            }
                        }
                    }
                    C57171a aVar = this.f130695a.f130688h;
                    if (aVar != null) {
                        aVar.f130161c = "click_button";
                    }
                    boolean z = pVar.f130645t;
                    String musicId = musicModel.getMusicId();
                    C57171a aVar2 = this.f130695a.f130688h;
                    musicModel.getLogPb();
                    C57268c.m103830a(z, musicId, aVar2);
                } else if (id == R.id.cds || id == R.id.ccy || id == R.id.cex) {
                    Integer num = (Integer) this.f130695a.f80273e.mo60195b("music_position", (Object) -1);
                    int i = this.f130695a.f130689i;
                    if (num != null && num.intValue() == i) {
                        Integer num2 = (Integer) this.f130695a.f80273e.mo60195b("music_index", (Object) -1);
                        int i2 = ((C57321p) viewHolder).f130643r;
                        if (num2 != null && num2.intValue() == i2) {
                            this.f130695a.f80273e.mo60191a("music_position", (Object) -1);
                            this.f130695a.f80273e.mo60191a("music_index", (Object) -1);
                            this.f130695a.mo94554f();
                            return;
                        }
                    }
                    C57321p pVar2 = (C57321p) viewHolder;
                    C57268c.f130443b = pVar2.f130643r;
                    C57171a aVar3 = this.f130695a.f130688h;
                    if (aVar3 != null) {
                        if (view.getId() == R.id.ccy) {
                            str = "click_start_your_fm";
                        } else {
                            str = "click_play_icon";
                        }
                        aVar3.f130161c = str;
                    }
                    this.f130695a.mo94554f();
                    pVar2.mo94536a(true, true);
                    AbstractC57234b bVar = this.f130695a.f130690j;
                    if (bVar != null) {
                        bVar.mo94415a(new C57136d.AbstractC57141a(this) {
                            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget.C57334a.C573351 */

                            /* renamed from: a */
                            final /* synthetic */ C57334a f130697a;

                            static {
                                Covode.recordClassIndex(67245);
                            }

                            {
                                this.f130697a = r1;
                            }

                            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d.AbstractC57141a
                            /* renamed from: a */
                            public final void mo94302a() {
                                this.f130697a.f130695a.f80273e.mo60191a("music_loading", (Object) false);
                            }
                        });
                    }
                    AbstractC57234b bVar2 = this.f130695a.f130690j;
                    if (bVar2 != null) {
                        bVar2.mo94417a(musicModel, this.f130695a.f130688h);
                    }
                    this.f130695a.f80273e.mo60191a("music_position", Integer.valueOf(this.f130695a.f130689i));
                    this.f130695a.f80273e.mo60191a("music_index", Integer.valueOf(pVar2.f130643r));
                    this.f130695a.f80273e.mo60191a("music_loading", (Object) true);
                } else if (id == R.id.cey) {
                    C57171a aVar4 = this.f130695a.f130688h;
                    if (aVar4 != null) {
                        aVar4.f130161c = "";
                    }
                    AbstractC57237e eVar = this.f130695a.f130692l;
                    if (eVar != null) {
                        eVar.mo94433b(8);
                    }
                    AbstractC57234b bVar3 = this.f130695a.f130690j;
                    if (bVar3 != null) {
                        bVar3.mo94419b(musicModel);
                    }
                    C57171a aVar5 = this.f130695a.f130688h;
                    String musicId2 = musicModel.getMusicId();
                    int i3 = this.f130695a.f130689i;
                    musicModel.getLogPb();
                    C57268c.m103826a(aVar5, musicId2, i3);
                }
            }
        }
    }
}
