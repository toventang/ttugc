package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListWithLifeCycleTask */
public class DownloadEffectListWithLifeCycleTask extends DownloadEffectListTask {
    private DownloadLifeCycleListener mDownloadLifeCycleListener;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListWithLifeCycleTask$DownloadLifeCycleListener */
    public interface DownloadLifeCycleListener {
        static {
            Covode.recordClassIndex(95691);
        }

        void onFinally();

        void onStart();
    }

    static {
        Covode.recordClassIndex(95690);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask, com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask
    public void execute() {
        DownloadLifeCycleListener downloadLifeCycleListener = this.mDownloadLifeCycleListener;
        if (downloadLifeCycleListener != null) {
            downloadLifeCycleListener.onStart();
        }
        super.execute();
        DownloadLifeCycleListener downloadLifeCycleListener2 = this.mDownloadLifeCycleListener;
        if (downloadLifeCycleListener2 != null) {
            downloadLifeCycleListener2.onFinally();
        }
    }

    public DownloadEffectListWithLifeCycleTask(EffectContext effectContext, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra, DownloadLifeCycleListener downloadLifeCycleListener) {
        super(effectContext, list, str, handler, downloadEffectExtra);
        this.mDownloadLifeCycleListener = downloadLifeCycleListener;
    }
}
