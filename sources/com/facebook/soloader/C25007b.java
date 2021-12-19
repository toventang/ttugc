package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
public final class C25007b extends AbstractC25017i {

    /* renamed from: a */
    private Context f59336a;

    /* renamed from: b */
    private int f59337b;

    /* renamed from: c */
    private C25008c f59338c;

    static {
        Covode.recordClassIndex(30338);
    }

    @Override // com.facebook.soloader.AbstractC25017i
    public final String toString() {
        return this.f59338c.toString();
    }

    /* renamed from: a */
    public final boolean mo40901a() {
        try {
            File file = this.f59338c.f59339b;
            Context context = this.f59336a;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            this.f59337b |= 1;
            C25008c cVar = new C25008c(file2, this.f59337b);
            this.f59338c = cVar;
            cVar.mo40900a(this.f59337b);
            this.f59336a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC25017i
    /* renamed from: a */
    public final void mo40900a(int i) {
        this.f59338c.mo40900a(i);
    }

    public C25007b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f59336a = applicationContext;
        if (applicationContext == null) {
            this.f59336a = context;
        }
        this.f59337b = i;
        this.f59338c = new C25008c(new File(this.f59336a.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.AbstractC25017i
    /* renamed from: a */
    public final int mo40899a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f59338c.mo40899a(str, i, threadPolicy);
    }
}
