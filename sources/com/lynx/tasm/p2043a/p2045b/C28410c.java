package com.lynx.tasm.p2043a.p2045b;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.p2054c.C28724b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.a.b.c */
public class C28410c {

    /* renamed from: a */
    public WeakReference<LynxUI> f66772a;

    /* renamed from: b */
    public int f66773b;

    /* renamed from: c */
    public int f66774c;

    /* renamed from: d */
    public int f66775d;

    /* renamed from: e */
    public int f66776e;

    /* renamed from: f */
    public int f66777f;

    /* renamed from: g */
    public int f66778g;

    /* renamed from: h */
    public int f66779h;

    /* renamed from: i */
    public int f66780i;

    /* renamed from: j */
    public int f66781j;

    /* renamed from: k */
    public int f66782k;

    /* renamed from: l */
    public int f66783l;

    /* renamed from: m */
    public int f66784m;

    /* renamed from: n */
    public int f66785n;

    /* renamed from: o */
    public int f66786o;

    /* renamed from: p */
    public int f66787p;

    /* renamed from: q */
    public int f66788q;

    /* renamed from: r */
    public Rect f66789r;

    /* renamed from: s */
    public AbstractC28408a f66790s;

    /* renamed from: t */
    public AbstractC28408a f66791t;

    /* renamed from: u */
    public AbstractC28408a f66792u;

    /* renamed from: v */
    public final SparseArray<AbstractC28415f> f66793v = new SparseArray<>(0);

    /* renamed from: w */
    public float f66794w = -1.0f;

    /* renamed from: x */
    public boolean f66795x = false;

    static {
        Covode.recordClassIndex(34400);
    }

    /* renamed from: a */
    public final LynxUI mo48847a() {
        WeakReference<LynxUI> weakReference = this.f66772a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final AbstractC28408a mo48849b() {
        if (this.f66790s == null) {
            this.f66790s = new C28413d();
        }
        return this.f66790s;
    }

    /* renamed from: c */
    public final AbstractC28408a mo48850c() {
        if (this.f66791t == null) {
            this.f66791t = new C28416g();
        }
        return this.f66791t;
    }

    /* renamed from: d */
    public final AbstractC28408a mo48851d() {
        if (this.f66792u == null) {
            this.f66792u = new C28414e();
        }
        return this.f66792u;
    }

    /* renamed from: com.lynx.tasm.a.b.c$b */
    static class C28412b {

        /* renamed from: a */
        private static Map<String, Object> f66798a;

        static {
            Covode.recordClassIndex(34402);
            HashMap hashMap = new HashMap();
            f66798a = hashMap;
            hashMap.put("animation_type", "");
        }

        /* renamed from: a */
        public static void m56822a(LynxUI lynxUI, String str, String str2) {
            if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
                f66798a.put("animation_type", str2);
                lynxUI.mContext.f67064e.mo49834a(new C28724b(lynxUI.getSign(), str, f66798a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.b.c$a  reason: invalid class name */
    public static class animationAnimation$AnimationListenerC28411a implements Animation.AnimationListener {

        /* renamed from: a */
        private WeakReference<C28410c> f66796a;

        /* renamed from: b */
        private String f66797b;

        static {
            Covode.recordClassIndex(34401);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            LynxUI a;
            C28410c cVar = this.f66796a.get();
            if (cVar != null && (a = cVar.mo48847a()) != null) {
                T t = a.mView;
                C28412b.m56822a(a, "animationend", this.f66797b);
                String str = this.f66797b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof AbstractC28415f) {
                        cVar.f66793v.remove(a.getSign());
                    } else if ((animation instanceof C28417h) && cVar.f66795x) {
                        t.setLayerType(0, null);
                        cVar.f66795x = false;
                    }
                } else if (str == "layout-animation-delete") {
                    if ((animation instanceof C28417h) && cVar.f66795x) {
                        t.setLayerType(0, null);
                        cVar.f66795x = false;
                    }
                    a.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
                }
            }
        }

        public final void onAnimationStart(Animation animation) {
            LynxUI a;
            C28410c cVar = this.f66796a.get();
            if (cVar != null && (a = cVar.mo48847a()) != null) {
                T t = a.mView;
                C28412b.m56822a(a, "animationstart", this.f66797b);
                String str = this.f66797b;
                if (str == "layout-animation-create" || str == "layout-animation-update") {
                    if (animation instanceof AbstractC28415f) {
                        cVar.f66793v.put(a.getSign(), animation);
                    } else if ((animation instanceof C28417h) && t.getLayerType() == 0) {
                        cVar.f66795x = true;
                        t.setLayerType(2, null);
                    }
                } else if (str == "layout-animation-delete" && (animation instanceof C28417h) && t.getLayerType() == 0) {
                    cVar.f66795x = true;
                    t.setLayerType(2, null);
                }
            }
        }

        public animationAnimation$AnimationListenerC28411a(C28410c cVar, String str) {
            this.f66796a = new WeakReference<>(cVar);
            this.f66797b = str;
        }
    }

    /* renamed from: a */
    public final void mo48848a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        AbstractC28408a aVar;
        T t = lynxUI.mView;
        if (this.f66794w == -1.0f) {
            this.f66794w = t.getAlpha();
        }
        AbstractC28415f fVar = this.f66793v.get(lynxUI.getSign());
        if (fVar != null) {
            fVar.mo48855a(i, i2, i3, i4);
            return;
        }
        if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
            aVar = this.f66790s;
        } else {
            aVar = this.f66791t;
        }
        Animation animation = null;
        AbstractC28408a aVar2 = this.f66792u;
        if (aVar2 == null || !aVar2.mo48843a() || i3 != 0 || i4 != 0) {
            AbstractC28408a aVar3 = this.f66792u;
            int i17 = i11;
            int i18 = i10;
            if ((aVar3 == null || !aVar3.mo48843a()) && i3 == 0 && i4 == 0) {
                lynxUI.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i18, i17, i12, i13, i14, i15, i16, rect);
                return;
            }
            if (aVar != null) {
                i18 = i18;
                i17 = i17;
                animation = aVar.mo48844b(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i18, i17, i12, i13, i14, i15, i16, rect, this.f66794w);
            }
            if ((animation instanceof TranslateAnimation) && (lynxUI.mParent instanceof UIShadowProxy)) {
                t = ((LynxUI) lynxUI.mParent).mView;
            }
            if (animation == null) {
                float f = this.f66794w;
                if (f != -1.0f) {
                    t.setAlpha(f);
                }
                WeakReference<LynxUI> weakReference = this.f66772a;
                if (weakReference != null) {
                    weakReference.clear();
                }
                lynxUI.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i18, i17, i12, i13, i14, i15, i16, rect);
                return;
            }
            this.f66772a = new WeakReference<>(lynxUI);
            this.f66773b = i;
            this.f66774c = i2;
            this.f66775d = i3;
            this.f66776e = i4;
            this.f66777f = i5;
            this.f66778g = i6;
            this.f66779h = i7;
            this.f66780i = i8;
            this.f66785n = i9;
            this.f66786o = i18;
            this.f66787p = i17;
            this.f66788q = i12;
            this.f66781j = i13;
            this.f66782k = i14;
            this.f66783l = i15;
            this.f66784m = i16;
            this.f66789r = rect;
            if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
                animation.setAnimationListener(new animationAnimation$AnimationListenerC28411a(this, "layout-animation-create"));
            } else {
                animation.setAnimationListener(new animationAnimation$AnimationListenerC28411a(this, "layout-animation-update"));
            }
            if (animation instanceof AbstractC28415f) {
                lynxUI.requestLayout();
            } else {
                lynxUI.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i18, i17, i12, i13, i14, i15, i16, rect);
            }
            lynxUI.onBeforeAnimation(i, i2, i3, i4, i5, i6, i7, i8);
            t.startAnimation(animation);
            return;
        }
        T t2 = lynxUI.mView;
        this.f66772a = new WeakReference<>(lynxUI);
        Animation b = this.f66792u.mo48844b(lynxUI, t2.getLeft(), t2.getTop(), t2.getWidth(), t2.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect(), this.f66794w);
        if (b == null) {
            lynxUI.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
            return;
        }
        b.setAnimationListener(new animationAnimation$AnimationListenerC28411a(this, "layout-animation-delete"));
        t2.startAnimation(b);
    }
}
