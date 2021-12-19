package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.Window$CallbackC23058f;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.dialog.p1716e.C23054e;
import com.bytedance.tux.dialog.p1716e.C23055f;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
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

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b */
public final class C39487b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public boolean f93159a;

    /* renamed from: b */
    public C23013a f93160b;

    /* renamed from: c */
    public boolean f93161c = true;

    /* renamed from: d */
    public final Context f93162d;

    /* renamed from: e */
    public final C39248i f93163e;

    /* renamed from: f */
    private final Handler f93164f = new Handler();

    static {
        Covode.recordClassIndex(47179);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(C39487b.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$b */
    public static final class C39489b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93166a;

        static {
            Covode.recordClassIndex(47181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39489b(C39487b bVar) {
            super(0);
            this.f93166a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93166a.f93161c = false;
            C23013a aVar = this.f93166a.f93160b;
            if (aVar != null) {
                aVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$h */
    public static final class C39499h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93180a;

        static {
            Covode.recordClassIndex(47191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39499h(C39487b bVar) {
            super(0);
            this.f93180a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93180a.f93161c = false;
            C23013a aVar = this.f93180a.f93160b;
            if (aVar != null) {
                aVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$k */
    public static final class RunnableC39502k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39487b f93183a;

        static {
            Covode.recordClassIndex(47194);
        }

        RunnableC39502k(C39487b bVar) {
            this.f93183a = bVar;
        }

        public final void run() {
            C23013a aVar = this.f93183a.f93160b;
            if (aVar == null || aVar.f54483c.isShowing()) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                    this.f93183a.f93159a = true;
                    return;
                }
                this.f93183a.mo68936b();
            }
        }
    }

    /* renamed from: b */
    public final void mo68936b() {
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        if (O.mo123892o()) {
            C81079v.m140776O().mo123908B();
            this.f93159a = true;
            return;
        }
        this.f93164f.postDelayed(new RunnableC39502k(this), 1000);
    }

    /* renamed from: a */
    public final void mo68934a() {
        C80298cg.m139204a(this);
        C23023b bVar = (C23023b) C23013a.C23015a.m43405a(new ContextThemeWrapper(this.f93162d, (int) R.style.nz)).mo37411b(this.f93163e.getTitle()).mo37413d(C39456a.m80150a(this.f93162d, this.f93163e.getBody(), this.f93163e.getPolicyLinkList(), new C39498g(this), new C39499h(this))).mo37482a(C89219l.m154714a((Object) this.f93163e.isSubPopUp(), (Object) true)).mo37481a(new C39500i(this)).mo37480a(new C39501j(this));
        if (C89219l.m154714a((Object) this.f93163e.getFirstButtonHighlight(), (Object) true)) {
            C23032e.m43444a(bVar, new C39490c(this));
        } else {
            C23028c.m43435a(bVar, new C39493d(this));
        }
        if (!TextUtils.isEmpty(this.f93163e.getIcon_url())) {
            SmartImageView smartImageView = new SmartImageView(this.f93162d);
            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C89070n.m154516a(this.f93163e.getIcon_url()));
            urlModel.setWidth(C34728n.m70946a(48.0d));
            urlModel.setHeight(C34728n.m70946a(48.0d));
            C20766v b = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34185b(C80397em.m139369a(201));
            b.f49106c = true;
            b.f49092E = smartImageView;
            b.mo34181a(new C39496e(smartImageView));
            C23055f.m43473a(bVar, smartImageView, C39497f.f93178a);
        }
        C23013a a = bVar.mo37405a();
        this.f93160b = a;
        if (a != null) {
            a.mo37396b().show();
        }
        C39456a.m80157a(this.f93163e.getBusiness(), this.f93163e.getStyle());
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$e */
    public static final class C39496e extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f93177a;

        static {
            Covode.recordClassIndex(47188);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
        }

        C39496e(SmartImageView smartImageView) {
            this.f93177a = smartImageView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            this.f93177a.setImageResource(2131231826);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$j */
    public static final class C39501j implements Window$CallbackC23058f.AbstractC23059a {

        /* renamed from: a */
        final /* synthetic */ C39487b f93182a;

        static {
            Covode.recordClassIndex(47193);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39501j(C39487b bVar) {
            this.f93182a = bVar;
        }

        @Override // com.bytedance.tux.dialog.Window$CallbackC23058f.AbstractC23059a
        /* renamed from: a */
        public final void mo37469a(boolean z) {
            if (z) {
                this.f93182a.mo68936b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$a */
    public static final class C39488a extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93165a;

        static {
            Covode.recordClassIndex(47180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39488a(C39487b bVar) {
            super(1);
            this.f93165a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C39249j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f93165a.mo68937b(jVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$f */
    public static final class C39497f extends AbstractC89220m implements AbstractC89172b<C23054e, C89391z> {

        /* renamed from: a */
        public static final C39497f f93178a = new C39497f();

        static {
            Covode.recordClassIndex(47189);
        }

        C39497f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23054e eVar) {
            C23054e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54562a = 48;
            eVar2.f54563b = 48;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$g */
    public static final class C39498g extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93179a;

        static {
            Covode.recordClassIndex(47190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39498g(C39487b bVar) {
            super(1);
            this.f93179a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C39249j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f93179a.mo68937b(jVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$i */
    public static final class C39500i extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93181a;

        static {
            Covode.recordClassIndex(47192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39500i(C39487b bVar) {
            super(1);
            this.f93181a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            C39487b bVar = this.f93181a;
            C80298cg.m139205b(bVar);
            if (bVar.f93159a && bVar.f93161c) {
                C81079v.m140776O().mo123950y();
                bVar.f93159a = false;
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C23013a aVar;
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals(jVar.f111077b.optString("eventName"), "cancel_post_success") && (aVar = this.f93160b) != null) {
            aVar.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$c */
    public static final class C39490c extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93167a;

        static {
            Covode.recordClassIndex(47182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39490c(C39487b bVar) {
            super(1);
            this.f93167a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            for (final C39249j jVar : this.f93167a.f93163e.getActions()) {
                if (jVar.f92717b) {
                    dVar2.mo37424a(jVar.f92716a, new AbstractC89172b<C23024a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b.C39490c.C394911 */

                        /* renamed from: a */
                        final /* synthetic */ C39490c f93168a;

                        static {
                            Covode.recordClassIndex(47183);
                        }

                        {
                            this.f93168a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                            C23024a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            this.f93168a.f93167a.mo68935a(jVar);
                            aVar2.f54509b = false;
                            return C89391z.f203057a;
                        }
                    });
                } else {
                    dVar2.mo37426b(jVar.f92716a, new AbstractC89172b<C23024a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b.C39490c.C394922 */

                        /* renamed from: a */
                        final /* synthetic */ C39490c f93170a;

                        static {
                            Covode.recordClassIndex(47184);
                        }

                        {
                            this.f93170a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                            C23024a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            this.f93170a.f93167a.mo68935a(jVar);
                            aVar2.f54509b = false;
                            return C89391z.f203057a;
                        }
                    });
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo68935a(C39249j jVar) {
        C39456a.m80155a(jVar, this.f93162d, new C39488a(this), new C39489b(this));
        C39456a.m80158a(jVar.f92716a, this.f93163e.getBusiness(), this.f93163e.getStyle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$d */
    public static final class C39493d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39487b f93172a;

        static {
            Covode.recordClassIndex(47185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39493d(C39487b bVar) {
            super(1);
            this.f93172a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            boolean z;
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            for (final C39249j jVar : this.f93172a.f93163e.getActions()) {
                if (jVar.f92717b) {
                    bVar2.mo37417a(jVar.f92716a, new AbstractC89172b<C23024a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b.C39493d.C394941 */

                        /* renamed from: a */
                        final /* synthetic */ C39493d f93173a;

                        static {
                            Covode.recordClassIndex(47186);
                        }

                        {
                            this.f93173a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                            C23024a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            this.f93173a.f93172a.mo68935a(jVar);
                            aVar2.f54509b = false;
                            return C89391z.f203057a;
                        }
                    });
                } else {
                    bVar2.mo37419b(jVar.f92716a, new AbstractC89172b<C23024a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b.C39493d.C394952 */

                        /* renamed from: a */
                        final /* synthetic */ C39493d f93175a;

                        static {
                            Covode.recordClassIndex(47187);
                        }

                        {
                            this.f93175a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                            C23024a aVar2 = aVar;
                            C89219l.m154721d(aVar2, "");
                            this.f93175a.f93172a.mo68935a(jVar);
                            aVar2.f54509b = false;
                            return C89391z.f203057a;
                        }
                    });
                }
            }
            if (this.f93172a.f93163e.getActions().size() > 2) {
                z = true;
            } else {
                z = false;
            }
            bVar2.f54513b = z;
            return C89391z.f203057a;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: b */
    public final void mo68937b(com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.compliance.api.model.i r0 = r2.f93163e
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80153a(r0, r3)
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80159b()
            java.lang.String r1 = r3.f92718c
            java.lang.String r0 = "callback"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0017
            r2.f93161c = r1
        L_0x0017:
            com.bytedance.tux.dialog.a r0 = r2.f93160b
            if (r0 == 0) goto L_0x001e
            r0.dismiss()
        L_0x001e:
            com.ss.android.ugc.aweme.compliance.api.b.a r0 = new com.ss.android.ugc.aweme.compliance.api.b.a
            r0.<init>(r1)
            com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39487b.mo68937b(com.ss.android.ugc.aweme.compliance.api.model.j):void");
    }

    public C39487b(Context context, C39248i iVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f93162d = context;
        this.f93163e = iVar;
    }
}
