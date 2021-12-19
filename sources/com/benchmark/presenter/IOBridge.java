package com.benchmark.presenter;

import android.os.Environment;
import com.benchmark.settings.BTCIOSettings;
import com.benchmark.tools.C2513b;
import com.benchmark.tools.C2527j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Random;

public class IOBridge {
    public static Random randomGenerator = new Random();
    private boolean internal;
    public BTCIOSettings settings;
    private String testFile;

    public void afterRun() {
        C2513b.m7389c(this.testFile);
    }

    static {
        Covode.recordClassIndex(2867);
    }

    public boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public HashMap<String, Float> runIOTest() {
        HashMap<String, Float> hashMap = new HashMap<>();
        float write = write(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        C2513b.m7389c(this.testFile);
        float write2 = write(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        float read = read(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        float read2 = read(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        hashMap.put("random_write", Float.valueOf(C2527j.m7405a(write)));
        hashMap.put("random_read", Float.valueOf(C2527j.m7405a(read)));
        hashMap.put("sequential_write", Float.valueOf(C2527j.m7405a(write2)));
        hashMap.put("sequential_read", Float.valueOf(C2527j.m7405a(read2)));
        return hashMap;
    }

    public int prepare(BTCIOSettings bTCIOSettings) {
        long a;
        if (!this.internal && !isExternalStorageWritable()) {
            return -10003;
        }
        if (bTCIOSettings.mode.equalsIgnoreCase("internal")) {
            this.internal = true;
        }
        if (this.internal) {
            a = C2513b.m7382a(bTCIOSettings.cachePathDir);
        } else {
            a = C2513b.m7382a(bTCIOSettings.externalCacheDir);
        }
        if (a < ((long) (bTCIOSettings.blockNum * 10 * bTCIOSettings.blockSize))) {
            return -10002;
        }
        this.settings = bTCIOSettings;
        String str = bTCIOSettings.cachePathDir + File.separator + "test.file";
        String str2 = bTCIOSettings.externalCacheDir + File.separator + "test.file";
        if (!this.internal) {
            str = str2;
        }
        this.testFile = str;
        return 0;
    }

    public static float read(int i, int i2, boolean z, String str) {
        long j;
        int i3;
        MethodCollector.m26663i(7406);
        File file = new File(str);
        byte[] bArr = new byte[i];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            j = System.nanoTime();
            i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                try {
                    randomAccessFile.seek((long) (randomGenerator.nextInt(i2 - 1) * i));
                    randomAccessFile.readFully(bArr, 0, i);
                    i3 += i;
                } catch (IOException e) {
                    MethodCollector.m26664o(7406);
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    MethodCollector.m26664o(7406);
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            j = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    fileInputStream.read(bArr, 0, i);
                    i3 += i;
                } catch (IOException e2) {
                    MethodCollector.m26664o(7406);
                    throw e2;
                } catch (Throwable th2) {
                    fileInputStream.close();
                    MethodCollector.m26664o(7406);
                    throw th2;
                }
            }
            fileInputStream.close();
        }
        float nanoTime = (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
        MethodCollector.m26664o(7406);
        return nanoTime;
    }

    public static float write(int i, int i2, boolean z, String str) {
        long j;
        int i3;
        MethodCollector.m26663i(7257);
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    randomAccessFile.seek((long) (randomGenerator.nextInt(i2 - 1) * i));
                    randomAccessFile.write(bArr, 0, i);
                    i3 += i;
                } catch (IOException e) {
                    MethodCollector.m26664o(7257);
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    MethodCollector.m26664o(7257);
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            j = System.nanoTime();
            i3 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                try {
                    fileOutputStream.write(bArr, 0, i);
                    i3 += i;
                } catch (IOException e2) {
                    MethodCollector.m26664o(7257);
                    throw e2;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    MethodCollector.m26664o(7257);
                    throw th2;
                }
            }
            fileOutputStream.close();
        }
        float nanoTime = (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
        MethodCollector.m26664o(7257);
        return nanoTime;
    }
}
