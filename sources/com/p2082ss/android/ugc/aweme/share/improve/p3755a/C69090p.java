package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C47023hr;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.util.C80149o;
import com.p2082ss.android.ugc.aweme.util.C80158q;
import com.p2082ss.android.ugc.aweme.util.C80163u;
import com.p2082ss.android.ugc.aweme.util.C80167v;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.p */
public final class C69090p implements AbstractC69693h {

    /* renamed from: a */
    private final String f154529a;

    static {
        Covode.recordClassIndex(81404);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fdd;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "image_save";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_arrow_to_bottom;
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
        return co_();
    }

    public C69090p(String str) {
        C89219l.m154721d(str, "");
        this.f154529a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.p$a */
    public static final class C69091a extends C80158q {

        /* renamed from: a */
        final /* synthetic */ Context f154530a;

        static {
            Covode.recordClassIndex(81405);
        }

        @Override // com.p2082ss.android.ugc.aweme.util.C80158q, com.p2082ss.android.ugc.aweme.util.C80149o.AbstractC80152a
        /* renamed from: a */
        public final void mo109545a(String str) {
            C89219l.m154721d(str, "");
            super.mo109545a(str);
            new C79459a(this.f154530a).mo123050a(R.string.g64).mo123053a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69091a(Context context, Activity activity) {
            super(activity);
            this.f154530a = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.p$b */
    public static final class C69092b extends C80167v {

        /* renamed from: a */
        final /* synthetic */ Activity f154531a;

        static {
            Covode.recordClassIndex(81406);
        }

        @Override // com.p2082ss.android.ugc.aweme.util.C80163u.AbstractC80165b, com.p2082ss.android.ugc.aweme.util.C80167v
        /* renamed from: a */
        public final void mo109546a(Uri uri) {
            super.mo109546a(uri);
            new C79459a(this.f154531a).mo123050a(R.string.g64).mo123053a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69092b(Activity activity, Activity activity2) {
            super(activity2);
            this.f154531a = activity;
        }
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
        if (C47023hr.m90287a()) {
            new C80149o(new WeakReference(context)).mo123598a(this.f154529a, new C69091a(context, C69124b.m122223a(context)));
            return;
        }
        Activity a = C69124b.m122223a(context);
        if (a != null) {
            new C80163u(new WeakReference(context)).mo123609a(this.f154529a, new C69092b(a, a));
        }
    }
}
