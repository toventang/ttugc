package com.p2082ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a */
public final class C69412a extends FrameLayout {

    /* renamed from: f */
    public static final C69415c f155043f = new C69415c((byte) 0);

    /* renamed from: a */
    public ImageView f155044a;

    /* renamed from: b */
    public QRCodeSquareView f155045b;

    /* renamed from: c */
    public int f155046c;

    /* renamed from: d */
    public int f155047d;

    /* renamed from: e */
    public AbstractC69414b f155048e;

    /* renamed from: g */
    private TextView f155049g;

    /* renamed from: h */
    private TextView f155050h;

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a$b */
    public interface AbstractC69414b {
        static {
            Covode.recordClassIndex(81751);
        }

        /* renamed from: a */
        void mo109637a();
    }

    static {
        Covode.recordClassIndex(81749);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a$c */
    public static final class C69415c {
        static {
            Covode.recordClassIndex(81752);
        }

        private C69415c() {
        }

        public /* synthetic */ C69415c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a$a */
    public static final class C69413a implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ C69412a f155051a;

        /* renamed from: b */
        final /* synthetic */ Context f155052b;

        static {
            Covode.recordClassIndex(81750);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
            AbstractC69414b bVar;
            this.f155051a.f155046c = 3;
            if (this.f155051a.f155047d == 2 && (bVar = this.f155051a.f155048e) != null) {
                bVar.mo109637a();
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
            AbstractC69414b bVar;
            this.f155051a.f155046c = 3;
            if (this.f155051a.f155047d == 2 && (bVar = this.f155051a.f155048e) != null) {
                bVar.mo109637a();
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            int i;
            AbstractC69414b bVar;
            MethodCollector.m26663i(6513);
            C69412a aVar = this.f155051a;
            if (bitmap != null) {
                ImageView imageView = aVar.f155044a;
                C89219l.m154721d(bitmap, "");
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                float f = ((float) min) / 2.0f;
                canvas.drawCircle(f, f, f, paint);
                C89219l.m154716b(createBitmap, "");
                imageView.setImageBitmap(createBitmap);
                i = 2;
            } else {
                i = 3;
            }
            aVar.f155046c = i;
            if (this.f155051a.f155047d != 2 || (bVar = this.f155051a.f155048e) == null) {
                MethodCollector.m26664o(6513);
                return;
            }
            bVar.mo109637a();
            MethodCollector.m26664o(6513);
        }

        C69413a(C69412a aVar, Context context) {
            this.f155051a = aVar;
            this.f155052b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.a$d */
    public static final class C69416d implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ C69412a f155053a;

        static {
            Covode.recordClassIndex(81753);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69416d(C69412a aVar) {
            this.f155053a = aVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            int i;
            AbstractC69414b bVar;
            C69412a aVar = this.f155053a;
            if (bitmap != null) {
                aVar.f155045b.setImageBitmap(bitmap);
                if (!(this.f155053a.f155046c == 1 || (bVar = this.f155053a.f155048e) == null)) {
                    bVar.mo109637a();
                }
                i = 2;
            } else {
                i = 3;
            }
            aVar.f155047d = i;
        }
    }

    public final void setCallback(AbstractC69414b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155048e = bVar;
    }

    /* renamed from: a */
    public final void mo109662a(String str) {
        C89219l.m154721d(str, "");
        C20766v a = C20761r.m39061a(str);
        a.f49105b = getContext();
        a.mo34182a(new C69416d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C69412a(Context context) {
        super(context, null, 0);
        User user;
        List<String> urlList;
        C89219l.m154721d(context, "");
        String str = null;
        MethodCollector.m26663i(3146);
        this.f155046c = 1;
        this.f155047d = 1;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.az_, this, true);
        View findViewById = findViewById(R.id.dy8);
        C89219l.m154716b(findViewById, "");
        this.f155044a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.dy9);
        C89219l.m154716b(findViewById2, "");
        this.f155049g = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.dy6);
        C89219l.m154716b(findViewById3, "");
        this.f155050h = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.dy7);
        C89219l.m154716b(findViewById4, "");
        this.f155045b = (QRCodeSquareView) findViewById4;
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            user = g.getCurUser();
        } else {
            user = null;
        }
        UrlModel a = C80630u.m139797a(user);
        if (!(a == null || (urlList = a.getUrlList()) == null || !(true ^ urlList.isEmpty()))) {
            C20766v a2 = C20761r.m39061a(urlList.get(0));
            a2.f49105b = context;
            a2.mo34182a(new C69413a(this, context));
        }
        this.f155049g.setText(user != null ? user.getNickname() : str);
        MethodCollector.m26664o(3146);
    }

    public /* synthetic */ C69412a(Context context, byte b) {
        this(context);
    }
}
