package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxRadio;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.a */
public abstract class AbstractC54690a extends AbstractC1973t<C54691a> {

    /* renamed from: h */
    public IMUser f125327h;

    /* renamed from: i */
    public boolean f125328i;

    /* renamed from: j */
    public AbstractC89172b<? super IMUser, C89391z> f125329j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.a$a */
    public static final class C54691a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125330a = {new C89232y(C54691a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", 0), new C89232y(C54691a.class, "nickName", "getNickName()Landroid/widget/TextView;", 0), new C89232y(C54691a.class, "friendTag", "getFriendTag()Landroid/widget/TextView;", 0), new C89232y(C54691a.class, "detail", "getDetail()Landroid/widget/TextView;", 0), new C89232y(C54691a.class, "checkRadio", "getCheckRadio()Lcom/bytedance/tux/input/TuxRadio;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125331b = m100198a((int) R.id.a53);

        /* renamed from: c */
        final AbstractC89248d f125332c = m100198a((int) R.id.a56);

        /* renamed from: d */
        final AbstractC89248d f125333d = m100198a((int) R.id.a55);

        /* renamed from: e */
        final AbstractC89248d f125334e = m100198a((int) R.id.a54);

        /* renamed from: f */
        final AbstractC89248d f125335f = m100198a((int) R.id.a57);

        static {
            Covode.recordClassIndex(64406);
        }
    }

    static {
        Covode.recordClassIndex(64405);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a4y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.a$b */
    public static final class View$OnClickListenerC54692b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMUser f125336a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54690a f125337b;

        /* renamed from: c */
        final /* synthetic */ C54691a f125338c;

        static {
            Covode.recordClassIndex(64407);
        }

        View$OnClickListenerC54692b(IMUser iMUser, AbstractC54690a aVar, C54691a aVar2) {
            this.f125336a = iMUser;
            this.f125337b = aVar;
            this.f125338c = aVar2;
        }

        public final void onClick(View view) {
            AbstractC89172b<? super IMUser, C89391z> bVar;
            ClickAgent.onClick(view);
            if (!this.f125337b.f125328i && (bVar = this.f125337b.f125329j) != null) {
                bVar.invoke(this.f125336a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54691a aVar) {
        C89219l.m154721d(aVar, "");
        IMUser iMUser = this.f125327h;
        if (iMUser != null) {
            int i = 0;
            C34577e.m70592a((AvatarImageView) aVar.f125331b.mo23374a(aVar, C54691a.f125330a[0]), iMUser.getAvatarThumb());
            ((TextView) aVar.f125332c.mo23374a(aVar, C54691a.f125330a[1])).setText(iMUser.getNickName());
            TextView textView = (TextView) aVar.f125333d.mo23374a(aVar, C54691a.f125330a[2]);
            if (iMUser.getFollowStatus() != 2) {
                i = 8;
            }
            textView.setVisibility(i);
            ((TextView) aVar.f125334e.mo23374a(aVar, C54691a.f125330a[3])).setText(iMUser.getUniqueId());
            ((TuxRadio) aVar.f125335f.mo23374a(aVar, C54691a.f125330a[4])).setChecked(this.f125328i);
            aVar.mo91720a().setOnClickListener(new View$OnClickListenerC54692b(iMUser, this, aVar));
        }
    }
}
