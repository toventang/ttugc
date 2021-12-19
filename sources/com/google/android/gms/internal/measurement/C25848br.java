package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.br */
public final /* synthetic */ class C25848br implements AbstractC25871cn {

    /* renamed from: a */
    private final Context f60980a;

    static {
        Covode.recordClassIndex(31263);
    }

    public C25848br(Context context) {
        this.f60980a = context;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25871cn
    /* renamed from: a */
    public final Object mo42201a() {
        Context context = this.f60980a;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            if (C25829az.m50014a() && !context.isDeviceProtectedStorage()) {
                context = context.createDeviceProtectedStorageContext();
            }
            AbstractC25867cj<File> a = C25844bn.m50039a(context);
            if (a.zza()) {
                return AbstractC25867cj.zza(C25844bn.m50038a(a.zzb()));
            }
        }
        return AbstractC25867cj.zzc();
    }
}
