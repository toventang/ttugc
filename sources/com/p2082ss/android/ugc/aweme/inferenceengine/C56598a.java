package com.p2082ss.android.ugc.aweme.inferenceengine;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30079f;
import com.p2082ss.android.p2160ml.C30088k;
import com.p2082ss.android.p2160ml.C30120t;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import com.p2082ss.bytenn.API;
import com.p2082ss.bytenn.ByteNNConfig;
import com.p2082ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.inferenceengine.a */
public final class C56598a implements AbstractC30079f {

    /* renamed from: a */
    private API f129029a;

    static {
        Covode.recordClassIndex(66424);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30079f
    /* renamed from: a */
    public final boolean mo53447a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        API api = new API();
        this.f129029a = api;
        API.EnumC86071a CreateEngine = api.CreateEngine();
        if (CreateEngine != API.EnumC86071a.NO_ERROR) {
            C30120t.m60921a(new RuntimeException("byteNN create engine failed with code ".concat(String.valueOf(CreateEngine))));
            return false;
        }
        ByteNNConfig byteNNConfig = new ByteNNConfig();
        try {
            ByteNNConfig.EnumC86073a aVar = ByteNNConfig.EnumC86073a.CPU;
            if (TextUtils.equals(mLConfigModel.bytenn_forward_type, "auto")) {
                aVar = ByteNNConfig.EnumC86073a.Auto;
            }
            byteNNConfig.init(aVar, mappedByteBuffer, null, "", "");
            if (mLConfigModel.num_threads == 2) {
                byteNNConfig.setThreadNum(mLConfigModel.num_threads);
            } else {
                byteNNConfig.setThreadNum(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        API.EnumC86071a InitEngine = this.f129029a.InitEngine(byteNNConfig);
        if (InitEngine != API.EnumC86071a.NO_ERROR) {
            C30120t.m60921a(new RuntimeException("byteNN init engine failed with code ".concat(String.valueOf(InitEngine))));
        }
        if (InitEngine == API.EnumC86071a.NO_ERROR) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30079f
    /* renamed from: a */
    public final void mo53446a(ByteBuffer byteBuffer, float[][] fArr) {
        if (this.f129029a != null) {
            ArrayList<Tensor> arrayList = new ArrayList<>();
            API.EnumC86071a GetEngineInputConfig = this.f129029a.GetEngineInputConfig(arrayList);
            if (GetEngineInputConfig != API.EnumC86071a.NO_ERROR) {
                C30120t.m60921a(new RuntimeException("byteNN get engine input failed with code ".concat(String.valueOf(GetEngineInputConfig))));
                return;
            }
            try {
                arrayList.get(0).setData(byteBuffer);
                this.f129029a.SetEngineInputs(arrayList);
                this.f129029a.Inference();
                ArrayList<Tensor> arrayList2 = new ArrayList<>();
                API.EnumC86071a GetEngineOutputs = this.f129029a.GetEngineOutputs(arrayList2);
                if (GetEngineOutputs != API.EnumC86071a.NO_ERROR) {
                    C30120t.m60921a(new RuntimeException("byteNN inference get output failed with code ".concat(String.valueOf(GetEngineOutputs))));
                    return;
                }
                ByteBuffer data = arrayList2.get(0).getData();
                data.order(ByteOrder.nativeOrder());
                int i = 0;
                while (data.hasRemaining()) {
                    float f = data.getFloat();
                    if (i < fArr[0].length) {
                        fArr[0][i] = f;
                    }
                    i++;
                }
            } catch (Exception e) {
                C30088k.m60845a("ml#evaluator", "inference error: ", e);
                C30120t.m60921a(e);
            }
        }
    }
}
