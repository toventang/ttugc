package androidx.core.app;

import androidx.core.app.AbstractServiceC0583f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.app.e */
public abstract class AbstractServiceC0582e extends AbstractServiceC0583f {
    static {
        Covode.recordClassIndex(660);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.core.app.AbstractServiceC0583f
    public AbstractServiceC0583f.AbstractC0588e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
