package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.imagepipeline.memory.AbstractC24472a;

/* renamed from: com.facebook.imagepipeline.memory.s */
public abstract class AbstractC24503s extends AbstractC24472a<AbstractC24502r> {

    /* renamed from: g */
    final int[] f58212g;

    static {
        Covode.recordClassIndex(28647);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: d */
    public final int mo40343d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract AbstractC24502r mo40339b(int i);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: b */
    public final /* synthetic */ void mo40340b(AbstractC24502r rVar) {
        AbstractC24502r rVar2 = rVar;
        C24091i.m45617a(rVar2);
        rVar2.close();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final /* synthetic */ int mo40342c(AbstractC24502r rVar) {
        AbstractC24502r rVar2 = rVar;
        C24091i.m45617a(rVar2);
        return rVar2.getSize();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: d */
    public final /* synthetic */ boolean mo40344d(AbstractC24502r rVar) {
        AbstractC24502r rVar2 = rVar;
        C24091i.m45617a(rVar2);
        if (!rVar2.isClosed()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final int mo40341c(int i) {
        if (i > 0) {
            int[] iArr = this.f58212g;
            for (int i2 : iArr) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new AbstractC24472a.C24474b(Integer.valueOf(i));
    }

    AbstractC24503s(AbstractC24107d dVar, C24480ad adVar, AbstractC24481ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f58169c;
        this.f58212g = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f58212g;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                mo40338a();
                return;
            }
        }
    }
}
