package com.google.android.gms.internal.measurement;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.p2082ss.android.ugc.aweme.kids.discovery.gallery.C57577a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.hu */
public final class C26024hu<T> implements AbstractC26041ik<T> {

    /* renamed from: a */
    private static final int[] f61297a = new int[0];

    /* renamed from: b */
    private static final Unsafe f61298b = C26065jh.m50949a();

    /* renamed from: c */
    private final int[] f61299c;

    /* renamed from: d */
    private final Object[] f61300d;

    /* renamed from: e */
    private final int f61301e;

    /* renamed from: f */
    private final int f61302f;

    /* renamed from: g */
    private final AbstractC26020hq f61303g;

    /* renamed from: h */
    private final boolean f61304h;

    /* renamed from: i */
    private final boolean f61305i;

    /* renamed from: j */
    private final boolean f61306j;

    /* renamed from: k */
    private final boolean f61307k;

    /* renamed from: l */
    private final int[] f61308l;

    /* renamed from: m */
    private final int f61309m;

    /* renamed from: n */
    private final int f61310n;

    /* renamed from: o */
    private final AbstractC26028hy f61311o;

    /* renamed from: p */
    private final AbstractC26004ha f61312p;

    /* renamed from: q */
    private final AbstractC26059jb<?, ?> f61313q;

    /* renamed from: r */
    private final AbstractC25968fx<?> f61314r;

    /* renamed from: s */
    private final AbstractC26017hn f61315s;

    /* renamed from: f */
    private static boolean m50733f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: a */
    static <T> C26024hu<T> m50703a(AbstractC26018ho hoVar, AbstractC26028hy hyVar, AbstractC26004ha haVar, AbstractC26059jb<?, ?> jbVar, AbstractC25968fx<?> fxVar, AbstractC26017hn hnVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int[] iArr;
        int i2;
        int i3;
        char charAt6;
        int i4;
        char charAt7;
        int i5;
        char charAt8;
        int i6;
        char charAt9;
        int i7;
        char charAt10;
        int i8;
        char charAt11;
        int i9;
        char charAt12;
        int i10;
        char charAt13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Field a;
        int i16;
        char charAt14;
        int i17;
        Field a2;
        Field a3;
        int i18;
        char charAt15;
        int i19;
        char charAt16;
        int i20;
        char charAt17;
        int i21;
        char charAt18;
        if (hoVar instanceof C26039ii) {
            C26039ii iiVar = (C26039ii) hoVar;
            int i22 = 0;
            boolean z = iiVar.mo42689a() == AbstractC25981gj.C25986e.f61251i;
            String str = iiVar.f61335b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i23 = 1;
                while (true) {
                    i = i23 + 1;
                    if (str.charAt(i23) < 55296) {
                        break;
                    }
                    i23 = i;
                }
            } else {
                i = 1;
            }
            int i24 = i + 1;
            int charAt19 = str.charAt(i);
            if (charAt19 >= 55296) {
                int i25 = charAt19 & 8191;
                int i26 = 13;
                while (true) {
                    i21 = i24 + 1;
                    charAt18 = str.charAt(i24);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i25 |= (charAt18 & 8191) << i26;
                    i26 += 13;
                    i24 = i21;
                }
                charAt19 = i25 | (charAt18 << i26);
                i24 = i21;
            }
            if (charAt19 == 0) {
                iArr = f61297a;
                charAt4 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                i2 = 0;
                charAt5 = 0;
            } else {
                int i27 = i24 + 1;
                i22 = str.charAt(i24);
                if (i22 >= 55296) {
                    int i28 = i22 & 8191;
                    int i29 = 13;
                    while (true) {
                        i10 = i27 + 1;
                        charAt13 = str.charAt(i27);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i28 |= (charAt13 & 8191) << i29;
                        i29 += 13;
                        i27 = i10;
                    }
                    i22 = i28 | (charAt13 << i29);
                    i27 = i10;
                }
                int i30 = i27 + 1;
                int charAt20 = str.charAt(i27);
                if (charAt20 >= 55296) {
                    int i31 = charAt20 & 8191;
                    int i32 = 13;
                    while (true) {
                        i9 = i30 + 1;
                        charAt12 = str.charAt(i30);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i31 |= (charAt12 & 8191) << i32;
                        i32 += 13;
                        i30 = i9;
                    }
                    charAt20 = i31 | (charAt12 << i32);
                    i30 = i9;
                }
                int i33 = i30 + 1;
                charAt = str.charAt(i30);
                if (charAt >= 55296) {
                    int i34 = charAt & 8191;
                    int i35 = 13;
                    while (true) {
                        i8 = i33 + 1;
                        charAt11 = str.charAt(i33);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i34 |= (charAt11 & 8191) << i35;
                        i35 += 13;
                        i33 = i8;
                    }
                    charAt = i34 | (charAt11 << i35);
                    i33 = i8;
                }
                int i36 = i33 + 1;
                charAt2 = str.charAt(i33);
                if (charAt2 >= 55296) {
                    int i37 = charAt2 & 8191;
                    int i38 = 13;
                    while (true) {
                        i7 = i36 + 1;
                        charAt10 = str.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i7;
                    }
                    charAt2 = i37 | (charAt10 << i38);
                    i36 = i7;
                }
                int i39 = i36 + 1;
                charAt3 = str.charAt(i36);
                if (charAt3 >= 55296) {
                    int i40 = charAt3 & 8191;
                    int i41 = 13;
                    while (true) {
                        i6 = i39 + 1;
                        charAt9 = str.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i6;
                    }
                    charAt3 = i40 | (charAt9 << i41);
                    i39 = i6;
                }
                int i42 = i39 + 1;
                charAt4 = str.charAt(i39);
                if (charAt4 >= 55296) {
                    int i43 = charAt4 & 8191;
                    int i44 = 13;
                    while (true) {
                        i5 = i42 + 1;
                        charAt8 = str.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i5;
                    }
                    charAt4 = i43 | (charAt8 << i44);
                    i42 = i5;
                }
                int i45 = i42 + 1;
                int charAt21 = str.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i4 = i45 + 1;
                        charAt7 = str.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i4;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i4;
                }
                i24 = i45 + 1;
                charAt5 = str.charAt(i45);
                if (charAt5 >= 55296) {
                    int i48 = charAt5 & 8191;
                    int i49 = 13;
                    while (true) {
                        i3 = i24 + 1;
                        charAt6 = str.charAt(i24);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i24 = i3;
                    }
                    charAt5 = i48 | (charAt6 << i49);
                    i24 = i3;
                }
                iArr = new int[(charAt5 + charAt4 + charAt21)];
                i2 = (i22 << 1) + charAt20;
            }
            Unsafe unsafe = f61298b;
            Object[] objArr = iiVar.f61336c;
            Class<?> cls = iiVar.f61334a.getClass();
            int[] iArr2 = new int[(charAt3 * 3)];
            Object[] objArr2 = new Object[(charAt3 << 1)];
            int i50 = charAt5 + charAt4;
            int i51 = charAt5;
            int i52 = i50;
            int i53 = 0;
            int i54 = 0;
            while (i24 < length) {
                int i55 = i24 + 1;
                int charAt22 = str.charAt(i24);
                if (charAt22 >= 55296) {
                    int i56 = charAt22 & 8191;
                    int i57 = 13;
                    while (true) {
                        i20 = i55 + 1;
                        charAt17 = str.charAt(i55);
                        if (charAt17 < 55296) {
                            break;
                        }
                        i56 |= (charAt17 & 8191) << i57;
                        i57 += 13;
                        i55 = i20;
                    }
                    charAt22 = i56 | (charAt17 << i57);
                    i55 = i20;
                }
                i24 = i55 + 1;
                int charAt23 = str.charAt(i55);
                if (charAt23 >= 55296) {
                    int i58 = charAt23 & 8191;
                    int i59 = 13;
                    while (true) {
                        i19 = i24 + 1;
                        charAt16 = str.charAt(i24);
                        if (charAt16 < 55296) {
                            break;
                        }
                        i58 |= (charAt16 & 8191) << i59;
                        i59 += 13;
                        i24 = i19;
                    }
                    charAt23 = i58 | (charAt16 << i59);
                    i24 = i19;
                }
                int i60 = charAt23 & 255;
                if ((charAt23 & 1024) != 0) {
                    iArr[i53] = i54;
                    i53++;
                }
                if (i60 >= 51) {
                    int i61 = i24 + 1;
                    int charAt24 = str.charAt(i24);
                    char c = 55296;
                    if (charAt24 >= 55296) {
                        int i62 = charAt24 & 8191;
                        int i63 = 13;
                        while (true) {
                            i18 = i61 + 1;
                            charAt15 = str.charAt(i61);
                            if (charAt15 < c) {
                                break;
                            }
                            i62 |= (charAt15 & 8191) << i63;
                            i63 += 13;
                            i61 = i18;
                            c = 55296;
                        }
                        charAt24 = i62 | (charAt15 << i63);
                        i61 = i18;
                    }
                    int i64 = i60 - 51;
                    if (i64 == 9 || i64 == 17) {
                        objArr2[((i54 / 3) << 1) + 1] = objArr[i2];
                        i2++;
                    } else if (i64 == 12 && !z) {
                        objArr2[((i54 / 3) << 1) + 1] = objArr[i2];
                        i2++;
                    }
                    int i65 = charAt24 << 1;
                    Object obj = objArr[i65];
                    if (obj instanceof Field) {
                        a2 = (Field) obj;
                    } else {
                        a2 = m50707a(cls, (String) obj);
                        objArr[i65] = a2;
                    }
                    i11 = (int) unsafe.objectFieldOffset(a2);
                    int i66 = i65 + 1;
                    Object obj2 = objArr[i66];
                    if (obj2 instanceof Field) {
                        a3 = (Field) obj2;
                    } else {
                        a3 = m50707a(cls, (String) obj2);
                        objArr[i66] = a3;
                    }
                    i14 = (int) unsafe.objectFieldOffset(a3);
                    i12 = i2;
                    i24 = i61;
                    i13 = 0;
                } else {
                    i12 = i2 + 1;
                    Field a4 = m50707a(cls, (String) objArr[i2]);
                    if (i60 == 9 || i60 == 17) {
                        objArr2[((i54 / 3) << 1) + 1] = a4.getType();
                    } else {
                        if (i60 == 27 || i60 == 49) {
                            i17 = i12 + 1;
                            objArr2[((i54 / 3) << 1) + 1] = objArr[i12];
                        } else if (i60 == 12 || i60 == 30 || i60 == 44) {
                            if (!z) {
                                i17 = i12 + 1;
                                objArr2[((i54 / 3) << 1) + 1] = objArr[i12];
                            }
                        } else if (i60 == 50) {
                            int i67 = i51 + 1;
                            iArr[i51] = i54;
                            int i68 = (i54 / 3) << 1;
                            int i69 = i12 + 1;
                            objArr2[i68] = objArr[i12];
                            if ((charAt23 & 2048) != 0) {
                                i12 = i69 + 1;
                                objArr2[i68 + 1] = objArr[i69];
                                i51 = i67;
                            } else {
                                i51 = i67;
                                i12 = i69;
                            }
                        }
                        i12 = i17;
                    }
                    i11 = (int) unsafe.objectFieldOffset(a4);
                    if ((charAt23 & 4096) != 4096 || i60 > 17) {
                        i14 = 1048575;
                        i13 = 0;
                    } else {
                        int i70 = i24 + 1;
                        int charAt25 = str.charAt(i24);
                        if (charAt25 >= 55296) {
                            int i71 = charAt25 & 8191;
                            int i72 = 13;
                            while (true) {
                                i16 = i70 + 1;
                                charAt14 = str.charAt(i70);
                                if (charAt14 < 55296) {
                                    break;
                                }
                                i71 |= (charAt14 & 8191) << i72;
                                i72 += 13;
                                i70 = i16;
                            }
                            charAt25 = i71 | (charAt14 << i72);
                            i70 = i16;
                        }
                        int i73 = (i22 << 1) + (charAt25 / 32);
                        Object obj3 = objArr[i73];
                        if (obj3 instanceof Field) {
                            a = (Field) obj3;
                        } else {
                            a = m50707a(cls, (String) obj3);
                            objArr[i73] = a;
                        }
                        i14 = (int) unsafe.objectFieldOffset(a);
                        i13 = charAt25 % 32;
                        i24 = i70;
                    }
                    if (i60 >= 18 && i60 <= 49) {
                        iArr[i52] = i11;
                        i52++;
                    }
                }
                int i74 = i54 + 1;
                iArr2[i54] = charAt22;
                int i75 = i74 + 1;
                if ((charAt23 & 512) != 0) {
                    i15 = 536870912;
                } else {
                    i15 = 0;
                }
                iArr2[i74] = i15 | ((charAt23 & 256) != 0 ? 268435456 : 0) | (i60 << 20) | i11;
                i54 = i75 + 1;
                iArr2[i75] = (i13 << 20) | i14;
                i2 = i12;
            }
            return new C26024hu<>(iArr2, objArr2, charAt, charAt2, iiVar.f61334a, z, iArr, charAt5, i50, hyVar, haVar, jbVar, fxVar, hnVar);
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    private static Field m50707a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final T mo42694a() {
        return (T) this.f61311o.mo42703a(this.f61303g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final boolean mo42698a(T t, T t2) {
        boolean z;
        int length = this.f61299c.length;
        for (int i = 0; i < length; i += 3) {
            int d = m50728d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    if (m50727c(t, t2, i) && Double.doubleToLongBits(C26065jh.m50970e(t, j)) == Double.doubleToLongBits(C26065jh.m50970e(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m50727c(t, t2, i) && Float.floatToIntBits(C26065jh.m50967d(t, j)) == Float.floatToIntBits(C26065jh.m50967d(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m50727c(t, t2, i) && C26065jh.m50959b(t, j) == C26065jh.m50959b(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m50727c(t, t2, i) && C26065jh.m50959b(t, j) == C26065jh.m50959b(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (m50727c(t, t2, i) && C26065jh.m50959b(t, j) == C26065jh.m50959b(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (m50727c(t, t2, i) && C26065jh.m50966c(t, j) == C26065jh.m50966c(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (m50727c(t, t2, i) && C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (m50727c(t, t2, i) && C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (m50727c(t, t2, i) && C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j))) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (m50727c(t, t2, i) && C26065jh.m50959b(t, j) == C26065jh.m50959b(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m50727c(t, t2, i) && C26065jh.m50946a(t, j) == C26065jh.m50946a(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m50727c(t, t2, i) && C26065jh.m50959b(t, j) == C26065jh.m50959b(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m50727c(t, t2, i) && C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j))) {
                        continue;
                    }
                    return false;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j));
                    break;
                case 50:
                    z = C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case AudiencePingIntervalSetting.DEFAULT:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long e = (long) (m50730e(i) & 1048575);
                    if (C26065jh.m50946a(t, e) == C26065jh.m50946a(t2, e) && C26043im.m50852a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f61313q.mo42766b(t).equals(this.f61313q.mo42766b(t2))) {
            return false;
        }
        if (this.f61304h) {
            return this.f61314r.mo42579a((Object) t).equals(this.f61314r.mo42579a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final int mo42692a(T t) {
        int i;
        long j;
        int i2;
        int i3;
        int length = this.f61299c.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int d = m50728d(i5);
            int i6 = this.f61299c[i5];
            long j2 = (long) (1048575 & d);
            int i7 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = i4 * 53;
                    j = Double.doubleToLongBits(C26065jh.m50970e(t, j2));
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    i3 = Float.floatToIntBits(C26065jh.m50967d(t, j2));
                    i4 = i2 + i3;
                    break;
                case 2:
                    i = i4 * 53;
                    j = C26065jh.m50959b(t, j2);
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    j = C26065jh.m50959b(t, j2);
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i = i4 * 53;
                    j = C26065jh.m50959b(t, j2);
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i2 = i4 * 53;
                    i3 = C25989gm.m50598a(C26065jh.m50966c(t, j2));
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    i2 = i4 * 53;
                    i3 = ((String) C26065jh.m50971f(t, j2)).hashCode();
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    Object f = C26065jh.m50971f(t, j2);
                    if (f != null) {
                        i7 = f.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50971f(t, j2).hashCode();
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    i = i4 * 53;
                    j = C26065jh.m50959b(t, j2);
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50946a(t, j2);
                    i4 = i2 + i3;
                    break;
                case 16:
                    i = i4 * 53;
                    j = C26065jh.m50959b(t, j2);
                    i4 = i + ((int) (j ^ (j >>> 32)));
                    break;
                case 17:
                    Object f2 = C26065jh.m50971f(t, j2);
                    if (f2 != null) {
                        i7 = f2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50971f(t, j2).hashCode();
                    i4 = i2 + i3;
                    break;
                case 50:
                    i2 = i4 * 53;
                    i3 = C26065jh.m50971f(t, j2).hashCode();
                    i4 = i2 + i3;
                    break;
                case 51:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = Double.doubleToLongBits(m50718b(t, j2));
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = Float.floatToIntBits(m50725c(t, j2));
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = m50731e(t, j2);
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = m50731e(t, j2);
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = m50731e(t, j2);
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = C25989gm.m50598a(m50734f(t, j2));
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = ((String) C26065jh.m50971f(t, j2)).hashCode();
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = C26065jh.m50971f(t, j2).hashCode();
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = C26065jh.m50971f(t, j2).hashCode();
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = m50731e(t, j2);
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = m50729d(t, j2);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m50715a(t, i6, i5)) {
                        i = i4 * 53;
                        j = m50731e(t, j2);
                        i4 = i + ((int) (j ^ (j >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m50715a(t, i6, i5)) {
                        i2 = i4 * 53;
                        i3 = C26065jh.m50971f(t, j2).hashCode();
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.f61313q.mo42766b(t).hashCode();
        return this.f61304h ? (hashCode * 53) + this.f61314r.mo42579a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    private final void m50713a(T t, T t2, int i) {
        long d = (long) (m50728d(i) & 1048575);
        if (m50714a((Object) t2, i)) {
            Object f = C26065jh.m50971f(t, d);
            Object f2 = C26065jh.m50971f(t2, d);
            if (f != null) {
                if (f2 != null) {
                    C26065jh.m50955a(t, d, C25989gm.m50600a(f, f2));
                    m50721b((Object) t, i);
                }
            } else if (f2 != null) {
                C26065jh.m50955a(t, d, f2);
                m50721b((Object) t, i);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: b */
    public final int mo42699b(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 267386880;
        int i12 = 1048575;
        if (this.f61306j) {
            Unsafe unsafe = f61298b;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f61299c.length; i14 += 3) {
                int d = m50728d(i14);
                int i15 = (d & 267386880) >>> 20;
                int i16 = this.f61299c[i14];
                long j = (long) (d & 1048575);
                int i17 = (i15 < EnumC25975gd.DOUBLE_LIST_PACKED.zza() || i15 > EnumC25975gd.SINT64_LIST_PACKED.zza()) ? 0 : this.f61299c[i14 + 2] & 1048575;
                switch (i15) {
                    case 0:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50391j(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50389i(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50377d(i16, C26065jh.m50959b(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50380e(i16, C26065jh.m50959b(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50383f(i16, C26065jh.m50946a(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50385g(i16);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50379e(i16);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50392k(i16);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (m50714a((Object) t, i14)) {
                            Object f = C26065jh.m50971f(t, j);
                            if (f instanceof AbstractC25943fb) {
                                i7 = AbstractC25958fq.m50374c(i16, (AbstractC25943fb) f);
                                break;
                            } else {
                                i7 = AbstractC25958fq.m50369b(i16, (String) f);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = C26043im.m50839a(i16, C26065jh.m50971f(t, j), m50704a(i14));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50374c(i16, (AbstractC25943fb) C26065jh.m50971f(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50386g(i16, C26065jh.m50946a(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50390i(i16, C26065jh.m50946a(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50382f(i16);
                            break;
                        } else {
                            continue;
                        }
                    case ABRConfig.ABR_SELECT_SCENE:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50387h(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50388h(i16, C26065jh.m50946a(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50384f(i16, C26065jh.m50959b(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (m50714a((Object) t, i14)) {
                            i7 = AbstractC25958fq.m50375c(i16, (AbstractC26020hq) C26065jh.m50971f(t, j), m50704a(i14));
                            break;
                        } else {
                            continue;
                        }
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        i7 = C26043im.m50878i(i16, m50708a(t, j));
                        break;
                    case 19:
                        i7 = C26043im.m50875h(i16, m50708a(t, j));
                        break;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        i7 = C26043im.m50840a(i16, (List<Long>) m50708a(t, j));
                        break;
                    case 21:
                        i7 = C26043im.m50853b(i16, m50708a(t, j));
                        break;
                    case 22:
                        i7 = C26043im.m50866e(i16, m50708a(t, j));
                        break;
                    case 23:
                        i7 = C26043im.m50878i(i16, m50708a(t, j));
                        break;
                    case 24:
                        i7 = C26043im.m50875h(i16, m50708a(t, j));
                        break;
                    case 25:
                        i7 = C26043im.m50881j(i16, m50708a(t, j));
                        break;
                    case 26:
                        i7 = C26043im.m50883k(i16, m50708a(t, j));
                        break;
                    case 27:
                        i7 = C26043im.m50841a(i16, m50708a(t, j), m50704a(i14));
                        break;
                    case 28:
                        i7 = C26043im.m50885l(i16, m50708a(t, j));
                        break;
                    case 29:
                        i7 = C26043im.m50869f(i16, m50708a(t, j));
                        break;
                    case 30:
                        i7 = C26043im.m50863d(i16, m50708a(t, j));
                        break;
                    case 31:
                        i7 = C26043im.m50875h(i16, m50708a(t, j));
                        break;
                    case 32:
                        i7 = C26043im.m50878i(i16, m50708a(t, j));
                        break;
                    case 33:
                        i7 = C26043im.m50872g(i16, m50708a(t, j));
                        break;
                    case 34:
                        i7 = C26043im.m50860c(i16, m50708a(t, j));
                        break;
                    case 35:
                        i8 = C26043im.m50879i((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i8 = C26043im.m50876h((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i8 = C26043im.m50842a((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i8 = C26043im.m50855b((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i8 = C26043im.m50867e((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i8 = C26043im.m50879i((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i8 = C26043im.m50876h((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i8 = ((List) unsafe.getObject(t, j)).size();
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i8 = C26043im.m50870f((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case BuildConfig.VERSION_CODE:
                        i8 = C26043im.m50864d((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i8 = C26043im.m50876h((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i8 = C26043im.m50879i((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i8 = C26043im.m50873g((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i8 = C26043im.m50861c((List) unsafe.getObject(t, j));
                        if (i8 > 0) {
                            if (this.f61307k) {
                                unsafe.putInt(t, (long) i17, i8);
                            }
                            i9 = AbstractC25958fq.m50394m(i16 << 3);
                            i10 = AbstractC25958fq.m50394m(i8);
                            i7 = i9 + i10 + i8;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        i7 = C26043im.m50854b(i16, (List<AbstractC26020hq>) m50708a(t, j), m50704a(i14));
                        break;
                    case 50:
                        AbstractC26017hn hnVar = this.f61315s;
                        Object f2 = C26065jh.m50971f(t, j);
                        m50720b(i14);
                        i7 = hnVar.mo42688e(f2);
                        break;
                    case 51:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50391j(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50389i(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50377d(i16, m50731e(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50380e(i16, m50731e(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50383f(i16, m50729d(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50385g(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50379e(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50392k(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (m50715a(t, i16, i14)) {
                            Object f3 = C26065jh.m50971f(t, j);
                            if (f3 instanceof AbstractC25943fb) {
                                i7 = AbstractC25958fq.m50374c(i16, (AbstractC25943fb) f3);
                                break;
                            } else {
                                i7 = AbstractC25958fq.m50369b(i16, (String) f3);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case AudiencePingIntervalSetting.DEFAULT:
                        if (m50715a(t, i16, i14)) {
                            i7 = C26043im.m50839a(i16, C26065jh.m50971f(t, j), m50704a(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50374c(i16, (AbstractC25943fb) C26065jh.m50971f(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50386g(i16, m50729d(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50390i(i16, m50729d(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50382f(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50387h(i16);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50388h(i16, m50729d(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50384f(i16, m50731e(t, j));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (m50715a(t, i16, i14)) {
                            i7 = AbstractC25958fq.m50375c(i16, (AbstractC26020hq) C26065jh.m50971f(t, j), m50704a(i14));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                i13 += i7;
            }
            return i13 + m50698a((AbstractC26059jb) this.f61313q, (Object) t);
        }
        Unsafe unsafe2 = f61298b;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        int i21 = 0;
        while (i18 < this.f61299c.length) {
            int d2 = m50728d(i18);
            int[] iArr = this.f61299c;
            int i22 = iArr[i18];
            int i23 = (d2 & i11) >>> 20;
            if (i23 <= 17) {
                i = iArr[i18 + 2];
                int i24 = i & i12;
                i2 = 1 << (i >>> 20);
                if (i24 != i20) {
                    i21 = unsafe2.getInt(t, (long) i24);
                    i20 = i24;
                }
            } else {
                i = (!this.f61307k || i23 < EnumC25975gd.DOUBLE_LIST_PACKED.zza() || i23 > EnumC25975gd.SINT64_LIST_PACKED.zza()) ? 0 : this.f61299c[i18 + 2] & i12;
                i2 = 0;
            }
            long j2 = (long) (d2 & i12);
            switch (i23) {
                case 0:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50391j(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50389i(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50377d(i22, unsafe2.getLong(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50380e(i22, unsafe2.getLong(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50383f(i22, unsafe2.getInt(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50385g(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50379e(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50392k(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if ((i21 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j2);
                        i3 = object instanceof AbstractC25943fb ? AbstractC25958fq.m50374c(i22, (AbstractC25943fb) object) : AbstractC25958fq.m50369b(i22, (String) object);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = C26043im.m50839a(i22, unsafe2.getObject(t, j2), m50704a(i18));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50374c(i22, (AbstractC25943fb) unsafe2.getObject(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50386g(i22, unsafe2.getInt(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50390i(i22, unsafe2.getInt(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50382f(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50387h(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50388h(i22, unsafe2.getInt(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50384f(i22, unsafe2.getLong(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i21 & i2) != 0) {
                        i3 = AbstractC25958fq.m50375c(i22, (AbstractC26020hq) unsafe2.getObject(t, j2), m50704a(i18));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    i3 = C26043im.m50878i(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 19:
                    i3 = C26043im.m50875h(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    i3 = C26043im.m50840a(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 21:
                    i3 = C26043im.m50853b(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 22:
                    i3 = C26043im.m50866e(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 23:
                    i3 = C26043im.m50878i(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 24:
                    i3 = C26043im.m50875h(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 25:
                    i3 = C26043im.m50881j(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 26:
                    i3 = C26043im.m50883k(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 27:
                    i3 = C26043im.m50841a(i22, (List<?>) ((List) unsafe2.getObject(t, j2)), m50704a(i18));
                    i19 += i3;
                    break;
                case 28:
                    i3 = C26043im.m50885l(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 29:
                    i3 = C26043im.m50869f(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 30:
                    i3 = C26043im.m50863d(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 31:
                    i3 = C26043im.m50875h(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 32:
                    i3 = C26043im.m50878i(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 33:
                    i3 = C26043im.m50872g(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 34:
                    i3 = C26043im.m50860c(i22, (List) unsafe2.getObject(t, j2));
                    i19 += i3;
                    break;
                case 35:
                    i4 = C26043im.m50879i((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 36:
                    i4 = C26043im.m50876h((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 37:
                    i4 = C26043im.m50842a((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 38:
                    i4 = C26043im.m50855b((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 39:
                    i4 = C26043im.m50867e((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 40:
                    i4 = C26043im.m50879i((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 41:
                    i4 = C26043im.m50876h((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 42:
                    i4 = ((List) unsafe2.getObject(t, j2)).size();
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 43:
                    i4 = C26043im.m50870f((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case BuildConfig.VERSION_CODE:
                    i4 = C26043im.m50864d((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 45:
                    i4 = C26043im.m50876h((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 46:
                    i4 = C26043im.m50879i((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 47:
                    i4 = C26043im.m50873g((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 48:
                    i4 = C26043im.m50861c((List) unsafe2.getObject(t, j2));
                    if (i4 <= 0) {
                        break;
                    } else {
                        if (this.f61307k) {
                            unsafe2.putInt(t, (long) i, i4);
                        }
                        i5 = AbstractC25958fq.m50394m(i22 << 3);
                        i6 = AbstractC25958fq.m50394m(i4);
                        i19 += i5 + i6 + i4;
                        break;
                    }
                case 49:
                    i3 = C26043im.m50854b(i22, (List) unsafe2.getObject(t, j2), m50704a(i18));
                    i19 += i3;
                    break;
                case 50:
                    AbstractC26017hn hnVar2 = this.f61315s;
                    Object object2 = unsafe2.getObject(t, j2);
                    m50720b(i18);
                    i3 = hnVar2.mo42688e(object2);
                    i19 += i3;
                    break;
                case 51:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50391j(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50389i(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50377d(i22, m50731e(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50380e(i22, m50731e(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50383f(i22, m50729d(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50385g(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50379e(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50392k(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m50715a(t, i22, i18)) {
                        Object object3 = unsafe2.getObject(t, j2);
                        if (object3 instanceof AbstractC25943fb) {
                            i3 = AbstractC25958fq.m50374c(i22, (AbstractC25943fb) object3);
                        } else {
                            i3 = AbstractC25958fq.m50369b(i22, (String) object3);
                        }
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    if (m50715a(t, i22, i18)) {
                        i3 = C26043im.m50839a(i22, unsafe2.getObject(t, j2), m50704a(i18));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50374c(i22, (AbstractC25943fb) unsafe2.getObject(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50386g(i22, m50729d(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50390i(i22, m50729d(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50382f(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50387h(i22);
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50388h(i22, m50729d(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50384f(i22, m50731e(t, j2));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m50715a(t, i22, i18)) {
                        i3 = AbstractC25958fq.m50375c(i22, (AbstractC26020hq) unsafe2.getObject(t, j2), m50704a(i18));
                        i19 += i3;
                        break;
                    } else {
                        break;
                    }
            }
            i18 += 3;
            i11 = 267386880;
            i12 = 1048575;
        }
        int a = i19 + m50698a((AbstractC26059jb) this.f61313q, (Object) t);
        if (!this.f61304h) {
            return a;
        }
        C25969fy<?> a2 = this.f61314r.mo42579a((Object) t);
        int i25 = 0;
        for (int i26 = 0; i26 < a2.f61159a.mo42711b(); i26++) {
            Map.Entry<T, Object> b = a2.f61159a.mo42712b(i26);
            i25 += C25969fy.m50523a((AbstractC25972ga<?>) b.getKey(), b.getValue());
        }
        for (Map.Entry<T, Object> entry : a2.f61159a.mo42713c()) {
            i25 += C25969fy.m50523a((AbstractC25972ga<?>) entry.getKey(), entry.getValue());
        }
        return a + i25;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0a3e  */
    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42696a(T r13, com.google.android.gms.internal.measurement.AbstractC26081jt r14) {
        /*
        // Method dump skipped, instructions count: 2934
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.mo42696a(java.lang.Object, com.google.android.gms.internal.measurement.jt):void");
    }

    /* renamed from: a */
    private final <K, V> void m50711a(AbstractC26081jt jtVar, int i, Object obj, int i2) {
        if (obj != null) {
            AbstractC26017hn hnVar = this.f61315s;
            m50720b(i2);
            jtVar.mo42535a(i, hnVar.mo42681a(), this.f61315s.mo42685b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m50710a(AbstractC26059jb<UT, UB> jbVar, T t, AbstractC26081jt jtVar) {
        jbVar.mo42763a(jbVar.mo42766b(t), jtVar);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IndexInsnNode.isSame(IndexInsnNode.java:36)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    public final void mo42695a(T r12, com.google.android.gms.internal.measurement.AbstractC26037ig r13, com.google.android.gms.internal.measurement.C25965fv r14) {
        /*
        // Method dump skipped, instructions count: 1574
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.mo42695a(java.lang.Object, com.google.android.gms.internal.measurement.ig, com.google.android.gms.internal.measurement.fv):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f9, code lost:
        if (r7 == r4) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031f, code lost:
        if (r7 == r4) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x036f, code lost:
        r10 = r46;
        r6 = r20;
        r1 = r18;
        r4 = r50;
        r14 = r51;
        r3 = r52;
        r19 = r36;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42693a(T r47, byte[] r48, int r49, int r50, int r51, com.google.android.gms.internal.measurement.C25935ew r52) {
        /*
        // Method dump skipped, instructions count: 1024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.mo42693a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.ew):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025f, code lost:
        if (r5 == r11) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0286, code lost:
        if (r5 == r11) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        if (r5 == r5) goto L_0x0044;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42697a(T r36, byte[] r37, int r38, int r39, com.google.android.gms.internal.measurement.C25935ew r40) {
        /*
        // Method dump skipped, instructions count: 742
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.mo42697a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.ew):void");
    }

    /* renamed from: a */
    private final <UT, UB> UB m50706a(Object obj, int i, UB ub, AbstractC26059jb<UT, UB> jbVar) {
        AbstractC25990gn c;
        int i2 = this.f61299c[i];
        Object f = C26065jh.m50971f(obj, (long) (m50728d(i) & 1048575));
        return (f == null || (c = m50726c(i)) == null) ? ub : (UB) m50705a(i, i2, (Map<K, V>) this.f61315s.mo42683a(f), c, ub, jbVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.measurement.ik */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static boolean m50717a(Object obj, int i, AbstractC26041ik ikVar) {
        return ikVar.mo42702d(C26065jh.m50971f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m50709a(int i, Object obj, AbstractC26081jt jtVar) {
        if (obj instanceof String) {
            jtVar.mo42538a(i, (String) obj);
        } else {
            jtVar.mo42534a(i, (AbstractC25943fb) obj);
        }
    }

    /* renamed from: a */
    private final void m50712a(Object obj, int i, AbstractC26037ig igVar) {
        if (m50733f(i)) {
            C26065jh.m50955a(obj, (long) (i & 1048575), igVar.mo42481m());
        } else if (this.f61305i) {
            C26065jh.m50955a(obj, (long) (i & 1048575), igVar.mo42479l());
        } else {
            C26065jh.m50955a(obj, (long) (i & 1048575), igVar.mo42483n());
        }
    }

    /* renamed from: a */
    private final boolean m50716a(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m50714a((Object) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: a */
    private final boolean m50714a(T t, int i) {
        int e = m50730e(i);
        long j = (long) (e & 1048575);
        if (j == 1048575) {
            int d = m50728d(i);
            long j2 = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C26065jh.m50970e(t, j2) != 0.0d;
                case 1:
                    return C26065jh.m50967d(t, j2) != 0.0f;
                case 2:
                    return C26065jh.m50959b(t, j2) != 0;
                case 3:
                    return C26065jh.m50959b(t, j2) != 0;
                case 4:
                    return C26065jh.m50946a(t, j2) != 0;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return C26065jh.m50959b(t, j2) != 0;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return C26065jh.m50946a(t, j2) != 0;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return C26065jh.m50966c(t, j2);
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    Object f = C26065jh.m50971f(t, j2);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof AbstractC25943fb) {
                        return !AbstractC25943fb.zza.equals(f);
                    }
                    throw new IllegalArgumentException();
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return C26065jh.m50971f(t, j2) != null;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return !AbstractC25943fb.zza.equals(C26065jh.m50971f(t, j2));
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return C26065jh.m50946a(t, j2) != 0;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return C26065jh.m50946a(t, j2) != 0;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return C26065jh.m50946a(t, j2) != 0;
                case ABRConfig.ABR_SELECT_SCENE:
                    return C26065jh.m50959b(t, j2) != 0;
                case 15:
                    return C26065jh.m50946a(t, j2) != 0;
                case 16:
                    return C26065jh.m50959b(t, j2) != 0;
                case 17:
                    return C26065jh.m50971f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C26065jh.m50946a(t, j) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m50715a(T t, int i, int i2) {
        return C26065jh.m50946a(t, (long) (m50730e(i2) & 1048575)) == i;
    }

    static {
        Covode.recordClassIndex(31439);
    }

    /* renamed from: d */
    private final int m50728d(int i) {
        return this.f61299c[i + 1];
    }

    /* renamed from: e */
    private final int m50730e(int i) {
        return this.f61299c[i + 2];
    }

    /* renamed from: g */
    private final int m50735g(int i) {
        if (i < this.f61301e || i > this.f61302f) {
            return -1;
        }
        return m50719b(i, 0);
    }

    /* renamed from: c */
    private final AbstractC25990gn m50726c(int i) {
        return (AbstractC25990gn) this.f61300d[((i / 3) << 1) + 1];
    }

    /* renamed from: e */
    private static C26058ja m50732e(Object obj) {
        AbstractC25981gj gjVar = (AbstractC25981gj) obj;
        C26058ja jaVar = gjVar.zzb;
        if (jaVar != C26058ja.f61368a) {
            return jaVar;
        }
        C26058ja jaVar2 = new C26058ja();
        gjVar.zzb = jaVar2;
        return jaVar2;
    }

    /* renamed from: a */
    private final AbstractC26041ik m50704a(int i) {
        int i2 = (i / 3) << 1;
        AbstractC26041ik ikVar = (AbstractC26041ik) this.f61300d[i2];
        if (ikVar != null) {
            return ikVar;
        }
        AbstractC26041ik<T> a = C26036if.f61331a.mo42707a((Class) ((Class) this.f61300d[i2 + 1]));
        this.f61300d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m50720b(int i) {
        return this.f61300d[(i / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: c */
    public final void mo42701c(T t) {
        int i;
        int i2 = this.f61309m;
        while (true) {
            i = this.f61310n;
            if (i2 >= i) {
                break;
            }
            long d = (long) (m50728d(this.f61308l[i2]) & 1048575);
            Object f = C26065jh.m50971f(t, d);
            if (f != null) {
                C26065jh.m50955a(t, d, this.f61315s.mo42687d(f));
            }
            i2++;
        }
        int length = this.f61308l.length;
        while (i < length) {
            this.f61312p.mo42661b(t, (long) this.f61308l[i]);
            i++;
        }
        this.f61313q.mo42772d(t);
        if (this.f61304h) {
            this.f61314r.mo42587c(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.measurement.ik] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.ik] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42702d(T r17) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.mo42702d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static List<?> m50708a(Object obj, long j) {
        return (List) C26065jh.m50971f(obj, j);
    }

    /* renamed from: a */
    private final int m50697a(int i, int i2) {
        if (i < this.f61301e || i > this.f61302f) {
            return -1;
        }
        return m50719b(i, i2);
    }

    /* renamed from: b */
    private static <T> double m50718b(T t, long j) {
        return ((Double) C26065jh.m50971f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m50725c(T t, long j) {
        return ((Float) C26065jh.m50971f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m50729d(T t, long j) {
        return ((Integer) C26065jh.m50971f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m50731e(T t, long j) {
        return ((Long) C26065jh.m50971f(t, j)).longValue();
    }

    /* renamed from: a */
    private static <UT, UB> int m50698a(AbstractC26059jb<UT, UB> jbVar, T t) {
        return jbVar.mo42774f(jbVar.mo42766b(t));
    }

    /* renamed from: b */
    private final int m50719b(int i, int i2) {
        int length = (this.f61299c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f61299c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static <T> boolean m50734f(T t, long j) {
        return ((Boolean) C26065jh.m50971f(t, j)).booleanValue();
    }

    /* renamed from: b */
    private final void m50721b(T t, int i) {
        int e = m50730e(i);
        long j = (long) (1048575 & e);
        if (j != 1048575) {
            C26065jh.m50953a((Object) t, j, (1 << (e >>> 20)) | C26065jh.m50946a(t, j));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26041ik
    /* renamed from: b */
    public final void mo42700b(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f61299c.length; i += 3) {
            int d = m50728d(i);
            long j = (long) (1048575 & d);
            int i2 = this.f61299c[i];
            switch ((d & 267386880) >>> 20) {
                case 0:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50951a(t, j, C26065jh.m50970e(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50952a((Object) t, j, C26065jh.m50967d(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50954a((Object) t, j, C26065jh.m50959b(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50954a((Object) t, j, C26065jh.m50959b(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50954a((Object) t, j, C26065jh.m50959b(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50956a(t, j, C26065jh.m50966c(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50955a(t, j, C26065jh.m50971f(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    m50713a(t, t2, i);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50955a(t, j, C26065jh.m50971f(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50954a((Object) t, j, C26065jh.m50959b(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50953a((Object) t, j, C26065jh.m50946a(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m50714a((Object) t2, i)) {
                        C26065jh.m50954a((Object) t, j, C26065jh.m50959b(t2, j));
                        m50721b((Object) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m50713a(t, t2, i);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                case 19:
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case BuildConfig.VERSION_CODE:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f61312p.mo42660a(t, t2, j);
                    break;
                case 50:
                    C26065jh.m50955a(t, j, this.f61315s.mo42682a(C26065jh.m50971f(t, j), C26065jh.m50971f(t2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m50715a(t2, i2, i)) {
                        C26065jh.m50955a(t, j, C26065jh.m50971f(t2, j));
                        m50722b(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case AudiencePingIntervalSetting.DEFAULT:
                    m50724b(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m50715a(t2, i2, i)) {
                        C26065jh.m50955a(t, j, C26065jh.m50971f(t2, j));
                        m50722b(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m50724b(t, t2, i);
                    break;
            }
        }
        C26043im.m50851a(this.f61313q, t, t2);
        if (this.f61304h) {
            C26043im.m50850a(this.f61314r, t, t2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m50723b(T r18, com.google.android.gms.internal.measurement.AbstractC26081jt r19) {
        /*
        // Method dump skipped, instructions count: 1346
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.m50723b(java.lang.Object, com.google.android.gms.internal.measurement.jt):void");
    }

    /* renamed from: c */
    private final boolean m50727c(T t, T t2, int i) {
        if (m50714a((Object) t, i) == m50714a((Object) t2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m50722b(T t, int i, int i2) {
        C26065jh.m50953a((Object) t, (long) (m50730e(i2) & 1048575), i);
    }

    /* renamed from: b */
    private final void m50724b(T t, T t2, int i) {
        int d = m50728d(i);
        int i2 = this.f61299c[i];
        long j = (long) (d & 1048575);
        if (m50715a(t2, i2, i)) {
            Object f = C26065jh.m50971f(t, j);
            Object f2 = C26065jh.m50971f(t2, j);
            if (f != null) {
                if (f2 != null) {
                    C26065jh.m50955a(t, j, C25989gm.m50600a(f, f2));
                    m50722b(t, i2, i);
                }
            } else if (f2 != null) {
                C26065jh.m50955a(t, j, f2);
                m50722b(t, i2, i);
            }
        }
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m50705a(int i, int i2, Map<K, V> map, AbstractC25990gn gnVar, UB ub, AbstractC26059jb<UT, UB> jbVar) {
        AbstractC26017hn hnVar = this.f61315s;
        m50720b(i);
        C26015hl<?, ?> a = hnVar.mo42681a();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!gnVar.mo42041a(next.getValue().intValue())) {
                if (ub == null) {
                    ub = jbVar.mo42757a();
                }
                C25952fk b = AbstractC25943fb.m50229b(C26012hi.m50657a(a, next.getKey(), next.getValue()));
                try {
                    C26012hi.m50658a(b.f61120a, a, next.getKey(), next.getValue());
                    jbVar.mo42761a(ub, i2, b.mo42426a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    private static int m50702a(byte[] bArr, int i, int i2, EnumC26076jo joVar, Class<?> cls, C25935ew ewVar) {
        boolean z;
        switch (C26027hx.f61320a[joVar.ordinal()]) {
            case 1:
                int b = C25936ex.m50199b(bArr, i, ewVar);
                if (ewVar.f61087b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ewVar.f61088c = Boolean.valueOf(z);
                return b;
            case 2:
                return C25936ex.m50205e(bArr, i, ewVar);
            case 3:
                ewVar.f61088c = Double.valueOf(C25936ex.m50201c(bArr, i));
                return i + 8;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                ewVar.f61088c = Integer.valueOf(C25936ex.m50196a(bArr, i));
                return i + 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                ewVar.f61088c = Long.valueOf(C25936ex.m50200b(bArr, i));
                return i + 8;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                ewVar.f61088c = Float.valueOf(C25936ex.m50203d(bArr, i));
                return i + 4;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                int a = C25936ex.m50197a(bArr, i, ewVar);
                ewVar.f61088c = Integer.valueOf(ewVar.f61086a);
                return a;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                int b2 = C25936ex.m50199b(bArr, i, ewVar);
                ewVar.f61088c = Long.valueOf(ewVar.f61087b);
                return b2;
            case ABRConfig.ABR_SELECT_SCENE:
                return C25936ex.m50195a(C26036if.f61331a.mo42707a((Class) cls), bArr, i, i2, ewVar);
            case 15:
                int a2 = C25936ex.m50197a(bArr, i, ewVar);
                ewVar.f61088c = Integer.valueOf(AbstractC25955fn.m50256e(ewVar.f61086a));
                return a2;
            case 16:
                int b3 = C25936ex.m50199b(bArr, i, ewVar);
                ewVar.f61088c = Long.valueOf(AbstractC25955fn.m50254a(ewVar.f61087b));
                return b3;
            case 17:
                return C25936ex.m50204d(bArr, i, ewVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x004b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x004b */
    /* renamed from: a */
    private final <K, V> int m50701a(T t, byte[] bArr, int i, int i2, int i3, long j, C25935ew ewVar) {
        Unsafe unsafe = f61298b;
        m50720b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f61315s.mo42686c(object)) {
            Object b = this.f61315s.mo42684b();
            this.f61315s.mo42682a(b, object);
            unsafe.putObject(t, j, b);
            object = b;
        }
        C26015hl<?, ?> a = this.f61315s.mo42681a();
        Map<?, ?> a2 = this.f61315s.mo42683a(object);
        int a3 = C25936ex.m50197a(bArr, i, ewVar);
        int i4 = ewVar.f61086a;
        if (i4 < 0 || i4 > i2 - a3) {
            throw C25994gr.m50607a();
        }
        int i5 = i4 + a3;
        C57577a.C57578a aVar = (K) a.f61292b;
        C57577a.C57578a aVar2 = (V) a.f61294d;
        while (a3 < i5) {
            int i6 = a3 + 1;
            byte b2 = bArr[a3];
            int i7 = b2;
            if (b2 < 0) {
                i6 = C25936ex.m50192a(b2, bArr, i6, ewVar);
                i7 = ewVar.f61086a;
            }
            int i8 = (i7 == 1 ? 1 : 0) >>> 3;
            int i9 = (i7 == 1 ? 1 : 0) & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == a.f61293c.zzb()) {
                    a3 = m50702a(bArr, i6, i2, a.f61293c, a.f61294d.getClass(), ewVar);
                    aVar2 = (V) ewVar.f61088c;
                }
            } else if (i9 == a.f61291a.zzb()) {
                a3 = m50702a(bArr, i6, i2, a.f61291a, (Class<?>) null, ewVar);
                aVar = (K) ewVar.f61088c;
            }
            a3 = C25936ex.m50189a(i7, bArr, i6, i2, ewVar);
        }
        if (a3 == i5) {
            a2.put(aVar, aVar2);
            return i5;
        }
        throw C25994gr.m50613g();
    }

    /* renamed from: a */
    private final int m50699a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C25935ew ewVar) {
        boolean z;
        Object object;
        Object object2;
        int i9 = i;
        Unsafe unsafe = f61298b;
        long j2 = (long) (this.f61299c[i8 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(C25936ex.m50201c(bArr, i9)));
                    i9 += 8;
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(C25936ex.m50203d(bArr, i9)));
                    i9 += 4;
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = C25936ex.m50199b(bArr, i9, ewVar);
                    unsafe.putObject(t, j, Long.valueOf(ewVar.f61087b));
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = C25936ex.m50197a(bArr, i9, ewVar);
                    unsafe.putObject(t, j, Integer.valueOf(ewVar.f61086a));
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C25936ex.m50200b(bArr, i9)));
                    i9 += 8;
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C25936ex.m50196a(bArr, i9)));
                    i9 += 4;
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 58:
                if (i5 == 0) {
                    i9 = C25936ex.m50199b(bArr, i9, ewVar);
                    if (ewVar.f61087b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t, j, Boolean.valueOf(z));
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 59:
                if (i5 == 2) {
                    i9 = C25936ex.m50197a(bArr, i9, ewVar);
                    int i10 = ewVar.f61086a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) == 0 || C26071jj.m51024a(bArr, i9, i9 + i10)) {
                        unsafe.putObject(t, j, new String(bArr, i9, i10, C25989gm.f61260a));
                        i9 += i10;
                    } else {
                        throw C25994gr.m50614h();
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case AudiencePingIntervalSetting.DEFAULT:
                if (i5 == 2) {
                    i9 = C25936ex.m50195a(m50704a(i8), bArr, i9, i2, ewVar);
                    if (unsafe.getInt(t, j2) != i4 || (object = unsafe.getObject(t, j)) == null) {
                        unsafe.putObject(t, j, ewVar.f61088c);
                    } else {
                        unsafe.putObject(t, j, C25989gm.m50600a(object, ewVar.f61088c));
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 61:
                if (i5 == 2) {
                    i9 = C25936ex.m50205e(bArr, i9, ewVar);
                    unsafe.putObject(t, j, ewVar.f61088c);
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 63:
                if (i5 == 0) {
                    i9 = C25936ex.m50197a(bArr, i9, ewVar);
                    int i11 = ewVar.f61086a;
                    AbstractC25990gn c = m50726c(i8);
                    if (c != null && !c.mo42041a(i11)) {
                        m50732e(t).mo42752a(i3, Long.valueOf((long) i11));
                        break;
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i11));
                        unsafe.putInt(t, j2, i4);
                        break;
                    }
                }
                break;
            case 66:
                if (i5 == 0) {
                    i9 = C25936ex.m50197a(bArr, i9, ewVar);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC25955fn.m50256e(ewVar.f61086a)));
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 67:
                if (i5 == 0) {
                    i9 = C25936ex.m50199b(bArr, i9, ewVar);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC25955fn.m50254a(ewVar.f61087b)));
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 68:
                if (i5 == 3) {
                    i9 = C25936ex.m50194a(m50704a(i8), bArr, i9, i2, (i3 & -8) | 4, ewVar);
                    if (unsafe.getInt(t, j2) != i4 || (object2 = unsafe.getObject(t, j)) == null) {
                        unsafe.putObject(t, j, ewVar.f61088c);
                    } else {
                        unsafe.putObject(t, j, C25989gm.m50600a(object2, ewVar.f61088c));
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
        }
        return i9;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018f  */
    /* renamed from: a */
    private final int m50700a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C25935ew r29) {
        /*
        // Method dump skipped, instructions count: 1072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C26024hu.m50700a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.ew):int");
    }

    private C26024hu(int[] iArr, Object[] objArr, int i, int i2, AbstractC26020hq hqVar, boolean z, int[] iArr2, int i3, int i4, AbstractC26028hy hyVar, AbstractC26004ha haVar, AbstractC26059jb<?, ?> jbVar, AbstractC25968fx<?> fxVar, AbstractC26017hn hnVar) {
        boolean z2;
        this.f61299c = iArr;
        this.f61300d = objArr;
        this.f61301e = i;
        this.f61302f = i2;
        this.f61305i = hqVar instanceof AbstractC25981gj;
        this.f61306j = z;
        if (fxVar == null || !fxVar.mo42582a(hqVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f61304h = z2;
        this.f61307k = false;
        this.f61308l = iArr2;
        this.f61309m = i3;
        this.f61310n = i4;
        this.f61311o = hyVar;
        this.f61312p = haVar;
        this.f61313q = jbVar;
        this.f61314r = fxVar;
        this.f61303g = hqVar;
        this.f61315s = hnVar;
    }
}
