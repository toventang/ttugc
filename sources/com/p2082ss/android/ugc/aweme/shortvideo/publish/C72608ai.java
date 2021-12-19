package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import androidx.core.content.p032a.C0637f;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.photo.C62860d;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ai */
public final class C72608ai {

    /* renamed from: i */
    public static final C72609a f162764i = new C72609a((byte) 0);

    /* renamed from: a */
    public final Paint f162765a;

    /* renamed from: b */
    public final Paint f162766b;

    /* renamed from: c */
    final int f162767c;

    /* renamed from: d */
    boolean f162768d;

    /* renamed from: e */
    int f162769e;

    /* renamed from: f */
    public final int f162770f;

    /* renamed from: g */
    public float f162771g;

    /* renamed from: h */
    public final boolean f162772h;

    /* renamed from: j */
    private final Context f162773j;

    static {
        Covode.recordClassIndex(85291);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ai$a */
    public static final class C72609a {
        static {
            Covode.recordClassIndex(85292);
        }

        private C72609a() {
        }

        public /* synthetic */ C72609a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ai$c */
    public static final class C72612c<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f162782a;

        static {
            Covode.recordClassIndex(85295);
        }

        C72612c(AbstractC89172b bVar) {
            this.f162782a = bVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            this.f162782a.invoke(obj);
        }
    }

    public C72608ai(Context context) {
        C89219l.m154721d(context, "");
        this.f162773j = context;
        Paint paint = new Paint();
        this.f162765a = paint;
        Paint paint2 = new Paint();
        this.f162766b = paint2;
        this.f162767c = C0637f.m2349b(context.getResources(), R.color.bl, context.getTheme());
        this.f162770f = (int) C13628n.m24520b(context, 8.0f);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, C0637f.m2349b(context.getResources(), R.color.kr, context.getTheme()));
        boolean a = C78099c.m136517a(context);
        this.f162772h = a;
        if (a) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        paint2.setAntiAlias(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.ai$b */
    public static final class C72610b extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72608ai f162774a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f162775b;

        /* renamed from: c */
        final /* synthetic */ String f162776c;

        /* renamed from: d */
        final /* synthetic */ String f162777d;

        static {
            Covode.recordClassIndex(85293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72610b(C72608ai aiVar, AbstractC89172b bVar, String str, String str2) {
            super(1);
            this.f162774a = aiVar;
            this.f162775b = bVar;
            this.f162776c = str;
            this.f162777d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            int i;
            MethodCollector.m26663i(10241);
            final Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.f162775b.invoke(null);
            } else if (!bitmap2.isRecycled() && bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
                C72608ai aiVar = this.f162774a;
                aiVar.f162765a.setTextSize((((float) bitmap2.getHeight()) / 1280.0f) * 24.0f);
                aiVar.f162771g = aiVar.f162765a.getTextSize() + ((float) aiVar.f162770f);
                aiVar.f162769e = (int) (aiVar.f162765a.getTextSize() * 1.9f);
                final Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                final Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                if (this.f162774a.f162772h) {
                    i = bitmap2.getWidth() - this.f162774a.f162770f;
                } else {
                    i = this.f162774a.f162770f;
                }
                canvas.drawText(this.f162776c, (float) i, this.f162774a.f162771g, this.f162774a.f162765a);
                if (!C84902i.m145892a(this.f162777d)) {
                    canvas.save();
                    canvas.restore();
                    this.f162775b.invoke(createBitmap);
                } else {
                    String str = this.f162777d;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    C72608ai.m128085a(str, new AbstractC89172b<Bitmap, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72608ai.C72610b.C726111 */

                        /* renamed from: a */
                        final /* synthetic */ C72610b f162778a;

                        static {
                            Covode.recordClassIndex(85294);
                        }

                        {
                            this.f162778a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 != null) {
                                C72608ai aiVar = this.f162778a.f162774a;
                                int height = bitmap2.getHeight();
                                if (!aiVar.f162768d) {
                                    aiVar.f162766b.setShader(new LinearGradient(0.0f, (float) (height - 300), 0.0f, (float) height, 0, aiVar.f162767c, Shader.TileMode.CLAMP));
                                    aiVar.f162768d = true;
                                }
                                canvas.drawRect(0.0f, (float) (bitmap2.getHeight() - 300), (float) bitmap2.getWidth(), (float) bitmap2.getHeight(), this.f162778a.f162774a.f162766b);
                                Canvas canvas = canvas;
                                C72608ai aiVar2 = this.f162778a.f162774a;
                                Bitmap bitmap3 = bitmap2;
                                canvas.drawBitmap(bitmap2, (Rect) null, new Rect((int) ((((float) bitmap3.getWidth()) - (((float) bitmap2.getWidth()) * (((float) aiVar2.f162769e) / ((float) bitmap2.getHeight())))) - ((float) aiVar2.f162770f)), (bitmap3.getHeight() - aiVar2.f162769e) - aiVar2.f162770f, bitmap3.getWidth() - aiVar2.f162770f, bitmap3.getHeight() - aiVar2.f162770f), (Paint) null);
                                canvas.save();
                                canvas.restore();
                                this.f162778a.f162775b.invoke(createBitmap);
                                C84891c.m145846a(bitmap2);
                            }
                            return C89391z.f203057a;
                        }
                    });
                }
                C84891c.m145846a(bitmap2);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10241);
            return zVar;
        }
    }

    /* renamed from: a */
    public static void m128085a(String str, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        int[] a = C84891c.m145849a(str);
        if (a == null) {
            bVar.invoke(null);
        } else {
            C84402a.m145176a(C62860d.m113278a(Uri.parse(Uri.fromFile(new File(str)).toString())), a[0], a[1], new C72612c(bVar));
        }
    }
}
