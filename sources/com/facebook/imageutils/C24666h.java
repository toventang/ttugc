package com.facebook.imageutils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.h */
public final class C24666h {
    static {
        Covode.recordClassIndex(28818);
    }

    /* renamed from: e */
    private static short m47187e(InputStream inputStream) {
        MethodCollector.m26663i(4936);
        short read = (short) (inputStream.read() & 255);
        MethodCollector.m26664o(4936);
        return read;
    }

    /* renamed from: f */
    private static byte m47188f(InputStream inputStream) {
        MethodCollector.m26663i(4938);
        byte read = (byte) (inputStream.read() & 255);
        MethodCollector.m26664o(4938);
        return read;
    }

    /* renamed from: c */
    private static int m47185c(InputStream inputStream) {
        MethodCollector.m26663i(4933);
        int read = ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
        MethodCollector.m26664o(4933);
        return read;
    }

    /* renamed from: d */
    private static int m47186d(InputStream inputStream) {
        byte f = m47188f(inputStream);
        return ((m47188f(inputStream) << 16) & 16711680) | ((m47188f(inputStream) << 8) & 65280) | (f & 255);
    }

    /* renamed from: b */
    private static int m47184b(InputStream inputStream) {
        MethodCollector.m26663i(4932);
        byte read = (byte) inputStream.read();
        byte read2 = (byte) inputStream.read();
        int read3 = ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((read2 << 8) & 65280) | (read & 255);
        MethodCollector.m26664o(4932);
        return read3;
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m47182a(InputStream inputStream) {
        MethodCollector.m26663i(4929);
        byte[] bArr = new byte[4];
        Pair<Integer, Integer> pair = null;
        try {
            inputStream.read(bArr);
            if (!m47183a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return null;
            }
            m47184b(inputStream);
            inputStream.read(bArr);
            if (!m47183a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return null;
            }
            inputStream.read(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append((char) bArr[i]);
            }
            String sb2 = sb.toString();
            if ("VP8 ".equals(sb2)) {
                inputStream.skip(7);
                short e3 = m47187e(inputStream);
                short e4 = m47187e(inputStream);
                short e5 = m47187e(inputStream);
                if (e3 == 157 && e4 == 1 && e5 == 42) {
                    pair = new Pair<>(Integer.valueOf(m47185c(inputStream)), Integer.valueOf(m47185c(inputStream)));
                }
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return pair;
            } else if ("VP8L".equals(sb2)) {
                m47184b(inputStream);
                if (m47188f(inputStream) == 47) {
                    int read = ((byte) inputStream.read()) & 255;
                    int read2 = ((byte) inputStream.read()) & 255;
                    int read3 = ((byte) inputStream.read()) & 255;
                    int i2 = read3 << 2;
                    pair = new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((read2 & 192) >> 6) | i2 | (((((byte) inputStream.read()) & 255) & 15) << 10)) + 1));
                }
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return pair;
            } else if ("VP8X".equals(sb2)) {
                inputStream.skip(8);
                Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(m47186d(inputStream) + 1), Integer.valueOf(m47186d(inputStream) + 1));
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return pair2;
            } else {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                MethodCollector.m26664o(4929);
                return null;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            MethodCollector.m26664o(4929);
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m47183a(byte[] bArr, String str) {
        if (4 != str.length()) {
            return false;
        }
        int i = 0;
        while (str.charAt(i) == bArr[i]) {
            i++;
            if (i >= 4) {
                return true;
            }
        }
        return false;
    }
}
