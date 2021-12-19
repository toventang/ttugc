package android.p003ss.com.vboost.p005b;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.b.b */
public class C0011b implements AbstractC0012c {

    /* renamed from: a */
    private static final String f45a = C0011b.class.getSimpleName();

    /* renamed from: b */
    private static C0010a f46b = null;

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo13b() {
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo10a() {
        if (f46b != null) {
            C0010a.m13a(30000);
        }
    }

    static {
        Covode.recordClassIndex(14);
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo11a(long j) {
        if (f46b != null) {
            C0010a.m13a(j);
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo14b(long j) {
        if (f46b != null) {
            C0010a.m13a(j);
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: c */
    public final void mo15c(long j) {
        if (f46b != null) {
            C0010a.m13a(j);
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final boolean mo12a(Context context) {
        if (f46b == null) {
            f46b = new C0010a();
        }
        if (C0010a.f41a) {
            return true;
        }
        return false;
    }
}
