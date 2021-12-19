package com.bytedance.common.p894a.p897c;

import com.bytedance.common.p894a.C13477a;
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
import java.util.List;

/* renamed from: com.bytedance.common.a.c.a */
public final class C13491a {

    /* renamed from: a */
    String f32869a;

    /* renamed from: b */
    List<String> f32870b = new ArrayList();

    static {
        Covode.recordClassIndex(15499);
    }

    /* renamed from: e */
    private boolean m24260e() {
        if (!mo21765d().exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo21764c() {
        if (m24260e()) {
            m24261f();
        }
    }

    /* renamed from: d */
    public final File mo21765d() {
        return new File(C13477a.m24235c(), this.f32869a);
    }

    /* renamed from: b */
    public final boolean mo21763b() {
        List<String> a = mo21762a();
        if (a.isEmpty()) {
            return false;
        }
        String[] strArr = (String[]) a.toArray(new String[0]);
        System.currentTimeMillis();
        for (String str : strArr) {
            try {
                Class.forName(str, false, C13477a.m24233a().getClassLoader());
            } catch (Throwable unused) {
            }
        }
        System.currentTimeMillis();
        return true;
    }

    /* renamed from: f */
    private void m24261f() {
        MethodCollector.m26663i(1768);
        System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C13477a.m24233a().getAssets().open(this.f32869a)));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                MethodCollector.m26664o(1768);
                throw th;
            }
        }
        arrayList.size();
        try {
            bufferedReader.close();
        } catch (FileNotFoundException | IOException unused) {
        }
        List<String> list = null;
        for (String str : arrayList) {
            if (str.endsWith("*")) {
                if (list == null) {
                    list = C13477a.m24237e();
                }
                String substring = str.substring(0, str.lastIndexOf(42));
                for (String str2 : list) {
                    if (str2.startsWith(substring)) {
                        this.f32870b.add(str2);
                    }
                }
            } else {
                this.f32870b.add(str);
            }
        }
        if (!this.f32870b.isEmpty()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mo21765d(), false));
                try {
                    for (String str3 : this.f32870b) {
                        bufferedWriter.write(str3);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    MethodCollector.m26664o(1768);
                    throw th3;
                }
            } catch (IOException unused2) {
            }
        }
        arrayList.size();
        this.f32870b.size();
        System.currentTimeMillis();
        mo21765d().getAbsolutePath();
        MethodCollector.m26664o(1768);
    }

    /* renamed from: a */
    public final List<String> mo21762a() {
        MethodCollector.m26663i(1705);
        if (!this.f32870b.isEmpty()) {
            List<String> list = this.f32870b;
            MethodCollector.m26664o(1705);
            return list;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(mo21765d()));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
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
                MethodCollector.m26664o(1705);
                throw th;
            }
        }
        bufferedReader.close();
        if (!z) {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(C13477a.m24233a().getAssets().open(this.f32869a)));
            while (true) {
                try {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 == null) {
                        try {
                            break;
                        } catch (FileNotFoundException | IOException unused2) {
                        }
                    } else if (!readLine2.endsWith("*")) {
                        arrayList.add(readLine2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    MethodCollector.m26664o(1705);
                    throw th3;
                }
            }
            bufferedReader2.close();
        }
        this.f32870b.addAll(arrayList);
        List<String> list2 = this.f32870b;
        MethodCollector.m26664o(1705);
        return list2;
    }

    C13491a(String str) {
        this.f32869a = str;
    }
}
