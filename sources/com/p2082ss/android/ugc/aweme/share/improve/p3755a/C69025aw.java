package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aw */
public class C69025aw implements AbstractC69693h {

    /* renamed from: a */
    public static final C69026a f154394a = new C69026a((byte) 0);

    /* renamed from: b */
    private final Aweme f154395b;

    /* renamed from: c */
    private final String f154396c;

    /* renamed from: d */
    private final String f154397d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aw$b */
    static final class C69027b implements OnActivityResultCallback {

        /* renamed from: a */
        public static final C69027b f154398a = new C69027b();

        static {
            Covode.recordClassIndex(81341);
        }

        C69027b() {
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    static {
        Covode.recordClassIndex(81339);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.g9r;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "video_tag_edit";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_person_plus;
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
        return R.raw.icon_person_plus;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aw$a */
    public static final class C69026a {
        static {
            Covode.recordClassIndex(81340);
        }

        private C69026a() {
        }

        public /* synthetic */ C69026a(byte b) {
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
        int i;
        List<InteractionTagUserInfo> list;
        String str;
        String authorUid;
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(sharePackage, str2);
        CommentService e = CommentServiceImpl.m73664e();
        String str3 = this.f154396c;
        Aweme aweme = this.f154395b;
        AwemeStatus status = aweme.getStatus();
        if (status != null) {
            i = status.getPrivateStatus();
        } else {
            i = 0;
        }
        InteractionTagInfo interactionTagInfo = this.f154395b.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            list = interactionTagInfo.getTaggedUsers();
        } else {
            list = null;
        }
        e.mo63289a(context, str3, aweme, i, list, C69027b.f154398a);
        C33744d a = new C33744d().mo59983a("enter_from", this.f154396c);
        Aweme aweme2 = this.f154395b;
        if (aweme2 == null || (str = aweme2.getAid()) == null) {
            str = str2;
        }
        C33744d a2 = a.mo59983a("group_id", str);
        Aweme aweme3 = this.f154395b;
        if (!(aweme3 == null || (authorUid = aweme3.getAuthorUid()) == null)) {
            str2 = authorUid;
        }
        C39162r.m79460a("click_tag_edit", a2.mo59983a("author_id", str2).mo59983a("click_type", "click_edit").mo59983a("anchor_type", this.f154397d).f79943a);
    }

    public C69025aw(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f154395b = aweme;
        this.f154396c = str;
        this.f154397d = str2;
    }
}
