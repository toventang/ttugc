package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;

/* renamed from: f.a.e.d.f */
public final class C88482f<T> extends AbstractC88481e<T> {
    static {
        Covode.recordClassIndex(104524);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        if (this.f200722a == null) {
            this.f200723b = th;
        }
        countDown();
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (this.f200722a == null) {
            this.f200722a = t;
            this.f200724c.dispose();
            countDown();
        }
    }
}
