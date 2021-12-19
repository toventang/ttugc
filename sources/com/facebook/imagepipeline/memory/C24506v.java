package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.AbstractC24115k;
import com.facebook.common.p1835g.C24116l;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.memory.v */
public final class C24506v implements AbstractC24113i {

    /* renamed from: a */
    private final C24116l f58215a;

    /* renamed from: b */
    private final AbstractC24503s f58216b;

    static {
        Covode.recordClassIndex(28650);
    }

    @Override // com.facebook.common.p1835g.AbstractC24113i
    /* renamed from: a */
    public final /* synthetic */ AbstractC24115k mo39681a() {
        return new C24507w(this.f58216b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C24505u mo39678a(InputStream inputStream) {
        C24507w wVar = new C24507w(this.f58216b);
        try {
            return m46830a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C24505u mo39680a(byte[] bArr) {
        C24507w wVar = new C24507w(this.f58216b, bArr.length);
        try {
            wVar.write(bArr, 0, bArr.length);
            C24505u c = wVar.mo39691a();
            wVar.close();
            return c;
        } catch (IOException e) {
            throw C24098m.m45632b(e);
        } catch (Throwable th) {
            wVar.close();
            throw th;
        }
    }

    @Override // com.facebook.common.p1835g.AbstractC24113i
    /* renamed from: a */
    public final /* synthetic */ AbstractC24115k mo39682a(int i) {
        return new C24507w(this.f58216b, i);
    }

    public C24506v(AbstractC24503s sVar, C24116l lVar) {
        this.f58216b = sVar;
        this.f58215a = lVar;
    }

    /* renamed from: a */
    private C24505u m46830a(InputStream inputStream, C24507w wVar) {
        this.f58215a.mo39694a(inputStream, wVar);
        return wVar.mo39691a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C24505u mo39679a(InputStream inputStream, int i) {
        C24507w wVar = new C24507w(this.f58216b, i);
        try {
            return m46830a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }
}
