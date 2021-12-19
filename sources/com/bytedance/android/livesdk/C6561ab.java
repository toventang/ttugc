package com.bytedance.android.livesdk;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6201f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.LiveOntologyInfoManager$$Lambda$0;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.backroom.C7334b;
import com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.C7360a;
import com.bytedance.android.livesdk.chatroom.backroom.p484c.C7341a;
import com.bytedance.android.livesdk.chatroom.backroom.p484c.C7345b;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.chatroom.detail.C7454r;
import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.android.livesdk.chatroom.p489d.C7420c;
import com.bytedance.android.livesdk.chatroom.p489d.C7421d;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7711b;
import com.bytedance.android.livesdk.list.C9282g;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.live.C9285a;
import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.android.livesdk.live.p565b.C9288a;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.liveroom.NetworkController;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.liveroom.RoomTaskController;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawPreEnterRoom;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPlayerInvokeStopBeforePlaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.model.C9898o;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.C6545f;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p428c.C6522b;
import com.bytedance.android.livesdk.p425aa.p428c.C6532j;
import com.bytedance.android.livesdk.p441ah.C6684c;
import com.bytedance.android.livesdk.p442ai.C6739l;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p571m.C9461f;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.survey.AbstractC10787a;
import com.bytedance.android.livesdk.util.C11118c;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.AbstractC11618d;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11640d;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11658l;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11659m;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11628a;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11662p;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.android.livesdkapi.p691g.AbstractC11774m;
import com.bytedance.android.livesdkapi.p691g.C11772k;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.view.AbstractC11873b;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.android.p149d.AbstractC2719c;
import com.bytedance.android.p149d.AbstractC2722e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ab */
public class C6561ab extends C10935a implements C7711b.AbstractC7713b, AbstractC11650h, AbstractC11652i.AbstractC11653a, AbstractC11652i.AbstractC11654b, AbstractC11873b {

    /* renamed from: a */
    public static C6545f f16389a;

    /* renamed from: f */
    public static boolean f16390f = true;

    /* renamed from: A */
    private boolean f16391A = false;

    /* renamed from: B */
    private C6739l f16392B;

    /* renamed from: C */
    private final AbstractC11640d f16393C = new C6582ac(this);

    /* renamed from: D */
    private boolean f16394D = false;

    /* renamed from: b */
    public RoomStatusController f16395b;

    /* renamed from: c */
    RoomListener f16396c;

    /* renamed from: d */
    ViewGroup f16397d;

    /* renamed from: e */
    C7345b f16398e;

    /* renamed from: g */
    LiveVerticalViewPager f16399g;

    /* renamed from: h */
    FrameLayout f16400h;

    /* renamed from: i */
    public AbstractC11768h f16401i;

    /* renamed from: j */
    public C9285a f16402j;

    /* renamed from: k */
    Runnable f16403k;

    /* renamed from: l */
    public C6565a f16404l;

    /* renamed from: m */
    AbstractC5777j f16405m;

    /* renamed from: n */
    AbstractC11767g f16406n;

    /* renamed from: o */
    public final boolean f16407o = EnableSlideEnterRoomOptSetting.INSTANCE.getValue();

    /* renamed from: p */
    long f16408p = 0;

    /* renamed from: q */
    String f16409q;

    /* renamed from: r */
    public boolean f16410r = LiveMultiPlayerEnableSetting.INSTANCE.getValue();

    /* renamed from: s */
    private NetworkController f16411s;

    /* renamed from: t */
    private RoomTaskController f16412t;

    /* renamed from: u */
    private boolean f16413u;

    /* renamed from: v */
    private long f16414v = -1;

    /* renamed from: w */
    private boolean f16415w;

    /* renamed from: x */
    private C6566b f16416x;

    /* renamed from: y */
    private boolean f16417y;

    /* renamed from: z */
    private C88411a f16418z = new C88411a();

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: b */
    public final Fragment mo12701b() {
        return this;
    }

    /* renamed from: com.bytedance.android.livesdk.ab$b */
    static class C6566b implements LiveVerticalViewPager.AbstractC11364f {
        static {
            Covode.recordClassIndex(7302);
        }

        private C6566b() {
        }

        @Override // com.bytedance.android.livesdk.widget.LiveVerticalViewPager.AbstractC11364f
        /* renamed from: a */
        public final boolean mo12721a() {
            return ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).tryShowHoldingSurveyFromSlide();
        }

        /* synthetic */ C6566b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: d */
    public final AbstractC11658l mo12703d() {
        return this.f16396c.getRoomAction();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: e */
    public final AbstractC11659m mo12704e() {
        return this.f16396c.getRoomEventListener();
    }

    static {
        Covode.recordClassIndex(7297);
    }

    /* renamed from: q */
    static String m14030q() {
        return C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28293J;
    }

    /* renamed from: r */
    static String m14031r() {
        return C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28295L;
    }

    /* renamed from: u */
    private static boolean m14033u() {
        return ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInteracting();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: j */
    public final boolean mo12709j() {
        C7345b bVar = this.f16398e;
        if (bVar == null || !bVar.mo13579a("draw")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7711b.AbstractC7713b
    /* renamed from: l */
    public final void mo12711l() {
        FrameLayout frameLayout = this.f16400h;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: s */
    public final void mo12716s() {
        if (mo12702c() != null) {
            mo12702c().mo14089D();
        }
    }

    /* renamed from: a */
    public static String m14028a() {
        return m14030q() + "_" + m14031r();
    }

    /* renamed from: t */
    private void m14032t() {
        LiveVerticalViewPager liveVerticalViewPager;
        if (this.f16403k != null && (liveVerticalViewPager = this.f16399g) != null && !this.f16417y) {
            liveVerticalViewPager.post(new RunnableC6681ah(this));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: c */
    public final AbstractC11652i mo12702c() {
        C9285a aVar = this.f16402j;
        if (aVar == null || aVar.getCount() == 0) {
            return null;
        }
        return this.f16402j.mo15385b(this.f16399g.getCurrentItem());
    }

    @Override // com.bytedance.android.livesdkapi.view.AbstractC11873b
    /* renamed from: g */
    public final boolean mo12706g() {
        AbstractC11652i c = mo12702c();
        if (c != null && c.mo13772i_()) {
            return true;
        }
        if (!C7349a.m15253c() || !mo12709j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: i */
    public final boolean mo12708i() {
        if (this.f16401i.mo14898a() <= 1) {
            return false;
        }
        LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isGuideEnable(m14028a());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12710k() {
        boolean z;
        LiveVerticalViewPager liveVerticalViewPager = this.f16399g;
        if (liveVerticalViewPager != null) {
            if (this.f16413u || this.f16394D || m14033u()) {
                z = false;
            } else {
                z = true;
            }
            liveVerticalViewPager.setEnabled(z);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m14032t();
        this.f16391A = false;
        AbstractC5777j jVar = this.f16405m;
        if (jVar != null) {
            jVar.mo12921f(false);
        }
    }

    /* renamed from: p */
    public final void mo12715p() {
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("has_page_slide", true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo12705f() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "LinkIn_Guest_resetViews");
        AbstractC11652i c = mo12702c();
        if (c != null) {
            c.mo14117c();
        }
        try {
            this.f16399g.setAdapter(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C9285a aVar = this.f16402j;
        if (aVar != null) {
            aVar.mo15384a();
            this.f16402j = null;
        }
        AbstractC11768h hVar = this.f16401i;
        if (hVar != null) {
            hVar.mo14905c();
            this.f16401i = null;
        }
    }

    /* renamed from: h */
    public final void mo12707h() {
        C9285a aVar;
        int i;
        int currentItem = this.f16399g.getCurrentItem();
        if (currentItem >= 0 && (aVar = this.f16402j) != null) {
            int count = aVar.getCount() - currentItem;
            C9898o value = LiveFeedPreloadSetting.INSTANCE.getValue();
            if (value == null || (i = value.f23965c) <= 0) {
                i = 2;
            }
            if (count <= i) {
                this.f16401i.mo14903b(currentItem);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11653a
    /* renamed from: m */
    public final void mo12712m() {
        Object instantiateItem = this.f16402j.instantiateItem((ViewGroup) this.f16399g, this.f16399g.getCurrentItem());
        if (instantiateItem != null && (instantiateItem instanceof C7822br)) {
            C7822br brVar = (C7822br) instantiateItem;
            brVar.f19416O = true;
            if (brVar.f19419R != null) {
                brVar.f19419R.setVisibility(8);
            }
            if (brVar.f19425X != null) {
                brVar.f19425X.mo18177b();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11653a
    /* renamed from: n */
    public final void mo12713n() {
        int currentItem = this.f16399g.getCurrentItem();
        int i = currentItem + 1;
        if (i >= this.f16402j.getCount()) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Object instantiateItem = this.f16402j.instantiateItem((ViewGroup) this.f16399g, currentItem);
        if (instantiateItem != null && (instantiateItem instanceof C7822br)) {
            ((C7822br) instantiateItem).f19417P = true;
        }
        this.f16399g.setCurrentItem(i);
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eda);
    }

    /* renamed from: com.bytedance.android.livesdk.ab$a */
    class C6565a implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        public AbstractC11652i f16426a;

        /* renamed from: b */
        int f16427b;

        /* renamed from: d */
        private int f16429d = -1;

        /* renamed from: e */
        private long f16430e = -1;

        /* renamed from: f */
        private String f16431f;

        /* renamed from: g */
        private int f16432g;

        /* renamed from: h */
        private int f16433h;

        /* renamed from: i */
        private int f16434i;

        /* renamed from: j */
        private final String f16435j;

        /* renamed from: k */
        private int f16436k;

        /* renamed from: l */
        private final SparseBooleanArray f16437l = new SparseBooleanArray();

        static {
            Covode.recordClassIndex(7301);
        }

        /* renamed from: a */
        private void m14059a() {
            int currentItem = C6561ab.this.f16399g.getCurrentItem();
            ArrayList arrayList = new ArrayList();
            int count = C6561ab.this.f16402j.getCount();
            for (int i = 0; i < this.f16437l.size(); i++) {
                int keyAt = this.f16437l.keyAt(i);
                if (keyAt >= 0 && keyAt < count && Math.abs(keyAt - currentItem) > 1) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                this.f16437l.delete(intValue);
                AbstractC11652i b = C6561ab.this.f16402j.mo15385b(intValue);
                if (b != null) {
                    b.mo14150x();
                }
            }
            C7572d.m15561a("MultiPlayerPrePullStream", "releaseFarawayPlayer index ".concat(String.valueOf(currentItem)));
        }

        /* renamed from: b */
        private AbstractC2719c m14064b(int i) {
            AbstractC11652i b;
            if (i < 0 || i >= C6561ab.this.f16402j.getCount() || (b = C6561ab.this.f16402j.mo15385b(i)) == null) {
                return null;
            }
            return ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getIRoomPlayerManager().mo7297b(b.mo14151y());
        }

        /* renamed from: c */
        private void m14065c(int i) {
            StringBuilder sb = new StringBuilder("mute status: ");
            for (int i2 = 0; i2 < this.f16437l.size(); i2++) {
                int keyAt = this.f16437l.keyAt(i2);
                AbstractC2719c b = m14064b(keyAt);
                if (b != null) {
                    if (keyAt == i) {
                        b.setMute(false);
                        sb.append("[").append(keyAt).append("] ");
                    } else {
                        b.setMute(true);
                        sb.append(keyAt).append(" ");
                    }
                }
            }
            C7572d.m15561a("MultiPlayerPrePullStream", sb.toString());
        }

        /* renamed from: a */
        private void m14060a(int i) {
            if (i >= 0 && i < C6561ab.this.f16402j.getCount()) {
                AbstractC11652i b = C6561ab.this.f16402j.mo15385b(i);
                Collection<AbstractC11652i> values = C6561ab.this.f16402j.f22692e.values();
                if (values != null) {
                    for (AbstractC11652i iVar : values) {
                        if (!(iVar == null || iVar == b)) {
                            iVar.mo14150x();
                            iVar.mo14152z();
                        }
                    }
                }
                m14061a(i, true);
                AbstractC2719c b2 = m14064b(i);
                if (b2 != null) {
                    b2.setMute(false);
                }
                AbstractC2722e iRoomPlayerManager = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getIRoomPlayerManager();
                C6561ab.this.getContext();
                iRoomPlayerManager.mo7298b(b2);
                this.f16437l.clear();
                this.f16437l.put(i, true);
                C7572d.m15561a("MultiPlayerPrePullStream", "releaseAllUselessPlayer index ".concat(String.valueOf(i)));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            C10085b value;
            C10085b value2;
            C7572d.m15561a("LiveRoomFragment", "onPageScrollStateChanged invoked, state is ".concat(String.valueOf(i)));
            if (i == 0) {
                if (C6561ab.this.f16410r && this.f16432g != 1) {
                    C7572d.m15561a("MultiPlayerPrePullStream", "onPageScrollStateChanged -> curScrollState != LiveVerticalViewPager.SCROLL_STATE_DRAGGING");
                    m14060a(C6561ab.this.f16399g.getCurrentItem());
                }
                C6201f.m13458a();
                C6201f.m13459b();
                AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("watch_slide");
                if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
                    value2.mo16951b();
                }
            } else if (i == 1) {
                C11118c.m19750a(C11118c.EnumC11119a.LIVE_SLIDE);
                C6201f.m13460c();
                AbstractC89244h<C10085b> hVar2 = C10095g.f24528b.get("watch_slide");
                if (!(hVar2 == null || (value = hVar2.getValue()) == null)) {
                    value.mo16948a();
                }
                C10095g.m18640h();
                C10095g.f24529c = "";
            }
            this.f16432g = i;
            if (i == 1) {
                this.f16436k = C6561ab.this.f16399g.getCurrentItem();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            Object instantiateItem;
            AbstractC11652i b = C6561ab.this.f16402j.mo15385b(i);
            if (b != this.f16426a) {
                C7572d.m15561a("LiveRoomFragment", "selected position = " + i + "!!!!!!");
                C7421d a = C7421d.m15306a();
                if (a.f18405a) {
                    a.mo13625e();
                }
                C7421d a2 = C7421d.m15306a();
                if (a2.f18405a && a2.f18410f && !a2.f18411g) {
                    C6501b.C6502a.m13948a("livesdk_draw_guide_use").mo12639a().mo12655b();
                    a2.f18411g = true;
                }
                if (C6561ab.this.getContext() == null) {
                    C6555i.m14021b();
                    C6555i.m9464c("LiveRoomFragment", "onPageSelected getContext==null");
                    return;
                }
                C6499a a3 = C6499a.m13906a();
                LiveVerticalViewPager liveVerticalViewPager = C6561ab.this.f16399g;
                if (!(liveVerticalViewPager == null || i == -1)) {
                    JSONObject a4 = C6499a.m13910a(a3.mo12638a(liveVerticalViewPager, "ViewPage#onPageSelected()"));
                    C6499a.m13913a(a4, "position", i);
                    C6499a.m13914a(a4, "description", "room scroll change");
                    C6499a.f16154a.mo9218b(EnumC6500b.Page.info, a4);
                }
                this.f16427b = i;
                this.f16429d = i;
                if (this.f16426a != null) {
                    if (C6561ab.this.f16407o && !C6561ab.this.f16410r) {
                        this.f16426a.mo14120d();
                    }
                    C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("liveroom_slide_end_liveplay", 33030, EnumC11866b.BussinessApiCall));
                    ((IMessageService) C6193a.m13435a(IMessageService.class)).releaseMsgAlog(this.f16426a.mo14125i());
                }
                if (b != null) {
                    if (LiveDrawPreEnterRoom.INSTANCE.isEnable()) {
                        C7454r.C7455a.m15360a().mo13687a();
                        C7454r.C7455a.m15360a().mo13691b(b.mo14149w());
                    }
                    b.mo14148v();
                    b.mo14149w().f28233c.f28325af.f28388a = System.currentTimeMillis();
                    b.mo14149w().f28233c.f28296M = "draw";
                    b.mo14149w().f28233c.f28320aa = "inner_draw";
                    EnterRoomLinkSession.m20943a(b.mo14149w()).mo18994a(new Event("live_room_slide_start_enter_next", 259, EnumC11866b.BussinessApiCall));
                }
                if (C6561ab.this.f16410r) {
                    m14061a(i, true);
                    if (this.f16432g == 0) {
                        m14060a(C6561ab.this.f16399g.getCurrentItem());
                    } else {
                        m14059a();
                    }
                    m14065c(i);
                } else if (C6561ab.this.f16407o) {
                    if (!(this.f16430e == -1 || this.f16431f == null)) {
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).stopRoomPlayer(this.f16431f, false);
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(this.f16431f);
                    }
                    if (b != null) {
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_room_warm_up_player", 260, EnumC11866b.SdkInterfaceCall).mo19002a());
                        C6561ab.this.mo12694a(i);
                        EnterRoomConfig a5 = C6561ab.this.f16401i.mo14900a(i);
                        a5.f28233c.f28320aa = "inner_draw";
                        if (!a5.f28233c.f28335ap) {
                            C3854a.m9453a(3, "LiveRoomFragment_tag", "warmUp next room " + a5.f28233c.f28301R + " pull stream,");
                            m14062a(b, a5, ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).warmUp(a5.f28233c.f28301R, a5, C6561ab.this.getContext()));
                        }
                    }
                }
                if (this.f16432g == 0) {
                    mo12720a(i, b);
                    C6561ab.this.mo12715p();
                }
                if (!(i == this.f16436k || (instantiateItem = C6561ab.this.f16402j.instantiateItem((ViewGroup) C6561ab.this.f16399g, this.f16436k)) == null || !(instantiateItem instanceof C7822br))) {
                    C7822br brVar = (C7822br) instantiateItem;
                    boolean b2 = brVar.mo14116b(brVar.f19496d);
                    if (!brVar.f19417P && b2 && brVar.f19425X != null) {
                        C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12651a("click_icon", "draw").mo12661f("draw").mo12639a().mo12655b();
                    }
                    brVar.f19416O = false;
                    brVar.f19417P = false;
                }
                C3854a.m9453a(3, "LiveRoomFragment_tag", "onPageScrolled invoked, position: " + i + ",mLastPagerPosition:" + this.f16436k);
            }
        }

        C6565a(String str) {
            this.f16435j = str;
        }

        /* renamed from: a */
        private void m14061a(int i, boolean z) {
            AbstractC11652i b;
            C7572d.m15561a("MultiPlayerPrePullStream", "multiPlayerPrePullTargetFragment START (" + i + ")");
            if (C6561ab.this.f16402j != null) {
                int count = C6561ab.this.f16402j.getCount();
                if (i >= 0 && i < count && (b = C6561ab.this.f16402j.mo15385b(i)) != null) {
                    if (this.f16437l.get(i)) {
                        C7572d.m15561a("MultiPlayerPrePullStream", "mMultiPlayerPrePullStreamState --->  has pre pull, target position: (" + i + ")");
                        return;
                    }
                    this.f16437l.put(i, true);
                    AbstractC2719c b2 = m14064b(i);
                    if (b2 == null || !b2.isPlaying()) {
                        C7572d.m15561a("MultiPlayerPrePullStream", "multiPlayerPrePullTargetFragment start pull stream ~~~~~~~ (" + i + ")");
                        b.mo14149w().f28233c.f28320aa = "inner_draw";
                        b.mo14119c(z);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo12720a(int i, AbstractC11652i iVar) {
            C4017b.m9800b(C4017b.EnumC4018a.ScrollWatchLivePlay);
            if (!(C6561ab.this.mo12702c() == null || C6561ab.this.mo12702c().mo14149w() == null)) {
                C6561ab.this.mo12702c().mo14149w().f28233c.f28361q = "0";
            }
            C9294a.m17572a().f22727a = new C9286a(EnumC11628a.SLIDE.typeName);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f16426a != null) {
                if (C6561ab.this.f16410r) {
                    m14060a(i);
                } else if (C6561ab.this.f16407o) {
                    this.f16426a.mo14121e();
                } else {
                    C6555i.m14021b();
                    C6555i.m9463b("invite_issue_check", "LinkIn_Guest_doChangePage");
                    this.f16426a.mo14122f();
                }
                this.f16426a.mo14149w().f28233c.f28321ab = null;
                this.f16426a.mo14149w().f28233c.f28320aa = "inner_draw";
                if (C6561ab.f16390f) {
                    C6561ab.f16390f = false;
                }
            }
            if (iVar != null) {
                if (this.f16426a != null) {
                    iVar.mo14149w().f28233c.f28321ab = "draw";
                    iVar.mo14149w().f28233c.f28325af.f28388a = currentTimeMillis;
                    iVar.mo14149w().f28233c.f28320aa = "inner_draw";
                    if (this.f16426a.mo14149w() != null) {
                        iVar.mo14149w().f28233c.f28331al = this.f16426a.mo14149w().f28233c.f28332am;
                    }
                    Room a = C6561ab.this.mo12694a(i);
                    if (a != null && a.isFromRecommendCard) {
                        iVar.mo14149w().f28233c.f28309Z = "pop_card";
                    }
                }
                C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("liveroom_slide_start_liveplay", 256, EnumC11866b.BussinessApiCall));
                if (C6561ab.this.f16410r) {
                    m14060a(i);
                    ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11554c(iVar.mo14151y());
                }
                C7420c.m15300a(iVar.mo14149w(), i);
                iVar.mo14127k();
                if (this.f16426a != null) {
                    C6538d.m13977a("draw");
                    C6538d.m13975a();
                    if ((C6561ab.this.f16401i instanceof MultiRoomIdListProvider) || (C6561ab.this.f16401i instanceof MultiPlusFeedRoomListProvider)) {
                        String str = C6561ab.this.f16401i.mo14900a(i).f28232b.f28258b;
                        if (!C13627m.m24498a(C6561ab.this.f16401i.mo14900a(i).f28232b.f28258b)) {
                            iVar.mo14149w().f28232b.f28258b = str;
                        }
                        if (!TextUtils.isEmpty(C6561ab.this.f16401i.mo14900a(i).f28232b.f28257a)) {
                            iVar.mo14149w().f28232b.f28257a = C6561ab.this.f16401i.mo14900a(i).f28232b.f28257a;
                        }
                    }
                    if (C6561ab.f16389a != null) {
                        C6545f.m14007a("draw", iVar.mo14149w());
                    }
                    iVar.mo14149w().f28233c.f28307X = this.f16435j;
                    if (C6561ab.f16389a != null) {
                        C6561ab.f16389a.mo12681b(iVar.mo14149w());
                    }
                    if (C6561ab.this.f16401i instanceof C9288a) {
                        ((C9288a) C6561ab.this.f16401i).mo15391c(iVar.mo14149w().f28233c.f28301R);
                    }
                }
            } else {
                Event event = new Event("liveroom_selected_fragment_is_null", 33029, EnumC11866b.BussinessApiCall);
                event.mo19003a("newFragment is empty!");
                C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
            }
            this.f16426a = iVar;
            this.f16429d = -1;
            if (C6561ab.this.f16407o) {
                this.f16430e = -1;
                this.f16431f = null;
            }
            C6561ab.this.mo12707h();
            C6561ab.this.f16395b.refreshTimer();
        }

        /* renamed from: a */
        private void m14062a(AbstractC11652i iVar, EnterRoomConfig enterRoomConfig, AbstractC2719c cVar) {
            if (cVar != null) {
                this.f16431f = cVar.getPlayerTag();
                C6561ab.this.f16409q = cVar.getPlayerTag();
                if (enterRoomConfig != null) {
                    this.f16430e = enterRoomConfig.f28233c.f28301R;
                }
                iVar.mo14149w().f28233c.f28288E = this.f16431f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            int i3;
            int i4;
            int i5;
            if (C6561ab.this.f16410r) {
                C7572d.m15561a("MultiPlayerPrePullStream", "onPageScrolled -> position: " + i + ", positionOffset: " + f);
                int currentItem = C6561ab.this.f16399g.getCurrentItem();
                this.f16437l.put(currentItem, true);
                if (i == currentItem) {
                    int i6 = i + 1;
                    if (m14063a(i6, f, true)) {
                        m14061a(i6, false);
                        C7572d.m15561a("MultiPlayerPrePullStream", "onPageScrolled -> n+1 preload -->".concat(String.valueOf(i6)));
                    }
                } else if (i == currentItem - 1 && m14063a(i, f, false)) {
                    m14061a(i, false);
                    C7572d.m15561a("MultiPlayerPrePullStream", "onPageScrolled -> n-1 preload -->".concat(String.valueOf(i)));
                }
            }
            if (i == this.f16429d && f < 1.0E-10f) {
                AbstractC11652i b = C6561ab.this.f16402j.mo15385b(i);
                C7572d.m15561a("MultiPlayerPrePullStream", "onPageScrolled -> newFragment != activeFragment, pos=" + i + ", positionOffset < MAX_OFFSET");
                if (b != this.f16426a) {
                    mo12720a(i, b);
                    C6561ab.this.mo12715p();
                }
            } else if (C6561ab.this.f16407o && !C6561ab.this.f16410r && (i4 = this.f16429d) != -1 && i != i4 && f < 1.0E-10f) {
                C7572d.m15561a("LiveRoomFragment", "The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
                Room a = C6561ab.this.mo12694a(i);
                if (!(a == null || this.f16430e == -1 || a.getId() == this.f16430e)) {
                    if (this.f16431f != null) {
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).stopRoomPlayer(this.f16431f, false);
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(this.f16431f);
                        this.f16431f = null;
                    }
                    this.f16430e = -1;
                }
                mo12720a(i, C6561ab.this.f16402j.mo15385b(i));
            } else if (C6561ab.this.f16410r && (i3 = this.f16429d) != -1 && i != i3 && f < 1.0E-10f) {
                C7572d.m15561a("MultiPlayerPrePullStream", "multi-player!! The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
                Room a2 = C6561ab.this.mo12694a(i);
                if (!(a2 == null || this.f16430e == -1 || a2.getId() == this.f16430e)) {
                    if (this.f16431f != null) {
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).stopRoomPlayer(this.f16431f, false);
                        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(this.f16431f);
                        this.f16431f = null;
                    }
                    this.f16430e = -1;
                }
            }
            if (i == this.f16429d && f < 1.0E-10f && (i5 = this.f16434i) >= 0 && i != i5) {
                if (i < i5) {
                    this.f16433h = 0;
                } else {
                    this.f16433h++;
                }
                this.f16434i = i;
                if (this.f16433h > 15) {
                    this.f16434i = -1;
                }
            }
        }

        /* renamed from: a */
        private boolean m14063a(int i, float f, boolean z) {
            int count = C6561ab.this.f16402j.getCount();
            if (i >= 0 && i < count) {
                if (C6561ab.this.f16402j.mo15385b(i) == null) {
                    C7572d.m15561a("MultiPlayerPrePullStream", "canPrePullStream -> targetFragment == null, ".concat(String.valueOf(i)));
                    return false;
                } else if (this.f16437l.get(i)) {
                    C7572d.m15561a("MultiPlayerPrePullStream", "canPrePullStream -> already prePullStream position == ".concat(String.valueOf(i)));
                    return false;
                } else if (z) {
                    if (f > 0.05f) {
                        return true;
                    }
                    return false;
                } else if (f < 0.95f) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o */
    public final String mo12714o() {
        if (!(this.f16399g == null || this.f16401i == null)) {
            if (C11725f.f28051c == null) {
                C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
            }
            if (!(!C11725f.f28051c.booleanValue() || mo12702c() == null || mo12702c().mo14086A() == null)) {
                return this.f16401i.mo15376b(mo12702c().mo14086A().getId());
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onPause() {
        int currentItem;
        if (getActivity() != null && getActivity().isFinishing() && (this.f16401i instanceof AbstractC11774m) && (currentItem = this.f16399g.getCurrentItem()) >= 0 && currentItem < this.f16401i.mo14898a()) {
            this.f16401i.mo14900a(currentItem);
        }
        super.onPause();
        C7411d a = C7411d.m15284a();
        ActivityC0945e activity = getActivity();
        if (activity != null && activity.hashCode() == a.f18375c && activity.isFinishing()) {
            a.f18373a = false;
            a.f18374b = null;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        super.onDestroy();
        C3940j.m9594a().removeCallbacksAndMessages(null);
        C10095g.m18641i();
        C6201f.m13460c();
        C7711b.C7712a.m15759a("live_room_ctr").f19176a.clear();
        C6684c.C6686b.m14211a().f16587e = true;
        ((IMessageService) C6193a.m13435a(IMessageService.class)).releaseAll();
        ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).release();
        C7421d.m15306a().mo13622b();
        ActivityC0945e activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            C7334b.m15233a().remove(Integer.valueOf(activity.hashCode()));
        }
        C3854a.m9453a(3, "LiveBackRoomStack", "destroyBackRoomStack for " + activity + ", remaining cnt: " + C7334b.m15233a().size());
        ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).removeInteractStateChangeListener(this.f16393C);
        AbstractC11768h hVar = this.f16401i;
        if (hVar instanceof C9288a) {
            ((C9288a) hVar).mo15392e();
        }
        if (C7334b.f18205a.mo13571a(getActivity()).mo13567a() == null && !this.f16391A) {
            C2695a.f8059g.mo7221d();
        }
        if (this.f16391A || getActivity() == null || getActivity().getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.INITIALIZED)) {
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                activity2.getLifecycle().mo4012a(new LiveRoomFragment$$Lambda$4(this, activity2));
            }
        } else {
            mo12705f();
            if (this.f16406n.mo18714b() == this.f16401i) {
                this.f16406n.mo18713a();
            }
            C7349a.f18227a = null;
        }
        if (this.f16415w) {
            this.f16415w = false;
        } else {
            DataChannelGlobal.f42558d.mo28327c(C9009ac.class);
        }
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11550a(((IHostContext) C6193a.m13435a(IHostContext.class)).context());
        LiveWidgetProvider.getInstance().clear();
        LivePerformanceManager.getInstance().onModuleStop("stream");
        LivePerformanceManager.getInstance().reportBatteryDrainage();
        LivePerformanceManager.getInstance().onExitRoom();
        LivePerformanceManager.getInstance().stopTimerMonitor();
        LivePerformanceManager.getInstance().release();
        EnterRoomLinkSession a = C11870f.C11871a.f28404a.mo19010a();
        if (MtPlayerInvokeStopBeforePlaySetting.INSTANCE.getValue()) {
            str = this.f16409q;
        } else {
            str = a.f28391b.f28233c.f28288E;
        }
        AbstractC5777j jVar = this.f16405m;
        if (jVar != null) {
            jVar.mo11540d();
            if (str != null) {
                C7572d.m15561a("LiveRoomFragment", "onDestroy -> stop Play. playerTag:".concat(String.valueOf(str)));
                this.f16405m.mo11531a(true, str);
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).stopRoomPlayer(str, false);
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).recycleRoomPlayer(str);
            }
            this.f16405m.mo12932p();
        }
        if (this.f16414v > 0) {
            this.f16414v = 0;
        }
        if ((getActivity() instanceof AbstractC11618d) && !this.f16391A) {
            getActivity();
        }
        if (this.f16398e != null) {
            C7341a.m15241a();
            C7341a.f18212c = null;
            this.f16398e = null;
        }
        C6565a aVar = this.f16404l;
        if (aVar != null) {
            aVar.f16426a = null;
            this.f16404l = null;
            this.f16403k = null;
        }
        DataChannelGlobal.f42558d.mo28327c(C6522b.class);
        DataChannelGlobal.f42558d.mo28327c(C6532j.class);
        C88411a aVar2 = this.f16418z;
        if (aVar2 != null && !aVar2.isDisposed()) {
            this.f16418z.dispose();
            this.f16418z = null;
        }
    }

    /* renamed from: a */
    public final Room mo12694a(int i) {
        return this.f16401i.mo14904c(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        C7345b bVar;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f16413u = z;
        mo12710k();
        if (getActivity() != null && (bVar = this.f16398e) != null) {
            bVar.mo13577a(configuration.orientation);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: a */
    public final void mo12699a(boolean z) {
        this.f16394D = z;
        mo12710k();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: a */
    public final void mo12696a(RoomStatus roomStatus) {
        AbstractC11768h hVar = this.f16401i;
        if (hVar instanceof C9282g) {
            C89219l.m154721d(roomStatus, "");
            HashMap hashMap = new HashMap();
            hashMap.put("roomId", String.valueOf(roomStatus.f8703a));
            hashMap.put("anchorId", String.valueOf(roomStatus.f8704b));
            hashMap.put("countOfWatchUsers", String.valueOf(roomStatus.f8706d));
            hashMap.put("isFinish", String.valueOf(roomStatus.f8705c));
            AbstractC11769i iVar = ((C9282g) hVar).f22684c;
            if (iVar != null) {
                iVar.mo18719a(hashMap);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: a */
    public final void mo12697a(EnterRoomConfig enterRoomConfig) {
        if (C7349a.m15251a() && getActivity() != null && this.f16399g != null && this.f16401i != null && mo12702c() != null) {
            mo12702c();
            if (mo12702c().mo14149w() != null) {
                EnterRoomConfig w = mo12702c().mo14149w();
                if (!(w == null || w.f28233c.f28291H == null || w.f28233c.f28291H.length <= 0)) {
                    w.f28233c.f28305V = this.f16399g.getCurrentItem();
                }
                if (mo12702c().mo14086A() != null) {
                    StackContext stackContext = new StackContext();
                    stackContext.setActivityHashCode(getActivity().hashCode());
                    C7334b.f18205a.mo13571a(getActivity()).mo13568a(w, enterRoomConfig, stackContext);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h
    /* renamed from: a */
    public final void mo12698a(String str) {
        AbstractC11652i c = mo12702c();
        if (c != null) {
            EnumC11662p g = c.mo14123g();
            if (g == EnumC11662p.LIVE_STARTED || g == EnumC11662p.DETACHED) {
                C11870f.C11871a.f28404a.mo19010a();
                if (f16389a != null) {
                    C6545f.m14005a(c.mo14149w());
                }
                C6538d.m13977a(str);
                if (g == EnumC11662p.LIVE_STARTED) {
                    return;
                }
            }
            if (this.f16417y) {
                this.f16417y = false;
                m14032t();
            } else if (TextUtils.equals(str, "click")) {
                c.mo14127k();
            } else {
                C6565a aVar = this.f16404l;
                if (aVar != null) {
                    aVar.mo12720a(aVar.f16427b, c);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        LiveEnableALogSetting.INSTANCE.update();
        C6204h.f15479b = LivePlayFluencyOptSettingV2.INSTANCE.enable();
        int i = 0;
        C6204h.f15478a = false;
        C2690b.m7787a((int) R.layout.b8o);
        C6201f.m13458a();
        C6201f.m13459b();
        C11118c.m19750a(C11118c.EnumC11119a.ENTER_LIVE_ROOM);
        C6560m.f16387j = false;
        EnumC9592k.AUDIENCE.config();
        C6684c.C6686b.m14211a().f16587e = false;
        String a = m14028a();
        if (LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isGuideEnable(a)) {
            C7421d a2 = C7421d.m15306a();
            a2.mo13622b();
            a2.f18405a = true;
            a2.f18412h = a;
            C6905bf a3 = C6905bf.m14776a();
            a3.mo13210e();
            a3.f17291a = true;
            C6905bf.m14776a().f17292b.observeForever(a2);
        }
        this.f16408p = System.currentTimeMillis();
        C4017b.m9800b(C4017b.EnumC4018a.StartLivePlay);
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        hashMap.put("location", "live detail after super oncreate");
        ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a("feed_enter_room", hashMap);
        this.f16392B = new C6739l();
        this.f16406n = C11772k.f28126a;
        this.f16409q = C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28288E;
        AbstractC5777j b = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayControllerManager().mo11553b(this.f16409q);
        this.f16405m = b;
        if (b != null) {
            b.mo11537c();
        }
        ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).registerInteractStateChangeListener(this.f16393C);
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getDnsOptimizer().mo11510a();
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLiveStreamStrategy().mo11556a();
        RoomListener roomListener = new RoomListener(this);
        this.f16396c = roomListener;
        if (roomListener.initRoomEnvironment()) {
            this.f16411s = new NetworkController();
            this.f16395b = new RoomStatusController(this);
            this.f16412t = new RoomTaskController();
            getLifecycle().mo4012a(this.f16411s);
            getLifecycle().mo4012a(this.f16395b);
            getLifecycle().mo4012a(this.f16412t);
            C7411d a4 = C7411d.m15284a();
            ActivityC0945e activity = getActivity();
            EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
            if (activity != null) {
                a4.f18373a = true;
                a4.f18374b = new C7411d.C7412a(enterRoomConfig);
                a4.f18375c = activity.hashCode();
                if (a4.f18376d == null) {
                    a4.f18376d = new LiveOntologyInfoManager$$Lambda$0(a4);
                    activity.getLifecycle().mo4012a(a4.f18376d);
                }
            }
            C88411a aVar = this.f16418z;
            if (aVar != null) {
                aVar.mo142945a(C6779a.m14563a().mo13052a(C9461f.class).mo143289d(new C6632ae(this)));
                this.f16418z.mo142945a(C6779a.m14563a().mo13052a(C7385d.class).mo143289d(new C6638af(this)));
            }
            if (!C7349a.m15251a()) {
                EnterRoomConfig enterRoomConfig2 = C11870f.C11871a.f28404a.mo19010a().f28391b;
                ValueAnimator valueAnimator = C7360a.f18246d;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.removeAllListeners();
                    valueAnimator.cancel();
                }
                C7360a.f18246d = null;
                C7360a.f18247e = null;
                C7360a.f18244b = false;
                C7360a.f18245c = 0;
                if (enterRoomConfig2 == null || (roomsData2 = enterRoomConfig2.f28233c) == null) {
                    z = false;
                } else {
                    z = roomsData2.f28326ag;
                }
                C7360a.f18244b = z;
                if (!(enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f28233c) == null)) {
                    i = roomsData.f28327ah;
                }
                C7360a.f18245c = i;
                if (i <= 0) {
                    C7360a.f18245c = C7360a.f18243a;
                }
            }
            if (!(getActivity() == null || getActivity().getRequestedOrientation() == 1 || bundle != null)) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.em6);
            }
            if (((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankOptOutPresenter() != null) {
                ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankOptOutPresenter().mo17118c();
            }
            C7711b.C7712a.m15759a("live_room_ctr").mo13989a(this, 1);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: a */
    public final boolean mo12700a(long j) {
        AbstractC11768h hVar = this.f16401i;
        if (hVar == null || hVar.mo14902b() == null || this.f16401i.mo14902b().size() <= 1) {
            return false;
        }
        for (Room room : this.f16401i.mo14902b()) {
            if (room != null && j == room.getId()) {
                this.f16401i.mo14901a(j);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        if (com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedInnerStyleSetting.INSTANCE.getValue() != 0) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
        if (com.bytedance.android.livesdk.live.model.LiveFeedDraw.isEnable(r5, r4) != false) goto L_0x01a6;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 1292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.C6561ab.onActivityCreated(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m14029a(int i, String str) {
        C6739l lVar = this.f16392B;
        if (lVar != null) {
            lVar.mo12946a(i, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        if (C6203g.m13470c()) {
            a = C1862a.m6032a(getContext(), R.layout.b8t, null, false);
        } else {
            a = C1764a.m5927a(layoutInflater, R.layout.b8t, viewGroup, false);
        }
        LiveVerticalViewPager liveVerticalViewPager = (LiveVerticalViewPager) a.findViewById(R.id.fgn);
        this.f16399g = liveVerticalViewPager;
        this.f16395b.setViewPager(liveVerticalViewPager);
        this.f16400h = (FrameLayout) a.findViewById(R.id.acf);
        EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
        if (this.f16400h != null) {
            if (enterRoomConfig == null || !enterRoomConfig.f28234d.f28237a) {
                this.f16400h.setBackgroundColor(getResources().getColor(R.color.k2));
            } else {
                this.f16400h.setBackgroundColor(0);
            }
        }
        if (C7349a.m15251a()) {
            this.f16397d = (ViewGroup) a.findViewById(R.id.pq);
            this.f16398e = new C7345b(getContext(), getLifecycle(), this.f16397d);
        }
        C7421d a2 = C7421d.m15306a();
        FrameLayout frameLayout = this.f16400h;
        if (a2.f18405a) {
            a2.f18409e = frameLayout;
        }
        return a;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i.AbstractC11654b
    /* renamed from: a */
    public final void mo12695a(long j, EnterRoomConfig enterRoomConfig, boolean z) {
        long j2;
        String str;
        long j3;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_room_jump_to_other", 258, EnumC11866b.BussinessApiCall));
        if (z && C7349a.m15251a()) {
            if (this.f16397d != null) {
                C7345b bVar = this.f16398e;
                String str2 = enterRoomConfig2.f28233c.f28343ax;
                C6501b a = C6501b.C6502a.m13948a("livesdk_return_last_click").mo12639a().mo12645a("layer_level", C7334b.f18205a.mo13571a(C3888a.m9505a(bVar.f18220e)).mo13570c());
                EnterRoomConfig enterRoomConfig3 = bVar.f18216a;
                if (enterRoomConfig3 == null || (roomsData2 = enterRoomConfig3.f28233c) == null) {
                    j2 = 0;
                } else {
                    j2 = roomsData2.f28301R;
                }
                C6501b a2 = a.mo12646a("to_room_id", j2);
                EnterRoomConfig enterRoomConfig4 = bVar.f18216a;
                if (enterRoomConfig4 == null || (roomsData = enterRoomConfig4.f28233c) == null || (str = roomsData.f28287D) == null) {
                    str = "0";
                }
                C6501b a3 = a2.mo12651a("to_anchor_id", str).mo12651a("return_type", str2);
                if (C7341a.f18210a > 0 || C7341a.f18213d <= 0) {
                    ValueAnimator valueAnimator = C7341a.f18211b;
                    if (valueAnimator != null) {
                        j3 = valueAnimator.getCurrentPlayTime();
                    } else {
                        j3 = 0;
                    }
                } else {
                    j3 = SystemClock.currentThreadTimeMillis() - C7341a.f18213d;
                }
                a3.mo12646a("process_duration", j3).mo12655b();
            }
            enterRoomConfig2 = C7334b.f18205a.mo13571a(getActivity()).mo13569b();
        }
        if (enterRoomConfig2 == null) {
            C7572d.m15561a("LiveRoomFragment", "jump2Other event is null");
            return;
        }
        enterRoomConfig2.f28233c.f28306W = "full_screen";
        enterRoomConfig2.f28233c.f28301R = j;
        this.f16391A = true;
        long j4 = enterRoomConfig2.f28233c.f28308Y;
        if (!(mo12702c() == null || mo12702c().mo14149w() == null)) {
            enterRoomConfig2.f28233c.f28307X = mo12702c().mo14149w().f28233c.f28307X;
            enterRoomConfig2.f28233c.f28298O = mo12702c().mo14149w().f28233c.f28298O;
            enterRoomConfig2.f28233c.f28284A = mo12702c().mo14149w().f28233c.f28284A;
            if (j4 == 0) {
                j4 = mo12702c().mo14149w().f28233c.f28301R;
            }
            enterRoomConfig2.f28233c.f28331al = mo12702c().mo14149w().f28233c.f28332am;
            if (!mo12702c().mo14149w().f28233c.f28345az || !z) {
                enterRoomConfig2.f28233c.f28312aB = 0;
            } else {
                C2695a aVar = C2695a.f8059g;
                if (!aVar.mo7216a().empty()) {
                    Long pop = aVar.mo7216a().pop();
                    C89219l.m154716b(pop, "");
                    pop.longValue();
                }
                enterRoomConfig2.f28233c.f28312aB = 1;
                enterRoomConfig2.f28233c.f28306W = "small_picture";
            }
        }
        long j5 = enterRoomConfig2.f28232b.f28277u;
        if (j5 > 0) {
            ((AbstractC11181z) ((PortalApi) C5805e.m12718a().mo11572a(PortalApi.class)).ping(j4, j5, PortalApi.EnumC7288a.JUMP_TO_ROOM).mo143274a(C11152e.m19789a((Fragment) this))).mo17950a(C6704ai.f16631a, C6759aj.f16794a);
        }
        enterRoomConfig2.f28233c.f28301R = j;
        C11870f.C11871a.f28404a.mo19012a(new EnterRoomLinkSession(enterRoomConfig2));
        ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(getContext(), enterRoomConfig2);
    }
}
