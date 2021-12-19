package com.p2082ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.WeakHandler;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.ValueConvertUtil;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IWriteUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.ReadTagTaskResult;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.WriteTagTaskResult;
import com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.ReadUpdateTagTask;
import com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.WriteUpdateTagTask;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository */
public class OldUpdateTagRepository implements WeakHandler.IHandler, IUpdateTagRepository {
    private final String TAG = "OldUpdateTagRepository";
    private EffectContext mEffectContext;
    private Handler mHandler;
    private HashMap<String, String> mTagsCachedMap;

    static {
        Covode.recordClassIndex(95659);
    }

    public OldUpdateTagRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
        this.mHandler = new WeakHandler(this);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i != 51) {
            if (i != 52) {
                EPLog.m141899e("OldUpdateTagRepository", "unknown error");
            } else if (message.obj instanceof ReadTagTaskResult) {
                ReadTagTaskResult readTagTaskResult = (ReadTagTaskResult) message.obj;
                EffectContext effectContext = this.mEffectContext;
                if (effectContext != null) {
                    IReadUpdateTagListener readUpdateTagListener = effectContext.getEffectConfiguration().getListenerManger().getReadUpdateTagListener(readTagTaskResult.getTaskID());
                    if (this.mTagsCachedMap == null) {
                        this.mTagsCachedMap = new HashMap<>();
                    }
                    if (readTagTaskResult.getException() == null) {
                        this.mTagsCachedMap.putAll(readTagTaskResult.getTagsCachedMap());
                        if (readUpdateTagListener != null) {
                            readUpdateTagListener.onSuccess(this.mTagsCachedMap);
                        }
                    } else if (readUpdateTagListener != null) {
                        readUpdateTagListener.onFailed(readTagTaskResult.getException());
                    }
                    this.mEffectContext.getEffectConfiguration().getListenerManger().removeReadUpdateTagListener(readTagTaskResult.getTaskID());
                }
            }
        } else if (message.obj instanceof WriteTagTaskResult) {
            BaseTaskResult baseTaskResult = (BaseTaskResult) message.obj;
            EffectContext effectContext2 = this.mEffectContext;
            if (effectContext2 != null) {
                IWriteUpdateTagListener writeUpdateTagListener = effectContext2.getEffectConfiguration().getListenerManger().getWriteUpdateTagListener(baseTaskResult.getTaskID());
                if (writeUpdateTagListener != null) {
                    writeUpdateTagListener.onFinally();
                }
                this.mEffectContext.getEffectConfiguration().getListenerManger().removeWriteUpdateTagListener(baseTaskResult.getTaskID());
            }
        }
    }

    public void checkedTagInHashMap(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener != null) {
            HashMap<String, String> hashMap = this.mTagsCachedMap;
            if (hashMap == null) {
                iIsTagNeedUpdatedListener.onTagNeedUpdate();
            } else if (!hashMap.containsKey(str) || ValueConvertUtil.ConvertStringToLong(str2, -1) > ValueConvertUtil.ConvertStringToLong(this.mTagsCachedMap.get(str), -1)) {
                iIsTagNeedUpdatedListener.onTagNeedUpdate();
            } else {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository
    public String isTagUpdated(final String str, final String str2, final IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        if (this.mTagsCachedMap == null) {
            EffectContext effectContext = this.mEffectContext;
            if (effectContext == null) {
                if (iIsTagNeedUpdatedListener != null) {
                    iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
                }
                return generateTaskId;
            }
            effectContext.getEffectConfiguration().getListenerManger().setReadUpdateTagListener(generateTaskId, new IReadUpdateTagListener() {
                /* class com.p2082ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.C819563 */

                static {
                    Covode.recordClassIndex(95662);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener
                public void onFailed(ExceptionResult exceptionResult) {
                    IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener = iIsTagNeedUpdatedListener;
                    if (iIsTagNeedUpdatedListener != null) {
                        iIsTagNeedUpdatedListener.onTagNeedUpdate();
                    }
                }

                public void onSuccess(HashMap<String, String> hashMap) {
                    OldUpdateTagRepository.this.checkedTagInHashMap(str, str2, iIsTagNeedUpdatedListener);
                }
            });
            this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new ReadUpdateTagTask(this.mHandler, this.mEffectContext, generateTaskId, str, str2));
        } else {
            checkedTagInHashMap(str, str2, iIsTagNeedUpdatedListener);
        }
        return generateTaskId;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository
    public String updateTag(final String str, final String str2, final IUpdateTagListener iUpdateTagListener) {
        final String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        if (this.mTagsCachedMap == null) {
            EffectContext effectContext = this.mEffectContext;
            if (effectContext == null) {
                if (iUpdateTagListener != null) {
                    iUpdateTagListener.onFinally();
                }
                return generateTaskId;
            }
            effectContext.getEffectConfiguration().getListenerManger().setReadUpdateTagListener(generateTaskId, new IReadUpdateTagListener() {
                /* class com.p2082ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.C819552 */

                static {
                    Covode.recordClassIndex(95661);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener
                public void onFailed(ExceptionResult exceptionResult) {
                }

                public void onSuccess(HashMap<String, String> hashMap) {
                    OldUpdateTagRepository.this.requestWriteTask(generateTaskId, str, str2, iUpdateTagListener);
                }
            });
            this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new ReadUpdateTagTask(this.mHandler, this.mEffectContext, generateTaskId, str, str2));
        } else {
            requestWriteTask(generateTaskId, str, str2, iUpdateTagListener);
        }
        return generateTaskId;
    }

    public void requestWriteTask(String str, String str2, String str3, final IUpdateTagListener iUpdateTagListener) {
        if (this.mEffectContext != null) {
            HashMap<String, String> hashMap = this.mTagsCachedMap;
            if (hashMap == null) {
                iUpdateTagListener.onFinally();
                return;
            }
            hashMap.put(str2, str3);
            this.mEffectContext.getEffectConfiguration().getListenerManger().setWriteUpdateTagListener(str, new IWriteUpdateTagListener() {
                /* class com.p2082ss.android.ugc.effectmanager.effect.repository.oldrepo.OldUpdateTagRepository.C819541 */

                static {
                    Covode.recordClassIndex(95660);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IWriteUpdateTagListener
                public void onFinally() {
                    IUpdateTagListener iUpdateTagListener = iUpdateTagListener;
                    if (iUpdateTagListener != null) {
                        iUpdateTagListener.onFinally();
                    }
                }
            });
            this.mEffectContext.getEffectConfiguration().getTaskManager().commit(new WriteUpdateTagTask(this.mHandler, this.mEffectContext, str, this.mTagsCachedMap));
        } else if (iUpdateTagListener != null) {
            iUpdateTagListener.onFinally();
        }
    }
}
