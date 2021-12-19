package com.bytedance.p802b.p841k.p844c;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13122d;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.b.k.c.a */
public final class C13121a {

    /* renamed from: a */
    private static long f31960a = -1;

    static {
        Covode.recordClassIndex(14957);
    }

    /* renamed from: a */
    public static long m23594a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C13122d.m23596b(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                C13122d.m23596b(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C13122d.m23596b(bufferedReader);
            return -1;
        }
    }
}
