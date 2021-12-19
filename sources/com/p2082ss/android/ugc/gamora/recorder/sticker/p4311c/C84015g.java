package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g */
public final class C84015g {

    /* renamed from: d */
    public static final C84024g f187547d = new C84024g((byte) 0);

    /* renamed from: a */
    public Effect f187548a;

    /* renamed from: b */
    public final AbstractC89172b<String, C89391z> f187549b;

    /* renamed from: c */
    public final RemoteImageView f187550c;

    static {
        Covode.recordClassIndex(97908);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$g */
    public static final class C84024g {
        static {
            Covode.recordClassIndex(97917);
        }

        private C84024g() {
        }

        public /* synthetic */ C84024g(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$d */
    static final class C84021d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84015g f187568a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f187569b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f187570c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187571d;

        static {
            Covode.recordClassIndex(97914);
        }

        C84021d(C84015g gVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f187568a = gVar;
            this.f187569b = mVar;
            this.f187570c = remoteImageView;
            this.f187571d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f187568a.f187548a = (Effect) obj;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$c */
    static final class C84020c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84015g f187564a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f187565b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f187566c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187567d;

        static {
            Covode.recordClassIndex(97913);
        }

        C84020c(C84015g gVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f187564a = gVar;
            this.f187565b = mVar;
            this.f187566c = remoteImageView;
            this.f187567d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Effect effect = (Effect) obj;
            if (effect != null && (remoteImageView = this.f187567d) != null) {
                C84015g.m144538a(remoteImageView, effect);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$f */
    public static final class C84023f extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ C21582f f187576a;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187577d;

        static {
            Covode.recordClassIndex(97916);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            C89219l.m154721d(view, "");
            ((AbstractC14333c) this.f187576a.mo35249a((Type) AbstractC14333c.class, (String) null)).mo23139a(true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84023f(C21582f fVar, RemoteImageView remoteImageView) {
            super(0, false, 3);
            this.f187576a = fVar;
            this.f187577d = remoteImageView;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$a */
    static final class C84018a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84015g f187556a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f187557b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f187558c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187559d;

        static {
            Covode.recordClassIndex(97911);
        }

        C84018a(C84015g gVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f187556a = gVar;
            this.f187557b = mVar;
            this.f187558c = remoteImageView;
            this.f187559d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && (remoteImageView = this.f187556a.f187550c) != null) {
                remoteImageView.setVisibility(8);
            }
            RemoteImageView remoteImageView2 = this.f187558c;
            if (remoteImageView2 != null && remoteImageView2.getVisibility() == 0) {
                remoteImageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$b */
    static final class C84019b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84015g f187560a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f187561b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f187562c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187563d;

        static {
            Covode.recordClassIndex(97912);
        }

        C84019b(C84015g gVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f187560a = gVar;
            this.f187561b = mVar;
            this.f187562c = remoteImageView;
            this.f187563d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f187563d;
            if (remoteImageView != null) {
                C89219l.m154716b(bool, "");
                remoteImageView.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                remoteImageView.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$e */
    static final class C84022e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C84015g f187572a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f187573b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f187574c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f187575d;

        static {
            Covode.recordClassIndex(97915);
        }

        C84022e(C84015g gVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f187572a = gVar;
            this.f187573b = mVar;
            this.f187574c = remoteImageView;
            this.f187575d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C84015g gVar = this.f187572a;
                RemoteImageView remoteImageView = gVar.f187550c;
                if (remoteImageView != null) {
                    remoteImageView.setVisibility(0);
                }
                gVar.f187549b.invoke("show_delete_prop");
                return;
            }
            RemoteImageView remoteImageView2 = this.f187572a.f187550c;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public static void m144538a(RemoteImageView remoteImageView, Effect effect) {
        List<String> urlList;
        String str;
        C89219l.m154721d(effect, "");
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C89070n.m154583g((List) urlList)) != null) {
            C84402a.m145174a(remoteImageView, str, -1, -1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84015g(ActivityC0218d dVar, AbstractC1204m mVar, boolean z, final AbstractC84089j jVar, AbstractC89172b<? super String, C89391z> bVar, ViewGroup viewGroup, final RemoteImageView remoteImageView, RemoteImageView remoteImageView2, RemoteImageView remoteImageView3, C21582f fVar) {
        int i;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f187549b = bVar;
        this.f187550c = remoteImageView3;
        final C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        if (remoteImageView3 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            remoteImageView3.setVisibility(i);
        }
        if (z) {
            bVar.invoke("show_delete_prop");
        }
        if (remoteImageView3 != null) {
            remoteImageView3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84015g.View$OnClickListenerC840161 */

                /* renamed from: a */
                final /* synthetic */ C84015g f187551a;

                static {
                    Covode.recordClassIndex(97909);
                }

                {
                    this.f187551a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C75346e.m132160b(jVar);
                    this.f187551a.f187550c.setVisibility(8);
                    this.f187551a.f187549b.invoke("click_delete_prop");
                }
            });
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C84023f(fVar, remoteImageView));
            if (remoteImageView != null) {
                viewGroup.setOnTouchListener(new View$OnTouchListenerC75885t(1.2f, 150, remoteImageView));
            }
        }
        jVar.mo23167t().mo119302n().mo119323b().observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84015g.C840172 */

            /* renamed from: a */
            final /* synthetic */ C84015g f187553a;

            static {
                Covode.recordClassIndex(97910);
            }

            {
                this.f187553a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
                if (r2.equals(r2.element) == false) goto L_0x001b;
             */
            @Override // androidx.lifecycle.AbstractC1214u
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(java.lang.Object r2) {
                /*
                    r1 = this;
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.p2082ss.android.ugc.effectmanager.effect.model.Effect) r2
                    if (r2 != 0) goto L_0x000b
                    com.ss.android.ugc.gamora.recorder.sticker.c.g r0 = r1.f187553a
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.f187548a
                    if (r2 != 0) goto L_0x000b
                    return
                L_0x000b:
                    h.f.b.z$e r0 = r2
                    T r0 = r0.element
                    if (r0 == 0) goto L_0x001b
                    h.f.b.z$e r0 = r2
                    T r0 = r0.element
                    boolean r0 = r2.equals(r0)
                    if (r0 != 0) goto L_0x0020
                L_0x001b:
                    com.ss.android.ugc.aweme.widgetcompat.RemoteImageView r0 = r12
                    com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84015g.m144538a(r0, r2)
                L_0x0020:
                    h.f.b.z$e r0 = r2
                    r0.element = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84015g.C840172.onChanged(java.lang.Object):void");
            }
        });
        jVar.mo23122d().mo6997a(mVar, new C84018a(this, mVar, remoteImageView2, remoteImageView));
        jVar.mo23123e().mo6997a(mVar, new C84019b(this, mVar, remoteImageView2, remoteImageView));
        jVar.mo23121c().mo23140a().mo6997a(mVar, new C84020c(this, mVar, remoteImageView2, remoteImageView));
        jVar.mo23121c().mo23141b().mo6997a(mVar, new C84021d(this, mVar, remoteImageView2, remoteImageView));
        jVar.mo128894B().observe(mVar, new C84022e(this, mVar, remoteImageView2, remoteImageView));
    }
}
