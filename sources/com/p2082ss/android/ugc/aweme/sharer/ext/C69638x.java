package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.x */
public class C69638x extends AbstractC69643f {
    static {
        Covode.recordClassIndex(82010);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public String mo109548a() {
        return "whatsapp";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public String mo109553b() {
        return "WhatsApp";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return "com.whatsapp";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.x$a */
    static final class C69639a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69639a f155463a = new C69639a();

        static {
            Covode.recordClassIndex(82011);
        }

        C69639a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_whatsapp_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69639a.f155463a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        String b = mVar.mo109800b("whatsapp_target_phone_number", "");
        if (!TextUtils.isEmpty(b)) {
            if (!mo109549a(context, mVar)) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse("https://wa.me/" + b + "?text=" + m123028a(mVar)));
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        } else if (mVar.mo109800b("image", "").length() == 0) {
            return super.mo109551a(mVar, context);
        } else {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("image/*");
            intent2.setPackage("com.whatsapp");
            intent2.putExtra("android.intent.extra.STREAM", Uri.parse(mVar.mo109800b("image", "")));
            intent2.putExtra("android.intent.extra.TEXT", m123028a(mVar));
            intent2.addFlags(268435456);
            int i = Build.VERSION.SDK_INT;
            intent2.addFlags(64);
            return mo109796a(context, intent2);
        }
    }
}
