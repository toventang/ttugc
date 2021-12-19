package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: dmt.av.video.g */
public final class C88271g<T> extends C1213t<T> {

    /* renamed from: a */
    public final ArrayList<T> f200304a = new ArrayList<>();

    static {
        Covode.recordClassIndex(104306);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        super.setValue(t);
        this.f200304a.add(t);
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(AbstractC1204m mVar, final AbstractC1214u<? super T> uVar) {
        super.observe(mVar, new AbstractC1214u<T>() {
            /* class dmt.p4542av.video.C88271g.C882721 */

            /* renamed from: a */
            boolean f200305a;

            static {
                Covode.recordClassIndex(104307);
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final void onChanged(T t) {
                if (this.f200305a || C88271g.this.f200304a.isEmpty()) {
                    uVar.onChanged(t);
                } else {
                    for (int i = 0; i < C88271g.this.f200304a.size(); i++) {
                        uVar.onChanged(C88271g.this.f200304a.get(i));
                    }
                }
                this.f200305a = true;
            }
        });
    }
}
