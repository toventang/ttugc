package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MLComponentManager {
    ReentrantReadWriteLock lock;
    private long mModelComponentHandle;
    private String mName;
    final ReentrantReadWriteLock.ReadLock readLock;
    final ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();

    static {
        Covode.recordClassIndex(27608);
    }

    private native ArrayList _calculate(long j, Map map);

    private native long _createMLComponent(String str);

    private native boolean _enable(long j);

    private native boolean _prepareAlreadyFinish(long j);

    private native void _release(long j);

    private native void _setDownloader(long j, IMLComponentDownLoader iMLComponentDownLoader);

    private native void _setEngineStateListener(long j, IMLComponentStateListener iMLComponentStateListener);

    private native void _setLoggerEventListener(long j, IMLComponentLogger iMLComponentLogger);

    private native void _setMLConfigModel(long j, IMLComponentConfigModel iMLComponentConfigModel);

    /* access modifiers changed from: package-private */
    public void loadNecessaryMLEngine() {
        MLEngineImpLoader.loadPredictTFEngineLibrary();
        if (!MLEngineImpLoader.isPredictTFEngineLibraryLoaded) {
            MLComponentLog.m44257e("mlComponent", "no tfengine for networkPredict");
        }
    }

    public boolean enable() {
        MethodCollector.m26663i(3666);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3666);
            return false;
        }
        boolean _enable = _enable(j);
        this.readLock.unlock();
        MethodCollector.m26664o(3666);
        return _enable;
    }

    public boolean prepareAlreadFinish() {
        MethodCollector.m26663i(3659);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3659);
            return false;
        }
        boolean _prepareAlreadyFinish = _prepareAlreadyFinish(j);
        this.readLock.unlock();
        MethodCollector.m26664o(3659);
        return _prepareAlreadyFinish;
    }

    public void release() {
        MethodCollector.m26663i(3665);
        this.writeLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.writeLock.unlock();
            MethodCollector.m26664o(3665);
            return;
        }
        _release(j);
        this.mModelComponentHandle = 0;
        this.writeLock.unlock();
        MethodCollector.m26664o(3665);
    }

    public ArrayList calculate(Map map) {
        MethodCollector.m26663i(3663);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3663);
            return null;
        }
        ArrayList _calculate = _calculate(j, map);
        this.readLock.unlock();
        MethodCollector.m26664o(3663);
        return _calculate;
    }

    public MLComponentManager setDownloader(IMLComponentDownLoader iMLComponentDownLoader) {
        MethodCollector.m26663i(3549);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3549);
            return this;
        }
        _setDownloader(j, iMLComponentDownLoader);
        this.readLock.unlock();
        MethodCollector.m26664o(3549);
        return this;
    }

    public MLComponentManager setEngineStateListener(IMLComponentStateListener iMLComponentStateListener) {
        MethodCollector.m26663i(3545);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3545);
            return this;
        }
        _setEngineStateListener(j, iMLComponentStateListener);
        this.readLock.unlock();
        MethodCollector.m26664o(3545);
        return this;
    }

    public MLComponentManager setLoggerEventListener(IMLComponentLogger iMLComponentLogger) {
        MethodCollector.m26663i(3536);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3536);
            return this;
        }
        _setLoggerEventListener(j, iMLComponentLogger);
        this.readLock.unlock();
        MethodCollector.m26664o(3536);
        return this;
    }

    public MLComponentManager setMLComponentModel(IMLComponentConfigModel iMLComponentConfigModel) {
        MethodCollector.m26663i(3646);
        this.readLock.lock();
        long j = this.mModelComponentHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(3646);
            return this;
        }
        _setMLConfigModel(j, iMLComponentConfigModel);
        this.readLock.unlock();
        MethodCollector.m26664o(3646);
        return this;
    }

    public MLComponentManager(String str) {
        MethodCollector.m26663i(3460);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.mName = str;
        MLComponentJniLoader.loadLibrary();
        if (!MLComponentJniLoader.isLibraryLoaded) {
            MLComponentLog.m44257e("mlComponent", "[mlComponent] no mlcomponent native loaded");
            MethodCollector.m26664o(3460);
            return;
        }
        long _createMLComponent = _createMLComponent(str);
        this.mModelComponentHandle = _createMLComponent;
        if (_createMLComponent == 0) {
            MLComponentLog.m44257e("mlComponent", "[mlcomponent] mlcomponent native new fail");
        }
        loadNecessaryMLEngine();
        MethodCollector.m26664o(3460);
    }
}
