package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69577c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.n */
public final class C69616n extends AbstractC69643f {
    static {
        Covode.recordClassIndex(81988);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "naver_blog";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "NaverBlog";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return "com.nhn.android.blog";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.n$a */
    static final class C69617a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69617a f155445a = new C69617a();

        static {
            Covode.recordClassIndex(81989);
        }

        C69617a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_naverblog_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69617a.f155445a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        String str = mVar.f155479e;
        if (str == null) {
            str = "";
        }
        String str2 = mVar.f155478d;
        C69577c cVar = new C69577c(context);
        C89086z zVar = C89086z.INSTANCE;
        C89086z zVar2 = C89086z.INSTANCE;
        C89086z zVar3 = C89086z.INSTANCE;
        C89086z zVar4 = C89086z.INSTANCE;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(zVar2, "");
        C89219l.m154721d(zVar3, "");
        C89219l.m154721d(zVar4, "");
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(zVar2, "");
        C89219l.m154721d(zVar3, "");
        C89219l.m154721d(zVar4, "");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(C69577c.f155404e);
        builder.authority(C69577c.f155405f);
        builder.appendQueryParameter(C69577c.f155406g, "1");
        if (str.length() != 0) {
            builder.appendQueryParameter(C69577c.f155407h, str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            builder.appendQueryParameter(C69577c.f155408i, str2);
        }
        C69577c.C69578a.m122791a(builder, C69577c.f155409j, zVar);
        C69577c.C69578a.m122791a(builder, C69577c.f155410k, zVar2);
        C69577c.C69578a.m122791a(builder, C69577c.f155411l, zVar3);
        C69577c.C69578a.m122791a(builder, C69577c.f155412m, zVar4);
        Uri build = builder.build();
        C89219l.m154716b(build, "");
        Intent intent = new Intent();
        intent.setData(build);
        try {
            C69577c.m122789a(cVar.f155414a, intent);
        } catch (ActivityNotFoundException unused) {
            if (cVar.mo109797a(C69577c.f155401b)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(C69577c.f155403d));
                C69577c.m122789a(cVar.f155414a, intent2);
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse(C69577c.f155402c));
                C69577c.m122789a(cVar.f155414a, intent3);
            }
        }
        return true;
    }
}
