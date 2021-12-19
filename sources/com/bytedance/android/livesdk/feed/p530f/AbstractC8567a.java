package com.bytedance.android.livesdk.feed.p530f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p210a.C3842e;
import com.bytedance.android.live.core.p210a.C3847j;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.AbstractC8596i;
import com.bytedance.android.livesdk.feed.AbstractC8634k;
import com.bytedance.android.livesdk.feed.AbstractC8655q;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.C8492b;
import com.bytedance.android.livesdk.feed.C8564e;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8472a;
import com.bytedance.android.livesdk.feed.p523a.C8476d;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.android.livesdk.feed.p535k.C8635a;
import com.bytedance.android.livesdk.feed.p535k.C8638b;
import com.bytedance.android.livesdk.feed.p537m.C8644a;
import com.bytedance.android.livesdk.feed.p538n.C8646a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.services.C8680b;
import com.bytedance.android.livesdk.feed.services.C8685d;
import com.bytedance.android.livesdk.feed.tab.p541b.C8701g;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.SyncContentViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.f.a */
public abstract class AbstractC8567a extends C10935a implements AbstractC8596i, AbstractC8634k {

    /* renamed from: t */
    public static C9520ag f21172t;

    /* renamed from: a */
    private TimeOutRefreshViewModel f21173a;

    /* renamed from: b */
    private SyncContentViewModel f21174b;

    /* renamed from: c */
    private String f21175c = "";

    /* renamed from: d */
    private final Handler f21176d = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.HandlerC85681 */

        static {
            Covode.recordClassIndex(9424);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                AbstractC8567a.this.mo14870b(1);
            }
        }
    };

    /* renamed from: g */
    protected C8564e f21177g;

    /* renamed from: h */
    protected RecyclerView f21178h;

    /* renamed from: i */
    protected C8476d f21179i;

    /* renamed from: j */
    protected BannerSwipeRefreshLayout f21180j;

    /* renamed from: k */
    protected TabFeedViewModel f21181k;

    /* renamed from: l */
    public DislikeTipViewModel f21182l;

    /* renamed from: m */
    public C1175ad.AbstractC1177b f21183m;

    /* renamed from: n */
    protected View f21184n;

    /* renamed from: o */
    protected View f21185o;

    /* renamed from: p */
    protected boolean f21186p;

    /* renamed from: q */
    public boolean f21187q;

    /* renamed from: r */
    long f21188r;

    /* renamed from: s */
    public DataChannel f21189s;

    static {
        Covode.recordClassIndex(9423);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8476d.C8479a mo14850a(C8476d.C8479a aVar) {
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: a */
    public String mo14851a() {
        return "";
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: b */
    public String mo14857b() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract TabFeedViewModel mo14859d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo14860e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract AbstractC8472a mo14861g();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo14876p() {
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f21173a;
        if (timeOutRefreshViewModel != null) {
            timeOutRefreshViewModel.f21518a = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo14873m() {
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f21173a;
        if (timeOutRefreshViewModel != null) {
            timeOutRefreshViewModel.mo14999a();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8596i
    /* renamed from: c */
    public int mo14858c() {
        int value = FeedPreloadSetting.INSTANCE.getValue();
        if (value <= 1) {
            return 4;
        }
        return value;
    }

    /* renamed from: h */
    public long mo14862h() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("id");
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public RecyclerView.AbstractC1362i mo14863i() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(mo14860e(), 1);
        staggeredGridLayoutManager.mo4793i();
        return staggeredGridLayoutManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo14875o() {
        TabFeedViewModel tabFeedViewModel = this.f21181k;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.mo14990a("enter_auto");
        }
    }

    /* renamed from: j */
    public void mo14864j() {
        DislikeTipViewModel dislikeTipViewModel = this.f21182l;
        if (dislikeTipViewModel != null) {
            dislikeTipViewModel.f21502b = -1;
        }
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f21173a;
        if (timeOutRefreshViewModel != null && timeOutRefreshViewModel.f21520c == Long.MAX_VALUE) {
            timeOutRefreshViewModel.f21520c = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo14861g() != null) {
            AbstractC8472a g = mo14861g();
            g.f20951r.onNext(C11195i.f26825c);
            g.f20943j.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (mo14861g() != null) {
            AbstractC8472a g = mo14861g();
            g.f20950q.onNext(C11195i.f26825c);
            g.f20954u = false;
        }
        mo14873m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (mo14861g() != null) {
            mo14861g().mo14808c();
        }
        mo14864j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final RecyclerView.AbstractC1361h mo14874n() {
        RecyclerView recyclerView = this.f21178h;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f21178h.getPaddingTop(), this.f21178h.getPaddingRight(), this.f21178h.getPaddingBottom());
        return new C8644a();
    }

    /* renamed from: b */
    public final void mo14871b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        C6501b.C6502a.m13948a("livesdk_explore_live_take_button").mo12652a((Map<String, String>) hashMap).mo12643a(this.f21189s).mo12655b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14868a(int i) {
        View view;
        if (this.f21186p && (view = this.f21185o) != null && view.getVisibility() == 0) {
            if (i == 0) {
                if (this.f21176d.hasMessages(1)) {
                    this.f21176d.removeMessages(1);
                }
                Handler handler = this.f21176d;
                handler.sendMessageDelayed(Message.obtain(handler, 1), 3000);
            } else if (i == 1) {
                if (this.f21176d.hasMessages(1)) {
                    this.f21176d.removeMessages(1);
                }
                mo14870b(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14870b(int i) {
        if (i == 1) {
            mo14871b("show");
        }
        this.f21185o.animate().setDuration(300).alpha((float) i).setListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85725 */

            static {
                Covode.recordClassIndex(9428);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }
        }).start();
    }

    /* renamed from: a */
    public void mo14852a(View view) {
        this.f21180j = (BannerSwipeRefreshLayout) view.findViewById(R.id.eda);
        if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
            this.f21185o = view.findViewById(R.id.aoz);
        } else {
            this.f21185o = view.findViewById(R.id.eop);
        }
        ((IHostUser) C6193a.m13435a(IHostUser.class)).requestLivePermission(new AbstractC11827c() {
            /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85714 */

            static {
                Covode.recordClassIndex(9427);
            }

            @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
            /* renamed from: a */
            public final void mo14879a(Throwable th) {
            }

            @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
            /* renamed from: a */
            public final void mo14878a(Boolean bool, C11826b bVar, C11825a aVar) {
                AbstractC8567a.this.f21186p = bool.booleanValue();
                if (bVar != null) {
                    DataChannelGlobal.f42558d.mo28321a(C9012af.class, bVar);
                }
                if (aVar != null) {
                    DataChannelGlobal.f42558d.mo28321a(C9115e.class, aVar);
                }
                if (AbstractC8567a.this.f21186p) {
                    AbstractC8567a.this.f21185o.setVisibility(0);
                    AbstractC8567a.this.mo14871b("show");
                }
            }
        });
        this.f21185o.setOnClickListener(new View$OnClickListenerC8580f(this));
        this.f21178h.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85703 */

            static {
                Covode.recordClassIndex(9426);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
                    AbstractC8567a.this.mo14868a(i);
                }
                if (i != 0) {
                    DislikeTipViewModel dislikeTipViewModel = AbstractC8567a.this.f21182l;
                    if (dislikeTipViewModel.f21501a && recyclerView != null && !dislikeTipViewModel.f21503c && dislikeTipViewModel.f21502b == -1) {
                        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            dislikeTipViewModel.f21502b = ((StaggeredGridLayoutManager) layoutManager).mo4791b((int[]) null)[0];
                        } else if (layoutManager instanceof GridLayoutManager) {
                            dislikeTipViewModel.f21502b = ((LinearLayoutManager) layoutManager).mo4373m();
                        }
                    }
                }
                C8635a aVar = C8635a.C8637a.f21358a;
                if (i == 0) {
                    aVar.mo14931a();
                } else if (aVar.f21354e || aVar.f21355f <= 10) {
                    if (!aVar.f21354e) {
                        int i2 = Build.VERSION.SDK_INT;
                        try {
                            aVar.mo14931a();
                            aVar.f21354e = true;
                            Choreographer.getInstance().postFrameCallback(aVar.f21356g);
                        } catch (Throwable unused) {
                            aVar.f21354e = false;
                        }
                    }
                } else if (C8635a.f21350a) {
                    C3854a.m9453a(3, "FPSMonitor", "stop because over max count, cur count = " + aVar.f21355f);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
                    return;
                }
                if (i2 > 20) {
                    AbstractC8567a aVar = AbstractC8567a.this;
                    aVar.mo14869a(0, aVar.f21185o);
                } else if (i2 < -20) {
                    AbstractC8567a aVar2 = AbstractC8567a.this;
                    aVar2.mo14869a(1, aVar2.f21185o);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21189s = C17846f.m33055a(this);
        FeedRepository feedRepository = new FeedRepository(C8685d.m16963a(), (FeedApi) C5805e.m12718a().mo11572a(FeedApi.class), new C3842e(), new C3847j(), new C3842e(), (AbstractC8592a) C8680b.m16959a().mo14966a(AbstractC8592a.class), new C8492b(C8701g.m16993b()));
        C8701g b = C8701g.m16993b();
        Context applicationContext = C3966y.m9669e().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f21177g = new C8564e(feedRepository, b, applicationContext, new AbstractC8655q() {
            /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85758 */

            static {
                Covode.recordClassIndex(9431);
            }
        }, new C8646a());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_visible")) {
            setUserVisibleHint(arguments.getBoolean("user_visible"));
        }
        List<C9520ag> a = C8701g.m16993b().mo14977a();
        if (a != null && a.size() > 0) {
            C9520ag agVar = a.get(0);
            f21172t = agVar;
            this.f21175c = agVar.getUrl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.f21186p) {
            mo14871b("show");
        }
        TabFeedViewModel tabFeedViewModel = this.f21181k;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.mo14997a(z);
        }
        if (mo14861g() != null) {
            AbstractC8472a g = mo14861g();
            g.f20958y = z;
            if (z) {
                if (g.f20957x) {
                    C6501b.C6502a.m13948a("livesdk_explore_page_show").mo12639a().mo12651a("show_type", "normal").mo12645a("has_banner", C2695a.f8059g.mo7220c()).mo12655b();
                }
                if (!(g.f20947n == null || g.f20947n.size() == 0)) {
                    long nanoTime = System.nanoTime() / 1000000;
                    for (Map.Entry<String, Long> entry : g.f20947n.entrySet()) {
                        g.f20945l.put(entry.getKey(), Long.valueOf(nanoTime));
                    }
                    g.f20947n.clear();
                    g.f20947n = null;
                }
            } else {
                g.mo14805a(g.f20945l, false);
            }
            g.f20952s.onNext(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14869a(int i, View view) {
        boolean z;
        if (this.f21186p && !this.f21187q) {
            if (this.f21185o.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            float a = (float) C3966y.m9653a(100.0f);
            if (i != 0) {
                if (i == 1 && !z) {
                    this.f21187q = true;
                    view.setVisibility(0);
                    mo14871b("show");
                    view.setTranslationY(a);
                    view.animate().setDuration(300).translationY(0.0f).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85747 */

                        static {
                            Covode.recordClassIndex(9430);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            AbstractC8567a.this.f21187q = false;
                        }
                    }).alpha(1.0f).start();
                }
            } else if (z) {
                this.f21187q = true;
                view.animate().setDuration(300).translationY(a).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85736 */

                    static {
                        Covode.recordClassIndex(9429);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        AbstractC8567a.this.f21185o.setVisibility(8);
                        AbstractC8567a.this.f21187q = false;
                    }
                }).alpha(0.0f).start();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f21181k = mo14859d();
        C8476d.C8479a aVar = new C8476d.C8479a();
        aVar.f20982g = this;
        aVar.f20978c = this.f21181k;
        aVar.f20977b = this.f21178h;
        aVar.f20985j = new C8576b(this);
        aVar.f20976a = mo14861g();
        aVar.f20979d = mo14863i();
        aVar.f20981f = mo14874n();
        aVar.f20983h = false;
        aVar.f20980e = mo14860e();
        aVar.f20984i = this;
        C8476d.C8479a a = mo14850a(aVar);
        if (a.f20977b != null) {
            a.f20977b.setItemAnimator(null);
            if (a.f20976a == null) {
                throw new IllegalStateException("adapter must not be null");
            } else if (a.f20978c == null) {
                throw new IllegalStateException("viewModel must not be null");
            } else if (a.f20982g != null) {
                C8476d dVar = new C8476d(a.f20982g, a.f20976a, a.f20977b, a.f20978c, (byte) 0);
                dVar.f20965d = a.f20979d;
                if (a.f20979d instanceof StaggeredGridLayoutManager) {
                    ((StaggeredGridLayoutManager) a.f20979d).mo4318a(a.f20980e);
                }
                dVar.f20969h = a.f20985j;
                dVar.f20966e = a.f20981f;
                dVar.f20968g = a.f20983h;
                dVar.f20967f = a.f20984i;
                dVar.f20970i = a.f20986k;
                dVar.f20971j = a.f20987l;
                this.f21179i = dVar;
                dVar.mo14809a();
                this.f21181k.mo14997a(getUserVisibleHint());
                this.f21178h.mo4405a(new C8638b("feed_drawer_slide"));
                ((BaseFeedDataViewModel) this.f21181k).f21486m.observe(this, new AbstractC1214u<List<ImageModel>>() {
                    /* class com.bytedance.android.livesdk.feed.p530f.AbstractC8567a.C85692 */

                    static {
                        Covode.recordClassIndex(9425);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(List<ImageModel> list) {
                        for (ImageModel imageModel : list) {
                            C3941k.m9598a(imageModel);
                        }
                    }
                });
                C8564e eVar = this.f21177g;
                eVar.f21164a = mo14862h();
                this.f21182l = (DislikeTipViewModel) C1181ae.m3879a(this, eVar).mo3983a(DislikeTipViewModel.class);
                TimeOutRefreshViewModel timeOutRefreshViewModel = (TimeOutRefreshViewModel) C1181ae.m3879a(this, this.f21177g).mo3983a(TimeOutRefreshViewModel.class);
                this.f21173a = timeOutRefreshViewModel;
                timeOutRefreshViewModel.f21519b.mo143254a(new C8577c(this), C8578d.f21200a);
                this.f21174b = (SyncContentViewModel) C1181ae.m3879a(this, this.f21183m).mo3983a(SyncContentViewModel.class);
                ((BaseFeedDataViewModel) this.f21181k).f21484k.observe(this, new C8579e(this));
            } else {
                throw new IllegalStateException("lifecycleOwner must not be null");
            }
        } else {
            throw new IllegalStateException("recyclerView must not be null");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.b8a, viewGroup, false);
        this.f21178h = (RecyclerView) a.findViewById(R.id.c_1);
        mo14852a(a);
        return a;
    }
}
