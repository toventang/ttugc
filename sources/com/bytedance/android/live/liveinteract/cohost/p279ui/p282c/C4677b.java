package com.bytedance.android.live.liveinteract.cohost.p279ui.p282c;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4592a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4702a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4703b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4704c;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4705d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4706e;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4707f;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4708a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4719c;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4722d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4731e;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4738f;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4741g;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4758i;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.p285a.AbstractC4717a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.RandomLinkMicEntranceButton;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5739y;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10088c;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b */
public final class C4677b extends C4462b.AbstractC4464b implements C4708a.AbstractC4710b, AbstractC4717a, C4722d.AbstractC4723a, C4731e.AbstractC4733b {

    /* renamed from: j */
    public static final C4678a f12377j = new C4678a((byte) 0);

    /* renamed from: d */
    public View f12378d;

    /* renamed from: e */
    public final C89399f f12379e;

    /* renamed from: f */
    public boolean f12380f;

    /* renamed from: g */
    public boolean f12381g;

    /* renamed from: h */
    public DataChannel f12382h;

    /* renamed from: i */
    AbstractC88412b f12383i;

    /* renamed from: k */
    private C5739y f12384k;

    /* renamed from: l */
    private final AbstractC89244h f12385l;

    /* renamed from: m */
    private final AbstractC89244h f12386m;

    /* renamed from: n */
    private final AbstractC89244h f12387n;

    /* renamed from: o */
    private final AbstractC89244h f12388o;

    /* renamed from: p */
    private final AbstractC89244h f12389p;

    /* renamed from: q */
    private final AbstractC89244h f12390q;

    /* renamed from: r */
    private HashMap f12391r;

    static {
        Covode.recordClassIndex(5254);
    }

    /* renamed from: i */
    private final View m10808i() {
        return (View) this.f12386m.getValue();
    }

    /* renamed from: j */
    private final RecyclerView m10809j() {
        return (RecyclerView) this.f12387n.getValue();
    }

    /* renamed from: k */
    private final View m10810k() {
        return (View) this.f12388o.getValue();
    }

    /* renamed from: l */
    private final PkInviteUserListRefreshLayout m10811l() {
        return (PkInviteUserListRefreshLayout) this.f12389p.getValue();
    }

    /* renamed from: c */
    public final View mo10419c() {
        return (View) this.f12385l.getValue();
    }

    /* renamed from: e */
    public final RandomLinkMicEntranceButton mo10420e() {
        return (RandomLinkMicEntranceButton) this.f12390q.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$a */
    public static final class C4678a {
        static {
            Covode.recordClassIndex(5255);
        }

        private C4678a() {
        }

        public /* synthetic */ C4678a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$c */
    static final class C4681c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12394a;

        static {
            Covode.recordClassIndex(5258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4681c(C4677b bVar) {
            super(0);
            this.f12394a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C4677b.m10807a(this.f12394a).findViewById(R.id.c40);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$d */
    static final class C4682d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12395a;

        static {
            Covode.recordClassIndex(5259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4682d(C4677b bVar) {
            super(0);
            this.f12395a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C4677b.m10807a(this.f12395a).findViewById(R.id.bq2);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$e */
    static final class C4683e extends AbstractC89220m implements AbstractC89171a<RandomLinkMicEntranceButton> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12396a;

        static {
            Covode.recordClassIndex(5260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4683e(C4677b bVar) {
            super(0);
            this.f12396a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RandomLinkMicEntranceButton invoke() {
            return C4677b.m10807a(this.f12396a).findViewById(R.id.ddx);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$f */
    static final class C4684f extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12397a;

        static {
            Covode.recordClassIndex(5261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4684f(C4677b bVar) {
            super(0);
            this.f12397a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C4677b.m10807a(this.f12397a).findViewById(R.id.bq3);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$g */
    static final class C4685g extends AbstractC89220m implements AbstractC89171a<PkInviteUserListRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12398a;

        static {
            Covode.recordClassIndex(5262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4685g(C4677b bVar) {
            super(0);
            this.f12398a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PkInviteUserListRefreshLayout invoke() {
            return C4677b.m10807a(this.f12398a).findViewById(R.id.bq4);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$h */
    static final class C4686h extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12399a;

        static {
            Covode.recordClassIndex(5263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4686h(C4677b bVar) {
            super(0);
            this.f12399a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return C4677b.m10807a(this.f12399a).findViewById(R.id.bq5);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$j */
    public static final class C4688j implements PkInviteUserListRefreshLayout.AbstractC4796b {

        /* renamed from: a */
        final /* synthetic */ C4677b f12401a;

        static {
            Covode.recordClassIndex(5265);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.AbstractC4796b
        /* renamed from: c */
        public final void mo10428c() {
            this.f12401a.mo10419c().setVisibility(8);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.AbstractC4796b
        /* renamed from: a */
        public final void mo10426a() {
            if (this.f12401a.mo10419c().getVisibility() != 0) {
                this.f12401a.mo10419c().setVisibility(0);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.AbstractC4796b
        /* renamed from: b */
        public final void mo10427b() {
            if (!this.f12401a.f12380f) {
                this.f12401a.f12380f = true;
                C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12401a.f12056b;
                if (aVar != null) {
                    aVar.mo10229a();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4688j(C4677b bVar) {
            this.f12401a = bVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4731e.AbstractC4733b
    /* renamed from: g */
    public final void mo10422g() {
        C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12056b;
        if (aVar != null) {
            aVar.mo10234e();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f12391r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12056b;
        if (aVar != null) {
            aVar.mo10229a();
        }
    }

    /* renamed from: m */
    private final void m10812m() {
        if (this.f12380f) {
            m10811l().f12587p.run();
            this.f12380f = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: b */
    public final void mo10239b() {
        C4469d.AbstractC4474e eVar;
        if (this.mStatusViewValid) {
            this.f12057c.f11914D = 0;
            if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 1 && (eVar = this.f12055a) != null) {
                eVar.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$b */
    static final class C4679b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4677b f12392a;

        static {
            Covode.recordClassIndex(5256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4679b(C4677b bVar) {
            super(0);
            this.f12392a = bVar;
        }

        /* renamed from: a */
        public final View invoke() {
            LayoutInflater from = LayoutInflater.from(this.f12392a.getContext());
            if (from != null) {
                View view = this.f12392a.getView();
                if (!(view instanceof ViewGroup)) {
                    view = null;
                }
                View a = C1764a.m5927a(from, R.layout.be3, (ViewGroup) view, false);
                if (a != null) {
                    a.setOnClickListener(new View$OnClickListenerC4680a(this));
                    return a;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$b$a */
        public static final class View$OnClickListenerC4680a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4679b f12393a;

            static {
                Covode.recordClassIndex(5257);
            }

            View$OnClickListenerC4680a(C4679b bVar) {
                this.f12393a = bVar;
            }

            public final void onClick(View view) {
                this.f12393a.f12392a.mo10421f();
                C4469d.AbstractC4474e eVar = this.f12393a.f12392a.f12055a;
                if (eVar != null) {
                    eVar.mo10258a(C4588x.EnumC4589a.SETTING_FRAGMENT, null);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d.AbstractC4471b
    /* renamed from: d */
    public final C4480f.C4481a mo10252d() {
        C4679b bVar = new C4679b(this);
        C4480f.C4481a aVar = new C4480f.C4481a();
        double e = (double) C3966y.m9668e(C3966y.m9662b());
        Double.isNaN(e);
        aVar.f12063b = (int) (e * 0.7d);
        String a = C3966y.m9657a((int) R.string.dvx);
        C89219l.m154716b(a, "");
        aVar.mo10263a(a);
        aVar.f12064c = this.f12381g;
        aVar.f12066e = bVar.invoke();
        return aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4731e.AbstractC4733b
    /* renamed from: f */
    public final void mo10421f() {
        if (isViewValid() && !this.f12379e.f203060b.isEmpty() && (this.f12379e.f203060b.get(0) instanceof C4706e)) {
            this.f12379e.f203060b.remove(0);
            this.f12379e.notifyItemRemoved(0);
            C89399f fVar = this.f12379e;
            fVar.notifyItemRangeChanged(0, fVar.getItemCount());
            C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12056b;
            if (aVar != null) {
                aVar.mo10233d();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: g_ */
    public final void mo10241g_() {
        AbstractC88412b bVar = this.f12383i;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f12383i = AbstractC88979t.m154284a(1, TimeUnit.SECONDS).mo143271a(new C11191f()).mo143289d(new C4689k(this));
    }

    private C4677b() {
        this.f12385l = C89250i.m154773a((AbstractC89171a) new C4684f(this));
        this.f12386m = C89250i.m154773a((AbstractC89171a) new C4682d(this));
        this.f12387n = C89250i.m154773a((AbstractC89171a) new C4686h(this));
        this.f12388o = C89250i.m154773a((AbstractC89171a) new C4681c(this));
        this.f12389p = C89250i.m154773a((AbstractC89171a) new C4685g(this));
        this.f12390q = C89250i.m154773a((AbstractC89171a) new C4683e(this));
        this.f12379e = new C89399f();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4708a.AbstractC4710b
    /* renamed from: h */
    public final void mo10423h() {
        if (this.mStatusViewValid && this.f12056b != null) {
            if (((C4462b.AbstractC4463a) this.f12056b).f12044a) {
                int i = ((C4462b.AbstractC4463a) this.f12056b).f12046c;
                int i2 = ((C4462b.AbstractC4463a) this.f12056b).f12045b;
                ((C4462b.AbstractC4463a) this.f12056b).mo10231b();
                this.f12379e.notifyItemRangeInserted(i, i2);
                C89399f fVar = this.f12379e;
                int i3 = i + i2;
                fVar.notifyItemRangeChanged(i3, fVar.getItemCount() - i3);
                return;
            }
            ((C4462b.AbstractC4463a) this.f12056b).mo10232c();
            this.f12379e.notifyDataSetChanged();
            m10809j().mo4435d(0);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        HashSet<String> hashSet;
        super.onDestroy();
        int i2 = ((C4462b.AbstractC4463a) this.f12056b).f12049f;
        C5739y yVar = this.f12384k;
        if (yVar == null || (hashSet = yVar.f14560a) == null) {
            i = 0;
        } else {
            i = hashSet.size();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", C4384b.C4385a.m10496a().f11932V);
        hashMap.put("mutual_follow_cnts", String.valueOf(i2));
        hashMap.put("recommend_show_cnts", String.valueOf(i));
        C5713h.m12517a("livesdk_connection_list_show", hashMap);
        AbstractC88412b bVar = this.f12383i;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f12056b != null) {
            this.f12056b.mo10251g();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4722d.AbstractC4723a
    /* renamed from: a */
    public final boolean mo10372a() {
        DataChannel dataChannel = this.f12382h;
        if (dataChannel == null) {
            return false;
        }
        C4502a.m10581a(dataChannel, C4502a.EnumC4508e.TYPE_INVITEE_LIST_DIALOG);
        this.f12055a.dismiss();
        return true;
    }

    public /* synthetic */ C4677b(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$i */
    public static final class C4687i extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C4677b f12400a;

        static {
            Covode.recordClassIndex(5264);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4687i(C4677b bVar) {
            this.f12400a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            LiveTextView liveTextView;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).mo4371k() == ((C4462b.AbstractC4463a) this.f12400a.f12056b).f12047d) {
                RecyclerView.AbstractC1362i layoutManager2 = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                View g = layoutManager2.mo4717g(0);
                Integer num = null;
                if (g != null) {
                    liveTextView = (LiveTextView) g.findViewById(R.id.f21);
                    if (liveTextView != null) {
                        num = Integer.valueOf(liveTextView.getBottom());
                    }
                } else {
                    liveTextView = null;
                }
                ViewGroup.LayoutParams layoutParams = this.f12400a.mo10420e().getLayoutParams();
                if ((layoutParams instanceof FrameLayout.LayoutParams) && num != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = -num.intValue();
                }
                this.f12400a.mo10420e().setLayoutParams(layoutParams);
                boolean z = true;
                if (liveTextView == null || !liveTextView.getGlobalVisibleRect(new Rect())) {
                    z = false;
                }
                if (i2 > 0) {
                    if (!z) {
                        this.f12400a.mo10420e().setVisibility(0);
                    }
                } else if (z) {
                    this.f12400a.mo10420e().setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m10807a(C4677b bVar) {
        View view = bVar.f12378d;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        return view;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: a */
    public final void mo10235a(int i) {
        if (this.mStatusViewValid) {
            this.f12379e.notifyItemChanged(i, C89070n.m154524c(1));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: b */
    public final void mo10240b(Throwable th) {
        C89219l.m154721d(th, "");
        if (this.mStatusViewValid) {
            C11264f.m19957a(getContext(), th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.b$k */
    static final class C4689k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4677b f12402a;

        static {
            Covode.recordClassIndex(5266);
        }

        C4689k(C4677b bVar) {
            this.f12402a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i = 0;
            if (C4595b.m10702b()) {
                C6805b<Boolean> bVar = AbstractC6804a.f17027ca;
                C89219l.m154716b(bVar, "");
                Boolean a = bVar.mo13066a();
                C89219l.m154716b(a, "");
                if (a.booleanValue()) {
                    C89399f fVar = this.f12402a.f12379e;
                    C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12402a.f12056b;
                    if (aVar != null) {
                        i = aVar.f12047d;
                    }
                    fVar.notifyItemChanged(i);
                    this.f12402a.mo10420e().mo9139b();
                    return;
                }
            }
            if (!C4595b.m10702b()) {
                C4677b bVar2 = this.f12402a;
                AbstractC88412b bVar3 = bVar2.f12383i;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                C89399f fVar2 = bVar2.f12379e;
                C4462b.AbstractC4463a aVar2 = (C4462b.AbstractC4463a) bVar2.f12056b;
                if (aVar2 != null) {
                    i = aVar2.f12047d;
                }
                fVar2.notifyItemChanged(i);
                bVar2.mo10420e().mo9139b();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: a */
    public final void mo10236a(C7611i.C7612a aVar) {
        String str;
        String str2;
        C89219l.m154721d(aVar, "");
        mo10420e().setBannerText(aVar);
        RandomLinkMicEntranceButton e = mo10420e();
        C89219l.m154721d(this, "");
        LiveTextView title = e.getTitle();
        C7611i.C7612a aVar2 = e.f12609g;
        if (aVar2 == null || (str = aVar2.f18903a) == null) {
            str = "";
        }
        title.setText(str);
        LiveTextView subTitle = e.getSubTitle();
        C7611i.C7612a aVar3 = e.f12609g;
        if (aVar3 == null || (str2 = aVar3.f18904b) == null) {
            str2 = "";
        }
        subTitle.setText(str2);
        e.getButton().setMaxWidth(Integer.MAX_VALUE);
        e.mo9139b();
        C4592a.m10697a(e.getButton(), (C4722d.AbstractC4723a) this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: a */
    public final void mo10237a(Throwable th) {
        m10812m();
        m10808i().setVisibility(8);
        if (this.mStatusViewValid) {
            m10810k().setVisibility(0);
            m10809j().setVisibility(8);
            C11264f.m19957a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b.AbstractC4464b
    /* renamed from: a */
    public final void mo10238a(boolean z) {
        C89397d dVar;
        m10812m();
        if (this.mStatusViewValid) {
            m10808i().setVisibility(8);
            m10811l().setVisibility(0);
            if (z) {
                m10809j().setVisibility(0);
                m10810k().setVisibility(8);
                this.f12379e.mo143771a(C4706e.class, new C4731e(this));
                this.f12379e.mo143771a(C4705d.class, new C4722d(this));
                this.f12379e.mo143771a(C4707f.class, new C4738f());
                if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 0) {
                    this.f12379e.mo143771a(C4703b.class, new C4741g(this, this.f12382h));
                } else {
                    this.f12379e.mo143771a(C4703b.class, new C4758i(this, this.f12382h));
                }
                this.f12379e.mo143771a(C4704c.class, new C4719c());
                this.f12379e.mo143771a(C4702a.class, new C4708a(this));
                C89399f fVar = this.f12379e;
                C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12056b;
                if (aVar == null || (dVar = aVar.f12048e) == null) {
                    dVar = new C89397d();
                }
                fVar.mo17153a(dVar);
                this.f12379e.notifyDataSetChanged();
                return;
            }
            m10809j().setVisibility(8);
            m10810k().setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.p285a.AbstractC4717a
    /* renamed from: a */
    public final void mo10418a(Room room, EnumC4442m mVar) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(mVar, "");
        if (this.mStatusViewValid) {
            this.f12057c.f11968p = mVar;
            C4462b.AbstractC4463a aVar = (C4462b.AbstractC4463a) this.f12056b;
            if (aVar != null) {
                aVar.mo10230a(room, mVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10085b bVar;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b8e, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f12378d = a;
        RecyclerView j = m10809j();
        getContext();
        j.setLayoutManager(new LinearLayoutManager());
        m10809j().setAdapter(this.f12379e);
        RecyclerView.AbstractC1356f itemAnimator = m10809j().getItemAnimator();
        if (itemAnimator instanceof AbstractC1391ab) {
            ((AbstractC1391ab) itemAnimator).f4621m = false;
        }
        RecyclerView j2 = m10809j();
        C89219l.m154721d(j2, "");
        AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("panel_broadcast_link_slide");
        if (hVar != null) {
            bVar = hVar.getValue();
        } else {
            bVar = null;
        }
        j2.mo4405a(new C10088c(bVar));
        this.f12384k = new C5739y(m10809j());
        m10808i().setVisibility(0);
        this.f12380f = false;
        m10811l().setOnRefreshListener(new C4688j(this));
        m10809j().mo4405a(new C4687i(this));
        View view = this.f12378d;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        return view;
    }
}
