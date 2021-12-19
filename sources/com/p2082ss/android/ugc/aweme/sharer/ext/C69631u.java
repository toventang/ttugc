package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.ext.p3780a.C69589b;
import com.p2082ss.android.ugc.trill.R;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.u */
public final class C69631u extends AbstractC69643f {

    /* renamed from: a */
    public static final C69632a f155455a = new C69632a((byte) 0);

    /* renamed from: b */
    private String f155456b;

    /* renamed from: c */
    private URL f155457c;

    /* renamed from: d */
    private String f155458d;

    /* renamed from: e */
    private Uri f155459e;

    static {
        Covode.recordClassIndex(82003);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "twitter";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Twitter";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return "com.twitter.android";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.u$a */
    public static final class C69632a {
        static {
            Covode.recordClassIndex(82004);
        }

        private C69632a() {
        }

        public /* synthetic */ C69632a(byte b) {
            this();
        }
    }

    /* renamed from: f */
    private final Intent m123001f() {
        String valueOf;
        URL url = this.f155457c;
        if (url == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(url);
        }
        String a = C1764a.m5928a("https://twitter.com/intent/tweet?text=%s&url=%s", Arrays.copyOf(new Object[]{m122998a(this.f155456b), m122998a(valueOf)}, 2));
        C89219l.m154716b(a, "");
        return new Intent("android.intent.action.VIEW", Uri.parse(a));
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.u$b */
    static final class C69633b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69633b f155460a = new C69633b();

        static {
            Covode.recordClassIndex(82005);
        }

        C69633b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_twitter_circle;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m122998a(String str) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF8");
            C89219l.m154716b(encode, "");
            return encode;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private final Intent m122999c(Context context) {
        Intent d = m123000d(context);
        if (d != null) {
            return d;
        }
        return m123001f();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69633b.f155460a).mo37368a(context);
        }
        return null;
    }

    /* renamed from: d */
    private final Intent m123000d(Context context) {
        boolean z;
        ActivityInfo activityInfo;
        String str;
        Intent intent = new Intent("android.intent.action.SEND");
        StringBuilder sb = new StringBuilder();
        String str2 = this.f155458d;
        if (str2 != null) {
            sb.append(str2);
        }
        URL url = this.f155457c;
        if (url != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(url.toString());
        }
        String str3 = this.f155456b;
        if (str3 != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(str3);
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setType("text/plain");
        Uri uri = this.f155459e;
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/*");
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        C89219l.m154716b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.name);
        }
        ArrayList arrayList2 = arrayList;
        String a = C69589b.m122882a();
        if (a == null || a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !arrayList2.contains(a)) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!(resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo.packageName) == null || !C89361p.m154874b(str, "com.twitter.android", false))) {
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    return intent;
                }
            }
            return null;
        }
        intent.setClassName("com.twitter.android", a);
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        this.f155459e = lVar.f155472b;
        return mo109796a(context, m122999c(context));
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        String str;
        String str2 = "";
        C89219l.m154721d(mVar, str2);
        C89219l.m154721d(context, str2);
        if (!TextUtils.isEmpty(mVar.f155478d)) {
            str = mVar.f155478d;
        } else {
            str = mVar.f155479e;
        }
        this.f155456b = str;
        if (!TextUtils.isEmpty(mVar.f155479e)) {
            str2 = mVar.f155479e;
        }
        this.f155458d = str2;
        return mo109796a(context, m122999c(context));
    }
}
