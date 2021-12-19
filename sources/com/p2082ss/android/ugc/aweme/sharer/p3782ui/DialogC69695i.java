package com.p2082ss.android.ugc.aweme.sharer.p3782ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareActionBar;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3784b.C69662b;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.i */
public class DialogC69695i extends AbstractDialogC69658a {

    /* renamed from: a */
    private final AbstractC89244h f155598a = C89250i.m154773a((AbstractC89171a) new C69696a(this));

    /* renamed from: m */
    public final Context f155599m;

    /* renamed from: n */
    public C69684e f155600n;

    static {
        Covode.recordClassIndex(82071);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final DialogC81438i mo109835e() {
        return (DialogC81438i) this.f155598a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$a */
    static final class C69696a extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ DialogC69695i f155601a;

        static {
            Covode.recordClassIndex(82072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69696a(DialogC69695i iVar) {
            super(0);
            this.f155601a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f155601a.f155599m);
        }
    }

    /* renamed from: f */
    public final void mo109836f() {
        try {
            mo109835e().dismiss();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void dismiss() {
        super.dismiss();
        AbstractC69690f fVar = this.f155600n.f155560l;
        if (fVar != null) {
            fVar.mo60845a(this.f155600n.f155557i, this.f155599m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$c */
    public static final class C69699c implements AbstractC69675c {

        /* renamed from: a */
        final /* synthetic */ DialogC69695i f155605a;

        static {
            Covode.recordClassIndex(82075);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69699c(DialogC69695i iVar) {
            this.f155605a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69675c
        /* renamed from: a */
        public final void mo109614a(AbstractC69693h hVar) {
            C89219l.m154721d(hVar, "");
            if (!this.f155605a.f155600n.f155557i.mo109574a(hVar, this.f155605a.f155599m)) {
                hVar.mo61915a(this.f155605a.f155599m, this.f155605a.f155600n.f155557i);
            }
            AbstractC69690f fVar = this.f155605a.f155600n.f155560l;
            if (fVar != null) {
                fVar.mo60846a(hVar, this.f155605a.f155600n.f155557i, this.f155605a.f155599m);
            }
            if (hVar.mo61923f()) {
                this.f155605a.dismiss();
            } else if (hVar.mo61922e()) {
                this.f155605a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$d */
    static final class View$OnClickListenerC69700d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC69695i f155606a;

        static {
            Covode.recordClassIndex(82076);
        }

        View$OnClickListenerC69700d(DialogC69695i iVar) {
            this.f155606a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC69690f fVar = this.f155606a.f155600n.f155560l;
            if (fVar != null) {
                fVar.mo60847b(this.f155606a.f155600n.f155557i, this.f155606a.f155599m);
            }
            this.f155606a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$e */
    static final class C69701e extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ DialogC69695i f155607a;

        static {
            Covode.recordClassIndex(82077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69701e(DialogC69695i iVar) {
            super(1);
            this.f155607a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return Boolean.valueOf(!bVar2.mo109557b(this.f155607a.f155599m));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$b */
    static final class DialogInterface$OnShowListenerC69697b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f155602a;

        /* renamed from: b */
        final /* synthetic */ DialogC69695i f155603b;

        static {
            Covode.recordClassIndex(82073);
        }

        DialogInterface$OnShowListenerC69697b(AbstractC89171a aVar, DialogC69695i iVar) {
            this.f155602a = aVar;
            this.f155603b = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (((Boolean) this.f155602a.invoke()).booleanValue()) {
                ((ShareActionBar) this.f155603b.findViewById(R.id.dya)).postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i.DialogInterface$OnShowListenerC69697b.RunnableC696981 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnShowListenerC69697b f155604a;

                    static {
                        Covode.recordClassIndex(82074);
                    }

                    {
                        this.f155604a = r1;
                    }

                    public final void run() {
                        ShareActionBar shareActionBar = (ShareActionBar) this.f155604a.f155603b.findViewById(R.id.dya);
                        if (!shareActionBar.f155512a.isEmpty()) {
                            shareActionBar.f155513b.mo4435d(shareActionBar.f155512a.size() - 1);
                        }
                    }
                }, 300);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$f */
    public static final class C69702f extends AbstractC69679e {

        /* renamed from: a */
        final /* synthetic */ DialogC69695i f155608a;

        static {
            Covode.recordClassIndex(82078);
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$f$a */
        static final class C69703a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69702f f155609a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f155610b;

            static {
                Covode.recordClassIndex(82079);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69703a(C69702f fVar, AbstractC69581b bVar) {
                super(1);
                this.f155609a = fVar;
                this.f155610b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                AbstractC69690f fVar = this.f155609a.f155608a.f155600n.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f155610b, booleanValue, this.f155609a.f155608a.f155600n.f155557i, this.f155609a.f155608a.f155599m);
                }
                if (C69659a.m123052a()) {
                    this.f155609a.f155608a.mo109836f();
                }
                if (!this.f155610b.mo109555c()) {
                    this.f155609a.f155608a.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.i$f$b */
        static final class C69704b extends AbstractC89220m implements AbstractC89172b<AbstractC69645h, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69702f f155611a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f155612b;

            static {
                Covode.recordClassIndex(82080);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69704b(C69702f fVar, AbstractC69581b bVar) {
                super(1);
                this.f155611a = fVar;
                this.f155612b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC69645h hVar) {
                AbstractC69645h hVar2 = hVar;
                C89219l.m154721d(hVar2, "");
                boolean a = this.f155612b.mo61913a(hVar2, this.f155611a.f155608a.f155599m);
                AbstractC69690f fVar = this.f155611a.f155608a.f155600n.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f155612b, a, this.f155611a.f155608a.f155600n.f155557i, this.f155611a.f155608a.f155599m);
                }
                if (C69659a.m123052a()) {
                    this.f155611a.f155608a.mo109836f();
                }
                if (!this.f155612b.mo109555c()) {
                    this.f155611a.f155608a.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e
        /* renamed from: a */
        public final void mo60849a(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            if (!bVar.mo109555c()) {
                this.f155608a.dismiss();
            }
            if (C69659a.m123052a()) {
                try {
                    this.f155608a.mo109835e().show();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            if (!this.f155608a.f155600n.f155557i.mo109573a(bVar, this.f155608a.f155599m, new C69703a(this, bVar))) {
                this.f155608a.f155600n.f155557i.mo109572a(bVar, new C69704b(this, bVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69702f(DialogC69695i iVar, Context context, SharePackage sharePackage) {
            super(context, sharePackage);
            this.f155608a = iVar;
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        boolean z;
        List<AbstractC69581b> list;
        List<AbstractC69581b> list2;
        MethodCollector.m26663i(3212);
        super.onCreate(bundle);
        setContentView(R.layout.aea);
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.dyj);
        C89219l.m154716b(measureLinearLayout, "");
        C69662b.C69663a.m123055a(this, measureLinearLayout);
        if (this.f155600n.f155559k != null) {
            ((FrameLayout) findViewById(R.id.dyn)).addView(this.f155600n.f155559k);
        }
        if (this.f155600n.f155552d) {
            C89070n.m154537a((List) this.f155600n.f155549a, (AbstractC89172b) new C69701e(this));
        }
        int i = 0;
        if (this.f155600n.f155551c || (list2 = this.f155600n.f155549a) == null || list2.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.dyg);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
        } else {
            ((ShareChannelBar) findViewById(R.id.dyk)).mo109818a(this.f155600n.f155549a);
            ((ShareChannelBar) findViewById(R.id.dyk)).mo109817a(new C69702f(this, this.f155599m, this.f155600n.f155557i));
        }
        List<AbstractC69693h> list3 = this.f155600n.f155550b;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f155600n.f155566r) {
            ShareActionBar shareActionBar = (ShareActionBar) findViewById(R.id.dya);
            C89219l.m154716b(shareActionBar, "");
            shareActionBar.setVisibility(8);
            View findViewById = findViewById(R.id.dxz);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        } else {
            if ((this.f155600n.f155551c || (list = this.f155600n.f155549a) == null || list.isEmpty()) && !this.f155600n.f155563o) {
                TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.dxa);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            }
            ((ShareActionBar) findViewById(R.id.dya)).mo109814a(this.f155600n.f155550b);
            ((ShareActionBar) findViewById(R.id.dya)).mo109813a(new C69699c(this));
            AbstractC89171a<Boolean> aVar = this.f155600n.f155562n;
            if (aVar != null) {
                setOnShowListener(new DialogInterface$OnShowListenerC69697b(aVar, this));
            }
        }
        if (this.f155600n.f155563o) {
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.dxa);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.dym);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.dxa);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(this.f155599m.getResources().getText(R.string.d4h));
            ((TuxTextView) findViewById(R.id.dxa)).setTextColor(C0643b.m2378c(this.f155599m, this.f155600n.f155554f));
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.dxa);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setAlpha(this.f155600n.f155555g);
            TuxTextView tuxTextView6 = (TuxTextView) findViewById(R.id.dym);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setText(this.f155599m.getResources().getText(this.f155600n.f155553e));
            ((TuxTextView) findViewById(R.id.dym)).setTextColor(C0643b.m2378c(this.f155599m, this.f155600n.f155554f));
            TuxTextView tuxTextView7 = (TuxTextView) findViewById(R.id.dym);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setAlpha(this.f155600n.f155555g);
            TuxTextView tuxTextView8 = (TuxTextView) findViewById(R.id.dyd);
            C89219l.m154716b(tuxTextView8, "");
            tuxTextView8.setText(this.f155599m.getResources().getText(this.f155600n.f155556h));
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.dye);
        C89219l.m154716b(frameLayout, "");
        if (!this.f155600n.f155565q) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        ((TuxTextView) findViewById(R.id.dyd)).setOnClickListener(new View$OnClickListenerC69700d(this));
        MethodCollector.m26664o(3212);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC69695i(Context context, int i, C69684e eVar) {
        super(context, i);
        C89219l.m154721d(context, "");
        C89219l.m154721d(eVar, "");
        this.f155599m = context;
        this.f155600n = eVar;
    }
}
