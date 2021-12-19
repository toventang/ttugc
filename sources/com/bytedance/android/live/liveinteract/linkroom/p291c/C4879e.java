package com.bytedance.android.live.liveinteract.linkroom.p291c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.C4400an;
import com.bytedance.android.live.liveinteract.api.C4451u;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p288b.C4836a;
import com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5685d;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5691j;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5693l;
import com.bytedance.android.live.liveinteract.platform.common.p375f.C5701a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.chatroom.interact.model.C7608g;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e */
public final class C4879e implements AbstractC4867a {

    /* renamed from: o */
    public static final C4880a f12759o = new C4880a((byte) 0);

    /* renamed from: A */
    private final C4502a.AbstractC4503a f12760A = new C4889j(this);

    /* renamed from: B */
    private final AbstractC6897f<Integer> f12761B = new C4882c(this);

    /* renamed from: C */
    private final Runnable f12762C = new RunnableC4881b(this);

    /* renamed from: D */
    private final AbstractC4867a.AbstractC4869b f12763D;

    /* renamed from: E */
    private AbstractC1204m f12764E;

    /* renamed from: b */
    public View f12765b;

    /* renamed from: c */
    public boolean f12766c;

    /* renamed from: d */
    public DataChannel f12767d;

    /* renamed from: e */
    LiveTextView f12768e;

    /* renamed from: f */
    public LiveTextView f12769f;

    /* renamed from: g */
    public ImageView f12770g;

    /* renamed from: h */
    public VHeadView f12771h;

    /* renamed from: i */
    AbstractC88412b f12772i;

    /* renamed from: j */
    HSImageView f12773j;

    /* renamed from: k */
    public int f12774k;

    /* renamed from: l */
    public int f12775l;

    /* renamed from: m */
    boolean f12776m;

    /* renamed from: n */
    long f12777n;

    /* renamed from: p */
    private boolean f12778p;

    /* renamed from: q */
    private C5701a f12779q = new C5701a((byte) 0);

    /* renamed from: r */
    private boolean f12780r;

    /* renamed from: s */
    private boolean f12781s;

    /* renamed from: t */
    private Context f12782t;

    /* renamed from: u */
    private LottieAnimationView f12783u;

    /* renamed from: v */
    private HSAnimImageView f12784v;

    /* renamed from: w */
    private View f12785w;

    /* renamed from: x */
    private boolean f12786x;

    /* renamed from: y */
    private LiveAutoRtlTextView f12787y;

    /* renamed from: z */
    private ImageView f12788z;

    static {
        Covode.recordClassIndex(5461);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$a */
    public static final class C4880a {
        static {
            Covode.recordClassIndex(5462);
        }

        private C4880a() {
        }

        public /* synthetic */ C4880a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: b */
    public final boolean mo10602b() {
        return this.f12781s;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$b */
    static final class RunnableC4881b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4879e f12789a;

        static {
            Covode.recordClassIndex(5463);
        }

        RunnableC4881b(C4879e eVar) {
            this.f12789a = eVar;
        }

        public final void run() {
            C4097j.m9928a(this.f12789a.f12777n);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: a */
    public final boolean mo10600a() {
        return this.f12780r;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: c */
    public final void mo10603c() {
        if (this.f12781s || this.f12780r) {
            m11050e(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: d */
    public final void mo10605d() {
        View view = this.f12785w;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10622f() {
        View view = this.f12765b;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$j */
    public static final class C4889j extends C4502a.AbstractC4503a {

        /* renamed from: a */
        final /* synthetic */ C4879e f12797a;

        static {
            Covode.recordClassIndex(5471);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: a */
        public final void mo10276a() {
            String str;
            C4097j.m9928a(this.f12797a.f12777n);
            C4879e eVar = this.f12797a;
            C7608g.C7609a aVar = C4502a.f12083o;
            if (aVar == null || (str = aVar.f18892f) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            eVar.mo10620a(str, true);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: b */
        public final void mo10278b() {
            C4097j.m9928a(this.f12797a.f12777n);
            this.f12797a.mo10621e();
            LiveTextView liveTextView = this.f12797a.f12769f;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            ImageView imageView = this.f12797a.f12770g;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4889j(C4879e eVar) {
            this.f12797a = eVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: a */
        public final void mo10277a(C89378p<? extends C4502a.EnumC4510g, Long> pVar) {
            String str;
            long j;
            String str2;
            C89219l.m154721d(pVar, "");
            if (this.f12797a.f12775l == 1) {
                String str3 = null;
                long j2 = 16;
                if (pVar.getFirst() == C4502a.EnumC4510g.COUNTDOWN_WAITING) {
                    ImageView imageView = this.f12797a.f12770g;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LiveTextView liveTextView = this.f12797a.f12769f;
                    if (liveTextView != null) {
                        liveTextView.setVisibility(0);
                    }
                    C7608g.C7609a aVar = C4502a.f12083o;
                    if (aVar != null) {
                        j2 = (long) aVar.f18887a;
                    }
                    C7608g.C7609a aVar2 = C4502a.f12083o;
                    if (aVar2 != null) {
                        j = (long) (aVar2.f18887a - aVar2.f18889c);
                    } else {
                        j = 12;
                    }
                    long longValue = pVar.getSecond().longValue();
                    if (longValue == j2) {
                        C4879e eVar = this.f12797a;
                        List<? extends ImageModel> list = C4502a.f12082n;
                        if (list != null && list.size() >= 5) {
                            C89233z.C89236c cVar = new C89233z.C89236c();
                            cVar.element = 0;
                            eVar.f12772i = C11231b.m19896a(2300, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143289d(new C4890k(eVar, C4502a.f12082n, cVar));
                        }
                    } else if (longValue == j && C4502a.m10589e()) {
                        C7608g.C7609a aVar3 = C4502a.f12083o;
                        if (aVar3 != null) {
                            str3 = aVar3.f18890d;
                        }
                        if (C4879e.m11048a(str3)) {
                            C4097j.m9928a(this.f12797a.f12777n);
                            C4879e eVar2 = this.f12797a;
                            C7608g.C7609a aVar4 = C4502a.f12083o;
                            if (aVar4 == null || (str2 = aVar4.f18890d) == null) {
                                str2 = "";
                            }
                            C89219l.m154716b(str2, "");
                            eVar2.mo10620a(str2, false);
                        }
                    }
                    LiveTextView liveTextView2 = this.f12797a.f12769f;
                    if (liveTextView2 != null) {
                        liveTextView2.setText(String.valueOf(pVar.getSecond().longValue()));
                    }
                } else if (pVar.getFirst() == C4502a.EnumC4510g.TIMEOUT_WAITING) {
                    LiveTextView liveTextView3 = this.f12797a.f12769f;
                    if (liveTextView3 != null) {
                        liveTextView3.setVisibility(8);
                    }
                    ImageView imageView2 = this.f12797a.f12770g;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    C7608g.C7609a aVar5 = C4502a.f12083o;
                    if (aVar5 != null) {
                        j2 = (long) aVar5.f18887a;
                    }
                    if (pVar.getSecond().longValue() == j2 + 1 && C4502a.m10589e()) {
                        C7608g.C7609a aVar6 = C4502a.f12083o;
                        if (aVar6 != null) {
                            str3 = aVar6.f18891e;
                        }
                        if (C4879e.m11048a(str3)) {
                            C4097j.m9928a(this.f12797a.f12777n);
                            C4879e eVar3 = this.f12797a;
                            C7608g.C7609a aVar7 = C4502a.f12083o;
                            if (aVar7 == null || (str = aVar7.f18891e) == null) {
                                str = "";
                            }
                            C89219l.m154716b(str, "");
                            eVar3.mo10620a(str, false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo10623g() {
        if (this.f12786x) {
            m11049b(2131234499);
        } else {
            m11049b(2131234498);
        }
    }

    /* renamed from: e */
    public final void mo10621e() {
        AbstractC88412b bVar = this.f12772i;
        if (bVar != null) {
            bVar.dispose();
        }
        VHeadView vHeadView = this.f12771h;
        if (vHeadView != null) {
            vHeadView.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$d */
    static final class C4883d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12791a;

        static {
            Covode.recordClassIndex(5465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4883d(C4879e eVar) {
            super(1);
            this.f12791a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f12791a.mo10605d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$e */
    static final class C4884e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12792a;

        static {
            Covode.recordClassIndex(5466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4884e(C4879e eVar) {
            super(1);
            this.f12792a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f12792a.mo10619a(0);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: b */
    public final void mo10601b(boolean z) {
        this.f12780r = z;
        this.f12779q.f14457e = Boolean.valueOf(z);
        m11050e(this.f12780r);
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        this.f12763D.mo10607i();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$c */
    static final class C4882c<T> implements AbstractC6897f {

        /* renamed from: a */
        final /* synthetic */ C4879e f12790a;

        static {
            Covode.recordClassIndex(5464);
        }

        C4882c(C4879e eVar) {
            this.f12790a = eVar;
        }

        @Override // com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f
        /* renamed from: a */
        public final /* synthetic */ void mo10559a(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f12790a.f12774k = num.intValue();
                this.f12790a.mo10605d();
                if (!this.f12790a.f12766c) {
                    this.f12790a.mo10623g();
                }
            }
        }
    }

    /* renamed from: e */
    private final void m11050e(boolean z) {
        if (z || this.f12781s || this.f12780r) {
            mo10599a(0, 17);
        } else {
            mo10599a(8, 17);
        }
    }

    /* renamed from: f */
    private final void m11051f(boolean z) {
        if (this.f12786x) {
            ImageView imageView = this.f12788z;
            if (imageView != null) {
                C11279p.m20008a(imageView, z);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.f12787y;
            if (liveAutoRtlTextView != null) {
                C11279p.m20008a(liveAutoRtlTextView, z);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: d */
    public final void mo10606d(boolean z) {
        if (z) {
            mo10599a(8, 17);
            C4097j.m9928a(this.f12777n);
        } else if (this.f12781s || this.f12780r) {
            mo10599a(0, 17);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$h */
    static final class C4887h extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12795a;

        static {
            Covode.recordClassIndex(5469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4887h(C4879e eVar) {
            super(1);
            this.f12795a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C4879e eVar = this.f12795a;
            if (!eVar.f12766c || intValue <= 0) {
                LiveTextView liveTextView = eVar.f12768e;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            } else {
                LiveTextView liveTextView2 = eVar.f12768e;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                LiveTextView liveTextView3 = eVar.f12768e;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$i */
    static final class C4888i extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12796a;

        static {
            Covode.recordClassIndex(5470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4888i(C4879e eVar) {
            super(1);
            this.f12796a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            String a;
            C89219l.m154721d(zVar, "");
            C4879e eVar = this.f12796a;
            if (eVar.mo10622f() && eVar.f12775l == 1 && C4836a.m10967a("anchor_linkmic_waiting_tips_shown") && !C4502a.m10583a() && (a = C3966y.m9657a((int) R.string.enx)) != null) {
                eVar.f12776m = true;
                eVar.mo10620a(a, false);
                C4836a.m10968b("anchor_linkmic_waiting_tips_shown");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$k */
    static final class C4890k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4879e f12798a;

        /* renamed from: b */
        final /* synthetic */ List f12799b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f12800c;

        static {
            Covode.recordClassIndex(5472);
        }

        C4890k(C4879e eVar, List list, C89233z.C89236c cVar) {
            this.f12798a = eVar;
            this.f12799b = list;
            this.f12800c = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = this.f12799b;
            if (list != null && list.size() >= 10) {
                this.f12800c.element++;
                VHeadView vHeadView = this.f12798a.f12771h;
                if (vHeadView != null) {
                    vHeadView.setVisibility(0);
                }
                VHeadView vHeadView2 = this.f12798a.f12771h;
                List list2 = this.f12799b;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                C3951p.m9621a(vHeadView2, (ImageModel) list2.get(this.f12800c.element % this.f12799b.size()));
            }
        }
    }

    /* renamed from: b */
    private void m11049b(int i) {
        if (this.f12786x) {
            HSAnimImageView hSAnimImageView = this.f12784v;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f12784v;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f12784v;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            m11051f(true);
            ImageView imageView = this.f12788z;
            if (imageView != null) {
                imageView.setImageResource(i);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.f12784v;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.f12784v;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.f12784v;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageResource(i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: c */
    public final void mo10604c(boolean z) {
        String str;
        if (this.f12781s != z) {
            this.f12781s = z;
            this.f12779q.f14456d = Boolean.valueOf(z);
            m11050e(this.f12781s);
            if (this.f12781s && mo10622f() && C4836a.m10967a("anchor_linkmic_tips_shown")) {
                Context context = this.f12782t;
                if (context == null || (str = context.getString(R.string.eec)) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                mo10620a(str, false);
                C4836a.m10968b("anchor_linkmic_tips_shown");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$f */
    static final class C4885f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12793a;

        static {
            Covode.recordClassIndex(5467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4885f(C4879e eVar) {
            super(1);
            this.f12793a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            ImageModel imageModel;
            int intValue = num.intValue();
            if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && intValue >= 0) {
                LiveTextView liveTextView = this.f12793a.f12769f;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
                LiveTextView liveTextView2 = this.f12793a.f12769f;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                C4879e eVar = this.f12793a;
                HSImageView hSImageView = eVar.f12773j;
                if (hSImageView != null) {
                    hSImageView.setVisibility(0);
                }
                HSImageView hSImageView2 = eVar.f12773j;
                User user = C4384b.C4385a.m10496a().f11930T;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                C7577g.m15570a(hSImageView2, imageModel, 2131234441);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.e$g */
    static final class C4886g extends AbstractC89220m implements AbstractC89172b<EnumC4440k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4879e f12794a;

        static {
            Covode.recordClassIndex(5468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4886g(C4879e eVar) {
            super(1);
            this.f12794a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.m10583a() == false) goto L_0x002f;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.android.live.liveinteract.api.EnumC4440k r5) {
            /*
                r4 = this;
                com.bytedance.android.live.liveinteract.api.k r5 = (com.bytedance.android.live.liveinteract.api.EnumC4440k) r5
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                com.bytedance.android.live.liveinteract.linkroom.c.e r3 = r4.f12794a
                int[] r1 = com.bytedance.android.live.liveinteract.linkroom.p291c.C4891f.f12801a
                int r0 = r5.ordinal()
                r2 = r1[r0]
                r1 = 1
                r0 = 2
                switch(r2) {
                    case 1: goto L_0x0029;
                    case 2: goto L_0x002f;
                    case 3: goto L_0x0018;
                    case 4: goto L_0x0018;
                    case 5: goto L_0x001e;
                    case 6: goto L_0x001e;
                    default: goto L_0x0016;
                }
            L_0x0016:
                int r1 = r3.f12775l
            L_0x0018:
                r3.mo10619a(r1)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x001e:
                boolean r0 = com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.m10585b()
                if (r0 != 0) goto L_0x0026
                r1 = 0
                goto L_0x0018
            L_0x0026:
                int r1 = r3.f12775l
                goto L_0x0018
            L_0x0029:
                boolean r0 = com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.m10583a()
                if (r0 != 0) goto L_0x0018
            L_0x002f:
                r1 = 2
                goto L_0x0018
                switch-data {1->0x0029, 2->0x002f, 3->0x0018, 4->0x0018, 5->0x001e, 6->0x001e, }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.p291c.C4879e.C4886g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static boolean m11048a(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer num2 = null;
        if (value != null) {
            num = Integer.valueOf(value.bubbleStrategy);
        } else {
            num = null;
        }
        if (num.intValue() == 0) {
            return false;
        }
        RandomLinkMicSetting value2 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.bubbleStrategy);
        }
        if (num2.intValue() == 1) {
            C6805b<Integer> bVar = AbstractC6804a.f16977bZ;
            C89219l.m154716b(bVar, "");
            Integer a = bVar.mo13066a();
            if (a != null && a.intValue() == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo10619a(int i) {
        HSAnimImageView hSAnimImageView;
        Context context;
        String string;
        if (this.f12775l != i) {
            this.f12775l = i;
            mo10605d();
            C4097j.m9928a(this.f12777n);
            int i2 = this.f12775l;
            if (i2 == 0) {
                LiveTextView liveTextView = this.f12769f;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
                HSImageView hSImageView = this.f12773j;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f12770g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                mo10621e();
                mo10623g();
            } else if (i2 == 1) {
                m11051f(false);
                if (!this.f12786x && (hSAnimImageView = this.f12784v) != null) {
                    hSAnimImageView.setBackgroundResource(R.drawable.bry);
                }
                HSAnimImageView hSAnimImageView2 = this.f12784v;
                if (hSAnimImageView2 != null) {
                    hSAnimImageView2.mo9389a(HSAnimImageView.f11029i.mo9399a("tiktok_live_interaction_resource", "ttlive_lottie_icon_time_countdown.webp"));
                }
                HSAnimImageView hSAnimImageView3 = this.f12784v;
                if (hSAnimImageView3 != null) {
                    hSAnimImageView3.mo9390a();
                }
            } else if (i2 == 2) {
                if (this.f12786x) {
                    m11049b(2131234497);
                } else {
                    m11049b(2131234496);
                }
                LiveTextView liveTextView2 = this.f12769f;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                HSImageView hSImageView2 = this.f12773j;
                if (hSImageView2 != null) {
                    hSImageView2.setVisibility(8);
                }
                ImageView imageView2 = this.f12770g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                mo10621e();
                if (mo10622f() && C4836a.m10967a("anchor_linkmic_disconnect_tips_shown") && (context = this.f12782t) != null && (string = context.getString(R.string.dwr)) != null) {
                    C89219l.m154716b(string, "");
                    mo10620a(string, false);
                    C4836a.m10968b("anchor_linkmic_disconnect_tips_shown");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10620a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                this.f12777n = C4097j.m9923a(this.f12765b, str, -1);
            } else {
                this.f12777n = C4097j.m9922a(this.f12765b, str);
            }
        }
    }

    public C4879e(AbstractC4867a.AbstractC4869b bVar, AbstractC1204m mVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        this.f12763D = bVar;
        this.f12764E = mVar;
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        dataChannel.mo28316b(this);
        C4386c.m10499a().mo13183b(this.f12761B);
        View view2 = this.f12765b;
        if (view2 != null) {
            view2.removeCallbacks(this.f12762C);
        }
        this.f12778p = false;
        mo10621e();
        C4502a.m10586b(this.f12760A);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a
    /* renamed from: a */
    public final void mo10599a(int i, int i2) {
        View view = this.f12765b;
        if (view != null) {
            if (i == 0) {
                boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC);
                C5702a.m12449a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                if (!isPluginAvailable) {
                    Context context = this.f12782t;
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    LiveAppBundleUtils.ensurePluginAvailable(context, EnumC11229b.LINK_MIC);
                    C5736v.m12587a();
                    if (this.f12779q.mo11467a()) {
                        C5736v.m12590a(3, (long) this.f12779q.mo11468b());
                        return;
                    }
                    return;
                }
                mo10605d();
                if (!this.f12766c) {
                    C5713h.m12512a("connection_button");
                } else if (!this.f12778p) {
                    this.f12778p = true;
                    C5713h.m12521a(true, false);
                }
            }
            if (!this.f12779q.f14453a && this.f12779q.mo11467a() && i == 0) {
                C5736v.m12594b(3, (long) this.f12779q.mo11468b());
                this.f12779q.f14453a = true;
            }
            view.setVisibility(i);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        boolean z;
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f12765b = view;
        this.f12782t = view.getContext();
        this.f12767d = dataChannel;
        Object b = dataChannel.mo28318b(C9119ed.class);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f12766c = ((Boolean) b).booleanValue();
        this.f12783u = (LottieAnimationView) view.findViewById(R.id.bru);
        this.f12768e = (LiveTextView) view.findViewById(R.id.ffw);
        this.f12784v = (HSAnimImageView) view.findViewById(R.id.bsh);
        this.f12770g = (ImageView) view.findViewById(R.id.byu);
        this.f12771h = (VHeadView) view.findViewById(R.id.byt);
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f12786x = z;
        if (z) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.ekj);
            this.f12787y = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(C3966y.m9657a((int) R.string.ebe));
            }
            this.f12788z = (ImageView) view.findViewById(R.id.ek8);
        }
        LottieAnimationView lottieAnimationView = this.f12783u;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        this.f12785w = view.findViewById(R.id.dh1);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.eun);
        liveTextView.setVisibility(8);
        this.f12769f = liveTextView;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.bsr);
        hSImageView.setVisibility(8);
        this.f12773j = hSImageView;
        mo10605d();
        mo10623g();
        C4386c.m10499a().mo13182a((AbstractC6897f) this.f12761B);
        dataChannel.mo28312a(this, C5693l.class, new C4883d(this)).mo28312a(this, C4451u.class, new C4884e(this)).mo28310a(C4500k.class, (AbstractC89172b) new C4885f(this)).mo28310a(C4400an.class, (AbstractC89172b) new C4886g(this)).mo28310a(C5691j.class, (AbstractC89172b) new C4887h(this)).mo28309a(this.f12764E, C5685d.class, (AbstractC89172b) new C4888i(this));
        this.f12778p = false;
        C4502a.m10584a(this.f12760A);
    }
}
