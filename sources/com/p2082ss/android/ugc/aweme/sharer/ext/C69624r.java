package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69647i;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.ext.p3780a.C69588a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69580d;
import com.p2082ss.android.ugc.trill.R;
import com.snapchat.kit.sdk.C28947b;
import com.snapchat.kit.sdk.C28951c;
import com.snapchat.kit.sdk.creative.api.C29048a;
import com.snapchat.kit.sdk.creative.p2072b.C29051b;
import com.snapchat.kit.sdk.creative.p2072b.C29052c;
import com.snapchat.kit.sdk.creative.p2073c.C29054b;
import com.snapchat.kit.sdk.creative.p2073c.C29055c;
import com.snapchat.kit.sdk.creative.p2073c.C29057e;
import com.snapchat.kit.sdk.creative.p2074d.C29060c;
import com.snapchat.kit.sdk.creative.p2074d.C29061d;
import com.snapchat.kit.sdk.p2066b.C28949b;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.r */
public final class C69624r extends AbstractC69574a {

    /* renamed from: a */
    private final AbstractC69575a f155449a;

    static {
        Covode.recordClassIndex(81996);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "snapchat";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Snapchat";
    }

    /* renamed from: e */
    private final void m122980e() {
        Context a = this.f155449a.mo81451a();
        if (a == null) {
            a = C17867d.m33078a();
        }
        C28951c.m57975b(a);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.r$a */
    static final class C69625a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69625a f155450a = new C69625a();

        static {
            Covode.recordClassIndex(81997);
        }

        C69625a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_snapchat_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69625a.f155450a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: b */
    public final boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        if (C69580d.m122792a(context, "com.snapchat.android")) {
            return true;
        }
        return false;
    }

    public C69624r(AbstractC69575a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155449a = aVar;
        if (!C69588a.m122881a()) {
            Activity a = aVar.mo81451a();
            if (a != null) {
                C28951c.m57975b(a);
            } else {
                C28951c.m57975b(C17867d.m33078a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        m122980e();
        int i = Build.VERSION.SDK_INT;
        if (C28949b.m57972a(context.getPackageManager(), "com.snapchat.android")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        m122980e();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        m122980e();
        File file = new File(lVar.f155473c);
        if (file.exists()) {
            C29048a a = C28947b.m57967a(context);
            C29054b b = C28947b.m57968b(context);
            try {
                if (file.length() < 314572800) {
                    C29055c cVar = new C29055c(file);
                    C89219l.m154716b(cVar, "");
                    C29060c cVar2 = new C29060c(cVar);
                    cVar2.f68641b = lVar.f155477g;
                    a.mo50723a(cVar2);
                    return true;
                }
                b.f68628a.mo50719a("exceptionMediaSize");
                throw new C29051b("Media file size should be under 300MB");
            } catch (C29051b unused) {
                throw new C69647i("file_too_large");
            }
        } else {
            throw new C69647i("file_not_found");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        m122980e();
        File file = new File(nVar.f155481c);
        if (file.exists()) {
            C29048a a = C28947b.m57967a(context);
            C29054b b = C28947b.m57968b(context);
            try {
                long length = file.length();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getPath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                mediaMetadataRetriever.release();
                if (Integer.valueOf(extractMetadata).intValue() >= 60000) {
                    b.f68628a.mo50719a("exceptionVideoLength");
                    throw new C29052c("Video must be under 1 minute long");
                } else if (length < 314572800) {
                    b.f68628a.mo50720a("videoLength", Long.valueOf(extractMetadata).longValue());
                    C29057e eVar = new C29057e(file);
                    C89219l.m154716b(eVar, "");
                    C29061d dVar = new C29061d(eVar);
                    dVar.f68641b = nVar.f155485g;
                    a.mo50723a(dVar);
                    return true;
                } else {
                    b.f68628a.mo50719a("exceptionMediaSize");
                    throw new C29051b("Media file size should be under 300MB");
                }
            } catch (C29051b unused) {
                throw new C69647i("file_too_large");
            } catch (C29052c unused2) {
                throw new C69647i("video_too_long");
            }
        } else {
            throw new C69647i("file_not_found");
        }
    }
}
