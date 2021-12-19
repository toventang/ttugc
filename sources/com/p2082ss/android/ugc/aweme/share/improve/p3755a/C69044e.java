package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.e */
public final class C69044e implements AbstractC69693h {

    /* renamed from: a */
    private final User f154433a;

    /* renamed from: b */
    private final Handler f154434b;

    static {
        Covode.recordClassIndex(81358);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "block_user";
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

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.e$a */
    static final class CallableC69045a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC69045a f154435a = new CallableC69045a();

        static {
            Covode.recordClassIndex(81359);
        }

        CallableC69045a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new Object();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        if (!this.f154433a.isBlock) {
            return R.string.a64;
        }
        return R.string.h0b;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        if (this.f154433a.isBlock) {
            return R.raw.icon_2pt_line_circle;
        }
        return R.raw.icon_2pt_block;
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

    public C69044e(User user, Handler handler) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(handler, "");
        this.f154433a = user;
        this.f154434b = handler;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C63332a.C63333a.m114832a();
        C63332a.m114824a(this.f154433a.getSecUid(), this.f154433a.getUid());
        C39162r.m79460a("click_block", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("to_user_id", this.f154433a.getUid()).f79943a);
        C34608n a = C34608n.m70658a();
        Handler handler = this.f154434b;
        CallableC69045a aVar = CallableC69045a.f154435a;
        if (this.f154433a.isBlock) {
            i = 55;
        } else {
            i = 54;
        }
        a.mo61083a(handler, aVar, i);
    }
}
