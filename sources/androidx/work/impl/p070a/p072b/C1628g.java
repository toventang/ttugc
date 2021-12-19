package androidx.work.impl.p070a.p072b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: androidx.work.impl.a.b.g */
public final class C1628g {

    /* renamed from: e */
    private static C1628g f5270e;

    /* renamed from: a */
    public C1619a f5271a;

    /* renamed from: b */
    public C1620b f5272b;

    /* renamed from: c */
    public C1624e f5273c;

    /* renamed from: d */
    public C1627f f5274d;

    static {
        Covode.recordClassIndex(1784);
    }

    /* renamed from: a */
    public static synchronized C1628g m5396a(Context context) {
        C1628g gVar;
        synchronized (C1628g.class) {
            if (f5270e == null) {
                f5270e = new C1628g(context);
            }
            gVar = f5270e;
        }
        return gVar;
    }

    private C1628g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5271a = new C1619a(applicationContext);
        this.f5272b = new C1620b(applicationContext);
        this.f5273c = new C1624e(applicationContext);
        this.f5274d = new C1627f(applicationContext);
    }
}
