package androidx.work;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.i */
public final class C1603i {

    /* renamed from: a */
    public UUID f5232a;

    /* renamed from: b */
    public EnumC1604a f5233b;

    /* renamed from: c */
    public C1597e f5234c;

    /* renamed from: d */
    public Set<String> f5235d;

    static {
        Covode.recordClassIndex(1756);
    }

    /* renamed from: androidx.work.i$a */
    public enum EnumC1604a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(1757);
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        UUID uuid = this.f5232a;
        int i4 = 0;
        if (uuid != null) {
            i = uuid.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        EnumC1604a aVar = this.f5233b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        C1597e eVar = this.f5234c;
        if (eVar != null) {
            i3 = eVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Set<String> set = this.f5235d;
        if (set != null) {
            i4 = set.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f5232a + '\'' + ", mState=" + this.f5233b + ", mOutputData=" + this.f5234c + ", mTags=" + this.f5235d + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1603i iVar = (C1603i) obj;
            UUID uuid = this.f5232a;
            if (uuid == null ? iVar.f5232a != null : !uuid.equals(iVar.f5232a)) {
                return false;
            }
            if (this.f5233b != iVar.f5233b) {
                return false;
            }
            C1597e eVar = this.f5234c;
            if (eVar == null ? iVar.f5234c != null : !eVar.equals(iVar.f5234c)) {
                return false;
            }
            Set<String> set = this.f5235d;
            Set<String> set2 = iVar.f5235d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public C1603i(UUID uuid, EnumC1604a aVar, C1597e eVar, List<String> list) {
        this.f5232a = uuid;
        this.f5233b = aVar;
        this.f5234c = eVar;
        this.f5235d = new HashSet(list);
    }
}
