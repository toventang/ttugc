package com.google.android.material.p1951a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.a.h */
public class C26562h {

    /* renamed from: a */
    private final C0497g<String, C26563i> f62668a = new C0497g<>();

    static {
        Covode.recordClassIndex(31993);
    }

    public int hashCode() {
        return this.f62668a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f62668a + "}\n";
    }

    /* renamed from: a */
    public final long mo43705a() {
        int size = this.f62668a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C26563i c = this.f62668a.mo2163c(i);
            j = Math.max(j, c.f62669a + c.f62670b);
        }
        return j;
    }

    /* renamed from: a */
    private static C26562h m52583a(List<Animator> list) {
        C26562h hVar = new C26562h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m52584a(hVar, list.get(i));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f62668a.equals(((C26562h) obj).f62668a);
    }

    /* renamed from: a */
    public final C26563i mo43706a(String str) {
        if (this.f62668a.get(str) != null) {
            return this.f62668a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private void m52585a(String str, C26563i iVar) {
        this.f62668a.put(str, iVar);
    }

    /* renamed from: a */
    public static C26562h m52582a(Context context, int i) {
        MethodCollector.m26663i(10982);
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                C26562h a = m52583a(((AnimatorSet) loadAnimator).getChildAnimations());
                MethodCollector.m26664o(10982);
                return a;
            } else if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                C26562h a2 = m52583a(arrayList);
                MethodCollector.m26664o(10982);
                return a2;
            } else {
                MethodCollector.m26664o(10982);
                return null;
            }
        } catch (Exception unused) {
            Integer.toHexString(i);
            MethodCollector.m26664o(10982);
            return null;
        }
    }

    /* renamed from: a */
    private static void m52584a(C26562h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.m52585a(objectAnimator.getPropertyName(), C26563i.m52588a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
    }
}
