package com.p2082ss.android.ugc.aweme.property;

import android.database.ContentObserver;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.LifecycleContentObserver */
public final class LifecycleContentObserver extends ContentObserver implements AbstractC33974au {

    /* renamed from: a */
    public final ActivityC0945e f147451a;

    /* renamed from: b */
    private boolean f147452b;

    static {
        Covode.recordClassIndex(76813);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        m117011a();
    }

    /* renamed from: a */
    private final void m117011a() {
        if (!this.f147452b) {
            this.f147452b = true;
            this.f147451a.getLifecycle().mo4013b(this);
            this.f147451a.getContentResolver().unregisterContentObserver(this);
        }
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        Window window = this.f147451a.getWindow();
        C89219l.m154716b(window, "");
        Window window2 = this.f147451a.getWindow();
        C89219l.m154716b(window2, "");
        WindowManager.LayoutParams attributes = window2.getAttributes();
        attributes.screenBrightness = 2.0f;
        window.setAttributes(attributes);
        m117011a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleContentObserver(ActivityC0945e eVar, Handler handler) {
        super(handler);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(handler, "");
        this.f147451a = eVar;
        eVar.getLifecycle().mo4012a(this);
    }
}
