package org.webrtc;

import android.media.MediaRecorder;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import org.webrtc.CameraEnumerationAndroid;

public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        static {
            Covode.recordClassIndex(106592);
        }

        void onCameraClosed();

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public interface CameraSwitchHandler {
        static {
            Covode.recordClassIndex(106595);
        }

        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface MediaRecorderHandler {
        static {
            Covode.recordClassIndex(106596);
        }

        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    static {
        Covode.recordClassIndex(106590);
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(106597);
        }

        public static ORIENTATION_MODE convertFromInt(int i) {
            return values()[i];
        }

        private ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }

    public static class CameraStatistics {
        private final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        static {
            Covode.recordClassIndex(106593);
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }

        private void checkThread() {
            if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper2, CameraEventsHandler cameraEventsHandler) {
            RunnableC902841 r3 = new Runnable() {
                /* class org.webrtc.CameraVideoCapturer.CameraStatistics.RunnableC902841 */

                static {
                    Covode.recordClassIndex(106594);
                }

                public void run() {
                    Logging.m157044i("CameraStatistics", "Camera fps: " + Math.round((((float) CameraStatistics.this.frameCount) * 1000.0f) / 2000.0f) + ".");
                    if (CameraStatistics.this.frameCount == 0) {
                        CameraStatistics.this.freezePeriodCount++;
                        if (CameraStatistics.this.freezePeriodCount * LiveNetAdaptiveHurryTimeSetting.DEFAULT >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            Logging.m157042e("CameraStatistics", "Camera freezed.");
                            if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        CameraStatistics.this.freezePeriodCount = 0;
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            };
            this.cameraObserver = r3;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper2.getHandler().postDelayed(r3, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }
    }
}
