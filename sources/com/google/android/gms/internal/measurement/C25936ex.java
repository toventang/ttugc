package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ex */
public final class C25936ex {
    static {
        Covode.recordClassIndex(31351);
    }

    /* renamed from: a */
    static int m50196a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m50198a(byte[] bArr, int i, AbstractC25995gs<?> gsVar, C25935ew ewVar) {
        C25987gk gkVar = (C25987gk) gsVar;
        int a = m50197a(bArr, i, ewVar);
        int i2 = ewVar.f61086a + a;
        while (a < i2) {
            a = m50197a(bArr, a, ewVar);
            gkVar.mo42634d(ewVar.f61086a);
        }
        if (a == i2) {
            return a;
        }
        throw C25994gr.m50607a();
    }

    /* renamed from: c */
    static double m50201c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m50200b(bArr, i));
    }

    /* renamed from: d */
    static float m50203d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m50196a(bArr, i));
    }

    /* renamed from: b */
    static long m50200b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    static int m50197a(byte[] bArr, int i, C25935ew ewVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m50192a(b, bArr, i2, ewVar);
        }
        ewVar.f61086a = b;
        return i2;
    }

    /* renamed from: c */
    static int m50202c(byte[] bArr, int i, C25935ew ewVar) {
        int a = m50197a(bArr, i, ewVar);
        int i2 = ewVar.f61086a;
        if (i2 < 0) {
            throw C25994gr.m50608b();
        } else if (i2 == 0) {
            ewVar.f61088c = "";
            return a;
        } else {
            ewVar.f61088c = new String(bArr, a, i2, C25989gm.f61260a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m50204d(byte[] bArr, int i, C25935ew ewVar) {
        int a = m50197a(bArr, i, ewVar);
        int i2 = ewVar.f61086a;
        if (i2 < 0) {
            throw C25994gr.m50608b();
        } else if (i2 == 0) {
            ewVar.f61088c = "";
            return a;
        } else {
            ewVar.f61088c = C26071jj.m51025b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: b */
    static int m50199b(byte[] bArr, int i, C25935ew ewVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            ewVar.f61087b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        ewVar.f61087b = j2;
        return i3;
    }

    /* renamed from: e */
    static int m50205e(byte[] bArr, int i, C25935ew ewVar) {
        int a = m50197a(bArr, i, ewVar);
        int i2 = ewVar.f61086a;
        if (i2 < 0) {
            throw C25994gr.m50608b();
        } else if (i2 > bArr.length - a) {
            throw C25994gr.m50607a();
        } else if (i2 == 0) {
            ewVar.f61088c = AbstractC25943fb.zza;
            return a;
        } else {
            ewVar.f61088c = AbstractC25943fb.zza(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: a */
    static int m50192a(int i, byte[] bArr, int i2, C25935ew ewVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            ewVar.f61086a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            ewVar.f61086a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ewVar.f61086a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ewVar.f61086a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ewVar.f61086a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: a */
    static int m50189a(int i, byte[] bArr, int i2, int i3, C25935ew ewVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m50199b(bArr, i2, ewVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m50197a(bArr, i2, ewVar) + ewVar.f61086a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m50197a(bArr, i2, ewVar);
                    i6 = ewVar.f61086a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m50189a(i6, bArr, i2, i3, ewVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C25994gr.m50613g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C25994gr.m50610d();
            }
        } else {
            throw C25994gr.m50610d();
        }
    }

    /* renamed from: a */
    static int m50195a(AbstractC26041ik ikVar, byte[] bArr, int i, int i2, C25935ew ewVar) {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = m50192a(b, bArr, i3, ewVar);
            b2 = ewVar.f61086a;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw C25994gr.m50607a();
        }
        Object a = ikVar.mo42694a();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        ikVar.mo42697a(a, bArr, i3, i4, ewVar);
        ikVar.mo42701c(a);
        ewVar.f61088c = a;
        return i4;
    }

    /* renamed from: a */
    static int m50190a(int i, byte[] bArr, int i2, int i3, AbstractC25995gs<?> gsVar, C25935ew ewVar) {
        C25987gk gkVar = (C25987gk) gsVar;
        int a = m50197a(bArr, i2, ewVar);
        gkVar.mo42634d(ewVar.f61086a);
        while (a < i3) {
            int a2 = m50197a(bArr, a, ewVar);
            if (i != ewVar.f61086a) {
                break;
            }
            a = m50197a(bArr, a2, ewVar);
            gkVar.mo42634d(ewVar.f61086a);
        }
        return a;
    }

    /* renamed from: a */
    static int m50191a(int i, byte[] bArr, int i2, int i3, C26058ja jaVar, C25935ew ewVar) {
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int b = m50199b(bArr, i4, ewVar);
                jaVar.mo42752a(i, Long.valueOf(ewVar.f61087b));
                return b;
            } else if (i5 == 1) {
                jaVar.mo42752a(i, Long.valueOf(m50200b(bArr, i4)));
                return i4 + 8;
            } else if (i5 == 2) {
                int a = m50197a(bArr, i4, ewVar);
                int i6 = ewVar.f61086a;
                if (i6 < 0) {
                    throw C25994gr.m50608b();
                } else if (i6 <= bArr.length - a) {
                    if (i6 == 0) {
                        jaVar.mo42752a(i, AbstractC25943fb.zza);
                    } else {
                        jaVar.mo42752a(i, AbstractC25943fb.zza(bArr, a, i6));
                    }
                    return a + i6;
                } else {
                    throw C25994gr.m50607a();
                }
            } else if (i5 == 3) {
                C26058ja jaVar2 = new C26058ja();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (i4 < i3) {
                    i4 = m50197a(bArr, i4, ewVar);
                    i8 = ewVar.f61086a;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = m50191a(i8, bArr, i4, i3, jaVar2, ewVar);
                }
                if (i4 > i3 || i8 != i7) {
                    throw C25994gr.m50613g();
                }
                jaVar.mo42752a(i, jaVar2);
                return i4;
            } else if (i5 == 5) {
                jaVar.mo42752a(i, Integer.valueOf(m50196a(bArr, i4)));
                return i4 + 4;
            } else {
                throw C25994gr.m50610d();
            }
        } else {
            throw C25994gr.m50610d();
        }
    }

    /* renamed from: a */
    static int m50194a(AbstractC26041ik ikVar, byte[] bArr, int i, int i2, int i3, C25935ew ewVar) {
        C26024hu huVar = (C26024hu) ikVar;
        Object a = huVar.mo42694a();
        int a2 = huVar.mo42693a(a, bArr, i, i2, i3, ewVar);
        huVar.mo42701c(a);
        ewVar.f61088c = a;
        return a2;
    }

    /* renamed from: a */
    static int m50193a(AbstractC26041ik<?> ikVar, int i, byte[] bArr, int i2, int i3, AbstractC25995gs<?> gsVar, C25935ew ewVar) {
        int a = m50195a(ikVar, bArr, i2, i3, ewVar);
        gsVar.add(ewVar.f61088c);
        while (a < i3) {
            int a2 = m50197a(bArr, a, ewVar);
            if (i != ewVar.f61086a) {
                break;
            }
            a = m50195a(ikVar, bArr, a2, i3, ewVar);
            gsVar.add(ewVar.f61088c);
        }
        return a;
    }
}
