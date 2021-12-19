package com.p2082ss.android.anywheredoor_api.service;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.anywheredoor_api.service.IAnyDoorService */
public interface IAnyDoorService {
    static {
        Covode.recordClassIndex(36134);
    }

    Map<String, Object> anyDoorIntercept(String str);

    void closeMockByNodeID();

    boolean getAnyDoorLarkSsoSwitch(Context context);

    boolean getAnyDoorProxySwitch(Context context);

    boolean getAnyDoorShakeSwitch(Context context);

    Application.ActivityLifecycleCallbacks getAnywhereLifeCallbacks();

    boolean getAnywhereSwitch(Context context);

    boolean getAutoTestSwitch(Context context);

    boolean interceptScanResult(Context context, String str);

    boolean mockByNodeID(String str);

    void openAnyWhereDoorPage(Context context);

    void preLoad();

    boolean setAnyDoorLarkSsoSwitch(Context context, boolean z);

    boolean setAnyDoorProxySwitch(Context context, boolean z);

    boolean setAnyDoorShakeSwitch(Context context, boolean z);

    void setAnywhereSwitch(Context context, boolean z);

    void setAutoTestSwitch(Context context, boolean z);

    boolean switchEnable(Context context, boolean z);

    void useAnyDoorCache(boolean z);
}
