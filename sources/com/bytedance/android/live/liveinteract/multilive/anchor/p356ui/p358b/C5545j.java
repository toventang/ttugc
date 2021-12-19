package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4429c;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j */
public final class C5545j extends AbstractC5536b<C7666e> {

    /* renamed from: e */
    public static final C5546a f14126e = new C5546a((byte) 0);

    /* renamed from: a */
    public final LiveButton f14127a;
    @AbstractC4429c(mo10203a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b */
    public C5271a f14128b;

    /* renamed from: c */
    public final DataChannel f14129c;

    /* renamed from: d */
    public final AbstractC5543h f14130d;

    /* renamed from: f */
    private final VHeadView f14131f;

    /* renamed from: g */
    private final LiveTextView f14132g;

    /* renamed from: h */
    private final LiveTextView f14133h;

    /* renamed from: i */
    private final ImageView f14134i;

    /* renamed from: j */
    private final ImageView f14135j;

    /* renamed from: k */
    private final ImageView f14136k;

    /* renamed from: l */
    private final LiveButton f14137l;

    /* renamed from: m */
    private final LiveButton f14138m;

    /* renamed from: n */
    private final ImageView f14139n;

    /* renamed from: o */
    private final ImageView f14140o;

    static {
        Covode.recordClassIndex(6140);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$a */
    public static final class C5546a {
        static {
            Covode.recordClassIndex(6141);
        }

        private C5546a() {
        }

        public /* synthetic */ C5546a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C5271a mo11327a() {
        if (this.f14128b == null) {
            C4431e.f12034a.mo10202b(this);
        }
        return this.f14128b;
    }

    /* renamed from: b */
    public final boolean mo11328b() {
        C5271a a = mo11327a();
        if (a != null) {
            return a.f13633d;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11330d() {
        if (mo11328b()) {
            this.f14135j.setBackground(C3966y.m9665c(2131234564));
        } else {
            this.f14135j.setBackground(C3966y.m9665c(2131234566));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11329c() {
        C5271a a;
        C5271a a2 = mo11327a();
        if ((a2 != null && a2.f13641l == 0) || ((a = mo11327a()) != null && a.f13634e == 0)) {
            this.f14134i.setBackground(C3966y.m9665c(2131234621));
        } else if (mo11328b()) {
            this.f14134i.setBackground(C3966y.m9665c(2131234623));
        } else {
            this.f14134i.setBackground(C3966y.m9665c(2131234620));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$g */
    static final class View$OnClickListenerC5552g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14149a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14150b;

        static {
            Covode.recordClassIndex(6147);
        }

        View$OnClickListenerC5552g(C5545j jVar, C7666e eVar) {
            this.f14149a = jVar;
            this.f14150b = eVar;
        }

        public final void onClick(View view) {
            AbstractC5543h hVar = this.f14149a.f14130d;
            if (hVar != null) {
                hVar.mo11326b(this.f14150b);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$e */
    static final class View$OnClickListenerC5550e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14145a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14146b;

        static {
            Covode.recordClassIndex(6145);
        }

        View$OnClickListenerC5550e(C5545j jVar, C7666e eVar) {
            this.f14145a = jVar;
            this.f14146b = eVar;
        }

        public final void onClick(View view) {
            AbstractC5543h hVar = this.f14145a.f14130d;
            if (hVar != null) {
                User user = this.f14146b.f19001c;
                C89219l.m154716b(user, "");
                hVar.mo11323a(user);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$d */
    static final class View$OnClickListenerC5549d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14143a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14144b;

        static {
            Covode.recordClassIndex(6144);
        }

        View$OnClickListenerC5549d(C5545j jVar, C7666e eVar) {
            this.f14143a = jVar;
            this.f14144b = eVar;
        }

        public final void onClick(View view) {
            boolean z;
            AbstractC5543h hVar = this.f14143a.f14130d;
            if (hVar != null) {
                User user = this.f14144b.f19001c;
                C89219l.m154716b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                C89219l.m154716b(followInfo, "");
                if (followInfo.getFollowStatus() != 1) {
                    FollowInfo followInfo2 = user.getFollowInfo();
                    C89219l.m154716b(followInfo2, "");
                    if (followInfo2.getFollowStatus() != 2) {
                        z = false;
                        hVar.mo11325a(z, this.f14144b);
                    }
                }
                z = true;
                hVar.mo11325a(z, this.f14144b);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$f */
    static final class View$OnClickListenerC5551f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14147a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14148b;

        static {
            Covode.recordClassIndex(6146);
        }

        View$OnClickListenerC5551f(C5545j jVar, C7666e eVar) {
            this.f14147a = jVar;
            this.f14148b = eVar;
        }

        public final void onClick(View view) {
            AbstractC5543h hVar = this.f14147a.f14130d;
            if (hVar != null) {
                User user = this.f14148b.f19001c;
                C89219l.m154716b(user, "");
                long id = user.getId();
                User user2 = this.f14148b.f19001c;
                C89219l.m154716b(user2, "");
                String secUid = user2.getSecUid();
                C89219l.m154716b(secUid, "");
                String a = this.f14148b.mo13898a();
                C89219l.m154716b(a, "");
                hVar.mo11322a(id, secUid, a);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$h */
    static final class View$OnClickListenerC5553h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14151a;

        /* renamed from: b */
        final /* synthetic */ C7666e f14152b;

        static {
            Covode.recordClassIndex(6148);
        }

        View$OnClickListenerC5553h(C5545j jVar, C7666e eVar) {
            this.f14151a = jVar;
            this.f14152b = eVar;
        }

        public final void onClick(View view) {
            this.f14151a.f14127a.setEnabled(false);
            this.f14151a.f14127a.setText(C3966y.m9657a((int) R.string.dr7));
            AbstractC5543h hVar = this.f14151a.f14130d;
            if (hVar != null) {
                hVar.mo11324a(this.f14152b);
            }
        }
    }

    /* renamed from: a */
    private static boolean m12075a(User user) {
        long j;
        C89219l.m154721d(user, "");
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (id == j) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$c */
    static final class View$OnClickListenerC5548c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14142a;

        static {
            Covode.recordClassIndex(6143);
        }

        View$OnClickListenerC5548c(C5545j jVar) {
            this.f14142a = jVar;
        }

        public final void onClick(View view) {
            if (this.f14142a.mo11328b()) {
                C6805b<Integer> bVar = AbstractC6804a.f17058i;
                C89219l.m154716b(bVar, "");
                Integer b = bVar.mo13068b();
                if (b != null && b.intValue() == 1) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dva);
                    C6805b<Integer> bVar2 = AbstractC6804a.f17058i;
                    C89219l.m154716b(bVar2, "");
                    bVar2.mo13069b(0);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e25);
                    C6805b<Integer> bVar3 = AbstractC6804a.f17058i;
                    C89219l.m154716b(bVar3, "");
                    bVar3.mo13069b(1);
                }
                C6779a.m14563a().mo13053a(new C7400q(2));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.j$b */
    static final class View$OnClickListenerC5547b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5545j f14141a;

        static {
            Covode.recordClassIndex(6142);
        }

        View$OnClickListenerC5547b(C5545j jVar) {
            this.f14141a = jVar;
        }

        public final void onClick(View view) {
            C5271a a;
            int i;
            C5545j jVar = this.f14141a;
            C5271a a2 = jVar.mo11327a();
            if ((a2 == null || a2.f13641l != 0) && ((a = jVar.mo11327a()) == null || a.f13634e != 0)) {
                boolean z = !jVar.mo11328b();
                C5271a a3 = jVar.mo11327a();
                if (a3 != null) {
                    a3.f13633d = z;
                }
                C5271a a4 = jVar.mo11327a();
                if (a4 != null) {
                    if (z) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    a4.f13634e = i;
                }
                DataChannel dataChannel = jVar.f14129c;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C5590c.class, Boolean.valueOf(z));
                }
                if (z) {
                    C6779a.m14563a().mo13053a(new C7400q(40));
                    C5586a.m12134a("on", "icon", 1);
                } else {
                    C6779a.m14563a().mo13053a(new C7400q(41));
                    C5586a.m12134a("off", "icon", 1);
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.emz);
                }
                jVar.mo11329c();
                jVar.mo11330d();
                return;
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dvz);
            C5586a.m12134a("off", "icon", 0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5536b
    /* renamed from: a */
    public final /* synthetic */ void mo11320a(C7666e eVar) {
        int i;
        C7666e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        User user = eVar2.f19001c;
        VHeadView vHeadView = this.f14131f;
        C7577g.m15571a(vHeadView, user.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2131234441);
        this.f14132g.setText(user.displayId);
        C89219l.m154716b(user, "");
        if (m12075a(user)) {
            this.f14133h.setText(C3966y.m9657a((int) R.string.e40));
            this.f14133h.setVisibility(0);
        } else {
            FollowInfo followInfo = user.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            if (followInfo.getFollowStatus() != 2 || eVar2.f19009k == 1) {
                this.f14133h.setVisibility(8);
            } else {
                this.f14133h.setText(C3966y.m9657a((int) R.string.e21));
                this.f14133h.setVisibility(0);
            }
        }
        this.f14134i.setVisibility(8);
        this.f14135j.setVisibility(8);
        this.f14136k.setVisibility(8);
        this.f14127a.setVisibility(8);
        this.f14127a.setEnabled(true);
        this.f14137l.setVisibility(8);
        this.f14137l.setEnabled(true);
        this.f14140o.setVisibility(8);
        this.f14138m.setVisibility(8);
        this.f14138m.mo9603b(R.style.sw);
        this.f14139n.setVisibility(8);
        User user2 = eVar2.f19001c;
        C89219l.m154716b(user2, "");
        if (m12075a(user2)) {
            i = 0;
        } else {
            i = eVar2.f19009k;
        }
        C3854a.m9453a(6, "MultiLiveLinkPanelUserInfo", "type = ".concat(String.valueOf(i)));
        if (i == 0) {
            if (MultiLiveLinkPanelStyle.INSTANCE.getValue() == 2) {
                this.f14134i.setVisibility(0);
            }
            this.f14135j.setVisibility(0);
            this.f14136k.setVisibility(0);
            mo11329c();
            mo11330d();
            this.f14134i.setOnClickListener(new View$OnClickListenerC5547b(this));
            this.f14135j.setOnClickListener(new View$OnClickListenerC5548c(this));
        } else if (i == 1) {
            this.f14138m.setVisibility(0);
            this.f14139n.setVisibility(0);
            User user3 = eVar2.f19001c;
            C89219l.m154716b(user3, "");
            FollowInfo followInfo2 = user3.getFollowInfo();
            C89219l.m154716b(followInfo2, "");
            long followStatus = followInfo2.getFollowStatus();
            if (followStatus == 0) {
                this.f14138m.setText(C3966y.m9657a((int) R.string.e1l));
            } else if (followStatus == 1) {
                this.f14138m.mo9603b(R.style.t1);
                this.f14138m.setText(C3966y.m9657a((int) R.string.e1s));
            } else if (followStatus == 2) {
                this.f14138m.mo9603b(R.style.t1);
                this.f14138m.setText(C3966y.m9657a((int) R.string.e21));
            } else if (followStatus == 3) {
                this.f14138m.setText(C3966y.m9657a((int) R.string.e1l));
            }
            this.f14138m.setOnClickListener(new View$OnClickListenerC5549d(this, eVar2));
            this.f14139n.setOnClickListener(new View$OnClickListenerC5550e(this, eVar2));
        } else if (i == 2) {
            this.f14137l.setVisibility(0);
            this.f14137l.setText(C3966y.m9657a((int) R.string.dt4));
            this.f14137l.setOnClickListener(new View$OnClickListenerC5551f(this, eVar2));
            this.f14140o.setVisibility(0);
            this.f14140o.setOnClickListener(new View$OnClickListenerC5552g(this, eVar2));
        } else if (i == 3) {
            this.f14127a.setVisibility(0);
            this.f14127a.setOnClickListener(new View$OnClickListenerC5553h(this, eVar2));
            if (eVar2.f19005g != 3) {
                this.f14127a.setText(C3966y.m9657a((int) R.string.e4e));
                this.f14127a.setEnabled(true);
                return;
            }
            this.f14127a.setText(C3966y.m9657a((int) R.string.dr7));
            this.f14127a.setEnabled(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5545j(View view, DataChannel dataChannel, AbstractC5543h hVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f14129c = dataChannel;
        this.f14130d = hVar;
        View findViewById = view.findViewById(R.id.bxa);
        C89219l.m154716b(findViewById, "");
        this.f14131f = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.f6t);
        C89219l.m154716b(findViewById2, "");
        this.f14132g = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f2d);
        C89219l.m154716b(findViewById3, "");
        this.f14133h = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bwh);
        C89219l.m154716b(findViewById4, "");
        this.f14134i = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bwg);
        C89219l.m154716b(findViewById5, "");
        this.f14135j = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bwf);
        C89219l.m154716b(findViewById6, "");
        this.f14136k = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.wu);
        C89219l.m154716b(findViewById7, "");
        this.f14137l = (LiveButton) findViewById7;
        View findViewById8 = view.findViewById(R.id.xm);
        C89219l.m154716b(findViewById8, "");
        this.f14138m = (LiveButton) findViewById8;
        View findViewById9 = view.findViewById(R.id.bwe);
        C89219l.m154716b(findViewById9, "");
        this.f14139n = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.bgw);
        C89219l.m154716b(findViewById10, "");
        this.f14140o = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.y0);
        C89219l.m154716b(findViewById11, "");
        this.f14127a = (LiveButton) findViewById11;
        C4431e.f12034a.mo10201a(this);
    }
}
