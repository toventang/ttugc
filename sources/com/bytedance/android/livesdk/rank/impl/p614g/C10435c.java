package com.bytedance.android.livesdk.rank.impl.p614g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.model.C10347a;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10424l;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.g.c */
public final class C10435c extends AbstractC89396c<C10347a, C10436a> {

    /* renamed from: a */
    public final EnumC10608a f25148a;

    /* renamed from: b */
    public final DataChannel f25149b;

    static {
        Covode.recordClassIndex(12009);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$b */
    static final class C10440b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10347a f25157a;

        static {
            Covode.recordClassIndex(12014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10440b(C10347a aVar) {
            super(0);
            this.f25157a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17293a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17293a() {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f25157a.f24998a.getId());
            userProfileEvent.mClickUserPosition = "top_active_user_rank";
            userProfileEvent.mRankInfo = C10424l.m18942a(this.f25157a);
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$c */
    static final class C10441c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10435c f25158a;

        /* renamed from: b */
        final /* synthetic */ C10436a f25159b;

        /* renamed from: c */
        final /* synthetic */ C10347a f25160c;

        static {
            Covode.recordClassIndex(12015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10441c(C10435c cVar, C10436a aVar, C10347a aVar2) {
            super(0);
            this.f25158a = cVar;
            this.f25159b = aVar;
            this.f25160c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17294a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17294a() {
            int i;
            LiveTextView b = this.f25159b.mo17291b();
            if (this.f25158a.f25148a != EnumC10608a.BOTH_REVENUE || this.f25160c.f24999b <= 0) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$d */
    static final class C10442d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10435c f25161a;

        /* renamed from: b */
        final /* synthetic */ C10436a f25162b;

        /* renamed from: c */
        final /* synthetic */ C10347a f25163c;

        static {
            Covode.recordClassIndex(12016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10442d(C10435c cVar, C10436a aVar, C10347a aVar2) {
            super(0);
            this.f25161a = cVar;
            this.f25162b = aVar;
            this.f25163c = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17295a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17295a() {
            long j;
            try {
                if (this.f25162b.mo17291b().getVisibility() == 0) {
                    Room room = (Room) this.f25161a.f25149b.mo28318b(C9093de.class);
                    if (room != null) {
                        j = room.getOwnerUserId();
                    } else {
                        j = 0;
                    }
                    this.f25162b.mo17291b().setText(C10387b.m18895a().mo17276a(j, this.f25163c.f24999b));
                    if (this.f25163c.f24999b > 0) {
                        int i = this.f25163c.f25000c;
                        if (i == 1) {
                            this.f25162b.mo17291b().setBackgroundResource(R.drawable.btz);
                        } else if (i == 2) {
                            this.f25162b.mo17291b().setBackgroundResource(R.drawable.bu0);
                        } else if (i == 3) {
                            this.f25162b.mo17291b().setBackgroundResource(R.drawable.bu1);
                        }
                    } else {
                        this.f25162b.mo17291b().setBackgroundResource(R.drawable.bty);
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a */
    public final class C10436a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C10435c f25150a;

        /* renamed from: b */
        private final AbstractC89244h f25151b;

        /* renamed from: c */
        private final AbstractC89244h f25152c;

        /* renamed from: d */
        private final AbstractC89244h f25153d;

        static {
            Covode.recordClassIndex(12010);
        }

        /* renamed from: a */
        public final ImageView mo17290a() {
            return (ImageView) this.f25151b.getValue();
        }

        /* renamed from: b */
        public final LiveTextView mo17291b() {
            return (LiveTextView) this.f25152c.getValue();
        }

        /* renamed from: c */
        public final HSImageView mo17292c() {
            return (HSImageView) this.f25153d.getValue();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a$a */
        static final class C10437a extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25154a;

            static {
                Covode.recordClassIndex(12011);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10437a(View view) {
                super(0);
                this.f25154a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f25154a.findViewById(R.id.bso);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a$b */
        static final class C10438b extends AbstractC89220m implements AbstractC89171a<ImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25155a;

            static {
                Covode.recordClassIndex(12012);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10438b(View view) {
                super(0);
                this.f25155a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ImageView invoke() {
                return this.f25155a.findViewById(R.id.bsn);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a$c */
        static final class C10439c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25156a;

            static {
                Covode.recordClassIndex(12013);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10439c(View view) {
                super(0);
                this.f25156a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25156a.findViewById(R.id.esc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10436a(C10435c cVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25150a = cVar;
            this.f25151b = C89250i.m154773a((AbstractC89171a) new C10438b(view));
            this.f25152c = C89250i.m154773a((AbstractC89171a) new C10439c(view));
            this.f25153d = C89250i.m154773a((AbstractC89171a) new C10437a(view));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$e */
    static final class View$OnClickListenerC10443e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10440b f25164a;

        static {
            Covode.recordClassIndex(12017);
        }

        View$OnClickListenerC10443e(C10440b bVar) {
            this.f25164a = bVar;
        }

        public final void onClick(View view) {
            this.f25164a.mo17293a();
        }
    }

    public C10435c(EnumC10608a aVar, DataChannel dataChannel) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        this.f25148a = aVar;
        this.f25149b = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10436a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bcy, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C10436a(this, a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10436a aVar, C10347a aVar2) {
        C10436a aVar3 = aVar;
        C10347a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        C10440b bVar = new C10440b(aVar4);
        C10441c cVar = new C10441c(this, aVar3, aVar4);
        C10442d dVar = new C10442d(this, aVar3, aVar4);
        C7577g.m15571a(aVar3.mo17290a(), aVar4.f24998a.getAvatarThumb(), aVar3.mo17290a().getWidth(), aVar3.mo17290a().getHeight(), 2131234742);
        aVar3.mo17292c().setVisibility(8);
        C9591j a = C8313a.m16463a(aVar4.f24998a);
        if (a != null) {
            aVar3.mo17292c().setVisibility(0);
            C3941k.m9601a(aVar3.mo17292c(), a.f23265a);
        }
        aVar3.mo17290a().setOnClickListener(new View$OnClickListenerC10443e(bVar));
        cVar.mo17294a();
        dVar.mo17295a();
    }
}
