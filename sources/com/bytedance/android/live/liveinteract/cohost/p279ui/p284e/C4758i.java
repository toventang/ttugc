package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4490a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4703b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.p285a.AbstractC4717a;
import com.bytedance.android.live.liveinteract.match.p311ui.p315d.C5029a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5692k;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
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

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i */
public final class C4758i extends AbstractC89396c<C4703b, C4761c> {

    /* renamed from: a */
    public final DataChannel f12513a;

    /* renamed from: b */
    private final AbstractC4717a f12514b;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$b */
    public enum EnumC4760b {
        NORMAL,
        INVITING,
        UNAVAILABLE;

        static {
            Covode.recordClassIndex(5337);
        }
    }

    static {
        Covode.recordClassIndex(5335);
    }

    /* JADX WARN: Init of enum IS_LINKING can be incorrect */
    /* JADX WARN: Init of enum INVITATION_DENIED can be incorrect */
    /* JADX WARN: Init of enum PERMISSION_DENIED can be incorrect */
    /* JADX WARN: Init of enum LOW_CLIENT_VERSION can be incorrect */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$a */
    public enum EnumC4759a {
        IS_LINKING(r2),
        INVITATION_DENIED(r2),
        PERMISSION_DENIED(r2),
        LOW_CLIENT_VERSION(r2);
        

        /* renamed from: b */
        private final String f12516b;

        public final String getReason() {
            return this.f12516b;
        }

        static {
            Covode.recordClassIndex(5336);
            C89219l.m154716b(C3966y.m9657a((int) R.string.dxo), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.enh), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.eeg), "");
            C89219l.m154716b(C3966y.m9657a((int) R.string.enh), "");
        }

        private EnumC4759a(String str) {
            this.f12516b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$d */
    public static final class C4772d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4761c f12540a;

        static {
            Covode.recordClassIndex(5349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4772d(C4761c cVar) {
            super(0);
            this.f12540a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10492a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10492a() {
            int i = C4776j.f12548a[this.f12540a.f12520c.ordinal()];
            if (i == 1) {
                LiveButton e = this.f12540a.mo10488e();
                int i2 = C4384b.C4385a.m10496a().f11924N;
                if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
                    e.mo9603b(R.style.t1);
                    e.setEnabled(true);
                    e.setText(C11266h.m19968a(C3966y.m9657a((int) R.string.dx9), String.valueOf(i2)));
                    return;
                }
                e.mo9603b(R.style.sw);
                e.setEnabled(false);
                e.setText(C11266h.m19968a(C3966y.m9657a((int) R.string.dvy), Integer.valueOf(i2)));
            } else if (i == 2) {
                LiveButton e2 = this.f12540a.mo10488e();
                e2.mo9603b(R.style.sw);
                e2.setEnabled(false);
                e2.setText(C3966y.m9657a((int) R.string.dvx));
            } else if (i == 3) {
                LiveButton e3 = this.f12540a.mo10488e();
                e3.mo9603b(R.style.sw);
                e3.setEnabled(true);
                e3.setText(C3966y.m9657a((int) R.string.dvx));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c */
    public final class C4761c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12518a;

        /* renamed from: b */
        final AbstractC89244h f12519b;

        /* renamed from: c */
        public EnumC4760b f12520c = EnumC4760b.NORMAL;

        /* renamed from: d */
        final /* synthetic */ C4758i f12521d;

        /* renamed from: e */
        private final AbstractC89244h f12522e;

        /* renamed from: f */
        private final AbstractC89244h f12523f;

        /* renamed from: g */
        private final AbstractC89244h f12524g;

        /* renamed from: h */
        private final AbstractC89244h f12525h;

        /* renamed from: i */
        private final AbstractC89244h f12526i;

        /* renamed from: j */
        private final AbstractC89244h f12527j;

        /* renamed from: k */
        private final AbstractC89244h f12528k;

        /* renamed from: l */
        private final AbstractC89244h f12529l;

        static {
            Covode.recordClassIndex(5338);
        }

        /* renamed from: a */
        public final VHeadView mo10483a() {
            return (VHeadView) this.f12522e.getValue();
        }

        /* renamed from: b */
        public final LiveTextView mo10485b() {
            return (LiveTextView) this.f12523f.getValue();
        }

        /* renamed from: c */
        public final AppCompatImageView mo10486c() {
            return (AppCompatImageView) this.f12524g.getValue();
        }

        /* renamed from: d */
        public final LiveTextView mo10487d() {
            return (LiveTextView) this.f12525h.getValue();
        }

        /* renamed from: e */
        public final LiveButton mo10488e() {
            return (LiveButton) this.f12526i.getValue();
        }

        /* renamed from: f */
        public final LiveTextView mo10489f() {
            return (LiveTextView) this.f12527j.getValue();
        }

        /* renamed from: g */
        public final LiveTextView mo10490g() {
            return (LiveTextView) this.f12528k.getValue();
        }

        /* renamed from: h */
        public final LiveTextView mo10491h() {
            return (LiveTextView) this.f12529l.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$a */
        static final class C4762a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12530a;

            static {
                Covode.recordClassIndex(5339);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4762a(View view) {
                super(0);
                this.f12530a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12530a.findViewById(R.id.exf);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$b */
        static final class C4763b extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12531a;

            static {
                Covode.recordClassIndex(5340);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4763b(View view) {
                super(0);
                this.f12531a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12531a.findViewById(R.id.exg);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$c */
        static final class C4764c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12532a;

            static {
                Covode.recordClassIndex(5341);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4764c(View view) {
                super(0);
                this.f12532a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12532a.findViewById(R.id.exc);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$d */
        static final class C4765d extends AbstractC89220m implements AbstractC89171a<LiveButton> {

            /* renamed from: a */
            final /* synthetic */ View f12533a;

            static {
                Covode.recordClassIndex(5342);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4765d(View view) {
                super(0);
                this.f12533a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveButton invoke() {
                return this.f12533a.findViewById(R.id.wh);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$e */
        static final class C4766e extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12534a;

            static {
                Covode.recordClassIndex(5343);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4766e(View view) {
                super(0);
                this.f12534a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f12534a.findViewById(R.id.bww);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$f */
        static final class C4767f extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12535a;

            static {
                Covode.recordClassIndex(5344);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4767f(View view) {
                super(0);
                this.f12535a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12535a.findViewById(R.id.exi);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$g */
        static final class C4768g extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12536a;

            static {
                Covode.recordClassIndex(5345);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4768g(View view) {
                super(0);
                this.f12536a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f12536a.findViewById(R.id.bwy);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$h */
        static final class C4769h extends AbstractC89220m implements AbstractC89171a<VHeadView> {

            /* renamed from: a */
            final /* synthetic */ View f12537a;

            static {
                Covode.recordClassIndex(5346);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4769h(View view) {
                super(0);
                this.f12537a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ VHeadView invoke() {
                return this.f12537a.findViewById(R.id.bwx);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$i */
        static final class C4770i extends AbstractC89220m implements AbstractC89171a<AppCompatImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12538a;

            static {
                Covode.recordClassIndex(5347);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4770i(View view) {
                super(0);
                this.f12538a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.f12538a.findViewById(R.id.bwz);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$j */
        static final class C4771j extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12539a;

            static {
                Covode.recordClassIndex(5348);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4771j(View view) {
                super(0);
                this.f12539a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12539a.findViewById(R.id.exj);
            }
        }

        /* renamed from: a */
        public final void mo10484a(EnumC4760b bVar) {
            C89219l.m154721d(bVar, "");
            this.f12520c = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4761c(C4758i iVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12521d = iVar;
            this.f12522e = C89250i.m154773a((AbstractC89171a) new C4769h(view));
            this.f12518a = C89250i.m154773a((AbstractC89171a) new C4768g(view));
            this.f12519b = C89250i.m154773a((AbstractC89171a) new C4766e(view));
            this.f12523f = C89250i.m154773a((AbstractC89171a) new C4771j(view));
            this.f12524g = C89250i.m154773a((AbstractC89171a) new C4770i(view));
            this.f12525h = C89250i.m154773a((AbstractC89171a) new C4762a(view));
            this.f12526i = C89250i.m154773a((AbstractC89171a) new C4765d(view));
            this.f12527j = C89250i.m154773a((AbstractC89171a) new C4764c(view));
            this.f12528k = C89250i.m154773a((AbstractC89171a) new C4767f(view));
            this.f12529l = C89250i.m154773a((AbstractC89171a) new C4763b(view));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$g */
    public static final class C4775g implements C4658d.AbstractC4659a {

        /* renamed from: a */
        final /* synthetic */ C4758i f12545a;

        /* renamed from: b */
        final /* synthetic */ C4761c f12546b;

        /* renamed from: c */
        final /* synthetic */ C4703b f12547c;

        static {
            Covode.recordClassIndex(5352);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: a */
        public final void mo10337a() {
            DataChannel dataChannel = this.f12545a.f12513a;
            if (dataChannel != null) {
                dataChannel.mo28319c(C4491b.class);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: b */
        public final void mo10338b() {
            this.f12545a.mo10481b(this.f12546b, this.f12547c);
        }

        C4775g(C4758i iVar, C4761c cVar, C4703b bVar) {
            this.f12545a = iVar;
            this.f12546b = cVar;
            this.f12547c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$f */
    public static final class C4774f extends AbstractC89220m implements AbstractC89172b<Integer, EnumC4759a> {

        /* renamed from: a */
        public static final C4774f f12544a = new C4774f();

        static {
            Covode.recordClassIndex(5351);
        }

        C4774f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EnumC4759a invoke(Integer num) {
            return m10901a(num.intValue());
        }

        /* renamed from: a */
        public static EnumC4759a m10901a(int i) {
            if (i == 1) {
                return EnumC4759a.IS_LINKING;
            }
            if (i == 2) {
                return EnumC4759a.INVITATION_DENIED;
            }
            if (i == 3) {
                return EnumC4759a.PERMISSION_DENIED;
            }
            if (i != 4) {
                return null;
            }
            return EnumC4759a.LOW_CLIENT_VERSION;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$e */
    public static final class View$OnClickListenerC4773e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4758i f12541a;

        /* renamed from: b */
        final /* synthetic */ C4761c f12542b;

        /* renamed from: c */
        final /* synthetic */ C4703b f12543c;

        static {
            Covode.recordClassIndex(5350);
        }

        View$OnClickListenerC4773e(C4758i iVar, C4761c cVar, C4703b bVar) {
            this.f12541a = iVar;
            this.f12542b = cVar;
            this.f12543c = bVar;
        }

        public final void onClick(View view) {
            Room room;
            User owner;
            C4758i iVar = this.f12541a;
            C4761c cVar = this.f12542b;
            C4703b bVar = this.f12543c;
            EnumC4440k b = C4384b.C4385a.m10496a().mo10151b();
            if (cVar.f12520c == EnumC4760b.NORMAL) {
                if (!C4384b.C4385a.m10496a().f11944ag) {
                    C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dx6), 0);
                } else if (b == EnumC4440k.INVITING) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e4f);
                } else if (b == EnumC4440k.DISABLED) {
                    C6894d a = C6894d.m14753a();
                    C89219l.m154716b(a, "");
                    if (a.f17258c) {
                        DataChannelGlobal.f42558d.mo28329d(C5692k.class);
                        return;
                    }
                    DataChannel dataChannel = iVar.f12513a;
                    if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (owner = room.getOwner()) == null || owner.getSecret() != 1) {
                        iVar.mo10481b(cVar, bVar);
                        return;
                    }
                    View view2 = cVar.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    C89219l.m154716b(context, "");
                    C4658d.m10789a(context, new C4775g(iVar, cVar, bVar)).show();
                }
            } else if (cVar.f12520c == EnumC4760b.INVITING && LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
                DataChannel dataChannel2 = iVar.f12513a;
                if (dataChannel2 != null) {
                    dataChannel2.mo28319c(C4490a.class);
                }
                cVar.mo10484a(EnumC4760b.NORMAL);
                iVar.mo10480a(cVar, bVar);
                C5713h.m12509a(bVar.f12430b, "cancel_icon", "withdraw");
            }
        }
    }

    public C4758i(AbstractC4717a aVar, DataChannel dataChannel) {
        C89219l.m154721d(aVar, "");
        this.f12514b = aVar;
        this.f12513a = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4761c mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b__, viewGroup, false);
        C4431e.f12034a.mo10201a(this);
        C89219l.m154716b(a, "");
        C4761c cVar = new C4761c(this, a);
        C3941k.m9600a((HSImageView) cVar.f12518a.getValue(), 2131234735);
        C3941k.m9607a((HSImageView) cVar.f12519b.getValue(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
        return cVar;
    }

    /* renamed from: b */
    public final void mo10481b(C4761c cVar, C4703b bVar) {
        C4384b.C4385a.m10496a().f11976x = bVar.f12432d;
        C4384b.C4385a.m10496a().f11977y = bVar.f12429a;
        C4384b.C4385a.m10496a().f11978z = bVar.f12431c;
        cVar.mo10484a(EnumC4760b.INVITING);
        AbstractC4717a aVar = this.f12514b;
        Room room = bVar.f12429a;
        EnumC4442m mVar = bVar.f12430b;
        if (mVar == null) {
            mVar = EnumC4442m.NONE;
        }
        aVar.mo10418a(room, mVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4761c cVar, C4703b bVar) {
        int i;
        C4761c cVar2 = cVar;
        C4703b bVar2 = bVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(bVar2, "");
        m10885c(cVar2, bVar2);
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10480a(C4761c cVar, C4703b bVar) {
        C4772d dVar = new C4772d(cVar);
        C7610h hVar = bVar.f12431c;
        if (hVar == null || hVar.f18898f != 0) {
            cVar.mo10484a(EnumC4760b.UNAVAILABLE);
        } else if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && C4384b.C4385a.m10496a().f11924N >= 0 && bVar.f12429a.getOwnerUserId() == C4384b.C4385a.m10496a().f11958f) {
            cVar.mo10484a(EnumC4760b.INVITING);
        } else {
            cVar.mo10484a(EnumC4760b.NORMAL);
        }
        dVar.mo10492a();
        cVar.mo10488e().setOnClickListener(new View$OnClickListenerC4773e(this, cVar, bVar));
    }

    /* renamed from: c */
    private final void m10885c(C4761c cVar, C4703b bVar) {
        int i;
        String str;
        int i2;
        User owner = bVar.f12429a.getOwner();
        VHeadView a = cVar.mo10483a();
        C89219l.m154716b(owner, "");
        C7577g.m15571a(a, owner.getAvatarThumb(), a.getWidth(), a.getHeight(), 2131234441);
        cVar.mo10485b().setText(owner.displayId);
        AppCompatImageView c = cVar.mo10486c();
        if (owner.getAuthenticationInfo() != null) {
            i = 0;
        } else {
            i = 8;
        }
        c.setVisibility(i);
        LiveTextView d = cVar.mo10487d();
        int userCount = bVar.f12429a.getUserCount();
        boolean z = true;
        if (userCount > 0) {
            d.setVisibility(0);
            String a2 = C11207aa.m19863a((long) userCount);
            C89219l.m154716b(a2, "");
            Locale locale = Locale.ROOT;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase(locale);
            C89219l.m154716b(upperCase, "");
            String a3 = C1764a.m5928a("%s %s", Arrays.copyOf(new Object[]{upperCase, C3966y.m9657a((int) R.string.eey)}, 2));
            C89219l.m154716b(a3, "");
            d.setText(a3);
        } else {
            d.setVisibility(8);
        }
        if (bVar.f12430b == EnumC4442m.FOLLOW_INVITE) {
            cVar.mo10489f().setVisibility(8);
            C7610h hVar = bVar.f12431c;
            if (hVar == null || hVar.f18898f != 0) {
                z = false;
            }
            C7610h hVar2 = bVar.f12431c;
            if (hVar2 != null) {
                i2 = hVar2.f18898f;
            } else {
                i2 = 0;
            }
            EnumC4759a a4 = C4774f.m10901a(i2);
            if (z || a4 == null) {
                cVar.mo10491h().setVisibility(8);
            } else {
                cVar.mo10491h().setVisibility(0);
                cVar.mo10491h().setText(a4.getReason());
            }
        } else if (bVar.f12430b == EnumC4442m.RECOMMEND_INVITE) {
            User owner2 = bVar.f12429a.getOwner();
            C89219l.m154716b(owner2, "");
            FollowInfo followInfo = owner2.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            if (C13627m.m24498a(C5029a.m11247a(followInfo.getFollowStatus()))) {
                cVar.mo10489f().setVisibility(8);
            } else {
                cVar.mo10489f().setVisibility(0);
                LiveTextView f = cVar.mo10489f();
                User owner3 = bVar.f12429a.getOwner();
                C89219l.m154716b(owner3, "");
                FollowInfo followInfo2 = owner3.getFollowInfo();
                C89219l.m154716b(followInfo2, "");
                f.setText(C5029a.m11247a(followInfo2.getFollowStatus()));
            }
            cVar.mo10491h().setVisibility(8);
        }
        Hashtag hashtag = bVar.f12429a.hashtag;
        String str2 = null;
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        if (C13627m.m24498a(str)) {
            cVar.mo10490g().setVisibility(8);
        } else {
            cVar.mo10490g().setVisibility(0);
            LiveTextView g = cVar.mo10490g();
            Hashtag hashtag2 = bVar.f12429a.hashtag;
            if (hashtag2 != null) {
                str2 = hashtag2.title;
            }
            g.setText(str2);
        }
        mo10480a(cVar, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, java.util.List] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10468a(C4761c cVar, C4703b bVar, List list) {
        C4761c cVar2 = cVar;
        C4703b bVar2 = bVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(list, "");
        if (list.size() <= 0) {
            super.mo10468a(cVar2, bVar2, list);
        } else {
            m10885c(cVar2, bVar2);
        }
    }
}
