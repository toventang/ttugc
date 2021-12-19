package com.p2082ss.android.ugc.effectmanager.effect.task.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.SyncTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher */
public class DefaultEffectFetcher implements EffectFetcher {
    public final String mAccessKey;
    public final String mAppId;
    public final IMonitorService mMonitorService;
    public final EffectNetWorkerWrapper mNetWorker;

    static {
        Covode.recordClassIndex(95681);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
    public SyncTask<EffectTaskResult> fetchEffect(final EffectFetcherArguments effectFetcherArguments) {
        final MonitorTrace monitorTrace = new MonitorTrace(effectFetcherArguments.getEffect().getEffectId());
        return new SyncTask<EffectTaskResult>() {
            /* class com.p2082ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher.C819571 */
            long mDownloadTime;
            long mDuration;
            Effect mEffect;
            long mFileSize;
            String mRemoteIp;
            String mRequestedUrl;
            long mUnzipTime;

            static {
                Covode.recordClassIndex(95682);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:69:0x0327, code lost:
                com.p2082ss.android.ugc.effectmanager.common.monitor.EPMonitor.traceEnd(r1);
                onResponse((com.p2082ss.android.ugc.effectmanager.common.task.SyncTask<com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult>) r24, new com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult(r7, null));
             */
            /* JADX WARNING: Removed duplicated region for block: B:100:0x0386 A[EDGE_INSN: B:100:0x0386->B:80:0x0386 ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x033e  */
            /* JADX WARNING: Removed duplicated region for block: B:96:0x0439 A[LOOP:0: B:12:0x00a0->B:96:0x0439, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:99:0x03ba A[SYNTHETIC] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTask
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void execute() {
                /*
                // Method dump skipped, instructions count: 1119
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher.C819571.execute():void");
            }

            /* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher$1$EffectDownloadFileProgressImpl */
            class EffectDownloadFileProgressImpl extends DownloadListenerAdapter {
                private SyncTask<EffectTaskResult> syncTask;

                static {
                    Covode.recordClassIndex(95683);
                }

                public EffectDownloadFileProgressImpl(SyncTask syncTask2) {
                    this.syncTask = syncTask2;
                }

                @Override // com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener, com.p2082ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter
                public void onProgress(int i, long j) {
                    SyncTask<EffectTaskResult> syncTask2 = this.syncTask;
                    if (syncTask2 != null) {
                        syncTask2.onProgress(syncTask2, i, j);
                    }
                }
            }

            private void uploadDirDiff(String str, String str2) {
                String effectId;
                if (!str.equals(str2) && DefaultEffectFetcher.this.mMonitorService != null) {
                    IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                    EventJsonBuilder addValuePair = EventJsonBuilder.newBuilder().addValuePair("app_id", DefaultEffectFetcher.this.mAppId).addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    iMonitorService.monitorStatusRate("effect_download_error", 1, addValuePair.addValuePair("effect_id", effectId).addValuePair("EffectDir", str).addValuePair("zippath", str2).build());
                }
            }

            public void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult) {
                String effectId;
                super.onResponse((SyncTask) syncTask, (Object) effectTaskResult);
                if (DefaultEffectFetcher.this.mMonitorService != null) {
                    IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                    EventJsonBuilder addValuePair = EventJsonBuilder.newBuilder().addValuePair("app_id", DefaultEffectFetcher.this.mAppId).addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey).addValuePair("duration", Long.valueOf(this.mDuration)).addValuePair("download_time", Long.valueOf(this.mDownloadTime)).addValuePair("unzip_time", Long.valueOf(this.mUnzipTime));
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    iMonitorService.monitorStatusRate("effect_download_success_rate", 0, addValuePair.addValuePair("effect_id", effectId).addValuePair("size", Long.valueOf(this.mFileSize)).addValuePair("effect_platform_type", (Integer) 0).build());
                }
            }

            @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTask
            public void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
                String effectId;
                super.onFailed(syncTask, exceptionResult);
                if (this.mEffect != null) {
                    EPLog.m141900e("DefaultEffectFetcher", "effect " + this.mEffect.getId() + " download failed! ", exceptionResult.getException());
                } else {
                    EPLog.m141900e("DefaultEffectFetcher", "null effect download failed! ", exceptionResult.getException());
                }
                if (DefaultEffectFetcher.this.mMonitorService != null) {
                    IMonitorService iMonitorService = DefaultEffectFetcher.this.mMonitorService;
                    EventJsonBuilder addValuePair = EventJsonBuilder.newBuilder().addValuePair("app_id", DefaultEffectFetcher.this.mAppId).addValuePair("access_key", DefaultEffectFetcher.this.mAccessKey);
                    Effect effect = this.mEffect;
                    if (effect == null) {
                        effectId = "";
                    } else {
                        effectId = effect.getEffectId();
                    }
                    iMonitorService.monitorStatusRate("effect_download_success_rate", 1, addValuePair.addValuePair("effect_id", effectId).addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode())).addValuePair("error_msg", exceptionResult.getMsg()).addValuePair("monitor_trace", monitorTrace.getStepList()).addValuePair("download_url", this.mRequestedUrl).addValuePair("host_ip", this.mRemoteIp).addValuePair("effect_platform_type", (Integer) 0).build());
                }
            }

            @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTask
            public void onProgress(SyncTask<EffectTaskResult> syncTask, int i, long j) {
                super.onProgress(syncTask, i, j);
            }
        };
    }

    public DefaultEffectFetcher(EffectNetWorkerWrapper effectNetWorkerWrapper, IMonitorService iMonitorService, String str, String str2) {
        this.mNetWorker = effectNetWorkerWrapper;
        this.mMonitorService = iMonitorService;
        this.mAppId = str;
        this.mAccessKey = str2;
    }
}
