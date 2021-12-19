package androidx.core.p035f;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import java.util.Locale;

/* renamed from: androidx.core.f.a */
public final class C0671a {

    /* renamed from: a */
    static final AbstractC0679e f2702a;

    /* renamed from: b */
    static final C0671a f2703b;

    /* renamed from: c */
    static final C0671a f2704c;

    /* renamed from: e */
    private static final String f2705e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2706f = Character.toString(8207);

    /* renamed from: d */
    public final boolean f2707d;

    /* renamed from: g */
    private final int f2708g;

    /* renamed from: h */
    private final AbstractC0679e f2709h;

    /* renamed from: a */
    public static C0671a m2407a() {
        return new C0672a().mo2697a();
    }

    /* renamed from: androidx.core.f.a$a */
    public static final class C0672a {

        /* renamed from: a */
        private boolean f2710a;

        /* renamed from: b */
        private int f2711b;

        /* renamed from: c */
        private AbstractC0679e f2712c;

        static {
            Covode.recordClassIndex(751);
        }

        public C0672a() {
            m2415a(C0687g.m2442a(Locale.getDefault()) != 1 ? false : true);
        }

        /* renamed from: a */
        public final C0671a mo2697a() {
            if (this.f2711b == 2 && this.f2712c == C0671a.f2702a) {
                return m2416b(this.f2710a);
            }
            return new C0671a(this.f2710a, this.f2711b, this.f2712c);
        }

        public C0672a(boolean z) {
            m2415a(z);
        }

        /* renamed from: b */
        private static C0671a m2416b(boolean z) {
            if (z) {
                return C0671a.f2704c;
            }
            return C0671a.f2703b;
        }

        /* renamed from: a */
        private void m2415a(boolean z) {
            this.f2710a = z;
            this.f2712c = C0671a.f2702a;
            this.f2711b = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.f.a$b */
    public static class C0673b {

        /* renamed from: a */
        private static final byte[] f2713a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f2714b;

        /* renamed from: c */
        private final boolean f2715c = false;

        /* renamed from: d */
        private final int f2716d;

        /* renamed from: e */
        private int f2717e;

        /* renamed from: f */
        private char f2718f;

        static {
            Covode.recordClassIndex(752);
            int i = 0;
            do {
                f2713a[i] = Character.getDirectionality(i);
                i++;
            } while (i < 1792);
        }

        /* renamed from: g */
        private byte m2423g() {
            char charAt;
            do {
                int i = this.f2717e;
                if (i >= this.f2716d) {
                    return 12;
                }
                CharSequence charSequence = this.f2714b;
                this.f2717e = i + 1;
                charAt = charSequence.charAt(i);
                this.f2718f = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: f */
        private byte m2422f() {
            char charAt;
            int i = this.f2717e;
            while (true) {
                int i2 = this.f2717e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2714b;
                int i3 = i2 - 1;
                this.f2717e = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f2718f = charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    } else if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.f2717e;
                            if (i4 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2714b;
                            int i5 = i4 - 1;
                            this.f2717e = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f2718f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    return 12;
                }
            }
            this.f2717e = i;
            this.f2718f = '>';
            return C86745e.f195623b;
        }

        /* renamed from: h */
        private byte m2424h() {
            char charAt;
            int i = this.f2717e;
            do {
                int i2 = this.f2717e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2714b;
                int i3 = i2 - 1;
                this.f2717e = i3;
                charAt = charSequence.charAt(i3);
                this.f2718f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2717e = i;
            this.f2718f = ';';
            return C86745e.f195623b;
        }

        /* renamed from: c */
        private byte m2419c() {
            char charAt = this.f2714b.charAt(this.f2717e);
            this.f2718f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2714b, this.f2717e);
                this.f2717e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2717e++;
            byte a = m2418a(this.f2718f);
            if (!this.f2715c) {
                return a;
            }
            char c = this.f2718f;
            if (c == '<') {
                return m2421e();
            }
            if (c == '&') {
                return m2423g();
            }
            return a;
        }

        /* renamed from: d */
        private byte m2420d() {
            char charAt = this.f2714b.charAt(this.f2717e - 1);
            this.f2718f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2714b, this.f2717e);
                this.f2717e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2717e--;
            byte a = m2418a(this.f2718f);
            if (!this.f2715c) {
                return a;
            }
            char c = this.f2718f;
            if (c == '>') {
                return m2422f();
            }
            if (c == ';') {
                return m2424h();
            }
            return a;
        }

        /* renamed from: e */
        private byte m2421e() {
            char charAt;
            int i = this.f2717e;
            while (true) {
                int i2 = this.f2717e;
                if (i2 < this.f2716d) {
                    CharSequence charSequence = this.f2714b;
                    this.f2717e = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f2718f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f2717e;
                            if (i3 >= this.f2716d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2714b;
                            this.f2717e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2718f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2717e = i;
                    this.f2718f = '<';
                    return C86745e.f195623b;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo2698a() {
            this.f2717e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (this.f2717e < this.f2716d) {
                    if (i == 0) {
                        byte c = m2419c();
                        if (c != 0) {
                            if (c == 1 || c == 2) {
                                if (i3 == 0) {
                                    return 1;
                                }
                            } else if (c != 9) {
                                switch (c) {
                                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                    case 15:
                                        i3++;
                                        i2 = -1;
                                        break;
                                    case 16:
                                    case 17:
                                        i3++;
                                        i2 = 1;
                                        break;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                        i3--;
                                        i2 = 0;
                                        break;
                                }
                            }
                        } else if (i3 == 0) {
                            return -1;
                        }
                        i = i3;
                    }
                } else if (i == 0) {
                    return 0;
                }
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2717e > 0) {
                switch (m2420d()) {
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo2699b() {
            this.f2717e = this.f2716d;
            int i = 0;
            int i2 = 0;
            while (this.f2717e > 0) {
                byte d = m2420d();
                if (d != 0) {
                    if (d == 1 || d == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (d != 9) {
                        switch (d) {
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }

        C0673b(CharSequence charSequence) {
            this.f2714b = charSequence;
            this.f2716d = charSequence.length();
        }

        /* renamed from: a */
        private static byte m2418a(char c) {
            if (c < 1792) {
                return f2713a[c];
            }
            return Character.getDirectionality(c);
        }
    }

    static {
        Covode.recordClassIndex(750);
        AbstractC0679e eVar = C0680f.f2737c;
        f2702a = eVar;
        f2703b = new C0671a(false, 2, eVar);
        f2704c = new C0671a(true, 2, eVar);
    }

    /* renamed from: a */
    public final CharSequence mo2694a(CharSequence charSequence) {
        return m2409a(charSequence, this.f2709h);
    }

    /* renamed from: b */
    private static int m2410b(CharSequence charSequence) {
        return new C0673b(charSequence).mo2699b();
    }

    /* renamed from: c */
    private static int m2411c(CharSequence charSequence) {
        return new C0673b(charSequence).mo2698a();
    }

    /* renamed from: a */
    public static C0671a m2408a(boolean z) {
        return new C0672a(z).mo2697a();
    }

    /* renamed from: b */
    public final String mo2696b(String str) {
        AbstractC0679e eVar = this.f2709h;
        if (str == null) {
            return null;
        }
        return m2409a(str, eVar).toString();
    }

    /* renamed from: a */
    public final boolean mo2695a(String str) {
        return this.f2709h.mo2717a(str, str.length());
    }

    /* renamed from: a */
    private CharSequence m2409a(CharSequence charSequence, AbstractC0679e eVar) {
        boolean z;
        AbstractC0679e eVar2;
        char c;
        AbstractC0679e eVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo2717a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f2708g & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            if (a) {
                eVar3 = C0680f.f2736b;
            } else {
                eVar3 = C0680f.f2735a;
            }
            boolean a2 = eVar3.mo2717a(charSequence, charSequence.length());
            if (!this.f2707d && (a2 || m2411c(charSequence) == 1)) {
                str = f2705e;
            } else if (!this.f2707d || (a2 && m2411c(charSequence) != -1)) {
                str = str2;
            } else {
                str = f2706f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (a != this.f2707d) {
            if (a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (a) {
            eVar2 = C0680f.f2736b;
        } else {
            eVar2 = C0680f.f2735a;
        }
        boolean a3 = eVar2.mo2717a(charSequence, charSequence.length());
        if (!this.f2707d && (a3 || m2410b(charSequence) == 1)) {
            str2 = f2705e;
        } else if (this.f2707d && (!a3 || m2410b(charSequence) == -1)) {
            str2 = f2706f;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    C0671a(boolean z, int i, AbstractC0679e eVar) {
        this.f2707d = z;
        this.f2708g = i;
        this.f2709h = eVar;
    }
}
