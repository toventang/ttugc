package com.p2082ss.android.ugc.aweme.story.record.p4069i;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.i.a */
public final class C77600a {

    /* renamed from: b */
    public static final C77606e f174044b = new C77606e((byte) 0);

    /* renamed from: a */
    public Effect f174045a;

    static {
        Covode.recordClassIndex(90637);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$e */
    public static final class C77606e {
        static {
            Covode.recordClassIndex(90643);
        }

        private C77606e() {
        }

        public /* synthetic */ C77606e(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$d */
    static final class C77605d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77600a f174060a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f174061b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f174062c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f174063d;

        static {
            Covode.recordClassIndex(90642);
        }

        C77605d(C77600a aVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f174060a = aVar;
            this.f174061b = mVar;
            this.f174062c = remoteImageView;
            this.f174063d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f174060a.f174045a = (Effect) obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$a */
    static final class C77602a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77600a f174048a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f174049b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f174050c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f174051d;

        static {
            Covode.recordClassIndex(90639);
        }

        C77602a(C77600a aVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f174048a = aVar;
            this.f174049b = mVar;
            this.f174050c = remoteImageView;
            this.f174051d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView = this.f174050c;
            if (remoteImageView != null && remoteImageView.getVisibility() == 0) {
                remoteImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$c */
    static final class C77604c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77600a f174056a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f174057b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f174058c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f174059d;

        static {
            Covode.recordClassIndex(90641);
        }

        C77604c(C77600a aVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f174056a = aVar;
            this.f174057b = mVar;
            this.f174058c = remoteImageView;
            this.f174059d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Effect effect = (Effect) obj;
            if (effect != null && (remoteImageView = this.f174059d) != null) {
                C77600a.m135595a(remoteImageView, effect);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$b */
    static final class C77603b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77600a f174052a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f174053b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f174054c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f174055d;

        static {
            Covode.recordClassIndex(90640);
        }

        C77603b(C77600a aVar, AbstractC1204m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f174052a = aVar;
            this.f174053b = mVar;
            this.f174054c = remoteImageView;
            this.f174055d = remoteImageView2;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f174055d;
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

    /* renamed from: a */
    public static void m135595a(RemoteImageView remoteImageView, Effect effect) {
        List<String> urlList;
        String str;
        C89219l.m154721d(effect, "");
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C89070n.m154583g((List) urlList)) != null) {
            C84402a.m145174a(remoteImageView, str, -1, -1);
        }
    }

    public C77600a(AbstractC1204m mVar, AbstractC14330a aVar, ViewGroup viewGroup, final RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (!(viewGroup == null || remoteImageView == null)) {
            viewGroup.setOnTouchListener(new View$OnTouchListenerC75885t(1.2f, 150, remoteImageView));
        }
        aVar.mo23167t().mo119302n().mo119323b().observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.story.record.p4069i.C77600a.C776011 */

            /* renamed from: a */
            final /* synthetic */ C77600a f174046a;

            static {
                Covode.recordClassIndex(90638);
            }

            {
                this.f174046a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Effect effect = (Effect) obj;
                if (effect != null || (effect = this.f174046a.f174045a) != null) {
                    C77600a.m135595a(remoteImageView, effect);
                }
            }
        });
        aVar.mo23122d().mo6997a(mVar, new C77602a(this, mVar, remoteImageView2, remoteImageView));
        aVar.mo23123e().mo6997a(mVar, new C77603b(this, mVar, remoteImageView2, remoteImageView));
        aVar.mo23121c().mo23140a().mo6997a(mVar, new C77604c(this, mVar, remoteImageView2, remoteImageView));
        aVar.mo23121c().mo23141b().mo6997a(mVar, new C77605d(this, mVar, remoteImageView2, remoteImageView));
    }
}
