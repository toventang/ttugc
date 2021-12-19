package com.google.android.gms.common;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.AbstractBinderC25519al;
import com.google.android.gms.common.internal.AbstractC25517aj;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1934b.AbstractC25324a;
import com.google.android.gms.p1934b.BinderC25327b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.n */
public abstract class AbstractBinderC25582n extends AbstractBinderC25519al {

    /* renamed from: a */
    private int f60656a;

    static {
        Covode.recordClassIndex(30989);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract byte[] mo41839c();

    public int hashCode() {
        return this.f60656a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25517aj
    /* renamed from: b */
    public final int mo41768b() {
        return hashCode();
    }

    @Override // com.google.android.gms.common.internal.AbstractC25517aj
    /* renamed from: a */
    public final AbstractC25324a mo41767a() {
        return BinderC25327b.m48694a(mo41839c());
    }

    /* renamed from: a */
    protected static byte[] m49374a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    protected AbstractBinderC25582n(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49324b(z);
        this.f60656a = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractC25517aj)) {
            try {
                AbstractC25517aj ajVar = (AbstractC25517aj) obj;
                if (ajVar.mo41768b() != hashCode()) {
                    return false;
                }
                AbstractC25324a a = ajVar.mo41767a();
                if (a == null) {
                    return false;
                }
                return Arrays.equals(mo41839c(), (byte[]) BinderC25327b.m48695a(a));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
