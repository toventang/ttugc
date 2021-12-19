package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class GeckoConfig {
    private String accessKey;
    private boolean appLogMonitor;
    private String businessVersion;
    private boolean isRelativePath;
    private AbstractC16661d loaderDepender;
    private String localInfo;
    private boolean loopCheck;
    private Object networkImpl;
    private String offlineDir;
    private boolean serverMonitor;
    private boolean updateWhenInit;
    private boolean useGeckoXV4;

    static {
        Covode.recordClassIndex(19095);
    }

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAppLogMonitor() {
        return this.appLogMonitor;
    }

    public final String getBusinessVersion() {
        return this.businessVersion;
    }

    public final AbstractC16661d getLoaderDepender() {
        return this.loaderDepender;
    }

    public final String getLocalInfo() {
        return this.localInfo;
    }

    public final boolean getLoopCheck() {
        return this.loopCheck;
    }

    public final Object getNetworkImpl() {
        return this.networkImpl;
    }

    public final String getOfflineDir() {
        return this.offlineDir;
    }

    public final boolean getServerMonitor() {
        return this.serverMonitor;
    }

    public final boolean getUpdateWhenInit() {
        return this.updateWhenInit;
    }

    public final boolean getUseGeckoXV4() {
        return this.useGeckoXV4;
    }

    public final boolean isRelativePath() {
        return this.isRelativePath;
    }

    public final void setAppLogMonitor(boolean z) {
        this.appLogMonitor = z;
    }

    public final void setBusinessVersion(String str) {
        this.businessVersion = str;
    }

    public final void setLoopCheck(boolean z) {
        this.loopCheck = z;
    }

    public final void setNetworkImpl(Object obj) {
        this.networkImpl = obj;
    }

    public final void setRelativePath(boolean z) {
        this.isRelativePath = z;
    }

    public final void setServerMonitor(boolean z) {
        this.serverMonitor = z;
    }

    public final void setUpdateWhenInit(boolean z) {
        this.updateWhenInit = z;
    }

    public final void setUseGeckoXV4(boolean z) {
        this.useGeckoXV4 = z;
    }

    public final void setAccessKey(String str) {
        C89219l.m154719c(str, "");
        this.accessKey = str;
    }

    public final void setLoaderDepender(AbstractC16661d dVar) {
        C89219l.m154719c(dVar, "");
        this.loaderDepender = dVar;
    }

    public final void setLocalInfo(String str) {
        C89219l.m154719c(str, "");
        this.localInfo = str;
    }

    public final void setOfflineDir(String str) {
        C89219l.m154719c(str, "");
        this.offlineDir = str;
    }

    public GeckoConfig(String str, String str2, AbstractC16661d dVar, boolean z, boolean z2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(dVar, "");
        this.accessKey = str;
        this.offlineDir = str2;
        this.loaderDepender = dVar;
        this.isRelativePath = z;
        this.loopCheck = z2;
        this.useGeckoXV4 = true;
        this.serverMonitor = true;
        this.localInfo = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GeckoConfig(String str, String str2, AbstractC16661d dVar, boolean z, boolean z2, int i, C89214g gVar) {
        this(str, str2, dVar, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }
}
