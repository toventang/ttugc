package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35891ak;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35712h;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2469a.C35843a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.AbstractC35849a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.C35851b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35855a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35958ab;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60792a;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60825c;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60846d;
import com.p2082ss.android.ugc.aweme.music.presenter.C60853j;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.p3690f.C67432a;
import com.p2082ss.android.ugc.aweme.search.p3690f.C67433b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.j */
public abstract class AbstractC35797j extends AbstractC34586a implements AbstractC35827b, AbstractC35849a.AbstractC35850a, AbstractC39063h.AbstractC39067a, AbstractC60731k<C35757c>, AbstractC60846d, AbstractC61180m, AbstractC90252i, AbstractC90253j {

    /* renamed from: y */
    private static final String f84503y = AbstractC35797j.class.getName();

    /* renamed from: A */
    private String f84504A;

    /* renamed from: B */
    private int f84505B;

    /* renamed from: C */
    private C60853j f84506C;

    /* renamed from: D */
    private C35712h f84507D;

    /* renamed from: E */
    private C35958ab f84508E;

    /* renamed from: F */
    private boolean f84509F = true;

    /* renamed from: G */
    private C35857c f84510G = new C35857c();

    /* renamed from: a */
    C35851b f84511a;

    /* renamed from: b */
    public RecyclerView f84512b;

    /* renamed from: c */
    TuxStatusView f84513c;

    /* renamed from: d */
    View f84514d;

    /* renamed from: e */
    boolean f84515e;

    /* renamed from: j */
    public C35703b f84516j;

    /* renamed from: k */
    C35843a f84517k;

    /* renamed from: l */
    MusicSearchStateViewModel f84518l;

    /* renamed from: m */
    protected ChooseMusicDownloadPlayHelper f84519m;

    /* renamed from: n */
    public AbstractC35800b f84520n;

    /* renamed from: o */
    public int f84521o;

    /* renamed from: p */
    protected List<MusicModel> f84522p = new ArrayList();

    /* renamed from: q */
    String f84523q;

    /* renamed from: r */
    String f84524r;

    /* renamed from: s */
    boolean f84525s = false;

    /* renamed from: t */
    public AbstractC35801c f84526t;

    /* renamed from: u */
    public MusicModel f84527u;

    /* renamed from: v */
    public AbstractC35799a f84528v;

    /* renamed from: w */
    public View.OnClickListener f84529w;

    /* renamed from: z */
    private String f84530z = "popular_song";

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.j$a */
    public interface AbstractC35799a {
        static {
            Covode.recordClassIndex(43038);
        }

        /* renamed from: a */
        void mo62863a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.j$b */
    public interface AbstractC35800b {
        static {
            Covode.recordClassIndex(43039);
        }

        /* renamed from: a */
        void mo62805a(int i, String str, MusicModel musicModel, String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.j$c */
    public interface AbstractC35801c {
        static {
            Covode.recordClassIndex(43040);
        }

        /* renamed from: a */
        void mo62862a();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract TuxStatusView.C23263c mo62853b();

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(218, new RunnableC90250g(AbstractC35797j.class, "onPauseSearchMusicEvent", C67432a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(219, new RunnableC90250g(AbstractC35797j.class, "onMobMusicTypeEvent", C60792a.class, ThreadMode.POSTING, 0, true));
        hashMap.put(220, new RunnableC90250g(AbstractC35797j.class, "onShootSearchMusicEvent", C67433b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(49, new RunnableC90250g(AbstractC35797j.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f84527u;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        return af_();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        return getActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62910s() {
        AbstractC35799a aVar = this.f84528v;
        if (aVar != null) {
            aVar.mo62863a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo62901m() {
        C35958ab abVar = this.f84508E;
        if (abVar != null) {
            abVar.f84881d = false;
        }
    }

    /* renamed from: o */
    public final void mo62903o() {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84519m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
        }
    }

    static {
        Covode.recordClassIndex(43036);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        return new Analysis().setLabelName("music_library_list");
    }

    /* renamed from: n */
    public final void mo62902n() {
        C35703b bVar = this.f84516j;
        if (bVar != null) {
            bVar.mo62745a();
        }
        C67446h.f151111a.mo106195a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.f84512b;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    /* renamed from: t */
    private boolean m73077t() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo62897d() {
        if (af_()) {
            this.f84515e = false;
            this.f84513c.setVisibility(8);
            this.f84512b.setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo62898e() {
        if (af_()) {
            this.f84515e = true;
            this.f84513c.setVisibility(0);
            this.f84513c.mo37867a();
            this.f84512b.setVisibility(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mo62903o();
        this.f84519m.mo63045d();
        C35851b bVar = this.f84511a;
        if (bVar != null) {
            bVar.mo67840h();
            this.f84511a.ck_();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C67446h.f151111a.mo106196a(hashCode());
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84519m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.f138618n = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo62909q() {
        C35894an a;
        C35843a aVar = this.f84517k;
        if (aVar != null && (a = aVar.mo62951a(this.f84523q)) != null) {
            this.f84510G.mo62965a(a);
        }
    }

    /* renamed from: g */
    public final void mo62899g() {
        if (af_()) {
            C39162r.m79460a("music_search_feedback_show", new C33744d().mo59983a("enter_from", "video_shoot_page").f79943a);
            this.f84515e = false;
            this.f84513c.setVisibility(0);
            this.f84513c.setStatus(mo62853b());
            this.f84512b.setVisibility(4);
        }
    }

    /* renamed from: k */
    public final void mo62900k() {
        if (af_()) {
            this.f84515e = false;
            this.f84513c.setVisibility(0);
            this.f84513c.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C35807p(this)));
            this.f84512b.setVisibility(4);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C35703b bVar = this.f84516j;
        if (bVar != null) {
            bVar.mo62745a();
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84519m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
            this.f84519m.f138618n = true;
        }
        C60825c.m110422a().pause();
        C67446h.f151111a.mo106195a();
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.AbstractC35849a.AbstractC35850a
    /* renamed from: p */
    public final void mo62908p() {
        if (af_() && getContext() != null) {
            new C79459a(getContext()).mo123050a(R.string.dcq).mo123053a();
        }
    }

    /* renamed from: c */
    public final void mo62896c() {
        this.f84515e = false;
        this.f84513c.setVisibility(8);
        mo62902n();
        mo62901m();
        List<MusicSearchHistory> e = C35836c.m73228g().mo62944e();
        if (e.size() > 0) {
            this.f84512b.setVisibility(0);
            if (this.f84507D == null) {
                this.f84507D = new C35712h();
            }
            this.f84512b.setAdapter(this.f84507D);
            this.f84507D.mo62759a(e);
            return;
        }
        this.f84512b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62852a() {
        C35703b bVar = new C35703b((AbstractC60731k<C35757c>) this, true);
        this.f84516j = bVar;
        bVar.f84226i = this.f84505B;
        this.f84512b.setVisibility(8);
        this.f84516j.mo67829d(true);
        this.f84516j.mo67820g(C0643b.m2378c(getContext(), R.color.c5));
        this.f84516j.f92244p = "music_list";
        this.f84516j.f84222e = new C35754b("search_music", "", "", C35936b.f84812a);
        this.f84516j.f84218a = this;
        this.f84519m.mo63043b();
        this.f84519m.f138612h = new C35804m(this);
        this.f84519m.mo98622b(this.f84505B);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        this.f84512b.setLayoutManager(wrapLinearLayoutManager);
        this.f84516j.mo67813a((AbstractC39063h.AbstractC39067a) this);
        C35958ab abVar = new C35958ab(new C35805n(this), 10);
        this.f84508E = abVar;
        abVar.f84881d = false;
        this.f84508E.mo63094a(this.f84512b);
        C60853j jVar = new C60853j(getActivity());
        this.f84506C = jVar;
        jVar.mo67839a_(this);
        this.f84514d.setOnClickListener(new View$OnClickListenerC35806o(this));
        mo62896c();
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62875a(MusicModel musicModel) {
        mo62903o();
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62874a(MusicDownloadPlayHelper.AbstractC61086a aVar) {
        this.f84519m.f138612h = aVar;
    }

    @AbstractC90264r
    public void onPauseSearchMusicEvent(C67432a aVar) {
        C35703b bVar = this.f84516j;
        if (bVar != null) {
            bVar.mo62745a();
        }
    }

    @AbstractC90264r
    public void onShootSearchMusicEvent(C67433b bVar) {
        mo62881b(bVar.f151072a.convertToMusicModel());
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: b */
    public final void mo62881b(MusicModel musicModel) {
        this.f84519m.f138615k = this.f84530z;
        this.f84519m.mo97993a(musicModel, this.f84521o, true, m73077t());
    }

    @AbstractC90264r(mo145423b = true)
    public void onMobMusicTypeEvent(C60792a aVar) {
        String str = aVar.f138149a;
        if (str == null) {
            this.f84530z = this.f84504A;
        } else if (this.f84504A == null) {
            this.f84530z = str;
            this.f84504A = str;
        } else {
            this.f84504A = this.f84530z;
            this.f84530z = str;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MusicSearchStateViewModel musicSearchStateViewModel = (MusicSearchStateViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MusicSearchStateViewModel.class);
        this.f84518l = musicSearchStateViewModel;
        musicSearchStateViewModel.mo62735a().observe(this, new C35802k(this));
        this.f84518l.mo62736b().observe(this, new C35803l(this));
    }

    @AbstractC90264r(mo145423b = true)
    public void onMusicCollectEvent(C60793b bVar) {
        MusicModel a;
        MusicModel.CollectionType collectionType;
        MusicModel musicModel = bVar.f138151b;
        if (musicModel != null && !C13603b.m24435a((Collection) this.f84522p) && (a = C35937c.m73324a(this.f84522p, musicModel.getMusicId())) != null) {
            if (bVar.f138150a == 1) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            a.setCollectionType(collectionType);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60846d
    /* renamed from: a */
    public final void mo62894a(Exception exc) {
        C51423a.m95790a((Throwable) exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.AbstractC35849a.AbstractC35850a
    /* renamed from: a */
    public final void mo62893a(C35891ak akVar) {
        C35843a aVar;
        String str;
        String str2;
        if (af_() && akVar != null && this.f84518l.mo62740f() == 2) {
            if (!C13603b.m24435a((Collection) akVar.f84705a)) {
                this.f84524r = akVar.f84706b;
                C39162r.m79460a("search_sug", new C35855a().mo62963a("action_type", "show").mo62963a("sug_keyword", this.f84523q).mo62963a("search_keyword", this.f84523q).mo62963a("log_pb", C48027ac.C48028a.f111257a.mo80055a(this.f84524r)).mo62963a("search_type", "video_music").mo62963a("creation_id", C35936b.f84815d).f84633a);
                if (akVar.f84708d == null || TextUtils.isEmpty(akVar.f84708d.getInfo())) {
                    str = "{}";
                } else {
                    str = akVar.f84708d.getInfo();
                }
                if (akVar.f84707c == null || TextUtils.isEmpty(akVar.f84707c.getImprId())) {
                    str2 = "";
                } else {
                    str2 = akVar.f84707c.getImprId();
                }
                Map<String, String> map = new C35855a().mo62963a("raw_query", this.f84523q).mo62963a("info", str).mo62963a("impr_id", str2).mo62963a("search_position", "video_music").f84633a;
                for (C35894an anVar : akVar.f84705a) {
                    if (anVar != null) {
                        anVar.setExtraParam(map);
                    }
                }
                List<C35894an> list = akVar.f84705a;
                if (C35857c.f84637d == null || C35857c.f84637d.equals("")) {
                    C35857c.C35858a.m73253a(String.valueOf(System.currentTimeMillis()));
                }
                C39162r.m79460a("trending_show", new C35855a().mo62964a(map).mo62961a("words_num", list.size()).mo62963a("words_source", "sug").mo62963a("creation_id", C35936b.f84815d).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
                this.f84510G.f84639a = this.f84523q;
                this.f84510G.f84640b = akVar.f84707c;
                this.f84510G.f84641c = akVar.f84708d;
            }
            Collection<? extends C35894an> collection = akVar.f84705a;
            if (af_() && this.f84512b.getAdapter() == (aVar = this.f84517k)) {
                if (collection == null) {
                    collection = new ArrayList<>();
                }
                if (aVar.f84612a == null) {
                    aVar.f84612a = new ArrayList();
                }
                aVar.f84612a.clear();
                aVar.f84612a.addAll(collection);
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k
    /* renamed from: a */
    public final /* synthetic */ void mo62879a(C35757c cVar) {
        String name;
        C35757c cVar2 = cVar;
        String str = cVar2.f84364b;
        MusicModel musicModel = cVar2.f84363a;
        if (musicModel != null) {
            ActivityC0945e activity = getActivity();
            if (activity != null && "upload_local_music".equals(str)) {
                Intent intent = new Intent();
                if (cVar2.f84363a == null) {
                    name = "";
                } else {
                    name = cVar2.f84363a.getName();
                }
                intent.putExtra("local_music_name", name);
                activity.setResult(-1, intent);
                activity.finish();
            } else if ("follow_type".equals(str)) {
                this.f84506C.mo57616a(1, musicModel.getMusicId(), 1);
            } else if ("unfollow_type".equals(str)) {
                this.f84506C.mo57616a(1, musicModel.getMusicId(), 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62877a(MusicModel musicModel, C35754b bVar) {
        C67446h.f151111a.mo106195a();
        this.f84527u = musicModel;
        this.f84516j.mo62747a(true);
        if (this.f84509F) {
            this.f84519m.f84802a = bVar;
            this.f84519m.mo63041a(musicModel, this.f84521o, false);
            return;
        }
        this.f84519m.mo97993a(musicModel, this.f84521o, true, m73077t());
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f84512b = (RecyclerView) view.findViewById(R.id.c_4);
        this.f84513c = (TuxStatusView) view.findViewById(R.id.e7i);
        this.f84514d = view.findViewById(R.id.cdk);
        super.onViewCreated(view, bundle);
        mo62852a();
        C35851b bVar = new C35851b();
        this.f84511a = bVar;
        bVar.mo67839a_(this);
    }

    /* renamed from: a */
    public final void mo62895a(List<MusicModel> list, boolean z) {
        C35703b bVar = this.f84516j;
        if (bVar != null && !z) {
            bVar.mo62745a();
        }
        if (af_() && this.f84516j != null) {
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            if (z) {
                this.f84516j.mo62376b(arrayList);
            } else {
                this.f84516j.mo62377b_(arrayList);
            }
            RecyclerView.AbstractC1350a adapter = this.f84512b.getAdapter();
            C35703b bVar2 = this.f84516j;
            if (adapter != bVar2) {
                this.f84512b.setAdapter(bVar2);
            }
            this.f84522p = arrayList;
            this.f84521o = 2;
            if (C13617h.m24465a(arrayList)) {
                mo62899g();
            } else {
                mo62897d();
            }
            C35958ab abVar = this.f84508E;
            if (abVar != null) {
                abVar.f84881d = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.a18, viewGroup, false);
        this.f84519m = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.AbstractC35934a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j.C357981 */

            static {
                Covode.recordClassIndex(43037);
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
            /* renamed from: b */
            public final void mo62892b() {
                C73991bj.m130131b("play music error");
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
            /* renamed from: a */
            public final void mo62891a() {
                if (AbstractC35797j.this.f84527u != null) {
                    AbstractC35797j.this.f84512b.post(new RunnableC35808q(this));
                }
            }
        });
        if (getArguments() != null) {
            this.f84505B = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            this.f84505B = 0;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, MusicModel musicModel, String str2) {
        if (this.f84528v != null) {
            this.f84520n.mo62805a(this.f84505B, str, musicModel, str2);
        }
    }
}
