package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73757k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.port.in.e */
public final /* synthetic */ class C63242e implements AbstractC27246l {

    /* renamed from: a */
    private final StringBuilder f143602a;

    static {
        Covode.recordClassIndex(74515);
    }

    C63242e(StringBuilder sb) {
        this.f143602a = sb;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27246l
    /* renamed from: a */
    public final boolean mo45331a(Object obj) {
        StringBuilder sb = this.f143602a;
        Activity activity = (Activity) obj;
        if (activity instanceof AbstractC73757k) {
            sb.append(activity).append(" isRecording: ").append(((AbstractC73757k) activity).by_()).append("\n");
            return false;
        }
        sb.append(activity).append("\n");
        return false;
    }
}
