package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.FocusedSessionListWidget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.inboxwidget.TopNoticeInboxWidget;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.a */
public final class C54867a implements AbstractC56221a {
    static {
        Covode.recordClassIndex(64586);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a
    /* renamed from: a */
    public final InboxAdapterWidget mo91876a(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        return new FocusedSessionListWidget(fragment, liveData);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a
    /* renamed from: b */
    public final InboxAdapterWidget mo91877b(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        return new TopNoticeInboxWidget(fragment, liveData);
    }
}
