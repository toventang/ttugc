package com.p2082ss.android.ugc.gamora.recorder.p4300g;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.p2730de.C40962a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.g.d */
public final class C83699d implements AbstractC83680b {

    /* renamed from: a */
    private final ActivityC0945e f186838a;

    /* renamed from: b */
    private final ShortVideoContext f186839b;

    /* renamed from: c */
    private final AbstractC14177d f186840c;

    /* renamed from: d */
    private final AbstractC14193m f186841d;

    /* renamed from: e */
    private final AbstractC70668d f186842e;

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$k */
    static final class DialogInterface$OnDismissListenerC83710k implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC83710k f186853a = new DialogInterface$OnDismissListenerC83710k();

        static {
            Covode.recordClassIndex(97600);
        }

        DialogInterface$OnDismissListenerC83710k() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(97589);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: c */
    public final void mo128671c() {
        this.f186841d.mo22893c(true);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: a */
    public final void mo128666a() {
        C33449c.m68557a();
        this.f186841d.mo22886a(false);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: b */
    public final void mo128669b() {
        C33449c.m68557a();
        this.f186841d.mo22886a(true);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$j */
    public static final class DialogInterface$OnCancelListenerC83709j implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186852a;

        static {
            Covode.recordClassIndex(97599);
        }

        DialogInterface$OnCancelListenerC83709j(AbstractC89171a aVar) {
            this.f186852a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f186852a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$h */
    static final class C83707h extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186850a;

        static {
            Covode.recordClassIndex(97597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83707h(AbstractC89171a aVar) {
            super(1);
            this.f186850a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f186850a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$i */
    static final class C83708i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186851a;

        static {
            Covode.recordClassIndex(97598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83708i(AbstractC89171a aVar) {
            super(1);
            this.f186851a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f186851a.invoke();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: a */
    public final void mo128667a(AbstractC89171a<C89391z> aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        Dialog b = new C17197a.C17200a(this.f186838a).mo27194b(R.string.f5d).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.c45, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83706g(aVar), false).mo27193a().mo27184b();
        ActivityC0945e eVar = this.f186838a;
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase(Locale.getDefault()))) {
            z = eVar.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (!z && !C40962a.m82469a() && !C40962a.m82470a(eVar) && C40962a.m82468a("ro.miui.notch", eVar) != 1 && !C40962a.m82471b(eVar) && !C40962a.m82472c(eVar)) {
            C71827ew.m126824a(b);
        }
        b.show();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$a */
    static final class DialogInterface$OnClickListenerC83700a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186843a;

        static {
            Covode.recordClassIndex(97590);
        }

        DialogInterface$OnClickListenerC83700a(AbstractC89171a aVar) {
            this.f186843a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186843a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$b */
    static final class DialogInterface$OnClickListenerC83701b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186844a;

        static {
            Covode.recordClassIndex(97591);
        }

        DialogInterface$OnClickListenerC83701b(AbstractC89171a aVar) {
            this.f186844a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186844a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$c */
    static final class DialogInterface$OnClickListenerC83702c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186845a;

        static {
            Covode.recordClassIndex(97592);
        }

        DialogInterface$OnClickListenerC83702c(AbstractC89171a aVar) {
            this.f186845a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186845a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$d */
    static final class DialogInterface$OnClickListenerC83703d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186846a;

        static {
            Covode.recordClassIndex(97593);
        }

        DialogInterface$OnClickListenerC83703d(AbstractC89171a aVar) {
            this.f186846a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186846a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$e */
    static final class DialogInterface$OnClickListenerC83704e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186847a;

        static {
            Covode.recordClassIndex(97594);
        }

        DialogInterface$OnClickListenerC83704e(AbstractC89171a aVar) {
            this.f186847a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186847a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$f */
    static final class DialogInterface$OnClickListenerC83705f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186848a;

        static {
            Covode.recordClassIndex(97595);
        }

        DialogInterface$OnClickListenerC83705f(AbstractC89171a aVar) {
            this.f186848a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186848a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.d$g */
    static final class DialogInterface$OnClickListenerC83706g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f186849a;

        static {
            Covode.recordClassIndex(97596);
        }

        DialogInterface$OnClickListenerC83706g(AbstractC89171a aVar) {
            this.f186849a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186849a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: b */
    public final void mo128670b(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        try {
            new DialogInterfaceC0216c.C0217a(this.f186838a, R.style.wr).mo454b(R.string.b0c).mo455b(R.string.bq7, new DialogInterface$OnClickListenerC83700a(aVar)).mo446a(R.string.b0_, new DialogInterface$OnClickListenerC83701b(aVar3)).mo459c(R.string.b0b, new DialogInterface$OnClickListenerC83702c(aVar2)).mo458b();
        } catch (Exception e) {
            C40970e.m82485a(e.toString());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: c */
    public final void mo128672c(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        try {
            new DialogInterfaceC0216c.C0217a(this.f186838a, R.style.wr).mo454b(R.string.b0d).mo455b(R.string.bq7, new DialogInterface$OnClickListenerC83703d(aVar)).mo446a(R.string.b0a, new DialogInterface$OnClickListenerC83704e(aVar3)).mo459c(R.string.b0b, new DialogInterface$OnClickListenerC83705f(aVar2)).mo458b();
        } catch (Exception e) {
            C40970e.m82485a(e.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83680b
    /* renamed from: a */
    public final void mo128668a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C23208a.C23211b a = new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.y6).mo37789b(1).mo37787a(new C83707h(aVar3)), new C23208a.C23214e().mo37785a(R.string.yc).mo37787a(new C83708i(aVar2))).mo37792a(R.string.a8y).mo37793a(new DialogInterface$OnCancelListenerC83709j(aVar));
        DialogInterface$OnDismissListenerC83710k kVar = DialogInterface$OnDismissListenerC83710k.f186853a;
        C89219l.m154719c(kVar, "");
        a.f55001a.f54971b = kVar;
        a.mo37800b().show(this.f186838a.getSupportFragmentManager(), "record action sheet");
    }

    public C83699d(ActivityC0945e eVar, ShortVideoContext shortVideoContext, AbstractC14177d dVar, AbstractC14193m mVar, AbstractC70668d dVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(mVar, "");
        this.f186838a = eVar;
        this.f186839b = shortVideoContext;
        this.f186840c = dVar;
        this.f186841d = mVar;
        this.f186842e = dVar2;
    }
}
