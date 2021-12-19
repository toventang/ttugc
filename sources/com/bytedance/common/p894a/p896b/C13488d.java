package com.bytedance.common.p894a.p896b;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.p894a.C13477a;
import com.bytedance.common.p894a.C13481b;
import com.bytedance.common.p894a.C13489c;
import com.bytedance.common.p894a.p895a.C13478a;
import com.bytedance.common.p894a.p895a.C13479b;
import com.bytedance.common.p894a.p897c.C13491a;
import com.bytedance.common.p894a.p898d.C13495b;
import com.bytedance.common.p894a.p898d.C13497d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.a.b.d */
public final class C13488d {

    /* renamed from: a */
    public static int f32844a = 1;

    /* renamed from: b */
    public static int f32845b = 2;

    /* renamed from: c */
    public static int f32846c = 3;

    /* renamed from: d */
    public static int f32847d = 4;

    /* renamed from: e */
    public static int f32848e = 5;

    /* renamed from: f */
    public static int f32849f = 101;

    /* renamed from: g */
    public static int f32850g = 102;

    /* renamed from: h */
    public static int f32851h = 103;

    /* renamed from: i */
    public static int f32852i = 104;

    /* renamed from: j */
    public static int f32853j = 107;

    /* renamed from: k */
    public static int f32854k = 108;

    /* renamed from: l */
    List<String> f32855l = new ArrayList();

    /* renamed from: m */
    Set<String> f32856m = new HashSet();

    /* renamed from: n */
    String f32857n = "none";

    /* renamed from: o */
    String f32858o = "0";

    /* renamed from: p */
    final Context f32859p;

    /* renamed from: q */
    boolean f32860q;

    /* renamed from: r */
    boolean f32861r;

    /* renamed from: s */
    String f32862s;

    /* renamed from: t */
    boolean f32863t;

    /* renamed from: u */
    boolean f32864u;

    /* renamed from: v */
    boolean f32865v;

    /* renamed from: w */
    List<String> f32866w = Collections.emptyList();

    /* renamed from: x */
    List<C13491a> f32867x = new ArrayList();

    static {
        Covode.recordClassIndex(15496);
    }

    /* renamed from: b */
    private int m24256b() {
        String str;
        MethodCollector.m26663i(4000);
        if (!C13497d.m24275a() && !C13497d.m24276b() && !C13497d.m24277c()) {
            int i = f32849f;
            MethodCollector.m26664o(4000);
            return i;
        } else if (this.f32856m.isEmpty()) {
            int i2 = f32848e;
            MethodCollector.m26664o(4000);
            return i2;
        } else {
            File file = new File(C13477a.m24235c(), "cart_" + this.f32857n + "_" + this.f32858o + ".prof");
            if (this.f32861r || !C13495b.m24273c(file)) {
                File file2 = new File(C13477a.m24235c(), "cart.list");
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, false));
                    try {
                        for (String str2 : this.f32856m) {
                            StringBuilder append = new StringBuilder("L").append(str2.replace('.', '/'));
                            if (this.f32865v) {
                                str = ";->*";
                            } else {
                                str = ";";
                            }
                            bufferedWriter.write(append.append(str).toString());
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        MethodCollector.m26664o(4000);
                        throw th;
                    }
                } catch (IOException unused) {
                }
                if (!C13495b.m24273c(file2)) {
                    int i3 = f32850g;
                    MethodCollector.m26664o(4000);
                    return i3;
                }
                if (this.f32862s == null) {
                    this.f32862s = C13477a.m24233a().getPackageCodePath();
                }
                String str3 = this.f32862s;
                if (C13495b.m24273c(file2) && !TextUtils.isEmpty(str3)) {
                    File file3 = new File(str3);
                    if (file3.exists() && new C13479b.C13480a().mo21755a("--create-profile-from=" + file2.toString()).mo21755a("--apk=" + file3.toString()).mo21755a("--dex-location=" + file3.getName()).mo21755a("--reference-profile-file=" + file.toString()).mo21756a().mo21754a() == 0) {
                        if (!C13481b.C13482a.m24246a(file, new File("/data/misc/profiles/cur/" + (Process.myUid() / 100000) + "/" + C13477a.m24234b() + "/primary.prof"))) {
                            int i4 = f32852i;
                            MethodCollector.m26664o(4000);
                            return i4;
                        } else if (!this.f32860q) {
                            int i5 = f32845b;
                            MethodCollector.m26664o(4000);
                            return i5;
                        } else if (C13478a.m24240a()) {
                            int i6 = f32844a;
                            MethodCollector.m26664o(4000);
                            return i6;
                        } else {
                            int i7 = f32854k;
                            MethodCollector.m26664o(4000);
                            return i7;
                        }
                    }
                }
                int i8 = f32851h;
                MethodCollector.m26664o(4000);
                return i8;
            } else if (new File(C13477a.m24236d()).exists()) {
                file.getAbsolutePath();
                int i9 = f32846c;
                MethodCollector.m26664o(4000);
                return i9;
            } else {
                file.getAbsolutePath();
                int i10 = f32847d;
                MethodCollector.m26664o(4000);
                return i10;
            }
        }
    }

    /* renamed from: a */
    public final int mo21759a() {
        MethodCollector.m26663i(3791);
        boolean z = true;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            long currentTimeMillis = System.currentTimeMillis();
            System.currentTimeMillis();
            for (C13491a aVar : this.f32867x) {
                aVar.mo21764c();
                this.f32856m.addAll(aVar.mo21762a());
                aVar.mo21762a().size();
                aVar.mo21765d().getAbsolutePath();
            }
            File file = new File(C13477a.m24235c(), "classes_" + this.f32857n + "_" + this.f32858o + ".list");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        this.f32856m.add(readLine);
                    } else {
                        try {
                            break;
                        } catch (FileNotFoundException | IOException unused) {
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.m26664o(3791);
                    throw th;
                }
            }
            bufferedReader.close();
            if (z) {
                this.f32856m.size();
                file.getAbsolutePath();
                System.currentTimeMillis();
            } else {
                for (String str : this.f32866w) {
                    ArrayList arrayList = new ArrayList();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(C13477a.m24233a().getAssets().open(str)));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            arrayList.add(readLine2);
                        } catch (Throwable th3) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            MethodCollector.m26664o(3791);
                            throw th3;
                        }
                    }
                    arrayList.size();
                    this.f32855l.addAll(arrayList);
                    try {
                        bufferedReader2.close();
                    } catch (FileNotFoundException | IOException unused2) {
                    }
                }
                List<String> list = null;
                for (String str2 : this.f32855l) {
                    if (str2.endsWith("*")) {
                        if (list == null) {
                            list = C13477a.m24237e();
                        }
                        String substring = str2.substring(0, str2.lastIndexOf(42));
                        for (String str3 : list) {
                            if (str3.startsWith(substring)) {
                                this.f32856m.add(str3);
                            }
                        }
                    } else {
                        this.f32856m.add(str2);
                    }
                }
                if (!this.f32856m.isEmpty()) {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                        try {
                            for (String str4 : this.f32856m) {
                                bufferedWriter.write(str4);
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.close();
                        } catch (Throwable th5) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th6) {
                                th.addSuppressed(th6);
                            }
                            MethodCollector.m26664o(3791);
                            throw th5;
                        }
                    } catch (IOException unused3) {
                    }
                }
                this.f32855l.size();
                this.f32856m.size();
                System.currentTimeMillis();
                file.getAbsolutePath();
            }
            if (this.f32863t) {
                m24255a((String[]) this.f32856m.toArray(new String[0]));
            }
            if (!this.f32864u) {
                i = m24256b();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("commit_took", currentTimeMillis2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("commit_ret", i);
                C13489c.m24259a().mo23859a("editor_commit", jSONObject2, jSONObject, (JSONObject) null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            MethodCollector.m26664o(3791);
            return i;
        }
        int i2 = f32849f;
        MethodCollector.m26664o(3791);
        return i2;
    }

    /* renamed from: a */
    public final void mo21760a(C13491a aVar) {
        if (aVar != null) {
            this.f32867x.add(aVar);
        }
    }

    /* renamed from: a */
    private static void m24255a(String[] strArr) {
        System.currentTimeMillis();
        for (String str : strArr) {
            try {
                Class.forName(str, false, C13477a.m24233a().getClassLoader());
            } catch (Throwable unused) {
            }
        }
        System.currentTimeMillis();
    }

    public C13488d(Context context) {
        this.f32859p = context;
    }
}
