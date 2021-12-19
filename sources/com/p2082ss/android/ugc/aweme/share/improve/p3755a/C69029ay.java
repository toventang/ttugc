package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ay */
public class C69029ay implements AbstractC69693h {

    /* renamed from: a */
    public static final C69030a f154402a = new C69030a((byte) 0);

    /* renamed from: b */
    private final Aweme f154403b;

    /* renamed from: c */
    private final String f154404c;

    /* renamed from: d */
    private final String f154405d;

    static {
        Covode.recordClassIndex(81343);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.g9u;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "video_tag_remove";
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

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_person_x_mark;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ay$a */
    public static final class C69030a {
        static {
            Covode.recordClassIndex(81344);
        }

        private C69030a() {
        }

        public /* synthetic */ C69030a(byte b) {
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
        String str;
        String authorUid;
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(sharePackage, str2);
        Activity a = C67279a.m119194a(context);
        if (a != null && (a instanceof ActivityC0945e)) {
            CommentService e = CommentServiceImpl.m73664e();
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            e.mo63290a((ActivityC0945e) a, this.f154403b, this.f154404c, this.f154405d);
        }
        C33744d a2 = new C33744d().mo59983a("enter_from", this.f154404c);
        Aweme aweme = this.f154403b;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = str2;
        }
        C33744d a3 = a2.mo59983a("group_id", str);
        Aweme aweme2 = this.f154403b;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str2 = authorUid;
        }
        C39162r.m79460a("click_tag_edit", a3.mo59983a("author_id", str2).mo59983a("click_type", "click_remove").mo59983a("anchor_type", this.f154405d).f79943a);
    }

    public C69029ay(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f154403b = aweme;
        this.f154404c = str;
        this.f154405d = str2;
    }
}
