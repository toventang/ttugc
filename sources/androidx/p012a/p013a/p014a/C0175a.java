package androidx.p012a.p013a.p014a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: androidx.a.a.a.a */
public class C0175a extends AbstractC0180c {

    /* renamed from: b */
    public static final Executor f466b = new Executor() {
        /* class androidx.p012a.p013a.p014a.C0175a.ExecutorC01761 */

        static {
            Covode.recordClassIndex(200);
        }

        public final void execute(Runnable runnable) {
            C0175a.m581a().mo337b(runnable);
        }
    };

    /* renamed from: c */
    public static final Executor f467c = new Executor() {
        /* class androidx.p012a.p013a.p014a.C0175a.ExecutorC01772 */

        static {
            Covode.recordClassIndex(201);
        }

        public final void execute(Runnable runnable) {
            C0175a.m581a().mo336a(runnable);
        }
    };

    /* renamed from: d */
    private static volatile C0175a f468d;

    /* renamed from: a */
    public AbstractC0180c f469a;

    /* renamed from: e */
    private AbstractC0180c f470e;

    private C0175a() {
        C0178b bVar = new C0178b();
        this.f470e = bVar;
        this.f469a = bVar;
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: b */
    public final boolean mo338b() {
        return this.f469a.mo338b();
    }

    static {
        Covode.recordClassIndex(199);
    }

    /* renamed from: a */
    public static C0175a m581a() {
        if (f468d != null) {
            return f468d;
        }
        synchronized (C0175a.class) {
            if (f468d == null) {
                f468d = new C0175a();
            }
        }
        return f468d;
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: a */
    public final void mo336a(Runnable runnable) {
        this.f469a.mo336a(runnable);
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: b */
    public final void mo337b(Runnable runnable) {
        this.f469a.mo337b(runnable);
    }
}
