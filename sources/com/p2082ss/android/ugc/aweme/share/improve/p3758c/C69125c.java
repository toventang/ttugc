package com.p2082ss.android.ugc.aweme.share.improve.p3758c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.C0569a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.share.C68857ad;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.C69185e;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.io.File;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.c */
public final class C69125c {
    static {
        Covode.recordClassIndex(81439);
    }

    /* renamed from: a */
    public static final ShareInfo m122231a(ShareInfo shareInfo) {
        if (shareInfo != null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.setShareTitle("");
        shareInfo2.setBoolPersist(0);
        shareInfo2.setShareDesc("");
        shareInfo2.setShareSignatureDesc("");
        shareInfo2.setShareSignatureUrl("");
        shareInfo2.setShareUrl("");
        shareInfo2.setShareQuote("");
        return shareInfo2;
    }

    /* renamed from: a */
    public static final void m122233a(Context context) {
        Activity j;
        C89219l.m154721d(context, "");
        if (context instanceof Activity) {
            j = (Activity) context;
        } else {
            j = C17873f.m33102j();
        }
        if (j != null) {
            C35444b.m72473a(j, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C69126a(j, context));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a */
    public static final class C69126a implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ Activity f154569a;

        /* renamed from: b */
        final /* synthetic */ Context f154570b;

        static {
            Covode.recordClassIndex(81440);
        }

        C69126a(Activity activity, Context context) {
            this.f154569a = activity;
            this.f154570b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a$a */
        static final class DialogInterface$OnClickListenerC69127a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C69126a f154571a;

            static {
                Covode.recordClassIndex(81441);
            }

            DialogInterface$OnClickListenerC69127a(C69126a aVar) {
                this.f154571a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C80310cp.m139213a(this.f154571a.f154570b);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            C89219l.m154716b(iArr, "");
            if (iArr.length != 0 && iArr[0] == -1 && !C0569a.m2183a(this.f154569a, strArr[0])) {
                C80273bt.m139144a(this.f154570b, null, new DialogInterface$OnClickListenerC69127a(this)).show();
            }
        }
    }

    /* renamed from: a */
    public static final Uri m122230a(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        Uri a = C80312cr.m139224a(context, new File(str));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final String m122232a(String str, String str2, AbstractC69581b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        return C69185e.m122286a(str2, str, bVar.mo109548a());
    }

    /* renamed from: b */
    public static final AbstractC88973n<String> m122234b(String str, String str2, AbstractC69581b bVar) {
        AbstractC88973n<String> nVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        String a = bVar.mo109548a();
        C89219l.m154721d(str2, "");
        C89219l.m154721d(a, "");
        if (C80580in.m139687c() || str == null || str.length() == 0) {
            nVar = AbstractC88973n.m154243a((AbstractC88976q) new C69185e.C69189b(str));
        } else {
            String a2 = C68857ad.m121524a(str, a);
            if (TextUtils.isEmpty(a2)) {
                nVar = null;
            } else {
                nVar = C68863ah.f154028b.mo109358a(str2, a, a2);
            }
        }
        C89219l.m154716b(nVar, "");
        return nVar;
    }
}
