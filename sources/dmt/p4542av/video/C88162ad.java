package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: dmt.av.video.ad */
public final /* synthetic */ class C88162ad implements AbstractC1214u {

    /* renamed from: a */
    private final C88303z f200117a;

    static {
        Covode.recordClassIndex(104197);
    }

    C88162ad(C88303z zVar) {
        this.f200117a = zVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88303z zVar = this.f200117a;
        Boolean bool = (Boolean) obj;
        if (zVar.f200422v != null) {
            zVar.f200422v.f200069d = bool != null ? bool.booleanValue() : false;
        }
    }
}
