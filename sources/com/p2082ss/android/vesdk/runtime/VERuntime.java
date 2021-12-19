package com.p2082ss.android.vesdk.runtime;

import android.content.Context;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.VideoSdkCore;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30693g;
import com.p2082ss.android.ttve.monitor.IMonitor;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85514i;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.runtime.p4393a.C85551a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.runtime.VERuntime */
public class VERuntime {

    /* renamed from: a */
    public Context f191642a;

    /* renamed from: b */
    public boolean f191643b;

    /* renamed from: c */
    public C85557f f191644c;

    /* renamed from: d */
    public C85554c f191645d;

    /* renamed from: e */
    public boolean f191646e;

    /* renamed from: f */
    public boolean f191647f;

    /* renamed from: g */
    public VESize f191648g;

    /* renamed from: h */
    public C85514i f191649h;

    /* renamed from: i */
    public boolean f191650i;

    /* renamed from: j */
    public boolean f191651j;

    /* renamed from: k */
    public boolean f191652k;

    /* renamed from: l */
    public WeakReference<VEListener.AbstractC85224ac> f191653l;

    /* renamed from: m */
    public WeakReference<VEListener.AbstractC85235d> f191654m;

    /* renamed from: n */
    public VEListener.AbstractC85252u f191655n;

    /* renamed from: o */
    public IMonitor f191656o;

    /* renamed from: p */
    public C30683b.AbstractC30684a f191657p;

    /* renamed from: q */
    public C30693g.AbstractC30694a f191658q;

    /* renamed from: r */
    public C85551a f191659r;

    /* renamed from: s */
    private boolean f191660s;

    static {
        Covode.recordClassIndex(99718);
    }

    public static native void nativeEnableAudioSDKApiV2(boolean z);

    public static native void nativeEnableCrossPlatGLBaseFBO(boolean z);

    private static native void nativeEnableEditorHdr2Sdr(boolean z);

    public static native void nativeEnableImport10BitByteVC1Video(boolean z);

    public static native void nativeEnableRenderLib(boolean z);

    private static native void nativeEnableTitanReleaseGPUResource(boolean z);

    private static native void nativeEnableTransitionKeyFrame(boolean z);

    static native double nativeGetVirtualMemInfo();

    static native boolean nativeIsArm64();

    public static native void nativeSetNativeLibraryDir(String str);

    public native void nativeEnableHDByteVC1HWDecoder(boolean z, int i);

    public native void nativeEnableHDH264HWDecoder(boolean z, int i);

    public native void nativeEnableHDMpeg24VP89HWDecoder(boolean z);

    public native void nativeEnableHighFpsByteVC1HWDecoder(boolean z, int i, int i2);

    public native void nativeEnableHighFpsH264HWDecoder(boolean z, int i, int i2);

    public native void nativeEnableTTByteVC1Decoder(boolean z);

    public native long nativeGetNativeContext();

    /* renamed from: com.ss.android.vesdk.runtime.VERuntime$a */
    public enum EnumC85549a {
        INSTANCE;
        

        /* renamed from: b */
        public VERuntime f191667b = new VERuntime((byte) 0);

        static {
            Covode.recordClassIndex(99723);
        }

        private EnumC85549a(String str) {
        }
    }

    private VERuntime() {
        this.f191648g = new VESize(0, 0);
        this.f191652k = false;
        this.f191656o = new IMonitor() {
            /* class com.p2082ss.android.vesdk.runtime.VERuntime.C855451 */

            static {
                Covode.recordClassIndex(99719);
            }

            @Override // com.p2082ss.android.ttve.monitor.IMonitor
            public final void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.f191653l != null && VERuntime.this.f191653l.get() != null) {
                    VERuntime.this.f191653l.get().mo101684a(str, jSONObject);
                }
            }
        };
        this.f191657p = new C30683b.AbstractC30684a() {
            /* class com.p2082ss.android.vesdk.runtime.VERuntime.C855462 */

            static {
                Covode.recordClassIndex(99720);
            }

            @Override // com.p2082ss.android.ttve.monitor.C30683b.AbstractC30684a
            /* renamed from: a */
            public final void mo55062a(String str, JSONObject jSONObject, String str2) {
                if (VERuntime.this.f191654m != null && VERuntime.this.f191654m.get() != null) {
                    VERuntime.this.f191654m.get().mo130310a(str, jSONObject, str2);
                }
            }
        };
        this.f191658q = new C30693g.AbstractC30694a() {
            /* class com.p2082ss.android.vesdk.runtime.VERuntime.C855473 */

            static {
                Covode.recordClassIndex(99721);
            }

            @Override // com.p2082ss.android.ttve.monitor.C30693g.AbstractC30694a
            /* renamed from: a */
            public final void mo55065a(Throwable th) {
                if (VERuntime.this.f191655n != null) {
                    VERuntime.this.f191655n.mo56239a(th);
                }
            }
        };
    }

    /* renamed from: a */
    public final int mo131508a() {
        MethodCollector.m26663i(5993);
        if (!this.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            MethodCollector.m26664o(5993);
            return -108;
        }
        nativeEnableTransitionKeyFrame(true);
        this.f191647f = true;
        MethodCollector.m26664o(5993);
        return 0;
    }

    /* synthetic */ VERuntime(byte b) {
        this();
    }

    /* renamed from: a */
    public static boolean m147433a(String str) {
        VideoSdkCore.setEffectJsonConfig(str);
        VEEffectConfig.setEffectJsonConfig(str);
        return true;
    }

    /* renamed from: a */
    public final boolean mo131509a(ResourceFinder resourceFinder) {
        VideoSdkCore.setResourceFinder(resourceFinder);
        VEEffectConfig.setResourceFinder(resourceFinder);
        this.f191643b = false;
        this.f191660s = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }
}
