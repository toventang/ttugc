package androidx.work.impl.p073b;

import android.os.Build;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import androidx.work.AbstractC1600g;
import androidx.work.C1593c;
import androidx.work.C1597e;
import androidx.work.C1603i;
import androidx.work.EnumC1590a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.impl.b.g */
public final class C1642g {

    /* renamed from: q */
    public static final AbstractC0189a<List<C1644a>, List<C1603i>> f5304q = new AbstractC0189a<List<C1644a>, List<C1603i>>() {
        /* class androidx.work.impl.p073b.C1642g.C16431 */

        static {
            Covode.recordClassIndex(1799);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ List<C1603i> mo365a(List<C1644a> list) {
            List<C1644a> list2 = list;
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list2.size());
            for (C1644a aVar : list2) {
                arrayList.add(new C1603i(UUID.fromString(aVar.f5322a), aVar.f5323b, aVar.f5324c, aVar.f5325d));
            }
            return arrayList;
        }
    };

    /* renamed from: r */
    private static final String f5305r = AbstractC1600g.m5318a("WorkSpec");

    /* renamed from: a */
    public String f5306a;

    /* renamed from: b */
    public C1603i.EnumC1604a f5307b = C1603i.EnumC1604a.ENQUEUED;

    /* renamed from: c */
    public String f5308c;

    /* renamed from: d */
    public String f5309d;

    /* renamed from: e */
    public C1597e f5310e = C1597e.f5223a;

    /* renamed from: f */
    public C1597e f5311f = C1597e.f5223a;

    /* renamed from: g */
    public long f5312g;

    /* renamed from: h */
    public long f5313h;

    /* renamed from: i */
    public long f5314i;

    /* renamed from: j */
    public C1593c f5315j = C1593c.f5203a;

    /* renamed from: k */
    public int f5316k;

    /* renamed from: l */
    public EnumC1590a f5317l = EnumC1590a.EXPONENTIAL;

    /* renamed from: m */
    public long f5318m = 30000;

    /* renamed from: n */
    public long f5319n;

    /* renamed from: o */
    public long f5320o;

    /* renamed from: p */
    public long f5321p = -1;

    /* renamed from: a */
    public final boolean mo5419a() {
        if (this.f5313h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5420b() {
        if (this.f5307b != C1603i.EnumC1604a.ENQUEUED || this.f5316k <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo5422d() {
        if (!C1593c.f5203a.equals(this.f5315j)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1798);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f5306a + "}";
    }

    /* renamed from: androidx.work.impl.b.g$a */
    public static class C1644a {

        /* renamed from: a */
        public String f5322a;

        /* renamed from: b */
        public C1603i.EnumC1604a f5323b;

        /* renamed from: c */
        public C1597e f5324c;

        /* renamed from: d */
        public List<String> f5325d;

        static {
            Covode.recordClassIndex(1800);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            String str = this.f5322a;
            int i4 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            C1603i.EnumC1604a aVar = this.f5323b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            C1597e eVar = this.f5324c;
            if (eVar != null) {
                i3 = eVar.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            List<String> list = this.f5325d;
            if (list != null) {
                i4 = list.hashCode();
            }
            return i7 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C1644a aVar = (C1644a) obj;
                String str = this.f5322a;
                if (str == null ? aVar.f5322a != null : !str.equals(aVar.f5322a)) {
                    return false;
                }
                if (this.f5323b != aVar.f5323b) {
                    return false;
                }
                C1597e eVar = this.f5324c;
                if (eVar == null ? aVar.f5324c != null : !eVar.equals(aVar.f5324c)) {
                    return false;
                }
                List<String> list = this.f5325d;
                List<String> list2 = aVar.f5325d;
                if (list != null) {
                    return list.equals(list2);
                }
                if (list2 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final long mo5421c() {
        long j;
        long scalb;
        if (mo5420b()) {
            if (this.f5317l == EnumC1590a.LINEAR) {
                scalb = this.f5318m * ((long) this.f5316k);
            } else {
                scalb = (long) Math.scalb((float) this.f5318m, this.f5316k - 1);
            }
            return this.f5319n + Math.min(18000000L, scalb);
        } else if (!mo5419a()) {
            return this.f5319n + this.f5312g;
        } else {
            if (Build.VERSION.SDK_INT > 22) {
                return (this.f5319n + this.f5313h) - this.f5314i;
            }
            long j2 = this.f5314i;
            long j3 = this.f5313h;
            if (j2 == j3) {
                return this.f5319n + j3;
            }
            long j4 = this.f5319n;
            if (j4 == 0) {
                j = j2 * -1;
            } else {
                j = 0;
            }
            if (j4 == 0) {
                j4 = System.currentTimeMillis();
            }
            return j4 + this.f5313h + j;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f5306a.hashCode() * 31) + this.f5307b.hashCode()) * 31) + this.f5308c.hashCode()) * 31;
        String str = this.f5309d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f5312g;
        long j2 = this.f5313h;
        long j3 = this.f5314i;
        long j4 = this.f5318m;
        long j5 = this.f5319n;
        long j6 = this.f5320o;
        long j7 = this.f5321p;
        return ((((((((((((((((((((((((hashCode + i) * 31) + this.f5310e.hashCode()) * 31) + this.f5311f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f5315j.hashCode()) * 31) + this.f5316k) * 31) + this.f5317l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1642g gVar = (C1642g) obj;
            if (this.f5312g != gVar.f5312g || this.f5313h != gVar.f5313h || this.f5314i != gVar.f5314i || this.f5316k != gVar.f5316k || this.f5318m != gVar.f5318m || this.f5319n != gVar.f5319n || this.f5320o != gVar.f5320o || this.f5321p != gVar.f5321p || !this.f5306a.equals(gVar.f5306a) || this.f5307b != gVar.f5307b || !this.f5308c.equals(gVar.f5308c)) {
                return false;
            }
            String str = this.f5309d;
            if (str == null ? gVar.f5309d != null : !str.equals(gVar.f5309d)) {
                return false;
            }
            if (this.f5310e.equals(gVar.f5310e) && this.f5311f.equals(gVar.f5311f) && this.f5315j.equals(gVar.f5315j) && this.f5317l == gVar.f5317l) {
                return true;
            }
        }
        return false;
    }

    public C1642g(String str, String str2) {
        this.f5306a = str;
        this.f5308c = str2;
    }
}
