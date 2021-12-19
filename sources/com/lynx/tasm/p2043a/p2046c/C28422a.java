package com.lynx.tasm.p2043a.p2046c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.behavior.p2052ui.utils.C28693h;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.C28419c;
import com.lynx.tasm.p2043a.C28437d;
import com.lynx.tasm.p2054c.C28724b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.a.c.a */
public class C28422a {

    /* renamed from: a */
    public int f66828a;

    /* renamed from: b */
    public int f66829b;

    /* renamed from: c */
    public int f66830c;

    /* renamed from: d */
    public int f66831d;

    /* renamed from: e */
    public int f66832e;

    /* renamed from: f */
    public int f66833f;

    /* renamed from: g */
    public int f66834g;

    /* renamed from: h */
    public int f66835h;

    /* renamed from: i */
    public int f66836i;

    /* renamed from: j */
    public int f66837j;

    /* renamed from: k */
    public int f66838k;

    /* renamed from: l */
    public int f66839l;

    /* renamed from: m */
    public int f66840m;

    /* renamed from: n */
    public int f66841n;

    /* renamed from: o */
    public int f66842o;

    /* renamed from: p */
    public int f66843p;

    /* renamed from: q */
    public Rect f66844q;

    /* renamed from: r */
    public boolean f66845r;

    /* renamed from: s */
    public final LynxBaseUI f66846s;

    /* renamed from: t */
    public final List<Animator> f66847t;

    /* renamed from: u */
    public AnimatorSet f66848u;

    /* renamed from: v */
    public final SparseArray<C28407b> f66849v = new SparseArray<>();

    /* renamed from: w */
    private boolean f66850w;

    /* renamed from: x */
    private Animator f66851x;

    static {
        Covode.recordClassIndex(34412);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.c.a$a */
    public static class C28436a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private static final Map<String, Object> f66894a;

        /* renamed from: g */
        WeakReference<LynxBaseUI> f66895g;

        /* renamed from: h */
        int f66896h;

        static {
            Covode.recordClassIndex(34426);
            HashMap hashMap = new HashMap();
            f66894a = hashMap;
            hashMap.put("animation_type", "transition");
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LynxBaseUI lynxBaseUI = this.f66895g.get();
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f67262a;
                }
                m56838a(lynxBaseUI, C28437d.m56839a(this.f66896h));
            }
        }

        public C28436a(LynxBaseUI lynxBaseUI, int i) {
            this.f66895g = new WeakReference<>(lynxBaseUI);
            this.f66896h = i;
        }

        /* renamed from: a */
        public static void m56838a(LynxBaseUI lynxBaseUI, String str) {
            if (lynxBaseUI != null && lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey("transitionend")) {
                Map<String, Object> map = f66894a;
                map.put("animation_type", "transition-".concat(String.valueOf(str)));
                lynxBaseUI.mContext.f67064e.mo49834a(new C28724b(lynxBaseUI.getSign(), "transitionend", map));
            }
        }
    }

    /* renamed from: a */
    public final void mo48861a() {
        AnimatorSet animatorSet = this.f66848u;
        if (animatorSet != null) {
            animatorSet.end();
            this.f66848u = null;
        }
        this.f66847t.clear();
        this.f66851x = null;
    }

    /* renamed from: b */
    public final boolean mo48866b() {
        if (this.f66849v.size() == 0) {
            return false;
        }
        if (m56831b(256) || m56831b(1024) || m56831b(512) || m56831b(2048) || m56831b(16) || m56831b(32)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m56831b(int i) {
        if (this.f66849v.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo48862a(ReadableMap readableMap) {
        if (readableMap == null || readableMap.getArray("transition") == null) {
            mo48861a();
        }
    }

    public C28422a(LynxBaseUI lynxBaseUI) {
        this.f66846s = lynxBaseUI;
        this.f66847t = new ArrayList();
    }

    /* renamed from: a */
    public final boolean mo48864a(int i) {
        if (this.f66849v.size() == 0 || this.f66849v.get(i) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo48865a(LynxBaseUI lynxBaseUI, final int i, Object obj) {
        final LynxUI lynxUI;
        final int i2;
        if (this.f66849v.size() == 0 || this.f66849v.get(i) == null) {
            return false;
        }
        final LynxBaseUI lynxBaseUI2 = this.f66846s;
        if (lynxBaseUI2 == null) {
            lynxBaseUI2 = lynxBaseUI;
        }
        C28407b bVar = this.f66849v.get(i);
        float f = 1.0f;
        if (i != 1) {
            if (i == 64) {
                final int intValue = ((Integer) obj).intValue();
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(lynxBaseUI2.mLynxBackground.f67662h), Integer.valueOf(intValue));
                this.f66847t.add(ofObject);
                ofObject.setDuration((long) Math.round((float) bVar.f66757b));
                ofObject.setInterpolator(C28419c.m56829a(bVar));
                ofObject.setStartDelay(bVar.f66758c);
                ofObject.addListener(new C28436a(i, lynxBaseUI2) {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C284231 */

                    static {
                        Covode.recordClassIndex(34413);
                    }

                    @Override // com.lynx.tasm.p2043a.p2046c.C28422a.C28436a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxBaseUI2.mLynxBackground.mo49776a(intValue);
                        lynxBaseUI2.invalidate();
                        C28422a.this.f66847t.remove(animator);
                    }
                });
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C284326 */

                    static {
                        Covode.recordClassIndex(34422);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxBaseUI2.mLynxBackground.mo49776a(((Integer) animatedValue).intValue());
                            lynxBaseUI2.invalidate();
                        }
                    }
                });
                return false;
            } else if (i != 128) {
                if (i != 4096 || !(lynxBaseUI2 instanceof LynxUI)) {
                    return false;
                }
                final LynxUI lynxUI2 = (LynxUI) lynxBaseUI2;
                float latestWidth = (float) lynxUI2.mContext.f67068i.getLatestWidth();
                lynxUI2.mContext.f67068i.getLatestHeight();
                final C28693h a = C28693h.m57450a((List) obj, latestWidth, (float) lynxUI2.getLatestWidth(), (float) lynxUI2.getLatestHeight());
                if (a == null) {
                    return false;
                }
                final float translationX = lynxUI2.getTranslationX();
                final float translationY = lynxUI2.getTranslationY();
                final float translationZ = lynxUI2.getTranslationZ();
                final float rotation = lynxUI2.mView.getRotation();
                final float rotationX = lynxUI2.mView.getRotationX();
                final float rotationY = lynxUI2.mView.getRotationY();
                final float scaleX = lynxUI2.mView.getScaleX();
                final float scaleY = lynxUI2.mView.getScaleY();
                ValueAnimator ofInt = ValueAnimator.ofInt(0);
                Animator animator = this.f66851x;
                if (animator != null) {
                    this.f66847t.remove(animator);
                }
                this.f66851x = ofInt;
                this.f66847t.add(ofInt);
                ofInt.setDuration(bVar.f66757b);
                ofInt.setInterpolator(C28419c.m56829a(bVar));
                ofInt.setStartDelay(bVar.f66758c);
                ofInt.addListener(new C28436a(i, lynxUI2) {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C284337 */

                    static {
                        Covode.recordClassIndex(34423);
                    }

                    @Override // com.lynx.tasm.p2043a.p2046c.C28422a.C28436a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        lynxUI2.mView.setTranslationX(a.mo49788a());
                        lynxUI2.mView.setTranslationY(a.mo49789b());
                        if (Build.VERSION.SDK_INT >= 21) {
                            lynxUI2.mView.setTranslationZ(a.mo49790c());
                        }
                        if (lynxUI2.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI2.mParent).invalidate();
                        }
                        lynxUI2.mView.setRotation(a.mo49791d());
                        lynxUI2.mView.setRotationX(a.mo49792e());
                        lynxUI2.mView.setRotationY(a.mo49793f());
                        lynxUI2.mView.setScaleX(a.mo49794g());
                        lynxUI2.mView.setScaleY(a.mo49795h());
                        C28422a.this.f66847t.remove(animator);
                    }
                });
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C284348 */

                    static {
                        Covode.recordClassIndex(34424);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int height;
                        if (lynxUI2.getWidth() > lynxUI2.getHeight()) {
                            height = lynxUI2.getWidth();
                        } else {
                            height = lynxUI2.getHeight();
                        }
                        if (height > 0) {
                            lynxUI2.mView.setCameraDistance((float) (height * 100));
                        }
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        float a = a.mo49788a();
                        float f = translationX;
                        if (a != f) {
                            lynxUI2.mView.setTranslationX(f + ((a.mo49788a() - translationX) * animatedFraction));
                        }
                        float b = a.mo49789b();
                        float f2 = translationY;
                        if (b != f2) {
                            lynxUI2.mView.setTranslationY(f2 + ((a.mo49789b() - translationY) * animatedFraction));
                        }
                        float c = a.mo49790c();
                        float f3 = translationZ;
                        if (c != f3) {
                            float c2 = f3 + ((a.mo49790c() - translationZ) * animatedFraction);
                            if (Build.VERSION.SDK_INT >= 21) {
                                lynxUI2.mView.setTranslationZ(c2);
                            }
                        }
                        float d = a.mo49791d();
                        float f4 = rotation;
                        if (d != f4) {
                            lynxUI2.mView.setRotation(f4 + ((a.mo49791d() - rotation) * animatedFraction));
                        }
                        float e = a.mo49792e();
                        float f5 = rotationX;
                        if (e != f5) {
                            lynxUI2.mView.setRotation(f5 + ((a.mo49792e() - rotationX) * animatedFraction));
                        }
                        float f6 = a.mo49793f();
                        float f7 = rotationY;
                        if (f6 != f7) {
                            lynxUI2.mView.setRotationY(f7 + ((a.mo49793f() - rotationY) * animatedFraction));
                        }
                        float g = a.mo49794g();
                        float f8 = scaleX;
                        if (g != f8) {
                            lynxUI2.mView.setScaleX(f8 + ((a.mo49794g() - scaleX) * animatedFraction));
                        }
                        float h = a.mo49795h();
                        float f9 = scaleY;
                        if (h != f9) {
                            lynxUI2.mView.setScaleY(f9 + (animatedFraction * (a.mo49795h() - scaleY)));
                        }
                        if (lynxUI2.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI2.mParent).invalidate();
                        }
                    }
                });
                return false;
            } else if (this.f66850w) {
                return false;
            } else {
                if (lynxBaseUI2.mParent instanceof UIShadowProxy) {
                    lynxUI = (LynxUI) lynxBaseUI2.mParent;
                } else {
                    lynxUI = (LynxUI) lynxBaseUI2;
                }
                int intValue2 = ((Integer) obj).intValue();
                int visibility = lynxUI.mView.getVisibility();
                if (intValue2 == 1) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                if (visibility == i2) {
                    return false;
                }
                this.f66845r = true;
                final float alpha = lynxUI.mView.getAlpha();
                float f2 = 0.0f;
                if (visibility == 0) {
                    f2 = alpha;
                    f = 0.0f;
                } else if ((visibility == 4 || visibility == 8) && i2 == 0) {
                    lynxUI.mView.setAlpha(0.0f);
                } else {
                    f2 = alpha;
                }
                ValueAnimator ofObject2 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                ofObject2.setDuration(bVar.f66757b);
                ofObject2.setInterpolator(C28419c.m56829a(bVar));
                ofObject2.setStartDelay(bVar.f66758c);
                ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C2842511 */

                    static {
                        Covode.recordClassIndex(34415);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxUI.mView.setAlpha(((Float) animatedValue).floatValue());
                        }
                    }
                });
                ofObject2.addListener(new C28436a(lynxBaseUI2, i) {
                    /* class com.lynx.tasm.p2043a.p2046c.C28422a.C2842612 */

                    static {
                        Covode.recordClassIndex(34416);
                    }

                    public final void onAnimationCancel(Animator animator) {
                        super.onAnimationCancel(animator);
                        C28422a.this.f66845r = false;
                    }

                    @Override // com.lynx.tasm.p2043a.p2046c.C28422a.C28436a
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        lynxUI.mView.setVisibility(0);
                        C28422a.this.f66845r = false;
                    }

                    @Override // com.lynx.tasm.p2043a.p2046c.C28422a.C28436a
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C28436a.m56838a(lynxBaseUI2, C28437d.m56839a(i));
                        lynxUI.setVisibilityForView(i2);
                        lynxUI.mView.setAlpha(alpha);
                        C28422a.this.f66847t.remove(animator);
                    }
                });
                this.f66847t.add(ofObject2);
                return false;
            }
        } else if (this.f66845r) {
            return false;
        } else {
            final float min = Math.min(((Float) obj).floatValue(), 1.0f);
            final LynxUI lynxUI3 = (LynxUI) lynxBaseUI2;
            if (min == lynxUI3.mView.getAlpha()) {
                return false;
            }
            ValueAnimator ofObject3 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(lynxUI3.mView.getAlpha()), Float.valueOf(min));
            this.f66847t.add(ofObject3);
            ofObject3.setDuration(bVar.f66757b);
            ofObject3.setInterpolator(C28419c.m56829a(bVar));
            ofObject3.setStartDelay(bVar.f66758c);
            ofObject3.addListener(new C28436a(i, lynxUI3) {
                /* class com.lynx.tasm.p2043a.p2046c.C28422a.C284359 */

                static {
                    Covode.recordClassIndex(34425);
                }

                @Override // com.lynx.tasm.p2043a.p2046c.C28422a.C28436a
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    lynxUI3.mView.setAlpha(min);
                    if (lynxUI3.mParent instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxUI3.mParent).invalidate();
                    }
                    C28422a.this.f66847t.remove(animator);
                }
            });
            ofObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.lynx.tasm.p2043a.p2046c.C28422a.C2842410 */

                static {
                    Covode.recordClassIndex(34414);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        lynxUI3.mView.setAlpha(((Float) animatedValue).floatValue());
                        if (lynxUI3.mParent instanceof UIShadowProxy) {
                            ((UIShadowProxy) lynxUI3.mParent).invalidate();
                        }
                    }
                }
            });
            this.f66850w = true;
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r4 != 2048) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.animation.ValueAnimator m56830a(int r4, final com.lynx.tasm.behavior.p2052ui.LynxBaseUI r5, int r6, int r7, com.lynx.tasm.p2043a.C28407b r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2043a.p2046c.C28422a.m56830a(int, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, com.lynx.tasm.a.b, boolean):android.animation.ValueAnimator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017f, code lost:
        if (r15 != 2048) goto L_0x0181;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48863a(com.lynx.tasm.behavior.p2052ui.LynxBaseUI r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, android.graphics.Rect r64) {
        /*
        // Method dump skipped, instructions count: 759
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2043a.p2046c.C28422a.mo48863a(com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, android.graphics.Rect):void");
    }
}
