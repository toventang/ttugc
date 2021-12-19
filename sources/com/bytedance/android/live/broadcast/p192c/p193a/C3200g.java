package com.bytedance.android.live.broadcast.p192c.p193a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.StickerGiftApi;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3932e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p481b.C7300a;
import com.bytedance.android.livesdk.gift.assets.C8787d;
import com.bytedance.android.livesdk.gift.model.EnumC8850n;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8782a;
import com.bytedance.android.livesdk.model.message.C9624aw;
import com.bytedance.android.livesdk.model.message.C9721ce;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.broadcast.c.a.g */
public final class C3200g implements WeakHandler.IHandler {

    /* renamed from: a */
    final List<C9721ce> f9220a = new LinkedList();

    /* renamed from: b */
    public boolean f9221b;

    /* renamed from: c */
    public final WeakHandler f9222c = new WeakHandler(this);

    /* renamed from: d */
    public C9721ce f9223d;

    /* renamed from: e */
    public String f9224e;

    /* renamed from: f */
    private final AbstractC3186a f9225f;

    /* renamed from: g */
    private final AbstractC8782a f9226g = new AbstractC8782a() {
        /* class com.bytedance.android.live.broadcast.p192c.p193a.C3200g.C32011 */

        /* renamed from: b */
        private boolean f9228b;

        static {
            Covode.recordClassIndex(3682);
        }

        @Override // com.bytedance.android.livesdk.gift.p543a.AbstractC8782a
        /* renamed from: a */
        public final void mo8560a() {
            this.f9228b = true;
            if (C3200g.this.f9222c.hasMessages(140001)) {
                C3200g.this.f9222c.removeMessages(140001);
            }
            C3200g.this.f9222c.sendMessage(C3200g.this.f9222c.obtainMessage(140001));
        }

        @Override // com.bytedance.android.livesdk.gift.p543a.AbstractC8782a
        /* renamed from: a */
        public final void mo8561a(C9895y yVar) {
            if (!this.f9228b && yVar != null && yVar.f23945t != null && 4 == yVar.f23945t.f24000e) {
                AbstractC88979t.m154294a(new C3207l(yVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3208m(this), C3209n.f9237a);
            }
        }
    };

    static {
        Covode.recordClassIndex(3681);
    }

    /* renamed from: a */
    public final void mo8554a() {
        try {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).setGiftAnimationEngine(EnumC8850n.STICKER_GIFT, this.f9226g);
        } catch (Exception e) {
            C3854a.m9453a(6, "StickerMessageManager", e.toString());
        }
    }

    /* renamed from: d */
    public final void mo8558d() {
        this.f9222c.removeCallbacksAndMessages(null);
        ((IGiftService) C6193a.m13435a(IGiftService.class)).removeAnimationEngine(EnumC8850n.STICKER_GIFT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8556b() {
        if (!this.f9221b && !this.f9220a.isEmpty()) {
            this.f9223d = this.f9220a.remove(0);
            C32022 r5 = new C8787d() {
                /* class com.bytedance.android.live.broadcast.p192c.p193a.C3200g.C32022 */

                static {
                    Covode.recordClassIndex(3683);
                }

                @Override // com.bytedance.android.livesdk.gift.assets.C8787d, com.bytedance.android.livesdk.gift.assets.AbstractC8784a
                /* renamed from: a */
                public final void mo8562a() {
                    C3200g.this.f9221b = false;
                }

                @Override // com.bytedance.android.livesdk.gift.assets.C8787d, com.bytedance.android.livesdk.gift.assets.AbstractC8784a
                /* renamed from: a */
                public final void mo8564a(Throwable th) {
                    C3200g.this.f9221b = false;
                }

                @Override // com.bytedance.android.livesdk.gift.assets.C8787d, com.bytedance.android.livesdk.gift.assets.AbstractC8784a
                /* renamed from: a */
                public final void mo8563a(String str) {
                    if (str.equals(C3200g.this.f9223d.f23902d)) {
                        C9721ce ceVar = C3200g.this.f9223d;
                        if (ceVar.f23696q == null || ceVar.f23696q.f23431b <= 0 || ceVar.f23696q.f23432c <= 0 || TextUtils.isEmpty(C3200g.this.f9224e)) {
                            C3200g.this.f9222c.postDelayed(new RunnableC3210o(this), 1000);
                            return;
                        }
                        C3200g gVar = C3200g.this;
                        String nickName = gVar.f9223d.f23905g.getNickName();
                        ((StickerGiftApi) C3719d.C3720a.m9229a().mo9039a(StickerGiftApi.class)).checkUserNameLegality(nickName).mo143271a(new C11191f()).mo143254a(new C3205j(gVar, nickName), new C3206k(gVar));
                    }
                }
            };
            this.f9221b = true;
            ((IGiftService) C6193a.m13435a(IGiftService.class)).downloadAssets("effects", this.f9223d.f23900b, r5, 4);
        }
    }

    /* renamed from: c */
    public final void mo8557c() {
        C9721ce ceVar;
        AbstractC3186a aVar = this.f9225f;
        if (aVar != null && this.f9222c != null && (ceVar = this.f9223d) != null) {
            C11672a aVar2 = new C11672a();
            aVar2.f27893a = ceVar.f23908j;
            aVar2.mo18444c(ceVar.f23902d);
            aVar.mo8538a(aVar2);
            WeakHandler weakHandler = this.f9222c;
            weakHandler.sendMessageDelayed(weakHandler.obtainMessage(140001), this.f9223d.f23694o);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (140001 == message.what) {
            this.f9225f.mo8540d_();
            this.f9223d = null;
            this.f9221b = false;
            mo8556b();
        }
    }

    public C3200g(AbstractC3186a aVar) {
        this.f9225f = aVar;
        AbstractC88979t.m154294a(C3203h.f9230a).mo143271a(new C11191f()).mo143289d(new C3204i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8555a(String str) {
        Typeface createFromFile;
        String str2 = str;
        MethodCollector.m26663i(7094);
        if (this.f9224e == null) {
            MethodCollector.m26664o(7094);
            return;
        }
        C9624aw awVar = this.f9223d.f23696q;
        if (TextUtils.isEmpty(str2)) {
            str2 = awVar.f23433d;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C3966y.m9657a((int) R.string.gml);
        }
        String str3 = this.f9224e + File.separator + C13607d.m24442b(str2) + ".png";
        String str4 = awVar.f23430a;
        String str5 = this.f9223d.f23902d + "font.ttf";
        if (!C3932e.m9578a(str3)) {
            awVar.f23435f = "#" + awVar.f23435f;
            awVar.f23439j = str5;
            awVar.f23433d = str2;
            awVar.f23438i = str3;
            String str6 = awVar.f23438i;
            Bitmap createBitmap = Bitmap.createBitmap(awVar.f23431b, awVar.f23432c, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint();
            boolean z = true;
            textPaint.setAntiAlias(true);
            textPaint.setDither(true);
            String str7 = awVar.f23439j;
            if (!TextUtils.isEmpty(str7) && new File(str7).exists()) {
                String str8 = awVar.f23439j;
                if (TypeFaceOptimizer.getSwitch() && str8 != null) {
                    if (TypeFaceLancet.cache.contains(str8)) {
                        createFromFile = (Typeface) TypeFaceLancet.cache.get(str8);
                    } else {
                        createFromFile = Typeface.createFromFile(str8);
                        if (createFromFile != null) {
                            TypeFaceLancet.cache.put(str8, createFromFile);
                        }
                    }
                }
                createFromFile = Typeface.createFromFile(str8);
            } else {
                createFromFile = C17301b.m32033a().mo27611a(C17303d.f41567a);
            }
            textPaint.setTypeface(createFromFile);
            textPaint.setTextSize((float) awVar.f23434e);
            textPaint.setColor(Color.parseColor(awVar.f23435f));
            if (awVar.f23436g != 1) {
                z = false;
            }
            float f = 0.0f;
            if (z) {
                int b = C3966y.m9663b((int) R.color.a1w);
                textPaint.setShadowLayer(2.0f, 0.0f, 5.0f, Color.argb(153, Color.red(b), Color.green(b), Color.blue(b)));
            }
            String str9 = awVar.f23437h;
            if (TextUtils.equals(str9, "center")) {
                f = (((float) awVar.f23431b) - textPaint.measureText(awVar.f23433d)) / 2.0f;
            } else if (!TextUtils.equals(str9, "left") && TextUtils.equals(str9, "right")) {
                f = ((float) awVar.f23431b) - textPaint.measureText(awVar.f23433d);
            }
            textPaint.getTextBounds(awVar.f23433d, 0, awVar.f23433d.length(), new Rect());
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            canvas.drawText(awVar.f23433d, f, (float) ((((awVar.f23432c - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), textPaint);
            C7300a.m15202a(str6, createBitmap);
            createBitmap.recycle();
        }
        this.f9225f.mo8539a(str4, str3);
        mo8557c();
        MethodCollector.m26664o(7094);
    }
}
