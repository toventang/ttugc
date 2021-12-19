package com.p2082ss.android.ugc.aweme.favorites.p2924f;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.music.model.CollectMusicResponse;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.favorites.f.b */
final /* synthetic */ class C47428b implements AbstractC1729g {

    /* renamed from: a */
    private final C47426a.C474271 f110161a;

    static {
        Covode.recordClassIndex(56041);
    }

    C47428b(C47426a.C474271 r1) {
        this.f110161a = r1;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C47426a.C474271 r2 = this.f110161a;
        if (iVar.mo5544c() || iVar.mo5539b()) {
            C47426a.this.mo57526a_(iVar.mo5546e());
            return null;
        }
        CollectMusicResponse collectMusicResponse = (CollectMusicResponse) iVar.mo5545d();
        collectMusicResponse.action = C47426a.this.f110156a;
        Message message = new Message();
        message.obj = collectMusicResponse;
        r2.handleMsg(message);
        return null;
    }
}
