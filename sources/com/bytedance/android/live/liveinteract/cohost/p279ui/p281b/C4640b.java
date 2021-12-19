package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Space;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b */
public final class C4640b extends AbstractC11293v {

    /* renamed from: j */
    public static final C4641a f12295j = new C4641a((byte) 0);

    /* renamed from: a */
    public String f12296a;

    /* renamed from: b */
    public String f12297b;

    /* renamed from: c */
    public int f12298c;

    /* renamed from: d */
    public String f12299d;

    /* renamed from: e */
    public String f12300e;

    /* renamed from: f */
    public C4566e f12301f;

    /* renamed from: g */
    public C4384b f12302g;

    /* renamed from: h */
    C4971b f12303h;

    /* renamed from: i */
    public int f12304i;

    /* renamed from: k */
    private HashMap f12305k;

    static {
        Covode.recordClassIndex(5217);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f12305k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f12305k == null) {
            this.f12305k = new HashMap();
        }
        View view = (View) this.f12305k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f12305k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b$a */
    public static final class C4641a {
        static {
            Covode.recordClassIndex(5218);
        }

        private C4641a() {
        }

        public /* synthetic */ C4641a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f12301f = null;
        this.f12303h = null;
        this.f12302g = null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b81);
        bVar.f27015b = R.style.a28;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: a */
    public final C4640b mo10390a(C4971b bVar) {
        C89219l.m154721d(bVar, "");
        this.f12303h = bVar;
        return this;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b$b */
    static final class View$OnClickListenerC4642b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4640b f12306a;

        static {
            Covode.recordClassIndex(5219);
        }

        View$OnClickListenerC4642b(C4640b bVar) {
            this.f12306a = bVar;
        }

        public final void onClick(View view) {
            this.f12306a.dismiss();
            C5713h.m12513a("keep_connect", this.f12306a.f12304i);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b$c */
    static final class View$OnClickListenerC4643c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4640b f12307a;

        static {
            Covode.recordClassIndex(5220);
        }

        View$OnClickListenerC4643c(C4640b bVar) {
            this.f12307a = bVar;
        }

        public final void onClick(View view) {
            C4640b bVar = this.f12307a;
            int i = bVar.f12298c;
            if (i != 1) {
                if (i == 2) {
                    EnumC4949c a = C4947a.f12909a.mo10672a();
                    if (a == EnumC4949c.INVITED) {
                        if (bVar.f12303h != null) {
                            HashMap hashMap = new HashMap();
                            C5703b.m12466a(hashMap);
                            C5703b.m12470a(true, false, (Map<String, String>) hashMap);
                            hashMap.put("invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
                            C5703b.m12465a("livesdk_match_cancel_click", hashMap);
                            C4971b bVar2 = bVar.f12303h;
                            if (bVar2 != null) {
                                bVar2.mo10691a((AbstractC89171a<C89391z>) null);
                            }
                        }
                    } else if (EnumC4949c.START.compareTo((Enum) a) <= 0 && a.compareTo((Enum) EnumC4949c.FINISH) < 0) {
                        C5703b.m12460a(C5703b.EnumC5704a.POSITIVE_OVER);
                        C4971b bVar3 = bVar.f12303h;
                        if (bVar3 != null) {
                            bVar3.mo10688a(101, true, false, null);
                        }
                    }
                }
            } else if (bVar.f12301f != null) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dwz);
                C4384b bVar4 = bVar.f12302g;
                if (bVar4 != null) {
                    bVar4.f11927Q = true;
                }
                JSONObject jSONObject = new JSONObject();
                C4617b bVar5 = C4617b.f12263e;
                C4617b.m10742a((C4617b) "finish_click", (String) jSONObject, (JSONObject) 0);
                C4566e eVar = bVar.f12301f;
                if (eVar != null) {
                    eVar.mo10305b(201);
                }
            }
            this.f12307a.dismiss();
            C5713h.m12513a("disconnect", this.f12307a.f12304i);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b$d */
    static final class C4644d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4640b f12308a;

        static {
            Covode.recordClassIndex(5221);
        }

        C4644d(C4640b bVar) {
            this.f12308a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f12308a.f12304i = z ? 1 : 0;
            C4384b.C4385a.m10496a().f11945ah = z;
            C4640b bVar = this.f12308a;
            if (z) {
                LiveButton liveButton = (LiveButton) bVar.mo8166a_(R.id.crd);
                C89219l.m154716b(liveButton, "");
                liveButton.setVisibility(8);
                Space space = (Space) bVar.mo8166a_(R.id.e4o);
                C89219l.m154716b(space, "");
                space.setVisibility(8);
                return;
            }
            LiveButton liveButton2 = (LiveButton) bVar.mo8166a_(R.id.crd);
            C89219l.m154716b(liveButton2, "");
            liveButton2.setVisibility(0);
            Space space2 = (Space) bVar.mo8166a_(R.id.e4o);
            C89219l.m154716b(space2, "");
            space2.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.f63);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(this.f12296a);
        LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.ev2);
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setText(this.f12297b);
        boolean z2 = false;
        if (C4384b.C4385a.m10496a().f11968p.getType() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 0 || this.f12298c != 1) {
            View a_ = mo8166a_(R.id.ffh);
            C89219l.m154716b(a_, "");
            a_.setVisibility(8);
            LiveCheckBox liveCheckBox = (LiveCheckBox) mo8166a_(R.id.a2c);
            C89219l.m154716b(liveCheckBox, "");
            liveCheckBox.setVisibility(8);
        } else {
            View a_2 = mo8166a_(R.id.ffh);
            C89219l.m154716b(a_2, "");
            a_2.setVisibility(0);
            LiveCheckBox liveCheckBox2 = (LiveCheckBox) mo8166a_(R.id.a2c);
            C89219l.m154716b(liveCheckBox2, "");
            liveCheckBox2.setVisibility(0);
        }
        LiveButton liveButton = (LiveButton) mo8166a_(R.id.crd);
        C89219l.m154716b(liveButton, "");
        liveButton.setText(this.f12300e);
        LiveButton liveButton2 = (LiveButton) mo8166a_(R.id.d4u);
        C89219l.m154716b(liveButton2, "");
        liveButton2.setText(this.f12299d);
        ((LiveButton) mo8166a_(R.id.crd)).setOnClickListener(new View$OnClickListenerC4642b(this));
        ((LiveButton) mo8166a_(R.id.d4u)).setOnClickListener(new View$OnClickListenerC4643c(this));
        ((LiveCheckBox) view.findViewById(R.id.a2c)).setOnCheckedChangeListener(new C4644d(this));
        HashMap hashMap = new HashMap();
        if (C4384b.C4385a.m10496a().f11968p == EnumC4442m.FOLLOW_INVITE) {
            str = "mutual_follow";
        } else {
            str = "recommend";
        }
        hashMap.put("invitee_list", str);
        if (C4947a.f12909a.mo10672a() != EnumC4949c.NORMAL) {
            z2 = true;
        }
        if (!z2) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        C5713h.m12517a("cancel_connection_popup", hashMap);
    }
}
