package com.p2082ss.android.ugc.aweme.tools.live;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel */
public final class RecordLiveViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public IRecordingOperationPanel f176661a;

    /* renamed from: b */
    public AbstractC14177d f176662b;

    /* renamed from: c */
    public AbstractC31133a f176663c;

    /* renamed from: d */
    public ShortVideoContext f176664d;

    static {
        Covode.recordClassIndex(91753);
    }

    /* renamed from: a */
    public final AbstractC14177d mo122517a() {
        AbstractC14177d dVar = this.f176662b;
        if (dVar == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        return dVar;
    }
}
