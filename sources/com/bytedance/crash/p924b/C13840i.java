package com.bytedance.crash.p924b;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.apm.C12471g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.entity.C13869f;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.i */
public final class C13840i {

    /* renamed from: a */
    public static boolean f33692a;

    /* renamed from: b */
    static int f33693b;

    /* renamed from: c */
    static List<C13869f> f33694c;

    /* renamed from: d */
    public static volatile long f33695d = -1;

    /* renamed from: e */
    public static long f33696e = 100;

    /* renamed from: f */
    public static long f33697f;

    /* renamed from: g */
    public static long f33698g;

    /* renamed from: h */
    public static long f33699h;

    /* renamed from: i */
    public static int f33700i;

    /* renamed from: j */
    public static boolean f33701j;

    /* renamed from: k */
    public static volatile String f33702k;

    /* renamed from: l */
    public static volatile boolean f33703l;

    /* renamed from: m */
    public static int f33704m = -1;

    /* renamed from: n */
    public static volatile long f33705n;

    /* renamed from: o */
    public static long f33706o = -1;

    /* renamed from: p */
    public static long f33707p = -1;

    /* renamed from: q */
    private static int f33708q = -1;

    /* renamed from: r */
    private static MessageQueue f33709r;

    /* renamed from: s */
    private static Field f33710s;

    /* renamed from: t */
    private static Field f33711t;

    static {
        Covode.recordClassIndex(15897);
    }

    /* renamed from: d */
    public static long m25005d() {
        if (f33704m < 0) {
            return 0;
        }
        try {
            return NativeTools.m25458a().mo22568c(f33704m);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static JSONArray m25003b() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C13869f> f = m25007f();
            if (f == null) {
                return jSONArray;
            }
            for (C13869f fVar : f) {
                if (fVar != null) {
                    jSONArray.put(fVar.mo22353a());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* renamed from: e */
    public static JSONObject m25006e() {
        C13869f g = m25008g();
        JSONObject a = g.mo22353a();
        try {
            a.put("message", g.f33773g);
            a.put("currentMessageCost", g.f33770d);
            a.put("currentMessageCpu", g.f33771e);
            a.put("currentTick", f33695d);
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
        return a;
    }

    /* renamed from: g */
    private static C13869f m25008g() {
        if (C12471g.f30313a != null) {
            try {
                return C12471g.f30313a.mo20292b();
            } catch (Throwable unused) {
            }
        }
        C13869f fVar = new C13869f();
        fVar.f33773g = f33702k;
        long j = f33695d - f33707p;
        if (j <= 0) {
            j = 1;
        }
        fVar.f33770d = j * f33696e;
        fVar.f33771e = f33705n - f33698g;
        return fVar;
    }

    /* renamed from: c */
    public static MessageQueue m25004c() {
        if (f33709r == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f33709r = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f33709r = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f33709r = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f33709r;
    }

    /* renamed from: f */
    private static List<C13869f> m25007f() {
        if (C12471g.f30313a != null) {
            try {
                return C12471g.f30313a.mo20291a();
            } catch (Throwable unused) {
            }
        }
        if (f33694c == null) {
            return null;
        }
        f33703l = true;
        ArrayList arrayList = new ArrayList();
        if (f33694c.size() == f33693b) {
            for (int i = f33708q; i < f33694c.size(); i++) {
                arrayList.add(f33694c.get(i));
            }
            for (int i2 = 0; i2 < f33708q; i2++) {
                arrayList.add(f33694c.get(i2));
            }
        } else {
            arrayList.addAll(f33694c);
        }
        f33703l = false;
        return arrayList;
    }

    /* renamed from: a */
    public static C13869f m24999a() {
        int size = f33694c.size();
        int i = f33693b;
        if (size == i) {
            int i2 = (f33708q + 1) % i;
            f33708q = i2;
            return f33694c.get(i2);
        }
        C13869f fVar = new C13869f();
        f33694c.add(fVar);
        f33708q++;
        return fVar;
    }

    /* renamed from: a */
    private static Message m24997a(Message message) {
        Field field = f33711t;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f33711t = declaredField;
                declaredField.setAccessible(true);
                return (Message) f33711t.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    static Message m24998a(MessageQueue messageQueue) {
        Field field = f33710s;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f33710s = declaredField;
                declaredField.setAccessible(true);
                return (Message) f33710s.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static JSONArray m25000a(long j) {
        MethodCollector.m26663i(3440);
        MessageQueue c = m25004c();
        JSONArray jSONArray = new JSONArray();
        if (c == null) {
            MethodCollector.m26664o(3440);
            return jSONArray;
        }
        try {
            synchronized (c) {
                try {
                    Message a = m24998a(c);
                    if (a == null) {
                        return jSONArray;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (a != null && i < 300) {
                        i++;
                        i2++;
                        JSONObject a2 = m25001a(a, j);
                        try {
                            a2.put("id", i2);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(a2);
                        if (a.getWhen() - j > 0 && i > 100) {
                            break;
                        }
                        a = m24997a(a);
                    }
                    MethodCollector.m26664o(3440);
                    return jSONArray;
                } finally {
                    MethodCollector.m26664o(3440);
                }
            }
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            MethodCollector.m26664o(3440);
            return jSONArray;
        }
    }

    /* renamed from: a */
    private static JSONObject m25001a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m25002a(C13869f fVar, long j, long j2, long j3, int i, int i2, String str) {
        fVar.f33771e = j;
        fVar.f33769c = j3;
        fVar.f33770d = j2;
        fVar.f33772f = false;
        fVar.f33767a = i2;
        if (str != null) {
            fVar.f33773g = str;
        }
        fVar.f33768b = i;
    }
}
