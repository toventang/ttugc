package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b.C39332c;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a */
public final class C39320a implements AbstractC39233d {

    /* renamed from: d */
    public static final C39321a f92817d = new C39321a((byte) 0);

    /* renamed from: a */
    public final int f92818a;

    /* renamed from: b */
    DialogInterface f92819b;

    /* renamed from: c */
    public final Activity f92820c;

    /* renamed from: e */
    private final AppealDialogAgsStyleViewModel f92821e;

    /* renamed from: f */
    private boolean f92822f;

    /* renamed from: g */
    private boolean f92823g;

    static {
        Covode.recordClassIndex(47000);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: b */
    public final void mo68118b() {
        this.f92822f = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$a */
    public static final class C39321a {
        static {
            Covode.recordClassIndex(47001);
        }

        private C39321a() {
        }

        public /* synthetic */ C39321a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: a */
    public final boolean mo68117a() {
        return this.f92822f;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: c */
    public final boolean mo68119c() {
        return this.f92823g;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: e */
    public final boolean mo68121e() {
        DialogInterface dialogInterface = this.f92819b;
        if (!(dialogInterface instanceof C23013a)) {
            return false;
        }
        Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
        return ((C23013a) dialogInterface).f54483c.isShowing();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: d */
    public final void mo68120d() {
        AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel;
        this.f92822f = false;
        if (!this.f92820c.isFinishing() && !mo68121e() && (this.f92820c instanceof ActivityC0945e) && (appealDialogAgsStyleViewModel = this.f92821e) != null) {
            appealDialogAgsStyleViewModel.f92888c.observe((AbstractC1204m) this.f92820c, new C39325d(this));
            AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel2 = this.f92821e;
            appealDialogAgsStyleViewModel2.f92888c.postValue((T) appealDialogAgsStyleViewModel2.mo68790a(appealDialogAgsStyleViewModel2.f92889d));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$c */
    static final class C39323c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39320a f92826a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39336b.C39337a f92827b;

        static {
            Covode.recordClassIndex(47003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39323c(C39320a aVar, AbstractC39336b.C39337a aVar2) {
            super(1);
            this.f92826a = aVar;
            this.f92827b = aVar2;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$c$a */
        static final class C39324a extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39323c f92828a;

            /* renamed from: b */
            final /* synthetic */ C23025b f92829b;

            static {
                Covode.recordClassIndex(47004);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39324a(C39323c cVar, C23025b bVar) {
                super(1);
                this.f92828a = cVar;
                this.f92829b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                C89219l.m154721d(aVar, "");
                DialogInterface dialogInterface = this.f92828a.f92826a.f92819b;
                if (dialogInterface != null) {
                    this.f92828a.f92827b.f92855d.f92851b.invoke(dialogInterface, 0);
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String str = this.f92827b.f92855d.f92850a;
            if (str != null) {
                bVar2.mo37417a(str, new C39324a(this, bVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$b */
    public static final class C39322b implements C1175ad.AbstractC1177b {

        /* renamed from: a */
        final /* synthetic */ C39320a f92824a;

        /* renamed from: b */
        final /* synthetic */ AppealStatusResponse f92825b;

        static {
            Covode.recordClassIndex(47002);
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            C89219l.m154721d(cls, "");
            return new AppealDialogAgsStyleViewModel(this.f92824a.f92820c, this.f92825b);
        }

        C39322b(C39320a aVar, AppealStatusResponse appealStatusResponse) {
            this.f92824a = aVar;
            this.f92825b = appealStatusResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$d */
    static final class C39325d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39320a f92830a;

        static {
            Covode.recordClassIndex(47005);
        }

        C39325d(C39320a aVar) {
            this.f92830a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39336b.C39337a aVar = (AbstractC39336b.C39337a) obj;
            C39320a aVar2 = this.f92830a;
            C89219l.m154716b(aVar, "");
            C23023b c = new C23023b(aVar2.f92820c).mo37411b(aVar.f92852a).mo37413d(aVar.f92853b);
            C39332c cVar = new C39332c(aVar2.f92820c, (byte) 0);
            cVar.mo68756a(aVar.f92854c.f92866a, aVar.f92854c.f92867b, aVar.f92854c.f92868c);
            if (aVar.f92856e != null) {
                String str = aVar.f92856e.f92864a;
                AbstractC89172b<View, C89391z> bVar = aVar.f92856e.f92865b;
                C89219l.m154721d(str, "");
                C89219l.m154721d(bVar, "");
                cVar.f92844g.setVisibility(0);
                cVar.f92844g.setText(str);
                cVar.f92844g.setOnClickListener(new C39332c.View$OnClickListenerC39333a(bVar));
            }
            C23013a a = C23028c.m43435a(C23019c.m43408a(c, cVar), new C39323c(aVar2, aVar)).mo37405a();
            a.mo37395a();
            aVar2.f92819b = a;
            AbstractDialogInterfaceC23060a aVar3 = (AbstractDialogInterfaceC23060a) this.f92830a.f92819b;
            if (aVar3 != null) {
                aVar3.mo37396b().show();
            }
            C39162r.m79460a("tns_ags_popup_perm_ban", new C33744d().mo59980a("status", this.f92830a.f92818a).f79943a);
        }
    }

    public C39320a(Activity activity, AppealStatusResponse appealStatusResponse) {
        AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(appealStatusResponse, "");
        this.f92820c = activity;
        this.f92818a = appealStatusResponse.getStatus();
        if (activity instanceof ActivityC0945e) {
            appealDialogAgsStyleViewModel = (AppealDialogAgsStyleViewModel) new C1175ad((AbstractC1183ag) activity, new C39322b(this, appealStatusResponse)).mo3983a(AppealDialogAgsStyleViewModel.class);
        } else {
            appealDialogAgsStyleViewModel = null;
        }
        this.f92821e = appealDialogAgsStyleViewModel;
    }
}
