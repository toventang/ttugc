package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1954q;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.proto.GroupRole;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.d */
public abstract class AbstractC54698d extends AbstractC1973t<C54699a> {

    /* renamed from: h */
    public C54006a f125348h;

    /* renamed from: i */
    public AbstractC89171a<C89391z> f125349i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.d$a */
    public static final class C54699a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125350a = {new C89232y(C54699a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new C89232y(C54699a.class, "nickname", "getNickname()Landroid/widget/TextView;", 0), new C89232y(C54699a.class, "relationShipTag", "getRelationShipTag()Landroid/widget/TextView;", 0), new C89232y(C54699a.class, "adminTag", "getAdminTag()Landroid/widget/TextView;", 0), new C89232y(C54699a.class, "userId", "getUserId()Landroid/widget/TextView;", 0), new C89232y(C54699a.class, "actionButton", "getActionButton()Landroid/widget/ImageView;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125351b = m100198a((int) R.id.bje);

        /* renamed from: c */
        final AbstractC89248d f125352c = m100198a((int) R.id.bjh);

        /* renamed from: d */
        final AbstractC89248d f125353d = m100198a((int) R.id.bji);

        /* renamed from: e */
        final AbstractC89248d f125354e = m100198a((int) R.id.bjf);

        /* renamed from: f */
        private final AbstractC89248d f125355f = m100198a((int) R.id.bjd);

        /* renamed from: h */
        private final AbstractC89248d f125356h = m100198a((int) R.id.bjc);

        static {
            Covode.recordClassIndex(64414);
        }

        /* renamed from: b */
        public final TextView mo91721b() {
            return (TextView) this.f125355f.mo23374a(this, f125350a[3]);
        }

        /* renamed from: c */
        public final ImageView mo91722c() {
            return (ImageView) this.f125356h.mo23374a(this, f125350a[5]);
        }
    }

    static {
        Covode.recordClassIndex(64413);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a80;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.d$b */
    public static final class View$OnClickListenerC54700b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54698d f125357a;

        /* renamed from: b */
        final /* synthetic */ C54699a f125358b;

        static {
            Covode.recordClassIndex(64415);
        }

        View$OnClickListenerC54700b(AbstractC54698d dVar, C54699a aVar) {
            this.f125357a = dVar;
            this.f125358b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f125357a.f125349i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.d$c */
    public static final class View$OnClickListenerC54701c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMUser f125359a;

        static {
            Covode.recordClassIndex(64416);
        }

        View$OnClickListenerC54701c(IMUser iMUser) {
            this.f125359a = iMUser;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C53615d.m98863a(this.f125359a.getUid(), "member_list", null);
            C54881c.m100492a(this.f125359a.getUid(), "member_list");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54699a aVar) {
        C19537ah member;
        IMUser user;
        int i;
        C89219l.m154721d(aVar, "");
        super.mo5788a((AbstractC1954q) aVar);
        if (this.f125348h != null) {
            C55233v.m101004a(aVar.mo91720a());
            C54006a aVar2 = this.f125348h;
            if (!(aVar2 == null || (user = aVar2.getUser()) == null)) {
                C34577e.m70592a((RemoteImageView) aVar.f125351b.mo23374a(aVar, C54699a.f125350a[0]), user.getAvatarThumb());
                ((TextView) aVar.f125352c.mo23374a(aVar, C54699a.f125350a[1])).setText(user.getNickName());
                ((TextView) aVar.f125354e.mo23374a(aVar, C54699a.f125350a[4])).setText(user.getUniqueId());
                TextView textView = (TextView) aVar.f125353d.mo23374a(aVar, C54699a.f125350a[2]);
                if (user.getFollowStatus() != 2 || !(!C89219l.m154714a((Object) user.getSecUid(), (Object) C55197c.m100921c()))) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
                if (C55197c.m100918a(user)) {
                    aVar.mo91722c().setVisibility(8);
                } else {
                    aVar.mo91722c().setVisibility(0);
                    aVar.mo91722c().setOnClickListener(new View$OnClickListenerC54700b(this, aVar));
                }
                aVar.mo91720a().setOnClickListener(new View$OnClickListenerC54701c(user));
            }
            C54006a aVar3 = this.f125348h;
            if (aVar3 != null && (member = aVar3.getMember()) != null) {
                if (member.getRole() == GroupRole.OWNER.getValue()) {
                    aVar.mo91721b().setVisibility(0);
                } else {
                    aVar.mo91721b().setVisibility(8);
                }
            }
        }
    }
}
