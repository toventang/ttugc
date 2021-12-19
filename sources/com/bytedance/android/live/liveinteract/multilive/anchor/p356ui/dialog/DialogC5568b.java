package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.AbstractC4085c;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4094h;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.liveinteract.api.C4452v;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4707f;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5166e;
import com.bytedance.android.live.liveinteract.multilive.anchor.p353d.AbstractC5502b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p353d.C5505c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.AbstractC5509a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5510b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p357a.C5534b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.C5539d;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.C5540e;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.C5541f;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5588a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5686e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5742a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.event.C8447a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.widget.AbstractDialogC11425g;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b */
public final class DialogC5568b extends AbstractDialogC11425g implements AbstractC5276a, AbstractC5502b.AbstractC5504b, AbstractC5543h {

    /* renamed from: h */
    public static final C5569a f14187h = new C5569a((byte) 0);

    /* renamed from: a */
    public final DataChannel f14188a;

    /* renamed from: b */
    public final C89399f f14189b = new C89399f();

    /* renamed from: c */
    public C5505c f14190c = new C5505c(this);
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: d */
    public C5271a f14191d;
    @AbstractC4430d(mo10204a = "LINK_USER_INFO_CENTER")

    /* renamed from: e */
    public C5153d f14192e;

    /* renamed from: f */
    final AbstractC1204m f14193f;

    /* renamed from: g */
    public final C5277b f14194g;

    /* renamed from: j */
    private RecyclerView f14195j;

    /* renamed from: k */
    private View f14196k;

    /* renamed from: l */
    private View f14197l;

    /* renamed from: m */
    private LiveLoadingView f14198m;

    /* renamed from: n */
    private int f14199n;

    /* renamed from: o */
    private final HashMap<String, Boolean> f14200o = new HashMap<>();

    /* renamed from: p */
    private boolean f14201p;

    /* renamed from: q */
    private final AbstractC89244h f14202q;

    static {
        Covode.recordClassIndex(6164);
    }

    /* renamed from: h */
    private final DialogC9146a m12092h() {
        return (DialogC9146a) this.f14202q.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public final int mo8350b() {
        return R.layout.b6q;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$a */
    public static final class C5569a {
        static {
            Covode.recordClassIndex(6165);
        }

        private C5569a() {
        }

        public /* synthetic */ C5569a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p353d.AbstractC5502b.AbstractC5504b
    /* renamed from: d */
    public final void mo11303d() {
        mo11357g();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h
    /* renamed from: a */
    public final void mo11325a(boolean z, C7666e eVar) {
        C89219l.m154721d(eVar, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        User user = eVar.f19001c;
        C89219l.m154716b(user, "");
        C5579k kVar = new C5579k(this, eVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d("MultiLive", "");
        C89219l.m154721d(kVar, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            if (z) {
                new LiveDialog.C4056a(context).mo9502a(C3966y.m9660a((int) R.string.ebd, user.displayId)).mo9500a(R.string.ebc, new C5510b.C5513c(context, user, room, kVar)).mo9505b(R.string.eg2, C5510b.C5516d.f14097a).mo9503a().show();
                return;
            }
            C5510b.f14087a.mo142945a(C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6868c().mo13134a(user.getId())).mo13136a(room.getRequestId()).mo13139b("MultiLive").mo13140c("live_anchor_c_audience").mo13138b(room.getId()).mo13142d(room.getLabels()).mo13141c()).mo143254a(new C5510b.C5511a(kVar), new C5510b.C5512b(kVar)));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$f */
    static final class C5574f extends AbstractC89220m implements AbstractC89171a<DialogC9146a> {

        /* renamed from: a */
        final /* synthetic */ Context f14208a;

        static {
            Covode.recordClassIndex(6170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5574f(Context context) {
            super(0);
            this.f14208a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC9146a invoke() {
            DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(this.f14208a);
            aVar.f22148c = false;
            return aVar.mo15240a();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$l */
    static final class C5580l implements AbstractC4085c {

        /* renamed from: a */
        public static final C5580l f14215a = new C5580l();

        static {
            Covode.recordClassIndex(6176);
        }

        C5580l() {
        }

        @Override // com.bytedance.android.live.design.view.AbstractC4085c
        /* renamed from: a */
        public final void mo9539a() {
            C6805b<Boolean> bVar = AbstractC6804a.f17026cV;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11115a() {
        m12095k();
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: c */
    public final void mo11120c() {
        m12095k();
        C11226ao.m19882a(getContext(), (int) R.string.gop);
    }

    /* renamed from: e */
    public final C5271a mo11354e() {
        C5271a aVar = this.f14191d;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        return aVar;
    }

    /* renamed from: i */
    private static C7666e m12093i() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return null;
        }
        C7666e eVar = new C7666e();
        eVar.f19009k = 0;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        eVar.f19001c = owner;
        return eVar;
    }

    /* renamed from: j */
    private static long m12094j() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0;
    }

    /* renamed from: k */
    private final void m12095k() {
        if (m12092h().isShowing()) {
            m12092h().dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f14190c.mo10939g();
        C5271a aVar = this.f14191d;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        aVar.f13648s = false;
    }

    /* renamed from: f */
    public final void mo11356f() {
        LiveLoadingView liveLoadingView = this.f14198m;
        if (liveLoadingView == null) {
            C89219l.m154710a("mLoadView");
        }
        liveLoadingView.setVisibility(8);
        RecyclerView recyclerView = this.f14195j;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11357g() {
        C89397d dVar = new C89397d();
        C7666e i = m12093i();
        if (i != null) {
            dVar.add(i);
        }
        dVar.add(new C5534b());
        this.f14189b.mo17153a(dVar);
        m12095k();
        this.f14189b.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: b */
    public final void mo11118b(long j) {
        boolean z = this.f27387i;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$c */
    static final class C5571c implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5571c f14204a = new C5571c();

        static {
            Covode.recordClassIndex(6167);
        }

        C5571c() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$e */
    static final class C5573e implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        public static final C5573e f14207a = new C5573e();

        static {
            Covode.recordClassIndex(6169);
        }

        C5573e() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            C89219l.m154721d(dialogInterface, "");
            C5714i.m12527a(0);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$j */
    static final class C5578j extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14212a;

        static {
            Covode.recordClassIndex(6174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5578j(DialogC5568b bVar) {
            super(1);
            this.f14212a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f14212a.mo11357g();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: b */
    public final void mo11119b(Throwable th) {
        if (this.f27387i) {
            C11264f.m19958a(getContext(), th, (int) R.string.goc);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11116a(long j) {
        if (this.f27387i) {
            m12095k();
            if (isShowing()) {
                dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: c */
    public final void mo11121c(long j) {
        C89378p<Integer, C7666e> e = mo11355e(j);
        int intValue = e.getFirst().intValue();
        C7666e second = e.getSecond();
        if (intValue != -1) {
            second.f19005g = 2;
            this.f14189b.notifyItemChanged(intValue);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$d */
    static final class C5572d implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14205a;

        /* renamed from: b */
        final /* synthetic */ User f14206b;

        static {
            Covode.recordClassIndex(6168);
        }

        C5572d(DialogC5568b bVar, User user) {
            this.f14205a = bVar;
            this.f14206b = user;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            String str = "";
            C89219l.m154721d(dialogInterface, str);
            C5714i.m12527a(1);
            dialogInterface.dismiss();
            C5277b bVar = this.f14205a.f14194g;
            long id = this.f14206b.getId();
            String secUid = this.f14206b.getSecUid();
            if (secUid != null) {
                str = secUid;
            }
            bVar.mo11125a(id, str, "kickout_with_popup_confirm");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$g */
    static final class View$OnClickListenerC5575g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14209a;

        static {
            Covode.recordClassIndex(6171);
        }

        View$OnClickListenerC5575g(DialogC5568b bVar) {
            this.f14209a = bVar;
        }

        public final void onClick(View view) {
            AbstractC0952i iVar;
            this.f14209a.dismiss();
            DialogC5568b bVar = this.f14209a;
            DataChannel dataChannel = bVar.f14188a;
            C4469d.AbstractC4473d a = C5742a.m12611a(bVar.f14193f);
            if (!(dataChannel == null || (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) == null)) {
                a.show(iVar, "LinkDialog");
            }
            C5586a.m12130a("icon");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$i */
    static final class C5577i extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14211a;

        static {
            Covode.recordClassIndex(6173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5577i(DialogC5568b bVar) {
            super(1);
            this.f14211a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            if (this.f14211a.mo11354e().f13641l > 0 && this.f14211a.mo11354e().f13633d) {
                this.f14211a.mo11354e().f13634e = 1;
                this.f14211a.f14189b.notifyItemChanged(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo11351a(int i) {
        m12092h().mo15238a(getContext().getString(i));
        if (!m12092h().isShowing()) {
            m12092h().show();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$h */
    static final class View$OnClickListenerC5576h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14210a;

        static {
            Covode.recordClassIndex(6172);
        }

        View$OnClickListenerC5576h(DialogC5568b bVar) {
            this.f14210a = bVar;
        }

        public final void onClick(View view) {
            DialogC5568b bVar = this.f14210a;
            if (!C5517c.m12023a()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eeu);
            } else {
                new LiveDialog.C4056a(bVar.getContext()).mo9499a(R.string.e04).mo9504b(R.string.dyv).mo9500a(R.string.dzs, new C5570b(bVar)).mo9505b(R.string.ekj, C5571c.f14204a).mo9503a().show();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h
    /* renamed from: b */
    public final void mo11326b(C7666e eVar) {
        C89219l.m154721d(eVar, "");
        if (!this.f14201p) {
            this.f14201p = true;
            C5277b bVar = this.f14194g;
            User user = eVar.f19001c;
            C89219l.m154716b(user, "");
            long id = user.getId();
            User user2 = eVar.f19001c;
            C89219l.m154716b(user2, "");
            String secUid = user2.getSecUid();
            C89219l.m154716b(secUid, "");
            String a = eVar.mo13898a();
            C89219l.m154716b(a, "");
            bVar.mo11126a(id, secUid, a, 2, true);
            User user3 = eVar.f19001c;
            C89219l.m154716b(user3, "");
            FollowInfo followInfo = user3.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            C5703b.m12474b("click", followInfo.getFollowStatus());
        }
    }

    /* renamed from: e */
    public final C89378p<Integer, C7666e> mo11355e(long j) {
        List<?> list = this.f14189b.f203060b;
        C89219l.m154716b(list, "");
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (t instanceof C7666e) {
                User user = t.f19001c;
                C89219l.m154716b(user, "");
                if (user.getId() == j) {
                    return C89387v.m154943a(Integer.valueOf(i), t);
                }
            }
            i = i2;
        }
        return C89387v.m154943a(-1, new C7666e());
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$b */
    static final class C5570b implements LiveDialog.AbstractC4057b {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14203a;

        static {
            Covode.recordClassIndex(6166);
        }

        C5570b(DialogC5568b bVar) {
            this.f14203a = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
        /* renamed from: a */
        public final void mo8359a(DialogInterface dialogInterface) {
            ActivityC0945e b;
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f14203a.mo11351a(R.string.go6);
            DialogC5568b bVar = this.f14203a;
            C5271a aVar = bVar.f14191d;
            if (aVar == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            }
            if (aVar.f13637h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                C5271a aVar2 = bVar.f14191d;
                if (aVar2 == null) {
                    C89219l.m154710a("mMultiGuestDataHolder");
                }
                if (!aVar2.f13633d && (b = C3888a.m9506b(bVar.getContext())) != null) {
                    C89219l.m154716b(b, "");
                    Context context = bVar.getContext();
                    C89219l.m154716b(context, "");
                    new MultiLiveAnchorOpenCameraDialog(context, bVar.f14188a, b, "close_link").show();
                }
            }
            this.f14203a.f14194g.mo11129a(LinkApi.EnumC7285c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-527").usage("").tag("turn off guest requests").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            C5703b.m12480d("manual_close");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$k */
    public static final class C5579k implements AbstractC5509a {

        /* renamed from: a */
        final /* synthetic */ DialogC5568b f14213a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14214b;

        static {
            Covode.recordClassIndex(6175);
        }

        @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p354e.AbstractC5509a
        /* renamed from: a */
        public final void mo11307a(C11688a aVar) {
            Integer num;
            FollowInfo followInfo;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f27934e);
            } else {
                num = null;
            }
            long j = 1;
            if (num != null) {
                if (num.intValue() == 2) {
                    User user = this.f14214b.f19001c;
                    C89219l.m154716b(user, "");
                    followInfo = user.getFollowInfo();
                    C89219l.m154716b(followInfo, "");
                    j = 2;
                } else if (num.intValue() == 1) {
                    User user2 = this.f14214b.f19001c;
                    C89219l.m154716b(user2, "");
                    followInfo = user2.getFollowInfo();
                    C89219l.m154716b(followInfo, "");
                } else if (num.intValue() == 0) {
                    User user3 = this.f14214b.f19001c;
                    C89219l.m154716b(user3, "");
                    followInfo = user3.getFollowInfo();
                    C89219l.m154716b(followInfo, "");
                    User user4 = this.f14214b.f19001c;
                    C89219l.m154716b(user4, "");
                    FollowInfo followInfo2 = user4.getFollowInfo();
                    C89219l.m154716b(followInfo2, "");
                    long followStatus = followInfo2.getFollowStatus();
                    if (followStatus == 1 || followStatus != 2) {
                        j = 0;
                    } else {
                        j = 3;
                    }
                }
                followInfo.setFollowStatus(j);
            }
            DialogC5568b bVar = this.f14213a;
            User user5 = this.f14214b.f19001c;
            C89219l.m154716b(user5, "");
            int intValue = bVar.mo11355e(user5.getId()).getFirst().intValue();
            if (intValue != -1) {
                this.f14213a.f14189b.notifyItemChanged(intValue);
            }
        }

        C5579k(DialogC5568b bVar, C7666e eVar) {
            this.f14213a = bVar;
            this.f14214b = eVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h
    /* renamed from: a */
    public final void mo11323a(User user) {
        C89219l.m154721d(user, "");
        if (this.f27387i) {
            String a = C3966y.m9660a((int) R.string.dyw, user.displayId);
            LiveDialog.C4056a aVar = new LiveDialog.C4056a(getContext());
            aVar.f11227c = a;
            aVar.mo9504b(R.string.dyx).mo9500a(R.string.e0a, new C5572d(this, user)).mo9505b(R.string.dw2, C5573e.f14207a).mo9503a().show();
            C5714i.m12558c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: d */
    public final void mo11122d(long j) {
        this.f14201p = false;
        int intValue = mo11355e(j).getFirst().intValue();
        if (intValue != -1) {
            List<?> list = this.f14189b.f203060b;
            C89219l.m154716b(list, "");
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = 0;
                    break;
                } else if (list.get(i) instanceof C4707f) {
                    break;
                } else {
                    i++;
                }
            }
            list.remove(intValue);
            this.f14189b.notifyItemChanged(intValue);
            int i2 = this.f14199n - 1;
            this.f14199n = i2;
            if (i2 <= 0) {
                list.remove(i);
                this.f14189b.notifyItemChanged(i);
                if (list.size() == 1) {
                    mo11357g();
                    return;
                }
                return;
            }
            Object obj = list.get(i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
            C4707f fVar = (C4707f) obj;
            int i3 = this.f14199n;
            if (i3 == 1) {
                String a = C3966y.m9660a((int) R.string.e39, Integer.valueOf(i3));
                C89219l.m154716b(a, "");
                fVar.mo10451a(a);
            } else {
                String a2 = C3966y.m9660a((int) R.string.e3_, Integer.valueOf(i3));
                C89219l.m154716b(a2, "");
                fVar.mo10451a(a2);
            }
            this.f14189b.notifyItemChanged(i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h
    /* renamed from: a */
    public final void mo11324a(C7666e eVar) {
        C89219l.m154721d(eVar, "");
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
            C5153d dVar = this.f14192e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C89219l.m154721d(eVar, "");
            Iterator<C7666e> it = dVar.f13348c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7666e next = it.next();
                User user = next.f19001c;
                C89219l.m154716b(user, "");
                long id = user.getId();
                User user2 = eVar.f19001c;
                C89219l.m154716b(user2, "");
                if (id == user2.getId()) {
                    next.f19005g = 3;
                    break;
                }
            }
        }
        User user3 = eVar.f19001c;
        C5271a aVar = this.f14191d;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        C8447a aVar2 = new C8447a(user3, aVar.mo11113d());
        C5271a aVar3 = this.f14191d;
        if (aVar3 == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        aVar2.f20887c = aVar3.f13649t;
        DataChannel dataChannel = this.f14188a;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4452v.class, aVar2);
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.c60);
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        double b = (double) C3966y.m9662b();
        Double.isNaN(b);
        layoutParams.height = (int) (b * 0.7d);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.c60);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setLayoutParams(layoutParams);
        View findViewById = findViewById(R.id.dgw);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f14195j = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager());
        RecyclerView recyclerView2 = this.f14195j;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView2.setAdapter(this.f14189b);
        this.f14189b.mo143771a(C5534b.class, new C5539d(this.f14190c));
        this.f14189b.mo143771a(C4707f.class, new C5540e());
        this.f14189b.mo143771a(C7666e.class, new C5541f(this.f14188a, this));
        View findViewById2 = findViewById(R.id.y4);
        C89219l.m154716b(findViewById2, "");
        this.f14196k = findViewById2;
        View findViewById3 = findViewById(R.id.y2);
        C89219l.m154716b(findViewById3, "");
        this.f14197l = findViewById3;
        View findViewById4 = findViewById(R.id.cf7);
        C89219l.m154716b(findViewById4, "");
        this.f14198m = (LiveLoadingView) findViewById4;
        View view = this.f14196k;
        if (view == null) {
            C89219l.m154710a("mSettingsView");
        }
        view.setOnClickListener(new View$OnClickListenerC5575g(this));
        View view2 = this.f14197l;
        if (view2 == null) {
            C89219l.m154710a("mLayoutCloseView");
        }
        view2.setOnClickListener(new View$OnClickListenerC5576h(this));
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
            C5153d dVar = this.f14192e;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5153d.m11388a(dVar, null, 2);
            C5271a aVar = this.f14191d;
            if (aVar == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            }
            aVar.f13648s = true;
        } else {
            this.f14190c.mo10938a((AbstractC5502b.AbstractC5504b) this);
            this.f14190c.mo11304a();
        }
        C6805b<Boolean> bVar = AbstractC6804a.f17026cV;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (!a.booleanValue()) {
            View view3 = this.f14196k;
            if (view3 == null) {
                C89219l.m154710a("mSettingsView");
            }
            C4097j.m9925a((C4094h) ((C4081a.C4082a) new C4081a.C4082a(view3).mo9558c().mo9554a(5000).mo9556a(C5580l.f14215a)).mo9527a(R.string.dql).mo9530b());
        }
        DataChannel dataChannel = this.f14188a;
        if (dataChannel != null) {
            dataChannel.mo28310a(C5686e.class, (AbstractC89172b) new C5577i(this)).mo28310a(C5588a.class, (AbstractC89172b) new C5578j(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.AbstractC5276a
    /* renamed from: a */
    public final void mo11117a(Throwable th) {
        m12095k();
        if (this.f27387i) {
            C11264f.m19958a(getContext(), th, (int) R.string.god);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC5568b(AbstractC1204m mVar, Context context, C5277b bVar) {
        super(context);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f14193f = mVar;
        this.f14194g = bVar;
        this.f14188a = bVar.f13674o;
        this.f14202q = C89250i.m154773a((AbstractC89171a) new C5574f(context));
        C4431e.f12034a.mo10201a(this);
        bVar.f13662c = this;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5543h
    /* renamed from: a */
    public final void mo11322a(long j, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C5271a aVar = this.f14191d;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        if (aVar.f13641l >= C6894d.m14753a().f17275v) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gog);
            return;
        }
        mo11351a(R.string.goe);
        this.f14194g.mo11126a(j, str, str2, 1, true);
    }

    /* renamed from: b */
    public final void mo11352b(List<? extends C7666e> list, List<? extends C7666e> list2, List<? extends C7666e> list3) {
        int i;
        boolean z;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        this.f14199n = i;
        if ((list == null || list.isEmpty() || (list.size() == 1 && ((C7666e) list.get(0)).f19009k == 0)) && ((list2 == null || list2.isEmpty()) && (list3 == null || list3.isEmpty()))) {
            mo11357g();
            return;
        }
        C89397d dVar = new C89397d();
        dVar.add(m12093i());
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (T t : list) {
                User user = t.f19001c;
                C89219l.m154716b(user, "");
                if (user.getId() != m12094j()) {
                    t.f19009k = 1;
                    dVar.add(t);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                String a = C3966y.m9660a((int) R.string.e39, Integer.valueOf(list2.size()));
                C89219l.m154716b(a, "");
                dVar.add(new C4707f(a));
            } else {
                String a2 = C3966y.m9660a((int) R.string.e3_, Integer.valueOf(list2.size()));
                C89219l.m154716b(a2, "");
                dVar.add(new C4707f(a2));
            }
            for (T t2 : list2) {
                t2.f19009k = 2;
                if (!C89219l.m154714a((Object) this.f14200o.get(t2.mo13898a()), (Object) true)) {
                    HashMap<String, Boolean> hashMap = this.f14200o;
                    String a3 = t2.mo13898a();
                    C89219l.m154716b(a3, "");
                    hashMap.put(a3, true);
                    User user2 = t2.f19001c;
                    C89219l.m154716b(user2, "");
                    FollowInfo followInfo = user2.getFollowInfo();
                    C89219l.m154716b(followInfo, "");
                    C5703b.m12474b("show", followInfo.getFollowStatus());
                }
                dVar.add(t2);
            }
        }
        if (list3 != null && !list3.isEmpty()) {
            String a4 = C3966y.m9657a((int) R.string.enu);
            C89219l.m154716b(a4, "");
            dVar.add(new C4707f(a4));
            for (T t3 : list3) {
                t3.f19009k = 3;
                dVar.add(t3);
            }
        }
        this.f14189b.mo17153a(dVar);
        this.f14189b.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p353d.AbstractC5502b.AbstractC5504b
    /* renamed from: a */
    public final void mo11302a(List<? extends C7664c> list, List<? extends C7664c> list2, List<? extends C7664c> list3) {
        mo11352b(C5166e.m11415a(list, 2), C5166e.m11415a(list2, 1), C5166e.m11415a(list3, 0));
        mo11356f();
    }
}
