package com.p2082ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.download.DownloadResult */
public final class DownloadResult {
    private DownloadException downloadException;
    private long downloadTimeMillsCost;
    private long fetchInputStreamTimeMillsCost;
    private long fileSize;
    private long unzipTimeMillsCost;
    private long writeToDiskTimeMillsCost;

    static {
        Covode.recordClassIndex(95466);
    }

    public final DownloadException getDownloadException() {
        return this.downloadException;
    }

    public final long getDownloadTimeMillsCost() {
        return this.downloadTimeMillsCost;
    }

    public final long getFetchInputStreamTimeMillsCost() {
        return this.fetchInputStreamTimeMillsCost;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getUnzipTimeMillsCost() {
        return this.unzipTimeMillsCost;
    }

    public final long getWriteToDiskTimeMillsCost() {
        return this.writeToDiskTimeMillsCost;
    }

    public final boolean isSuccess() {
        if (this.downloadException == null) {
            return true;
        }
        return false;
    }

    public final void setDownloadException(DownloadException downloadException2) {
        this.downloadException = downloadException2;
    }

    public final void setDownloadTimeMillsCost(long j) {
        this.downloadTimeMillsCost = j;
    }

    public final void setFetchInputStreamTimeMillsCost(long j) {
        this.fetchInputStreamTimeMillsCost = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setUnzipTimeMillsCost(long j) {
        this.unzipTimeMillsCost = j;
    }

    public final void setWriteToDiskTimeMillsCost(long j) {
        this.writeToDiskTimeMillsCost = j;
    }
}
