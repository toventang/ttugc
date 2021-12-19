package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.AbstractC1600g;
import androidx.work.impl.p070a.C1630d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.background.systemalarm.c */
final class C1665c {

    /* renamed from: e */
    private static final String f5369e = AbstractC1600g.m5318a("ConstraintsCmdHandler");

    /* renamed from: a */
    final Context f5370a;

    /* renamed from: b */
    final int f5371b;

    /* renamed from: c */
    final C1667e f5372c;

    /* renamed from: d */
    final C1630d f5373d;

    static {
        Covode.recordClassIndex(1829);
    }

    C1665c(Context context, int i, C1667e eVar) {
        this.f5370a = context;
        this.f5371b = i;
        this.f5372c = eVar;
        this.f5373d = new C1630d(context, null);
    }
}
