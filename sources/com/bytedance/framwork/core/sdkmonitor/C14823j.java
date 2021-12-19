package com.bytedance.framwork.core.sdkmonitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.j */
public final class C14823j {

    /* renamed from: a */
    private static AbstractC14825b f36141a;

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.j$b */
    public interface AbstractC14825b {
        static {
            Covode.recordClassIndex(16926);
        }

        /* renamed from: a */
        String mo23850a();
    }

    static {
        Covode.recordClassIndex(16924);
    }

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.j$c */
    public enum EnumC14826c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f36145a;

        public final int getValue() {
            return this.f36145a;
        }

        static {
            Covode.recordClassIndex(16927);
        }

        private EnumC14826c(int i) {
            this.f36145a = i;
        }
    }

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.j$a */
    public enum EnumC14824a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f36143a;

        static {
            Covode.recordClassIndex(16925);
        }

        private EnumC14824a(int i) {
            this.f36143a = i;
        }
    }

    /* renamed from: a */
    private static NetworkInfo m27215a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    public static boolean m27222b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo a = m27215a((ConnectivityManager) m27219a(context, "connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m27220a(InputStream inputStream) {
        MethodCollector.m26663i(12408);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m26664o(12408);
                return byteArray;
            }
        }
    }

    /* renamed from: a */
    public static EnumC14826c m27216a(Context context) {
        int i;
        try {
            NetworkInfo a = m27215a((ConnectivityManager) m27219a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return EnumC14826c.NONE;
            }
            int type = a.getType();
            if (1 == type) {
                return EnumC14826c.WIFI;
            }
            if (type != 0) {
                return EnumC14826c.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m27219a(context, "phone");
            if (Build.VERSION.SDK_INT >= 29) {
                if (!C58017a.f132225a.getAndSet(true)) {
                    C58017a.m104840a().mo95542a();
                }
                i = C58017a.m104840a().f132229b.get();
                if (!C58017a.f132227c && i == -1) {
                    return EnumC14826c.MOBILE;
                }
            } else {
                i = telephonyManager.getNetworkType();
            }
            switch (i) {
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                case 15:
                    return EnumC14826c.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    return EnumC14826c.MOBILE_4G;
            }
            return EnumC14826c.MOBILE;
        } catch (Throwable unused) {
            return EnumC14826c.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m27219a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12289);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12289);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static byte[] m27221a(byte[] bArr, Map<String, String> map) {
        MethodCollector.m26663i(12528);
        if (bArr.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                map.put("Content-Encoding", "gzip");
            } catch (IOException e) {
                MethodCollector.m26664o(12528);
                throw e;
            } catch (Throwable th) {
                gZIPOutputStream.close();
                MethodCollector.m26664o(12528);
                throw th;
            }
        }
        MethodCollector.m26664o(12528);
        return bArr;
    }

    /* renamed from: a */
    public static C22710c m27217a(String str, byte[] bArr, EnumC14824a aVar, String str2, boolean z) {
        String str3 = str2;
        String str4 = str;
        byte[] bArr2 = bArr;
        MethodCollector.m26663i(12631);
        String str5 = null;
        if (str4 == null) {
            MethodCollector.m26664o(12631);
            return null;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        int length = bArr2.length;
        if (EnumC14824a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr2);
                gZIPOutputStream.close();
                bArr2 = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                MethodCollector.m26664o(12631);
                return null;
            }
        } else if (EnumC14824a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr2);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr2 = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        if (z) {
            byte[] a = EncryptorUtil.m27092a(bArr2, bArr2.length);
            if (a != null) {
                str4 = str4 + "&tt_data=a";
                str3 = "application/octet-stream;tt-data=a";
            } else {
                a = bArr2;
            }
            C22710c a2 = m27218a(str4, a, str3, str5, "POST", true, true);
            MethodCollector.m26664o(12631);
            return a2;
        }
        C22710c a3 = m27218a(str4, bArr2, str3, str5, "POST", true, false);
        MethodCollector.m26664o(12631);
        return a3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC, Splitter:B:33:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5 A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x016f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.services.apm.api.C22710c m27218a(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.C14823j.m27218a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.services.apm.api.c");
    }
}
