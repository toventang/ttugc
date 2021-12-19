package com.bytedance.android.livesdk.rank.impl.p614g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10414c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.g.d */
public final class C10444d extends AbstractC89396c<C10348b, C10445a> {
    static {
        Covode.recordClassIndex(12018);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$c */
    public static final class C10452c implements C10414c.AbstractC10415a {

        /* renamed from: a */
        final /* synthetic */ C10444d f25177a;

        /* renamed from: b */
        final /* synthetic */ C10445a f25178b;

        /* renamed from: c */
        final /* synthetic */ C10348b f25179c;

        static {
            Covode.recordClassIndex(12026);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: c */
        public final C10348b mo17285c() {
            return this.f25179c;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: a */
        public final void mo17283a() {
            C10444d.m18962a(this.f25178b.mo17297a(), true);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.C10414c.AbstractC10415a
        /* renamed from: b */
        public final void mo17284b() {
            C10444d.m18962a(this.f25178b.mo17297a(), false);
        }

        C10452c(C10444d dVar, C10445a aVar, C10348b bVar) {
            this.f25177a = dVar;
            this.f25178b = aVar;
            this.f25179c = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a */
    public static final class C10445a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f25165a;

        /* renamed from: b */
        final AbstractC89244h f25166b;

        /* renamed from: c */
        final AbstractC89244h f25167c;

        /* renamed from: d */
        final AbstractC89244h f25168d;

        /* renamed from: e */
        private final AbstractC89244h f25169e;

        static {
            Covode.recordClassIndex(12019);
        }

        /* renamed from: a */
        public final LiveButton mo17297a() {
            return (LiveButton) this.f25169e.getValue();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$a */
        static final class C10446a extends AbstractC89220m implements AbstractC89171a<LiveButton> {

            /* renamed from: a */
            final /* synthetic */ View f25170a;

            static {
                Covode.recordClassIndex(12020);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10446a(View view) {
                super(0);
                this.f25170a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveButton invoke() {
                return this.f25170a.findViewById(R.id.b6g);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$b */
        static final class C10447b extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25171a;

            static {
                Covode.recordClassIndex(12021);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10447b(View view) {
                super(0);
                this.f25171a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25171a.findViewById(R.id.f23);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$c */
        static final class C10448c extends AbstractC89220m implements AbstractC89171a<ImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25172a;

            static {
                Covode.recordClassIndex(12022);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10448c(View view) {
                super(0);
                this.f25172a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ImageView invoke() {
                return this.f25172a.findViewById(R.id.c15);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$d */
        static final class C10449d extends AbstractC89220m implements AbstractC89171a<HSImageView> {

            /* renamed from: a */
            final /* synthetic */ View f25173a;

            static {
                Covode.recordClassIndex(12023);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10449d(View view) {
                super(0);
                this.f25173a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ HSImageView invoke() {
                return this.f25173a.findViewById(R.id.bss);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$e */
        static final class C10450e extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f25174a;

            static {
                Covode.recordClassIndex(12024);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10450e(View view) {
                super(0);
                this.f25174a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f25174a.findViewById(R.id.f6t);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10445a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25165a = C89250i.m154773a((AbstractC89171a) new C10447b(view));
            this.f25166b = C89250i.m154773a((AbstractC89171a) new C10448c(view));
            this.f25167c = C89250i.m154773a((AbstractC89171a) new C10450e(view));
            this.f25169e = C89250i.m154773a((AbstractC89171a) new C10446a(view));
            this.f25168d = C89250i.m154773a((AbstractC89171a) new C10449d(view));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$b */
    static final class View$OnClickListenerC10451b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10444d f25175a;

        /* renamed from: b */
        final /* synthetic */ C10348b f25176b;

        static {
            Covode.recordClassIndex(12025);
        }

        View$OnClickListenerC10451b(C10444d dVar, C10348b bVar) {
            this.f25175a = dVar;
            this.f25176b = bVar;
        }

        public final void onClick(View view) {
            C10414c.m18929a(this.f25176b.f25001a.getId());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$d */
    static final class View$OnClickListenerC10453d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10348b f25180a;

        static {
            Covode.recordClassIndex(12027);
        }

        View$OnClickListenerC10453d(C10348b bVar) {
            this.f25180a = bVar;
        }

        public final void onClick(View view) {
            C6779a.m14563a().mo13053a(new UserProfileEvent(this.f25180a.f25001a.getId()));
        }
    }

    /* renamed from: a */
    public static void m18962a(LiveButton liveButton, boolean z) {
        if (z) {
            liveButton.setText(R.string.e1q);
        } else {
            liveButton.setText(R.string.e1l);
        }
        liveButton.setEnabled(!z);
        liveButton.setClickable(!z);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10445a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b9g, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C10445a(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10445a aVar, C10348b bVar) {
        C10445a aVar2 = aVar;
        C10348b bVar2 = bVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
        C10414c.m18931a((LiveTextView) aVar2.f25165a.getValue(), bVar2, (Boolean) false);
        C10414c.m18930a((HSImageView) aVar2.f25168d.getValue(), (ImageView) aVar2.f25166b.getValue(), bVar2);
        LiveTextView liveTextView = (LiveTextView) aVar2.f25167c.getValue();
        String str = bVar2.f25001a.displayId;
        if (str == null) {
            str = "";
        }
        liveTextView.setText(str);
        LiveButton a = aVar2.mo17297a();
        m18962a(a, C10414c.m18934a(bVar2));
        a.setOnClickListener(new View$OnClickListenerC10451b(this, bVar2));
        C10414c.m18932a(new C10452c(this, aVar2, bVar2));
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC10453d(bVar2));
    }
}
