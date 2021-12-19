package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class AwemeSpeedPredictor implements ISpeedPredictor, ISpeedPredictorAwemeListener {
    public ISpeedPredictorAwemePredictor mAwemeRealPredictor;
    private ISpeedPredictorListener mSpeedPredictorListener;
    private Timer timer;

    static {
        Covode.recordClassIndex(27610);
    }

    /* renamed from: com_bytedance_vcloud_networkpredictor_AwemeSpeedPredictor_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m44263x2dd895cd(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void close() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getAverageDownloadSpeed(int i, int i2, boolean z) {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public Map<String, String> getDownloadSpeed(int i) {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getLastPredictConfidence() {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalDownloadSpeeds() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getMultidimensionalPredictSpeeds() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public String getVersion() {
        return "A1.3.0";
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void prepare() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void release() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setConfigInfo(Map map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setModelComponent(MLComponentManager mLComponentManager) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void setSpeedQueueSize(int i) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void start() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(String str, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getCountry() {
        return this.mSpeedPredictorListener.getCountry();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getFilesCachePath() {
        return this.mSpeedPredictorListener.getFilesCachePath();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public Object getIOExecutor() {
        return this.mSpeedPredictorListener.getIOExecutor();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public String getNetworkType() {
        return this.mSpeedPredictorListener.getNetworkType();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public int getPhoneSignal() {
        return this.mSpeedPredictorListener.getPhoneSignal();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed() {
        return getPredictSpeed(0);
    }

    /* access modifiers changed from: package-private */
    public void stopCalculate() {
        this.timer.cancel();
    }

    /* access modifiers changed from: package-private */
    public void startCalculate() {
        Timer timer2 = new Timer("awemeSpeedPredictor");
        this.timer = timer2;
        timer2.schedule(new TimerTask() {
            /* class com.bytedance.vcloud.networkpredictor.AwemeSpeedPredictor.C235411 */

            static {
                Covode.recordClassIndex(27611);
            }

            public void run() {
                AwemeSpeedPredictor.this.mAwemeRealPredictor.calculateSpeed();
            }
        }, 500, 500);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public float getPredictSpeed(int i) {
        return (float) this.mAwemeRealPredictor.getSpeed();
    }

    public AwemeSpeedPredictor(ISpeedPredictorListener iSpeedPredictorListener) {
        Class<?> cls;
        this.mSpeedPredictorListener = iSpeedPredictorListener;
        try {
            cls = Class.forName("com.bytedance.vcloud.iesnetworkpredictnative.NetworkSpeedManager");
        } catch (ClassNotFoundException unused) {
            m44263x2dd895cd("AwemeSpeedPredictor", "AwemeSpeedPredictor: No Class Find");
            cls = null;
        }
        Method method = cls.getMethod("getInstance", new Class[0]);
        if (method == null) {
            m44263x2dd895cd("AwemeSpeedPredictor", "AwemeSpeedPredictor: No Class GetInstance Method Find");
        }
        ISpeedPredictorAwemePredictor iSpeedPredictorAwemePredictor = (ISpeedPredictorAwemePredictor) method.invoke(null, new Object[0]);
        this.mAwemeRealPredictor = iSpeedPredictorAwemePredictor;
        if (iSpeedPredictorAwemePredictor == null) {
            m44263x2dd895cd("AwemeSpeedPredictor", "AwemeSpeedPredictor: No instance Obj Produce");
        }
        this.mSpeedPredictorListener = iSpeedPredictorListener;
    }

    public void setupAlgorithmTypeAndConfig(int i, ISpeedPredictorMLConfig iSpeedPredictorMLConfig) {
        if (i == 4) {
            Timer timer2 = this.timer;
            if (timer2 != null) {
                timer2.cancel();
            }
            this.mAwemeRealPredictor.setSpeedAlgorithmType(4);
        } else if (i == 5) {
            this.mAwemeRealPredictor.setPredictorListener(this);
            this.mAwemeRealPredictor.configMlModel(iSpeedPredictorMLConfig);
            this.mAwemeRealPredictor.setSpeedAlgorithmType(5);
            startCalculate();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorAwemeListener
    public boolean getDownFileState(String str, String str2, String str3) {
        return this.mSpeedPredictorListener.getDownFileState(str, str2, str3);
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictor
    public void update(long j, long j2, long j3) {
        if (j2 > 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            this.mAwemeRealPredictor.monitorVideoSpeed((8.0d * d) / (d2 / 1000.0d), d, j2);
        }
    }
}
