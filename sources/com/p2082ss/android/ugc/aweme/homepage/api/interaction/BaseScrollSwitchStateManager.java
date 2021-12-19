package com.p2082ss.android.ugc.aweme.homepage.api.interaction;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34690j;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager */
public class BaseScrollSwitchStateManager extends AbstractC1174ac {

    /* renamed from: a */
    public final C52952a f121759a = new C52952a();

    /* renamed from: b */
    public final C1213t<List<C34690j>> f121760b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<Boolean> f121761c;

    /* renamed from: d */
    public final C1213t<String> f121762d;

    /* renamed from: e */
    public final C1213t<Integer> f121763e;

    /* renamed from: f */
    public final C1213t<C89386u<Integer, Float, Integer>> f121764f;

    /* renamed from: g */
    public final C33943c<String> f121765g;

    /* renamed from: h */
    public final C33943c<String> f121766h;

    /* renamed from: i */
    public C1213t<Fragment> f121767i;

    /* renamed from: j */
    public String f121768j;

    /* renamed from: k */
    public WeakReference<Fragment> f121769k;

    /* renamed from: l */
    public final C1213t<Integer> f121770l;

    /* renamed from: m */
    public final C1213t<Integer> f121771m;

    /* renamed from: n */
    public final C1213t<C89386u<Integer, Float, Integer>> f121772n;

    /* renamed from: o */
    public final C1213t<Boolean> f121773o;

    /* renamed from: p */
    private final C1213t<HashMap<Integer, C34685e>> f121774p = new C1213t<>();

    /* renamed from: q */
    private final C1213t<Boolean> f121775q;

    /* renamed from: r */
    private final C1213t<Integer> f121776r;

    /* renamed from: s */
    private final C1213t<EnumC52955c> f121777s;

    /* renamed from: t */
    private final C1213t<ScrollableViewPager.AbstractC34662a> f121778t;

    static {
        Covode.recordClassIndex(62475);
    }

    /* renamed from: a */
    public final void mo89344a(List<? extends C34690j> list) {
        C89219l.m154721d(list, "");
        this.f121760b.setValue(list);
    }

    /* renamed from: a */
    public final boolean mo89346a() {
        Boolean value = this.f121775q.getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        return value.booleanValue();
    }

    /* renamed from: a */
    public final void mo89345a(boolean z) {
        this.f121775q.setValue(Boolean.valueOf(z));
    }

    /* renamed from: c */
    private String mo89361c() {
        if (!this.f121759a.f121780a) {
            return "";
        }
        return mo89335a(this.f121759a.getValue().intValue());
    }

    /* renamed from: b */
    public final Fragment mo89347b() {
        Fragment value = this.f121767i.getValue();
        if (this.f121767i.getValue() == null) {
            return null;
        }
        return value;
    }

    public BaseScrollSwitchStateManager() {
        C1213t<Boolean> tVar = new C1213t<>();
        this.f121775q = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        this.f121761c = tVar2;
        this.f121762d = new C1213t<>();
        this.f121776r = new C1213t<>();
        this.f121763e = new C1213t<>();
        this.f121764f = new C1213t<>();
        this.f121777s = new C1213t<>();
        this.f121765g = new C33943c<>();
        this.f121766h = new C33943c<>();
        this.f121778t = new C1213t<>();
        this.f121767i = new C1213t<>();
        this.f121770l = new C1213t<>();
        this.f121771m = new C1213t<>();
        this.f121772n = new C1213t<>();
        this.f121773o = new C1213t<>();
        tVar.setValue(true);
        tVar2.setValue(true);
    }

    /* renamed from: c */
    public final void mo89352c(int i) {
        this.f121776r.setValue(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final C34685e mo89354d(String str) {
        C89219l.m154721d(str, "");
        return mo89348b(mo89351c(str));
    }

    /* renamed from: d */
    public final void mo89355d(int i) {
        this.f121763e.setValue(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo89358e(String str) {
        C89219l.m154721d(str, "");
        this.f121765g.setValue(str);
    }

    /* renamed from: a */
    public final void mo89338a(ScrollableViewPager.AbstractC34662a aVar) {
        C89219l.m154721d(aVar, "");
        this.f121778t.setValue(aVar);
    }

    /* renamed from: b */
    public final C34685e mo89348b(int i) {
        if (this.f121774p.getValue() == null) {
            return null;
        }
        HashMap<Integer, C34685e> value = this.f121774p.getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        if (value.isEmpty()) {
            return null;
        }
        HashMap<Integer, C34685e> value2 = this.f121774p.getValue();
        if (value2 == null) {
            C89219l.m154715b();
        }
        return value2.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final int mo89351c(String str) {
        if (this.f121760b.getValue() != null) {
            List<C34690j> value = this.f121760b.getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            int size = value.size();
            for (int i = 0; i < size; i++) {
                List<C34690j> value2 = this.f121760b.getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                if (TextUtils.equals(str, value2.get(i).f81948b)) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo89335a(int r3) {
        /*
            r2 = this;
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f121760b
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0010
            r0 = 0
        L_0x0009:
            java.lang.String r1 = ""
            if (r3 < 0) goto L_0x000f
            if (r3 < r0) goto L_0x002e
        L_0x000f:
            return r1
        L_0x0010:
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f121760b
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x002c
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0024:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0027:
            int r0 = r0.intValue()
            goto L_0x0009
        L_0x002c:
            r0 = 0
            goto L_0x0024
        L_0x002e:
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f121760b
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0039
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0039:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.base.ui.j r0 = (com.p2082ss.android.ugc.aweme.base.p2379ui.C34690j) r0
            java.lang.String r0 = r0.f81948b
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager.mo89335a(int):java.lang.String");
    }

    /* renamed from: b */
    public final boolean mo89350b(String str) {
        C89219l.m154721d(str, "");
        return TextUtils.equals(str, mo89361c());
    }

    /* renamed from: a */
    public final void mo89339a(AbstractC52954b bVar) {
        C89219l.m154721d(bVar, "");
        this.f121759a.mo89365a(bVar);
    }

    /* renamed from: a */
    public final void mo89340a(EnumC52955c cVar) {
        C89219l.m154721d(cVar, "");
        this.f121777s.setValue(cVar);
    }

    /* renamed from: a */
    public final void mo89341a(String str) {
        C89219l.m154721d(str, "");
        this.f121759a.mo89363a(mo89351c(str));
    }

    /* renamed from: a */
    public final void mo89343a(HashMap<Integer, C34685e> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.f121774p.setValue(hashMap);
    }

    /* renamed from: a */
    public final void mo89337a(AbstractC1204m mVar, AbstractC1214u<Boolean> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121775q.observe(mVar, uVar);
    }

    /* renamed from: b */
    public final void mo89349b(AbstractC1204m mVar, AbstractC1214u<Integer> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121776r.observe(mVar, uVar);
    }

    /* renamed from: e */
    public final void mo89357e(AbstractC1204m mVar, AbstractC1214u<ScrollableViewPager.AbstractC34662a> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121778t.observe(mVar, uVar);
    }

    /* renamed from: f */
    public final void mo89359f(AbstractC1204m mVar, AbstractC1214u<Integer> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121771m.observe(mVar, uVar);
    }

    /* renamed from: g */
    public final void mo89360g(AbstractC1204m mVar, AbstractC1214u<Integer> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121770l.observe(mVar, uVar);
    }

    /* renamed from: d */
    public final void mo89356d(AbstractC1204m mVar, AbstractC1214u<EnumC52955c> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121777s.observe(mVar, uVar);
    }

    /* renamed from: c */
    public final void mo89353c(AbstractC1204m mVar, AbstractC1214u<Integer> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        this.f121763e.observe(mVar, uVar);
    }

    /* renamed from: a */
    public final void mo89342a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f121759a.mo89364a(mo89351c(str), z);
    }

    /* renamed from: a */
    public final void mo89336a(int i, float f, int i2) {
        this.f121764f.setValue(new C89386u<>(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }
}
