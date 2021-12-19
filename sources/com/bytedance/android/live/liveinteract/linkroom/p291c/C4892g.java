package com.bytedance.android.live.liveinteract.linkroom.p291c;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5691j;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5693l;
import com.bytedance.android.live.liveinteract.platform.common.p375f.C5701a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.g */
public final class C4892g implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    boolean f12802a;

    /* renamed from: b */
    public boolean f12803b;

    /* renamed from: c */
    public View f12804c;

    /* renamed from: d */
    LiveTextView f12805d;

    /* renamed from: e */
    private Context f12806e;

    /* renamed from: f */
    private HSAnimImageView f12807f;

    /* renamed from: g */
    private View f12808g;

    /* renamed from: h */
    private LiveAutoRtlTextView f12809h;

    /* renamed from: i */
    private final AbstractC6897f<Integer> f12810i = new C4893a(this);

    /* renamed from: j */
    private boolean f12811j;

    /* renamed from: k */
    private final AbstractC4867a.AbstractC4869b f12812k;

    /* renamed from: l */
    private final AbstractC1204m f12813l;

    /* renamed from: m */
    private final C5701a f12814m;

    static {
        Covode.recordClassIndex(5474);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo10627a() {
        if (this.f12802a || !this.f12803b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo10628b() {
        View view = this.f12808g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.g$a */
    static final class C4893a<T> implements AbstractC6897f {

        /* renamed from: a */
        final /* synthetic */ C4892g f12815a;

        static {
            Covode.recordClassIndex(5475);
        }

        C4893a(C4892g gVar) {
            this.f12815a = gVar;
        }

        @Override // com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f
        /* renamed from: a */
        public final /* synthetic */ void mo10559a(Object obj) {
            if (obj != null) {
                this.f12815a.mo10628b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.g$b */
    static final class C4894b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4892g f12816a;

        static {
            Covode.recordClassIndex(5476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4894b(C4892g gVar) {
            super(1);
            this.f12816a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f12816a.mo10628b();
            return C89391z.f203057a;
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        this.f12812k.mo10609k();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.c.g$c */
    static final class C4895c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4892g f12817a;

        static {
            Covode.recordClassIndex(5477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4895c(C4892g gVar) {
            super(1);
            this.f12817a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C4892g gVar = this.f12817a;
            if (!gVar.f12803b || intValue <= 0) {
                LiveTextView liveTextView = gVar.f12805d;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            } else {
                LiveTextView liveTextView2 = gVar.f12805d;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                LiveTextView liveTextView3 = gVar.f12805d;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo10626a(int i) {
        View view = this.f12804c;
        if (view != null) {
            if (i == 0) {
                if (mo10627a()) {
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC);
                    C5702a.m12449a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                    AbstractC4409b bVar = (AbstractC4409b) C6193a.m13435a(AbstractC4409b.class);
                    if (bVar != null && bVar.isInCoHost()) {
                        return;
                    }
                    if (!isPluginAvailable) {
                        Context context = this.f12806e;
                        if (context == null) {
                            C89219l.m154715b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context, EnumC11229b.LINK_MIC);
                        C5736v.m12587a();
                        if (this.f12814m.mo11467a()) {
                            C5736v.m12590a(2, (long) this.f12814m.mo11468b());
                            return;
                        }
                        return;
                    }
                    mo10628b();
                } else {
                    return;
                }
            }
            if (!this.f12814m.f14455c && this.f12814m.mo11467a() && i == 0) {
                C5736v.m12594b(2, (long) this.f12814m.mo11468b());
                this.f12814m.f14455c = true;
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
        C4386c.m10499a().mo13183b(this.f12810i);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        boolean z;
        String a;
        int i;
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f12804c = view;
        this.f12806e = view.getContext();
        Object b = dataChannel.mo28318b(C9119ed.class);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f12803b = ((Boolean) b).booleanValue();
        this.f12807f = (HSAnimImageView) view.findViewById(R.id.bsh);
        this.f12808g = view.findViewById(R.id.dh1);
        this.f12805d = (LiveTextView) view.findViewById(R.id.ffw);
        mo10628b();
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f12811j = z;
        HSAnimImageView hSAnimImageView = this.f12807f;
        if (hSAnimImageView != null) {
            if (this.f12803b) {
                if (z) {
                    i = 2131234508;
                } else {
                    i = 2131234507;
                }
            } else if (z) {
                i = 2131234499;
            } else {
                i = 2131234498;
            }
            hSAnimImageView.setImageResource(i);
        }
        if (this.f12811j) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.ekj);
            if (liveAutoRtlTextView != null) {
                if (this.f12803b) {
                    a = C3966y.m9657a((int) R.string.ebl);
                    C89219l.m154716b(a, "");
                } else {
                    a = C3966y.m9657a((int) R.string.ebe);
                    C89219l.m154716b(a, "");
                }
                liveAutoRtlTextView.setText(a);
            } else {
                liveAutoRtlTextView = null;
            }
            this.f12809h = liveAutoRtlTextView;
        }
        C4386c.m10499a().mo13182a((AbstractC6897f) this.f12810i);
        dataChannel.mo28312a(this, C5693l.class, new C4894b(this)).mo28310a(C5691j.class, (AbstractC89172b) new C4895c(this));
    }

    public C4892g(AbstractC4867a.AbstractC4869b bVar, AbstractC1204m mVar, C5701a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        this.f12812k = bVar;
        this.f12813l = mVar;
        this.f12814m = aVar;
    }
}
