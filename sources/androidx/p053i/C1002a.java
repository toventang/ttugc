package androidx.p053i;

import androidx.p012a.p013a.p014a.C0175a;
import androidx.p053i.AbstractC1036i;
import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.C1415b;
import androidx.recyclerview.widget.C1416c;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: androidx.i.a */
public final class C1002a<T> {

    /* renamed from: a */
    final AbstractC1485u f3552a;

    /* renamed from: b */
    final C1416c<T> f3553b;

    /* renamed from: c */
    Executor f3554c = C0175a.f466b;

    /* renamed from: d */
    AbstractC1006a<T> f3555d;

    /* renamed from: e */
    boolean f3556e;

    /* renamed from: f */
    AbstractC1036i<T> f3557f;

    /* renamed from: g */
    AbstractC1036i<T> f3558g;

    /* renamed from: h */
    int f3559h;

    /* renamed from: i */
    AbstractC1036i.AbstractC1041c f3560i = new AbstractC1036i.AbstractC1041c() {
        /* class androidx.p053i.C1002a.C10031 */

        static {
            Covode.recordClassIndex(1096);
        }

        @Override // androidx.p053i.AbstractC1036i.AbstractC1041c
        /* renamed from: a */
        public final void mo3698a(int i, int i2) {
            C1002a.this.f3552a.mo3773a(i, i2);
        }

        @Override // androidx.p053i.AbstractC1036i.AbstractC1041c
        /* renamed from: b */
        public final void mo3699b(int i, int i2) {
            C1002a.this.f3552a.mo3774a(i, i2, null);
        }
    };

    /* renamed from: androidx.i.a$a */
    interface AbstractC1006a<T> {
        static {
            Covode.recordClassIndex(1099);
        }
    }

    static {
        Covode.recordClassIndex(1095);
    }

    /* renamed from: a */
    public final int mo3697a() {
        AbstractC1036i<T> iVar = this.f3557f;
        if (iVar != null) {
            return iVar.size();
        }
        AbstractC1036i<T> iVar2 = this.f3558g;
        if (iVar2 == null) {
            return 0;
        }
        return iVar2.size();
    }

    public C1002a(RecyclerView.AbstractC1350a aVar, C1445j.AbstractC1451e<T> eVar) {
        this.f3552a = new C1415b(aVar);
        this.f3553b = new C1416c.C1417a(eVar).mo4887a();
    }
}
