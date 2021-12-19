package com.bytedance.android.widget;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends AbstractC1174ac {

    /* renamed from: a */
    public AbstractC1204m f29487a;

    /* renamed from: b */
    private Map<String, Object> f29488b = new HashMap();

    /* renamed from: c */
    private Map<String, C12249d<C12242b>> f29489c = new HashMap();

    /* renamed from: d */
    private Thread f29490d;

    /* renamed from: e */
    private Handler f29491e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(13967);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f29488b.clear();
        this.f29489c.clear();
        this.f29487a = null;
        this.f29491e.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final DataCenter mo19692a(String str, AbstractC1214u<C12242b> uVar) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        C12249d<C12242b> dVar = this.f29489c.get(str);
        if (dVar == null) {
            dVar = new C12249d<>();
            if (this.f29488b.containsKey(str)) {
                dVar.setValue(new C12242b(str, this.f29488b.get(str)));
            }
            this.f29489c.put(str, dVar);
        }
        AbstractC1204m mVar = this.f29487a;
        if (mVar != null) {
            dVar.mo19748a(mVar, uVar);
        }
        return this;
    }

    /* renamed from: a */
    public final DataCenter mo19693a(String str, Object obj) {
        if (this.f29490d == null) {
            this.f29490d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != this.f29490d) {
            this.f29491e.post(new RunnableC12241a(this, str, obj));
            return this;
        }
        this.f29488b.put(str, obj);
        C12249d<C12242b> dVar = this.f29489c.get(str);
        if (dVar != null) {
            dVar.setValue(new C12242b(str, obj));
        }
        return this;
    }
}
