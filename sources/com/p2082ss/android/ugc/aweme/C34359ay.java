package com.p2082ss.android.ugc.aweme;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.IFestivalService;
import com.p2082ss.android.ugc.aweme.publish.p3610a.p3611a.C65507b;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67906c;
import com.p2082ss.android.ugc.aweme.servicimpl.C67910f;
import com.p2082ss.android.ugc.aweme.servicimpl.C67917h;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.p2082ss.android.ugc.aweme.watermark.C81474a;
import com.p2082ss.android.ugc.aweme.watermark.C81489c;
import com.p2082ss.android.ugc.aweme.watermark.C81490d;
import com.p2082ss.android.ugc.aweme.watermark.C81492e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ay */
public final class C34359ay {
    static {
        Covode.recordClassIndex(41303);
    }

    /* renamed from: a */
    public static final AbstractC67906c m70308a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            return new C67917h();
        }
        return new C67910f();
    }

    /* renamed from: a */
    private static final String m70309a(AbstractC32846a aVar) {
        if (aVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(aVar.mo58658a())) {
            return aVar.mo58659b();
        }
        return aVar.mo58658a();
    }

    /* renamed from: a */
    public static final String[] m70311a(AbstractC32846a aVar, int i, int i2, boolean z, String str) {
        float f;
        int i3;
        float width;
        float f2;
        String str2;
        MethodCollector.m26663i(6074);
        C89219l.m154721d(str, "");
        C81490d.C81491a aVar2 = new C81490d.C81491a();
        IFestivalService b = FestivalService.m126857b();
        C89219l.m154716b(b, "");
        String a = b.mo101500a();
        C89219l.m154716b(a, "");
        aVar2.mo125203a(a);
        String a2 = m70309a(aVar);
        boolean a3 = C81474a.m141255a(aVar);
        aVar2.mo125204a();
        int[] iArr = new int[1];
        ArrayList arrayList = new ArrayList();
        String concat = "@".concat(String.valueOf(a2));
        C81489c cVar = new C81489c();
        if (z) {
            iArr[0] = 2131233829;
        } else {
            iArr[0] = 2131233830;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(C63238c.f143574a.getResources(), iArr[0], null);
        if (i == 0 || i2 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i) / 750.0f, ((float) i2) / 750.0f);
        }
        Resources resources = C63238c.f143574a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, (int) (176.0f * f), (int) (72.0f * f), true);
        if (TextUtils.isEmpty(concat)) {
            cVar.f182196a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            textPaint.setColor(resources.getColor(R.color.o1));
            float f3 = 20.0f * f;
            textPaint.setTextSize(f3);
            float b2 = C30745b.m63132b(C63238c.f143574a, 1.0f);
            float f4 = b2 * 4.0f;
            textPaint.setShadowLayer(0.0f, b2, f4, resources.getColor(R.color.fj));
            int i4 = (int) f3;
            int measureText = (int) (textPaint.measureText(concat) + (5.0f * f));
            int width2 = createScaledBitmap.getWidth();
            if (a3) {
                i3 = i4 + ((int) Math.ceil((double) (f * 4.0f)));
            } else {
                i3 = 0;
            }
            int max = Math.max(width2, i3 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShadowLayer(0.0f, b2, f4, resources.getColor(R.color.fj));
            if (z) {
                width = 0.0f;
            } else {
                width = (float) ((max - createScaledBitmap.getWidth()) + 3);
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = (float) (max - measureText);
            }
            canvas.drawText(concat, f2, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f * 4.0f), textPaint);
            cVar.f182196a = createBitmap;
        }
        arrayList.add(cVar);
        C81489c[] cVarArr = (C81489c[]) arrayList.toArray(new C81489c[arrayList.size()]);
        String str3 = C70638dj.f158108k;
        StringBuilder append = new StringBuilder().append(str);
        if (z) {
            str2 = "_leftalign";
        } else {
            str2 = "_rightalign";
        }
        String[] a4 = C81492e.m141306a(cVarArr, str3, append.append(str2).toString());
        C89219l.m154716b(a4, "");
        MethodCollector.m26664o(6074);
        return a4;
    }

    /* renamed from: a */
    public static final String[] m70310a(AbstractC32846a aVar, int i, int i2, int i3, boolean z, String str) {
        String str2;
        C89219l.m154721d(str, "");
        C81490d.C81491a aVar2 = new C81490d.C81491a();
        IFestivalService b = FestivalService.m126857b();
        C89219l.m154716b(b, "");
        String a = b.mo101500a();
        C89219l.m154716b(a, "");
        aVar2.mo125203a(a);
        C81489c[] a2 = C81492e.m141305a(i, i2, m70309a(aVar), C81474a.m141255a(aVar), C65507b.m117236a(i3), z, aVar2.mo125204a());
        String str3 = C70638dj.f158108k;
        StringBuilder append = new StringBuilder().append(str);
        if (z) {
            str2 = "_leftalign";
        } else {
            str2 = "_rightalign";
        }
        String[] a3 = C81492e.m141306a(a2, str3, append.append(str2).toString());
        C89219l.m154716b(a3, "");
        return a3;
    }
}
