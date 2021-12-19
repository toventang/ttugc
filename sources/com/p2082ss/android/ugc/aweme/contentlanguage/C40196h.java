package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40212k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.h */
public final class C40196h extends RecyclerView.AbstractC1350a<C40212k> {

    /* renamed from: a */
    public AbstractC40224n f94374a;

    /* renamed from: b */
    public ArrayList<String> f94375b = new ArrayList<>();

    /* renamed from: c */
    private List<ContentLanguageGuideSetting> f94376c;

    /* renamed from: d */
    private final String f94377d;

    static {
        Covode.recordClassIndex(47991);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C40212k onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m81305a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f94376c.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.h$b */
    static final class View$OnClickListenerC40198b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40196h f94381a;

        /* renamed from: b */
        final /* synthetic */ C40212k f94382b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f94383c;

        static {
            Covode.recordClassIndex(47993);
        }

        View$OnClickListenerC40198b(C40196h hVar, C40212k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f94381a = hVar;
            this.f94382b = kVar;
            this.f94383c = contentLanguageGuideSetting;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94381a.mo69395a(this.f94382b, this.f94383c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.h$a */
    public static final class C40197a extends AbstractView$OnTouchListenerC39094b {

        /* renamed from: a */
        final /* synthetic */ C40196h f94378a;

        /* renamed from: b */
        final /* synthetic */ C40212k f94379b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f94380c;

        static {
            Covode.recordClassIndex(47992);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
        /* renamed from: b */
        public final Animator mo64559b(View view) {
            View view2;
            if (view != null) {
                view2 = view.findViewById(R.id.c4u);
            } else {
                view2 = null;
            }
            int[] iArr = new int[2];
            iArr[0] = 0;
            if (view == null) {
                C89219l.m154715b();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C89219l.m154715b();
            }
            iArr[1] = resources.getColor(R.color.f);
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", iArr);
            C89219l.m154716b(ofArgb, "");
            ofArgb.setDuration(150L);
            return ofArgb;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
        /* renamed from: c */
        public final Animator mo64560c(View view) {
            View view2;
            if (view != null) {
                view2 = view.findViewById(R.id.c4u);
            } else {
                view2 = null;
            }
            int[] iArr = new int[2];
            if (view == null) {
                C89219l.m154715b();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C89219l.m154715b();
            }
            iArr[0] = resources.getColor(R.color.f);
            iArr[1] = 0;
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(view2, "backgroundColor", iArr);
            C89219l.m154716b(ofArgb, "");
            ofArgb.setDuration(150L);
            return ofArgb;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
        /* renamed from: a */
        public final void mo64558a(View view, MotionEvent motionEvent) {
            this.f94378a.mo69395a(this.f94379b, this.f94380c);
        }

        C40197a(C40196h hVar, C40212k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f94378a = hVar;
            this.f94379b = kVar;
            this.f94380c = contentLanguageGuideSetting;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.h$c */
    public static final class C40199c extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C40196h f94384a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageGuideSetting f94385b;

        static {
            Covode.recordClassIndex(47994);
        }

        C40199c(C40196h hVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f94384a = hVar;
            this.f94385b = contentLanguageGuideSetting;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            try {
                this.f94384a.f94374a.mo69400b(this.f94385b.getCode());
            } catch (C16041a e) {
                e.printStackTrace();
            }
        }
    }

    public C40196h(String str, AbstractC40224n nVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(nVar, "");
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        List<ContentLanguageGuideSetting> contentLanguageGuideCodes = iESSettingsProxy.getContentLanguageGuideCodes();
        C89219l.m154716b(contentLanguageGuideCodes, "");
        this.f94376c = contentLanguageGuideCodes;
        this.f94374a = nVar;
        this.f94377d = str;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m81305a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(43);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9p, viewGroup, false);
        C89219l.m154716b(a2, "");
        C40212k kVar = new C40212k(a2);
        try {
            if (kVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(kVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) kVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(kVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = kVar.getClass().getName();
        MethodCollector.m26664o(43);
        return kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C40212k kVar, int i) {
        C40212k kVar2 = kVar;
        C89219l.m154721d(kVar2, "");
        ContentLanguageGuideSetting contentLanguageGuideSetting = this.f94376c.get(i);
        try {
            kVar2.mo69413a().setText(contentLanguageGuideSetting.getLocalName());
            kVar2.mo69414b().setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                C34577e.m70591a(kVar2.mo69415c(), 2131232314);
            } else {
                C24185e b = C24182c.m45843b();
                b.f57309m = kVar2.mo69415c().getController();
                b.f57299c = (REQUEST) C24639c.m47149a(Uri.parse(contentLanguageGuideSetting.getIcon())).mo40483a();
                b.f57303g = new C40199c(this, contentLanguageGuideSetting);
                kVar2.mo69415c().setController(b.mo39827e());
            }
            if (Build.VERSION.SDK_INT >= 21) {
                kVar2.itemView.setOnTouchListener(new C40197a(this, kVar2, contentLanguageGuideSetting));
            } else {
                kVar2.itemView.setOnClickListener(new View$OnClickListenerC40198b(this, kVar2, contentLanguageGuideSetting));
            }
            kVar2.mo69417e().setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (C16041a e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo69395a(C40212k kVar, ContentLanguageGuideSetting contentLanguageGuideSetting) {
        try {
            if (this.f94375b.contains(contentLanguageGuideSetting.getCode()) || this.f94375b.size() < C40189c.m81301a()) {
                if (this.f94375b.contains(contentLanguageGuideSetting.getCode())) {
                    this.f94375b.remove(contentLanguageGuideSetting.getCode());
                    C39162r.m79460a("click_content_language_popup", new C33744d().mo59983a("enter_from", this.f94377d).mo59983a("language_type", contentLanguageGuideSetting.getCode()).mo59983a("click_type", "unchoose").f79943a);
                } else {
                    this.f94375b.add(contentLanguageGuideSetting.getCode());
                    C39162r.m79460a("click_content_language_popup", new C33744d().mo59983a("enter_from", this.f94377d).mo59983a("language_type", contentLanguageGuideSetting.getCode()).mo59983a("click_type", "choose").f79943a);
                }
                AbstractC40224n nVar = this.f94374a;
                String code = contentLanguageGuideSetting.getCode();
                C89219l.m154716b(code, "");
                nVar.mo69397a(code);
                Drawable background = kVar.mo69417e().getBackground();
                if (background != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    if (kVar.mo69416d().getVisibility() == 8) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            TuxTextView b = kVar.mo69414b();
                            View view = kVar.itemView;
                            C89219l.m154716b(view, "");
                            View view2 = kVar.itemView;
                            C89219l.m154716b(view2, "");
                            ObjectAnimator.ofArgb(b, "textColor", view.getResources().getColor(R.color.c4), view2.getResources().getColor(R.color.a9)).setDuration(150L).start();
                            TuxTextView a = kVar.mo69413a();
                            View view3 = kVar.itemView;
                            C89219l.m154716b(view3, "");
                            View view4 = kVar.itemView;
                            C89219l.m154716b(view4, "");
                            ObjectAnimator.ofArgb(a, "textColor", view3.getResources().getColor(R.color.bx), view4.getResources().getColor(R.color.a9)).setDuration(150L).start();
                            ObjectAnimator.ofArgb(gradientDrawable, C19386b.f45894a, 0, Color.parseColor(kVar.mo69417e().getTag().toString())).setDuration(150L).start();
                        } else {
                            TuxTextView b2 = kVar.mo69414b();
                            View view5 = kVar.itemView;
                            C89219l.m154716b(view5, "");
                            b2.setTextColor(view5.getResources().getColor(R.color.a9));
                            TuxTextView a2 = kVar.mo69413a();
                            View view6 = kVar.itemView;
                            C89219l.m154716b(view6, "");
                            a2.setTextColor(view6.getResources().getColor(R.color.a9));
                            gradientDrawable.setColor(Color.parseColor(kVar.mo69417e().getTag().toString()));
                        }
                        kVar.mo69416d().setVisibility(0);
                        ObjectAnimator.ofFloat(kVar.mo69416d(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
                        ObjectAnimator duration = ObjectAnimator.ofFloat(kVar.mo69415c(), "alpha", 1.0f, 0.0f).setDuration(150L);
                        C89219l.m154716b(duration, "");
                        duration.addListener(new C40212k.C40218f(kVar));
                        duration.start();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        TuxTextView b3 = kVar.mo69414b();
                        View view7 = kVar.itemView;
                        C89219l.m154716b(view7, "");
                        View view8 = kVar.itemView;
                        C89219l.m154716b(view8, "");
                        ObjectAnimator.ofArgb(b3, "textColor", view7.getResources().getColor(R.color.a9), view8.getResources().getColor(R.color.c4)).setDuration(150L).start();
                        TuxTextView a3 = kVar.mo69413a();
                        View view9 = kVar.itemView;
                        C89219l.m154716b(view9, "");
                        View view10 = kVar.itemView;
                        C89219l.m154716b(view10, "");
                        ObjectAnimator.ofArgb(a3, "textColor", view9.getResources().getColor(R.color.a9), view10.getResources().getColor(R.color.bx)).setDuration(150L).start();
                        ObjectAnimator.ofArgb(gradientDrawable, C19386b.f45894a, Color.parseColor(kVar.mo69417e().getTag().toString()), 0).setDuration(150L).start();
                    } else {
                        TuxTextView b4 = kVar.mo69414b();
                        View view11 = kVar.itemView;
                        C89219l.m154716b(view11, "");
                        b4.setTextColor(view11.getResources().getColor(R.color.c4));
                        TuxTextView a4 = kVar.mo69413a();
                        View view12 = kVar.itemView;
                        C89219l.m154716b(view12, "");
                        a4.setTextColor(view12.getResources().getColor(R.color.bx));
                        gradientDrawable.setColor(0);
                    }
                    kVar.mo69415c().setVisibility(0);
                    ObjectAnimator.ofFloat(kVar.mo69415c(), "alpha", 0.0f, 1.0f).setDuration(150L).start();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(kVar.mo69416d(), "alpha", 1.0f, 0.0f).setDuration(150L);
                    C89219l.m154716b(duration2, "");
                    duration2.addListener(new C40212k.C40219g(kVar));
                    duration2.start();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            }
            View view13 = kVar.itemView;
            C89219l.m154716b(view13, "");
            String string = view13.getContext().getString(R.string.c9h, String.valueOf(C40189c.m81301a()));
            C89219l.m154716b(string, "");
            View view14 = kVar.itemView;
            C89219l.m154716b(view14, "");
            new C23144b(view14).mo37635a(string).mo37637b();
        } catch (C16041a e) {
            e.printStackTrace();
        }
    }
}
