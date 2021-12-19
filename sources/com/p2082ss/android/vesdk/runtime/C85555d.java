package com.p2082ss.android.vesdk.runtime;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85568t;

/* renamed from: com.ss.android.vesdk.runtime.d */
public class C85555d {

    /* renamed from: g */
    private static C85555d f191694g;

    /* renamed from: a */
    public boolean f191695a;

    /* renamed from: b */
    public boolean f191696b;

    /* renamed from: c */
    private int f191697c;

    /* renamed from: d */
    private boolean f191698d;

    /* renamed from: e */
    private boolean f191699e;

    /* renamed from: f */
    private final int f191700f;

    /* renamed from: h */
    private int f191701h;

    /* renamed from: i */
    private boolean f191702i;

    static {
        Covode.recordClassIndex(99730);
    }

    /* renamed from: b */
    public static C85555d m147448b() {
        MethodCollector.m26663i(6092);
        if (f191694g == null) {
            synchronized (C85555d.class) {
                try {
                    if (f191694g == null) {
                        f191694g = new C85555d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6092);
                    throw th;
                }
            }
        }
        C85555d dVar = f191694g;
        MethodCollector.m26664o(6092);
        return dVar;
    }

    /* renamed from: a */
    public final boolean mo131524a() {
        MethodCollector.m26663i(5938);
        if (!this.f191699e) {
            C85315al.m146637a("VEMem", "memory mode disabled");
            MethodCollector.m26664o(5938);
            return false;
        } else if (this.f191696b) {
            C85315al.m146637a("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            MethodCollector.m26664o(5938);
            return false;
        } else {
            double d = (double) this.f191697c;
            double nativeGetVirtualMemInfo = VERuntime.nativeGetVirtualMemInfo();
            Double.isNaN(d);
            double d2 = d - nativeGetVirtualMemInfo;
            if (d2 < ((double) this.f191701h)) {
                C85315al.m146641c("VEMem", "In low memory mode: free memory size = " + d2 + " threshold = " + this.f191701h);
                MethodCollector.m26664o(5938);
                return true;
            }
            MethodCollector.m26664o(5938);
            return false;
        }
    }

    private C85555d() {
        String str;
        MethodCollector.m26663i(5670);
        this.f191697c = 4096;
        this.f191700f = 500;
        this.f191701h = 300;
        this.f191702i = true;
        this.f191698d = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_upload_virtual_mem_size", (Object) false)).booleanValue();
        this.f191699e = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_memory_mode", (Object) false)).booleanValue();
        this.f191701h = ((Integer) C85568t.m147473a().mo131557a("ve_low_memory_threshold", (Object) 300)).intValue();
        if (Build.VERSION.SDK_INT < 21) {
            str = Build.CPU_ABI;
        } else {
            str = Build.SUPPORTED_ABIS[0];
        }
        C85315al.m146637a("VEMem", "cpu_abi = ".concat(String.valueOf(str)));
        if (str.equals("armeabi-v7a")) {
            this.f191697c = 3072;
            C85315al.m146637a("VEMem", "set mTotalVirtualSize to 3072MB");
        }
        this.f191696b = VERuntime.nativeIsArm64();
        MethodCollector.m26664o(5670);
    }

    /* renamed from: a */
    public final void mo131523a(int i) {
        String str;
        MethodCollector.m26663i(5802);
        if (!this.f191698d) {
            C85315al.m146637a("VEMem", "upload mem size is disabled");
            MethodCollector.m26664o(5802);
        } else if (this.f191696b) {
            C85315al.m146637a("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            MethodCollector.m26664o(5802);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            double nativeGetVirtualMemInfo = VERuntime.nativeGetVirtualMemInfo();
            long currentTimeMillis2 = System.currentTimeMillis();
            C85315al.m146637a("VEMem", "get virtual mem size cost " + (currentTimeMillis2 - currentTimeMillis) + "ms");
            if (nativeGetVirtualMemInfo <= 0.0d) {
                MethodCollector.m26664o(5802);
                return;
            }
            if (i == 0) {
                str = "te_record_enter_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            } else if (i == 1) {
                str = "te_record_leave_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            } else if (i == 2) {
                str = "te_edit_enter_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            } else if (i == 3) {
                str = "te_edit_leave_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            } else if (i == 4) {
                str = "te_composition_enter_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            } else if (i != 5) {
                str = "";
            } else {
                str = "te_composition_leave_virtual_memory_size";
                C30695h.m63061a(0, str, nativeGetVirtualMemInfo);
            }
            C85315al.m146637a("VEMem", str + " virtual mem size " + nativeGetVirtualMemInfo + "MB");
            if (this.f191695a && i == 0) {
                if (this.f191702i) {
                    double d = (double) this.f191697c;
                    Double.isNaN(d);
                    if (d - nativeGetVirtualMemInfo < 500.0d) {
                        RuntimeException runtimeException = new RuntimeException("Not enough virtual memory is available, used " + nativeGetVirtualMemInfo + "MB");
                        MethodCollector.m26664o(5802);
                        throw runtimeException;
                    }
                }
                this.f191702i = false;
            }
            C85315al.m146637a("VEMem", "upload virtual mem size cost " + (System.currentTimeMillis() - currentTimeMillis2));
            MethodCollector.m26664o(5802);
        }
    }
}
