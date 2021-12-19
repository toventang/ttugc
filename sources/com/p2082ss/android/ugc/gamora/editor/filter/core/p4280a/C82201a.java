package com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a */
public final class C82201a {

    /* renamed from: l */
    public static final C82202a f183897l = new C82202a((byte) 0);

    /* renamed from: a */
    public final C82207b f183898a;

    /* renamed from: b */
    public AbstractC82203b f183899b;

    /* renamed from: c */
    public FilterBean f183900c;

    /* renamed from: d */
    public FilterBean f183901d;

    /* renamed from: e */
    public boolean f183902e;

    /* renamed from: f */
    final Animator.AnimatorListener f183903f = new C82204c(this);

    /* renamed from: g */
    final ValueAnimator.AnimatorUpdateListener f183904g = new C82205d(this);

    /* renamed from: h */
    final AbstractC14552j f183905h;

    /* renamed from: i */
    public final AbstractC82237a f183906i;

    /* renamed from: j */
    public final AbstractC50707o f183907j;

    /* renamed from: k */
    public final LiveData<C50649a> f183908k;

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$b */
    public interface AbstractC82203b {
        static {
            Covode.recordClassIndex(96033);
        }

        /* renamed from: a */
        void mo120466a(FilterBean filterBean);

        /* renamed from: a */
        void mo120467a(FilterBean filterBean, FilterBean filterBean2, float f);
    }

    static {
        Covode.recordClassIndex(96031);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$a */
    public static final class C82202a {
        static {
            Covode.recordClassIndex(96032);
        }

        private C82202a() {
        }

        public /* synthetic */ C82202a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$c */
    public static final class C82204c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C82201a f183909a;

        static {
            Covode.recordClassIndex(96034);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82204c(C82201a aVar) {
            this.f183909a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f183909a.f183898a.f183914b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (this.f183909a.f183901d != null) {
                C82201a aVar = this.f183909a;
                aVar.f183900c = aVar.f183901d;
                this.f183909a.f183898a.f183913a = 0.0f;
                if (this.f183909a.f183899b != null) {
                    AbstractC82203b bVar = this.f183909a.f183899b;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo120466a(this.f183909a.f183900c);
                }
                this.f183909a.f183906i.mo127417a(false, this.f183909a.f183900c);
            }
            this.f183909a.f183898a.f183914b = false;
        }
    }

    /* renamed from: a */
    public final int mo127392a(AbstractC50709q qVar) {
        C89219l.m154721d(qVar, "");
        return C50691c.m94985a(qVar, this.f183900c);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$d */
    static final class C82205d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C82201a f183910a;

        static {
            Covode.recordClassIndex(96035);
        }

        C82205d(C82201a aVar) {
            this.f183910a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            C82201a aVar = this.f183910a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            aVar.mo127393a(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$e */
    public static final class C82206e implements AbstractC1214u<C50649a> {

        /* renamed from: a */
        final /* synthetic */ C82201a f183911a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f183912b;

        static {
            Covode.recordClassIndex(96036);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C50649a aVar) {
            FilterBean filterBean;
            C50649a aVar2 = aVar;
            if (aVar2 != null && (filterBean = aVar2.f116985b) != C50687a.m94974a()) {
                this.f183911a.mo127394a(filterBean);
                this.f183912b.invoke(filterBean);
                this.f183911a.f183908k.removeObserver(this);
            }
        }

        C82206e(C82201a aVar, AbstractC89172b bVar) {
            this.f183911a = aVar;
            this.f183912b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo127394a(FilterBean filterBean) {
        this.f183900c = filterBean;
        this.f183906i.mo127417a(true, filterBean);
    }

    /* renamed from: a */
    public final void mo127393a(float f) {
        char c;
        int i;
        FilterBean a;
        if (f == 0.0f) {
            c = 0;
        } else if (f < 0.0f) {
            c = 65535;
        } else {
            c = 1;
        }
        AbstractC50709q f2 = this.f183907j.mo86071f();
        int a2 = C50691c.m94985a(f2, this.f183900c);
        if (c == 0) {
            i = a2;
        } else if (c == 65535) {
            i = a2;
            a2--;
        } else {
            i = a2 + 1;
        }
        FilterBean filterBean = null;
        if (a2 < 0) {
            a = null;
        } else {
            a = C50691c.m94986a(f2, a2);
        }
        if (i < C50691c.m94988a(f2).size()) {
            filterBean = C50691c.m94986a(f2, i);
        }
        AbstractC82203b bVar = this.f183899b;
        if (bVar != null) {
            bVar.mo120467a(a, filterBean, f);
        }
    }

    public C82201a(AbstractC1204m mVar, AbstractC14552j jVar, AbstractC82237a aVar, AbstractC50707o oVar, LiveData<C50649a> liveData, AbstractC89172b<? super FilterBean, C89391z> bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(bVar, "");
        this.f183905h = jVar;
        this.f183906i = aVar;
        this.f183907j = oVar;
        this.f183908k = liveData;
        C82207b bVar2 = new C82207b(this, jVar.mo23382a());
        this.f183898a = bVar2;
        jVar.mo23383a(new C14544f(0, bVar2));
        liveData.observe(mVar, new C82206e(this, bVar));
    }
}
