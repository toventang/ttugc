package com.bytedance.android.live.liveinteract.multiguest.p333g.p336c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5700c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.livesetting.linkmic.ShouldSyncClearLinkInRoomWindowSetting;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.p646a.C11122a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.c.b */
public final class C5259b extends AbstractC5258a implements C5167f.AbstractC5169a, C5235a.AbstractC5236a, C5695a.AbstractC5696a {

    /* renamed from: a */
    public Context f13589a;

    /* renamed from: b */
    FrameLayout f13590b;

    /* renamed from: c */
    public TextView f13591c;

    /* renamed from: d */
    public List<C5235a> f13592d = new ArrayList();

    /* renamed from: e */
    public C5153d f13593e;

    /* renamed from: f */
    public int f13594f;

    /* renamed from: g */
    int f13595g;

    /* renamed from: h */
    public Room f13596h;

    /* renamed from: i */
    public boolean f13597i;

    /* renamed from: j */
    public boolean f13598j;

    /* renamed from: k */
    public boolean f13599k = true;

    /* renamed from: l */
    public C5698a f13600l;

    /* renamed from: m */
    public DataChannel f13601m;

    /* renamed from: n */
    public boolean f13602n = false;

    /* renamed from: o */
    View.OnClickListener f13603o = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.View$OnClickListenerC52623 */

        static {
            Covode.recordClassIndex(5854);
        }

        public final void onClick(View view) {
            C5259b.this.mo11096g();
            if (C5259b.this.mo11095f() && C5259b.this.f13601m != null) {
                C5720o.m12575a("connection_request");
                C5259b.this.f13601m.mo28320c(C4441l.class, new C7399p(0));
            }
        }
    };

    /* renamed from: p */
    View.OnClickListener f13604p = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.View$OnClickListenerC52634 */

        static {
            Covode.recordClassIndex(5855);
        }

        public final void onClick(View view) {
            C5259b.this.mo11096g();
            C5703b.m12464a("connection_request", C5259b.this.f13596h.getOwner().getFollowInfo().getFollowStatus());
            if (!C5259b.this.mo11095f() || C5259b.this.f13598j || C4386c.m10499a().f17248n.intValue() != 0) {
                return;
            }
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(C5259b.this.f13589a, EnumC11229b.LINK_MIC);
            } else {
                C6670f.m14183a(C11279p.m20001a(C5259b.this.f13589a)).mo12816a(new AbstractC6656d() {
                    /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.View$OnClickListenerC52634.C52641 */

                    static {
                        Covode.recordClassIndex(5856);
                    }

                    @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                    /* renamed from: b */
                    public final void mo11014b(String... strArr) {
                        C11226ao.m19882a(C5259b.this.f13589a, (int) R.string.goo);
                    }

                    @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                    /* renamed from: a */
                    public final void mo11013a(String... strArr) {
                        if (C5259b.this.f13601m != null) {
                            C7399p pVar = new C7399p(1);
                            pVar.f18333b = DialogC5211a.EnumC5215a.SEND_REQUEST;
                            C5259b.this.f13601m.mo28320c(C4441l.class, pVar);
                        }
                    }
                }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
            }
        }
    };

    /* renamed from: q */
    private FrameLayout f13605q;

    /* renamed from: r */
    private C5235a f13606r;

    /* renamed from: s */
    private int f13607s;

    /* renamed from: t */
    private int f13608t;

    /* renamed from: u */
    private int f13609u;

    /* renamed from: v */
    private C5167f f13610v;

    /* renamed from: w */
    private C5695a f13611w;

    /* renamed from: x */
    private boolean f13612x = false;

    /* renamed from: y */
    private final C5153d.AbstractC5154a f13613y = new C5153d.AbstractC5154a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.C52601 */

        static {
            Covode.recordClassIndex(5852);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            if (!C5259b.this.f13599k) {
                List<C7666e> list = C5259b.this.f13593e.f13347b;
                ArrayList<C7666e> arrayList = new ArrayList();
                for (C7666e eVar : list) {
                    if (eVar.f19003e == 2) {
                        arrayList.add(eVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (C7666e eVar2 : arrayList) {
                    Iterator<C5235a> it = C5259b.this.f13592d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5235a next = it.next();
                        if (TextUtils.equals(eVar2.mo13898a(), next.getPresenter().mo10885c())) {
                            arrayList2.add(next);
                            C5259b.this.f13592d.remove(next);
                            break;
                        }
                    }
                }
                arrayList2.addAll(C5259b.this.f13592d);
                C5259b.this.f13592d = arrayList2;
                C5259b.this.mo11099j();
                C5259b.this.mo11100k();
            } else if (!TextUtils.isEmpty(C6894d.m14753a().f17259d)) {
                C5259b.this.f13602n = false;
                if (C5259b.this.f13600l != null) {
                    C5259b bVar = C5259b.this;
                    bVar.mo10544a(bVar.f13600l);
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10917a(long j, String str) {
            C5235a a;
            if (!C5259b.this.f13599k && C5259b.this.f13597i && (a = C5259b.this.mo11094a(j, str)) != null) {
                a.mo11020c();
                long id = C5259b.this.f13596h.getOwner().getId();
                if (a.getPresenter() != null && a.getPresenter().mo10888f() != null && a.getPresenter().mo10884b() != id && C11115u.m19743a().mo17915b().mo13161c() != C5259b.this.f13596h.getOwnerUserId()) {
                    C11226ao.m19883a(C5259b.this.f13589a, C5259b.this.f13589a.getString(R.string.goa, a.getPresenter().mo10888f().f19001c.getNickName()), 0);
                }
            }
        }
    };

    /* renamed from: z */
    private View.OnLayoutChangeListener f13614z = new View.OnLayoutChangeListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.View$OnLayoutChangeListenerC52612 */

        static {
            Covode.recordClassIndex(5853);
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C3854a.m9453a(4, AbstractC4444o.f12039a, "onLayoutChange");
            if (i4 != i8 && C5259b.this.f13600l != null) {
                C5259b bVar = C5259b.this;
                bVar.mo10544a(bVar.f13600l);
            }
        }
    };

    static {
        Covode.recordClassIndex(5851);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.AbstractC5169a
    /* renamed from: a */
    public final void mo10924a() {
        mo11100k();
    }

    /* renamed from: g */
    public final void mo11096g() {
        if (!this.f13598j) {
            C5713h.m12523b("connection_request");
            C5713h.f14480b = "connection_request";
        }
    }

    /* renamed from: k */
    public final void mo11100k() {
        this.f13590b.post(new RunnableC5270g(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo11097h() {
        C11122a.m19756a(this.f13591c).mo143301g(1, TimeUnit.SECONDS).mo143289d(new C5266c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11098i() {
        C11122a.m19756a(this.f13591c).mo143301g(1, TimeUnit.SECONDS).mo143289d(new C5267d(this));
    }

    /* renamed from: l */
    private void m11618l() {
        MethodCollector.m26663i(7248);
        for (C5235a aVar : this.f13592d) {
            if (ShouldSyncClearLinkInRoomWindowSetting.INSTANCE.getValue()) {
                this.f13590b.removeView(aVar);
            } else {
                this.f13590b.post(new RunnableC5269f(this, aVar));
            }
        }
        this.f13592d.clear();
        MethodCollector.m26664o(7248);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11082b() {
        MethodCollector.m26663i(6654);
        this.f13597i = false;
        this.f13590b.removeOnLayoutChangeListener(this.f13614z);
        this.f13610v.mo10923b();
        this.f13590b.removeAllViews();
        C6779a.m14563a().mo13053a(new C4419h(false));
        this.f13601m.mo28315b(C4437h.class, new C4419h(false));
        MethodCollector.m26664o(6654);
    }

    /* renamed from: j */
    public final void mo11099j() {
        int size = this.f13592d.size();
        for (int i = 0; i < size; i++) {
            C5235a aVar = this.f13592d.get(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = ((this.f13594f + this.f13608t) * i) + this.f13595g;
            layoutParams.rightMargin = this.f13609u;
            layoutParams.width = this.f13607s;
            layoutParams.height = this.f13608t;
            aVar.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: f */
    public final boolean mo11095f() {
        if (this.f13598j) {
            return true;
        }
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Context context = this.f13589a;
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.gof);
            a.f17235d = "interact";
            a.f17234c = 0;
            b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
            return false;
        } else if (C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.INTERACT)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11077a(DataChannel dataChannel) {
        this.f13601m = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11083b(String str) {
        this.f13613y.mo10917a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: d */
    public final void mo11089d(String str) {
        this.f13613y.mo10917a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11078a(String str) {
        if (this.f13599k && this.f13597i) {
            this.f13611w.mo11465b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: b */
    public final boolean mo10547b(int i) {
        if (!this.f13599k || i != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m11617b(C5235a aVar) {
        MethodCollector.m26663i(7099);
        this.f13590b.addView(aVar);
        this.f13592d.add(aVar);
        MethodCollector.m26664o(7099);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final void mo11087c(boolean z) {
        MethodCollector.m26663i(6794);
        if (z == this.f13599k) {
            MethodCollector.m26664o(6794);
            return;
        }
        this.f13599k = z;
        m11618l();
        FrameLayout frameLayout = this.f13605q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C6894d.m14753a().f17271r = null;
        }
        if (this.f13612x) {
            if (this.f13599k) {
                this.f13590b.setVisibility(4);
                MethodCollector.m26664o(6794);
                return;
            }
            this.f13590b.setVisibility(0);
        }
        MethodCollector.m26664o(6794);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a.AbstractC5236a
    /* renamed from: a */
    public final void mo11052a(C5235a aVar) {
        if (aVar == this.f13606r) {
            this.f13606r = null;
        }
        this.f13590b.post(new RunnableC5268e(this, aVar));
        this.f13592d.remove(aVar);
        mo11099j();
        mo11100k();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11084b(boolean z) {
        if (this.f13599k) {
            if (z) {
                this.f13612x = true;
                this.f13590b.setVisibility(4);
                return;
            }
            this.f13612x = false;
            this.f13590b.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final C5235a mo11085c(String str) {
        if (this.f13599k || !this.f13597i || TextUtils.isEmpty(str)) {
            return null;
        }
        C5235a a = mo11094a(0, str);
        boolean z = false;
        if (a != null) {
            mo11052a(a);
            z = true;
        }
        C5235a a2 = m11616a(str, true);
        if (a2 == null) {
            return null;
        }
        if (this.f13598j) {
            if (!z) {
                a2.f13545i = true;
            }
        } else if (TextUtils.equals(str, C6894d.m14753a().f17260e)) {
            if (!z) {
                a2.f13545i = true;
            }
            this.f13606r = a2;
        }
        m11617b(a2);
        this.f13613y.mo10915a();
        return a2;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: a */
    public final void mo10544a(C5698a aVar) {
        int i;
        int i2;
        C5235a a;
        if (this.f13599k && this.f13597i) {
            this.f13600l = aVar;
            C5736v.m12588a(2, C4139e.C4140a.f11575b.mo46674b(aVar));
            m11618l();
            List<C5700c> list = aVar.f14432e;
            C3854a.m9453a(4, "onSeiUpdatedTAG", "getLinkedGuestCountWithOutAnchor = " + this.f13593e.mo10911h());
            if (list == null || list.size() <= 0 || this.f13593e.mo10911h() <= 0) {
                mo11100k();
                return;
            }
            int width = this.f13590b.getWidth();
            int height = this.f13590b.getHeight();
            if (aVar.f14433f != null) {
                i = aVar.f14433f.f14436c;
            } else {
                i = 0;
            }
            if (aVar.f14433f != null) {
                i2 = aVar.f14433f.f14435b;
            } else {
                i2 = 0;
            }
            String str = C6894d.m14753a().f17259d;
            if (TextUtils.isEmpty(str)) {
                this.f13602n = true;
                return;
            }
            for (C5700c cVar : list) {
                if (!(cVar == null || TextUtils.equals(cVar.mo11466a(), str) || (a = m11616a(cVar.mo11466a(), false)) == null)) {
                    a.setLayoutParams(C5695a.m12434a(width, height, i, i2, cVar));
                    m11617b(a);
                }
            }
            mo11100k();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11080a(boolean z) {
        MethodCollector.m26663i(6491);
        C6779a.m14563a().mo13053a(new C4419h(true));
        this.f13601m.mo28315b(C4437h.class, new C4419h(true));
        this.f13599k = z;
        this.f13597i = true;
        TextView textView = (TextView) C1764a.m5927a(LayoutInflater.from(this.f13590b.getContext()), R.layout.be6, this.f13590b, false);
        this.f13591c = textView;
        textView.setVisibility(4);
        this.f13590b.addView(this.f13591c);
        this.f13593e.mo10902a(this.f13613y);
        this.f13610v.mo10922a();
        C5713h.m12512a("connection_request");
        mo11100k();
        this.f13590b.addOnLayoutChangeListener(this.f13614z);
        MethodCollector.m26664o(6491);
    }

    /* renamed from: a */
    private C5235a m11616a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C5235a aVar = new C5235a(this.f13589a, str, this.f13610v.mo10921a(str), this, this.f13601m);
        aVar.setCurrentUserIsLinkedGuest(!z);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a mo11094a(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> r0 = r5.f13592d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b.mo11094a(long, java.lang.String):com.bytedance.android.live.liveinteract.multiguest.g.b.a");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11079a(String str, SurfaceView surfaceView) {
        MethodCollector.m26663i(6948);
        if (this.f13599k || !this.f13597i) {
            MethodCollector.m26664o(6948);
        } else if (TextUtils.equals(str, C6894d.m14753a().f17259d)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f13605q.removeAllViews();
            this.f13605q.addView(surfaceView);
            this.f13605q.setVisibility(0);
            C6894d.m14753a().f17271r = surfaceView;
            MethodCollector.m26664o(6948);
        } else {
            C5235a a = mo11094a(0, str);
            if (a == null && (a = mo11085c(str)) == null) {
                MethodCollector.m26664o(6948);
                return;
            }
            if (TextUtils.equals(new StringBuilder().append(this.f13596h.getOwnerUserId()).toString(), new StringBuilder().append(a.getPresenter().mo10884b()).toString())) {
                C3868c.m9496a(new Throwable(), "Anchor attach to window exception, cur interactId:" + str + " anchorLinkMicId:" + C6894d.m14753a().f17259d);
            }
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f13607s, this.f13608t));
            surfaceView.setZOrderMediaOverlay(true);
            a.mo11017a(surfaceView);
            MethodCollector.m26664o(6948);
        }
    }

    public C5259b(Room room, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2, C5153d dVar) {
        this.f13589a = frameLayout2.getContext();
        this.f13596h = room;
        this.f13598j = z;
        this.f13590b = frameLayout2;
        this.f13605q = frameLayout;
        this.f13593e = dVar;
        this.f13611w = new C5695a(this);
        this.f13610v = new C5167f(room, dVar, this);
        Resources resources = this.f13589a.getResources();
        this.f13607s = resources.getDimensionPixelSize(R.dimen.wg);
        this.f13608t = resources.getDimensionPixelSize(R.dimen.wf);
        this.f13594f = (int) C13628n.m24520b(this.f13589a, 4.0f);
        this.f13595g = (int) C13628n.m24520b(this.f13589a, 52.0f);
        this.f13609u = (int) C13628n.m24520b(this.f13589a, 12.0f);
    }
}
