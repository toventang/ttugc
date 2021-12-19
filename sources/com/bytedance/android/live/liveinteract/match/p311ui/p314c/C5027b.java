package com.bytedance.android.live.liveinteract.match.p311ui.p314c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4959j;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.c.b */
public final class C5027b implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    public View f13064a;

    /* renamed from: b */
    HSAnimImageView f13065b;

    /* renamed from: c */
    AppCompatImageView f13066c;

    /* renamed from: d */
    public AbstractC5026a f13067d;

    /* renamed from: e */
    long f13068e;

    /* renamed from: f */
    private AppCompatImageView f13069f;

    /* renamed from: g */
    private LottieAnimationView f13070g;

    /* renamed from: h */
    private Context f13071h;

    /* renamed from: i */
    private boolean f13072i;

    /* renamed from: j */
    private LiveAutoRtlTextView f13073j;

    /* renamed from: k */
    private ImageView f13074k;

    static {
        Covode.recordClassIndex(5611);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10734a() {
        if (C4097j.m9933b(this.f13068e)) {
            C4097j.m9928a(this.f13068e);
        }
        this.f13068e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10736b() {
        mo10737b(true);
        mo10739c(false);
        HSAnimImageView hSAnimImageView = this.f13065b;
        if (hSAnimImageView != null) {
            hSAnimImageView.clearAnimation();
        }
        HSAnimImageView hSAnimImageView2 = this.f13065b;
        if (hSAnimImageView2 != null) {
            hSAnimImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = this.f13066c;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10738c() {
        if (this.f13072i) {
            AppCompatImageView appCompatImageView = this.f13069f;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(2131234502);
            }
            ImageView imageView = this.f13074k;
            if (imageView != null) {
                imageView.setImageResource(2131234503);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = this.f13069f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(2131234502);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10740d() {
        if (this.f13072i) {
            AppCompatImageView appCompatImageView = this.f13069f;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(2131234500);
            }
            ImageView imageView = this.f13074k;
            if (imageView != null) {
                imageView.setImageResource(2131234501);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = this.f13069f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(2131234500);
        }
    }

    public final void onClick(View view) {
        AbstractC5026a aVar = this.f13067d;
        if (aVar != null) {
            aVar.mo10733a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10739c(boolean z) {
        AppCompatImageView appCompatImageView;
        if (this.f13072i && (appCompatImageView = this.f13069f) != null) {
            C11279p.m20008a(appCompatImageView, z);
        }
    }

    /* renamed from: a */
    public final void mo10735a(int i) {
        View view;
        if (i == 0 && ((view = this.f13064a) == null || view.getVisibility() != 0)) {
            C5009a.m11203a();
        }
        View view2 = this.f13064a;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10737b(boolean z) {
        if (this.f13072i) {
            ImageView imageView = this.f13074k;
            if (imageView != null) {
                C11279p.m20008a(imageView, z);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.f13073j;
            if (liveAutoRtlTextView != null) {
                C11279p.m20008a(liveAutoRtlTextView, z);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.c.b$a */
    static final class C5028a extends AbstractC89220m implements AbstractC89172b<EnumC4949c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5027b f13075a;

        static {
            Covode.recordClassIndex(5612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5028a(C5027b bVar) {
            super(1);
            this.f13075a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC4949c cVar) {
            EnumC4949c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C5027b bVar = this.f13075a;
            if (cVar2 == EnumC4949c.INVITED) {
                C6805b<Boolean> bVar2 = AbstractC6804a.f16973bV;
                C89219l.m154716b(bVar2, "");
                if (!bVar2.mo13066a().booleanValue()) {
                    C6805b<Boolean> bVar3 = AbstractC6804a.f16973bV;
                    C89219l.m154716b(bVar3, "");
                    C6806c.m14603a((C6800c) bVar3, (Object) true);
                    bVar.f13068e = C4097j.m9922a(bVar.f13064a, C3966y.m9657a((int) R.string.eb1));
                }
                bVar.mo10738c();
                bVar.mo10737b(false);
                bVar.mo10739c(true);
                HSAnimImageView hSAnimImageView = bVar.f13065b;
                if (hSAnimImageView != null) {
                    hSAnimImageView.setVisibility(0);
                }
                HSAnimImageView hSAnimImageView2 = bVar.f13065b;
                if (hSAnimImageView2 != null) {
                    hSAnimImageView2.mo9389a(HSAnimImageView.f11029i.mo9399a("tiktok_live_interaction_resource", "ttlive_lottie_icon_time_countdown.webp"));
                }
                HSAnimImageView hSAnimImageView3 = bVar.f13065b;
                if (hSAnimImageView3 != null) {
                    hSAnimImageView3.mo9390a();
                }
                AppCompatImageView appCompatImageView = bVar.f13066c;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
            } else if (EnumC4949c.START.compareTo((Enum) cVar2) > 0 || cVar2.compareTo((Enum) EnumC4949c.END) >= 0) {
                bVar.mo10734a();
                bVar.mo10736b();
                bVar.mo10738c();
            } else {
                bVar.mo10734a();
                bVar.mo10736b();
                bVar.mo10740d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        C89219l.m154721d(view, "");
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9114dz.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f13072i = z;
        this.f13064a = view;
        this.f13069f = (AppCompatImageView) view.findViewById(R.id.bwm);
        this.f13070g = (LottieAnimationView) view.findViewById(R.id.bwo);
        this.f13065b = (HSAnimImageView) view.findViewById(R.id.bwn);
        this.f13066c = (AppCompatImageView) view.findViewById(R.id.bwp);
        if (this.f13072i) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.ekj);
            this.f13073j = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(C3966y.m9657a((int) R.string.ebj));
            }
            this.f13074k = (ImageView) view.findViewById(R.id.ek8);
            mo10739c(false);
        }
        this.f13071h = view.getContext();
        mo10740d();
        if (dataChannel != null) {
            dataChannel.mo28310a(C4959j.class, (AbstractC89172b) new C5028a(this));
        }
    }
}
