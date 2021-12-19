package com.p2082ss.bytertc.engine.handler;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler */
public class RTCEngineInternalEventHandler {
    private String mCurrConfigAddr;
    private String mCurrSignalingAddr;
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;
    private WeakReference<IRTCEngineInternalEventHandler> mRtcEngineInternalEventHandler;

    static {
        Covode.recordClassIndex(101061);
    }

    public RTCEngineInternalEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onChannelTypeChanged(boolean z) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onChannelTypeChanged(z);
                }
            }
        } catch (Exception e) {
            LogUtil.m147885d("REngineInternalEventHandler", "onChannelTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConfigAddrChanged(String str) {
        try {
            this.mCurrConfigAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onConfigAddrChanged(str);
                }
            }
        } catch (Exception e) {
            LogUtil.m147885d("REngineInternalEventHandler", "onConfigAddrChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onPeerConnectionICEMux(boolean z) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onPeerConnectionICEMux(z);
                }
            }
        } catch (Exception e) {
            LogUtil.m147885d("REngineInternalEventHandler", "onPeerConnectionICEMux callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSignalingAddrChanged(String str) {
        try {
            this.mCurrSignalingAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onSignalingAddrChanged(str);
                }
            }
        } catch (Exception e) {
            LogUtil.m147885d("REngineInternalEventHandler", "onSignalingAddrChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        WeakReference<IRTCEngineInternalEventHandler> weakReference = new WeakReference<>(iRTCEngineInternalEventHandler);
        this.mRtcEngineInternalEventHandler = weakReference;
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler2 = weakReference.get();
        if (iRTCEngineInternalEventHandler2 != null) {
            if (!TextUtils.isEmpty(this.mCurrConfigAddr)) {
                iRTCEngineInternalEventHandler2.onConfigAddrChanged(this.mCurrConfigAddr);
            }
            if (!TextUtils.isEmpty(this.mCurrSignalingAddr)) {
                iRTCEngineInternalEventHandler2.onSignalingAddrChanged(this.mCurrSignalingAddr);
            }
        }
    }

    public void onSystemInfoLog(double d, double d2, double d3) {
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null) {
                IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler = weakReference.get();
                if (iRTCEngineInternalEventHandler != null) {
                    iRTCEngineInternalEventHandler.onSystemInfoLog(d, d2, d3);
                }
            }
        } catch (Exception e) {
            LogUtil.m147885d("REngineInternalEventHandler", "onSystemInfoLog callback catch exception.\n" + e.getMessage());
        }
    }
}
