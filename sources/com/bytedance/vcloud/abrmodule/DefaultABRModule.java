package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;

public class DefaultABRModule implements IABRModule {
    private int mAlgoType = -1;
    private long mHandle;

    static {
        Covode.recordClassIndex(27587);
    }

    private native void _addBufferInfo(long j, int i, String str, long j2, long j3, long j4);

    private native long _create();

    private native double _getDoubleValue(long j, int i, double d);

    private native float _getFloatValue(long j, int i, float f);

    private native long _getLongValue(long j, int i, long j2);

    private native ABRResult _getPredict(long j);

    private native String _getVersion();

    private native void _release(long j);

    private native ABRResult _select(long j, int i, int i2);

    private native void _setDataSource(long j, IPlayStateSupplier iPlayStateSupplier);

    private native void _setDeviceInfo(long j, IDeviceInfo iDeviceInfo);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setInfoListener(long j, IABRInfoListener iABRInfoListener);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setMediaInfo(long j, List<IVideoStream> list, List<IAudioStream> list2);

    private native void _setSRBenchmark(long j, Map<Integer, Integer> map);

    private native void _setSRBenchmarkMap(long j, Map<Integer, List<Integer>> map);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j, int i, int i2);

    private native void _stop(long j);

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult getPredict() {
        MethodCollector.m26663i(7139);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(7139);
            return null;
        }
        ABRResult _getPredict = _getPredict(j);
        MethodCollector.m26664o(7139);
        return _getPredict;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public String getVersion() {
        MethodCollector.m26663i(5795);
        if (this.mHandle == 0) {
            MethodCollector.m26664o(5795);
            return "j_2.57.0";
        }
        String _getVersion = _getVersion();
        MethodCollector.m26664o(5795);
        return _getVersion;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void release() {
        MethodCollector.m26663i(7425);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(7425);
            return;
        }
        _release(j);
        MethodCollector.m26664o(7425);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void stop() {
        MethodCollector.m26663i(7281);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(7281);
            return;
        }
        _stop(j);
        MethodCollector.m26664o(7281);
    }

    public DefaultABRModule() {
        MethodCollector.m26663i(5669);
        ABRJniLoader.loadLibrary();
        if (!ABRJniLoader.isLibraryLoaded) {
            MethodCollector.m26664o(5669);
            return;
        }
        long _create = _create();
        this.mHandle = _create;
        _setIntValue(_create, 0, ABRConfig.getLogLevel());
        _setIntValue(this.mHandle, 1, ABRConfig.getSwitchSensitivity());
        _setIntValue(this.mHandle, 3, ABRConfig.getSwitchModel());
        _setIntValue(this.mHandle, 4, ABRConfig.getFixedLevel());
        _setIntValue(this.mHandle, 5, ABRConfig.getStartupModel());
        _setIntValue(this.mHandle, 37, ABRConfig.getStartupUseCache());
        _setFloatValue(this.mHandle, 8, ABRConfig.getStartupBandwidthParameter());
        _setFloatValue(this.mHandle, 9, ABRConfig.getStallPenaltyParameter());
        _setFloatValue(this.mHandle, 10, ABRConfig.getSwitchPenaltyParameter());
        _setFloatValue(this.mHandle, 11, ABRConfig.getBandwidthParameter());
        _setDoubleValue(this.mHandle, 29, ABRConfig.getStartupModelFirstParam());
        _setDoubleValue(this.mHandle, 30, ABRConfig.getStartupModelSecondParam());
        _setDoubleValue(this.mHandle, 31, ABRConfig.getStartupModelThirdParam());
        _setDoubleValue(this.mHandle, 32, ABRConfig.getStartupModelFourthParam());
        MethodCollector.m26664o(5669);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void init(IPlayStateSupplier iPlayStateSupplier) {
        MethodCollector.m26663i(5797);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(5797);
            return;
        }
        try {
            _setDataSource(j, iPlayStateSupplier);
            MethodCollector.m26664o(5797);
        } catch (Throwable unused) {
            MethodCollector.m26664o(5797);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        MethodCollector.m26663i(6088);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6088);
            return;
        }
        _setDeviceInfo(j, iDeviceInfo);
        MethodCollector.m26664o(6088);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setInfoListener(IABRInfoListener iABRInfoListener) {
        MethodCollector.m26663i(6540);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6540);
            return;
        }
        _setInfoListener(j, iABRInfoListener);
        MethodCollector.m26664o(6540);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmark(Map<Integer, Integer> map) {
        MethodCollector.m26663i(6237);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6237);
            return;
        }
        _setSRBenchmark(j, map);
        MethodCollector.m26664o(6237);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setSRBenchmarkMap(Map<Integer, List<Integer>> map) {
        MethodCollector.m26663i(6399);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6399);
            return;
        }
        _setSRBenchmarkMap(j, map);
        MethodCollector.m26664o(6399);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public float getFloatOption(int i, float f) {
        MethodCollector.m26663i(6845);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6845);
            return f;
        }
        float _getFloatValue = _getFloatValue(j, i, f);
        MethodCollector.m26664o(6845);
        return _getFloatValue;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public ABRResult onceSelect(int i, int i2) {
        MethodCollector.m26663i(6985);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6985);
            return null;
        }
        ABRResult _select = _select(j, i, i2);
        MethodCollector.m26664o(6985);
        return _select;
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setDoubleOptionForKey(int i, double d) {
        MethodCollector.m26663i(6842);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6842);
            return;
        }
        _setDoubleValue(j, i, d);
        MethodCollector.m26664o(6842);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setFloatOptionForKey(int i, float f) {
        MethodCollector.m26663i(6840);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6840);
            return;
        }
        _setFloatValue(j, i, f);
        MethodCollector.m26664o(6840);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setIntOptionForKey(int i, int i2) {
        MethodCollector.m26663i(6693);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6693);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(6693);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setLongOptionForKey(int i, long j) {
        MethodCollector.m26663i(6841);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(6841);
            return;
        }
        _setLongValue(j2, i, j);
        MethodCollector.m26664o(6841);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2) {
        MethodCollector.m26663i(5936);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(5936);
            return;
        }
        _setMediaInfo(j, list, list2);
        MethodCollector.m26664o(5936);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void setStringOptionForKey(int i, String str) {
        MethodCollector.m26663i(6843);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6843);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(6843);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void start(int i, int i2) {
        MethodCollector.m26663i(7141);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(7141);
            return;
        }
        this.mAlgoType = i;
        _start(j, i, i2);
        MethodCollector.m26664o(7141);
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public long getLongOption(int i, long j) {
        MethodCollector.m26663i(6844);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(6844);
            return j;
        } else if (i == 19) {
            long j3 = (long) this.mAlgoType;
            MethodCollector.m26664o(6844);
            return j3;
        } else {
            long _getLongValue = _getLongValue(j2, i, j);
            MethodCollector.m26664o(6844);
            return _getLongValue;
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.IABRModule
    public void addBufferInfo(int i, String str, long j, long j2, long j3) {
        MethodCollector.m26663i(7588);
        long j4 = this.mHandle;
        if (j4 == 0) {
            MethodCollector.m26664o(7588);
            return;
        }
        _addBufferInfo(j4, i, str, j, j2, j3);
        MethodCollector.m26664o(7588);
    }
}
