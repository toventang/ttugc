package com.p2082ss.android.ttve.nativePort;

import android.content.Context;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.log.C30653a;
import com.p2082ss.android.vesdk.runtime.C85558g;
import com.p2082ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.d */
public class C30731d {

    /* renamed from: a */
    public static volatile EnumC30737f f73581a = EnumC30737f.NOT_LOAD;

    /* renamed from: b */
    public static final String f73582b = C30731d.class.getSimpleName();

    /* renamed from: c */
    public static AbstractC30735d f73583c = null;

    /* renamed from: d */
    public static AbstractC30734c f73584d = null;

    /* renamed from: e */
    public static Context f73585e;

    /* renamed from: f */
    public static boolean f73586f = false;

    /* renamed from: g */
    private static boolean f73587g;

    /* renamed from: h */
    private static AbstractC30735d f73588h = new C30733b();

    /* renamed from: i */
    private static AbstractC30734c f73589i = new C30732a();

    /* renamed from: j */
    private static ArrayList<C30736e> f73590j = new ArrayList<>();

    /* renamed from: k */
    private static List<String> f73591k = EffectSDKBuildConfig.getEffectLibs();

    /* renamed from: l */
    private static boolean f73592l = false;

    /* renamed from: com.ss.android.ttve.nativePort.d$a */
    public static class C30732a implements AbstractC30734c {
        static {
            Covode.recordClassIndex(37340);
        }

        @Override // com.p2082ss.android.ttve.nativePort.C30731d.AbstractC30734c
        /* renamed from: a */
        public final void mo55457a(String[] strArr) {
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$c */
    public interface AbstractC30734c {
        static {
            Covode.recordClassIndex(37342);
        }

        /* renamed from: a */
        void mo55457a(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$d */
    public interface AbstractC30735d {
        static {
            Covode.recordClassIndex(37343);
        }

        /* renamed from: a */
        boolean mo55458a(List<String> list);
    }

    /* renamed from: b */
    public static synchronized void m63117b() {
        synchronized (C30731d.class) {
            MethodCollector.m26663i(249);
            m63114a();
            MethodCollector.m26664o(249);
        }
    }

    /* renamed from: c */
    public static synchronized void m63118c() {
        synchronized (C30731d.class) {
            MethodCollector.m26663i(252);
            m63114a();
            MethodCollector.m26664o(252);
        }
    }

    /* renamed from: d */
    public static synchronized void m63119d() {
        synchronized (C30731d.class) {
            MethodCollector.m26663i(256);
            m63114a();
            MethodCollector.m26664o(256);
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$f */
    public enum EnumC30737f {
        NOT_LOAD,
        LOADING,
        LOADED;

        static {
            Covode.recordClassIndex(37345);
        }
    }

    static {
        Covode.recordClassIndex(37339);
    }

    /* renamed from: e */
    private static List<String> m63120e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("x264");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("fdk-aac");
        arrayList.addAll(FFmpegLibLoaderWrapper.m148177a());
        arrayList.add("yuv");
        arrayList.add("bytenn");
        arrayList.add("audioeffect");
        for (String str : f73591k) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        arrayList.add("lens");
        arrayList.add("ttvesdk");
        arrayList.add("bytebench");
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized void m63114a() {
        synchronized (C30731d.class) {
            MethodCollector.m26663i(192);
            if (!f73587g) {
                if (f73581a != EnumC30737f.LOADED) {
                    List<String> e = m63120e();
                    String[] strArr = new String[e.size()];
                    for (int i = 0; i < e.size(); i++) {
                        if (!e.get(i).contentEquals("c++_shared") && !e.get(i).contentEquals("ttboringssl") && !e.get(i).contentEquals("ttcrypto")) {
                            strArr[i] = "lib" + e.get(i) + ".so";
                        }
                    }
                    f73581a = EnumC30737f.LOADING;
                    AbstractC30735d dVar = f73583c;
                    if (dVar != null) {
                        if (!dVar.mo55458a(e)) {
                            f73581a = EnumC30737f.NOT_LOAD;
                            MethodCollector.m26664o(192);
                            return;
                        }
                    } else if (!f73588h.mo55458a(e)) {
                        f73581a = EnumC30737f.NOT_LOAD;
                        MethodCollector.m26664o(192);
                        return;
                    }
                    f73581a = EnumC30737f.LOADED;
                    AbstractC30734c cVar = f73584d;
                    if (cVar != null) {
                        cVar.mo55457a(strArr);
                    }
                }
                MethodCollector.m26664o(192);
                return;
            }
            m63116a("ttvesdk");
            MethodCollector.m26664o(192);
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$e */
    public static class C30736e {

        /* renamed from: a */
        public String f73593a;

        /* renamed from: b */
        public volatile boolean f73594b;

        static {
            Covode.recordClassIndex(37344);
        }

        public C30736e(String str) {
            this.f73593a = str;
        }
    }

    /* renamed from: a */
    public static synchronized void m63115a(Context context) {
        synchronized (C30731d.class) {
            MethodCollector.m26663i(3982);
            f73585e = context;
            MethodCollector.m26664o(3982);
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$b */
    public static class C30733b implements AbstractC30735d {
        static {
            Covode.recordClassIndex(37341);
        }

        @Override // com.p2082ss.android.ttve.nativePort.C30731d.AbstractC30735d
        /* renamed from: a */
        public final boolean mo55458a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                C30653a.m63007a(3, "Start loadLibrary ".concat(String.valueOf(str)));
                if (!C85558g.m147463a(str, C30731d.f73585e)) {
                    return false;
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            return true;
        }
    }

    /* renamed from: a */
    private static void m63116a(String str) {
        if (f73590j.size() <= 0) {
            List<String> e = m63120e();
            Collections.reverse(e);
            for (String str2 : e) {
                f73590j.add(new C30736e(str2));
            }
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C30736e> it = f73590j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C30736e next = it.next();
            if (str == next.f73593a) {
                if (!next.f73594b) {
                    next.f73594b = true;
                    linkedList.add(next.f73593a);
                } else {
                    return;
                }
            }
        }
        while (it.hasNext()) {
            C30736e next2 = it.next();
            if (next2.f73594b) {
                break;
            }
            next2.f73594b = true;
            linkedList.add(next2.f73593a);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            strArr[i] = "lib" + ((String) linkedList.get(i)) + ".so";
        }
        f73581a = EnumC30737f.LOADING;
        AbstractC30735d dVar = f73583c;
        if (dVar != null) {
            if (!dVar.mo55458a(linkedList)) {
                f73581a = EnumC30737f.NOT_LOAD;
                return;
            }
        } else if (!f73588h.mo55458a(linkedList)) {
            f73581a = EnumC30737f.NOT_LOAD;
            return;
        }
        f73581a = EnumC30737f.LOADED;
        AbstractC30734c cVar = f73584d;
        if (cVar != null) {
            cVar.mo55457a(strArr);
        }
    }
}
