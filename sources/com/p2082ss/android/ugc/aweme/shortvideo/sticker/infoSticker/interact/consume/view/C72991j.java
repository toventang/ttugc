package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.google.gson.C27910f;
import com.google.gson.C28020m;
import com.google.gson.C28027t;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50461g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59089a;
import com.p2082ss.android.ugc.aweme.p2310al.C33486a;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69849b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.C75307b;
import com.p2082ss.android.ugc.aweme.sticker.data.C75308c;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.EnumC75306a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j */
public final class C72991j extends AbstractC72946a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public static final int f163791A = ((int) C84912r.m145930a(C17867d.m33078a(), 32.0f));

    /* renamed from: B */
    public static final C72993b f163792B = new C72993b((byte) 0);

    /* renamed from: t */
    public static final String f163793t = CaptionServiceImpl.m129181a().getCaptionCacheDir();

    /* renamed from: u */
    public static final int f163794u = ((int) C84912r.m145930a(C17867d.m33078a(), 200.0f));

    /* renamed from: v */
    public static final int f163795v = ((int) C84912r.m145930a(C17867d.m33078a(), 8.0f));

    /* renamed from: w */
    public static final int f163796w = (((int) C84912r.m145930a(C17867d.m33078a(), 58.0f)) + C34723i.m70927b());

    /* renamed from: x */
    public static final int f163797x;

    /* renamed from: y */
    public static final int f163798y;

    /* renamed from: z */
    public static final int f163799z;

    /* renamed from: C */
    private int f163800C;

    /* renamed from: D */
    private ValueAnimator f163801D;

    /* renamed from: E */
    private int f163802E;

    /* renamed from: F */
    private String f163803F;

    /* renamed from: G */
    private C75308c f163804G;

    /* renamed from: H */
    private int f163805H;

    /* renamed from: I */
    private final AbstractC89244h f163806I = C89250i.m154773a((AbstractC89171a) C72998g.f163828a);

    /* renamed from: J */
    private int f163807J;

    /* renamed from: K */
    private FrameLayout f163808K;

    /* renamed from: L */
    private FrameLayout f163809L;

    /* renamed from: a */
    public int f163810a = 2;

    /* renamed from: l */
    public volatile int f163811l;

    /* renamed from: m */
    public volatile String f163812m;

    /* renamed from: n */
    public AbstractC23317a f163813n;

    /* renamed from: o */
    public final C73000i f163814o;

    /* renamed from: p */
    public TextView f163815p;

    /* renamed from: q */
    public ImageView f163816q;

    /* renamed from: r */
    public View f163817r;

    /* renamed from: s */
    public Aweme f163818s;

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 11;
    }

    /* renamed from: c */
    public final ITranslatedCaptionService mo115415c() {
        return (ITranslatedCaptionService) this.f163806I.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(195, new RunnableC90250g(C72991j.class, "onAlwaysShowCaptionEvent", C33486a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(196, new RunnableC90250g(C72991j.class, "onCaptionHiddenStateEvent", C59089a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(197, new RunnableC90250g(C72991j.class, "onVideoPositionChangeEvent", C50461g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$b */
    public static final class C72993b {
        static {
            Covode.recordClassIndex(85696);
        }

        private C72993b() {
        }

        public /* synthetic */ C72993b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        AbstractC23317a aVar = this.f163813n;
        if (aVar != null && aVar.isShowing()) {
            return true;
        }
        FrameLayout frameLayout = this.f163808K;
        if (frameLayout == null || frameLayout.getX() > f || frameLayout.getX() + ((float) frameLayout.getWidth()) < f || frameLayout.getY() > f2 || frameLayout.getY() + ((float) frameLayout.getHeight()) < f2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        List<C75307b> autoCaptions;
        C75307b bVar2;
        String language;
        List<C75307b> autoCaptions2;
        C75307b bVar3;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C75384i iVar5;
        C75384i iVar6;
        List<C75307b> autoCaptions3;
        C75307b bVar4;
        C89219l.m154721d(bVar, "");
        C73991bj.m130133d("FeedCaptionView click captionview");
        if (!mo115224a(j, i, f, f2)) {
            return false;
        }
        int i2 = this.f163810a;
        if (i2 == 2) {
            C73991bj.m130133d("FeedCaptionView click caption isFirst: " + (!C69849b.m123425a()));
            if (!C69849b.m123425a()) {
                Activity j2 = C17873f.m33102j();
                if (!(j2 instanceof ActivityC0945e)) {
                    j2 = null;
                }
                ActivityC0945e eVar = (ActivityC0945e) j2;
                if (eVar != null) {
                    C69849b.f156091a.storeBoolean("has_tap_feed_caption", true);
                    C72990i iVar7 = new C72990i(this.f163695i, (byte) 0);
                    C23226a aVar = new C23226a.C23227a().mo37816a(iVar7).mo37815a(DialogInterface$OnDismissListenerC73006o.f163841a).f55057a;
                    iVar7.getBtnDismiss().setOnClickListener(new View$OnClickListenerC73004m(aVar));
                    iVar7.getIvClose().setOnClickListener(new View$OnClickListenerC73005n(aVar));
                    aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
                    AbstractC81915c.m141874a(new C33489d(true, false));
                }
                m128896r();
                C33744d a = new C33744d().mo59980a("use_transl", 0).mo59980a("have_transl", C50532ah.m94726b(this.f163818s) ? 1 : 0).mo59983a("subtitle_type", "creator");
                C75309d e = C50539g.m94751e(this.f163818s);
                C33744d a2 = a.mo59983a("subtitle_lang", (e == null || (autoCaptions3 = e.getAutoCaptions()) == null || (bVar4 = autoCaptions3.get(0)) == null) ? null : bVar4.getLanguage());
                C75391j jVar = this.f163697k;
                C33744d a3 = a2.mo59983a("group_id", (jVar == null || (iVar6 = jVar.f169463r) == null) ? null : iVar6.f169429c);
                C75391j jVar2 = this.f163697k;
                C33744d a4 = a3.mo59983a("author_id", (jVar2 == null || (iVar5 = jVar2.f169463r) == null) ? null : iVar5.f169428b);
                C75391j jVar3 = this.f163697k;
                C39162r.m79460a("subtitle_intro_show", a4.mo59983a("enter_from", (jVar3 == null || (iVar4 = jVar3.f169463r) == null) ? null : iVar4.f169427a).f79943a);
            } else {
                AbstractC23317a aVar2 = this.f163813n;
                if (aVar2 == null || !aVar2.isShowing()) {
                    mo115356b(f, f2);
                    m128896r();
                } else {
                    mo115311i();
                }
            }
        } else if (i2 == 0) {
            StringBuilder sb = new StringBuilder("FeedCaptionView flPb isVisibility ");
            FrameLayout frameLayout = this.f163809L;
            C73991bj.m130133d(sb.append(frameLayout != null && frameLayout.getVisibility() == 0).append(" curDownloadStatus ").append(this.f163802E).toString());
            FrameLayout frameLayout2 = this.f163809L;
            if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
                return true;
            }
            mo115415c().mo108887a(false);
            C33744d dVar = new C33744d();
            C75391j jVar4 = this.f163697k;
            C33744d a5 = dVar.mo59983a("group_id", (jVar4 == null || (iVar3 = jVar4.f169463r) == null) ? null : iVar3.f169429c);
            C75391j jVar5 = this.f163697k;
            C33744d a6 = a5.mo59983a("author_id", (jVar5 == null || (iVar2 = jVar5.f169463r) == null) ? null : iVar2.f169428b);
            C75391j jVar6 = this.f163697k;
            C33744d a7 = a6.mo59983a("enter_from", (jVar6 == null || (iVar = jVar6.f169463r) == null) ? null : iVar.f169427a).mo59980a("use_transl", 0).mo59983a("subtitle_type", "creator").mo59980a("have_transl", C50532ah.m94726b(this.f163818s) ? 1 : 0);
            C75309d e2 = C50539g.m94751e(this.f163818s);
            C39162r.m79460a("expand_subtitle", a7.mo59983a("subtitle_lang", (e2 == null || (autoCaptions2 = e2.getAutoCaptions()) == null || (bVar3 = autoCaptions2.get(0)) == null) ? null : bVar3.getLanguage()).f79943a);
            AbstractC81915c.m141874a(new C33486a(true, this));
            int i3 = this.f163802E;
            if (i3 == 1) {
                this.f163800C = 1;
                ImageView imageView = this.f163816q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                FrameLayout frameLayout3 = this.f163809L;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                this.f163817r = this.f163809L;
            } else if (i3 != 2) {
                C75309d e3 = C50539g.m94751e(this.f163818s);
                if (!(e3 == null || (autoCaptions = e3.getAutoCaptions()) == null || (bVar2 = (C75307b) C89070n.m154561b((List) autoCaptions, 0)) == null || (language = bVar2.getLanguage()) == null)) {
                    this.f163800C = 1;
                    this.f163802E = 1;
                    m128891b(language);
                    ImageView imageView2 = this.f163816q;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    FrameLayout frameLayout4 = this.f163809L;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                    }
                    this.f163817r = this.f163809L;
                }
            } else {
                this.f163817r = this.f163816q;
                mo115414a(true);
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$g */
    static final class C72998g extends AbstractC89220m implements AbstractC89171a<ITranslatedCaptionService> {

        /* renamed from: a */
        public static final C72998g f163828a = new C72998g();

        static {
            Covode.recordClassIndex(85701);
        }

        C72998g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ITranslatedCaptionService invoke() {
            return TranslatedCaptionCacheServiceImpl.m146355j();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
        m128895q();
        this.f163813n = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(8415);
        View view = new View(this.f163695i);
        MethodCollector.m26664o(8415);
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: i */
    public final void mo115311i() {
        AbstractC23317a aVar = this.f163813n;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    /* renamed from: q */
    private void m128895q() {
        if (this.f163811l != 0) {
            Downloader instance = Downloader.getInstance(this.f163695i);
            instance.removeMainThreadListener(this.f163811l, this.f163814o);
            instance.cancel(this.f163811l, true);
            this.f163811l = 0;
            this.f163812m = null;
        }
    }

    /* renamed from: g */
    private final void m128892g() {
        C75309d captionStruct;
        List<C75313h> utterances;
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && captionStruct.getUtterances() != null && (utterances = captionStruct.getUtterances()) != null) {
            C89070n.m154553a((Iterable) utterances, (Comparator) new C72992a());
            this.f163804G = new C75308c(utterances);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$j */
    public static final class CallableC73001j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f163834a;

        /* renamed from: b */
        final /* synthetic */ String f163835b;

        static {
            Covode.recordClassIndex(85704);
        }

        CallableC73001j(String str, String str2) {
            this.f163834a = str;
            this.f163835b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a = C13607d.m24438a(new File(this.f163834a));
            InetAddress byName = InetAddress.getByName(new URL(this.f163835b).getHost());
            C89219l.m154716b(byName, "");
            C73991bj.m130131b("FeedCaptionView url: " + this.f163835b + " file_md5: " + a + " ip: " + byName.getHostAddress());
            return C89391z.f203057a;
        }
    }

    /* renamed from: p */
    private final void m128894p() {
        if (!mo115415c().mo108890b()) {
            this.f163810a = 2;
            ImageView imageView = this.f163816q;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.f163815p;
            if (textView != null) {
                textView.setVisibility(8);
                textView.setAlpha(1.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
            }
            FrameLayout frameLayout = this.f163809L;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (this.f163802E == 2) {
                m128892g();
                return;
            }
            return;
        }
        this.f163810a = 0;
        TextView textView2 = this.f163815p;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView2 = this.f163816q;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.f163816q;
        if (imageView3 != null) {
            imageView3.setAlpha(1.0f);
        }
        FrameLayout frameLayout2 = this.f163809L;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    /* renamed from: r */
    private final void m128896r() {
        String str;
        String str2;
        String str3;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        List<C75307b> autoCaptions;
        C75307b bVar;
        C33744d a = new C33744d().mo59980a("have_transl", 0).mo59980a("use_transl", 0).mo59983a("subtitle_type", "creator");
        C75309d e = C50539g.m94751e(this.f163818s);
        String str4 = null;
        if (e == null || (autoCaptions = e.getAutoCaptions()) == null || (bVar = autoCaptions.get(0)) == null) {
            str = null;
        } else {
            str = bVar.getLanguage();
        }
        C33744d a2 = a.mo59983a("subtitle_lang", str);
        C75391j jVar = this.f163697k;
        if (jVar == null || (iVar3 = jVar.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169429c;
        }
        C33744d a3 = a2.mo59983a("group_id", str2);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169428b;
        }
        C33744d a4 = a3.mo59983a("author_id", str3);
        C75391j jVar3 = this.f163697k;
        if (!(jVar3 == null || (iVar = jVar3.f169463r) == null)) {
            str4 = iVar.f169427a;
        }
        C39162r.m79460a("click_subtitle", a4.mo59983a("enter_from", str4).f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$h */
    public static final class CallableC72999h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C72991j f163829a;

        /* renamed from: b */
        final /* synthetic */ String f163830b;

        /* renamed from: c */
        final /* synthetic */ String f163831c;

        /* renamed from: d */
        final /* synthetic */ int f163832d;

        static {
            Covode.recordClassIndex(85702);
        }

        CallableC72999h(C72991j jVar, String str, String str2, int i) {
            this.f163829a = jVar;
            this.f163830b = str;
            this.f163831c = str2;
            this.f163832d = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            C72991j jVar = this.f163829a;
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f163830b);
            with.f100629f = C72991j.f163793t;
            StringBuilder sb = new StringBuilder();
            Aweme aweme = this.f163829a.f163818s;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            with.f100626c = sb.append(str).append('_').append(this.f163831c).append(".json").toString();
            AbstractC43167a a = with.mo73399a(this.f163832d).mo73402a(true);
            a.f100600C = this.f163829a.f163814o;
            jVar.f163811l = a.mo73409f();
            this.f163829a.f163812m = this.f163830b;
            C73991bj.m130133d("FeedCaptionView start download caption,downloadId: " + this.f163829a.f163811l + " downloadUrl: " + this.f163829a.f163812m);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(85694);
        int a = (int) C84912r.m145930a(C17867d.m33078a(), 16.0f);
        f163797x = a;
        int a2 = (int) C84912r.m145930a(C17867d.m33078a(), 56.0f);
        f163798y = a2;
        f163799z = Math.min((int) C84912r.m145930a(C17867d.m33078a(), 320.0f), (C34723i.m70928b(C17867d.m33078a()) - a) - a2);
    }

    /* renamed from: o */
    private final void m128893o() {
        int a;
        C75309d captionStruct;
        C75309d captionStruct2;
        if (this.f163815p != null) {
            if (this.f163813n == null) {
                InteractStickerStruct interactStickerStruct = this.f163692f;
                if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null || captionStruct2.getLocation() != EnumC75306a.LEFT_BOTTOM.getValue()) {
                    a = (int) C84912r.m145930a(this.f163695i, 8.0f);
                } else {
                    a = -((int) C84912r.m145930a(this.f163695i, 8.0f));
                }
                C23319b bVar = new C23319b(this.f163695i);
                TextView textView = this.f163815p;
                if (textView == null) {
                    C89219l.m154715b();
                }
                AbstractC23332b d = ((C23319b) bVar.mo38041b(textView).mo38028a(C0643b.m2378c(this.f163695i, R.color.c7)).mo38030a(-1001L).mo38040b(0L)).mo38011a(new C73007p(this)).mo38039b(a).mo38036a(false).mo38046d(f163797x);
                InteractStickerStruct interactStickerStruct2 = this.f163692f;
                if (interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || captionStruct.getLocation() != EnumC75306a.LEFT_BOTTOM.getValue()) {
                    d.mo38034a(EnumC23352h.BOTTOM);
                } else {
                    d.mo38034a(EnumC23352h.TOP);
                }
                this.f163813n = d.mo38012d();
            }
            AbstractC23317a aVar = this.f163813n;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo38001a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        int b;
        int i;
        ViewGroup.LayoutParams layoutParams;
        C75307b bVar;
        String language;
        C75309d captionStruct;
        LayoutInflater from = LayoutInflater.from(this.f163695i);
        View view = this.f163696j;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View a = C1764a.m5927a(from, R.layout.bik, (ViewGroup) view, false);
        C0792v.m2759b(a, C80471gb.m139482a() ? 1 : 0);
        this.f163815p = (TextView) a.findViewById(R.id.etc);
        this.f163808K = (FrameLayout) a.findViewById(R.id.b3q);
        this.f163816q = (ImageView) a.findViewById(R.id.btl);
        this.f163809L = (FrameLayout) a.findViewById(R.id.b54);
        ProgressBar progressBar = (ProgressBar) a.findViewById(R.id.czy);
        C89219l.m154716b(progressBar, "");
        progressBar.getIndeterminateDrawable().setColorFilter(C0643b.m2378c(this.f163695i, R.color.ac), PorterDuff.Mode.SRC_IN);
        this.f163800C = 0;
        C75309d e = C50539g.m94751e(this.f163818s);
        if (e != null) {
            C75391j jVar = this.f163697k;
            if (jVar != null) {
                b = (int) jVar.f169446a;
            } else {
                b = C34723i.m70928b(this.f163695i);
            }
            TextView textView = this.f163815p;
            if (textView != null) {
                textView.setMaxWidth(f163799z);
            }
            ViewParent parent = ((ViewGroup) this.f163696j).getParent();
            C89219l.m154716b(parent, "");
            ViewParent parent2 = parent.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            int width = ((ViewGroup) parent2).getWidth();
            if (width == 0) {
                width = C34723i.m70928b(this.f163695i);
            }
            C73991bj.m130133d("FeedCaptionView getView videoWidth " + b + " screenWidth " + width);
            int i2 = f163797x;
            int i3 = ((b - width) / 2) + i2;
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || captionStruct.getLocation() != EnumC75306a.LEFT_TOP.getValue()) {
                i = 80;
            } else {
                i = 48;
            }
            FrameLayout frameLayout = this.f163808K;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.gravity = i | 8388611;
                layoutParams2.setMarginStart(i3);
                layoutParams2.setMarginEnd((f163798y - i2) + i3);
            }
            if (!C84892d.m145850a(e.getUtterances())) {
                this.f163802E = 2;
                List<C75313h> utterances = e.getUtterances();
                if (utterances != null) {
                    this.f163804G = new C75308c(utterances);
                }
            } else {
                this.f163802E = 0;
                List<C75307b> autoCaptions = e.getAutoCaptions();
                if (!(autoCaptions == null || (bVar = (C75307b) C89070n.m154561b((List) autoCaptions, 0)) == null || (language = bVar.getLanguage()) == null)) {
                    this.f163802E = 1;
                    m128891b(language);
                }
            }
        }
        m128894p();
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115314a(InteractStickerStruct interactStickerStruct) {
        super.mo115314a(interactStickerStruct);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$p */
    public static final class C73007p extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72991j f163842a;

        static {
            Covode.recordClassIndex(85710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73007p(C72991j jVar) {
            super(1);
            this.f163842a = jVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$p$a */
        public static final class View$OnClickListenerC73008a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C73007p f163843a;

            static {
                Covode.recordClassIndex(85711);
            }

            View$OnClickListenerC73008a(C73007p pVar) {
                this.f163843a = pVar;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                C75384i iVar;
                C75384i iVar2;
                C75384i iVar3;
                List<C75307b> autoCaptions;
                C75307b bVar;
                ClickAgent.onClick(view);
                this.f163843a.f163842a.mo115415c().mo108887a(true);
                C72991j jVar = this.f163843a.f163842a;
                C33744d a = new C33744d().mo59980a("use_transl", 0).mo59983a("subtitle_type", "creator").mo59980a("have_transl", C50532ah.m94726b(jVar.f163818s) ? 1 : 0);
                C75309d e = C50539g.m94751e(jVar.f163818s);
                String str4 = null;
                if (e == null || (autoCaptions = e.getAutoCaptions()) == null || (bVar = autoCaptions.get(0)) == null) {
                    str = null;
                } else {
                    str = bVar.getLanguage();
                }
                C33744d a2 = a.mo59983a("subtitle_lang", str);
                C75391j jVar2 = jVar.f163697k;
                if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
                    str2 = null;
                } else {
                    str2 = iVar3.f169429c;
                }
                C33744d a3 = a2.mo59983a("group_id", str2);
                C75391j jVar3 = jVar.f163697k;
                if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
                    str3 = null;
                } else {
                    str3 = iVar2.f169428b;
                }
                C33744d a4 = a3.mo59983a("author_id", str3);
                C75391j jVar4 = jVar.f163697k;
                if (!(jVar4 == null || (iVar = jVar4.f169463r) == null)) {
                    str4 = iVar.f169427a;
                }
                C39162r.m79460a("hide_subtitle", a4.mo59983a("enter_from", str4).f79943a);
                AbstractC81915c.m141874a(new C33486a(false, this.f163843a.f163842a));
                this.f163843a.f163842a.mo115414a(false);
                AbstractC23317a aVar = this.f163843a.f163842a.f163813n;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C23322d.C23324b bVar = new C23322d.C23324b();
            bVar.f55282c = R.string.h74;
            bVar.f55285f = new View$OnClickListenerC73008a(this);
            dVar2.mo38015a(bVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$d */
    public static final class C72995d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C72991j f163823a;

        static {
            Covode.recordClassIndex(85698);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72995d(C72991j jVar) {
            this.f163823a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f163823a.f163817r;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f163823a.f163810a = 2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$f */
    public static final class C72997f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C72991j f163827a;

        static {
            Covode.recordClassIndex(85700);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72997f(C72991j jVar) {
            this.f163827a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            TextView textView = this.f163827a.f163815p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f163827a.f163810a = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$i */
    public static final class C73000i extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C72991j f163833a;

        static {
            Covode.recordClassIndex(85703);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73000i(C72991j jVar) {
            this.f163833a = jVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            C72991j jVar = this.f163833a;
            if (downloadInfo != null) {
                str = downloadInfo.getTargetFilePath();
            } else {
                str = null;
            }
            jVar.mo115412a(str);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            String str2;
            String url;
            super.onFailed(downloadInfo, baseException);
            Aweme aweme = this.f163833a.f163818s;
            String str3 = "";
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = str3;
            }
            if (!(downloadInfo == null || (url = downloadInfo.getUrl()) == null)) {
                str3 = url;
            }
            C72991j.m128889a(1, str, str3, 0);
            C72991j jVar = this.f163833a;
            String str4 = null;
            if (downloadInfo != null) {
                str2 = downloadInfo.getTargetFilePath();
                str4 = downloadInfo.getUrl();
            } else {
                str2 = null;
            }
            jVar.mo115413a(str2, str4, baseException);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$k */
    public static final class C73002k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C72991j f163836a;

        /* renamed from: b */
        final /* synthetic */ Exception f163837b;

        static {
            Covode.recordClassIndex(85705);
        }

        C73002k(C72991j jVar, Exception exc) {
            this.f163836a = jVar;
            this.f163837b = exc;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f163836a.mo115411a(this.f163837b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$l */
    public static final class C73003l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C73003l f163838a = new C73003l();

        static {
            Covode.recordClassIndex(85706);
        }

        C73003l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C73991bj.m130129a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$m */
    static final class View$OnClickListenerC73004m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f163839a;

        static {
            Covode.recordClassIndex(85707);
        }

        View$OnClickListenerC73004m(C23226a aVar) {
            this.f163839a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163839a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$n */
    static final class View$OnClickListenerC73005n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f163840a;

        static {
            Covode.recordClassIndex(85708);
        }

        View$OnClickListenerC73005n(C23226a aVar) {
            this.f163840a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163840a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$o */
    static final class DialogInterface$OnDismissListenerC73006o implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC73006o f163841a = new DialogInterface$OnDismissListenerC73006o();

        static {
            Covode.recordClassIndex(85709);
        }

        DialogInterface$OnDismissListenerC73006o() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC81915c.m141874a(new C33489d(false, false));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: b */
    public final void mo115310b(int i) {
        super.mo115310b(i);
        m128895q();
        EventBus.m156962a().mo145395b(this);
        ValueAnimator valueAnimator = this.f163801D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCaptionHiddenStateEvent(C59089a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.f134496a && this.f163810a == 2) {
            return;
        }
        if (aVar.f134496a || this.f163810a != 0) {
            m128894p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onAlwaysShowCaptionEvent(C33486a aVar) {
        C89219l.m154721d(aVar, "");
        if (!C89219l.m154714a(this, aVar.f79556b)) {
            if (aVar.f79555a && this.f163810a == 2) {
                return;
            }
            if (aVar.f79555a || this.f163810a != 0) {
                m128894p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$c */
    public static final class C72994c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C72991j f163819a;

        /* renamed from: b */
        final /* synthetic */ boolean f163820b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f163821c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f163822d;

        static {
            Covode.recordClassIndex(85697);
        }

        C72994c(C72991j jVar, boolean z, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
            this.f163819a = jVar;
            this.f163820b = z;
            this.f163821c = cVar;
            this.f163822d = cVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f163819a.f163817r;
            if (view != null) {
                C89219l.m154716b(valueAnimator, "");
                view.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f163820b) {
                TextView textView = this.f163819a.f163815p;
                if (textView != null) {
                    C89219l.m154716b(valueAnimator, "");
                    textView.setAlpha(valueAnimator.getAnimatedFraction());
                }
                TextView textView2 = this.f163819a.f163815p;
                if (textView2 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    textView2.setScaleX(((((float) C72991j.f163791A) * 1.0f) / ((float) this.f163821c.element)) + ((((float) (this.f163821c.element - C72991j.f163791A)) * valueAnimator.getAnimatedFraction()) / ((float) this.f163821c.element)));
                }
                TextView textView3 = this.f163819a.f163815p;
                if (textView3 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    textView3.setScaleY(((((float) C72991j.f163791A) * 1.0f) / ((float) this.f163822d.element)) + ((((float) (this.f163822d.element - C72991j.f163791A)) * valueAnimator.getAnimatedFraction()) / ((float) this.f163822d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$e */
    public static final class C72996e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C72991j f163824a;

        /* renamed from: b */
        final /* synthetic */ int f163825b;

        /* renamed from: c */
        final /* synthetic */ int f163826c;

        static {
            Covode.recordClassIndex(85699);
        }

        C72996e(C72991j jVar, int i, int i2) {
            this.f163824a = jVar;
            this.f163825b = i;
            this.f163826c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f163824a.f163816q;
            if (imageView != null) {
                C89219l.m154716b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            TextView textView = this.f163824a.f163815p;
            if (textView != null) {
                C89219l.m154716b(valueAnimator, "");
                textView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            TextView textView2 = this.f163824a.f163815p;
            if (textView2 != null) {
                int i = this.f163825b;
                C89219l.m154716b(valueAnimator, "");
                textView2.setScaleX(((((float) i) - (((float) (i - C72991j.f163791A)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f163825b));
            }
            TextView textView3 = this.f163824a.f163815p;
            if (textView3 != null) {
                int i2 = this.f163826c;
                C89219l.m154716b(valueAnimator, "");
                textView3.setScaleY(((((float) i2) - (((float) (i2 - C72991j.f163791A)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f163826c));
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onVideoPositionChangeEvent(C50461g gVar) {
        String str;
        String str2;
        int i;
        int i2;
        C89219l.m154721d(gVar, "");
        Aweme aweme = this.f163818s;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = gVar.f116550a;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (!(!C89219l.m154714a((Object) str, (Object) str2))) {
            Long l = gVar.f116551b;
            if (l != null) {
                i = (int) l.longValue();
            } else {
                i = 0;
            }
            this.f163805H = i;
            if (this.f163810a == 2) {
                AbstractC23317a aVar = this.f163813n;
                if (aVar == null || !aVar.isShowing()) {
                    C75308c cVar = this.f163804G;
                    if (cVar != null) {
                        Long l2 = gVar.f116551b;
                        if (l2 != null) {
                            i2 = (int) l2.longValue();
                        } else {
                            i2 = 0;
                        }
                        str3 = cVar.mo118854a(i2);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        TextView textView = this.f163815p;
                        if (textView != null) {
                            textView.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    TextView textView2 = this.f163815p;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = this.f163815p;
                    if (textView3 != null) {
                        textView3.setText(str3);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m128891b(String str) {
        String str2;
        String a;
        C75309d captionStruct;
        C75309d captionStruct2;
        C75309d captionStruct3;
        StringBuilder append = new StringBuilder("FeedCaptionView switchCaptionLang trySelectLang ").append(str).append(" toSelectLang ").append(this.f163803F).append(" aweme curSelectLang ");
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct == null || (captionStruct3 = interactStickerStruct.getCaptionStruct()) == null) {
            str2 = null;
        } else {
            str2 = captionStruct3.getSelectLang();
        }
        C73991bj.m130133d(append.append(str2).toString());
        if (str == null || str.length() == 0) {
            C73991bj.m130133d("FeedCaptionView selectLang has not initialized");
        } else if (!C89219l.m154714a((Object) str, (Object) this.f163803F)) {
            this.f163803F = str;
            this.f163807J = 0;
            m128895q();
            TextView textView = this.f163815p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (!(interactStickerStruct2 == null || (captionStruct2 = interactStickerStruct2.getCaptionStruct()) == null)) {
                captionStruct2.setSelectLang("null");
            }
            InteractStickerStruct interactStickerStruct3 = this.f163692f;
            if (!(interactStickerStruct3 == null || (captionStruct = interactStickerStruct3.getCaptionStruct()) == null)) {
                captionStruct.setUtterances(null);
            }
            this.f163804G = null;
            if (!C89219l.m154714a((Object) "null", (Object) str) && (a = m128888a(this.f163692f, this.f163803F)) != null && a.length() != 0) {
                if (C89361p.m154874b(a, "http", false)) {
                    m128890a(a, this.f163803F, 3);
                } else {
                    mo115412a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo115411a(Exception exc) {
        String str;
        C75309d captionStruct;
        this.f163802E = 3;
        StringBuilder sb = new StringBuilder("FeedCaptionView download captions failed aid ");
        Aweme aweme = this.f163818s;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C73991bj.m130131b(sb.append(str).append(" lang ").append(this.f163803F).append(" url ").append(this.f163812m).toString());
        C73991bj.m130129a(exc);
        new C23144b(this.f163696j).mo37640e(R.string.a9o).mo37637b();
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (!(interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null)) {
            str2 = captionStruct.getSelectLang();
        }
        this.f163803F = str2;
        m128895q();
    }

    /* renamed from: a */
    public final void mo115412a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        C75309d captionStruct;
        C75309d captionStruct2;
        String str6;
        long length = new File(str).length();
        StringBuilder sb = new StringBuilder("FeedCaptionView load caption aid ");
        Aweme aweme = this.f163818s;
        List<C75313h> list = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        C73991bj.m130133d(sb.append(str2).append(" lang ").append(this.f163803F).append(" downloadId ").append(this.f163811l).append(" url ").append(this.f163812m).append(" file ").append(str).append(' ').append("fileSize ").append(length).toString());
        String str7 = "";
        if (!C80313cs.m139231a(str)) {
            C22708a.m42800a("caption file not exists");
            Aweme aweme2 = this.f163818s;
            if (aweme2 == null || (str6 = aweme2.getAid()) == null) {
                str6 = str7;
            }
            String str8 = this.f163812m;
            if (str8 != null) {
                str7 = str8;
            }
            m128889a(3, str6, str7, length);
            return;
        }
        try {
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (!(interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null)) {
                C75309d dVar = (C75309d) new C27910f().mo46669a((Reader) new FileReader(str), C75309d.class);
                if (dVar != null) {
                    list = dVar.getUtterances();
                }
                captionStruct2.setUtterances(list);
            }
            Aweme aweme3 = this.f163818s;
            if (aweme3 == null || (str5 = aweme3.getAid()) == null) {
                str5 = str7;
            }
            String str9 = this.f163812m;
            if (str9 != null) {
                str7 = str9;
            }
            m128889a(0, str5, str7, length);
            this.f163802E = 2;
            InteractStickerStruct interactStickerStruct2 = this.f163692f;
            if (!(interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null)) {
                captionStruct.setSelectLang(this.f163803F);
            }
            m128895q();
            m128892g();
            if (this.f163800C == 1) {
                this.f163817r = this.f163809L;
                mo115414a(true);
                this.f163800C = 0;
            }
        } catch (Exception e) {
            if (!(e instanceof C28020m) && !(e instanceof C28027t)) {
                Aweme aweme4 = this.f163818s;
                if (aweme4 == null || (str4 = aweme4.getAid()) == null) {
                    str4 = str7;
                }
                String str10 = this.f163812m;
                if (str10 != null) {
                    str7 = str10;
                }
                m128889a(4, str4, str7, length);
                mo115411a(e);
            } else if (this.f163807J < 3) {
                String str11 = this.f163812m;
                if (str11 != null) {
                    str7 = str11;
                }
                m128895q();
                C73991bj.m130132c("FeedCaptionView retry downloading captions because parse failed");
                m128890a(str7, this.f163803F, 1);
                this.f163807J++;
            } else {
                Aweme aweme5 = this.f163818s;
                if (aweme5 == null || (str3 = aweme5.getAid()) == null) {
                    str3 = str7;
                }
                String str12 = this.f163812m;
                if (str12 != null) {
                    str7 = str12;
                }
                m128889a(2, str3, str7, length);
                mo115413a(str, this.f163812m, e);
            }
        }
    }

    /* renamed from: a */
    public final void mo115414a(boolean z) {
        TextView textView;
        String str;
        TextView textView2;
        C75309d captionStruct;
        TextView textView3;
        C75309d captionStruct2;
        TextView textView4;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(200L);
        this.f163801D = ofInt;
        if (!C80471gb.m139482a() && (textView4 = this.f163815p) != null) {
            textView4.setPivotX(0.0f);
        }
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null || captionStruct2.getLocation() != EnumC75306a.LEFT_BOTTOM.getValue()) {
            TextView textView5 = this.f163815p;
            if (textView5 != null) {
                textView5.setPivotY(0.0f);
            }
        } else {
            TextView textView6 = this.f163815p;
            if (textView6 != null) {
                textView6.setPivotY((float) textView6.getHeight());
            }
        }
        if (z) {
            this.f163810a = 3;
            TextView textView7 = this.f163815p;
            if (textView7 != null) {
                textView7.setScaleX(1.0f);
            }
            TextView textView8 = this.f163815p;
            if (textView8 != null) {
                textView8.setScaleY(1.0f);
            }
            C75308c cVar = this.f163804G;
            if (cVar != null) {
                str = cVar.mo118854a(this.f163805H);
            } else {
                str = null;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            C89233z.C89236c cVar2 = new C89233z.C89236c();
            int i = f163799z;
            cVar2.element = i;
            C89233z.C89236c cVar3 = new C89233z.C89236c();
            cVar3.element = f163791A;
            if (isEmpty) {
                TextView textView9 = this.f163815p;
                if (textView9 != null) {
                    textView9.setAlpha(1.0f);
                }
                TextView textView10 = this.f163815p;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            } else {
                TextView textView11 = this.f163815p;
                if (textView11 != null) {
                    textView11.setVisibility(0);
                }
                TextView textView12 = this.f163815p;
                if (textView12 != null) {
                    textView12.setAlpha(0.0f);
                }
                TextView textView13 = this.f163815p;
                if (textView13 != null) {
                    textView13.setText(str);
                }
                TextView textView14 = this.f163815p;
                if (textView14 != null) {
                    textView14.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                TextView textView15 = this.f163815p;
                if (textView15 == null) {
                    C89219l.m154715b();
                }
                cVar2.element = textView15.getMeasuredWidth();
                TextView textView16 = this.f163815p;
                if (textView16 == null) {
                    C89219l.m154715b();
                }
                cVar3.element = textView16.getMeasuredHeight();
                InteractStickerStruct interactStickerStruct2 = this.f163692f;
                if (!(interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || captionStruct.getLocation() != EnumC75306a.LEFT_BOTTOM.getValue() || (textView3 = this.f163815p) == null)) {
                    textView3.setPivotY((float) cVar3.element);
                }
                if (C80471gb.m139482a() && (textView2 = this.f163815p) != null) {
                    textView2.setPivotX((float) cVar2.element);
                }
            }
            ofInt.addUpdateListener(new C72994c(this, isEmpty, cVar2, cVar3));
            ofInt.addListener(new C72995d(this));
        } else {
            this.f163810a = 1;
            TextView textView17 = this.f163815p;
            if (textView17 == null) {
                C89219l.m154715b();
            }
            int width = textView17.getWidth();
            TextView textView18 = this.f163815p;
            if (textView18 == null) {
                C89219l.m154715b();
            }
            int height = textView18.getHeight();
            if (C80471gb.m139482a() && (textView = this.f163815p) != null) {
                textView.setPivotX((float) width);
            }
            ImageView imageView = this.f163816q;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f163816q;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            ofInt.addUpdateListener(new C72996e(this, width, height));
            ofInt.addListener(new C72997f(this));
        }
        ofInt.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$a */
    public static final class C72992a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85695);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.getStartTime()), Long.valueOf(t2.getStartTime()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: b */
    public final boolean mo115356b(float f, float f2) {
        AbstractC81915c.m141874a(new C49681i(hashCode()));
        m128893o();
        return true;
    }

    /* renamed from: a */
    private static String m128888a(InteractStickerStruct interactStickerStruct, String str) {
        C75309d captionStruct;
        List<String> urlList;
        String str2;
        if (interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null) {
            return null;
        }
        List<C75307b> autoCaptions = captionStruct.getAutoCaptions();
        if (autoCaptions == null) {
            autoCaptions = C89086z.INSTANCE;
        }
        for (C75307b bVar : autoCaptions) {
            if (C89219l.m154714a((Object) bVar.getLanguage(), (Object) str)) {
                UrlModel url = bVar.getUrl();
                if (url == null || (urlList = url.getUrlList()) == null || (str2 = (String) C89070n.m154561b((List) urlList, 0)) == null) {
                    return "";
                }
                return str2;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: b */
    public final void mo115315b(int i, int i2) {
        int value;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        C75309d captionStruct;
        List<C75313h> utterances;
        C75313h hVar;
        C75309d captionStruct2;
        super.mo115315b(i, i2);
        InteractStickerStruct interactStickerStruct = this.f163692f;
        if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null) {
            value = EnumC75306a.LEFT_BOTTOM.getValue();
        } else {
            value = captionStruct2.getLocation();
        }
        ViewParent parent = this.f163696j.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int i3 = viewGroup.getLayoutParams().height;
        InteractStickerStruct interactStickerStruct2 = this.f163692f;
        if (!(interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || (utterances = captionStruct.getUtterances()) == null || (hVar = (C75313h) C89070n.m154561b((List) utterances, 0)) == null)) {
            hVar.getText();
        }
        FrameLayout frameLayout = this.f163808K;
        FrameLayout.LayoutParams layoutParams6 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams7 == null) {
            return;
        }
        if (value == EnumC75306a.LEFT_BOTTOM.getValue()) {
            layoutParams7.gravity = 8388691;
            TextView textView = this.f163815p;
            if (textView != null) {
                layoutParams4 = textView.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
                layoutParams4 = null;
            }
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams4;
            if (layoutParams8 != null) {
                layoutParams8.gravity = 8388691;
            }
            ImageView imageView = this.f163816q;
            if (imageView != null) {
                layoutParams5 = imageView.getLayoutParams();
            } else {
                layoutParams5 = null;
            }
            if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                layoutParams6 = layoutParams5;
            }
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams6;
            if (layoutParams9 != null) {
                layoutParams9.gravity = 8388691;
            }
            layoutParams7.bottomMargin = (((viewGroup.getLayoutParams().height + i2) / 2) - i) + f163795v;
            FrameLayout frameLayout2 = this.f163808K;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams7);
            }
            C73991bj.m130133d("FeedCaptionView caption location: start_bottom bottomMargin: " + layoutParams7.bottomMargin);
        } else if (value == EnumC75306a.LEFT_TOP.getValue()) {
            layoutParams7.gravity = 8388659;
            TextView textView2 = this.f163815p;
            if (textView2 != null) {
                layoutParams2 = textView2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (!(layoutParams2 instanceof FrameLayout.LayoutParams)) {
                layoutParams2 = null;
            }
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams10 != null) {
                layoutParams10.gravity = 8388659;
            }
            ImageView imageView2 = this.f163816q;
            if (imageView2 != null) {
                layoutParams3 = imageView2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams6 = layoutParams3;
            }
            FrameLayout.LayoutParams layoutParams11 = layoutParams6;
            if (layoutParams11 != null) {
                layoutParams11.gravity = 8388659;
            }
            layoutParams7.topMargin = ((viewGroup.getLayoutParams().height - i2) / 2) + f163796w;
            FrameLayout frameLayout3 = this.f163808K;
            if (frameLayout3 != null) {
                frameLayout3.setLayoutParams(layoutParams7);
            }
            C73991bj.m130133d("FeedCaptionView caption location: start_top topMargin: " + layoutParams7.topMargin);
        }
    }

    /* renamed from: a */
    private final void m128890a(String str, String str2, int i) {
        C1731i.m5640b(new CallableC72999h(this, str, str2, i), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo115413a(String str, String str2, Exception exc) {
        if (str2 == null || str == null) {
            mo115411a(exc);
        } else {
            AbstractC88403ab.m153604a((Callable) new CallableC73001j(str, str2)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C73002k(this, exc), C73003l.f163838a);
        }
    }

    /* renamed from: a */
    public static void m128889a(int i, String str, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aweme_id", str);
        jSONObject.put("url", str2);
        jSONObject.put("file_size", j);
        C12290b.m22060a("load_captions", i, jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72991j(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, Aweme aweme) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163818s = aweme;
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f163814o = new C73000i(this);
    }
}
