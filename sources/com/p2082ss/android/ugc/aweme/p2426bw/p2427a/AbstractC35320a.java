package com.p2082ss.android.ugc.aweme.p2426bw.p2427a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.bw.a.a */
public abstract class AbstractC35320a<T> implements WeakHandler.IHandler, AbstractC35322c {
    public T mData;
    protected WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    protected List<AbstractC39159o> mNotifyListeners;
    public int mQueryType = 1;

    static {
        Covode.recordClassIndex(42488);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35322c
    public void onDestroy() {
        clearAllNotifyListener();
    }

    public void clearAllNotifyListener() {
        List<AbstractC39159o> list = this.mNotifyListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void handleData(T t) {
        this.mData = t;
    }

    public void clearNotifyListener(AbstractC39159o oVar) {
        List<AbstractC39159o> list;
        if (oVar != null && (list = this.mNotifyListeners) != null) {
            list.remove(oVar);
        }
    }

    public void addNotifyListener(AbstractC39159o oVar) {
        Objects.requireNonNull(oVar, "INotifyListener could not be null");
        if (this.mNotifyListeners == null) {
            this.mNotifyListeners = new LinkedList();
        }
        this.mNotifyListeners.add(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.bw.a.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            List<AbstractC39159o> list = this.mNotifyListeners;
            if (list != null) {
                for (AbstractC39159o oVar : list) {
                    oVar.mo57526a_((Exception) message.obj);
                }
                return;
            }
            return;
        }
        handleData(message.obj);
        List<AbstractC39159o> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (AbstractC39159o oVar2 : list2) {
                oVar2.mo57528c();
            }
        }
    }
}
