package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: f.a.e.j.a */
public final class C88898a<T> {

    /* renamed from: a */
    public final int f201907a = 4;

    /* renamed from: b */
    public final Object[] f201908b;

    /* renamed from: c */
    Object[] f201909c;

    /* renamed from: d */
    int f201910d;

    /* renamed from: f.a.e.j.a$a */
    public interface AbstractC88899a<T> extends AbstractC88438k<T> {
        static {
            Covode.recordClassIndex(104941);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        boolean mo7718a(T t);
    }

    static {
        Covode.recordClassIndex(104940);
    }

    public C88898a() {
        Object[] objArr = new Object[5];
        this.f201908b = objArr;
        this.f201909c = objArr;
    }

    /* renamed from: a */
    public final void mo143172a(AbstractC88899a<? super T> aVar) {
        int i = this.f201907a;
        for (Object[] objArr = this.f201908b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    continue;
                    break;
                } else if (aVar.mo7718a(obj)) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo143173a(T t) {
        int i = this.f201907a;
        int i2 = this.f201910d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f201909c[i] = objArr;
            this.f201909c = objArr;
            i2 = 0;
        }
        this.f201909c[i2] = t;
        this.f201910d = i2 + 1;
    }

    /* renamed from: a */
    public final <U> boolean mo143174a(AbstractC90214c<? super U> cVar) {
        Object[] objArr = this.f201908b;
        int i = this.f201907a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (EnumC88909j.acceptFull(objArr2, cVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }
}
