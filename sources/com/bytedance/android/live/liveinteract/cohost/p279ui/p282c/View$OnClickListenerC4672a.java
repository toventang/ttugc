package com.bytedance.android.live.liveinteract.cohost.p279ui.p282c;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a */
public final class View$OnClickListenerC4672a extends C4457a.AbstractC4459b implements View.OnClickListener {

    /* renamed from: j */
    public static final C4674b f12354j = new C4674b((byte) 0);

    /* renamed from: d */
    public long f12355d;

    /* renamed from: e */
    public long f12356e;

    /* renamed from: f */
    public EnumC4442m f12357f;

    /* renamed from: g */
    public C4675c f12358g;

    /* renamed from: h */
    public C4673a f12359h;

    /* renamed from: i */
    public boolean f12360i;

    /* renamed from: k */
    private View f12361k;

    /* renamed from: l */
    private WaveEffectView f12362l;

    /* renamed from: m */
    private LiveButton f12363m;

    /* renamed from: n */
    private LiveButton f12364n;

    /* renamed from: o */
    private long f12365o;

    /* renamed from: p */
    private LiveCheckBox f12366p;

    /* renamed from: q */
    private HashMap f12367q;

    static {
        Covode.recordClassIndex(5249);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4459b
    /* renamed from: b */
    public final void mo10228b() {
        HashMap hashMap = this.f12367q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a$b */
    public static final class C4674b {
        static {
            Covode.recordClassIndex(5251);
        }

        private C4674b() {
        }

        /* renamed from: a */
        public static Room m10806a() {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room == null) {
                return new Room();
            }
            return room;
        }

        public /* synthetic */ C4674b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    private View$OnClickListenerC4672a() {
        this.f12357f = EnumC4442m.NONE;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4459b
    /* renamed from: a */
    public final void mo10226a() {
        this.f12055a.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        C4480f.C4481a aVar = new C4480f.C4481a();
        String string = getString(R.string.e8k);
        C89219l.m154716b(string, "");
        C4480f.C4481a a = aVar.mo10263a(string);
        a.f12067f = false;
        return a;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4459b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WaveEffectView waveEffectView = this.f12362l;
        if (waveEffectView == null) {
            C89219l.m154715b();
        }
        waveEffectView.mo11491b();
        C4469d.AbstractC4470a aVar = this.f12056b;
        if (aVar == null) {
            C89219l.m154715b();
        }
        ((C4457a.AbstractC4458a) aVar).mo10222a();
        mo10228b();
    }

    public /* synthetic */ View$OnClickListenerC4672a(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a$a */
    public static final class C4673a {

        /* renamed from: a */
        public long f12368a;

        static {
            Covode.recordClassIndex(5250);
        }

        public C4673a(long j) {
            this.f12368a = j;
        }
    }

    /* renamed from: a */
    private final void m10800a(int i) {
        String str;
        boolean z;
        long j;
        if (this.f12358g != null && this.f12359h != null) {
            if (i == 1) {
                str = "accept";
            } else {
                str = "reject";
            }
            LiveCheckBox liveCheckBox = this.f12366p;
            if (liveCheckBox == null || !liveCheckBox.isChecked()) {
                z = false;
            } else {
                z = true;
            }
            System.currentTimeMillis();
            EnumC4442m mVar = this.f12357f;
            C4675c cVar = this.f12358g;
            long j2 = 0;
            if (cVar != null) {
                j = cVar.f12369a;
            } else {
                j = 0;
            }
            C4673a aVar = this.f12359h;
            if (aVar != null) {
                j2 = aVar.f12368a;
            }
            C5713h.m12508a(mVar, j, j2, str, this.f12356e, z);
        }
    }

    /* renamed from: a */
    public final void mo10415a(boolean z) {
        if (this.mStatusViewValid) {
            if (z) {
                LiveButton liveButton = this.f12364n;
                if (liveButton == null) {
                    C89219l.m154710a("mAcceptText");
                }
                liveButton.setVisibility(8);
                View view = this.f12361k;
                if (view == null) {
                    C89219l.m154710a("mRootView");
                }
                View findViewById = view.findViewById(R.id.fbm);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(8);
                return;
            }
            LiveButton liveButton2 = this.f12364n;
            if (liveButton2 == null) {
                C89219l.m154710a("mAcceptText");
            }
            liveButton2.setVisibility(0);
            View view2 = this.f12361k;
            if (view2 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById2 = view2.findViewById(R.id.fbm);
            C89219l.m154716b(findViewById2, "");
            findViewById2.setVisibility(0);
        }
    }

    public final void onClick(View view) {
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        C4457a.AbstractC4458a aVar;
        C89219l.m154721d(view, "");
        if (!this.f12057c.mo10150a(EnumC4440k.CONNECTION_FINISH)) {
            int id = view.getId();
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(C4674b.m10806a().getId()));
            C4675c cVar = this.f12358g;
            if (cVar != null) {
                hashMap.put("inviter_id", String.valueOf(cVar.f12369a));
            }
            C4673a aVar2 = this.f12359h;
            if (aVar2 != null) {
                hashMap.put("invitee_id", String.valueOf(aVar2.f12368a));
            }
            boolean z2 = true;
            if (id == R.id.exm) {
                i = 2;
            } else {
                i = 1;
                this.f12057c.f11913C = System.currentTimeMillis();
            }
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "reply_status", String.valueOf(i));
            C4617b bVar = C4617b.f12263e;
            C4617b.m10742a((C4617b) "reply_click", (String) jSONObject, (JSONObject) 0);
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            EnumC4442m mVar = this.f12357f;
            LiveCheckBox liveCheckBox = this.f12366p;
            if (liveCheckBox == null || !liveCheckBox.isChecked()) {
                z2 = false;
            }
            HashMap hashMap2 = new HashMap();
            if (z) {
                str = "accept";
            } else {
                str = "refuse";
            }
            hashMap2.put("choose_type", str);
            if (z2) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap2.put("is_turn_off_invitation", str2);
            if (mVar == EnumC4442m.FOLLOW_INVITE) {
                str3 = "mutual_follow";
            } else {
                str3 = "recommend";
            }
            hashMap2.put("invitee_list", str3);
            C5713h.m12517a("connected_popup_click", hashMap2);
            if (this.f12358g != null) {
                C4457a.AbstractC4458a aVar3 = (C4457a.AbstractC4458a) this.f12056b;
                if (aVar3 != null) {
                    long j = this.f12355d;
                    long j2 = this.f12356e;
                    C4675c cVar2 = this.f12358g;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    aVar3.mo10224a(i, j, j2, cVar2.f12369a);
                }
                LiveCheckBox liveCheckBox2 = this.f12366p;
                if (!(liveCheckBox2 == null || !liveCheckBox2.isChecked() || (aVar = (C4457a.AbstractC4458a) this.f12056b) == null)) {
                    aVar.mo10225b();
                }
            }
            C4457a.AbstractC4458a aVar4 = (C4457a.AbstractC4458a) this.f12056b;
            if (aVar4 != null) {
                aVar4.mo10222a();
            }
            m10800a(i);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a$d */
    static final class C4676d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC4672a f12376a;

        static {
            Covode.recordClassIndex(5253);
        }

        C4676d(View$OnClickListenerC4672a aVar) {
            this.f12376a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f12376a.mo10415a(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a.AbstractC4459b
    /* renamed from: a */
    public final void mo10227a(int i, int i2) {
        C4457a.AbstractC4458a aVar;
        if (this.mStatusViewValid) {
            int i3 = this.f12057c.f11935Y;
            long j = 0;
            if (1 <= i3 && i2 >= i3) {
                C4457a.AbstractC4458a aVar2 = (C4457a.AbstractC4458a) this.f12056b;
                if (aVar2 != null) {
                    long j2 = this.f12355d;
                    long j3 = this.f12356e;
                    C4675c cVar = this.f12358g;
                    if (cVar != null) {
                        j = cVar.f12369a;
                    }
                    aVar2.mo10224a(5, j2, j3, j);
                    return;
                }
                return;
            }
            int i4 = i - i2;
            int i5 = i4 - 1;
            if (i5 >= 0) {
                LiveButton liveButton = this.f12363m;
                if (liveButton == null) {
                    C89219l.m154710a("mRefuseText");
                }
                liveButton.setText(C11266h.m19968a(getString(R.string.dwn), Integer.valueOf(i5)));
            }
            if (i4 == 0) {
                if (this.f12358g != null) {
                    C4457a.AbstractC4458a aVar3 = (C4457a.AbstractC4458a) this.f12056b;
                    if (aVar3 != null) {
                        long j4 = this.f12355d;
                        long j5 = this.f12356e;
                        C4675c cVar2 = this.f12358g;
                        if (cVar2 != null) {
                            j = cVar2.f12369a;
                        }
                        aVar3.mo10224a(5, j4, j5, j);
                    }
                    LiveCheckBox liveCheckBox = this.f12366p;
                    if (!(liveCheckBox == null || !liveCheckBox.isChecked() || (aVar = (C4457a.AbstractC4458a) this.f12056b) == null)) {
                        aVar.mo10225b();
                    }
                }
                m10800a(5);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0226  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.View$OnClickListenerC4672a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a$c */
    public static final class C4675c {

        /* renamed from: a */
        public long f12369a;

        /* renamed from: b */
        public ImageModel f12370b;

        /* renamed from: c */
        public String f12371c;

        /* renamed from: d */
        public int f12372d;

        /* renamed from: e */
        public String f12373e;

        /* renamed from: f */
        public String f12374f;

        /* renamed from: g */
        public long f12375g;

        static {
            Covode.recordClassIndex(5252);
        }

        public C4675c(long j, ImageModel imageModel, String str, int i, String str2, String str3, long j2) {
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f12369a = j;
            this.f12370b = imageModel;
            this.f12371c = str;
            this.f12372d = i;
            this.f12373e = str2;
            this.f12374f = str3;
            this.f12375g = j2;
        }
    }
}
