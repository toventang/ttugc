package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.k */
public final class C0606k {

    /* renamed from: a */
    private static final Object f2567a = new Object();

    /* renamed from: b */
    private static Field f2568b;

    /* renamed from: c */
    private static boolean f2569c;

    /* renamed from: d */
    private static final Object f2570d = new Object();

    static {
        Covode.recordClassIndex(684);
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m2287a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m2286a(Notification notification) {
        synchronized (f2567a) {
            if (f2569c) {
                return null;
            }
            if (f2568b == null) {
                Field declaredField = Notification.class.getDeclaredField("extras");
                if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                    f2569c = true;
                    return null;
                }
                try {
                    declaredField.setAccessible(true);
                    f2568b = declaredField;
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                    f2569c = true;
                    return null;
                }
            }
            Bundle bundle = (Bundle) f2568b.get(notification);
            if (bundle == null) {
                bundle = new Bundle();
                f2568b.set(notification, bundle);
            }
            return bundle;
        }
    }

    /* renamed from: a */
    static Bundle[] m2288a(C0616n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            C0616n nVar = nVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", nVar.f2610a);
            bundle.putCharSequence("label", nVar.f2611b);
            bundle.putCharSequenceArray("choices", nVar.f2612c);
            bundle.putBoolean("allowFreeFormInput", nVar.f2613d);
            bundle.putBundle("extras", nVar.f2615f);
            Set<String> set = nVar.f2616g;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                for (String str : set) {
                    arrayList.add(str);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
