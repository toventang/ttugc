package com.p2082ss.android.ugc.aweme.share.p3776ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.share.p3776ui.C69482b;
import java.io.File;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ui.a */
public final class C69480a {

    /* renamed from: a */
    public static String f155208a;

    /* renamed from: b */
    public static UrlModel f155209b;

    /* renamed from: c */
    static String f155210c;

    /* renamed from: d */
    static String f155211d = "live_share_card.png";

    /* renamed from: e */
    public static final C69480a f155212e = new C69480a();

    /* renamed from: f */
    private static final String f155213f = "LiveShareCardHelper";

    private C69480a() {
    }

    static {
        Covode.recordClassIndex(81820);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.a$a */
    public static final class C69481a implements C69482b.AbstractC69484b {

        /* renamed from: a */
        final /* synthetic */ C69482b f155214a;

        /* renamed from: b */
        final /* synthetic */ Context f155215b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f155216c;

        static {
            Covode.recordClassIndex(81821);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.p3776ui.C69482b.AbstractC69484b
        /* renamed from: a */
        public final void mo109729a() {
            String str;
            MethodCollector.m26663i(7217);
            C69482b bVar = this.f155214a;
            Context context = this.f155215b;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            C69480a.f155211d = C13607d.m24442b(new StringBuilder().append(System.currentTimeMillis()).toString()) + ".png";
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            File file = C58016d.f132221b;
            C89219l.m154716b(file, "");
            C69480a.f155210c = file.getAbsolutePath();
            C89219l.m154721d(bVar, "");
            bVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            bVar.layout(0, 0, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
            int measuredWidth = bVar.getMeasuredWidth();
            int measuredHeight = bVar.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                if (createBitmap == null) {
                    C89219l.m154715b();
                }
                bVar.draw(new Canvas(createBitmap));
                if (!(createBitmap == null || !BitmapUtils.saveBitmapToSD(createBitmap, C69480a.f155210c, C69480a.f155211d) || (C69480a.f155210c + '/' + C69480a.f155211d) == null)) {
                    this.f155216c.invoke(str);
                }
            }
            MethodCollector.m26664o(7217);
        }

        public C69481a(C69482b bVar, Context context, AbstractC89172b bVar2) {
            this.f155214a = bVar;
            this.f155215b = context;
            this.f155216c = bVar2;
        }
    }

    /* renamed from: a */
    public static Object m122697a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
