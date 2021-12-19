package com.bytedance.android.live.liveinteract.linkroom.p292d.p293a;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p288b.C4836a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5682a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5691j;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5693l;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5694m;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.d.a.a */
public final class View$OnClickListenerC4896a extends C4831a.AbstractC4833b implements View.OnClickListener {

    /* renamed from: e */
    public static final C4897a f12818e = new C4897a((byte) 0);

    /* renamed from: d */
    public DataChannel f12819d;

    /* renamed from: f */
    private View f12820f;

    /* renamed from: g */
    private View f12821g;

    /* renamed from: h */
    private View f12822h;

    /* renamed from: i */
    private LiveTextView f12823i;

    /* renamed from: j */
    private boolean f12824j;

    /* renamed from: k */
    private HashMap f12825k;

    static {
        Covode.recordClassIndex(5478);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a.AbstractC4833b
    /* renamed from: b */
    public final void mo10563b() {
        HashMap hashMap = this.f12825k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a.AbstractC4833b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo10563b();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.d.a.a$a */
    public static final class C4897a {
        static {
            Covode.recordClassIndex(5479);
        }

        private C4897a() {
        }

        public /* synthetic */ C4897a(byte b) {
            this();
        }
    }

    private View$OnClickListenerC4896a() {
    }

    /* renamed from: c */
    private static Room m11080c() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return new Room();
        }
        return room;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a.AbstractC4833b
    /* renamed from: a */
    public final void mo10561a() {
        if (this.mStatusViewValid) {
            if (this.f12824j) {
                if (Build.VERSION.SDK_INT < 21) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gol);
                } else {
                    this.f12057c.f11932V = "connection_icon";
                    this.f12055a.mo10258a(C4588x.EnumC4589a.INVITE_USER_LIST_FRAGMENT, C4462b.C4465c.m10549a(true));
                }
            }
            this.f12824j = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        float b;
        C4480f.C4481a aVar = new C4480f.C4481a();
        String a = C3966y.m9657a((int) R.string.ef0);
        C89219l.m154716b(a, "");
        C4480f.C4481a a2 = aVar.mo10263a(a);
        if (this.f12822h == null) {
            C89219l.m154710a("mRootView");
        } else {
            View view = this.f12822h;
            if (view == null) {
                C89219l.m154710a("mRootView");
            }
            int height = view.getHeight();
            if (!(height == 0 || getActivity() == null)) {
                b = (float) C11227ap.m19887b(getActivity(), (float) height);
                a2.f12063b = (int) b;
                return a2;
            }
        }
        b = 208.0f;
        a2.f12063b = (int) b;
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public /* synthetic */ View$OnClickListenerC4896a(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.d.a.a$b */
    static final class C4898b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC4896a f12826a;

        static {
            Covode.recordClassIndex(5480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4898b(View$OnClickListenerC4896a aVar) {
            super(1);
            this.f12826a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f12826a.mo10630a(num.intValue());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a.AbstractC4833b
    /* renamed from: a */
    public final void mo10562a(Throwable th) {
        if (this.mStatusViewValid) {
            C11264f.m19957a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.f12819d;
        if (dataChannel != null) {
            dataChannel.mo28310a(C5691j.class, (AbstractC89172b) new C4898b(this));
        }
    }

    /* renamed from: a */
    public final void mo10630a(int i) {
        if (i <= 0) {
            LiveTextView liveTextView = this.f12823i;
            if (liveTextView == null) {
                C89219l.m154710a("redotNumV");
            } else {
                liveTextView.setVisibility(8);
            }
        } else {
            LiveTextView liveTextView2 = this.f12823i;
            if (liveTextView2 == null) {
                C89219l.m154710a("redotNumV");
            } else {
                liveTextView2.setText(String.valueOf(i));
            }
            LiveTextView liveTextView3 = this.f12823i;
            if (liveTextView3 == null) {
                C89219l.m154710a("redotNumV");
            } else {
                liveTextView3.setVisibility(0);
            }
        }
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        C89219l.m154721d(view, "");
        View view2 = this.f12821g;
        if (view2 == null) {
            C89219l.m154710a("mLinkInRoomBt");
        }
        if (view == view2) {
            z = true;
        } else {
            z = false;
        }
        View view3 = this.f12820f;
        if (view3 == null) {
            C89219l.m154710a("mLinkCrossRoomBt");
        }
        if (view == view3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C4384b.C4385a.m10496a().f11916F = !z;
        if (z) {
            DataChannel dataChannel = this.f12819d;
            if (dataChannel != null) {
                dataChannel.mo28319c(C5694m.class);
            }
            DataChannel dataChannel2 = this.f12819d;
            if (dataChannel2 != null) {
                dataChannel2.mo28319c(C5682a.class);
            }
            C5703b.m12473b("golive_window");
        } else if (z2) {
            C4836a.m10966a(1);
            DataChannel dataChannel3 = this.f12819d;
            if (dataChannel3 != null) {
                dataChannel3.mo28319c(C5693l.class);
            }
            if (C4394ah.m10505a(C4384b.C4385a.m10496a().mo10147a(), 2) && !TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0e);
                HashMap hashMap = new HashMap();
                C5703b.m12466a(hashMap);
                C5703b.m12465a("livesdk_anchor_close_guest_connection_notice_show", hashMap);
            } else if (!(this.f12055a == null || m11080c().getId() == 0)) {
                this.f12824j = true;
                C4469d.AbstractC4470a aVar = this.f12056b;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                ((C4831a.AbstractC4832a) aVar).mo10560a(m11080c().getId());
            }
            C5713h.m12516a("panel", "connection_icon", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num;
        C89219l.m154721d(layoutInflater, "");
        int i = 0;
        View a = C1764a.m5927a(layoutInflater, R.layout.b8c, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f12822h = a;
        if (a == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById = a.findViewById(R.id.wa);
        C89219l.m154716b(findViewById, "");
        this.f12820f = findViewById;
        View view = this.f12822h;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById2 = view.findViewById(R.id.wb);
        C89219l.m154716b(findViewById2, "");
        this.f12821g = findViewById2;
        if (findViewById2 == null) {
            C89219l.m154710a("mLinkInRoomBt");
        }
        View findViewById3 = findViewById2.findViewById(R.id.ffw);
        C89219l.m154716b(findViewById3, "");
        this.f12823i = (LiveTextView) findViewById3;
        View view2 = this.f12820f;
        if (view2 == null) {
            C89219l.m154710a("mLinkCrossRoomBt");
        }
        m11079a(view2, R.string.dwg, R.string.dx4, 2131234485);
        View view3 = this.f12821g;
        if (view3 == null) {
            C89219l.m154710a("mLinkInRoomBt");
        }
        m11079a(view3, R.string.e38, R.string.e3j, 2131234486);
        DataChannel dataChannel = this.f12819d;
        if (!(dataChannel == null || (num = (Integer) dataChannel.mo28318b(C5691j.class)) == null)) {
            i = num.intValue();
        }
        mo10630a(i);
        View view4 = this.f12820f;
        if (view4 == null) {
            C89219l.m154710a("mLinkCrossRoomBt");
        }
        view4.setOnClickListener(this);
        View view5 = this.f12821g;
        if (view5 == null) {
            C89219l.m154710a("mLinkInRoomBt");
        }
        view5.setOnClickListener(this);
        View view6 = this.f12822h;
        if (view6 == null) {
            C89219l.m154710a("mRootView");
        }
        return view6;
    }

    /* renamed from: a */
    private static void m11079a(View view, int i, int i2, int i3) {
        ((TextView) view.findViewById(R.id.eyo)).setText(i);
        ((TextView) view.findViewById(R.id.eyn)).setText(i2);
        ((ImageView) view.findViewById(R.id.bx_)).setImageResource(i3);
    }
}
