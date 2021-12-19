package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

class ComponentActivity$2 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ ActivityC0192b f490a;

    static {
        Covode.recordClassIndex(214);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        Window window;
        View peekDecorView;
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP && (window = this.f490a.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}
