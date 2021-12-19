package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55278b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55279c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55282d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55283e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider */
public final class IMServiceProvider {
    public static final IMServiceProvider INSTANCE = new IMServiceProvider();
    private static final AbstractC89244h familiarService$delegate = C89250i.m154773a((AbstractC89171a) IMServiceProvider$familiarService$2.INSTANCE);
    private static final AbstractC89244h inboxAdapterService$delegate = C89250i.m154773a((AbstractC89171a) IMServiceProvider$inboxAdapterService$2.INSTANCE);
    private static final AbstractC89244h relationService$delegate = C89250i.m154773a((AbstractC89171a) IMServiceProvider$relationService$2.INSTANCE);
    private static final AbstractC89244h shareService$delegate = C89250i.m154773a((AbstractC89171a) IMServiceProvider$shareService$2.INSTANCE);
    private static final AbstractC89244h systemSmallEmojiService$delegate = C89250i.m154773a((AbstractC89171a) IMServiceProvider$systemSmallEmojiService$2.INSTANCE);

    public final C55278b getFamiliarService() {
        return (C55278b) familiarService$delegate.getValue();
    }

    public final C54867a getInboxAdapterService() {
        return (C54867a) inboxAdapterService$delegate.getValue();
    }

    public final C55279c getRelationService() {
        return (C55279c) relationService$delegate.getValue();
    }

    public final C55282d getShareService() {
        return (C55282d) shareService$delegate.getValue();
    }

    public final C55283e getSystemSmallEmojiService() {
        return (C55283e) systemSmallEmojiService$delegate.getValue();
    }

    private IMServiceProvider() {
    }

    static {
        Covode.recordClassIndex(64899);
    }
}
