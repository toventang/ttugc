package com.p2082ss.android.ugc.aweme.port.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

/* renamed from: com.ss.android.ugc.aweme.port.internal.g */
public interface AbstractC63279g {

    /* renamed from: com.ss.android.ugc.aweme.port.internal.g$a */
    public interface AbstractC63280a {
        static {
            Covode.recordClassIndex(74557);
        }

        /* renamed from: a */
        void mo101865a();

        /* renamed from: b */
        void mo101866b();
    }

    static {
        Covode.recordClassIndex(74556);
    }

    /* renamed from: a */
    View mo95870a();

    /* renamed from: a */
    void mo95871a(Context context, IRecordingOperationPanel iRecordingOperationPanel);

    /* renamed from: a */
    void mo95872a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo95873a(ViewGroup viewGroup, Bundle bundle);

    /* renamed from: a */
    void mo95874a(AbstractC63280a aVar);

    /* renamed from: a */
    void mo95875a(View... viewArr);
}
