package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.b */
public final class C69590b extends AbstractC69574a {
    static {
        Covode.recordClassIndex(81962);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "email";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Email";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.b$a */
    static final class C69591a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69591a f155430a = new C69591a();

        static {
            Covode.recordClassIndex(81963);
        }

        C69591a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_email_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69591a.f155430a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        C89219l.m154716b(queryIntentActivities, "");
        if (queryIntentActivities.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: a */
    public final boolean mo109554a(C69650k kVar, Context context) {
        String str;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        String str2 = kVar.f155471c;
        if (str2 == null || str2.length() == 0) {
            str = kVar.f155470b;
        } else {
            str = kVar.f155471c + ' ' + kVar.f155470b;
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", kVar.f155479e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", lVar.f155474d);
        intent.putExtra("android.intent.extra.SUBJECT", lVar.f155476f);
        intent.putExtra("android.intent.extra.STREAM", lVar.f155472b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", mVar.f155478d);
        intent.putExtra("android.intent.extra.SUBJECT", mVar.f155479e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", nVar.f155482d);
        intent.putExtra("android.intent.extra.SUBJECT", nVar.f155484f);
        intent.putExtra("android.intent.extra.STREAM", nVar.f155480b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo109796a(context, intent);
    }
}
