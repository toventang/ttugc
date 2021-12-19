package com.lynx.tasm;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.l */
public class C28818l {

    /* renamed from: e */
    static int f68016e;

    /* renamed from: f */
    public static String f68017f = "-1";

    /* renamed from: a */
    public String f68018a;

    /* renamed from: b */
    public boolean f68019b = false;

    /* renamed from: c */
    public String[] f68020c;

    /* renamed from: d */
    public boolean f68021d;

    /* renamed from: g */
    private String f68022g;

    static {
        Covode.recordClassIndex(34925);
    }

    /* renamed from: a */
    private static String m57692a() {
        String a = C1764a.m5928a("%d", new Object[]{Integer.valueOf(f68016e)});
        f68016e++;
        return a;
    }

    /* renamed from: a */
    public static C28818l m57690a(String str, String[] strArr) {
        return new C28818l(str, m57692a(), strArr, false);
    }

    /* renamed from: a */
    public static C28818l m57691a(String str, String[] strArr, boolean z) {
        return new C28818l(str, m57692a(), strArr, z);
    }

    private C28818l(String str, String str2, String[] strArr, boolean z) {
        this.f68022g = str;
        this.f68020c = strArr;
        this.f68021d = z;
        this.f68018a = str2;
        this.f68021d = z;
        LLog.m56856a(4, "LynxGroup", "LynxGroup init with name " + str + ", id: " + str2 + ", enableCanvas: " + z);
    }
}
