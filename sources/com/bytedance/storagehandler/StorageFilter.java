package com.bytedance.storagehandler;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.p1746v.AbstractC23538b;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StorageFilter {

    /* renamed from: a */
    private static final Object f53678a = new Object();

    /* renamed from: b */
    private static volatile List<AbstractC23538b> f53679b;

    public static native void configStack(int i, boolean z);

    public static native void init(String str);

    public static native void test();

    static {
        Covode.recordClassIndex(26549);
        ByteHook.m7797a();
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("storagehandlerlib", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "storagehandlerlib");
    }

    private static boolean onDelete(String str) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        for (AbstractC23538b bVar : list) {
            if (!(bVar == null || bVar.mo38340a(str))) {
                return false;
            }
        }
        return true;
    }

    private static boolean onMkdir(String str) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onOpen(String str) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    /* renamed from: a */
    public static void m42816a(AbstractC23538b bVar) {
        MethodCollector.m26663i(2238);
        ArrayList arrayList = new ArrayList();
        synchronized (f53678a) {
            try {
                if (f53679b != null) {
                    for (AbstractC23538b bVar2 : f53679b) {
                        arrayList.add(bVar2);
                    }
                }
                arrayList.add(bVar);
                f53679b = arrayList;
            } finally {
                MethodCollector.m26664o(2238);
            }
        }
    }

    private static boolean onDeleteNative(String str, String str2) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        for (AbstractC23538b bVar : list) {
            if (!(bVar == null || bVar.mo38341a(str, str2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean onMkdirNative(String str, String str2) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onMkfifoNative(String str, String str2) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onOpenNative(String str, String str2) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onLinkNative(String str, String str2, String str3) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onRenameNative(String str, String str2, String str3) {
        List<AbstractC23538b> list = f53679b;
        if (list == null) {
            return true;
        }
        Iterator<AbstractC23538b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static void onIntercepted(String str, String str2, String str3, int i, int i2) {
        boolean z;
        List<AbstractC23538b> list = f53679b;
        if (list != null) {
            for (AbstractC23538b bVar : list) {
                if (bVar != null) {
                    AbstractC23538b.EnumC23539a aVar = AbstractC23538b.EnumC23539a.values()[i];
                    if (i2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo38339a(str, str3, aVar, z);
                }
            }
        }
    }
}
