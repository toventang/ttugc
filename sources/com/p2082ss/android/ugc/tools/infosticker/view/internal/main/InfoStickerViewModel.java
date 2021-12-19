package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84540h;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84544l;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84692d;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel */
public final class InfoStickerViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC84701l {

    /* renamed from: a */
    public boolean f189271a;

    /* renamed from: b */
    public final Context f189272b;

    /* renamed from: c */
    final AbstractC84640a<EffectCategoryResponse, Effect> f189273c;

    /* renamed from: d */
    final AbstractC84693e<Effect> f189274d;

    /* renamed from: e */
    private final LinkedBlockingQueue<Effect> f189275e;

    /* renamed from: f */
    private boolean f189276f;

    /* renamed from: g */
    private boolean f189277g;

    /* renamed from: h */
    private final C88411a f189278h;

    /* renamed from: i */
    private final C84722d f189279i;

    /* renamed from: j */
    private final AbstractC1204m f189280j;

    /* renamed from: k */
    private final String f189281k;

    /* renamed from: l */
    private final String f189282l;

    /* renamed from: m */
    private final AbstractC84536d f189283m;

    /* renamed from: n */
    private final AbstractC84534b f189284n;

    /* renamed from: o */
    private final AbstractC84538f f189285o;

    /* renamed from: p */
    private final AbstractC84700k<Effect> f189286p;

    /* renamed from: q */
    private final AbstractC84700k<Effect> f189287q;

    /* renamed from: r */
    private final AbstractC84697h<ProviderEffect> f189288r;

    /* renamed from: s */
    private final AbstractC84700k<ProviderEffect> f189289s;

    /* renamed from: t */
    private final AbstractC84698i<InfoStickerEffect> f189290t;

    /* renamed from: u */
    private final AbstractC84700k<InfoStickerEffect> f189291u;

    /* renamed from: v */
    private final AbstractC84692d f189292v;

    /* renamed from: w */
    private final AbstractC89172b<C84443b, AbstractC84693e<Effect>> f189293w;

    /* renamed from: x */
    private final AbstractC89171a<AbstractC84700k<Effect>> f189294x;

    static {
        Covode.recordClassIndex(98692);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: a */
    public final AbstractC84692d mo129623a() {
        return this.f189292v;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: b */
    public final AbstractC84640a<EffectCategoryResponse, Effect> mo129626b() {
        return this.f189273c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: c */
    public final AbstractC84700k<Effect> mo129627c() {
        return this.f189286p;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: d */
    public final AbstractC84693e<Effect> mo129628d() {
        return this.f189274d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: e */
    public final AbstractC84700k<Effect> mo129629e() {
        return this.f189287q;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: f */
    public final AbstractC84697h<ProviderEffect> mo129630f() {
        return this.f189288r;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: g */
    public final AbstractC84700k<ProviderEffect> mo129631g() {
        return this.f189289s;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: h */
    public final AbstractC84698i<InfoStickerEffect> mo129632h() {
        return this.f189290t;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: i */
    public final AbstractC84700k<InfoStickerEffect> mo129633i() {
        return this.f189291u;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$d */
    public static final class C84722d implements AbstractC72827a {

        /* renamed from: a */
        final /* synthetic */ InfoStickerViewModel f189302a;

        static {
            Covode.recordClassIndex(98698);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: b */
        public final void mo115162b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3858s.AbstractC72827a
        /* renamed from: a */
        public final void mo115161a() {
            if (C72829c.m128605c(this.f189302a.f189272b)) {
                this.f189302a.mo129637j();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84722d(InfoStickerViewModel infoStickerViewModel) {
            this.f189302a = infoStickerViewModel;
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f189275e.clear();
        this.f189278h.dispose();
        C72828b.m128598b(this.f189279i);
    }

    /* renamed from: j */
    public final void mo129637j() {
        if (!isDestroyed() && this.f189276f && !this.f189271a && !C72829c.m128605c(this.f189272b)) {
            this.f189271a = true;
            m145597k();
        }
    }

    /* renamed from: k */
    private final void m145597k() {
        Effect poll = this.f189275e.poll();
        if (poll == null) {
            this.f189271a = false;
            return;
        }
        this.f189278h.mo142945a(this.f189283m.mo129422a(poll, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C84720b(this), new C84721c(this)));
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: a */
    public final void mo129625a(boolean z) {
        this.f189276f = z;
        if (z) {
            mo129637j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$c */
    public static final class C84721c<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerViewModel f189301a;

        static {
            Covode.recordClassIndex(98697);
        }

        C84721c(InfoStickerViewModel infoStickerViewModel) {
            this.f189301a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189301a.f189271a = false;
            this.f189301a.mo129637j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$b */
    public static final class C84720b<T> implements AbstractC88433f<C84540h> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerViewModel f189300a;

        static {
            Covode.recordClassIndex(98696);
        }

        C84720b(InfoStickerViewModel infoStickerViewModel) {
            this.f189300a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C84540h hVar) {
            C84540h hVar2 = hVar;
            if (hVar2.f188937b.f188959a == EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS || hVar2.f188937b.f188959a == EnumC84544l.INFO_STICKER_STATE_DOWNLOAD_FAILED) {
                this.f189300a.f189271a = false;
                this.f189300a.mo129637j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$a */
    static final class C84719a<T> implements AbstractC1214u<List<? extends AbstractC84456m>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerViewModel f189299a;

        static {
            Covode.recordClassIndex(98695);
        }

        C84719a(InfoStickerViewModel infoStickerViewModel) {
            this.f189299a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends AbstractC84456m> list) {
            AbstractC84456m mVar;
            AbstractC84693e<Effect> eVar;
            List<? extends AbstractC84456m> list2 = list;
            if (list2 != null && (mVar = (AbstractC84456m) C89070n.m154583g((List) list2)) != null) {
                AbstractC84640a<EffectCategoryResponse, Effect> aVar = this.f189299a.f189273c;
                if (aVar != null) {
                    aVar.mo129558a(mVar);
                }
                AbstractC84456m mVar2 = (AbstractC84456m) C89070n.m154561b((List) list2, 1);
                if (mVar2 != null && (eVar = this.f189299a.f189274d) != null) {
                    eVar.mo129558a(mVar2);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84701l
    /* renamed from: a */
    public final void mo129624a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        if (!isDestroyed()) {
            this.f189275e.addAll(list);
            if (!this.f189277g) {
                C72828b.m128594a(this.f189272b);
                C72828b.m128598b(this.f189279i);
                this.f189277g = true;
            }
            mo129637j();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InfoStickerViewModel(android.content.Context r15, final androidx.lifecycle.AbstractC1204m r16, final com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d r17, com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b r18, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a r19) {
        /*
            r14 = this;
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel r6 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel
            r2 = r16
            r3 = r17
            r6.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerEmojiListViewModel r7 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerEmojiListViewModel
            r7.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel r8 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel
            r8.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel r9 = new com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel
            r4 = r18
            r9.<init>(r2, r4)
            r10 = r9
            com.ss.android.ugc.tools.infosticker.view.internal.k r10 = (com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k) r10
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel r11 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel
            r11.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$1 r12 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$1
            r12.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$2 r13 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$2
            r13.<init>(r2, r3)
            r0 = r14
            r5 = r19
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel.<init>(android.content.Context, androidx.lifecycle.m, com.ss.android.ugc.tools.infosticker.a.a.d, com.ss.android.ugc.tools.infosticker.a.a.b, com.ss.android.ugc.tools.infosticker.view.internal.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super com.ss.android.ugc.tools.h.a.b, ? extends com.ss.android.ugc.tools.infosticker.view.internal.e<com.ss.android.ugc.effectmanager.effect.model.Effect>> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.view.internal.k<com.ss.android.ugc.effectmanager.effect.model.Effect>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InfoStickerViewModel(Context context, AbstractC1204m mVar, AbstractC84536d dVar, AbstractC84534b bVar, AbstractC84640a<EffectCategoryResponse, Effect> aVar, AbstractC84700k<Effect> kVar, AbstractC84693e<Effect> eVar, AbstractC84700k<Effect> kVar2, AbstractC84697h<ProviderEffect> hVar, AbstractC84700k<ProviderEffect> kVar3, AbstractC84692d dVar2, AbstractC89172b<? super C84443b, ? extends AbstractC84693e<Effect>> bVar2, AbstractC89171a<? extends AbstractC84700k<Effect>> aVar2) {
        super(mVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        this.f189272b = context;
        this.f189280j = mVar;
        this.f189281k = null;
        this.f189282l = null;
        this.f189283m = dVar;
        this.f189284n = bVar;
        this.f189285o = null;
        this.f189273c = aVar;
        this.f189286p = kVar;
        this.f189274d = eVar;
        this.f189287q = kVar2;
        this.f189288r = hVar;
        this.f189289s = kVar3;
        this.f189290t = null;
        this.f189291u = null;
        this.f189292v = dVar2;
        this.f189293w = bVar2;
        this.f189294x = aVar2;
        if (dVar2 != null) {
            dVar2.mo129603a().observe(mVar, new C84719a(this));
        }
        this.f189275e = new LinkedBlockingQueue<>();
        this.f189278h = new C88411a();
        this.f189279i = new C84722d(this);
    }
}
