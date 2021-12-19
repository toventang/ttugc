package com.bytedance.vcloud.networkpredictor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultSpeedPredictor implements Handler.Callback, ISpeedPredictor {
    ReentrantReadWriteLock lock;
    private MLComponentManager mComponentManager;
    private long mHandle;
    public Handler mSpeedUpdateHander;
    final ReentrantReadWriteLock.ReadLock readLock;
    private Thread subThread;
    final ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();

    static {
        Covode.recordClassIndex(27613);
    }

    private native void _close(long j);

    private native long _create(int i);

    private native float _getAverageDownloadSpeed(long j, int i, int i2, boolean z);

    private native double _getDoubleValue(long j, int i, double d);

    private native Map<String, String> _getDownloadSpeed(long j, int i);

    private native int _getIntValue(long j, int i, int i2);

    private native float _getLastPredictConfidence(long j);

    private native long _getLongValue(long j, int i, long j2);

    private native SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds(long j);

    private native SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds(long j);

    private native float _getPredictSpeed(long j, int i);

    private native String _getVersion();

    private native void _prepare(long j);

    private native void _release(long j);

    private native void _setConfigSpeedInfo(long j, Map<String, String> map);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setModelComponent(long j, MLComponentManager mLComponentManager);

    private native void _setSpeedQueueSize(long j, int i);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j);

    private native void _update(long j, ArrayList<SpeedPredictorRecord> arrayList, Map<String, Integer> map);

    private native void _updateOldWithStreamId(long j, ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    private native void _updateWithSizeTime(long j, long j2, long j3, long j4);

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed() {
        return getPredictSpeed(0);
    }

    private void resetSpeedPredictor() {
        Handler handler = this.mSpeedUpdateHander;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mSpeedUpdateHander.getLooper().quit();
            this.mSpeedUpdateHander = null;
            this.subThread = null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getVersion() {
        MethodCollector.m26663i(6700);
        if (this.mHandle == 0) {
            MethodCollector.m26664o(6700);
            return "j_1.3.0";
        }
        String _getVersion = _getVersion();
        MethodCollector.m26664o(6700);
        return _getVersion;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void close() {
        MethodCollector.m26663i(7298);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(7298);
            return;
        }
        _close(j);
        this.readLock.unlock();
        MethodCollector.m26664o(7298);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getLastPredictConfidence() {
        MethodCollector.m26663i(8226);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(8226);
            return -1.0f;
        }
        float _getLastPredictConfidence = _getLastPredictConfidence(j);
        this.readLock.unlock();
        MethodCollector.m26664o(8226);
        return _getLastPredictConfidence;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalDownloadSpeeds() {
        MethodCollector.m26663i(10047);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(10047);
            return null;
        }
        String speedPredictorResultArrayToString = speedPredictorResultArrayToString(_getMultidimensionalDownloadSpeeds(j).getResultCollection());
        this.readLock.unlock();
        MethodCollector.m26664o(10047);
        return speedPredictorResultArrayToString;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj() {
        MethodCollector.m26663i(10679);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(10679);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds = _getMultidimensionalDownloadSpeeds(j);
        this.readLock.unlock();
        MethodCollector.m26664o(10679);
        return _getMultidimensionalDownloadSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalPredictSpeeds() {
        MethodCollector.m26663i(10049);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(10049);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j);
        if (_getMultidimensionalPredictSpeeds != null) {
            this.readLock.unlock();
            String speedPredictorResultArrayToString = speedPredictorResultArrayToString(_getMultidimensionalPredictSpeeds.getResultCollection());
            MethodCollector.m26664o(10049);
            return speedPredictorResultArrayToString;
        }
        this.readLock.unlock();
        MethodCollector.m26664o(10049);
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj() {
        MethodCollector.m26663i(5868);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(5868);
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j);
        this.readLock.unlock();
        MethodCollector.m26664o(5868);
        return _getMultidimensionalPredictSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void prepare() {
        MethodCollector.m26663i(6989);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(6989);
            return;
        }
        _prepare(j);
        this.readLock.unlock();
        MethodCollector.m26664o(6989);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void release() {
        MethodCollector.m26663i(6015);
        this.writeLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.writeLock.unlock();
            MethodCollector.m26664o(6015);
            return;
        }
        _close(j);
        _release(this.mHandle);
        this.mHandle = 0;
        resetSpeedPredictor();
        this.writeLock.unlock();
        MethodCollector.m26664o(6015);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void start() {
        MethodCollector.m26663i(7145);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(7145);
            return;
        }
        _start(j);
        this.readLock.unlock();
        MethodCollector.m26664o(7145);
    }

    public boolean handleMessage(Message message) {
        MethodCollector.m26663i(6168);
        if (message.what == 0) {
            SpeedPredictorNotifyInfo speedPredictorNotifyInfo = (SpeedPredictorNotifyInfo) message.obj;
            _updateOldWithStreamId(this.mHandle, speedPredictorNotifyInfo.mSpeedRecord, speedPredictorNotifyInfo.mStreamIdMediaTypeMap);
        }
        MethodCollector.m26664o(6168);
        return true;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public Map<String, String> getDownloadSpeed(int i) {
        MethodCollector.m26663i(8357);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(8357);
            return null;
        }
        Map<String, String> _getDownloadSpeed = _getDownloadSpeed(j, i);
        this.readLock.unlock();
        MethodCollector.m26664o(8357);
        return _getDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed(int i) {
        MethodCollector.m26663i(7467);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(7467);
            return -1.0f;
        }
        float _getPredictSpeed = _getPredictSpeed(j, i);
        this.readLock.unlock();
        MethodCollector.m26664o(7467);
        return _getPredictSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setConfigInfo(Map map) {
        MethodCollector.m26663i(6703);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(6703);
            return;
        }
        _setConfigSpeedInfo(j, map);
        this.readLock.unlock();
        MethodCollector.m26664o(6703);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setModelComponent(MLComponentManager mLComponentManager) {
        MethodCollector.m26663i(6701);
        this.mComponentManager = mLComponentManager;
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(6701);
            return;
        }
        _setModelComponent(j, this.mComponentManager);
        this.readLock.unlock();
        MethodCollector.m26664o(6701);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setSpeedQueueSize(int i) {
        MethodCollector.m26663i(6852);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(6852);
            return;
        }
        _setSpeedQueueSize(j, i);
        this.readLock.unlock();
        MethodCollector.m26664o(6852);
    }

    public DefaultSpeedPredictor(int i) {
        MethodCollector.m26663i(6549);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        SpeedPredictorJniLoader.loadLibrary();
        if (!SpeedPredictorJniLoader.isLibraryLoaded) {
            SpeedPredictorLog.m44271e("SpeedPredictor", "[SpeedPredictor] no predictor native loaded");
            MethodCollector.m26664o(6549);
            return;
        }
        this.mHandle = _create(i);
        SpeedPredictorConfig.setLoglevel(0);
        _setIntValue(this.mHandle, 0, SpeedPredictorConfig.getLogLevel());
        MethodCollector.m26664o(6549);
    }

    private String speedPredictorResultArrayToString(ArrayList<SpeedPredictorResult> arrayList) {
        JSONObject jsonObject;
        if (arrayList == null) {
            try {
                throw new NullPointerException("size");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<SpeedPredictorResult> it = arrayList.iterator();
            while (it.hasNext()) {
                SpeedPredictorResult next = it.next();
                if (!(next == null || (jsonObject = next.toJsonObject()) == null)) {
                    jSONArray.put(jsonObject);
                }
            }
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", jSONArray);
                return jSONObject.toString();
            }
            return null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
        MethodCollector.m26663i(8959);
        this.readLock.lock();
        if (this.mHandle == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(8959);
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.subThread == null) {
                C235421 r1 = new Thread() {
                    /* class com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor.C235421 */

                    static {
                        Covode.recordClassIndex(27614);
                    }

                    public void run() {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        DefaultSpeedPredictor.this.mSpeedUpdateHander = new Handler(this);
                        Looper.loop();
                    }
                };
                this.subThread = r1;
                r1.setName("speed_predict_update_thread");
                this.subThread.start();
            }
            if (this.mSpeedUpdateHander != null) {
                SpeedPredictorNotifyInfo speedPredictorNotifyInfo = new SpeedPredictorNotifyInfo();
                speedPredictorNotifyInfo.what = 0;
                speedPredictorNotifyInfo.mSpeedRecord = iSpeedRecordOld;
                speedPredictorNotifyInfo.mStreamIdMediaTypeMap = map;
                Message obtainMessage = this.mSpeedUpdateHander.obtainMessage();
                obtainMessage.what = 0;
                obtainMessage.obj = speedPredictorNotifyInfo;
                obtainMessage.sendToTarget();
            }
        } else {
            _updateOldWithStreamId(this.mHandle, iSpeedRecordOld, map);
        }
        this.readLock.unlock();
        MethodCollector.m26664o(8959);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(String str, Map<String, Integer> map) {
        MethodCollector.m26663i(8653);
        this.readLock.lock();
        if (this.mHandle == 0 || str == null || str.length() < 0 || map == null || map.size() < 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(8653);
            return;
        }
        this.readLock.unlock();
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("data");
            ArrayList<SpeedPredictorRecord> arrayList = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    SpeedPredictorRecord speedPredictorRecord = new SpeedPredictorRecord();
                    speedPredictorRecord.extractFields(jSONObject);
                    arrayList.add(speedPredictorRecord);
                } catch (Throwable unused) {
                }
            }
            this.readLock.lock();
            _update(this.mHandle, arrayList, map);
            this.readLock.unlock();
            MethodCollector.m26664o(8653);
        } catch (Exception unused2) {
            MethodCollector.m26664o(8653);
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getAverageDownloadSpeed(int i, int i2, boolean z) {
        MethodCollector.m26663i(5870);
        this.readLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(5870);
            return -1.0f;
        }
        float _getAverageDownloadSpeed = _getAverageDownloadSpeed(j, i, i2, z);
        this.readLock.unlock();
        MethodCollector.m26664o(5870);
        return _getAverageDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(long j, long j2, long j3) {
        MethodCollector.m26663i(8961);
        this.readLock.lock();
        long j4 = this.mHandle;
        if (j4 == 0) {
            this.readLock.unlock();
            MethodCollector.m26664o(8961);
            return;
        }
        _updateWithSizeTime(j4, j, j2, j3);
        this.readLock.unlock();
        MethodCollector.m26664o(8961);
    }
}
