package com.p084a.p088b;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.p091c.AbstractC1872a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61339b;

/* renamed from: com.a.b.a */
public class C1862a {

    /* renamed from: a */
    public static AbstractC1872a f5671a;

    /* renamed from: b */
    public static boolean f5672b = true;

    static {
        Covode.recordClassIndex(2032);
    }

    /* renamed from: a */
    public static View m6031a(Context context, int i) {
        MethodCollector.m26663i(7536);
        View a = m6032a(context, i, new FrameLayout(context), false);
        MethodCollector.m26664o(7536);
        return a;
    }

    /* renamed from: a */
    public static View m6032a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return m6033a(context, i, viewGroup, z, -1);
    }

    /* renamed from: a */
    public static View m6033a(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        return m6034b(context, i, viewGroup, z, i2);
    }

    /* renamed from: b */
    private static View m6034b(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        View a;
        if (!f5672b) {
            return C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, z);
        }
        AbstractC1876e eVar = C1877f.f5698a.get(i);
        if (eVar == null) {
            Integer.toHexString(i);
            if (f5671a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, z);
        }
        try {
            if (!C61339b.m111037a()) {
                a = C1877f.m6057a(eVar, context, viewGroup, z);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a = C1877f.m6057a(eVar, context, viewGroup, z);
                C61339b.m111036a("x2c", i, SystemClock.elapsedRealtime() - elapsedRealtime, context);
            }
            if (f5671a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return a;
        } catch (Throwable th) {
            AbstractC1872a aVar = f5671a;
            if (aVar != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
                aVar.mo5578a(th);
            }
            if (!C1878g.f5699a) {
                return C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, z);
            }
            th.getMessage();
            throw new IllegalStateException(th);
        }
    }
}
