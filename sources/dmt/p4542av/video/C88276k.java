package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.k */
public final class C88276k<T> extends C1213t<T> {

    /* renamed from: a */
    T f200309a;

    static {
        Covode.recordClassIndex(104311);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        super.setValue(t);
        this.f200309a = t;
    }

    /* renamed from: a */
    public final void mo142776a(AbstractC1204m mVar, AbstractC88248d<T> dVar) {
        super.observe(mVar, new C88277l(this, dVar));
    }
}
