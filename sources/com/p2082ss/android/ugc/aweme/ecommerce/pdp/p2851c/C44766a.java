package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43329l;
import com.p2082ss.android.ugc.aweme.p2725d.C40909a;
import com.p2082ss.android.ugc.aweme.p2725d.C40916g;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.c.a */
public final class C44766a extends C40916g {

    /* renamed from: e */
    public static final WeakHashMap<Context, C44766a> f104446e = new WeakHashMap<>();

    /* renamed from: f */
    public int f104447f;

    static {
        Covode.recordClassIndex(53152);
    }

    /* renamed from: b */
    public final void mo75886b() {
        C40909a.f95720a.post(new RunnableC44767b(this));
    }

    private C44766a(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public static C44766a m87493a(Activity activity) {
        WeakHashMap<Context, C44766a> weakHashMap = f104446e;
        C44766a aVar = weakHashMap.get(activity);
        if (aVar == null) {
            aVar = new C44766a(activity);
            weakHashMap.put(activity, aVar);
        }
        aVar.f104447f++;
        return aVar;
    }

    /* renamed from: a */
    public static View m87492a(Context context, int i, ViewGroup viewGroup, boolean z) {
        View a;
        MethodCollector.m26663i(7330);
        C44766a aVar = f104446e.get(context);
        if (!C43329l.m86448a() || aVar == null) {
            a = C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, z);
        } else {
            a = aVar.mo70113a(i);
            if (z) {
                viewGroup.addView(a);
            }
        }
        MethodCollector.m26664o(7330);
        return a;
    }
}
