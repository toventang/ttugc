package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.imagepipeline.memory.AbstractC24472a;

/* renamed from: com.facebook.imagepipeline.memory.o */
public class C24499o extends AbstractC24472a<byte[]> implements AbstractC24104a {

    /* renamed from: g */
    private final int[] f58204g;

    static {
        Covode.recordClassIndex(28643);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: d */
    public final int mo40343d(int i) {
        return i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ byte[] mo40339b(int i) {
        return new byte[i];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: b */
    public final /* synthetic */ void mo40340b(byte[] bArr) {
        C24091i.m45617a(bArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final /* synthetic */ int mo40342c(byte[] bArr) {
        byte[] bArr2 = bArr;
        C24091i.m45617a(bArr2);
        return bArr2.length;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final int mo40341c(int i) {
        if (i > 0) {
            int[] iArr = this.f58204g;
            for (int i2 : iArr) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new AbstractC24472a.C24474b(Integer.valueOf(i));
    }

    public C24499o(AbstractC24107d dVar, C24480ad adVar, AbstractC24481ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f58169c;
        this.f58204g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f58204g[i] = sparseIntArray.keyAt(i);
        }
        mo40338a();
    }
}
