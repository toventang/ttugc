package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61639m;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ab */
public final class View$OnClickListenerC62029ab extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    private final View f140769a;

    /* renamed from: b */
    private final View f140770b;

    /* renamed from: c */
    private final AvatarImageWithVerify f140771c;

    /* renamed from: d */
    private final AvatarImageView f140772d;

    /* renamed from: e */
    private final AvatarImageView f140773e;

    /* renamed from: f */
    private final TextView f140774f;

    /* renamed from: q */
    private final TextView f140775q;

    /* renamed from: r */
    private final RemoteImageView f140776r;

    /* renamed from: s */
    private C61639m f140777s;

    /* renamed from: t */
    private boolean f140778t = true;

    /* renamed from: u */
    private BaseNotice f140779u;

    static {
        Covode.recordClassIndex(72783);
    }

    /* renamed from: c */
    private static boolean m112203c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62030a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ab$a */
    static final class C62030a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62029ab f140780a;

        static {
            Covode.recordClassIndex(72784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62030a(View$OnClickListenerC62029ab abVar) {
            super(0);
            this.f140780a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f140780a.f140985k;
            String str = this.f140780a.f140986l;
            C89219l.m154716b(str, "");
            C62259e.m112619a("pollsticker", i, str, this.f140780a.f140768h.mo100337a(), this.f140780a.f140984j.templateId);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62029ab(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140769a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        this.f140770b = findViewById2;
        View findViewById3 = view.findViewById(R.id.cuh);
        C89219l.m154716b(findViewById3, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById3;
        this.f140771c = avatarImageWithVerify;
        View findViewById4 = view.findViewById(R.id.cuj);
        C89219l.m154716b(findViewById4, "");
        this.f140772d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cuk);
        C89219l.m154716b(findViewById5, "");
        this.f140773e = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById6, "");
        this.f140774f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById7, "");
        this.f140775q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById8, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById8;
        this.f140776r = remoteImageView;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(findViewById2);
        C62023a.m112168a(remoteImageView);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        remoteImageView.setOnClickListener(this);
        ((C24246a) remoteImageView.getHierarchy()).mo39966c(R.color.f);
        C62266j.m112646a(remoteImageView);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        Integer valueOf;
        List<? extends User> list;
        User user;
        String uid;
        List<? extends User> list2;
        User user2;
        String secUid;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112203c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        C61639m mVar = this.f140777s;
        if (mVar != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cu9 || valueOf.intValue() == R.id.cuf || valueOf.intValue() == R.id.cv7) {
                String str = mVar.f139933g;
                mo100143a("pollsticker", getLayoutPosition());
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a(str).mo63248a("refer", "message").f85356a.mo52126a());
            } else if (valueOf.intValue() == R.id.cuh && (list = mVar.f139927a) != null && (user = (User) C89070n.m154583g((List) list)) != null && (uid = user.getUid()) != null && (list2 = mVar.f139927a) != null && (user2 = (User) C89070n.m154583g((List) list2)) != null && (secUid = user2.getSecUid()) != null) {
                C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
            }
        }
    }

    /* renamed from: a */
    public final void mo100099a(BaseNotice baseNotice, boolean z, String str, String str2) {
        List<? extends User> list;
        int size;
        String string;
        List<String> urlList;
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.voteNotice != null) {
            this.f140779u = baseNotice;
            this.f140778t = z;
            C61639m mVar = baseNotice.voteNotice;
            this.f140777s = mVar;
            if (mVar != null && (list = mVar.f139927a) != null && (size = list.size()) > 0) {
                mo100154a(this.f140774f, list, 3, mVar.f139930d, this.f140779u, z, str, str2);
                if (size == 1) {
                    this.f140771c.setVisibility(0);
                    this.f140772d.setVisibility(8);
                    this.f140773e.setVisibility(8);
                    this.f140771c.setUserData(new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType())));
                    this.f140770b.setVisibility(8);
                    this.f140771c.mo61285a();
                } else {
                    this.f140770b.setVisibility(0);
                    this.f140771c.setVisibility(8);
                    this.f140772d.setVisibility(0);
                    this.f140773e.setVisibility(0);
                    C34577e.m70592a(this.f140772d, ((User) list.get(0)).getAvatarThumb());
                    C34577e.m70592a(this.f140773e, ((User) list.get(1)).getAvatarThumb());
                }
                if (size == 1) {
                    string = this.f140983i.getString(R.string.ha5, mVar.f139929c);
                } else {
                    string = this.f140983i.getString(R.string.ha3);
                }
                C62135q.m112363a(this.f140775q, new SpannableStringBuilder(string), baseNotice, 7, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 148.0f)));
                UrlModel urlModel = mVar.f139928b;
                if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
                    this.f140776r.setImageDrawable(C0643b.m2369a(this.f140983i, (int) R.color.f));
                } else {
                    C34577e.m70592a(this.f140776r, urlModel);
                }
            }
        }
    }
}
