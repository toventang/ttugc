package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import p4600h.p4620k.AbstractC89276b;
import p4600h.p4620k.AbstractC89284h;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: h.f.b.q */
public abstract class AbstractC89224q extends AbstractC89221n implements AbstractC89284h {
    static {
        Covode.recordClassIndex(105308);
    }

    /* access modifiers changed from: protected */
    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public AbstractC89276b computeReflected() {
        return this;
    }

    public AbstractC89224q() {
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public AbstractC89290k.AbstractC89291a getGetter() {
        return ((AbstractC89284h) getReflected()).getGetter();
    }

    @Override // p4600h.p4620k.AbstractC89284h
    public AbstractC89284h.AbstractC89285a getSetter() {
        return ((AbstractC89284h) getReflected()).getSetter();
    }

    public AbstractC89224q(Object obj) {
        super(obj);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public Object getDelegate(Object obj) {
        return ((AbstractC89284h) getReflected()).getDelegate(obj);
    }

    public AbstractC89224q(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
