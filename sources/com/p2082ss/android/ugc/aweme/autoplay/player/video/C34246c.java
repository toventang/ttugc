package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51054c;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80314ct;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.c */
public final class C34246c implements AbstractC51043a {

    /* renamed from: E */
    public static final C34247a f80979E = new C34247a((byte) 0);

    /* renamed from: A */
    public int f80980A = -1;

    /* renamed from: B */
    public long f80981B = -1;

    /* renamed from: C */
    public int f80982C = -1;

    /* renamed from: D */
    public AbstractC34186b.AbstractC34192d f80983D;

    /* renamed from: a */
    public View f80984a;

    /* renamed from: b */
    public boolean f80985b;

    /* renamed from: c */
    public boolean f80986c = true;

    /* renamed from: d */
    public Aweme f80987d;

    /* renamed from: e */
    public boolean f80988e;

    /* renamed from: f */
    public C61501c f80989f;

    /* renamed from: g */
    final AbstractC89244h f80990g = C89250i.m154773a((AbstractC89171a) C34248b.f81010a);

    /* renamed from: h */
    public AbstractC51044b f80991h;

    /* renamed from: i */
    public AbstractC51043a f80992i;

    /* renamed from: j */
    public C51060g f80993j;

    /* renamed from: k */
    public AbstractC51064i f80994k;

    /* renamed from: l */
    public C34256e f80995l;

    /* renamed from: m */
    public AbstractC34186b.AbstractC34187a f80996m;

    /* renamed from: n */
    public boolean f80997n = true;

    /* renamed from: o */
    public AbstractC80747i f80998o;

    /* renamed from: p */
    public AbstractC89171a<String> f80999p;

    /* renamed from: q */
    public AbstractC34259f f81000q;

    /* renamed from: r */
    public String f81001r = "";

    /* renamed from: s */
    public String f81002s = "";

    /* renamed from: t */
    public String f81003t = "";

    /* renamed from: u */
    public String f81004u = "";

    /* renamed from: v */
    public int f81005v;

    /* renamed from: w */
    public boolean f81006w;

    /* renamed from: x */
    public C67568r f81007x;

    /* renamed from: y */
    public String f81008y = "";

    /* renamed from: z */
    public String f81009z = "";

    static {
        Covode.recordClassIndex(41183);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: g */
    public final Fragment mo60503g() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: h */
    public final AbstractC84295k mo60504h() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.c$a */
    public static final class C34247a {
        static {
            Covode.recordClassIndex(41184);
        }

        private C34247a() {
        }

        public /* synthetic */ C34247a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.c$b */
    static final class C34248b extends AbstractC89220m implements AbstractC89171a<C49418a> {

        /* renamed from: a */
        public static final C34248b f81010a = new C34248b();

        static {
            Covode.recordClassIndex(41185);
        }

        C34248b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C49418a invoke() {
            return new C49418a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: d */
    public final String mo60500d() {
        String d;
        AbstractC51043a aVar = this.f80992i;
        if (aVar == null || (d = aVar.mo60500d()) == null) {
            return "";
        }
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: e */
    public final boolean mo60501e() {
        AbstractC51043a aVar = this.f80992i;
        if (aVar == null || !aVar.mo60501e()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: f */
    public final Context mo60502f() {
        AbstractC51043a aVar = this.f80992i;
        if (aVar != null) {
            return aVar.mo60502f();
        }
        return null;
    }

    /* renamed from: a */
    public final C51053b mo60666a() {
        C51053b a;
        if (this.f80987d == null || (a = C51054c.C51055a.f117767a.mo86392a(mo60668b())) == null) {
            return m70012i();
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
    /* renamed from: c */
    public final boolean mo60499c() {
        AbstractC51043a aVar;
        if (!this.f80985b || (aVar = this.f80992i) == null || !aVar.mo60499c()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private C51053b m70012i() {
        C51053b bVar = null;
        if (this.f80987d != null) {
            String b = mo60668b();
            if (this.f80987d != null) {
                Aweme aweme = this.f80987d;
                if (aweme == null) {
                    C89219l.m154715b();
                }
                bVar = new C51053b(aweme, new C80314ct(), b);
                C51054c.C51055a.f117767a.mo86393a(b, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public final String mo60668b() {
        String str;
        String invoke;
        AbstractC89171a<String> aVar = this.f80999p;
        if (aVar != null && (invoke = aVar.invoke()) != null) {
            return invoke;
        }
        AbstractC51043a aVar2 = this.f80992i;
        String str2 = null;
        if (aVar2 != null) {
            str = aVar2.mo60500d();
        } else {
            str = null;
        }
        Aweme aweme = this.f80987d;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        String a = C51053b.m95442a(str, str2);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.c$c */
    static final class C34249c extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ C34246c f81011a;

        static {
            Covode.recordClassIndex(41186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34249c(C34246c cVar) {
            super(1);
            this.f81011a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ String invoke(Aweme aweme) {
            return this.f81011a.f81009z;
        }
    }

    /* renamed from: a */
    public final void mo60667a(String str) {
        C89219l.m154721d(str, "");
        this.f81001r = str;
    }

    /* renamed from: b */
    public final void mo60669b(String str) {
        C89219l.m154721d(str, "");
        this.f81009z = str;
        C67568r rVar = this.f81007x;
        if (rVar != null) {
            rVar.mo106508a(new C34249c(this));
        }
    }
}
