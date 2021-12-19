package com.p2082ss.android.ugc.aweme.profile.p3568b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.b.f */
public final class C63499f extends AbstractC59233c<C63499f> {

    /* renamed from: r */
    public static final C63500a f144115r = new C63500a((byte) 0);

    /* renamed from: a */
    public String f144116a;

    /* renamed from: b */
    public String f144117b;

    /* renamed from: c */
    public Long f144118c;

    /* renamed from: d */
    public String f144119d;

    /* renamed from: e */
    public String f144120e;

    /* renamed from: p */
    public Aweme f144121p;

    /* renamed from: q */
    public String f144122q;

    /* renamed from: s */
    private String f144123s;

    static {
        Covode.recordClassIndex(74807);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.b.f$a */
    public static final class C63500a {
        static {
            Covode.recordClassIndex(74808);
        }

        private C63500a() {
        }

        public /* synthetic */ C63500a(byte b) {
            this();
        }
    }

    public C63499f() {
        super("profile_tab_client_show");
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", this.f144116a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("author_id", this.f144117b, AbstractC59233c.AbstractC59234a.f135178b);
        if (!TextUtils.isEmpty(this.f144122q)) {
            mo96790a("tab_name", this.f144122q, AbstractC59233c.AbstractC59234a.f135177a);
        }
        if (TextUtils.equals(this.f135169h, "homepage_fresh")) {
            C81469a.m141252a();
        }
        if (TextUtils.equals(this.f135169h, "sticker_profile_detail")) {
            mo96790a("tab_name", "effect", AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("request_id", this.f144120e, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("content", this.f144119d, AbstractC59233c.AbstractC59234a.f135177a);
        if (C89219l.m154714a((Object) "prop_page", (Object) this.f135169h)) {
            mo96790a("log_pb", C48027ac.C48028a.f111257a.mo80055a(this.f144120e), AbstractC59233c.AbstractC59234a.f135178b);
        } else {
            mo96790a("music_id", String.valueOf(this.f144118c), AbstractC59233c.AbstractC59234a.f135178b);
            if (C89219l.m154714a((Object) "homepage_fresh", (Object) this.f135169h) || C89361p.m154872a("homepage_channel", this.f135169h, true)) {
                mo96794h(this.f144120e);
            }
        }
        if (TextUtils.equals("challenge", this.f135169h)) {
            mo96786a("tag_id", this.f144123s);
        }
    }

    /* renamed from: a */
    public final C63499f mo102134a(String str) {
        C89219l.m154721d(str, "");
        this.f135169h = str;
        return this;
    }
}
