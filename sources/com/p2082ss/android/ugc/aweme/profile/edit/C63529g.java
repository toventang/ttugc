package com.p2082ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63510e;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63806g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.share.AbstractC69358o;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.g */
public final class C63529g implements AbstractC63806g {

    /* renamed from: h */
    public static boolean f144180h;

    /* renamed from: i */
    public static final C63531b f144181i = new C63531b((byte) 0);

    /* renamed from: a */
    public final C63787p f144182a;

    /* renamed from: b */
    boolean f144183b;

    /* renamed from: c */
    public final AbstractC63510e f144184c;

    /* renamed from: d */
    public final AbstractC69358o f144185d;

    /* renamed from: e */
    public final Activity f144186e;

    /* renamed from: f */
    public final AvatarImageView f144187f;

    /* renamed from: g */
    public User f144188g;

    static {
        Covode.recordClassIndex(74844);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$b */
    public static final class C63531b {
        static {
            Covode.recordClassIndex(74846);
        }

        private C63531b() {
        }

        /* renamed from: a */
        public static boolean m115126a() {
            boolean z = C63529g.f144180h;
            C63529g.f144180h = false;
            return z;
        }

        public /* synthetic */ C63531b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$c */
    public static final class C63532c implements AbstractC63510e {

        /* renamed from: a */
        final /* synthetic */ C63529g f144190a;

        static {
            Covode.recordClassIndex(74847);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63510e
        /* renamed from: a */
        public final void mo102147a() {
            C63787p pVar = this.f144190a.f144182a;
            if (pVar != null) {
                pVar.mo102346a(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63510e
        /* renamed from: b */
        public final void mo102148b() {
            new C53484j().mo90076a(this.f144190a.f144186e, new C63533a(this));
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63510e
        /* renamed from: c */
        public final void mo102149c() {
            User user = this.f144190a.f144188g;
            if (user != null) {
                C63873h.f144797a.startHeaderDetailActivity(this.f144190a.f144186e, this.f144190a.f144187f, user, false, false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63532c(C63529g gVar) {
            this.f144190a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$c$a */
        static final class C63533a implements C53484j.AbstractC53488a {

            /* renamed from: a */
            final /* synthetic */ C63532c f144191a;

            static {
                Covode.recordClassIndex(74848);
            }

            C63533a(C63532c cVar) {
                this.f144191a = cVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.AbstractC53488a
            /* renamed from: a */
            public final void mo90080a(String str) {
                AbstractC69358o oVar = this.f144191a.f144190a.f144185d;
                if (oVar != null) {
                    C89219l.m154716b(str, "");
                    oVar.mo56070a(str);
                }
                C63529g.f144180h = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63806g
    /* renamed from: a */
    public final void mo102190a() {
        if (!this.f144186e.isFinishing()) {
            AbstractC69358o oVar = this.f144185d;
            if (oVar != null) {
                oVar.mo9590b();
            }
            this.f144187f.mo61256c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$a */
    static final class C63530a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63529g f144189a;

        static {
            Covode.recordClassIndex(74845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63530a(C63529g gVar) {
            super(0);
            this.f144189a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63529g gVar = this.f144189a;
            gVar.f144183b = true;
            gVar.f144187f.mo61255b();
            AbstractC24255a controller = gVar.f144187f.getController();
            if (controller != null) {
                C89219l.m154716b(controller, "");
                Animatable i = controller.mo39821i();
                if (i != null && !i.isRunning()) {
                    i.start();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63806g
    /* renamed from: a */
    public final void mo102192a(User user) {
        this.f144188g = user;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63806g
    /* renamed from: a */
    public final void mo102191a(UrlModel urlModel) {
        AbstractC69358o oVar;
        if (urlModel != null && !this.f144183b && (oVar = this.f144185d) != null) {
            oVar.mo56067a(urlModel);
        }
    }

    public C63529g(Activity activity, AvatarImageView avatarImageView, C63787p pVar, User user) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(avatarImageView, "");
        this.f144186e = activity;
        this.f144187f = avatarImageView;
        this.f144188g = user;
        this.f144182a = pVar;
        C63532c cVar = new C63532c(this);
        this.f144184c = cVar;
        AbstractC69358o a = C68863ah.f154027a.mo109396a(this.f144188g, activity, cVar);
        if (a != null) {
            a.mo56069a(new C63530a(this));
        }
        this.f144185d = a;
    }
}
