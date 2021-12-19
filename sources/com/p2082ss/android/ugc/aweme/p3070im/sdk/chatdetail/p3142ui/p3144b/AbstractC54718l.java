package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54606a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55120m;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l */
public abstract class AbstractC54718l extends AbstractC1973t<C54719a> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public C54606a f125415h;

    /* renamed from: i */
    public AbstractC89172b<? super Boolean, C89391z> f125416i;

    /* renamed from: j */
    public AbstractC89172b<? super IMUser, C89391z> f125417j;

    /* renamed from: k */
    public AbstractC89171a<C89391z> f125418k;

    /* renamed from: l */
    private C54719a f125419l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l$a */
    public static final class C54719a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125420a = {new C89232y(C54719a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", 0), new C89232y(C54719a.class, "tvName", "getTvName()Landroid/widget/TextView;", 0), new C89232y(C54719a.class, "tvInviter", "getTvInviter()Landroid/widget/TextView;", 0), new C89232y(C54719a.class, "btAccept", "getBtAccept()Lcom/bytedance/tux/button/TuxButton;", 0), new C89232y(C54719a.class, "btDelete", "getBtDelete()Lcom/bytedance/tux/button/TuxButton;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125421b = m100198a((int) R.id.we);

        /* renamed from: c */
        private final AbstractC89248d f125422c = m100198a((int) R.id.nz);

        /* renamed from: d */
        private final AbstractC89248d f125423d = m100198a((int) R.id.ezz);

        /* renamed from: e */
        private final AbstractC89248d f125424e = m100198a((int) R.id.exn);

        /* renamed from: f */
        private final AbstractC89248d f125425f = m100198a((int) R.id.w_);

        static {
            Covode.recordClassIndex(64434);
        }

        /* renamed from: b */
        public final AvatarImageView mo91751b() {
            return (AvatarImageView) this.f125422c.mo23374a(this, f125420a[0]);
        }

        /* renamed from: c */
        public final TextView mo91752c() {
            return (TextView) this.f125423d.mo23374a(this, f125420a[1]);
        }

        /* renamed from: d */
        public final TextView mo91753d() {
            return (TextView) this.f125424e.mo23374a(this, f125420a[2]);
        }

        /* renamed from: e */
        public final TuxButton mo91754e() {
            return (TuxButton) this.f125425f.mo23374a(this, f125420a[3]);
        }
    }

    static {
        Covode.recordClassIndex(64433);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a54;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new RunnableC90250g(AbstractC54718l.class, "onUserUpdate", C55120m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public void mo5794b(C54719a aVar) {
        C89219l.m154721d(aVar, "");
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l$b */
    public static final class View$OnClickListenerC54720b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54718l f125426a;

        /* renamed from: b */
        final /* synthetic */ C54719a f125427b;

        static {
            Covode.recordClassIndex(64435);
        }

        View$OnClickListenerC54720b(AbstractC54718l lVar, C54719a aVar) {
            this.f125426a = lVar;
            this.f125427b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f125426a.f125416i;
            if (bVar != null) {
                bVar.invoke(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l$c */
    public static final class View$OnClickListenerC54721c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC54718l f125428a;

        /* renamed from: b */
        final /* synthetic */ C54719a f125429b;

        static {
            Covode.recordClassIndex(64436);
        }

        View$OnClickListenerC54721c(AbstractC54718l lVar, C54719a aVar) {
            this.f125428a = lVar;
            this.f125429b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f125428a.f125416i;
            if (bVar != null) {
                bVar.invoke(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l$d */
    public static final class View$OnClickListenerC54722d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54606a f125430a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54718l f125431b;

        /* renamed from: c */
        final /* synthetic */ C54719a f125432c;

        static {
            Covode.recordClassIndex(64437);
        }

        View$OnClickListenerC54722d(C54606a aVar, AbstractC54718l lVar, C54719a aVar2) {
            this.f125430a = aVar;
            this.f125431b = lVar;
            this.f125432c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super IMUser, C89391z> bVar = this.f125431b.f125417j;
            if (bVar != null) {
                bVar.invoke(this.f125430a.f125158a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l$e */
    public static final class View$OnClickListenerC54723e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54606a f125433a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54718l f125434b;

        /* renamed from: c */
        final /* synthetic */ C54719a f125435c;

        static {
            Covode.recordClassIndex(64438);
        }

        View$OnClickListenerC54723e(C54606a aVar, AbstractC54718l lVar, C54719a aVar2) {
            this.f125433a = aVar;
            this.f125434b = lVar;
            this.f125435c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super IMUser, C89391z> bVar = this.f125434b.f125417j;
            if (bVar != null) {
                bVar.invoke(this.f125433a.f125158a);
            }
        }
    }

    /* renamed from: a */
    private final SpannableStringBuilder m100280a(IMUser iMUser) {
        C54719a aVar;
        ApplyStatusCode applyStatusCode = null;
        if (iMUser == null || (aVar = this.f125419l) == null) {
            return null;
        }
        Context context = aVar.mo91753d().getContext();
        C54606a aVar2 = this.f125415h;
        if (aVar2 != null) {
            applyStatusCode = aVar2.f125163f;
        }
        String str = "";
        if (applyStatusCode != null && C54724m.f125437b[applyStatusCode.ordinal()] == 1) {
            C17191a.C17192a aVar3 = new C17191a.C17192a();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0643b.m2378c(context, R.color.bd));
            String string = context.getString(R.string.c8_);
            C89219l.m154716b(string, str);
            aVar3.mo27178a(string, foregroundColorSpan, 33);
            aVar3.mo27177a("·");
            Object[] objArr = new Object[1];
            String displayName = iMUser.getDisplayName();
            if (displayName == null) {
                displayName = str;
            }
            objArr[0] = displayName;
            String string2 = context.getString(R.string.c7a, objArr);
            C89219l.m154716b(string2, str);
            aVar3.mo27177a(string2);
            return aVar3.f40973a;
        }
        Object[] objArr2 = new Object[1];
        String displayName2 = iMUser.getDisplayName();
        if (displayName2 != null) {
            str = displayName2;
        }
        objArr2[0] = str;
        return new SpannableStringBuilder(context.getString(R.string.c7a, objArr2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo5788a(C54719a aVar) {
        C89219l.m154721d(aVar, "");
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f125419l = aVar;
        C54606a aVar2 = this.f125415h;
        if (aVar2 != null) {
            m100281a(aVar, aVar2.f125158a);
            ApplyStatusCode applyStatusCode = aVar2.f125163f;
            if (applyStatusCode != null && C54724m.f125436a[applyStatusCode.ordinal()] == 1) {
                aVar.mo91754e().setVisibility(8);
            } else {
                aVar.mo91754e().setVisibility(0);
            }
            m100283b(aVar, aVar2.f125167j);
            aVar.mo91754e().setOnClickListener(new View$OnClickListenerC54720b(this, aVar));
            ((TuxButton) aVar.f125421b.mo23374a(aVar, C54719a.f125420a[4])).setOnClickListener(new View$OnClickListenerC54721c(this, aVar));
            aVar.mo91751b().setOnClickListener(new View$OnClickListenerC54722d(aVar2, this, aVar));
            aVar.mo91752c().setOnClickListener(new View$OnClickListenerC54723e(aVar2, this, aVar));
        }
        AbstractC89171a<C89391z> aVar3 = this.f125418k;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }

    @AbstractC90264r
    public final void onUserUpdate(C55120m mVar) {
        String str;
        IMUser a;
        C54719a aVar;
        C54719a aVar2;
        C89219l.m154721d(mVar, "");
        String str2 = mVar.f126144a;
        C54606a aVar3 = this.f125415h;
        String str3 = null;
        if (aVar3 != null) {
            str = aVar3.f125159b;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str2, (Object) str)) {
            IMUser a2 = C55085g.m100751a(mVar.f126144a, mVar.f126145b);
            if (a2 != null && (aVar2 = this.f125419l) != null) {
                m100281a(aVar2, a2);
                return;
            }
            return;
        }
        String str4 = mVar.f126144a;
        C54606a aVar4 = this.f125415h;
        if (aVar4 != null) {
            str3 = aVar4.f125165h;
        }
        if (C89219l.m154714a((Object) str4, (Object) str3) && (a = C55085g.m100751a(mVar.f126144a, mVar.f126145b)) != null && (aVar = this.f125419l) != null) {
            m100283b(aVar, a);
        }
    }

    /* renamed from: a */
    private static void m100281a(C54719a aVar, IMUser iMUser) {
        String str;
        TextView c = aVar.mo91752c();
        UrlModel urlModel = null;
        if (iMUser != null) {
            str = iMUser.getDisplayName();
        } else {
            str = null;
        }
        c.setText(str);
        AvatarImageView b = aVar.mo91751b();
        if (iMUser != null) {
            urlModel = iMUser.getDisplayAvatar();
        }
        C34577e.m70592a(b, urlModel);
    }

    /* renamed from: b */
    private final void m100283b(C54719a aVar, IMUser iMUser) {
        if (iMUser != null) {
            aVar.mo91753d().setText(m100280a(iMUser));
            aVar.mo91753d().setVisibility(0);
            return;
        }
        aVar.mo91753d().setVisibility(8);
    }
}
