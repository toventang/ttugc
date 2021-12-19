package com.p2082ss.android.ugc.aweme.tools.beauty.service;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41099d;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.C77884a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a */
public final class C78044a implements AbstractC78051c {

    /* renamed from: a */
    public boolean f175091a;

    /* renamed from: b */
    public String f175092b;

    /* renamed from: c */
    public final AbstractC77967m f175093c;

    /* renamed from: d */
    public final AbstractC78055e f175094d;

    /* renamed from: f */
    private final String f175095f;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$a */
    public static final class C78045a {

        /* renamed from: a */
        public AbstractC78055e f175096a;

        /* renamed from: b */
        public String f175097b = "default";

        /* renamed from: c */
        public BeautyFilterConfig f175098c;

        /* renamed from: d */
        public C27910f f175099d;

        /* renamed from: e */
        public AbstractC89171a<? extends AbstractC84398d> f175100e;

        /* renamed from: f */
        public AbstractC77967m.AbstractC77969b f175101f = new C77884a();

        static {
            Covode.recordClassIndex(91136);
        }
    }

    static {
        Covode.recordClassIndex(91135);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: a */
    public final boolean mo121768a() {
        return this.f175091a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: b */
    public final String mo121769b() {
        return this.f175092b;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: g */
    public final AbstractC77967m mo121774g() {
        return this.f175093c;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: c */
    public final void mo121770c() {
        this.f175093c.mo121625l();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: f */
    public final boolean mo121773f() {
        return this.f175094d.mo110217a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: d */
    public final C41099d<List<BeautyComposerInfo>> mo121771d() {
        if (!this.f175091a) {
            return new C41099d<>();
        }
        return this.f175093c.mo121605c();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: e */
    public final C41099d<List<BeautyComposerInfo>> mo121772e() {
        if (!this.f175091a) {
            return new C41099d<>();
        }
        return this.f175093c.mo121629n();
    }

    /* renamed from: b */
    private void m136370b(String str, AbstractC78051c.AbstractC78052a aVar) {
        C89219l.m154721d(str, "");
        this.f175093c.mo121592a(str, aVar);
    }

    /* renamed from: a */
    public final void mo121766a(String str, AbstractC78051c.AbstractC78052a aVar) {
        C89219l.m154721d(str, "");
        this.f175091a = true;
        m136370b(str, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c
    /* renamed from: a */
    public final void mo121767a(boolean z, EnumC77817a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f175091a) {
            if (this.f175094d.mo121655c() >= 3) {
                aVar = EnumC77817a.FEMALE;
            }
            if (aVar != EnumC77817a.CUR) {
                this.f175093c.mo121598a(z, aVar);
            } else {
                AbstractC77967m.C77968a.m136228a(this.f175093c, z, null, 2);
            }
        }
    }

    public C78044a(String str, AbstractC77967m mVar, AbstractC78055e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(eVar, "");
        this.f175095f = str;
        this.f175093c = mVar;
        this.f175094d = eVar;
        this.f175092b = str;
    }
}
