package com.p2082ss.android.ugc.aweme.editSticker.text;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.C45905a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45889g;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46043d;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewState;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.AbstractC46045a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46121g;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.C46123i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73949aj;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.C88296t;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Pattern;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.a */
public class C45940a implements AbstractC20382b, C77268b.AbstractC77269a {

    /* renamed from: F */
    public static final C45941a f107005F = new C45941a((byte) 0);

    /* renamed from: A */
    public final AbstractC45899e f107006A;

    /* renamed from: B */
    public final LiveData<AbstractC31071f> f107007B;

    /* renamed from: C */
    public final AbstractC46043d f107008C;

    /* renamed from: D */
    public Rect f107009D;

    /* renamed from: E */
    public AbstractC45920e f107010E;

    /* renamed from: G */
    private C77268b f107011G;

    /* renamed from: H */
    private C46121g f107012H;

    /* renamed from: I */
    private Runnable f107013I;

    /* renamed from: J */
    private int f107014J;

    /* renamed from: K */
    private boolean f107015K;

    /* renamed from: L */
    private C89378p<Integer, Integer> f107016L;

    /* renamed from: M */
    private final AbstractC14552j f107017M;

    /* renamed from: N */
    private final int f107018N;

    /* renamed from: O */
    private final boolean f107019O;

    /* renamed from: P */
    private final boolean f107020P;

    /* renamed from: a */
    protected EditTextStickerViewModel f107021a;

    /* renamed from: b */
    public StickerHintTextViewModel f107022b;

    /* renamed from: c */
    View f107023c;

    /* renamed from: d */
    public C46239q f107024d;

    /* renamed from: e */
    public AbstractC46119e f107025e;

    /* renamed from: f */
    public AbstractC45895b f107026f;

    /* renamed from: g */
    public AbstractC89172b<? super C46239q, C89391z> f107027g;

    /* renamed from: h */
    public AbstractC89172b<? super C46239q, C89391z> f107028h;

    /* renamed from: i */
    public AbstractC46120f f107029i;

    /* renamed from: j */
    public AbstractC45872e f107030j;

    /* renamed from: k */
    public AbstractC89183m<? super C46239q, ? super C46239q, C89391z> f107031k;

    /* renamed from: l */
    public AbstractC46118d f107032l;

    /* renamed from: m */
    public boolean f107033m;

    /* renamed from: n */
    protected SafeHandler f107034n;

    /* renamed from: o */
    public int f107035o;

    /* renamed from: p */
    public long f107036p;

    /* renamed from: q */
    public boolean f107037q;

    /* renamed from: r */
    public final C45902g f107038r;

    /* renamed from: s */
    public boolean f107039s;

    /* renamed from: t */
    public boolean f107040t;

    /* renamed from: u */
    public final int f107041u;

    /* renamed from: v */
    final ActivityC0945e f107042v;

    /* renamed from: w */
    public final AbstractC72510a f107043w;

    /* renamed from: x */
    public final boolean f107044x;

    /* renamed from: y */
    public final FrameLayout f107045y;

    /* renamed from: z */
    public final C46224i f107046z;

    static {
        Covode.recordClassIndex(54473);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo77541c(TextStickerData textStickerData) {
    }

    /* renamed from: e */
    public void mo77545e() {
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo77556n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$a */
    public static final class C45941a {
        static {
            Covode.recordClassIndex(54474);
        }

        private C45941a() {
        }

        public /* synthetic */ C45941a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m88740a(String str) {
            C89219l.m154721d(str, "");
            if (str.length() > 150) {
                return false;
            }
            List<String> list = C45890g.m88534a().f106868h;
            if (list == null || list.isEmpty()) {
                list = C89070n.m154522b("^why .*", "^what .*", "^when .*", "^where .*", "^who .*", "^how .*", ".*could you .*", ".*can you .*", ".*would you .*");
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Locale locale = Locale.US;
                C89219l.m154716b(locale, "");
                String lowerCase = str.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                if (Pattern.matches(it.next(), lowerCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final void mo77532a(boolean z) {
        AbstractC31071f value;
        int audioTrackIndex;
        LiveData<AbstractC31071f> liveData = this.f107007B;
        if (liveData != null && (value = liveData.getValue()) != null) {
            EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
            if (editTextStickerViewModel == null) {
                C89219l.m154710a("textStickerViewModel");
            }
            Iterator<T> it = editTextStickerViewModel.f107132e.iterator();
            while (it.hasNext()) {
                TextStickerData data = it.next().getData();
                if (!(data == null || (audioTrackIndex = data.getAudioTrackIndex()) == -1)) {
                    if (z) {
                        value.mo56313a(audioTrackIndex, 1, 0.0f);
                    } else {
                        value.mo56313a(audioTrackIndex, 1, 1.0f);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77531a(List<TextStickerTextWrap> list) {
        C89219l.m154721d(list, "");
        C46239q qVar = this.f107024d;
        if (qVar != null) {
            mo77541c(qVar.getData());
            int curTxtMode = this.f107046z.getCurTxtMode();
            int curColor = this.f107046z.getCurColor();
            int alignTxt = this.f107046z.getAlignTxt();
            C45989b a = C45989b.m88764a();
            C89219l.m154716b(a, "");
            qVar.mo78536a(curTxtMode, curColor, alignTxt, a.f107109d);
            qVar.setFontSize(mo77543d());
            TextStickerData data = qVar.getData();
            qVar.mo78544b(list, data != null ? data.getEffectTextLayoutConfig() : null);
            return;
        }
        m88697b(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$an */
    public static final class RunnableC45956an implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45940a f107061a;

        /* renamed from: b */
        private int f107062b = -1;

        /* renamed from: c */
        private Runnable f107063c = new RunnableC45957a(this);

        static {
            Covode.recordClassIndex(54489);
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$an$a */
        static final class RunnableC45957a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RunnableC45956an f107064a;

            static {
                Covode.recordClassIndex(54490);
            }

            RunnableC45957a(RunnableC45956an anVar) {
                this.f107064a = anVar;
            }

            public final void run() {
                int i = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            AbstractC31071f value;
            int k;
            Runnable runnable = this.f107063c;
            if (runnable != null) {
                runnable.run();
                this.f107063c = null;
            }
            this.f107061a.mo77534b().postDelayed(this, 16);
            LiveData<AbstractC31071f> liveData = this.f107061a.f107007B;
            if (!(liveData == null || (value = liveData.getValue()) == null || !this.f107061a.mo77522a().mo77640o() || (k = value.mo56370k()) == this.f107062b)) {
                this.f107062b = k;
                long j = (long) k;
                for (C46239q qVar : this.f107061a.mo77522a().f107132e) {
                    qVar.setPlayPosition(j);
                    qVar.mo78581o();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC45956an(C45940a aVar) {
            this.f107061a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$e */
    public static final class RunnableC45966e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46239q f107081a;

        static {
            Covode.recordClassIndex(54499);
        }

        RunnableC45966e(C46239q qVar) {
            this.f107081a = qVar;
        }

        public final void run() {
            this.f107081a.setShowHelpBox(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$h */
    public static final class C45969h implements C46224i.AbstractC46231c {

        /* renamed from: a */
        final /* synthetic */ C46224i f107085a;

        /* renamed from: b */
        final /* synthetic */ C45940a f107086b;

        static {
            Covode.recordClassIndex(54502);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46231c
        /* renamed from: a */
        public final void mo77582a() {
            C45940a aVar = this.f107086b;
            aVar.mo77527a(aVar.f107024d);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46231c
        /* renamed from: b */
        public final void mo77583b() {
            this.f107085a.mo78325c();
        }

        C45969h(C46224i iVar, C45940a aVar) {
            this.f107085a = iVar;
            this.f107086b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$k */
    public static final class C45972k implements C46224i.AbstractC46230b {

        /* renamed from: a */
        final /* synthetic */ C46224i f107089a;

        static {
            Covode.recordClassIndex(54505);
        }

        C45972k(C46224i iVar) {
            this.f107089a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.AbstractC46230b
        /* renamed from: a */
        public final void mo77584a() {
            this.f107089a.mo78325c();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ao */
    public static final class C45959ao implements AbstractC45857b {

        /* renamed from: a */
        final /* synthetic */ C45940a f107066a;

        /* renamed from: b */
        final /* synthetic */ C46239q f107067b;

        static {
            Covode.recordClassIndex(54492);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b
        /* renamed from: a */
        public final boolean mo77208a() {
            this.f107066a.mo77548f(this.f107067b);
            return true;
        }

        C45959ao(C45940a aVar, C46239q qVar) {
            this.f107066a = aVar;
            this.f107067b = qVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$f */
    public static final class C45967f implements AbstractC46045a {

        /* renamed from: a */
        final /* synthetic */ C45940a f107082a;

        static {
            Covode.recordClassIndex(54500);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.AbstractC46045a
        /* renamed from: a */
        public final boolean mo77579a() {
            return this.f107082a.mo77522a().mo77634i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45967f(C45940a aVar) {
            this.f107082a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$j */
    public static final class C45971j implements AbstractC45895b {

        /* renamed from: a */
        final /* synthetic */ C45940a f107088a;

        static {
            Covode.recordClassIndex(54504);
        }

        C45971j(C45940a aVar) {
            this.f107088a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45895b
        /* renamed from: a */
        public final void mo77270a() {
            this.f107088a.mo77522a().f107135l.mo6999a(C89391z.f203057a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SafeHandler mo77534b() {
        SafeHandler safeHandler = this.f107034n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        return safeHandler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final List<TextStickerTextWrap> mo77539c() {
        List<TextStickerTextWrap> textWrapList = this.f107046z.getTextWrapList();
        C89219l.m154716b(textWrapList, "");
        return textWrapList;
    }

    /* renamed from: g */
    public final void mo77549g() {
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        editTextStickerViewModel.f107132e.clear();
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f107042v.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: h */
    public final String mo77550h() {
        return C46110t.m88973i(mo77539c());
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$g */
    public static final class C45968g implements AbstractC46120f {

        /* renamed from: a */
        final /* synthetic */ C46224i f107083a;

        /* renamed from: b */
        final /* synthetic */ C45940a f107084b;

        static {
            Covode.recordClassIndex(54501);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: a */
        public final void mo77580a() {
            C1213t<Integer> n;
            AbstractC46120f fVar = this.f107084b.f107029i;
            if (fVar != null) {
                fVar.mo77580a();
            }
            AbstractC72510a aVar = this.f107084b.f107043w;
            if (aVar != null && (n = aVar.mo114825n()) != null) {
                n.setValue(3);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: b */
        public final void mo77581b() {
            TextStickerData data;
            C1213t<Integer> n;
            C46239q qVar = this.f107084b.f107024d;
            if (qVar != null) {
                qVar.mo78577k();
            }
            this.f107083a.mo78325c();
            AbstractC72510a aVar = this.f107084b.f107043w;
            if (!(aVar == null || (n = aVar.mo114825n()) == null)) {
                n.setValue(-1);
            }
            C46239q qVar2 = this.f107084b.f107024d;
            if (qVar2 != null && (data = qVar2.getData()) != null) {
                C46224i iVar = this.f107083a;
                C89219l.m154716b(data, "");
                if (data.getHasReadTextAudio() && !TextUtils.isEmpty(data.getAudioText()) && (!C89219l.m154714a((Object) data.getAudioText(), (Object) C46110t.m88973i(iVar.getTextWrapList()))) && data.getAudioTrackIndex() >= 0) {
                    C45940a aVar2 = this.f107084b;
                    C46224i iVar2 = this.f107083a;
                    aVar2.mo77526a(iVar2, data, C46110t.m88973i(iVar2.getTextWrapList()));
                }
            }
        }

        C45968g(C46224i iVar, C45940a aVar) {
            this.f107083a = iVar;
            this.f107084b = aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final EditTextStickerViewModel mo77522a() {
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo77543d() {
        C45989b a = C45989b.m88764a();
        C89219l.m154716b(a, "");
        if (a.mo77598d() <= 0) {
            return 28;
        }
        C45989b a2 = C45989b.m88764a();
        C89219l.m154716b(a2, "");
        return a2.mo77598d();
    }

    /* renamed from: o */
    public final void mo77557o() {
        AbstractC45899e eVar = this.f107006A;
        if (eVar != null) {
            eVar.mo77277b();
        }
        SafeHandler safeHandler = this.f107034n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f107013I;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.post(runnable);
    }

    /* renamed from: p */
    public final void mo77558p() {
        SafeHandler safeHandler = this.f107034n;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        Runnable runnable = this.f107013I;
        if (runnable == null) {
            C89219l.m154710a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.removeCallbacks(runnable);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$b */
    public static final class C45963b implements C45989b.AbstractC45994a {

        /* renamed from: a */
        final /* synthetic */ C45940a f107073a;

        /* renamed from: b */
        final /* synthetic */ long f107074b;

        /* renamed from: c */
        final /* synthetic */ TextStickerData f107075c;

        static {
            Covode.recordClassIndex(54496);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b.AbstractC45994a
        /* renamed from: a */
        public final void mo77575a() {
            if (System.currentTimeMillis() - this.f107074b < ((long) this.f107073a.f107041u) && this.f107073a.mo77522a().mo77650y() == null) {
                this.f107073a.mo77536b(this.f107075c, true);
                if (this.f107073a.f107030j == null) {
                    this.f107073a.f107040t = true;
                }
                AbstractC45872e eVar = this.f107073a.f107030j;
                if (eVar != null) {
                    eVar.mo77236d();
                }
            }
        }

        C45963b(C45940a aVar, long j, TextStickerData textStickerData) {
            this.f107073a = aVar;
            this.f107074b = j;
            this.f107075c = textStickerData;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$c */
    public static final class RunnableC45964c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45940a f107076a;

        /* renamed from: b */
        final /* synthetic */ C46239q f107077b;

        /* renamed from: c */
        final /* synthetic */ int f107078c;

        static {
            Covode.recordClassIndex(54497);
        }

        RunnableC45964c(C45940a aVar, C46239q qVar, int i) {
            this.f107076a = aVar;
            this.f107077b = qVar;
            this.f107078c = i;
        }

        public final void run() {
            C45940a.m88696a(this.f107076a).mo77289b().postValue(new C45905a(this.f107077b.getHelpRect().left + (this.f107077b.getHelpRect().width() / 2.0f), this.f107077b.getHelpRect().top, this.f107078c, 1));
            AbstractC45872e eVar = this.f107076a.f107030j;
            if (eVar != null) {
                eVar.mo77238f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$d */
    public static final class RunnableC45965d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45940a f107079a;

        /* renamed from: b */
        final /* synthetic */ C46239q f107080b;

        static {
            Covode.recordClassIndex(54498);
        }

        RunnableC45965d(C45940a aVar, C46239q qVar) {
            this.f107079a = aVar;
            this.f107080b = qVar;
        }

        public final void run() {
            C45940a.m88696a(this.f107079a).mo77289b().postValue(new C45905a(((float) C70636dh.m124831b(this.f107079a.f107045y.getContext())) / 2.0f, this.f107080b.getGuidanceRectBottom() + ((float) this.f107079a.f107035o), R.string.pj, 6));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$i */
    public static final class C45970i implements AbstractC46120f {

        /* renamed from: a */
        final /* synthetic */ C45940a f107087a;

        static {
            Covode.recordClassIndex(54503);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: a */
        public final void mo77580a() {
            this.f107087a.mo77522a().f107136m.mo6999a(new C89378p<>(false, false));
            this.f107087a.mo77538b(false);
            this.f107087a.mo77522a().mo77631f(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f
        /* renamed from: b */
        public final void mo77581b() {
            if (!this.f107087a.mo77522a().f107128a) {
                this.f107087a.mo77522a().f107136m.mo6999a(new C89378p<>(true, false));
            }
            this.f107087a.mo77555m();
            this.f107087a.mo77522a().mo77631f(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45970i(C45940a aVar) {
            this.f107087a = aVar;
        }
    }

    /* renamed from: i */
    public void mo77551i() {
        this.f107029i = new C45970i(this);
        this.f107026f = new C45971j(this);
        C46224i iVar = this.f107046z;
        iVar.setInputLayoutShowListener(new C45968g(iVar, this));
        iVar.setTextStickerUpdateListener(new C45972k(iVar));
        iVar.setVisibleController(new C45969h(iVar, this));
    }

    /* renamed from: m */
    public final void mo77555m() {
        View view;
        View view2;
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        if (!editTextStickerViewModel.mo77649x() || (view2 = this.f107023c) == null || view2.getVisibility() != 8) {
            View view3 = this.f107023c;
            if (view3 != null && view3.getVisibility() == 0 && (view = this.f107023c) != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view4 = this.f107023c;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$aq */
    static final class RunnableC45961aq implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45940a f107069a;

        /* renamed from: b */
        final /* synthetic */ C46239q f107070b;

        static {
            Covode.recordClassIndex(54494);
        }

        RunnableC45961aq(C45940a aVar, C46239q qVar) {
            this.f107069a = aVar;
            this.f107070b = qVar;
        }

        public final void run() {
            this.f107069a.f107038r.mo77287h();
            AbstractC46119e eVar = this.f107069a.f107025e;
            if (eVar != null) {
                eVar.mo78307a();
            }
            C45940a.m88696a(this.f107069a).mo77289b().postValue(new C45905a(this.f107070b.getHelpRect().left + (this.f107070b.getHelpRect().width() / 2.0f), this.f107070b.getHelpRect().top, R.string.gbg, 5));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ar */
    static final class RunnableC45962ar implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45940a f107071a;

        /* renamed from: b */
        final /* synthetic */ C46239q f107072b;

        static {
            Covode.recordClassIndex(54495);
        }

        RunnableC45962ar(C45940a aVar, C46239q qVar) {
            this.f107071a = aVar;
            this.f107072b = qVar;
        }

        public final void run() {
            this.f107071a.f107038r.mo77281b(false);
            AbstractC46119e eVar = this.f107071a.f107025e;
            if (eVar != null) {
                eVar.mo78307a();
            }
            C45940a.m88696a(this.f107071a).mo77289b().postValue(new C45905a(this.f107072b.getHelpRect().left + (this.f107072b.getHelpRect().width() / 2.0f), this.f107072b.getHelpRect().top, R.string.ay0, 5));
        }
    }

    /* renamed from: r */
    private final void mo78345r() {
        AbstractC45920e eVar;
        View contentView;
        MethodCollector.m26663i(10050);
        ViewGroup.LayoutParams layoutParams = this.f107045y.getLayoutParams();
        this.f107009D = new Rect(0, 0, layoutParams.width, layoutParams.height);
        AbstractC45920e eVar2 = this.f107010E;
        if (!(eVar2 == null || (contentView = eVar2.getContentView()) == null || contentView.getParent() == null)) {
            ViewParent parent = contentView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(contentView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(10050);
                throw nullPointerException;
            }
        }
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            eVar = aVar.mo77311a(this.f107042v, this.f107014J);
        } else {
            eVar = null;
        }
        this.f107010E = eVar;
        if (eVar != null) {
            this.f107045y.addView(eVar.getContentView());
            MethodCollector.m26664o(10050);
            return;
        }
        MethodCollector.m26664o(10050);
    }

    /* renamed from: k */
    public final void mo77553k() {
        AbstractC31071f value;
        MethodCollector.m26663i(10881);
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        ListIterator<C46239q> listIterator = editTextStickerViewModel.f107132e.listIterator();
        while (listIterator.hasNext()) {
            C46239q next = listIterator.next();
            this.f107045y.removeView(next);
            listIterator.remove();
            AbstractC46119e eVar = this.f107025e;
            if (eVar != null) {
                eVar.mo78308a(next);
            }
            TextStickerData data = next.getData();
            if (data != null && data.getAudioTrackIndex() >= 0) {
                LiveData<AbstractC31071f> liveData = this.f107007B;
                if (!(liveData == null || (value = liveData.getValue()) == null)) {
                    value.mo56351e(data.getAudioTrackIndex());
                }
                data.setAudioTrackIndex(-1);
                data.setHasReadTextAudio(false);
            }
        }
        this.f107024d = null;
        MethodCollector.m26664o(10881);
    }

    /* renamed from: l */
    public final void mo77554l() {
        C89378p<Integer, Integer> pVar = this.f107016L;
        if (pVar != null && pVar.getFirst().intValue() != 0 && pVar.getSecond().intValue() != 0) {
            int[] a = C45889g.m88533a(this.f107045y, pVar.getFirst().intValue(), pVar.getSecond().intValue());
            this.f107014J = a[0];
            this.f107035o = a[1];
            mo78345r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo77559q() {
        MethodCollector.m26663i(10058);
        List<TextStickerTextWrap> c = mo77539c();
        if (C46110t.m88969e(c)) {
            mo77531a(c);
            mo78346s();
            m88699g(this.f107024d);
        } else {
            C46239q qVar = this.f107024d;
            if (qVar != null) {
                this.f107045y.removeView(qVar);
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel.mo77615a(qVar);
            }
            mo78346s();
            m88699g(this.f107024d);
            this.f107024d = null;
        }
        this.f107037q = false;
        MethodCollector.m26664o(10058);
    }

    /* renamed from: s */
    private final void mo78346s() {
        C46239q qVar;
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        if (editTextStickerViewModel.f107130c != null && (qVar = this.f107024d) != null && qVar.getData() != null) {
            EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
            if (editTextStickerViewModel2 == null) {
                C89219l.m154710a("textStickerViewModel");
            }
            TextStickerData textStickerData = editTextStickerViewModel2.f107130c;
            if (textStickerData != null) {
                C46239q qVar2 = this.f107024d;
                if (qVar2 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data = qVar2.getData();
                if (data == null) {
                    C89219l.m154715b();
                }
                data.setAudioTrackDuration(textStickerData.getAudioTrackDuration());
                C46239q qVar3 = this.f107024d;
                if (qVar3 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data2 = qVar3.getData();
                if (data2 == null) {
                    C89219l.m154715b();
                }
                data2.setAudioTrackFilePath(textStickerData.getAudioTrackFilePath());
                C46239q qVar4 = this.f107024d;
                if (qVar4 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data3 = qVar4.getData();
                if (data3 == null) {
                    C89219l.m154715b();
                }
                data3.getAudioPathList().addAll(textStickerData.getAudioPathList());
                C46239q qVar5 = this.f107024d;
                if (qVar5 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data4 = qVar5.getData();
                if (data4 == null) {
                    C89219l.m154715b();
                }
                data4.setAudioText(textStickerData.getAudioText());
                C46239q qVar6 = this.f107024d;
                if (qVar6 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data5 = qVar6.getData();
                if (data5 == null) {
                    C89219l.m154715b();
                }
                data5.setAudioTrackDuration(textStickerData.getAudioTrackDuration());
                C46239q qVar7 = this.f107024d;
                if (qVar7 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data6 = qVar7.getData();
                if (data6 == null) {
                    C89219l.m154715b();
                }
                data6.setSpeakerID(textStickerData.getSpeakerID());
                C46239q qVar8 = this.f107024d;
                if (qVar8 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data7 = qVar8.getData();
                if (data7 == null) {
                    C89219l.m154715b();
                }
                data7.setAudioTrackIndex(textStickerData.getAudioTrackIndex());
                C46239q qVar9 = this.f107024d;
                if (qVar9 == null) {
                    C89219l.m154715b();
                }
                TextStickerData data8 = qVar9.getData();
                if (data8 == null) {
                    C89219l.m154715b();
                }
                data8.setHasReadTextAudio(textStickerData.getHasReadTextAudio());
            }
        }
    }

    /* renamed from: j */
    public final void mo77552j() {
        InfoStickerModel a;
        List<StickerItemModel> list;
        AbstractC31071f value;
        VESize b;
        EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        boolean z = !editTextStickerViewModel.mo77640o();
        boolean z2 = false;
        AbstractC46043d dVar = this.f107008C;
        if (dVar != null && (a = dVar.mo77723a()) != null && (list = a.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 2) {
                    if (z) {
                        if (!z2) {
                            C89378p<Integer, Integer> pVar = null;
                            LiveData<AbstractC31071f> liveData = this.f107007B;
                            if (!(liveData == null || (value = liveData.getValue()) == null || (b = value.mo56330b()) == null)) {
                                pVar = new C89378p<>(Integer.valueOf(b.width), Integer.valueOf(b.height));
                            }
                            mo77529a(pVar);
                            z2 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) C45866d.m88489b().mo46670a(next.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
                            if (editTextStickerViewModel2 == null) {
                                C89219l.m154710a("textStickerViewModel");
                            }
                            editTextStickerViewModel2.mo77611a(textStickerData);
                            m88698d(textStickerData);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo77547f() {
        C89378p<Integer, Integer> pVar;
        AbstractC31071f value;
        VESize b;
        LiveData<C89391z> K;
        C45989b.m88764a().mo77590a(this.f107045y.getContext());
        ActivityC0945e eVar = this.f107042v;
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(EditTextStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditTextStickerViewModel editTextStickerViewModel = (EditTextStickerViewModel) a;
        this.f107021a = editTextStickerViewModel;
        if (editTextStickerViewModel == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        editTextStickerViewModel.mo77619a(this.f107019O);
        String str = null;
        AbstractC1174ac a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(StickerHintTextViewModel.class);
        C89219l.m154716b(a2, "");
        this.f107022b = (StickerHintTextViewModel) a2;
        this.f107034n = new SafeHandler(this.f107042v);
        EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
        if (editTextStickerViewModel2 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        this.f107012H = new C46121g(editTextStickerViewModel2);
        AbstractC14552j jVar = this.f107017M;
        C46121g gVar = this.f107012H;
        if (gVar == null) {
            C89219l.m154710a("gestureListener");
        }
        jVar.mo23383a(new C14544f(200, gVar));
        C77268b bVar = new C77268b(this.f107042v, null);
        bVar.mo120871a(this);
        this.f107011G = bVar;
        AbstractC45899e eVar2 = this.f107006A;
        if (eVar2 != null) {
            eVar2.mo77276a();
        }
        EditTextStickerViewModel editTextStickerViewModel3 = this.f107021a;
        if (editTextStickerViewModel3 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        editTextStickerViewModel3.mo77646u().observe(this.f107042v, new C45973l(this));
        EditTextStickerViewModel editTextStickerViewModel4 = this.f107021a;
        if (editTextStickerViewModel4 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar = C46125e.f107381a;
        C20370ah ahVar = new C20370ah();
        ahVar.f48250a = true;
        selectSubscribe(editTextStickerViewModel4, kVar, ahVar, new C45984w(this));
        EditTextStickerViewModel editTextStickerViewModel5 = this.f107021a;
        if (editTextStickerViewModel5 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar2 = C46205p.f107614a;
        C20370ah ahVar2 = new C20370ah();
        ahVar2.f48250a = true;
        subscribeEvent(editTextStickerViewModel5, kVar2, ahVar2, new C45951aj(this));
        EditTextStickerViewModel editTextStickerViewModel6 = this.f107021a;
        if (editTextStickerViewModel6 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar3 = C45996aa.f107126a;
        C20370ah ahVar3 = new C20370ah();
        ahVar3.f48250a = true;
        selectNonNullSubscribe(editTextStickerViewModel6, kVar3, ahVar3, new C45974m(this));
        EditTextStickerViewModel editTextStickerViewModel7 = this.f107021a;
        if (editTextStickerViewModel7 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar4 = C46044b.f107211a;
        C20370ah ahVar4 = new C20370ah();
        ahVar4.f48250a = true;
        selectSubscribe(editTextStickerViewModel7, kVar4, ahVar4, new C45975n(this));
        EditTextStickerViewModel editTextStickerViewModel8 = this.f107021a;
        if (editTextStickerViewModel8 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar5 = C46114c.f107373a;
        C20370ah ahVar5 = new C20370ah();
        ahVar5.f48250a = true;
        selectSubscribe(editTextStickerViewModel8, kVar5, ahVar5, new C45976o(this));
        EditTextStickerViewModel editTextStickerViewModel9 = this.f107021a;
        if (editTextStickerViewModel9 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar6 = C46124d.f107380a;
        C20370ah ahVar6 = new C20370ah();
        ahVar6.f48250a = true;
        selectSubscribe(editTextStickerViewModel9, kVar6, ahVar6, new C45977p(this));
        EditTextStickerViewModel editTextStickerViewModel10 = this.f107021a;
        if (editTextStickerViewModel10 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar7 = C46195f.f107604a;
        C20370ah ahVar7 = new C20370ah();
        ahVar7.f48250a = true;
        selectSubscribe(editTextStickerViewModel10, kVar7, ahVar7, new C45978q(this));
        EditTextStickerViewModel editTextStickerViewModel11 = this.f107021a;
        if (editTextStickerViewModel11 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar8 = C46196g.f107605a;
        C20370ah ahVar8 = new C20370ah();
        ahVar8.f48250a = true;
        selectSubscribe(editTextStickerViewModel11, kVar8, ahVar8, new C45979r(this));
        EditTextStickerViewModel editTextStickerViewModel12 = this.f107021a;
        if (editTextStickerViewModel12 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar9 = C46197h.f107606a;
        C20370ah ahVar9 = new C20370ah();
        ahVar9.f48250a = true;
        selectSubscribe(editTextStickerViewModel12, kVar9, ahVar9, new C45980s(this));
        EditTextStickerViewModel editTextStickerViewModel13 = this.f107021a;
        if (editTextStickerViewModel13 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar10 = C46198i.f107607a;
        C20370ah ahVar10 = new C20370ah();
        ahVar10.f48250a = true;
        selectSubscribe(editTextStickerViewModel13, kVar10, ahVar10, new C45981t(this));
        EditTextStickerViewModel editTextStickerViewModel14 = this.f107021a;
        if (editTextStickerViewModel14 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar11 = C46199j.f107608a;
        C20370ah ahVar11 = new C20370ah();
        ahVar11.f48250a = true;
        selectSubscribe(editTextStickerViewModel14, kVar11, ahVar11, new C45982u(this));
        EditTextStickerViewModel editTextStickerViewModel15 = this.f107021a;
        if (editTextStickerViewModel15 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar12 = C46200k.f107609a;
        C20370ah ahVar12 = new C20370ah();
        ahVar12.f48250a = true;
        selectSubscribe(editTextStickerViewModel15, kVar12, ahVar12, new C45983v(this));
        EditTextStickerViewModel editTextStickerViewModel16 = this.f107021a;
        if (editTextStickerViewModel16 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar13 = C46201l.f107610a;
        C20370ah ahVar13 = new C20370ah();
        ahVar13.f48250a = true;
        selectSubscribe(editTextStickerViewModel16, kVar13, ahVar13, new C45985x(this));
        EditTextStickerViewModel editTextStickerViewModel17 = this.f107021a;
        if (editTextStickerViewModel17 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar14 = C46202m.f107611a;
        C20370ah ahVar14 = new C20370ah();
        ahVar14.f48250a = true;
        subscribeEvent(editTextStickerViewModel17, kVar14, ahVar14, new C45986y(this));
        EditTextStickerViewModel editTextStickerViewModel18 = this.f107021a;
        if (editTextStickerViewModel18 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar15 = C46203n.f107612a;
        C20370ah ahVar15 = new C20370ah();
        ahVar15.f48250a = true;
        selectSubscribe(editTextStickerViewModel18, kVar15, ahVar15, new C45987z(this));
        EditTextStickerViewModel editTextStickerViewModel19 = this.f107021a;
        if (editTextStickerViewModel19 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar16 = C46204o.f107613a;
        C20370ah ahVar16 = new C20370ah();
        ahVar16.f48250a = true;
        selectSubscribe(editTextStickerViewModel19, kVar16, ahVar16, new C45942aa(this));
        EditTextStickerViewModel editTextStickerViewModel20 = this.f107021a;
        if (editTextStickerViewModel20 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar17 = C46206q.f107615a;
        C20370ah ahVar17 = new C20370ah();
        ahVar17.f48250a = true;
        selectSubscribe(editTextStickerViewModel20, kVar17, ahVar17, new C45943ab(this));
        EditTextStickerViewModel editTextStickerViewModel21 = this.f107021a;
        if (editTextStickerViewModel21 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar18 = C46207r.f107616a;
        C20370ah ahVar18 = new C20370ah();
        ahVar18.f48250a = true;
        subscribeEvent(editTextStickerViewModel21, kVar18, ahVar18, new C45944ac(this));
        EditTextStickerViewModel editTextStickerViewModel22 = this.f107021a;
        if (editTextStickerViewModel22 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar19 = C46208s.f107617a;
        C20370ah ahVar19 = new C20370ah();
        ahVar19.f48250a = true;
        selectSubscribe(editTextStickerViewModel22, kVar19, ahVar19, new C45945ad(this));
        EditTextStickerViewModel editTextStickerViewModel23 = this.f107021a;
        if (editTextStickerViewModel23 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar20 = C46209t.f107618a;
        C20370ah ahVar20 = new C20370ah();
        ahVar20.f48250a = true;
        subscribeEvent(editTextStickerViewModel23, kVar20, ahVar20, new C45946ae(this));
        EditTextStickerViewModel editTextStickerViewModel24 = this.f107021a;
        if (editTextStickerViewModel24 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        AbstractC89290k kVar21 = C46210u.f107619a;
        C20370ah ahVar21 = new C20370ah();
        ahVar21.f48250a = true;
        subscribeEvent(editTextStickerViewModel24, kVar21, ahVar21, new C45947af(this));
        EditTextStickerViewModel editTextStickerViewModel25 = this.f107021a;
        if (editTextStickerViewModel25 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel25, C46211v.f107620a, new C20370ah(), new C45948ag(this));
        EditTextStickerViewModel editTextStickerViewModel26 = this.f107021a;
        if (editTextStickerViewModel26 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel26, C46244w.f107771a, new C20370ah(), new C45949ah(this));
        AbstractC72510a aVar = this.f107043w;
        if (!(aVar == null || (K = aVar.mo114786K()) == null)) {
            K.observe(this, new C45950ai(this));
        }
        EditTextStickerViewModel editTextStickerViewModel27 = this.f107021a;
        if (editTextStickerViewModel27 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel27, C46245x.f107772a, new C20370ah(), new C45952ak(this));
        EditTextStickerViewModel editTextStickerViewModel28 = this.f107021a;
        if (editTextStickerViewModel28 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel28, C46246y.f107773a, new C20370ah(), new C45954al(this));
        EditTextStickerViewModel editTextStickerViewModel29 = this.f107021a;
        if (editTextStickerViewModel29 == null) {
            C89219l.m154710a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel29, C46247z.f107774a, new C20370ah(), new C45955am(this));
        mo77551i();
        mo77552j();
        if (this.f107020P) {
            LiveData<AbstractC31071f> liveData = this.f107007B;
            if (liveData == null || (value = liveData.getValue()) == null || (b = value.mo56330b()) == null) {
                pVar = null;
            } else {
                pVar = new C89378p<>(Integer.valueOf(b.width), Integer.valueOf(b.height));
            }
            mo77529a(pVar);
            TextStickerData textStickerData = new TextStickerData("", 2, -1, 2, "Proxima-Nova-Semibold.otf", null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
            textStickerData.setEditCenterPoint(new Point(C30745b.m63131a(this.f107042v) / 2, C30745b.m63133b(this.f107042v) / 2));
            CharSequence text = this.f107042v.getResources().getText(R.string.pk);
            if (text instanceof String) {
                str = text;
            }
            textStickerData.setTextWrapList(C89070n.m154516a(C46110t.m88959a(str, false)));
            textStickerData.setY(C30745b.m63132b(this.f107042v, 154.0f));
            mo77541c(textStickerData);
            textStickerData.setGuidanceSticker(true);
            textStickerData.setScale(0.7f);
            long currentTimeMillis = System.currentTimeMillis();
            C45989b a3 = C45989b.m88764a();
            String fontType = textStickerData.getFontType();
            C45963b bVar2 = new C45963b(this, currentTimeMillis, textStickerData);
            if (a3.f107108c.get(fontType) == null) {
                C45866d.m88491d().mo77254c("text font " + fontType + " is null");
                C45890g.m88536b().mo78910a(C45890g.m88534a().f106861a, false, true, (IFetchEffectChannelListener) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03f8: INVOKE  
                      (wrap: com.ss.android.ugc.tools.b.a.d : 0x03e9: INVOKE  (r4v33 com.ss.android.ugc.tools.b.a.d) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.b():com.ss.android.ugc.tools.b.a.d)
                      (wrap: java.lang.String : 0x03f1: IGET  (r3v47 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.editSticker.e : 0x03ed: INVOKE  (r2v20 com.ss.android.ugc.aweme.editSticker.e) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.a():com.ss.android.ugc.aweme.editSticker.e)
                     com.ss.android.ugc.aweme.editSticker.e.a java.lang.String)
                      false
                      true
                      (wrap: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener : ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener) (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$3 : 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a3' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR))
                     type: INTERFACE call: com.ss.android.ugc.tools.b.a.d.a(java.lang.String, boolean, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener) (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$3 : 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a3' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a3' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.editSticker.text.a.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 1036
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.C45940a.mo77547f():void");
            }

            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ap */
            public static final class C45960ap implements AbstractC46118d {

                /* renamed from: a */
                final /* synthetic */ C45940a f107068a;

                static {
                    Covode.recordClassIndex(54493);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: e */
                public final void mo77572e(C46239q qVar) {
                    C89219l.m154721d(qVar, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C45960ap(C45940a aVar) {
                    this.f107068a = aVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final float mo77563a(float f) {
                    AbstractC45920e eVar = this.f107068a.f107010E;
                    if (eVar != null) {
                        return eVar.mo77312a(f);
                    }
                    return f;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: d */
                public final void mo77571d(C46239q qVar) {
                    C89219l.m154721d(qVar, "");
                    AbstractC45872e eVar = this.f107068a.f107030j;
                    if (eVar != null) {
                        eVar.mo77237e();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: b */
                public final void mo77569b(C46239q qVar) {
                    C89219l.m154721d(qVar, "");
                    this.f107068a.f107038r.mo77281b(true);
                    this.f107068a.mo77522a().mo77639n();
                    AbstractC89172b<? super C46239q, C89391z> bVar = this.f107068a.f107028h;
                    if (bVar != null) {
                        bVar.invoke(qVar);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: c */
                public final void mo77570c(C46239q qVar) {
                    C89219l.m154721d(qVar, "");
                    this.f107068a.mo77546e(qVar);
                    AbstractC45872e eVar = this.f107068a.f107030j;
                    if (eVar != null) {
                        eVar.mo77233a(qVar.f107753m ? 1 : 0, "click_cross");
                    }
                    C45940a.m88696a(this.f107068a).mo77288a().postValue(true);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final void mo77566a(C46239q qVar) {
                    C89219l.m154721d(qVar, "");
                    this.f107068a.mo77522a().mo77623b(true);
                    this.f107068a.mo77522a().mo77639n();
                    AbstractC89172b<? super C46239q, C89391z> bVar = this.f107068a.f107027g;
                    if (bVar != null) {
                        bVar.invoke(qVar);
                    }
                    AbstractC45872e eVar = this.f107068a.f107030j;
                    if (eVar != null) {
                        eVar.mo77234b();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final void mo77568a(C46239q qVar, boolean z) {
                    C89219l.m154721d(qVar, "");
                    AbstractC46118d dVar = this.f107068a.f107032l;
                    if (dVar != null) {
                        dVar.mo77568a(qVar, z);
                    }
                    if (z) {
                        C45940a aVar = this.f107068a;
                        if (!((EditTextStickerViewState) aVar.getState(aVar.mo77522a())).getInTimeEditView()) {
                            if (System.currentTimeMillis() - this.f107068a.f107036p > 500) {
                                this.f107068a.mo77548f(qVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f107068a.f107026f != null) {
                        AbstractC45895b bVar = this.f107068a.f107026f;
                        if (bVar == null) {
                            C89219l.m154715b();
                        }
                        bVar.mo77270a();
                        this.f107068a.f107024d = qVar;
                        if (this.f107068a.f107024d != null) {
                            C45940a aVar2 = this.f107068a;
                            aVar2.mo77537b(aVar2.f107024d);
                        }
                    }
                    this.f107068a.mo77522a().mo77639n();
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final int mo77564a(C46239q qVar, boolean z, boolean z2) {
                    C89219l.m154721d(qVar, "");
                    AbstractC45920e eVar = this.f107068a.f107010E;
                    if (eVar == null) {
                        return -1;
                    }
                    if (!z) {
                        return eVar.mo77313a(qVar.getAnglePointListForBlock(), z2);
                    }
                    eVar.mo77320b();
                    return -1;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final PointF mo77565a(C46239q qVar, float f, float f2) {
                    C89219l.m154721d(qVar, "");
                    AbstractC45920e eVar = this.f107068a.f107010E;
                    if (eVar == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] anglePointList = qVar.getAnglePointList();
                    for (PointF pointF : anglePointList) {
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return eVar.mo77316a(anglePointList, f, f2);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d
                /* renamed from: a */
                public final void mo77567a(C46239q qVar, RectF rectF, C46123i iVar) {
                    C89219l.m154721d(qVar, "");
                    C89219l.m154721d(rectF, "");
                    C89219l.m154721d(iVar, "");
                    if (!iVar.f107377c) {
                        this.f107068a.mo77537b(qVar);
                    }
                    if (!iVar.f107378d && !iVar.f107379e) {
                        boolean a = C45883b.m88524a(this.f107068a.f107009D, qVar.getAnglePointList());
                        AbstractC45899e eVar = this.f107068a.f107006A;
                        if (eVar != null) {
                            this.f107068a.mo77528a(qVar, eVar.mo77275a(iVar.f107375a, iVar.f107376b, iVar.f107377c, a));
                        }
                        if (this.f107068a.f107044x && this.f107068a.f107043w != null) {
                            if (iVar.f107377c) {
                                if (this.f107068a.f107043w.mo114824m() != 1) {
                                    this.f107068a.f107043w.mo114833v().setValue(C88296t.m153435a());
                                }
                            } else if (this.f107068a.f107043w.mo114778C().getValue() != null) {
                                AbstractC31071f value = this.f107068a.f107043w.mo114778C().getValue();
                                if (value == null) {
                                    C89219l.m154715b();
                                }
                                if (value.mo56356f() != C85581w.EnumC85611j.PAUSED) {
                                    this.f107068a.f107043w.mo114833v().setValue(C88296t.m153437b());
                                }
                            }
                        }
                    }
                    if (this.f107068a.f107006A != null) {
                        qVar.setAlpha(1.0f);
                    }
                    AbstractC46119e eVar2 = this.f107068a.f107025e;
                    if (eVar2 != null) {
                        eVar2.mo78309a(qVar, new C46123i(iVar.f107375a, iVar.f107376b, iVar.f107377c, iVar.f107378d, iVar.f107379e));
                    }
                }
            }

            /* renamed from: a */
            public final void mo77530a(String str) {
                m88697b(C46110t.m88961a(str));
            }

            /* renamed from: a */
            public static final /* synthetic */ StickerHintTextViewModel m88696a(C45940a aVar) {
                StickerHintTextViewModel stickerHintTextViewModel = aVar.f107022b;
                if (stickerHintTextViewModel == null) {
                    C89219l.m154710a("hintTextViewModel");
                }
                return stickerHintTextViewModel;
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public void mo77544d(C46239q qVar) {
                C89219l.m154721d(qVar, "");
                qVar.setOnEditClickListener(new C45960ap(this));
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
                C89219l.m154721d(vm1, "");
                return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
            }

            @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
            /* renamed from: c */
            public final void mo77540c(int i) {
                if (this.f107046z.mo78513i()) {
                    this.f107046z.mo78491b(i);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ai */
            public static final class C45950ai<T> implements AbstractC1214u {

                /* renamed from: a */
                final /* synthetic */ C45940a f107055a;

                static {
                    Covode.recordClassIndex(54483);
                }

                C45950ai(C45940a aVar) {
                    this.f107055a = aVar;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    C46239q y = this.f107055a.mo77522a().mo77650y();
                    if (y != null) {
                        this.f107055a.mo77546e(y);
                        C45940a.m88696a(this.f107055a).mo77288a().postValue(true);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$l */
            public static final class C45973l<T> implements AbstractC1214u {

                /* renamed from: a */
                final /* synthetic */ C45940a f107090a;

                static {
                    Covode.recordClassIndex(54506);
                }

                C45973l(C45940a aVar) {
                    this.f107090a = aVar;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    if (pVar != null) {
                        EditTextStickerViewModel a = this.f107090a.mo77522a();
                        float floatValue = ((Number) pVar.getFirst()).floatValue();
                        boolean booleanValue = ((Boolean) pVar.getSecond()).booleanValue();
                        for (C46239q qVar : a.f107132e) {
                            qVar.mo78534a(floatValue, booleanValue);
                        }
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
            /* renamed from: a */
            public final void mo77523a(int i) {
                if (this.f107037q) {
                    C46239q qVar = this.f107024d;
                    if (qVar != null) {
                        qVar.mo78578l();
                    }
                    this.f107046z.mo78497g();
                    this.f107046z.mo78487a(i);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C46239q mo77533b(TextStickerData textStickerData) {
                ActivityC0945e eVar = this.f107042v;
                SafeHandler safeHandler = this.f107034n;
                if (safeHandler == null) {
                    C89219l.m154710a("safeHandler");
                }
                C46239q qVar = new C46239q(eVar, safeHandler, textStickerData, true, new C45967f(this), true);
                qVar.f107763w = this.f107030j;
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                qVar.f107764x = editTextStickerViewModel.f107131d;
                return qVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final void mo77542c(C46239q qVar) {
                AbstractC45857b bVar;
                C89219l.m154721d(qVar, "");
                if (this.f107033m) {
                    bVar = new C45959ao(this, qVar);
                } else {
                    bVar = C45856a.f106824a;
                }
                qVar.setMotionInterceptor(bVar);
            }

            /* renamed from: f */
            public final void mo77548f(C46239q qVar) {
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel.f107137n.mo6999a((Boolean) false);
                this.f107024d = qVar;
                mo77527a(qVar);
                AbstractC46119e eVar = this.f107025e;
                if (eVar != null) {
                    eVar.mo78311c(qVar);
                }
                this.f107036p = System.currentTimeMillis();
                AbstractC45872e eVar2 = this.f107030j;
                if (eVar2 != null) {
                    eVar2.mo77232a();
                }
            }

            /* renamed from: d */
            private final void m88698d(TextStickerData textStickerData) {
                String audioTrackFilePath;
                LiveData<AbstractC31071f> liveData;
                AbstractC31071f value;
                if (textStickerData.getHasReadTextAudio() && (audioTrackFilePath = textStickerData.getAudioTrackFilePath()) != null && (liveData = this.f107007B) != null && (value = liveData.getValue()) != null && audioTrackFilePath.length() > 0) {
                    int a = value.mo56285a(audioTrackFilePath, 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
                    if (a >= 0) {
                        value.mo56313a(a, 1, 1.0f);
                        textStickerData.setAudioTrackIndex(a);
                    }
                }
            }

            /* renamed from: g */
            private final void m88699g(C46239q qVar) {
                if (qVar != null) {
                    TextStickerData data = qVar.getData();
                    if (data != null && data.getHasReadTextAudio() && (!C89219l.m154714a((Object) data.getAudioText(), (Object) C46110t.m88973i(data.getTextWrapList()))) && C45890g.m88534a().f106862b.f106872c) {
                        C46224i iVar = this.f107046z;
                        C89219l.m154716b(data, "");
                        mo77526a(iVar, data, C46110t.m88973i(data.getTextWrapList()));
                        return;
                    }
                    return;
                }
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                if (editTextStickerViewModel.f107130c != null) {
                    EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
                    if (editTextStickerViewModel2 == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    TextStickerData textStickerData = editTextStickerViewModel2.f107130c;
                    if (textStickerData == null) {
                        C89219l.m154715b();
                    }
                    mo77524a(textStickerData);
                }
            }

            /* renamed from: a */
            public final void mo77524a(TextStickerData textStickerData) {
                AbstractC31071f value;
                LiveData<AbstractC31071f> liveData = this.f107007B;
                if (liveData != null && (value = liveData.getValue()) != null && textStickerData.getHasReadTextAudio() && textStickerData.getAudioTrackIndex() >= 0) {
                    value.mo56351e(textStickerData.getAudioTrackIndex());
                    textStickerData.setHasReadTextAudio(false);
                    textStickerData.setAudioTrackIndex(-1);
                    textStickerData.setAudioTrackFilePath(null);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
                if (r2 != r7) goto L_0x0042;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo77537b(com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q r7) {
                /*
                // Method dump skipped, instructions count: 118
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.C45940a.mo77537b(com.ss.android.ugc.aweme.editSticker.text.view.q):void");
            }

            /* renamed from: e */
            public final void mo77546e(C46239q qVar) {
                AbstractC31071f value;
                MethodCollector.m26663i(11171);
                if (qVar == null) {
                    MethodCollector.m26664o(11171);
                    return;
                }
                this.f107045y.removeView(qVar);
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel.mo77615a(qVar);
                this.f107024d = null;
                AbstractC46119e eVar = this.f107025e;
                if (eVar != null) {
                    eVar.mo78308a(qVar);
                }
                TextStickerData data = qVar.getData();
                if (data != null) {
                    if (data.getAudioTrackIndex() >= 0) {
                        LiveData<AbstractC31071f> liveData = this.f107007B;
                        if (!(liveData == null || (value = liveData.getValue()) == null)) {
                            value.mo56351e(data.getAudioTrackIndex());
                        }
                        data.setAudioTrackIndex(-1);
                        data.setHasReadTextAudio(false);
                    }
                    MethodCollector.m26664o(11171);
                    return;
                }
                MethodCollector.m26664o(11171);
            }

            /* renamed from: b */
            private final void m88697b(List<TextStickerTextWrap> list) {
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                if (editTextStickerViewModel.mo77648w() >= this.f107018N) {
                    C45866d.m88492e().mo77255a(this.f107042v, R.string.cm9);
                    return;
                }
                int curTxtMode = this.f107046z.getCurTxtMode();
                int curColor = this.f107046z.getCurColor();
                int alignTxt = this.f107046z.getAlignTxt();
                C45989b a = C45989b.m88764a();
                C89219l.m154716b(a, "");
                TextStickerData textStickerData = new TextStickerData("", curTxtMode, curColor, alignTxt, a.f107109d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
                Point editInputScreenCenterPoint = this.f107046z.getEditInputScreenCenterPoint();
                C89219l.m154716b(editInputScreenCenterPoint, "");
                textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
                textStickerData.setTextWrapList(list);
                mo77541c(textStickerData);
                textStickerData.setFontSize(mo77543d());
                mo77525a(textStickerData, false);
            }

            @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
            /* renamed from: b */
            public final void mo77535b(int i) {
                if (this.f107037q) {
                    this.f107046z.mo78512h();
                    mo77559q();
                    AbstractC46120f fVar = this.f107029i;
                    if (fVar != null) {
                        fVar.mo77581b();
                    }
                    EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                    if (editTextStickerViewModel == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    if (editTextStickerViewModel.f107129b) {
                        EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
                        if (editTextStickerViewModel2 == null) {
                            C89219l.m154710a("textStickerViewModel");
                        }
                        editTextStickerViewModel2.mo33689c(EditTextStickerViewModel.C46015f.f107160a);
                    }
                    EditTextStickerViewModel editTextStickerViewModel3 = this.f107021a;
                    if (editTextStickerViewModel3 == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    if (editTextStickerViewModel3.f107128a) {
                        C46239q qVar = this.f107024d;
                        if (qVar != null) {
                            EditTextStickerViewModel editTextStickerViewModel4 = this.f107021a;
                            if (editTextStickerViewModel4 == null) {
                                C89219l.m154710a("textStickerViewModel");
                            }
                            C89219l.m154721d(qVar, "");
                            editTextStickerViewModel4.mo33689c(new EditTextStickerViewModel.C46024o(qVar));
                            return;
                        }
                        return;
                    }
                    C46239q qVar2 = this.f107024d;
                    if (qVar2 != null) {
                        TextStickerData data = qVar2.getData();
                        if (data != null && data.getHasReadTextAudio() && C45890g.m88534a().f106862b.f106872c && this.f107038r.mo77286g() && !qVar2.f107754n) {
                            qVar2.postDelayed(new RunnableC45961aq(this, qVar2), 500);
                        }
                        TextStickerData data2 = qVar2.getData();
                        if (data2 != null && !data2.getHasReadTextAudio() && C45890g.m88534a().f106862b.f106871b && this.f107038r.mo77285f() && !qVar2.f107754n && this.f107039s) {
                            qVar2.postDelayed(new RunnableC45962ar(this, qVar2), 500);
                        }
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo77527a(C46239q qVar) {
                InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
                boolean z = true;
                this.f107037q = true;
                if (qVar == null || !qVar.f107753m) {
                    z = false;
                } else {
                    List<TextStickerTextWrap> a = C89070n.m154516a(C46110t.m88959a("", false));
                    TextStickerData data = qVar.getData();
                    if (data != null) {
                        innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                    } else {
                        innerEffectTextLayoutConfig = null;
                    }
                    qVar.mo78544b(a, innerEffectTextLayoutConfig);
                    qVar.setIsGuidanceSticker(false);
                    qVar.setWasGuidanceSticker(true);
                    TextStickerData data2 = qVar.getData();
                    if (data2 != null) {
                        data2.setGuidanceSticker(false);
                    }
                    EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                    if (editTextStickerViewModel == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    C46239q y = editTextStickerViewModel.mo77650y();
                    if (y != null) {
                        y.setIsGuidanceSticker(false);
                        TextStickerData data3 = y.getData();
                        if (data3 != null) {
                            data3.setGuidanceSticker(false);
                        }
                    }
                }
                this.f107046z.setTextStickerView(qVar);
                EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
                if (editTextStickerViewModel2 == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel2.f107130c = null;
                if (qVar == null) {
                    C46224i iVar = this.f107046z;
                    EditTextStickerViewModel editTextStickerViewModel3 = this.f107021a;
                    if (editTextStickerViewModel3 == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    iVar.mo78489a("", "", editTextStickerViewModel3.mo77647v());
                    this.f107024d = null;
                } else {
                    C46224i iVar2 = this.f107046z;
                    List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
                    int curMode = qVar.getCurMode();
                    int curColor = qVar.getCurColor();
                    int curAlignTxt = qVar.getCurAlignTxt();
                    String curFontType = qVar.getCurFontType();
                    TextStickerData data4 = qVar.getData();
                    if (data4 == null) {
                        C89219l.m154715b();
                    }
                    int fontSize = data4.getFontSize();
                    EditTextStickerViewModel editTextStickerViewModel4 = this.f107021a;
                    if (editTextStickerViewModel4 == null) {
                        C89219l.m154710a("textStickerViewModel");
                    }
                    iVar2.mo78323a(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, fontSize, editTextStickerViewModel4.mo77647v());
                }
                if (z) {
                    this.f107046z.mo78494d();
                }
            }

            /* renamed from: b */
            public final void mo77538b(boolean z) {
                View view;
                View view2;
                if (z) {
                    View view3 = this.f107023c;
                    if (view3 != null && view3.getVisibility() == 8 && (view2 = this.f107023c) != null) {
                        view2.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view4 = this.f107023c;
                if (view4 != null && view4.getVisibility() == 0 && (view = this.f107023c) != null) {
                    view.setVisibility(8);
                }
            }

            /* renamed from: a */
            public final void mo77529a(C89378p<Integer, Integer> pVar) {
                if (pVar != null && this.f107016L == null) {
                    this.f107016L = pVar;
                    mo77554l();
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$aa */
            public static final class C45942aa extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20526p, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107047a;

                static {
                    Covode.recordClassIndex(54475);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45942aa(C45940a aVar) {
                    super(2);
                    this.f107047a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20526p pVar) {
                    C89219l.m154721d(iVar, "");
                    this.f107047a.mo77554l();
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ac */
            public static final class C45944ac extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107049a;

                static {
                    Covode.recordClassIndex(54477);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45944ac(C45940a aVar) {
                    super(2);
                    this.f107049a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(zVar, "");
                    this.f107049a.mo77553k();
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ae */
            public static final class C45946ae extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107051a;

                static {
                    Covode.recordClassIndex(54479);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45946ae(C45940a aVar) {
                    super(2);
                    this.f107051a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(zVar, "");
                    this.f107051a.mo77555m();
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$y */
            public static final class C45986y extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107103a;

                static {
                    Covode.recordClassIndex(54519);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45986y(C45940a aVar) {
                    super(2);
                    this.f107103a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(zVar, "");
                    this.f107103a.mo77552j();
                    return C89391z.f203057a;
                }
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
                C89219l.m154721d(vm1, "");
                C89219l.m154721d(bVar, "");
                return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ab */
            public static final class C45943ab extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C46239q>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107048a;

                static {
                    Covode.recordClassIndex(54476);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45943ab(C45940a aVar) {
                    super(2);
                    this.f107048a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C46239q> dVar) {
                    T t;
                    C20391d<? extends C46239q> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107048a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.mo77527a((C46239q) t);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ad */
            public static final class C45945ad extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20521k, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107050a;

                static {
                    Covode.recordClassIndex(54478);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45945ad(C45940a aVar) {
                    super(2);
                    this.f107050a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20521k kVar) {
                    C20521k kVar2 = kVar;
                    C89219l.m154721d(iVar, "");
                    if (kVar2 != null) {
                        this.f107050a.mo77538b(kVar2.f48283b.booleanValue());
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$af */
            public static final class C45947af extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107052a;

                static {
                    Covode.recordClassIndex(54480);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45947af(C45940a aVar) {
                    super(2);
                    this.f107052a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
                    boolean booleanValue = bool.booleanValue();
                    C89219l.m154721d(bVar, "");
                    this.f107052a.mo77532a(booleanValue);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ah */
            public static final class C45949ah extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends C46239q>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107054a;

                static {
                    Covode.recordClassIndex(54482);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45949ah(C45940a aVar) {
                    super(2);
                    this.f107054a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends C46239q> dVar) {
                    C20391d<? extends C46239q> dVar2 = dVar;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(dVar2, "");
                    T t = dVar2.f48283b;
                    if (t != null) {
                        this.f107054a.mo77548f(t);
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ak */
            public static final class C45952ak extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends TextWatcher>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107057a;

                static {
                    Covode.recordClassIndex(54485);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45952ak(C45940a aVar) {
                    super(2);
                    this.f107057a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends TextWatcher> dVar) {
                    C20391d<? extends TextWatcher> dVar2 = dVar;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(dVar2, "");
                    dVar2.mo33724a(new AbstractC89172b<TextWatcher, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.editSticker.text.C45940a.C45952ak.C459531 */

                        /* renamed from: a */
                        final /* synthetic */ C45952ak f107058a;

                        static {
                            Covode.recordClassIndex(54486);
                        }

                        {
                            this.f107058a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(TextWatcher textWatcher) {
                            TextWatcher textWatcher2 = textWatcher;
                            C89219l.m154721d(textWatcher2, "");
                            this.f107058a.f107057a.f107046z.f107701h.addTextChangedListener(textWatcher2);
                            return C89391z.f203057a;
                        }
                    });
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$o */
            public static final class C45976o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends String>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107093a;

                static {
                    Covode.recordClassIndex(54509);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45976o(C45940a aVar) {
                    super(2);
                    this.f107093a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends String> dVar) {
                    String str;
                    C20391d<? extends String> dVar2 = dVar;
                    String str2 = "";
                    C89219l.m154721d(iVar, str2);
                    C45940a aVar = this.f107093a;
                    if (!(dVar2 == null || (str = (String) dVar2.mo33723a()) == null)) {
                        str2 = str;
                    }
                    aVar.mo77530a(str2);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$p */
            public static final class C45977p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C46239q>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107094a;

                static {
                    Covode.recordClassIndex(54510);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45977p(C45940a aVar) {
                    super(2);
                    this.f107094a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C46239q> dVar) {
                    T t;
                    C20391d<? extends C46239q> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107094a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.mo77546e(t);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$q */
            public static final class C45978q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC46119e>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107095a;

                static {
                    Covode.recordClassIndex(54511);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45978q(C45940a aVar) {
                    super(2);
                    this.f107095a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC46119e> dVar) {
                    T t;
                    C20391d<? extends AbstractC46119e> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107095a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107025e = t;
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$r */
            public static final class C45979r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107096a;

                static {
                    Covode.recordClassIndex(54512);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45979r(C45940a aVar) {
                    super(2);
                    this.f107096a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>> dVar) {
                    T t;
                    C20391d<? extends AbstractC89183m<? super C46239q, ? super C46239q, ? extends C89391z>> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107096a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107031k = t;
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$s */
            public static final class C45980s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107097a;

                static {
                    Covode.recordClassIndex(54513);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45980s(C45940a aVar) {
                    super(2);
                    this.f107097a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar) {
                    T t;
                    C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107097a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107027g = t;
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$t */
            public static final class C45981t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC46118d>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107098a;

                static {
                    Covode.recordClassIndex(54514);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45981t(C45940a aVar) {
                    super(2);
                    this.f107098a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC46118d> dVar) {
                    T t;
                    C20391d<? extends AbstractC46118d> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107098a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107032l = t;
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$u */
            public static final class C45982u extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107099a;

                static {
                    Covode.recordClassIndex(54515);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45982u(C45940a aVar) {
                    super(2);
                    this.f107099a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar) {
                    T t;
                    C20391d<? extends AbstractC89172b<? super C46239q, ? extends C89391z>> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107099a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107028h = t;
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$w */
            public static final class C45984w extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C46239q>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107101a;

                static {
                    Covode.recordClassIndex(54517);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45984w(C45940a aVar) {
                    super(2);
                    this.f107101a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C46239q> dVar) {
                    T t;
                    C20391d<? extends C46239q> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107101a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.mo77537b((C46239q) t);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$z */
            public static final class C45987z extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends C89378p<? extends Integer, ? extends Integer>>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107104a;

                static {
                    Covode.recordClassIndex(54520);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45987z(C45940a aVar) {
                    super(2);
                    this.f107104a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends C89378p<? extends Integer, ? extends Integer>> dVar) {
                    T t;
                    C20391d<? extends C89378p<? extends Integer, ? extends Integer>> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107104a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.mo77529a((C89378p<Integer, Integer>) t);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$ag */
            public static final class C45948ag extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107053a;

                static {
                    Covode.recordClassIndex(54481);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45948ag(C45940a aVar) {
                    super(2);
                    this.f107053a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
                    C20521k kVar2 = kVar;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(kVar2, "");
                    this.f107053a.f107033m = kVar2.f48283b.booleanValue();
                    C45940a aVar = this.f107053a;
                    aVar.f107039s = !aVar.f107033m;
                    Iterator<T> it = this.f107053a.mo77522a().f107132e.iterator();
                    while (it.hasNext()) {
                        this.f107053a.mo77542c((C46239q) it.next());
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$aj */
            public static final class C45951aj extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107056a;

                static {
                    Covode.recordClassIndex(54484);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45951aj(C45940a aVar) {
                    super(2);
                    this.f107056a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(zVar, "");
                    StickerHintTextViewModel stickerHintTextViewModel = this.f107056a.f107022b;
                    if (stickerHintTextViewModel == null) {
                        C89219l.m154710a("hintTextViewModel");
                    }
                    stickerHintTextViewModel.mo77288a().postValue(true);
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$am */
            public static final class C45955am extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107060a;

                static {
                    Covode.recordClassIndex(54488);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45955am(C45940a aVar) {
                    super(2);
                    this.f107060a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(pVar, "");
                    Iterator<T> it = this.f107060a.mo77522a().f107132e.iterator();
                    while (it.hasNext()) {
                        TextStickerData data = it.next().getData();
                        if (data != null) {
                            C45940a aVar = this.f107060a;
                            C89219l.m154716b(data, "");
                            aVar.mo77524a(data);
                        }
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$m */
            public static final class C45974m extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107091a;

                static {
                    Covode.recordClassIndex(54507);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45974m(C45940a aVar) {
                    super(2);
                    this.f107091a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(kVar, "");
                    EditTextStickerViewModel a = this.f107091a.mo77522a();
                    String h = this.f107091a.mo77550h();
                    C89219l.m154721d(h, "");
                    a.mo33689c(new EditTextStickerViewModel.C46021l(h));
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$n */
            public static final class C45975n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20524n<TextStickerData, Boolean>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107092a;

                static {
                    Covode.recordClassIndex(54508);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45975n(C45940a aVar) {
                    super(2);
                    this.f107092a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20524n<TextStickerData, Boolean> nVar) {
                    T t;
                    C20524n<TextStickerData, Boolean> nVar2 = nVar;
                    C89219l.m154721d(iVar, "");
                    if (!(nVar2 == null || (t = nVar2.f48283b) == null)) {
                        this.f107092a.mo77525a((TextStickerData) t.getFirst(), ((Boolean) t.getSecond()).booleanValue());
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$v */
            public static final class C45983v extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends AbstractC45872e>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107100a;

                static {
                    Covode.recordClassIndex(54516);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45983v(C45940a aVar) {
                    super(2);
                    this.f107100a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends AbstractC45872e> dVar) {
                    T t;
                    C20391d<? extends AbstractC45872e> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    C45940a aVar = this.f107100a;
                    if (dVar2 != null) {
                        t = dVar2.f48283b;
                    } else {
                        t = null;
                    }
                    aVar.f107030j = t;
                    if (this.f107100a.f107040t) {
                        AbstractC45872e eVar = this.f107100a.f107030j;
                        if (eVar != null) {
                            eVar.mo77236d();
                        }
                        this.f107100a.f107040t = false;
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$x */
            public static final class C45985x extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends View.OnClickListener>, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107102a;

                static {
                    Covode.recordClassIndex(54518);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45985x(C45940a aVar) {
                    super(2);
                    this.f107102a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends View.OnClickListener> dVar) {
                    T t;
                    C20391d<? extends View.OnClickListener> dVar2 = dVar;
                    C89219l.m154721d(iVar, "");
                    if (!(dVar2 == null || (t = dVar2.f48283b) == null)) {
                        C45940a aVar = this.f107102a;
                        if (aVar.f107023c == null) {
                            C1764a.m5927a(LayoutInflater.from(aVar.f107042v), R.layout.zb, aVar.f107045y, true);
                            TuxTextView tuxTextView = (TuxTextView) aVar.f107045y.findViewById(R.id.eww);
                            tuxTextView.mo37697a(26.0f);
                            aVar.f107023c = tuxTextView;
                        }
                        View view = aVar.f107023c;
                        if (view != null) {
                            view.setOnClickListener(t);
                        }
                    }
                    return C89391z.f203057a;
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$al */
            public static final class C45954al extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20523m, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C45940a f107059a;

                static {
                    Covode.recordClassIndex(54487);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C45954al(C45940a aVar) {
                    super(2);
                    this.f107059a = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20523m mVar) {
                    AbstractC31071f fVar;
                    C20523m mVar2 = mVar;
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(mVar2, "");
                    int intValue = mVar2.f48283b.intValue();
                    Iterator<T> it = this.f107059a.mo77522a().f107132e.iterator();
                    while (it.hasNext()) {
                        TextStickerData data = it.next().getData();
                        if (data != null) {
                            C89378p<Integer, Integer> a = C73949aj.m130040a(data.getUiStartTime(), data.getUiEndTime(), intValue);
                            data.setUiStartTime(a.getFirst().intValue());
                            data.setUiEndTime(a.getSecond().intValue());
                            LiveData<AbstractC31071f> liveData = this.f107059a.f107007B;
                            if (liveData != null) {
                                fVar = liveData.getValue();
                            } else {
                                fVar = null;
                            }
                            int intValue2 = a.getFirst().intValue();
                            if (fVar != null) {
                                intValue2 = fVar.mo56386s(intValue2);
                            }
                            data.setStartTime(intValue2);
                            int intValue3 = a.getSecond().intValue();
                            if (fVar != null) {
                                intValue3 = fVar.mo56386s(intValue3);
                            }
                            data.setEndTime(intValue3);
                        }
                    }
                    return C89391z.f203057a;
                }
            }

            /* renamed from: a */
            public final void mo77525a(TextStickerData textStickerData, boolean z) {
                C89219l.m154721d(textStickerData, "");
                this.f107046z.setData(textStickerData);
                mo77536b(textStickerData, z);
            }

            /* renamed from: b */
            public final void mo77536b(TextStickerData textStickerData, boolean z) {
                int i;
                MethodCollector.m26663i(11027);
                C46239q b = mo77533b(textStickerData);
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                editTextStickerViewModel.mo77621b(b);
                b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f107045y.addView(b);
                AbstractC46119e eVar = this.f107025e;
                if (eVar != null) {
                    eVar.mo78310b(b);
                }
                this.f107024d = b;
                mo77544d(b);
                mo77542c(b);
                mo77556n();
                b.mo78535a(this.f107014J, this.f107035o);
                this.f107046z.mo78321a();
                if (!z && this.f107039s && (!C45890g.m88534a().f106862b.f106871b || (!this.f107038r.mo77285f() && !this.f107038r.mo77286g()))) {
                    if (C45890g.m88534a().f106865e) {
                        String text = b.getText();
                        C89219l.m154716b(text, "");
                        if (C45941a.m88740a(text) && C45890g.m88534a().f106867g) {
                            i = R.string.f0w;
                            b.postDelayed(new RunnableC45964c(this, b, i), 500);
                        }
                    }
                    i = R.string.axu;
                    b.postDelayed(new RunnableC45964c(this, b, i), 500);
                }
                if (textStickerData.isGuidanceSticker()) {
                    b.post(new RunnableC45965d(this, b));
                }
                if (textStickerData.getAutoSelect()) {
                    b.post(new RunnableC45966e(b));
                }
                MethodCollector.m26664o(11027);
            }

            /* renamed from: a */
            public final void mo77528a(C46239q qVar, int i) {
                if (i == 1) {
                    qVar.mo78534a(0.3137255f, false);
                } else if (i == 3) {
                    mo77546e(qVar);
                    AbstractC45872e eVar = this.f107030j;
                    if (eVar != null) {
                        eVar.mo77233a(qVar.f107753m ? 1 : 0, "slide_up");
                    }
                    this.f107015K = true;
                } else if (i == 4) {
                    qVar.mo78534a(0.3137255f, true);
                }
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
            }

            /* renamed from: a */
            public final void mo77526a(C46224i iVar, TextStickerData textStickerData, String str) {
                LiveData<AbstractC31071f> liveData;
                AbstractC31071f value;
                EditTextStickerViewModel editTextStickerViewModel = this.f107021a;
                if (editTextStickerViewModel == null) {
                    C89219l.m154710a("textStickerViewModel");
                }
                if (!editTextStickerViewModel.f107128a && (liveData = this.f107007B) != null && (value = liveData.getValue()) != null) {
                    value.mo56351e(textStickerData.getAudioTrackIndex());
                    textStickerData.setHasReadTextAudio(false);
                    textStickerData.setAudioText(null);
                    textStickerData.setAudioTrackIndex(-1);
                    textStickerData.setAudioTrackFilePath(null);
                    if (C45890g.m88534a().f106862b.f106872c) {
                        if (str.length() > 0) {
                            EditTextStickerViewModel editTextStickerViewModel2 = this.f107021a;
                            if (editTextStickerViewModel2 == null) {
                                C89219l.m154710a("textStickerViewModel");
                            }
                            editTextStickerViewModel2.mo77612a(textStickerData, (String) null);
                            C46110t.m88973i(textStickerData.getTextWrapList());
                        }
                    } else if (C46110t.m88973i(iVar.getTextWrapList()).length() > 0 && this.f107038r.f106891a.getInt("read_text_change_toast", 0) < 3) {
                        C85052j.C85053a.m146247b(iVar.getContext(), (int) R.string.ay2, 0).mo129996a();
                        this.f107038r.mo77287h();
                    }
                    value.mo56265a(textStickerData.getStartTime(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                    value.mo56388t();
                }
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(qVar, "");
                return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(kVar3, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(rVar, "");
                return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(kVar3, "");
                C89219l.m154721d(kVar4, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(sVar, "");
                return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            }

            private C45940a(ActivityC0945e eVar, AbstractC14552j jVar, AbstractC72510a aVar, boolean z, FrameLayout frameLayout, C46224i iVar, AbstractC45899e eVar2, LiveData<AbstractC31071f> liveData, AbstractC46043d dVar, int i, Rect rect, boolean z2, boolean z3) {
                C89219l.m154721d(eVar, "");
                C89219l.m154721d(jVar, "");
                C89219l.m154721d(frameLayout, "");
                C89219l.m154721d(iVar, "");
                this.f107042v = eVar;
                this.f107017M = jVar;
                this.f107043w = aVar;
                this.f107044x = z;
                this.f107045y = frameLayout;
                this.f107046z = iVar;
                this.f107006A = eVar2;
                this.f107007B = liveData;
                this.f107008C = dVar;
                this.f107018N = i;
                this.f107009D = rect;
                this.f107010E = null;
                this.f107019O = z2;
                this.f107020P = z3;
                this.f107038r = new C45902g();
                this.f107039s = true;
                this.f107041u = 1000;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C45940a(ActivityC0945e eVar, AbstractC14552j jVar, AbstractC72510a aVar, boolean z, FrameLayout frameLayout, C46224i iVar, AbstractC45899e eVar2, LiveData liveData, AbstractC46043d dVar, int i, Rect rect, boolean z2, boolean z3, int i2) {
                this(eVar, jVar, (i2 & 4) != 0 ? null : aVar, (i2 & 8) != 0 ? false : z, frameLayout, iVar, (i2 & 64) != 0 ? null : eVar2, (i2 & 128) != 0 ? null : liveData, (i2 & 256) == 0 ? dVar : null, (i2 & 512) != 0 ? 30 : i, (i2 & 1024) != 0 ? new Rect() : rect, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? false : z3);
            }
        }
