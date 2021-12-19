package com.bytedance.ies.bullet.p1129c.p1132c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.s */
public final class C16230s {

    /* renamed from: a */
    final List<AbstractC16210j> f39018a;

    /* renamed from: b */
    private final AbstractC16222r f39019b;

    static {
        Covode.recordClassIndex(18523);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.c.s$a */
    public static final class C16231a extends AbstractC89220m implements AbstractC89172b<Uri, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16230s f39020a;

        /* renamed from: b */
        final /* synthetic */ Iterator f39021b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39022c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39023d;

        static {
            Covode.recordClassIndex(18524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16231a(C16230s sVar, Iterator it, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f39020a = sVar;
            this.f39021b = it;
            this.f39022c = bVar;
            this.f39023d = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Uri uri) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            if (this.f39021b.hasNext()) {
                this.f39020a.mo25810a(this.f39021b, uri2, this.f39022c, this.f39023d);
            } else {
                this.f39022c.invoke(uri2);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.c.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16230s(AbstractC16222r rVar, List<? extends AbstractC16210j> list) {
        C89219l.m154719c(rVar, "");
        C89219l.m154719c(list, "");
        this.f39019b = rVar;
        this.f39018a = list;
    }

    /* renamed from: a */
    public final void mo25810a(Iterator<? extends AbstractC16210j> it, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        try {
            ((AbstractC16210j) it.next()).mo25783a(this.f39019b, uri, new C16231a(this, it, bVar, bVar2), bVar2);
        } catch (Exception e) {
            bVar2.invoke(e);
        }
    }
}
