package com.bytedance.android.ecommerce.p164j;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.android.ecommerce.p153a.p154a.C2735b;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2769d;
import com.bytedance.android.ecommerce.p165k.C2835h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.bytedance.android.ecommerce.j.l */
public final class C2814l implements AbstractC2808g {

    /* renamed from: a */
    private String f8400a = "OcrService";

    /* renamed from: b */
    private Context f8401b;

    /* renamed from: c */
    private String f8402c;

    /* renamed from: d */
    private String f8403d;

    /* renamed from: e */
    private String f8404e;

    /* renamed from: f */
    private boolean f8405f;

    /* renamed from: g */
    private AbstractC2769d f8406g;

    static {
        Covode.recordClassIndex(3240);
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2808g
    /* renamed from: a */
    public final C2735b mo7393a() {
        C2735b bVar = new C2735b(this.f8403d, this.f8404e);
        TimeZone timeZone = TimeZone.getTimeZone("gmt");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        bVar.f8154b = simpleDateFormat.format(new Date());
        bVar.f8153a = this.f8402c;
        return bVar;
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2808g
    /* renamed from: a */
    public final void mo7394a(String str) {
        this.f8404e = str;
    }

    public C2814l(Context context) {
        this.f8401b = context;
    }

    @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
    /* renamed from: a */
    public final void mo7348a(int i, int i2, String str, C2740b bVar) {
        AbstractC2769d dVar = this.f8406g;
        if (dVar != null) {
            dVar.mo7348a(i, i2, str, bVar);
        }
        this.f8406g = null;
        this.f8405f = false;
        this.f8402c = "";
        this.f8403d = "";
        this.f8404e = "";
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2808g
    /* renamed from: a */
    public final void mo7395a(String str, String str2, String str3, AbstractC2769d dVar) {
        this.f8406g = dVar;
        if (this.f8405f) {
            mo7348a(0, 102, "The ocr service is running, please do not repeat it!", (C2740b) null);
        } else if (!C2835h.m8111a(this.f8401b)) {
            mo7348a(0, 106, "Network un available!", (C2740b) null);
        } else {
            this.f8405f = true;
            this.f8402c = str;
            this.f8403d = str2;
            this.f8404e = str3;
            try {
                Intent intent = new Intent(this.f8401b, OcrActivity.class);
                intent.setFlags(268435456);
                Context context = this.f8401b;
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            } catch (Throwable th) {
                mo7348a(0, 103, "error to start ocr activity:" + th.getMessage(), (C2740b) null);
            }
        }
    }
}
