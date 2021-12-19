package com.bytedance.tux.skeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.content.p032a.C0641g;
import androidx.core.p037h.C0803x;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.tux.skeleton.a */
public abstract class AbstractC23237a extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f55075a = {new C89225r(C89204ab.m154669a(AbstractC23237a.class), "radius", "getRadius()F"), new C89225r(C89204ab.m154669a(AbstractC23237a.class), "placeholderColor", "getPlaceholderColor()I"), new C89225r(C89204ab.m154669a(AbstractC23237a.class), "pulsingColor", "getPulsingColor()I"), new C89225r(C89204ab.m154669a(AbstractC23237a.class), "isLoading", "isLoading()Z"), new C89225r(C89204ab.m154669a(AbstractC23237a.class), "animator", "getAnimator()Landroid/animation/ValueAnimator;")};

    /* renamed from: b */
    public static final ValueAnimator f55076b;

    /* renamed from: c */
    public static final C23242a f55077c = new C23242a((byte) 0);

    /* renamed from: d */
    private final AbstractC89244h f55078d;

    /* renamed from: e */
    private final Map<String, Object> f55079e;

    /* renamed from: f */
    private final Map<String, Object> f55080f;

    /* renamed from: g */
    private final C23243b f55081g;

    /* renamed from: h */
    private final C23243b f55082h;

    /* renamed from: i */
    private final C23243b f55083i;

    /* renamed from: j */
    private final C23243b f55084j;

    /* renamed from: k */
    private final C23243b f55085k;

    public AbstractC23237a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final boolean mo37841a() {
        return ((Boolean) this.f55084j.mo37854a(this, f55075a[3])).booleanValue();
    }

    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.f55085k.mo37854a(this, f55075a[4]);
    }

    public final int getPlaceholderColor() {
        return ((Number) this.f55082h.mo37854a(this, f55075a[1])).intValue();
    }

    public final int getPulsingColor() {
        return ((Number) this.f55083i.mo37854a(this, f55075a[2])).intValue();
    }

    public final float getRadius() {
        return ((Number) this.f55081g.mo37854a(this, f55075a[0])).floatValue();
    }

    public final C23259h getThemeConfig() {
        return (C23259h) this.f55078d.getValue();
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        C89219l.m154719c(valueAnimator, "");
        this.f55085k.mo37855a(this, f55075a[4], valueAnimator);
    }

    public final void setLoading(boolean z) {
        this.f55084j.mo37855a(this, f55075a[3], Boolean.valueOf(z));
    }

    public final void setPlaceholderColor(int i) {
        this.f55082h.mo37855a(this, f55075a[1], Integer.valueOf(i));
    }

    public final void setPulsingColor(int i) {
        this.f55083i.mo37855a(this, f55075a[2], Integer.valueOf(i));
    }

    public final void setRadius(float f) {
        this.f55081g.mo37855a(this, f55075a[0], Float.valueOf(f));
    }

    /* renamed from: com.bytedance.tux.skeleton.a$a */
    public static final class C23242a {
        static {
            Covode.recordClassIndex(27185);
        }

        private C23242a() {
        }

        public /* synthetic */ C23242a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$c */
    static final class C23244c extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        public static final C23244c f55091a = new C23244c();

        static {
            Covode.recordClassIndex(27187);
        }

        C23244c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ ValueAnimator invoke() {
            return AbstractC23237a.f55076b;
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$d */
    static final class C23245d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23237a f55092a;

        static {
            Covode.recordClassIndex(27188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23245d(AbstractC23237a aVar) {
            super(0);
            this.f55092a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f55092a.getThemeConfig().f55109d);
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$e */
    static final class C23246e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23237a f55093a;

        static {
            Covode.recordClassIndex(27189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23246e(AbstractC23237a aVar) {
            super(0);
            this.f55093a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f55093a.getThemeConfig().f55107b);
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$f */
    static final class C23247f extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23237a f55094a;

        static {
            Covode.recordClassIndex(27190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23247f(AbstractC23237a aVar) {
            super(0);
            this.f55094a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f55094a.getThemeConfig().f55108c);
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$g */
    static final class C23248g extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23237a f55095a;

        static {
            Covode.recordClassIndex(27191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23248g(AbstractC23237a aVar) {
            super(0);
            this.f55095a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf((float) this.f55095a.getThemeConfig().f55106a);
        }
    }

    /* renamed from: com.bytedance.tux.skeleton.a$h */
    static final class C23249h extends AbstractC89220m implements AbstractC89171a<C23259h> {

        /* renamed from: a */
        final /* synthetic */ Context f55096a;

        static {
            Covode.recordClassIndex(27192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23249h(Context context) {
            super(0);
            this.f55096a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23259h invoke() {
            Context context = this.f55096a;
            C89219l.m154719c(context, "");
            return new C23259h(context, (byte) 0);
        }
    }

    public final long getAnimationDuration() {
        return getAnimator().getDuration();
    }

    static {
        Covode.recordClassIndex(27180);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(600L);
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(2);
        f55076b = ofInt;
    }

    public final void setAnimationDuration(long j) {
        getAnimator().setDuration(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.tux.skeleton.a$b */
    public static final class C23243b<T> {

        /* renamed from: a */
        private final AbstractC89171a<T> f55090a;

        static {
            Covode.recordClassIndex(27186);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C23243b(AbstractC89171a<? extends T> aVar) {
            C89219l.m154719c(aVar, "");
            this.f55090a = aVar;
        }

        /* renamed from: a */
        public final T mo37854a(AbstractC23237a aVar, AbstractC89286i<?> iVar) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(iVar, "");
            return (T) aVar.mo37838a(iVar.getName(), this.f55090a);
        }

        /* renamed from: a */
        public final void mo37855a(AbstractC23237a aVar, AbstractC89286i<?> iVar, T t) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(iVar, "");
            aVar.mo37840a(iVar.getName(), t, this.f55090a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo37839a(AbstractC89286i<? extends T> iVar, AbstractC89183m<? super T, ? super T, C89391z> mVar) {
        C89219l.m154719c(iVar, "");
        this.f55080f.put(iVar.getName(), mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> T mo37838a(String str, AbstractC89171a<? extends T> aVar) {
        T t;
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        View view = this;
        while (view != null) {
            if ((view instanceof AbstractC23237a) && (t = (T) ((AbstractC23237a) view).f55079e.get(str)) != null) {
                return t;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            view = (View) parent;
        }
        return (T) aVar.invoke();
    }

    private /* synthetic */ AbstractC23237a(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC23237a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        this.f55078d = C89250i.m154773a((AbstractC89171a) new C23249h(context));
        this.f55079e = new LinkedHashMap();
        this.f55080f = new LinkedHashMap();
        this.f55081g = new C23243b(new C23248g(this));
        this.f55082h = new C23243b(new C23246e(this));
        this.f55083i = new C23243b(new C23247f(this));
        this.f55084j = new C23243b(new C23245d(this));
        this.f55085k = new C23243b(C23244c.f55091a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqr, R.attr.aqt, R.attr.aqv, R.attr.aqw}, i, 0);
        if (obtainStyledAttributes.hasValue(3)) {
            C89219l.m154719c(obtainStyledAttributes, "");
            C0641g.m2354a(obtainStyledAttributes, 3);
            setRadius((float) obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setPlaceholderColor(C0641g.m2357b(obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setPulsingColor(C0641g.m2357b(obtainStyledAttributes, 2));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setLoading(C0641g.m2355a(obtainStyledAttributes));
        }
        obtainStyledAttributes.recycle();
        mo37839a(new C23252b(this), new AbstractC89183m<Float, Float, C89391z>(this) {
            /* class com.bytedance.tux.skeleton.AbstractC23237a.C232381 */

            /* renamed from: a */
            final /* synthetic */ AbstractC23237a f55086a;

            static {
                Covode.recordClassIndex(27181);
            }

            {
                this.f55086a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Float f, Float f2) {
                f2.floatValue();
                this.f55086a.invalidate();
                return C89391z.f203057a;
            }
        });
        mo37839a(new C23253c(this), new AbstractC89183m<Integer, Integer, C89391z>(this) {
            /* class com.bytedance.tux.skeleton.AbstractC23237a.C232392 */

            /* renamed from: a */
            final /* synthetic */ AbstractC23237a f55087a;

            static {
                Covode.recordClassIndex(27182);
            }

            {
                this.f55087a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
                num2.intValue();
                this.f55087a.invalidate();
                return C89391z.f203057a;
            }
        });
        mo37839a(new C23254d(this), new AbstractC89183m<Integer, Integer, C89391z>(this) {
            /* class com.bytedance.tux.skeleton.AbstractC23237a.C232403 */

            /* renamed from: a */
            final /* synthetic */ AbstractC23237a f55088a;

            static {
                Covode.recordClassIndex(27183);
            }

            {
                this.f55088a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
                num2.intValue();
                this.f55088a.invalidate();
                return C89391z.f203057a;
            }
        });
        mo37839a(new C23255e(this), new AbstractC89183m<Boolean, Boolean, C89391z>(this) {
            /* class com.bytedance.tux.skeleton.AbstractC23237a.C232414 */

            /* renamed from: a */
            final /* synthetic */ AbstractC23237a f55089a;

            static {
                Covode.recordClassIndex(27184);
            }

            {
                this.f55089a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, Boolean bool2) {
                bool2.booleanValue();
                this.f55089a.requestLayout();
                return C89391z.f203057a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.skeleton.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo37840a(String str, T t, AbstractC89171a<? extends T> aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        Object a = mo37838a(str, aVar);
        this.f55079e.put(str, t);
        Object a2 = mo37838a(str, aVar);
        if (!C89219l.m154714a(a, a2)) {
            Object obj = this.f55080f.get(str);
            if (!C89206ad.m154678a(obj, 2)) {
                obj = null;
            }
            AbstractC89183m mVar = (AbstractC89183m) obj;
            if (mVar != null) {
                mVar.invoke(a, a2);
            }
            Iterator<View> a3 = C0803x.m2810a(this).mo2926a();
            while (a3.hasNext()) {
                m43799a(a3.next(), str, a, a2);
            }
        }
    }

    /* renamed from: a */
    private final <T> void m43799a(View view, String str, T t, T t2) {
        if (view != null) {
            boolean z = true;
            if (view instanceof AbstractC23237a) {
                AbstractC23237a aVar = (AbstractC23237a) view;
                if (aVar.f55079e.get(str) == null) {
                    Object obj = aVar.f55080f.get(str);
                    if (!C89206ad.m154678a(obj, 2)) {
                        obj = null;
                    }
                    AbstractC89183m mVar = (AbstractC89183m) obj;
                    if (mVar != null) {
                        mVar.invoke(t, t2);
                    }
                } else {
                    z = false;
                }
            }
            if ((view instanceof ViewGroup) && z) {
                Iterator<View> a = C0803x.m2810a((ViewGroup) view).mo2926a();
                while (a.hasNext()) {
                    m43799a(a.next(), str, t, t2);
                }
            }
        }
    }
}
