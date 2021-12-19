package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54185a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54186b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54188d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54189e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.p3113a.C54182a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55186ah;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3183a.AbstractC55164a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4589j.C88939d;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b */
public abstract class AbstractC54171b extends AbstractC1973t<C54172a> {

    /* renamed from: h */
    public C54186b f124115h;

    /* renamed from: i */
    public Context f124116i;

    /* renamed from: j */
    public AbstractC46519p f124117j;

    /* renamed from: k */
    public GiphyViewModel f124118k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b$a */
    public static final class C54172a extends AbstractC55164a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f124119a = {new C89232y(C54172a.class, "emojiIv", "getEmojiIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0)};

        /* renamed from: c */
        private final AbstractC89248d f124120c = new AbstractC55164a.C55165a(new AbstractC55164a.C55167b());

        static {
            Covode.recordClassIndex(63854);
        }

        /* renamed from: a */
        public final RemoteImageView mo91271a() {
            return (RemoteImageView) this.f124120c.mo23374a(this, f124119a[0]);
        }
    }

    static {
        Covode.recordClassIndex(63853);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a8p;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b$b */
    public static final class C54173b implements AbstractC55220o {

        /* renamed from: a */
        final /* synthetic */ AbstractC54171b f124121a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f124122b;

        static {
            Covode.recordClassIndex(63855);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo90999a(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91001a(String str, Throwable th) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final boolean mo91002a() {
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b$b$a */
        static final class View$OnClickListenerC54174a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C54173b f124123a;

            static {
                Covode.recordClassIndex(63856);
            }

            View$OnClickListenerC54174a(C54173b bVar) {
                this.f124123a = bVar;
            }

            public final void onClick(View view) {
                C54189e eVar;
                String str;
                ClickAgent.onClick(view);
                this.f124123a.f124121a.f124117j.mo79016a(this.f124123a.f124122b, AbstractC54171b.m99428a(this.f124123a.f124121a.f124115h), 1);
                GiphyViewModel giphyViewModel = this.f124123a.f124121a.f124118k;
                C54186b bVar = this.f124123a.f124121a.f124115h;
                C89219l.m154721d(bVar, "");
                C54185a aVar = bVar.f124151e;
                if (!(aVar == null || (eVar = aVar.f124146a) == null || (str = eVar.f124156a) == null || str.length() == 0 || str == null)) {
                    AbstractC88410b b = AbstractC88973n.m154243a((AbstractC88976q) new GiphyViewModel.C54153g(giphyViewModel, str)).mo143242b(giphyViewModel.f124083k).mo143241b(new GiphyViewModel.C54152f(new GiphyViewModel.C54154h(giphyViewModel.f124081i)));
                    C89219l.m154716b(b, "");
                    C88939d.m154200a(b, new GiphyViewModel.C54156j(giphyViewModel), new GiphyViewModel.C54155i(giphyViewModel));
                }
                this.f124123a.f124121a.f124118k.f124078f.postValue(C89391z.f203057a);
            }
        }

        C54173b(AbstractC54171b bVar, RemoteImageView remoteImageView) {
            this.f124121a = bVar;
            this.f124122b = remoteImageView;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91000a(String str, AbstractC24457f fVar, Animatable animatable) {
            this.f124122b.setOnClickListener(new View$OnClickListenerC54174a(this));
        }
    }

    /* renamed from: a */
    public static C46447a m99428a(C54186b bVar) {
        List<String> list;
        C54182a aVar;
        String str;
        C54182a aVar2;
        String str2;
        C54182a aVar3;
        String str3;
        C46534a aVar4 = new C46534a();
        C46447a aVar5 = new C46447a();
        aVar4.setAnimateType(bVar.f124147a);
        aVar4.setStickerType(3);
        C54188d dVar = bVar.f124149c;
        if (!(dVar == null || (aVar3 = dVar.f124155a) == null || (str3 = aVar3.f124144b) == null)) {
            aVar4.setWidth(Integer.parseInt(str3));
        }
        C54188d dVar2 = bVar.f124149c;
        if (!(dVar2 == null || (aVar2 = dVar2.f124155a) == null || (str2 = aVar2.f124145c) == null)) {
            aVar4.setHeight(Integer.parseInt(str2));
        }
        aVar4.setDisplayName(C17867d.m33078a().getString(R.string.cf2));
        UrlModel urlModel = new UrlModel();
        C54188d dVar3 = bVar.f124149c;
        if (dVar3 == null || (aVar = dVar3.f124155a) == null || (str = aVar.f124143a) == null) {
            list = null;
        } else {
            list = C89070n.m154516a(str);
        }
        urlModel.setUrlList(list);
        aVar4.setAnimateUrl(urlModel);
        aVar4.setStickerId(bVar.f124148b);
        aVar5.f108224d = aVar4;
        return aVar5;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54172a aVar) {
        UrlModel animateUrl;
        C89219l.m154721d(aVar, "");
        C46447a a = m99428a(this.f124115h);
        C46534a aVar2 = a.f108224d;
        C89219l.m154716b(aVar2, "");
        float height = (float) aVar2.getHeight();
        C46534a aVar3 = a.f108224d;
        C89219l.m154716b(aVar3, "");
        float width = height / ((float) aVar3.getWidth());
        C46534a aVar4 = a.f108224d;
        if (aVar4 != null && (animateUrl = aVar4.getAnimateUrl()) != null) {
            ViewGroup.LayoutParams layoutParams = aVar.mo91271a().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar5 = (ConstraintLayout.C0547a) layoutParams;
            aVar5.f2225B = "H,1:".concat(String.valueOf(width));
            aVar.mo91271a().setLayoutParams(aVar5);
            aVar.mo91271a().setContentDescription(this.f124116i.getString(R.string.bm1));
            RemoteImageView a2 = aVar.mo91271a();
            a2.setOnClickListener(null);
            C55186ah.m100891a(a2, animateUrl, new C54173b(this, a2), true);
        }
    }

    public AbstractC54171b(C54186b bVar, Context context, AbstractC46519p pVar, GiphyViewModel giphyViewModel) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(giphyViewModel, "");
        this.f124115h = bVar;
        this.f124116i = context;
        this.f124117j = pVar;
        this.f124118k = giphyViewModel;
        super.mo5786a((CharSequence) bVar.f124148b);
    }
}
