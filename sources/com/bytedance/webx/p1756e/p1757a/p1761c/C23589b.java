package com.bytedance.webx.p1756e.p1757a.p1761c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.AbstractC23564d;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1755d.AbstractC23567c;
import com.bytedance.webx.p1755d.C23565a;
import com.bytedance.webx.p1756e.AbstractC23595b;
import com.bytedance.webx.p1756e.C23571a;
import com.bytedance.webx.p1756e.p1757a.AbstractC23579b;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23573a;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.bytedance.webx.p1756e.p1757a.p1760b.C23580a;
import java.util.LinkedHashSet;

/* renamed from: com.bytedance.webx.e.a.c.b */
public class C23589b implements AbstractC23567c, AbstractC23579b, AbstractC23595b {

    /* renamed from: a */
    private C23612h f55851a;

    /* renamed from: b */
    private C23571a f55852b = new C23571a();

    static {
        Covode.recordClassIndex(27687);
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    public C23565a getExtendableContext() {
        C23571a aVar = this.f55852b;
        if (aVar == null) {
            return null;
        }
        return aVar.f55827a;
    }

    /* renamed from: a */
    public C23586c mo39014a(Context context) {
        return (C23586c) mo39016c(context, null);
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    /* renamed from: a */
    public final void mo38728a(C23612h hVar) {
        this.f55851a = hVar;
        this.f55852b.f55827a = new C23565a(this.f55851a, this);
    }

    /* renamed from: a */
    private C23586c m44607a(C23586c cVar) {
        if (cVar.getExtendableContext() != null) {
            return cVar;
        }
        cVar.mo38728a(this.f55851a);
        C23577b bVar = new C23577b();
        C23573a aVar = new C23573a();
        bVar.mo38728a(this.f55851a);
        cVar.setExtendableWebViewClient(bVar);
        aVar.mo38728a(this.f55851a);
        cVar.setExtendableWebViewClient(aVar);
        LinkedHashSet<Class<? extends AbstractC23547a>> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(C23580a.class);
        linkedHashSet.addAll(this.f55851a.f55881e);
        cVar.getExtendableContext().mo38643a(linkedHashSet);
        cVar.getExtendableContext().f55818a = true;
        return cVar;
    }

    /* renamed from: a */
    public <T extends AbstractC23564d> T mo39013a(Context context, Class<T> cls) {
        return (T) mo39016c(context, cls);
    }

    /* renamed from: c */
    public <T extends AbstractC23564d> T mo39016c(Context context, Class<T> cls) {
        C23586c cVar;
        if (cls == null) {
            cVar = new C23586c(context);
        } else {
            try {
                cVar = (C23586c) cls.getConstructor(Context.class).newInstance(context);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return m44607a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.webx.p1756e.p1757a.C23586c mo39015a(android.content.Context r7, com.bytedance.webx.C23554b r8) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1761c.C23589b.mo39015a(android.content.Context, com.bytedance.webx.b):com.bytedance.webx.e.a.c");
    }
}
