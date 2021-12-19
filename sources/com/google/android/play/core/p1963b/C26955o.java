package com.google.android.play.core.p1963b;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1965d.C26975a;
import com.google.android.play.core.p1965d.C26978d;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.p1966e.AbstractC26996ab;
import com.google.android.play.core.p1966e.AbstractC27054z;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.b.o */
public final class C26955o implements AbstractC26996ab {

    /* renamed from: a */
    final Context f63841a;

    /* renamed from: b */
    final C26956p f63842b;

    /* renamed from: c */
    private final C26978d f63843c;

    /* renamed from: d */
    private final Executor f63844d;

    /* renamed from: e */
    private final C26991q f63845e;

    static {
        Covode.recordClassIndex(32430);
    }

    public C26955o(Context context, Executor executor, C26956p pVar, C26978d dVar, C26991q qVar) {
        this.f63841a = context;
        this.f63843c = dVar;
        this.f63842b = pVar;
        this.f63844d = executor;
        this.f63845e = qVar;
    }

    /* renamed from: a */
    private static String m53553a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.play.core.p1966e.AbstractC26996ab
    /* renamed from: a */
    public final void mo44656a(List<Intent> list, AbstractC27054z zVar) {
        if (C26975a.f63860a.get() != null) {
            this.f63844d.execute(new RunnableC26954n(this, list, zVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r14.f63842b.mo44657a() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo44655a(java.util.List<android.content.Intent> r15) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1963b.C26955o.mo44655a(java.util.List):java.lang.Integer");
    }
}
