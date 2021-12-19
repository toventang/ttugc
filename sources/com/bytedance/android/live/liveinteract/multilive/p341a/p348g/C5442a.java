package com.bytedance.android.live.liveinteract.multilive.p341a.p348g;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4429c;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5592e;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5596i;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5597j;
import com.bytedance.android.live.liveinteract.p256a.p258b.p259a.AbstractC4380b;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.a */
public final class C5442a extends AbstractC4380b<C7666e> {
    @AbstractC4430d(mo10204a = "DATA_CHANNEL")

    /* renamed from: a */
    public DataChannel f14008a;
    @AbstractC4429c(mo10203a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b */
    public C5271a f14009b;

    /* renamed from: c */
    private final VHeadView f14010c;

    /* renamed from: d */
    private final LiveTextView f14011d;

    /* renamed from: e */
    private final LiveTextView f14012e;

    /* renamed from: f */
    private final ImageView f14013f;

    /* renamed from: g */
    private final ImageView f14014g;

    /* renamed from: h */
    private final ImageView f14015h;

    static {
        Covode.recordClassIndex(6037);
    }

    /* renamed from: a */
    public final DataChannel mo11247a() {
        DataChannel dataChannel = this.f14008a;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        return dataChannel;
    }

    /* renamed from: b */
    public final C5271a mo11248b() {
        if (this.f14009b == null) {
            C4431e.f12034a.mo10202b(this);
        }
        return this.f14009b;
    }

    /* renamed from: c */
    public final void mo11249c() {
        C5271a b = mo11248b();
        if (b != null) {
            if (b.f13632c) {
                this.f14014g.setBackground(C3966y.m9665c(2131234523));
            } else {
                this.f14014g.setBackground(C3966y.m9665c(2131234522));
            }
        }
    }

    /* renamed from: d */
    public final void mo11250d() {
        C5271a b = mo11248b();
        if (b != null) {
            if (b.f13633d) {
                this.f14013f.setBackground(C3966y.m9665c(2131234623));
            } else {
                this.f14013f.setBackground(C3966y.m9665c(2131234620));
            }
        }
    }

    /* renamed from: e */
    public final void mo11251e() {
        C5271a b = mo11248b();
        if (b != null) {
            if (b.f13633d) {
                this.f14015h.setBackground(C3966y.m9665c(2131234564));
            } else {
                this.f14015h.setBackground(C3966y.m9665c(2131234566));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.a$a */
    static final class View$OnClickListenerC5443a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5442a f14016a;

        static {
            Covode.recordClassIndex(6038);
        }

        View$OnClickListenerC5443a(C5442a aVar) {
            this.f14016a = aVar;
        }

        public final void onClick(View view) {
            C5271a b = this.f14016a.mo11248b();
            if (b != null) {
                b.f13633d = !b.f13633d;
                this.f14016a.mo11250d();
                this.f14016a.mo11251e();
                this.f14016a.mo11247a().mo28320c(C5597j.class, Boolean.valueOf(b.f13633d));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.a$b */
    static final class View$OnClickListenerC5444b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5442a f14017a;

        static {
            Covode.recordClassIndex(6039);
        }

        View$OnClickListenerC5444b(C5442a aVar) {
            this.f14017a = aVar;
        }

        public final void onClick(View view) {
            C5271a b = this.f14017a.mo11248b();
            if (b != null) {
                b.f13632c = !b.f13632c;
                this.f14017a.mo11249c();
                this.f14017a.mo11247a().mo28320c(C5596i.class, Boolean.valueOf(b.f13632c));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.a$c */
    static final class View$OnClickListenerC5445c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5442a f14018a;

        static {
            Covode.recordClassIndex(6040);
        }

        View$OnClickListenerC5445c(C5442a aVar) {
            this.f14018a = aVar;
        }

        public final void onClick(View view) {
            C5271a b = this.f14018a.mo11248b();
            if (b != null && b.f13633d) {
                if (b.f13635f) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e25);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dva);
                }
                b.f13635f = !b.f13635f;
                this.f14018a.mo11247a().mo28319c(C5592e.class);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5442a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bxa);
        C89219l.m154716b(findViewById, "");
        this.f14010c = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.f6t);
        C89219l.m154716b(findViewById2, "");
        this.f14011d = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f2d);
        C89219l.m154716b(findViewById3, "");
        this.f14012e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bwj);
        C89219l.m154716b(findViewById4, "");
        this.f14013f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bwi);
        C89219l.m154716b(findViewById5, "");
        this.f14014g = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bwk);
        C89219l.m154716b(findViewById6, "");
        this.f14015h = (ImageView) findViewById6;
        C4431e.f12034a.mo10201a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.p256a.p258b.p259a.AbstractC4380b
    /* renamed from: a */
    public final /* synthetic */ void mo10141a(C7666e eVar) {
        String str;
        boolean z;
        C5271a b;
        long j;
        C7666e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        User user = eVar2.f19001c;
        VHeadView vHeadView = this.f14010c;
        C7577g.m15571a(vHeadView, user.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2131234441);
        this.f14011d.setText(user.displayId);
        if (eVar2.f19003e == 2) {
            C89219l.m154716b(user, "");
            C89219l.m154721d(user, "");
            long id = user.getId();
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            if (id == j) {
                str = C3966y.m9657a((int) R.string.e3z);
                C89219l.m154716b(str, "");
            } else {
                FollowInfo followInfo = user.getFollowInfo();
                if (followInfo != null && followInfo.getFollowStatus() == 2) {
                    str = C3966y.m9657a((int) R.string.e1z);
                    C89219l.m154716b(str, "");
                }
                str = "";
            }
        } else {
            if (eVar2.f19003e == 1) {
                if (eVar2.f19006h > 0) {
                    str = C3966y.m9660a((int) R.string.gou, Integer.valueOf(eVar2.f19006h));
                    C89219l.m154716b(str, "");
                } else {
                    int a = C11225an.m19878a((int) ((System.currentTimeMillis() / 1000) - eVar2.f19002d));
                    str = C3966y.m9659a(R.plurals.gh, a, Integer.valueOf(a));
                    C89219l.m154716b(str, "");
                }
            }
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f14012e.setVisibility(8);
        } else {
            this.f14012e.setVisibility(0);
            this.f14012e.setText(str);
        }
        User user2 = eVar2.f19001c;
        C89219l.m154716b(user2, "");
        long id2 = user2.getId();
        AbstractC6872f b2 = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b2, "");
        if (id2 == b2.mo13161c()) {
            C4386c a2 = C4386c.m10499a();
            C89219l.m154716b(a2, "");
            T t = a2.f17248n;
            if (t != null && t.intValue() == 2 && (b = mo11248b()) != null && b.f13642m) {
                this.f14013f.setVisibility(0);
                this.f14014g.setVisibility(0);
                this.f14015h.setVisibility(0);
                mo11250d();
                mo11251e();
                this.f14013f.setOnClickListener(new View$OnClickListenerC5443a(this));
                mo11249c();
                this.f14014g.setOnClickListener(new View$OnClickListenerC5444b(this));
                this.f14015h.setOnClickListener(new View$OnClickListenerC5445c(this));
                return;
            }
        }
        this.f14013f.setVisibility(8);
        this.f14014g.setVisibility(8);
        this.f14015h.setVisibility(8);
    }
}
