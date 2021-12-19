package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57250l;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57278d;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57285j;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3306d.C57106a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.j */
public class C57213j extends AbstractC57199d implements AbstractC39063h.AbstractC39067a, AbstractC57233a<Music>, AbstractC57233a {

    /* renamed from: l */
    public AbstractC57234b f130331l;

    /* renamed from: m */
    private C57171a f130332m;

    static {
        Covode.recordClassIndex(67118);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "user_collected_music_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo94441b(Object obj) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: c */
    public final String mo60170c() {
        return "refresh_status_user_collected_music";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: d */
    public final String mo60171d() {
        return "loadmore_status_user_collected_music";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: g */
    public final boolean mo94420g() {
        return false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(302, new RunnableC90250g(C57213j.class, "onEvent", C57106a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: n */
    public final int mo94422n() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: o */
    public final String mo94423o() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: r */
    public final void mo94446r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        this.f130277d.mo94459b();
    }

    /* renamed from: m */
    public final View mo94442m() {
        if (this.f130279j == null) {
            return null;
        }
        return ((AbstractC57279e) this.f130279j).f130485b;
    }

    /* renamed from: p */
    public final C57174b mo94421k() {
        if (this.f130279j != null) {
            return (C57174b) this.f130279j.mo60179c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: q */
    public final void mo94445q() {
        if (this.f130277d != null) {
            this.f130277d.mo94459b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public final DataCenter mo60172e() {
        this.f130278e = super.mo60172e();
        this.f130278e.mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this);
        return this.f130278e;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo94447s() {
        if (this.f130277d != null && this.f130278e != null) {
            C33935b bVar = (C33935b) this.f130278e.mo60192a("user_collected_music_list");
            if ((this.f130279j instanceof AbstractC57279e) && ((AbstractC57279e) this.f130279j).f130492i) {
                if (this.f130279j != null) {
                    this.f130279j.mo60175a();
                }
                C57238a aVar = this.f130277d;
                int intValue = ((Integer) bVar.mo60174a("list_cursor")).intValue();
                if (!aVar.f130384f) {
                    aVar.f130384f = true;
                    ChooseMusicApi.m103644a(intValue).mo5534a(new C57250l(aVar), C1731i.f5564c, null);
                }
            }
        }
    }

    @AbstractC90264r
    public void onEvent(C57106a aVar) {
        if (this.f130278e != null && aVar != null) {
            this.f130278e.mo60191a("music_collect_status", new C57191a(0, aVar.f130016a, -1, -1, aVar.f130017b));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: b */
    public final AbstractC33936c mo94418b(View view) {
        C57285j jVar = new C57285j(getContext(), view, this, this, this, this.f130280k);
        jVar.mo94479a(new AbstractC57234b() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.C57213j.C572141 */

            static {
                Covode.recordClassIndex(67119);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
            /* renamed from: a */
            public final void mo94415a(C57136d.AbstractC57141a aVar) {
                if (C57213j.this.f130331l != null) {
                    C57213j.this.f130331l.mo94415a(aVar);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
            /* renamed from: b */
            public final void mo94419b(MusicModel musicModel) {
                if (C57213j.this.f130331l != null) {
                    C57213j.this.f130331l.mo94419b(musicModel);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
            /* renamed from: a */
            public final void mo94416a(MusicModel musicModel) {
                if (C57213j.this.f130331l != null) {
                    C57213j.this.f130331l.mo94416a(musicModel);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
            /* renamed from: a */
            public final void mo94417a(MusicModel musicModel, C57171a aVar) {
                if (C57213j.this.f130331l != null) {
                    C57213j.this.f130331l.mo94417a(musicModel, aVar);
                }
                if (((Integer) C57213j.this.f130278e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                    C57213j.this.f130278e.mo60191a("music_position", (Object) -1);
                    C57213j.this.f130278e.mo60191a("music_index", (Object) -1);
                }
            }
        });
        C57171a aVar = new C57171a("change_music_page", "favorite_song", "", C57268c.f130442a);
        this.f130332m = aVar;
        jVar.mo94478a(aVar);
        jVar.mo94480a(false);
        jVar.mo94483a(new C57215k(this));
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        MusicModel musicModel;
        super.setUserVisibleHint(z);
        if (z && (mo94442m() instanceof RecyclerView) && (recyclerView = (RecyclerView) mo94442m()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int m = linearLayoutManager.mo4373m();
            AbstractC39060f c = this.f130279j.mo60179c();
            if (c != null) {
                List e = c.mo63369e();
                if (!C13603b.m24435a((Collection) e)) {
                    for (int k = linearLayoutManager.mo4371k(); k < m; k++) {
                        if (k >= 0 && k < e.size() && (musicModel = (MusicModel) e.get(k)) != null) {
                            C57171a aVar = this.f130332m;
                            String musicId = musicModel.getMusicId();
                            musicModel.getMatchedPGCSoundInfo();
                            C57268c.m103827a(aVar, musicId, k, true);
                        }
                    }
                }
            }
        }
        if (this.f130279j instanceof C57285j) {
            ((AbstractC57278d) this.f130279j).mo94480a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57199d
    /* renamed from: a */
    public final void mo94414a(C33942b bVar) {
        super.onChanged(bVar);
        if (af_()) {
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                C57191a aVar = (C57191a) bVar.mo60212a();
                if (aVar.f130231a == 0 && aVar.f130234d == 1) {
                    MusicModel musicModel = aVar.f130235e;
                    if (!(this.f130279j == null || this.f130279j.mo60179c() == null)) {
                        List e = this.f130279j.mo60179c().mo63369e();
                        if (e == null) {
                            e = new ArrayList();
                        }
                        for (int i = 0; i < e.size(); i++) {
                            if (musicModel.getMusicId().equals(((MusicModel) e.get(i)).getMusicId())) {
                                return;
                            }
                        }
                        if (e.size() == 0) {
                            e.add(musicModel);
                            this.f130279j.mo60176a(e, false);
                            return;
                        }
                        e.add(0, musicModel);
                        this.f130279j.mo60179c().notifyItemInserted(0);
                        if ((this.f130279j instanceof AbstractC57279e) && ((AbstractC57279e) this.f130279j).f130485b != null) {
                            ((AbstractC57279e) this.f130279j).f130485b.mo4413b(0);
                        }
                    }
                }
            } else if (str.equals("music_index") && ((Integer) this.f130278e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                mo94421k().mo94375l();
            }
        }
    }
}
