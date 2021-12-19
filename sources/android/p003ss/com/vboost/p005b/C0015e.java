package android.p003ss.com.vboost.p005b;

import android.p003ss.com.vboost.p008e.C0063d;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: android.ss.com.vboost.b.e */
public class C0015e {

    /* renamed from: a */
    private static final String f50a = C0015e.class.getSimpleName();

    /* renamed from: b */
    private static EnumC0016a f51b = EnumC0016a.UNINITED;

    static {
        Covode.recordClassIndex(18);
    }

    /* renamed from: b */
    static int m32b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/possible", "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            if (readLine != null) {
                String[] split = readLine.split("-");
                if (split.length == 2) {
                    availableProcessors = Integer.parseInt(split[1]) + 1;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        if (availableProcessors <= 0) {
            return 8;
        }
        return availableProcessors;
    }

    /* renamed from: android.ss.com.vboost.b.e$a */
    public enum EnumC0016a {
        UNINITED,
        QCOM,
        MTK,
        CHRY,
        SAMSUNG,
        UNKNOWN;

        static {
            Covode.recordClassIndex(19);
        }
    }

    /* renamed from: a */
    public static EnumC0016a m31a() {
        EnumC0016a aVar;
        if (f51b != EnumC0016a.UNINITED) {
            return f51b;
        }
        String a = C0063d.m102a("ro.hardware");
        if (a != null) {
            if (a.startsWith("qcom") || a.startsWith("msm") || a.startsWith("qsc") || a.startsWith("sdm")) {
                aVar = EnumC0016a.QCOM;
                f51b = aVar;
                return aVar;
            }
            if (a.startsWith("mt")) {
                aVar = EnumC0016a.MTK;
            } else if (a.startsWith("kirin") || a.startsWith("hi")) {
                aVar = EnumC0016a.CHRY;
            } else {
                String a2 = C0063d.m102a("ro.hardware.egl");
                if (a2 != null && a2.toLowerCase().equals("adreno")) {
                    aVar = EnumC0016a.QCOM;
                }
            }
            f51b = aVar;
            return aVar;
        }
        aVar = EnumC0016a.UNKNOWN;
        f51b = aVar;
        return aVar;
    }

    /* renamed from: a */
    static int m29a(int i) {
        return m30a("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
    }

    /* renamed from: a */
    private static int m30a(String str) {
        if (str != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                String readLine = randomAccessFile.readLine();
                randomAccessFile.close();
                return Integer.parseInt(readLine);
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
