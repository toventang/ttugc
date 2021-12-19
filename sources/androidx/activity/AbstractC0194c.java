package androidx.activity;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.c */
public abstract class AbstractC0194c {

    /* renamed from: a */
    public boolean f512a;

    /* renamed from: b */
    CopyOnWriteArrayList<AbstractC0191a> f513b;

    static {
        Covode.recordClassIndex(223);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo376a(AbstractC0191a aVar) {
        this.f513b.remove(aVar);
    }
}
