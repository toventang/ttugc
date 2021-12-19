package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class StrategyCenter {
    private boolean mDidStart;
    private long mHandle;
    private IStrategyEventListener mListener;
    private int mLogLevel = 3;

    static {
        Covode.recordClassIndex(27640);
    }

    private native void _addMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z);

    private native void _businessEvent(long j, int i, int i2);

    private native void _businessEvent(long j, int i, String str);

    private native long _create(IStrategyEventListener iStrategyEventListener);

    private native void _createPlayer(long j, long j2, String str, String str2);

    private native void _createScene(long j, String str);

    private native void _destroyScene(long j, String str);

    private native void _focusMedia(long j, String str, int i);

    private native float _getFloatValue(long j, int i, float f);

    private native int _getIntValue(long j, int i, int i2);

    private native long _getLongValue(long j, int i, long j2);

    private native long _getLongValue(long j, int i, String str, long j2);

    private native String _getStrValue(long j, int i, String str);

    private native int _iPlayerVersion(long j);

    private native boolean _isIOManagerVersionMatch(long j);

    private native void _makeCurrentPlayer(long j, String str);

    private native void _moveToScene(long j, String str);

    private native void _playSelection(long j, String str, int i, int i2);

    private native void _release(long j);

    private native void _releasePlayer(long j, String str, String str2);

    private native void _removeAllMedia(long j, String str, int i);

    private native void _removeMedia(long j, String str, String str2);

    private native String _selectBitrate(long j, String str, int i, String str2, Object obj);

    private native void _setAlgorithmJson(long j, int i, String str);

    private native void _setAppInfo(long j, String str);

    private native void _setEventListener(long j, IStrategyEventListener iStrategyEventListener);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setIOManager(long j, long j2, long j3);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setIntervalMS(long j, int i);

    private native void _setLogCallback(long j, ILogCallback iLogCallback);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setPlayTaskProgress(long j, float f);

    private native void _setProbeType(long j, int i);

    private native void _setSettingsInfo(long j, String str, String str2);

    private native void _setStateSupplier(long j, IStrategyStateSupplier iStrategyStateSupplier);

    private native void _setStrValue(long j, int i, String str);

    private native void _start(long j);

    private native void _stop(long j);

    private native void _updateMedia(long j, String str, String str2, String str3);

    /* renamed from: com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m44276xf0d942fb(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m44277xf0d942ff(String str, String str2) {
        return 0;
    }

    public boolean isRunning() {
        return this.mDidStart;
    }

    public boolean isLoadLibrarySucceed() {
        if (this.mHandle != 0) {
            return true;
        }
        return false;
    }

    public int iPlayerVersion() {
        MethodCollector.m26663i(6131);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(6131);
            return -1;
        }
        int _iPlayerVersion = _iPlayerVersion(j);
        MethodCollector.m26664o(6131);
        return _iPlayerVersion;
    }

    public boolean isIOManagerVersionMatch() {
        MethodCollector.m26663i(13663);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13663);
            return false;
        }
        boolean _isIOManagerVersionMatch = _isIOManagerVersionMatch(j);
        MethodCollector.m26664o(13663);
        return _isIOManagerVersionMatch;
    }

    public void stop() {
        MethodCollector.m26663i(12645);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12645);
            return;
        }
        _stop(j);
        this.mDidStart = false;
        MethodCollector.m26664o(12645);
    }

    public StrategyCenter(IStrategyEventListener iStrategyEventListener) {
        this.mListener = iStrategyEventListener;
    }

    public void createScene(String str) {
        MethodCollector.m26663i(13360);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(13360);
            return;
        }
        _createScene(j, str);
        MethodCollector.m26664o(13360);
    }

    public void destroyScene(String str) {
        MethodCollector.m26663i(13361);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13361);
            return;
        }
        _destroyScene(j, str);
        MethodCollector.m26664o(13361);
    }

    public void makeCurrentPlayer(String str) {
        MethodCollector.m26663i(13368);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13368);
            return;
        }
        _makeCurrentPlayer(j, str);
        MethodCollector.m26664o(13368);
    }

    public void setAppInfo(String str) {
        MethodCollector.m26663i(13739);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13739);
            return;
        }
        _setAppInfo(j, str);
        MethodCollector.m26664o(13739);
    }

    public void setEventListener(IStrategyEventListener iStrategyEventListener) {
        MethodCollector.m26663i(12768);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12768);
            return;
        }
        _setEventListener(j, iStrategyEventListener);
        MethodCollector.m26664o(12768);
    }

    public void setLogCallback(ILogCallback iLogCallback) {
        MethodCollector.m26663i(14103);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(14103);
            return;
        }
        _setLogCallback(j, iLogCallback);
        MethodCollector.m26664o(14103);
    }

    public void setStateSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        MethodCollector.m26663i(13189);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13189);
            return;
        }
        _setStateSupplier(j, iStrategyStateSupplier);
        MethodCollector.m26664o(13189);
    }

    public void switchToScene(String str) {
        MethodCollector.m26663i(13363);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13363);
            return;
        }
        _moveToScene(j, str);
        MethodCollector.m26664o(13363);
    }

    public void create(boolean z) {
        MethodCollector.m26663i(12643);
        if (!isLoadLibrarySucceed()) {
            if (z) {
                StrategyCenterJniLoader.loadLibrary();
                if (!StrategyCenterJniLoader.isLibraryLoaded) {
                    m44277xf0d942ff("StrategyCenter", "load library fail.");
                    MethodCollector.m26664o(12643);
                    return;
                }
            }
            this.mHandle = _create(this.mListener);
        }
        MethodCollector.m26664o(12643);
    }

    public void start(boolean z) {
        MethodCollector.m26663i(12644);
        if (this.mDidStart) {
            MethodCollector.m26664o(12644);
            return;
        }
        create(z);
        if (this.mHandle == 0) {
            MethodCollector.m26664o(12644);
            return;
        }
        setIntValue(10000, this.mLogLevel);
        _start(this.mHandle);
        this.mDidStart = true;
        MethodCollector.m26664o(12644);
    }

    public void businessEvent(int i, int i2) {
        MethodCollector.m26663i(14104);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(14104);
            return;
        }
        _businessEvent(j, i, i2);
        MethodCollector.m26664o(14104);
    }

    public void focusMedia(String str, int i) {
        MethodCollector.m26663i(13358);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13358);
            return;
        }
        _focusMedia(j, str, i);
        MethodCollector.m26664o(13358);
    }

    public void releasePlayer(String str, String str2) {
        MethodCollector.m26663i(13367);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13367);
            return;
        }
        _releasePlayer(j, str, str2);
        MethodCollector.m26664o(13367);
    }

    public void removeAllMedia(String str, int i) {
        MethodCollector.m26663i(13357);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13357);
            return;
        }
        _removeAllMedia(j, str, i);
        MethodCollector.m26664o(13357);
    }

    public void removeMedia(String str, String str2) {
        MethodCollector.m26663i(13313);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13313);
            return;
        }
        _removeMedia(j, str, str2);
        MethodCollector.m26664o(13313);
    }

    public void setAlgorithmJson(int i, String str) {
        MethodCollector.m26663i(13797);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13797);
            return;
        }
        _setAlgorithmJson(j, i, str);
        MethodCollector.m26664o(13797);
    }

    public void setFloatValue(int i, float f) {
        MethodCollector.m26663i(13188);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13188);
            return;
        }
        _setFloatValue(j, i, f);
        MethodCollector.m26664o(13188);
    }

    public void setIOManager(long j, long j2) {
        MethodCollector.m26663i(13446);
        long j3 = this.mHandle;
        if (j3 == 0) {
            MethodCollector.m26664o(13446);
            return;
        }
        _setIOManager(j3, j, j2);
        MethodCollector.m26664o(13446);
    }

    public void setIntValue(int i, int i2) {
        MethodCollector.m26663i(12769);
        if (i == 10000) {
            this.mLogLevel = i2;
        }
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12769);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(12769);
    }

    public void setSettingsInfo(String str, String str2) {
        MethodCollector.m26663i(14068);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(14068);
            return;
        }
        _setSettingsInfo(j, str, str2);
        MethodCollector.m26664o(14068);
    }

    public void businessEvent(int i, String str) {
        MethodCollector.m26663i(5836);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(5836);
            return;
        }
        _businessEvent(j, i, str);
        MethodCollector.m26664o(5836);
    }

    public float getFloatValue(int i, float f) {
        MethodCollector.m26663i(12948);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12948);
            return f;
        }
        try {
            float _getFloatValue = _getFloatValue(j, i, f);
            MethodCollector.m26664o(12948);
            return _getFloatValue;
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(12948);
            return f;
        }
    }

    public int getIntValue(int i, int i2) {
        MethodCollector.m26663i(12852);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12852);
            return i2;
        }
        try {
            int _getIntValue = _getIntValue(j, i, i2);
            MethodCollector.m26664o(12852);
            return _getIntValue;
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(12852);
            return i2;
        }
    }

    public long getLongValue(int i, long j) {
        MethodCollector.m26663i(13039);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(13039);
            return j;
        }
        try {
            long _getLongValue = _getLongValue(j2, i, j);
            MethodCollector.m26664o(13039);
            return _getLongValue;
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13039);
            return j;
        }
    }

    public String getStringValue(int i, String str) {
        MethodCollector.m26663i(13187);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13187);
            return str;
        }
        try {
            String _getStrValue = _getStrValue(j, i, str);
            MethodCollector.m26664o(13187);
            return _getStrValue;
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13187);
            return str;
        }
    }

    public void setLongValue(int i, long j) {
        MethodCollector.m26663i(13038);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(13038);
            return;
        }
        try {
            _setLongValue(j2, i, j);
            MethodCollector.m26664o(13038);
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13038);
        }
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(13120);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13120);
            return;
        }
        try {
            _setStrValue(j, i, str);
            MethodCollector.m26664o(13120);
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13120);
        }
    }

    public void createPlayer(long j, String str, String str2) {
        MethodCollector.m26663i(13365);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(13365);
            return;
        }
        _createPlayer(j2, j, str, str2);
        MethodCollector.m26664o(13365);
    }

    public void playSelection(String str, int i, int i2) {
        MethodCollector.m26663i(13370);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13370);
            return;
        }
        _playSelection(j, str, i, i2);
        MethodCollector.m26664o(13370);
    }

    public void updateMedia(String str, String str2, String str3) {
        MethodCollector.m26663i(13359);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13359);
            return;
        }
        try {
            _updateMedia(j, str, str2, str3);
            MethodCollector.m26664o(13359);
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13359);
        }
    }

    public long getLongValue(int i, String str, long j) {
        MethodCollector.m26663i(13040);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.m26664o(13040);
            return j;
        }
        try {
            long _getLongValue = _getLongValue(j2, i, str, j);
            MethodCollector.m26664o(13040);
            return _getLongValue;
        } catch (Throwable th) {
            m44276xf0d942fb("StrategyCenter", th.toString());
            MethodCollector.m26664o(13040);
            return j;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z) {
        MethodCollector.m26663i(13252);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(13252);
            return;
        }
        _addMedia(j, str, iSelectBitrateListener, str2, z);
        MethodCollector.m26664o(13252);
    }

    public String selectBitrate(String str, int i, String str2, Object obj) {
        MethodCollector.m26663i(5981);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(5981);
            return null;
        }
        try {
            String _selectBitrate = _selectBitrate(j, str, i, str2, obj);
            MethodCollector.m26664o(5981);
            return _selectBitrate;
        } catch (Throwable th) {
            m44277xf0d942ff("StrategyCenter", th.toString());
            MethodCollector.m26664o(5981);
            return null;
        }
    }
}
