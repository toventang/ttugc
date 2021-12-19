package com.bytedance.ies.bullet.p1129c.p1135d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16215n;
import com.bytedance.ies.bullet.p1129c.p1132c.C16232t;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16718a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16727f;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16730i;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.c.d.a */
public final class C16242a implements AbstractC16244c {

    /* renamed from: a */
    public AbstractC16239d f39034a;

    /* renamed from: b */
    private final AbstractC16215n f39035b = new C16232t();

    /* renamed from: c */
    private String f39036c = "";

    static {
        Covode.recordClassIndex(18535);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        if (this.f39034a != null) {
            AbstractC16239d dVar = this.f39034a;
            if (dVar == null) {
                C89219l.m154710a("core");
            }
            dVar.mo25689b(this.f39035b);
        }
        this.f39035b.mo25721a();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1135d.AbstractC16244c
    /* renamed from: b */
    public final void mo25822b(String str) {
        C89219l.m154719c(str, "");
        this.f39036c = str;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        return this.f39035b.mo25682a(cls);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        return this.f39035b.mo25683a(str);
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d.AbstractC16240a
    /* renamed from: a */
    public final void mo25820a(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC16239d a = bVar.mo25656a();
        a.mo25685a(this.f39035b);
        this.f39034a = a;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1135d.AbstractC16244c
    /* renamed from: a */
    public final void mo25821a(Uri uri, C16248b bVar, AbstractC89187q<? super AbstractC16208i, ? super Uri, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        ArrayList arrayList;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(bVar2, "");
        bVar.mo25831b(AbstractC16727f.class, new C16730i());
        C16718a aVar = new C16718a();
        aVar.mo26572a(Uri.class, uri, null);
        Uri b = aVar.f39907b.mo26550b();
        if (b != null) {
            AbstractC16239d dVar = this.f39034a;
            if (dVar == null) {
                C89219l.m154710a("core");
            }
            AbstractC16215n nVar = this.f39035b;
            C16238z zVar = new C16238z(this.f39036c);
            List<String> b2 = aVar.f39906a.mo26550b();
            if (b2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : b2) {
                    if (!C89361p.m154870a((CharSequence) t) && t != null) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = C89086z.INSTANCE;
            }
            dVar.mo25686a(nVar, zVar, b, arrayList, bVar, qVar, bVar2);
            return;
        }
        bVar2.invoke(new IllegalStateException("bullet uri parse failed ".concat(String.valueOf(uri))));
    }
}
