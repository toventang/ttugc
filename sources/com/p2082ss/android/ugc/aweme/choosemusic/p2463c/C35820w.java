package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

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
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35904f;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35980l;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35987r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.w */
public class C35820w extends AbstractC35794i implements AbstractC35826a<Music>, AbstractC39063h.AbstractC39067a, C39211a.AbstractC39212a {

    /* renamed from: m */
    public AbstractC35827b f84585m;

    /* renamed from: n */
    private C35754b f84586n;

    static {
        Covode.recordClassIndex(43059);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: a */
    public final void mo62873a(C35755a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "user_collected_music_list";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62848b(Music music) {
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
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: g */
    public final boolean mo62884g() {
        return false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(329, new RunnableC90250g(C35820w.class, "onEvent", C60793b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: o */
    public final int mo62834o() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: p */
    public final String mo62835p() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: q */
    public final int mo62836q() {
        return R.layout.a19;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: t */
    public final void mo62849t() {
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: v */
    public final void mo62851v() {
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        super.mo60168a();
        this.f84492d.mo63026b(this.f84495k);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        if (this.f84494j == null) {
            return null;
        }
        return ((AbstractC35981m) this.f84494j).f84951b;
    }

    /* renamed from: s */
    public final C35703b mo62887k() {
        if (this.f84494j != null) {
            return (C35703b) this.f84494j.mo60179c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: u */
    public final void mo62850u() {
        if (this.f84492d != null) {
            this.f84492d.mo63026b(this.f84495k);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i, com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public final DataCenter mo60172e() {
        this.f84493e = super.mo60172e();
        this.f84493e.mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this);
        return this.f84493e;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62929w() {
        if (this.f84492d != null && this.f84493e != null) {
            C33935b bVar = (C33935b) this.f84493e.mo60192a("user_collected_music_list");
            if ((this.f84494j instanceof AbstractC35981m) && ((AbstractC35981m) this.f84494j).f84959j) {
                if (this.f84494j != null) {
                    this.f84494j.mo60175a();
                }
                if (bVar != null) {
                    C35899b bVar2 = this.f84492d;
                    int intValue = ((Integer) bVar.mo60174a("list_cursor")).intValue();
                    int i = this.f84495k;
                    if (!bVar2.f84734g) {
                        bVar2.f84734g = true;
                        ChooseMusicApi.m72936a(intValue, 20, i).mo5534a(new C35904f(bVar2), C1731i.f5564c, null);
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public void onEvent(C60793b bVar) {
        if (this.f84493e != null && bVar != null) {
            this.f84493e.mo60191a("music_collect_status", new C35755a(0, bVar.f138150a, -1, -1, bVar.f138151b));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: b */
    public final AbstractC33936c mo62831b(View view) {
        C35987r rVar = new C35987r(getContext(), view, this, this, this, this.f84496l);
        rVar.mo63131a(new AbstractC35827b() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.C35820w.C358211 */

            static {
                Covode.recordClassIndex(43060);
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
            /* renamed from: a */
            public final void mo62874a(MusicDownloadPlayHelper.AbstractC61086a aVar) {
                if (C35820w.this.f84585m != null) {
                    C35820w.this.f84585m.mo62874a(aVar);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
            /* renamed from: b */
            public final void mo62881b(MusicModel musicModel) {
                if (C35820w.this.f84585m != null) {
                    C35820w.this.f84585m.mo62881b(musicModel);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
            /* renamed from: a */
            public final void mo62875a(MusicModel musicModel) {
                if (C35820w.this.f84585m != null) {
                    C35820w.this.f84585m.mo62875a(musicModel);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
            /* renamed from: a */
            public final void mo62877a(MusicModel musicModel, C35754b bVar) {
                if (C35820w.this.f84585m != null) {
                    C35820w.this.f84585m.mo62877a(musicModel, bVar);
                }
                if (((Integer) C35820w.this.f84493e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                    C35820w.this.f84493e.mo60191a("music_position", (Object) -1);
                    C35820w.this.f84493e.mo60191a("music_index", (Object) -1);
                }
            }
        });
        C35754b bVar = new C35754b("change_music_page", "favorite_song", "", C35936b.f84812a);
        this.f84586n = bVar;
        rVar.mo63130a(bVar);
        rVar.mo63132a(false);
        rVar.mo63135a(new C35822x(this));
        return rVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        MusicModel musicModel;
        boolean z2;
        super.setUserVisibleHint(z);
        if (z && (mo62680m() instanceof RecyclerView) && (recyclerView = (RecyclerView) mo62680m()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int m = linearLayoutManager.mo4373m();
            AbstractC39060f c = this.f84494j.mo60179c();
            if (c != null) {
                List e = c.mo63369e();
                if (!C13603b.m24435a((Collection) e)) {
                    for (int k = linearLayoutManager.mo4371k(); k < m; k++) {
                        if (k >= 0 && k < e.size() && (musicModel = (MusicModel) e.get(k)) != null) {
                            C35754b bVar = this.f84586n;
                            String musicId = musicModel.getMusicId();
                            if (musicModel.getMatchedPGCSoundInfo() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C35936b.m73314a(bVar, musicId, k, true, z2);
                        }
                    }
                }
            }
        }
        if (this.f84494j instanceof C35987r) {
            ((AbstractC35980l) this.f84494j).mo63132a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i
    /* renamed from: a */
    public final void mo62872a(C33942b bVar) {
        super.onChanged(bVar);
        if (af_()) {
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                C35755a aVar = (C35755a) bVar.mo60212a();
                if (aVar.f84357a == 0 && aVar.f84360d == 1) {
                    MusicModel musicModel = aVar.f84361e;
                    if (!(this.f84494j == null || this.f84494j.mo60179c() == null)) {
                        List e = this.f84494j.mo60179c().mo63369e();
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
                            this.f84494j.mo60176a(e, false);
                            return;
                        }
                        e.add(0, musicModel);
                        this.f84494j.mo60179c().notifyItemInserted(0);
                        if ((this.f84494j instanceof AbstractC35981m) && ((AbstractC35981m) this.f84494j).f84951b != null) {
                            ((AbstractC35981m) this.f84494j).f84951b.mo4413b(0);
                        }
                    }
                }
            } else if (str.equals("music_index") && ((Integer) this.f84493e.mo60195b("music_position", (Object) -1)).intValue() == -2) {
                mo62887k().mo62745a();
            }
        }
    }
}
