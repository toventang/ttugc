package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: androidx.core.app.n */
public final class C0616n {

    /* renamed from: a */
    public final String f2610a;

    /* renamed from: b */
    public final CharSequence f2611b;

    /* renamed from: c */
    public final CharSequence[] f2612c;

    /* renamed from: d */
    public final boolean f2613d;

    /* renamed from: e */
    public final int f2614e;

    /* renamed from: f */
    public final Bundle f2615f;

    /* renamed from: g */
    public final Set<String> f2616g;

    static {
        Covode.recordClassIndex(694);
    }

    /* renamed from: a */
    static RemoteInput[] m2307a(C0616n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            C0616n nVar = nVarArr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(nVar.f2610a).setLabel(nVar.f2611b).setChoices(nVar.f2612c).setAllowFreeFormInput(nVar.f2613d).addExtras(nVar.f2615f);
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(nVar.f2614e);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
