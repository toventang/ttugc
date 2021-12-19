package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor */
public class KeyBoardMonitor implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC33974au {

    /* renamed from: a */
    public View f179615a;

    /* renamed from: b */
    public AbstractC80174a f179616b;

    /* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor$a */
    public interface AbstractC80174a {
        static {
            Covode.recordClassIndex(93428);
        }

        /* renamed from: a */
        void mo116176a();

        /* renamed from: b */
        void mo116177b();
    }

    static {
        Covode.recordClassIndex(93427);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        View view = this.f179615a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f179615a.getWindowVisibleDisplayFrame(rect);
        if (((float) (this.f179615a.getBottom() - rect.bottom)) > this.f179615a.getResources().getDisplayMetrics().density * 100.0f) {
            this.f179616b.mo116176a();
        } else {
            this.f179616b.mo116177b();
        }
    }

    public KeyBoardMonitor(AbstractC1204m mVar) {
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
        }
    }
}
