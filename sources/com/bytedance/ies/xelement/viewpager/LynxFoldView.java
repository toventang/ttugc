package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.xelement.viewpager.C19448b;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public class LynxFoldView extends UISimpleView<C19448b> {

    /* renamed from: e */
    public static final C19426a f46032e = new C19426a((byte) 0);

    /* renamed from: a */
    public C19448b f46033a;

    /* renamed from: b */
    public boolean f46034b;

    /* renamed from: c */
    public float f46035c;

    /* renamed from: d */
    public final ArrayList<LynxBaseUI> f46036d = new ArrayList<>();

    /* renamed from: f */
    private Handler f46037f;

    /* renamed from: g */
    private final AbstractC89244h f46038g = C89250i.m154773a((AbstractC89171a) C19429d.f46042a);

    /* renamed from: h */
    private final AbstractC89244h f46039h = C89250i.m154773a((AbstractC89171a) C19427b.f46040a);

    static {
        Covode.recordClassIndex(22249);
    }

    /* renamed from: a */
    private static Object m36260a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_xelement_viewpager_LynxFoldView_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_xelement_viewpager_LynxFoldView_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxFoldView$a */
    public static final class C19426a {
        static {
            Covode.recordClassIndex(22252);
        }

        private C19426a() {
        }

        public /* synthetic */ C19426a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxFoldView$b */
    static final class C19427b extends AbstractC89220m implements AbstractC89171a<Method> {

        /* renamed from: a */
        public static final C19427b f46040a = new C19427b();

        static {
            Covode.recordClassIndex(22253);
        }

        C19427b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Method invoke() {
            return m36261a();
        }

        /* renamed from: a */
        private static Method m36261a() {
            Class superclass = AppBarLayout.Behavior.class.getSuperclass();
            Method method = null;
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod("animateOffsetTo", CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Float.TYPE);
                } catch (Exception e) {
                    LLog.m56856a(6, "LynxFoldView", "init animateOffsetToMethod error " + e.getMessage());
                }
            }
            if (method != null) {
                method.setAccessible(true);
            }
            return method;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxFoldView$d */
    static final class C19429d extends AbstractC89220m implements AbstractC89171a<Method> {

        /* renamed from: a */
        public static final C19429d f46042a = new C19429d();

        static {
            Covode.recordClassIndex(22255);
        }

        C19429d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Method invoke() {
            return m36263a();
        }

        /* renamed from: a */
        private static Method m36263a() {
            Class superclass = AppBarLayout.Behavior.class.getSuperclass();
            Method method = null;
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod("setHeaderTopBottomOffset", CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                } catch (Exception e) {
                    LLog.m56856a(6, "LynxFoldView", "init animateOffsetToMethod error " + e.getMessage());
                }
            }
            if (method != null) {
                method.setAccessible(true);
            }
            return method;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeAll() {
        this.f46036d.clear();
        super.removeAll();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measureChildren() {
        super.measureChildren();
        Iterator<LynxBaseUI> it = this.f46036d.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (next != null) {
                next.measure();
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxFoldView$e */
    static final class RunnableC19430e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxFoldView f46043a;

        static {
            Covode.recordClassIndex(22256);
        }

        RunnableC19430e(LynxFoldView lynxFoldView) {
            this.f46043a = lynxFoldView;
        }

        public final void run() {
            for (LynxBaseUI lynxBaseUI : this.f46043a.getChildren()) {
                if (lynxBaseUI instanceof LynxViewPager) {
                    for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                        if (lynxBaseUI2 instanceof LynxTabBarView) {
                            LynxFoldView lynxFoldView = this.f46043a;
                            if (lynxBaseUI2 != null) {
                                lynxFoldView.f46036d.add(lynxBaseUI2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void layoutChildren() {
        super.layoutChildren();
        Iterator<LynxBaseUI> it = this.f46036d.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (needCustomLayout() && (next instanceof UIGroup)) {
                ((UIGroup) next).layoutChildren();
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxFoldView$c */
    public static final class C19428c implements AppBarLayout.AbstractC26571c {

        /* renamed from: a */
        final /* synthetic */ LynxFoldView f46041a;

        static {
            Covode.recordClassIndex(22254);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19428c(LynxFoldView lynxFoldView) {
            this.f46041a = lynxFoldView;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
        /* renamed from: a */
        public final void mo15197a(AppBarLayout appBarLayout, int i) {
            this.f46041a.recognizeGesturere();
            AbstractC28520j jVar = this.f46041a.mContext;
            C89219l.m154709a((Object) jVar, "");
            jVar.mo49040b().mo49058b();
            if (this.f46041a.f46034b) {
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) LynxFoldView.m36259a(this.f46041a).mo31074b(R.id.a7m);
                C89219l.m154709a((Object) collapsingToolbarLayout, "");
                int height = collapsingToolbarLayout.getHeight();
                Toolbar toolbar = (Toolbar) LynxFoldView.m36259a(this.f46041a).mo31074b(R.id.fju);
                C89219l.m154709a((Object) toolbar, "");
                int height2 = height - toolbar.getHeight();
                if (height2 != 0) {
                    LLog.m56856a(3, "LynxFoldView", "onOffsetChanged: " + i + ", height = " + height2 + ' ');
                    float abs = Math.abs((float) i) / ((float) height2);
                    if (((double) Math.abs(this.f46041a.f46035c - abs)) >= 0.01d) {
                        AbstractC28520j jVar2 = this.f46041a.mContext;
                        C89219l.m154709a((Object) jVar2, "");
                        C28719c cVar = jVar2.f67064e;
                        C28725c cVar2 = new C28725c(this.f46041a.getSign(), "offset");
                        String a = C1764a.m5928a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
                        C89219l.m154709a((Object) a, "");
                        cVar2.mo49838a("offset", a);
                        cVar.mo49834a(cVar2);
                        StringBuilder sb = new StringBuilder("send ");
                        String a2 = C1764a.m5928a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
                        C89219l.m154709a((Object) a2, "");
                        LLog.m56856a(3, "LynxFoldView", sb.append(a2).toString());
                        this.f46041a.f46035c = abs;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C19448b m36259a(LynxFoldView lynxFoldView) {
        C19448b bVar = lynxFoldView.f46033a;
        if (bVar == null) {
            C89219l.m154710a("mFoldToolbarLayout");
        }
        return bVar;
    }

    public LynxFoldView(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        LLog.m56856a(3, "LynxFoldView", "events: ".concat(String.valueOf(map)));
        if (map != null) {
            this.f46034b = map.containsKey("offset");
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        C19448b bVar = new C19448b(context);
        this.f46033a = bVar;
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C19448b bVar2 = this.f46033a;
        if (bVar2 == null) {
            C89219l.m154710a("mFoldToolbarLayout");
        }
        ((AppBarLayout) bVar2.mo31074b(R.id.ki)).mo43717a(new C19428c(this));
        C19448b bVar3 = this.f46033a;
        if (bVar3 != null) {
            return bVar3;
        }
        C89219l.m154710a("mFoldToolbarLayout");
        return bVar3;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(null);
            C19448b bVar = this.f46033a;
            if (bVar == null) {
                C89219l.m154710a("mFoldToolbarLayout");
            }
            bVar.removeView(lynxUI.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxViewPager) {
            Iterator<LynxBaseUI> it = lynxBaseUI.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LynxBaseUI next = it.next();
                if (next instanceof LynxTabBarView) {
                    if (next != null) {
                        this.f46036d.remove(next);
                    }
                }
            }
        }
        super.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams.width == -1 && layoutParams.height == -2) {
                return layoutParams;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof CollapsingToolbarLayout.C26574a) {
                int i = Build.VERSION.SDK_INT;
                return new CollapsingToolbarLayout.C26574a((FrameLayout.LayoutParams) layoutParams);
            } else if (layoutParams instanceof CoordinatorLayout.C0560e) {
                CoordinatorLayout.C0560e eVar = new CoordinatorLayout.C0560e((CoordinatorLayout.C0560e) layoutParams);
                eVar.mo2538a(new AppBarLayout.ScrollingViewBehavior());
                return eVar;
            } else if (layoutParams instanceof Toolbar.C0376b) {
                return new Toolbar.C0376b((Toolbar.C0376b) layoutParams);
            }
        }
        CoordinatorLayout.C0560e eVar2 = new CoordinatorLayout.C0560e(-1, -2);
        eVar2.mo2538a(new AppBarLayout.ScrollingViewBehavior());
        return eVar2;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxFoldToolbar) {
                C19448b bVar = this.f46033a;
                if (bVar == null) {
                    C89219l.m154710a("mFoldToolbarLayout");
                }
                C28698a aVar = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar, "");
                C89219l.m154719c(aVar, "");
                Toolbar toolbar = (Toolbar) bVar.mo31074b(R.id.fju);
                C89219l.m154709a((Object) toolbar, "");
                toolbar.setVisibility(0);
                ((Toolbar) bVar.mo31074b(R.id.fju)).addView(aVar);
            } else if (lynxBaseUI instanceof LynxFoldHeader) {
                C19448b bVar2 = this.f46033a;
                if (bVar2 == null) {
                    C89219l.m154710a("mFoldToolbarLayout");
                }
                C28698a aVar2 = (C28698a) ((LynxUI) lynxBaseUI).mView;
                C89219l.m154709a((Object) aVar2, "");
                C89219l.m154719c(aVar2, "");
                ((CollapsingToolbarLayout) bVar2.mo31074b(R.id.a7m)).addView(aVar2, 0);
            } else {
                C19448b bVar3 = this.f46033a;
                if (bVar3 == null) {
                    C89219l.m154710a("mFoldToolbarLayout");
                }
                T t = lynxUI.mView;
                C89219l.m154709a((Object) t, "");
                C89219l.m154719c(t, "");
                if (t instanceof C19450c) {
                    C19450c cVar = (C19450c) t;
                    cVar.setTabLayoutUpdateListener$x_element_fold_view_newelement(new C19448b.C19449a(bVar3, t));
                    if (cVar.getMTabLayout() != null) {
                        cVar.mo31079a((View) cVar.getMTabLayout());
                        TabLayout mTabLayout = cVar.getMTabLayout();
                        if (mTabLayout != null) {
                            bVar3.mo31075d((View) mTabLayout);
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                    CoordinatorLayout.C0560e eVar = new CoordinatorLayout.C0560e(new ViewGroup.LayoutParams(-1, -1));
                    eVar.mo2538a(new AppBarLayout.ScrollingViewBehavior());
                    cVar.setLayoutParams(eVar);
                }
                bVar3.addView(t);
                if (this.f46037f == null) {
                    this.f46037f = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.f46037f;
                if (handler != null) {
                    handler.post(new RunnableC19430e(this));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    @com.lynx.tasm.behavior.AbstractC28528p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFoldExpanded(com.lynx.react.bridge.ReadableMap r20, com.lynx.react.bridge.Callback r21) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.viewpager.LynxFoldView.setFoldExpanded(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }
}
