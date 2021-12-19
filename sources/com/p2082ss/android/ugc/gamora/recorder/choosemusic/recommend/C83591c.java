package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.C23346d;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46952fr;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.p2730de.C40974i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75654n;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83504d;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83576b;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.C83621a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c */
public final class C83591c extends AbstractC2562j<AbstractC83566a> implements AbstractC20382b, AbstractC21566a, AbstractC83566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186643a = {new C89232y(C83591c.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b */
    public final C83591c f186644b = this;

    /* renamed from: c */
    final AbstractC89244h f186645c = C89250i.m154773a((AbstractC89171a) C83597f.f186666a);

    /* renamed from: d */
    public boolean f186646d;

    /* renamed from: e */
    public boolean f186647e;

    /* renamed from: f */
    public int f186648f;

    /* renamed from: g */
    public C83504d f186649g;

    /* renamed from: h */
    public final C1213t<Boolean> f186650h = new C1213t<>();

    /* renamed from: i */
    private final AbstractC89244h f186651i = C89250i.m154773a((AbstractC89171a) C83600i.f186669a);

    /* renamed from: j */
    private final AbstractC89244h f186652j = C89250i.m154774a(EnumC89331m.NONE, new C83592a(this));

    /* renamed from: k */
    private final AbstractC89244h f186653k = C89250i.m154774a(EnumC89331m.NONE, new C83593b(this));

    /* renamed from: l */
    private final AbstractC89248d f186654l = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: m */
    private final AbstractC89244h f186655m = C89250i.m154774a(EnumC89331m.NONE, new C83594c(this));

    /* renamed from: n */
    private final AbstractC89244h f186656n = C89250i.m154774a(EnumC89331m.NONE, new C83595d(this));

    /* renamed from: o */
    private final AbstractC89244h f186657o = C89250i.m154773a((AbstractC89171a) new C83615v(this));

    /* renamed from: p */
    private final AbstractC89244h f186658p = C89250i.m154773a((AbstractC89171a) C83617w.f186686a);

    /* renamed from: q */
    private final C21582f f186659q;

    static {
        Covode.recordClassIndex(97478);
    }

    /* renamed from: b */
    public final LruCache<String, C83621a> mo128597b() {
        return (LruCache) this.f186651i.getValue();
    }

    /* renamed from: c */
    public final AbstractC83490a mo128598c() {
        return (AbstractC83490a) this.f186652j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final AbstractC84089j mo128599d() {
        return (AbstractC84089j) this.f186653k.getValue();
    }

    /* renamed from: e */
    public final ShortVideoContext mo128600e() {
        return (ShortVideoContext) this.f186654l.mo23374a(this, f186643a[0]);
    }

    /* renamed from: f */
    public final C83576b mo128601f() {
        return (C83576b) this.f186657o.getValue();
    }

    /* renamed from: g */
    public final C1213t<C83621a> mo128580a() {
        return (C1213t) this.f186658p.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83566a getApiComponent() {
        return this.f186644b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186659q;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$i */
    static final class C83600i extends AbstractC89220m implements AbstractC89171a<LruCache<String, C83621a>> {

        /* renamed from: a */
        public static final C83600i f186669a = new C83600i();

        static {
            Covode.recordClassIndex(97487);
        }

        C83600i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, C83621a> invoke() {
            return new LruCache(10);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$q */
    static final class C83610q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186679a;

        static {
            Covode.recordClassIndex(97497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83610q(C83591c cVar) {
            super(0);
            this.f186679a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f186679a.mo128604i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$w */
    static final class C83617w extends AbstractC89220m implements AbstractC89171a<C1213t<C83621a>> {

        /* renamed from: a */
        public static final C83617w f186686a = new C83617w();

        static {
            Covode.recordClassIndex(97504);
        }

        C83617w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C83621a> invoke() {
            return new C1213t();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$a */
    public static final class C83592a extends AbstractC89220m implements AbstractC89171a<AbstractC83490a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186660a;

        static {
            Covode.recordClassIndex(97479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83592a(AbstractC21566a aVar) {
            super(0);
            this.f186660a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.recorder.choosemusic.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186660a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.choosemusic.a> r1 = com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83592a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$b */
    public static final class C83593b extends AbstractC89220m implements AbstractC89171a<AbstractC84089j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186661a;

        static {
            Covode.recordClassIndex(97480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83593b(AbstractC21566a aVar) {
            super(0);
            this.f186661a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.recorder.sticker.c.j, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186661a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.sticker.c.j> r1 = com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83593b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$c */
    public static final class C83594c extends AbstractC89220m implements AbstractC89171a<AbstractC83406b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186662a;

        static {
            Covode.recordClassIndex(97481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83594c(AbstractC21566a aVar) {
            super(0);
            this.f186662a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.recorder.b.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186662a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r1 = com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83594c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$d */
    public static final class C83595d extends AbstractC89220m implements AbstractC89171a<AbstractC14193m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186663a;

        static {
            Covode.recordClassIndex(97482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83595d(AbstractC21566a aVar) {
            super(0);
            this.f186663a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.bytedance.creativex.recorder.b.a.m] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186663a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.bytedance.creativex.recorder.b.a.m> r1 = com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83595d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$f */
    static final class C83597f extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C83597f f186666a = new C83597f();

        static {
            Covode.recordClassIndex(97484);
        }

        C83597f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: j */
    public final boolean mo128605j() {
        if (mo128600e().f155763X == 14) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onPause() {
        super.onPause();
        C83504d dVar = this.f186649g;
        if (dVar != null) {
            dVar.mo128521a();
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onStop() {
        super.onStop();
        C83504d dVar = this.f186649g;
        if (dVar != null) {
            dVar.mo128521a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$v */
    static final class C83615v extends AbstractC89220m implements AbstractC89171a<C83576b> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186684a;

        static {
            Covode.recordClassIndex(97502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83615v(C83591c cVar) {
            super(0);
            this.f186684a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83576b invoke() {
            return new C83576b(C2556g.m7473b(this.f186684a), this.f186684a.mo128598c().getChooseMusicAnchorViewPosition(), new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83615v.C836161 */

                /* renamed from: a */
                final /* synthetic */ C83615v f186685a;

                static {
                    Covode.recordClassIndex(97503);
                }

                {
                    this.f186685a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    this.f186685a.f186684a.f186650h.setValue(Boolean.valueOf(bool.booleanValue()));
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: k */
    public final MusicModel mo128606k() {
        C89378p<MusicModel, Long> a;
        C83621a value = mo128580a().getValue();
        if (value == null || (a = value.mo128632a(mo128605j())) == null) {
            return null;
        }
        return a.getFirst();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        C83504d dVar = this.f186649g;
        if (dVar != null) {
            dVar.f186486a.mo101649c();
        }
        C83504d dVar2 = this.f186649g;
        if (dVar2 != null) {
            dVar2.f186486a.mo101650d();
        }
    }

    /* renamed from: i */
    public final void mo128604i() {
        C83504d dVar = this.f186649g;
        if (dVar != null) {
            dVar.mo128522a(null, true, "");
        }
        this.f186646d = true;
        if (C46952fr.m90237c()) {
            mo128598c().setUiLoadingMusic(false);
        }
        mo128601f().mo128591g();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$g */
    static final class C83598g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186667a;

        static {
            Covode.recordClassIndex(97485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83598g(C83591c cVar) {
            super(0);
            this.f186667a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String musicId;
            String musicId2;
            if (this.f186667a.f186648f == 2) {
                MusicModel k = this.f186667a.mo128606k();
                if (!(k == null || (musicId2 = k.getMusicId()) == null)) {
                    String str = this.f186667a.mo128600e().f155830o;
                    C89219l.m154716b(str, "");
                    C83618d.m143956a(musicId2, str, "pause");
                }
                this.f186667a.mo128595a(3);
            } else if (this.f186667a.f186648f == 3) {
                MusicModel k2 = this.f186667a.mo128606k();
                if (!(k2 == null || (musicId = k2.getMusicId()) == null)) {
                    String str2 = this.f186667a.mo128600e().f155830o;
                    C89219l.m154716b(str2, "");
                    C83618d.m143956a(musicId, str2, "continue");
                }
                this.f186667a.mo128595a(2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$h */
    static final class C83599h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186668a;

        static {
            Covode.recordClassIndex(97486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83599h(C83591c cVar) {
            super(0);
            this.f186668a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String musicId;
            MusicModel k = this.f186668a.mo128606k();
            if (!(k == null || (musicId = k.getMusicId()) == null)) {
                String str = this.f186668a.mo128600e().f155830o;
                C89219l.m154716b(str, "");
                C89219l.m154721d(musicId, "");
                C89219l.m154721d(str, "");
                C39162r.m79460a("click_music_popup_use", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", musicId).mo129406a("creation_id", str).f188764a);
            }
            this.f186668a.mo128603h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: h */
    public final void mo128603h() {
        MusicModel musicModel;
        C89378p<MusicModel, Long> a;
        C83621a value = mo128580a().getValue();
        if (value == null || (a = value.mo128632a(mo128605j())) == null) {
            musicModel = null;
        } else {
            musicModel = a.getFirst();
        }
        mo128601f().mo128591g();
        this.f186646d = false;
        boolean z = !C46952fr.m90237c();
        C83504d dVar = this.f186649g;
        if (dVar != null) {
            dVar.mo128522a(musicModel, z, "");
        }
        if (C46952fr.m90237c()) {
            mo128598c().setUiLoadingMusic(true);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (C46952fr.m90236b()) {
            IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
            C89219l.m154716b(h, "");
            if (!h.mo93965b() && !mo128600e().mo110033i()) {
                if (C46952fr.m90236b() && !mo128600e().mo110022c() && !mo128600e().f155817b.mo109889b()) {
                    mo128599d().mo23157a(new C83619e(new C83601j(this)));
                }
                C83576b f = mo128601f();
                C83598g gVar = new C83598g(this);
                C89219l.m154721d(gVar, "");
                f.mo128585a().setOnClickListener(new C83576b.View$OnClickListenerC83588j(f, gVar));
                C83576b f2 = mo128601f();
                C83599h hVar = new C83599h(this);
                C89219l.m154721d(hVar, "");
                ((View) f2.f186616b.getValue()).setOnClickListener(new C83576b.View$OnClickListenerC83589k(f2, hVar));
                Activity b = C2556g.m7473b(this);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                this.f186649g = new C83504d((ActivityC0945e) b, new C83606n(this), new C83608o(this), new C83609p(this), new C83610q(this));
                mo128580a().observe(this, new C83611r(this));
                mo128599d().mo23122d().mo6997a(this, new C83612s(this));
                mo128599d().mo23167t().mo119302n().mo119323b().observe(this, new C83613t(this));
                mo128599d().mo23167t().mo119302n().mo119327d().observe(this, new C83614u(this));
                this.f186650h.observe(this, new C83602k(this));
                ((AbstractC83406b) this.f186655m.getValue()).getBottomTabIndexChangeEvent().mo6997a(this, new C83603l(this));
                ((AbstractC14193m) this.f186656n.getValue()).mo22902i().mo6997a(this, new C83605m(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a
    /* renamed from: a */
    public final void mo128581a(boolean z) {
        this.f186647e = z;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$m */
    static final class C83605m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186674a;

        static {
            Covode.recordClassIndex(97492);
        }

        C83605m(C83591c cVar) {
            this.f186674a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186674a.mo128604i();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$t */
    static final class C83613t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186682a;

        static {
            Covode.recordClassIndex(97500);
        }

        C83613t(C83591c cVar) {
            this.f186682a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186682a.mo128604i();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$e */
    static final class C83596e extends AbstractC89220m implements AbstractC89172b<C83621a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186664a;

        /* renamed from: b */
        final /* synthetic */ Effect f186665b;

        static {
            Covode.recordClassIndex(97483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83596e(C83591c cVar, Effect effect) {
            super(1);
            this.f186664a = cVar;
            this.f186665b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C83621a aVar) {
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(aVar, C83621a.f186689e)) {
                this.f186664a.mo128580a().setValue(aVar);
                this.f186664a.mo128597b().put(this.f186665b.getEffectId(), aVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$r */
    static final class C83611r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186680a;

        static {
            Covode.recordClassIndex(97498);
        }

        C83611r(C83591c cVar) {
            this.f186680a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83621a aVar = (C83621a) obj;
            if (!C89219l.m154714a(aVar, C83621a.f186689e)) {
                Boolean a = this.f186680a.mo128599d().mo23122d().mo6996a();
                if (a == null || !a.booleanValue()) {
                    C83591c cVar = this.f186680a;
                    cVar.mo128596a(aVar.mo128632a(cVar.mo128605j()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$u */
    static final class C83614u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83591c f186683a;

        static {
            Covode.recordClassIndex(97501);
        }

        C83614u(C83591c cVar) {
            this.f186683a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C75654n nVar = (C75654n) obj;
            if ((!C89219l.m154714a(nVar.f170067a, nVar.f170068b)) && !this.f186683a.f186647e && C89219l.m154714a((Object) this.f186683a.mo128600e().f155823h, (Object) "prop_music_recommended")) {
                this.f186683a.mo128598c().clearMusic();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$k */
    static final class C83602k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186671a;

        static {
            Covode.recordClassIndex(97489);
        }

        C83602k(C83591c cVar) {
            this.f186671a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p<MusicModel, Long> a;
            MusicModel first;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83621a value = this.f186671a.mo128580a().getValue();
                if (value != null && (a = value.mo128632a(this.f186671a.mo128605j())) != null && (first = a.getFirst()) != null) {
                    C83504d dVar = this.f186671a.f186649g;
                    if (dVar != null) {
                        C89219l.m154721d(first, "");
                        dVar.f186486a.mo101646a(first);
                    }
                    this.f186671a.mo128595a(1);
                    return;
                }
                return;
            }
            this.f186671a.mo128595a(3);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$s */
    static final class C83612s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186681a;

        static {
            Covode.recordClassIndex(97499);
        }

        C83612s(C83591c cVar) {
            this.f186681a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p<MusicModel, Long> pVar;
            Boolean bool = (Boolean) obj;
            if (!C89219l.m154714a(this.f186681a.mo128580a().getValue(), C83621a.f186689e) && !bool.booleanValue()) {
                C83591c cVar = this.f186681a;
                C83621a value = cVar.mo128580a().getValue();
                if (value == null || (pVar = value.mo128632a(this.f186681a.mo128605j())) == null) {
                    pVar = C89387v.m154943a(null, 0L);
                }
                cVar.mo128596a(pVar);
            }
        }
    }

    public C83591c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f186659q = fVar;
    }

    /* renamed from: a */
    public final void mo128595a(int i) {
        if (this.f186648f != i) {
            if (i == 1) {
                this.f186648f = 1;
            } else if (i == 2) {
                C83504d dVar = this.f186649g;
                if (dVar != null) {
                    dVar.f186486a.mo101648b();
                }
                this.f186648f = 2;
            } else if (i == 3) {
                C83504d dVar2 = this.f186649g;
                if (dVar2 != null) {
                    dVar2.mo128521a();
                }
                this.f186648f = 3;
            }
            if (this.f186648f == i) {
                C83576b f = mo128601f();
                int i2 = this.f186648f;
                if (i2 == 1) {
                    ObjectAnimator e = f.mo128589e();
                    C89219l.m154716b(e, "");
                    if (!e.isRunning()) {
                        f.mo128589e().start();
                    }
                } else {
                    f.mo128589e().end();
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ImageView d = f.mo128588d();
                            C89219l.m154716b(d, "");
                            d.setVisibility(0);
                            f.mo128588d().setImageResource(2131230989);
                            f.mo128589e().cancel();
                            return;
                        } else if (i2 == 3) {
                            ImageView d2 = f.mo128588d();
                            C89219l.m154716b(d2, "");
                            d2.setVisibility(0);
                            f.mo128588d().setImageResource(2131230856);
                            f.mo128589e().cancel();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                f.mo128588d().setImageResource(2131230988);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$l */
    static final class C83603l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83591c f186672a;

        static {
            Covode.recordClassIndex(97490);
        }

        C83603l(C83591c cVar) {
            this.f186672a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            C83408c cVar = (C83408c) obj;
            if (this.f186672a.mo128580a().getValue() != null && (!C89219l.m154714a(this.f186672a.mo128580a().getValue(), C83621a.f186689e))) {
                C83591c cVar2 = this.f186672a;
                C89219l.m154716b(cVar, "");
                if ((C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7k)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7k)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7m)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7l)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7j)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7r)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7s)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7q)) || C89219l.m154714a(cVar.f186277c, (Object) C2556g.m7473b(cVar2).getString(R.string.f7z))) && !this.f186672a.mo128598c().recordHasMusic()) {
                    this.f186672a.mo128601f().mo128591g();
                    if (C46952fr.m90235a() == 1) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    ((Handler) this.f186672a.f186645c.getValue()).postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83603l.RunnableC836041 */

                        /* renamed from: a */
                        final /* synthetic */ C83603l f186673a;

                        static {
                            Covode.recordClassIndex(97491);
                        }

                        {
                            this.f186673a = r1;
                        }

                        public final void run() {
                            this.f186673a.f186672a.mo128580a().setValue(this.f186673a.f186672a.mo128580a().getValue());
                        }
                    }, j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo128596a(C89378p<? extends MusicModel, Long> pVar) {
        String a;
        String musicId;
        if (pVar != null && pVar.getFirst() != null && mo128600e().f155817b.mo109891d().size() <= 0 && !this.f186647e) {
            if (C46952fr.m90237c()) {
                MusicModel musicModel = (MusicModel) pVar.getFirst();
                if (!(musicModel == null || (musicId = musicModel.getMusicId()) == null)) {
                    String str = mo128600e().f155830o;
                    C89219l.m154716b(str, "");
                    C83618d.m143955a(musicId, str);
                }
                mo128603h();
                return;
            }
            MusicModel musicModel2 = (MusicModel) pVar.component1();
            long longValue = pVar.component2().longValue();
            if (musicModel2 != null) {
                String musicId2 = musicModel2.getMusicId();
                C89219l.m154716b(musicId2, "");
                String str2 = mo128600e().f155830o;
                C89219l.m154716b(str2, "");
                C83618d.m143955a(musicId2, str2);
                C83576b f = mo128601f();
                C89378p<Integer, Integer> chooseMusicAnchorViewPosition = mo128598c().getChooseMusicAnchorViewPosition();
                C89219l.m154721d(musicModel2, "");
                C89219l.m154721d(chooseMusicAnchorViewPosition, "");
                C20766v a2 = C20761r.m39061a(musicModel2.getPicSmall());
                a2.f49092E = (SmartImageView) f.f186615a.getValue();
                a2.mo34186c();
                if (longValue != 0) {
                    if (longValue < 0) {
                        a = "0";
                    } else if (longValue < 10000) {
                        a = String.valueOf(longValue);
                    } else if (longValue < 1000000) {
                        a = C40974i.m82497a(longValue, 1000, "K", "1000.0", "1.0M");
                    } else if (longValue < 1000000000) {
                        a = C40974i.m82497a(longValue, 1000000, "M", "1000.0", "1.0B");
                    } else {
                        a = C40974i.m82496a(longValue, 1000000000, "B");
                    }
                    TextView c = f.mo128587c();
                    C89219l.m154716b(c, "");
                    c.setText(C63247i.f143610a.getString(R.string.bl2, new Object[]{a}));
                } else {
                    TextView c2 = f.mo128587c();
                    C89219l.m154716b(c2, "");
                    c2.setText(C63247i.f143610a.getText(R.string.f6x));
                }
                TextView b = f.mo128586b();
                C89219l.m154716b(b, "");
                b.setText(musicModel2.getName() + " - " + musicModel2.getSinger());
                TextView b2 = f.mo128586b();
                C89219l.m154716b(b2, "");
                b2.setFocusable(true);
                f.mo128586b().setSingleLine();
                TextView b3 = f.mo128586b();
                C89219l.m154716b(b3, "");
                b3.setSelected(true);
                TextView b4 = f.mo128586b();
                C89219l.m154716b(b4, "");
                b4.setFocusableInTouchMode(true);
                f.mo128588d().setImageResource(2131230988);
                f.mo128589e().start();
                AbstractC23317a f2 = f.mo128590f();
                C23346d b5 = f.mo128590f().mo38007b();
                b5.f55330i = -1001;
                b5.f55339r = chooseMusicAnchorViewPosition.getFirst().intValue();
                b5.f55340s = chooseMusicAnchorViewPosition.getSecond().intValue();
                f2.mo38004a(b5);
                f.f186618d = true;
                f.f186617c.removeMessages(1);
                f.f186617c.sendEmptyMessageDelayed(1, 5000);
                f.mo128590f().mo38001a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$p */
    static final class C83609p extends AbstractC89220m implements AbstractC89183m<MusicModel, Exception, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186678a;

        static {
            Covode.recordClassIndex(97496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83609p(C83591c cVar) {
            super(2);
            this.f186678a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(MusicModel musicModel, Exception exc) {
            this.f186678a.mo128604i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$n */
    static final class C83606n extends AbstractC89220m implements AbstractC89183m<MusicModel, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186675a;

        static {
            Covode.recordClassIndex(97493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83606n(C83591c cVar) {
            super(2);
            this.f186675a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(MusicModel musicModel, Long l) {
            l.longValue();
            C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83606n.C836071 */

                /* renamed from: a */
                final /* synthetic */ C83606n f186676a;

                static {
                    Covode.recordClassIndex(97494);
                }

                {
                    this.f186676a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f186676a.f186675a.mo128595a(2);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$j */
    static final class C83601j extends AbstractC89220m implements AbstractC89183m<Effect, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186670a;

        static {
            Covode.recordClassIndex(97488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83601j(C83591c cVar) {
            super(2);
            this.f186670a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
            if (r5 == null) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
            if (r0.isEmpty() == false) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
            r3 = r10.getMusic();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
            if (r3 != null) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
            r3 = p4600h.p4601a.C89086z.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
            r4 = new com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83596e(r7, r10);
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, "");
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, "");
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
            if (r3.isEmpty() == false) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
            r0 = p4560f.p4561a.AbstractC88403ab.m153596a((p4560f.p4561a.AbstractC88407af) com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83571d.f186609a);
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
            r3 = r0.mo142930d();
            r0 = (com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi) com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73257C().createRetrofit(com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73257C().getApiHost(), true, com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
            if (r5 != null) goto L_0x0130;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
            r1 = p4560f.p4561a.AbstractC88979t.m154310b(com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic.EMPTY);
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
            r3.mo143270a(r1, com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83568a.f186606a).mo143278b(p4560f.p4561a.p4587h.C88925a.m154180b(p4560f.p4561a.p4590k.C88946a.f201991c)).mo143261a(p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(p4560f.p4561a.p4562a.p4564b.C88392a.f200660a)).mo143254a(new com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83569b(r4), new com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83570c(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0130, code lost:
            r1 = r0.getRecommendMusic(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
            r8 = p4560f.p4561a.AbstractC88979t.m154309b((java.lang.Iterable) r3);
            r3 = new com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83572e((com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi) com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73257C().createRetrofit(com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73257C().getApiHost(), true, com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi.class));
            p4560f.p4561a.p4568e.p4570b.C88466b.m153697a((java.lang.Object) r3, "mapper is null");
            p4560f.p4561a.p4568e.p4570b.C88466b.m153696a(2, "prefetch");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0167, code lost:
            if ((r8 instanceof p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g) == false) goto L_0x019e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
            r0 = ((p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g) r8).call();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x016f, code lost:
            if (r0 != null) goto L_0x0199;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
            r3 = p4560f.p4561a.p4587h.C88925a.m154171a(p4560f.p4561a.p4568e.p4573e.p4578e.C88790v.f201616a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
            r2 = com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.CallableC83573f.f186611a;
            r1 = com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83574g.f186612a;
            p4560f.p4561a.p4568e.p4570b.C88466b.m153697a((java.lang.Object) r2, "initialValueSupplier is null");
            p4560f.p4561a.p4568e.p4570b.C88466b.m153697a((java.lang.Object) r1, "collector is null");
            r0 = p4560f.p4561a.p4587h.C88925a.m154163a(new p4560f.p4561a.p4568e.p4573e.p4578e.C88753f(r3, r2, r1)).mo142925c(com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api.C83567a.C83575h.f186613a);
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0199, code lost:
            r3 = p4560f.p4561a.p4568e.p4573e.p4578e.C88695ay.m153918a(r0, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x019e, code lost:
            r3 = p4560f.p4561a.p4587h.C88925a.m154171a(new p4560f.p4561a.p4568e.p4573e.p4578e.C88755g(r8, r3, 2, p4560f.p4561a.p4568e.p4584j.EnumC88905g.IMMEDIATE));
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r10, java.lang.Boolean r11) {
            /*
            // Method dump skipped, instructions count: 426
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c.C83601j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c$o */
    static final class C83608o extends AbstractC89220m implements AbstractC89187q<String, MusicModel, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83591c f186677a;

        static {
            Covode.recordClassIndex(97495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83608o(C83591c cVar) {
            super(3);
            this.f186677a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, MusicModel musicModel, String str2) {
            String str3 = str;
            MusicModel musicModel2 = musicModel;
            if (!this.f186677a.f186646d && musicModel2 != null) {
                C83591c cVar = this.f186677a;
                C69905c b = C63238c.f143581h.mo101543b(musicModel2);
                if (C46952fr.m90237c()) {
                    cVar.mo128598c().changeCancelMusicBtnVisible(true);
                    cVar.mo128598c().setUiLoadingMusic(false);
                }
                cVar.mo128598c().onChooseMusicDone(false, "", b, str3);
                cVar.mo128598c().handleChooseMusic(C40888d.C40889a.m82358a(false, "", b, str3));
                C70005cr.m123611a().mo70083a(C63238c.f143581h.mo101534a((Object) musicModel2));
                cVar.mo128600e().f155823h = "prop_music_recommended";
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
