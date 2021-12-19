package com.bytedance.p802b.p813c.p816c;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21454c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Map;

/* renamed from: com.bytedance.b.c.c.h */
public final class C13022h {
    static {
        Covode.recordClassIndex(14858);
    }

    /* renamed from: a */
    public static void m23382a(int i, Map<Integer, C13023i> map) {
        File[] listFiles = new File("/proc/" + i + "/task/").listFiles();
        int length = listFiles.length;
        BufferedReader bufferedReader = null;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(listFiles[i2].getPath() + "/stat")), 1000);
                try {
                    String readLine = bufferedReader2.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    long parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                    if (!(intValue == 0 || substring3.isEmpty() || parseLong == 0)) {
                        C13023i iVar = new C13023i();
                        iVar.f31731b = substring3;
                        iVar.f31730a = intValue;
                        iVar.f31732c = parseLong;
                        map.put(Integer.valueOf(intValue), iVar);
                    }
                    C21454c.m40295a(bufferedReader2);
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    C21454c.m40295a(bufferedReader);
                }
            } catch (FileNotFoundException unused2) {
                C21454c.m40295a(bufferedReader);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r13.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00a6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23381a(int r11, java.util.List<com.bytedance.p802b.p813c.p816c.C13023i> r12, java.util.List<com.bytedance.p802b.p813c.p816c.C13023i> r13, double r14) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p813c.p816c.C13022h.m23381a(int, java.util.List, java.util.List, double):void");
    }
}
