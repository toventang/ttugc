package dagger.hilt.android.internal.p4540c;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: dagger.hilt.android.internal.c.c */
public final class C88103c {

    /* renamed from: a */
    public final Context f199993a;

    static {
        Covode.recordClassIndex(104129);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Application mo142625a() {
        Context applicationContext = this.f199993a.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        return (Application) applicationContext;
    }

    public C88103c(Context context) {
        this.f199993a = context;
    }
}
