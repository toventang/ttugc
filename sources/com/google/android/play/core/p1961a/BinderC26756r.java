package com.google.android.play.core.p1961a;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.install.C27055a;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.tasks.C27071m;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

/* renamed from: com.google.android.play.core.a.r */
final class BinderC26756r extends BinderC26754p<AbstractC26736a> {

    /* renamed from: d */
    final /* synthetic */ C26757s f63381d;

    /* renamed from: e */
    private final String f63382e;

    static {
        Covode.recordClassIndex(32228);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BinderC26756r(C26757s sVar, C27071m<AbstractC26736a> mVar, String str) {
        super(sVar, new C26909b("OnRequestInstallCallback"), mVar);
        this.f63381d = sVar;
        this.f63382e = str;
    }

    @Override // com.google.android.play.core.p1961a.BinderC26754p, com.google.android.play.core.p1963b.AbstractC26933bx
    /* renamed from: a */
    public final void mo44416a(Bundle bundle) {
        Integer valueOf;
        super.mo44416a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f63379b.mo44784b(new C27055a(bundle.getInt("error.code", -2)));
            return;
        }
        C27071m mVar = this.f63379b;
        C26757s sVar = this.f63381d;
        String str = this.f63382e;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(bundle.getInt("client.version.staleness"));
        }
        int i4 = bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        long j3 = bundle.getLong("additional.size.required");
        Context context = sVar.f63387d.f63391a;
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        mVar.mo44783a(new C26761w(str, i, i2, i3, valueOf, i4, j, j2, j3, C26759u.m53136a(new File(C58016d.f132222c, "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
