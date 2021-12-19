package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50557v;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.effect.AbstractC63734h;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ab */
public final class C41140ab extends AbstractC41220y {

    /* renamed from: a */
    public final Bundle f96146a;

    static {
        Covode.recordClassIndex(49023);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.h4g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.detail.h.ab$a */
    public static final class RunnableC41141a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f96147a;

        /* renamed from: b */
        final /* synthetic */ String f96148b;

        /* renamed from: c */
        final /* synthetic */ View f96149c;

        static {
            Covode.recordClassIndex(49024);
        }

        RunnableC41141a(TextView textView, String str, View view) {
            this.f96147a = textView;
            this.f96148b = str;
            this.f96149c = view;
        }

        public final void run() {
            this.f96147a.setText(this.f96148b);
            C0792v.m2776j(this.f96149c).mo2931a(1.0f).mo2932a(100L).mo2940c();
        }
    }

    /* renamed from: ab */
    public final void mo70394ab() {
        if (this.f114830be instanceof AbstractC63734h) {
            Object obj = this.f114830be;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.effect.IStickerQuery");
            ((AbstractC63734h) obj).mo102269a(mo70429y(), new C41143c(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.detail.h.ab$c */
    public static final class C41143c extends AbstractC89220m implements AbstractC89172b<C75445g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41140ab f96151a;

        static {
            Covode.recordClassIndex(49026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41143c(C41140ab abVar) {
            super(1);
            this.f96151a = abVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.h.ab$c$a */
        static final class RunnableC41144a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View f96152a;

            /* renamed from: b */
            final /* synthetic */ C41143c f96153b;

            /* renamed from: c */
            final /* synthetic */ C75445g f96154c;

            static {
                Covode.recordClassIndex(49027);
            }

            RunnableC41144a(View view, C41143c cVar, C75445g gVar) {
                this.f96152a = view;
                this.f96153b = cVar;
                this.f96154c = gVar;
            }

            public final void run() {
                C20766v a = C20761r.m39060a(C34735v.m70965a(this.f96154c.iconUrl));
                a.f49092E = (SmartImageView) this.f96152a.findViewById(R.id.e8y);
                a.f49116m = 200;
                a.mo34186c();
                LinearLayout linearLayout = (LinearLayout) this.f96152a.findViewById(R.id.e9n);
                C89219l.m154716b(linearLayout, "");
                TuxTextView tuxTextView = (TuxTextView) this.f96152a.findViewById(R.id.e9m);
                C89219l.m154716b(tuxTextView, "");
                String str = this.f96154c.name;
                C89219l.m154716b(str, "");
                C41140ab.m82847a(linearLayout, tuxTextView, str);
                ((TuxTextView) this.f96152a.findViewById(R.id.e9m)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41140ab.C41143c.RunnableC41144a.View$OnClickListenerC411451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC41144a f96155a;

                    static {
                        Covode.recordClassIndex(49028);
                    }

                    {
                        this.f96155a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        C41140ab abVar = this.f96155a.f96153b.f96151a;
                        C89219l.m154716b(view, "");
                        Context context = view.getContext();
                        C89219l.m154716b(context, "");
                        abVar.mo70392a(context, this.f96155a.f96154c);
                    }
                });
                ((SmartImageView) this.f96152a.findViewById(R.id.e8y)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41140ab.C41143c.RunnableC41144a.View$OnClickListenerC411462 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC41144a f96156a;

                    static {
                        Covode.recordClassIndex(49029);
                    }

                    {
                        this.f96156a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        C41140ab abVar = this.f96156a.f96153b.f96151a;
                        C89219l.m154716b(view, "");
                        Context context = view.getContext();
                        C89219l.m154716b(context, "");
                        abVar.mo70392a(context, this.f96156a.f96154c);
                    }
                });
                this.f96152a.findViewById(R.id.ui).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41140ab.C41143c.RunnableC41144a.View$OnClickListenerC411473 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC41144a f96157a;

                    static {
                        Covode.recordClassIndex(49030);
                    }

                    {
                        this.f96157a = r1;
                    }

                    public final void onClick(View view) {
                        Music music;
                        int i;
                        Video video;
                        ClickAgent.onClick(view);
                        C41140ab abVar = this.f96157a.f96153b.f96151a;
                        C75445g gVar = this.f96157a.f96154c;
                        C75445g gVar2 = new C75445g();
                        gVar2.f169545id = gVar.effectId;
                        IPropReuseService c = PropReuseServiceImpl.m116994c();
                        Activity activity = abVar.f183419bv;
                        C89219l.m154716b(activity, "");
                        ArrayList<C75445g> d = C89070n.m154525d(gVar2);
                        Aweme y = abVar.mo70429y();
                        String str = null;
                        if (y != null) {
                            music = y.getMusic();
                        } else {
                            music = null;
                        }
                        String previousPage = abVar.f114782aJ.getPreviousPage();
                        C89219l.m154716b(previousPage, "");
                        String str2 = gVar.ownerId;
                        Aweme y2 = abVar.mo70429y();
                        if (y2 != null) {
                            str = y2.getAid();
                        }
                        Aweme y3 = abVar.mo70429y();
                        if (y3 == null || (video = y3.getVideo()) == null) {
                            i = 0;
                        } else {
                            i = video.getVideoLength();
                        }
                        c.mo104481a(activity, d, music, previousPage, str2, str, i);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.h.ab$c$b */
        static final class RunnableC41148b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View f96158a;

            /* renamed from: b */
            final /* synthetic */ C41143c f96159b;

            static {
                Covode.recordClassIndex(49031);
            }

            RunnableC41148b(View view, C41143c cVar) {
                this.f96158a = view;
                this.f96159b = cVar;
            }

            public final void run() {
                C20766v a = C20761r.m39056a(2131231899);
                a.f49092E = (SmartImageView) this.f96158a.findViewById(R.id.e8y);
                a.f49116m = 200;
                a.mo34186c();
                LinearLayout linearLayout = (LinearLayout) this.f96158a.findViewById(R.id.e9n);
                C89219l.m154716b(linearLayout, "");
                TuxTextView tuxTextView = (TuxTextView) this.f96158a.findViewById(R.id.e9m);
                C89219l.m154716b(tuxTextView, "");
                C41140ab.m82847a(linearLayout, tuxTextView, "");
                ((TuxTextView) this.f96158a.findViewById(R.id.e9m)).setOnClickListener(null);
                this.f96158a.findViewById(R.id.ui).setOnClickListener(null);
                ((SmartImageView) this.f96158a.findViewById(R.id.e8y)).setOnClickListener(null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C75445g gVar) {
            C75445g gVar2 = gVar;
            if (gVar2 != null) {
                C50557v.f116846a = gVar2.effectId;
                View view = this.f96151a.f96327F;
                if (view != null) {
                    view.post(new RunnableC41144a(view, this, gVar2));
                }
            } else {
                C50557v.f116846a = null;
                View view2 = this.f96151a.f96327F;
                if (view2 != null) {
                    view2.post(new RunnableC41148b(view2, this));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ab$b */
    public static final class C41142b implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C41140ab f96150a;

        static {
            Covode.recordClassIndex(49025);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41142b(C41140ab abVar) {
            this.f96150a = abVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f96150a.mo70394ab();
        }
    }

    public C41140ab(Bundle bundle) {
        this.f96146a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: c */
    public final void mo70395c(List<Aweme> list) {
        super.mo70395c(list);
        mo70394ab();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wp, relativeLayout, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo70392a(Context context, C75445g gVar) {
        String str;
        String str2 = gVar.effectId;
        if (str2 != null) {
            C33744d a = new C33744d().mo59983a("enter_from", this.f114782aJ.getPreviousPage()).mo59983a("prop_id", gVar.effectId).mo59983a("author_id", gVar.ownerId);
            Aweme y = mo70429y();
            Music music = null;
            if (y != null) {
                str = y.getAid();
            } else {
                str = null;
            }
            C39162r.m79460a("enter_prop_detail", a.mo59983a("group_id", str).mo59983a("enter_method", "profile_tab_bottom").f79943a);
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://stickers/detail").withParam("extra_sticker_from", "from_sticker_master_profile").withParam("extra_music_from", "from_sticker_master_profile").withParam("extra_stickers", C89070n.m154525d(str2));
            Aweme y2 = mo70429y();
            if (y2 != null) {
                music = y2.getMusic();
            }
            withParam.withParam("music_model", music).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        mo70394ab();
        this.f114759N.mo67974a(new C41142b(this));
    }

    /* renamed from: a */
    public static void m82847a(View view, TextView textView, String str) {
        C0807z a = C0792v.m2776j(view).mo2931a(0.0f).mo2932a(100L);
        RunnableC41141a aVar = new RunnableC41141a(textView, str, view);
        View view2 = a.f2974a.get();
        if (view2 != null) {
            int i = Build.VERSION.SDK_INT;
            view2.animate().withEndAction(aVar);
        }
        a.mo2940c();
    }
}
