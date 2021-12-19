package com.bytedance.android.livesdk.p441ah;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.C8774g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9089da;
import com.bytedance.android.livesdk.p605r.C10330k;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.EnumC10344h;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.h */
public final class C6699h extends AbstractC11293v {

    /* renamed from: b */
    public static final String f16623b;

    /* renamed from: c */
    public static final C6700a f16624c = new C6700a((byte) 0);

    /* renamed from: a */
    public String f16625a;

    /* renamed from: d */
    private LiveSwitch f16626d;

    /* renamed from: e */
    private HashMap f16627e;

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f16627e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f16627e == null) {
            this.f16627e = new HashMap();
        }
        View view = (View) this.f16627e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16627e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.ah.h$a */
    public static final class C6700a {
        static {
            Covode.recordClassIndex(7438);
        }

        private C6700a() {
        }

        public /* synthetic */ C6700a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(7437);
        String simpleName = C6699h.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f16623b = simpleName;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.bd9);
        bVar.f27021h = -1;
        bVar.f27022i = C3966y.m9653a(372.0f);
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "unknown";
        if (!(arguments == null || (string = arguments.getString("enter_from", str)) == null)) {
            str = string;
        }
        this.f16625a = str;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.livesdk.ah.h$c */
    static final class View$OnClickListenerC6702c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6699h f16629a;

        static {
            Covode.recordClassIndex(7440);
        }

        View$OnClickListenerC6702c(C6699h hVar) {
            this.f16629a = hVar;
        }

        public final void onClick(View view) {
            EnumC10344h hVar;
            AbstractC2953a a = C6193a.m13435a(AbstractC10339d.class);
            C89219l.m154716b(a, "");
            AbstractC10336c rankOptOutPresenter = ((AbstractC10339d) a).getRankOptOutPresenter();
            if (rankOptOutPresenter != null) {
                Context context = this.f16629a.getContext();
                LiveSwitch liveSwitch = (LiveSwitch) this.f16629a.mo8166a_(R.id.edr);
                C89219l.m154716b(liveSwitch, "");
                if (!liveSwitch.isChecked()) {
                    hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_ON;
                } else {
                    hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_OFF;
                }
                rankOptOutPresenter.mo17115a(context, 6, hVar.getValue(), this.f16629a.f27010p, "user", new AbstractC10336c.AbstractC10338b(this) {
                    /* class com.bytedance.android.livesdk.p441ah.C6699h.View$OnClickListenerC6702c.C67031 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC6702c f16630a;

                    static {
                        Covode.recordClassIndex(7441);
                    }

                    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c.AbstractC10338b
                    /* renamed from: b */
                    public final void mo12613b() {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
                    }

                    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c.AbstractC10338b
                    /* renamed from: a */
                    public final void mo12612a() {
                        EnumC10344h hVar;
                        String str;
                        ((LiveSwitch) this.f16630a.f16629a.mo8166a_(R.id.edr)).toggle();
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
                        LiveSwitch liveSwitch = (LiveSwitch) this.f16630a.f16629a.mo8166a_(R.id.edr);
                        C89219l.m154716b(liveSwitch, "");
                        if (liveSwitch.isChecked()) {
                            hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_ON;
                        } else {
                            hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_OFF;
                        }
                        dataChannelGlobal.mo28321a(C9089da.class, Long.valueOf(hVar.getValue()));
                        C6501b a = C6501b.C6502a.m13948a("livesdk_live_rankings_setting_click").mo12639a();
                        String str2 = this.f16630a.f16629a.f16625a;
                        if (str2 == null) {
                            C89219l.m154710a("mEnterFrom");
                        }
                        C6501b a2 = a.mo12651a("enter_from", str2);
                        LiveSwitch liveSwitch2 = (LiveSwitch) this.f16630a.f16629a.mo8166a_(R.id.edr);
                        C89219l.m154716b(liveSwitch2, "");
                        if (liveSwitch2.isChecked()) {
                            str = "open";
                        } else {
                            str = "close";
                        }
                        a2.mo12651a("ranking_status", str).mo12651a("user_type", "user").mo12655b();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f16630a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ah.h$b */
    static final class C6701b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C6699h f16628a;

        static {
            Covode.recordClassIndex(7439);
        }

        C6701b(C6699h hVar) {
            this.f16628a = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C6805b<Boolean> bVar = AbstractC6804a.f17044cr;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
            if (!z) {
                C6805b<Boolean> bVar2 = AbstractC6804a.f17043cq;
                C89219l.m154716b(bVar2, "");
                C6806c.m14603a((C6800c) bVar2, (Object) false);
                C3854a.m9453a(4, "picture_in_picture", "PipSwitcherDialog LIVE_PIP_SWITCHER_OPEN -> false");
                C6501b.C6502a.m13948a("livesdk_pip_switch_click").mo12643a(this.f16628a.f27010p).mo12651a("switch_selection", "close").mo12655b();
            } else if (C6682a.m14197b()) {
                C6805b<Boolean> bVar3 = AbstractC6804a.f17043cq;
                C89219l.m154716b(bVar3, "");
                C6806c.m14603a((C6800c) bVar3, (Object) true);
                C3854a.m9453a(4, "picture_in_picture", "PipSwitcherDialog LIVE_PIP_SWITCHER_OPEN -> true");
                C89219l.m154716b(compoundButton, "");
                Context context = compoundButton.getContext();
                C89219l.m154716b(context, "");
                if (!C6682a.m14196a(context)) {
                    C10330k.m18811c(compoundButton.getContext());
                    this.f16628a.dismissAllowingStateLoss();
                    C8774g.m17073a().mo15046c();
                }
                C6501b.C6502a.m13948a("livesdk_pip_switch_click").mo12643a(this.f16628a.f27010p).mo12651a("switch_selection", "open").mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        boolean z = false;
        if (C6682a.m14197b()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo8166a_(R.id.c5c);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            LiveSwitch liveSwitch = (LiveSwitch) view.findViewById(R.id.d25);
            this.f16626d = liveSwitch;
            if (liveSwitch != null) {
                liveSwitch.setChecked(C6682a.m14198b(view.getContext()));
            }
            LiveSwitch liveSwitch2 = this.f16626d;
            if (liveSwitch2 != null) {
                liveSwitch2.setOnCheckedChangeListener(new C6701b(this));
            }
        }
        Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9089da.class);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > EnumC10344h.RANKINGS_SWITCH_STATUS_HIDE.getValue()) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) mo8166a_(R.id.c7g);
                C89219l.m154716b(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
                LiveSwitch liveSwitch3 = (LiveSwitch) mo8166a_(R.id.edr);
                C89219l.m154716b(liveSwitch3, "");
                if (longValue == EnumC10344h.RANKINGS_SWITCH_STATUS_ON.getValue()) {
                    z = true;
                }
                liveSwitch3.setChecked(z);
                ((FrameLayout) mo8166a_(R.id.dee)).setOnClickListener(new View$OnClickListenerC6702c(this));
            }
        }
    }
}
