package com.bytedance.android.livesdk.feed.tab.p541b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.a */
public class C8694a implements AbstractC8643m {

    /* renamed from: a */
    public AbstractC8702h f21452a;

    /* renamed from: b */
    public AbstractC8703i f21453b;

    static {
        Covode.recordClassIndex(9562);
    }

    /* renamed from: a */
    public final List<C9520ag> mo14977a() {
        if (TextUtils.equals("homepage_hot", C7411d.m15284a().mo13614e())) {
            return this.f21452a.mo14982b();
        }
        return this.f21452a.mo14979a();
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8643m
    /* renamed from: a */
    public final C9520ag mo14949a(long j) {
        return this.f21452a.mo14978a(j);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8643m
    /* renamed from: b */
    public final boolean mo14950b(long j) {
        C9520ag a = mo14949a(j);
        if (a == null || a.getDislike() <= 0) {
            return false;
        }
        return true;
    }

    public C8694a(AbstractC8702h hVar, AbstractC8703i iVar) {
        this.f21452a = hVar;
        this.f21453b = iVar;
    }
}
