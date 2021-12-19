package com.bytedance.p802b.p813c;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: com.bytedance.b.c.b */
public final class C12997b {
    static {
        Covode.recordClassIndex(14833);
    }

    /* renamed from: com.bytedance.b.c.b$a */
    public enum EnumC12998a {
        TOP_APP,
        FOREGROUND,
        BACKGROUND,
        UNKNOWN;

        static {
            Covode.recordClassIndex(14834);
        }
    }

    /* renamed from: a */
    public static EnumC12998a m23324a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cgroup").getPath()), 100);
            String str = "";
            String str2 = str;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains(":cpuset:")) {
                    str = readLine;
                    break;
                } else if (readLine.contains(":cpu:")) {
                    str2 = readLine;
                }
            }
            bufferedReader.close();
            if (str2.isEmpty() && str.isEmpty()) {
                return EnumC12998a.UNKNOWN;
            }
            if (str.isEmpty()) {
                if (!str2.isEmpty()) {
                    if (str2.endsWith("/")) {
                        return EnumC12998a.FOREGROUND;
                    }
                    if (str2.endsWith("/bg_non_interactive") || str2.endsWith("/background")) {
                        return EnumC12998a.BACKGROUND;
                    }
                }
                return EnumC12998a.UNKNOWN;
            } else if (str.endsWith("/top-app")) {
                return EnumC12998a.TOP_APP;
            } else {
                if (str.endsWith("/foreground")) {
                    return EnumC12998a.FOREGROUND;
                }
                if (str.endsWith("/background") || str.endsWith("/")) {
                    return EnumC12998a.BACKGROUND;
                }
                return EnumC12998a.UNKNOWN;
            }
        } catch (Throwable unused) {
        }
    }
}
