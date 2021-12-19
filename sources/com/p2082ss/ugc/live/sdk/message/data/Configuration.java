package com.p2082ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.p2082ss.ugc.live.sdk.message.interfaces.ILogger;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ugc.live.sdk.message.data.Configuration */
public class Configuration {
    private boolean isEnhanceWS = false;
    private int mDuplicateSize = 512;
    private boolean mEnablePriority;
    private boolean mEnableSmoothlyDispatch;
    private List<OnInterceptListener> mInterceptListeners = new ArrayList();
    private List<IInterceptor> mInterceptors = new ArrayList();
    private boolean mIsAnchor;
    private ILogger mLogger;
    private IMessageClient mMessageClient;
    private IMessageWsClient mMessageClientWS;
    private IMessageConverter mMessageConverter;
    private IMonitor mMonitor;
    private AbstractC87076a mUplinkConfig;
    private long mWaitWsConnectDuration = 3000;

    static {
        Covode.recordClassIndex(102852);
    }

    public int getDuplicateSize() {
        return this.mDuplicateSize;
    }

    public IMessageClient getHttpClient() {
        return this.mMessageClient;
    }

    public IMessageWsClient getHttpClientWS() {
        return this.mMessageClientWS;
    }

    public List<OnInterceptListener> getInterceptListeners() {
        return this.mInterceptListeners;
    }

    public List<IInterceptor> getInterceptors() {
        return this.mInterceptors;
    }

    public ILogger getLogger() {
        return this.mLogger;
    }

    public IMessageConverter getMessageConverter() {
        return this.mMessageConverter;
    }

    public IMonitor getMonitor() {
        return this.mMonitor;
    }

    public AbstractC87076a getUplinkConfig() {
        return this.mUplinkConfig;
    }

    public long getWaitWsConnectDuration() {
        return this.mWaitWsConnectDuration;
    }

    public boolean isAnchor() {
        return this.mIsAnchor;
    }

    public boolean isEnablePriority() {
        return this.mEnablePriority;
    }

    public boolean isEnableSmoothlyDispatch() {
        return this.mEnableSmoothlyDispatch;
    }

    public boolean isEnhanceWS() {
        return this.isEnhanceWS;
    }

    public Configuration setAnchor(boolean z) {
        this.mIsAnchor = z;
        return this;
    }

    public Configuration setDuplicateSize(int i) {
        this.mDuplicateSize = i;
        return this;
    }

    public Configuration setEnablePriority(boolean z) {
        this.mEnablePriority = z;
        return this;
    }

    public Configuration setEnableSmoothlyDispatch(boolean z) {
        this.mEnableSmoothlyDispatch = z;
        return this;
    }

    public Configuration setHttpClient(IMessageClient iMessageClient) {
        this.mMessageClient = iMessageClient;
        return this;
    }

    public Configuration setIsEnhanceWS(boolean z) {
        this.isEnhanceWS = z;
        return this;
    }

    public Configuration setLogger(ILogger iLogger) {
        this.mLogger = iLogger;
        return this;
    }

    public Configuration setMessageConverter(IMessageConverter iMessageConverter) {
        this.mMessageConverter = iMessageConverter;
        return this;
    }

    public Configuration setMonitor(IMonitor iMonitor) {
        this.mMonitor = iMonitor;
        return this;
    }

    public Configuration setUplinkConfig(AbstractC87076a aVar) {
        this.mUplinkConfig = aVar;
        return this;
    }

    public Configuration setWaitWsConnectDuration(long j) {
        this.mWaitWsConnectDuration = j;
        return this;
    }

    public Configuration setWsClient(IMessageWsClient iMessageWsClient) {
        this.mMessageClientWS = iMessageWsClient;
        return this;
    }

    public Configuration addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return this;
        }
        this.mInterceptors.add(iInterceptor);
        return this;
    }

    public Configuration addOnInterceptListener(OnInterceptListener onInterceptListener) {
        if (onInterceptListener == null) {
            return this;
        }
        this.mInterceptListeners.add(onInterceptListener);
        return this;
    }
}
