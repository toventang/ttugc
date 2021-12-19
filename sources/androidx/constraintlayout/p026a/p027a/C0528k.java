package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.C0539e;
import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.constraintlayout.a.a.k */
public final class C0528k {

    /* renamed from: a */
    static boolean[] f2099a = new boolean[3];

    static {
        Covode.recordClassIndex(595);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1997a(androidx.constraintlayout.p026a.p027a.C0520f r4, int r5) {
        /*
            androidx.constraintlayout.a.a.f$a[] r0 = r4.f1986G
            r1 = r0[r5]
            androidx.constraintlayout.a.a.f$a r0 = androidx.constraintlayout.p026a.p027a.C0520f.EnumC0522a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r0) goto L_0x000a
            return r3
        L_0x000a:
            float r2 = r4.f1990K
            r0 = 0
            r1 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.a.a.f$a[] r0 = r4.f1986G
            if (r5 != 0) goto L_0x001b
        L_0x0016:
            r1 = r0[r1]
            androidx.constraintlayout.a.a.f$a r0 = androidx.constraintlayout.p026a.p027a.C0520f.EnumC0522a.MATCH_CONSTRAINT
            return r3
        L_0x001b:
            r1 = 0
            goto L_0x0016
        L_0x001d:
            if (r5 != 0) goto L_0x002d
            int r0 = r4.f2032g
            if (r0 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r0 = r4.f2035j
            if (r0 != 0) goto L_0x002c
            int r0 = r4.f2036k
            if (r0 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r0 = r4.f2033h
            if (r0 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r4.f2038m
            if (r0 != 0) goto L_0x003a
            int r0 = r4.f2039n
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            return r3
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0528k.m1997a(androidx.constraintlayout.a.a.f, int):boolean");
    }

    /* renamed from: a */
    static void m1994a(int i, C0520f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        fVar.mo2306g();
        C0530m mVar = fVar.f2048w.f1965a;
        C0530m mVar2 = fVar.f2049x.f1965a;
        C0530m mVar3 = fVar.f2050y.f1965a;
        C0530m mVar4 = fVar.f2051z.f1965a;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (fVar.f1986G[0] != C0520f.EnumC0522a.MATCH_CONSTRAINT || !m1997a(fVar, 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(mVar.f2106g == 4 || mVar3.f2106g == 4)) {
            if (fVar.f1986G[0] != C0520f.EnumC0522a.FIXED) {
                if (z2) {
                    if (fVar.f2011ag != 8) {
                        int k = fVar.mo2310k();
                        mVar.f2106g = 1;
                        mVar3.f2106g = 1;
                        if (fVar.f2048w.f1968d == null && fVar.f2050y.f1968d == null) {
                            if (z) {
                                mVar3.mo2340a(mVar, 1, fVar.mo2308i());
                            } else {
                                mVar3.mo2344b(mVar, k);
                            }
                        } else if (fVar.f2048w.f1968d == null || fVar.f2050y.f1968d != null) {
                            if (fVar.f2048w.f1968d != null || fVar.f2050y.f1968d == null) {
                                if (!(fVar.f2048w.f1968d == null || fVar.f2050y.f1968d == null)) {
                                    if (z) {
                                        fVar.mo2308i().mo2348a(mVar);
                                        fVar.mo2308i().mo2348a(mVar3);
                                    }
                                    if (fVar.f1990K == 0.0f) {
                                        mVar.f2106g = 3;
                                        mVar3.f2106g = 3;
                                        mVar.mo2343b(mVar3, 0.0f);
                                        mVar3.mo2343b(mVar, 0.0f);
                                    } else {
                                        mVar.f2106g = 2;
                                        mVar3.f2106g = 2;
                                        mVar.mo2343b(mVar3, (float) (-k));
                                        mVar3.mo2343b(mVar, (float) k);
                                        fVar.mo2296c(k);
                                    }
                                }
                            } else if (z) {
                                mVar.mo2340a(mVar3, -1, fVar.mo2308i());
                            } else {
                                mVar.mo2344b(mVar3, -k);
                            }
                        } else if (z) {
                            mVar3.mo2340a(mVar, 1, fVar.mo2308i());
                        } else {
                            mVar3.mo2344b(mVar, k);
                        }
                    }
                }
            }
            if (fVar.f2048w.f1968d == null && fVar.f2050y.f1968d == null) {
                mVar.f2106g = 1;
                mVar3.f2106g = 1;
                if (z) {
                    mVar3.mo2340a(mVar, 1, fVar.mo2308i());
                } else {
                    mVar3.mo2344b(mVar, fVar.mo2310k());
                }
            } else if (fVar.f2048w.f1968d != null && fVar.f2050y.f1968d == null) {
                mVar.f2106g = 1;
                mVar3.f2106g = 1;
                if (z) {
                    mVar3.mo2340a(mVar, 1, fVar.mo2308i());
                } else {
                    mVar3.mo2344b(mVar, fVar.mo2310k());
                }
            } else if (fVar.f2048w.f1968d == null && fVar.f2050y.f1968d != null) {
                mVar.f2106g = 1;
                mVar3.f2106g = 1;
                mVar.mo2344b(mVar3, -fVar.mo2310k());
                if (z) {
                    mVar.mo2340a(mVar3, -1, fVar.mo2308i());
                } else {
                    mVar.mo2344b(mVar3, -fVar.mo2310k());
                }
            } else if (!(fVar.f2048w.f1968d == null || fVar.f2050y.f1968d == null)) {
                mVar.f2106g = 2;
                mVar3.f2106g = 2;
                if (z) {
                    fVar.mo2308i().mo2348a(mVar);
                    fVar.mo2308i().mo2348a(mVar3);
                    mVar.mo2345b(mVar3, -1, fVar.mo2308i());
                    mVar3.mo2345b(mVar, 1, fVar.mo2308i());
                } else {
                    mVar.mo2343b(mVar3, (float) (-fVar.mo2310k()));
                    mVar3.mo2343b(mVar, (float) fVar.mo2310k());
                }
            }
        }
        if (fVar.f1986G[1] != C0520f.EnumC0522a.MATCH_CONSTRAINT || !m1997a(fVar, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (mVar2.f2106g != 4 && mVar4.f2106g != 4) {
            if (fVar.f1986G[1] != C0520f.EnumC0522a.FIXED) {
                if (!z3) {
                    return;
                }
                if (fVar.f2011ag != 8) {
                    int l = fVar.mo2311l();
                    mVar2.f2106g = 1;
                    mVar4.f2106g = 1;
                    if (fVar.f2049x.f1968d == null && fVar.f2051z.f1968d == null) {
                        if (z) {
                            mVar4.mo2340a(mVar2, 1, fVar.mo2309j());
                            return;
                        } else {
                            mVar4.mo2344b(mVar2, l);
                            return;
                        }
                    } else if (fVar.f2049x.f1968d == null || fVar.f2051z.f1968d != null) {
                        if (fVar.f2049x.f1968d != null || fVar.f2051z.f1968d == null) {
                            if (fVar.f2049x.f1968d != null && fVar.f2051z.f1968d != null) {
                                if (z) {
                                    fVar.mo2309j().mo2348a(mVar2);
                                    fVar.mo2308i().mo2348a(mVar4);
                                }
                                if (fVar.f1990K == 0.0f) {
                                    mVar2.f2106g = 3;
                                    mVar4.f2106g = 3;
                                    mVar2.mo2343b(mVar4, 0.0f);
                                    mVar4.mo2343b(mVar2, 0.0f);
                                    return;
                                }
                                mVar2.f2106g = 2;
                                mVar4.f2106g = 2;
                                mVar2.mo2343b(mVar4, (float) (-l));
                                mVar4.mo2343b(mVar2, (float) l);
                                fVar.mo2298d(l);
                                if (fVar.f2002W > 0) {
                                    fVar.f1980A.f1965a.mo2339a(mVar2, fVar.f2002W);
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (z) {
                            mVar2.mo2340a(mVar4, -1, fVar.mo2309j());
                            return;
                        } else {
                            mVar2.mo2344b(mVar4, -l);
                            return;
                        }
                    } else if (z) {
                        mVar4.mo2340a(mVar2, 1, fVar.mo2309j());
                        return;
                    } else {
                        mVar4.mo2344b(mVar2, l);
                        return;
                    }
                }
            }
            if (fVar.f2049x.f1968d == null && fVar.f2051z.f1968d == null) {
                mVar2.f2106g = 1;
                mVar4.f2106g = 1;
                if (z) {
                    mVar4.mo2340a(mVar2, 1, fVar.mo2309j());
                } else {
                    mVar4.mo2344b(mVar2, fVar.mo2311l());
                }
                if (fVar.f1980A.f1968d != null) {
                    fVar.f1980A.f1965a.f2106g = 1;
                    mVar2.mo2339a(fVar.f1980A.f1965a, -fVar.f2002W);
                }
            } else if (fVar.f2049x.f1968d != null && fVar.f2051z.f1968d == null) {
                mVar2.f2106g = 1;
                mVar4.f2106g = 1;
                if (z) {
                    mVar4.mo2340a(mVar2, 1, fVar.mo2309j());
                } else {
                    mVar4.mo2344b(mVar2, fVar.mo2311l());
                }
                if (fVar.f2002W > 0) {
                    fVar.f1980A.f1965a.mo2339a(mVar2, fVar.f2002W);
                }
            } else if (fVar.f2049x.f1968d == null && fVar.f2051z.f1968d != null) {
                mVar2.f2106g = 1;
                mVar4.f2106g = 1;
                if (z) {
                    mVar2.mo2340a(mVar4, -1, fVar.mo2309j());
                } else {
                    mVar2.mo2344b(mVar4, -fVar.mo2311l());
                }
                if (fVar.f2002W > 0) {
                    fVar.f1980A.f1965a.mo2339a(mVar2, fVar.f2002W);
                }
            } else if (fVar.f2049x.f1968d != null && fVar.f2051z.f1968d != null) {
                mVar2.f2106g = 2;
                mVar4.f2106g = 2;
                if (z) {
                    mVar2.mo2345b(mVar4, -1, fVar.mo2309j());
                    mVar4.mo2345b(mVar2, 1, fVar.mo2309j());
                    fVar.mo2309j().mo2348a(mVar2);
                    fVar.mo2308i().mo2348a(mVar4);
                } else {
                    mVar2.mo2343b(mVar4, (float) (-fVar.mo2311l()));
                    mVar4.mo2343b(mVar2, (float) fVar.mo2311l());
                }
                if (fVar.f2002W > 0) {
                    fVar.f1980A.f1965a.mo2339a(mVar2, fVar.f2002W);
                }
            }
        }
    }

    /* renamed from: a */
    static void m1995a(C0520f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.f1984E[i3].f1965a.f2104e = fVar.f1987H.f2048w.f1965a;
        fVar.f1984E[i3].f1965a.f2105f = (float) i2;
        fVar.f1984E[i3].f1965a.f2115i = 1;
        fVar.f1984E[i4].f1965a.f2104e = fVar.f1984E[i3].f1965a;
        fVar.f1984E[i4].f1965a.f2105f = (float) fVar.mo2292b(i);
        fVar.f1984E[i4].f1965a.f2115i = 1;
    }

    /* renamed from: a */
    static void m1996a(C0523g gVar, C0539e eVar, C0520f fVar) {
        if (gVar.f1986G[0] != C0520f.EnumC0522a.WRAP_CONTENT && fVar.f1986G[0] == C0520f.EnumC0522a.MATCH_PARENT) {
            int i = fVar.f2048w.f1969e;
            int k = gVar.mo2310k() - fVar.f2050y.f1969e;
            fVar.f2048w.f1974j = eVar.mo2367a(fVar.f2048w);
            fVar.f2050y.f1974j = eVar.mo2367a(fVar.f2050y);
            eVar.mo2372a(fVar.f2048w.f1974j, i);
            eVar.mo2372a(fVar.f2050y.f1974j, k);
            fVar.f2028c = 2;
            fVar.mo2293b(i, k);
        }
        if (gVar.f1986G[1] != C0520f.EnumC0522a.WRAP_CONTENT && fVar.f1986G[1] == C0520f.EnumC0522a.MATCH_PARENT) {
            int i2 = fVar.f2049x.f1969e;
            int l = gVar.mo2311l() - fVar.f2051z.f1969e;
            fVar.f2049x.f1974j = eVar.mo2367a(fVar.f2049x);
            fVar.f2051z.f1974j = eVar.mo2367a(fVar.f2051z);
            eVar.mo2372a(fVar.f2049x.f1974j, i2);
            eVar.mo2372a(fVar.f2051z.f1974j, l);
            if (fVar.f2002W > 0 || fVar.f2011ag == 8) {
                fVar.f1980A.f1974j = eVar.mo2367a(fVar.f1980A);
                eVar.mo2372a(fVar.f1980A.f1974j, fVar.f2002W + i2);
            }
            fVar.f2029d = 2;
            fVar.mo2297c(i2, l);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0100, code lost:
        if (r6.f2020ap == 2) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010a, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r6.f2019ao == 2) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x00a3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m1998a(androidx.constraintlayout.p026a.C0539e r22, int r23, int r24, androidx.constraintlayout.p026a.p027a.C0514d r25) {
        /*
        // Method dump skipped, instructions count: 823
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0528k.m1998a(androidx.constraintlayout.a.e, int, int, androidx.constraintlayout.a.a.d):boolean");
    }
}
