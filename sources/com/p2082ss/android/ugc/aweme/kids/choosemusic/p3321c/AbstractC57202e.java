package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

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
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57172a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3324f.C57259a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBannerWidget;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3306d.C57106a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.C57136d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
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

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.e */
public abstract class AbstractC57202e extends AbstractC34586a implements AbstractC1214u<C33942b>, ScrollableLayout.AbstractC39210b, C39211a.AbstractC39212a, AbstractC57080c<C57192b>, AbstractC57135c, AbstractC57234b, AbstractC57237e, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final String f130286c = new StringBuilder("android:switcher:2131364317:").toString();

    /* renamed from: A */
    private String f130287A;

    /* renamed from: B */
    private String f130288B;

    /* renamed from: C */
    private boolean f130289C;

    /* renamed from: D */
    private String f130290D;

    /* renamed from: E */
    private int f130291E;

    /* renamed from: F */
    private boolean f130292F = true;

    /* renamed from: G */
    private String f130293G = "popular_song";

    /* renamed from: H */
    private Music f130294H;

    /* renamed from: a */
    public AbstractC57220o f130295a;

    /* renamed from: b */
    protected C57259a f130296b;

    /* renamed from: d */
    TuxStatusView f130297d;

    /* renamed from: e */
    DmtTabLayout f130298e;

    /* renamed from: j */
    ViewPager f130299j;

    /* renamed from: k */
    ScrollableLayout f130300k;

    /* renamed from: l */
    View f130301l;

    /* renamed from: m */
    protected DataCenter f130302m;

    /* renamed from: n */
    public int f130303n;

    /* renamed from: o */
    public MusicModel f130304o;

    /* renamed from: p */
    public C57216l f130305p;

    /* renamed from: q */
    public C57213j f130306q;

    /* renamed from: r */
    public C57261a f130307r;

    /* renamed from: s */
    protected C57238a f130308s;

    /* renamed from: t */
    public boolean f130309t;

    /* renamed from: u */
    public boolean f130310u;

    /* renamed from: v */
    private C33947e f130311v;

    /* renamed from: w */
    private int f130312w;

    /* renamed from: y */
    private MusicBannerWidget f130313y;

    /* renamed from: z */
    private String f130314z;

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94427a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94429a(LinearLayout linearLayout);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94431a(C33942b bVar);

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    public final boolean av_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo94432b();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(278, new RunnableC90250g(AbstractC57202e.class, "onMusicCollectEvent", C57106a.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: h */
    public final MusicModel mo94283h() {
        return this.f130304o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C89391z mo94437e() {
        m103681g();
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: i */
    public final Activity mo94284i() {
        return getActivity();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
    /* renamed from: j */
    public final boolean mo94285j() {
        return af_();
    }

    /* renamed from: g */
    private void m103681g() {
        m103682k();
        this.f130308s.mo94458a(false, this.f130287A, this.f130294H);
    }

    /* renamed from: k */
    private void m103682k() {
        TuxStatusView tuxStatusView = this.f130297d;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
            this.f130297d.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C57261a aVar = this.f130307r;
        if (aVar != null) {
            aVar.f130080k = false;
        }
    }

    static {
        Covode.recordClassIndex(67107);
    }

    /* renamed from: n */
    private boolean m103683n() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    /* renamed from: c */
    public final RecyclerView.AbstractC1350a mo94434c() {
        int i = this.f130312w;
        if (i == 0) {
            return this.f130305p.f130266e;
        }
        if (i == 1) {
            return this.f130306q.mo94421k();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        int i = this.f130312w;
        if (i == 0) {
            return this.f130305p.mo62680m();
        }
        if (i == 1) {
            return this.f130306q.mo94442m();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C57261a aVar = this.f130307r;
        if (aVar != null) {
            aVar.mo94287a();
            this.f130307r.mo94297d();
        }
        C57259a aVar2 = this.f130296b;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo94436d() {
        ScrollableLayout scrollableLayout = this.f130300k;
        if (scrollableLayout != null && scrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.f130300k.getParent()).getMeasuredHeight();
            int measuredHeight2 = this.f130300k.getChildAt(0).getMeasuredHeight();
            this.f130305p.mo94409a((measuredHeight + this.f130300k.getCurScrollY()) - measuredHeight2);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C57261a aVar = this.f130307r;
        if (aVar != null) {
            aVar.mo94287a();
            this.f130307r.f130080k = true;
        }
        this.f130302m.mo60191a("music_position", (Object) -1);
        this.f130302m.mo60191a("music_index", (Object) -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e
    /* renamed from: b */
    public final void mo94433b(int i) {
        this.f130303n = i;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f130312w);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: a */
    public final void mo94415a(C57136d.AbstractC57141a aVar) {
        this.f130307r.f130077h = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
    /* renamed from: b */
    public final void mo94419b(MusicModel musicModel) {
        this.f130307r.f130078i = this.f130293G;
        this.f130307r.mo94296c(musicModel, this.f130303n, m103683n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo94428a(int i) {
        if (i == 1) {
            this.f130308s.mo94459b();
            this.f130299j.setCurrentItem(1);
            this.f130300k.getHelper().f92631b = this.f130306q;
        } else if (i == 0) {
            this.f130299j.setCurrentItem(0);
            this.f130300k.getHelper().f92631b = this.f130305p;
        }
        this.f130312w = i;
        if (i == 0) {
            this.f130303n = 0;
        } else if (i == 1) {
            this.f130303n = 1;
        } else if (i == 2) {
            this.f130303n = 6;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo94435c(MusicModel musicModel) {
        DmtTabLayout.C17294f b = this.f130298e.mo27529b(1);
        if (b != null && b.f41528i != null) {
            b.f41528i.post(new RunnableC57210h(this, b, musicModel));
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void onMusicCollectEvent(C57106a aVar) {
        if (this.f130302m != null && aVar != null && "music_detail".equals(aVar.f130018c)) {
            this.f130302m.mo60191a("music_collect_status", new C57191a(0, aVar.f130016a, -1, -1, aVar.f130017b));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.f130314z = arguments.getString("challenge");
        }
        this.f130287A = arguments.getString("first_sticker_music_ids", null);
        this.f130289C = arguments.getBoolean("is_busi_sticker", false);
        this.f130288B = arguments.getString("first_sticker_id", null);
        this.f130291E = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.f130294H = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.f130290D = arguments.getString("shoot_way");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C69905c curMusic;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        switch (str.hashCode()) {
            case -2080369200:
                if (str.equals("pick_status")) {
                    if (((Integer) bVar2.mo60212a()).intValue() != 1) {
                        TuxStatusView tuxStatusView = this.f130297d;
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        Fragment parentFragment = getParentFragment();
                        if (parentFragment instanceof C57211i) {
                            AbstractView$OnClickListenerC57193a aVar = (AbstractView$OnClickListenerC57193a) parentFragment;
                            if (aVar.af_() && aVar.getActivity() != null && aVar.f130246k && (curMusic = AVExternalServiceImpl.m113114a().publishService().getCurMusic()) != null) {
                                aVar.f130243d.setVisibility(0);
                                aVar.f130244e.setText(aVar.getActivity().getString(R.string.ad9, new Object[]{curMusic.getMusicName()}));
                                if (aVar.f130247l) {
                                    aVar.f130245j.setAlpha(0.5f);
                                }
                                aVar.f130245j.setOnClickListener(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e8: INVOKE  
                                      (wrap: android.view.View : 0x00e1: IGET  (r1v2 android.view.View) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) com.ss.android.ugc.aweme.kids.choosemusic.c.a.j android.view.View)
                                      (wrap: com.ss.android.ugc.aweme.kids.choosemusic.c.a$1 : 0x00e5: CONSTRUCTOR  (r0v17 com.ss.android.ugc.aweme.kids.choosemusic.c.a$1) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) call: com.ss.android.ugc.aweme.kids.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.kids.choosemusic.c.a):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.kids.choosemusic.c.e.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes7.dex
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e5: CONSTRUCTOR  (r0v17 com.ss.android.ugc.aweme.kids.choosemusic.c.a$1) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) call: com.ss.android.ugc.aweme.kids.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.kids.choosemusic.c.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.kids.choosemusic.c.e.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 39 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.kids.choosemusic.c.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 45 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 254
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e.onChanged(java.lang.Object):void");
                            }

                            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
                            /* renamed from: a */
                            public final void mo94416a(MusicModel musicModel) {
                                C57261a aVar = this.f130307r;
                                if (aVar != null) {
                                    aVar.mo94287a();
                                }
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c
                            /* renamed from: a */
                            public final /* synthetic */ void mo94240a(C57192b bVar) {
                                C57192b bVar2 = bVar;
                                String str = bVar2.f130237b;
                                MusicModel musicModel = bVar2.f130236a;
                                if ("follow_type".equals(str)) {
                                    this.f130308s.mo94456a(musicModel, musicModel.getMusicId(), 1, bVar2.f130238c, bVar2.f130239d);
                                } else if ("unfollow_type".equals(str)) {
                                    this.f130308s.mo94456a(musicModel, musicModel.getMusicId(), 0, bVar2.f130238c, bVar2.f130239d);
                                }
                            }

                            @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
                            /* renamed from: b */
                            public final void mo62635b(int i, int i2) {
                                mo94436d();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
                            /* renamed from: a */
                            public final void mo62628a(float f, float f2) {
                                RecyclerView recyclerView;
                                if (af_()) {
                                    int i = this.f130312w;
                                    if (i == 0) {
                                        recyclerView = (RecyclerView) this.f130305p.mo62680m();
                                    } else if (i == 1) {
                                        recyclerView = (RecyclerView) this.f130306q.mo94442m();
                                    } else {
                                        return;
                                    }
                                    if (recyclerView != null) {
                                        int childCount = recyclerView.getChildCount();
                                        if (childCount == 0) {
                                            this.f130300k.mo68079a();
                                            this.f130300k.setMaxScrollHeight(0);
                                            return;
                                        }
                                        View g = recyclerView.getLayoutManager().mo4717g(childCount - 1);
                                        int childCount2 = this.f130300k.getChildCount();
                                        if (childCount2 >= 2 && g != null) {
                                            int measuredHeight = ((View) this.f130300k.getParent()).getMeasuredHeight();
                                            this.f130300k.setMaxScrollHeight(((recyclerView.getTop() + g.getBottom()) + this.f130300k.getChildAt(childCount2 - 1).getTop()) - measuredHeight);
                                        }
                                    }
                                }
                            }

                            /* access modifiers changed from: package-private */
                            /* renamed from: a */
                            public final /* synthetic */ void mo94430a(DmtTabLayout.C17294f fVar, MusicModel musicModel) {
                                C57259a aVar;
                                if (getActivity() != null && !getActivity().isFinishing() && (aVar = this.f130296b) != null) {
                                    DmtTabLayout.C17296h hVar = fVar.f41528i;
                                    C89219l.m154721d(hVar, "");
                                    C89219l.m154721d(musicModel, "");
                                    if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                                        C34577e.m70608b(aVar.f130429b, musicModel.getPicPremium(), -1, -1);
                                    } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                                        C34577e.m70608b(aVar.f130429b, musicModel.getPicBig(), -1, -1);
                                    }
                                    aVar.setWidth(hVar.getWidth() + C34728n.m70946a(24.0d));
                                    if (!aVar.isShowing()) {
                                        aVar.showAsDropDown(hVar, (hVar.getWidth() - aVar.getWidth()) / 2, -((hVar.getHeight() + aVar.f130430c.getMeasuredHeight()) - C34728n.m70946a(16.0d)));
                                    }
                                    aVar.f130430c.removeCallbacks(aVar.f130428a);
                                    aVar.f130430c.postDelayed(aVar.f130428a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                }
                            }

                            @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b
                            /* renamed from: a */
                            public final void mo94417a(MusicModel musicModel, C57171a aVar) {
                                this.f130304o = musicModel;
                                if (this.f130292F) {
                                    this.f130307r.f130432a = aVar;
                                    if (aVar != null && aVar.f130166h) {
                                        this.f130302m.mo60191a("last_play_music_id", musicModel.getMusicId());
                                    }
                                    this.f130307r.mo94288a(musicModel, this.f130303n, false);
                                    return;
                                }
                                this.f130307r.mo94296c(musicModel, this.f130303n, m103683n());
                            }

                            @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
                            public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                int i;
                                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior;
                                View a = C1764a.m5927a(layoutInflater, R.layout.adb, viewGroup, false);
                                this.f130297d = (TuxStatusView) a.findViewById(R.id.e7i);
                                this.f130298e = (DmtTabLayout) a.findViewById(R.id.ee7);
                                this.f130299j = (ViewPager) a.findViewById(R.id.b4i);
                                this.f130300k = (ScrollableLayout) a.findViewById(R.id.dq9);
                                this.f130301l = a.findViewById(R.id.amb);
                                this.f130300k.setVisibility(4);
                                this.f130300k.setOnScrollListener(this);
                                if (bundle == null) {
                                    i = 0;
                                } else {
                                    i = bundle.getInt("KEY_CURRENT_TAB", 0);
                                }
                                this.f130312w = i;
                                DataCenter a2 = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
                                this.f130302m = a2;
                                a2.mo60189a("pick_status", (AbstractC1214u<C33942b>) this).mo60189a("data_banner", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this);
                                this.f130302m.mo60191a("key_choose_music_type", Integer.valueOf(this.f130291E));
                                this.f130302m.mo60191a("sticker_id", this.f130288B);
                                this.f130302m.mo60191a("challenge_id", this.f130314z);
                                this.f130302m.mo60191a("mvtheme_music_type", Boolean.valueOf(this.f130309t));
                                this.f130302m.mo60191a("is_photo_mv_type", Boolean.valueOf(this.f130310u));
                                this.f130302m.mo60191a("is_busi_sticker", Boolean.valueOf(this.f130289C));
                                this.f130302m.mo60191a("shoot_way", this.f130290D);
                                C33947e a3 = C33947e.m69516a(this, a);
                                this.f130311v = a3;
                                a3.mo60218a(this.f130302m);
                                this.f130313y = new MusicBannerWidget();
                                this.f130308s = new C57238a(getContext(), this.f130302m);
                                this.f130311v.mo60221b(R.id.ccz, this.f130313y);
                                AbstractC0952i childFragmentManager = getChildFragmentManager();
                                StringBuilder sb = new StringBuilder();
                                String str = f130286c;
                                C57216l lVar = (C57216l) childFragmentManager.mo3551a(sb.append(str).append(0).toString());
                                this.f130305p = lVar;
                                if (lVar == null) {
                                    int i2 = this.f130291E;
                                    String str2 = this.f130314z;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                                    if (!TextUtils.isEmpty(str2)) {
                                        bundle2.putString("challenge", str2);
                                    }
                                    C57216l lVar2 = new C57216l();
                                    lVar2.setArguments(bundle2);
                                    this.f130305p = lVar2;
                                }
                                this.f130305p.f130264c = this.f130302m;
                                this.f130305p.f130265d = this.f130311v;
                                this.f130305p.f130270m = this.f130308s;
                                C57216l lVar3 = this.f130305p;
                                lVar3.f130267j = this;
                                if (lVar3.f130266e != null) {
                                    lVar3.f130266e.f130168d = lVar3.f130267j;
                                }
                                C57216l lVar4 = this.f130305p;
                                lVar4.f130268k = this;
                                if (lVar4.f130266e != null) {
                                    lVar4.f130266e.f130169e = lVar4.f130268k;
                                }
                                C57216l lVar5 = this.f130305p;
                                lVar5.f130269l = this;
                                if (lVar5.f130266e != null) {
                                    lVar5.f130266e.f130172h = lVar5.f130269l;
                                }
                                C57213j jVar = (C57213j) getChildFragmentManager().mo3551a(str + 1);
                                this.f130306q = jVar;
                                if (jVar == null) {
                                    int i3 = this.f130291E;
                                    String str3 = this.f130314z;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
                                    if (!TextUtils.isEmpty(str3)) {
                                        bundle3.putString("challenge", str3);
                                    }
                                    C57213j jVar2 = new C57213j();
                                    jVar2.setArguments(bundle3);
                                    this.f130306q = jVar2;
                                }
                                this.f130306q.f130278e = this.f130302m;
                                this.f130306q.f130331l = this;
                                C57261a aVar = new C57261a(this, new C57261a.AbstractC57266a() {
                                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e.C572031 */

                                    static {
                                        Covode.recordClassIndex(67108);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.AbstractC57266a
                                    /* renamed from: a */
                                    public final void mo94425a() {
                                        if (AbstractC57202e.this.f130304o != null) {
                                            AbstractC57202e.this.f130302m.mo60191a("play_compeleted", AbstractC57202e.this.f130304o.getMusicId());
                                        }
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57261a.AbstractC57266a
                                    /* renamed from: b */
                                    public final void mo94426b() {
                                        if (AbstractC57202e.this.f130304o != null) {
                                            AbstractC57202e.this.f130302m.mo60191a("play_error", AbstractC57202e.this.f130304o.getMusicId());
                                        }
                                    }
                                });
                                this.f130307r = aVar;
                                aVar.mo94295c();
                                this.f130307r.mo94291b(this.f130291E);
                                this.f130296b = new C57259a(getContext());
                                this.f130299j.setOffscreenPageLimit(2);
                                this.f130299j.setAdapter(new AbstractC0974l(getChildFragmentManager()) {
                                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e.C572042 */

                                    /* renamed from: b */
                                    private final int[] f130317b = {R.string.b7x, R.string.dbd};

                                    static {
                                        Covode.recordClassIndex(67109);
                                    }

                                    @Override // androidx.viewpager.widget.PagerAdapter
                                    public final int getCount() {
                                        return 2;
                                    }

                                    @Override // androidx.fragment.app.AbstractC0974l
                                    /* renamed from: a */
                                    public final Fragment mo3639a(int i) {
                                        if (i == 0) {
                                            return AbstractC57202e.this.f130305p;
                                        }
                                        return AbstractC57202e.this.f130306q;
                                    }

                                    @Override // androidx.viewpager.widget.PagerAdapter
                                    public final CharSequence getPageTitle(int i) {
                                        return AbstractC57202e.this.getResources().getString(this.f130317b[i]);
                                    }
                                });
                                this.f130298e.setCustomTabViewResId(R.layout.a_v);
                                this.f130298e.setTabMode(0);
                                this.f130298e.setAutoFillWhenScrollable(true);
                                this.f130298e.setupWithViewPager(this.f130299j);
                                mo94429a((LinearLayout) this.f130298e.getChildAt(0));
                                this.f130298e.setOnTabClickListener(new C57208f(this));
                                mo94432b();
                                this.f130298e.mo27521a(new DmtTabLayout.AbstractC17289c() {
                                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e.C572053 */

                                    static {
                                        Covode.recordClassIndex(67110);
                                    }

                                    @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
                                    /* renamed from: b */
                                    public final void mo27575b(DmtTabLayout.C17294f fVar) {
                                    }

                                    @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
                                    /* renamed from: a */
                                    public final void mo27574a(DmtTabLayout.C17294f fVar) {
                                        int i = fVar.f41524e;
                                        if (i == 1 && AbstractC57202e.this.f130296b != null) {
                                            AbstractC57202e.this.f130296b.dismiss();
                                        }
                                        RecyclerView.AbstractC1350a c = AbstractC57202e.this.mo94434c();
                                        if (c != null) {
                                            if (c instanceof C57174b) {
                                                ((C57174b) c).mo94375l();
                                            } else if (c instanceof C57172a) {
                                                ((C57172a) c).mo94374l();
                                            }
                                        }
                                        AbstractC57202e.this.mo94428a(i);
                                    }
                                });
                                this.f130298e.mo27529b(this.f130312w).mo27592a();
                                mo94427a();
                                mo94428a(this.f130312w);
                                m103681g();
                                ActivityC0945e activity = getActivity();
                                if ((activity instanceof ChooseMusicActivity) && (viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f130224c) != null) {
                                    viewPagerBottomSheetBehavior.mo61089a(this.f130299j);
                                }
                                return a;
                            }

                            @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.AbstractC57135c
                            /* renamed from: a */
                            public final void mo94282a(String str, final MusicModel musicModel, String str2) {
                                C57147c.m103543a(musicModel);
                                final ActivityC0945e activity = getActivity();
                                int i = this.f130291E;
                                if (i == 0 || i == 2) {
                                    Intent intent = new Intent();
                                    intent.putExtra("path", str);
                                    intent.putExtra("music_model", musicModel);
                                    intent.putExtra("music_origin", str2);
                                    activity.setResult(-1, intent);
                                    activity.finish();
                                    return;
                                }
                                String string = getArguments().getString("shoot_way");
                                final RecordConfig.Builder builder = new RecordConfig.Builder();
                                builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicOrigin(str2).musicPath(str).musicModel(musicModel);
                                AVExternalServiceImpl.m113114a().asyncService("NewMusicTab", new SimpleServiceLoadCallback() {
                                    /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57202e.C572075 */

                                    static {
                                        Covode.recordClassIndex(67112);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                                        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, false);
                                    }
                                });
                            }
                        }
