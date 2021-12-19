package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.utils.LogUtil;

/* renamed from: com.ss.bytertc.engine.handler.RTCEncryptHandler */
public class RTCEncryptHandler {
    private IRTCEncryptionHandler mCustomizeEncryptHandler;

    static {
        Covode.recordClassIndex(101058);
    }

    public RTCEncryptHandler(IRTCEncryptionHandler iRTCEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRTCEncryptionHandler;
    }

    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.m147885d("RtcEngineEncryptHandler", "onDecryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onDecryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m147885d("RtcEngineEncryptHandler", "onDecryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }

    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.m147885d("RtcEngineEncryptHandler", "onEncryptData...");
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler != null) {
                return iRTCEncryptionHandler.onEncryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m147885d("RtcEngineEncryptHandler", "onEncryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }
}
