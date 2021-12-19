package com.facebook.drawee.p1852d.p1853a;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.C24202c;

/* renamed from: com.facebook.drawee.d.a.a */
public final class C24208a extends C24202c {

    /* renamed from: a */
    private long f57341a = -1;

    /* renamed from: b */
    private long f57342b = -1;

    /* renamed from: c */
    private AbstractC24209b f57343c;

    static {
        Covode.recordClassIndex(28339);
    }

    public C24208a(AbstractC24209b bVar) {
        this.f57343c = bVar;
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onSubmit(String str, Object obj) {
        this.f57341a = System.currentTimeMillis();
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f57342b = currentTimeMillis;
        AbstractC24209b bVar = this.f57343c;
        if (bVar != null) {
            bVar.mo39834a(currentTimeMillis - this.f57341a);
        }
    }
}
