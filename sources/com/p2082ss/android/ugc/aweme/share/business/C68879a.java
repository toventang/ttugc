package com.p2082ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.share.C49929c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.C69130d;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69197a;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.more.p3768a.C69333a;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69301a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.business.a */
public final class C68879a {

    /* renamed from: a */
    public final int f154056a;

    /* renamed from: b */
    public final String f154057b;

    /* renamed from: c */
    public final AbstractC49691s<C49672ag> f154058c;

    /* renamed from: d */
    private final Activity f154059d;

    /* renamed from: e */
    private final Fragment f154060e;

    /* renamed from: f */
    private final Aweme f154061f;

    /* renamed from: g */
    private final Bundle f154062g;

    static {
        Covode.recordClassIndex(81184);
    }

    /* renamed from: a */
    public final Dialog mo109449a() {
        boolean z;
        String str;
        boolean z2;
        C69684e.C69686b a = new C69684e.C69686b().mo109824a(AwemeSharePackage.C69206a.m122313a(this.f154061f, this.f154059d, 0, null, null, 28)).mo109830a(new C69130d());
        a.f155576g = new C69197a();
        C69684e.C69686b a2 = a.mo109826a(new C68880a(this));
        Aweme aweme = this.f154061f;
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
        C89219l.m154716b(isPrivateAvailable, "");
        Boolean c = isPrivateAvailable.mo59941c();
        if (C80636z.m139819d(aweme) || C80636z.m139818c(aweme)) {
            z = true;
        } else {
            z = false;
        }
        IAccountUserService g = C31575b.m65865g();
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        boolean isMe = g.isMe(str);
        C89219l.m154716b(c, "");
        if (!c.booleanValue() || !z || !isMe) {
            z2 = false;
        } else {
            z2 = true;
        }
        new C49929c(aweme, z2, this.f154059d, a2, this.f154058c, this.f154057b, this.f154056a, "more_board").mo84978a();
        if (C69301a.C69302a.m122500a(this.f154059d)) {
            return null;
        }
        Activity activity = this.f154059d;
        if ((activity instanceof ActivityC0945e) && !C69301a.C69302a.m122500a(activity)) {
            try {
                if (a2.f155571b.size() > 0) {
                    new C69333a(a2.mo109831a()).show(((ActivityC0945e) this.f154059d).getSupportFragmentManager(), "AwemeMore");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.a$a */
    public static final class C68880a extends C69692g {

        /* renamed from: a */
        final /* synthetic */ C68879a f154063a;

        static {
            Covode.recordClassIndex(81185);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68880a(C68879a aVar) {
            this.f154063a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            this.f154063a.f154058c.mo63634a(new C49672ag(28));
        }
    }

    public C68879a(Activity activity, Fragment fragment, Aweme aweme, AbstractC49691s<C49672ag> sVar, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(bundle, "");
        this.f154059d = activity;
        this.f154060e = fragment;
        this.f154061f = aweme;
        this.f154058c = sVar;
        this.f154062g = bundle;
        this.f154056a = bundle.getInt("page_type");
        String string = bundle.getString("event_type", "");
        C89219l.m154716b(string, "");
        this.f154057b = string;
    }
}
