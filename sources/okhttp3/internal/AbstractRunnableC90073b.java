package okhttp3.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: okhttp3.internal.b */
public abstract class AbstractRunnableC90073b implements Runnable {

    /* renamed from: d */
    protected final String f204395d;

    static {
        Covode.recordClassIndex(106245);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo144717b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f204395d);
        try {
            mo144717b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public AbstractRunnableC90073b(String str, Object... objArr) {
        this.f204395d = C90084c.m156407a(str, objArr);
    }
}
