package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ej */
final class RunnableC26358ej implements Runnable {

    /* renamed from: a */
    private final AbstractC26356eh f61886a;

    /* renamed from: b */
    private final int f61887b;

    /* renamed from: c */
    private final Throwable f61888c;

    /* renamed from: d */
    private final byte[] f61889d;

    /* renamed from: e */
    private final String f61890e;

    /* renamed from: f */
    private final Map<String, List<String>> f61891f;

    static {
        Covode.recordClassIndex(31780);
    }

    public final void run() {
        this.f61886a.mo43180a(this.f61890e, this.f61887b, this.f61888c, this.f61889d, this.f61891f);
    }

    private RunnableC26358ej(String str, AbstractC26356eh ehVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C25565r.m49314a(ehVar);
        this.f61886a = ehVar;
        this.f61887b = i;
        this.f61888c = th;
        this.f61889d = bArr;
        this.f61890e = str;
        this.f61891f = map;
    }

    /* synthetic */ RunnableC26358ej(String str, AbstractC26356eh ehVar, int i, Throwable th, byte[] bArr, Map map, byte b) {
        this(str, ehVar, i, th, bArr, map);
    }
}
