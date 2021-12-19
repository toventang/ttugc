package com.p2082ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35896ap;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35897aq;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j;
import com.p2082ss.android.ugc.aweme.discover.helper.C42040m;
import com.p2082ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80457fu;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.s */
public final class C60867s implements AbstractC84163d {

    /* renamed from: a */
    public AbstractC60848f f138324a;

    /* renamed from: b */
    public AbstractC60847e f138325b;

    /* renamed from: c */
    public C60841a f138326c;

    /* renamed from: d */
    public C84157d f138327d;

    /* renamed from: e */
    public String f138328e;

    /* renamed from: f */
    public boolean f138329f;

    /* renamed from: g */
    private List<MusicModel> f138330g;

    /* renamed from: h */
    private String f138331h;

    /* renamed from: i */
    private boolean f138332i = true;

    /* renamed from: j */
    private String f138333j = "";

    /* renamed from: k */
    private AbstractC41957c f138334k = C67446h.f151111a.mo106217f().mo71108a();

    /* renamed from: l */
    private AbstractC42023j f138335l;

    static {
        Covode.recordClassIndex(71455);
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d
    /* renamed from: b */
    public final void mo98520b() {
        this.f138329f = false;
        AbstractC60848f fVar = this.f138324a;
        if (fVar != null) {
            fVar.mo62809a(null, false, true);
        }
    }

    /* renamed from: a */
    public final C84157d mo98517a() {
        if (this.f138327d == null) {
            C84157d dVar = new C84157d();
            this.f138327d = dVar;
            dVar.mo128982a(this);
        }
        return this.f138327d;
    }

    public C60867s(AbstractC60848f fVar) {
        this.f138324a = fVar;
        this.f138326c = new C60841a();
        this.f138330g = new ArrayList();
        if (!C68027bm.m120329a()) {
            mo98517a();
        }
        this.f138329f = false;
    }

    /* renamed from: a */
    private static List<MusicModel> m110491a(List<MusicModel> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (MusicModel musicModel : list) {
            if (musicModel instanceof C35897aq) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof C35896ap) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof DynamicMusicModel) {
                arrayList.add(musicModel);
            } else if (musicModel instanceof MusicTitleModel) {
                arrayList.add(musicModel);
            } else if (!(musicModel == null || musicModel.getMusic() == null || !hashSet.add(musicModel.getMusic().getMid()))) {
                arrayList.add(musicModel);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d
    /* renamed from: a */
    public final synchronized void mo98519a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        boolean z2;
        boolean z3;
        String str6;
        boolean z4;
        MethodCollector.m26663i(3987);
        boolean z5 = false;
        this.f138329f = false;
        AwemeSearchMusicList a = C60841a.m110439a(str);
        if (a != null) {
            if (!(a.globalDoodleConfig == null || this.f138324a == null || TextUtils.equals(a.globalDoodleConfig.getRequestKeyword(), this.f138328e))) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enter_from", "choose_music");
                    jSONObject.put("search_type", "music");
                    jSONObject.put("search_from", this.f138333j);
                    if (!z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jSONObject.put("is_refresh", z4);
                    jSONObject.put("is_server_keyword_null", TextUtils.isEmpty(a.globalDoodleConfig.getRequestKeyword()));
                    C39162r.m79461a("search_keyword_conflict", jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AbstractC60848f fVar = this.f138324a;
            if (fVar != null) {
                C80457fu fuVar = new C80457fu();
                fuVar.put(LogPbBean.class, a.logPb);
                fVar.mo62808a(fuVar);
            }
        }
        ArrayList<MusicModel> a2 = this.f138326c.mo98493a(a);
        if (!C13603b.m24435a((Collection) a2)) {
            if (!z) {
                if (a.logPb != null) {
                    str6 = a.logPb.getImprId();
                } else {
                    str6 = "";
                }
                this.f138331h = str6;
            }
            AbstractC41957c cVar = this.f138334k;
            if (!z && cVar != null) {
                cVar.mo71125b();
            }
            GlobalDoodleConfig globalDoodleConfig = a.globalDoodleConfig;
            if (globalDoodleConfig == null || globalDoodleConfig.getSoundsListType() != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            AbstractC42023j jVar = this.f138335l;
            if (z2) {
                if (jVar == null) {
                    jVar = C67446h.f151111a.mo106217f().mo71118b();
                    this.f138335l = jVar;
                }
                if (!z) {
                    C35896ap apVar = new C35896ap();
                    apVar.setLogPb(a.logPb);
                    a2.add(0, apVar);
                    jVar.mo71150a();
                }
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                MusicModel musicModel = a2.get(i);
                musicModel.setSearchKeyWords(this.f138328e);
                musicModel.setSearchId(this.f138331h);
                AbstractC41957c cVar2 = this.f138334k;
                if (cVar2 != null) {
                    boolean z6 = !a.isHasMore();
                    if (i == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar2.mo71124a(z6 & z3, C60868t.f138336a, new C60869u(i));
                }
                GlobalDoodleConfig globalDoodleConfig2 = a.globalDoodleConfig;
                Music music = musicModel.getMusic();
                AbstractC42023j jVar2 = this.f138335l;
                if (!(music == null || globalDoodleConfig2 == null)) {
                    musicModel.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    music.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    if (jVar2 != null) {
                        jVar2.mo71151a(new C60871w(music, musicModel));
                    }
                }
            }
            AbstractC41957c cVar3 = this.f138334k;
            if (cVar3 != null) {
                cVar3.mo71123a(new C60870v(size, a, a2));
            }
        }
        if (!z) {
            this.f138330g.clear();
        }
        if (a2 != null) {
            this.f138330g.addAll(a2);
        }
        if (!(this.f138325b == null || a == null || a.correctInfo == null)) {
            a.correctInfo.setLogPb(a.logPb);
        }
        if (this.f138324a != null) {
            GlobalDoodleConfig globalDoodleConfig3 = a.globalDoodleConfig;
            AbstractC60848f fVar2 = this.f138324a;
            List<MusicModel> a3 = m110491a(this.f138330g);
            if (globalDoodleConfig3 == null || globalDoodleConfig3.getDisplayFilterBar() == 1) {
                z5 = true;
            }
            fVar2.mo62809a(a3, z, z5);
        }
        if (!z && a != null) {
            if (a.globalDoodleConfig != null) {
                str2 = a.globalDoodleConfig.getRequestKeyword();
            } else {
                str2 = "";
            }
            if (a.logPb != null) {
                str3 = a.logPb.getImprId();
            } else {
                str3 = "";
            }
            if (a.globalDoodleConfig != null) {
                str4 = a.globalDoodleConfig.getSearchChannel();
            } else {
                str4 = "";
            }
            if (a.globalDoodleConfig != null) {
                str5 = a.globalDoodleConfig.getNewSource();
            } else {
                str5 = "";
            }
            if (a.extra != null) {
                j = a.extra.now;
            } else {
                j = 0;
            }
            SearchServiceImpl.m119336t().mo106225n().mo71203a(new C42040m(str2, str3, str4, str5, Long.valueOf(j)));
        }
        MethodCollector.m26664o(3987);
    }

    /* renamed from: a */
    public final void mo98518a(C35890aj ajVar, String str, String str2, boolean z, int i, int i2, int i3, String str3) {
        this.f138329f = true;
        this.f138332i = z;
        this.f138333j = str3;
        if (!AccountService.m65215a().mo57069e().isChildrenMode()) {
            mo98517a().mo128983a(this.f138326c.mo98492a(str, false, str2, z, i, i2, i3, ajVar.mo62983b(), ajVar.mo62984c()), false);
            this.f138328e = str;
        }
    }
}
