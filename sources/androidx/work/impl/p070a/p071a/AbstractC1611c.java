package androidx.work.impl.p070a.p071a;

import androidx.work.impl.p070a.AbstractC1608a;
import androidx.work.impl.p070a.p072b.AbstractC1623d;
import androidx.work.impl.p073b.C1642g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.a.c */
public abstract class AbstractC1611c<T> implements AbstractC1608a<T> {

    /* renamed from: a */
    public final List<String> f5243a = new ArrayList();

    /* renamed from: b */
    public T f5244b;

    /* renamed from: c */
    public AbstractC1623d<T> f5245c;

    /* renamed from: d */
    private AbstractC1612a f5246d;

    /* renamed from: androidx.work.impl.a.a.c$a */
    public interface AbstractC1612a {
        static {
            Covode.recordClassIndex(1768);
        }

        /* renamed from: b */
        void mo5382b(List<String> list);

        /* renamed from: c */
        void mo5383c(List<String> list);
    }

    static {
        Covode.recordClassIndex(1767);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo5378a(C1642g gVar);

    /* renamed from: b */
    public abstract boolean mo5379b(T t);

    /* renamed from: a */
    private void m5342a() {
        if (!this.f5243a.isEmpty() && this.f5246d != null) {
            T t = this.f5244b;
            if (t == null || mo5379b(t)) {
                this.f5246d.mo5383c(this.f5243a);
            } else {
                this.f5246d.mo5382b(this.f5243a);
            }
        }
    }

    @Override // androidx.work.impl.p070a.AbstractC1608a
    /* renamed from: a */
    public final void mo5377a(T t) {
        this.f5244b = t;
        m5342a();
    }

    AbstractC1611c(AbstractC1623d<T> dVar) {
        this.f5245c = dVar;
    }

    /* renamed from: a */
    public final void mo5380a(AbstractC1612a aVar) {
        if (this.f5246d != aVar) {
            this.f5246d = aVar;
            m5342a();
        }
    }

    /* renamed from: a */
    public final void mo5381a(List<C1642g> list) {
        this.f5243a.clear();
        for (C1642g gVar : list) {
            if (mo5378a(gVar)) {
                this.f5243a.add(gVar.f5306a);
            }
        }
        if (this.f5243a.isEmpty()) {
            this.f5245c.mo5395b(this);
        } else {
            this.f5245c.mo5393a((AbstractC1608a) this);
        }
        m5342a();
    }
}
