package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import java.util.EnumMap;
import java.util.Map;
import java.util.Stack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.m */
public final class C10925m {

    /* renamed from: a */
    static final Map<EnumC5854q, Stack<View>> f26248a = new EnumMap(EnumC5854q.class);

    /* renamed from: b */
    static C0464a f26249b;

    /* renamed from: c */
    static LayoutInflater f26250c;

    /* renamed from: d */
    public static final C10925m f26251d = new C10925m();

    private C10925m() {
    }

    static {
        Covode.recordClassIndex(12533);
    }

    /* renamed from: a */
    static void m19554a(EnumC5854q qVar) {
        C0464a aVar = f26249b;
        if (aVar != null) {
            aVar.mo2025a(qVar.getLayoutId(), null, new C10926a(qVar));
        }
    }

    /* renamed from: a */
    public static View m19553a(Context context, EnumC5854q qVar) {
        boolean z;
        C89219l.m154721d(qVar, "");
        Stack<View> stack = f26248a.get(qVar);
        if (stack == null || stack.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        MutableContextWrapper mutableContextWrapper = null;
        if (z) {
            LayoutInflater layoutInflater = f26250c;
            if (layoutInflater != null) {
                return C1764a.m5927a(layoutInflater, qVar.getLayoutId(), null, false);
            }
            return null;
        }
        View pop = stack.pop();
        C89219l.m154716b(pop, "");
        Context context2 = pop.getContext();
        if (context2 instanceof MutableContextWrapper) {
            mutableContextWrapper = context2;
        }
        MutableContextWrapper mutableContextWrapper2 = mutableContextWrapper;
        if (mutableContextWrapper2 != null) {
            mutableContextWrapper2.setBaseContext(context);
        }
        if (C11279p.m20028e()) {
            m19554a(qVar);
        }
        return pop;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.toolbar.m$a */
    public static final class C10926a implements C0464a.AbstractC0469d {

        /* renamed from: a */
        final /* synthetic */ EnumC5854q f26252a;

        static {
            Covode.recordClassIndex(12534);
        }

        C10926a(EnumC5854q qVar) {
            this.f26252a = qVar;
        }

        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            Stack<View> stack = C10925m.f26248a.get(this.f26252a);
            if (stack != null) {
                stack.push(view);
            }
        }
    }
}
