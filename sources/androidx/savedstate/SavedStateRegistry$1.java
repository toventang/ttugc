package androidx.savedstate;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

public class SavedStateRegistry$1 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ C1545a f5085a;

    static {
        Covode.recordClassIndex(1685);
    }

    public SavedStateRegistry$1(C1545a aVar) {
        this.f5085a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            this.f5085a.f5089d = true;
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            this.f5085a.f5089d = false;
        }
    }
}
