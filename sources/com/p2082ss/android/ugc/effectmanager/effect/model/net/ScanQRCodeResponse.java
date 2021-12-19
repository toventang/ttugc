package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.PlatformEffect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse */
public class ScanQRCodeResponse extends BaseNetResponse {
    public DataNode data;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse$DataNode */
    public static class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;

        static {
            Covode.recordClassIndex(95613);
        }
    }

    static {
        Covode.recordClassIndex(95612);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
