package com.bytedance.android.live.liveinteract.linkroom.p291c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
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
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p288b.C4836a;
import com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5685d;
import com.bytedance.android.live.liveinteract.platform.common.p375f.C5701a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.chatroom.interact.model.C7608g;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9114dz;
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

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c */
public final class C4871c implements AbstractView$OnClickListenerC5841f {

    /* renamed from: m */
    public static final C4872a f12732m = new C4872a((byte) 0);

    /* renamed from: a */
    public View f12733a;

    /* renamed from: b */
    Context f12734b;

    /* renamed from: c */
    HSAnimImageView f12735c;

    /* renamed from: d */
    public LiveTextView f12736d;

    /* renamed from: e */
    public ImageView f12737e;

    /* renamed from: f */
    public VHeadView f12738f;

    /* renamed from: g */
    HSImageView f12739g;

    /* renamed from: h */
    AbstractC88412b f12740h;

    /* renamed from: i */
    boolean f12741i;

    /* renamed from: j */
    public boolean f12742j;

    /* renamed from: k */
    public int f12743k;

    /* renamed from: l */
    long f12744l;

    /* renamed from: n */
    private LiveAutoRtlTextView f12745n;

    /* renamed from: o */
    private ImageView f12746o;

    /* renamed from: p */
    private final C4502a.AbstractC4503a f12747p = new C4876e(this);

    /* renamed from: q */
    private final AbstractC4867a.AbstractC4869b f12748q;

    /* renamed from: r */
    private final AbstractC1204m f12749r;

    /* renamed from: s */
    private final C5701a f12750s;

    static {
        Covode.recordClassIndex(5453);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$a */
    public static final class C4872a {
        static {
            Covode.recordClassIndex(5454);
        }

        private C4872a() {
        }

        public /* synthetic */ C4872a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10616b() {
        View view = this.f12733a;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$e */
    public static final class C4876e extends C4502a.AbstractC4503a {

        /* renamed from: a */
        final /* synthetic */ C4871c f12754a;

        static {
            Covode.recordClassIndex(5458);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: a */
        public final void mo10276a() {
            String str;
            C4097j.m9928a(this.f12754a.f12744l);
            C4871c cVar = this.f12754a;
            C7608g.C7609a aVar = C4502a.f12083o;
            if (aVar == null || (str = aVar.f18892f) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            cVar.mo10613a(str, true);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: b */
        public final void mo10278b() {
            C4097j.m9928a(this.f12754a.f12744l);
            this.f12754a.mo10611a();
            LiveTextView liveTextView = this.f12754a.f12736d;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            ImageView imageView = this.f12754a.f12737e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4876e(C4871c cVar) {
            this.f12754a = cVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.AbstractC4503a
        /* renamed from: a */
        public final void mo10277a(C89378p<? extends C4502a.EnumC4510g, Long> pVar) {
            String str;
            long j;
            String str2;
            C89219l.m154721d(pVar, "");
            if (this.f12754a.f12743k == 1) {
                String str3 = null;
                long j2 = 16;
                if (pVar.getFirst() == C4502a.EnumC4510g.COUNTDOWN_WAITING) {
                    ImageView imageView = this.f12754a.f12737e;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LiveTextView liveTextView = this.f12754a.f12736d;
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
                        C4871c cVar = this.f12754a;
                        List<? extends ImageModel> list = C4502a.f12082n;
                        if (list != null && list.size() >= 5) {
                            C89233z.C89236c cVar2 = new C89233z.C89236c();
                            cVar2.element = 0;
                            cVar.f12740h = C11231b.m19896a(2300, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143289d(new C4877f(cVar, C4502a.f12082n, cVar2));
                        }
                    } else if (longValue == j && C4502a.m10589e()) {
                        C7608g.C7609a aVar3 = C4502a.f12083o;
                        if (aVar3 != null) {
                            str3 = aVar3.f18890d;
                        }
                        if (C4871c.m11034a(str3)) {
                            C4097j.m9928a(this.f12754a.f12744l);
                            C4871c cVar3 = this.f12754a;
                            C7608g.C7609a aVar4 = C4502a.f12083o;
                            if (aVar4 == null || (str2 = aVar4.f18890d) == null) {
                                str2 = "";
                            }
                            C89219l.m154716b(str2, "");
                            cVar3.mo10613a(str2, false);
                        }
                    }
                    LiveTextView liveTextView2 = this.f12754a.f12736d;
                    if (liveTextView2 != null) {
                        liveTextView2.setText(String.valueOf(pVar.getSecond().longValue()));
                    }
                } else if (pVar.getFirst() == C4502a.EnumC4510g.TIMEOUT_WAITING) {
                    LiveTextView liveTextView3 = this.f12754a.f12736d;
                    if (liveTextView3 != null) {
                        liveTextView3.setVisibility(8);
                    }
                    ImageView imageView2 = this.f12754a.f12737e;
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
                        if (C4871c.m11034a(str3)) {
                            C4097j.m9928a(this.f12754a.f12744l);
                            C4871c cVar4 = this.f12754a;
                            C7608g.C7609a aVar7 = C4502a.f12083o;
                            if (aVar7 == null || (str = aVar7.f18891e) == null) {
                                str = "";
                            }
                            C89219l.m154716b(str, "");
                            cVar4.mo10613a(str, false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10611a() {
        AbstractC88412b bVar = this.f12740h;
        if (bVar != null) {
            bVar.dispose();
        }
        VHeadView vHeadView = this.f12738f;
        if (vHeadView != null) {
            vHeadView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10617c() {
        if (this.f12741i) {
            mo10612a(2131234499);
        } else {
            mo10612a(2131234498);
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        this.f12748q.mo10608j();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$d */
    static final class C4875d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4871c f12753a;

        static {
            Covode.recordClassIndex(5457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4875d(C4871c cVar) {
            super(1);
            this.f12753a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            String a;
            C89219l.m154721d(zVar, "");
            C4871c cVar = this.f12753a;
            if (cVar.mo10616b() && cVar.f12743k == 1 && C4836a.m10967a("anchor_linkmic_waiting_tips_shown") && !C4502a.m10583a() && (a = C3966y.m9657a((int) R.string.enx)) != null) {
                cVar.mo10613a(a, false);
                C4836a.m10968b("anchor_linkmic_waiting_tips_shown");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$f */
    static final class C4877f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4871c f12755a;

        /* renamed from: b */
        final /* synthetic */ List f12756b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f12757c;

        static {
            Covode.recordClassIndex(5459);
        }

        C4877f(C4871c cVar, List list, C89233z.C89236c cVar2) {
            this.f12755a = cVar;
            this.f12756b = list;
            this.f12757c = cVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = this.f12756b;
            if (list != null && list.size() >= 10) {
                this.f12757c.element++;
                VHeadView vHeadView = this.f12755a.f12738f;
                if (vHeadView != null) {
                    vHeadView.setVisibility(0);
                }
                VHeadView vHeadView2 = this.f12755a.f12738f;
                List list2 = this.f12756b;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                C3951p.m9621a(vHeadView2, (ImageModel) list2.get(this.f12757c.element % this.f12756b.size()));
            }
        }
    }

    /* renamed from: a */
    public static boolean m11034a(String str) {
        int i;
        if (TextUtils.isEmpty(str) || (i = LiveRandomLinkmicSetting.INSTANCE.getValue().bubbleStrategy) == 0) {
            return false;
        }
        if (i == 1) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10615b(boolean z) {
        if (this.f12741i) {
            ImageView imageView = this.f12746o;
            if (imageView != null) {
                C11279p.m20008a(imageView, z);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.f12745n;
            if (liveAutoRtlTextView != null) {
                C11279p.m20008a(liveAutoRtlTextView, z);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$b */
    static final class C4873b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4871c f12751a;

        static {
            Covode.recordClassIndex(5455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4873b(C4871c cVar) {
            super(1);
            this.f12751a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            ImageModel imageModel;
            int intValue = num.intValue();
            if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && intValue >= 0) {
                LiveTextView liveTextView = this.f12751a.f12736d;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
                LiveTextView liveTextView2 = this.f12751a.f12736d;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                C4871c cVar = this.f12751a;
                HSImageView hSImageView = cVar.f12739g;
                if (hSImageView != null) {
                    hSImageView.setVisibility(0);
                }
                HSImageView hSImageView2 = cVar.f12739g;
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

    /* renamed from: a */
    public final void mo10612a(int i) {
        if (this.f12741i) {
            HSAnimImageView hSAnimImageView = this.f12735c;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f12735c;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f12735c;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            mo10615b(true);
            ImageView imageView = this.f12746o;
            if (imageView != null) {
                imageView.setImageResource(i);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView4 = this.f12735c;
        if (hSAnimImageView4 != null) {
            hSAnimImageView4.clearAnimation();
        }
        HSAnimImageView hSAnimImageView5 = this.f12735c;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView6 = this.f12735c;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setImageResource(i);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.c$c */
    static final class C4874c extends AbstractC89220m implements AbstractC89172b<EnumC4440k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4871c f12752a;

        static {
            Covode.recordClassIndex(5456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4874c(C4871c cVar) {
            super(1);
            this.f12752a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
            if (com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a.m10583a() == false) goto L_0x00d9;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.android.live.liveinteract.api.EnumC4440k r8) {
            /*
            // Method dump skipped, instructions count: 240
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.p291c.C4871c.C4874c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final void mo10614b(int i) {
        View view = this.f12733a;
        if (view != null) {
            if (i == 0) {
                if (this.f12742j) {
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC);
                    C5702a.m12449a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                    if (!isPluginAvailable) {
                        Context context = this.f12734b;
                        if (context == null) {
                            C89219l.m154715b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context, EnumC11229b.LINK_MIC);
                        C5736v.m12587a();
                        if (this.f12750s.mo11467a()) {
                            C5736v.m12590a(1, (long) this.f12750s.mo11468b());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!this.f12750s.f14454b && this.f12750s.mo11467a() && i == 0) {
                C5736v.m12594b(1, (long) this.f12750s.mo11468b());
                this.f12750s.f14454b = true;
            }
            view.setVisibility(i);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        dataChannel.mo28316b(this);
        mo10611a();
        C4502a.m10586b(this.f12747p);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        boolean z;
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f12733a = view;
        this.f12734b = view.getContext();
        this.f12735c = (HSAnimImageView) view.findViewById(R.id.bsh);
        this.f12737e = (ImageView) view.findViewById(R.id.byu);
        this.f12738f = (VHeadView) view.findViewById(R.id.byt);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.eun);
        liveTextView.setVisibility(8);
        this.f12736d = liveTextView;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.bsr);
        hSImageView.setVisibility(8);
        this.f12739g = hSImageView;
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f12741i = z;
        if (z) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.ekj);
            this.f12745n = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(C3966y.m9657a((int) R.string.ebe));
            }
            this.f12746o = (ImageView) view.findViewById(R.id.ek8);
        }
        mo10617c();
        dataChannel.mo28310a(C4500k.class, (AbstractC89172b) new C4873b(this)).mo28310a(C4400an.class, (AbstractC89172b) new C4874c(this)).mo28309a(this.f12749r, C5685d.class, (AbstractC89172b) new C4875d(this));
        C4502a.m10584a(this.f12747p);
    }

    /* renamed from: a */
    public final void mo10613a(String str, boolean z) {
        long a;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                a = C4097j.m9923a(this.f12733a, str, -1);
            } else {
                a = C4097j.m9922a(this.f12733a, str);
            }
            this.f12744l = a;
        }
    }

    public C4871c(AbstractC4867a.AbstractC4869b bVar, AbstractC1204m mVar, C5701a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        this.f12748q = bVar;
        this.f12749r = mVar;
        this.f12750s = aVar;
    }
}
