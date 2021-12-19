package com.bytedance.analytics.page;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.analytics.C2576a;
import com.bytedance.analytics.p124a.C2580a;
import com.bytedance.analytics.p124a.C2581b;
import com.bytedance.analytics.p125b.C2593a;
import com.bytedance.analytics.p125b.C2594b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.p4601a.C89062h;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.page.g */
public final class C2603g {

    /* renamed from: a */
    public static final C2603g f7842a = new C2603g();

    /* renamed from: b */
    public static C2602f f7843b;

    /* renamed from: c */
    static final Map<String, C2602f> f7844c = new LinkedHashMap();

    /* renamed from: d */
    public static final CopyOnWriteArraySet<Object> f7845d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    static final Map<String, C2602f> f7846e = new HashMap();

    /* renamed from: f */
    private static final Handler f7847f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private static final Map<String, C2596a> f7848g = new HashMap();

    /* renamed from: com.bytedance.analytics.page.g$a */
    public /* synthetic */ class C2604a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7849a;

        static {
            Covode.recordClassIndex(2992);
            int[] iArr = new int[C2576a.EnumC2579c.values().length];
            iArr[C2576a.EnumC2579c.Activity.ordinal()] = 1;
            iArr[C2576a.EnumC2579c.Fragment.ordinal()] = 2;
            f7849a = iArr;
        }
    }

    private C2603g() {
    }

    static {
        Covode.recordClassIndex(2991);
    }

    /* renamed from: a */
    static void m7552a(C2602f fVar) {
        C2602f fVar2 = fVar.f7823c;
        C2602f fVar3 = fVar.f7841u;
        if (fVar3 != null) {
            fVar3.f7823c = fVar2;
        }
        if (fVar2 != null) {
            fVar2.f7841u = fVar3;
        }
        f7844c.remove(fVar.f7821a);
    }

    /* renamed from: b */
    private static void m7553b(C2602f fVar) {
        fVar.f7833m = System.currentTimeMillis();
        Iterator<Object> it = f7845d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    private static void m7554c(C2602f fVar) {
        if (fVar.f7833m != 0) {
            fVar.f7834n = System.currentTimeMillis() - fVar.f7833m;
        }
        fVar.f7833m = 0;
        C2594b.m7540a(fVar);
        C2593a.m7538a(fVar);
        C2581b.m7531b();
    }

    /* renamed from: a */
    public static C2602f m7550a(String str) {
        String str2;
        C89219l.m154721d(str, "");
        C2602f fVar = f7844c.get(str);
        if (fVar == null) {
            return null;
        }
        m7552a(fVar);
        if (fVar == f7843b) {
            m7554c(fVar);
            C2602f fVar2 = fVar.f7823c;
            if (fVar2 == null) {
                f7843b = null;
            } else {
                C89062h<C2602f> hVar = fVar.f7825e;
                hVar.add(fVar);
                fVar2.f7825e.clear();
                fVar2.mo7090a(hVar);
                fVar2.f7835o = true;
                C2602f fVar3 = f7843b;
                if (fVar3 == null) {
                    str2 = null;
                } else {
                    str2 = fVar3.f7836p;
                }
                fVar2.f7839s = str2;
                fVar2.f7841u = null;
                f7843b = fVar2;
            }
            C2602f fVar4 = f7843b;
            if (fVar4 != null) {
                m7553b(fVar4);
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public static void m7551a(C2576a aVar) {
        ActivityC0945e activity;
        C2602f fVar;
        Fragment fragment;
        boolean z;
        C2602f fVar2;
        C89062h<C2602f> hVar;
        C2596a aVar2;
        C2602f next;
        C89062h<C2602f> hVar2;
        C2596a aVar3;
        C89219l.m154721d(aVar, "");
        C2602f fVar3 = f7844c.get(aVar.f7762b);
        C2602f fVar4 = f7843b;
        if (fVar4 == null || fVar3 != fVar4) {
            String str = null;
            boolean z2 = false;
            if (aVar.f7764d == C2576a.EnumC2579c.Fragment) {
                Fragment fragment2 = aVar.f7765e;
                if (fragment2 != null) {
                    if (aVar.f7769i > C2580a.f7783f) {
                        C2593a.m7539a("retryLimit", "fragmentRetry");
                        return;
                    }
                    aVar.f7769i++;
                    if (fragment2.getView() == null || fragment2.getActivity() == null) {
                        f7847f.postDelayed(new RunnableC2605h(aVar), 50);
                        return;
                    }
                    View view = fragment2.getView();
                    if (view != null && !view.isShown()) {
                        f7847f.postDelayed(new RunnableC2606i(aVar), 50);
                        return;
                    }
                }
                if (aVar.f7764d == C2576a.EnumC2579c.Fragment && (fragment = aVar.f7765e) != null) {
                    boolean z3 = false;
                    for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                        if (parentFragment instanceof AbstractC2597b) {
                            next = f7844c.get(((AbstractC2597b) parentFragment).ag_());
                            if (next == null) {
                            }
                        } else {
                            Iterator<C2602f> it = f7844c.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                next = it.next();
                                if (next.f7827g && next.f7830j == parentFragment) {
                                    break;
                                }
                            }
                        }
                        m7552a(next);
                        if (C89219l.m154714a(next, f7843b)) {
                            C2602f fVar5 = next.f7823c;
                            f7843b = fVar5;
                            if (!(fVar5 == null || (aVar3 = next.f7824d) == null)) {
                                f7848g.put(fVar5.f7821a, aVar3);
                            }
                        }
                        C2602f fVar6 = f7843b;
                        if (!(fVar6 == null || (hVar2 = fVar6.f7825e) == null)) {
                            hVar2.remove(next);
                        }
                        z3 = true;
                    }
                    ActivityC0945e activity2 = fragment.getActivity();
                    if (activity2 != null) {
                        if (activity2 instanceof AbstractC2597b) {
                            fVar2 = f7844c.get(((AbstractC2597b) activity2).ag_());
                        } else {
                            AbstractC2598c<Activity> cVar = C2601e.f7820b;
                            if (cVar != null) {
                                C2576a a = cVar.mo7086a(activity2);
                                C89219l.m154721d(a, "");
                                fVar2 = f7844c.get(a.f7762b);
                            }
                        }
                        if (fVar2 != null) {
                            f7846e.put(String.valueOf(activity2.hashCode()), fVar2);
                            m7552a(fVar2);
                            if (C89219l.m154714a(fVar2, f7843b)) {
                                C2602f fVar7 = fVar2.f7823c;
                                f7843b = fVar7;
                                if (!(fVar7 == null || (aVar2 = fVar2.f7824d) == null)) {
                                    f7848g.put(fVar7.f7821a, aVar2);
                                }
                            }
                            C2602f fVar8 = f7843b;
                            if (!(fVar8 == null || (hVar = fVar8.f7825e) == null)) {
                                hVar.remove(fVar2);
                            }
                            z = true;
                            if (z3 || z) {
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                    z2 = true;
                }
            }
            C2602f fVar9 = f7843b;
            if (fVar9 != null && !z2) {
                m7554c(fVar9);
            }
            C2602f fVar10 = f7843b;
            Map<String, C2596a> map = f7848g;
            String str2 = fVar10 == null ? null : fVar10.f7821a;
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            Object remove = C89206ad.m154686h(map).remove(str2);
            if (aVar.f7766f && (fVar = f7843b) != null && fVar.f7831k && TextUtils.equals(fVar.f7832l, aVar.f7767g)) {
                fVar10 = fVar.f7823c;
                remove = fVar.f7824d;
            }
            if (fVar3 == null) {
                fVar3 = new C2602f(aVar.f7762b, aVar.f7763c, fVar10, (C2596a) remove);
                int i = C2604a.f7849a[aVar.f7764d.ordinal()];
                if (i == 1) {
                    fVar3.f7826f = true;
                } else if (i != 2) {
                    fVar3.f7828h = true;
                } else {
                    fVar3.f7827g = true;
                    fVar3.f7831k = aVar.f7766f;
                    fVar3.f7832l = aVar.f7767g;
                    fVar3.f7830j = aVar.f7765e;
                    Fragment fragment3 = aVar.f7765e;
                    if (!(fragment3 == null || (activity = fragment3.getActivity()) == null || !TextUtils.isEmpty(fVar3.f7829i))) {
                        fVar3.f7829i = String.valueOf(activity.hashCode());
                    }
                }
            } else {
                C2602f fVar11 = fVar3;
                if (!fVar11.f7827g || !fVar11.f7831k) {
                    for (C2602f fVar12 = fVar11.f7841u; fVar12 != null; fVar12 = fVar12.f7841u) {
                        m7552a(fVar12);
                    }
                    C2593a.m7539a("pushNonTop", C89219l.m154704a("name:", (Object) fVar11.f7822b));
                } else {
                    C2602f fVar13 = fVar11.f7823c;
                    if (fVar13 != null) {
                        fVar13.f7841u = fVar11;
                    }
                }
                fVar11.f7835o = true;
                C2602f fVar14 = f7843b;
                if (fVar14 != null) {
                    str = fVar14.f7836p;
                }
                fVar11.f7839s = str;
            }
            C2602f fVar15 = fVar3;
            if (fVar15.f7827g) {
                fVar15.f7830j = aVar.f7765e;
            }
            fVar15.f7825e.clear();
            C2602f fVar16 = f7843b;
            if (fVar16 != null) {
                fVar15.mo7090a(fVar16.f7825e);
                fVar15.mo7089a(fVar16);
            }
            f7843b = fVar15;
            m7553b(fVar15);
            f7844c.put(fVar15.f7821a, fVar3);
        }
    }
}
