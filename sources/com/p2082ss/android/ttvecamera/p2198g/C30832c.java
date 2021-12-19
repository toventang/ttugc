package com.p2082ss.android.ttvecamera.p2198g;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.g.c */
public final class C30832c extends C30834e {
    static {
        Covode.recordClassIndex(37457);
    }

    @Override // com.p2082ss.android.ttvecamera.p2198g.C30834e
    /* renamed from: b */
    public final String mo55857b() {
        if (m63517e()) {
            return "3";
        }
        return super.mo55857b();
    }

    @Override // com.p2082ss.android.ttvecamera.p2198g.C30834e
    /* renamed from: a */
    public final boolean mo55856a() {
        if (!"0".equals(mo55857b()) || m63517e()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m63517e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    public C30832c(Context context) {
        super(context);
    }

    @Override // com.p2082ss.android.ttvecamera.p2198g.C30834e
    /* renamed from: a */
    public final void mo55855a(int i, CameraManager cameraManager) {
        if (m63517e()) {
            f73861b = "3";
        } else {
            super.mo55855a(i, cameraManager);
        }
    }
}
