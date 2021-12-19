package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75298d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75342a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75588b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84446e;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel */
public abstract class BaseStickerListViewModel extends HumbleViewModel implements AbstractC76397b<Effect>, AbstractC76397b {

    /* renamed from: a */
    private final C88411a f171587a = new C88411a();

    /* renamed from: b */
    private final C76392c f171588b = new C76392c(this);

    /* renamed from: c */
    private final AbstractC89244h f171589c = C89250i.m154773a((AbstractC89171a) new C76393d(this));

    /* renamed from: l */
    public final C1213t<List<Effect>> f171590l = new C1213t<>();

    /* renamed from: m */
    public final C1213t<EnumC85026a> f171591m = new C1213t<>();

    /* renamed from: n */
    public final C1213t<C20391d<Effect>> f171592n = new C1213t<>();

    /* renamed from: o */
    public final AbstractC75655o f171593o;

    /* renamed from: p */
    public final AbstractC75300d f171594p;

    /* renamed from: q */
    public final AbstractC76151g f171595q;

    /* renamed from: r */
    public final AbstractC76150f f171596r;

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$b */
    static final class C76391b implements IUpdateTagListener {

        /* renamed from: a */
        public static final C76391b f171601a = new C76391b();

        static {
            Covode.recordClassIndex(89347);
        }

        C76391b() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    static {
        Covode.recordClassIndex(89344);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Effect mo119825a(C76401f<Effect> fVar);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final AbstractC76400e<Effect> mo120103o() {
        return (AbstractC76400e) this.f171589c.getValue();
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: l */
    public final LiveData<List<Effect>> mo120100l() {
        return this.f171590l;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: m */
    public final LiveData<EnumC85026a> mo120101m() {
        return this.f171591m;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: n */
    public final LiveData<C20391d<Effect>> mo120102n() {
        return this.f171592n;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$d */
    static final class C76393d extends AbstractC89220m implements AbstractC89171a<AbstractC76400e<Effect>> {

        /* renamed from: a */
        final /* synthetic */ BaseStickerListViewModel f171603a;

        static {
            Covode.recordClassIndex(89349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76393d(BaseStickerListViewModel baseStickerListViewModel) {
            super(0);
            this.f171603a = baseStickerListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76400e<Effect> invoke() {
            return this.f171603a.mo120041i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC76400e<Effect> mo120041i() {
        return new C76389a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: k */
    public final LiveData<C89386u<Effect, EnumC84444c, Integer>> mo120099k() {
        return this.f171596r.mo119906a();
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        this.f171587a.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$a */
    public static final class C76389a implements AbstractC76400e<Effect> {

        /* renamed from: a */
        public final HashMap<String, Integer> f171597a = new HashMap<>();

        /* renamed from: b */
        public final HashMap<String, Integer> f171598b = new HashMap<>();

        static {
            Covode.recordClassIndex(89345);
        }

        C76389a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$a$a */
        static final class CallableC76390a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C76389a f171599a;

            /* renamed from: b */
            final /* synthetic */ List f171600b;

            static {
                Covode.recordClassIndex(89346);
            }

            CallableC76390a(C76389a aVar, List list) {
                this.f171599a = aVar;
                this.f171600b = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                int i = 0;
                for (Object obj : this.f171600b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    EffectTemplate effectTemplate = (EffectTemplate) obj;
                    if (effectTemplate != null) {
                        String effectId = effectTemplate.getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            this.f171599a.f171597a.put(effectId, Integer.valueOf(i));
                        }
                        String resourceId = effectTemplate.getResourceId();
                        if (!TextUtils.isEmpty(resourceId)) {
                            this.f171599a.f171598b.put(resourceId, Integer.valueOf(i));
                        }
                    }
                    i = i2;
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76400e
        /* renamed from: a */
        public final void mo120044a(List<? extends Effect> list) {
            C89219l.m154721d(list, "");
            this.f171597a.clear();
            this.f171598b.clear();
            C1731i.m5635a((Callable) new CallableC76390a(this, list));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76400e
        /* renamed from: a */
        public final /* synthetic */ int mo120043a(Effect effect) {
            Effect effect2 = effect;
            if (effect2 == null) {
                return -1;
            }
            Integer num = this.f171597a.get(effect2.getEffectId());
            if (num != null || (!TextUtils.isEmpty(effect2.getResourceId()) && (num = this.f171598b.get(effect2.getResourceId())) != null)) {
                return num.intValue();
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$c */
    public static final class C76392c implements AbstractC75374c.AbstractC75375a {

        /* renamed from: a */
        final /* synthetic */ BaseStickerListViewModel f171602a;

        static {
            Covode.recordClassIndex(89348);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76392c(BaseStickerListViewModel baseStickerListViewModel) {
            this.f171602a = baseStickerListViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: b */
        public final void mo118620b(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f171602a.mo120096a(effect, EnumC84444c.DOWNLOAD_SUCCESS, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: c */
        public final void mo118621c(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f171602a.mo120096a(effect, EnumC84444c.DOWNLOADING, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118618a(Effect effect, int i) {
            C89219l.m154721d(effect, "");
            this.f171602a.mo120096a(effect, EnumC84444c.DOWNLOADING, Integer.valueOf(i));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118619a(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(effect, "");
            this.f171602a.mo120096a(effect, EnumC84444c.DOWNLOAD_FAILED, null);
            this.f171602a.f171592n.setValue(new C20391d<>(effect));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: a */
    public final /* synthetic */ C89378p mo120095a(Object obj) {
        Effect effect = (Effect) obj;
        C89219l.m154721d(effect, "");
        return this.f171596r.mo119907a(effect);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: b */
    public final /* synthetic */ int mo120097b(Object obj) {
        return mo120103o().mo120043a((Effect) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: b */
    public final void mo120098b(C76401f<Effect> fVar) {
        boolean z;
        Effect effect;
        C89219l.m154721d(fVar, "");
        DATA data = fVar.f171622a;
        int i = fVar.f171623b;
        int i2 = fVar.f171624c;
        boolean z2 = fVar.f171625d;
        boolean z3 = fVar.f171626e;
        boolean z4 = fVar.f171627f;
        Bundle bundle = fVar.f171628g;
        AbstractC75374c.AbstractC75376b bVar = fVar.f171629h;
        AbstractC89171a<C89391z> aVar = fVar.f171630i;
        AbstractC89171a<C89391z> aVar2 = fVar.f171631j;
        if (!C75466g.m132368t(this.f171593o.mo119294f())) {
            boolean a = mo119827a(data, z3);
            if (z2) {
                z = a;
            } else {
                z = false;
            }
            this.f171593o.mo119302n().mo119319a(new C75588b(data, i2, i, z, z3));
            if (!a || z3) {
                AbstractC75655o oVar = this.f171593o;
                C89219l.m154721d(oVar, "");
                C89219l.m154721d(data, "");
                AbstractC75706l c = oVar.mo119291c().mo119457c();
                C89219l.m154721d(c, "");
                C89219l.m154721d(data, "");
                C89378p<EnumC84446e, Boolean> b = c.mo129431b(new C75691ac(data));
                if (b != null) {
                    EnumC84446e component1 = b.component1();
                    boolean booleanValue = b.component2().booleanValue();
                    if ((component1 == EnumC84446e.PENDING || component1 == EnumC84446e.START) && booleanValue) {
                        return;
                    }
                }
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.f171595q.mo119910a((Effect) data, (IUpdateTagListener) C76391b.f171601a);
                AbstractC75300d dVar = this.f171594p;
                EnumC75295a aVar3 = EnumC75295a.UI_CLICK;
                if (z4) {
                    effect = mo119825a(fVar);
                } else {
                    effect = null;
                }
                dVar.mo118613a(C75342a.m132143a(data, i, aVar3, effect, bundle, this.f171588b, bVar, i2, false, 128));
            } else if (z2) {
                if (aVar != null) {
                    aVar.invoke();
                }
                AbstractC75300d dVar2 = this.f171594p;
                EnumC75295a aVar4 = EnumC75295a.UI_CLICK;
                C89219l.m154721d(aVar4, "");
                dVar2.mo118613a(new C75298d(data, i, aVar4, bundle));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo119827a(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        if (!z) {
            return C75344c.m132149b(this.f171593o, effect);
        }
        return C75344c.m132150c(this.f171593o, effect);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120096a(Effect effect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        this.f171596r.mo119908a(effect, cVar, num, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseStickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar, AbstractC76150f fVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
        this.f171593o = oVar;
        this.f171594p = dVar;
        this.f171595q = gVar;
        this.f171596r = fVar;
    }
}
