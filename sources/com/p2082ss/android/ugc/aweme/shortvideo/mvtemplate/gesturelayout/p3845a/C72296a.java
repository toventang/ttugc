package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import androidx.p048g.p049a.p050a.C0995b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.AbstractC72310g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a */
public final class C72296a {

    /* renamed from: m */
    public static final AbstractC72310g f162071m = new C72298b();

    /* renamed from: n */
    public static final C72297a f162072n = new C72297a((byte) 0);

    /* renamed from: a */
    public TimeInterpolator f162073a = new C0995b();

    /* renamed from: b */
    public TimeInterpolator f162074b = new C0995b();

    /* renamed from: c */
    public TimeInterpolator f162075c = new C0995b();

    /* renamed from: d */
    public TimeInterpolator f162076d = new C0995b();

    /* renamed from: e */
    public TimeInterpolator f162077e = new C0995b();

    /* renamed from: f */
    public long f162078f = 250;

    /* renamed from: g */
    public long f162079g = 250;

    /* renamed from: h */
    public long f162080h = 250;

    /* renamed from: i */
    public long f162081i = 250;

    /* renamed from: j */
    public long f162082j = 250;

    /* renamed from: k */
    public AbstractC72310g f162083k;

    /* renamed from: l */
    public boolean f162084l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a$a */
    public static final class C72297a {
        static {
            Covode.recordClassIndex(84964);
        }

        private C72297a() {
        }

        public /* synthetic */ C72297a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a$b */
    public static final class C72298b extends AbstractC72310g {
        static {
            Covode.recordClassIndex(84965);
        }

        C72298b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.AbstractC72310g
        /* renamed from: a */
        public final Path mo114566a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    static {
        Covode.recordClassIndex(84963);
    }

    public C72296a() {
        AbstractC72310g gVar = f162071m;
        this.f162083k = gVar;
        this.f162083k = gVar;
        this.f162084l = false;
    }

    /* renamed from: a */
    public final void mo114562a(TimeInterpolator timeInterpolator) {
        C89219l.m154721d(timeInterpolator, "");
        this.f162073a = timeInterpolator;
    }

    /* renamed from: b */
    public final void mo114563b(TimeInterpolator timeInterpolator) {
        C89219l.m154721d(timeInterpolator, "");
        this.f162074b = timeInterpolator;
    }

    /* renamed from: c */
    public final void mo114564c(TimeInterpolator timeInterpolator) {
        C89219l.m154721d(timeInterpolator, "");
        this.f162075c = timeInterpolator;
    }

    /* renamed from: d */
    public final void mo114565d(TimeInterpolator timeInterpolator) {
        C89219l.m154721d(timeInterpolator, "");
        this.f162076d = timeInterpolator;
    }
}
