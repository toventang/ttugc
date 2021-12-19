package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Telephony;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.q */
public final class C69622q extends AbstractC69574a {
    static {
        Covode.recordClassIndex(81994);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "sms";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "SMS";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.q$a */
    static final class C69623a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69623a f155448a = new C69623a();

        static {
            Covode.recordClassIndex(81995);
        }

        C69623a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_sms_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69623a.f155448a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", lVar.f155472b);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        String str;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        String str2 = mVar.f155479e;
        if (str2 == null || str2.length() == 0) {
            str = mVar.f155478d;
        } else {
            str = mVar.f155479e + ' ' + mVar.f155478d;
        }
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return mo109796a(context, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("video/*");
        intent.putExtra("android.intent.extra.STREAM", nVar.f155480b);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        return mo109796a(context, intent);
    }
}
