package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71291b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e */
public final class C71362e extends C71291b<C71358d, AbstractC71357c> {

    /* renamed from: a */
    public String f159937a;

    /* renamed from: d */
    private final AbstractC89244h f159938d = C89250i.m154773a((AbstractC89171a) C71363a.f159940a);

    /* renamed from: e */
    private String f159939e;

    static {
        Covode.recordClassIndex(83885);
    }

    /* renamed from: d */
    private final C71358d m126068d() {
        return (C71358d) this.f159938d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.e$a */
    static final class C71363a extends AbstractC89220m implements AbstractC89171a<C71358d> {

        /* renamed from: a */
        public static final C71363a f159940a = new C71363a();

        static {
            Covode.recordClassIndex(83886);
        }

        C71363a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71358d invoke() {
            return new C71358d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71291b
    /* renamed from: a */
    public final void mo112784a() {
        C71358d dVar;
        super.mo112784a();
        AbstractC71357c cVar = (AbstractC71357c) this.f159791c;
        if (cVar != null && (dVar = (C71358d) this.f159790b) != null && dVar.f159931a) {
            cVar.mo112465i();
        }
    }

    public C71362e() {
        C71358d d = m126068d();
        C89219l.m154721d(d, "");
        this.f159790b = d;
        T t = this.f159790b;
        if (t != null) {
            t.f159789f.add(this);
        }
        this.f159939e = "";
        this.f159937a = "";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71293d, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71291b
    /* renamed from: b */
    public final void mo112787b() {
        String str;
        super.mo112787b();
        T t = m126068d().f159788e;
        if (t != null) {
            C71358d dVar = (C71358d) this.f159790b;
            String str2 = "";
            if (dVar != null && dVar.f159931a) {
                LogPbBean logPbBean = t.f151689b;
                if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                    str = str2;
                }
                this.f159939e = str;
            }
            String str3 = t.f151690c;
            if (str3 != null) {
                str2 = str3;
            }
            this.f159937a = str2;
            C48027ac.C48028a.f111257a.mo80056a(this.f159937a, t.f151689b);
            AbstractC71357c cVar = (AbstractC71357c) this.f159791c;
            if (cVar != null) {
                cVar.mo112456a(t);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71293d, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.C71291b
    /* renamed from: a */
    public final void mo112785a(Exception exc) {
        super.mo112785a(exc);
        AbstractC71357c cVar = (AbstractC71357c) this.f159791c;
        if (cVar != null) {
            cVar.mo112466j();
        }
        this.f159939e = "";
    }
}
