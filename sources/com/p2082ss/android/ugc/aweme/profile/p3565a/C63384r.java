package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58620d;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3570d.AbstractC63507a;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.r */
public final class C63384r extends RecyclerView.ViewHolder implements AbstractC1214u<Boolean> {

    /* renamed from: k */
    public static final C63386a f143916k = new C63386a((byte) 0);

    /* renamed from: a */
    public final TextView f143917a;

    /* renamed from: b */
    public final RemoteImageView f143918b;

    /* renamed from: c */
    public final FrameLayout f143919c;

    /* renamed from: d */
    public final TextView f143920d;

    /* renamed from: e */
    public final TextView f143921e;

    /* renamed from: f */
    public LiveRoomStruct f143922f;

    /* renamed from: g */
    final AbstractC63507a f143923g;

    /* renamed from: h */
    boolean f143924h;

    /* renamed from: i */
    public final AbstractC58608c f143925i = C63873h.f144797a.newLivePlayHelper(new RunnableC63387b(this), new C63389c(this));

    /* renamed from: j */
    public final ActivityC0945e f143926j;

    /* renamed from: l */
    private AbstractC88433f<C58620d> f143927l;

    static {
        Covode.recordClassIndex(74675);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$a */
    public static final class C63386a {
        static {
            Covode.recordClassIndex(74677);
        }

        private C63386a() {
        }

        public /* synthetic */ C63386a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$b */
    static final class RunnableC63387b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C63384r f143929a;

        static {
            Covode.recordClassIndex(74678);
        }

        RunnableC63387b(C63384r rVar) {
            this.f143929a = rVar;
        }

        public final void run() {
            this.f143929a.f143917a.setVisibility(0);
            this.f143929a.f143919c.setVisibility(0);
            this.f143929a.f143920d.setVisibility(0);
            this.f143929a.f143918b.setVisibility(8);
            this.f143929a.f143921e.setVisibility(8);
            this.f143929a.f143918b.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63384r.RunnableC63387b.RunnableC633881 */

                /* renamed from: a */
                final /* synthetic */ RunnableC63387b f143930a;

                static {
                    Covode.recordClassIndex(74679);
                }

                {
                    this.f143930a = r1;
                }

                public final void run() {
                    this.f143930a.f143929a.f143925i.setMute(true);
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$g */
    public static final class RunnableC63396g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlModel f143939a;

        /* renamed from: b */
        final /* synthetic */ C63384r f143940b;

        static {
            Covode.recordClassIndex(74687);
        }

        RunnableC63396g(UrlModel urlModel, C63384r rVar) {
            this.f143939a = urlModel;
            this.f143940b = rVar;
        }

        public final void run() {
            C34577e.m70594a(this.f143940b.f143918b, this.f143939a, this.f143940b.f143918b.getWidth(), this.f143940b.f143918b.getHeight(), C63873h.f144797a.newLiveBlurProcessor(5, (((float) this.f143939a.getWidth()) * 1.0f) / ((float) this.f143940b.f143918b.getWidth()), null));
        }
    }

    /* renamed from: a */
    public final void mo102016a() {
        UrlModel urlModel;
        m114968a(new View[]{this.f143917a, this.f143919c, this.f143920d}, C63397h.f143941a);
        m114968a(new View[]{this.f143918b, this.f143921e}, C63398i.f143942a);
        LiveRoomStruct liveRoomStruct = this.f143922f;
        if (liveRoomStruct != null && (urlModel = liveRoomStruct.roomCover) != null) {
            this.f143918b.post(new RunnableC63396g(urlModel, this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$c */
    public static final class C63389c implements AbstractC58607b {

        /* renamed from: a */
        final /* synthetic */ C63384r f143931a;

        static {
            Covode.recordClassIndex(74680);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void firstFrame() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onVideoSizeChange(TextureView textureView, int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playComplete(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playPrepared(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playerMediaError(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playing() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void seiUpdate(String str) {
            C89219l.m154721d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63389c(C63384r rVar) {
            this.f143931a = rVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.a.r$c$a */
        static final class C63390a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            public static final C63390a f143932a = new C63390a();

            static {
                Covode.recordClassIndex(74681);
            }

            C63390a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                View view2 = view;
                C89219l.m154721d(view2, "");
                view2.setVisibility(0);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.a.r$c$b */
        static final class C63391b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            public static final C63391b f143933a = new C63391b();

            static {
                Covode.recordClassIndex(74682);
            }

            C63391b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                View view2 = view;
                C89219l.m154721d(view2, "");
                view2.setVisibility(8);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.a.r$c$c */
        static final class C63392c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            public static final C63392c f143934a = new C63392c();

            static {
                Covode.recordClassIndex(74683);
            }

            C63392c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                View view2 = view;
                C89219l.m154721d(view2, "");
                view2.setVisibility(8);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj) {
            UrlModel urlModel;
            C89219l.m154721d(bVar, "");
            int i = C63399s.f143943a[bVar.ordinal()];
            if (i == 1) {
                C63384r.m114968a(new View[]{this.f143931a.f143917a, this.f143931a.f143919c, this.f143931a.f143920d}, C63390a.f143932a);
                C63384r.m114968a(new View[]{this.f143931a.f143918b, this.f143931a.f143921e}, C63391b.f143933a);
            } else if (i == 2) {
                C63384r.m114968a(new View[]{this.f143931a.f143917a, this.f143931a.f143919c, this.f143931a.f143920d, this.f143931a.f143921e}, C63392c.f143934a);
                this.f143931a.f143918b.setVisibility(0);
                LiveRoomStruct liveRoomStruct = this.f143931a.f143922f;
                if (liveRoomStruct != null && (urlModel = liveRoomStruct.roomCover) != null) {
                    C34577e.m70593a(this.f143931a.f143918b, urlModel, this.f143931a.f143918b.getWidth(), this.f143931a.f143918b.getHeight());
                }
            } else if (i == 3) {
                this.f143931a.mo102016a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$d */
    static final class C63393d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C63393d f143935a = new C63393d();

        static {
            Covode.recordClassIndex(74684);
        }

        C63393d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            view2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$e */
    static final class C63394e extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C63394e f143936a = new C63394e();

        static {
            Covode.recordClassIndex(74685);
        }

        C63394e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            view2.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$h */
    public static final class C63397h extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C63397h f143941a = new C63397h();

        static {
            Covode.recordClassIndex(74688);
        }

        C63397h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            view2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$i */
    public static final class C63398i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C63398i f143942a = new C63398i();

        static {
            Covode.recordClassIndex(74689);
        }

        C63398i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            view2.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.r$f */
    public static final class C63395f implements AbstractC88433f<C58620d> {

        /* renamed from: a */
        final /* synthetic */ C63384r f143937a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f143938b;

        static {
            Covode.recordClassIndex(74686);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C58620d dVar) {
            C58620d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            String valueOf = String.valueOf(dVar2.f133501a);
            User user = this.f143938b.owner;
            C89219l.m154716b(user, "");
            if (TextUtils.equals(valueOf, user.getUid())) {
                this.f143938b.f114485id = dVar2.f133502b;
                this.f143938b.owner.roomId = this.f143938b.f114485id;
                this.f143937a.f143925i.stop();
                this.f143937a.mo102016a();
            }
        }

        C63395f(C63384r rVar, LiveRoomStruct liveRoomStruct) {
            this.f143937a = rVar;
            this.f143938b = liveRoomStruct;
        }
    }

    /* renamed from: a */
    static void m114967a(LiveRoomStruct liveRoomStruct) {
        C33744d a = new C33744d().mo59983a("scene_id", "1009").mo59983a("enter_from_merge", "others_homepage").mo59983a("action_type", "click");
        User user = liveRoomStruct.owner;
        C89219l.m154716b(user, "");
        C39162r.m79460a("livesdk_live_show", a.mo59983a("anchor_id", user.getUid()).mo59981a("room_id", liveRoomStruct.f114485id).mo59983a("request_id", liveRoomStruct.getRequestId()).mo59983a("enter_method", "live_cover").f79943a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Boolean bool) {
        LiveRoomStruct liveRoomStruct = this.f143922f;
        if (liveRoomStruct != null) {
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                this.f143925i.play(true, liveRoomStruct, this.f143919c);
            } else {
                this.f143925i.stop();
                m114968a(new View[]{this.f143917a, this.f143920d}, C63393d.f143935a);
                m114968a(new View[]{this.f143918b}, C63394e.f143936a);
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                m114967a(liveRoomStruct);
            }
            boolean a = C89219l.m154714a((Object) bool, (Object) true);
            this.f143924h = a;
            if (a) {
                AbstractC88433f<C58620d> fVar = this.f143927l;
                if (fVar == null) {
                    fVar = new C63395f(this, liveRoomStruct);
                }
                this.f143927l = fVar;
            }
        }
    }

    /* renamed from: a */
    public static void m114968a(View[] viewArr, AbstractC89172b<? super View, C89391z> bVar) {
        for (View view : viewArr) {
            bVar.invoke(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63384r(View view, ActivityC0945e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        this.f143926j = eVar;
        View findViewById = view.findViewById(R.id.f6_);
        C89219l.m154716b(findViewById, "");
        this.f143917a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dko);
        C89219l.m154716b(findViewById2, "");
        this.f143918b = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b4t);
        C89219l.m154716b(findViewById3, "");
        this.f143919c = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.f74);
        C89219l.m154716b(findViewById4, "");
        this.f143920d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.b2j);
        C89219l.m154716b(findViewById5, "");
        this.f143921e = (TextView) findViewById5;
        this.f143923g = C63873h.f144797a.mainAnimViewModel(eVar);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63384r.View$OnClickListenerC633851 */

            /* renamed from: a */
            final /* synthetic */ C63384r f143928a;

            static {
                Covode.recordClassIndex(74676);
            }

            {
                this.f143928a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                LiveRoomStruct liveRoomStruct = this.f143928a.f143922f;
                if (liveRoomStruct != null) {
                    C63873h hVar = C63873h.f144797a;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    User user = liveRoomStruct.owner;
                    C89219l.m154716b(user, "");
                    hVar.watchLiveMob(context, user, "others_homepage", "live_cover");
                }
            }
        });
    }
}
