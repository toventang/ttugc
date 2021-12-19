package com.p2082ss.android.ugc.aweme.badge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractDialogC69658a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3784b.C69662b;
import com.p2082ss.android.ugc.aweme.tools.C78103d;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.b */
public final class DialogC34423b extends AbstractDialogC69658a {

    /* renamed from: d */
    public static final C34424a f81350d = new C34424a((byte) 0);

    /* renamed from: a */
    public final Activity f81351a;

    /* renamed from: b */
    public final C69684e f81352b;

    /* renamed from: c */
    public final String f81353c;

    /* renamed from: e */
    private final String f81354e;

    /* renamed from: f */
    private final UrlModel f81355f;

    /* renamed from: com.ss.android.ugc.aweme.badge.b$a */
    public static final class C34424a {
        static {
            Covode.recordClassIndex(41372);
        }

        /* renamed from: com.ss.android.ugc.aweme.badge.b$a$a */
        public static final class C34425a implements AbstractC69690f {
            static {
                Covode.recordClassIndex(41373);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
            }

            C34425a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
                ProfileBadgeServiceImpl.m67562b().mo57236a();
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123094a(hVar, sharePackage, context);
            }
        }

        private C34424a() {
        }

        public /* synthetic */ C34424a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(41371);
    }

    public final void dismiss() {
        super.dismiss();
        AbstractC69690f fVar = this.f81352b.f155560l;
        if (fVar != null) {
            fVar.mo60845a(this.f81352b.f155557i, this.f81351a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.b$b */
    static final class View$OnClickListenerC34426b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC34423b f81356a;

        static {
            Covode.recordClassIndex(41374);
        }

        View$OnClickListenerC34426b(DialogC34423b bVar) {
            this.f81356a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81356a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.b$d */
    static final class C34429d extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ DialogC34423b f81362a;

        static {
            Covode.recordClassIndex(41377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34429d(DialogC34423b bVar) {
            super(1);
            this.f81362a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return Boolean.valueOf(!bVar2.mo109557b(this.f81362a.f81351a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.badge.b$c */
    public static final class C34427c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f81357a;

        /* renamed from: b */
        final /* synthetic */ DialogC34423b f81358b;

        static {
            Covode.recordClassIndex(41375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34427c(DialogC34423b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f81358b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C34427c(this.f81358b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C34427c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f81357a;
            if (i == 0) {
                C89382r.m154942a(obj);
                final Bitmap a = C78103d.m136526a(this.f81358b.f81353c, this.f81358b.f81351a.getResources().getDimensionPixelOffset(R.dimen.ro), this.f81358b.f81351a.getResources().getDimensionPixelOffset(R.dimen.rn));
                AbstractC89587ci ciVar = C89652o.f203399a;
                C344281 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.badge.DialogC34423b.C34427c.C344281 */

                    /* renamed from: a */
                    int f81359a;

                    /* renamed from: b */
                    final /* synthetic */ C34427c f81360b;

                    static {
                        Covode.recordClassIndex(41376);
                    }

                    {
                        this.f81360b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: com.ss.android.ugc.aweme.badge.b$e */
                        public static final class C34430e extends AbstractC69679e {

                            /* renamed from: a */
                            final /* synthetic */ DialogC34423b f81363a;

                            static {
                                Covode.recordClassIndex(41378);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69679e
                            /* renamed from: a */
                            public final void mo60849a(AbstractC69581b bVar) {
                                boolean z;
                                C89219l.m154721d(bVar, "");
                                if (!this.f81363a.f81352b.f155557i.mo109321a(bVar, this.f81363a.f81351a)) {
                                    z = bVar.mo61913a(this.f81363a.f81352b.f155557i.mo87088a(bVar), this.f81363a.f81351a);
                                } else {
                                    z = true;
                                }
                                AbstractC69690f fVar = this.f81363a.f81352b.f155560l;
                                if (fVar != null) {
                                    fVar.mo60844a(bVar, z, this.f81363a.f81352b.f155557i, this.f81363a.f81351a);
                                }
                                if (!bVar.mo109555c()) {
                                    this.f81363a.dismiss();
                                }
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C34430e(DialogC34423b bVar, Context context, SharePackage sharePackage) {
                                super(context, sharePackage);
                                this.f81363a = bVar;
                            }
                        }

                        @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
                        public final void onCreate(Bundle bundle) {
                            List<AbstractC69581b> list;
                            super.onCreate(bundle);
                            setContentView(R.layout.x2);
                            MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.dyj);
                            C89219l.m154716b(measureLinearLayout, "");
                            C69662b.C69663a.m123055a(this, measureLinearLayout);
                            if (this.f81352b.f155552d) {
                                C89070n.m154537a((List) this.f81352b.f155549a, (AbstractC89172b) new C34429d(this));
                            }
                            boolean z = false;
                            if (this.f81352b.f155551c || (list = this.f81352b.f155549a) == null || list.isEmpty()) {
                                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.dyg);
                                C89219l.m154716b(linearLayout, "");
                                linearLayout.setVisibility(8);
                            } else {
                                ((ShareChannelBar) findViewById(R.id.dyk)).mo109818a(this.f81352b.f155549a);
                                ((ShareChannelBar) findViewById(R.id.dyk)).mo109817a(new C34430e(this, this.f81351a, this.f81352b.f155557i));
                            }
                            ((ImageView) findViewById(R.id.a79)).setOnClickListener(new View$OnClickListenerC34426b(this));
                            String str = this.f81353c;
                            if (str == null || str.length() == 0) {
                                String str2 = this.f81354e;
                                if (str2 == null || str2.length() == 0) {
                                    z = true;
                                }
                                if (!z) {
                                    C20766v a = C20761r.m39061a(this.f81354e);
                                    a.f49093F = (ImageView) findViewById(R.id.c1d);
                                    a.mo34186c();
                                } else if (this.f81355f != null) {
                                    C84402a.m145169a((SimpleDraweeView) findViewById(R.id.c1d), this.f81355f, -1, -1);
                                } else {
                                    RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.c1d);
                                    C89219l.m154716b(remoteImageView, "");
                                    remoteImageView.setVisibility(8);
                                }
                            } else {
                                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C34427c(this, null), 3);
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        private DialogC34423b(Activity activity, C69684e eVar, UrlModel urlModel) {
                            super(activity, R.style.wi);
                            C89219l.m154721d(activity, "");
                            C89219l.m154721d(eVar, "");
                            this.f81351a = activity;
                            this.f81352b = eVar;
                            this.f81353c = null;
                            this.f81354e = null;
                            this.f81355f = urlModel;
                        }

                        public /* synthetic */ DialogC34423b(Activity activity, C69684e eVar, UrlModel urlModel, byte b) {
                            this(activity, eVar, urlModel);
                        }
                    }
