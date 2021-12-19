package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37446c;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b.C37450b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b.C37452c;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2510d.C37457a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.e.b */
public final class C37459b {

    /* renamed from: a */
    public static C37459b f88437a = new C37459b();

    /* renamed from: b */
    C37458a f88438b = new C37458a();

    /* renamed from: c */
    C37446c f88439c;

    /* renamed from: d */
    private C88411a f88440d = new C88411a();

    /* renamed from: e */
    private boolean f88441e;

    static {
        Covode.recordClassIndex(44844);
    }

    C37459b() {
    }

    /* renamed from: a */
    public final void mo65170a() {
        if (!this.f88441e) {
            this.f88441e = true;
            this.f88440d.mo142945a(m75549c());
        }
    }

    /* renamed from: b */
    public final void mo65172b() {
        this.f88441e = false;
        this.f88438b.mo65168a();
        C37452c.f88416a.f88417b.clear();
        this.f88440d.mo142944a();
    }

    /* renamed from: c */
    private AbstractC88412b m75549c() {
        return AbstractC88979t.m154284a(200, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143292d(new C37460c(this)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(C37461d.f88443a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C37462e.f88444a, C37463f.f88445a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65171a(View view, C37450b bVar) {
        EnumC37464g gVar;
        C37450b.C37451a aVar;
        if (C37457a.m75546a(view)) {
            C37458a aVar2 = this.f88438b;
            if (aVar2.f88433c.contains(view)) {
                gVar = EnumC37464g.PARENT_VIEW;
            } else if (aVar2.f88436f) {
                gVar = EnumC37464g.OBSTRUCTION_VIEW;
            } else {
                gVar = EnumC37464g.UNDERLYING_VIEW;
            }
            if (gVar != EnumC37464g.UNDERLYING_VIEW) {
                boolean z = true;
                int i = 0;
                if (this.f88438b.f88431a.containsKey(view)) {
                    this.f88438b.f88436f = true;
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    bVar.f88410d = new C37450b.C37451a(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    return;
                }
                if (gVar != EnumC37464g.PARENT_VIEW) {
                    if (!this.f88438b.f88432b.containsKey(view)) {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        aVar = new C37450b.C37451a(iArr2[0], iArr2[1], iArr2[0] + view.getWidth(), iArr2[1] + view.getHeight());
                        bVar.f88411e.add(aVar);
                    } else {
                        aVar = new C37450b.C37451a(0, 0, 0, 0);
                    }
                    if (bVar.f88410d != null && aVar.mo65164a(bVar.f88410d).mo65163a() == 0) {
                        int i2 = Build.VERSION.SDK_INT;
                        if ((view instanceof ViewGroup) && ((ViewGroup) view).getClipChildren()) {
                            return;
                        }
                    }
                }
                if (gVar != EnumC37464g.PARENT_VIEW) {
                    z = false;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (!z || Build.VERSION.SDK_INT < 21) {
                        while (i < viewGroup.getChildCount()) {
                            mo65171a(viewGroup.getChildAt(i), bVar);
                            i++;
                        }
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    while (i < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i);
                        ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                        }
                        arrayList.add(childAt);
                        i++;
                    }
                    ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                    Collections.sort(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                        while (it2.hasNext()) {
                            mo65171a((View) it2.next(), bVar);
                        }
                    }
                }
            }
        }
    }
}
