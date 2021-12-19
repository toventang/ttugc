package com.p2082ss.android.ugc.aweme.sticker.favorite;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.graphics.drawable.C0705a;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b;
import com.p2082ss.android.ugc.aweme.sticker.favorite.C75359a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75701h;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.EnumC75694c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.style.StyleView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker */
public final class FavoriteSticker implements AbstractC33974au, AbstractC75369e {

    /* renamed from: a */
    C88411a f169361a;

    /* renamed from: b */
    public final ActivityC0218d f169362b;

    /* renamed from: c */
    public final AbstractC75655o f169363c;

    /* renamed from: d */
    public final AbstractC75429h f169364d;

    /* renamed from: e */
    public final AbstractC75361b f169365e;

    /* renamed from: f */
    final CheckableImageView f169366f;

    /* renamed from: g */
    final AbstractC89172b<Effect, C89391z> f169367g;

    /* renamed from: h */
    private AbstractC72827a f169368h;

    /* renamed from: i */
    private final Drawable f169369i;

    /* renamed from: j */
    private final Drawable f169370j;

    /* renamed from: k */
    private final StyleView f169371k;

    /* renamed from: l */
    private final View f169372l;

    /* renamed from: m */
    private final TextView f169373m;

    /* renamed from: n */
    private final View f169374n;

    /* renamed from: o */
    private final float f169375o;

    /* renamed from: p */
    private final float f169376p;

    /* renamed from: q */
    private final float f169377q;

    /* renamed from: r */
    private final AbstractC89244h f169378r = C89250i.m154773a((AbstractC89171a) new C75357a(this));

    /* renamed from: s */
    private final C75359a f169379s;

    /* renamed from: t */
    private final FrameLayout f169380t;

    /* renamed from: u */
    private final StickerPreferences f169381u;

    static {
        Covode.recordClassIndex(88268);
    }

    /* renamed from: a */
    public final AbstractC75701h mo118917a() {
        return (AbstractC75701h) this.f169378r.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$a */
    static final class C75357a extends AbstractC89220m implements AbstractC89171a<AbstractC75701h> {

        /* renamed from: a */
        final /* synthetic */ FavoriteSticker f169393a;

        static {
            Covode.recordClassIndex(88276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75357a(FavoriteSticker favoriteSticker) {
            super(0);
            this.f169393a = favoriteSticker;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75701h invoke() {
            return this.f169393a.f169363c.mo119291c().mo119460f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$b */
    public static final class C75358b implements AbstractC72827a {

        /* renamed from: a */
        final /* synthetic */ FavoriteSticker f169394a;

        /* renamed from: b */
        private boolean f169395b = true;

        static {
            Covode.recordClassIndex(88277);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: b */
        public final void mo115162b() {
            this.f169395b = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: a */
        public final void mo115161a() {
            if (!this.f169395b) {
                this.f169394a.mo118920b();
                this.f169395b = true;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75358b(FavoriteSticker favoriteSticker) {
            this.f169394a = favoriteSticker;
        }
    }

    /* renamed from: b */
    public final void mo118920b() {
        this.f169363c.mo119291c().mo119452a(new C75726a("sticker_category:favorite", null, false, 62));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f169366f.setOnStateChangeListener(null);
        this.f169366f.clearAnimation();
        AbstractC72827a aVar = this.f169368h;
        if (aVar != null) {
            C72828b.m128598b(aVar);
            this.f169368h = null;
        }
        C88411a aVar2 = this.f169361a;
        if (aVar2 != null) {
            aVar2.mo142944a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75369e
    /* renamed from: a */
    public final void mo118918a(Effect effect) {
        mo118921b(mo118922b(effect));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75369e
    /* renamed from: a */
    public final void mo118919a(boolean z) {
        if (z) {
            if (!this.f169362b.isFinishing()) {
                C75359a aVar = this.f169379s;
                View view = this.f169372l;
                ActivityC0218d dVar = this.f169362b;
                C89219l.m154721d(view, "");
                C89219l.m154721d(dVar, "");
                if (!aVar.f169396a.getBubbleGuideShown(false) && view.getParent() != null) {
                    view.post(new C75359a.RunnableC75360a(aVar, dVar, view));
                }
            }
            this.f169380t.setVisibility(0);
            return;
        }
        this.f169380t.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo118921b(boolean z) {
        if (z) {
            this.f169366f.setImageDrawable(this.f169369i);
            this.f169373m.setText(this.f169362b.getString(R.string.g3z));
            return;
        }
        this.f169366f.setImageDrawable(this.f169370j);
        this.f169373m.setText(this.f169362b.getString(R.string.g3x));
    }

    /* renamed from: b */
    public final boolean mo118922b(Effect effect) {
        if (effect == null) {
            return false;
        }
        return mo118917a().mo119426a(effect.getEffectId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSticker(ActivityC0218d dVar, AbstractC75655o oVar, AbstractC75429h hVar, AbstractC75361b bVar, FrameLayout frameLayout, CheckableImageView checkableImageView, StickerPreferences stickerPreferences, AbstractC89171a<C75574j> aVar, AbstractC89172b<? super Effect, C89391z> bVar2) {
        Drawable background;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(checkableImageView, "");
        C89219l.m154721d(stickerPreferences, "");
        C89219l.m154721d(aVar, "");
        this.f169362b = dVar;
        this.f169363c = oVar;
        this.f169364d = hVar;
        this.f169365e = bVar;
        this.f169380t = frameLayout;
        this.f169366f = checkableImageView;
        this.f169381u = stickerPreferences;
        this.f169367g = bVar2;
        this.f169379s = new C75359a(stickerPreferences);
        dVar.getLifecycle().mo4012a(this);
        frameLayout.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.favorite.FavoriteSticker.C753501 */

            /* renamed from: a */
            final /* synthetic */ FavoriteSticker f169382a;

            static {
                Covode.recordClassIndex(88269);
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$1$a */
            static final class C75351a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                /* renamed from: a */
                final /* synthetic */ C753501 f169383a;

                static {
                    Covode.recordClassIndex(88270);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C75351a(C753501 r2) {
                    super(0);
                    this.f169383a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f169383a.f169382a.mo118920b();
                    return C89391z.f203057a;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f169382a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                if (!this.f169382a.f169365e.mo118930b()) {
                    this.f169382a.f169365e.mo118928a(this.f169382a.f169362b, "favorite_sticker", 242, this.f169382a.f169365e.mo118927a(), new C75351a(this));
                    return;
                }
                this.f169382a.f169366f.mo120123a();
            }
        });
        View findViewById = frameLayout.findViewById(R.id.e_d);
        C89219l.m154716b(findViewById, "");
        this.f169373m = (TextView) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.c6t);
        C89219l.m154716b(findViewById2, "");
        StyleView styleView = (StyleView) findViewById2;
        this.f169371k = styleView;
        View findViewById3 = frameLayout.findViewById(R.id.c6r);
        C89219l.m154716b(findViewById3, "");
        this.f169372l = findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.c6s);
        C89219l.m154716b(findViewById4, "");
        this.f169374n = findViewById4;
        C75574j invoke = aVar.invoke();
        if (!(invoke == null || (background = styleView.getBackground()) == null || invoke.f169844f == -1)) {
            C84981g.m146053a(background, dVar.getResources().getColor(invoke.f169844f));
            styleView.setBackground(background);
        }
        this.f169375o = dVar.getResources().getDimension(R.dimen.em);
        this.f169376p = dVar.getResources().getDimension(R.dimen.ep);
        this.f169377q = dVar.getResources().getDimension(R.dimen.ek);
        Drawable e = C0705a.m2506e(dVar.getResources().getDrawable(2131232435));
        C89219l.m154716b(e, "");
        this.f169369i = e;
        Drawable e2 = C0705a.m2506e(dVar.getResources().getDrawable(2131232437));
        C89219l.m154716b(e2, "");
        this.f169370j = e2;
        checkableImageView.setOnStateChangeListener(new CheckableImageView.AbstractC76409a(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.favorite.FavoriteSticker.C753522 */

            /* renamed from: a */
            final /* synthetic */ FavoriteSticker f169384a;

            /* renamed from: b */
            private Effect f169385b;

            /* renamed from: c */
            private Effect f169386c;

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$c */
            static final class C75355c<T> implements AbstractC88433f<Throwable> {

                /* renamed from: a */
                public static final C75355c f169391a = new C75355c();

                static {
                    Covode.recordClassIndex(88274);
                }

                C75355c() {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Throwable th) {
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$d */
            static final class C75356d<T> implements AbstractC88433f<Throwable> {

                /* renamed from: a */
                public static final C75356d f169392a = new C75356d();

                static {
                    Covode.recordClassIndex(88275);
                }

                C75356d() {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Throwable th) {
                }
            }

            static {
                Covode.recordClassIndex(88271);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView.AbstractC76409a
            /* renamed from: a */
            public final void mo118924a() {
                AbstractC88412b a;
                Effect effect = this.f169385b;
                if (effect != null) {
                    AbstractC89172b<Effect, C89391z> bVar = this.f169384a.f169367g;
                    if (bVar != null) {
                        bVar.invoke(effect);
                    }
                    C88411a aVar = this.f169384a.f169361a;
                    if (aVar == null) {
                        aVar = new C88411a();
                    }
                    if (this.f169384a.mo118922b(effect)) {
                        a = this.f169384a.mo118917a().mo119424a(effect, true, EnumC75694c.PANEL).mo142915a(new C75353a(effect, this), C75355c.f169391a);
                    } else {
                        this.f169384a.f169364d.mo118953a(effect, false, "click_main_panel");
                        if (this.f169386c != null) {
                            this.f169384a.f169364d.mo118953a(effect, true, "click_banner");
                        }
                        a = this.f169384a.mo118917a().mo119424a(effect, false, EnumC75694c.PANEL).mo142915a(new C75354b(effect, this), C75356d.f169392a);
                    }
                    aVar.mo142945a(a);
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f169384a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$a */
            static final class C75353a<T> implements AbstractC88433f<List<? extends String>> {

                /* renamed from: a */
                final /* synthetic */ Effect f169387a;

                /* renamed from: b */
                final /* synthetic */ C753522 f169388b;

                static {
                    Covode.recordClassIndex(88272);
                }

                C75353a(Effect effect, C753522 r2) {
                    this.f169387a = effect;
                    this.f169388b = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(List<? extends String> list) {
                    this.f169388b.f169384a.f169365e.mo118929a(this.f169387a);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$b */
            static final class C75354b<T> implements AbstractC88433f<List<? extends String>> {

                /* renamed from: a */
                final /* synthetic */ Effect f169389a;

                /* renamed from: b */
                final /* synthetic */ C753522 f169390b;

                static {
                    Covode.recordClassIndex(88273);
                }

                C75354b(Effect effect, C753522 r2) {
                    this.f169389a = effect;
                    this.f169390b = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(List<? extends String> list) {
                    this.f169390b.f169384a.f169365e.mo118929a(this.f169389a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView.AbstractC76409a
            /* renamed from: a */
            public final void mo118925a(int i) {
                if (i == 0) {
                    this.f169385b = this.f169384a.f169363c.mo119294f();
                    Effect value = this.f169384a.f169363c.mo119302n().mo119323b().getValue();
                    if (value != null && !TextUtils.isEmpty(value.getParentId())) {
                        this.f169386c = value;
                    }
                    AbstractC75701h a = this.f169384a.mo118917a();
                    FavoriteSticker favoriteSticker = this.f169384a;
                    a.mo119427b(!favoriteSticker.mo118922b(favoriteSticker.f169363c.mo119294f()));
                } else if (i == 1) {
                    FavoriteSticker favoriteSticker2 = this.f169384a;
                    favoriteSticker2.mo118921b(true ^ favoriteSticker2.mo118922b(favoriteSticker2.f169363c.mo119294f()));
                }
            }
        });
        C72828b.m128594a(dVar);
        C75358b bVar3 = new C75358b(this);
        this.f169368h = bVar3;
        C72828b.m128595a(bVar3);
    }
}
