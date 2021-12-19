package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.w */
public final class C88300w implements Cloneable {

    /* renamed from: a */
    public final String f200384a;

    /* renamed from: b */
    public final long f200385b;

    /* renamed from: c */
    public final long f200386c;

    /* renamed from: d */
    public final int f200387d;

    /* renamed from: e */
    public int f200388e;

    static {
        Covode.recordClassIndex(104335);
    }

    /* renamed from: a */
    public static C88300w m153449a() {
        return new C88300w("0");
    }

    /* renamed from: b */
    public static C88300w m153453b() {
        return new C88300w("1");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: c */
    public final C88300w clone() {
        try {
            return (C88300w) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "VETimeEffectOp{mType='" + this.f200384a + '\'' + ", mStartTimePoint=" + this.f200385b + ", mEndTimePoint=" + this.f200386c + ", mIndex=" + this.f200388e + '}';
    }

    private C88300w(String str) {
        this.f200384a = str;
        this.f200385b = 0;
        this.f200386c = 0;
        this.f200387d = 3;
    }

    /* renamed from: c */
    public static boolean m153456c(C88300w wVar) {
        if (wVar == null || !"3".equals(wVar.f200384a)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m153457d(C88300w wVar) {
        if (wVar == null || !"0".equals(wVar.f200384a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m153452a(C88300w wVar) {
        if (wVar == null || !"1".equals(wVar.f200384a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m153455b(C88300w wVar) {
        if (wVar == null || !"2".equals(wVar.f200384a)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88300w)) {
            return false;
        }
        C88300w wVar = (C88300w) obj;
        if (this.f200384a.equals(wVar.f200384a) && this.f200385b == wVar.f200385b && this.f200386c == wVar.f200386c && this.f200388e == wVar.f200388e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C88300w m153450a(long j, long j2) {
        return new C88300w("2", j, j2);
    }

    /* renamed from: b */
    public static C88300w m153454b(long j, long j2) {
        return new C88300w("3", j, j2);
    }

    private C88300w(String str, long j, long j2) {
        this.f200384a = str;
        this.f200385b = j;
        this.f200386c = j2;
        this.f200387d = 3;
    }

    /* renamed from: a */
    public static C88300w m153451a(String str, long j, long j2) {
        str.hashCode();
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return m153449a();
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return m153453b();
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return m153450a(j, j2);
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return m153454b(j, j2);
                }
                break;
        }
        throw new IllegalArgumentException("op key " + str + " is not supported, plz check again.");
    }
}
