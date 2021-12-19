package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;

/* renamed from: com.facebook.imagepipeline.n.b */
public abstract class AbstractC24574b<T> implements AbstractC24596k<T> {

    /* renamed from: a */
    private boolean f58390a;

    static {
        Covode.recordClassIndex(28718);
    }

    /* renamed from: a */
    public static boolean m46992a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: a */
    public static boolean m46993a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public static boolean m46995c(int i) {
        return (i & 10) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40276a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40277a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40278a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40279a(Throwable th);

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24596k
    /* renamed from: b */
    public final synchronized void mo40432b() {
        if (!this.f58390a) {
            this.f58390a = true;
            try {
                mo40276a();
            } catch (Exception e) {
                m46991a(e);
            }
        }
    }

    /* renamed from: a */
    private void m46991a(Exception exc) {
        C24099a.m45655c(getClass(), "unhandled exception", exc);
    }

    /* renamed from: b */
    public static boolean m46994b(int i) {
        if (!m46992a(i)) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24596k
    /* renamed from: b */
    public final synchronized void mo40433b(float f) {
        if (!this.f58390a) {
            try {
                mo40277a(f);
            } catch (Exception e) {
                m46991a(e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24596k
    /* renamed from: b */
    public final synchronized void mo40435b(Throwable th) {
        if (!this.f58390a) {
            this.f58390a = true;
            try {
                mo40279a(th);
            } catch (Exception e) {
                m46991a(e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24596k
    /* renamed from: b */
    public final synchronized void mo40434b(T t, int i) {
        if (!this.f58390a) {
            this.f58390a = m46992a(i);
            try {
                mo40278a(t, i);
            } catch (Exception e) {
                m46991a(e);
            }
        }
    }
}
