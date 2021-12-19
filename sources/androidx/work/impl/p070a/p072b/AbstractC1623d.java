package androidx.work.impl.p070a.p072b;

import android.content.Context;
import androidx.work.AbstractC1600g;
import androidx.work.impl.p070a.AbstractC1608a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: androidx.work.impl.a.b.d */
public abstract class AbstractC1623d<T> {

    /* renamed from: b */
    private static final String f5258b = AbstractC1600g.m5318a("ConstraintTracker");

    /* renamed from: a */
    protected final Context f5259a;

    /* renamed from: c */
    private final Object f5260c = new Object();

    /* renamed from: d */
    private final Set<AbstractC1608a<T>> f5261d = new LinkedHashSet();

    /* renamed from: e */
    private T f5262e;

    /* renamed from: b */
    public abstract T mo5389b();

    /* renamed from: c */
    public abstract void mo5390c();

    /* renamed from: d */
    public abstract void mo5391d();

    static {
        Covode.recordClassIndex(1779);
    }

    /* renamed from: b */
    public final void mo5395b(AbstractC1608a<T> aVar) {
        synchronized (this.f5260c) {
            if (this.f5261d.remove(aVar) && this.f5261d.isEmpty()) {
                mo5391d();
            }
        }
    }

    AbstractC1623d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5259a = applicationContext;
    }

    /* renamed from: a */
    public final void mo5394a(T t) {
        synchronized (this.f5260c) {
            T t2 = this.f5262e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f5262e = t;
                for (AbstractC1608a aVar : new ArrayList(this.f5261d)) {
                    aVar.mo5377a(this.f5262e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5393a(AbstractC1608a<T> aVar) {
        synchronized (this.f5260c) {
            if (this.f5261d.add(aVar)) {
                if (this.f5261d.size() == 1) {
                    this.f5262e = mo5389b();
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f5262e});
                    mo5390c();
                }
                aVar.mo5377a(this.f5262e);
            }
        }
    }
}
