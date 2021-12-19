package com.bytedance.common.jato.p901a.p902a;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.bytedance.common.jato.a.a.a */
public final class C13524a {

    /* renamed from: a */
    public static ArrayMap<String, SharedPreferences> f32907a;

    /* renamed from: b */
    public static ArrayMap<File, SharedPreferences> f32908b;

    /* renamed from: c */
    public static ArrayMap<String, File> f32909c;

    /* renamed from: d */
    public static volatile boolean f32910d = true;

    /* renamed from: e */
    public static Application f32911e;

    /* renamed from: f */
    public static volatile boolean f32912f = false;

    /* renamed from: g */
    public static volatile boolean f32913g = false;

    /* renamed from: h */
    public static volatile boolean f32914h = false;

    /* renamed from: i */
    public static int f32915i = 1;

    /* renamed from: j */
    private static Thread f32916j = Looper.getMainLooper().getThread();

    /* renamed from: k */
    private static ArrayList<C13527b> f32917k = new ArrayList<>();

    /* renamed from: l */
    private static LinkedHashSet<C13527b> f32918l = new LinkedHashSet<>();

    static {
        Covode.recordClassIndex(15534);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m24303a() {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.p901a.p902a.C13524a.m24303a():void");
    }

    /* renamed from: b */
    public static synchronized void m24305b() {
        IOException e;
        synchronized (C13524a.class) {
            MethodCollector.m26663i(10683);
            if (f32911e == null) {
                MethodCollector.m26664o(10683);
                return;
            }
            BufferedWriter bufferedWriter = null;
            try {
                HashSet hashSet = new HashSet();
                hashSet.addAll(f32918l);
                hashSet.addAll(f32917k);
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList);
                File file = new File(f32911e.getFilesDir().toString() + "/jato_preload_sp_list.txt");
                if (!file.isFile()) {
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bufferedWriter2.write(((C13527b) it.next()).toString() + "\n");
                    }
                    bufferedWriter2.close();
                    m24304a(bufferedWriter2);
                    MethodCollector.m26664o(10683);
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    try {
                        e.printStackTrace();
                    } finally {
                        m24304a(bufferedWriter);
                        MethodCollector.m26664o(10683);
                    }
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    m24304a(bufferedWriter);
                    MethodCollector.m26664o(10683);
                }
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
            } catch (Throwable unused2) {
                m24304a(bufferedWriter);
                MethodCollector.m26664o(10683);
            }
        }
    }

    /* renamed from: a */
    private static void m24304a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
