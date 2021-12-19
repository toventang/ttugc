package com.bytedance.android.live.core.p218f;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.core.f.h */
public final class C3935h {

    /* renamed from: i */
    public static final C3936a f10815i = new C3936a((byte) 0);

    /* renamed from: a */
    public C3939i f10816a;

    /* renamed from: b */
    public boolean f10817b = true;

    /* renamed from: c */
    public boolean f10818c;

    /* renamed from: d */
    public int f10819d = 1;

    /* renamed from: e */
    public int f10820e;

    /* renamed from: f */
    public long f10821f = -1;

    /* renamed from: g */
    public long f10822g = -1;

    /* renamed from: h */
    public boolean f10823h;

    /* renamed from: j */
    private HSImageView f10824j;

    /* renamed from: k */
    private String f10825k = "";

    /* renamed from: l */
    private String f10826l = "";

    /* renamed from: m */
    private String f10827m = "";

    static {
        Covode.recordClassIndex(4464);
    }

    /* renamed from: com.bytedance.android.live.core.f.h$a */
    public static final class C3936a {
        static {
            Covode.recordClassIndex(4465);
        }

        private C3936a() {
        }

        public /* synthetic */ C3936a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo9280a() {
        if (this.f10824j != null) {
            if (!TextUtils.isEmpty(this.f10825k) && !TextUtils.isEmpty(this.f10826l)) {
                this.f10827m = HSAnimImageView.f11029i.mo9400a(this.f10825k, this.f10826l, this.f10818c);
            }
            if (!TextUtils.isEmpty(this.f10827m)) {
                C24185e a = C24182c.m45843b().mo39799b(Uri.parse(this.f10827m));
                a.f57306j = this.f10817b;
                a.f57303g = new C3937b(this);
                AbstractC24195a c = a.mo39827e();
                HSImageView hSImageView = this.f10824j;
                if (hSImageView != null) {
                    hSImageView.setController(c);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.h$b */
    public static final class C3937b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C3935h f10828a;

        static {
            Covode.recordClassIndex(4466);
        }

        /* renamed from: com.bytedance.android.live.core.f.h$b$a */
        public static final class C3938a extends C24296c {

            /* renamed from: a */
            final /* synthetic */ C3937b f10829a;

            static {
                Covode.recordClassIndex(4467);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C3938a(C3937b bVar) {
                this.f10829a = bVar;
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: b */
            public final void mo9285b(C24290a aVar) {
                C89219l.m154721d(aVar, "");
                C3939i iVar = this.f10829a.f10828a.f10816a;
                if (iVar != null) {
                    iVar.mo8655a(aVar);
                }
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: c */
            public final void mo9286c(C24290a aVar) {
                this.f10829a.f10828a.f10820e++;
                if (this.f10829a.f10828a.f10820e >= this.f10829a.f10828a.f10819d) {
                    aVar.stop();
                }
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: a */
            public final void mo9283a(C24290a aVar) {
                C89219l.m154721d(aVar, "");
                this.f10829a.f10828a.f10820e = 0;
                this.f10829a.f10828a.f10822g = System.currentTimeMillis();
                if (this.f10829a.f10828a.f10816a != null) {
                    C89219l.m154721d(aVar, "");
                }
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: a */
            public final void mo9284a(C24290a aVar, int i) {
                super.mo9284a(aVar, i);
                if (!(this.f10829a.f10828a.f10816a == null || aVar == null)) {
                    aVar.mo40072c();
                }
                if (this.f10829a.f10828a.f10821f > 0 && System.currentTimeMillis() - this.f10829a.f10828a.f10822g >= this.f10829a.f10828a.f10821f && !this.f10829a.f10828a.f10823h && aVar != null) {
                    aVar.stop();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3937b(C3935h hVar) {
            this.f10828a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            C89219l.m154721d(str, "");
            if (animatable instanceof C24290a) {
                if (this.f10828a.f10819d > 1) {
                    C24290a aVar = (C24290a) animatable;
                    aVar.mo40069a(new C3962u(aVar.f57588d, this.f10828a.f10819d));
                } else if (this.f10828a.f10821f > 0) {
                    C24290a aVar2 = (C24290a) animatable;
                    long b = aVar2.mo40071b();
                    C3935h hVar = this.f10828a;
                    hVar.f10819d = (int) (((hVar.f10821f + b) - 1) / b);
                    aVar2.mo40069a(new C3962u(aVar2.f57588d, this.f10828a.f10819d));
                }
                ((C24290a) animatable).mo40070a(new C3938a(this));
            }
        }
    }

    /* renamed from: a */
    public final C3935h mo9277a(C3939i iVar) {
        C89219l.m154721d(iVar, "");
        this.f10816a = iVar;
        return this;
    }

    /* renamed from: b */
    public final C3935h mo9281b(String str) {
        C89219l.m154721d(str, "");
        this.f10826l = str;
        return this;
    }

    /* renamed from: a */
    public final C3935h mo9278a(HSImageView hSImageView) {
        C89219l.m154721d(hSImageView, "");
        this.f10824j = hSImageView;
        return this;
    }

    /* renamed from: a */
    public final C3935h mo9279a(String str) {
        C89219l.m154721d(str, "");
        this.f10825k = str;
        return this;
    }
}
