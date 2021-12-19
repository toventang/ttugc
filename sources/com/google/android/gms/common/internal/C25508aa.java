package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25562q;
import com.google.android.gms.p1940d.C25632i;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.aa */
public final class C25508aa implements AbstractC25478k.AbstractC25479a {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25478k f60515a;

    /* renamed from: b */
    private final /* synthetic */ C25632i f60516b;

    /* renamed from: c */
    private final /* synthetic */ C25562q.AbstractC25563a f60517c;

    /* renamed from: d */
    private final /* synthetic */ C25562q.AbstractC25564b f60518d;

    static {
        Covode.recordClassIndex(30911);
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k.AbstractC25479a
    /* renamed from: a */
    public final void mo41717a(Status status) {
        if (status.mo41477c()) {
            this.f60516b.mo41894a(this.f60517c.mo41368a(this.f60515a.mo41538a(TimeUnit.MILLISECONDS)));
            return;
        }
        this.f60516b.mo41893a((Exception) this.f60518d.mo41829a(status));
    }

    C25508aa(AbstractC25478k kVar, C25632i iVar, C25562q.AbstractC25563a aVar, C25562q.AbstractC25564b bVar) {
        this.f60515a = kVar;
        this.f60516b = iVar;
        this.f60517c = aVar;
        this.f60518d = bVar;
    }
}
