package com.p2082ss.android.ugc.gamora.recorder.p4300g;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
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
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65436ds;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73967at;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73968au;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.g.c */
public final class C83681c extends AbstractC2562j<AbstractC83678a> implements AbstractC20382b, AbstractC21566a, AbstractC83678a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186798a = {new C89232y(C83681c.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83681c.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83681c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83681c.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0), new C89232y(C83681c.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C89232y(C83681c.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83681c.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC83678a f186799b = this;

    /* renamed from: c */
    public final C2564l<C89378p<Float, Float>> f186800c = new C2564l<>(null);

    /* renamed from: d */
    public final ActivityC0945e f186801d = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: e */
    public final ShortVideoContext f186802e = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: f */
    public final AbstractC14177d f186803f = ((AbstractC14177d) getDiContainer().mo35249a(AbstractC14177d.class, (String) null));

    /* renamed from: g */
    final AbstractC89248d f186804g = C21572a.m40504a(getDiContainer(), AbstractC14333c.class);

    /* renamed from: h */
    final AbstractC89248d f186805h = C21572a.m40504a(getDiContainer(), AbstractC83490a.class);

    /* renamed from: i */
    public final AbstractC22186b f186806i;

    /* renamed from: j */
    private final C2564l<Drawable> f186807j = new C2564l<>(null);

    /* renamed from: k */
    private final AbstractC89248d f186808k = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: l */
    private final AbstractC89248d f186809l = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: m */
    private final AbstractC89248d f186810m = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: n */
    private final AbstractC89248d f186811n = C21572a.m40504a(getDiContainer(), AbstractC14315b.class);

    /* renamed from: o */
    private final AbstractC89248d f186812o = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: p */
    private final AbstractC89244h f186813p = C89250i.m154773a((AbstractC89171a) new C83696o(this));

    /* renamed from: q */
    private long f186814q = -1;

    /* renamed from: r */
    private final C21582f f186815r;

    static {
        Covode.recordClassIndex(97571);
    }

    /* renamed from: c */
    public final AbstractC14193m mo128675c() {
        return (AbstractC14193m) this.f186808k.mo23374a(this, f186798a[0]);
    }

    /* renamed from: d */
    public final AbstractC71864a mo128676d() {
        return (AbstractC71864a) this.f186809l.mo23374a(this, f186798a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final AbstractC84089j mo128677e() {
        return (AbstractC84089j) this.f186810m.mo23374a(this, f186798a[2]);
    }

    /* renamed from: f */
    public final AbstractC14315b mo128678f() {
        return (AbstractC14315b) this.f186811n.mo23374a(this, f186798a[4]);
    }

    /* renamed from: g */
    public final AbstractC83406b mo128679g() {
        return (AbstractC83406b) this.f186812o.mo23374a(this, f186798a[5]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: h */
    public final AbstractC83680b mo128680h() {
        return (AbstractC83680b) this.f186813p.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$c */
    public static final class C83684c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C83684c f186819a = new C83684c();

        static {
            Covode.recordClassIndex(97574);
        }

        C83684c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$f */
    public static final class C83687f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C83687f f186824a = new C83687f();

        static {
            Covode.recordClassIndex(97577);
        }

        C83687f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$i */
    public static final class C83690i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C83690i f186828a = new C83690i();

        static {
            Covode.recordClassIndex(97580);
        }

        C83690i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a
    /* renamed from: a */
    public final long mo128663a() {
        return this.f186814q;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83678a getApiComponent() {
        return this.f186799b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186815r;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a
    /* renamed from: b */
    public final void mo128665b() {
        this.f186814q = -1;
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$l */
    static final class C83693l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186832a;

        static {
            Covode.recordClassIndex(97583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83693l(C83681c cVar) {
            super(0);
            this.f186832a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f186832a.mo128664a("click_cross", System.currentTimeMillis());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$a */
    public static final class C83682a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186816a;

        /* renamed from: b */
        final /* synthetic */ String f186817b;

        static {
            Covode.recordClassIndex(97572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83682a(C83681c cVar, String str) {
            super(0);
            this.f186816a = cVar;
            this.f186817b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f186816a.mo128673a(this.f186817b);
            this.f186816a.mo128680h().mo128666a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$d */
    public static final class C83685d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186820a;

        /* renamed from: b */
        final /* synthetic */ String f186821b;

        static {
            Covode.recordClassIndex(97575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83685d(C83681c cVar, String str) {
            super(0);
            this.f186820a = cVar;
            this.f186821b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.f143587n.mo101713a();
            this.f186820a.mo128673a(this.f186821b);
            this.f186820a.mo128680h().mo128669b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$g */
    public static final class C83688g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186825a;

        /* renamed from: b */
        final /* synthetic */ String f186826b;

        static {
            Covode.recordClassIndex(97578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83688g(C83681c cVar, String str) {
            super(0);
            this.f186825a = cVar;
            this.f186826b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.f143587n.mo101713a();
            this.f186825a.mo128673a(this.f186826b);
            this.f186825a.mo128680h().mo128669b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$j */
    public static final class C83691j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186829a;

        /* renamed from: b */
        final /* synthetic */ String f186830b;

        static {
            Covode.recordClassIndex(97581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83691j(C83681c cVar, String str) {
            super(0);
            this.f186829a = cVar;
            this.f186830b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f186829a.f186802e.mo110018b()) {
                this.f186829a.mo128681i();
            } else {
                C63238c.f143587n.mo101713a();
                this.f186829a.mo128673a(this.f186830b);
                this.f186829a.mo128680h().mo128666a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$o */
    static final class C83696o extends AbstractC89220m implements AbstractC89171a<C83699d> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186835a;

        static {
            Covode.recordClassIndex(97586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83696o(C83681c cVar) {
            super(0);
            this.f186835a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83699d invoke() {
            return new C83699d(this.f186835a.f186801d, this.f186835a.f186802e, this.f186835a.f186803f, this.f186835a.mo128675c(), (AbstractC70668d) this.f186835a.getDiContainer().mo35252b(AbstractC70668d.class, null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$b */
    public static final class C83683b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186818a;

        static {
            Covode.recordClassIndex(97573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83683b(C83681c cVar) {
            super(0);
            this.f186818a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C84425b a = new C84425b().mo129406a("creation_id", this.f186818a.f186802e.f155830o).mo129406a("shoot_way", this.f186818a.f186802e.f155831p);
            if (this.f186818a.f186802e.f155740A != 0) {
                a.mo129403a("draft_id", this.f186818a.f186802e.f155740A);
            }
            String str = this.f186818a.f186802e.f155741B;
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                a.mo129406a("new_draft_id", this.f186818a.f186802e.f155741B);
            }
            C39162r.m79460a("reshoot", a.f188764a);
            this.f186818a.mo128680h().mo128671c();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$e */
    public static final class C83686e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186822a;

        /* renamed from: b */
        final /* synthetic */ String f186823b;

        static {
            Covode.recordClassIndex(97576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83686e(C83681c cVar, String str) {
            super(0);
            this.f186822a = cVar;
            this.f186823b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C84425b a = new C84425b().mo129406a("creation_id", this.f186822a.f186802e.f155830o).mo129406a("shoot_way", this.f186822a.f186802e.f155831p);
            if (this.f186822a.f186802e.f155740A != 0) {
                a.mo129403a("draft_id", this.f186822a.f186802e.f155740A);
            }
            String str = this.f186822a.f186802e.f155741B;
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                a.mo129406a("new_draft_id", this.f186822a.f186802e.f155741B);
            }
            C39162r.m79460a("reshoot", a.f188764a);
            this.f186822a.mo128673a(this.f186823b);
            this.f186822a.mo128680h().mo128666a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$h */
    public static final class C83689h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186827a;

        static {
            Covode.recordClassIndex(97579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83689h(C83681c cVar) {
            super(0);
            this.f186827a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C84425b a = new C84425b().mo129406a("creation_id", this.f186827a.f186802e.f155830o).mo129406a("shoot_way", this.f186827a.f186802e.f155831p);
            if (this.f186827a.f186802e.f155740A != 0) {
                a.mo129403a("draft_id", this.f186827a.f186802e.f155740A);
            }
            String str = this.f186827a.f186802e.f155741B;
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                a.mo129406a("new_draft_id", this.f186827a.f186802e.f155741B);
            }
            C39162r.m79460a("reshoot", a.f188764a);
            this.f186827a.mo128680h().mo128671c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    public final void mo128681i() {
        C23025b bVar = new C23025b(this.f186801d);
        bVar.mo37416a(R.string.fru, new C83697p(this));
        bVar.mo37418b(R.string.b0_, C83698q.f186837a);
        ((C23023b) ((C23023b) C23013a.C23015a.m43405a(this.f186801d).mo37479a(R.string.frw).mo37483b(R.string.frv)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f186806i.mo36387a(R.id.dg9, new C83711e(new C83693l(this), this.f186807j, this.f186800c, mo128676d().mo113515d()), "RecordExitScene");
        this.f186803f.mo22799ag().mo6997a(this, new C83694m(this));
        mo128676d().mo113507a().mo7036a(this, new C83695n(this));
        if (C65436ds.m117154a() && C89070n.m154522b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(this.f186802e.f155838w)) {
            mo128678f().mo23097a(new C83692k(this), 10);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$k */
    public static final class C83692k extends AbstractC14318d {

        /* renamed from: a */
        final /* synthetic */ C83681c f186831a;

        static {
            Covode.recordClassIndex(97582);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83692k(C83681c cVar) {
            this.f186831a = cVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f186831a.f186803f.mo22747A().mo56984i() || this.f186831a.f186803f.mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f186831a.getDiContainer().mo35252b(C69938b.class, null);
            if (bVar != null && bVar.mo110376d()) {
                return false;
            }
            if (!C89070n.m154522b(C80573ig.m139668a(R.string.f7r), C80573ig.m139668a(R.string.f7l)).contains(this.f186831a.mo128679g().getCurrentBottomTag())) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23047a(motionEvent, motionEvent2, f, f2);
            }
            AbstractC14318d a = this.f186831a.mo128678f().mo23095a(1);
            if (a != null && a.mo23047a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f186831a.mo128678f().mo23095a(6);
            if ((a2 == null || !a2.mo23047a(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f186831a.f186803f.mo22747A().mo56984i() || this.f186831a.f186803f.mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f186831a.getDiContainer().mo35252b(C69938b.class, null);
            if (bVar != null && bVar.mo110376d()) {
                return false;
            }
            if (!C89070n.m154522b(C80573ig.m139668a(R.string.f7r), C80573ig.m139668a(R.string.f7l)).contains(this.f186831a.mo128679g().getCurrentBottomTag())) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23057b(motionEvent, motionEvent2, f, f2);
            }
            AbstractC14318d a = this.f186831a.mo128678f().mo23095a(1);
            if (a != null && a.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f186831a.mo128678f().mo23095a(6);
            if (a2 != null && a2.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            double b = (double) C70636dh.m124831b(this.f186831a.f186801d);
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            if (!C80471gb.m139483a(this.f186831a.f186801d)) {
                if (motionEvent.getX() > motionEvent2.getX()) {
                    Double.isNaN(b);
                    if (((double) (motionEvent.getX() - motionEvent2.getX())) > b * 0.2d) {
                        this.f186831a.mo128664a("slide_left", -1);
                    }
                }
            } else if (motionEvent2.getX() > motionEvent.getX()) {
                Double.isNaN(b);
                if (((double) (motionEvent2.getX() - motionEvent.getX())) > b * 0.2d) {
                    this.f186831a.mo128664a("slide_left", -1);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$q */
    public static final class C83698q extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C83698q f186837a = new C83698q();

        static {
            Covode.recordClassIndex(97588);
        }

        C83698q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo128673a(String str) {
        C73968au.m130096a(str, this.f186802e);
        C73967at.m130093a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: a */
    public final void mo128674a(boolean z) {
        AbstractC22186b bVar = this.f186806i;
        if (z || this.f186802e.mo110018b()) {
            C22226a.m41823a(bVar, "RecordExitScene");
        } else {
            C22226a.m41824b(bVar, "RecordExitScene");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$m */
    static final class C83694m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83681c f186833a;

        static {
            Covode.recordClassIndex(97584);
        }

        C83694m(C83681c cVar) {
            this.f186833a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z = ((C14191k) obj).f34466b;
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(1.0f);
            if (z) {
                this.f186833a.f186800c.mo7019b(C89387v.m154943a(valueOf, valueOf2));
            } else {
                this.f186833a.f186800c.mo7019b(C89387v.m154943a(valueOf2, valueOf));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$n */
    static final class C83695n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83681c f186834a;

        static {
            Covode.recordClassIndex(97585);
        }

        C83695n(C83681c cVar) {
            this.f186834a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f186834a.mo128676d().mo113519g()) {
                this.f186834a.mo128674a(false);
                return;
            }
            C83681c cVar = this.f186834a;
            C89219l.m154716b(bool, "");
            cVar.mo128674a(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$p */
    public static final class C83697p extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83681c f186836a;

        static {
            Covode.recordClassIndex(97587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83697p(C83681c cVar) {
            super(1);
            this.f186836a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            C83681c cVar = this.f186836a;
            cVar.mo128677e().mo128898F().mo109783a();
            cVar.f186802e.mo110013a(false);
            cVar.mo128676d().mo113510a(true, false);
            if (C72847c.m128627a(C75346e.m132154a(cVar.mo128677e()))) {
                ((AbstractC83490a) cVar.f186805h.mo23374a(cVar, C83681c.f186798a[6])).changeHasMusic(null);
            }
            C75346e.m132156a(cVar.mo128677e(), (Effect) null);
            C78105b.m136529a(C78104a.f175370a);
            cVar.mo128675c().mo22893c(true);
            ((AbstractC14333c) cVar.f186804g.mo23374a(cVar, C83681c.f186798a[3])).mo23139a(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C83681c(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f186806i = bVar;
        this.f186815r = fVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a
    /* renamed from: a */
    public final void mo128664a(String str, long j) {
        this.f186814q = j;
        if (this.f186802e.f155817b.f155645a == 1 && !this.f186802e.f155817b.f155653i && !this.f186802e.mo110041q()) {
            mo128680h().mo128667a(new C83682a(this, str));
        } else if (this.f186802e.f155817b.mo109896h() == 0) {
            if (this.f186802e.mo110018b()) {
                mo128681i();
            } else if (this.f186802e.mo110022c()) {
                mo128680h().mo128670b(C83684c.f186819a, new C83685d(this, str), new C83686e(this, str));
            } else {
                mo128673a(str);
                mo128680h().mo128666a();
            }
        } else if (this.f186802e.mo110022c()) {
            mo128680h().mo128672c(C83687f.f186824a, new C83688g(this, str), new C83689h(this));
        } else {
            mo128680h().mo128668a(C83690i.f186828a, new C83691j(this, str), new C83683b(this));
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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
