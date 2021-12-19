package com.bytedance.android.live.liveinteract.match.p311ui.p313b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.b.a */
public final class C5022a extends C4942a.AbstractC4946c {

    /* renamed from: f */
    public static final C5023a f13057f = new C5023a((byte) 0);

    /* renamed from: d */
    public int f13058d;

    /* renamed from: e */
    public long f13059e;

    /* renamed from: g */
    private WaveEffectView f13060g;

    /* renamed from: h */
    private HashMap f13061h;

    static {
        Covode.recordClassIndex(5606);
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4946c
    /* renamed from: a */
    public final void mo10669a() {
        HashMap hashMap = this.f13061h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4946c
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo10669a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.b.a$a */
    public static final class C5023a {
        static {
            Covode.recordClassIndex(5607);
        }

        private C5023a() {
        }

        public /* synthetic */ C5023a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        C4480f.C4481a aVar = new C4480f.C4481a();
        String string = getString(R.string.e92);
        C89219l.m154716b(string, "");
        C4480f.C4481a a = aVar.mo10263a(string);
        a.f12063b = 263;
        a.f12067f = false;
        return a;
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4946c
    /* renamed from: a */
    public final void mo10670a(Throwable th) {
        C89219l.m154721d(th, "");
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkv);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.b.a$b */
    static final class View$OnClickListenerC5024b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5022a f13062a;

        static {
            Covode.recordClassIndex(5608);
        }

        View$OnClickListenerC5024b(C5022a aVar) {
            this.f13062a = aVar;
        }

        public final void onClick(View view) {
            C5009a.m11204a(this.f13062a.f13058d, "decline");
            ((C4942a.AbstractC4945b) this.f13062a.f12056b).mo10667a(this.f13062a.f13058d, this.f13062a.f13059e);
            C4469d.AbstractC4474e eVar = this.f13062a.f12055a;
            if (eVar != null) {
                eVar.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.b.a$c */
    static final class View$OnClickListenerC5025c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5022a f13063a;

        static {
            Covode.recordClassIndex(5609);
        }

        View$OnClickListenerC5025c(C5022a aVar) {
            this.f13063a = aVar;
        }

        public final void onClick(View view) {
            C4948b bVar;
            if (this.f13063a.f13058d == 1) {
                bVar = C4947a.f12910b;
            } else {
                bVar = C4947a.f12909a;
            }
            bVar.f12925n = System.currentTimeMillis();
            C5009a.m11204a(this.f13063a.f13058d, "accept");
            ((C4942a.AbstractC4945b) this.f13063a.f12056b).mo10668b(this.f13063a.f13058d, this.f13063a.f13059e);
            C4469d.AbstractC4474e eVar = this.f13063a.f12055a;
            if (eVar != null) {
                eVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4946c
    /* renamed from: b */
    public final void mo10671b(Throwable th) {
        C89219l.m154721d(th, "");
        if (!(th instanceof C2912a) || ((C2908a) th).getErrorCode() != 4004048) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkv);
        } else {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8l);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b8f, viewGroup, false);
        HashMap hashMap = new HashMap();
        C5703b.m12475b(hashMap);
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        C5703b.f14460b = System.currentTimeMillis();
        hashMap.put("time_stamp", String.valueOf(C5703b.f14460b));
        hashMap.put("connection_type", C5703b.EnumC5706c.MANUAL_PK.getType());
        C5703b.m12465a("livesdk_connected_popup_show", hashMap);
        View findViewById = a.findViewById(R.id.ffd);
        C89219l.m154716b(findViewById, "");
        WaveEffectView waveEffectView = (WaveEffectView) findViewById;
        this.f13060g = waveEffectView;
        if (waveEffectView == null) {
            C89219l.m154710a("mWaveEffectView");
        }
        waveEffectView.mo11490a();
        a.findViewById(R.id.wl).setOnClickListener(new View$OnClickListenerC5024b(this));
        a.findViewById(R.id.w_).setOnClickListener(new View$OnClickListenerC5025c(this));
        C89219l.m154716b(a, "");
        User user = (User) C4384b.m10480c("data_guest_user");
        if (user != null) {
            VHeadView vHeadView = (VHeadView) a.findViewById(R.id.bw6);
            ImageModel avatarThumb = user.getAvatarThumb();
            C89219l.m154716b(vHeadView, "");
            C7577g.m15571a(vHeadView, avatarThumb, vHeadView.getWidth(), vHeadView.getHeight(), 2131234441);
            TextView textView = (TextView) a.findViewById(R.id.f02);
            C89219l.m154716b(textView, "");
            textView.setText(user.displayId);
        }
        return a;
    }
}
