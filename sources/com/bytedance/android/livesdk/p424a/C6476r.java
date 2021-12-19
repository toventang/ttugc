package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9090db;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.EnumC10344h;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.r */
public final class C6476r extends C10935a {

    /* renamed from: a */
    private final AbstractC89244h f16108a = C89250i.m154773a((AbstractC89171a) new C6477a(this));

    /* renamed from: b */
    private HashMap f16109b;

    static {
        Covode.recordClassIndex(7212);
    }

    /* renamed from: a */
    public final View mo12608a(int i) {
        if (this.f16109b == null) {
            this.f16109b = new HashMap();
        }
        View view = (View) this.f16109b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16109b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final Room mo12609a() {
        return (Room) this.f16108a.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.a.r$d */
    public static final class C6480d implements AbstractC10336c.AbstractC10338b {

        /* renamed from: a */
        final /* synthetic */ C6476r f16113a;

        /* renamed from: b */
        final /* synthetic */ boolean f16114b;

        static {
            Covode.recordClassIndex(7216);
        }

        @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c.AbstractC10338b
        /* renamed from: b */
        public final void mo12613b() {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }

        @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c.AbstractC10338b
        /* renamed from: a */
        public final void mo12612a() {
            String str;
            String str2;
            RoomAuthStatus roomAuthStatus;
            int i;
            ((LiveSwitch) this.f16113a.mo12608a(R.id.deb)).toggle();
            Room a = this.f16113a.mo12609a();
            if (!(a == null || (roomAuthStatus = a.getRoomAuthStatus()) == null)) {
                if (this.f16114b) {
                    i = 1;
                } else {
                    i = 2;
                }
                roomAuthStatus.setRankingsSwitchStatus(i);
            }
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_live_rankings_setting_click").mo12639a();
            DataChannel a3 = C17846f.m33055a(this.f16113a);
            if (a3 == null || (str = (String) a3.mo28318b(C9090db.class)) == null) {
                str = "unknown";
            }
            C6501b a4 = a2.mo12651a("enter_from", str);
            if (this.f16114b) {
                str2 = "open";
            } else {
                str2 = "close";
            }
            a4.mo12651a("ranking_status", str2).mo12651a("user_type", "anchor").mo12655b();
        }

        C6480d(C6476r rVar, boolean z) {
            this.f16113a = rVar;
            this.f16114b = z;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16109b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.r$a */
    static final class C6477a extends AbstractC89220m implements AbstractC89171a<Room> {

        /* renamed from: a */
        final /* synthetic */ C6476r f16110a;

        static {
            Covode.recordClassIndex(7213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6477a(C6476r rVar) {
            super(0);
            this.f16110a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Room invoke() {
            DataChannel a = C17846f.m33055a(this.f16110a);
            if (a != null) {
                return a.mo28318b(C9093de.class);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.r$b */
    static final class View$OnClickListenerC6478b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6476r f16111a;

        static {
            Covode.recordClassIndex(7214);
        }

        View$OnClickListenerC6478b(C6476r rVar) {
            this.f16111a = rVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16111a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.r$c */
    static final class View$OnClickListenerC6479c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6476r f16112a;

        static {
            Covode.recordClassIndex(7215);
        }

        View$OnClickListenerC6479c(C6476r rVar) {
            this.f16112a = rVar;
        }

        public final void onClick(View view) {
            EnumC10344h hVar;
            C6476r rVar = this.f16112a;
            LiveSwitch liveSwitch = (LiveSwitch) rVar.mo12608a(R.id.deb);
            C89219l.m154716b(liveSwitch, "");
            boolean z = !liveSwitch.isChecked();
            AbstractC2953a a = C6193a.m13435a(AbstractC10339d.class);
            C89219l.m154716b(a, "");
            AbstractC10336c rankOptOutPresenter = ((AbstractC10339d) a).getRankOptOutPresenter();
            if (rankOptOutPresenter != null) {
                Context context = rVar.getContext();
                if (z) {
                    hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_ON;
                } else {
                    hVar = EnumC10344h.RANKINGS_SWITCH_STATUS_OFF;
                }
                rankOptOutPresenter.mo17115a(context, 5, hVar.getValue(), C17846f.m33055a(rVar), "anchor", new C6480d(rVar, z));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (mo12609a() != null) {
            ((FrameLayout) mo12608a(R.id.pf)).setOnClickListener(new View$OnClickListenerC6478b(this));
            LinearLayout linearLayout = (LinearLayout) mo12608a(R.id.ded);
            C89219l.m154716b(linearLayout, "");
            Room a = mo12609a();
            boolean z = false;
            if (a == null || (roomAuthStatus2 = a.getRoomAuthStatus()) == null || roomAuthStatus2.getRankingsSwitchStatus() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            LiveSwitch liveSwitch = (LiveSwitch) mo12608a(R.id.deb);
            C89219l.m154716b(liveSwitch, "");
            Room a2 = mo12609a();
            if (!(a2 == null || (roomAuthStatus = a2.getRoomAuthStatus()) == null || roomAuthStatus.getRankingsSwitchStatus() != 1)) {
                z = true;
            }
            liveSwitch.setChecked(z);
            ((FrameLayout) mo12608a(R.id.dee)).setOnClickListener(new View$OnClickListenerC6479c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7b, viewGroup, false);
    }
}
