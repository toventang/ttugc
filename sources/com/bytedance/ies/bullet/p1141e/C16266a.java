package com.bytedance.ies.bullet.p1141e;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.C16615b;
import com.bytedance.ies.bullet.service.base.EnumC16626c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.a */
public final class C16266a implements AbstractC89187q<Uri, Uri, AbstractC89183m<? super Boolean, ? super C16615b, ? extends C89391z>, C89391z> {

    /* renamed from: a */
    public final Context f39072a;

    /* renamed from: b */
    private final AbstractC16239d.AbstractC16241b f39073b;

    static {
        Covode.recordClassIndex(18559);
    }

    public C16266a(Context context, AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(bVar, "");
        this.f39072a = context;
        this.f39073b = bVar;
    }

    /* renamed from: com.bytedance.ies.bullet.e.a$a */
    public static final class C16267a implements AbstractC17046h.AbstractC17048b {

        /* renamed from: a */
        final /* synthetic */ C16615b f39074a;

        /* renamed from: b */
        final /* synthetic */ C16266a f39075b;

        /* renamed from: c */
        final /* synthetic */ Uri f39076c;

        /* renamed from: d */
        final /* synthetic */ Uri f39077d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89183m f39078e;

        /* renamed from: f */
        private final AtomicBoolean f39079f = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(18560);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25851a(Uri uri) {
            C89219l.m154719c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
            C89219l.m154719c(list, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25852a(Uri uri, Throwable th) {
            C89219l.m154719c(uri, "");
            C89219l.m154719c(th, "");
            if (this.f39079f.compareAndSet(false, true)) {
                this.f39078e.invoke(false, this.f39074a);
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(uri, "");
            C89219l.m154719c(iVar, "");
            if (this.f39079f.compareAndSet(false, true)) {
                this.f39078e.invoke(true, this.f39074a);
            }
        }

        C16267a(C16615b bVar, C16266a aVar, Uri uri, Uri uri2, AbstractC89183m mVar) {
            this.f39074a = bVar;
            this.f39075b = aVar;
            this.f39076c = uri;
            this.f39077d = uri2;
            this.f39078e = mVar;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89187q
    public final /* synthetic */ C89391z invoke(Uri uri, Uri uri2, AbstractC89183m<? super Boolean, ? super C16615b, ? extends C89391z> mVar) {
        Uri uri3 = uri;
        Uri uri4 = uri2;
        AbstractC89183m<? super Boolean, ? super C16615b, ? extends C89391z> mVar2 = mVar;
        C89219l.m154719c(uri3, "");
        C89219l.m154719c(uri4, "");
        C89219l.m154719c(mVar2, "");
        BulletContainerView bulletContainerView = new BulletContainerView(new MutableContextWrapper(this.f39072a), null, 6, (byte) 0);
        bulletContainerView.mo25820a(this.f39073b);
        bulletContainerView.mo26837a(uri3, (Bundle) null, (C16248b) null, new C16267a(new C16615b(uri3, uri4, bulletContainerView, EnumC16626c.PRE_RENDER), this, uri3, uri4, mVar2));
        return C89391z.f203057a;
    }
}
