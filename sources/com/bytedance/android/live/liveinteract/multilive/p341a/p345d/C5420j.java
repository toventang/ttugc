package com.bytedance.android.live.liveinteract.multilive.p341a.p345d;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.C4387aa;
import com.bytedance.android.live.liveinteract.api.C4388ab;
import com.bytedance.android.live.liveinteract.api.C4389ac;
import com.bytedance.android.live.liveinteract.api.C4453w;
import com.bytedance.android.live.liveinteract.api.C4456z;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5166e;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p320d.AbstractC5170a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p320d.C5173b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5388d;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5393i;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5395k;
import com.bytedance.android.live.liveinteract.multilive.p341a.p343b.AbstractC5398b;
import com.bytedance.android.live.liveinteract.multilive.p341a.p344c.EnumC5399a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p346e.C5440a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p347f.C5441a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p348g.C5447c;
import com.bytedance.android.live.liveinteract.multilive.p341a.p348g.C5448d;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5594g;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5686e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5712g;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.model.C7606e;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7677b;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j */
public final class C5420j extends AbstractC5439m implements C5134a.AbstractC5136b, C5189g.AbstractC5190a, AbstractC5398b {

    /* renamed from: j */
    public static final C5421a f13968j = new C5421a((byte) 0);

    /* renamed from: a */
    public AbstractC11293v f13969a;

    /* renamed from: b */
    public RecyclerView f13970b;

    /* renamed from: c */
    public final C89399f f13971c;

    /* renamed from: d */
    public DataChannel f13972d;

    /* renamed from: e */
    public DialogC5211a.EnumC5215a f13973e;

    /* renamed from: f */
    public C5134a.AbstractC5135a f13974f;

    /* renamed from: g */
    public C5300c f13975g;

    /* renamed from: h */
    public C5393i f13976h;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: i */
    public C5271a f13977i;

    /* renamed from: k */
    private LiveButton f13978k;

    /* renamed from: l */
    private LiveTextView f13979l;

    /* renamed from: m */
    private AbstractC5170a f13980m;

    /* renamed from: n */
    private AbstractC5170a.C5171a f13981n;

    /* renamed from: o */
    private C5441a f13982o;

    /* renamed from: p */
    private ImageView f13983p;

    /* renamed from: q */
    private View f13984q;

    /* renamed from: r */
    private View f13985r;

    /* renamed from: s */
    private DialogC9148b f13986s;

    /* renamed from: t */
    private HashMap f13987t;

    static {
        Covode.recordClassIndex(6015);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5439m
    /* renamed from: j */
    public final void mo11235j() {
        HashMap hashMap = this.f13987t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.live.liveinteract.multilive.p341a.p345d.AbstractC5439m, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo11235j();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$a */
    public static final class C5421a {
        static {
            Covode.recordClassIndex(6016);
        }

        private C5421a() {
        }

        public /* synthetic */ C5421a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$l */
    static final class C5433l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5420j f13999a;

        static {
            Covode.recordClassIndex(6028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5433l(C5420j jVar) {
            super(0);
            this.f13999a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f13999a.mo11233h();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: a */
    public final void mo10956a() {
        AbstractC11293v vVar = this.f13969a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$m */
    static final class C5434m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5420j f14000a;

        static {
            Covode.recordClassIndex(6029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5434m(C5420j jVar) {
            super(0);
            this.f14000a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC11293v vVar = this.f14000a.f13969a;
            if (vVar != null) {
                vVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    private C5420j() {
        this.f13971c = new C89399f();
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: b */
    public final C5271a mo11228b() {
        C5271a aVar = this.f13977i;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: c */
    public final void mo10957c() {
        mo11234i();
        AbstractC11293v vVar = this.f13969a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C5300c cVar = this.f13975g;
        if (cVar != null) {
            cVar.f13744l = null;
        }
    }

    /* renamed from: k */
    private final void m11910k() {
        if (m11911l()) {
            View view = this.f13985r;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f13985r;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: m */
    private static C7666e m11912m() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return null;
        }
        C7666e eVar = new C7666e();
        eVar.f19003e = 2;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        eVar.f19001c = owner;
        return eVar;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC11137ac<C5832d<C5594g>> t;
        super.onResume();
        C5300c cVar = this.f13975g;
        if (cVar != null && (t = cVar.mo11168t()) != null) {
            t.mo17937a(new C5435n(this), new C5436o(this));
        }
    }

    /* renamed from: l */
    private static boolean m11911l() {
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        if (t == null || t.intValue() != 0) {
            return false;
        }
        C6805b<Boolean> bVar = AbstractC6804a.f17024cT;
        C89219l.m154716b(bVar, "");
        if (!bVar.mo13066a().booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static C7666e m11913n() {
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        if (t == null || t.intValue() != 2) {
            return null;
        }
        C7666e eVar = new C7666e();
        eVar.f19003e = 2;
        eVar.f19001c = C2997d.C2998a.m8305a();
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11230e() {
        C89397d dVar = new C89397d();
        C7666e m = m11912m();
        if (m != null) {
            dVar.add(m);
        }
        if (m11913n() != null) {
            dVar.add(m11913n());
        }
        this.f13971c.mo17153a(dVar);
        this.f13971c.notifyDataSetChanged();
    }

    /* renamed from: h */
    public final void mo11233h() {
        boolean z;
        C5714i.m12564f();
        C5271a aVar = this.f13977i;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        C5134a.AbstractC5135a aVar2 = this.f13974f;
        if (aVar2 == null || aVar2.mo10865a() != 2) {
            z = true;
        } else {
            z = false;
        }
        aVar.f13633d = z;
        C5134a.AbstractC5135a aVar3 = this.f13974f;
        if (aVar3 != null) {
            aVar3.mo10867a(this.f13976h);
        }
    }

    /* renamed from: d */
    public final void mo11229d() {
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        if (t != null && t.intValue() == 0) {
            DataChannel a2 = C17846f.m33055a(this);
            if (a2 != null) {
                EnumC5399a aVar = EnumC5399a.GUEST_PREVIEW;
                C89219l.m154721d(aVar, "");
                aVar.setGoNextPage(true);
                a2.mo28315b(C5388d.class, aVar);
            }
            View view = this.f13985r;
            if (view != null) {
                view.setVisibility(8);
            }
            C6805b<Boolean> bVar = AbstractC6804a.f17024cT;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11231f() {
        Room room;
        User owner;
        String str;
        DialogC9148b bVar;
        DialogC9148b bVar2 = this.f13986s;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.f13986s) == null)) {
            bVar.dismiss();
        }
        String str2 = LinkApi.EnumC7286d.PANEL.value;
        String str3 = "";
        C89219l.m154716b(str2, str3);
        C5714i.m12535a(str2);
        DataChannel dataChannel = this.f13972d;
        if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null || (str = owner.displayId) == null)) {
            str3 = str;
        }
        String a = C3966y.m9660a((int) R.string.dyw, str3);
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
        aVar.f22244a = a;
        this.f13986s = aVar.mo15248b(R.string.e4u).mo15244a(R.string.efw, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5425e(this), false).mo15249b(R.string.eg2, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5426f.f13992a, false).mo15247a();
        C5714i.m12569h();
        DialogC9148b bVar3 = this.f13986s;
        if (bVar3 != null) {
            bVar3.show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11232g() {
        DialogC9148b bVar;
        DialogC9148b bVar2 = this.f13986s;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.f13986s) == null)) {
            bVar.dismiss();
        }
        DialogC9148b a = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.eob).mo15248b(R.string.eoc).mo15244a(R.string.eoa, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5422b(this), false).mo15249b(R.string.efr, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5423c.f13989a, false).mo15247a();
        this.f13986s = a;
        if (a != null) {
            a.show();
        }
    }

    /* renamed from: i */
    public final void mo11234i() {
        m11910k();
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        if (t != null) {
            if (t.intValue() == 0) {
                ImageView imageView = this.f13983p;
                if (imageView != null) {
                    imageView.setBackgroundResource(2131234645);
                }
                ImageView imageView2 = this.f13983p;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                if (this.f13973e == DialogC5211a.EnumC5215a.GO_LIVE) {
                    LiveButton liveButton = this.f13978k;
                    if (liveButton == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton.setText(C3966y.m9657a((int) R.string.gij));
                    LiveButton liveButton2 = this.f13978k;
                    if (liveButton2 == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton2.mo9603b(R.style.st);
                    return;
                }
                LiveButton liveButton3 = this.f13978k;
                if (liveButton3 == null) {
                    C89219l.m154710a("connectSwitchBtn");
                }
                liveButton3.mo9603b(R.style.st);
                LiveButton liveButton4 = this.f13978k;
                if (liveButton4 == null) {
                    C89219l.m154710a("connectSwitchBtn");
                }
                liveButton4.setText(C3966y.m9657a((int) R.string.ejg));
                LiveTextView liveTextView = this.f13979l;
                if (liveTextView == null) {
                    C89219l.m154710a("descTV");
                }
                liveTextView.setVisibility(0);
            } else if (t != null) {
                if (t.intValue() == 2) {
                    ImageView imageView3 = this.f13983p;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    LiveButton liveButton5 = this.f13978k;
                    if (liveButton5 == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton5.mo9603b(R.style.sz);
                    LiveButton liveButton6 = this.f13978k;
                    if (liveButton6 == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton6.setText(C3966y.m9657a((int) R.string.dym));
                    LiveTextView liveTextView2 = this.f13979l;
                    if (liveTextView2 == null) {
                        C89219l.m154710a("descTV");
                    }
                    liveTextView2.setVisibility(8);
                } else if (t.intValue() == 1) {
                    ImageView imageView4 = this.f13983p;
                    if (imageView4 != null) {
                        imageView4.setBackgroundResource(2131234644);
                    }
                    ImageView imageView5 = this.f13983p;
                    if (imageView5 != null) {
                        imageView5.setVisibility(0);
                    }
                    LiveButton liveButton7 = this.f13978k;
                    if (liveButton7 == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton7.mo9603b(R.style.sz);
                    LiveButton liveButton8 = this.f13978k;
                    if (liveButton8 == null) {
                        C89219l.m154710a("connectSwitchBtn");
                    }
                    liveButton8.setText(C3966y.m9657a((int) R.string.dqk));
                    LiveTextView liveTextView3 = this.f13979l;
                    if (liveTextView3 == null) {
                        C89219l.m154710a("descTV");
                    }
                    liveTextView3.setVisibility(0);
                }
            }
        }
    }

    public /* synthetic */ C5420j(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$d */
    public static final class C5424d implements AbstractC6656d {

        /* renamed from: a */
        final /* synthetic */ C5420j f13990a;

        static {
            Covode.recordClassIndex(6019);
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
        /* renamed from: b */
        public final void mo11014b(String... strArr) {
            C89219l.m154721d(strArr, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5424d(C5420j jVar) {
            this.f13990a = jVar;
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
        /* renamed from: a */
        public final void mo11013a(String... strArr) {
            C89219l.m154721d(strArr, "");
            this.f13990a.mo11233h();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$g */
    static final class View$OnClickListenerC5427g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5420j f13993a;

        static {
            Covode.recordClassIndex(6022);
        }

        View$OnClickListenerC5427g(C5420j jVar) {
            this.f13993a = jVar;
        }

        public final void onClick(View view) {
            this.f13993a.mo11229d();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$h */
    static final class View$OnClickListenerC5428h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5420j f13994a;

        static {
            Covode.recordClassIndex(6023);
        }

        View$OnClickListenerC5428h(C5420j jVar) {
            this.f13994a = jVar;
        }

        public final void onClick(View view) {
            this.f13994a.mo11229d();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$o */
    static final class C5436o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5420j f14002a;

        static {
            Covode.recordClassIndex(6031);
        }

        C5436o(C5420j jVar) {
            this.f14002a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f14002a.mo11230e();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$k */
    static final class C5431k extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5420j f13997a;

        static {
            Covode.recordClassIndex(6026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5431k(C5420j jVar) {
            super(1);
            this.f13997a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            RecyclerView recyclerView = this.f13997a.f13970b;
            if (recyclerView == null) {
                C89219l.m154710a("listView");
            }
            recyclerView.postDelayed(new Runnable(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.p341a.p345d.C5420j.C5431k.RunnableC54321 */

                /* renamed from: a */
                final /* synthetic */ C5431k f13998a;

                static {
                    Covode.recordClassIndex(6027);
                }

                {
                    this.f13998a = r1;
                }

                public final void run() {
                    this.f13998a.f13997a.f13971c.notifyDataSetChanged();
                }
            }, 500);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$n */
    static final class C5435n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5420j f14001a;

        static {
            Covode.recordClassIndex(6030);
        }

        C5435n(C5420j jVar) {
            this.f14001a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5594g gVar;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (gVar = (C5594g) dVar.data) != null) {
                this.f14001a.mo11227a(C5166e.m11415a(gVar.f14234a, 2), C5166e.m11415a(gVar.f14235b, 1));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10878a(String str) {
        AbstractC11293v vVar = this.f13969a;
        if (vVar != null) {
            vVar.dismiss();
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e3h);
        DataChannel dataChannel = this.f13972d;
        if (dataChannel != null) {
            if (str == null) {
                str = "";
            }
            dataChannel.mo28320c(C4453w.class, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: b */
    public final void mo10880b(Throwable th) {
        DataChannel dataChannel = this.f13972d;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4456z.class, "");
        }
        C11264f.m19957a(C3966y.m9669e(), th);
        AbstractC11293v vVar = this.f13969a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g.AbstractC5190a
    /* renamed from: c */
    public final void mo10958c(Throwable th) {
        C11264f.m19958a(getContext(), th, (int) R.string.goi);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$j */
    static final class C5430j extends AbstractC89220m implements AbstractC89172b<List<? extends C7666e>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5420j f13996a;

        static {
            Covode.recordClassIndex(6025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5430j(C5420j jVar) {
            super(1);
            this.f13996a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C7666e> list) {
            List<? extends C7666e> list2 = list;
            C89219l.m154721d(list2, "");
            C5420j jVar = this.f13996a;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (t.f19003e == 2) {
                    arrayList.add(t);
                }
            }
            jVar.mo11227a(arrayList, C5420j.m11909a(list2));
            this.f13996a.mo11234i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static List<C7666e> m11909a(List<? extends C7666e> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f19003e == 1) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$i */
    static final class View$OnClickListenerC5429i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5420j f13995a;

        static {
            Covode.recordClassIndex(6024);
        }

        View$OnClickListenerC5429i(C5420j jVar) {
            this.f13995a = jVar;
        }

        public final void onClick(View view) {
            C5420j jVar = this.f13995a;
            C4386c a = C4386c.m10499a();
            C89219l.m154716b(a, "");
            T t = a.f17248n;
            DialogC5211a.EnumC5215a aVar = jVar.f13973e;
            if (aVar != null) {
                int i = C5437k.f14003a[aVar.ordinal()];
                if (i != 1) {
                    if (i != 2 || t == null) {
                        return;
                    }
                    if (t.intValue() == 0) {
                        if (C6894d.m14753a().f17273t >= C6894d.m14753a().f17275v) {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8n);
                            AbstractC11293v vVar = jVar.f13969a;
                            if (vVar != null) {
                                vVar.dismiss();
                                return;
                            }
                            return;
                        }
                        C6894d a2 = C6894d.m14753a();
                        C89219l.m154716b(a2, "");
                        a2.mo13186a(true);
                        C5134a.AbstractC5135a aVar2 = jVar.f13974f;
                        if (aVar2 != null) {
                            aVar2.mo10870a(true);
                        }
                        DataChannel dataChannel = jVar.f13972d;
                        if (dataChannel != null) {
                            dataChannel.mo28320c(C4389ac.class, "");
                        }
                        C4386c.m10499a().mo10159a((Integer) 1);
                    } else if (t.intValue() == 2) {
                        jVar.mo11231f();
                    } else if (t.intValue() == 1) {
                        jVar.mo11232g();
                    }
                } else if (t != null) {
                    if (t.intValue() == 0) {
                        C5134a.AbstractC5135a aVar3 = jVar.f13974f;
                        if (aVar3 != null && !aVar3.mo10875e()) {
                            C6670f.m14183a(jVar.getActivity()).mo12816a(new C5424d(jVar), "android.permission.RECORD_AUDIO", "android.permission.CAMERA");
                        }
                    } else if (t.intValue() == 2) {
                        jVar.mo11231f();
                    } else if (t.intValue() == 1) {
                        jVar.mo11232g();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10879a(Throwable th) {
        C11264f.m19958a(getContext(), th, (int) R.string.go4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$c */
    public static final class DialogInterface$OnClickListenerC5423c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5423c f13989a = new DialogInterface$OnClickListenerC5423c();

        static {
            Covode.recordClassIndex(6018);
        }

        DialogInterface$OnClickListenerC5423c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$f */
    public static final class DialogInterface$OnClickListenerC5426f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5426f f13992a = new DialogInterface$OnClickListenerC5426f();

        static {
            Covode.recordClassIndex(6021);
        }

        DialogInterface$OnClickListenerC5426f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            C5714i.m12553b(0);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo11226a(DialogC5211a.EnumC5215a aVar, C5393i iVar) {
        this.f13973e = aVar;
        this.f13976h = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$b */
    public static final class DialogInterface$OnClickListenerC5422b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5420j f13988a;

        static {
            Covode.recordClassIndex(6017);
        }

        DialogInterface$OnClickListenerC5422b(C5420j jVar) {
            this.f13988a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            C5300c cVar = this.f13988a.f13975g;
            if (cVar != null) {
                cVar.mo11155g("leave_source_user_click_cancel");
            }
            C5703b.m12459a(this.f13988a.mo11228b().f13646q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.j$e */
    public static final class DialogInterface$OnClickListenerC5425e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5420j f13991a;

        static {
            Covode.recordClassIndex(6020);
        }

        DialogInterface$OnClickListenerC5425e(C5420j jVar) {
            this.f13991a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            C5714i.m12553b(1);
            dialogInterface.dismiss();
            C5300c cVar = this.f13991a.f13975g;
            if (cVar != null) {
                cVar.mo11154f("leave_normally");
            }
            C5712g.m12498a("guest_over", this.f13991a.mo11228b().f13646q);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10877a(C7606e eVar, boolean z) {
        long j;
        C89219l.m154721d(eVar, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        a.f17259d = eVar.f18874m;
        C6898g gVar = C6898g.C6899a.f17285a;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        gVar.mo13199a(j, eVar.f18874m);
        if (z) {
            DataChannel dataChannel = this.f13972d;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4387aa.class, Boolean.valueOf(z));
            }
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.f18876o) {
                C7677b bVar = new C7677b();
                bVar.f19021a = eVar.f18876o;
                bVar.f19022b = eVar.f18877p;
                bVar.f19023c = eVar.f18878q;
                DataChannel dataChannel2 = this.f13972d;
                if (dataChannel2 != null) {
                    dataChannel2.mo28315b(C4388ab.class, bVar);
                }
            }
        }
        AbstractC11293v vVar = this.f13969a;
        if (vVar != null) {
            vVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo11227a(List<? extends C7666e> list, List<? extends C7666e> list2) {
        long j;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            mo11230e();
            return;
        }
        C89397d dVar = new C89397d();
        dVar.add(m11912m());
        if (list != null && !list.isEmpty()) {
            for (T t : list) {
                User user = t.f19001c;
                C89219l.m154716b(user, "");
                long id = user.getId();
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    j = room.getOwnerUserId();
                } else {
                    j = 0;
                }
                if (id != j) {
                    t.f19003e = 2;
                    dVar.add(t);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            dVar.add(new C5440a(list2.size()));
            for (T t2 : list2) {
                t2.f19003e = 1;
                dVar.add(t2);
            }
        }
        this.f13971c.mo17153a(dVar);
        this.f13971c.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        this.f13980m = new C5173b();
        View a = C1764a.m5927a(layoutInflater, R.layout.b8u, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f13984q = a;
        if (a == null) {
            C89219l.m154710a("mRootView");
        }
        this.f13985r = a.findViewById(R.id.c3b);
        m11910k();
        View view = this.f13985r;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC5427g(this));
        }
        View view2 = this.f13984q;
        if (view2 == null) {
            C89219l.m154710a("mRootView");
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.bt4);
        this.f13983p = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC5428h(this));
        }
        View view3 = this.f13984q;
        if (view3 == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById = view3.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById, "");
        this.f13979l = (LiveTextView) findViewById;
        View view4 = this.f13984q;
        if (view4 == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById2 = view4.findViewById(R.id.akx);
        C89219l.m154716b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f13970b = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("listView");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.f13971c.mo143771a(C7666e.class, new C5447c());
        this.f13971c.mo143771a(C5440a.class, new C5448d());
        RecyclerView recyclerView2 = this.f13970b;
        if (recyclerView2 == null) {
            C89219l.m154710a("listView");
        }
        recyclerView2.setAdapter(this.f13971c);
        View view5 = this.f13984q;
        if (view5 == null) {
            C89219l.m154710a("mRootView");
        }
        View findViewById3 = view5.findViewById(R.id.ac3);
        C89219l.m154716b(findViewById3, "");
        LiveButton liveButton = (LiveButton) findViewById3;
        this.f13978k = liveButton;
        if (liveButton == null) {
            C89219l.m154710a("connectSwitchBtn");
        }
        liveButton.setOnClickListener(new View$OnClickListenerC5429i(this));
        C5441a aVar = new C5441a();
        this.f13982o = aVar;
        aVar.mo10938a(this);
        C5134a.AbstractC5135a aVar2 = this.f13974f;
        if (aVar2 != null) {
            aVar2.mo10938a(this);
        }
        C5300c cVar = this.f13975g;
        if (cVar != null) {
            cVar.f13744l = this;
        }
        mo11234i();
        DataChannel dataChannel = this.f13972d;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C5395k.class, (AbstractC89172b) new C5430j(this)).mo28309a((AbstractC1204m) this, C5686e.class, (AbstractC89172b) new C5431k(this));
        }
        this.f13981n = new AbstractC5170a.C5171a(getContext(), this.f13972d, new C5433l(this), new C5434m(this));
        View view6 = this.f13984q;
        if (view6 == null) {
            C89219l.m154710a("mRootView");
        }
        return view6;
    }
}
