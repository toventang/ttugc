package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.s */
public final class C69626s extends AbstractC69643f {

    /* renamed from: b */
    public static final C69627a f155451b = new C69627a((byte) 0);

    /* renamed from: a */
    public final String f155452a;

    static {
        Covode.recordClassIndex(81998);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "more";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.s$a */
    public static final class C69627a {
        static {
            Covode.recordClassIndex(81999);
        }

        private C69627a() {
        }

        public /* synthetic */ C69627a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return this.f155452a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.s$b */
    static final class C69628b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69628b f155453a = new C69628b();

        static {
            Covode.recordClassIndex(82000);
        }

        C69628b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_ellipsis_circle;
            return C89391z.f203057a;
        }
    }

    public C69626s(String str) {
        C89219l.m154721d(str, "");
        this.f155452a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69628b.f155453a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: a */
    public final boolean mo109796a(Context context, Intent intent) {
        Intent createChooser;
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        if (Build.VERSION.SDK_INT >= 22) {
            Intent intent2 = new Intent();
            intent2.setAction(context.getPackageName() + ".systemshare.targetchosen.action");
            intent2.setPackage(context.getPackageName());
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent2, 1342177280);
            C89219l.m154716b(broadcast, "");
            createChooser = Intent.createChooser(intent, "", broadcast.getIntentSender());
            C89219l.m154716b(createChooser, "");
        } else {
            createChooser = Intent.createChooser(intent, "");
            C89219l.m154716b(createChooser, "");
        }
        return super.mo109796a(context, createChooser);
    }
}
