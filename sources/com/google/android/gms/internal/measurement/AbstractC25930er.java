package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25930er;
import com.google.android.gms.internal.measurement.AbstractC25931es;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.er */
public abstract class AbstractC25930er<MessageType extends AbstractC25931es<MessageType, BuilderType>, BuilderType extends AbstractC25930er<MessageType, BuilderType>> implements AbstractC26023ht {
    static {
        Covode.recordClassIndex(31345);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo42353a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo42354a(AbstractC25955fn fnVar, C25965fv fvVar);

    /* renamed from: s */
    public abstract BuilderType clone();

    @Override // com.google.android.gms.internal.measurement.AbstractC26023ht
    /* renamed from: a */
    public final /* synthetic */ AbstractC26023ht mo42358a(byte[] bArr) {
        return mo42355a(bArr, bArr.length);
    }

    /* renamed from: a */
    private final String mo42018a(String str) {
        String name = getClass().getName();
        return new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length()).append("Reading ").append(name).append(" from a ").append(str).append(" threw an IOException (should never happen).").toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.internal.measurement.er<MessageType extends com.google.android.gms.internal.measurement.es<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.er<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC26023ht
    /* renamed from: a */
    public final /* synthetic */ AbstractC26023ht mo42357a(AbstractC26020hq hqVar) {
        if (mo42615H_().getClass().isInstance(hqVar)) {
            return mo42353a((AbstractC25931es) hqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public BuilderType mo42355a(byte[] bArr, int i) {
        try {
            AbstractC25955fn a = AbstractC25955fn.m50255a(bArr, i);
            mo42354a(a, C25965fv.m50500a());
            a.mo42428a(0);
            return this;
        } catch (C25994gr e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(mo42018a("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26023ht
    /* renamed from: a */
    public final /* synthetic */ AbstractC26023ht mo42359a(byte[] bArr, C25965fv fvVar) {
        return mo42356a(bArr, bArr.length, fvVar);
    }

    /* renamed from: a */
    public BuilderType mo42356a(byte[] bArr, int i, C25965fv fvVar) {
        try {
            AbstractC25955fn a = AbstractC25955fn.m50255a(bArr, i);
            mo42354a(a, fvVar);
            a.mo42428a(0);
            return this;
        } catch (C25994gr e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(mo42018a("byte array"), e2);
        }
    }
}
