package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: com.google.b.a.g.h */
public final class C27183h implements Serializable {

    /* renamed from: a */
    private static final TimeZone f64359a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final Pattern f64360b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    private final long f64361c;

    /* renamed from: d */
    private final boolean f64362d;

    /* renamed from: e */
    private final int f64363e;

    public final int getTimeZoneShift() {
        return this.f64363e;
    }

    public final long getValue() {
        return this.f64361c;
    }

    public final boolean isDateOnly() {
        return this.f64362d;
    }

    public final String toString() {
        return toStringRfc3339();
    }

    static {
        Covode.recordClassIndex(32763);
    }

    public final int hashCode() {
        long j;
        long[] jArr = new long[3];
        jArr[0] = this.f64361c;
        if (this.f64362d) {
            j = serialVersionUID;
        } else {
            j = 0;
        }
        jArr[1] = j;
        jArr[2] = (long) this.f64363e;
        return Arrays.hashCode(jArr);
    }

    public final String toStringRfc3339() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f64359a);
        gregorianCalendar.setTimeInMillis(this.f64361c + (((long) this.f64363e) * 60000));
        m54021a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m54021a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m54021a(sb, gregorianCalendar.get(5), 2);
        if (!this.f64362d) {
            sb.append('T');
            m54021a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m54021a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m54021a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                m54021a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.f64363e;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                m54021a(sb, i / 60, 2);
                sb.append(':');
                m54021a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public C27183h(long j) {
        this(false, j, null);
    }

    public C27183h(String str) {
        C27183h parseRfc3339 = parseRfc3339(str);
        this.f64362d = parseRfc3339.f64362d;
        this.f64361c = parseRfc3339.f64361c;
        this.f64363e = parseRfc3339.f64363e;
    }

    public C27183h(Date date) {
        this(date.getTime());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C27183h)) {
            return false;
        }
        C27183h hVar = (C27183h) obj;
        if (this.f64362d == hVar.f64362d && this.f64361c == hVar.f64361c && this.f64363e == hVar.f64363e) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p1971b.p1972a.p1993g.C27183h parseRfc3339(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1971b.p1972a.p1993g.C27183h.parseRfc3339(java.lang.String):com.google.b.a.g.h");
    }

    public C27183h(long j, int i) {
        this(false, j, Integer.valueOf(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27183h(java.util.Date r5, java.util.TimeZone r6) {
        /*
            r4 = this;
            long r2 = r5.getTime()
            if (r6 != 0) goto L_0x000c
            r1 = 0
        L_0x0007:
            r0 = 0
            r4.<init>(r0, r2, r1)
            return
        L_0x000c:
            long r0 = r5.getTime()
            int r1 = r6.getOffset(r0)
            r0 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 / r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1971b.p1972a.p1993g.C27183h.<init>(java.util.Date, java.util.TimeZone):void");
    }

    /* renamed from: a */
    private static void m54021a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public C27183h(boolean z, long j, Integer num) {
        int intValue;
        this.f64362d = z;
        this.f64361c = j;
        if (z) {
            intValue = 0;
        } else if (num == null) {
            intValue = TimeZone.getDefault().getOffset(j) / 60000;
        } else {
            intValue = num.intValue();
        }
        this.f64363e = intValue;
    }
}
