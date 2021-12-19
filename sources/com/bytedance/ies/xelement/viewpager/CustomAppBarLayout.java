package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

@CoordinatorLayout.AbstractC0558c(mo2534a = Behavior.class)
public class CustomAppBarLayout extends AppBarLayout implements CoordinatorLayout.AbstractC0556a {

    /* renamed from: a */
    public boolean f46028a = true;

    static {
        Covode.recordClassIndex(22246);
    }

    public static class Behavior extends AppBarLayout.Behavior {

        /* renamed from: c */
        private boolean f46029c;

        /* renamed from: d */
        private boolean f46030d;

        static {
            Covode.recordClassIndex(22247);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return mo2531a(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        /* renamed from: a */
        public final boolean mo31004a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            m36244a(appBarLayout);
            return super.mo31004a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public Behavior() {
            m36246d();
        }

        /* renamed from: d */
        private void m36246d() {
            mo43743a(new AppBarLayout.BaseBehavior.AbstractC26568a() {
                /* class com.bytedance.ies.xelement.viewpager.CustomAppBarLayout.Behavior.C194251 */

                static {
                    Covode.recordClassIndex(22248);
                }

                @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.AbstractC26568a
                /* renamed from: a */
                public final boolean mo31005a(AppBarLayout appBarLayout) {
                    if (!(appBarLayout instanceof CustomAppBarLayout) || ((CustomAppBarLayout) appBarLayout).f46028a || ((long) (Behavior.this.mo43755c() / appBarLayout.getTotalScrollRange())) > -1) {
                        return true;
                    }
                    return false;
                }
            });
        }

        /* renamed from: e */
        private Field m36247e() {
            Class<? super Object> cls;
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                try {
                    cls = superclass.getSuperclass();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    Class<? super Object> superclass2 = superclass.getSuperclass().getSuperclass();
                    if (superclass2 != null) {
                        return superclass2.getDeclaredField("flingRunnable");
                    }
                }
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls.getDeclaredField("mFlingRunnable");
            }
            return null;
        }

        /* renamed from: f */
        private Field m36248f() {
            Class<? super Object> cls;
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                try {
                    cls = superclass.getSuperclass();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    Class<? super Object> superclass2 = superclass.getSuperclass().getSuperclass();
                    if (superclass2 != null) {
                        return superclass2.getDeclaredField("scroller");
                    }
                }
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls.getDeclaredField("mScroller");
            }
            return null;
        }

        /* renamed from: a */
        private void m36244a(AppBarLayout appBarLayout) {
            try {
                Field e = m36247e();
                if (e != null) {
                    e.setAccessible(true);
                    Runnable runnable = (Runnable) e.get(this);
                    if (runnable != null) {
                        appBarLayout.removeCallbacks(runnable);
                        e.set(this, null);
                    }
                }
                Field f = m36248f();
                if (f != null) {
                    f.setAccessible(true);
                    OverScroller overScroller = (OverScroller) f.get(this);
                    if (overScroller != null && !overScroller.isFinished()) {
                        overScroller.abortAnimation();
                    }
                }
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            m36246d();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo2528a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
            this.f46030d = this.f46029c;
            if (motionEvent.getActionMasked() == 0) {
                m36244a(appBarLayout);
            }
            return super.mo2528a(coordinatorLayout, (View) appBarLayout, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2519a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            mo2519a(coordinatorLayout, (AppBarLayout) view, view2, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        /* renamed from: a */
        public final void mo31001a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo31001a(coordinatorLayout, appBarLayout, view, i);
            this.f46029c = false;
            this.f46030d = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2522a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            mo2522a(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        /* renamed from: a */
        public final void mo31003a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 1) {
                this.f46029c = true;
            }
            if (!this.f46030d) {
                super.mo31003a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
            }
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2520a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            mo2520a(coordinatorLayout, (AppBarLayout) view, view2, i, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
        /* renamed from: a */
        public final void mo31002a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (!this.f46030d) {
                try {
                    super.mo31002a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0556a
    public CoordinatorLayout.AbstractC0557b getBehavior() {
        return new Behavior();
    }

    public void setIsEnableTabbarDrag(boolean z) {
        this.f46028a = z;
    }

    public CustomAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
