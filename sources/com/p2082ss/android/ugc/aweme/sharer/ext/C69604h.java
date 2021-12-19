package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69580d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.h */
public final class C69604h extends AbstractC69574a {
    static {
        Covode.recordClassIndex(81976);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "instagram_story";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Stories";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.h$a */
    static final class C69605a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69605a f155438a = new C69605a();

        static {
            Covode.recordClassIndex(81977);
        }

        C69605a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_instagram_story_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69605a.f155438a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: b */
    public final boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        C69652m mVar = new C69652m("");
        if (!C69580d.m122792a(context, "com.instagram.android") || !mo109549a(context, mVar)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        return m122927a(lVar, context, lVar.f155472b);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        return m122927a(nVar, context, nVar.f155480b);
    }

    /* renamed from: a */
    private boolean m122927a(AbstractC69645h hVar, Context context, Uri uri) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        String b = hVar.mo109800b("media_type", "");
        String b2 = hVar.mo109800b("content_url", "video/*");
        String b3 = hVar.mo109800b("fb_app_id", "");
        if (!TextUtils.isEmpty(b)) {
            intent.setType(b);
        }
        if (!TextUtils.isEmpty(b3)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", b3);
        }
        if (!TextUtils.isEmpty(b2)) {
            intent.putExtra("content_url", b2);
        }
        intent.setDataAndType(uri, b);
        intent.setFlags(1);
        return mo109796a(context, intent);
    }
}
