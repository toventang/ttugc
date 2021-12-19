package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment.C72854a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72898d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72903c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72905e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3868d.View$OnTouchListenerC72900a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72920a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72972e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72991j;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73038n;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73057p;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73065r;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p3872a.C72956a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3861c.C72848a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.question.C73085a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.question.C73091c;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75398a;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget */
public final class InteractStickerWidget extends AbsInteractStickerWidget implements AbstractC1214u<C33942b>, AbstractC72920a, AbstractC72925f, AbstractC72925f, AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public C75391j f163975h;

    /* renamed from: i */
    public InteractStickerParent f163976i;

    /* renamed from: j */
    public AbstractC72926g f163977j;

    /* renamed from: k */
    public Aweme f163978k;

    /* renamed from: l */
    private View$OnTouchListenerC72900a f163979l;

    /* renamed from: m */
    private List<? extends InteractStickerStruct> f163980m;

    /* renamed from: n */
    private List<? extends InteractStickerStruct> f163981n;

    /* renamed from: o */
    private InteractStickerViewModel f163982o;

    /* renamed from: p */
    private List<C72903c> f163983p = new ArrayList();

    /* renamed from: q */
    private C72905e f163984q;

    /* renamed from: r */
    private final Map<Integer, Integer> f163985r = C89041ag.m154421a(new C89378p(6, 1), new C89378p(4, 2), new C89378p(7, 2), new C89378p(10, 3), new C89378p(3, 4));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a */
    public interface AbstractC73070a {
        static {
            Covode.recordClassIndex(85776);
        }

        /* renamed from: a */
        AbstractC72924e mo115503a();
    }

    static {
        Covode.recordClassIndex(85775);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: c */
    public final int mo60207c() {
        return R.layout.bjq;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(194, new RunnableC90250g(InteractStickerWidget.class, "onDissmissInteractWindow", C49681i.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f
    /* renamed from: a */
    public final C72905e mo115318a() {
        return this.f163984q;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f163976i = view != null ? (InteractStickerParent) view.findViewById(R.id.dnb) : null;
        int i = Build.VERSION.SDK_INT;
        InteractStickerParent interactStickerParent = this.f163976i;
        if (interactStickerParent != null) {
            interactStickerParent.setLayoutDirection(0);
        }
        Activity d = mo60208d();
        C89219l.m154716b(d, "");
        View$OnTouchListenerC72900a aVar = new View$OnTouchListenerC72900a(d, this.f163983p, this.f163975h, this.f163977j, this);
        this.f163979l = aVar;
        InteractStickerParent interactStickerParent2 = this.f163976i;
        if (interactStickerParent2 != null) {
            interactStickerParent2.setOnTouchListener(aVar);
        }
        if (this.f80273e != null) {
            this.f163975h = (C75391j) this.f80273e.mo60192a("interact_sticker_data");
            this.f163980m = (List) this.f80273e.mo60192a("interact_sticker_aweme_data");
            this.f163981n = (List) this.f80273e.mo60192a("interact_sticker_video_data");
        } else {
            this.f163975h = (C75391j) mo115493e().mo115497a("interact_sticker_data");
            this.f163980m = (List) mo115493e().mo115497a("interact_sticker_aweme_data");
            this.f163981n = (List) mo115493e().mo115497a("interact_sticker_video_data");
        }
        m128993a(this.f163975h);
        m128995a(this.f163980m, this.f163981n);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    /* renamed from: a */
    public final void mo115492a(AbstractC72926g gVar) {
        C89219l.m154721d(gVar, "");
        this.f163977j = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: h */
    private void m128996h() {
        Iterator<T> it = this.f163983p.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: i */
    private void m128997i() {
        Iterator<T> it = this.f163983p.iterator();
        while (it.hasNext()) {
            it.next().f163594d.mo115230h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    /* renamed from: e */
    public final InteractStickerViewModel mo115493e() {
        if (this.f163982o == null) {
            InteractStickerViewModel interactStickerViewModel = new InteractStickerViewModel();
            this.f163982o = interactStickerViewModel;
            interactStickerViewModel.f163967a = this;
        }
        InteractStickerViewModel interactStickerViewModel2 = this.f163982o;
        if (interactStickerViewModel2 == null) {
            C89219l.m154715b();
        }
        return interactStickerViewModel2;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75341f
    /* renamed from: f */
    public final void mo115500f() {
        for (T t : this.f163983p) {
            AbstractC72924e eVar = t.f163594d;
            t.f163594d.mo115226b();
            eVar.mo115311i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75341f
    /* renamed from: g */
    public final void mo115501g() {
        for (T t : this.f163983p) {
            t.f163594d.mo115310b(t.f163594d.mo115226b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onPause() {
        super.onPause();
        Iterator<T> it = this.f163983p.iterator();
        while (it.hasNext()) {
            it.next().f163594d.mo115313k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onResume() {
        super.onResume();
        Iterator<T> it = this.f163983p.iterator();
        while (it.hasNext()) {
            it.next().f163594d.mo115312j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$b */
    public static final class C73071b implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163986a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163987b;

        static {
            Covode.recordClassIndex(85777);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            Context context = this.f163987b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163987b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163986a;
            InteractStickerParent interactStickerParent = this.f163987b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            return C72898d.C72899a.m128735a(context, jVar, interactStickerStruct, interactStickerParent, this.f163987b.f163977j, this.f163987b.f163978k);
        }

        C73071b(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163986a = interactStickerStruct;
            this.f163987b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$h */
    public static final class C73077h implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163998a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163999b;

        static {
            Covode.recordClassIndex(85783);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            Context context = this.f163999b.f80270b;
            C75391j jVar = this.f163999b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163998a;
            InteractStickerParent interactStickerParent = this.f163999b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            AbstractC72926g gVar = this.f163999b.f163977j;
            AbstractC75401d.C75402a a = jVar.f169459n.mo80041a();
            jVar.f169446a = (float) a.f169476a;
            jVar.f169447b = (float) a.f169477b;
            return new C72854a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        C73077h(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163998a = interactStickerStruct;
            this.f163999b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$j */
    public static final class C73079j implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f164002a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f164003b;

        static {
            Covode.recordClassIndex(85785);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            Context context = this.f164003b.f80270b;
            C75391j jVar = this.f164003b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f164002a;
            InteractStickerParent interactStickerParent = this.f164003b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            AbstractC72926g gVar = this.f164003b.f163977j;
            AbstractC75401d.C75402a a = jVar.f169459n.mo80041a();
            jVar.f169446a = (float) a.f169476a;
            jVar.f169447b = (float) a.f169477b;
            return new C72848a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        C73079j(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f164002a = interactStickerStruct;
            this.f164003b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$k */
    public static final class C73080k implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f164004a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f164005b;

        static {
            Covode.recordClassIndex(85786);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            Context context = this.f164005b.f80270b;
            C75391j jVar = this.f164005b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f164004a;
            InteractStickerParent interactStickerParent = this.f164005b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            AbstractC72926g gVar = this.f164005b.f163977j;
            AbstractC75401d.C75402a a = jVar.f169459n.mo80041a();
            jVar.f169446a = (float) a.f169476a;
            jVar.f169447b = (float) a.f169477b;
            return new C73091c(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        C73080k(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f164004a = interactStickerStruct;
            this.f164005b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$c */
    public static final class C73072c implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163988a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163989b;

        static {
            Covode.recordClassIndex(85778);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f163989b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163989b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163988a;
            InteractStickerParent interactStickerParent = this.f163989b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            Aweme aweme = this.f163989b.f163978k;
            if (aweme == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            C89219l.m154721d(aweme, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C73085a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        C73072c(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163988a = interactStickerStruct;
            this.f163989b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$d */
    public static final class C73073d implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163990a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163991b;

        static {
            Covode.recordClassIndex(85779);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f163991b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163991b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163990a;
            InteractStickerParent interactStickerParent = this.f163991b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            Aweme aweme = this.f163991b.f163978k;
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C72991j(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        C73073d(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163990a = interactStickerStruct;
            this.f163991b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$e */
    public static final class C73074e implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163992a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163993b;

        static {
            Covode.recordClassIndex(85780);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f163993b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163993b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163992a;
            InteractStickerParent interactStickerParent = this.f163993b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            InteractStickerWidget interactStickerWidget = this.f163993b;
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            C89219l.m154721d(interactStickerWidget, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C73057p(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, interactStickerWidget);
        }

        C73074e(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163992a = interactStickerStruct;
            this.f163993b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$f */
    public static final class C73075f implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163994a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163995b;

        static {
            Covode.recordClassIndex(85781);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f163995b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163995b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163994a;
            InteractStickerParent interactStickerParent = this.f163995b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            Aweme aweme = this.f163995b.f163978k;
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C72956a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        C73075f(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163994a = interactStickerStruct;
            this.f163995b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$g */
    public static final class C73076g implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163996a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f163997b;

        static {
            Covode.recordClassIndex(85782);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f163997b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f163997b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f163996a;
            InteractStickerParent interactStickerParent = this.f163997b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            Aweme aweme = this.f163997b.f163978k;
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C72972e(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        C73076g(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f163996a = interactStickerStruct;
            this.f163997b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$i */
    public static final class C73078i implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f164000a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f164001b;

        static {
            Covode.recordClassIndex(85784);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f164001b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f164001b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f164000a;
            InteractStickerParent interactStickerParent = this.f164001b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C73065r(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        C73078i(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f164000a = interactStickerStruct;
            this.f164001b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$l */
    public static final class C73081l implements AbstractC73070a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f164006a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f164007b;

        static {
            Covode.recordClassIndex(85787);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.AbstractC73070a
        /* renamed from: a */
        public final AbstractC72924e mo115503a() {
            AbstractC75401d.C75402a aVar;
            float f;
            Context context = this.f164007b.f80270b;
            C89219l.m154716b(context, "");
            C75391j jVar = this.f164007b.f163975h;
            InteractStickerStruct interactStickerStruct = this.f164006a;
            InteractStickerParent interactStickerParent = this.f164007b.f163976i;
            if (interactStickerParent == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(interactStickerParent, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            return new C73038n(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        C73081l(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f164006a = interactStickerStruct;
            this.f164007b = interactStickerWidget;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onCreate() {
        super.onCreate();
        if (this.f80273e != null) {
            this.f80273e.mo60189a("interact_sticker_data", (AbstractC1214u<C33942b>) this);
            this.f80273e.mo60189a("interact_sticker_video_data", (AbstractC1214u<C33942b>) this);
            this.f80273e.mo60189a("interact_sticker_aweme_data", (AbstractC1214u<C33942b>) this);
            this.f80273e.mo60189a("interact_sticker_clear_data", (AbstractC1214u<C33942b>) this);
            this.f80273e.mo60190a("interact_sticker_update_intro_layout_y", this, true);
            this.f80273e.mo60190a("viewholder_select_status_changed", this, true);
            return;
        }
        mo115493e().mo115494a("interact_sticker_data", (AbstractC1214u<C33942b>) this);
        mo115493e().mo115494a("interact_sticker_video_data", (AbstractC1214u<C33942b>) this);
        mo115493e().mo115494a("interact_sticker_aweme_data", (AbstractC1214u<C33942b>) this);
        mo115493e().mo115494a("interact_sticker_clear_data", (AbstractC1214u<C33942b>) this);
        mo115493e().mo115495a("interact_sticker_update_intro_layout_y", this, true);
        mo115493e().mo115495a("viewholder_select_status_changed", this, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    /* renamed from: a */
    public final void mo115491a(Aweme aweme) {
        this.f163978k = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f
    /* renamed from: a */
    public final void mo115319a(C72905e eVar) {
        C89219l.m154721d(eVar, "");
        this.f163984q = eVar;
    }

    @AbstractC90264r
    public final void onDissmissInteractWindow(C49681i iVar) {
        C89219l.m154721d(iVar, "");
        int i = iVar.f114348a;
        for (T t : this.f163983p) {
            if (t.f163594d.mo115317m() != i) {
                AbstractC72924e eVar = t.f163594d;
                t.f163594d.mo115226b();
                eVar.mo115311i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$o */
    public static final class C73084o implements AbstractC72921b {

        /* renamed from: a */
        final /* synthetic */ C72903c f164009a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f164010b;

        /* renamed from: c */
        final /* synthetic */ long f164011c;

        /* renamed from: d */
        final /* synthetic */ MotionEvent f164012d;

        static {
            Covode.recordClassIndex(85790);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b
        /* renamed from: a */
        public final void mo115309a(boolean z) {
            AbstractC75398a aVar;
            C75391j jVar = this.f164010b.f163975h;
            if (!(jVar == null || (aVar = jVar.f169460o) == null)) {
                this.f164009a.f163594d.mo115226b();
                AbstractC72924e eVar = this.f164009a.f163594d;
                this.f164009a.f163594d.mo115226b();
                eVar.mo115223a();
                MotionEvent motionEvent = this.f164012d;
                if (motionEvent != null) {
                    motionEvent.getX();
                }
                MotionEvent motionEvent2 = this.f164012d;
                if (motionEvent2 != null) {
                    motionEvent2.getY();
                }
                this.f164009a.f163594d.mo115316l();
                aVar.mo80256a(z);
            }
            C75391j jVar2 = this.f164010b.f163975h;
            if (jVar2 != null && jVar2.f169460o != null) {
                this.f164009a.f163594d.mo115226b();
            }
        }

        C73084o(C72903c cVar, InteractStickerWidget interactStickerWidget, long j, MotionEvent motionEvent) {
            this.f164009a = cVar;
            this.f164010b = interactStickerWidget;
            this.f164011c = j;
            this.f164012d = motionEvent;
        }
    }

    /* renamed from: a */
    private final void m128993a(C75391j jVar) {
        AbstractC75401d.C75402a aVar;
        int i;
        boolean z;
        float f;
        AbstractC75401d dVar;
        if (jVar == null || (dVar = jVar.f169459n) == null) {
            aVar = null;
        } else {
            aVar = dVar.mo80041a();
        }
        float f2 = 0.0f;
        if (jVar != null) {
            if (aVar != null) {
                f = (float) aVar.f169476a;
            } else {
                f = 0.0f;
            }
            jVar.f169446a = f;
            if (aVar != null) {
                f2 = (float) aVar.f169477b;
            }
            jVar.f169447b = f2;
        }
        InteractStickerParent interactStickerParent = this.f163976i;
        if (interactStickerParent != null) {
            if (jVar != null) {
                z = jVar.f169458m;
            } else {
                z = true;
            }
            interactStickerParent.setNeedConsumeEvent(z);
        }
        View$OnTouchListenerC72900a aVar2 = this.f163979l;
        if (aVar2 != null) {
            aVar2.f163586p = jVar;
        }
        if (jVar != null) {
            for (C72903c cVar : this.f163983p) {
                cVar.f163594d.mo115236a(jVar);
                View view = cVar.f163592b;
                int i2 = 0;
                if (aVar != null) {
                    i = aVar.f169478c;
                    i2 = aVar.f169479d;
                } else {
                    i = 0;
                }
                m128991a(view, i, i2);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null) {
            switch (str.hashCode()) {
                case -1213045287:
                    if (str.equals("interact_sticker_video_data")) {
                        List<? extends InteractStickerStruct> list = (List) bVar2.mo60212a();
                        this.f163981n = list;
                        m128995a((List<? extends InteractStickerStruct>) null, list);
                        return;
                    }
                    return;
                case -949174003:
                    if (str.equals("interact_sticker_aweme_data")) {
                        List<? extends InteractStickerStruct> list2 = (List) bVar2.mo60212a();
                        this.f163980m = list2;
                        m128995a(list2, (List<? extends InteractStickerStruct>) null);
                        return;
                    }
                    return;
                case -821385854:
                    if (str.equals("interact_sticker_update_intro_layout_y")) {
                        Object a = bVar2.mo60212a();
                        C89219l.m154716b(a, "");
                        m128994a((C89378p) a);
                        return;
                    }
                    return;
                case -328001721:
                    if (str.equals("interact_sticker_clear_data")) {
                        InteractStickerParent interactStickerParent = this.f163976i;
                        if (interactStickerParent != null) {
                            interactStickerParent.removeAllViews();
                        }
                        this.f163980m = null;
                        this.f163981n = null;
                        this.f163983p = new ArrayList();
                        return;
                    }
                    return;
                case -153749291:
                    if (str.equals("interact_sticker_data")) {
                        C75391j jVar = (C75391j) bVar2.mo60212a();
                        this.f163975h = jVar;
                        m128993a(jVar);
                        return;
                    }
                    return;
                case 1341960156:
                    if (str.equals("viewholder_select_status_changed")) {
                        Object a2 = bVar2.mo60212a();
                        C89219l.m154716b(a2, "");
                        if (((Boolean) a2).booleanValue()) {
                            m128996h();
                            return;
                        } else {
                            m128997i();
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m128994a(C89378p<Integer, Integer> pVar) {
        for (C72903c cVar : this.f163983p) {
            if (cVar.f163593c.getType() == 11) {
                cVar.f163594d.mo115315b(pVar.getFirst().intValue(), pVar.getSecond().intValue());
            }
        }
    }

    /* renamed from: a */
    public final int mo115499a(int i) {
        for (Map.Entry<Integer, Integer> entry : this.f163985r.entrySet()) {
            if (entry.getKey().intValue() == i) {
                return entry.getValue().intValue();
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72920a
    /* renamed from: b */
    public final void mo115308b(long j, MotionEvent motionEvent) {
        mo115307a(j, motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$m */
    public static final class C73082m<T> implements Comparator {
        static {
            Covode.recordClassIndex(85788);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.getIndex()), Integer.valueOf(t2.getIndex()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$n */
    public static final class C73083n<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ InteractStickerWidget f164008a;

        static {
            Covode.recordClassIndex(85789);
        }

        public C73083n(InteractStickerWidget interactStickerWidget) {
            this.f164008a = interactStickerWidget;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(this.f164008a.mo115499a(t.getType())), Integer.valueOf(this.f164008a.mo115499a(t2.getType())));
        }
    }

    /* renamed from: a */
    private final void m128992a(InteractStickerStruct interactStickerStruct, AbstractC73070a aVar) {
        if (C13603b.m24435a((Collection) this.f163983p)) {
            AbstractC72924e a = aVar.mo115503a();
            if (a != null) {
                a.mo115226b();
                View a2 = a.mo115223a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                m128990a(0, a2, interactStickerStruct, a, false);
                return;
            }
            return;
        }
        int i = 0;
        for (T t : this.f163983p) {
            if (C89219l.m154714a(t.f163593c, interactStickerStruct)) {
                t.f163594d.mo115314a(interactStickerStruct);
                return;
            } else if (interactStickerStruct.getType() != 5 && interactStickerStruct.getType() != 9 && interactStickerStruct.getType() != 8 && t.f163593c.getType() == interactStickerStruct.getType()) {
                AbstractC72924e a3 = aVar.mo115503a();
                if (a3 != null) {
                    a3.mo115226b();
                    View a4 = a3.mo115223a();
                    if (a4 == null) {
                        C89219l.m154715b();
                    }
                    m128990a(i, a4, interactStickerStruct, a3, true);
                    return;
                }
                return;
            } else if (i == this.f163983p.size() - 1 || mo115499a(interactStickerStruct.getType()) >= mo115499a(t.f163593c.getType())) {
                if (i == this.f163983p.size() - 1 && mo115499a(interactStickerStruct.getType()) >= mo115499a(t.f163593c.getType())) {
                    i++;
                }
                AbstractC72924e a5 = aVar.mo115503a();
                if (a5 != null) {
                    a5.mo115226b();
                    View a6 = a5.mo115223a();
                    if (a6 == null) {
                        C89219l.m154715b();
                    }
                    m128990a(i, a6, interactStickerStruct, a5, false);
                    return;
                }
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private final void m128995a(List<? extends InteractStickerStruct> list, List<? extends InteractStickerStruct> list2) {
        List list3;
        List list4;
        int i;
        int i2;
        AbstractC75401d dVar;
        ArrayList<InteractStickerStruct> arrayList = new ArrayList();
        AbstractC75401d.C75402a aVar = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                if (t.getType() == 5) {
                    arrayList2.add(t);
                }
            }
            list4 = C89070n.m154553a((Iterable) arrayList2, (Comparator) new C73082m());
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : list) {
                if (t2.getType() != 5) {
                    arrayList3.add(t2);
                }
            }
            list3 = C89070n.m154553a((Iterable) arrayList3, (Comparator) new C73083n(this));
        } else {
            list4 = null;
            list3 = null;
        }
        if (list2 == null) {
            list2 = C89086z.INSTANCE;
        }
        arrayList.addAll(list2);
        if (list4 == null) {
            list4 = C89086z.INSTANCE;
        }
        arrayList.addAll(list4);
        if (list3 == null) {
            list3 = C89086z.INSTANCE;
        }
        arrayList.addAll(list3);
        for (InteractStickerStruct interactStickerStruct : arrayList) {
            int type = interactStickerStruct.getType();
            if (type != 16) {
                if (type != 17) {
                    switch (type) {
                        case 2:
                            m128992a(interactStickerStruct, new C73071b(interactStickerStruct, this));
                            continue;
                        case 3:
                            m128992a(interactStickerStruct, new C73074e(interactStickerStruct, this));
                            continue;
                        case 4:
                            m128992a(interactStickerStruct, new C73077h(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            m128992a(interactStickerStruct, new C73078i(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            m128992a(interactStickerStruct, new C73079j(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            m128992a(interactStickerStruct, new C73080k(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            m128992a(interactStickerStruct, new C73081l(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            m128992a(interactStickerStruct, new C73076g(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            if (C50539g.m94750d(this.f163978k)) {
                                m128992a(interactStickerStruct, new C73073d(interactStickerStruct, this));
                                break;
                            } else {
                                continue;
                            }
                    }
                } else {
                    m128992a(interactStickerStruct, new C73072c(interactStickerStruct, this));
                }
            } else if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getDuetStickerAB()) {
                m128992a(interactStickerStruct, new C73075f(interactStickerStruct, this));
            }
        }
        View$OnTouchListenerC72900a aVar2 = this.f163979l;
        if (aVar2 != null) {
            aVar2.mo115261a(this.f163983p);
        }
        C75391j jVar = this.f163975h;
        if (!(jVar == null || (dVar = jVar.f169459n) == null)) {
            aVar = dVar.mo80041a();
        }
        for (C72903c cVar : this.f163983p) {
            View view = cVar.f163592b;
            if (aVar != null) {
                i = aVar.f169478c;
                i2 = aVar.f169479d;
            } else {
                i = 0;
                i2 = 0;
            }
            m128991a(view, i, i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72920a
    /* renamed from: a */
    public final void mo115307a(long j, MotionEvent motionEvent) {
        float f;
        float f2;
        for (C72903c cVar : C89070n.m154584g((Iterable) this.f163983p)) {
            AbstractC72924e eVar = cVar.f163594d;
            int b = cVar.f163594d.mo115226b();
            if (motionEvent != null) {
                f = motionEvent.getX();
                f2 = motionEvent.getY();
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (eVar.mo115225a(j, b, f, f2, new C73084o(cVar, this, j, motionEvent))) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m128991a(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i;
            layoutParams2.topMargin = i2;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    private final void m128990a(int i, View view, InteractStickerStruct interactStickerStruct, AbstractC72924e eVar, boolean z) {
        if (i >= 0 && i < this.f163983p.size() && z) {
            try {
                this.f163983p.remove(i);
                InteractStickerParent interactStickerParent = this.f163976i;
                if (interactStickerParent != null) {
                    interactStickerParent.removeViewAt(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.f163983p.add(i, new C72903c(i, view, interactStickerStruct, eVar));
        InteractStickerParent interactStickerParent2 = this.f163976i;
        if (interactStickerParent2 != null) {
            interactStickerParent2.addView(view, i);
        }
    }
}
