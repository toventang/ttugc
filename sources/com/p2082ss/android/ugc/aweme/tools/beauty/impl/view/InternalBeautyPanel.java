package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.p025c.C0484a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77871b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77872c;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77873d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77874e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77875f;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import java.util.ArrayList;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel */
public class InternalBeautyPanel implements AbstractC33974au, AbstractC78056f {

    /* renamed from: a */
    public AbstractC77870a f174924a;

    /* renamed from: b */
    public C77990c f174925b;

    /* renamed from: c */
    public AbstractC77872c f174926c;

    /* renamed from: d */
    public C78011f f174927d;

    /* renamed from: e */
    public AbstractC77875f f174928e;

    /* renamed from: f */
    public C78007e f174929f;

    /* renamed from: g */
    public AbstractC77874e f174930g;

    /* renamed from: h */
    public C77991d f174931h;

    /* renamed from: i */
    public AbstractC77873d f174932i;

    /* renamed from: j */
    public C77989b f174933j;

    /* renamed from: k */
    public AbstractC77871b f174934k;

    /* renamed from: l */
    public AbstractC78056f.AbstractC78057a f174935l;

    /* renamed from: m */
    public AbstractC78056f.AbstractC78058b f174936m;

    /* renamed from: n */
    public C77988a f174937n;

    /* renamed from: o */
    public final Context f174938o;

    /* renamed from: p */
    public final ViewGroup f174939p;

    /* renamed from: q */
    public final AbstractC77967m f174940q;

    /* renamed from: r */
    public final C77861e f174941r;

    /* renamed from: s */
    private ViewGroup f174942s;

    /* renamed from: t */
    private boolean f174943t;

    /* renamed from: u */
    private final C78012g f174944u;

    static {
        Covode.recordClassIndex(91072);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: a */
    public final AbstractC77872c mo121669a() {
        AbstractC77872c cVar = this.f174926c;
        if (cVar == null) {
            C89219l.m154710a("beautyList");
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    /* renamed from: b */
    public final void mo121670b() {
        if (!this.f174943t) {
            this.f174943t = true;
            C41093a.m82765c("InternalBeautyPanel show");
            AbstractC77872c cVar = this.f174926c;
            if (cVar == null) {
                C89219l.m154710a("beautyList");
            }
            cVar.mo121490g();
            AbstractC77872c cVar2 = this.f174926c;
            if (cVar2 == null) {
                C89219l.m154710a("beautyList");
            }
            cVar2.mo121489f();
            AbstractC77870a aVar = this.f174924a;
            if (aVar == null) {
                C89219l.m154710a("contentView");
            }
            aVar.mo121467a();
            AbstractC78056f.AbstractC78057a aVar2 = this.f174935l;
            if (aVar2 != null) {
                aVar2.mo22723a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    /* renamed from: c */
    public final void mo121671c() {
        if (this.f174943t) {
            this.f174943t = false;
            C41093a.m82765c("InternalBeautyPanel hide");
            C77988a aVar = this.f174937n;
            aVar.mo121674a(aVar.f174957b);
            AbstractC77870a aVar2 = this.f174924a;
            if (aVar2 == null) {
                C89219l.m154710a("contentView");
            }
            aVar2.mo121468b();
            AbstractC78056f.AbstractC78057a aVar3 = this.f174935l;
            if (aVar3 != null) {
                aVar3.mo22724b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel$c */
    static final class C77985c<T> implements AbstractC1214u<C0484a<String, Integer>> {

        /* renamed from: a */
        final /* synthetic */ InternalBeautyPanel f174953a;

        static {
            Covode.recordClassIndex(91075);
        }

        C77985c(InternalBeautyPanel internalBeautyPanel) {
            this.f174953a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C0484a<String, Integer> aVar) {
            this.f174953a.mo121669a().mo121478a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel$e */
    static final class View$OnClickListenerC77987e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InternalBeautyPanel f174955a;

        static {
            Covode.recordClassIndex(91077);
        }

        View$OnClickListenerC77987e(InternalBeautyPanel internalBeautyPanel) {
            this.f174955a = internalBeautyPanel;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f174955a.mo121671c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel$d */
    static final class C77986d<T> implements AbstractC1214u<ComposerBeauty> {

        /* renamed from: a */
        final /* synthetic */ InternalBeautyPanel f174954a;

        static {
            Covode.recordClassIndex(91076);
        }

        C77986d(InternalBeautyPanel internalBeautyPanel) {
            this.f174954a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            AbstractC77872c a = this.f174954a.mo121669a();
            C89219l.m154716b(composerBeauty2, "");
            a.mo121486c(composerBeauty2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    public void setContainer(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f174942s = viewGroup;
        AbstractC77870a aVar = this.f174924a;
        if (aVar == null) {
            C89219l.m154710a("contentView");
        }
        aVar.setContainer(this.f174942s);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel$b */
    static final class C77984b<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InternalBeautyPanel f174952a;

        static {
            Covode.recordClassIndex(91074);
        }

        C77984b(InternalBeautyPanel internalBeautyPanel) {
            this.f174952a = internalBeautyPanel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f174952a.f174940q.mo121584a()) {
                T t2 = t;
                if (C89219l.m154714a((Object) t2.getBeautyCategoryExtra().getParentId(), (Object) "") || C89219l.m154714a((Object) t2.getBeautyCategoryExtra().getParentId(), (Object) "null")) {
                    arrayList.add(t);
                }
            }
            this.f174952a.mo121669a().mo121481a(arrayList);
            AbstractC77875f fVar = this.f174952a.f174928e;
            if (fVar == null) {
                C89219l.m154710a("beautyTabView");
            }
            fVar.mo121503a(arrayList);
            AbstractC77871b bVar = this.f174952a.f174934k;
            if (bVar == null) {
                C89219l.m154710a("beautyEnableView");
            }
            bVar.mo121473a();
            AbstractC77874e eVar = this.f174952a.f174930g;
            if (eVar == null) {
                C89219l.m154710a("beautySeekBar");
            }
            eVar.mo121498a();
            AbstractC77873d dVar = this.f174952a.f174932i;
            if (dVar == null) {
                C89219l.m154710a("beautyResetView");
            }
            dVar.mo121493a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel$a */
    public static final class C77983a {

        /* renamed from: a */
        public C77861e f174945a = new C77861e();

        /* renamed from: b */
        public AbstractC78056f.AbstractC78057a f174946b;

        /* renamed from: c */
        public AbstractC78056f.AbstractC78058b f174947c;

        /* renamed from: d */
        public AbstractC78049b f174948d;

        /* renamed from: e */
        public final Context f174949e;

        /* renamed from: f */
        public final ViewGroup f174950f;

        /* renamed from: g */
        public final AbstractC77967m f174951g;

        static {
            Covode.recordClassIndex(91073);
        }

        public C77983a(Context context, ViewGroup viewGroup, AbstractC77967m mVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(mVar, "");
            this.f174949e = context;
            this.f174950f = viewGroup;
            this.f174951g = mVar;
        }
    }

    private InternalBeautyPanel(Context context, ViewGroup viewGroup, AbstractC77967m mVar, C77861e eVar) {
        this.f174938o = context;
        this.f174939p = viewGroup;
        this.f174940q = mVar;
        this.f174941r = eVar;
        this.f174942s = viewGroup;
        this.f174936m = eVar.f174736n;
        this.f174937n = new C77988a();
        C78012g gVar = new C78012g();
        this.f174944u = gVar;
        AbstractC77870a aVar = (AbstractC77870a) eVar.f174690b.f174663b.invoke(context, viewGroup, eVar);
        aVar = aVar == null ? new C78013h(context, viewGroup, eVar, (byte) 0) : aVar;
        this.f174924a = aVar;
        gVar.mo121717a(AbstractC77870a.class, aVar);
        AbstractC77870a aVar2 = this.f174924a;
        if (aVar2 == null) {
            C89219l.m154710a("contentView");
        }
        aVar2.setDismissViewClickListener(new View$OnClickListenerC77987e(this));
        AbstractC77870a aVar3 = this.f174924a;
        if (aVar3 == null) {
            C89219l.m154710a("contentView");
        }
        aVar3.mo121469c();
        this.f174925b = new C77990c(mVar, this.f174936m, this.f174935l, this.f174937n, gVar);
        AbstractC89188r<? super Context, ? super View, ? super C77861e, ? super C77990c, ? extends AbstractC77872c> rVar = eVar.f174691c.f174687s;
        AbstractC77870a aVar4 = this.f174924a;
        if (aVar4 == null) {
            C89219l.m154710a("contentView");
        }
        View root = aVar4.getRoot();
        C77990c cVar = this.f174925b;
        if (cVar == null) {
            C89219l.m154710a("listBusiness");
        }
        AbstractC77872c cVar2 = (AbstractC77872c) rVar.mo8774a(context, root, eVar, cVar);
        if (cVar2 == null) {
            AbstractC77870a aVar5 = this.f174924a;
            if (aVar5 == null) {
                C89219l.m154710a("contentView");
            }
            View root2 = aVar5.getRoot();
            C77990c cVar3 = this.f174925b;
            if (cVar3 == null) {
                C89219l.m154710a("listBusiness");
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(root2, "");
            C89219l.m154721d(cVar3, "");
            C89219l.m154721d(eVar, "");
            cVar2 = new C78017j(context, root2, eVar, cVar3);
        }
        this.f174926c = cVar2;
        gVar.mo121717a(AbstractC77872c.class, cVar2);
        this.f174929f = new C78007e(mVar, this.f174935l, this.f174936m, gVar);
        AbstractC89188r<? super Context, ? super View, ? super C77861e, ? super C78007e, ? extends AbstractC77874e> rVar2 = eVar.f174692d.f174711k;
        AbstractC77870a aVar6 = this.f174924a;
        if (aVar6 == null) {
            C89219l.m154710a("contentView");
        }
        View root3 = aVar6.getRoot();
        C78007e eVar2 = this.f174929f;
        if (eVar2 == null) {
            C89219l.m154710a("seekBarBusiness");
        }
        AbstractC77874e eVar3 = (AbstractC77874e) rVar2.mo8774a(context, root3, eVar, eVar2);
        if (eVar3 == null) {
            AbstractC77870a aVar7 = this.f174924a;
            if (aVar7 == null) {
                C89219l.m154710a("contentView");
            }
            View root4 = aVar7.getRoot();
            C78007e eVar4 = this.f174929f;
            if (eVar4 == null) {
                C89219l.m154710a("seekBarBusiness");
            }
            eVar3 = new C78038l(context, root4, eVar, eVar4);
        }
        this.f174930g = eVar3;
        gVar.mo121717a(AbstractC77874e.class, eVar3);
        AbstractC78056f.AbstractC78057a aVar8 = this.f174935l;
        AbstractC78056f.AbstractC78058b bVar = this.f174936m;
        C77988a aVar9 = this.f174937n;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar9, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(eVar, "");
        this.f174931h = new C77991d(mVar, aVar8, bVar, aVar9, gVar, eVar);
        AbstractC89188r<? super Context, ? super View, ? super C77861e, ? super C77991d, ? extends AbstractC77873d> rVar3 = eVar.f174694f.f174696a;
        AbstractC77870a aVar10 = this.f174924a;
        if (aVar10 == null) {
            C89219l.m154710a("contentView");
        }
        View root5 = aVar10.getRoot();
        C77991d dVar = this.f174931h;
        if (dVar == null) {
            C89219l.m154710a("beautyResetBusiness");
        }
        AbstractC77873d dVar2 = (AbstractC77873d) rVar3.mo8774a(context, root5, eVar, dVar);
        if (dVar2 == null) {
            AbstractC77870a aVar11 = this.f174924a;
            if (aVar11 == null) {
                C89219l.m154710a("contentView");
            }
            View root6 = aVar11.getRoot();
            C77991d dVar3 = this.f174931h;
            if (dVar3 == null) {
                C89219l.m154710a("beautyResetBusiness");
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(root6, "");
            C89219l.m154721d(dVar3, "");
            C89219l.m154721d(eVar, "");
            dVar2 = new C78034k(context, root6, eVar, dVar3);
        }
        this.f174932i = dVar2;
        gVar.mo121717a(AbstractC77873d.class, dVar2);
        C77988a aVar12 = this.f174937n;
        AbstractC78056f.AbstractC78058b bVar2 = this.f174936m;
        AbstractC77872c cVar4 = this.f174926c;
        if (cVar4 == null) {
            C89219l.m154710a("beautyList");
        }
        this.f174927d = new C78011f(mVar, aVar12, bVar2, cVar4);
        AbstractC89188r<? super Context, ? super View, ? super C77861e, ? super C78011f, ? extends AbstractC77875f> rVar4 = eVar.f174693e.f174713a;
        AbstractC77870a aVar13 = this.f174924a;
        if (aVar13 == null) {
            C89219l.m154710a("contentView");
        }
        View root7 = aVar13.getRoot();
        C78011f fVar = this.f174927d;
        if (fVar == null) {
            C89219l.m154710a("tabViewBusiness");
        }
        AbstractC77875f fVar2 = (AbstractC77875f) rVar4.mo8774a(context, root7, eVar, fVar);
        if (fVar2 == null) {
            AbstractC77870a aVar14 = this.f174924a;
            if (aVar14 == null) {
                C89219l.m154710a("contentView");
            }
            View root8 = aVar14.getRoot();
            C78011f fVar3 = this.f174927d;
            if (fVar3 == null) {
                C89219l.m154710a("tabViewBusiness");
            }
            fVar2 = new C78040m(context, root8, eVar, fVar3);
        }
        this.f174928e = fVar2;
        gVar.mo121717a(AbstractC77875f.class, fVar2);
        AbstractC78056f.AbstractC78057a aVar15 = this.f174935l;
        C77988a aVar16 = this.f174937n;
        AbstractC77873d dVar4 = this.f174932i;
        if (dVar4 == null) {
            C89219l.m154710a("beautyResetView");
        }
        AbstractC77875f fVar4 = this.f174928e;
        if (fVar4 == null) {
            C89219l.m154710a("beautyTabView");
        }
        this.f174933j = new C77989b(mVar, aVar15, aVar16, dVar4, fVar4);
        AbstractC89188r<? super Context, ? super View, ? super C77861e, ? super C77989b, ? extends AbstractC77871b> rVar5 = eVar.f174695g.f174667a;
        AbstractC77870a aVar17 = this.f174924a;
        if (aVar17 == null) {
            C89219l.m154710a("contentView");
        }
        View root9 = aVar17.getRoot();
        C77989b bVar3 = this.f174933j;
        if (bVar3 == null) {
            C89219l.m154710a("enableViewBusiness");
        }
        AbstractC77871b bVar4 = (AbstractC77871b) rVar5.mo8774a(context, root9, eVar, bVar3);
        if (bVar4 == null) {
            AbstractC77870a aVar18 = this.f174924a;
            if (aVar18 == null) {
                C89219l.m154710a("contentView");
            }
            View root10 = aVar18.getRoot();
            C77989b bVar5 = this.f174933j;
            if (bVar5 == null) {
                C89219l.m154710a("enableViewBusiness");
            }
            bVar4 = new C78014i(context, root10, eVar, bVar5);
        }
        this.f174934k = bVar4;
        gVar.mo121717a(AbstractC77871b.class, bVar4);
        if (context instanceof ActivityC0218d) {
            ((ActivityC0580d) context).getLifecycle().mo4012a(this);
            ActivityC0218d dVar5 = (ActivityC0218d) context;
            mVar.mo121600b().mo70310a(dVar5, new C77984b(this));
            mVar.mo121617h().observe(dVar5, new C77985c(this));
            mVar.mo121613f().mo70310a(dVar5, new C77986d(this));
        }
    }

    public /* synthetic */ InternalBeautyPanel(Context context, ViewGroup viewGroup, AbstractC77967m mVar, C77861e eVar, byte b) {
        this(context, viewGroup, mVar, eVar);
    }
}
