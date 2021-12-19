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
import com.bytedance.android.live.core.p218f.C3933f;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.C4438i;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.p261b.C4418g;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5245b;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5484c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p355f.C5523e;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5691j;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
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
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c */
public final class C5624c extends AbstractC5258a implements C5167f.AbstractC5169a, C5235a.AbstractC5236a, C5695a.AbstractC5696a {

    /* renamed from: l */
    public static final C5625a f14278l = new C5625a((byte) 0);

    /* renamed from: a */
    public final Context f14279a;

    /* renamed from: b */
    public TextView f14280b;

    /* renamed from: c */
    public List<C5235a> f14281c = new ArrayList();

    /* renamed from: d */
    public C5153d f14282d;

    /* renamed from: e */
    public final int f14283e;

    /* renamed from: f */
    public final int f14284f;

    /* renamed from: g */
    public boolean f14285g;

    /* renamed from: h */
    public DataChannel f14286h;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: i */
    public C5271a f14287i;

    /* renamed from: j */
    final View.OnClickListener f14288j;

    /* renamed from: k */
    public final FrameLayout f14289k;

    /* renamed from: m */
    private final FrameLayout f14290m;

    /* renamed from: n */
    private C5235a f14291n;

    /* renamed from: o */
    private final int f14292o;

    /* renamed from: p */
    private final int f14293p;

    /* renamed from: q */
    private final int f14294q;

    /* renamed from: r */
    private final C5167f f14295r;

    /* renamed from: s */
    private Room f14296s;

    /* renamed from: t */
    private boolean f14297t;

    /* renamed from: u */
    private List<C7666e> f14298u = new ArrayList();

    /* renamed from: v */
    private List<C7666e> f14299v = new ArrayList();

    /* renamed from: w */
    private final AbstractC89244h f14300w;

    /* renamed from: x */
    private final C5153d.AbstractC5154a f14301x;

    static {
        Covode.recordClassIndex(6221);
    }

    /* renamed from: g */
    private final C5523e m12187g() {
        return (C5523e) this.f14300w.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: a */
    public final void mo10544a(C5698a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11078a(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: b */
    public final boolean mo10547b(int i) {
        return i == 1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$a */
    public static final class C5625a {
        static {
            Covode.recordClassIndex(6222);
        }

        private C5625a() {
        }

        public /* synthetic */ C5625a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5167f.AbstractC5169a
    /* renamed from: a */
    public final void mo10924a() {
        mo11406f();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$b */
    static final class C5626b extends AbstractC89220m implements AbstractC89171a<C5523e> {

        /* renamed from: a */
        final /* synthetic */ C5624c f14302a;

        static {
            Covode.recordClassIndex(6223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5626b(C5624c cVar) {
            super(0);
            this.f14302a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5523e invoke() {
            return new C5523e(C5624c.m12186a(this.f14302a));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final void mo11086c() {
        super.mo11086c();
        m12187g().mo11312a(EnumC4422k.NORMAL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: d */
    public final void mo11088d() {
        this.f14299v.clear();
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28315b(C5691j.class, Integer.valueOf(this.f14299v.size()));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11082b() {
        MethodCollector.m26663i(7779);
        this.f14285g = false;
        this.f14295r.mo10923b();
        this.f14289k.removeAllViews();
        C6779a a = C6779a.m14563a();
        C4419h hVar = new C4419h(false);
        hVar.f12019b = false;
        a.mo13053a(hVar);
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C4419h hVar2 = new C4419h(false);
        hVar2.f12019b = false;
        C89219l.m154716b(hVar2, "");
        dataChannel.mo28315b(C4437h.class, hVar2);
        MethodCollector.m26664o(7779);
    }

    /* renamed from: f */
    public final void mo11406f() {
        C5271a aVar = this.f14287i;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        if (aVar.f13637h) {
            TextView textView = this.f14280b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            m12188h();
            return;
        }
        this.f14289k.post(new RunnableC5629e(this));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$d */
    public static final class C5628d extends C5153d.AbstractC5154a {

        /* renamed from: a */
        final /* synthetic */ C5624c f14304a;

        static {
            Covode.recordClassIndex(6225);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            List<C7666e> list;
            C5153d dVar = this.f14304a.f14282d;
            if (dVar == null || (list = dVar.f13347b) == null) {
                list = new ArrayList();
            }
            ArrayList<C7666e> arrayList = new ArrayList();
            for (C7666e eVar : list) {
                if (eVar.f19003e == 2) {
                    arrayList.add(eVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C7666e eVar2 : arrayList) {
                Iterator<C5235a> it = this.f14304a.f14281c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5235a next = it.next();
                    if (TextUtils.equals(eVar2.mo13898a(), next.getPresenter().mo10885c())) {
                        arrayList2.add(next);
                        this.f14304a.f14281c.remove(next);
                        break;
                    }
                }
            }
            arrayList2.addAll(this.f14304a.f14281c);
            this.f14304a.f14281c = arrayList2;
            C5271a aVar = this.f14304a.f14287i;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar.f13636g = this.f14304a.f14281c.size();
            this.f14304a.mo11406f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5628d(C5624c cVar) {
            this.f14304a = cVar;
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10917a(long j, String str) {
            C5235a a;
            C89219l.m154721d(str, "");
            if (this.f14304a.f14285g && (a = this.f14304a.mo11405a(j, str)) != null) {
                a.mo11020c();
            }
        }
    }

    /* renamed from: h */
    private final void m12188h() {
        List<C7666e> list;
        C5153d dVar = this.f14282d;
        if (dVar != null) {
            List<C7666e> i = dVar.mo10912i();
            ArrayList arrayList = new ArrayList();
            for (T t : i) {
                if (!this.f14298u.contains(t)) {
                    arrayList.add(t);
                }
            }
            this.f14299v.addAll(arrayList);
        }
        List<C7666e> list2 = this.f14298u;
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : list2) {
            C5153d dVar2 = this.f14282d;
            if (dVar2 == null || (list = dVar2.mo10912i()) == null) {
                list = C89086z.INSTANCE;
            }
            if (!list.contains(t2)) {
                arrayList2.add(t2);
            }
        }
        this.f14299v.removeAll(arrayList2);
        this.f14298u.clear();
        C5153d dVar3 = this.f14282d;
        if (dVar3 != null) {
            this.f14298u.addAll(dVar3.mo10912i());
        }
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28315b(C5691j.class, Integer.valueOf(this.f14299v.size()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$e */
    public static final class RunnableC5629e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5624c f14305a;

        static {
            Covode.recordClassIndex(6226);
        }

        RunnableC5629e(C5624c cVar) {
            this.f14305a = cVar;
        }

        public final void run() {
            final int i;
            int i2;
            ViewGroup.LayoutParams layoutParams;
            final int size = this.f14305a.f14281c.size();
            int i3 = 0;
            float f = 2.14748365E9f;
            for (int i4 = 0; i4 < size; i4++) {
                C5235a aVar = this.f14305a.f14281c.get(i4);
                if (aVar != null && aVar.getY() < f) {
                    f = aVar.getY();
                }
            }
            if (2.14748365E9f == f || f < 10.0f) {
                i = this.f14305a.f14284f;
            } else {
                i = (int) (((this.f14305a.f14289k.getY() + ((float) this.f14305a.f14289k.getHeight())) - f) + ((float) this.f14305a.f14283e));
            }
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.f14305a.f14279a, EnumC11229b.LINK_MIC);
                TextView textView = this.f14305a.f14280b;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                C5736v.m12593b();
                if (size > 0) {
                    i3 = this.f14305a.f14283e;
                }
                C5624c.m12186a(this.f14305a).mo28315b(C4438i.class, new C4418g(size, i + i3));
                return;
            }
            C5624c cVar = this.f14305a;
            C5153d dVar = cVar.f14282d;
            if (dVar != null) {
                i2 = dVar.mo10909f();
            } else {
                i2 = 0;
            }
            TextView textView2 = cVar.f14280b;
            if (textView2 == null) {
                C89219l.m154715b();
            }
            Context context = textView2.getContext();
            C89219l.m154716b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.fl, i2, Integer.valueOf(i2));
            C89219l.m154716b(quantityString, "");
            C3933f.m9582a(R.string.e3b, Integer.valueOf(i2));
            TextView textView3 = cVar.f14280b;
            if (textView3 == null) {
                C89219l.m154715b();
            }
            textView3.setText(quantityString);
            TextView textView4 = cVar.f14280b;
            if (textView4 == null) {
                C89219l.m154715b();
            }
            textView4.setOnClickListener(cVar.f14288j);
            TextView textView5 = cVar.f14280b;
            if (textView5 == null) {
                C89219l.m154715b();
            }
            textView5.setVisibility(0);
            TextView textView6 = this.f14305a.f14280b;
            if (textView6 != null) {
                layoutParams = textView6.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            TextView textView7 = this.f14305a.f14280b;
            if (textView7 != null) {
                textView7.setLayoutParams(layoutParams2);
            }
            TextView textView8 = this.f14305a.f14280b;
            if (textView8 != null) {
                textView8.post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.p362e.C5624c.RunnableC5629e.RunnableC56301 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC5629e f14306a;

                    static {
                        Covode.recordClassIndex(6227);
                    }

                    {
                        this.f14306a = r1;
                    }

                    public final void run() {
                        int i;
                        TextView textView = this.f14306a.f14305a.f14280b;
                        if (textView != null && textView.getVisibility() == 0) {
                            TextView textView2 = this.f14306a.f14305a.f14280b;
                            if (textView2 == null) {
                                C89219l.m154715b();
                            }
                            i = textView2.getHeight() + this.f14306a.f14305a.f14283e;
                        } else if (size > 0) {
                            i = this.f14306a.f14305a.f14283e;
                        } else {
                            i = 0;
                        }
                        C5624c.m12186a(this.f14306a.f14305a).mo28315b(C4438i.class, new C4418g(size, i + i));
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11084b(boolean z) {
        this.f14297t = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ DataChannel m12186a(C5624c cVar) {
        DataChannel dataChannel = cVar.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: b */
    public final void mo11083b(String str) {
        C89219l.m154721d(str, "");
        this.f14301x.mo10917a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: d */
    public final void mo11089d(String str) {
        C89219l.m154721d(str, "");
        this.f14301x.mo10917a(0, str);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.c$c */
    static final class View$OnClickListenerC5627c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5624c f14303a;

        static {
            Covode.recordClassIndex(6224);
        }

        View$OnClickListenerC5627c(C5624c cVar) {
            this.f14303a = cVar;
        }

        public final void onClick(View view) {
            if (C5624c.m12186a(this.f14303a) != null) {
                C5720o.m12575a("connection_request");
                C5624c.m12186a(this.f14303a).mo28320c(C4441l.class, new C7399p(0));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11077a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14286h = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: e */
    public final int mo11092e(String str) {
        C89219l.m154721d(str, "");
        C5235a a = mo11405a(0, str);
        if (a != null) {
            return a.getPosInMultiLive();
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: f */
    public final int mo11093f(String str) {
        C89219l.m154721d(str, "");
        C5523e g = m12187g();
        C89219l.m154721d(str, "");
        int i = 0;
        for (T t : g.mo11310a()) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if ((t2 instanceof C5235a) && C89219l.m154714a((Object) t2.getInteractId(), (Object) str)) {
                return i2;
            }
            i = i2;
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a.AbstractC5236a
    /* renamed from: a */
    public final void mo11052a(C5235a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a(aVar, this.f14291n)) {
            this.f14291n = null;
        }
        m12187g().mo11311a(aVar);
        this.f14281c.remove(aVar);
        C5271a aVar2 = this.f14287i;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar2.f13636g = this.f14281c.size();
        mo11406f();
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        dataChannel.mo28319c(C5484c.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: c */
    public final C5235a mo11085c(String str) {
        boolean z;
        int i;
        C89219l.m154721d(str, "");
        if (!this.f14285g || TextUtils.isEmpty(str)) {
            return null;
        }
        C5235a a = mo11405a(0, str);
        if (a != null) {
            mo11052a(a);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C5137b.AbstractC5138a a2 = this.f14295r.mo10921a(str);
        Context context = this.f14279a;
        C89219l.m154716b(a2, "");
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C5245b bVar = new C5245b(context, str, a2, this, dataChannel, m12187g().mo11313b());
        bVar.setCurrentUserIsLinkedGuest(false);
        if (!z) {
            bVar.f13545i = true;
        }
        int b = C6898g.C6899a.f17285a.mo13200b(str);
        C5523e g = m12187g();
        C89219l.m154721d(bVar, "");
        C5271a aVar = g.f14107c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        C7676a aVar2 = aVar.f13638i;
        int i2 = -1;
        if (aVar2 != null) {
            i = aVar2.f19019a;
        } else {
            i = -1;
        }
        C5271a aVar3 = g.f14107c;
        if (aVar3 == null) {
            C89219l.m154710a("mDataHolder");
        }
        C7676a aVar4 = aVar3.f13638i;
        if (aVar4 != null) {
            i2 = aVar4.f19020b;
        }
        g.mo11312a(C5517c.m12022a(i, i2));
        AbstractC5622b bVar2 = g.f14106b;
        if (bVar2 != null) {
            bVar.setPosInMultiLive(bVar2.mo11260a(bVar, b));
            g.mo11310a().add(bVar);
        }
        this.f14281c.add(bVar);
        C5271a aVar5 = this.f14287i;
        if (aVar5 == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar5.f13636g = this.f14281c.size();
        this.f14301x.mo10915a();
        return bVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11080a(boolean z) {
        MethodCollector.m26663i(7611);
        C6779a a = C6779a.m14563a();
        C4419h hVar = new C4419h(true);
        C5271a aVar = this.f14287i;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        hVar.f12019b = aVar.f13637h;
        a.mo13053a(hVar);
        DataChannel dataChannel = this.f14286h;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C4419h hVar2 = new C4419h(true);
        C5271a aVar2 = this.f14287i;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        hVar2.f12019b = aVar2.f13637h;
        C89219l.m154716b(hVar2, "");
        dataChannel.mo28315b(C4437h.class, hVar2);
        this.f14285g = true;
        View a2 = C1764a.m5927a(LayoutInflater.from(this.f14289k.getContext()), R.layout.be6, this.f14289k, false);
        if (a2 != null) {
            TextView textView = (TextView) a2;
            this.f14280b = textView;
            if (textView == null) {
                C89219l.m154715b();
            }
            textView.setVisibility(4);
            this.f14289k.addView(this.f14280b);
            C5153d dVar = this.f14282d;
            if (dVar != null) {
                dVar.mo10902a(this.f14301x);
            }
            this.f14295r.mo10922a();
            C5713h.m12512a("connection_request");
            mo11406f();
            C5523e g = m12187g();
            FrameLayout frameLayout = this.f14289k;
            C89219l.m154721d(frameLayout, "");
            g.f14105a = frameLayout;
            m12187g();
            MethodCollector.m26664o(7611);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.m26664o(7611);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a mo11405a(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> r0 = r5.f14281c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.p362e.C5624c.mo11405a(long, java.lang.String):com.bytedance.android.live.liveinteract.multiguest.g.b.a");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a
    /* renamed from: a */
    public final void mo11079a(String str, SurfaceView surfaceView) {
        MethodCollector.m26663i(7920);
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        if (!this.f14285g) {
            MethodCollector.m26664o(7920);
            return;
        }
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        if (TextUtils.equals(str, a.f17259d)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout = this.f14290m;
            if (frameLayout == null) {
                C89219l.m154715b();
            }
            frameLayout.removeAllViews();
            this.f14290m.addView(surfaceView);
            this.f14290m.setVisibility(0);
            C6894d.m14753a().f17271r = surfaceView;
            MethodCollector.m26664o(7920);
            return;
        }
        C5235a a2 = mo11405a(0, str);
        if (a2 == null && (a2 = mo11085c(str)) == null) {
            MethodCollector.m26664o(7920);
            return;
        }
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f14292o, this.f14293p));
        surfaceView.setZOrderMediaOverlay(true);
        a2.mo11017a(surfaceView);
        MethodCollector.m26664o(7920);
    }

    public C5624c(Room room, FrameLayout frameLayout, C5153d dVar) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(dVar, "");
        this.f14289k = frameLayout;
        Context context = frameLayout.getContext();
        C89219l.m154716b(context, "");
        this.f14279a = context;
        C4431e.f12034a.mo10201a(this);
        this.f14300w = C89250i.m154773a((AbstractC89171a) new C5626b(this));
        this.f14301x = new C5628d(this);
        this.f14288j = new View$OnClickListenerC5627c(this);
        this.f14296s = room;
        this.f14290m = null;
        this.f14282d = dVar;
        this.f14295r = new C5167f(room, dVar, this);
        Resources resources = context.getResources();
        this.f14292o = resources.getDimensionPixelSize(R.dimen.wg);
        this.f14293p = resources.getDimensionPixelSize(R.dimen.wf);
        this.f14283e = (int) C13628n.m24520b(context, 4.0f);
        this.f14284f = (int) C13628n.m24520b(context, 52.0f);
        this.f14294q = (int) C13628n.m24520b(context, 12.0f);
    }
}
