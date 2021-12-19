package androidx.room;

import androidx.p054j.p055a.AbstractC1069f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.room.c */
public abstract class AbstractC1511c<T> extends AbstractC1542n {
    static {
        Covode.recordClassIndex(1650);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5057a(AbstractC1069f fVar, T t);

    public AbstractC1511c(AbstractC1533j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final void mo5059a(T t) {
        AbstractC1069f b = mo5109b();
        try {
            mo5057a(b, t);
            b.mo3810b();
        } finally {
            mo5108a(b);
        }
    }

    /* renamed from: a */
    public final void mo5058a(Iterable<T> iterable) {
        AbstractC1069f b = mo5109b();
        try {
            for (T t : iterable) {
                mo5057a(b, t);
                b.mo3810b();
            }
        } finally {
            mo5108a(b);
        }
    }
}
