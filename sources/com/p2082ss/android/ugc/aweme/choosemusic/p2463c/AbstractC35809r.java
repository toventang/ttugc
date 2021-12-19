package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35917s;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35701a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35830e;
import com.p2082ss.android.ugc.aweme.choosemusic.p2466f.C35837a;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.r */
public abstract class AbstractC35809r extends AbstractC34586a implements AbstractC1214u<C33942b>, AbstractC35827b, AbstractC35830e, ScrollableLayout.AbstractC39210b, C39211a.AbstractC39212a, AbstractC60731k<C35757c>, AbstractC61180m, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final String f84539b = new StringBuilder("android:switcher:2131364317:").toString();

    /* renamed from: A */
    private String f84540A;

    /* renamed from: B */
    private boolean f84541B;

    /* renamed from: C */
    private String f84542C;

    /* renamed from: D */
    private int f84543D;

    /* renamed from: E */
    private boolean f84544E = true;

    /* renamed from: F */
    private String f84545F = "popular_song";

    /* renamed from: G */
    private Music f84546G;

    /* renamed from: H */
    private boolean f84547H;

    /* renamed from: I */
    private int f84548I;

    /* renamed from: a */
    protected C35837a f84549a;

    /* renamed from: c */
    TuxStatusView f84550c;

    /* renamed from: d */
    DmtTabLayout f84551d;

    /* renamed from: e */
    ViewPager f84552e;

    /* renamed from: j */
    ScrollableLayout f84553j;

    /* renamed from: k */
    View f84554k;

    /* renamed from: l */
    protected DataCenter f84555l;

    /* renamed from: m */
    public int f84556m;

    /* renamed from: n */
    public MusicModel f84557n;

    /* renamed from: o */
    public C35823y f84558o;

    /* renamed from: p */
    public C35820w f84559p;

    /* renamed from: q */
    public ChooseMusicDownloadPlayHelper f84560q;

    /* renamed from: r */
    protected C35899b f84561r;

    /* renamed from: s */
    public boolean f84562s;

    /* renamed from: t */
    public boolean f84563t;

    /* renamed from: u */
    private C33947e f84564u;

    /* renamed from: v */
    private int f84565v;

    /* renamed from: w */
    private MusicBannerWidget f84566w;

    /* renamed from: y */
    private String f84567y;

    /* renamed from: z */
    private String f84568z;

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62854a(LinearLayout linearLayout);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62855a(C33942b bVar);

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    public final boolean av_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62856b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62857c();

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo62858d();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(49, new RunnableC90250g(AbstractC35809r.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f84557n;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k
    /* renamed from: a */
    public final /* synthetic */ void mo62879a(C35757c cVar) {
        C35757c cVar2 = cVar;
        String str = cVar2.f84364b;
        MusicModel musicModel = cVar2.f84363a;
        if ("follow_type".equals(str)) {
            this.f84561r.mo63022a(musicModel, musicModel.getMusicId(), 1, cVar2.f84365c, cVar2.f84366d);
        } else if ("unfollow_type".equals(str)) {
            this.f84561r.mo63022a(musicModel, musicModel.getMusicId(), 0, cVar2.f84365c, cVar2.f84366d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, final MusicModel musicModel, String str2) {
        final ActivityC0945e activity = getActivity();
        int i = this.f84543D;
        if (i == 0 || i == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            if (getActivity() != null) {
                ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
                if (chooseMusicWithSceneViewModel.f84642a) {
                    chooseMusicWithSceneViewModel.mo62969a(new C35917s(-1, intent));
                    return;
                }
            }
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicOrigin(str2).musicPath(str).musicModel(musicModel);
        AVExternalServiceImpl.m113114a().asyncService("NewMusicTab", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r.C358145 */

            static {
                Covode.recordClassIndex(43053);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, false);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        return af_();
    }

    /* renamed from: e */
    public final void mo62920e() {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84560q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        return getActivity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ C89391z mo62923n() {
        m73116o();
        return null;
    }

    /* renamed from: p */
    private void m73117p() {
        TuxStatusView tuxStatusView = this.f84550c;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
            this.f84550c.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84560q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.f138618n = false;
        }
    }

    static {
        Covode.recordClassIndex(43048);
    }

    /* renamed from: q */
    private RecyclerView.AbstractC1350a m73118q() {
        int i = this.f84565v;
        if (i == 0) {
            return this.f84558o.f84477e;
        }
        if (i == 1) {
            return this.f84559p.mo62887k();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    /* renamed from: s */
    private boolean m73119s() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    /* renamed from: a */
    public final C35837a mo62913a() {
        if (this.f84549a == null) {
            this.f84549a = new C35837a(getContext());
        }
        return this.f84549a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo62921g() {
        RecyclerView.AbstractC1350a q = m73118q();
        if (q != null) {
            if (q instanceof C35703b) {
                ((C35703b) q).mo62745a();
            } else if (q instanceof C35701a) {
                ((C35701a) q).mo62741a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        int i = this.f84565v;
        if (i == 0) {
            return this.f84558o.mo62680m();
        }
        if (i == 1) {
            return this.f84559p.mo62680m();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84560q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
            this.f84560q.mo63045d();
        }
        if (mo62913a() != null) {
            mo62913a().dismiss();
        }
    }

    /* renamed from: o */
    private void m73116o() {
        m73117p();
        AVExternalServiceImpl.m113114a().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.f142464a, "fetch_music_data");
        String str = this.f84567y;
        if (str != null) {
            this.f84561r.mo63024a(str, this.f84568z, this.f84546G, this.f84548I);
        } else {
            this.f84561r.mo63025a(false, this.f84568z, this.f84546G, false, this.f84548I);
        }
    }

    /* renamed from: k */
    public final void mo62922k() {
        ScrollableLayout scrollableLayout = this.f84553j;
        if (scrollableLayout != null && scrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.f84553j.getParent()).getMeasuredHeight();
            int measuredHeight2 = this.f84553j.getChildAt(0).getMeasuredHeight();
            this.f84558o.mo62865a((measuredHeight + this.f84553j.getCurScrollY()) - measuredHeight2);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84560q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
            this.f84560q.f138618n = true;
        }
        this.f84555l.mo60191a("music_position", (Object) -1);
        this.f84555l.mo60191a("music_index", (Object) -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35830e
    /* renamed from: b */
    public final void mo62918b(int i) {
        this.f84556m = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62874a(MusicDownloadPlayHelper.AbstractC61086a aVar) {
        this.f84560q.f138612h = aVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f84565v);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: b */
    public final void mo62881b(MusicModel musicModel) {
        this.f84560q.f138615k = this.f84545F;
        this.f84560q.mo97993a(musicModel, this.f84556m, true, m73119s());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62919d(MusicModel musicModel) {
        DmtTabLayout.C17294f b = this.f84551d.mo27529b(1);
        if (b != null && b.f41528i != null) {
            b.f41528i.post(new RunnableC35817u(this, b, musicModel));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62914a(int i) {
        if (i == 1) {
            this.f84561r.mo63026b(this.f84548I);
            this.f84552e.setCurrentItem(1, false);
            this.f84553j.getHelper().f92631b = this.f84559p;
        } else if (i == 0) {
            this.f84552e.setCurrentItem(0, false);
            this.f84553j.getHelper().f92631b = this.f84558o;
        }
        this.f84565v = i;
        if (i == 0) {
            this.f84556m = 0;
        } else if (i == 1) {
            this.f84556m = 1;
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void onMusicCollectEvent(C60793b bVar) {
        if (this.f84555l != null && bVar != null && "music_detail".equals(bVar.f138152c)) {
            this.f84555l.mo60191a("music_collect_status", new C35755a(0, bVar.f138150a, -1, -1, bVar.f138151b));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.f84567y = arguments.getString("challenge");
        }
        this.f84568z = arguments.getString("first_sticker_music_ids", null);
        this.f84541B = arguments.getBoolean("is_busi_sticker", false);
        this.f84540A = arguments.getString("first_sticker_id", null);
        this.f84543D = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.f84546G = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.f84542C = arguments.getString("shoot_way");
        }
        if (getArguments() != null && arguments.containsKey("sound_page_scene")) {
            this.f84548I = arguments.getInt("sound_page_scene");
        }
        this.f84547H = arguments.getBoolean("hide_cancel_music_ui");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo62915a(DmtTabLayout.C17294f fVar) {
        if (fVar.f41524e == 1) {
            getString(R.string.bs5);
            if (!AccountService.m65215a().mo57069e().isLogin()) {
                mo62858d();
                return;
            }
        }
        fVar.mo27592a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        boolean z;
        C69905c curMusic;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        switch (str.hashCode()) {
            case -2080369200:
                if (str.equals("pick_status")) {
                    if (((Integer) bVar2.mo60212a()).intValue() != 1) {
                        TuxStatusView tuxStatusView = this.f84550c;
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        if (getArguments() == null || getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1) != 2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!this.f84547H || !z) {
                            Fragment parentFragment = getParentFragment();
                            if (parentFragment instanceof C35818v) {
                                AbstractView$OnClickListenerC35761a aVar = (AbstractView$OnClickListenerC35761a) parentFragment;
                                if (aVar.af_() && aVar.getActivity() != null && aVar.f84391m && (curMusic = AVExternalServiceImpl.m113114a().publishService().getCurMusic()) != null && (!AVExternalServiceImpl.m113114a().publishService().isPhotoMvModeMusic() || aVar.f84384b != 2)) {
                                    aVar.mo62810b();
                                    aVar.f84388j.setVisibility(0);
                                    aVar.f84389k.setText(aVar.getActivity().getString(R.string.ad9, new Object[]{curMusic.getMusicName()}));
                                    boolean enableNewMusicMarquee = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee();
                                    if (!enableNewMusicMarquee && aVar.f84392n) {
                                        aVar.f84390l.setAlpha(0.5f);
                                    }
                                    aVar.f84390l.setOnClickListener(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0156: INVOKE  
                                          (wrap: android.view.View : 0x014f: IGET  (r1v2 android.view.View) = (r5v2 'aVar' com.ss.android.ugc.aweme.choosemusic.c.a) com.ss.android.ugc.aweme.choosemusic.c.a.l android.view.View)
                                          (wrap: com.ss.android.ugc.aweme.choosemusic.c.a$1 : 0x0153: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.choosemusic.c.a$1) = 
                                          (r5v2 'aVar' com.ss.android.ugc.aweme.choosemusic.c.a)
                                          (r2v2 'enableNewMusicMarquee' boolean)
                                          (r3v4 'curMusic' com.ss.android.ugc.aweme.shortvideo.c)
                                         call: com.ss.android.ugc.aweme.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.choosemusic.c.a, boolean, com.ss.android.ugc.aweme.shortvideo.c):void type: CONSTRUCTOR)
                                         type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.choosemusic.c.r.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes7.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:274)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0153: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.choosemusic.c.a$1) = 
                                          (r5v2 'aVar' com.ss.android.ugc.aweme.choosemusic.c.a)
                                          (r2v2 'enableNewMusicMarquee' boolean)
                                          (r3v4 'curMusic' com.ss.android.ugc.aweme.shortvideo.c)
                                         call: com.ss.android.ugc.aweme.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.choosemusic.c.a, boolean, com.ss.android.ugc.aweme.shortvideo.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.choosemusic.c.r.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes7.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 44 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.choosemusic.c.a, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 50 more
                                        */
                                    /*
                                    // Method dump skipped, instructions count: 372
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r.onChanged(java.lang.Object):void");
                                }

                                @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
                                /* renamed from: a */
                                public final void mo62875a(MusicModel musicModel) {
                                    mo62920e();
                                }

                                @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
                                /* renamed from: b */
                                public final void mo62635b(int i, int i2) {
                                    mo62922k();
                                }

                                @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
                                /* renamed from: a */
                                public final void mo62628a(float f, float f2) {
                                    RecyclerView recyclerView;
                                    if (af_()) {
                                        int i = this.f84565v;
                                        if (i == 0) {
                                            recyclerView = (RecyclerView) this.f84558o.mo62680m();
                                        } else if (i == 1) {
                                            recyclerView = (RecyclerView) this.f84559p.mo62680m();
                                        } else {
                                            return;
                                        }
                                        if (recyclerView != null) {
                                            int childCount = recyclerView.getChildCount();
                                            if (childCount == 0) {
                                                this.f84553j.mo68079a();
                                                this.f84553j.setMaxScrollHeight(0);
                                                return;
                                            }
                                            View g = recyclerView.getLayoutManager().mo4717g(childCount - 1);
                                            int childCount2 = this.f84553j.getChildCount();
                                            if (childCount2 >= 2 && g != null) {
                                                int measuredHeight = ((View) this.f84553j.getParent()).getMeasuredHeight();
                                                this.f84553j.setMaxScrollHeight(((recyclerView.getTop() + g.getBottom()) + this.f84553j.getChildAt(childCount2 - 1).getTop()) - measuredHeight);
                                            }
                                        }
                                    }
                                }

                                /* access modifiers changed from: package-private */
                                /* renamed from: a */
                                public final /* synthetic */ void mo62916a(DmtTabLayout.C17294f fVar, MusicModel musicModel) {
                                    if (getActivity() != null && !getActivity().isFinishing() && mo62913a() != null) {
                                        C35837a a = mo62913a();
                                        DmtTabLayout.C17296h hVar = fVar.f41528i;
                                        C89219l.m154721d(hVar, "");
                                        C89219l.m154721d(musicModel, "");
                                        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                                            C34577e.m70608b(a.f84603b, musicModel.getPicPremium(), -1, -1);
                                        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                                            C34577e.m70608b(a.f84603b, musicModel.getPicBig(), -1, -1);
                                        }
                                        a.setWidth(hVar.getWidth() + C34728n.m70946a(24.0d));
                                        if (!a.isShowing()) {
                                            a.showAsDropDown(hVar, (hVar.getWidth() - a.getWidth()) / 2, -((hVar.getHeight() + a.f84604c.getMeasuredHeight()) - C34728n.m70946a(16.0d)));
                                        }
                                        a.f84604c.removeCallbacks(a.f84602a);
                                        a.f84604c.postDelayed(a.f84602a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                    }
                                }

                                @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
                                /* renamed from: a */
                                public final void mo62877a(MusicModel musicModel, C35754b bVar) {
                                    this.f84557n = musicModel;
                                    this.f84555l.mo60191a("music_loading", (Object) true);
                                    if (this.f84544E) {
                                        this.f84560q.f84802a = bVar;
                                        if (bVar != null && bVar.f84354h) {
                                            this.f84555l.mo60191a("last_play_music_id", musicModel.getMusicId());
                                        }
                                        this.f84560q.mo63041a(musicModel, this.f84556m, false);
                                        return;
                                    }
                                    this.f84560q.mo97993a(musicModel, this.f84556m, true, m73119s());
                                }

                                @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
                                public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                    int i;
                                    View a = C1764a.m5927a(layoutInflater, R.layout.a1a, viewGroup, false);
                                    this.f84550c = (TuxStatusView) a.findViewById(R.id.e7i);
                                    this.f84551d = (DmtTabLayout) a.findViewById(R.id.ee7);
                                    this.f84552e = (ViewPager) a.findViewById(R.id.b4i);
                                    this.f84553j = (ScrollableLayout) a.findViewById(R.id.dq9);
                                    this.f84554k = a.findViewById(R.id.amb);
                                    this.f84553j.setVisibility(4);
                                    this.f84553j.setOnScrollListener(this);
                                    if (bundle == null) {
                                        i = 0;
                                    } else {
                                        i = bundle.getInt("KEY_CURRENT_TAB", 0);
                                    }
                                    this.f84565v = i;
                                    DataCenter a2 = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
                                    this.f84555l = a2;
                                    a2.mo60189a("pick_status", (AbstractC1214u<C33942b>) this).mo60189a("data_banner", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this);
                                    this.f84555l.mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
                                    this.f84555l.mo60191a("key_choose_music_type", Integer.valueOf(this.f84543D));
                                    this.f84555l.mo60191a("sticker_id", this.f84540A);
                                    this.f84555l.mo60191a("challenge_id", this.f84567y);
                                    this.f84555l.mo60191a("mvtheme_music_type", Boolean.valueOf(this.f84562s));
                                    this.f84555l.mo60191a("is_photo_mv_type", Boolean.valueOf(this.f84563t));
                                    this.f84555l.mo60191a("is_busi_sticker", Boolean.valueOf(this.f84541B));
                                    this.f84555l.mo60191a("shoot_way", this.f84542C);
                                    C33947e a3 = C33947e.m69516a(this, a);
                                    this.f84564u = a3;
                                    a3.mo60218a(this.f84555l);
                                    this.f84566w = new MusicBannerWidget(this.f84548I);
                                    this.f84561r = new C35899b(getContext(), this.f84555l);
                                    this.f84564u.mo60221b(R.id.ql, this.f84566w);
                                    AbstractC0952i childFragmentManager = getChildFragmentManager();
                                    StringBuilder sb = new StringBuilder();
                                    String str = f84539b;
                                    C35823y yVar = (C35823y) childFragmentManager.mo3551a(sb.append(str).append(0).toString());
                                    this.f84558o = yVar;
                                    if (yVar == null) {
                                        int i2 = this.f84543D;
                                        String str2 = this.f84567y;
                                        int i3 = this.f84548I;
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                                        if (!TextUtils.isEmpty(str2)) {
                                            bundle2.putString("challenge", str2);
                                        }
                                        bundle2.putInt("sound_page_scene", i3);
                                        C35823y yVar2 = new C35823y();
                                        yVar2.setArguments(bundle2);
                                        this.f84558o = yVar2;
                                    }
                                    this.f84558o.f84475c = this.f84555l;
                                    this.f84558o.f84476d = this.f84564u;
                                    this.f84558o.f84481m = this.f84561r;
                                    C35823y yVar3 = this.f84558o;
                                    yVar3.f84478j = this;
                                    if (yVar3.f84477e != null) {
                                        yVar3.f84477e.f84202d = yVar3.f84478j;
                                    }
                                    C35823y yVar4 = this.f84558o;
                                    yVar4.f84479k = this;
                                    if (yVar4.f84477e != null) {
                                        yVar4.f84477e.f84203e = yVar4.f84479k;
                                    }
                                    C35823y yVar5 = this.f84558o;
                                    yVar5.f84480l = this;
                                    if (yVar5.f84477e != null) {
                                        yVar5.f84477e.f84206h = yVar5.f84480l;
                                    }
                                    C35820w wVar = (C35820w) getChildFragmentManager().mo3551a(str + 1);
                                    this.f84559p = wVar;
                                    if (wVar == null) {
                                        int i4 = this.f84543D;
                                        String str3 = this.f84567y;
                                        int i5 = this.f84548I;
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i4);
                                        if (!TextUtils.isEmpty(str3)) {
                                            bundle3.putString("challenge", str3);
                                        }
                                        bundle3.putInt("sound_page_scene", i5);
                                        C35820w wVar2 = new C35820w();
                                        wVar2.setArguments(bundle3);
                                        this.f84559p = wVar2;
                                    }
                                    this.f84559p.f84493e = this.f84555l;
                                    this.f84559p.f84585m = this;
                                    ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.AbstractC35934a() {
                                        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r.C358101 */

                                        static {
                                            Covode.recordClassIndex(43049);
                                        }

                                        @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
                                        /* renamed from: a */
                                        public final void mo62891a() {
                                            if (AbstractC35809r.this.f84557n != null) {
                                                AbstractC35809r.this.f84555l.mo60191a("play_compeleted", AbstractC35809r.this.f84557n.getMusicId());
                                            }
                                        }

                                        @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
                                        /* renamed from: b */
                                        public final void mo62892b() {
                                            if (AbstractC35809r.this.f84557n != null) {
                                                AbstractC35809r.this.f84555l.mo60191a("play_error", AbstractC35809r.this.f84557n.getMusicId());
                                            }
                                        }
                                    });
                                    this.f84560q = chooseMusicDownloadPlayHelper;
                                    chooseMusicDownloadPlayHelper.mo63043b();
                                    this.f84560q.mo98622b(this.f84543D);
                                    if (!C68027bm.m120329a()) {
                                        mo62913a();
                                    }
                                    this.f84552e.setOffscreenPageLimit(2);
                                    this.f84552e.setAdapter(new AbstractC0974l(getChildFragmentManager()) {
                                        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r.C358112 */

                                        /* renamed from: b */
                                        private final int[] f84571b = {R.string.b7x, R.string.dbd};

                                        static {
                                            Covode.recordClassIndex(43050);
                                        }

                                        @Override // androidx.viewpager.widget.PagerAdapter
                                        public final int getCount() {
                                            return 2;
                                        }

                                        @Override // androidx.fragment.app.AbstractC0974l
                                        /* renamed from: a */
                                        public final Fragment mo3639a(int i) {
                                            if (i == 0) {
                                                return AbstractC35809r.this.f84558o;
                                            }
                                            return AbstractC35809r.this.f84559p;
                                        }

                                        @Override // androidx.viewpager.widget.PagerAdapter
                                        public final CharSequence getPageTitle(int i) {
                                            return AbstractC35809r.this.getResources().getString(this.f84571b[i]);
                                        }
                                    });
                                    this.f84551d.setCustomTabViewResId(R.layout.a_v);
                                    this.f84551d.setTabMode(0);
                                    this.f84551d.setAutoFillWhenScrollable(true);
                                    this.f84551d.setupWithViewPager(this.f84552e);
                                    mo62854a((LinearLayout) this.f84551d.getChildAt(0));
                                    this.f84551d.setOnTabClickListener(new C35815s(this));
                                    mo62857c();
                                    this.f84551d.mo27521a(new DmtTabLayout.AbstractC17289c() {
                                        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35809r.C358123 */

                                        static {
                                            Covode.recordClassIndex(43051);
                                        }

                                        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
                                        /* renamed from: b */
                                        public final void mo27575b(DmtTabLayout.C17294f fVar) {
                                        }

                                        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
                                        /* renamed from: a */
                                        public final void mo27574a(DmtTabLayout.C17294f fVar) {
                                            int i = fVar.f41524e;
                                            if (i == 1 && AbstractC35809r.this.mo62913a() != null) {
                                                AbstractC35809r.this.mo62913a().dismiss();
                                            }
                                            C35936b.m73310a(i);
                                            AbstractC35809r.this.mo62921g();
                                            AbstractC35809r.this.mo62914a(i);
                                        }
                                    });
                                    this.f84551d.mo27529b(this.f84565v).mo27592a();
                                    mo62856b();
                                    mo62914a(this.f84565v);
                                    m73116o();
                                    ActivityC0945e activity = getActivity();
                                    if (activity instanceof ChooseMusicActivity) {
                                        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f84270b;
                                        if (viewPagerBottomSheetBehavior != null) {
                                            viewPagerBottomSheetBehavior.mo61089a(this.f84552e);
                                        }
                                    } else if (activity instanceof ActivityC0945e) {
                                        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
                                        if (chooseMusicWithSceneViewModel.f84644c != null) {
                                            chooseMusicWithSceneViewModel.f84644c.mo61089a(this.f84552e);
                                        }
                                    }
                                    return a;
                                }
                            }
