package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ak */
public final class C68996ak implements AbstractC69693h {

    /* renamed from: a */
    private final Handler f154339a;

    static {
        Covode.recordClassIndex(81310);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.f_o;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "remove_follower";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_person_x_mark;
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

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ak$a */
    static final class CallableC68997a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC68997a f154340a = new CallableC68997a();

        static {
            Covode.recordClassIndex(81311);
        }

        CallableC68997a() {
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

    public C68996ak(Handler handler) {
        C89219l.m154721d(handler, "");
        this.f154339a = handler;
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
        C34608n.m70658a().mo61083a(this.f154339a, CallableC68997a.f154340a, 56);
    }
}
