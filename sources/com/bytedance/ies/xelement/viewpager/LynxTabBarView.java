package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.p1398a.C19447a;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public class LynxTabBarView extends UISimpleView<TabLayout> {

    /* renamed from: h */
    public static final C19431a f46044h = new C19431a((byte) 0);

    /* renamed from: a */
    public boolean f46045a = true;

    /* renamed from: b */
    public boolean f46046b;

    /* renamed from: c */
    public TabLayout f46047c;

    /* renamed from: d */
    public AbstractC19432b f46048d;

    /* renamed from: e */
    public TabLayout.C26722f f46049e;

    /* renamed from: f */
    public boolean f46050f;

    /* renamed from: g */
    public Map<Integer, String> f46051g = new HashMap();

    /* renamed from: i */
    private float f46052i = 9.0f;

    /* renamed from: j */
    private final ArrayList<C19446a> f46053j = new ArrayList<>();

    /* renamed from: k */
    private float f46054k = -1.0f;

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$b */
    public interface AbstractC19432b {
        static {
            Covode.recordClassIndex(22261);
        }

        /* renamed from: a */
        void mo31031a(TabLayout.C26722f fVar);
    }

    static {
        Covode.recordClassIndex(22257);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i = 0;
            boolean z = false;
            int i2 = 0;
            float f = 0.0f;
            switch (nextKey.hashCode()) {
                case -1491502497:
                    if (nextKey.equals("tab-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabHeight(f);
                        continue;
                    }
                    break;
                case -1369575443:
                    if (nextKey.equals("tab-indicator-color")) {
                        setTabIndicatorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1351291312:
                    if (nextKey.equals("tab-indicator-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorWidth(f);
                        continue;
                    }
                    break;
                case -1332194002:
                    if (nextKey.equals("background")) {
                        setBackground(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -887638045:
                    if (nextKey.equals("tab-layout-gravity")) {
                        setTablayoutGravity(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -827357317:
                    if (nextKey.equals("tab-padding-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingLeft(i);
                        continue;
                    }
                    break;
                case 127387944:
                    if (nextKey.equals("tab-padding-right")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingRight(i2);
                        continue;
                    }
                    break;
                case 182873757:
                    if (nextKey.equals("tab-inter-space")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabInterspace(f);
                        continue;
                    }
                    break;
                case 195239007:
                    if (nextKey.equals("tab-indicator-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        set(f);
                        continue;
                    }
                    break;
                case 292087426:
                    if (nextKey.equals(C19386b.f45898e)) {
                        setBorderLineColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 310371557:
                    if (nextKey.equals(C19386b.f45897d)) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderWidth(f);
                        continue;
                    }
                    break;
                case 598588904:
                    if (nextKey.equals("border-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderHeight(f);
                        continue;
                    }
                    break;
                case 626647517:
                    if (nextKey.equals("tab-indicator-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorHeight(f);
                        continue;
                    }
                    break;
                case 790454668:
                    if (nextKey.equals("tab-height-rpx")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabHeightRpx(f);
                        continue;
                    }
                    break;
                case 909098312:
                    if (nextKey.equals("tab-indicator-radius")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorRadius(f);
                        continue;
                    }
                    break;
                case 1027794903:
                    if (nextKey.equals("disable-attach-event")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setDisableAttachEvent(z);
                        continue;
                    }
                    break;
                case 1823781940:
                    if (nextKey.equals("border-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderTop(f);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$a */
    public static final class C19431a {
        static {
            Covode.recordClassIndex(22260);
        }

        private C19431a() {
        }

        public /* synthetic */ C19431a(byte b) {
            this();
        }

        /* renamed from: a */
        public static TabLayout m36268a(Context context) {
            C89219l.m154719c(context, "");
            TabLayout tabLayout = new TabLayout(context);
            tabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tabLayout.setTabMode(0);
            tabLayout.setSelectedTabIndicator(R.drawable.b3v);
            tabLayout.setBackgroundResource(R.drawable.b3w);
            tabLayout.getBackground().mutate();
            Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
            if (tabSelectedIndicator != null) {
                tabSelectedIndicator.mutate();
            }
            m36269a(tabLayout);
            return tabLayout;
        }

        /* renamed from: a */
        private static void m36269a(TabLayout tabLayout) {
            Object obj;
            try {
                Field declaredField = TabLayout.class.getDeclaredField("tabPaddingStart");
                C89219l.m154709a((Object) declaredField, "");
                declaredField.setAccessible(true);
                declaredField.set(tabLayout, 0);
                Field declaredField2 = TabLayout.class.getDeclaredField("tabPaddingEnd");
                C89219l.m154709a((Object) declaredField2, "");
                declaredField2.setAccessible(true);
                declaredField2.set(tabLayout, 0);
                Field declaredField3 = TabLayout.class.getDeclaredField("tabPaddingTop");
                C89219l.m154709a((Object) declaredField3, "");
                declaredField3.setAccessible(true);
                declaredField3.set(tabLayout, 0);
                Field declaredField4 = TabLayout.class.getDeclaredField("tabPaddingBottom");
                C89219l.m154709a((Object) declaredField4, "");
                declaredField4.setAccessible(true);
                declaredField4.set(tabLayout, 0);
                Field declaredField5 = TabLayout.class.getDeclaredField("requestedTabMinWidth");
                C89219l.m154709a((Object) declaredField5, "");
                declaredField5.setAccessible(true);
                declaredField5.set(tabLayout, 0);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            C89379q.m157071exceptionOrNullimpl(obj);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$d */
    public static final class View$OnAttachStateChangeListenerC19434d implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f46056a;

        /* renamed from: b */
        final /* synthetic */ C19436e f46057b;

        static {
            Covode.recordClassIndex(22263);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$d$a */
        static final class RunnableC19435a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC19434d f46058a;

            static {
                Covode.recordClassIndex(22264);
            }

            RunnableC19435a(View$OnAttachStateChangeListenerC19434d dVar) {
                this.f46058a = dVar;
            }

            public final void run() {
                this.f46058a.f46057b.mo9936a(LynxTabBarView.m36264a(this.f46058a.f46056a).getTabAt(LynxTabBarView.m36264a(this.f46058a.f46056a).getSelectedTabPosition()));
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f46056a.f46050f) {
                LynxTabBarView.m36264a(this.f46056a).post(new RunnableC19435a(this));
            }
        }

        View$OnAttachStateChangeListenerC19434d(LynxTabBarView lynxTabBarView, C19436e eVar) {
            this.f46056a = lynxTabBarView;
            this.f46057b = eVar;
        }
    }

    /* renamed from: a */
    public final TabLayout mo31011a() {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        return tabLayout;
    }

    /* renamed from: b */
    private final void m36265b() {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        if (tabLayout.getBackground() == null) {
            TabLayout tabLayout2 = this.f46047c;
            if (tabLayout2 == null) {
                C89219l.m154710a("mTabLayout");
            }
            tabLayout2.setBackgroundResource(R.drawable.b3w);
            TabLayout tabLayout3 = this.f46047c;
            if (tabLayout3 == null) {
                C89219l.m154710a("mTabLayout");
            }
            tabLayout3.getBackground().mutate();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void measure() {
        if (this.f46054k > 0.0f) {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            if (layoutParams != null) {
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                layoutParams.height = C19447a.m36284b(jVar, this.f46054k);
            }
        }
        super.measure();
    }

    @AbstractC28525m(mo49059a = "disable-attach-event", mo49064f = false)
    public final void setDisableAttachEvent(boolean z) {
        this.f46050f = z;
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$c */
    public static final class C19433c implements AbstractC19432b {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f46055a;

        static {
            Covode.recordClassIndex(22262);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19433c(LynxTabBarView lynxTabBarView) {
            this.f46055a = lynxTabBarView;
        }

        @Override // com.bytedance.ies.xelement.viewpager.LynxTabBarView.AbstractC19432b
        /* renamed from: a */
        public final void mo31031a(TabLayout.C26722f fVar) {
            C89219l.m154719c(fVar, "");
            this.f46055a.f46049e = fVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$e */
    public static final class C19436e implements TabLayout.AbstractC26717c {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f46059a;

        static {
            Covode.recordClassIndex(22265);
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public final void mo9937b(TabLayout.C26722f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19436e(LynxTabBarView lynxTabBarView) {
            this.f46059a = lynxTabBarView;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public final void mo9936a(TabLayout.C26722f fVar) {
            int i;
            if (this.f46059a.f46046b) {
                LynxTabBarView lynxTabBarView = this.f46059a;
                if (fVar != null) {
                    TabLayout tabLayout = lynxTabBarView.f46047c;
                    if (tabLayout == null) {
                        C89219l.m154710a("mTabLayout");
                        C89219l.m154707a();
                    }
                    int tabCount = tabLayout.getTabCount();
                    i = 0;
                    while (true) {
                        if (i >= tabCount) {
                            break;
                        }
                        TabLayout tabLayout2 = lynxTabBarView.f46047c;
                        if (tabLayout2 == null) {
                            C89219l.m154710a("mTabLayout");
                        }
                        if (tabLayout2.getTabAt(i) == fVar) {
                            break;
                        }
                        i++;
                    }
                }
                i = 0;
                AbstractC28520j jVar = this.f46059a.mContext;
                String str = "";
                C89219l.m154709a((Object) jVar, str);
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f46059a.getSign(), "change");
                String str2 = this.f46059a.f46051g.get(Integer.valueOf(i));
                if (str2 == null) {
                    str2 = str;
                }
                cVar2.mo49838a("tag", str2);
                cVar2.mo49838a("index", Integer.valueOf(i));
                if (!this.f46059a.f46045a) {
                    if (this.f46059a.f46049e == fVar) {
                        str = "click";
                    } else {
                        str = "slide";
                    }
                }
                cVar2.mo49838a("scene", str);
                cVar.mo49834a(cVar2);
                this.f46059a.f46045a = false;
                this.f46059a.f46049e = null;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @AbstractC28525m(mo49059a = "tab-inter-space")
    public final void setTabInterspace(float f) {
        this.f46052i = f / 2.0f;
    }

    /* renamed from: a */
    public static final /* synthetic */ TabLayout m36264a(LynxTabBarView lynxTabBarView) {
        TabLayout tabLayout = lynxTabBarView.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        return tabLayout;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f46046b = map.containsKey("change");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxTabBarView$f */
    public static final class View$OnClickListenerC19437f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxTabBarView f46060a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f46061b;

        static {
            Covode.recordClassIndex(22266);
        }

        View$OnClickListenerC19437f(LynxTabBarView lynxTabBarView, C89233z.C89238e eVar) {
            this.f46060a = lynxTabBarView;
            this.f46061b = eVar;
        }

        public final void onClick(View view) {
            AbstractC19432b bVar = this.f46060a.f46048d;
            if (bVar != null) {
                T t = this.f46061b.element;
                if (t == null) {
                    C89219l.m154707a();
                }
                bVar.mo31031a(t);
            }
        }
    }

    public LynxTabBarView(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        C89219l.m154719c(str, "");
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        tabLayout.setSelectedTabIndicatorColor(C19447a.m36283a(str));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.f46047c = C19431a.m36268a(context);
        C19436e eVar = new C19436e(this);
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        tabLayout.addOnTabSelectedListener(eVar);
        this.f46048d = new C19433c(this);
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        tabLayout2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC19434d(this, eVar));
        TabLayout tabLayout3 = this.f46047c;
        if (tabLayout3 != null) {
            return tabLayout3;
        }
        C89219l.m154710a("mTabLayout");
        return tabLayout3;
    }

    @AbstractC28525m(mo49059a = "tab-indicator-top")
    public final void set(float f) {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            ((LayerDrawable) tabSelectedIndicator).setLayerInset(0, 0, 0, 0, C19447a.m36282a(jVar, f));
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setBackgroundColor(int i) {
        m36265b();
        if (Build.VERSION.SDK_INT < 23) {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            tabLayout.setBackgroundColor(i);
            return;
        }
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable background = tabLayout2.getBackground();
        if (background != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(i);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = C19386b.f45898e)
    public final void setBorderLineColor(String str) {
        C89219l.m154719c(str, "");
        if (Build.VERSION.SDK_INT >= 23) {
            m36265b();
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    ((GradientDrawable) drawable).setColor(C19447a.m36283a(str));
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @AbstractC28525m(mo49059a = "border-top")
    public final void setBorderTop(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            m36265b();
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                ((LayerDrawable) background).setLayerInset(0, 0, 0, 0, C19447a.m36282a(jVar, f));
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setLynxDirection(int i) {
        super.setLynxDirection(i);
        if (i == 2 || i == 2) {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            C0792v.m2759b((View) tabLayout, 1);
            return;
        }
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        C0792v.m2759b((View) tabLayout2, 0);
    }

    @AbstractC28525m(mo49059a = "tab-height")
    public final void setTabHeight(float f) {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams != null) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            layoutParams.height = C19447a.m36282a(jVar, f);
        }
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        tabLayout2.requestLayout();
    }

    @AbstractC28525m(mo49059a = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        this.f46054k = f;
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams != null) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            layoutParams.height = C19447a.m36284b(jVar, this.f46054k);
        }
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        tabLayout2.requestLayout();
    }

    @AbstractC28525m(mo49059a = "background")
    public final void setBackground(String str) {
        C89219l.m154719c(str, "");
        m36265b();
        if (Build.VERSION.SDK_INT < 23) {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            tabLayout.setBackgroundColor(C19447a.m36283a(str));
            return;
        }
        TabLayout tabLayout2 = this.f46047c;
        if (tabLayout2 == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable background = tabLayout2.getBackground();
        if (background != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(C19447a.m36283a(str));
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = "border-height")
    public final void setBorderHeight(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            m36265b();
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                    AbstractC28520j jVar = this.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    gradientDrawable.setSize(intrinsicWidth, C19447a.m36282a(jVar, f));
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45897d)
    public final void setBorderWidth(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            m36265b();
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            int a = (int) (((float) C19447a.m36281a(jVar)) * (f / 375.0f));
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.setSize(a, gradientDrawable.getIntrinsicHeight());
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @AbstractC28525m(mo49059a = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                gradientDrawable.setSize(intrinsicWidth, C19447a.m36282a(jVar, f));
                TabLayout tabLayout2 = this.f46047c;
                if (tabLayout2 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                ((GradientDrawable) drawable).setCornerRadius((float) C19447a.m36282a(jVar, f));
                TabLayout tabLayout2 = this.f46047c;
                if (tabLayout2 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        TabLayout tabLayout = this.f46047c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                gradientDrawable.setSize((int) (((float) C19447a.m36281a(jVar)) * (f / 375.0f)), gradientDrawable.getIntrinsicHeight());
                TabLayout tabLayout2 = this.f46047c;
                if (tabLayout2 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @AbstractC28525m(mo49059a = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        try {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Field declaredField = tabLayout.getClass().getDeclaredField("contentInsetStart");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            TabLayout tabLayout2 = this.f46047c;
            if (tabLayout2 == null) {
                C89219l.m154710a("mTabLayout");
            }
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            declaredField.set(tabLayout2, Integer.valueOf(C19447a.m36282a(jVar, (float) i)));
            TabLayout tabLayout3 = this.f46047c;
            if (tabLayout3 == null) {
                C89219l.m154710a("mTabLayout");
            }
            Method declaredMethod = tabLayout3.getClass().getDeclaredMethod("applyModeAndGravity", new Class[0]);
            C89219l.m154709a((Object) declaredMethod, "");
            declaredMethod.setAccessible(true);
            TabLayout tabLayout4 = this.f46047c;
            if (tabLayout4 == null) {
                C89219l.m154710a("mTabLayout");
            }
            C89379q.m157068constructorimpl(declaredMethod.invoke(tabLayout4, new Object[0]));
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @AbstractC28525m(mo49059a = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        try {
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            Field declaredField = tabLayout.getClass().getDeclaredField("slidingTabIndicator");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            TabLayout tabLayout2 = this.f46047c;
            if (tabLayout2 == null) {
                C89219l.m154710a("mTabLayout");
            }
            Object obj = declaredField.get(tabLayout2);
            if (obj != null) {
                LinearLayout linearLayout = (LinearLayout) obj;
                int paddingStart = linearLayout.getPaddingStart();
                int top = linearLayout.getTop();
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                C0792v.m2741a(linearLayout, paddingStart, top, C19447a.m36282a(jVar, (float) i), linearLayout.getBottom());
                TabLayout tabLayout3 = this.f46047c;
                if (tabLayout3 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout3.requestLayout();
                C89379q.m157068constructorimpl(C89391z.f203057a);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @AbstractC28525m(mo49059a = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        Field declaredField;
        C89219l.m154719c(str, "");
        Locale locale = Locale.ROOT;
        C89219l.m154709a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154709a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode == 3317767 && lowerCase.equals("left")) {
                    TabLayout tabLayout = this.f46047c;
                    if (tabLayout == null) {
                        C89219l.m154710a("mTabLayout");
                    }
                    ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                    }
                    TabLayout tabLayout2 = this.f46047c;
                    if (tabLayout2 == null) {
                        C89219l.m154710a("mTabLayout");
                    }
                    tabLayout2.requestLayout();
                }
            } else if (lowerCase.equals("fill")) {
                TabLayout tabLayout3 = this.f46047c;
                if (tabLayout3 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout3.setTabMode(1);
                TabLayout tabLayout4 = this.f46047c;
                if (tabLayout4 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                ViewGroup.LayoutParams layoutParams2 = tabLayout4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = -1;
                }
                TabLayout tabLayout5 = this.f46047c;
                if (tabLayout5 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout5.setTabGravity(0);
                TabLayout tabLayout6 = this.f46047c;
                if (tabLayout6 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                tabLayout6.requestLayout();
            }
        } else if (lowerCase.equals("center")) {
            TabLayout tabLayout7 = this.f46047c;
            if (tabLayout7 == null) {
                C89219l.m154710a("mTabLayout");
            }
            tabLayout7.setTabGravity(1);
            TabLayout tabLayout8 = this.f46047c;
            if (tabLayout8 == null) {
                C89219l.m154710a("mTabLayout");
            }
            ViewGroup.LayoutParams layoutParams3 = tabLayout8.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = -1;
            }
            try {
                TabLayout tabLayout9 = this.f46047c;
                if (tabLayout9 == null) {
                    C89219l.m154710a("mTabLayout");
                }
                Class<?> cls = tabLayout9.getClass();
                if (!(cls == null || (declaredField = cls.getDeclaredField("slidingTabIndicator")) == null)) {
                    declaredField.setAccessible(true);
                    TabLayout tabLayout10 = this.f46047c;
                    if (tabLayout10 == null) {
                        C89219l.m154710a("mTabLayout");
                    }
                    Object obj = declaredField.get(tabLayout10);
                    if (obj != null) {
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.setGravity(17);
                        linearLayout.getLayoutParams().width = -2;
                        C89379q.m157068constructorimpl(C89391z.f203057a);
                        TabLayout tabLayout11 = this.f46047c;
                        if (tabLayout11 == null) {
                            C89219l.m154710a("mTabLayout");
                        }
                        tabLayout11.requestLayout();
                        return;
                    }
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        int i2;
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            lynxTabbarItem.setParent(this);
            this.mChildren.add(i, lynxBaseUI);
            ArrayList<C19446a> arrayList = this.f46053j;
            C19446a aVar = new C19446a(this.mContext);
            aVar.setOverflow(lynxTabbarItem.getOverflow());
            aVar.addView(((LynxUI) lynxBaseUI).mView);
            arrayList.add(i, aVar);
            if (lynxTabbarItem.getProps().containsKey("tag")) {
                this.f46051g.put(Integer.valueOf(i), String.valueOf(lynxTabbarItem.getProps().get("tag")));
            }
            if (lynxTabbarItem.f46119b) {
                i2 = i;
            } else {
                i2 = 0;
            }
            mo31012a(i, i2);
            TabLayout tabLayout = this.f46047c;
            if (tabLayout == null) {
                C89219l.m154710a("mTabLayout");
            }
            C89219l.m154719c(tabLayout, "");
            lynxTabbarItem.f46120c = Integer.valueOf(i);
            lynxTabbarItem.f46121d = tabLayout;
        }
    }

    @AbstractC28528p
    public final void selectTab(ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(readableMap, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", false);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0) {
                TabLayout tabLayout = this.f46047c;
                if (tabLayout == null) {
                    C89219l.m154710a("mTabLayout");
                }
                if (i < tabLayout.getTabCount()) {
                    TabLayout tabLayout2 = this.f46047c;
                    if (tabLayout2 == null) {
                        C89219l.m154710a("mTabLayout");
                    }
                    TabLayout.C26722f tabAt = tabLayout2.getTabAt(i);
                    if (tabAt != null) {
                        tabAt.mo44370a();
                    }
                    javaOnlyMap.put("success", true);
                    if (callback != null) {
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    return;
                }
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r2 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r0 == null) goto L_0x0086;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31012a(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.viewpager.LynxTabBarView.mo31012a(int, int):void");
    }
}
