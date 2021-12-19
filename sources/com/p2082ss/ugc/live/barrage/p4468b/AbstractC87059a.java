package com.p2082ss.ugc.live.barrage.p4468b;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.C87046a;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.ugc.live.barrage.b.a */
public abstract class AbstractC87059a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f196271b = {new C89232y(C89204ab.m154669a(AbstractC87059a.class), "valueAnimator", "getValueAnimator()Landroid/animation/ValueAnimator;")};

    /* renamed from: i */
    public static final C87062b f196272i = new C87062b((byte) 0);

    /* renamed from: a */
    private AbstractC87048a f196273a;

    /* renamed from: c */
    public final LinkedList<AbstractC87048a> f196274c = new LinkedList<>();

    /* renamed from: d */
    public final ArrayList<AbstractC87048a> f196275d = new ArrayList<>();

    /* renamed from: e */
    public final C87046a f196276e;

    /* renamed from: f */
    public float f196277f;

    /* renamed from: g */
    public AbstractC87061a f196278g;

    /* renamed from: h */
    public final View f196279h;

    /* renamed from: j */
    private final AbstractC89244h f196280j;

    /* renamed from: com.ss.ugc.live.barrage.b.a$a */
    public interface AbstractC87061a {
        static {
            Covode.recordClassIndex(102827);
        }

        /* renamed from: a */
        void mo18152a();

        /* renamed from: b */
        void mo18153b();
    }

    /* renamed from: g */
    private final ValueAnimator m150781g() {
        return (ValueAnimator) this.f196280j.getValue();
    }

    /* renamed from: a */
    public abstract void mo13471a(AbstractC87048a aVar);

    /* renamed from: a */
    public abstract void mo13472a(C87046a aVar, float f);

    /* renamed from: com.ss.ugc.live.barrage.b.a$b */
    public static final class C87062b {
        static {
            Covode.recordClassIndex(102828);
        }

        private C87062b() {
        }

        public /* synthetic */ C87062b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public void mo13469a() {
        this.f196274c.clear();
        this.f196275d.clear();
        this.f196276e.clear();
    }

    /* renamed from: b */
    public int mo13473b() {
        return this.f196276e.size() + this.f196275d.size() + this.f196274c.size();
    }

    /* renamed from: c */
    public final void mo140682c() {
        if (!m150781g().isRunning()) {
            m150781g().start();
        }
        mo140685f();
    }

    /* renamed from: d */
    public final void mo140683d() {
        if (m150781g().isRunning()) {
            m150781g().cancel();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$d */
    static final class C87064d extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ AbstractC87059a f196283a;

        static {
            Covode.recordClassIndex(102830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C87064d(AbstractC87059a aVar) {
            super(0);
            this.f196283a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ValueAnimator invoke() {
            AbstractC87059a aVar = this.f196283a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            C89219l.m154709a((Object) ofFloat, "");
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new C87063c(aVar));
            return ofFloat;
        }
    }

    static {
        Covode.recordClassIndex(102825);
    }

    /* renamed from: e */
    public final AbstractC87048a mo140684e() {
        AbstractC87048a aVar;
        try {
            if (this.f196275d.isEmpty()) {
                return null;
            }
            Iterator<AbstractC87048a> it = this.f196275d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.f196255h) {
                    break;
                }
            }
            ArrayList<AbstractC87048a> arrayList = this.f196275d;
            if (arrayList != null) {
                C89206ad.m154680b(arrayList).remove(aVar);
                return aVar;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final void mo140685f() {
        while (this.f196275d.size() <= 30 && this.f196274c.size() != 0) {
            AbstractC87048a removeFirst = this.f196274c.removeFirst();
            removeFirst.mo140673a(AbstractC87048a.AbstractC87049a.C87052c.f196261a);
            if (removeFirst.f196256i) {
                this.f196275d.add(0, removeFirst);
            } else {
                this.f196275d.add(removeFirst);
            }
        }
    }

    public AbstractC87059a(View view) {
        C89219l.m154719c(view, "");
        this.f196279h = view;
        C87046a aVar = new C87046a();
        this.f196276e = aVar;
        this.f196280j = C89250i.m154773a((AbstractC89171a) new C87064d(this));
        aVar.setOnChangeListener(new C87046a.AbstractC87047a(this) {
            /* class com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a.C870601 */

            /* renamed from: a */
            final /* synthetic */ AbstractC87059a f196281a;

            static {
                Covode.recordClassIndex(102826);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f196281a = r1;
            }

            @Override // com.p2082ss.ugc.live.barrage.C87046a.AbstractC87047a
            /* renamed from: a */
            public final void mo140671a(boolean z, AbstractC87048a aVar) {
                C89219l.m154719c(aVar, "");
                if (z) {
                    AbstractC87061a aVar2 = this.f196281a.f196278g;
                    if (aVar2 != null) {
                        aVar2.mo18152a();
                        return;
                    }
                    return;
                }
                AbstractC87061a aVar3 = this.f196281a.f196278g;
                if (aVar3 != null) {
                    aVar3.mo18153b();
                }
            }
        });
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$c */
    static final class C87063c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC87059a f196282a;

        static {
            Covode.recordClassIndex(102829);
        }

        C87063c(AbstractC87059a aVar) {
            this.f196282a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f196282a.f196277f;
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f196282a.f196277f = floatValue;
                float f2 = (floatValue - f) * 1000.0f;
                if (floatValue < f) {
                    f2 = ((1.0f - f) + floatValue) * 1000.0f;
                }
                AbstractC87059a aVar = this.f196282a;
                aVar.mo13472a(aVar.f196276e, f2);
                if (this.f196282a.f196274c.isEmpty() && this.f196282a.f196275d.isEmpty() && this.f196282a.f196276e.isEmpty()) {
                    this.f196282a.mo140683d();
                }
                this.f196282a.mo140685f();
                if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                    this.f196282a.f196279h.invalidate();
                } else {
                    this.f196282a.f196279h.postInvalidate();
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo140681a(MotionEvent motionEvent) {
        RectF rectF;
        AbstractC87048a aVar;
        AbstractC87048a aVar2;
        RectF rectF2;
        AbstractC87048a aVar3;
        C89219l.m154719c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator it = this.f196276e.iterator();
            while (it.hasNext()) {
                AbstractC87048a aVar4 = (AbstractC87048a) it.next();
                if (aVar4.f196257j.contains(motionEvent.getX(), motionEvent.getY()) && aVar4.mo140674a(motionEvent)) {
                    this.f196273a = aVar4;
                    return true;
                }
            }
        } else if (action == 1) {
            AbstractC87048a aVar5 = this.f196273a;
            if (aVar5 == null || (rectF = aVar5.f196257j) == null || !rectF.contains(motionEvent.getX(), motionEvent.getY()) || (aVar = this.f196273a) == null) {
                return false;
            }
            return aVar.mo140674a(motionEvent);
        } else if ((action != 2 && action != 3) || (aVar2 = this.f196273a) == null || (rectF2 = aVar2.f196257j) == null || !rectF2.contains(motionEvent.getX(), motionEvent.getY()) || (aVar3 = this.f196273a) == null) {
            return false;
        } else {
            return aVar3.mo140674a(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo140680a(AbstractC87048a aVar, boolean z) {
        C89219l.m154719c(aVar, "");
        if (z) {
            this.f196274c.add(0, aVar);
        } else {
            this.f196274c.add(aVar);
        }
        aVar.mo140673a(AbstractC87048a.AbstractC87049a.C87051b.f196260a);
        mo13471a(aVar);
    }
}
