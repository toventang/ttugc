package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.facebook.imageutils.C24658b;
import com.p2082ss.android.ugc.aweme.application.C33914o;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.a */
final /* synthetic */ class C58462a implements C24658b.AbstractC24659a {

    /* renamed from: a */
    static final C24658b.AbstractC24659a f133093a = new C58462a();

    static {
        Covode.recordClassIndex(68741);
    }

    private C58462a() {
    }

    @Override // com.facebook.imageutils.C24658b.AbstractC24659a
    /* renamed from: a */
    public final void mo34256a(String str) {
        if (C33914o.f80220b.get(str) == null) {
            Librarian.m38964a(str, false, (Context) null);
        }
    }
}
