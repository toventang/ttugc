package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75342a;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler */
public final class LockStickerHandler implements AbstractC33974au, AbstractC75576l, AbstractC75633m {

    /* renamed from: a */
    public boolean f170934a;

    /* renamed from: b */
    public final ActivityC0218d f170935b;

    /* renamed from: c */
    private Effect f170936c;

    /* renamed from: d */
    private int f170937d = -1;

    /* renamed from: e */
    private boolean f170938e;

    /* renamed from: f */
    private AbstractC75382h f170939f;

    /* renamed from: g */
    private boolean f170940g;

    /* renamed from: h */
    private final OnUnlockShareFinishListener f170941h = new C76084a(this);

    /* renamed from: i */
    private final AbstractC75655o f170942i;

    /* renamed from: j */
    private final AbstractC89172b<AbstractC75296b<?>, C89391z> f170943j;

    /* renamed from: k */
    private final AbstractC89171a<C89391z> f170944k;

    static {
        Covode.recordClassIndex(89029);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
        m133415d();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f170934a) {
            mo119819b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler$a */
    public static final class C76084a implements OnUnlockShareFinishListener {

        /* renamed from: a */
        final /* synthetic */ LockStickerHandler f170945a;

        static {
            Covode.recordClassIndex(89030);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppFailed() {
            C63244g.m114602a().mo73260F().mo101710a(this.f170945a.f170935b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76084a(LockStickerHandler lockStickerHandler) {
            this.f170945a = lockStickerHandler;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppSucceed(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f170945a.f170934a = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onVKShareSucceed(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f170945a.mo119819b();
        }
    }

    /* renamed from: c */
    private final void m133414c() {
        String str;
        AbstractC63227bk F = C63244g.m114602a().mo73260F();
        if (this.f170938e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        this.f170939f = F.mo101708a(str, this.f170935b, this.f170936c, this.f170941h, true);
    }

    /* renamed from: b */
    public final void mo119819b() {
        String str;
        AbstractC63227bk F = C63244g.m114602a().mo73260F();
        ActivityC0218d dVar = this.f170935b;
        if (this.f170938e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        F.mo101711a(dVar, str);
        this.f170944k.invoke();
        Effect effect = this.f170936c;
        if (effect != null) {
            this.f170943j.invoke(C75342a.m132143a(effect, this.f170937d, null, null, null, null, null, 0, false, 254));
        }
        this.f170934a = false;
        this.f170938e = false;
    }

    /* renamed from: d */
    private final void m133415d() {
        List<String> a;
        if (this.f170940g) {
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            if (A.mo93903b() && !TextUtils.isEmpty(A.mo93904c())) {
                C0692e<Effect, Integer> a2 = m133413a(this.f170942i);
                F f = a2.f2750a;
                S s = a2.f2751b;
                if (f != null && (a = C76086b.m133422a(this.f170935b, A.mo93904c())) != null && !a.isEmpty() && !a.contains(f.getEffectId()) && C76086b.m133425b(f)) {
                    C76086b.m133423a(this.f170935b, A.mo93904c(), f.getEffectId());
                    this.f170936c = f;
                    if (s == null) {
                        C89219l.m154715b();
                    }
                    this.f170937d = s.intValue();
                    m133414c();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170940g = true;
        m133415d();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170940g = false;
    }

    /* renamed from: a */
    private static C0692e<Effect, Integer> m133413a(AbstractC75655o oVar) {
        List<EffectCategoryModel> a = C75723b.m132877a(oVar.mo119291c().mo119464j());
        C0692e<Effect, Integer> eVar = new C0692e<>(null, -1);
        if (a.isEmpty()) {
            return eVar;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            CategoryEffectModel a2 = C75723b.m132876a(oVar.mo119291c().mo119464j(), a.get(i).getKey());
            if (a2 != null) {
                int size2 = a2.getEffects().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Effect effect = a2.getEffects().get(i2);
                    if (C72847c.m128632b(effect)) {
                        return new C0692e<>(effect, Integer.valueOf(i2));
                    }
                }
                continue;
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (C76086b.m133425b(aVar2.f170022a)) {
                C75619b a = aVar.mo119345a(C75618a.m132676a(aVar2.f170022a, aVar2.f170023b, aVar2.f170024c, aVar2.f170026e));
                this.f170936c = aVar2.f170022a;
                this.f170938e = true;
                m133414c();
                return a;
            }
        }
        return aVar.mo119345a(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public LockStickerHandler(ActivityC0218d dVar, AbstractC75655o oVar, AbstractC89172b<? super AbstractC75296b<?>, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f170935b = dVar;
        this.f170942i = oVar;
        this.f170943j = bVar;
        this.f170944k = aVar;
        dVar.getLifecycle().mo4012a(this);
    }
}
