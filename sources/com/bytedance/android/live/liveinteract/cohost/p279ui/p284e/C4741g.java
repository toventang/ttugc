package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4703b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.p285a.AbstractC4717a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5692k;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g */
public final class C4741g extends AbstractC89396c<C4703b, C4744c> {

    /* renamed from: a */
    public final DataChannel f12481a;

    /* renamed from: b */
    private final AbstractC4717a f12482b;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$b */
    public enum EnumC4743b {
        NORMAL,
        INVITING,
        UNAVAILABLE;

        static {
            Covode.recordClassIndex(5320);
        }
    }

    static {
        Covode.recordClassIndex(5318);
    }

    /* JADX WARN: Init of enum IS_LINKING can be incorrect */
    /* JADX WARN: Init of enum INVITATION_DENIED can be incorrect */
    /* JADX WARN: Init of enum PERMISSION_DENIED can be incorrect */
    /* JADX WARN: Init of enum LOW_CLIENT_VERSION can be incorrect */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$a */
    public enum EnumC4742a {
        IS_LINKING(r2),
        INVITATION_DENIED(r2),
        PERMISSION_DENIED(r2),
        LOW_CLIENT_VERSION(r2);
        

        /* renamed from: b */
        private final String f12484b;

        public final String getReason() {
            return this.f12484b;
        }

        static {
            Covode.recordClassIndex(5319);
            C89219l.m154716b(C3966y.m9657a((int) R.string.dxo), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.enh), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.eeg), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.enh), "");
        }

        private EnumC4742a(String str) {
            this.f12484b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$d */
    public static final class C4753d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4744c f12504a;

        static {
            Covode.recordClassIndex(5330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4753d(C4744c cVar) {
            super(0);
            this.f12504a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10478a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10478a() {
            int i = C4757h.f12512a[this.f12504a.f12488c.ordinal()];
            if (i == 1) {
                LiveButton f = this.f12504a.mo10477f();
                f.setEnabled(false);
                int i2 = C4384b.C4385a.m10496a().f11924N;
                f.setText(C11266h.m19968a(C3966y.m9657a((int) R.string.dvy), Integer.valueOf(i2)));
            } else if (i == 2) {
                LiveButton f2 = this.f12504a.mo10477f();
                f2.setEnabled(false);
                f2.setText(C3966y.m9657a((int) R.string.dvx));
            } else if (i == 3) {
                LiveButton f3 = this.f12504a.mo10477f();
                f3.setEnabled(true);
                f3.setText(C3966y.m9657a((int) R.string.dvx));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c */
    public final class C4744c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12486a;

        /* renamed from: b */
        final AbstractC89244h f12487b;

        /* renamed from: c */
        public EnumC4743b f12488c = EnumC4743b.NORMAL;

        /* renamed from: d */
        final /* synthetic */ C4741g f12489d;

        /* renamed from: e */
        private final AbstractC89244h f12490e;

        /* renamed from: f */
        private final AbstractC89244h f12491f;

        /* renamed from: g */
        private final AbstractC89244h f12492g;

        /* renamed from: h */
        private final AbstractC89244h f12493h;

        /* renamed from: i */
        private final AbstractC89244h f12494i;

        /* renamed from: j */
        private final AbstractC89244h f12495j;

        static {
            Covode.recordClassIndex(5321);
        }

        /* renamed from: a */
        public final VHeadView mo10471a() {
            return (VHeadView) this.f12490e.getValue();
        }

        /* renamed from: b */
        public final LiveTextView mo10473b() {
            return (LiveTextView) this.f12491f.getValue();
        }

        /* renamed from: c */
        public final AppCompatImageView mo10474c() {
            return (AppCompatImageView) this.f12492g.getValue();
        }

        /* renamed from: d */
        public final LiveTextView mo10475d() {
            return (LiveTextView) this.f12493h.getValue();
        }

        /* renamed from: e */
        public final LiveTextView mo10476e() {
            return (LiveTextView) this.f12494i.getValue();
        }

        /* renamed from: f */
        public final LiveButton mo10477f() {
            return (LiveButton) this.f12495j.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$a */
        static final class C4745a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12496a;

            static {
                Covode.recordClassIndex(5322);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4745a(View view) {
                super(0);
                this.f12496a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12496a.findViewById(R.id.exf);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$b */
        static final class C4746b extends AbstractC89220m implements AbstractC89171a<LiveButton> {

            /* renamed from: a */
            final /* synthetic */ View f12497a;

            static {
                Covode.recordClassIndex(5323);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4746b(View view) {
                super(0);
                this.f12497a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveButton invoke() {
                return this.f12497a.findViewById(R.id.wh);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$c */
        static final class C4747c extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12498a;

            static {
                Covode.recordClassIndex(5324);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4747c(View view) {
                super(0);
                this.f12498a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f12498a.findViewById(R.id.bww);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$d */
        static final class C4748d extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12499a;

            static {
                Covode.recordClassIndex(5325);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4748d(View view) {
                super(0);
                this.f12499a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12499a.findViewById(R.id.exd);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$e */
        static final class C4749e extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12500a;

            static {
                Covode.recordClassIndex(5326);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4749e(View view) {
                super(0);
                this.f12500a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f12500a.findViewById(R.id.bwy);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$f */
        static final class C4750f extends AbstractC89220m implements AbstractC89171a<VHeadView> {

            /* renamed from: a */
            final /* synthetic */ View f12501a;

            static {
                Covode.recordClassIndex(5327);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4750f(View view) {
                super(0);
                this.f12501a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ VHeadView invoke() {
                return this.f12501a.findViewById(R.id.bwx);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$g */
        static final class C4751g extends AbstractC89220m implements AbstractC89171a<AppCompatImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12502a;

            static {
                Covode.recordClassIndex(5328);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4751g(View view) {
                super(0);
                this.f12502a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.f12502a.findViewById(R.id.bwz);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$h */
        static final class C4752h extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12503a;

            static {
                Covode.recordClassIndex(5329);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4752h(View view) {
                super(0);
                this.f12503a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12503a.findViewById(R.id.exj);
            }
        }

        /* renamed from: a */
        public final void mo10472a(EnumC4743b bVar) {
            C89219l.m154721d(bVar, "");
            this.f12488c = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4744c(C4741g gVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12489d = gVar;
            this.f12490e = C89250i.m154773a((AbstractC89171a) new C4750f(view));
            this.f12486a = C89250i.m154773a((AbstractC89171a) new C4749e(view));
            this.f12487b = C89250i.m154773a((AbstractC89171a) new C4747c(view));
            this.f12491f = C89250i.m154773a((AbstractC89171a) new C4752h(view));
            this.f12492g = C89250i.m154773a((AbstractC89171a) new C4751g(view));
            this.f12493h = C89250i.m154773a((AbstractC89171a) new C4748d(view));
            this.f12494i = C89250i.m154773a((AbstractC89171a) new C4745a(view));
            this.f12495j = C89250i.m154773a((AbstractC89171a) new C4746b(view));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$g */
    public static final class C4756g implements C4658d.AbstractC4659a {

        /* renamed from: a */
        final /* synthetic */ C4741g f12509a;

        /* renamed from: b */
        final /* synthetic */ C4744c f12510b;

        /* renamed from: c */
        final /* synthetic */ C4703b f12511c;

        static {
            Covode.recordClassIndex(5333);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: a */
        public final void mo10337a() {
            DataChannel dataChannel = this.f12509a.f12481a;
            if (dataChannel != null) {
                dataChannel.mo28319c(C4491b.class);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: b */
        public final void mo10338b() {
            this.f12509a.mo10469a(this.f12510b, this.f12511c);
        }

        C4756g(C4741g gVar, C4744c cVar, C4703b bVar) {
            this.f12509a = gVar;
            this.f12510b = cVar;
            this.f12511c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$f */
    public static final class C4755f extends AbstractC89220m implements AbstractC89172b<Integer, EnumC4742a> {

        /* renamed from: a */
        public static final C4755f f12508a = new C4755f();

        static {
            Covode.recordClassIndex(5332);
        }

        C4755f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EnumC4742a invoke(Integer num) {
            return m10882a(num.intValue());
        }

        /* renamed from: a */
        public static EnumC4742a m10882a(int i) {
            if (i == 1) {
                return EnumC4742a.IS_LINKING;
            }
            if (i == 2) {
                return EnumC4742a.INVITATION_DENIED;
            }
            if (i == 3) {
                return EnumC4742a.PERMISSION_DENIED;
            }
            if (i != 4) {
                return null;
            }
            return EnumC4742a.LOW_CLIENT_VERSION;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$e */
    public static final class View$OnClickListenerC4754e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4741g f12505a;

        /* renamed from: b */
        final /* synthetic */ C4744c f12506b;

        /* renamed from: c */
        final /* synthetic */ C4703b f12507c;

        static {
            Covode.recordClassIndex(5331);
        }

        View$OnClickListenerC4754e(C4741g gVar, C4744c cVar, C4703b bVar) {
            this.f12505a = gVar;
            this.f12506b = cVar;
            this.f12507c = bVar;
        }

        public final void onClick(View view) {
            Room room;
            User owner;
            C4741g gVar = this.f12505a;
            C4744c cVar = this.f12506b;
            C4703b bVar = this.f12507c;
            EnumC4440k b = C4384b.C4385a.m10496a().mo10151b();
            if (cVar.f12488c != EnumC4743b.NORMAL) {
                return;
            }
            if (b == EnumC4440k.INVITING) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e4f);
            } else if (b == EnumC4440k.DISABLED) {
                C6894d a = C6894d.m14753a();
                C89219l.m154716b(a, "");
                if (a.f17258c) {
                    DataChannelGlobal.f42558d.mo28329d(C5692k.class);
                    return;
                }
                DataChannel dataChannel = gVar.f12481a;
                if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null || owner.getSecret() != 1) {
                    gVar.mo10469a(cVar, bVar);
                    return;
                }
                View view2 = cVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                C4658d.m10789a(context, new C4756g(gVar, cVar, bVar)).show();
            }
        }
    }

    public C4741g(AbstractC4717a aVar, DataChannel dataChannel) {
        C89219l.m154721d(aVar, "");
        this.f12482b = aVar;
        this.f12481a = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4744c mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_9, viewGroup, false);
        C89219l.m154716b(a, "");
        C4744c cVar = new C4744c(this, a);
        C3941k.m9600a((HSImageView) cVar.f12486a.getValue(), 2131234735);
        C3941k.m9607a((HSImageView) cVar.f12487b.getValue(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
        return cVar;
    }

    /* renamed from: c */
    private final void m10869c(C4744c cVar, C4703b bVar) {
        C4753d dVar = new C4753d(cVar);
        C7610h hVar = bVar.f12431c;
        if (hVar == null || hVar.f18898f != 0) {
            cVar.mo10472a(EnumC4743b.UNAVAILABLE);
        } else if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && C4384b.C4385a.m10496a().f11924N >= 0 && bVar.f12429a.getOwnerUserId() == C4384b.C4385a.m10496a().f11958f) {
            cVar.mo10472a(EnumC4743b.INVITING);
        } else {
            cVar.mo10472a(EnumC4743b.NORMAL);
        }
        dVar.mo10478a();
        cVar.mo10477f().setOnClickListener(new View$OnClickListenerC4754e(this, cVar, bVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4744c cVar, C4703b bVar) {
        int i;
        C4744c cVar2 = cVar;
        C4703b bVar2 = bVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(bVar2, "");
        m10868b(cVar2, bVar2);
        String str = bVar2.f12432d;
        Room room = bVar2.f12429a;
        EnumC4442m mVar = bVar2.f12430b;
        if (mVar != null) {
            i = mVar.getType();
        } else {
            i = 0;
        }
        C5713h.m12515a(str, room, i, bVar2.f12431c);
    }

    /* renamed from: b */
    private final void m10868b(C4744c cVar, C4703b bVar) {
        int i;
        int i2;
        User owner = bVar.f12429a.getOwner();
        VHeadView a = cVar.mo10471a();
        C89219l.m154716b(owner, "");
        C7577g.m15571a(a, owner.getAvatarThumb(), a.getWidth(), a.getHeight(), 2131234441);
        cVar.mo10473b().setText(owner.displayId);
        cVar.mo10475d().setText(owner.getNickName());
        AppCompatImageView c = cVar.mo10474c();
        if (owner.getAuthenticationInfo() != null) {
            i = 0;
        } else {
            i = 8;
        }
        c.setVisibility(i);
        LiveTextView e = cVar.mo10476e();
        C7610h hVar = bVar.f12431c;
        if (hVar == null || hVar.f18898f != 0) {
            C7610h hVar2 = bVar.f12431c;
            if (hVar2 != null) {
                i2 = hVar2.f18898f;
            } else {
                i2 = 0;
            }
            EnumC4742a a2 = C4755f.m10882a(i2);
            if (a2 != null) {
                e.setVisibility(0);
                e.setText(a2.getReason());
            }
        } else {
            int userCount = bVar.f12429a.getUserCount();
            if (userCount > 0) {
                e.setVisibility(0);
                String a3 = C11207aa.m19863a((long) userCount);
                C89219l.m154716b(a3, "");
                Locale locale = Locale.ROOT;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(a3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = a3.toUpperCase(locale);
                C89219l.m154716b(upperCase, "");
                String a4 = C1764a.m5928a("%s %s", Arrays.copyOf(new Object[]{upperCase, C3966y.m9657a((int) R.string.eey)}, 2));
                C89219l.m154716b(a4, "");
                e.setText(a4);
            } else {
                e.setVisibility(8);
            }
        }
        m10869c(cVar, bVar);
    }

    /* renamed from: a */
    public final void mo10469a(C4744c cVar, C4703b bVar) {
        C4384b.C4385a.m10496a().f11976x = bVar.f12432d;
        cVar.mo10472a(EnumC4743b.INVITING);
        AbstractC4717a aVar = this.f12482b;
        Room room = bVar.f12429a;
        EnumC4442m mVar = bVar.f12430b;
        if (mVar == null) {
            mVar = EnumC4442m.NONE;
        }
        aVar.mo10418a(room, mVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, java.util.List] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10468a(C4744c cVar, C4703b bVar, List list) {
        C4744c cVar2 = cVar;
        C4703b bVar2 = bVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(list, "");
        if (list.size() <= 0) {
            super.mo10468a(cVar2, bVar2, list);
        } else {
            m10868b(cVar2, bVar2);
        }
    }
}
