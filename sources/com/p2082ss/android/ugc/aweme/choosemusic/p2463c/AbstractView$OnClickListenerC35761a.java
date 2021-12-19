package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35917s;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35756b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35758d;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35986q;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60792a;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60847e;
import com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60848f;
import com.p2082ss.android.ugc.aweme.music.presenter.C60867s;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80457fu;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a */
public abstract class AbstractView$OnClickListenerC35761a extends AbstractC34586a implements View.OnClickListener, TextView.OnEditorActionListener, AbstractC0952i.AbstractC0955c, WeakHandler.IHandler, AbstractC35797j.AbstractC35800b, AbstractC60847e, AbstractC60848f, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private Music f84370A;

    /* renamed from: B */
    private String f84371B;

    /* renamed from: C */
    private String f84372C;

    /* renamed from: D */
    private boolean f84373D;

    /* renamed from: E */
    private MusicModel f84374E;

    /* renamed from: F */
    private boolean f84375F;

    /* renamed from: G */
    private LogPbBean f84376G;

    /* renamed from: H */
    private long f84377H;

    /* renamed from: I */
    private long f84378I;

    /* renamed from: J */
    private boolean f84379J;

    /* renamed from: K */
    private C35890aj f84380K;

    /* renamed from: L */
    private View f84381L;

    /* renamed from: M */
    private ViewStub f84382M;

    /* renamed from: a */
    protected C60867s f84383a;

    /* renamed from: b */
    int f84384b;

    /* renamed from: c */
    public C35780al f84385c;

    /* renamed from: d */
    public boolean f84386d;

    /* renamed from: e */
    C35986q f84387e;

    /* renamed from: j */
    public View f84388j;

    /* renamed from: k */
    TextView f84389k;

    /* renamed from: l */
    View f84390l;

    /* renamed from: m */
    boolean f84391m;

    /* renamed from: n */
    public boolean f84392n;

    /* renamed from: o */
    protected WeakHandler f84393o = new WeakHandler(this);

    /* renamed from: p */
    public String f84394p;

    /* renamed from: q */
    public String f84395q;

    /* renamed from: r */
    protected MusicSearchStateViewModel f84396r;

    /* renamed from: s */
    protected AbstractC57066a.AbstractC57067a f84397s;

    /* renamed from: t */
    protected String f84398t;

    /* renamed from: u */
    protected int f84399u = 0;

    /* renamed from: v */
    TextWatcher f84400v = new TextWatcher() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a.C357653 */

        static {
            Covode.recordClassIndex(43004);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            AbstractView$OnClickListenerC35761a.this.mo62806a(editable);
        }
    };

    /* renamed from: w */
    private AbstractC41955b f84401w;

    /* renamed from: y */
    private String f84402y;

    /* renamed from: z */
    private C60717d.EnumC60718a f84403z;

    static {
        Covode.recordClassIndex(43000);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62806a(Editable editable);

    /* renamed from: d */
    public abstract void mo62812d();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(221, new RunnableC90250g(AbstractView$OnClickListenerC35761a.class, "onSugCompletionEvent", C35758d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(222, new RunnableC90250g(AbstractView$OnClickListenerC35761a.class, "onInnerMusicSearchEvent", C35756b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: m */
    private static boolean m72948m() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo62811c() {
        this.f84396r.mo62735a().setValue(1);
    }

    /* renamed from: g */
    public final String mo62814g() {
        LogPbBean logPbBean = this.f84376G;
        if (logPbBean != null) {
            return logPbBean.getImprId();
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f84393o.removeCallbacksAndMessages(null);
    }

    /* renamed from: k */
    private C35778ak m72946k() {
        if (isAdded()) {
            return (C35778ak) getChildFragmentManager().mo3549a(R.id.adf);
        }
        return null;
    }

    /* renamed from: l */
    private static String m72947l() {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return "ad_music";
        }
        return "video_music";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().mo3559b(this);
        super.onDestroyView();
        C60867s sVar = this.f84383a;
        if (sVar != null) {
            sVar.f138324a = null;
            if (sVar.f138327d != null) {
                sVar.f138327d.mo128977a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62810b() {
        if (this.f84382M.getParent() != null) {
            View inflate = this.f84382M.inflate();
            this.f84388j = inflate.findViewById(R.id.a11);
            this.f84389k = (TextView) inflate.findViewById(R.id.agn);
            this.f84390l = inflate.findViewById(R.id.a12);
        }
    }

    /* renamed from: e */
    public final void mo62813e() {
        this.f84386d = false;
        this.f84387e.mo63114j();
        AbstractC35797j jVar = (AbstractC35797j) getChildFragmentManager().mo3549a(R.id.adf);
        if (jVar != null) {
            jVar.mo62903o();
        }
        try {
            getChildFragmentManager().mo3563d();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AbstractC81915c.m141875b(new C60792a(null));
        if (mo62815h() != null) {
            mo62815h().f84278n = false;
        }
    }

    /* renamed from: h */
    public final MusicBottomSheetBehavior mo62815h() {
        ActivityC0945e activity = getActivity();
        if (activity instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f84270b;
            if (viewPagerBottomSheetBehavior != null && (viewPagerBottomSheetBehavior instanceof MusicBottomSheetBehavior)) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior;
            }
        } else if (activity != null) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = ((ChooseMusicWithSceneViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class)).f84644c;
            if (viewPagerBottomSheetBehavior2 instanceof MusicBottomSheetBehavior) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo62816i() {
        int i;
        int i2;
        if (af_() && this.f84383a.f138326c.f138258a) {
            C35778ak k = m72946k();
            if (k != null && k.af_() && k.f84516j != null && k.f84512b.getAdapter() == k.f84516j) {
                k.f84516j.ao_();
            }
            if (!AccountService.m65215a().mo57069e().isChildrenMode()) {
                if (this.f84380K.f84702g != null) {
                    i = this.f84380K.f84702g.getFilterBy();
                } else {
                    i = 0;
                }
                if (this.f84380K.f84702g != null) {
                    i2 = this.f84380K.f84702g.getSortType();
                } else {
                    i2 = 0;
                }
                C60867s sVar = this.f84383a;
                C35890aj ajVar = this.f84380K;
                String l = m72947l();
                int i3 = this.f84399u;
                if (!sVar.f138329f && !AccountService.m65215a().mo57069e().isChildrenMode() && sVar.f138326c.f138258a) {
                    sVar.f138329f = true;
                    sVar.mo98517a().mo128983a(sVar.f138326c.mo98492a(sVar.f138328e, true, l, false, i, i2, i3, ajVar.mo62983b(), ajVar.mo62984c()), true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo62817j() {
        int i;
        int i2;
        String h = this.f84387e.mo63112h();
        KeyboardUtils.m70897c(this.f84381L);
        if (getActivity() != null && !C13627m.m24498a(h)) {
            this.f84396r.mo62735a().setValue(0);
            C35778ak k = m72946k();
            if (k != null) {
                m72946k().mo62898e();
            }
            C35836c.m73228g().mo62941b(new MusicSearchHistory(h));
            if (k != null) {
                k.mo62902n();
            }
            if (!AccountService.m65215a().mo57069e().isChildrenMode()) {
                if (this.f84380K.f84702g != null) {
                    i = this.f84380K.f84702g.getFilterBy();
                } else {
                    i = 0;
                }
                if (this.f84380K.f84702g != null) {
                    i2 = this.f84380K.f84702g.getSortType();
                } else {
                    i2 = 0;
                }
                this.f84383a.mo98518a(this.f84380K, h, m72947l(), true, i, i2, this.f84399u, this.f84380K.mo62982a());
            }
            AbstractC81915c.m141875b(new C60792a("search_result"));
            C35936b.m73323b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r6 = null;
     */
    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3582a() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a.mo3582a():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60848f
    /* renamed from: a */
    public final void mo62808a(C80457fu fuVar) {
        this.f84376G = (LogPbBean) fuVar.get(LogPbBean.class);
    }

    @AbstractC90264r
    public void onInnerMusicSearchEvent(C35756b bVar) {
        if (af_() && bVar != null) {
            m72945a(bVar.f84362a);
        }
    }

    /* renamed from: a */
    public final void mo62807a(C67437b bVar) {
        C35890aj ajVar = new C35890aj();
        ajVar.f84698c = this.f84397s.mo94218a().f129938a;
        ajVar.f84696a = "normal_search";
        ajVar.f84697b = 1;
        ajVar.f84702g = bVar;
        m72945a(ajVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1) {
            C35890aj ajVar = new C35890aj();
            ajVar.f84697b = 1;
            ajVar.f84696a = "normal_search";
            ajVar.f84698c = (String) message.obj;
            ajVar.f84699d = true;
            m72945a(ajVar);
        }
    }

    @AbstractC90264r
    public void onSugCompletionEvent(C35758d dVar) {
        C35986q qVar;
        if (af_() && dVar != null && (qVar = this.f84387e) != null) {
            qVar.mo63104a(dVar.f84367a);
            this.f84387e.mo63111g();
        }
    }

    /* renamed from: a */
    private void m72945a(C35890aj ajVar) {
        int i;
        int i2;
        if (af_() && ajVar != null && !TextUtils.isEmpty(ajVar.f84698c)) {
            this.f84397s.mo94219a(new C57071b(ajVar.f84698c, ""));
            this.f84380K = ajVar;
            if (this.f84401w.mo71121c() && this.f84380K.f84702g == null) {
                this.f84387e.mo63106b();
            }
            this.f84396r.mo62737c().setValue(ajVar);
            this.f84396r.mo62735a().setValue(0);
            C35986q qVar = this.f84387e;
            if (qVar != null) {
                qVar.mo63104a(ajVar.f84698c);
                this.f84387e.mo63113i();
            }
            C35778ak k = m72946k();
            if (!ajVar.f84699d) {
                KeyboardUtils.m70897c(this.f84381L);
                if (k != null) {
                    k.mo62898e();
                }
                C35836c.m73228g().mo62941b(new MusicSearchHistory(ajVar.f84698c));
            }
            if (k != null) {
                k.mo62902n();
            }
            ajVar.f84703h = this.f84377H;
            ajVar.f84704i = this.f84378I;
            if (!AccountService.m65215a().mo57069e().isChildrenMode()) {
                if (this.f84380K.f84702g != null) {
                    i = this.f84380K.f84702g.getFilterBy();
                } else {
                    i = 0;
                }
                if (this.f84380K.f84702g != null) {
                    i2 = this.f84380K.f84702g.getSortType();
                } else {
                    i2 = 0;
                }
                this.f84383a.mo98518a(ajVar, ajVar.f84698c, m72947l(), ajVar.f84701f, i, i2, this.f84399u, this.f84380K.mo62982a());
            }
            AbstractC81915c.m141875b(new C60792a("search_result"));
            if (this.f84401w.mo71121c()) {
                this.f84387e.mo63109e();
            }
        }
    }

    public void onClick(View view) {
        ActivityC0945e activity;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.dly) {
            if (AccountService.m65215a().mo57069e().isChildrenMode()) {
                new C79459a(getContext()).mo123050a(R.string.acx).mo123053a();
                return;
            }
            this.f84386d = true;
            this.f84387e.mo63116l();
            AbstractC0952i childFragmentManager = getChildFragmentManager();
            AbstractC35797j jVar = (AbstractC35797j) childFragmentManager.mo3549a(R.id.adf);
            if (jVar == null) {
                int i = this.f84384b;
                C60717d.EnumC60718a aVar = this.f84403z;
                jVar = new C35778ak();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
                bundle.putSerializable("music_style", aVar);
                jVar.setArguments(bundle);
                jVar.f84521o = 2;
                jVar.f84526t = new C35787b(this);
                AbstractC0976n a = childFragmentManager.mo3552a();
                a.mo3454a(R.id.adf, jVar, "search_result_list_tag");
                a.mo3457a((String) null);
                a.mo3473c();
            }
            jVar.f84528v = new C35788c(this);
            jVar.f84520n = this;
            this.f84387e.mo63111g();
            C35986q qVar = this.f84387e;
            if (qVar.f84917k != null) {
                qVar.f84917k.setVisibility(0);
                qVar.f84923q.setVisibility(8);
                qVar.f84914h.setVisibility(0);
                qVar.f84911e.setVisibility(4);
                qVar.f84913g.setVisibility(8);
                if (qVar.f84924r != null) {
                    qVar.f84924r.setVisibility(0);
                }
                if (qVar.f84925s != null) {
                    qVar.f84925s.setVisibility(8);
                }
                qVar.mo63110f();
            }
            this.f84385c.mo62920e();
            this.f84385c.mo62921g();
            C35936b.m73323b();
        } else if (view.getId() == R.id.f34) {
            C35890aj ajVar = new C35890aj();
            ajVar.f84698c = this.f84397s.mo94218a().f129938a;
            ajVar.f84696a = "normal_search";
            ajVar.f84697b = 1;
            m72945a(ajVar);
            C35778ak k = m72946k();
            if (k != null) {
                k.mo62909q();
            }
        } else if (view.getId() == R.id.f35 || view.getId() == R.id.dr_) {
            mo62813e();
        } else if (view.getId() != R.id.dm0 && view.getId() == R.id.pi && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f84384b = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.f84399u = getArguments().getInt("sound_page_scene", 0);
            this.f84402y = getArguments().getString("challenge");
            this.f84394p = getArguments().getString("creation_id");
            this.f84395q = getArguments().getString("shoot_way");
            this.f84403z = (C60717d.EnumC60718a) getArguments().getSerializable("music_style");
            this.f84370A = (Music) getArguments().getSerializable("sticker_music");
            this.f84371B = getArguments().getString("first_sticker_music_ids", null);
            this.f84373D = getArguments().getBoolean("is_busi_sticker", false);
            this.f84372C = getArguments().getString("first_sticker_id", null);
            this.f84374E = (MusicModel) getArguments().getSerializable("music_model");
            this.f84391m = getArguments().getBoolean("music_allow_clear", false);
            this.f84392n = getArguments().getBoolean("music_is_photomv", false);
            this.f84375F = getArguments().getBoolean("extra_beat_music_sticker", false);
            this.f84379J = getArguments().getBoolean("hide_cancel_music_ui", false);
            this.f84377H = getArguments().getLong("max_video_duration", 0);
            this.f84378I = getArguments().getLong("shoot_video_length", 0);
        }
        this.f84396r = (MusicSearchStateViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MusicSearchStateViewModel.class);
        this.f84401w = SearchServiceImpl.m119336t().mo106217f();
        this.f84397s = new SearchKeywordPresenter(getActivity());
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f84383a = new C60867s(this);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo3549a(R.id.adg);
        if (a != null) {
            this.f84385c = (C35780al) a;
        } else {
            int i = this.f84384b;
            String str = this.f84402y;
            Music music = this.f84370A;
            String str2 = this.f84371B;
            String str3 = this.f84372C;
            boolean z = this.f84373D;
            String str4 = this.f84395q;
            int i2 = this.f84399u;
            boolean z2 = this.f84379J;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                bundle2.putString("first_sticker_music_ids", str2);
            }
            if (str3 != null) {
                bundle2.putString("first_sticker_id", str3);
            }
            bundle2.putBoolean("is_busi_sticker", z);
            C35780al alVar = new C35780al();
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("shoot_way", str4);
            }
            bundle2.putInt("sound_page_scene", i2);
            bundle2.putBoolean("hide_cancel_music_ui", z2);
            alVar.setArguments(bundle2);
            this.f84385c = alVar;
            alVar.f84556m = 0;
            MusicModel musicModel = this.f84374E;
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                this.f84385c.f84562s = true;
            }
            this.f84385c.f84563t = this.f84392n;
            AbstractC0976n a2 = childFragmentManager.mo3552a();
            a2.mo3453a(R.id.adg, this.f84385c);
            a2.mo3473c();
        }
        if (this.f84391m && !C68027bm.m120329a()) {
            mo62810b();
        }
        getChildFragmentManager().mo3556a((AbstractC0952i.AbstractC0955c) this);
        this.f84387e.mo63103a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f84381L = C1764a.m5927a(layoutInflater, R.layout.a1b, viewGroup, false);
        C35936b.f84816e = this.f84395q;
        C35936b.f84815d = this.f84394p;
        this.f84387e = new C35986q(this.f84381L, this, this.f84384b, this.f84400v);
        this.f84382M = (ViewStub) this.f84381L.findViewById(R.id.fg3);
        return this.f84381L;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        C35890aj ajVar = new C35890aj();
        ajVar.f84697b = 1;
        ajVar.f84696a = "normal_search";
        ajVar.f84698c = this.f84397s.mo94218a().f129938a;
        m72945a(ajVar);
        C35778ak k = m72946k();
        if (k != null) {
            k.mo62909q();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.presenter.AbstractC60848f
    /* renamed from: a */
    public final void mo62809a(List<MusicModel> list, boolean z, boolean z2) {
        C35890aj ajVar;
        String str;
        String str2;
        if (af_()) {
            C35778ak k = m72946k();
            if (!TextUtils.isEmpty(this.f84387e.mo63112h()) && this.f84396r.mo62740f() == 0) {
                if (list != null) {
                    if (!z) {
                        C33744d dVar = new C33744d();
                        C33744d a = dVar.mo59983a("search_type", "music");
                        C35890aj ajVar2 = this.f84380K;
                        if (ajVar2 != null) {
                            str = ajVar2.f84696a;
                        } else {
                            str = "normal_search";
                        }
                        C33744d a2 = a.mo59983a("enter_method", str).mo59983a("search_keyword", this.f84387e.mo63115k()).mo59983a("creation_id", this.f84394p);
                        if (this.f84384b == 0) {
                            str2 = "video_edit_page";
                        } else {
                            str2 = "video_shoot_page";
                        }
                        a2.mo59983a("enter_from", str2).mo59983a("trigger_reason", "cold_launch").mo59982a("log_pb", this.f84376G).mo59983a("new_sug_session_id", C35857c.f84637d).mo59983a("search_id", mo62814g());
                        C35857c.C35858a.m73253a("");
                        if (!(this.f84380K.f84702g == null || this.f84380K.f84702g.getFilterByStruct() == null || this.f84380K.f84702g.getFilterByStruct().getLogInfo() == null || this.f84380K.f84702g.getSortTypeStruct() == null || this.f84380K.f84702g.getSortTypeStruct().getLogInfo() == null)) {
                            dVar.mo59983a("enter_method", "tab_search");
                            dVar.mo59986a(this.f84380K.f84702g.getFilterByStruct().getLogInfo());
                            dVar.mo59986a(this.f84380K.f84702g.getSortTypeStruct().getLogInfo());
                        }
                        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
                            dVar.mo59983a("is_commercial", "1");
                        }
                        C39162r.m79460a("search_music", dVar.f79943a);
                    }
                    if (list.size() > 0) {
                        for (MusicModel musicModel : list) {
                            musicModel.setDataType(1);
                            if (musicModel.getMusic() == null) {
                                musicModel.setMusic(musicModel.convertToMusic());
                            }
                        }
                        if (!(k == null || k.f84516j == null)) {
                            k.f84516j.f84227j = this.f84380K;
                            k.f84516j.f84221d = this.f84387e.mo63112h();
                            k.mo62895a(list, z);
                            C35936b.f84813b = this.f84387e.mo63112h();
                            if (this.f84383a.f138326c.f138258a) {
                                k.f84516j.aq_();
                            } else {
                                k.f84516j.ap_();
                            }
                        }
                    } else if (getActivity() != null) {
                        C35986q qVar = this.f84387e;
                        C39115e.m79412a(qVar.f84907a.getActivity(), qVar.f84916j);
                        if (k != null) {
                            getContext();
                            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                                C58029j.f132253e = m72948m();
                            }
                            if (C58029j.f132253e) {
                                k.mo62899g();
                            } else {
                                k.mo62900k();
                            }
                        }
                    }
                } else if (k != null) {
                    k.mo62900k();
                }
                if (this.f84401w.mo71121c() && this.f84387e != null && (ajVar = this.f84380K) != null && ajVar.f84702g == null) {
                    this.f84387e.mo63105a(z2, true);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35797j.AbstractC35800b
    /* renamed from: a */
    public final void mo62805a(int i, String str, final MusicModel musicModel, String str2) {
        final ActivityC0945e activity = getActivity();
        if (activity != null) {
            if (i == 0 || i == 2) {
                Intent intent = new Intent();
                intent.putExtra("path", str);
                intent.putExtra("music_model", musicModel);
                intent.putExtra("music_origin", str2);
                activity.setResult(-1, intent);
                ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
                if (chooseMusicWithSceneViewModel.f84642a) {
                    chooseMusicWithSceneViewModel.mo62969a(new C35917s(-1, intent));
                } else {
                    activity.finish();
                }
            } else {
                C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "search_result").f79943a);
                final RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.shootWay("search_result").musicPath(str).musicModel(musicModel).musicOrigin(str2);
                AVExternalServiceImpl.m113114a().asyncService("ChooseMusic", new SimpleServiceLoadCallback() {
                    /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a.C357642 */

                    static {
                        Covode.recordClassIndex(43003);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, true);
                    }
                });
            }
        }
    }
}
