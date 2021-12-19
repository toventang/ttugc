package androidx.lifecycle;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: androidx.lifecycle.y */
public abstract class AbstractC1223y {

    /* renamed from: a */
    private final EnumC1226c f4019a;

    /* renamed from: androidx.lifecycle.y$c */
    public enum EnumC1226c {
        Activity,
        Fragment;

        static {
            Covode.recordClassIndex(1333);
        }
    }

    static {
        Covode.recordClassIndex(1330);
    }

    /* renamed from: androidx.lifecycle.y$a */
    public static final class C1224a extends AbstractC1223y {

        /* renamed from: a */
        public final WeakReference<ActivityC0945e> f4020a;

        /* renamed from: b */
        private final EnumC1226c f4021b;

        static {
            Covode.recordClassIndex(1331);
        }

        public final int hashCode() {
            int i;
            EnumC1226c cVar = this.f4021b;
            int i2 = 0;
            if (cVar != null) {
                i = cVar.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            WeakReference<ActivityC0945e> weakReference = this.f4020a;
            if (weakReference != null) {
                i2 = weakReference.hashCode();
            }
            return i3 + i2;
        }

        public final String toString() {
            return "ActivityContent(category=" + this.f4021b + ", activity=" + this.f4020a + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1224a)) {
                return false;
            }
            C1224a aVar = (C1224a) obj;
            if (!C89219l.m154714a(this.f4021b, aVar.f4021b) || !C89219l.m154714a(this.f4020a, aVar.f4020a)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1224a(EnumC1226c cVar, WeakReference<ActivityC0945e> weakReference) {
            super(cVar, (byte) 0);
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(weakReference, "");
            this.f4021b = cVar;
            this.f4020a = weakReference;
        }
    }

    /* renamed from: androidx.lifecycle.y$b */
    public static final class C1225b extends AbstractC1223y {

        /* renamed from: a */
        public final WeakReference<Fragment> f4022a;

        /* renamed from: b */
        private final EnumC1226c f4023b;

        static {
            Covode.recordClassIndex(1332);
        }

        public final int hashCode() {
            int i;
            EnumC1226c cVar = this.f4023b;
            int i2 = 0;
            if (cVar != null) {
                i = cVar.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            WeakReference<Fragment> weakReference = this.f4022a;
            if (weakReference != null) {
                i2 = weakReference.hashCode();
            }
            return i3 + i2;
        }

        public final String toString() {
            return "FragmentContent(category=" + this.f4023b + ", fragment=" + this.f4022a + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1225b)) {
                return false;
            }
            C1225b bVar = (C1225b) obj;
            if (!C89219l.m154714a(this.f4023b, bVar.f4023b) || !C89219l.m154714a(this.f4022a, bVar.f4022a)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1225b(EnumC1226c cVar, WeakReference<Fragment> weakReference) {
            super(cVar, (byte) 0);
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(weakReference, "");
            this.f4023b = cVar;
            this.f4022a = weakReference;
        }
    }

    private AbstractC1223y(EnumC1226c cVar) {
        this.f4019a = cVar;
    }

    public /* synthetic */ AbstractC1223y(EnumC1226c cVar, byte b) {
        this(cVar);
    }
}
