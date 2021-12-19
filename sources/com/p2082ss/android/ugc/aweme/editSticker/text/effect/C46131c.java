package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45858a;
import com.p2082ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45869b;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.C45867a;
import com.p2082ss.android.ugc.aweme.editSticker.text.C45940a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46084c;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46104o;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c */
public final class C46131c extends C45940a {

    /* renamed from: G */
    public AbstractC45869b f107395G;

    /* renamed from: H */
    public String f107396H = "0";

    /* renamed from: I */
    public String f107397I;

    /* renamed from: J */
    public String f107398J;

    /* renamed from: K */
    public String f107399K;

    /* renamed from: L */
    public String f107400L;

    /* renamed from: M */
    public InnerEffectTextLayoutConfig f107401M;

    /* renamed from: N */
    public C46104o f107402N;

    /* renamed from: O */
    public C46084c f107403O;

    /* renamed from: P */
    public final EffectTextStickerInputLayout f107404P;

    /* renamed from: Q */
    private C45995c f107405Q;

    /* renamed from: R */
    private C89378p<C46084c, C46084c> f107406R;

    /* renamed from: S */
    private final ActivityC0945e f107407S;

    static {
        Covode.recordClassIndex(54690);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c$c */
    public static final class C46134c implements AbstractC46116b {

        /* renamed from: a */
        final /* synthetic */ C46131c f107410a;

        static {
            Covode.recordClassIndex(54693);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b
        /* renamed from: a */
        public final void mo78303a() {
            this.f107410a.mo78345r();
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b
        /* renamed from: b */
        public final void mo78304b() {
            C46185q qVar = (C46185q) this.f107410a.f107024d;
            if (qVar != null) {
                qVar.mo78408a(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b
        /* renamed from: c */
        public final void mo78305c() {
            C46185q qVar = (C46185q) this.f107410a.f107024d;
            if (qVar != null) {
                qVar.mo78408a(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46116b
        /* renamed from: d */
        public final void mo78306d() {
            C46185q qVar = (C46185q) this.f107410a.f107024d;
            if (qVar != null) {
                qVar.mo78408a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46134c(C46131c cVar) {
            this.f107410a = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: i */
    public final void mo77551i() {
        super.mo77551i();
        this.f107404P.setTextStickerInputMobListener(new C46132a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: n */
    public final void mo77556n() {
        C46239q qVar = this.f107024d;
        if (qVar != null) {
            qVar.setOnEffectTextGestureListener(new C46134c(this));
        }
    }

    /* renamed from: u */
    public final boolean mo78348u() {
        return !C89219l.m154714a(this.f107403O, new C46084c(mo77539c(), this.f107400L));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: d */
    public final int mo77543d() {
        int i;
        C45989b a = C45989b.m88764a();
        C89219l.m154716b(a, "");
        if (a.mo77598d() > 0) {
            C45989b a2 = C45989b.m88764a();
            C89219l.m154716b(a2, "");
            i = a2.mo77598d();
        } else {
            i = 28;
        }
        return (int) (((float) i) * this.f107402N.mo78289a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: f */
    public final void mo77547f() {
        String str;
        String str2;
        Effect effect;
        super.mo77547f();
        C45995c d = C45989b.m88764a().mo77599d(0);
        this.f107405Q = d;
        String str3 = "";
        if (d == null || (effect = d.f107125i) == null || (str = effect.getEffectId()) == null) {
            str = str3;
        }
        this.f107398J = str;
        C45995c cVar = this.f107405Q;
        if (!(cVar == null || (str2 = cVar.f107118b) == null)) {
            str3 = str2;
        }
        this.f107399K = str3;
    }

    /* renamed from: r */
    public final void mo78345r() {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        TextStickerData data;
        EffectTextStickerInputLayout effectTextStickerInputLayout = this.f107404P;
        C46239q qVar = this.f107024d;
        if (qVar == null || (data = qVar.getData()) == null) {
            innerEffectTextLayoutConfig = null;
        } else {
            innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
        }
        effectTextStickerInputLayout.setInnerLayoutConfig(innerEffectTextLayoutConfig);
        mo77527a(this.f107024d);
        AbstractC45869b bVar = this.f107395G;
        if (bVar != null) {
            String str = this.f107400L;
            if (str == null) {
                str = "";
            }
            bVar.mo77222b(new C45867a(str, null, null, null, null, 0, 0, 0, 254));
        }
    }

    /* renamed from: t */
    public final boolean mo78347t() {
        Iterator<T> it = mo77539c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String text = next.getText();
            if (text != null && text.length() != 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c$d */
    static final class RunnableC46135d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46131c f107411a;

        /* renamed from: b */
        final /* synthetic */ TextStickerData f107412b;

        /* renamed from: c */
        final /* synthetic */ String f107413c;

        static {
            Covode.recordClassIndex(54694);
        }

        RunnableC46135d(C46131c cVar, TextStickerData textStickerData, String str) {
            this.f107411a = cVar;
            this.f107412b = textStickerData;
            this.f107413c = str;
        }

        public final void run() {
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
            ViewParent parent = this.f107411a.f107045y.getParent();
            if (parent != null) {
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getTag() instanceof C46104o) {
                    C46131c cVar = this.f107411a;
                    Object tag = viewGroup.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                    cVar.mo78340a((C46104o) tag);
                }
            }
            TextStickerData textStickerData = this.f107412b;
            if (textStickerData != null) {
                this.f107411a.f107400L = this.f107413c;
                this.f107411a.f107403O = new C46084c(textStickerData.getTextWrapList(), this.f107411a.f107400L);
                this.f107411a.f107401M = this.f107412b.getEffectTextLayoutConfig();
                InnerEffectTextLayoutConfig effectTextLayoutConfig = this.f107412b.getEffectTextLayoutConfig();
                if (effectTextLayoutConfig != null) {
                    innerEffectTextLayoutConfig = C46136d.m89062a(effectTextLayoutConfig, this.f107411a.f107402N.mo78289a());
                } else {
                    innerEffectTextLayoutConfig = null;
                }
                textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
                this.f107411a.mo77525a(textStickerData, false);
                this.f107411a.f107404P.mo78322a(textStickerData);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: e */
    public final void mo77545e() {
        AbstractC45920e eVar;
        MethodCollector.m26663i(11698);
        super.mo77545e();
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            eVar = aVar.mo77311a(this.f107407S, 0);
        } else {
            eVar = null;
        }
        this.f107010E = eVar;
        AbstractC45920e eVar2 = this.f107010E;
        if (eVar2 != null) {
            eVar2.setEnableFakeFeedView(false);
        }
        AbstractC45920e eVar3 = this.f107010E;
        if (eVar3 != null) {
            this.f107045y.addView(eVar3.getContentView());
            C0792v.m2765c(eVar3.getContentView(), Float.MAX_VALUE);
            MethodCollector.m26664o(11698);
            return;
        }
        MethodCollector.m26664o(11698);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: q */
    public final void mo77559q() {
        mo77531a(mo77539c());
        this.f107037q = false;
        String str = "";
        if (this.f107404P.getInnerLayoutConfig() == null) {
            AbstractC45869b bVar = this.f107395G;
            if (bVar != null) {
                String str2 = this.f107400L;
                if (str2 != null) {
                    str = str2;
                }
                bVar.mo77224c(new C45867a(str, this.f107398J, this.f107399K, this.f107397I, this.f107396H, 0, 0, 0, 224));
                return;
            }
            return;
        }
        AbstractC45869b bVar2 = this.f107395G;
        if (bVar2 != null) {
            String str3 = this.f107400L;
            if (str3 != null) {
                str = str3;
            }
            bVar2.mo77224c(new C45867a(str, null, null, null, null, 0, 0, 0, 254));
        }
    }

    /* renamed from: s */
    public final void mo78346s() {
        MethodCollector.m26663i(11874);
        C46239q qVar = this.f107024d;
        if (qVar != null) {
            this.f107045y.removeView(qVar);
            mo77522a().mo77615a(qVar);
            this.f107024d = null;
        }
        EffectTextStickerInputLayout effectTextStickerInputLayout = this.f107404P;
        effectTextStickerInputLayout.f107682E.clear();
        effectTextStickerInputLayout.mo78321a();
        for (T t : effectTextStickerInputLayout.f107391f.f107496a) {
            t.f107507a.setText("");
            t.f107508b = null;
        }
        MethodCollector.m26664o(11874);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c$a */
    public static final class C46132a implements AbstractC46122h {

        /* renamed from: a */
        final /* synthetic */ C46131c f107408a;

        static {
            Covode.recordClassIndex(54691);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: a */
        public final void mo78312a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: a */
        public final void mo78316a(List<TextStickerTextWrap> list) {
            C89219l.m154721d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46132a(C46131c cVar) {
            this.f107408a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: a */
        public final void mo78315a(String str) {
            C89219l.m154721d(str, "");
            AbstractC45869b bVar = this.f107408a.f107395G;
            if (bVar != null) {
                bVar.mo77220a(str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: a */
        public final void mo78313a(int i) {
            C46131c cVar = this.f107408a;
            String hexString = Integer.toHexString(i);
            C89219l.m154716b(hexString, "");
            cVar.f107397I = hexString;
            AbstractC45869b bVar = this.f107408a.f107395G;
            if (bVar != null) {
                bVar.mo77218a(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: b */
        public final void mo78317b(int i) {
            this.f107408a.f107396H = String.valueOf(i);
            AbstractC45869b bVar = this.f107408a.f107395G;
            if (bVar != null) {
                bVar.mo77221b(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h
        /* renamed from: a */
        public final void mo78314a(C45995c cVar) {
            C89219l.m154721d(cVar, "");
            this.f107408a.f107398J = cVar.f107125i.getEffectId();
            C46131c cVar2 = this.f107408a;
            String str = cVar.f107118b;
            C89219l.m154716b(str, "");
            cVar2.f107399K = str;
            AbstractC45869b bVar = this.f107408a.f107395G;
            if (bVar != null) {
                String str2 = cVar.f107118b;
                C89219l.m154716b(str2, "");
                bVar.mo77223b(str2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c$b */
    public static final class C46133b implements AbstractC46118d {

        /* renamed from: a */
        final /* synthetic */ C46131c f107409a;

        static {
            Covode.recordClassIndex(54692);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77566a(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77567a(C46239q qVar, RectF rectF, C46123i iVar) {
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(rectF, "");
            C89219l.m154721d(iVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final void mo77568a(C46239q qVar, boolean z) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: b */
        public final void mo77569b(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: c */
        public final void mo77570c(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: d */
        public final void mo77571d(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: e */
        public final void mo77572e(C46239q qVar) {
            C89219l.m154721d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46133b(C46131c cVar) {
            this.f107409a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final float mo77563a(float f) {
            AbstractC45920e eVar = this.f107409a.f107010E;
            if (eVar != null) {
                return eVar.mo77312a(f);
            }
            return 0.0f;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final int mo77564a(C46239q qVar, boolean z, boolean z2) {
            C89219l.m154721d(qVar, "");
            if (z) {
                AbstractC45920e eVar = this.f107409a.f107010E;
                if (eVar != null) {
                    eVar.mo77320b();
                }
                return -1;
            }
            AbstractC45920e eVar2 = this.f107409a.f107010E;
            if (eVar2 != null) {
                return eVar2.mo77313a(qVar.getAnglePointListForBlock(), z2);
            }
            return -1;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
        /* renamed from: a */
        public final PointF mo77565a(C46239q qVar, float f, float f2) {
            C89219l.m154721d(qVar, "");
            PointF[] anglePointList = qVar.getAnglePointList();
            for (PointF pointF : anglePointList) {
                pointF.x += f;
                pointF.y += f2;
            }
            AbstractC45920e eVar = this.f107409a.f107010E;
            if (eVar != null) {
                return eVar.mo77316a(anglePointList, f, f2);
            }
            return new PointF(0.0f, 0.0f);
        }
    }

    /* renamed from: a */
    public final C1731i<List<TextStickerCompileResult>> mo78338a(C45858a aVar) {
        C89219l.m154721d(aVar, "");
        return mo77522a().mo77603a(aVar, this.f107045y);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: c */
    public final void mo77541c(TextStickerData textStickerData) {
        if (textStickerData != null) {
            textStickerData.setEffectTextLayoutConfig(this.f107404P.getInnerLayoutConfig());
        }
    }

    /* renamed from: a */
    public final void mo78340a(C46104o oVar) {
        if (!C89219l.m154714a(this.f107402N, oVar)) {
            this.f107402N = oVar;
            this.f107404P.setScaleInfo(oVar);
        }
    }

    /* renamed from: b */
    public final void mo78343b(C46079a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a((Object) this.f107400L, (Object) aVar.f106810b.getEffectId())) {
            mo78339a(aVar);
        }
    }

    /* renamed from: c */
    public final void mo78344c(boolean z) {
        AbstractC45869b bVar = this.f107395G;
        if (bVar != null) {
            bVar.mo77226e(new C45867a(null, null, null, null, null, 0, 0, z ? 1 : 0, 127));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: d */
    public final void mo77544d(C46239q qVar) {
        C89219l.m154721d(qVar, "");
        C46239q qVar2 = this.f107024d;
        if (qVar2 != null) {
            qVar2.setOnEditClickListener(new C46133b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.C45940a
    /* renamed from: b */
    public final C46239q mo77533b(TextStickerData textStickerData) {
        ViewParent parent = this.f107045y.getParent();
        if (parent != null) {
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getTag() instanceof C46104o) {
                Object tag = viewGroup.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                mo78340a((C46104o) tag);
            }
        }
        return new C46185q(this.f107407S, mo77534b(), textStickerData, this.f107402N);
    }

    /* renamed from: a */
    public final void mo78339a(C46079a aVar) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        List<InnerEffectTextConfig> textConfigs;
        C89219l.m154721d(aVar, "");
        this.f107400L = aVar.f106810b.getEffectId();
        this.f107401M = aVar.f107315c;
        float a = this.f107402N.mo78289a();
        C89219l.m154721d(aVar, "");
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = aVar.f107315c;
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig3 = null;
        if (innerEffectTextLayoutConfig2 != null) {
            if (a == 0.0f) {
                a = 1.0f;
            }
            innerEffectTextLayoutConfig = C46136d.m89062a(innerEffectTextLayoutConfig2, a);
        } else {
            innerEffectTextLayoutConfig = null;
        }
        C46239q qVar = this.f107024d;
        if (qVar != null) {
            TextStickerData data = qVar.getData();
            if (data != null) {
                data.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(mo77539c());
            if (innerEffectTextLayoutConfig != null) {
                int size = innerEffectTextLayoutConfig.getTextConfigs().size();
                for (int size2 = arrayList.size(); size2 < size; size2++) {
                    arrayList.add(C46110t.m88959a("", false));
                }
            }
            int curTxtMode = this.f107404P.getCurTxtMode();
            int curColor = this.f107404P.getCurColor();
            int alignTxt = this.f107404P.getAlignTxt();
            C45989b a2 = C45989b.m88764a();
            C89219l.m154716b(a2, "");
            qVar.mo78536a(curTxtMode, curColor, alignTxt, a2.f107109d);
            qVar.setFontSize(mo77543d());
            TextStickerData data2 = qVar.getData();
            if (data2 != null) {
                innerEffectTextLayoutConfig3 = data2.getEffectTextLayoutConfig();
            }
            qVar.mo78544b(arrayList, innerEffectTextLayoutConfig3);
            return;
        }
        int curTxtMode2 = this.f107404P.getCurTxtMode();
        int curColor2 = this.f107404P.getCurColor();
        int alignTxt2 = this.f107404P.getAlignTxt();
        C45989b a3 = C45989b.m88764a();
        C89219l.m154716b(a3, "");
        TextStickerData textStickerData = new TextStickerData("", curTxtMode2, curColor2, alignTxt2, a3.f107109d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
        textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
        Point editInputScreenCenterPoint = this.f107404P.getEditInputScreenCenterPoint();
        C89219l.m154716b(editInputScreenCenterPoint, "");
        textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
        ArrayList arrayList2 = new ArrayList();
        InnerEffectTextLayoutConfig effectTextLayoutConfig = textStickerData.getEffectTextLayoutConfig();
        if (effectTextLayoutConfig == null || (textConfigs = effectTextLayoutConfig.getTextConfigs()) == null) {
            arrayList2.add(C46110t.m88959a("", false));
        } else {
            Iterator<T> it = textConfigs.iterator();
            while (it.hasNext()) {
                it.next();
                arrayList2.add(C46110t.m88959a("", false));
            }
        }
        textStickerData.setTextWrapList(arrayList2);
        textStickerData.setFontSize(mo77543d());
        mo77525a(textStickerData, false);
    }

    /* renamed from: a */
    public final void mo78341a(String str, TextStickerData textStickerData) {
        this.f107404P.postDelayed(new RunnableC46135d(this, textStickerData, str), 300);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78342a(boolean r27, com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel r28) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46131c.mo78342a(boolean, com.ss.android.ugc.aweme.editSticker.model.EffectTextModel):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46131c(ActivityC0945e eVar, AbstractC14552j jVar, EffectTextStickerInputLayout effectTextStickerInputLayout) {
        super(eVar, jVar, null, false, jVar.mo23382a(), effectTextStickerInputLayout, null, null, null, 1, null, false, false, 15820);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(effectTextStickerInputLayout, "");
        this.f107407S = eVar;
        this.f107404P = effectTextStickerInputLayout;
        String hexString = Integer.toHexString(-1);
        C89219l.m154716b(hexString, "");
        this.f107397I = hexString;
        this.f107398J = "";
        this.f107399K = "";
        this.f107402N = new C46104o();
        this.f107406R = new C89378p<>(null, null);
    }
}
