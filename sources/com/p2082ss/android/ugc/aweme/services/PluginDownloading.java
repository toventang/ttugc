package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.PluginDownloading */
public final class PluginDownloading extends PluginState {
    private final long currentDownload;
    private final long total;

    static {
        Covode.recordClassIndex(79701);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_PluginDownloading_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120116xd8644e35(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ PluginDownloading copy$default(PluginDownloading pluginDownloading, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pluginDownloading.currentDownload;
        }
        if ((i & 2) != 0) {
            j2 = pluginDownloading.total;
        }
        return pluginDownloading.copy(j, j2);
    }

    public final long component1() {
        return this.currentDownload;
    }

    public final long component2() {
        return this.total;
    }

    public final PluginDownloading copy(long j, long j2) {
        return new PluginDownloading(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginDownloading)) {
            return false;
        }
        PluginDownloading pluginDownloading = (PluginDownloading) obj;
        return this.currentDownload == pluginDownloading.currentDownload && this.total == pluginDownloading.total;
    }

    public final int hashCode() {
        return (m120116xd8644e35(this.currentDownload) * 31) + m120116xd8644e35(this.total);
    }

    public final String toString() {
        return "PluginDownloading(currentDownload=" + this.currentDownload + ", total=" + this.total + ")";
    }

    public final long getCurrentDownload() {
        return this.currentDownload;
    }

    public final long getTotal() {
        return this.total;
    }

    public PluginDownloading(long j, long j2) {
        super(null);
        this.currentDownload = j;
        this.total = j2;
    }
}
