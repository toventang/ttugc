package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import dmt.p4542av.video.p4545b.AbstractC88181j;

/* access modifiers changed from: package-private */
/* renamed from: dmt.av.video.ab */
public final /* synthetic */ class C88160ab implements AbstractC1214u {

    /* renamed from: a */
    private final C88303z f200115a;

    static {
        Covode.recordClassIndex(104195);
    }

    C88160ab(C88303z zVar) {
        this.f200115a = zVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88303z zVar = this.f200115a;
        AudioRecorderParam audioRecorderParam = (AudioRecorderParam) obj;
        if (audioRecorderParam != null) {
            AbstractC88181j jVar = zVar.f200397H;
            C70837c.C70838a.m125105a();
            jVar.mo142720a(audioRecorderParam, C70837c.C70838a.m125107c());
        }
    }
}
