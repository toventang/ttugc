package com.bytedance.android.live.liveinteract.multilive.p362e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3933f;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.C4438i;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4418g;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5245b;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p349h.C5474f;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5601n;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5602o;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5699b;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5700c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e */
public final class C5636e extends AbstractC5258a implements C5167f.AbstractC5169a, C5235a.AbstractC5236a, C5695a.AbstractC5696a {

    /* renamed from: s */
    public static final C5637a f14319s = new C5637a((byte) 0);

    /* renamed from: A */
    private boolean f14320A;

    /* renamed from: B */
    private boolean f14321B;

    /* renamed from: C */
    private int f14322C = 1;

    /* renamed from: D */
    private final AbstractC89244h f14323D = C89250i.m154773a((AbstractC89171a) new C5640c(this));

    /* renamed from: E */
    private final C5153d.AbstractC5154a f14324E;

    /* renamed from: F */
    private final View.OnLayoutChangeListener f14325F;

    /* renamed from: a */
    public Context f14326a;

    /* renamed from: b */
    public final FrameLayout f14327b;

    /* renamed from: c */
    public TextView f14328c;

    /* renamed from: d */
    public List<C5235a> f14329d = new ArrayList();

    /* renamed from: e */
    public C5153d f14330e;

    /* renamed from: f */
    public final int f14331f;

    /* renamed from: g */
    public final int f14332g;

    /* renamed from: h */
    public Room f14333h;

    /* renamed from: i */
    public boolean f14334i;

    /* renamed from: j */
    public final boolean f14335j;

    /* renamed from: k */
    public boolean f14336k = true;

    /* renamed from: l */
    public C5698a f14337l;

    /* renamed from: m */
    public DataChannel f14338m;

    /* renamed from: n */
    public boolean f14339n;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: o */
    public C5271a f14340o;

    /* renamed from: p */
    public EnumC4422k f14341p;

    /* renamed from: q */
    final View.OnClickListener f14342q;

    /* renamed from: r */
    final View.OnClickListener f14343r;

    /* renamed from: t */
    private final FrameLayout f14344t;

    /* renamed from: u */
    private C5235a f14345u;

    /* renamed from: v */
    private final int f14346v;

    /* renamed from: w */
    private final int f14347w;

    /* renamed from: x */
    private final int f14348x;

    /* renamed from: y */
    private final C5167f f14349y;

    /* renamed from: z */
    private final C5695a f14350z;

    static {
        Covode.recordClassIndex(6233);
    }

    /* renamed from: a */
    private static boolean m12222a(int i) {
        return i == 11 || i == 12 || i == 13 || i == 14 || i == 15;
    }

    /* renamed from: i */
    private final C5474f m12223i() {
        return (C5474f) this.f14323D.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$a */
    public static final class C5637a {
        static {
            Covode.recordClassIndex(6234);
        }

        private C5637a() {
        }

        public /* synthetic */ C5637a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.AbstractC5169a
    /* renamed from: a */
    public final void mo10924a() {
        mo11423h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: e */
    public final int mo11091e() {
        return this.f14322C;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11080a(boolean z) {
        MethodCollector.m26663i(5246);
        C6779a a = C6779a.m14563a();
        C4419h hVar = new C4419h(true);
        C5271a aVar = this.f14340o;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        hVar.f12019b = aVar.f13637h;
        a.mo13053a(hVar);
        DataChannel dataChannel = this.f14338m;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C4419h hVar2 = new C4419h(true);
        C5271a aVar2 = this.f14340o;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        hVar2.f12019b = aVar2.f13637h;
        C89219l.m154716b(hVar2, "");
        dataChannel.mo28315b(C4437h.class, hVar2);
        this.f14336k = z;
        this.f14334i = true;
        View a2 = C1764a.m5927a(LayoutInflater.from(this.f14327b.getContext()), R.layout.be6, this.f14327b, false);
        if (a2 != null) {
            TextView textView = (TextView) a2;
            this.f14328c = textView;
            if (textView != null) {
                textView.setVisibility(4);
            }
            this.f14327b.addView(this.f14328c);
            C5153d dVar = this.f14330e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            dVar.mo10902a(this.f14324E);
            this.f14349y.mo10922a();
            C5713h.m12512a("connection_request");
            mo11423h();
            this.f14327b.addOnLayoutChangeListener(this.f14325F);
            C5474f i = m12223i();
            FrameLayout frameLayout = this.f14327b;
            C89219l.m154721d(frameLayout, "");
            i.f14044a = frameLayout;
            m12223i();
            MethodCollector.m26664o(5246);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.m26664o(5246);
        throw nullPointerException;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11078a(String str) {
        if (!this.f14321B && this.f14336k && this.f14334i) {
            if (this.f14350z.mo11464a(str) > InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.f14327b.getVisibility() == 0) {
                this.f14327b.setVisibility(4);
            }
            this.f14350z.mo11465b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: a */
    public final void mo10544a(C5698a aVar) {
        boolean z;
        int i;
        int i2;
        C89219l.m154721d(aVar, "");
        if (this.f14336k && this.f14334i) {
            EnumC4422k kVar = null;
            if (m12222a(aVar.f14429b)) {
                this.f14322C = aVar.f14429b;
                C5474f i3 = m12223i();
                C89219l.m154721d(aVar, "");
                i3.f14047d = aVar;
                AbstractC5622b bVar = i3.f14046c;
                if (bVar != null) {
                    bVar.mo11390a(aVar);
                }
                switch (aVar.f14429b) {
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        kVar = EnumC4422k.FLOATING;
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        kVar = EnumC4422k.FLOATING_FIX;
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        kVar = EnumC4422k.GRID;
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        kVar = EnumC4422k.GRID_FIX;
                        break;
                    default:
                        kVar = EnumC4422k.NORMAL;
                        break;
                }
                z = mo11081a(kVar);
            } else {
                z = false;
            }
            this.f14337l = aVar;
            String b = C4139e.C4140a.f11575b.mo46674b(aVar);
            C89219l.m154716b(b, "");
            C5736v.m12588a(2, b);
            List<C5700c> list = aVar.f14432e;
            m12224j();
            StringBuilder sb = new StringBuilder("getLinkedGuestCountWithOutAnchor = ");
            C5153d dVar = this.f14330e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            Logger.m24402i("onSeiUpdatedTAG", sb.append(dVar.mo10911h()).toString());
            if (list != null && list.size() > 0) {
                C5153d dVar2 = this.f14330e;
                if (dVar2 == null) {
                    C89219l.m154710a("mInfoCenter");
                }
                if (dVar2.mo10911h() > 0) {
                    int width = this.f14327b.getWidth();
                    int height = this.f14327b.getHeight();
                    if (aVar.f14433f != null) {
                        C5699b bVar2 = aVar.f14433f;
                        C89219l.m154716b(bVar2, "");
                        i = bVar2.f14436c;
                    } else {
                        i = 0;
                    }
                    if (aVar.f14433f != null) {
                        C5699b bVar3 = aVar.f14433f;
                        C89219l.m154716b(bVar3, "");
                        i2 = bVar3.f14435b;
                    } else {
                        i2 = 0;
                    }
                    C6894d a = C6894d.m14753a();
                    C89219l.m154716b(a, "");
                    String str = a.f17259d;
                    if (TextUtils.isEmpty(str)) {
                        this.f14339n = true;
                        return;
                    }
                    C5271a aVar2 = this.f14340o;
                    if (aVar2 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    aVar2.mo11111b().clear();
                    C5271a aVar3 = this.f14340o;
                    if (aVar3 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    aVar3.mo11108a().clear();
                    for (C5700c cVar : list) {
                        if (cVar != null) {
                            boolean equals = TextUtils.equals(cVar.mo11466a(), str);
                            C5271a aVar4 = this.f14340o;
                            if (aVar4 == null) {
                                C89219l.m154710a("mDataHolder");
                            }
                            HashMap<String, Boolean> b2 = aVar4.mo11111b();
                            String a2 = cVar.mo11466a();
                            C89219l.m154716b(a2, "");
                            b2.put(a2, Boolean.valueOf(cVar.f14451o));
                            C5271a aVar5 = this.f14340o;
                            if (aVar5 == null) {
                                C89219l.m154710a("mDataHolder");
                            }
                            HashMap<String, Boolean> a3 = aVar5.mo11108a();
                            String a4 = cVar.mo11466a();
                            C89219l.m154716b(a4, "");
                            a3.put(a4, Boolean.valueOf(cVar.f14452p));
                            if (!equals) {
                                String a5 = cVar.mo11466a();
                                C89219l.m154716b(a5, "");
                                C5245b a6 = m12216a(a5, false);
                                if (a6 != null) {
                                    a6.setLayoutParams(C5695a.m12434a(width, height, i, i2, cVar));
                                    m12219a(a6, cVar.f14450n);
                                }
                            } else {
                                m12220a(cVar);
                            }
                        }
                    }
                    mo11423h();
                    m12221a(z, kVar, list);
                    this.f14327b.setVisibility(0);
                    return;
                }
            }
            C89219l.m154716b(list, "");
            m12221a(z, kVar, list);
            mo11423h();
            if (list.size() == 1) {
                m12220a(list.get(0));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final boolean mo11081a(EnumC4422k kVar) {
        C89219l.m154721d(kVar, "");
        return m12223i().mo11290a(kVar);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11079a(String str, SurfaceView surfaceView) {
        MethodCollector.m26663i(5360);
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        if (this.f14336k || !this.f14334i) {
            MethodCollector.m26664o(5360);
            return;
        }
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        if (TextUtils.equals(str, a.f17259d)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = this.f14344t;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FrameLayout frameLayout2 = this.f14344t;
            if (frameLayout2 != null) {
                frameLayout2.addView(surfaceView);
            }
            FrameLayout frameLayout3 = this.f14344t;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            C6894d.m14753a().f17271r = surfaceView;
            MethodCollector.m26664o(5360);
            return;
        }
        C5235a a2 = mo11420a(0, str);
        if (a2 == null && (a2 = mo11085c(str)) == null) {
            MethodCollector.m26664o(5360);
            return;
        }
        Room room = this.f14333h;
        Long l = null;
        String valueOf = room != null ? String.valueOf(room.getOwnerUserId()) : null;
        C5137b.AbstractC5138a presenter = a2.getPresenter();
        if (presenter != null) {
            l = Long.valueOf(presenter.mo10884b());
        }
        if (TextUtils.equals(valueOf, String.valueOf(l.longValue()))) {
            StringBuilder append = new StringBuilder("Multi Live Anchor attach to window exception, cur interactId: ").append(str).append(", anchorLinkMicId:");
            C6894d a3 = C6894d.m14753a();
            C89219l.m154716b(a3, "");
            C3868c.m9496a(new Throwable(), append.append(a3.f17259d).toString());
        }
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f14346v, this.f14347w));
        surfaceView.setZOrderMediaOverlay(true);
        a2.mo11017a(surfaceView);
        MethodCollector.m26664o(5360);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a.AbstractC5236a
    /* renamed from: a */
    public final void mo11052a(C5235a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a(aVar, this.f14345u)) {
            this.f14345u = null;
        }
        m12223i().mo11287a((View) aVar);
        this.f14329d.remove(aVar);
        C5271a aVar2 = this.f14340o;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar2.f13636g = this.f14329d.size();
        mo11423h();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11076a(C5600m mVar) {
        EnumC4422k a;
        ArrayList<C5602o> arrayList;
        C89219l.m154721d(mVar, "");
        if (C89219l.m154714a((Object) mVar.f14237a, (Object) "onLayoutChange")) {
            C5601n nVar = mVar.f14238b;
            if (!(nVar == null || (arrayList = nVar.f14242b) == null)) {
                Iterator<C5602o> it = arrayList.iterator();
                while (it.hasNext()) {
                    C5602o next = it.next();
                    long a2 = C6898g.C6899a.f17285a.mo13195a(next.f14243a);
                    if (a2 > 0) {
                        C6898g gVar = C6898g.C6899a.f17285a;
                        gVar.mo13201b(a2);
                        gVar.f17284c.put(Long.valueOf((long) next.f14244b), Long.valueOf(a2));
                    }
                }
            }
            C5601n nVar2 = mVar.f14238b;
            if (!(nVar2 == null || (a = nVar2.mo11375a()) == null)) {
                m12223i().mo11290a(a);
            }
            C5601n nVar3 = mVar.f14238b;
            EnumC4422k a3 = nVar3 != null ? nVar3.mo11375a() : null;
            if (this.f14341p != a3) {
                this.f14341p = a3;
                if (a3 == EnumC4422k.NORMAL) {
                    C5586a.m12144c("connection_end");
                    C5586a.m12131a("other", a3);
                    return;
                }
                C5586a.m12144c("manual_setting_switch");
                C5586a.m12129a(C5586a.f14226b, "manual_setting_switch", null, 6);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$c */
    static final class C5640c extends AbstractC89220m implements AbstractC89171a<C5474f> {

        /* renamed from: a */
        final /* synthetic */ C5636e f14353a;

        static {
            Covode.recordClassIndex(6237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5640c(C5636e eVar) {
            super(0);
            this.f14353a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5474f invoke() {
            return new C5474f(C5636e.m12217a(this.f14353a));
        }
    }

    /* renamed from: g */
    public final void mo11422g() {
        if (!this.f14335j) {
            C5713h.m12523b("connection_request");
            C5713h.f14480b = "connection_request";
        }
    }

    /* renamed from: j */
    private final void m12224j() {
        for (C5235a aVar : this.f14329d) {
            m12223i().mo11287a((View) aVar);
        }
        this.f14329d.clear();
        C5271a aVar2 = this.f14340o;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar2.f13636g = 0;
    }

    /* renamed from: h */
    public final void mo11423h() {
        C5271a aVar = this.f14340o;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        if (aVar.f13637h) {
            TextView textView = this.f14328c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        this.f14327b.post(new RunnableC5644g(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11082b() {
        MethodCollector.m26663i(5329);
        this.f14334i = false;
        this.f14327b.removeOnLayoutChangeListener(this.f14325F);
        this.f14349y.mo10923b();
        this.f14327b.removeAllViews();
        C6779a a = C6779a.m14563a();
        C4419h hVar = new C4419h(false);
        hVar.f12019b = false;
        a.mo13053a(hVar);
        DataChannel dataChannel = this.f14338m;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C4419h hVar2 = new C4419h(false);
        hVar2.f12019b = false;
        C89219l.m154716b(hVar2, "");
        dataChannel.mo28315b(C4437h.class, hVar2);
        MethodCollector.m26664o(5329);
    }

    /* renamed from: f */
    public final boolean mo11421f() {
        if (this.f14335j) {
            return true;
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (!b.mo13165e()) {
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            Context context = this.f14326a;
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.gof);
            a.f17235d = "interact";
            a.f17234c = 0;
            b2.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
            return false;
        } else if (C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.INTERACT)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$f */
    public static final class C5643f extends C5153d.AbstractC5154a {

        /* renamed from: a */
        final /* synthetic */ C5636e f14356a;

        static {
            Covode.recordClassIndex(6240);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            if (this.f14356a.f14336k) {
                C6894d a = C6894d.m14753a();
                C89219l.m154716b(a, "");
                if (!TextUtils.isEmpty(a.f17259d)) {
                    this.f14356a.f14339n = false;
                    if (this.f14356a.f14337l != null) {
                        C5636e eVar = this.f14356a;
                        C5698a aVar = eVar.f14337l;
                        if (aVar == null) {
                            C89219l.m154715b();
                        }
                        eVar.mo10544a(aVar);
                        return;
                    }
                    return;
                }
                return;
            }
            C5153d dVar = this.f14356a.f14330e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            List<C7666e> list = dVar.f13347b;
            ArrayList<C7666e> arrayList = new ArrayList();
            for (C7666e eVar2 : list) {
                if (eVar2.f19003e == 2) {
                    arrayList.add(eVar2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C7666e eVar3 : arrayList) {
                Iterator<C5235a> it = this.f14356a.f14329d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5235a next = it.next();
                    if (TextUtils.equals(eVar3.mo13898a(), next.getPresenter().mo10885c())) {
                        arrayList2.add(next);
                        this.f14356a.f14329d.remove(next);
                        break;
                    }
                }
            }
            arrayList2.addAll(this.f14356a.f14329d);
            this.f14356a.f14329d = arrayList2;
            C5271a aVar2 = this.f14356a.f14340o;
            if (aVar2 == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar2.f13636g = this.f14356a.f14329d.size();
            this.f14356a.mo11423h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5643f(C5636e eVar) {
            this.f14356a = eVar;
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10917a(long j, String str) {
            C5235a a;
            C89219l.m154721d(str, "");
            if (!this.f14356a.f14336k && this.f14356a.f14334i && (a = this.f14356a.mo11420a(j, str)) != null) {
                a.mo11020c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$g */
    public static final class RunnableC5644g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5636e f14357a;

        static {
            Covode.recordClassIndex(6241);
        }

        RunnableC5644g(C5636e eVar) {
            this.f14357a = eVar;
        }

        public final void run() {
            final int i;
            Context context;
            Resources resources;
            Context context2;
            Resources resources2;
            final int size = this.f14357a.f14329d.size();
            int i2 = 0;
            float f = 2.14748365E9f;
            for (int i3 = 0; i3 < size; i3++) {
                C5235a aVar = this.f14357a.f14329d.get(i3);
                if (aVar != null && aVar.getY() < f) {
                    f = aVar.getY();
                }
            }
            if (2.14748365E9f == f || f < 10.0f) {
                i = this.f14357a.f14332g;
            } else {
                i = (int) (((this.f14357a.f14327b.getY() + ((float) this.f14357a.f14327b.getHeight())) - f) + ((float) this.f14357a.f14331f));
            }
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.f14357a.f14326a, EnumC11229b.LINK_MIC);
                TextView textView = this.f14357a.f14328c;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                C5736v.m12593b();
                if (size > 0) {
                    i2 = this.f14357a.f14331f;
                }
                C5636e.m12217a(this.f14357a).mo28315b(C4438i.class, new C4418g(size, i + i2));
                return;
            }
            C5636e eVar = this.f14357a;
            C5153d dVar = eVar.f14330e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            int f2 = dVar.mo10909f();
            ViewGroup.LayoutParams layoutParams = null;
            if (eVar.f14335j) {
                TextView textView2 = eVar.f14328c;
                String quantityString = (textView2 == null || (context2 = textView2.getContext()) == null || (resources2 = context2.getResources()) == null) ? null : resources2.getQuantityString(R.plurals.fl, f2, Integer.valueOf(f2));
                C3933f.m9582a(R.string.e3b, Integer.valueOf(f2));
                TextView textView3 = eVar.f14328c;
                if (textView3 != null) {
                    textView3.setText(quantityString);
                }
                TextView textView4 = eVar.f14328c;
                if (textView4 != null) {
                    textView4.setOnClickListener(eVar.f14342q);
                }
                TextView textView5 = eVar.f14328c;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            } else {
                C4386c a = C4386c.m10499a();
                C89219l.m154716b(a, "");
                T t = a.f17248n;
                if (t != null) {
                    if (t.intValue() == 0) {
                        TextView textView6 = eVar.f14328c;
                        if (textView6 != null) {
                            textView6.setText(R.string.dv0);
                        }
                        TextView textView7 = eVar.f14328c;
                        if (textView7 != null) {
                            textView7.setOnClickListener(eVar.f14343r);
                        }
                        TextView textView8 = eVar.f14328c;
                        if (textView8 != null) {
                            textView8.setVisibility(0);
                        }
                    } else if (t.intValue() == 2) {
                        TextView textView9 = eVar.f14328c;
                        if (textView9 != null) {
                            textView9.setText(R.string.dv0);
                        }
                        TextView textView10 = eVar.f14328c;
                        if (textView10 != null) {
                            textView10.setOnClickListener(eVar.f14343r);
                        }
                        TextView textView11 = eVar.f14328c;
                        if (textView11 != null) {
                            textView11.setVisibility(8);
                        }
                    }
                }
                TextView textView12 = eVar.f14328c;
                String quantityString2 = (textView12 == null || (context = textView12.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getQuantityString(R.plurals.fl, f2, Integer.valueOf(f2));
                TextView textView13 = eVar.f14328c;
                if (textView13 != null) {
                    textView13.setText(quantityString2);
                }
                TextView textView14 = eVar.f14328c;
                if (textView14 != null) {
                    textView14.setOnClickListener(eVar.f14342q);
                }
                TextView textView15 = eVar.f14328c;
                if (textView15 != null) {
                    textView15.setVisibility(0);
                }
            }
            TextView textView16 = eVar.f14328c;
            if (textView16 != null) {
                textView16.bringToFront();
            }
            TextView textView17 = this.f14357a.f14328c;
            if (textView17 != null) {
                layoutParams = textView17.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            TextView textView18 = this.f14357a.f14328c;
            if (textView18 != null) {
                textView18.setLayoutParams(layoutParams2);
            }
            TextView textView19 = this.f14357a.f14328c;
            if (textView19 != null) {
                textView19.post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.p362e.C5636e.RunnableC5644g.RunnableC56451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC5644g f14358a;

                    static {
                        Covode.recordClassIndex(6242);
                    }

                    {
                        this.f14358a = r1;
                    }

                    public final void run() {
                        TextView textView = this.f14358a.f14357a.f14328c;
                        int i = 0;
                        if (textView != null && textView.getVisibility() == 0) {
                            TextView textView2 = this.f14358a.f14357a.f14328c;
                            if (textView2 != null) {
                                i = textView2.getHeight();
                            }
                            i += this.f14358a.f14357a.f14331f;
                        } else if (size > 0) {
                            i = this.f14358a.f14357a.f14331f;
                        }
                        C5636e.m12217a(this.f14358a.f14357a).mo28315b(C4438i.class, new C4418g(size, i + i));
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11077a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14338m = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11084b(boolean z) {
        if (this.f14336k) {
            this.f14320A = z;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: d */
    public final void mo11090d(boolean z) {
        super.mo11090d(z);
        this.f14321B = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ DataChannel m12217a(C5636e eVar) {
        DataChannel dataChannel = eVar.f14338m;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11083b(String str) {
        C89219l.m154721d(str, "");
        this.f14324E.mo10917a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: d */
    public final void mo11089d(String str) {
        C89219l.m154721d(str, "");
        this.f14324E.mo10917a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: b */
    public final boolean mo10547b(int i) {
        this.f14322C = i;
        if (m12222a(i)) {
            return true;
        }
        if (!this.f14336k || i != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$e */
    static final class View$OnClickListenerC5642e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5636e f14355a;

        static {
            Covode.recordClassIndex(6239);
        }

        View$OnClickListenerC5642e(C5636e eVar) {
            this.f14355a = eVar;
        }

        public final void onClick(View view) {
            this.f14355a.mo11422g();
            if (this.f14355a.mo11421f()) {
                C5720o.m12575a("connection_request");
                C5636e.m12217a(this.f14355a).mo28320c(C4441l.class, new C7399p(0));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final void mo11087c(boolean z) {
        MethodCollector.m26663i(5331);
        this.f14336k = z;
        C5474f i = m12223i();
        i.f14048e = z;
        AbstractC5622b bVar = i.f14046c;
        if (bVar != null) {
            bVar.mo11258b(z);
        }
        m12224j();
        FrameLayout frameLayout = this.f14344t;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C6894d.m14753a().f17271r = null;
        }
        MethodCollector.m26664o(5331);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$b */
    static final class View$OnClickListenerC5638b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5636e f14351a;

        static {
            Covode.recordClassIndex(6235);
        }

        View$OnClickListenerC5638b(C5636e eVar) {
            this.f14351a = eVar;
        }

        public final void onClick(View view) {
            long j;
            User owner;
            FollowInfo followInfo;
            this.f14351a.mo11422g();
            Room room = this.f14351a.f14333h;
            if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                j = 0;
            } else {
                j = followInfo.getFollowStatus();
            }
            C5703b.m12464a("connection_request", j);
            if (this.f14351a.mo11421f() && !this.f14351a.f14335j) {
                C4386c a = C4386c.m10499a();
                C89219l.m154716b(a, "");
                T t = a.f17248n;
                if (t == null || t.intValue() != 0) {
                    return;
                }
                if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                    LiveAppBundleUtils.ensurePluginAvailable(this.f14351a.f14326a, EnumC11229b.LINK_MIC);
                } else {
                    C6670f.m14183a(C11279p.m20001a(this.f14351a.f14326a)).mo12816a(new AbstractC6656d(this) {
                        /* class com.bytedance.android.live.liveinteract.multilive.p362e.C5636e.View$OnClickListenerC5638b.C56391 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC5638b f14352a;

                        static {
                            Covode.recordClassIndex(6236);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f14352a = r1;
                        }

                        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                        /* renamed from: a */
                        public final void mo11013a(String... strArr) {
                            C89219l.m154721d(strArr, "");
                            C7399p pVar = new C7399p(1);
                            pVar.f18333b = DialogC5211a.EnumC5215a.SEND_REQUEST;
                            C5636e.m12217a(this.f14352a.f14351a).mo28320c(C4441l.class, pVar);
                        }

                        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                        /* renamed from: b */
                        public final void mo11014b(String... strArr) {
                            C89219l.m154721d(strArr, "");
                            C11226ao.m19882a(this.f14352a.f14351a.f14326a, (int) R.string.goo);
                        }
                    }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final C5235a mo11085c(String str) {
        C89219l.m154721d(str, "");
        if (this.f14336k || !this.f14334i || TextUtils.isEmpty(str)) {
            return null;
        }
        C5235a a = mo11420a(0, str);
        boolean z = false;
        if (a != null) {
            mo11052a(a);
            z = true;
        }
        C5245b a2 = m12216a(str, true);
        if (a2 == null) {
            return null;
        }
        if (!this.f14335j) {
            C6894d a3 = C6894d.m14753a();
            C89219l.m154716b(a3, "");
            if (TextUtils.equals(str, a3.f17260e)) {
                if (!z) {
                    a2.f13545i = true;
                }
                this.f14345u = a2;
            }
        } else if (!z) {
            a2.f13545i = true;
        }
        int c = (int) C6898g.C6899a.f17285a.mo13202c(C6898g.C6899a.f17285a.mo13195a(str));
        a2.setPosInMultiLive(c);
        m12219a(a2, c);
        this.f14324E.mo10915a();
        return a2;
    }

    /* renamed from: a */
    private final void m12220a(C5700c cVar) {
        if (cVar != null) {
            m12223i().mo11289a(!cVar.f14452p);
        }
    }

    /* renamed from: a */
    private final String m12218a(EnumC4422k kVar, List<C5700c> list) {
        if (kVar == EnumC4422k.NORMAL) {
            return "others";
        }
        if (this.f14329d.size() != 0 || list == null || list.size() <= 1) {
            return "manual_setting_switch";
        }
        return "connection_start";
    }

    /* renamed from: a */
    private final C5245b m12216a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C5137b.AbstractC5138a a = this.f14349y.mo10921a(str);
        Context context = this.f14326a;
        C89219l.m154716b(a, "");
        DataChannel dataChannel = this.f14338m;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C5245b bVar = new C5245b(context, str, a, this, dataChannel, m12223i().mo11291b());
        bVar.setCurrentUserIsLinkedGuest(!z);
        return bVar;
    }

    /* renamed from: a */
    private final void m12219a(C5235a aVar, int i) {
        m12223i().mo11288a(aVar, i);
        this.f14329d.add(aVar);
        C5271a aVar2 = this.f14340o;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar2.f13636g = this.f14329d.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a mo11420a(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> r0 = r5.f14329d
            java.util.Iterator r4 = r0.iterator()
        L_0x0006:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.multiguest.g.b.a r3 = (com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a) r3
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            long r1 = r0.mo10884b()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            return r3
        L_0x0025:
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            java.lang.String r0 = r0.mo10885c()
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.p362e.C5636e.mo11420a(long, java.lang.String):com.bytedance.android.live.liveinteract.multiguest.g.b.a");
    }

    /* renamed from: a */
    private final void m12221a(boolean z, EnumC4422k kVar, List<C5700c> list) {
        if (z) {
            String a = m12218a(kVar, list);
            C5586a.m12141b(a, null);
            C5586a.m12131a(a, kVar);
        }
    }

    public C5636e(Room room, FrameLayout frameLayout, FrameLayout frameLayout2, C5153d dVar) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(frameLayout2, "");
        C89219l.m154721d(dVar, "");
        Context context = frameLayout2.getContext();
        C89219l.m154716b(context, "");
        this.f14326a = context;
        C4431e.f12034a.mo10201a(this);
        this.f14324E = new C5643f(this);
        this.f14325F = new View$OnLayoutChangeListenerC5641d(this);
        this.f14342q = new View$OnClickListenerC5642e(this);
        this.f14343r = new View$OnClickListenerC5638b(this);
        this.f14333h = room;
        this.f14327b = frameLayout2;
        this.f14344t = frameLayout;
        this.f14330e = dVar;
        this.f14350z = new C5695a(this);
        this.f14349y = new C5167f(room, dVar, this);
        Resources resources = this.f14326a.getResources();
        this.f14346v = resources.getDimensionPixelSize(R.dimen.wg);
        this.f14347w = resources.getDimensionPixelSize(R.dimen.wf);
        this.f14331f = (int) C13628n.m24520b(this.f14326a, 4.0f);
        this.f14332g = (int) C13628n.m24520b(this.f14326a, 52.0f);
        this.f14348x = (int) C13628n.m24520b(this.f14326a, 12.0f);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.e$d */
    static final class View$OnLayoutChangeListenerC5641d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C5636e f14354a;

        static {
            Covode.recordClassIndex(6238);
        }

        View$OnLayoutChangeListenerC5641d(C5636e eVar) {
            this.f14354a = eVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 != i8 && this.f14354a.f14337l != null) {
                C5636e eVar = this.f14354a;
                C5698a aVar = eVar.f14337l;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                eVar.mo10544a(aVar);
            }
        }
    }
}
