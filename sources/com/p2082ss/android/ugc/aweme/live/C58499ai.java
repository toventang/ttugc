package com.p2082ss.android.ugc.aweme.live;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a;
import com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.TTLiveBroadcastView;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

/* renamed from: com.ss.android.ugc.aweme.live.ai */
public final class C58499ai implements AbstractC63279g {

    /* renamed from: a */
    public AbstractC58753a f133173a;

    /* renamed from: b */
    public volatile boolean f133174b;

    static {
        Covode.recordClassIndex(68790);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final View mo95870a() {
        return this.f133173a.mo96136a();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final void mo95874a(AbstractC63279g.AbstractC63280a aVar) {
        AbstractC58753a aVar2 = this.f133173a;
        if (aVar2 != null) {
            aVar2.mo96141a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final void mo95872a(final ViewGroup viewGroup) {
        if (this.f133173a != null && this.f133174b) {
            this.f133173a.mo96143b();
            this.f133174b = false;
            viewGroup.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.live.C58499ai.RunnableC585001 */

                static {
                    Covode.recordClassIndex(68791);
                }

                public final void run() {
                    MethodCollector.m26663i(973);
                    if (viewGroup != null && !C58499ai.this.f133174b) {
                        viewGroup.removeView(C58499ai.this.f133173a.mo96136a());
                    }
                    MethodCollector.m26664o(973);
                }
            }, 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final void mo95875a(View... viewArr) {
        AbstractC58753a aVar = this.f133173a;
        if (aVar != null) {
            aVar.mo96142a(viewArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final void mo95871a(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        if (this.f133173a == null && Live.getService() != null) {
            this.f133173a = new TTLiveBroadcastView(context, iRecordingOperationPanel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g
    /* renamed from: a */
    public final void mo95873a(ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(1251);
        if (this.f133173a != null) {
            viewGroup.removeAllViews();
            this.f133174b = true;
            viewGroup.addView(this.f133173a.mo96136a());
            this.f133173a.mo96140a(bundle);
        }
        MethodCollector.m26664o(1251);
    }
}
