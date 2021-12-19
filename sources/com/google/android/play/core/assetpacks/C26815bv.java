package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.bv */
public final class C26815bv implements AbstractC26920bk<C26814bu> {

    /* renamed from: a */
    private final AbstractC26920bk<String> f63598a;

    /* renamed from: b */
    private final AbstractC26920bk<C26878w> f63599b;

    /* renamed from: c */
    private final AbstractC26920bk<C26791ay> f63600c;

    /* renamed from: d */
    private final AbstractC26920bk<Context> f63601d;

    /* renamed from: e */
    private final AbstractC26920bk<C26827cg> f63602e;

    /* renamed from: f */
    private final AbstractC26920bk<Executor> f63603f;

    static {
        Covode.recordClassIndex(32290);
    }

    public C26815bv(AbstractC26920bk<String> bkVar, AbstractC26920bk<C26878w> bkVar2, AbstractC26920bk<C26791ay> bkVar3, AbstractC26920bk<Context> bkVar4, AbstractC26920bk<C26827cg> bkVar5, AbstractC26920bk<Executor> bkVar6) {
        this.f63598a = bkVar;
        this.f63599b = bkVar2;
        this.f63600c = bkVar3;
        this.f63601d = bkVar4;
        this.f63602e = bkVar5;
        this.f63603f = bkVar6;
    }

    /* renamed from: a */
    private static File m53262a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* synthetic */ C26814bu mo44411a() {
        String a = this.f63598a.mo44411a();
        C26878w a2 = this.f63599b.mo44411a();
        C26791ay a3 = this.f63600c.mo44411a();
        Context a4 = C26853df.m53319a(((C26853df) this.f63601d).f63710a);
        C26827cg a5 = this.f63602e.mo44411a();
        return new C26814bu(a != null ? new File(m53262a(a4), a) : m53262a(a4), a2, a3, a4, a5, C26918bi.m53471b(this.f63603f));
    }
}
