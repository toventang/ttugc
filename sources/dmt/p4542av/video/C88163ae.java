package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: dmt.av.video.ae */
public final /* synthetic */ class C88163ae implements AbstractC1214u {

    /* renamed from: a */
    private final C88303z f200118a;

    static {
        Covode.recordClassIndex(104198);
    }

    C88163ae(C88303z zVar) {
        this.f200118a = zVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88303z zVar = this.f200118a;
        Boolean bool = (Boolean) obj;
        if (zVar.f200422v != null) {
            zVar.f200422v.f200070e = bool != null ? bool.booleanValue() : false;
        }
    }
}
