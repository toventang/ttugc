package kotlinx.coroutines.android;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89534ax;
import kotlinx.coroutines.AbstractC89548bh;
import kotlinx.coroutines.AbstractC89587ci;

/* renamed from: kotlinx.coroutines.android.b */
public abstract class AbstractC89522b extends AbstractC89587ci implements AbstractC89534ax {
    static {
        Covode.recordClassIndex(105613);
    }

    private AbstractC89522b() {
    }

    public /* synthetic */ AbstractC89522b(byte b) {
        this();
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        return AbstractC89534ax.C89535a.m155463a(j, runnable);
    }
}
