package com.p2082ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextPaint;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.v */
public final class C81513v {

    /* renamed from: f */
    public static final C81514a f182257f = new C81514a((byte) 0);

    /* renamed from: a */
    final AbstractC89703z f182258a;

    /* renamed from: b */
    public boolean f182259b;

    /* renamed from: c */
    public final Context f182260c;

    /* renamed from: d */
    public final List<Integer> f182261d;

    /* renamed from: e */
    public final AbstractC32846a f182262e;

    /* renamed from: g */
    private final String f182263g;

    /* renamed from: h */
    private final String f182264h;

    /* renamed from: i */
    private final AbstractC89171a<Boolean> f182265i;

    /* renamed from: j */
    private final boolean f182266j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.watermark.v$h */
    public static final class C81521h extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f182275a;

        /* renamed from: b */
        int f182276b;

        /* renamed from: c */
        final /* synthetic */ C81513v f182277c;

        /* renamed from: d */
        Object f182278d;

        /* renamed from: e */
        Object f182279e;

        /* renamed from: f */
        Object f182280f;

        /* renamed from: g */
        Object f182281g;

        /* renamed from: h */
        Object f182282h;

        /* renamed from: i */
        boolean f182283i;

        static {
            Covode.recordClassIndex(94894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81521h(C81513v vVar, AbstractC89124d dVar) {
            super(dVar);
            this.f182277c = vVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f182275a = obj;
            this.f182276b |= Integer.MIN_VALUE;
            return this.f182277c.mo125229a(this);
        }
    }

    static {
        Covode.recordClassIndex(94886);
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$a */
    public static final class C81514a {
        static {
            Covode.recordClassIndex(94887);
        }

        private C81514a() {
        }

        public /* synthetic */ C81514a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo125232c() {
        return this.f182265i.invoke().booleanValue();
    }

    /* renamed from: d */
    public final String mo125233d() {
        String h = this.f182262e.mo58665h();
        if (h == null) {
            return "";
        }
        return h;
    }

    /* renamed from: e */
    public final String mo125234e() {
        String str;
        String a = this.f182262e.mo58658a();
        if (a == null || a.length() == 0) {
            str = this.f182262e.mo58659b();
        } else {
            str = this.f182262e.mo58658a();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final String mo125230a() {
        MethodCollector.m26663i(8177);
        String str = "";
        if (!this.f182266j) {
            MethodCollector.m26664o(8177);
            return str;
        }
        String str2 = this.f182263g + "ending_watermark_audio.aac";
        if (!C81499j.m141325a().getBoolean("key_ending_audio_ready", false) || !C80720e.m139927b(str2)) {
            this.f182259b = true;
            C81499j.m141328a(false);
            C80720e.m139917a(str2, true);
            try {
                C84902i.m145891a(this.f182260c.getAssets().open("ending_watermark_audio.aac"), new FileOutputStream(str2));
                C81499j.m141328a(true);
                str = str2;
            } catch (IOException e) {
                C80720e.m139931c(str2);
                C84911q.m145923a("WatermarkResourceLoader", e);
            }
            MethodCollector.m26664o(8177);
            return str;
        }
        MethodCollector.m26664o(8177);
        return str2;
    }

    /* renamed from: b */
    public final String mo125231b() {
        MethodCollector.m26663i(8325);
        int intValue = this.f182261d.get(0).intValue();
        int intValue2 = this.f182261d.get(1).intValue();
        String str = this.f182264h;
        C81489c cVar = null;
        if (str != null) {
            if (!C84902i.m145892a(str)) {
                str = null;
            }
            if (str != null) {
                int[] iArr = new int[10];
                if (C78102c.m136520a(str, iArr) == 0) {
                    intValue = iArr[0];
                    intValue2 = iArr[1];
                }
            }
        }
        String str2 = this.f182263g + "ending_frame.png";
        if (!C80720e.m139927b(str2) || !C89219l.m154714a((Object) C81499j.m141325a().getString("key_ending_frame_ready", ""), (Object) C81499j.m141329b(intValue, intValue2))) {
            this.f182259b = true;
            try {
                C81489c cVar2 = new C81489c();
                if (intValue > 0 && intValue2 > 0) {
                    cVar2.f182196a = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    new Canvas(cVar2.f182196a).drawColor(Color.parseColor("#0E0F1A"));
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.mo125202a(str2);
                }
                C81499j.m141326a(intValue, intValue2);
            } catch (Exception e) {
                C80720e.m139931c(str2);
                C81499j.m141326a(-1, -1);
                C84911q.m145923a("WatermarkResourceLoader", e);
                str2 = "";
            }
            MethodCollector.m26664o(8325);
            return str2;
        }
        MethodCollector.m26664o(8325);
        return str2;
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$b */
    public static final class C81515b implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f182267a;

        static {
            Covode.recordClassIndex(94888);
        }

        C81515b(AbstractC89124d dVar) {
            this.f182267a = dVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            AbstractC89124d dVar = this.f182267a;
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
            } else {
                exc = null;
            }
            dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(new Throwable("request watermark panel failed", exc))));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<Effect> allCategoryEffects;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 == null || (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty()) {
                this.f182267a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(new Throwable("watermark panel empty"))));
            } else {
                this.f182267a.resumeWith(C89379q.m157068constructorimpl(allCategoryEffects));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$c */
    public static final class C81516c implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f182268a;

        static {
            Covode.recordClassIndex(94889);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        C81516c(AbstractC89124d dVar) {
            this.f182268a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            this.f182268a.resumeWith(C89379q.m157068constructorimpl(effect2.getUnzipPath()));
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f182268a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(new Throwable("download effect failed", exceptionResult.getException()))));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$d */
    public static final class C81517d implements IAVEffectService.IAVEffectReadyCallback<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f182269a;

        static {
            Covode.recordClassIndex(94890);
        }

        C81517d(AbstractC89124d dVar) {
            this.f182269a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(AbstractC46415f fVar) {
            if (fVar == null) {
                this.f182269a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new RuntimeException("effect so fail"))));
            } else {
                this.f182269a.resumeWith(C89379q.m157068constructorimpl(fVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.watermark.v$e */
    public static final class C81518e extends AbstractC89220m implements AbstractC89172b<EffectPlatformBuilder, C89391z> {

        /* renamed from: a */
        public static final C81518e f182270a = new C81518e();

        static {
            Covode.recordClassIndex(94891);
        }

        C81518e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectPlatformBuilder effectPlatformBuilder) {
            EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
            C89219l.m154721d(effectPlatformBuilder2, "");
            effectPlatformBuilder2.setRegion(C63244g.m114602a().mo73297y().mo93847a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$g */
    static final class C81520g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f182272a;

        /* renamed from: b */
        final /* synthetic */ C81513v f182273b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89188r f182274c;

        static {
            Covode.recordClassIndex(94893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81520g(C81513v vVar, AbstractC89188r rVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f182273b = vVar;
            this.f182274c = rVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C81520g(this.f182273b, this.f182274c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C81520g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f182272a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C81513v vVar = this.f182273b;
                this.f182272a = 1;
                obj = vVar.mo125229a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String a = this.f182273b.mo125230a();
            String b = this.f182273b.mo125231b();
            AbstractC89188r rVar = this.f182274c;
            if (rVar != null) {
                rVar.mo8774a(Boolean.valueOf(this.f182273b.f182259b), C89070n.m154516a(obj), b, a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final Effect m141353a(List<? extends Effect> list) {
        T t = null;
        if (mo125232c()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (t2.getTags() != null) {
                    List<String> tags = t2.getTags();
                    if (tags == null) {
                        C89219l.m154715b();
                    }
                    if (tags.contains("mark_subjective")) {
                        t = next;
                        break;
                    }
                }
            }
            return t;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            T t3 = next2;
            if (t3.getTags() != null) {
                List<String> tags2 = t3.getTags();
                if (tags2 == null) {
                    C89219l.m154715b();
                }
                if (tags2.contains("mark_objective")) {
                    t = next2;
                    break;
                }
            }
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.watermark.v$i */
    public static final class C81522i<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f182284a;

        /* renamed from: b */
        final /* synthetic */ C81513v f182285b;

        /* renamed from: c */
        final /* synthetic */ String f182286c;

        static {
            Covode.recordClassIndex(94895);
        }

        C81522i(AbstractC89671m mVar, C81513v vVar, String str) {
            this.f182284a = mVar;
            this.f182285b = vVar;
            this.f182286c = str;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            boolean z;
            int i;
            String str;
            int i2;
            boolean z2;
            float f;
            int i3;
            MethodCollector.m26663i(8031);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                C84911q.m145923a("WatermarkResourceLoader", new Throwable("requested user avatar is null"));
                bitmap = BitmapFactory.decodeResource(this.f182285b.f182260c.getResources(), 2131231609);
                C89219l.m154716b(bitmap, "");
                z = false;
            } else {
                z = true;
            }
            String d = this.f182285b.mo125233d();
            String e = this.f182285b.mo125234e();
            C81489c cVar = new C81489c();
            if (this.f182285b.mo125232c()) {
                int intValue = this.f182285b.f182261d.get(0).intValue();
                int intValue2 = this.f182285b.f182261d.get(1).intValue();
                if (intValue > 0 && intValue2 > 0) {
                    float min = (float) Math.min(bitmap.getWidth(), bitmap.getHeight());
                    float f2 = ((1.0f * min) / 128.0f) * 3.0f;
                    int round = Math.round(min + (f2 * 2.0f));
                    float f3 = ((float) round) / 2.0f;
                    Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    float f4 = f3 - f2;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, round, round), paint);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f2);
                    paint.setColor(-1);
                    paint.setXfermode(null);
                    canvas.drawCircle(f3, f3, f4, paint);
                    Matrix matrix = new Matrix();
                    float width = 135.0f / ((float) createBitmap.getWidth());
                    matrix.preScale(width, width);
                    cVar.f182196a = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    if (!cVar.f182196a.equals(createBitmap)) {
                        C84891c.m145846a(createBitmap);
                    }
                    cVar.mo125202a(this.f182286c + "profile.png");
                }
                int intValue3 = this.f182285b.f182261d.get(0).intValue();
                int intValue4 = this.f182285b.f182261d.get(1).intValue();
                if (intValue3 > 0 && intValue4 > 0) {
                    cVar.f182196a = Bitmap.createBitmap(386, 35, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(cVar.f182196a);
                    canvas2.drawColor(0);
                    if (intValue3 < intValue4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TextPaint textPaint = new TextPaint(1);
                    if (z2) {
                        f = 36.0f;
                    } else {
                        f = 32.0f;
                    }
                    textPaint.setTextSize(f);
                    textPaint.setTypeface(C17301b.m32033a().mo27611a(AbstractC63225bj.C63226a.f143550g));
                    textPaint.setStyle(Paint.Style.FILL);
                    textPaint.setColor(Color.parseColor("#E6FFFFFF"));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i4 = 20;
                    if (d.length() > 20) {
                        if (Character.isHighSurrogate(d.charAt(20))) {
                            i4 = 19;
                        }
                        d = d.substring(0, i4) + "...";
                    }
                    float measureText = textPaint.measureText(d);
                    if (measureText > 386.0f) {
                        int length = ((int) ((measureText - 386.0f) / (measureText / ((float) d.length())))) + 3;
                        StringBuilder sb = new StringBuilder();
                        int length2 = d.length() - length;
                        i3 = 0;
                        d = sb.append(d.substring(0, length2)).append("...").toString();
                    } else {
                        i3 = 0;
                    }
                    textPaint.getTextBounds(d, i3, d.length(), new Rect());
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    canvas2.drawText(d, 193.0f, (((fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom) + 17.0f, textPaint);
                    cVar.mo125202a(this.f182286c + "nickname.png");
                }
            }
            Context context = this.f182285b.f182260c;
            int intValue5 = this.f182285b.f182261d.get(0).intValue();
            int intValue6 = this.f182285b.f182261d.get(1).intValue();
            if (intValue5 > 0 && intValue6 > 0) {
                cVar.f182196a = Bitmap.createBitmap(261, 32, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(cVar.f182196a);
                canvas3.drawColor(0);
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232284);
                boolean z3 = true;
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setTextSize(28.0f);
                textPaint2.setTypeface(C17301b.m32033a().mo27611a(AbstractC63225bj.C63226a.f143544a));
                textPaint2.setColor(Color.parseColor("#E6FFFFFF"));
                textPaint2.setTextAlign(Paint.Align.CENTER);
                int length3 = e.length();
                if (e.length() <= 15) {
                    z3 = false;
                } else if (Character.isHighSurrogate(e.charAt(15))) {
                    length3 = 14;
                } else {
                    length3 = 15;
                }
                Rect rect = new Rect();
                if (z3) {
                    i = 0;
                    str = e.substring(0, length3) + "...";
                } else {
                    i = 0;
                    str = e;
                }
                textPaint2.getTextBounds(str, i, str.length(), rect);
                float width2 = (float) rect.width();
                float height = (float) rect.height();
                float f5 = 259.0f - height;
                if (width2 > f5) {
                    int ceil = (int) Math.ceil((double) ((width2 - f5) / (width2 / ((float) str.length()))));
                    if (!z3) {
                        ceil += 3;
                    }
                    i2 = 0;
                    e = e.substring(0, length3 - ceil) + "...";
                } else {
                    i2 = 0;
                    if (z3) {
                        e = str;
                    }
                }
                Rect rect2 = new Rect();
                textPaint2.getTextBounds(e, i2, e.length(), rect2);
                int width3 = 261 - ((int) ((((float) rect2.width()) + height) + 2.0f));
                int width4 = (261 - (width3 / 2)) - (rect2.width() / 2);
                Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                int i5 = (int) (((float) width3) / 2.0f);
                int max = Math.max((int) (Math.ceil((double) (32.0f - height)) / 2.0d), 0) + ((int) (((float) (intValue5 * 2)) / 750.0f));
                canvas3.drawBitmap(decodeResource, (Rect) null, new Rect(i5, max, (int) (((float) i5) + height), (int) (((float) max) + height)), textPaint2);
                canvas3.drawText(e, (float) width4, (((fontMetrics2.bottom - fontMetrics2.top) / 2.0f) - fontMetrics2.bottom) + 16.0f, textPaint2);
                cVar.mo125202a(this.f182286c + "username.png");
            }
            this.f182284a.resumeWith(C89379q.m157068constructorimpl(Boolean.valueOf(z)));
            MethodCollector.m26664o(8031);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0204 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo125229a(p4600h.p4603c.AbstractC89124d<? super java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.watermark.C81513v.mo125229a(h.c.d):java.lang.Object");
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.v$f */
    public static final class C81519f extends AbstractC89097a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f182271a;

        static {
            Covode.recordClassIndex(94892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81519f(AbstractC89127f.AbstractC89132c cVar, AbstractC89172b bVar) {
            super(cVar);
            this.f182271a = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C84911q.m145923a("WatermarkResourceLoader", th);
            AbstractC89172b bVar = this.f182271a;
            if (bVar != null) {
                bVar.invoke(th);
            }
        }
    }

    public C81513v(Context context, String str, List<Integer> list, String str2, AbstractC32846a aVar, AbstractC89171a<Boolean> aVar2, boolean z) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f182260c = context;
        this.f182263g = str;
        this.f182261d = list;
        this.f182264h = str2;
        this.f182262e = aVar;
        this.f182265i = aVar2;
        this.f182266j = z;
        if (list.size() == 2) {
            this.f182258a = C89582cd.m155517a(null);
            return;
        }
        throw new IllegalArgumentException("video width or video height not available.");
    }
}
