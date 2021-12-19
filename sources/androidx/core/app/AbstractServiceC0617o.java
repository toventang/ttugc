package androidx.core.app;

import androidx.core.app.AbstractServiceC0583f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.app.o */
public abstract class AbstractServiceC0617o extends AbstractServiceC0583f {
    static {
        Covode.recordClassIndex(695);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbstractServiceC0583f.AbstractC0588e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
