package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.ies.xelement.viewpager.C19450c;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.p1398a.C19447a;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public class LynxViewPager extends UISimpleView<C19450c> {

    /* renamed from: f */
    public static final C19438a f46062f = new C19438a((byte) 0);

    /* renamed from: a */
    public boolean f46063a;

    /* renamed from: b */
    public C19450c f46064b;

    /* renamed from: c */
    public TabLayout.C26722f f46065c;

    /* renamed from: d */
    public boolean f46066d = true;

    /* renamed from: e */
    TabLayout.AbstractC26717c f46067e;

    static {
        Covode.recordClassIndex(22267);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            float f = 0.0f;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            switch (nextKey.hashCode()) {
                case -2088137419:
                    if (nextKey.equals("selected-text-color")) {
                        setSelectedTextColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1951374851:
                    if (nextKey.equals("tabbar-background")) {
                        setTabbarBackground(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1689248927:
                    if (nextKey.equals("tab-padding-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingTop(i);
                        continue;
                    }
                    break;
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
                case -855908868:
                    if (nextKey.equals("unselected-text-color")) {
                        setUnSelectedTextColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -827357317:
                    if (nextKey.equals("tab-padding-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingLeft(i5);
                        continue;
                    }
                    break;
                case -798067553:
                    if (nextKey.equals("tab-padding-bottom")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingBottom(i4);
                        continue;
                    }
                    break;
                case 127387944:
                    if (nextKey.equals("tab-padding-right")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingRight(i3);
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
                case 210206703:
                    if (nextKey.equals("selected-text-size")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setSelectedTextSize(f);
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
                case 468669252:
                    if (nextKey.equals("hide-indicator")) {
                        setIndicatorVisibility(readableMap.getString(nextKey));
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
                case 942654657:
                    if (nextKey.equals("select-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setSelect(i2);
                        continue;
                    }
                    break;
                case 1095253835:
                    if (nextKey.equals("text-bold-mode")) {
                        setTextBoldMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1219787336:
                    if (nextKey.equals("unselected-text-size")) {
                        if (!readableMap.isNull(nextKey)) {
                            f = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setUnSelectedTextSize(f);
                        continue;
                    }
                    break;
                case 1581826371:
                    if (nextKey.equals("tabbar-drag")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setTabBarDragEnable(z);
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

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$a */
    public static final class C19438a {
        static {
            Covode.recordClassIndex(22270);
        }

        private C19438a() {
        }

        public /* synthetic */ C19438a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$f */
    public static final class View$OnAttachStateChangeListenerC19443f implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46072a;

        static {
            Covode.recordClassIndex(22275);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$f$a */
        static final class RunnableC19444a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC19443f f46073a;

            static {
                Covode.recordClassIndex(22276);
            }

            RunnableC19444a(View$OnAttachStateChangeListenerC19443f fVar) {
                this.f46073a = fVar;
            }

            public final void run() {
                Integer num;
                int i;
                LynxViewPager lynxViewPager = this.f46073a.f46072a;
                C19450c cVar = lynxViewPager.f46064b;
                if (cVar == null) {
                    C89219l.m154710a("mPager");
                }
                TabLayout mTabLayout = cVar.getMTabLayout();
                TabLayout.C26722f fVar = null;
                if (mTabLayout != null) {
                    num = Integer.valueOf(mTabLayout.getSelectedTabPosition());
                } else {
                    num = null;
                }
                C19450c cVar2 = lynxViewPager.f46064b;
                if (cVar2 == null) {
                    C89219l.m154710a("mPager");
                }
                TabLayout mTabLayout2 = cVar2.getMTabLayout();
                if (mTabLayout2 != null) {
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    fVar = mTabLayout2.getTabAt(i);
                }
                TabLayout.AbstractC26717c cVar3 = lynxViewPager.f46067e;
                if (cVar3 != null) {
                    cVar3.mo9936a(fVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC19443f(LynxViewPager lynxViewPager) {
            this.f46072a = lynxViewPager;
        }

        public final void onViewAttachedToWindow(View view) {
            LynxViewPager.m36274a(this.f46072a).post(new RunnableC19444a(this));
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void layoutChildren() {
        AbstractC28520j jVar = this.mContext;
        C89219l.m154709a((Object) jVar, "");
        if (jVar.f67076q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                if (!(lynxBaseUI instanceof LynxUI) || C0792v.m2791y(((LynxUI) lynxBaseUI).mView)) {
                    if (!needCustomLayout()) {
                        lynxBaseUI.layout();
                    } else if (lynxBaseUI instanceof UIGroup) {
                        ((UIGroup) lynxBaseUI).layoutChildren();
                    }
                }
            }
            return;
        }
        List list = this.mChildren;
        C89219l.m154709a((Object) list, "");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i);
            boolean z = lynxBaseUI2 instanceof LynxUI;
            if (!z || C0792v.m2791y(((LynxUI) lynxBaseUI2).mView)) {
                if (!needCustomLayout()) {
                    if (z) {
                        lynxBaseUI2.layout();
                    }
                } else if (lynxBaseUI2 instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI2).layoutChildren();
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$b */
    public static final class C19439b implements C19450c.AbstractC19455e {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46068a;

        static {
            Covode.recordClassIndex(22271);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19439b(LynxViewPager lynxViewPager) {
            this.f46068a = lynxViewPager;
        }

        @Override // com.bytedance.ies.xelement.viewpager.C19450c.AbstractC19455e
        /* renamed from: a */
        public final void mo31064a(boolean z) {
            AbstractC28520j jVar;
            if (z && (jVar = this.f46068a.mContext) != null && jVar.f67065f != null) {
                jVar.f67065f.f67719d = true;
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$c */
    public static final class C19440c implements TabLayout.AbstractC26717c {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46069a;

        static {
            Covode.recordClassIndex(22272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19440c(LynxViewPager lynxViewPager) {
            this.f46069a = lynxViewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public final void mo9937b(TabLayout.C26722f fVar) {
            View view;
            TextView textView;
            if (fVar != null && (view = fVar.f63312f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                LynxViewPager.m36274a(this.f46069a).setUnSelectedTextStyle(textView);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public final void mo9936a(TabLayout.C26722f fVar) {
            View view;
            TextView textView;
            int i;
            String str;
            TabLayout.C26722f tabAt;
            if (!(fVar == null || (view = fVar.f63312f) == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                LynxViewPager.m36274a(this.f46069a).setSelectedTextStyle(textView);
                if (this.f46069a.f46063a) {
                    LynxViewPager lynxViewPager = this.f46069a;
                    String obj = textView.getText().toString();
                    TabLayout mTabLayout = LynxViewPager.m36274a(this.f46069a).getMTabLayout();
                    if (mTabLayout != null) {
                        i = mTabLayout.getTabCount();
                    } else {
                        i = 0;
                    }
                    int i2 = 0;
                    while (true) {
                        str = "";
                        if (i2 >= i) {
                            i2 = 0;
                            break;
                        }
                        if (!(mTabLayout == null || (tabAt = mTabLayout.getTabAt(i2)) == null)) {
                            C89219l.m154709a((Object) tabAt, str);
                            if (tabAt == fVar) {
                                break;
                            }
                        }
                        i2++;
                    }
                    if (!this.f46069a.f46066d) {
                        if (this.f46069a.f46065c == fVar) {
                            str = "click";
                        } else {
                            str = "slide";
                        }
                    }
                    lynxViewPager.mo31037a(obj, i2, str);
                    this.f46069a.f46066d = false;
                }
            }
            this.f46069a.f46065c = null;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$d */
    public static final class C19441d implements C19450c.AbstractC19453c {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46070a;

        static {
            Covode.recordClassIndex(22273);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19441d(LynxViewPager lynxViewPager) {
            this.f46070a = lynxViewPager;
        }

        @Override // com.bytedance.ies.xelement.viewpager.C19450c.AbstractC19453c
        /* renamed from: a */
        public final void mo31065a(TabLayout.C26722f fVar) {
            C89219l.m154719c(fVar, "");
            this.f46070a.f46065c = fVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$e */
    public static final class C19442e implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46071a;

        static {
            Covode.recordClassIndex(22274);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19442e(LynxViewPager lynxViewPager) {
            this.f46071a = lynxViewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            if (this.f46071a.f46063a && LynxViewPager.m36274a(this.f46071a).getMTabLayout() == null) {
                this.f46071a.mo31037a("", i, "slide");
            }
        }
    }

    public LynxViewPager(AbstractC28520j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ C19450c m36274a(LynxViewPager lynxViewPager) {
        C19450c cVar = lynxViewPager.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        return cVar;
    }

    @AbstractC28525m(mo49059a = "border-height")
    public final void setBorderHeight(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setBorderHeight(f);
    }

    @AbstractC28525m(mo49059a = C19386b.f45897d)
    public final void setBorderWidth(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setBorderWidth(f);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f46063a = map.containsKey("change");
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setLynxDirection(int i) {
        super.setLynxDirection(i);
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setLynxDirection(i);
    }

    @AbstractC28525m(mo49059a = "selected-text-size")
    public final void setSelectedTextSize(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setSelectedTextSize(f);
    }

    @AbstractC28525m(mo49059a = "tabbar-drag")
    public final void setTabBarDragEnable(boolean z) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabBarDragEnable(z);
    }

    @AbstractC28525m(mo49059a = "tab-height")
    public final void setTabHeight(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.mo31078a(f, false);
    }

    @AbstractC28525m(mo49059a = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.mo31078a(f, true);
    }

    @AbstractC28525m(mo49059a = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabIndicatorHeight(f);
    }

    @AbstractC28525m(mo49059a = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabIndicatorRadius(f);
    }

    @AbstractC28525m(mo49059a = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabIndicatorWidth(f);
    }

    @AbstractC28525m(mo49059a = "tab-inter-space")
    public final void setTabInterspace(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabInterspace(f);
    }

    @AbstractC28525m(mo49059a = "tab-padding-bottom")
    public final void setTabPaddingBottom(int i) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabPaddingBottom(i);
    }

    @AbstractC28525m(mo49059a = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabPaddingStart(i);
    }

    @AbstractC28525m(mo49059a = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabPaddingEnd(i);
    }

    @AbstractC28525m(mo49059a = "tab-padding-top")
    public final void setTabPaddingTop(int i) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabPaddingTop(i);
    }

    @AbstractC28525m(mo49059a = "unselected-text-size")
    public final void setUnSelectedTextSize(float f) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setUnSelectedTextSize(f);
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.LynxViewPager$g */
    public static final class C19445g implements LynxViewpagerItem.AbstractC19463b {

        /* renamed from: a */
        final /* synthetic */ LynxViewPager f46074a;

        /* renamed from: b */
        final /* synthetic */ int f46075b;

        static {
            Covode.recordClassIndex(22277);
        }

        @Override // com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem.AbstractC19463b
        /* renamed from: a */
        public final void mo31069a(String str) {
            C89219l.m154719c(str, "");
            C19450c a = LynxViewPager.m36274a(this.f46074a);
            int i = this.f46075b;
            C89219l.m154719c(str, "");
            a.f46088d.set(i, str);
            a.f46085a.notifyDataSetChanged();
            a.mo31077a();
        }

        C19445g(LynxViewPager lynxViewPager, int i) {
            this.f46074a = lynxViewPager;
            this.f46075b = i;
        }
    }

    @AbstractC28525m(mo49059a = "background")
    public final void setBackground(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setBackgroundColor(C19447a.m36283a(str));
    }

    @AbstractC28525m(mo49059a = C19386b.f45898e)
    public final void setBorderLineColor(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setBorderLineColor(str);
    }

    @AbstractC28525m(mo49059a = "selected-text-color")
    public final void setSelectedTextColor(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setSelectedTextColor(str);
    }

    @AbstractC28525m(mo49059a = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setSelectedTabIndicatorColor(str);
    }

    @AbstractC28525m(mo49059a = "tabbar-background")
    public final void setTabbarBackground(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTabbarBackground(str);
    }

    @AbstractC28525m(mo49059a = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTablayoutGravity(str);
    }

    @AbstractC28525m(mo49059a = "text-bold-mode")
    public final void setTextBoldMode(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setTextBold(str);
    }

    @AbstractC28525m(mo49059a = "unselected-text-color")
    public final void setUnSelectedTextColor(String str) {
        C89219l.m154719c(str, "");
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        cVar.setUnSelectedTextColor(str);
    }

    @AbstractC28525m(mo49059a = "hide-indicator")
    public final void setIndicatorVisibility(String str) {
        C89219l.m154719c(str, "");
        if (C89219l.m154714a((Object) str, (Object) "true")) {
            C19450c cVar = this.f46064b;
            if (cVar == null) {
                C89219l.m154710a("mPager");
            }
            TabLayout mTabLayout = cVar.getMTabLayout();
            if (mTabLayout != null) {
                mTabLayout.setSelectedTabIndicator((Drawable) null);
            }
        }
    }

    @AbstractC28525m(mo49059a = "select-index")
    public final void setSelect(int i) {
        C19450c cVar = this.f46064b;
        if (cVar == null) {
            C89219l.m154710a("mPager");
        }
        TabLayout mTabLayout = cVar.getMTabLayout();
        if (mTabLayout == null || mTabLayout.getSelectedTabPosition() != i) {
            if (i >= 0) {
                C19450c cVar2 = this.f46064b;
                if (cVar2 == null) {
                    C89219l.m154710a("mPager");
                }
                PagerAdapter adapter = cVar2.getMViewPager().getAdapter();
                if (adapter != null && i < adapter.getCount()) {
                    C19450c cVar3 = this.f46064b;
                    if (cVar3 == null) {
                        C89219l.m154710a("mPager");
                    }
                    cVar3.setCurrentSelectIndex(i);
                }
            }
            C19450c cVar4 = this.f46064b;
            if (cVar4 == null) {
                C89219l.m154710a("mPager");
            }
            cVar4.setSelectedIndex(i);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        C19450c cVar = new C19450c(context);
        this.f46064b = cVar;
        cVar.setInterceptTouchEventListener(new C19439b(this));
        C19450c cVar2 = this.f46064b;
        if (cVar2 == null) {
            C89219l.m154710a("mPager");
        }
        cVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C19450c cVar3 = this.f46064b;
        if (cVar3 == null) {
            C89219l.m154710a("mPager");
        }
        cVar3.setRTLMode(isRtl());
        this.f46067e = new C19440c(this);
        C19450c cVar4 = this.f46064b;
        if (cVar4 == null) {
            C89219l.m154710a("mPager");
        }
        TabLayout.AbstractC26717c cVar5 = this.f46067e;
        if (cVar5 == null) {
            C89219l.m154707a();
        }
        cVar4.setTabSelectedListener$x_element_fold_view_newelement(cVar5);
        C19450c cVar6 = this.f46064b;
        if (cVar6 == null) {
            C89219l.m154710a("mPager");
        }
        cVar6.setTabClickListenerListener(new C19441d(this));
        C19450c cVar7 = this.f46064b;
        if (cVar7 == null) {
            C89219l.m154710a("mPager");
        }
        cVar7.getMViewPager().addOnPageChangeListener(new C19442e(this));
        C19450c cVar8 = this.f46064b;
        if (cVar8 == null) {
            C89219l.m154710a("mPager");
        }
        cVar8.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC19443f(this));
        C19450c cVar9 = this.f46064b;
        if (cVar9 != null) {
            return cVar9;
        }
        C89219l.m154710a("mPager");
        return cVar9;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    C19450c cVar = this.f46064b;
                    if (cVar == null) {
                        C89219l.m154710a("mPager");
                    }
                    String valueOf = String.valueOf(lynxViewpagerItem.f46124a);
                    C89219l.m154719c(valueOf, "");
                    if (valueOf.length() != 0) {
                        if (cVar.f46088d.contains(valueOf)) {
                            cVar.f46088d.remove(valueOf);
                        }
                        if (cVar.f46088d.size() > 0) {
                            cVar.mo31080a((TabLayout) null);
                        }
                    }
                }
                C19450c cVar2 = this.f46064b;
                if (cVar2 == null) {
                    C89219l.m154710a("mPager");
                }
                C89219l.m154719c(lynxViewpagerItem, "");
                cVar2.f46087c.remove(lynxViewpagerItem);
                cVar2.f46085a.notifyDataSetChanged();
                cVar2.mo31077a();
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                C19450c cVar3 = this.f46064b;
                if (cVar3 == null) {
                    C89219l.m154710a("mPager");
                }
                cVar3.mo31079a((View) ((LynxTabBarView) lynxBaseUI).mo31011a());
            } else {
                LLog.m56856a(6, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    C19450c cVar = this.f46064b;
                    if (cVar == null) {
                        C89219l.m154710a("mPager");
                    }
                    String valueOf = String.valueOf(lynxViewpagerItem.f46124a);
                    C89219l.m154719c(valueOf, "");
                    cVar.f46088d.add(valueOf);
                    if (valueOf.length() > 0) {
                        cVar.mo31080a((TabLayout) null);
                    }
                    C19445g gVar = new C19445g(this, i);
                    C89219l.m154719c(gVar, "");
                    lynxViewpagerItem.f46125b = gVar;
                }
                C19450c cVar2 = this.f46064b;
                if (cVar2 == null) {
                    C89219l.m154710a("mPager");
                }
                C89219l.m154719c(lynxViewpagerItem, "");
                cVar2.f46087c.add(lynxViewpagerItem);
                cVar2.f46085a.notifyDataSetChanged();
                cVar2.mo31077a();
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                C19450c cVar3 = this.f46064b;
                if (cVar3 == null) {
                    C89219l.m154710a("mPager");
                }
                cVar3.setTabLayout((LynxTabBarView) lynxBaseUI);
            } else {
                LLog.m56856a(6, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
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
                C19450c cVar = this.f46064b;
                if (cVar == null) {
                    C89219l.m154710a("mPager");
                }
                PagerAdapter adapter = cVar.getMViewPager().getAdapter();
                if (adapter != null && i < adapter.getCount()) {
                    C19450c cVar2 = this.f46064b;
                    if (cVar2 == null) {
                        C89219l.m154710a("mPager");
                    }
                    cVar2.setCurrentSelectIndex(i);
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

    /* renamed from: a */
    public final void mo31037a(String str, int i, String str2) {
        AbstractC28520j jVar = this.mContext;
        C89219l.m154709a((Object) jVar, "");
        C28719c cVar = jVar.f67064e;
        C28725c cVar2 = new C28725c(getSign(), "change");
        cVar2.mo49838a("tag", str);
        cVar2.mo49838a("index", Integer.valueOf(i));
        cVar2.mo49838a("scene", str2);
        cVar.mo49834a(cVar2);
    }
}
