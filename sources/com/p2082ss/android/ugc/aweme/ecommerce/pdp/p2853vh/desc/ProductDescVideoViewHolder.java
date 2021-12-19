package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.extension.player.AbstractC23095b;
import com.bytedance.tux.extension.player.C23100g;
import com.bytedance.tux.extension.player.view.C23119a;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.VideoInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.p2827b.C43614a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44805i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44756t;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44785n;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.local.C80770e;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder */
public final class ProductDescVideoViewHolder extends AbsFullSpanVH<C44785n> implements AbstractC33974au {

    /* renamed from: n */
    public static final C44944b f104862n = new C44944b((byte) 0);

    /* renamed from: f */
    public final C43614a f104863f;

    /* renamed from: g */
    public Aweme f104864g;

    /* renamed from: j */
    public TuxPlayerView f104865j;

    /* renamed from: k */
    public final AbstractC1203l f104866k = new ProductDescVideoViewHolder$observer$1(this);

    /* renamed from: l */
    public AbstractC23095b f104867l = new C44948e(this);

    /* renamed from: m */
    public final Fragment f104868m;

    /* renamed from: o */
    private final AbstractC89244h f104869o;

    static {
        Covode.recordClassIndex(53358);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104869o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$b */
    public static final class C44944b {
        static {
            Covode.recordClassIndex(53360);
        }

        private C44944b() {
        }

        public /* synthetic */ C44944b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: j */
    public final void mo33832j() {
        super.mo33832j();
        this.f104868m.getLifecycle().mo4013b(this.f104866k);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        AbstractC88412b unused = selectSubscribe(mo70807n(), C44950a.f104883a, new C20370ah(), new C44946d(this));
        this.f104868m.getLifecycle().mo4012a(this.f104866k);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$d */
    static final class C44946d extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44785n>, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductDescVideoViewHolder f104876a;

        static {
            Covode.recordClassIndex(53362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44946d(ProductDescVideoViewHolder productDescVideoViewHolder) {
            super(2);
            this.f104876a = productDescVideoViewHolder;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$d$a */
        static final class RunnableC44947a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TuxPlayerView f104877a;

            /* renamed from: b */
            final /* synthetic */ C44946d f104878b;

            static {
                Covode.recordClassIndex(53363);
            }

            RunnableC44947a(TuxPlayerView tuxPlayerView, C44946d dVar) {
                this.f104877a = tuxPlayerView;
                this.f104878b = dVar;
            }

            public final void run() {
                boolean z;
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                Boolean a = s.mo95842p().mo96041a();
                if (a != null) {
                    z = a.booleanValue();
                } else {
                    z = false;
                }
                if (ProductDescVideoViewHolder.m87636a((View) this.f104877a)) {
                    this.f104877a.mo37584e();
                } else if (!z) {
                    this.f104877a.mo37583d();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44785n> jediSimpleViewHolder, Integer num) {
            num.intValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            TuxPlayerView tuxPlayerView = this.f104876a.f104865j;
            if (tuxPlayerView != null) {
                tuxPlayerView.post(new RunnableC44947a(tuxPlayerView, this));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$e */
    public static final class C44948e implements AbstractC23095b {

        /* renamed from: a */
        final /* synthetic */ ProductDescVideoViewHolder f104879a;

        static {
            Covode.recordClassIndex(53364);
        }

        @Override // com.bytedance.tux.extension.player.AbstractC23095b
        /* renamed from: a */
        public final void mo37539a() {
            Video video;
            C44720k kVar;
            String str;
            Aweme aweme = this.f104879a.f104864g;
            if (aweme != null && (video = aweme.getVideo()) != null && (kVar = this.f104879a.mo70807n().f104162s) != null) {
                Aweme aweme2 = this.f104879a.f104864g;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                int videoLength = video.getVideoLength() * 1000;
                if (str == null) {
                    str = "";
                }
                new C44756t(str, videoLength).mo76746c(kVar.f104318a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44948e(ProductDescVideoViewHolder productDescVideoViewHolder) {
            this.f104879a = productDescVideoViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$a */
    public static final class C44943a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104870a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104871b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104872c;

        static {
            Covode.recordClassIndex(53359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44943a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104870a = jediViewHolder;
            this.f104871b = cVar;
            this.f104872c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescVideoViewHolder.C44943a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_desc_ProductDescVideoViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87640x337f3d77(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$c */
    public static final class C44945c extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ C23119a f104873a;

        /* renamed from: b */
        final /* synthetic */ ProductDescVideoViewHolder f104874b;

        /* renamed from: c */
        final /* synthetic */ C44785n f104875c;

        static {
            Covode.recordClassIndex(53361);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            this.f104873a.f54729f = bitmap;
            TuxPlayerView tuxPlayerView = this.f104874b.f104865j;
            if (tuxPlayerView != null) {
                tuxPlayerView.setParams(this.f104873a);
            }
        }

        C44945c(C23119a aVar, ProductDescVideoViewHolder productDescVideoViewHolder, C44785n nVar) {
            this.f104873a = aVar;
            this.f104874b = productDescVideoViewHolder;
            this.f104875c = nVar;
        }
    }

    /* renamed from: a */
    public static boolean m87636a(View view) {
        C89219l.m154721d(view, "");
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        int i = (rect.bottom - rect.top) * (rect.right - rect.left);
        Rect c = C34729o.m70961c(view);
        if (((float) c.top) + (((float) c.height()) / 2.0f) < ((float) C45563h.f106106b) / 2.0f) {
            i -= c.width() * C34728n.m70946a(44.0d);
        }
        if (i >= (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        Window window;
        Window window2;
        VideoInfo videoInfo;
        Integer num;
        VideoInfo videoInfo2;
        Integer num2;
        VideoInfo videoInfo3;
        Integer num3;
        VideoInfo videoInfo4;
        C44785n nVar = (C44785n) obj;
        C89219l.m154721d(nVar, "");
        com.p2082ss.android.ugc.aweme.ecommerce.api.model.Video video = nVar.f104490a;
        Aweme aweme = new Aweme();
        Video video2 = new Video();
        C80770e eVar = new C80770e();
        eVar.setSourceId(video.f101644a);
        List<VideoInfo> list = video.f101648e;
        ViewGroup viewGroup = null;
        int i4 = 0;
        if (list == null || (videoInfo4 = (VideoInfo) C89070n.m154561b((List) list, 0)) == null) {
            str = null;
        } else {
            str = videoInfo4.f101649a;
        }
        eVar.setUri(str);
        eVar.setUrlList(new ArrayList());
        eVar.getUrlList().add(eVar.getUri());
        eVar.setUrlKey(video.f101644a);
        video2.setPlayAddr(eVar);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(video.f101646c);
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(urlModel.getUri());
        video2.setCover(urlModel);
        List<VideoInfo> list2 = video.f101648e;
        if (list2 == null || (videoInfo3 = (VideoInfo) C89070n.m154561b((List) list2, 0)) == null || (num3 = videoInfo3.f101652d) == null) {
            i = 0;
        } else {
            i = num3.intValue();
        }
        video2.setWidth(i);
        List<VideoInfo> list3 = video.f101648e;
        if (list3 == null || (videoInfo2 = (VideoInfo) C89070n.m154561b((List) list3, 0)) == null || (num2 = videoInfo2.f101653e) == null) {
            i2 = 0;
        } else {
            i2 = num2.intValue();
        }
        video2.setHeight(i2);
        Double d = video.f101645b;
        if (d != null) {
            i3 = (int) d.doubleValue();
        } else {
            i3 = 0;
        }
        video2.setVideoLength(i3);
        video2.setPlayAddrBytevc1(video2.getPlayAddr());
        aweme.setVideo(video2);
        aweme.setAid(video.f101644a);
        this.f104864g = aweme;
        Video video3 = aweme.getVideo();
        if (video3 != null) {
            C43614a aVar = this.f104863f;
            List<VideoInfo> list4 = nVar.f104490a.f101648e;
            if (!(list4 == null || (videoInfo = (VideoInfo) C89070n.m154561b((List) list4, 0)) == null || (num = videoInfo.f101657i) == null)) {
                i4 = num.intValue();
            }
            C89219l.m154721d(video3, "");
            aVar.f101662d = video3;
            aVar.f101663e = i4;
            C43614a aVar2 = this.f104863f;
            Aweme aweme2 = this.f104864g;
            C81079v vVar = aVar2.f101665g;
            if (vVar != null) {
                vVar.mo123936a(aweme2);
            }
            new C23119a();
            C23119a aVar3 = new C23119a();
            aVar3.f54724a = this.f104863f;
            aVar3.f54727d = new C23100g(video3.getWidth(), video3.getHeight());
            aVar3.f54728e = Integer.valueOf(video3.getVideoLength());
            aVar3.f54730g = this.f104867l;
            Fragment fragment = this.f104868m;
            if (fragment instanceof C44805i) {
                ActivityC0945e activity = fragment.getActivity();
                if (activity != null) {
                    window2 = activity.getWindow();
                } else {
                    window2 = null;
                }
                aVar3.f54726c = window2;
                ActivityC0945e activity2 = this.f104868m.getActivity();
                if (activity2 != null) {
                    viewGroup = (ViewGroup) activity2.findViewById(16908290);
                }
                aVar3.f54725b = viewGroup;
            } else if (fragment instanceof DialogInterface$OnCancelListenerC0944d) {
                if (!(fragment instanceof DialogInterface$OnCancelListenerC0944d)) {
                    fragment = null;
                }
                DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) fragment;
                if (dVar != null) {
                    Dialog dialog = dVar.getDialog();
                    if (dialog != null) {
                        window = dialog.getWindow();
                    } else {
                        window = null;
                    }
                    aVar3.f54726c = window;
                    Dialog dialog2 = dVar.getDialog();
                    if (dialog2 != null) {
                        viewGroup = (ViewGroup) dialog2.findViewById(16908290);
                    }
                    aVar3.f54725b = viewGroup;
                }
            }
            C20766v a = C20761r.m39060a(C34735v.m70965a(video3.getCover()));
            View view = this.itemView;
            C89219l.m154716b(view, "");
            a.f49105b = view.getContext();
            a.f49124u = Bitmap.Config.ARGB_8888;
            a.mo34182a(new C44945c(aVar3, this, nVar));
            TuxPlayerView tuxPlayerView = this.f104865j;
            if (tuxPlayerView != null) {
                tuxPlayerView.setParams(aVar3);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductDescVideoViewHolder(android.view.ViewGroup r5, androidx.fragment.app.Fragment r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559011(0x7f0d0263, float:1.8743354E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f104868m = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f104869o = r0
            android.view.View r1 = r4.itemView
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r0 = 2131369310(0x7f0a1d5e, float:1.8358595E38)
            android.view.View r1 = r1.findViewById(r0)
            com.bytedance.tux.extension.player.view.TuxPlayerView r1 = (com.bytedance.tux.extension.player.view.TuxPlayerView) r1
            com.ss.android.ugc.aweme.ecommerce.b.a r0 = new com.ss.android.ugc.aweme.ecommerce.b.a
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r0.<init>(r1)
            r4.f104863f = r0
            r4.f104865j = r1
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1
            r0.<init>(r4)
            r4.f104866k = r0
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$e r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$e
            r0.<init>(r4)
            r4.f104867l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescVideoViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.Fragment):void");
    }
}
