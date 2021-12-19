package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.DownloadProviderEffectTaskResult;
import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadProviderEffectTask */
public class DownloadProviderEffectTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private String mDownLoadUrl;
    private ProviderEffect mEffect;
    private EffectContext mEffectContext;
    private String mRemoteIp;
    private String mRequestedUrl;
    private int mRetryCount;

    static {
        Covode.recordClassIndex(95694);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask, com.p2082ss.android.ugc.effectmanager.common.task.NormalTask
    public void cancel() {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        int i = this.mRetryCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (isCanceled()) {
                sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, new ExceptionResult(10001)));
                return;
            }
            try {
                if (TextUtils.isEmpty(this.mEffect.getPath())) {
                    this.mEffect.setPath(this.mConfiguration.getEffectDir() + File.separator + this.mEffect.getId() + ".gif");
                }
                this.mRequestedUrl = this.mDownLoadUrl;
                try {
                    this.mRemoteIp = InetAddress.getByName(new URL(this.mRequestedUrl).getHost()).getHostAddress();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (MalformedURLException e2) {
                    e2.printStackTrace();
                }
                ProviderEffect download = download(this.mDownLoadUrl, this.mEffect.getPath());
                if (download != null) {
                    sendMessage(19, new DownloadProviderEffectTaskResult(download, null));
                    return;
                }
            } catch (Exception e3) {
                if (i2 == i - 1) {
                    e3.printStackTrace();
                    ExceptionResult exceptionResult = new ExceptionResult(e3);
                    exceptionResult.setTrackParams(this.mRequestedUrl, "", this.mRemoteIp);
                    sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, exceptionResult));
                    return;
                }
            }
        }
    }

    private ProviderEffect download(String str, String str2) {
        EffectRequest effectRequest = new EffectRequest("GET", str, false);
        InputStream execute = this.mEffectContext.getEffectConfiguration().getEffectNetWorker().execute(effectRequest);
        final DownloadProviderEffectTaskResult downloadProviderEffectTaskResult = new DownloadProviderEffectTaskResult(this.mEffect, null, 0, 0);
        EffectUtils.convertStreamToFile(execute, str2, effectRequest.getContentLength(), new DownloadListenerAdapter() {
            /* class com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadProviderEffectTask.C819601 */

            static {
                Covode.recordClassIndex(95695);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener, com.p2082ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter
            public void onProgress(int i, long j) {
                downloadProviderEffectTaskResult.setProgress(i).setTotalSize(j);
                DownloadProviderEffectTask.this.sendMessage(54, downloadProviderEffectTaskResult);
            }
        });
        return this.mEffect;
    }

    public DownloadProviderEffectTask(EffectContext effectContext, String str, ProviderEffect providerEffect, Handler handler) {
        super(handler, str);
        this.mEffect = providerEffect;
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mRetryCount = effectContext.getEffectConfiguration().getRetryCount();
        this.mDownLoadUrl = EffectUtils.getUrl(providerEffect);
    }
}
