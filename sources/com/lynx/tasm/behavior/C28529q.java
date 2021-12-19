package com.lynx.tasm.behavior;

import android.graphics.Rect;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.C28855q;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI;
import com.lynx.tasm.image.LynxFlattenImageUI;
import com.lynx.tasm.image.LynxImageUI;
import com.lynx.tasm.p2043a.p2046c.C28422a;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.utils.C28929m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.lynx.tasm.behavior.q */
public class C28529q {

    /* renamed from: a */
    public int f67109a = -1;

    /* renamed from: b */
    public UIBody f67110b;

    /* renamed from: c */
    public AbstractC28520j f67111c;

    /* renamed from: d */
    final HashSet<String> f67112d = new HashSet<>();

    /* renamed from: e */
    public final HashMap<Integer, LynxBaseUI> f67113e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<Integer, Integer> f67114f = new HashMap<>();

    /* renamed from: g */
    public boolean f67115g;

    /* renamed from: h */
    public boolean f67116h;

    /* renamed from: i */
    public TemplateAssembler f67117i;

    /* renamed from: j */
    private final HashMap<Integer, LynxBaseUI> f67118j = new HashMap<>();

    /* renamed from: k */
    private final C28477c f67119k;

    static {
        Covode.recordClassIndex(34527);
    }

    /* renamed from: a */
    public final synchronized void mo49080a(int i, String str, C28716v vVar, Map<String, C28723a> map, boolean z) {
        MethodCollector.m26663i(2777);
        String concat = "UIOwner.createView.".concat(String.valueOf(str));
        TraceEvent.m56864a(0, concat);
        C28929m.m57951b();
        LynxBaseUI a = mo49071a(i, str, map, z);
        a.setDefaultOverflow();
        LynxBaseUI b = m57041b(a, vVar);
        this.f67112d.add(str);
        mo49079a(i, str, vVar);
        this.f67113e.put(Integer.valueOf(i), b);
        TraceEvent.m56869b(0, concat);
        MethodCollector.m26664o(2777);
    }

    /* renamed from: a */
    public final UIShadowProxy mo49074a(LynxBaseUI lynxBaseUI, C28716v vVar) {
        UIShadowProxy uIShadowProxy = null;
        if (vVar != null) {
            if (m57040a(vVar)) {
                uIShadowProxy = new UIShadowProxy(this.f67111c, lynxBaseUI);
            }
            lynxBaseUI.updatePropertiesInterval(vVar);
        }
        return uIShadowProxy;
    }

    /* renamed from: a */
    public final LynxBaseUI mo49071a(int i, String str, Map<String, C28723a> map, boolean z) {
        LynxBaseUI a;
        if (this.f67109a >= 0 || !str.equals("page")) {
            a = mo49073a(str, z);
            a.setEvents(map);
        } else {
            a = this.f67110b;
            this.f67109a = i;
        }
        a.setSign(i, str);
        return a;
    }

    /* renamed from: a */
    public final void mo49081a(int i, boolean z) {
        if (this.f67111c.f67077r) {
            m57043b(i, z);
            return;
        }
        LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
        String str = "UIOwner.updateFlatten." + lynxBaseUI.mTagName;
        TraceEvent.m56864a(0, str);
        lynxBaseUI.destroy();
        LynxBaseUI a = mo49073a(lynxBaseUI.mTagName, z);
        a.setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        m57041b(a, new C28716v(lynxBaseUI.getProps()));
        this.f67113e.put(Integer.valueOf(lynxBaseUI.getSign()), a);
        TraceEvent.m56869b(0, str);
    }

    /* renamed from: a */
    public final void mo49077a(int i, int i2, int i3) {
        if (this.f67111c.f67077r) {
            if (this.f67113e.size() > 0) {
                LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
                LynxBaseUI lynxBaseUI2 = this.f67113e.get(Integer.valueOf(i2));
                if (lynxBaseUI == null || lynxBaseUI2 == null) {
                    throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i2)));
                }
                if (!lynxBaseUI.canHaveFlattenChild() && lynxBaseUI2.isFlatten()) {
                    m57043b(i2, false);
                    lynxBaseUI2 = this.f67113e.get(Integer.valueOf(i2));
                }
                lynxBaseUI.insertChild(lynxBaseUI2, i3);
                m57039a(lynxBaseUI, lynxBaseUI2, i3);
                if (lynxBaseUI2.isFlatten()) {
                    m57048e(lynxBaseUI2);
                }
            }
        } else if (this.f67113e.size() > 0) {
            LynxBaseUI lynxBaseUI3 = this.f67113e.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI4 = this.f67113e.get(Integer.valueOf(i2));
            if (lynxBaseUI3 == null || lynxBaseUI4 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i2)));
            }
            String str = "UIOwner.insert." + lynxBaseUI3.mTagName + "." + lynxBaseUI4.mTagName;
            TraceEvent.m56864a(0, str);
            lynxBaseUI3.insertChild(lynxBaseUI4, i3);
            TraceEvent.m56869b(0, str);
        }
    }

    /* renamed from: a */
    public final void mo49076a(int i, int i2) {
        if (this.f67111c.f67077r) {
            if (this.f67113e.size() > 0) {
                LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
                LynxBaseUI lynxBaseUI2 = this.f67113e.get(Integer.valueOf(i2));
                if (lynxBaseUI == null || lynxBaseUI2 == null) {
                    throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i2)));
                }
                String str = "UIOwner.remove." + lynxBaseUI.mTagName + "." + lynxBaseUI2.mTagName;
                TraceEvent.m56864a(0, str);
                m57038a(lynxBaseUI2);
                lynxBaseUI.removeChild(lynxBaseUI2);
                m57047d(lynxBaseUI2);
                TraceEvent.m56869b(0, str);
            }
        } else if (this.f67113e.size() > 0) {
            LynxBaseUI lynxBaseUI3 = this.f67113e.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI4 = this.f67113e.get(Integer.valueOf(i2));
            if (lynxBaseUI3 == null || lynxBaseUI4 == null) {
                throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i2)));
            }
            String str2 = "UIOwner.remove." + lynxBaseUI3.mTagName + "." + lynxBaseUI4.mTagName;
            TraceEvent.m56864a(0, str2);
            lynxBaseUI3.removeChild(lynxBaseUI4);
            TraceEvent.m56869b(0, str2);
        }
    }

    /* renamed from: a */
    public final LynxBaseUI mo49072a(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI a;
        LynxBaseUI a2;
        if (!(lynxBaseUI == null || lynxBaseUI.mIdSelector == null || !lynxBaseUI.mIdSelector.equals(str))) {
            return lynxBaseUI;
        }
        if (!this.f67111c.f67077r) {
            if (lynxBaseUI instanceof LynxFlattenUI) {
                lynxBaseUI = lynxBaseUI.getParentBaseUI();
            }
            if (!(lynxBaseUI instanceof UIGroup)) {
                return null;
            }
            UIGroup uIGroup = (UIGroup) lynxBaseUI;
            for (int i = 0; i < uIGroup.getChildCount(); i++) {
                LynxBaseUI childAt = uIGroup.getChildAt(i);
                if (childAt.mIdSelector != null && childAt.mIdSelector.equals(str)) {
                    return childAt;
                }
                if (!(childAt.mTagName.equals("component") || !(childAt instanceof UIGroup) || (a = mo49072a(str, childAt)) == null)) {
                    return a;
                }
            }
        } else if (lynxBaseUI == null) {
            return null;
        } else {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                if (lynxBaseUI2.mIdSelector != null && lynxBaseUI2.mIdSelector.equals(str)) {
                    return lynxBaseUI2;
                }
                if (!(lynxBaseUI2.mTagName.equals("component") || (a2 = mo49072a(str, lynxBaseUI2)) == null)) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LynxBaseUI mo49073a(String str, boolean z) {
        LynxBaseUI a;
        LynxBaseUI b = m57044b() ? m57042b(str, z) : null;
        if (m57046c()) {
            b = m57036a(str);
        }
        if (b != null) {
            return b;
        }
        C28463a a2 = this.f67119k.mo48988a(str);
        if (z) {
            a = a2.mo16278b(this.f67111c);
        } else {
            a = a2.mo16275a(this.f67111c);
        }
        return a == null ? a2.mo16275a(this.f67111c) : a;
    }

    /* renamed from: a */
    public final void mo49078a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect, float[] fArr, int i14) {
        int i15;
        LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            lynxBaseUI.updateLayoutSize(i4, i5);
            C28422a transitionAnimator = lynxBaseUI.getTransitionAnimator();
            String str = "UIOwner.setLayoutData." + lynxBaseUI.mTagName;
            TraceEvent.m56864a(0, str);
            if (transitionAnimator != null && transitionAnimator.mo48866b() && !this.f67115g) {
                transitionAnimator.mo48863a(lynxBaseUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, 0, 0, 0, 0, rect);
                this.f67110b.invalidate();
            } else if (!lynxBaseUI.enableLayoutAnimation() || this.f67115g || (i == (i15 = this.f67109a) && (i != i15 || !this.f67116h))) {
                lynxBaseUI = lynxBaseUI;
                lynxBaseUI.setLayoutData(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
            } else {
                lynxBaseUI.getLayoutAnimator().mo48848a(lynxBaseUI instanceof UIShadowProxy ? (LynxUI) ((UIShadowProxy) lynxBaseUI).f67262a : (LynxUI) lynxBaseUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, 0, 0, 0, 0, rect);
                this.f67110b.invalidate();
            }
            lynxBaseUI.onAnimatedNodeReady();
            lynxBaseUI.updateSticky(fArr);
            lynxBaseUI.mMaxHeight = (float) i14;
            TraceEvent.m56869b(0, str);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo49079a(int i, String str, C28716v vVar) {
        if (str.equals("component") && vVar.mo49821a("ComponentID")) {
            this.f67114f.put(Integer.valueOf(vVar.mo49820a("ComponentID", -1)), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final Set<String> mo49075a() {
        HashSet hashSet = new HashSet(this.f67112d);
        this.f67112d.clear();
        return hashSet;
    }

    /* renamed from: b */
    private boolean m57044b() {
        C28855q qVar;
        TemplateAssembler templateAssembler = this.f67117i;
        if (templateAssembler == null || (qVar = templateAssembler.f66695j) == null) {
            return false;
        }
        return qVar.f68105e;
    }

    /* renamed from: c */
    private boolean m57046c() {
        C28855q qVar;
        TemplateAssembler templateAssembler = this.f67117i;
        if (templateAssembler == null || (qVar = templateAssembler.f66695j) == null) {
            return false;
        }
        return qVar.f68109i;
    }

    /* renamed from: c */
    public static LynxBaseUI m57045c(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIShadowProxy) {
            return ((UIShadowProxy) lynxBaseUI).f67262a;
        }
        return lynxBaseUI;
    }

    /* renamed from: a */
    private LynxBaseUI m57036a(String str) {
        if ("swiper".equals(str) || "x-swiper".equals(str)) {
            return new XSwiperUI(this.f67111c);
        }
        return null;
    }

    /* renamed from: d */
    private static void m57047d(LynxBaseUI lynxBaseUI) {
        lynxBaseUI.mBound = null;
        lynxBaseUI.setLeft(lynxBaseUI.getOriginLeft());
        lynxBaseUI.setTop(lynxBaseUI.getOriginTop());
    }

    /* renamed from: e */
    private void m57048e(LynxBaseUI lynxBaseUI) {
        int i = 0;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            int i2 = i + 1;
            m57039a(lynxBaseUI, lynxBaseUI2, i);
            if (lynxBaseUI2.isFlatten()) {
                m57048e(lynxBaseUI2);
            }
            i = i2;
        }
    }

    /* renamed from: a */
    static Map<String, C28723a> m57037a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        C0484a aVar = new C0484a();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            C28723a aVar2 = new C28723a(map.getString(StringSet.name), map.getString(StringSet.type), map.getString("function"));
            aVar.put(aVar2.f67733a, aVar2);
        }
        return aVar;
    }

    /* renamed from: b */
    public final LynxBaseUI mo49082b(int i) {
        if (i == -1) {
            return this.f67110b;
        }
        if (this.f67114f.containsKey(Integer.valueOf(i))) {
            i = this.f67114f.get(Integer.valueOf(i)).intValue();
        }
        return mo49070a(i);
    }

    /* renamed from: c */
    public final void mo49086c(int i) {
        TraceEvent.m56864a(0, "UIOwner.destroy");
        if (this.f67113e.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI == null) {
                TraceEvent.m56869b(0, "UIOwner.destroy");
                return;
            }
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            if (parentBaseUI == null) {
                TraceEvent.m56869b(0, "UIOwner.destroy");
                return;
            }
            parentBaseUI.removeChildFiber(lynxBaseUI);
            this.f67113e.remove(Integer.valueOf(i));
            lynxBaseUI.destroy();
            mo49085b(lynxBaseUI);
        }
        TraceEvent.m56869b(0, "UIOwner.destroy");
    }

    /* renamed from: a */
    public static void m57038a(LynxBaseUI lynxBaseUI) {
        UIGroup uIGroup = (UIGroup) lynxBaseUI.getDrawParent();
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        if (!(uIGroup == null || parentBaseUI == null)) {
            if (!lynxBaseUI.isFlatten()) {
                LynxBaseUI lynxBaseUI2 = lynxBaseUI.mPreviousDrawUI;
                LynxBaseUI lynxBaseUI3 = lynxBaseUI.mNextDrawUI;
                if (lynxBaseUI2 != null) {
                    lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                    }
                } else {
                    uIGroup.mDrawHead = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = null;
                    }
                }
                if (parentBaseUI.isFlatten()) {
                    uIGroup.removeView(lynxBaseUI);
                }
                lynxBaseUI.mNextDrawUI = null;
                lynxBaseUI.mPreviousDrawUI = null;
                lynxBaseUI.mDrawParent = null;
                return;
            }
            LynxBaseUI lynxBaseUI4 = lynxBaseUI;
            while (lynxBaseUI4.isFlatten() && !lynxBaseUI4.getChildren().isEmpty()) {
                lynxBaseUI4 = lynxBaseUI4.getChildAt(lynxBaseUI4.getChildren().size() - 1);
            }
            LynxBaseUI lynxBaseUI5 = lynxBaseUI.mPreviousDrawUI;
            if (lynxBaseUI5 != null) {
                lynxBaseUI5.mNextDrawUI = lynxBaseUI4.mNextDrawUI;
                if (lynxBaseUI4.mNextDrawUI != null) {
                    lynxBaseUI4.mNextDrawUI.mPreviousDrawUI = lynxBaseUI5;
                }
            } else {
                uIGroup.mDrawHead = lynxBaseUI4.mNextDrawUI;
                if (lynxBaseUI4.mNextDrawUI != null) {
                    lynxBaseUI4.mNextDrawUI.mPreviousDrawUI = null;
                }
            }
            lynxBaseUI.mPreviousDrawUI = null;
            for (LynxBaseUI lynxBaseUI6 = lynxBaseUI.mNextDrawUI; lynxBaseUI6 != lynxBaseUI4.mNextDrawUI; lynxBaseUI6 = lynxBaseUI6.mNextDrawUI) {
                lynxBaseUI6.mPreviousDrawUI.mNextDrawUI = null;
                lynxBaseUI6.mPreviousDrawUI = null;
                uIGroup.removeView(lynxBaseUI6);
                lynxBaseUI6.mDrawParent = null;
            }
            lynxBaseUI4.mNextDrawUI = null;
            lynxBaseUI.mDrawParent = null;
            parentBaseUI.invalidate();
        }
    }

    /* renamed from: a */
    public static boolean m57040a(C28716v vVar) {
        if (vVar.mo49821a("box-shadow") || vVar.mo49821a("outline-color") || vVar.mo49821a("outline-style") || vVar.mo49821a("outline-width")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final LynxBaseUI mo49070a(int i) {
        HashMap<Integer, LynxBaseUI> hashMap = this.f67113e;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: b */
    public final void mo49085b(LynxBaseUI lynxBaseUI) {
        for (int i = 0; i < lynxBaseUI.getChildren().size(); i++) {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i);
            childAt.destroy();
            this.f67113e.remove(Integer.valueOf(childAt.getSign()));
            if ((childAt instanceof UIGroup) || this.f67111c.f67077r) {
                mo49085b(childAt);
            }
        }
    }

    /* renamed from: b */
    private LynxBaseUI m57041b(LynxBaseUI lynxBaseUI, C28716v vVar) {
        return m57035a(lynxBaseUI, mo49074a(lynxBaseUI, vVar), vVar);
    }

    /* renamed from: b */
    private LynxBaseUI m57042b(String str, boolean z) {
        if (!"image".equals(str) && !"filter-image".equals(str)) {
            return null;
        }
        if (z) {
            return new LynxFlattenImageUI(this.f67111c);
        }
        return new LynxImageUI(this.f67111c);
    }

    /* renamed from: b */
    private void m57043b(int i, boolean z) {
        int i2;
        LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        C28716v vVar = new C28716v(lynxBaseUI.getProps());
        ArrayList<LynxBaseUI> arrayList = new ArrayList(lynxBaseUI.getChildren());
        String str = "UIOwner.updateFlatten." + lynxBaseUI.mTagName;
        TraceEvent.m56864a(0, str);
        int i3 = 0;
        if (parentBaseUI != null) {
            i2 = parentBaseUI.getIndex(lynxBaseUI);
            m57038a(lynxBaseUI);
            parentBaseUI.removeChild(lynxBaseUI);
        } else {
            i2 = 0;
        }
        if (!lynxBaseUI.isFlatten()) {
            for (LynxBaseUI lynxBaseUI2 : arrayList) {
                m57038a(lynxBaseUI2);
            }
        }
        for (int size = lynxBaseUI.getChildren().size() - 1; size >= 0; size--) {
            lynxBaseUI.removeChild(lynxBaseUI.getChildAt(size));
        }
        LynxBaseUI a = mo49073a(lynxBaseUI.mTagName, z);
        a.setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        m57041b(a, vVar);
        this.f67113e.put(Integer.valueOf(lynxBaseUI.getSign()), a);
        if (parentBaseUI != null) {
            parentBaseUI.insertChild(a, i2);
            m57039a(parentBaseUI, a, i2);
        }
        for (LynxBaseUI lynxBaseUI3 : arrayList) {
            m57047d(lynxBaseUI3);
            a.insertChild(lynxBaseUI3, i3);
            i3++;
        }
        m57048e(a);
        a.updateLayoutInfo(lynxBaseUI);
        a.copyAnimationRelatedPropFromOldUI(lynxBaseUI);
        a.invalidate();
        a.requestLayout();
        lynxBaseUI.destroy();
        TraceEvent.m56869b(0, str);
    }

    /* renamed from: b */
    public final LynxBaseUI mo49083b(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI b;
        LynxBaseUI b2;
        if (!(lynxBaseUI == null || lynxBaseUI.mRefId == null || !lynxBaseUI.mRefId.equals(str))) {
            return lynxBaseUI;
        }
        if (!this.f67111c.f67077r) {
            if (lynxBaseUI instanceof LynxFlattenUI) {
                lynxBaseUI = lynxBaseUI.getParentBaseUI();
            }
            if (!(lynxBaseUI instanceof UIGroup)) {
                return null;
            }
            UIGroup uIGroup = (UIGroup) lynxBaseUI;
            for (int i = 0; i < uIGroup.getChildCount(); i++) {
                LynxBaseUI childAt = uIGroup.getChildAt(i);
                if (childAt.mRefId != null && childAt.mRefId.equals(str)) {
                    return childAt;
                }
                if (!(childAt.mTagName.equals("component") || !(childAt instanceof UIGroup) || (b = mo49083b(str, childAt)) == null)) {
                    return b;
                }
            }
        } else if (lynxBaseUI == null) {
            return null;
        } else {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                if (lynxBaseUI2.mRefId != null && lynxBaseUI2.mRefId.equals(str)) {
                    return lynxBaseUI2;
                }
                if (!(lynxBaseUI2.mTagName.equals("component") || (b2 = mo49083b(str, lynxBaseUI2)) == null)) {
                    return b2;
                }
            }
        }
        return null;
    }

    public C28529q(AbstractC28520j jVar, C28477c cVar, UIBody.C28581a aVar) {
        this.f67111c = jVar;
        this.f67119k = cVar;
        UIBody uIBody = new UIBody(this.f67111c, aVar);
        this.f67110b = uIBody;
        this.f67111c.f67068i = uIBody;
        this.f67115g = true;
        this.f67116h = true;
    }

    /* renamed from: a */
    public static LynxBaseUI m57035a(LynxBaseUI lynxBaseUI, UIShadowProxy uIShadowProxy, C28716v vVar) {
        if (vVar != null) {
            lynxBaseUI.afterPropsUpdated(vVar);
            if (vVar.mo49821a("transition")) {
                lynxBaseUI.initTransitionAnimator(vVar.f67715a);
            }
            if (vVar.mo49821a("animation")) {
                lynxBaseUI.setAnimation(vVar.mo49825d("animation"));
            }
        }
        return uIShadowProxy != null ? uIShadowProxy : lynxBaseUI;
    }

    /* renamed from: a */
    private static void m57039a(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2, int i) {
        LynxBaseUI lynxBaseUI3;
        if (lynxBaseUI.isFlatten()) {
            lynxBaseUI3 = lynxBaseUI.getDrawParent();
        } else {
            lynxBaseUI3 = lynxBaseUI;
        }
        if (i == 0) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI3;
            if (!lynxBaseUI.isFlatten()) {
                lynxBaseUI = null;
            }
            lynxUI.insertDrawList(lynxBaseUI, lynxBaseUI2);
        } else {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i - 1);
            while (childAt.isFlatten() && !childAt.getChildren().isEmpty()) {
                childAt = childAt.getChildAt(childAt.getChildren().size() - 1);
            }
            ((LynxUI) lynxBaseUI3).insertDrawList(childAt, lynxBaseUI2);
        }
        if (!lynxBaseUI2.isFlatten()) {
            UIGroup uIGroup = (UIGroup) lynxBaseUI3;
            if (uIGroup.mIsInsertViewCalled) {
                uIGroup.insertView((LynxUI) lynxBaseUI2);
            }
        }
    }

    /* renamed from: b */
    public final void mo49084b(int i, int i2, int i3) {
        if (this.f67113e.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f67113e.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI2 = this.f67113e.get(Integer.valueOf(i2));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i2)));
            }
            lynxBaseUI.insertChildFiber(lynxBaseUI2, i3);
        }
    }
}
