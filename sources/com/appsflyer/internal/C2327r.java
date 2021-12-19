package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.appsflyer.internal.r */
public final class C2327r implements SensorEventListener {

    /* renamed from: ı */
    private final String f7086;

    /* renamed from: Ɩ */
    private long f7087;

    /* renamed from: ǃ */
    private final int f7088;

    /* renamed from: ɩ */
    private final float[][] f7089 = new float[2][];

    /* renamed from: Ι */
    private final long[] f7090 = new long[2];

    /* renamed from: ι */
    private final String f7091;

    /* renamed from: І */
    private final int f7092;

    /* renamed from: і */
    private double f7093;

    static {
        Covode.recordClassIndex(2595);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final int hashCode() {
        return this.f7092;
    }

    /* renamed from: ǃ */
    private boolean m7131() {
        if (this.f7089[0] != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ι */
    private Map<String, Object> m7135() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f7088));
        concurrentHashMap.put("sN", this.f7086);
        concurrentHashMap.put("sV", this.f7091);
        float[] fArr = this.f7089[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", m7132(fArr));
        }
        float[] fArr2 = this.f7089[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", m7132(fArr2));
        }
        return concurrentHashMap;
    }

    /* renamed from: ɩ */
    private static List<Float> m7132(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2327r)) {
            return false;
        }
        C2327r rVar = (C2327r) obj;
        return m7133(rVar.f7088, rVar.f7086, rVar.f7091);
    }

    /* renamed from: Ι */
    private static boolean m7134(Sensor sensor) {
        if (sensor == null || sensor.getName() == null || sensor.getVendor() == null) {
            return false;
        }
        return true;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null && m7134(sensorEvent.sensor)) {
            int type = sensorEvent.sensor.getType();
            String name = sensorEvent.sensor.getName();
            String vendor = sensorEvent.sensor.getVendor();
            long j = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            if (m7133(type, name, vendor)) {
                long currentTimeMillis = System.currentTimeMillis();
                float[][] fArr2 = this.f7089;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                    this.f7090[0] = currentTimeMillis;
                    return;
                }
                float[] fArr4 = fArr2[1];
                if (fArr4 == null) {
                    float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                    this.f7089[1] = copyOf;
                    this.f7090[1] = currentTimeMillis;
                    this.f7093 = m7130(fArr3, copyOf);
                } else if (50000000 <= j - this.f7087) {
                    this.f7087 = j;
                    if (Arrays.equals(fArr4, fArr)) {
                        this.f7090[1] = currentTimeMillis;
                        return;
                    }
                    double r2 = m7130(fArr3, fArr);
                    if (r2 > this.f7093) {
                        this.f7089[1] = Arrays.copyOf(fArr, fArr.length);
                        this.f7090[1] = currentTimeMillis;
                        this.f7093 = r2;
                    }
                }
            }
        }
    }

    /* renamed from: ı */
    private static double m7130(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: ı */
    public final void mo6480(Map<C2327r, Map<String, Object>> map, boolean z) {
        if (m7131()) {
            map.put(this, m7135());
            if (z) {
                int length = this.f7089.length;
                for (int i = 0; i < length; i++) {
                    this.f7089[i] = null;
                }
                int length2 = this.f7090.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f7090[i2] = 0;
                }
                this.f7093 = 0.0d;
                this.f7087 = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m7135());
        }
    }

    /* renamed from: Ι */
    private boolean m7133(int i, String str, String str2) {
        if (this.f7088 != i || !this.f7086.equals(str) || !this.f7091.equals(str2)) {
            return false;
        }
        return true;
    }

    public C2327r(int i, String str, String str2) {
        this.f7088 = i;
        str = str == null ? "" : str;
        this.f7086 = str;
        str2 = str2 == null ? "" : str2;
        this.f7091 = str2;
        this.f7092 = ((((i + 31) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }
}
