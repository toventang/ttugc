package com.google.android.gms.common;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.C25595a;
import com.google.android.gms.common.util.C25607i;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.o */
public final /* synthetic */ class CallableC25583o implements Callable {

    /* renamed from: a */
    private final boolean f60657a;

    /* renamed from: b */
    private final String f60658b;

    /* renamed from: c */
    private final AbstractBinderC25582n f60659c;

    static {
        Covode.recordClassIndex(30990);
    }

    CallableC25583o(boolean z, String str, AbstractBinderC25582n nVar) {
        this.f60657a = z;
        this.f60658b = str;
        this.f60659c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        boolean z = this.f60657a;
        String str2 = this.f60658b;
        AbstractBinderC25582n nVar = this.f60659c;
        if (z || !C25581m.m49373b(str2, nVar, true, false).f60700b) {
            str = "not whitelisted";
        } else {
            str = "debug cert rejected";
        }
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = str2;
        byte[] digest = C25595a.m49401a("SHA-1").digest(nVar.mo41839c());
        char[] cArr = new char[(digest.length << 1)];
        int i = 0;
        for (byte b : digest) {
            int i2 = b & 255;
            int i3 = i + 1;
            cArr[i] = C25607i.f60720a[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = C25607i.f60720a[i2 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return C1764a.m5928a("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
