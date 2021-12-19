package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69318j;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.am */
public final class C68999am implements AbstractC69693h {

    /* renamed from: a */
    public static final C69000a f154342a = new C69000a((byte) 0);

    /* renamed from: b */
    private final Aweme f154343b;

    /* renamed from: c */
    private final AbstractC49691s<C49672ag> f154344c;

    /* renamed from: d */
    private final String f154345d;

    static {
        Covode.recordClassIndex(81313);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fa_;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "report";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_flag;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_flag;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$a */
    public static final class C69000a {
        static {
            Covode.recordClassIndex(81314);
        }

        private C69000a() {
        }

        public /* synthetic */ C69000a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C33744d a = new C33744d().mo59983a("author_id", this.f154343b.getAuthorUid()).mo59983a("enter_from", this.f154345d).mo59983a("group_id", C59208ac.m108771e(this.f154343b)).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f154343b)));
        C89219l.m154716b(a, "");
        C33744d a2 = C79900c.m138665a(a, this.f154343b, this.f154345d);
        C76598h.m134177a(a2, this.f154343b);
        C39162r.m79460a("report", a2.f79943a);
        if (!C69318j.m122516a(this.f154343b)) {
            return;
        }
        if (C50545m.m94762a(this.f154343b)) {
            C69011av.m121892a(context, this.f154343b, this.f154344c, null, null, null, 56);
            return;
        }
        AbstractC49691s<C49672ag> sVar = this.f154344c;
        if (sVar != null) {
            sVar.mo63634a(new C49672ag(1, this.f154343b));
        }
    }

    public C68999am(Aweme aweme, AbstractC49691s<C49672ag> sVar, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154343b = aweme;
        this.f154344c = sVar;
        this.f154345d = str;
    }
}
