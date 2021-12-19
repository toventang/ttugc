package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9035bb;
import com.bytedance.android.livesdk.p561j.C9070ci;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.o */
public final class C6450o extends C10935a {

    /* renamed from: a */
    public boolean f16062a;

    /* renamed from: b */
    private final AbstractC89244h f16063b = C11831d.m20835a(new C6452b(this));

    /* renamed from: c */
    private final AbstractC89244h f16064c = C11831d.m20835a(new C6451a(this));

    /* renamed from: d */
    private HashMap f16065d;

    static {
        Covode.recordClassIndex(7186);
    }

    /* renamed from: c */
    private final Room m13846c() {
        return (Room) this.f16063b.getValue();
    }

    /* renamed from: a */
    public final View mo12593a(int i) {
        if (this.f16065d == null) {
            this.f16065d = new HashMap();
        }
        View view = (View) this.f16065d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16065d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12595a() {
        return ((Boolean) this.f16064c.getValue()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo12596b() {
        Room c = m13846c();
        if (c != null) {
            return c.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16065d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$a */
    static final class C6451a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C6450o f16066a;

        static {
            Covode.recordClassIndex(7187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6451a(C6450o oVar) {
            super(0);
            this.f16066a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            DataChannel a = C17846f.m33055a(this.f16066a);
            if (a != null) {
                bool = (Boolean) a.mo28318b(C9119ed.class);
            } else {
                bool = null;
            }
            return Boolean.valueOf(C11279p.m20012a(bool));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$b */
    static final class C6452b extends AbstractC89220m implements AbstractC89171a<Room> {

        /* renamed from: a */
        final /* synthetic */ C6450o f16067a;

        static {
            Covode.recordClassIndex(7188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6452b(C6450o oVar) {
            super(0);
            this.f16067a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Room invoke() {
            DataChannel a = C17846f.m33055a(this.f16067a);
            if (a != null) {
                return a.mo28318b(C9093de.class);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$j */
    static final class C6460j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6460j f16076a = new C6460j();

        static {
            Covode.recordClassIndex(7196);
        }

        C6460j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$l */
    static final class C6462l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6462l f16079a = new C6462l();

        static {
            Covode.recordClassIndex(7198);
        }

        C6462l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$e */
    static final class View$OnClickListenerC6455e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6450o f16070a;

        static {
            Covode.recordClassIndex(7191);
        }

        View$OnClickListenerC6455e(C6450o oVar) {
            this.f16070a = oVar;
        }

        public final void onClick(View view) {
            if (this.f16070a.f16062a) {
                ((BlockWordView) this.f16070a.mo12593a(R.id.tb)).mo8250a();
                return;
            }
            DataChannel a = C17846f.m33055a(this.f16070a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$f */
    static final class View$OnClickListenerC6456f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6450o f16071a;

        static {
            Covode.recordClassIndex(7192);
        }

        View$OnClickListenerC6456f(C6450o oVar) {
            this.f16071a = oVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16071a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17357b(EnumC9135q.TEMPORARY_MUTE));
            }
            C6805b<Boolean> bVar = AbstractC6804a.f16962bK;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$g */
    static final class C6457g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6450o f16072a;

        static {
            Covode.recordClassIndex(7193);
        }

        C6457g(C6450o oVar) {
            this.f16072a = oVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveTextView liveTextView;
            C3265j jVar = (C3265j) obj;
            Context context = this.f16072a.getContext();
            if (context != null && (liveTextView = (LiveTextView) this.f16072a.mo12593a(R.id.ai7)) != null) {
                C89219l.m154716b(jVar, "");
                C89219l.m154716b(context, "");
                liveTextView.setText(C6423e.m13819a(jVar, context));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$h */
    static final class C6458h extends AbstractC89220m implements AbstractC89172b<C3265j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6450o f16073a;

        static {
            Covode.recordClassIndex(7194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6458h(C6450o oVar) {
            super(1);
            this.f16073a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3265j jVar) {
            LiveTextView liveTextView;
            C3265j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            Context context = this.f16073a.getContext();
            if (!(context == null || (liveTextView = (LiveTextView) this.f16073a.mo12593a(R.id.ai7)) == null)) {
                C89219l.m154716b(context, "");
                liveTextView.setText(C6423e.m13819a(jVar2, context));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$k */
    static final class C6461k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6450o f16077a;

        /* renamed from: b */
        final /* synthetic */ boolean f16078b;

        static {
            Covode.recordClassIndex(7197);
        }

        C6461k(C6450o oVar, boolean z) {
            this.f16077a = oVar;
            this.f16078b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            boolean z = this.f16078b;
            C6501b a = C6501b.C6502a.m13948a("livesdk_tns_filter_switch");
            if (z) {
                str = "switch_on";
            } else {
                str = "switch_off";
            }
            a.mo12651a("click_switch", str).mo12655b();
            DataChannelGlobal.f42558d.mo28321a(C9035bb.class, Boolean.valueOf(this.f16078b));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$i */
    static final class C6459i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6450o f16074a;

        /* renamed from: b */
        final /* synthetic */ boolean f16075b;

        static {
            Covode.recordClassIndex(7195);
        }

        C6459i(C6450o oVar, boolean z) {
            this.f16074a = oVar;
            this.f16075b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            if (((C5832d) obj).statusCode == 0) {
                C6450o oVar = this.f16074a;
                boolean z = this.f16075b;
                HashMap hashMap = new HashMap();
                String str2 = "open";
                if (z) {
                    str = str2;
                } else {
                    str = "close";
                }
                hashMap.put("status", str);
                hashMap.put("situation", "comment_setting");
                C6501b a = C6501b.C6502a.m13948a("livesdk_set_comment_status");
                if (!z) {
                    str2 = "close";
                }
                a.mo12651a("status", str2).mo12651a("situation", "comment_setting").mo12643a(C17846f.m33055a(oVar)).mo12658d("live_detail").mo12655b();
                C6805b<Boolean> bVar = AbstractC6804a.f16969bR;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a(bVar, Boolean.valueOf(this.f16075b));
                C6779a.m14563a().mo13053a(new C7367a(this.f16075b));
                return;
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    /* renamed from: a */
    public final void mo12594a(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) mo12593a(R.id.c8g);
        C89219l.m154716b(linearLayout, "");
        int i2 = 0;
        if (!z || !mo12595a()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        BlockWordView blockWordView = (BlockWordView) mo12593a(R.id.tb);
        C89219l.m154716b(blockWordView, "");
        if (!z) {
            i2 = 8;
        }
        blockWordView.setVisibility(i2);
        if (!z) {
            ((BlockWordView) mo12593a(R.id.tb)).mo8250a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$c */
    static final class C6453c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C6450o f16068a;

        static {
            Covode.recordClassIndex(7189);
        }

        C6453c(C6450o oVar) {
            this.f16068a = oVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f16068a.mo12594a(z);
            C6450o oVar = this.f16068a;
            ((RoomSwitchApi) C5805e.m12718a().mo11572a(RoomSwitchApi.class)).updateSwitch(oVar.mo12596b(), 3, z).mo143254a(new C6459i(oVar, z), C6460j.f16076a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.o$d */
    static final class C6454d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C6450o f16069a;

        static {
            Covode.recordClassIndex(7190);
        }

        C6454d(C6450o oVar) {
            this.f16069a = oVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C6450o oVar = this.f16069a;
            ((RoomSwitchApi) C5805e.m12718a().mo11572a(RoomSwitchApi.class)).updateSwitch(oVar.mo12596b(), 4, z).mo143254a(new C6461k(oVar, z), C6462l.f16079a);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Boolean bool;
        boolean z;
        View a;
        RoomAuthStatus roomAuthStatus;
        User owner;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        BlockWordView blockWordView = (BlockWordView) mo12593a(R.id.tb);
        boolean a2 = mo12595a();
        Room c = m13846c();
        if (c == null || (owner = c.getOwner()) == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        blockWordView.mo8256a(a2, str, mo12596b(), "live_take_detail");
        ((FrameLayout) mo12593a(R.id.pf)).setOnClickListener(new View$OnClickListenerC6455e(this));
        LiveSwitch liveSwitch = (LiveSwitch) mo12593a(R.id.a9h);
        Room c2 = m13846c();
        if (c2 == null || (roomAuthStatus = c2.getRoomAuthStatus()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(roomAuthStatus.enableChat);
        }
        liveSwitch.setChecked(C11279p.m20027d(bool));
        mo12594a(liveSwitch.isChecked());
        liveSwitch.setOnCheckedChangeListener(new C6453c(this));
        LiveSwitch liveSwitch2 = (LiveSwitch) mo12593a(R.id.c8h);
        Boolean bool2 = (Boolean) DataChannelGlobal.f42558d.mo28324b(C9035bb.class);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = true;
        }
        liveSwitch2.setChecked(z);
        liveSwitch2.setOnCheckedChangeListener(new C6454d(this));
        C6805b<Boolean> bVar = AbstractC6804a.f16962bK;
        C89219l.m154716b(bVar, "");
        Boolean a3 = bVar.mo13066a();
        C89219l.m154716b(a3, "");
        if (a3.booleanValue() && (a = mo12593a(R.id.efk)) != null) {
            C11279p.m20017b(a);
        }
        ((LinearLayout) mo12593a(R.id.efj)).setOnClickListener(new View$OnClickListenerC6456f(this));
        register(((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C6457g(this)));
        DataChannelGlobal.f42558d.mo28322a(this, this, C9070ci.class, new C6458h(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7e, viewGroup, false);
    }
}
