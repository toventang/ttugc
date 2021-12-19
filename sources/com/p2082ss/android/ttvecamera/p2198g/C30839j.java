package com.p2082ss.android.ttvecamera.p2198g;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.g.j */
public final class C30839j extends C30834e {

    /* renamed from: d */
    public Map<String, Float> f73866d = new HashMap();

    static {
        Covode.recordClassIndex(37464);
    }

    public C30839j(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final String mo55861a(CameraManager cameraManager, int i, String[] strArr) {
        Map<String, Float> map;
        int i2;
        int i3 = 0;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 == i && i2 == 1) {
                this.f73866d.put(str, Float.valueOf(((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getHeight()));
                i3++;
            }
        }
        if (i3 < 2 || (map = this.f73866d) == null) {
            return null;
        }
        float f = 0.0f;
        String str2 = "";
        for (String str3 : map.keySet()) {
            float floatValue = this.f73866d.get(str3).floatValue();
            if (f < floatValue) {
                str2 = str3;
                f = floatValue;
            }
        }
        return str2;
    }
}
