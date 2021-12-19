package com.p2082ss.android.ugc.aweme.lego.component;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.lego.component.LifecycleInflate */
public abstract class LifecycleInflate implements AbstractC33974au, AbstractC58258q {

    /* renamed from: a */
    public Context f132499a;

    /* renamed from: b */
    public List<SparseArray<View>> f132500b;

    static {
        Covode.recordClassIndex(68255);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        synchronized (this.f132500b) {
            this.f132500b.clear();
        }
        this.f132499a = null;
    }
}
