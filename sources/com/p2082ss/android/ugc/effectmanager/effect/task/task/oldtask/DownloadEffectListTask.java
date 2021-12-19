package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.WeakHandler;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectExtKt;
import com.p2082ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask */
public class DownloadEffectListTask extends NormalTask implements WeakHandler.IHandler {
    public List<Effect> downloadedEffectList = Collections.synchronizedList(new ArrayList());
    public List<String> downloadingEffectList = Collections.synchronizedList(new ArrayList());
    private List<Effect> effectList;
    public List<Pair<Effect, ExceptionResult>> failedEffectList = Collections.synchronizedList(new ArrayList());
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private DownloadEffectExtra mExtra;
    private Handler mTaskHandler;
    private List<Effect> waitingDownloadEffectList = new ArrayList();

    static {
        Covode.recordClassIndex(95688);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        if (CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
            onSuccess(this.effectList);
            return;
        }
        try {
            this.mTaskHandler = new WeakHandler(this);
            checkDownloadTask();
        } catch (Throwable unused) {
        }
    }

    private void onFail() {
        ArrayList arrayList = new ArrayList();
        ExceptionResult exceptionResult = null;
        for (Pair<Effect, ExceptionResult> pair : this.failedEffectList) {
            arrayList.add(pair.first);
            if (pair.second != null) {
                exceptionResult = (ExceptionResult) pair.second;
            }
        }
        sendMessage(17, new EffectListTaskResult(arrayList, exceptionResult));
    }

    public void checkDownloadTask() {
        MethodCollector.m26663i(414);
        if (!CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
            if (this.downloadingEffectList.size() < 5) {
                int size = 5 - this.downloadingEffectList.size();
                int i = 0;
                while (i <= size && !CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
                    synchronized (DownloadEffectListTask.class) {
                        try {
                            if (!CollectionUtil.isListEmpty(this.waitingDownloadEffectList)) {
                                downloadEffect(this.waitingDownloadEffectList.remove(0));
                                i++;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(414);
                            throw th;
                        }
                    }
                }
                MethodCollector.m26664o(414);
                return;
            }
        } else if (this.downloadedEffectList.size() + this.failedEffectList.size() == this.effectList.size()) {
            if (this.downloadedEffectList.size() == this.effectList.size()) {
                onSuccess(this.effectList);
                MethodCollector.m26664o(414);
                return;
            }
            onFail();
        }
        MethodCollector.m26664o(414);
    }

    private void onSuccess(List<Effect> list) {
        sendMessage(17, new EffectListTaskResult(list, null));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 15) {
            EffectTaskResult effectTaskResult = (EffectTaskResult) message.obj;
            Effect effect = effectTaskResult.getEffect();
            ExceptionResult exception = effectTaskResult.getException();
            this.downloadingEffectList.remove(effect.getId());
            if (exception != null) {
                this.failedEffectList.add(new Pair<>(effect, exception));
            } else {
                this.downloadedEffectList.add(effect);
            }
            checkDownloadTask();
        }
    }

    private synchronized void downloadEffect(Effect effect) {
        MethodCollector.m26663i(2293);
        this.downloadingEffectList.add(effect.getId());
        EffectDownloadManager effectDownloadManager = this.mEffectContext.getEffectConfiguration().getEffectDownloadManager();
        if (effectDownloadManager != null) {
            if (effectDownloadManager.isDownloading(EffectExtKt.expectedMd5(effect))) {
                effectDownloadManager.addDownloadListener(effect, new IFetchEffectListener() {
                    /* class com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask.C819581 */

                    static {
                        Covode.recordClassIndex(95689);
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public void onStart(Effect effect) {
                    }

                    public void onSuccess(Effect effect) {
                        if (effect != null) {
                            DownloadEffectListTask.this.downloadingEffectList.remove(effect.getId());
                            DownloadEffectListTask.this.downloadedEffectList.add(effect);
                        }
                        DownloadEffectListTask.this.checkDownloadTask();
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public void onFail(Effect effect, ExceptionResult exceptionResult) {
                        if (effect != null) {
                            DownloadEffectListTask.this.downloadingEffectList.remove(effect.getId());
                            DownloadEffectListTask.this.failedEffectList.add(new Pair<>(effect, exceptionResult));
                        }
                        DownloadEffectListTask.this.checkDownloadTask();
                    }
                });
                MethodCollector.m26664o(2293);
                return;
            }
            effectDownloadManager.addDownloadEffect(effect);
        }
        this.mConfiguration.getTaskManager().commit(new DownloadEffectTask(effect, this.mEffectContext, TaskUtil.INSTANCE.generateTaskId(), this.mTaskHandler, this.mExtra));
        MethodCollector.m26664o(2293);
    }

    public DownloadEffectListTask(EffectContext effectContext, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        ArrayList arrayList = new ArrayList(list);
        this.effectList = arrayList;
        this.mExtra = downloadEffectExtra;
        this.waitingDownloadEffectList.addAll(arrayList);
    }
}
