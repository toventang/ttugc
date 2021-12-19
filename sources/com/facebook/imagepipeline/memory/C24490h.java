package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24107d;
import com.p2082ss.android.ugc.aweme.statistic.C75235a;

/* renamed from: com.facebook.imagepipeline.memory.h */
public final class C24490h extends AbstractC24472a<Bitmap> implements AbstractC24485d {
    static {
        Covode.recordClassIndex(28634);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final int mo40341c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: d */
    public final int mo40343d(int i) {
        return i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.memory.f] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo40337a(C24487f<Bitmap> fVar) {
        Bitmap bitmap = (Bitmap) super.mo40337a((C24487f) fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: b */
    public final /* synthetic */ void mo40340b(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        C24091i.m45617a(bitmap2);
        bitmap2.recycle();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: c */
    public final /* synthetic */ int mo40342c(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        C24091i.m45617a(bitmap2);
        return bitmap2.getAllocationByteCount();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: d */
    public final /* synthetic */ boolean mo40344d(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        C24091i.m45617a(bitmap2);
        if (bitmap2.isRecycled() || !bitmap2.isMutable()) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC24472a
    /* renamed from: b */
    public final /* synthetic */ Bitmap mo40339b(int i) {
        MethodCollector.m26663i(4366);
        C75235a.f169148b = i;
        C75235a.f169147a = Thread.currentThread().getName();
        double d = (double) i;
        Double.isNaN(d);
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
        MethodCollector.m26664o(4366);
        return createBitmap;
    }

    public C24490h(AbstractC24107d dVar, C24480ad adVar, AbstractC24481ae aeVar) {
        super(dVar, adVar, aeVar);
        mo40338a();
    }
}
