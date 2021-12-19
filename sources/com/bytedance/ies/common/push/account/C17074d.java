package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.common.push.account.d */
public final class C17074d extends AbstractThreadedSyncAdapter {
    static {
        Covode.recordClassIndex(19531);
    }

    public C17074d(Context context) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (getContext() != null) {
            C17072c cVar = C17072c.f40632a;
            Context context = getContext();
            if (cVar.f40633b != null) {
                cVar.f40633b.mo26974a(context);
            }
        }
    }
}
