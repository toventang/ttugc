package com.p2082ss.bytenn;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;

/* renamed from: com.ss.bytenn.API */
public class API {
    public static String TAG = "BYTENN.API";
    private long engineHandle;

    public static int com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static native long nativeCreateEngineInstance();

    public static native int nativeDestroyEngine(long j);

    public static native Tensor[] nativeGetEngineOutputs(long j);

    public static native Tensor[] nativeGetInputConfig(long j);

    public static native int nativeInference(long j);

    public static native int nativeInitEngine(long j, ByteNNConfig byteNNConfig);

    public static native int nativeReInferShape(long j, int i, int i2);

    public static native int nativeReleaseEngine(long j);

    public static native int nativeSetEngineInputs(long j, Tensor[] tensorArr);

    static {
        Covode.recordClassIndex(100840);
        m147853xb77c729b("bytenn");
        m147853xb77c729b("bytennwrapper");
    }

    public EnumC86071a DestroyEngine() {
        MethodCollector.m26663i(9736);
        EnumC86071a aVar = EnumC86071a.values()[nativeDestroyEngine(this.engineHandle)];
        this.engineHandle = 0;
        MethodCollector.m26664o(9736);
        return aVar;
    }

    public EnumC86071a Inference() {
        MethodCollector.m26663i(9583);
        EnumC86071a aVar = EnumC86071a.values()[nativeInference(this.engineHandle)];
        MethodCollector.m26664o(9583);
        return aVar;
    }

    public EnumC86071a ReleaseEngine() {
        MethodCollector.m26663i(9735);
        EnumC86071a aVar = EnumC86071a.values()[nativeReleaseEngine(this.engineHandle)];
        MethodCollector.m26664o(9735);
        return aVar;
    }

    public EnumC86071a CreateEngine() {
        MethodCollector.m26663i(8967);
        long nativeCreateEngineInstance = nativeCreateEngineInstance();
        this.engineHandle = nativeCreateEngineInstance;
        if (nativeCreateEngineInstance == 0) {
            com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "createEngine fail");
            EnumC86071a aVar = EnumC86071a.ERR_MEMORY_ALLOC;
            MethodCollector.m26664o(8967);
            return aVar;
        }
        EnumC86071a aVar2 = EnumC86071a.NO_ERROR;
        MethodCollector.m26664o(8967);
        return aVar2;
    }

    /* renamed from: com.ss.bytenn.API$a */
    public enum EnumC86071a {
        NO_ERROR,
        ERR_MEMORY_ALLOC,
        NOT_IMPLEMENTED,
        ERR_UNEXPECTED,
        ERR_DATANOMATCH,
        INPUT_DATA_ERROR,
        CALL_BACK_STOP,
        BACKEND_FALLBACK,
        NULL_POINTER,
        INVALID_POINTER,
        INVALID_MODEL,
        INFER_SIZE_ERROR,
        NOT_SUPPORT;

        static {
            Covode.recordClassIndex(100841);
        }
    }

    /* renamed from: com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147853xb77c729b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public EnumC86071a GetEngineInputConfig(ArrayList<Tensor> arrayList) {
        MethodCollector.m26663i(9431);
        Tensor[] nativeGetInputConfig = nativeGetInputConfig(this.engineHandle);
        if (nativeGetInputConfig.length <= 0) {
            EnumC86071a aVar = EnumC86071a.ERR_UNEXPECTED;
            MethodCollector.m26664o(9431);
            return aVar;
        }
        for (Tensor tensor : nativeGetInputConfig) {
            arrayList.add(tensor);
        }
        EnumC86071a aVar2 = EnumC86071a.NO_ERROR;
        MethodCollector.m26664o(9431);
        return aVar2;
    }

    public EnumC86071a GetEngineOutputs(ArrayList<Tensor> arrayList) {
        MethodCollector.m26663i(9734);
        Tensor[] nativeGetEngineOutputs = nativeGetEngineOutputs(this.engineHandle);
        if (nativeGetEngineOutputs.length <= 0) {
            EnumC86071a aVar = EnumC86071a.ERR_UNEXPECTED;
            MethodCollector.m26664o(9734);
            return aVar;
        }
        for (Tensor tensor : nativeGetEngineOutputs) {
            arrayList.add(tensor);
        }
        EnumC86071a aVar2 = EnumC86071a.NO_ERROR;
        MethodCollector.m26664o(9734);
        return aVar2;
    }

    public EnumC86071a InitEngine(ByteNNConfig byteNNConfig) {
        MethodCollector.m26663i(9122);
        int nativeInitEngine = nativeInitEngine(this.engineHandle, byteNNConfig);
        if (EnumC86071a.NO_ERROR != EnumC86071a.values()[nativeInitEngine]) {
            com_ss_bytenn_API_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "InitEngine error code: ".concat(String.valueOf(nativeInitEngine)));
        }
        EnumC86071a aVar = EnumC86071a.values()[nativeInitEngine];
        MethodCollector.m26664o(9122);
        return aVar;
    }

    public EnumC86071a SetEngineInputs(ArrayList<Tensor> arrayList) {
        MethodCollector.m26663i(9276);
        EnumC86071a aVar = EnumC86071a.values()[nativeSetEngineInputs(this.engineHandle, (Tensor[]) arrayList.toArray(new Tensor[arrayList.size()]))];
        MethodCollector.m26664o(9276);
        return aVar;
    }

    public EnumC86071a ReInferShape(int i, int i2) {
        MethodCollector.m26663i(9584);
        EnumC86071a aVar = EnumC86071a.values()[nativeReInferShape(this.engineHandle, i2, i)];
        MethodCollector.m26664o(9584);
        return aVar;
    }
}
