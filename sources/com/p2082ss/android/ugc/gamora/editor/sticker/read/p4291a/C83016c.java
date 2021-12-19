package com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83029b;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83030c;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83064h;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83067k;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c */
public final class C83016c extends AbstractC2562j<AbstractC83015b> implements AbstractC21566a, AbstractC83015b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f185478a = {new C89232y(C83016c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C89232y(C83016c.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0), new C89232y(C83016c.class, "textInputLayout", "getTextInputLayout()Lcom/ss/android/ugc/aweme/editSticker/text/view/TextStickerInputLayout;", 0)};

    /* renamed from: l */
    public static final C83017a f185479l = new C83017a((byte) 0);

    /* renamed from: b */
    public C83013a f185480b;

    /* renamed from: c */
    final AbstractC89244h f185481c = C89250i.m154773a((AbstractC89171a) new C83024g(this));

    /* renamed from: d */
    final AbstractC89244h f185482d = C89250i.m154773a((AbstractC89171a) new C83026i(this));

    /* renamed from: e */
    final AbstractC89248d f185483e = C21572a.m40504a(getDiContainer(), C46224i.class);

    /* renamed from: f */
    public final List<C83029b> f185484f = new ArrayList();

    /* renamed from: g */
    public final C2564l<Boolean> f185485g = new C2564l<>(false);

    /* renamed from: h */
    public final C2563k<List<String>> f185486h = new C2563k<>();

    /* renamed from: i */
    public final C2563k<List<String>> f185487i = new C2563k<>();

    /* renamed from: j */
    public AbstractC23317a f185488j;

    /* renamed from: k */
    public final AbstractC22186b f185489k;

    /* renamed from: m */
    private final AbstractC89248d f185490m = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: n */
    private final AbstractC89248d f185491n = C21572a.m40504a(getDiContainer(), AbstractC46036a.class);

    /* renamed from: o */
    private final AbstractC89244h f185492o = C89250i.m154773a((AbstractC89171a) new C83027j(this));

    /* renamed from: p */
    private final C21582f f185493p;

    static {
        Covode.recordClassIndex(96889);
    }

    /* renamed from: c */
    public final AbstractC46036a mo128106c() {
        return (AbstractC46036a) this.f185491n.mo23374a(this, f185478a[1]);
    }

    /* renamed from: d */
    public final C83031d mo128108d() {
        return (C83031d) this.f185492o.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$a */
    public static final class C83017a {
        static {
            Covode.recordClassIndex(96890);
        }

        private C83017a() {
        }

        public /* synthetic */ C83017a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83015b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185493p;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$j */
    static final class C83027j extends AbstractC89220m implements AbstractC89171a<C83031d> {

        /* renamed from: a */
        final /* synthetic */ C83016c f185504a;

        static {
            Covode.recordClassIndex(96900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83027j(C83016c cVar) {
            super(0);
            this.f185504a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83031d invoke() {
            return this.f185504a.f185489k.mo36386a("ReadTextEffectScene");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b
    /* renamed from: b */
    public final boolean mo128104b() {
        C83031d d = mo128108d();
        if (d != null) {
            return d.f185535e;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$g */
    static final class C83024g extends AbstractC89220m implements AbstractC89171a<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ C83016c f185501a;

        static {
            Covode.recordClassIndex(96897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83024g(C83016c cVar) {
            super(0);
            this.f185501a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46415f invoke() {
            Context u = this.f185501a.f185489k.mo36488u();
            C89219l.m154716b(u, "");
            return C46404c.m89554a(u, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$i */
    static final class C83026i extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C83016c f185503a;

        static {
            Covode.recordClassIndex(96899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83026i(C83016c cVar) {
            super(0);
            this.f185503a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a = this.f185503a.getDiContainer().mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b
    /* renamed from: a */
    public final boolean mo128103a() {
        T value = this.f185485g.f7727a.getValue();
        C89219l.m154716b(value, "");
        return value.booleanValue();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (C83028d.m143349a()) {
            if ((C83064h.m143411d() == 1 || C83064h.m143411d() == 3) && !C63244g.m114602a().mo73255A().mo93901a()) {
                IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
                C89219l.m154716b(h, "");
                if (!h.mo93965b()) {
                    ((AbstractC72510a) this.f185490m.mo23374a(this, f185478a[0])).mo114817f().observe(this, new C83025h(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$b */
    public static final class C83018b implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C83016c f185494a;

        static {
            Covode.recordClassIndex(96891);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83018b(C83016c cVar) {
            this.f185494a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            this.f185494a.f185484f.clear();
            this.f185494a.f185484f.addAll(C83030c.m143351a(effectChannelResponse));
            C83031d d = this.f185494a.mo128108d();
            if (d != null) {
                d.mo128128b(new ArrayList(this.f185494a.f185484f));
            }
            if (!this.f185494a.f185484f.isEmpty()) {
                C83016c cVar = this.f185494a;
                cVar.mo128105b(cVar.f185484f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$f */
    public static final class C83023f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C83016c f185500a;

        static {
            Covode.recordClassIndex(96896);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83023f(C83016c cVar) {
            this.f185500a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            C83013a aVar = this.f185500a.f185480b;
            if (aVar != null) {
                String obj = editable.toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                char[] charArray = obj.toCharArray();
                C89219l.m154716b(charArray, "");
                StringBuilder sb = new StringBuilder();
                for (char c : charArray) {
                    if (!(c == ' ' || c == '\n')) {
                        sb.append(Character.toLowerCase(c));
                    }
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                List<String> b = aVar.mo128097b(sb2);
                if (!b.isEmpty()) {
                    this.f185500a.f185486h.mo6999a(b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$d */
    static final class C83020d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83016c f185496a;

        static {
            Covode.recordClassIndex(96893);
        }

        C83020d(C83016c cVar) {
            this.f185496a = cVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$d$a */
        static final class View$OnClickListenerC83021a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C83020d f185497a;

            /* renamed from: b */
            final /* synthetic */ List f185498b;

            static {
                Covode.recordClassIndex(96894);
            }

            View$OnClickListenerC83021a(C83020d dVar, List list) {
                this.f185497a = dVar;
                this.f185498b = list;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC23317a aVar = this.f185497a.f185496a.f185488j;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list = (List) obj;
            C83013a aVar = this.f185496a.f185480b;
            if (aVar != null) {
                String c = C63244g.m114602a().mo73255A().mo93904c();
                List<String> a = aVar.mo128096a();
                C89219l.m154721d(c, "");
                C89219l.m154721d(a, "");
                Keva keva = C83067k.f185617a;
                String a2 = C80408et.m139388a(c);
                Object[] array = a.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                keva.storeStringArray(a2, (String[]) array);
            }
            for (String str : list) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f185496a.f185482d.getValue();
                C89219l.m154721d(str, "");
                C89219l.m154721d(videoPublishEditModel, "");
                C39162r.m79460a("text_reading_voice_unlock", new C84425b().mo129406a("tone_id", str).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel)).f188764a);
            }
            C83016c cVar = this.f185496a;
            C89219l.m154716b(list, "");
            cVar.mo128109d(list);
            C83016c cVar2 = this.f185496a;
            Point readIconPosition = ((C46224i) cVar2.f185483e.mo23374a(cVar2, C83016c.f185478a[2])).getReadIconPosition();
            if (readIconPosition != null) {
                String c2 = this.f185496a.mo128107c(list);
                AbstractC23317a aVar2 = this.f185496a.f185488j;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                this.f185496a.f185488j = new C23329a(C2556g.m7474c(this.f185496a)).mo38022a(c2).mo38029a(readIconPosition.x, readIconPosition.y).mo38036a(false).mo38037a(true, (View.OnClickListener) new View$OnClickListenerC83021a(this, list)).mo38030a(3000L).mo38034a(EnumC23352h.TOP).mo38012d();
                AbstractC23317a aVar3 = this.f185496a.f185488j;
                if (aVar3 != null) {
                    aVar3.mo38001a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$e */
    static final class C83022e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83016c f185499a;

        static {
            Covode.recordClassIndex(96895);
        }

        C83022e(C83016c cVar) {
            this.f185499a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83031d d = this.f185499a.mo128108d();
                if (d != null) {
                    d.f185535e = false;
                    return;
                }
                return;
            }
            AbstractC23317a aVar = this.f185499a.f185488j;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: e */
    private final List<C83029b> m143340e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            Iterator<T> it = this.f185484f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.f185506c.f185597c, (Object) t)) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b
    /* renamed from: a */
    public final void mo128102a(List<C83029b> list) {
        C89219l.m154721d(list, "");
        if (!C89219l.m154714a((Object) this.f185485g.f7727a.getValue(), (Object) false) && !(!this.f185484f.isEmpty())) {
            this.f185484f.addAll(list);
            mo128105b(list);
        }
    }

    /* renamed from: d */
    public final void mo128109d(List<String> list) {
        List<C83029b> e = m143340e(list);
        C83031d d = mo128108d();
        if (d != null) {
            C89219l.m154721d(e, "");
            d.f185535e = true;
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                d.f185534d.add(0, it.next());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$c */
    static final class C83019c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83016c f185495a;

        static {
            Covode.recordClassIndex(96892);
        }

        C83019c(C83016c cVar) {
            this.f185495a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            List<T> list = (List) obj;
            C83013a aVar = this.f185495a.f185480b;
            if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                C89219l.m154716b(list, "");
                for (T t : list) {
                    String a = aVar.mo128095a(t);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                this.f185495a.f185487i.mo6999a(arrayList);
                if (aVar.mo128096a().isEmpty()) {
                    this.f185495a.f185485g.mo7019b(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.c$h */
    static final class C83025h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83016c f185502a;

        static {
            Covode.recordClassIndex(96898);
        }

        C83025h(C83016c cVar) {
            this.f185502a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f185502a.f185485g.mo7019b(true);
            C83016c cVar = this.f185502a;
            ((AbstractC84398d) cVar.f185481c.getValue()).mo78910a("speaking-voice", false, false, (IFetchEffectChannelListener) new C83018b(cVar));
            C83016c cVar2 = this.f185502a;
            cVar2.f185486h.mo6997a(cVar2, new C83019c(cVar2));
            cVar2.f185487i.mo6997a(cVar2, new C83020d(cVar2));
            cVar2.mo128106c().mo77644s().mo7036a(cVar2, new C83022e(cVar2));
            this.f185502a.mo128106c().mo77608a(new C83023f(this.f185502a));
        }
    }

    /* renamed from: c */
    public final String mo128107c(List<String> list) {
        if (list.size() == 1) {
            String str = ((C83029b) C89070n.m154579f((List) m143340e(list))).f185506c.f185596b;
            String string = C2556g.m7473b(this).getResources().getString(R.string.h_v, str);
            C89219l.m154716b(string, "");
            return string;
        }
        String string2 = C2556g.m7473b(this).getResources().getString(R.string.h_w);
        C89219l.m154716b(string2, "");
        return string2;
    }

    /* renamed from: b */
    public final void mo128105b(List<C83029b> list) {
        List<String> d = C83067k.m143428d(C63244g.m114602a().mo73255A().mo93904c());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C83029b bVar : list) {
            if (!d.contains(bVar.f185506c.f185597c) && bVar.f185506c.f185599e == 1) {
                String str = bVar.f185506c.f185598d;
                if ((true ^ C89361p.m154870a((CharSequence) str)) && str != null) {
                    for (String str2 : C89361p.m154921c(str, new String[]{","})) {
                        Locale locale = Locale.getDefault();
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = str2.toLowerCase(locale);
                        C89219l.m154716b(lowerCase, "");
                        linkedHashMap.put(lowerCase, bVar.f185506c.f185597c);
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.f185485g.mo7019b(true);
            this.f185480b = new C83013a(linkedHashMap, C89070n.m154585g((Collection) d));
        }
    }

    public C83016c(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185493p = fVar;
        this.f185489k = bVar;
    }
}
