package com.p2082ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.p2082ss.android.ugc.aweme.C33492am;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.utils.p */
public final class C80608p {

    /* renamed from: a */
    public static final C80608p f180256a = new C80608p();

    private C80608p() {
    }

    static {
        Covode.recordClassIndex(93881);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.p$a */
    public static final class RunnableC80609a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f180257a;

        static {
            Covode.recordClassIndex(93882);
        }

        RunnableC80609a(Context context) {
            this.f180257a = context;
        }

        public final void run() {
            C80608p.m139761a(this.f180257a, new Intent(C33492am.f79561a));
            C89219l.m154721d("send appwidget check state broadcast", "");
        }
    }

    /* renamed from: a */
    public static void m139760a(Context context) {
        C89219l.m154721d(context, "");
        C40780g.m82246c().execute(new RunnableC80609a(context));
    }

    /* renamed from: a */
    public static /* synthetic */ Bitmap m139758a(int[] iArr, Bitmap bitmap) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return m139759a(iArr, bitmap, (float) C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
    }

    /* renamed from: a */
    public static void m139761a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            C89219l.m154716b(queryBroadcastReceivers, "");
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                intent.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                context.sendBroadcast(intent);
            }
            return;
        }
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public static void m139763a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("widget_action", new C33744d().mo59983a("action_type", str).mo59983a("widget_type", str2).f79943a);
    }

    /* renamed from: a */
    private static Bitmap m139759a(int[] iArr, Bitmap bitmap, float f) {
        MethodCollector.m26663i(1594);
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(bitmap, "");
        if (iArr[0] < bitmap.getWidth()) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, iArr[0], iArr[1]);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        C89219l.m154716b(bitmap, "");
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        C89219l.m154716b(createBitmap, "");
        MethodCollector.m26664o(1594);
        return createBitmap;
    }

    /* renamed from: a */
    public static void m139762a(Context context, String str, AbstractC20728e eVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        C20766v a = C20761r.m39061a(str);
        a.f49105b = context;
        a.f49124u = Bitmap.Config.RGB_565;
        a.mo34182a(eVar);
    }

    /* renamed from: a */
    public static void m139764a(String str, String str2, int i, int i2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C33744d a = new C33744d().mo59983a("request_type", str).mo59983a("widget_type", str2).mo59983a("status", str);
        if (i == 0) {
            a.mo59980a("error_code", i2).mo59983a("error_msg", str3);
        }
        C39162r.m79460a("widget_response", a.f79943a);
    }
}
