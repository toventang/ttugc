package com.bytedance.android.live.design.app;

import android.content.Context;
import androidx.appcompat.app.DialogC0240h;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public class LifecycleAwareDialog extends DialogC0240h implements AbstractC33974au {

    /* renamed from: a */
    private AbstractC1204m f11191a;

    static {
        Covode.recordClassIndex(4597);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private void onDestroy() {
        dismiss();
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void onStop() {
        super.onStop();
        AbstractC1204m mVar = this.f11191a;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
        }
    }

    public void show() {
        AbstractC1204m mVar = this.f11191a;
        if (mVar == null || mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            super.show();
        }
    }

    /* renamed from: com.bytedance.android.live.design.app.LifecycleAwareDialog$a */
    public static class C4055a<T extends C4055a<T>> {

        /* renamed from: a */
        public AbstractC1204m f11192a;

        /* renamed from: b */
        protected final Context f11193b;

        static {
            Covode.recordClassIndex(4598);
        }

        public C4055a(Context context) {
            this.f11193b = context;
        }
    }

    public LifecycleAwareDialog(Context context, C4055a<?> aVar) {
        super(context);
        if (aVar != null) {
            AbstractC1204m mVar = aVar.f11192a;
            AbstractC1204m mVar2 = this.f11191a;
            if (mVar2 != null) {
                mVar2.getLifecycle().mo4013b(this);
            }
            this.f11191a = mVar;
            if (mVar != null) {
                mVar.getLifecycle().mo4012a(this);
            }
        }
    }
}
