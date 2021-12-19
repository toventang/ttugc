package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4487h;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4540aa;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p280a.C4632a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.RandomLinkMicMatchViewPager;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.f */
public final class C4667f extends AbstractC11293v implements AbstractC4487h.AbstractC4489b {

    /* renamed from: e */
    public static final C4668a f12342e = new C4668a((byte) 0);

    /* renamed from: a */
    public AbstractC4487h.AbstractC4488a f12343a;

    /* renamed from: b */
    public List<? extends ImageModel> f12344b = C89086z.INSTANCE;

    /* renamed from: c */
    public int f12345c = 2;

    /* renamed from: d */
    public C89378p<? extends C4502a.EnumC4510g, Long> f12346d;

    /* renamed from: f */
    private LiveTextView f12347f;

    /* renamed from: g */
    private final C4502a.AbstractC4503a f12348g = new C4669b(this);

    /* renamed from: h */
    private HashMap f12349h;

    static {
        Covode.recordClassIndex(5244);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f12349h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f12349h == null) {
            this.f12349h = new HashMap();
        }
        View view = (View) this.f12349h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f12349h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.f$a */
    public static final class C4668a {
        static {
            Covode.recordClassIndex(5245);
        }

        private C4668a() {
        }

        public /* synthetic */ C4668a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b71);
        bVar.f27020g = 80;
        bVar.f27019f = 0.0f;
        bVar.f27021h = -1;
        bVar.f27022i = -2;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC4487h.AbstractC4488a aVar = this.f12343a;
        if (aVar != null) {
            aVar.mo10274b();
        }
        C4502a.m10586b(this.f12348g);
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.f$b */
    public static final class C4669b extends C4502a.AbstractC4503a {

        /* renamed from: a */
        final /* synthetic */ C4667f f12350a;

        static {
            Covode.recordClassIndex(5246);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4669b(C4667f fVar) {
            this.f12350a = fVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: a */
        public final void mo10277a(C89378p<? extends C4502a.EnumC4510g, Long> pVar) {
            C89219l.m154721d(pVar, "");
            this.f12350a.mo10413a(pVar);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.f$c */
    static final class View$OnClickListenerC4670c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4667f f12351a;

        static {
            Covode.recordClassIndex(5247);
        }

        View$OnClickListenerC4670c(C4667f fVar) {
            this.f12351a = fVar;
        }

        public final void onClick(View view) {
            AbstractC4487h.AbstractC4488a aVar = this.f12351a.f12343a;
            if (aVar != null) {
                aVar.mo10272a();
            }
        }
    }

    /* renamed from: a */
    public final void mo10413a(C89378p<? extends C4502a.EnumC4510g, Long> pVar) {
        LiveTextView liveTextView = this.f12347f;
        if (liveTextView != null) {
            liveTextView.setText(C4540aa.C4541a.m10605a(pVar));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.f$d */
    static final class C4671d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4667f f12352a;

        /* renamed from: b */
        final /* synthetic */ RandomLinkMicMatchViewPager f12353b;

        static {
            Covode.recordClassIndex(5248);
        }

        C4671d(C4667f fVar, RandomLinkMicMatchViewPager randomLinkMicMatchViewPager) {
            this.f12352a = fVar;
            this.f12353b = randomLinkMicMatchViewPager;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f12352a.f12345c++;
            RandomLinkMicMatchViewPager randomLinkMicMatchViewPager = this.f12353b;
            C89219l.m154716b(randomLinkMicMatchViewPager, "");
            randomLinkMicMatchViewPager.setCurrentItem(this.f12352a.f12345c);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AbstractC88412b d;
        AbstractC4487h.AbstractC4488a aVar;
        List f;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f12346d == null) {
            dismiss();
        }
        C6501b.C6502a.m13948a("livesdk_cancel_connection_popup_show").mo12639a().mo12646a("waiting_time", C4502a.f12071c * 1000).mo12651a("enter_from", "connection_icon").mo12651a("invitee_list", C5737w.m12598a(EnumC4442m.RANDOM_LINK_MIC_INVITE)).mo12655b();
        C4540aa aaVar = new C4540aa(this.f27010p);
        C89219l.m154721d(this, "");
        aaVar.f12134a = this;
        this.f12343a = aaVar;
        this.f12347f = (LiveTextView) view.findViewById(R.id.f20);
        C89378p<? extends C4502a.EnumC4510g, Long> pVar = this.f12346d;
        if (pVar == null) {
            C89219l.m154715b();
        }
        mo10413a(pVar);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f1w);
        if (liveTextView != null) {
            liveTextView.setOnClickListener(new View$OnClickListenerC4670c(this));
        }
        C4502a.m10584a(this.f12348g);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        LayoutInflater from = LayoutInflater.from(getContext());
        C89219l.m154716b(from, "");
        C4632a aVar2 = new C4632a(context, from);
        RandomLinkMicMatchViewPager randomLinkMicMatchViewPager = (RandomLinkMicMatchViewPager) view.findViewById(R.id.fh6);
        randomLinkMicMatchViewPager.setClickable(false);
        randomLinkMicMatchViewPager.setPageMargin(-((int) (((float) C3966y.m9664c()) / 1.25f)));
        randomLinkMicMatchViewPager.setOffscreenPageLimit(2);
        C89219l.m154716b(randomLinkMicMatchViewPager, "");
        if (this.f12344b.size() >= 10) {
            z = true;
        } else {
            z = false;
        }
        randomLinkMicMatchViewPager.setPageTransformer(false, new C4632a.C4633a(randomLinkMicMatchViewPager, z));
        List<? extends ImageModel> list = this.f12344b;
        if (!(list == null || (f = C89070n.m154580f((Iterable) list)) == null)) {
            aVar2.f12284a.clear();
            aVar2.f12284a.addAll(f);
        }
        randomLinkMicMatchViewPager.setAdapter(aVar2);
        randomLinkMicMatchViewPager.setCurrentItem(this.f12345c);
        if (this.f12344b.size() >= 10 && (d = C11231b.m19899b(2300, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143289d(new C4671d(this, randomLinkMicMatchViewPager))) != null && (aVar = this.f12343a) != null) {
            aVar.mo10273a(d);
        }
    }
}
