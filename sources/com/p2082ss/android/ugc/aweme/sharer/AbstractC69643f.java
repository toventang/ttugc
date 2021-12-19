package com.p2082ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69580d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.f */
public abstract class AbstractC69643f extends AbstractC69574a {
    static {
        Covode.recordClassIndex(82015);
    }

    /* renamed from: e */
    public abstract String mo109798e();

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: b */
    public boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        String e = mo109798e();
        if (TextUtils.isEmpty(e)) {
            return true;
        }
        if (e == null) {
            C89219l.m154715b();
        }
        return C69580d.m122792a(context, e);
    }

    /* renamed from: a */
    protected static String m123028a(C69652m mVar) {
        C89219l.m154721d(mVar, "");
        String str = mVar.f155479e;
        if (str == null || str.length() == 0) {
            return mVar.f155478d;
        }
        return mVar.f155479e + ' ' + mVar.f155478d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        String e = mo109798e();
        if (TextUtils.isEmpty(e)) {
            return true;
        }
        if (e == null) {
            C89219l.m154715b();
        }
        return C69580d.m122792a(context, e);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("image/*");
        intent.setPackage(mo109798e());
        intent.putExtra("android.intent.extra.STREAM", lVar.f155472b);
        intent.putExtra("android.intent.extra.TEXT", lVar.f155474d);
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(mo109798e());
        intent.putExtra("android.intent.extra.TEXT", m123028a(mVar));
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("video/*");
        intent.setPackage(mo109798e());
        intent.putExtra("android.intent.extra.STREAM", nVar.f155480b);
        intent.putExtra("android.intent.extra.TEXT", nVar.f155482d);
        return mo109796a(context, intent);
    }
}
