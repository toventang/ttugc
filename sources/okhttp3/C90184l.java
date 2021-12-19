package okhttp3;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4655c.C90091d;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: okhttp3.l */
public final class C90184l {

    /* renamed from: j */
    private static final Pattern f204812j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f204813k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f204814l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f204815m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f204816a;

    /* renamed from: b */
    public final String f204817b;

    /* renamed from: c */
    public final long f204818c;

    /* renamed from: d */
    public final String f204819d;

    /* renamed from: e */
    public final String f204820e;

    /* renamed from: f */
    public final boolean f204821f;

    /* renamed from: g */
    public final boolean f204822g;

    /* renamed from: h */
    public final boolean f204823h;

    /* renamed from: i */
    public final boolean f204824i;

    /* renamed from: okhttp3.l$a */
    public static final class C90185a {

        /* renamed from: a */
        String f204825a;

        /* renamed from: b */
        String f204826b;

        /* renamed from: c */
        long f204827c = 253402300799999L;

        /* renamed from: d */
        String f204828d;

        /* renamed from: e */
        String f204829e = "/";

        /* renamed from: f */
        boolean f204830f;

        /* renamed from: g */
        boolean f204831g;

        /* renamed from: h */
        boolean f204832h;

        /* renamed from: i */
        boolean f204833i;

        static {
            Covode.recordClassIndex(106358);
        }
    }

    public final String toString() {
        return mo145008a(false);
    }

    static {
        Covode.recordClassIndex(106357);
    }

    public final int hashCode() {
        long j = this.f204818c;
        return ((((((((((((((((this.f204816a.hashCode() + 527) * 31) + this.f204817b.hashCode()) * 31) + this.f204819d.hashCode()) * 31) + this.f204820e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f204821f ? 1 : 0)) * 31) + (!this.f204822g ? 1 : 0)) * 31) + (!this.f204823h ? 1 : 0)) * 31) + (!this.f204824i ? 1 : 0);
    }

    C90184l(C90185a aVar) {
        Objects.requireNonNull(aVar.f204825a, "builder.name == null");
        Objects.requireNonNull(aVar.f204826b, "builder.value == null");
        Objects.requireNonNull(aVar.f204828d, "builder.domain == null");
        this.f204816a = aVar.f204825a;
        this.f204817b = aVar.f204826b;
        this.f204818c = aVar.f204827c;
        this.f204819d = aVar.f204828d;
        this.f204820e = aVar.f204829e;
        this.f204821f = aVar.f204830f;
        this.f204822g = aVar.f204831g;
        this.f204823h = aVar.f204832h;
        this.f204824i = aVar.f204833i;
    }

    /* renamed from: a */
    private static long m156744a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90184l)) {
            return false;
        }
        C90184l lVar = (C90184l) obj;
        if (lVar.f204816a.equals(this.f204816a) && lVar.f204817b.equals(this.f204817b) && lVar.f204819d.equals(this.f204819d) && lVar.f204820e.equals(this.f204820e) && lVar.f204818c == this.f204818c && lVar.f204821f == this.f204821f && lVar.f204822g == this.f204822g && lVar.f204823h == this.f204823h && lVar.f204824i == this.f204824i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo145008a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f204816a);
        sb.append('=');
        sb.append(this.f204817b);
        if (this.f204823h) {
            if (this.f204818c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(C90091d.m156438a(new Date(this.f204818c)));
            }
        }
        if (!this.f204824i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f204819d);
        }
        sb.append("; path=").append(this.f204820e);
        if (this.f204821f) {
            sb.append("; secure");
        }
        if (this.f204822g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C90184l m156747a(C90200t tVar, String str) {
        return m156746a(System.currentTimeMillis(), tVar, str);
    }

    /* renamed from: a */
    public static List<C90184l> m156745a(C90200t tVar, C90198s sVar) {
        List<String> b = sVar.mo145032b("Set-Cookie");
        int size = b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C90184l a = m156747a(tVar, b.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static C90184l m156746a(long j, C90200t tVar, String str) {
        long j2;
        boolean z;
        C90184l lVar;
        String str2;
        int length = str.length();
        boolean z2 = false;
        char c = ';';
        int a = C90084c.m156402a(str, 0, length, ';');
        char c2 = '=';
        int a2 = C90084c.m156402a(str, 0, a, '=');
        String str3 = null;
        if (a2 == a) {
            return null;
        }
        String c3 = C90084c.m156426c(str, 0, a2);
        if (c3.isEmpty() || C90084c.m156422b(c3) != -1) {
            return null;
        }
        boolean z3 = true;
        String c4 = C90084c.m156426c(str, a2 + 1, a);
        if (C90084c.m156422b(c4) != -1) {
            return null;
        }
        int i = a + 1;
        String str4 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        long j3 = -1;
        long j4 = 253402300799999L;
        while (i < length) {
            int a3 = C90084c.m156402a(str, i, length, c);
            int a4 = C90084c.m156402a(str, i, a3, c2);
            String c5 = C90084c.m156426c(str, i, a4);
            if (a4 < a3) {
                str2 = C90084c.m156426c(str, a4 + 1, a3);
            } else {
                str2 = "";
            }
            if (c5.equalsIgnoreCase("expires")) {
                try {
                    int length2 = str2.length();
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    int i4 = z2 ? 1 : 0;
                    int a5 = m156743a(str2, i2, length2, z2);
                    Matcher matcher = f204815m.matcher(str2);
                    int i5 = -1;
                    int i6 = -1;
                    int i7 = -1;
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -1;
                    while (a5 < length2) {
                        int a6 = m156743a(str2, a5 + 1, length2, z3);
                        matcher.region(a5, a6);
                        if (i6 != -1 || !matcher.usePattern(f204815m).matches()) {
                            int i11 = -1;
                            if (i8 == -1) {
                                if (matcher.usePattern(f204814l).matches()) {
                                    i8 = Integer.parseInt(matcher.group(1));
                                } else {
                                    i11 = -1;
                                }
                            }
                            if (i5 == i11) {
                                Pattern pattern = f204813k;
                                if (matcher.usePattern(pattern).matches()) {
                                    i5 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                }
                            }
                            if (i7 == -1 && matcher.usePattern(f204812j).matches()) {
                                i7 = Integer.parseInt(matcher.group(1));
                            }
                        } else {
                            int i12 = z3 ? 1 : 0;
                            int i13 = z3 ? 1 : 0;
                            int i14 = z3 ? 1 : 0;
                            int i15 = z3 ? 1 : 0;
                            i6 = Integer.parseInt(matcher.group(i12));
                            i9 = Integer.parseInt(matcher.group(2));
                            i10 = Integer.parseInt(matcher.group(3));
                        }
                        a5 = m156743a(str2, a6 + 1, length2, false);
                        z3 = true;
                    }
                    if (i7 >= 70 && i7 <= 99) {
                        i7 += 1900;
                    }
                    if (i7 >= 0) {
                        if (i7 <= 69) {
                            i7 += LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                        }
                        if (i7 >= 1601) {
                            if (i5 == -1) {
                                throw new IllegalArgumentException();
                            } else if (i8 <= 0 || i8 > 31) {
                                throw new IllegalArgumentException();
                            } else if (i6 < 0 || i6 > 23) {
                                throw new IllegalArgumentException();
                            } else if (i9 < 0 || i9 > 59) {
                                throw new IllegalArgumentException();
                            } else if (i10 < 0 || i10 > 59) {
                                throw new IllegalArgumentException();
                            } else {
                                try {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C90084c.f204452g);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i7);
                                    gregorianCalendar.set(2, i5 - 1);
                                    gregorianCalendar.set(5, i8);
                                    gregorianCalendar.set(11, i6);
                                    gregorianCalendar.set(12, i9);
                                    gregorianCalendar.set(13, i10);
                                    gregorianCalendar.set(14, 0);
                                    j4 = gregorianCalendar.getTimeInMillis();
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                    }
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException unused2) {
                }
            } else if (c5.equalsIgnoreCase("max-age")) {
                j3 = m156744a(str2);
            } else {
                if (c5.equalsIgnoreCase("domain")) {
                    if (!str2.endsWith(".")) {
                        if (str2.startsWith(".")) {
                            str2 = str2.substring(1);
                        }
                        String a7 = C90084c.m156406a(str2);
                        if (a7 != null) {
                            str3 = a7;
                            z6 = false;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (c5.equalsIgnoreCase("path")) {
                    str4 = str2;
                } else if (c5.equalsIgnoreCase("secure")) {
                    z4 = true;
                } else if (c5.equalsIgnoreCase("httponly")) {
                    z5 = true;
                }
                i = a3 + 1;
                z2 = false;
                c = ';';
                c2 = '=';
                z3 = true;
            }
            z7 = true;
            i = a3 + 1;
            z2 = false;
            c = ';';
            c2 = '=';
            z3 = true;
        }
        long j5 = Long.MIN_VALUE;
        if (j3 != Long.MIN_VALUE) {
            if (j3 != -1) {
                if (j3 <= 9223372036854775L) {
                    j2 = j3 * 1000;
                } else {
                    j2 = Long.MAX_VALUE;
                }
                j5 = j + j2;
                if (j5 < j || j5 > 253402300799999L) {
                    j5 = 253402300799999L;
                }
            } else {
                j5 = j4;
            }
        }
        String str5 = tVar.f204861d;
        if (str3 == null) {
            str3 = str5;
            lVar = null;
        } else {
            if (!str5.equals(str3) && (!str5.endsWith(str3) || str5.charAt((str5.length() - str3.length()) - 1) != '.' || C90084c.m156427c(str5))) {
                z = false;
            } else {
                z = true;
            }
            lVar = null;
            if (!z) {
                return null;
            }
        }
        if (str5.length() != str3.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) == null) {
            return lVar;
        }
        String str6 = "/";
        if (str4 == null || !str4.startsWith(str6)) {
            String f = tVar.mo145055f();
            int lastIndexOf = f.lastIndexOf(47);
            if (lastIndexOf != 0) {
                str6 = f.substring(0, lastIndexOf);
            }
        } else {
            str6 = str4;
        }
        return new C90184l(c3, c4, j5, str3, str6, z4, z5, z6, z7);
    }

    /* renamed from: a */
    private static int m156743a(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' ? charAt >= 127 || ((charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) : charAt != '\t') {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private C90184l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f204816a = str;
        this.f204817b = str2;
        this.f204818c = j;
        this.f204819d = str3;
        this.f204820e = str4;
        this.f204821f = z;
        this.f204822g = z2;
        this.f204824i = z3;
        this.f204823h = z4;
    }
}
