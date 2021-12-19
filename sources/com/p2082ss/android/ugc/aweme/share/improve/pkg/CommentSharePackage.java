package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage */
public final class CommentSharePackage extends SharePackage {

    /* renamed from: c */
    public static final C69213a f154713c = new C69213a((byte) 0);

    /* renamed from: a */
    public Comment f154714a;

    /* renamed from: b */
    public Aweme f154715b;

    static {
        Covode.recordClassIndex(81529);
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m122321a(Context context, String str, String str2, String str3, Bitmap bitmap, int i) {
        return C69213a.m122323a(context, str, str2, str3, bitmap, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage$a */
    public static final class C69213a {
        static {
            Covode.recordClassIndex(81530);
        }

        private C69213a() {
        }

        public /* synthetic */ C69213a(byte b) {
            this();
        }

        /* renamed from: a */
        private static Bitmap m122322a(Bitmap bitmap, int i, int i2) {
            MethodCollector.m26663i(8379);
            int width = bitmap.getWidth();
            int i3 = width + i;
            Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            float f = (float) i;
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.FILL);
            float f2 = ((float) i3) / 2.0f;
            float f3 = (float) (i / 2);
            float f4 = (((float) width) / 2.0f) - f3;
            canvas.drawCircle(f2, f2, f4, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            float f5 = f3 + 0.0f;
            canvas.drawBitmap(bitmap, f5, f5, paint);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(i2);
            paint2.setStrokeWidth(f);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            canvas.drawCircle(f2, f2, f4, paint2);
            C89219l.m154716b(createBitmap, "");
            MethodCollector.m26664o(8379);
            return createBitmap;
        }

        /* renamed from: a */
        public static SpannableStringBuilder m122323a(Context context, String str, String str2, String str3, Bitmap bitmap, int i) {
            String str4;
            String str5;
            Bitmap bitmap2 = bitmap;
            MethodCollector.m26663i(8841);
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C17191a.C17192a aVar = new C17191a.C17192a();
            String str6 = context.getString(R.string.c_x, str) + ": ";
            if (str2.length() > 0) {
                str4 = "@".concat(String.valueOf(str2));
                str5 = context.getString(R.string.c_s, str4) + " ";
            } else {
                str4 = "";
                str5 = str4;
            }
            String str7 = str6 + str5 + str3;
            aVar.mo27179b(str6).mo27179b(str5).mo27179b(str3);
            C17191a aVar2 = aVar.f40973a;
            int a = C89361p.m154888a((CharSequence) str7, str6, 0, false, 6);
            aVar2.mo27173a(new C23126b(43), a, str6.length() + a);
            int a2 = C89361p.m154888a((CharSequence) str7, str4, 0, false, 6);
            aVar2.mo27173a(new C23126b(43), a2, str4.length() + a2);
            if (bitmap2 == null) {
                bitmap2 = BitmapFactory.decodeResource(context.getResources(), 2131232607);
            }
            C89219l.m154716b(bitmap2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), m122322a(bitmap2, C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())), context.getResources().getColor(R.color.b6)));
            bitmapDrawable.setBounds(0, 0, i, i);
            C23127c cVar = new C23127c(bitmapDrawable);
            boolean a3 = C80471gb.m139482a();
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            cVar.mo37614a(a3, C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics())));
            aVar2.setSpan(cVar, 0, 1, 18);
            MethodCollector.m26664o(8841);
            return aVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }
}
