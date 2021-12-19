package com.bytedance.android.livesdk.liveroom;

import android.content.Context;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRemoveTrafficDialogSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p436af.C6639a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

public class NetworkController implements ISubController {
    private C6639a mNetworkBroadcastReceiver = new C6639a();
    private C6639a.AbstractC6640a mShowNetworkToast = new C6639a.AbstractC6640a() {
        /* class com.bytedance.android.livesdk.liveroom.NetworkController.C93091 */

        static {
            Covode.recordClassIndex(10240);
        }

        @Override // com.bytedance.android.livesdk.p436af.C6639a.AbstractC6640a
        /* renamed from: a */
        public final void mo12790a(NetworkUtils.EnumC29835h hVar) {
            NetworkController.this.showNetworkToastWhenUseCellular(hVar, "change_to_cellular");
        }
    };

    static {
        Covode.recordClassIndex(10239);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        if (LiveMtRemoveTrafficDialogSetting.INSTANCE.getValue() == 2) {
            this.mNetworkBroadcastReceiver.mo12785a();
            this.mNetworkBroadcastReceiver.mo12788b(this.mShowNetworkToast);
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        if (LiveMtRemoveTrafficDialogSetting.INSTANCE.getValue() == 2) {
            this.mNetworkBroadcastReceiver.mo12786a(C3966y.m9669e());
            this.mNetworkBroadcastReceiver.mo12787a(this.mShowNetworkToast);
            showNetworkToastWhenUseCellular(m17584x5bb3347b(C3966y.m9669e()), "enter_live");
        }
    }

    /* renamed from: com_bytedance_android_livesdk_liveroom_NetworkController_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 */
    public static NetworkUtils.EnumC29835h m17584x5bb3347b(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    public void showNetworkToastWhenUseCellular(NetworkUtils.EnumC29835h hVar, String str) {
        if (hVar != NetworkUtils.EnumC29835h.WIFI && hVar != NetworkUtils.EnumC29835h.NONE) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dwb), 0);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            C6501b.C6502a.m13948a("using_cellular_toast_show").mo12652a((Map<String, String>) hashMap).mo12656c("show").mo12639a().mo12655b();
        }
    }
}
