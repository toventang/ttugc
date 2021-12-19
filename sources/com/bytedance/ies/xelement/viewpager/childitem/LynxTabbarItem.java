package com.bytedance.ies.xelement.viewpager.childitem;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.C19446a;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28532r;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import java.util.ArrayList;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxTabbarItem extends UIGroup<C28698a> {

    /* renamed from: e */
    public static final C19460a f46117e = new C19460a((byte) 0);

    /* renamed from: a */
    public boolean f46118a;

    /* renamed from: b */
    public boolean f46119b;

    /* renamed from: c */
    public Integer f46120c;

    /* renamed from: d */
    public TabLayout f46121d;

    static {
        Covode.recordClassIndex(22298);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -906021636 && nextKey.equals("select")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setSelect(z);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem$a */
    public static final class C19460a {
        static {
            Covode.recordClassIndex(22301);
        }

        private C19460a() {
        }

        public /* synthetic */ C19460a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem$b */
    static final class C19461b implements AbstractC28532r {

        /* renamed from: a */
        final /* synthetic */ LynxTabbarItem f46122a;

        static {
            Covode.recordClassIndex(22302);
        }

        C19461b(LynxTabbarItem lynxTabbarItem) {
            this.f46122a = lynxTabbarItem;
        }

        @Override // com.lynx.tasm.behavior.AbstractC28532r
        /* renamed from: a */
        public final void mo31123a() {
            if (this.f46122a.f46118a) {
                this.f46122a.f46118a = false;
                this.f46122a.mo31121a();
            }
        }
    }

    /* renamed from: a */
    public final void mo31121a() {
        TabLayout tabLayout;
        Integer num;
        TabLayout.C26722f tabAt;
        if (this.f46119b && (tabLayout = this.f46121d) != null && (num = this.f46120c) != null && (tabAt = tabLayout.getTabAt(num.intValue())) != null) {
            tabAt.mo44370a();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        View view = this.mView;
        C89219l.m154709a((Object) view, "");
        ViewParent parent = ((C28698a) view).getParent();
        if (!(parent instanceof C19446a)) {
            parent = null;
        }
        C19446a aVar = (C19446a) parent;
        if (aVar != null) {
            aVar.setOverflow(getOverflow());
        }
    }

    public LynxTabbarItem(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "select")
    public final void setSelect(boolean z) {
        if (this.f46119b != z) {
            this.f46118a = true;
            this.f46119b = z;
            mo31121a();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        AbstractC28520j jVar = this.mContext;
        if (jVar != null) {
            C19461b bVar = new C19461b(this);
            if (jVar.f67080u == null) {
                jVar.f67080u = new ArrayList();
            }
            jVar.f67080u.add(bVar);
            return new C28698a(context);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
