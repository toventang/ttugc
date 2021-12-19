package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75419d;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84535c;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b.C84575e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84737g;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84632c;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.style.StyleEditText;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import java.util.HashMap;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak */
public final class C72067ak extends Fragment {

    /* renamed from: f */
    public static final C72068a f161537f = new C72068a((byte) 0);

    /* renamed from: a */
    public C72251s f161538a;

    /* renamed from: b */
    public ShortVideoContext f161539b;

    /* renamed from: c */
    final AbstractC89244h f161540c = C89250i.m154773a((AbstractC89171a) C72070c.f161553a);

    /* renamed from: d */
    final AbstractC89244h f161541d = C89250i.m154773a((AbstractC89171a) new C72069b(this));

    /* renamed from: e */
    public MvImageChooseAdapter.AbstractC72048c f161542e;

    /* renamed from: g */
    private ViewGroup f161543g;

    /* renamed from: h */
    private Context f161544h;

    /* renamed from: i */
    private C84737g f161545i;

    /* renamed from: j */
    private View f161546j;

    /* renamed from: k */
    private View f161547k;

    /* renamed from: l */
    private final AbstractC89244h f161548l = C89250i.m154773a((AbstractC89171a) new C72078h(this));

    /* renamed from: m */
    private final AbstractC89244h f161549m = C89250i.m154773a((AbstractC89171a) new C72079i(this));

    /* renamed from: n */
    private final C88411a f161550n = new C88411a();

    /* renamed from: o */
    private HashMap f161551o;

    static {
        Covode.recordClassIndex(84732);
    }

    /* renamed from: a */
    public final AbstractC84697h<ProviderEffect> mo114353a() {
        return (AbstractC84697h) this.f161548l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$a */
    public static final class C72068a {
        static {
            Covode.recordClassIndex(84733);
        }

        private C72068a() {
        }

        public /* synthetic */ C72068a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$e */
    static final class C72075e extends AbstractC89220m implements AbstractC89171a<AbstractC84632c<ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ C72067ak f161558a;

        static {
            Covode.recordClassIndex(84740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72075e(C72067ak akVar) {
            super(0);
            this.f161558a = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84632c<ProviderEffect> invoke() {
            return C72067ak.m127212a(this.f161558a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$b */
    static final class C72069b extends AbstractC89220m implements AbstractC89171a<AbstractC84534b> {

        /* renamed from: a */
        final /* synthetic */ C72067ak f161552a;

        static {
            Covode.recordClassIndex(84734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72069b(C72067ak akVar) {
            super(0);
            this.f161552a = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84534b invoke() {
            return ((AbstractC84535c) this.f161552a.f161540c.getValue()).mo129482a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$i */
    static final class C72079i extends AbstractC89220m implements AbstractC89171a<AbstractC84700k<ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ C72067ak f161563a;

        static {
            Covode.recordClassIndex(84744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72079i(C72067ak akVar) {
            super(0);
            this.f161563a = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84700k<ProviderEffect> invoke() {
            AbstractC84697h<ProviderEffect> a = this.f161563a.mo114353a();
            if (!(a instanceof AbstractC84700k)) {
                return null;
            }
            return a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f161551o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$c */
    static final class C72070c extends AbstractC89220m implements AbstractC89171a<C84575e> {

        /* renamed from: a */
        public static final C72070c f161553a = new C72070c();

        static {
            Covode.recordClassIndex(84735);
        }

        C72070c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84575e invoke() {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            return new C84575e(application, C720711.f161554a, C720722.f161555a, C720733.f161556a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$h */
    static final class C72078h extends AbstractC89220m implements AbstractC89171a<InfoStickerProviderListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C72067ak f161562a;

        static {
            Covode.recordClassIndex(84743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72078h(C72067ak akVar) {
            super(0);
            this.f161562a = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InfoStickerProviderListViewModel invoke() {
            C72067ak akVar = this.f161562a;
            return new InfoStickerProviderListViewModel(akVar, (AbstractC84534b) akVar.f161541d.getValue(), new C75419d(this.f161562a.f161539b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$g */
    static final class C72077g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f161561a;

        static {
            Covode.recordClassIndex(84742);
        }

        C72077g(Context context) {
            this.f161561a = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C85052j.C85053a.m146245a(this.f161561a, (int) R.string.bop, 0).mo129996a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C72251s m127212a(C72067ak akVar) {
        C72251s sVar = akVar.f161538a;
        if (sVar == null) {
            C89219l.m154710a("gifListView");
        }
        return sVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C72251s sVar = this.f161538a;
        if (sVar == null) {
            C89219l.m154710a("gifListView");
        }
        sVar.cK_();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$d */
    static final class C72074d extends AbstractC89220m implements AbstractC89172b<AbstractC84650b.C84654c, C89391z> {

        /* renamed from: a */
        public static final C72074d f161557a = new C72074d();

        static {
            Covode.recordClassIndex(84739);
        }

        C72074d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC84650b.C84654c cVar) {
            AbstractC84650b.C84654c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.f189166b = null;
            cVar2.f189167c = null;
            cVar2.f189168d = null;
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ShortVideoContext shortVideoContext;
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                shortVideoContext = (ShortVideoContext) arguments.getParcelable("key_short_video_context");
            } else {
                shortVideoContext = null;
            }
            this.f161539b = shortVideoContext;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ak$f */
    static final class C72076f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C72067ak f161559a;

        /* renamed from: b */
        final /* synthetic */ Context f161560b;

        static {
            Covode.recordClassIndex(84741);
        }

        C72076f(C72067ak akVar, Context context) {
            this.f161559a = akVar;
            this.f161560b = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            long j;
            String size;
            String width;
            String height;
            ProviderEffectTemplate providerEffectTemplate = (ProviderEffectTemplate) obj;
            int i2 = 0;
            if (providerEffectTemplate.getPath() != null) {
                MvImageChooseAdapter.AbstractC72048c cVar = this.f161559a.f161542e;
                if (cVar != null) {
                    C89219l.m154716b(providerEffectTemplate, "");
                    MediaModel mediaModel = new MediaModel(providerEffectTemplate.getId());
                    mediaModel.f134662b = providerEffectTemplate.getPath();
                    mediaModel.f134676p = providerEffectTemplate.getUser_name();
                    ProviderEffect.StickerBean sticker_info = providerEffectTemplate.getSticker_info();
                    if (sticker_info == null || (height = sticker_info.getHeight()) == null) {
                        i = 0;
                    } else {
                        i = Integer.parseInt(height);
                    }
                    mediaModel.f134673m = i;
                    ProviderEffect.StickerBean sticker_info2 = providerEffectTemplate.getSticker_info();
                    if (!(sticker_info2 == null || (width = sticker_info2.getWidth()) == null)) {
                        i2 = Integer.parseInt(width);
                    }
                    mediaModel.f134672l = i2;
                    ProviderEffect.StickerBean sticker_info3 = providerEffectTemplate.getSticker_info();
                    if (sticker_info3 == null || (size = sticker_info3.getSize()) == null) {
                        j = 0;
                    } else {
                        j = Long.parseLong(size);
                    }
                    mediaModel.f134669i = j;
                    mediaModel.f134675o = Uri.parse(providerEffectTemplate.getPath());
                    mediaModel.f134671k = String.valueOf(providerEffectTemplate.getThumbnailSticker());
                    mediaModel.f134667g = 2;
                    cVar.mo114288a(mediaModel);
                }
                C72067ak.m127212a(this.f161559a).mo114479b();
                return;
            }
            C85052j.C85053a.m146245a(this.f161560b, (int) R.string.bop, 0).mo129996a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(8641);
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a3b, viewGroup, false);
        if (a != null) {
            ViewGroup viewGroup2 = (ViewGroup) a;
            this.f161543g = viewGroup2;
            if (viewGroup2 == null) {
                C89219l.m154710a("mRootView");
            }
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            this.f161544h = context;
            if (context == null) {
                C89219l.m154710a("mContext");
            }
            ViewGroup viewGroup3 = this.f161543g;
            if (viewGroup3 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById = viewGroup3.findViewById(R.id.b_l);
            C89219l.m154716b(findViewById, "");
            FrameLayout frameLayout = (FrameLayout) findViewById;
            ViewGroup viewGroup4 = this.f161543g;
            if (viewGroup4 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById2 = viewGroup4.findViewById(R.id.b_m);
            C89219l.m154716b(findViewById2, "");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
            AbstractC84697h<com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect> a2 = mo114353a();
            AbstractC84700k kVar = (AbstractC84700k) this.f161549m.getValue();
            ViewGroup viewGroup5 = this.f161543g;
            if (viewGroup5 == null) {
                C89219l.m154710a("mRootView");
            }
            C72251s sVar = new C72251s(context, this, a2, kVar, viewGroup5, C72074d.f161557a);
            sVar.mo129584s();
            this.f161538a = sVar;
            C72075e eVar = new C72075e(this);
            ViewGroup viewGroup6 = this.f161543g;
            if (viewGroup6 == null) {
                C89219l.m154710a("mRootView");
            }
            Context context2 = viewGroup6.getContext();
            if (!(context2 instanceof Activity)) {
                context2 = null;
            }
            C84737g gVar = new C84737g(relativeLayout, eVar, frameLayout, (Activity) context2, getString(R.string.c41), false);
            gVar.mo129615a(true);
            this.f161545i = gVar;
            View view = gVar.f189346g;
            if (view == null) {
                C89219l.m154710a("content");
            }
            this.f161547k = view;
            if (view == null) {
                C89219l.m154710a("searchContent");
            }
            C23163i.m43667b(view, 0, Integer.valueOf((int) C13628n.m24520b(getContext(), -3.0f)), 0, Integer.valueOf((int) C13628n.m24520b(getContext(), 12.0f)), false);
            Context context3 = getContext();
            if (context3 != null) {
                View view2 = this.f161547k;
                if (view2 == null) {
                    C89219l.m154710a("searchContent");
                }
                View findViewById3 = view2.findViewById(R.id.bzd);
                C89219l.m154716b(findViewById3, "");
                ((AVAutoRTLImageView) findViewById3).setBackground(C0196a.m619b(context3, 2131232412));
                View view3 = this.f161547k;
                if (view3 == null) {
                    C89219l.m154710a("searchContent");
                }
                View findViewById4 = view3.findViewById(R.id.x7);
                C89219l.m154716b(findViewById4, "");
                ((ImageButton) findViewById4).setBackground(C0196a.m619b(context3, 2131232411));
                View view4 = this.f161547k;
                if (view4 == null) {
                    C89219l.m154710a("searchContent");
                }
                ((StyleEditText) view4.findViewById(R.id.f32)).setHintTextColor(C0643b.m2378c(context3, R.color.c5));
                View view5 = this.f161547k;
                if (view5 == null) {
                    C89219l.m154710a("searchContent");
                }
                ((StyleEditText) view5.findViewById(R.id.f32)).setTextColor(C0643b.m2378c(context3, R.color.bx));
                View view6 = this.f161547k;
                if (view6 == null) {
                    C89219l.m154710a("searchContent");
                }
                View findViewById5 = view6.findViewById(R.id.dm0);
                C89219l.m154716b(findViewById5, "");
                ((FrameLayout) findViewById5).setBackground(C0196a.m619b(context3, R.drawable.a_b));
            }
            C72251s sVar2 = this.f161538a;
            if (sVar2 == null) {
                C89219l.m154710a("gifListView");
            }
            View l = sVar2.mo129538l();
            this.f161546j = l;
            if (l == null) {
                C89219l.m154710a("gifContent");
            }
            RecyclerView recyclerView = (RecyclerView) l.findViewById(R.id.e93);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVerticalFadingEdgeEnabled(false);
            View view7 = this.f161546j;
            if (view7 == null) {
                C89219l.m154710a("gifContent");
            }
            frameLayout.addView(view7);
            C88411a aVar = this.f161550n;
            C72251s sVar3 = this.f161538a;
            if (sVar3 == null) {
                C89219l.m154710a("gifListView");
            }
            aVar.mo142945a(sVar3.mo129533g().mo143254a(new C72076f(this, context), C84909p.f189747a));
            C88411a aVar2 = this.f161550n;
            C72251s sVar4 = this.f161538a;
            if (sVar4 == null) {
                C89219l.m154710a("gifListView");
            }
            aVar2.mo142945a(sVar4.mo129534h().mo143254a(new C72077g(context), C84909p.f189747a));
            ViewGroup viewGroup7 = this.f161543g;
            if (viewGroup7 == null) {
                C89219l.m154710a("mRootView");
            }
            MethodCollector.m26664o(8641);
            return viewGroup7;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(8641);
        throw nullPointerException;
    }
}
