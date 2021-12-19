package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private Context mContext;
    private CountDownLatch mCountDownLatch = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(106705);
    }

    /* renamed from: org_webrtc_ScreenCapturerAndroid_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m157060x221aa499(String str, String str2) {
        return 0;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        MethodCollector.m26663i(157);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().dispose();
            MethodCollector.m26664o(157);
            return;
        }
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 5, null));
        try {
            this.mCountDownLatch.await(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m157060x221aa499("ScreenCaptureAndroid", "dispose finish");
        MethodCollector.m26664o(157);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        MethodCollector.m26663i(149);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().stopCapture();
            MethodCollector.m26664o(149);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("hc", this.mCountDownLatch.hashCode());
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 2, intent));
        MethodCollector.m26664o(149);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
            return;
        }
        int addFrame = ScreenCaptureAndroidManager.INSTANCE().addFrame(videoFrame);
        Intent intent = new Intent();
        intent.putExtra("i", addFrame);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 4, intent));
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        ScreenCaptureAndroidManager.INSTANCE().addLock(this.mCountDownLatch.hashCode(), this.mCountDownLatch);
        ScreenCaptureAndroidManager.INSTANCE().setData(intent, callback);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        MethodCollector.m26663i(1748);
        this.mContext = context;
        ScreenCaptureAndroidManager.INSTANCE().initialize(surfaceTextureHelper, context, capturerObserver);
        MethodCollector.m26664o(1748);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        MethodCollector.m26663i(132);
        startCapture(i, i2, i3, 4);
        MethodCollector.m26664o(132);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        MethodCollector.m26663i(1396);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i, i2, i3);
            MethodCollector.m26664o(1396);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("w", i);
        intent.putExtra("h", i2);
        intent.putExtra("if", i3);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 3, intent));
        MethodCollector.m26664o(1396);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(1756);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().startCapture(i, i2, i3, i4);
            MethodCollector.m26664o(1756);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("w", i);
        intent.putExtra("h", i2);
        intent.putExtra("if", i3);
        if (i4 <= 0) {
            i4 = 4;
        }
        intent.putExtra("minfr", i4);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 1, intent));
        MethodCollector.m26664o(1756);
    }
}
