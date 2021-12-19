package com.bytedance.android.live.liveinteract.cohost.p279ui.p282c;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.c */
public final class View$OnClickListenerC4690c extends C4466c.AbstractC4468b implements View.OnClickListener {

    /* renamed from: d */
    public static final C4691a f12403d = new C4691a((byte) 0);

    /* renamed from: e */
    private SwitchCompat f12404e;

    /* renamed from: f */
    private SwitchCompat f12405f;

    /* renamed from: g */
    private View f12406g;

    /* renamed from: h */
    private HashMap f12407h;

    static {
        Covode.recordClassIndex(5267);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b
    /* renamed from: c */
    public final void mo10248c() {
        HashMap hashMap = this.f12407h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo10248c();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.c$a */
    public static final class C4691a {
        static {
            Covode.recordClassIndex(5268);
        }

        private C4691a() {
        }

        public /* synthetic */ C4691a(byte b) {
            this();
        }
    }

    private View$OnClickListenerC4690c() {
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b
    /* renamed from: b */
    public final void mo10246b() {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f12404e;
            if (switchCompat == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f12405f;
            if (switchCompat2 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            C6805b<Boolean> bVar = AbstractC6804a.f16971bT;
            C89219l.m154716b(bVar, "");
            SwitchCompat switchCompat3 = this.f12405f;
            if (switchCompat3 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            C6806c.m14603a(bVar, Boolean.valueOf(switchCompat3.isChecked()));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        C4480f.C4481a aVar = new C4480f.C4481a();
        String string = getString(R.string.ek9);
        C89219l.m154716b(string, "");
        C4480f.C4481a a = aVar.mo10263a(string);
        double e = (double) C3966y.m9668e(C3966y.m9662b());
        Double.isNaN(e);
        a.f12063b = (int) (e * 0.7d);
        a.f12064c = true;
        return a;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b
    /* renamed from: a */
    public final void mo10244a() {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f12404e;
            if (switchCompat == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f12405f;
            if (switchCompat2 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            C6805b<Boolean> bVar = AbstractC6804a.f16970bS;
            C89219l.m154716b(bVar, "");
            SwitchCompat switchCompat3 = this.f12404e;
            if (switchCompat3 == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            C6806c.m14603a(bVar, Boolean.valueOf(switchCompat3.isChecked()));
            C6805b<Boolean> bVar2 = AbstractC6804a.f16971bT;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
        }
    }

    public /* synthetic */ View$OnClickListenerC4690c(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b
    /* renamed from: a */
    public final void mo10245a(Throwable th) {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f12404e;
            if (switchCompat == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f12405f;
            if (switchCompat2 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            C11264f.m19957a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4466c.AbstractC4468b
    /* renamed from: b */
    public final void mo10247b(Throwable th) {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f12404e;
            if (switchCompat == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f12405f;
            if (switchCompat2 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            C11264f.m19957a(getContext(), th);
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        if (view instanceof SwitchCompat) {
            SwitchCompat switchCompat = this.f12404e;
            if (switchCompat == null) {
                C89219l.m154710a("mSwitchApplyInvitations");
            }
            int i = 0;
            switchCompat.setClickable(false);
            SwitchCompat switchCompat2 = this.f12405f;
            if (switchCompat2 == null) {
                C89219l.m154710a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(false);
            int id = view.getId();
            if (id == R.id.edh) {
                SwitchCompat switchCompat3 = this.f12404e;
                if (switchCompat3 == null) {
                    C89219l.m154710a("mSwitchApplyInvitations");
                }
                boolean isChecked = switchCompat3.isChecked();
                SwitchCompat switchCompat4 = this.f12405f;
                if (switchCompat4 == null) {
                    C89219l.m154710a("mSwitchAllowBeSuggested");
                }
                switchCompat4.setChecked(false);
                View view2 = this.f12406g;
                if (view2 == null) {
                    C89219l.m154710a("mLayoutAllowBeSuggested");
                }
                if (!isChecked) {
                    i = 8;
                }
                view2.setVisibility(i);
                C4466c.AbstractC4467a aVar = (C4466c.AbstractC4467a) this.f12056b;
                if (aVar != null) {
                    aVar.mo10242a(isChecked);
                }
                SwitchCompat switchCompat5 = this.f12404e;
                if (switchCompat5 == null) {
                    C89219l.m154710a("mSwitchApplyInvitations");
                }
                boolean isChecked2 = switchCompat5.isChecked();
                HashMap hashMap = new HashMap();
                hashMap.put("is_open", String.valueOf(isChecked2 ? 1 : 0));
                C5713h.m12517a("anchor_connection_open", hashMap);
            } else if (id == R.id.edg) {
                SwitchCompat switchCompat6 = this.f12405f;
                if (switchCompat6 == null) {
                    C89219l.m154710a("mSwitchAllowBeSuggested");
                }
                boolean isChecked3 = switchCompat6.isChecked();
                C4466c.AbstractC4467a aVar2 = (C4466c.AbstractC4467a) this.f12056b;
                if (aVar2 != null) {
                    aVar2.mo10243b(isChecked3);
                }
                C5713h.m12520a(isChecked3, "settings");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.View$OnClickListenerC4690c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
