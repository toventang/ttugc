package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5593f;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5603p;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5604q;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a */
public final class View$OnClickListenerC5559a extends C5479a.AbstractC5481b implements View.OnClickListener {

    /* renamed from: i */
    public static final C5560a f14165i = new C5560a((byte) 0);

    /* renamed from: d */
    public DataChannel f14166d;

    /* renamed from: e */
    public C7676a f14167e;

    /* renamed from: f */
    final AbstractC89244h f14168f;

    /* renamed from: g */
    final AbstractC89244h f14169g;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: h */
    public C5271a f14170h;

    /* renamed from: j */
    private View f14171j;

    /* renamed from: k */
    private SwitchCompat f14172k;

    /* renamed from: l */
    private View f14173l;

    /* renamed from: m */
    private View f14174m;

    /* renamed from: n */
    private View f14175n;

    /* renamed from: o */
    private View f14176o;

    /* renamed from: p */
    private View f14177p;

    /* renamed from: q */
    private HashMap f14178q;

    static {
        Covode.recordClassIndex(6155);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a.AbstractC5481b
    /* renamed from: b */
    public final void mo11297b() {
        HashMap hashMap = this.f14178q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a.AbstractC5481b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo11297b();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$a */
    public static final class C5560a {
        static {
            Covode.recordClassIndex(6156);
        }

        private C5560a() {
        }

        public /* synthetic */ C5560a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$b */
    static final class C5561b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5559a f14179a;

        /* renamed from: b */
        final /* synthetic */ C5562c f14180b;

        static {
            Covode.recordClassIndex(6157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5561b(View$OnClickListenerC5559a aVar, C5562c cVar) {
            super(0);
            this.f14179a = aVar;
            this.f14180b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DataChannel dataChannel = this.f14179a.f14166d;
            if (dataChannel != null) {
                dataChannel.mo28319c(C5593f.class);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$d */
    static final class C5564d extends AbstractC89220m implements AbstractC89171a<Room> {

        /* renamed from: a */
        public static final C5564d f14183a = new C5564d();

        static {
            Covode.recordClassIndex(6160);
        }

        C5564d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Room invoke() {
            return DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        }
    }

    /* renamed from: c */
    public final String mo11345c() {
        C7676a aVar = this.f14167e;
        if (aVar == null || aVar.f19019a != 1) {
            return "grid";
        }
        return "floating";
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$e */
    static final class C5565e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C5565e f14184a = new C5565e();

        static {
            Covode.recordClassIndex(6161);
        }

        C5565e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).liveId());
        }
    }

    private View$OnClickListenerC5559a() {
        this.f14168f = C89250i.m154773a((AbstractC89171a) C5564d.f14183a);
        this.f14169g = C89250i.m154773a((AbstractC89171a) C5565e.f14184a);
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$c */
    static final class C5562c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5559a f14181a;

        static {
            Covode.recordClassIndex(6158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5562c(View$OnClickListenerC5559a aVar) {
            super(0);
            this.f14181a = aVar;
        }

        /* renamed from: a */
        public final View invoke() {
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(this.f14181a.getContext());
            liveAutoRtlImageView.setLayoutParams(new ViewGroup.LayoutParams(C3966y.m9653a(10.0f), C3966y.m9653a(18.0f)));
            liveAutoRtlImageView.setImageDrawable(C3966y.m9665c(2131234709));
            liveAutoRtlImageView.setOnClickListener(new View$OnClickListenerC5563a(this));
            return liveAutoRtlImageView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$c$a */
        public static final class View$OnClickListenerC5563a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C5562c f14182a;

            static {
                Covode.recordClassIndex(6159);
            }

            View$OnClickListenerC5563a(C5562c cVar) {
                this.f14182a = cVar;
            }

            public final void onClick(View view) {
                this.f14182a.f14181a.f12055a.dismiss();
                DataChannel dataChannel = this.f14182a.f14181a.f14166d;
                if (dataChannel != null) {
                    dataChannel.mo28319c(C5593f.class);
                }
            }
        }
    }

    /* renamed from: e */
    private final void m12084e() {
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
        aVar.f22245b = C3966y.m9657a((int) R.string.e1d);
        aVar.mo15244a(R.string.elz, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5566f(this), false).mo15249b(R.string.dw3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5567g(this), false).mo15247a().show();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a.AbstractC5481b
    /* renamed from: a */
    public final void mo11295a() {
        C7676a aVar;
        C5271a aVar2 = this.f14170h;
        if (aVar2 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        C7676a aVar3 = null;
        if (aVar2 != null) {
            C7676a aVar4 = this.f14167e;
            if (aVar4 != null) {
                aVar = C7676a.m15669a(aVar4.f19019a, aVar4.f19020b);
            } else {
                aVar = null;
            }
            aVar2.f13638i = aVar;
        }
        m12085f();
        C5271a aVar5 = this.f14170h;
        if (aVar5 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        } else {
            aVar3 = aVar5.f13638i;
        }
        EnumC4422k kVar = EnumC4422k.NORMAL;
        if (aVar3 != null) {
            kVar = C5517c.m12022a(aVar3.f19019a, aVar3.f19020b);
        }
        DataChannel dataChannel = this.f14166d;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5604q.class, new C5603p(kVar));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        float b;
        C5562c cVar = new C5562c(this);
        C4480f.C4481a aVar = new C4480f.C4481a();
        if (this.f14171j == null) {
            C89219l.m154710a("mRootView");
        } else {
            View view = this.f14171j;
            if (view == null) {
                C89219l.m154710a("mRootView");
            }
            int height = view.getHeight();
            if (!(height == 0 || getActivity() == null)) {
                b = (float) C11227ap.m19887b(getActivity(), (float) height);
                aVar.f12063b = (int) b;
                String a = C3966y.m9657a((int) R.string.ek_);
                C89219l.m154716b(a, "");
                aVar.mo10263a(a);
                aVar.f12065d = cVar.invoke();
                aVar.f12068g = new C5561b(this, cVar);
                return aVar;
            }
        }
        b = 208.0f;
        aVar.f12063b = (int) b;
        String a2 = C3966y.m9657a((int) R.string.ek_);
        C89219l.m154716b(a2, "");
        aVar.mo10263a(a2);
        aVar.f12065d = cVar.invoke();
        aVar.f12068g = new C5561b(this, cVar);
        return aVar;
    }

    /* renamed from: f */
    private final void m12085f() {
        C7676a aVar;
        C5271a aVar2 = this.f14170h;
        if (aVar2 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
            aVar = null;
        } else {
            aVar = aVar2.f13638i;
        }
        if (aVar != null) {
            int i = aVar.f19019a;
            if (i == 0) {
                View view = this.f14176o;
                if (view == null) {
                    C89219l.m154710a("mFloatingWindowBackground");
                }
                view.setBackgroundResource(0);
                View view2 = this.f14177p;
                if (view2 == null) {
                    C89219l.m154710a("mEqualLayoutBackground");
                }
                view2.setBackgroundResource(R.drawable.c9j);
            } else if (i == 1) {
                View view3 = this.f14176o;
                if (view3 == null) {
                    C89219l.m154710a("mFloatingWindowBackground");
                }
                view3.setBackgroundResource(R.drawable.c9j);
                View view4 = this.f14177p;
                if (view4 == null) {
                    C89219l.m154710a("mEqualLayoutBackground");
                }
                view4.setBackgroundResource(0);
            }
            int i2 = aVar.f19020b;
            if (i2 == 0) {
                SwitchCompat switchCompat = this.f14172k;
                if (switchCompat == null) {
                    C89219l.m154710a("mSwitch");
                }
                switchCompat.setChecked(true);
            } else if (i2 == 1) {
                SwitchCompat switchCompat2 = this.f14172k;
                if (switchCompat2 == null) {
                    C89219l.m154710a("mSwitch");
                }
                switchCompat2.setChecked(false);
            } else if (i2 == 2) {
                SwitchCompat switchCompat3 = this.f14172k;
                if (switchCompat3 == null) {
                    C89219l.m154710a("mSwitch");
                }
                switchCompat3.setVisibility(8);
            }
        } else {
            View view5 = this.f14176o;
            if (view5 == null) {
                C89219l.m154710a("mFloatingWindowBackground");
            }
            view5.setBackgroundResource(0);
            View view6 = this.f14177p;
            if (view6 == null) {
                C89219l.m154710a("mEqualLayoutBackground");
            }
            view6.setBackgroundResource(0);
        }
    }

    public /* synthetic */ View$OnClickListenerC5559a(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p350a.C5479a.AbstractC5481b
    /* renamed from: a */
    public final void mo11296a(Throwable th) {
        C7676a aVar;
        C5271a aVar2 = this.f14170h;
        if (aVar2 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        } else {
            C7676a aVar3 = aVar2.f13638i;
            if (aVar3 != null) {
                aVar = C7676a.m15669a(aVar3.f19019a, aVar3.f19020b);
                this.f14167e = aVar;
                C11264f.m19958a(getContext(), th, (int) R.string.gj8);
            }
        }
        aVar = null;
        this.f14167e = aVar;
        C11264f.m19958a(getContext(), th, (int) R.string.gj8);
    }

    public final void onClick(View view) {
        C7676a aVar;
        String str;
        Integer valueOf;
        C89219l.m154721d(view, "");
        C5271a aVar2 = this.f14170h;
        if (aVar2 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        Integer num = null;
        if (aVar2 != null) {
            aVar = aVar2.f13638i;
        } else {
            aVar = null;
        }
        View view2 = this.f14176o;
        if (view2 == null) {
            C89219l.m154710a("mFloatingWindowBackground");
        }
        if (C89219l.m154714a(view, view2)) {
            if (aVar != null) {
                num = Integer.valueOf(aVar.f19019a);
            }
            if (num != null && num.intValue() == 1) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e4x);
                return;
            }
            C7676a aVar3 = this.f14167e;
            if (aVar3 != null) {
                aVar3.f19019a = 1;
            }
            m12084e();
            C5586a.m12140b(mo11345c());
            return;
        }
        View view3 = this.f14177p;
        if (view3 == null) {
            C89219l.m154710a("mEqualLayoutBackground");
        }
        if (!C89219l.m154714a(view, view3)) {
            View view4 = this.f14173l;
            if (view4 == null) {
                C89219l.m154710a("mSwitchLayout");
            }
            if (C89219l.m154714a(view, view4)) {
                C7676a aVar4 = this.f14167e;
                if (aVar4 != null) {
                    SwitchCompat switchCompat = this.f14172k;
                    if (switchCompat == null) {
                        C89219l.m154710a("mSwitch");
                    }
                    aVar4.f19020b = switchCompat.isChecked() ? 1 : 0;
                }
                m12084e();
                SwitchCompat switchCompat2 = this.f14172k;
                if (switchCompat2 == null) {
                    C89219l.m154710a("mSwitch");
                }
                if (switchCompat2.isChecked()) {
                    str = "off";
                } else {
                    str = "on";
                }
                C89219l.m154721d(str, "");
                HashMap hashMap = new HashMap();
                C5586a.m12136a(hashMap);
                hashMap.put("connection_type", "guest");
                hashMap.put("switch_to", str);
                C5586a.m12135a("livesdk_layoutsettings_fixed_number_of_windows", hashMap);
            }
        } else if (aVar == null || (valueOf = Integer.valueOf(aVar.f19019a)) == null || valueOf.intValue() != 0) {
            C7676a aVar5 = this.f14167e;
            if (aVar5 != null) {
                aVar5.f19019a = 0;
            }
            m12084e();
            C5586a.m12140b(mo11345c());
        } else {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e4x);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$g */
    public static final class DialogInterface$OnClickListenerC5567g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5559a f14186a;

        static {
            Covode.recordClassIndex(6163);
        }

        DialogInterface$OnClickListenerC5567g(View$OnClickListenerC5559a aVar) {
            this.f14186a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C7676a aVar;
            C5586a.m12133a(this.f14186a.mo11345c(), "cancel");
            View$OnClickListenerC5559a aVar2 = this.f14186a;
            C5271a aVar3 = aVar2.f14170h;
            if (aVar3 == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            } else {
                C7676a aVar4 = aVar3.f13638i;
                if (aVar4 != null) {
                    aVar = C7676a.m15669a(aVar4.f19019a, aVar4.f19020b);
                    aVar2.f14167e = aVar;
                    dialogInterface.dismiss();
                }
            }
            aVar = null;
            aVar2.f14167e = aVar;
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a$f */
    public static final class DialogInterface$OnClickListenerC5566f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5559a f14185a;

        static {
            Covode.recordClassIndex(6162);
        }

        DialogInterface$OnClickListenerC5566f(View$OnClickListenerC5559a aVar) {
            this.f14185a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Long l;
            dialogInterface.dismiss();
            long currentTimeMillis = System.currentTimeMillis();
            if (C5517c.f14099b.size() < C5517c.f14098a) {
                C5517c.f14099b.add(Long.valueOf(currentTimeMillis));
            } else {
                Long l2 = C5517c.f14099b.get(0);
                C89219l.m154716b(l2, "");
                if (currentTimeMillis - l2.longValue() < 60000) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eeu);
                    C5586a.m12133a(this.f14185a.mo11345c(), "switch");
                }
                C5517c.f14099b.remove(0);
                C5517c.f14099b.add(Long.valueOf(currentTimeMillis));
            }
            C5479a.AbstractC5480a aVar = (C5479a.AbstractC5480a) this.f14185a.f12056b;
            if (aVar != null) {
                Room room = (Room) this.f14185a.f14168f.getValue();
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                aVar.mo11294a(l, Long.valueOf((long) ((Number) this.f14185a.f14169g.getValue()).intValue()), this.f14185a.f14167e);
            }
            C5586a.m12133a(this.f14185a.mo11345c(), "switch");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.View$OnClickListenerC5559a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
