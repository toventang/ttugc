package com.p2082ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.utils.LogUtil;

/* renamed from: com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    static {
        Covode.recordClassIndex(101105);
    }

    @Override // com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadAlready(String str) {
        LogUtil.m147888i("RtcNativeLibraryLoaderListener", "onLoadAlready : ".concat(String.valueOf(str)));
    }

    @Override // com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadError(String str) {
        LogUtil.m147888i("RtcNativeLibraryLoaderListener", "onLoadError : ".concat(String.valueOf(str)));
    }

    @Override // com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener, org.webrtc.NativeLibraryLoadListener
    public void onLoadSuccess(String str) {
        LogUtil.m147888i("RtcNativeLibraryLoaderListener", "onLoadSuccess : ".concat(String.valueOf(str)));
    }
}
