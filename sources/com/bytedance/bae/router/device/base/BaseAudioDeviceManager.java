package com.bytedance.bae.router.device.base;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public abstract class BaseAudioDeviceManager implements IAudioDeviceManager.INotHotPlugableDevice {
    private IAudioDeviceManager.OnNotHotPlugableDeviceCallback mCallback;
    private WeakReference<Context> mContext;

    static {
        Covode.recordClassIndex(15059);
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.mContext.get();
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public boolean isActive() {
        if (getActiveState() == 1) {
            return true;
        }
        return false;
    }

    public AudioManager getAudioManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (AudioManager) m23644xa1f3e4fa(context, DataType.AUDIO);
    }

    /* access modifiers changed from: protected */
    public void onError(int i, String str) {
        this.mCallback.onError(i, str);
    }

    public BaseAudioDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        this.mContext = new WeakReference<>(context);
        this.mCallback = onNotHotPlugableDeviceCallback;
    }

    /* renamed from: com_bytedance_bae_router_device_base_BaseAudioDeviceManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m23644xa1f3e4fa(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
