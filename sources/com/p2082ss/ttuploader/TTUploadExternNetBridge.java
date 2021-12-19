package com.p2082ss.ttuploader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ttnet.p1703d.C22944d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTUploadExternNetBridge */
public class TTUploadExternNetBridge implements TTExternNetLoaderListener {
    TTExternResponseInfo curResponseInfo = null;
    String extraInfo = null;
    volatile boolean isFinished = false;
    private Lock lock = new ReentrantLock();
    long mHandle = 0;

    static {
        Covode.recordClassIndex(101484);
    }

    private native void nativeTTNetCallback(long j);

    private native int nativeTTNetReadFileData(long j, byte[] bArr, long j2, int i);

    public int isFinished() {
        if (this.isFinished) {
            return 1;
        }
        return 0;
    }

    public Object getExtraInfo() {
        try {
            this.lock.lock();
            return this.extraInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public Object getResponseObject() {
        try {
            this.lock.lock();
            return this.curResponseInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void resetHandle() {
        try {
            this.lock.lock();
            this.mHandle = 0;
        } finally {
            this.lock.unlock();
        }
    }

    public void cancelTask(Object obj) {
        TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
        if (tTExternNetLoader != null) {
            tTExternNetLoader.cancelTask();
        }
    }

    @Override // com.p2082ss.ttuploader.TTExternNetLoaderListener
    public void onComplete(TTExternResponseInfo tTExternResponseInfo) {
        MethodCollector.m26663i(12923);
        try {
            this.lock.lock();
            this.curResponseInfo = tTExternResponseInfo;
            this.isFinished = true;
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
            MethodCollector.m26664o(12923);
        }
    }

    @Override // com.p2082ss.ttuploader.TTExternNetLoaderListener
    public void onFailed(String str, Throwable th) {
        MethodCollector.m26663i(13007);
        try {
            this.lock.lock();
            this.isFinished = true;
            if (th != null) {
                this.extraInfo = th.toString();
            }
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
            MethodCollector.m26664o(13007);
        }
    }

    @Override // com.p2082ss.ttuploader.TTExternNetLoaderListener
    public int readFileData(byte[] bArr, long j, int i) {
        MethodCollector.m26663i(13100);
        int nativeTTNetReadFileData = nativeTTNetReadFileData(this.mHandle, bArr, j, i);
        MethodCollector.m26664o(13100);
        return nativeTTNetReadFileData;
    }

    /* JADX INFO: finally extract failed */
    public int sendRequest(Object obj, long j, String str, String str2, String str3, byte[] bArr, int i, int i2, int i3) {
        JSONObject jSONObject;
        if (!(obj == null || j == 0 || TextUtils.isEmpty(str))) {
            this.mHandle = j;
            try {
                jSONObject = new JSONObject(str3);
            } catch (Exception unused) {
                jSONObject = null;
            }
            TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
            if (!(jSONObject == null || tTExternNetLoader == null)) {
                this.curResponseInfo = null;
                try {
                    this.lock.lock();
                    this.isFinished = false;
                    this.lock.unlock();
                    C22944d dVar = new C22944d();
                    dVar.f35406i = (long) (i2 + i3);
                    dVar.f35408k = true;
                    try {
                        int sendRequest = tTExternNetLoader.sendRequest(new TTExternRequestInfo(str, str2, jSONObject, bArr, dVar), this);
                        if (sendRequest < 0) {
                            return sendRequest;
                        }
                        return 0;
                    } catch (Throwable unused2) {
                        return -2;
                    }
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }
        return -1;
    }
}
