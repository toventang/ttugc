package com.bytedance.android.livesdk.p424a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.n */
public final class View$OnClickListenerC6448n extends C10935a implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC89244h f16059a = C11831d.m20835a(new C6449a(this));

    /* renamed from: b */
    private HashMap f16060b;

    static {
        Covode.recordClassIndex(7184);
    }

    /* renamed from: a */
    private View m13844a(int i) {
        if (this.f16060b == null) {
            this.f16060b = new HashMap();
        }
        View view = (View) this.f16060b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16060b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final boolean m13845a() {
        return ((Boolean) this.f16059a.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16060b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.n$a */
    static final class C6449a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC6448n f16061a;

        static {
            Covode.recordClassIndex(7185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6449a(View$OnClickListenerC6448n nVar) {
            super(0);
            this.f16061a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            DataChannel a = C17846f.m33055a(this.f16061a);
            if (a != null) {
                bool = (Boolean) a.mo28318b(C9119ed.class);
            } else {
                bool = null;
            }
            return Boolean.valueOf(C11279p.m20012a(bool));
        }
    }

    public final void onClick(View view) {
        EnumC9135q qVar;
        C89219l.m154721d(view, "");
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            int id = view.getId();
            if (id == R.id.cib) {
                C6501b.C6502a.m13948a("livesdk_anchor_admin_list_click").mo12639a().mo12655b();
                C6558k.m14024a(getContext());
                C6805b<Boolean> bVar = AbstractC6804a.f16952bA;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) false);
                C11279p.m20006a(m13844a(R.id.cl6));
                qVar = EnumC9135q.MODERATOR_LIST;
            } else if (id == R.id.coy) {
                C6501b.C6502a.m13948a("livesdk_anchor_mute_list_click").mo12639a().mo12655b();
                qVar = EnumC9135q.MUTE;
            } else if (id == R.id.c2_) {
                C6501b.C6502a.m13948a("livesdk_anchor_blocked_list_click").mo12639a().mo12655b();
                qVar = EnumC9135q.BLOCK;
            } else if (id == R.id.a_c) {
                C6501b.C6502a.m13948a("livesdk_comment_settings_click").mo12658d("live_detail").mo12655b();
                C6805b<Boolean> bVar2 = AbstractC6804a.f16958bG;
                C89219l.m154716b(bVar2, "");
                C6806c.m14603a((C6800c) bVar2, (Object) false);
                C11279p.m20006a(m13844a(R.id.a_d));
                qVar = EnumC9135q.COMMENT_SETTING;
            } else if (id == R.id.dpz) {
                qVar = EnumC9135q.SCREEN_RECORD_SETTING;
            } else if (id == R.id.dea) {
                qVar = EnumC9135q.RANKINGS_SWITCH;
            } else {
                return;
            }
            a.mo28315b(C9136r.class, C9137s.m17357b(qVar));
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Boolean bool;
        RoomAuthStatus roomAuthStatus;
        EnumC11728i iVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C6501b.C6502a.m13948a("livesdk_anchor_set_page_show").mo12639a().mo12655b();
        LiveTextView liveTextView = (LiveTextView) m13844a(R.id.f63);
        if (m13845a()) {
            i = R.string.e5n;
        } else {
            i = R.string.egp;
        }
        liveTextView.setText(i);
        C6805b<Boolean> bVar = AbstractC6804a.f16952bA;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            C11279p.m20017b(m13844a(R.id.cl6));
        }
        C6805b<Boolean> bVar2 = AbstractC6804a.f16958bG;
        C89219l.m154716b(bVar2, "");
        Boolean a2 = bVar2.mo13066a();
        C89219l.m154716b(a2, "");
        if (a2.booleanValue()) {
            C11279p.m20017b(m13844a(R.id.a_d));
        }
        DataChannel a3 = C17846f.m33055a(this);
        Room room = null;
        if (a3 == null || (iVar = (EnumC11728i) a3.mo28318b(C9058bx.class)) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(C11729j.m20690g(iVar));
        }
        int i2 = 8;
        if (C11279p.m20027d(bool) || !m13845a()) {
            LiveTextView liveTextView2 = (LiveTextView) m13844a(R.id.dpz);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        DataChannel a4 = C17846f.m33055a(this);
        if (a4 != null) {
            room = (Room) a4.mo28318b(C9093de.class);
        }
        LiveTextView liveTextView3 = (LiveTextView) m13844a(R.id.dea);
        C89219l.m154716b(liveTextView3, "");
        if ((room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.getRankingsSwitchStatus() != 0) && m13845a()) {
            i2 = 0;
        }
        liveTextView3.setVisibility(i2);
        ((LinearLayout) m13844a(R.id.a_c)).setOnClickListener(this);
        ((LinearLayout) m13844a(R.id.cib)).setOnClickListener(this);
        ((LiveTextView) m13844a(R.id.dea)).setOnClickListener(this);
        m13844a(R.id.coy).setOnClickListener(this);
        ((LiveTextView) m13844a(R.id.c2_)).setOnClickListener(this);
        ((LiveTextView) m13844a(R.id.dpz)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b6i, viewGroup, false);
    }
}
