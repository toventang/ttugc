package com.bytedance.android.livesdkapi.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public interface IReactNativeHost {

    public interface Callback1<T> {
        static {
            Covode.recordClassIndex(13548);
        }

        void call(T t);
    }

    public interface Callback2<T1, T2> {
        static {
            Covode.recordClassIndex(13549);
        }

        void call(T1 t1, T2 t2);
    }

    static {
        Covode.recordClassIndex(13547);
    }

    Map<String, String> apiParam();

    JSONObject callJSBridge(String str, HashMap<String, Object> hashMap);

    void centerToast(String str);

    DialogInterface$OnCancelListenerC0944d createWebDialogFragment(String str, int i, int i2, int i3, int i4, String str2);

    Activity currentActivity();

    int dp2Px(int i);

    void fetch(String str, String str2, Map<String, String> map, Callback2<String, Map<String, Object>> callback2);

    Application getApplication();

    String getOfflinePath(String str);

    <T> T getSettingValue(String str, Class<T> cls, T t);

    void openScheme(Context context, String str, String str2);

    void sendLogV3(String str, Map<String, String> map);

    void showDialog(String str, String str2, String str3, String str4, boolean z, Callback1<Boolean> callback1);
}
