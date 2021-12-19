package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57656a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a */
public final class C57681a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C17197a f131644a;

    /* renamed from: b */
    public boolean f131645b;

    /* renamed from: c */
    public final Context f131646c;

    /* renamed from: d */
    public final C57663a f131647d;

    /* renamed from: e */
    private final Handler f131648e = new Handler();

    static {
        Covode.recordClassIndex(67650);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(83, new RunnableC90250g(C57681a.class, "onJsBroadCastEvent", C57656a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$b */
    public static final class C57683b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57681a f131650a;

        static {
            Covode.recordClassIndex(67652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57683b(C57681a aVar) {
            super(0);
            this.f131650a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C17197a aVar = this.f131650a.f131644a;
            if (aVar != null) {
                aVar.mo27186d();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$d */
    public static final class C57685d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57681a f131652a;

        static {
            Covode.recordClassIndex(67654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57685d(C57681a aVar) {
            super(0);
            this.f131652a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C17197a aVar = this.f131652a.f131644a;
            if (aVar != null) {
                aVar.mo27186d();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$k */
    public static final class RunnableC57692k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57681a f131659a;

        static {
            Covode.recordClassIndex(67661);
        }

        RunnableC57692k(C57681a aVar) {
            this.f131659a = aVar;
        }

        public final void run() {
            C17197a aVar = this.f131659a.f131644a;
            if (aVar == null || aVar.mo27183a()) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                    this.f131659a.f131645b = true;
                    return;
                }
                this.f131659a.mo95015b();
            }
        }
    }

    /* renamed from: b */
    public final void mo95015b() {
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        if (O.mo123892o()) {
            C81079v.m140776O().mo123908B();
            this.f131645b = true;
            return;
        }
        this.f131648e.postDelayed(new RunnableC57692k(this), 1000);
    }

    /* renamed from: a */
    public final void mo95013a() {
        C80298cg.m139204a(this);
        C17197a.C17200a aVar = new C17197a.C17200a(this.f131646c);
        aVar.f41070a = this.f131647d.getTitle();
        DmtTextView dmtTextView = new DmtTextView(this.f131646c);
        Context context = dmtTextView.getContext();
        C89219l.m154716b(context, "");
        dmtTextView.setText(C57646a.m104374a(context, this.f131647d.getBody(), this.f131647d.getPolicyLinkList(), new C57684c(this), new C57685d(this)));
        dmtTextView.setHighlightColor(C0643b.m2378c(dmtTextView.getContext(), R.color.c9));
        dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
        dmtTextView.setGravity(17);
        aVar.f41064J = dmtTextView;
        aVar.f41085p = new C57689h(this);
        aVar.f41067M = false;
        aVar.f41083n = new DialogInterface$OnDismissListenerC57690i(this);
        C17197a.C17200a a = aVar.mo27192a(this.f131647d.getActions().get(0).f131608a, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57691j(this), true);
        if (C89219l.m154714a((Object) this.f131647d.getFirstButtonHighlight(), (Object) true)) {
            a.f41060F = true;
            a.f41059E = true;
        }
        if (!C89219l.m154714a((Object) this.f131647d.isSubPopUp(), (Object) true)) {
            a.f41067M = false;
        }
        if (this.f131647d.getActions().size() > 1) {
            a.mo27196b(this.f131647d.getActions().get(1).f131608a, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57686e(this), true);
        }
        if (this.f131647d.getActions().size() > 2) {
            a.f41059E = true;
            a.mo27197c(this.f131647d.getActions().get(2).f131608a, new DialogInterface$OnClickListenerC57687f(this), true);
        }
        if (!TextUtils.isEmpty(this.f131647d.getIcon_url())) {
            SmartImageView smartImageView = new SmartImageView(this.f131646c);
            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C89070n.m154516a(this.f131647d.getIcon_url()));
            urlModel.setWidth(C34728n.m70946a(48.0d));
            urlModel.setHeight(C34728n.m70946a(48.0d));
            C20766v b = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34185b(C80397em.m139369a(201));
            b.f49106c = true;
            b.f49092E = smartImageView;
            b.mo34181a(new C57688g(smartImageView));
            a.mo27191a(smartImageView, 48, 48);
        }
        C17197a a2 = a.mo27193a();
        this.f131644a = a2;
        if (a2 != null) {
            a2.mo27185c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$g */
    public static final class C57688g extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f131655a;

        static {
            Covode.recordClassIndex(67657);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
        }

        C57688g(SmartImageView smartImageView) {
            this.f131655a = smartImageView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            this.f131655a.setImageResource(2131233001);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$h */
    public static final class C57689h implements Window$CallbackC17224p.AbstractC17225a {

        /* renamed from: a */
        final /* synthetic */ C57681a f131656a;

        static {
            Covode.recordClassIndex(67658);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57689h(C57681a aVar) {
            this.f131656a = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p.AbstractC17225a
        /* renamed from: a */
        public final void mo27249a(boolean z) {
            if (z) {
                this.f131656a.mo95015b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$a */
    public static final class C57682a extends AbstractC89220m implements AbstractC89172b<C57664b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57681a f131649a;

        static {
            Covode.recordClassIndex(67651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57682a(C57681a aVar) {
            super(1);
            this.f131649a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C57664b bVar) {
            C57664b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f131649a.mo95016b(bVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$c */
    public static final class C57684c extends AbstractC89220m implements AbstractC89172b<C57664b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57681a f131651a;

        static {
            Covode.recordClassIndex(67653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57684c(C57681a aVar) {
            super(1);
            this.f131651a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C57664b bVar) {
            C57664b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f131651a.mo95016b(bVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo95016b(C57664b bVar) {
        C57646a.m104377a(this.f131647d, bVar);
        C17197a aVar = this.f131644a;
        if (aVar != null) {
            aVar.mo27186d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$i */
    public static final class DialogInterface$OnDismissListenerC57690i implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C57681a f131657a;

        static {
            Covode.recordClassIndex(67659);
        }

        DialogInterface$OnDismissListenerC57690i(C57681a aVar) {
            this.f131657a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C57681a aVar = this.f131657a;
            C80298cg.m139205b(aVar);
            if (aVar.f131645b) {
                C81079v.m140776O().mo123950y();
                aVar.f131645b = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo95014a(C57664b bVar) {
        C89219l.m154721d(bVar, "");
        C57646a.m104378a(bVar, this.f131646c, new C57682a(this), new C57683b(this));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C57656a aVar) {
        C17197a aVar2;
        C89219l.m154721d(aVar, "");
        if (TextUtils.equals(aVar.f131590b.optString("eventName"), "cancel_post_success") && (aVar2 = this.f131644a) != null) {
            aVar2.mo27186d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$e */
    public static final class DialogInterface$OnClickListenerC57686e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57681a f131653a;

        static {
            Covode.recordClassIndex(67655);
        }

        DialogInterface$OnClickListenerC57686e(C57681a aVar) {
            this.f131653a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C57681a aVar = this.f131653a;
            aVar.mo95014a(aVar.f131647d.getActions().get(1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$f */
    public static final class DialogInterface$OnClickListenerC57687f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57681a f131654a;

        static {
            Covode.recordClassIndex(67656);
        }

        DialogInterface$OnClickListenerC57687f(C57681a aVar) {
            this.f131654a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C57681a aVar = this.f131654a;
            aVar.mo95014a(aVar.f131647d.getActions().get(2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$j */
    public static final class DialogInterface$OnClickListenerC57691j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57681a f131658a;

        static {
            Covode.recordClassIndex(67660);
        }

        DialogInterface$OnClickListenerC57691j(C57681a aVar) {
            this.f131658a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C57681a aVar = this.f131658a;
            aVar.mo95014a(aVar.f131647d.getActions().get(0));
        }
    }

    public C57681a(Context context, C57663a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f131646c = context;
        this.f131647d = aVar;
    }
}
