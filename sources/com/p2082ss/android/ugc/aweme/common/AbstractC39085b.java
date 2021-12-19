package com.p2082ss.android.ugc.aweme.common;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.common.b */
public abstract class AbstractC39085b<T> implements WeakHandler.IHandler {
    public T mData;
    public WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    public List<AbstractC39159o> mNotifyListeners;

    static {
        Covode.recordClassIndex(46701);
    }

    /* renamed from: com_ss_android_ugc_aweme_common_BaseModel_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m79348xd6d8d7b0(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean checkParams(Object... objArr);

    public void handleData(T t) {
        this.mData = t;
    }

    /* access modifiers changed from: protected */
    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public void clearNotifyListener(AbstractC39159o oVar) {
        List<AbstractC39159o> list;
        if (oVar != null && (list = this.mNotifyListeners) != null) {
            list.remove(oVar);
        }
    }

    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
    }

    public void addNotifyListener(AbstractC39159o oVar) {
        Objects.requireNonNull(oVar, "INotifyListener could not be null");
        if (this.mNotifyListeners == null) {
            this.mNotifyListeners = new LinkedList();
        }
        this.mNotifyListeners.add(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.common.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        resetLoadingStatus(message);
        if (message.obj instanceof Exception) {
            m79348xd6d8d7b0("Snow", "exception: ");
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
