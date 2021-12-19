package com.bytedance.ies.bullet.p1141e.p1143b;

import android.net.Uri;
import android.util.LruCache;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1141e.p1142a.AbstractC16268a;
import com.bytedance.ies.bullet.p1141e.p1144c.C16285a;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.service.base.C16615b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.b.a */
public final class C16274a implements AbstractC16268a<Uri, C16615b> {

    /* renamed from: a */
    public C16275a f39088a;

    static {
        Covode.recordClassIndex(18567);
    }

    public C16274a(int i) {
        this.f39088a = new C16275a(i, i);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.ies.bullet.p1141e.p1142a.AbstractC16268a
    /* renamed from: a */
    public final /* synthetic */ C16615b mo25856a(Uri uri) {
        C89219l.m154719c(uri, "");
        return this.f39088a.remove(uri);
    }

    /* renamed from: a */
    public final boolean mo25865a(Uri uri) {
        C89219l.m154719c(uri, "");
        if (this.f39088a.get(uri) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo25867b(Uri uri) {
        BulletContainerView a;
        C89219l.m154719c(uri, "");
        C16615b bVar = (C16615b) this.f39088a.remove(uri);
        if (bVar == null) {
            return false;
        }
        View view = bVar.f39770c;
        if (view == null || (a = C16285a.m30273a(view)) == null) {
            return true;
        }
        a.mo25721a();
        return true;
    }

    /* renamed from: com.bytedance.ies.bullet.e.b.a$a */
    public static final class C16275a extends LruCache<Uri, C16615b> {

        /* renamed from: a */
        final /* synthetic */ int f39089a;

        static {
            Covode.recordClassIndex(18568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16275a(int i, int i2) {
            super(i2);
            this.f39089a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* synthetic */ void entryRemoved(boolean z, Uri uri, C16615b bVar, C16615b bVar2) {
            View view;
            BulletContainerView a;
            C16615b bVar3 = bVar;
            super.entryRemoved(z, uri, bVar3, bVar2);
            if (z && bVar3 != null && (view = bVar3.f39770c) != null && (a = C16285a.m30273a(view)) != null) {
                a.mo25721a();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25866a(Uri uri, C16615b bVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        this.f39088a.put(uri, bVar);
        return true;
    }
}
