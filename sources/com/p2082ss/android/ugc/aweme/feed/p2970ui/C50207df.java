package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.experiment.C46973gh;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.df */
public final class C50207df extends AbstractC49544a {

    /* renamed from: b */
    public static final C50208a f115940b = new C50208a((byte) 0);

    /* renamed from: a */
    public final Bundle f115941a;

    /* renamed from: c */
    private final String f115942c = "isShowVideoDuet";

    /* renamed from: d */
    private final String f115943d = "uistate";

    /* renamed from: e */
    private TuxButton f115944e;

    /* renamed from: f */
    private View f115945f;

    /* renamed from: g */
    private View f115946g;

    /* renamed from: h */
    private final boolean f115947h;

    static {
        Covode.recordClassIndex(59333);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.df$a */
    public static final class C50208a {
        static {
            Covode.recordClassIndex(59334);
        }

        private C50208a() {
        }

        public /* synthetic */ C50208a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.df$b */
    static final class C50209b<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ C50207df f115948a;

        static {
            Covode.recordClassIndex(59335);
        }

        C50209b(C50207df dfVar) {
            this.f115948a = dfVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            Aweme aweme = (Aweme) obj;
            C89219l.m154721d(aweme, "");
            return this.f115948a.mo85374a(aweme);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.df$c */
    static final class View$OnClickListenerC50210c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50207df f115949a;

        static {
            Covode.recordClassIndex(59336);
        }

        View$OnClickListenerC50210c(C50207df dfVar) {
            this.f115949a = dfVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115949a.f113958Q.mo60191a("video_duet_click", (Object) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, new C50209b(this));
    }

    /* renamed from: b */
    private static boolean m94220b(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            C89219l.m154716b(interactStickerStruct, "");
            if (interactStickerStruct.getType() == 16) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        TuxButton tuxButton;
        this.f115945f = view;
        Context context = this.f113959R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        View a = C1870c.m6045a((Activity) context, (int) R.layout.t2);
        this.f115946g = a;
        if (a != null) {
            tuxButton = (TuxButton) a.findViewById(R.id.apd);
        } else {
            tuxButton = null;
        }
        this.f115944e = tuxButton;
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new View$OnClickListenerC50210c(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!C89219l.m154714a((Object) bVar.f80277a, (Object) "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Aweme aweme = this.f113953L;
        C89219l.m154716b(aweme, "");
        hashMap.put("aweme_state", aweme);
        hashMap.put(this.f115942c, Boolean.valueOf(mo85374a(aweme)));
        return new C33942b(this.f115943d, hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m94221c(com.p2082ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50207df.m94221c(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public final boolean mo85374a(Aweme aweme) {
        if (aweme != null && C46973gh.m90254a() && m94221c(aweme)) {
            if (this.f115947h) {
                return true;
            }
            if (!m94220b(aweme) || C46973gh.m90255b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4067);
        if (!this.f113952K) {
            View view = this.f115945f;
            if (view instanceof FrameLayout) {
                if (view != null) {
                    ((FrameLayout) view).addView(this.f115946g);
                    this.f113952K = true;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    MethodCollector.m26664o(4067);
                    throw nullPointerException;
                }
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(4067);
            return;
        }
        Object obj = ((Map) bVar.mo60212a()).get("aweme_state");
        Aweme aweme = null;
        if (!(obj instanceof Aweme)) {
            obj = null;
        }
        if (obj == null) {
            StringBuilder sb = new StringBuilder("duet Aweme null and content visible ");
            View view2 = this.f113961T;
            C89219l.m154716b(view2, "");
            C51423a.m95791b(6, "VideoDuetView", sb.append(view2.getVisibility()).toString());
            MethodCollector.m26664o(4067);
            return;
        }
        Object a = bVar.mo60212a();
        C89219l.m154716b(a, "");
        Map map = (Map) a;
        Object obj2 = map.get(this.f115942c);
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            Object obj3 = map.get("aweme_state");
            if (obj3 instanceof Aweme) {
                aweme = obj3;
            }
            Aweme aweme2 = aweme;
            if (aweme2 == null) {
                MethodCollector.m26664o(4067);
            } else if (bool.booleanValue()) {
                View view3 = this.f115946g;
                if (view3 != null && view3.getVisibility() == 8) {
                    C39162r.m79460a("duet_button_show", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("group_id", aweme2.getAid()).f79943a);
                }
                View view4 = this.f115946g;
                if (view4 != null) {
                    view4.setVisibility(0);
                    MethodCollector.m26664o(4067);
                    return;
                }
                MethodCollector.m26664o(4067);
            } else {
                View view5 = this.f115946g;
                if (view5 != null) {
                    view5.setVisibility(8);
                    MethodCollector.m26664o(4067);
                    return;
                }
                MethodCollector.m26664o(4067);
            }
        } else {
            MethodCollector.m26664o(4067);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50207df(View view, Bundle bundle) {
        super(view, ((Boolean) C46759bu.f108959e.getValue()).booleanValue());
        C89219l.m154721d(bundle, "");
        this.f115941a = bundle;
        this.f115947h = bundle.getBoolean("isDuetChain");
    }
}
