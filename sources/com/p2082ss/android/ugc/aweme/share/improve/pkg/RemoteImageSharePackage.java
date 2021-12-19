package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.experiment.C47023hr;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.ext.C69626s;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.util.C80149o;
import com.p2082ss.android.ugc.aweme.util.C80158q;
import com.p2082ss.android.ugc.aweme.util.C80163u;
import com.p2082ss.android.ugc.aweme.util.C80167v;
import com.p2082ss.android.ugc.aweme.web.p4239c.p4240a.C81541b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage */
public final class RemoteImageSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C69235a f154760b = new C69235a((byte) 0);

    /* renamed from: a */
    public String f154761a;

    static {
        Covode.recordClassIndex(81560);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$a */
    public static final class C69235a {
        static {
            Covode.recordClassIndex(81561);
        }

        private C69235a() {
        }

        public /* synthetic */ C69235a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RemoteImageSharePackage m122352a(Context context, C81541b bVar, String str, String str2) {
            String str3 = "";
            C89219l.m154721d(context, str3);
            C89219l.m154721d(bVar, str3);
            C89219l.m154721d(str, str3);
            SharePackage.C69654a b = new SharePackage.C69654a().mo109803a("pic").mo109806b("web");
            String str4 = bVar.f182346a;
            C89219l.m154716b(str4, str3);
            SharePackage.C69654a c = b.mo109807c(str4);
            String str5 = bVar.f182347b;
            C89219l.m154716b(str5, str3);
            SharePackage.C69654a d = c.mo109808d(str5);
            String b2 = C69124b.m122226b(bVar.f182349d);
            if (b2 != null) {
                str3 = b2;
            }
            RemoteImageSharePackage remoteImageSharePackage = new RemoteImageSharePackage(d.mo109809e(str3));
            remoteImageSharePackage.f154761a = str;
            Bundle bundle = remoteImageSharePackage.f155492i;
            bundle.putString("app_name", context.getString(R.string.u8));
            bundle.putString("thumb_url", "file://" + bVar.f182351f);
            bundle.putString("thumb_path", bVar.f182351f);
            bundle.putString("url_for_im_share", str2);
            return remoteImageSharePackage;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteImageSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$b */
    public static final class C69236b extends C80167v {

        /* renamed from: a */
        final /* synthetic */ Activity f154762a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageSharePackage f154763b;

        /* renamed from: c */
        final /* synthetic */ Context f154764c;

        /* renamed from: d */
        final /* synthetic */ AbstractC69581b f154765d;

        static {
            Covode.recordClassIndex(81562);
        }

        @Override // com.p2082ss.android.ugc.aweme.util.C80163u.AbstractC80165b, com.p2082ss.android.ugc.aweme.util.C80167v
        /* renamed from: a */
        public final void mo109546a(Uri uri) {
            super.mo109546a(uri);
            if (uri != null) {
                String a = C1762a.m5918a(this.f154762a, uri);
                C89219l.m154716b(a, "");
                C69651l lVar = new C69651l(uri, a, null, 60);
                if (this.f154765d.mo109549a(this.f154764c, lVar)) {
                    this.f154765d.mo61913a((AbstractC69645h) lVar, this.f154764c);
                    return;
                }
                String string = C17867d.m33078a().getString(R.string.cb5);
                C89219l.m154716b(string, "");
                new C69626s(string).mo109550a(lVar, this.f154764c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69236b(Activity activity, Activity activity2, RemoteImageSharePackage remoteImageSharePackage, Context context, AbstractC69581b bVar) {
            super(activity2);
            this.f154762a = activity;
            this.f154763b = remoteImageSharePackage;
            this.f154764c = context;
            this.f154765d = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 1);
        if (C47023hr.m90287a()) {
            C0692e<Boolean, String> a = new C80149o(new WeakReference(context)).mo123598a(this.f154761a, new C80158q(C69124b.m122223a(context)));
            if (!C89219l.m154714a((Object) a.f2750a, (Object) true) || a.f2751b == null) {
                return false;
            }
            S s = a.f2751b;
            if (s == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(s, "");
            Uri a2 = C69125c.m122230a(s, context);
            S s2 = a.f2751b;
            if (s2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(s2, "");
            C69651l lVar = new C69651l(a2, s2, null, 60);
            if (bVar.mo109549a(context, lVar)) {
                bVar.mo61913a((AbstractC69645h) lVar, context);
                return false;
            }
            String string = C17867d.m33078a().getString(R.string.cb5);
            C89219l.m154716b(string, "");
            new C69626s(string).mo109550a(lVar, context);
            return false;
        }
        Activity a3 = C69124b.m122223a(context);
        if (a3 == null) {
            return false;
        }
        new C80163u(new WeakReference(context)).mo123609a(this.f154761a, new C69236b(a3, a3, this, context, bVar));
        return false;
    }
}
