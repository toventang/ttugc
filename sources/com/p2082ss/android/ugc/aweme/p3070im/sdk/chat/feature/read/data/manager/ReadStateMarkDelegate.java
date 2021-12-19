package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager;

import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.C54278a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateMarkDelegate */
public final class ReadStateMarkDelegate extends AbsReadStateDelegate {

    /* renamed from: a */
    public static final C54269a f124312a = new C54269a((byte) 0);

    /* renamed from: b */
    private boolean f124313b;

    /* renamed from: d */
    private boolean f124314d = true;

    static {
        Covode.recordClassIndex(63959);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateMarkDelegate$a */
    public static final class C54269a {
        static {
            Covode.recordClassIndex(63960);
        }

        private C54269a() {
        }

        public /* synthetic */ C54269a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo91350b() {
        sendEmptyMessageDelayed(0, 1000);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    public final void onResume() {
        this.f124314d = true;
        m99526c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    public final void onStop() {
        m99526c();
        this.f124314d = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    /* renamed from: a */
    public final void mo91349a() {
        this.f124313b = true;
        sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    /* renamed from: c */
    private final void m99526c() {
        if (this.f124314d) {
            if (this.f124326c.f124337b.getChatType() == 1) {
                AbstractC17427b.C17428a.m32308a(this.f124326c.f124337b.getConversationId()).mo27751e();
                return;
            }
            C19638h d = this.f124326c.mo91370d();
            if (d == null) {
                return;
            }
            if (d.isTemp() || d.getConversationShortId() <= 0 || d.getConversationId() == null) {
                Boolean.valueOf(d.isTemp());
                Long.valueOf(d.getConversationShortId());
                return;
            }
            String conversationId = d.getConversationId();
            C89219l.m154716b(conversationId, "");
            AbstractC17427b.C17428a.m32308a(conversationId).mo27751e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadStateMarkDelegate(C54278a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    public final void handleMessage(Message message) {
        C89219l.m154721d(message, "");
        if (message.what == 0) {
            removeMessages(0);
            if (this.f124313b) {
                m99526c();
            }
            this.f124313b = false;
        }
    }
}
