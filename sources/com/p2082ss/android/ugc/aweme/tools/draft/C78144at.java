package com.p2082ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.experiment.C46788ce;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p2306ah.C33447a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78236g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78237h;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78240k;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78242m;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78402a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78405c;
import com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78453i;
import com.p2082ss.android.ugc.aweme.tools.draft.viewholder.C78444c;
import com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.C78469c;
import com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.at */
public final class C78144at extends AbstractC78471x implements AbstractC78249a {

    /* renamed from: A */
    public static final C78145a f175484A = new C78145a((byte) 0);

    /* renamed from: B */
    private ObjectAnimator f175485B;

    /* renamed from: C */
    private ObjectAnimator f175486C;

    /* renamed from: D */
    private View f175487D;

    /* renamed from: E */
    private RecyclerView f175488E;

    /* renamed from: F */
    private TextView f175489F;

    /* renamed from: G */
    private TextView f175490G;

    /* renamed from: H */
    private final AbstractC89244h f175491H = C89250i.m154773a((AbstractC89171a) new C78146b(this));

    /* renamed from: I */
    private int f175492I = 48;

    /* renamed from: J */
    private boolean f175493J = true;

    /* renamed from: K */
    private LinearLayoutManager f175494K;

    /* renamed from: L */
    private HashMap f175495L;

    /* renamed from: b */
    public final String f175496b = "DraftFragment";

    /* renamed from: c */
    public boolean f175497c;

    /* renamed from: d */
    public boolean f175498d;

    /* renamed from: e */
    public final int f175499e;

    /* renamed from: f */
    public ButtonTitleBar f175500f;

    /* renamed from: g */
    DmtStatusView f175501g;

    /* renamed from: h */
    public FrameLayout f175502h;

    /* renamed from: i */
    public C78215b f175503i;

    /* renamed from: j */
    public C78444c f175504j;

    /* renamed from: k */
    public boolean f175505k;

    /* renamed from: l */
    public int f175506l;

    /* renamed from: m */
    public int f175507m;

    /* renamed from: n */
    final boolean f175508n = C46788ce.m90134a();

    /* renamed from: o */
    public boolean f175509o;

    /* renamed from: p */
    public String f175510p = "";

    /* renamed from: q */
    public List<String> f175511q = C89086z.INSTANCE;

    /* renamed from: r */
    long f175512r;

    /* renamed from: s */
    boolean f175513s;

    /* renamed from: t */
    public String f175514t = "";

    /* renamed from: u */
    public List<C78230a> f175515u = new ArrayList();

    /* renamed from: v */
    public final AbstractC89516am f175516v = C89517an.m155448a(C89546bf.f203267b);

    /* renamed from: w */
    public final AbstractC89516am f175517w = C89517an.m155448a(C33429a.f79465a);

    /* renamed from: x */
    public boolean f175518x = true;

    /* renamed from: y */
    public Long f175519y = 0L;

    /* renamed from: z */
    public boolean f175520z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$c */
    public static final class C78147c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f175522a;

        /* renamed from: b */
        int f175523b;

        /* renamed from: c */
        final /* synthetic */ C78144at f175524c;

        /* renamed from: d */
        Object f175525d;

        /* renamed from: e */
        Object f175526e;

        static {
            Covode.recordClassIndex(91262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78147c(C78144at atVar, AbstractC89124d dVar) {
            super(dVar);
            this.f175524c = atVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f175522a = obj;
            this.f175523b |= Integer.MIN_VALUE;
            return this.f175524c.mo122081a((String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$d */
    public static final class C78148d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f175527a;

        /* renamed from: b */
        int f175528b;

        /* renamed from: c */
        final /* synthetic */ C78144at f175529c;

        /* renamed from: d */
        Object f175530d;

        /* renamed from: e */
        Object f175531e;

        static {
            Covode.recordClassIndex(91263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78148d(C78144at atVar, AbstractC89124d dVar) {
            super(dVar);
            this.f175529c = atVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f175527a = obj;
            this.f175528b |= Integer.MIN_VALUE;
            return this.f175529c.mo122082a((List<String>) null, this);
        }
    }

    static {
        Covode.recordClassIndex(91259);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: a */
    public final View mo93985a(int i) {
        if (this.f175495L == null) {
            this.f175495L = new HashMap();
        }
        View view = (View) this.f175495L.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f175495L.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: a */
    public final void mo93986a() {
        HashMap hashMap = this.f175495L;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public final DraftViewModel mo122088c() {
        return (DraftViewModel) this.f175491H.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$a */
    public static final class C78145a {
        static {
            Covode.recordClassIndex(91260);
        }

        private C78145a() {
        }

        public /* synthetic */ C78145a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a
    /* renamed from: a */
    public final void mo122086a(C78232c cVar, boolean z) {
        String string;
        C89219l.m154721d(cVar, "");
        DraftViewModel c = mo122088c();
        C89219l.m154721d(cVar, "");
        if (z) {
            c.f176289b.add(cVar);
        } else {
            c.f176289b.remove(cVar);
        }
        TextView textView = this.f175489F;
        if (textView == null) {
            C89219l.m154710a("mDeleteTv");
        }
        String string2 = getString(R.string.ya);
        C89219l.m154716b(string2, "");
        String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{Integer.valueOf(mo122088c().f176289b.size())}, 1));
        C89219l.m154716b(a, "");
        textView.setText(a);
        if (this.f175497c) {
            TextView textView2 = this.f175490G;
            if (textView2 == null) {
                C89219l.m154710a("mFreeupSize");
            }
            long j = 0;
            for (C78232c cVar2 : mo122088c().f176289b) {
                j += cVar2.f175709f;
            }
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            if (j / 1073741824 > 1) {
                string = getString(R.string.fnd, decimalFormat.format((double) ((((float) j) * 1.0f) / 1.07374182E9f)));
                C89219l.m154716b(string, "");
            } else {
                string = getString(R.string.fnc, decimalFormat.format((double) ((((float) j) * 1.0f) / 1048576.0f)));
                C89219l.m154716b(string, "");
            }
            textView2.setText(string);
        }
        if (mo122088c().f176289b.size() <= 0) {
            mo122096k();
            return;
        }
        FrameLayout frameLayout = this.f175502h;
        if (frameLayout == null) {
            C89219l.m154710a("mLayoutDelete");
        }
        if (frameLayout.getVisibility() != 0) {
            FrameLayout frameLayout2 = this.f175502h;
            if (frameLayout2 == null) {
                C89219l.m154710a("mLayoutDelete");
            }
            if (frameLayout2.getVisibility() != 0) {
                FrameLayout frameLayout3 = this.f175502h;
                if (frameLayout3 == null) {
                    C89219l.m154710a("mLayoutDelete");
                }
                float[] fArr = new float[2];
                FrameLayout frameLayout4 = this.f175502h;
                if (frameLayout4 == null) {
                    C89219l.m154710a("mLayoutDelete");
                }
                fArr[0] = (float) frameLayout4.getMeasuredHeight();
                fArr[1] = 0.0f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout3, "translationY", fArr).setDuration(200L);
                this.f175486C = duration;
                if (duration == null) {
                    C89219l.m154715b();
                }
                duration.addListener(new C78171x(this));
                ObjectAnimator objectAnimator = this.f175486C;
                if (objectAnimator == null) {
                    C89219l.m154715b();
                }
                objectAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$k */
    public static final class C78155k extends AbstractC78453i {

        /* renamed from: a */
        final /* synthetic */ C78144at f175539a;

        static {
            Covode.recordClassIndex(91270);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78453i
        /* renamed from: c */
        public final boolean mo122101c() {
            return this.f175539a.f175505k;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78453i
        /* renamed from: b */
        public final boolean mo122100b() {
            if (this.f175539a.f175507m == this.f175539a.f175506l - 1) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78453i
        /* renamed from: a */
        public final void mo122099a() {
            C84911q.m145921a(this.f175539a.f175496b + " -> loadMoreItems is running");
            if (this.f175539a.f175518x) {
                this.f175539a.f175507m++;
                this.f175539a.f175505k = true;
                AbstractC89568bz unused = C89624i.m155555a(this.f175539a.f175516v, null, null, new C78156a(this, null), 3);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$k$a */
        static final class C78156a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f175540a;

            /* renamed from: b */
            final /* synthetic */ C78155k f175541b;

            static {
                Covode.recordClassIndex(91271);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C78156a(C78155k kVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f175541b = kVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C78156a(this.f175541b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C78156a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f175540a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C78144at atVar = this.f175541b.f175539a;
                    this.f175540a = 1;
                    if (atVar.mo122080a(this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78155k(C78144at atVar, LinearLayoutManager linearLayoutManager) {
            super(linearLayoutManager);
            this.f175539a = atVar;
        }
    }

    /* renamed from: g */
    public final IDraftService.DraftListener mo122092g() {
        return new C78167u(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a
    /* renamed from: e */
    public final void mo122090e() {
        AbstractC89568bz unused = C89624i.m155555a(this.f175516v, null, null, new C78163r(this, null), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo122097l() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$b */
    static final class C78146b extends AbstractC89220m implements AbstractC89171a<DraftViewModel> {

        /* renamed from: a */
        final /* synthetic */ C78144at f175521a;

        static {
            Covode.recordClassIndex(91261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78146b(C78144at atVar) {
            super(0);
            this.f175521a = atVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DraftViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f175521a, (C1175ad.AbstractC1177b) null).mo3983a(DraftViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$o */
    static final class RunnableC78160o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78144at f175545a;

        static {
            Covode.recordClassIndex(91275);
        }

        RunnableC78160o(C78144at atVar) {
            this.f175545a = atVar;
        }

        public final void run() {
            ButtonTitleBar buttonTitleBar = this.f175545a.f175500f;
            if (buttonTitleBar == null) {
                C89219l.m154710a("mTitleBar");
            }
            buttonTitleBar.getStartBtn().setImageResource(2131230985);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    /* renamed from: b */
    public final void mo122087b() {
        mo122091f();
        if (this.f175498d) {
            this.f175498d = false;
            mo122096k();
            mo122094i();
            return;
        }
        mo122097l();
    }

    /* renamed from: f */
    public final void mo122091f() {
        this.f175520z = false;
        DmtStatusView dmtStatusView = this.f175501g;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingLayout");
        }
        dmtStatusView.setVisibility(8);
    }

    /* renamed from: j */
    public final String mo122095j() {
        if (this.f175497c) {
            return "storage_management";
        }
        if (this.f175499e == 1) {
            return "video_shoot_page";
        }
        return "personal_homepage";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56814b, com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78471x
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.f175485B;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f175486C;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            objectAnimator2.cancel();
        }
        this.f175514t = "";
        mo93986a();
    }

    /* renamed from: d */
    public final void mo122089d() {
        C78176aw.f175576a = System.currentTimeMillis();
        DmtStatusView dmtStatusView = this.f175501g;
        if (dmtStatusView == null) {
            C89219l.m154710a("mLoadingLayout");
        }
        dmtStatusView.mo27384f();
        this.f175507m = 0;
        mo122088c().mo122383b();
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C78150f(this, null), 3);
    }

    /* renamed from: k */
    public final void mo122096k() {
        FrameLayout frameLayout = this.f175502h;
        if (frameLayout == null) {
            C89219l.m154710a("mLayoutDelete");
        }
        if (frameLayout.getVisibility() != 8) {
            FrameLayout frameLayout2 = this.f175502h;
            if (frameLayout2 == null) {
                C89219l.m154710a("mLayoutDelete");
            }
            float[] fArr = new float[1];
            FrameLayout frameLayout3 = this.f175502h;
            if (frameLayout3 == null) {
                C89219l.m154710a("mLayoutDelete");
            }
            fArr[0] = (float) frameLayout3.getMeasuredHeight();
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout2, "translationY", fArr).setDuration(200L);
            this.f175485B = duration;
            if (duration == null) {
                C89219l.m154715b();
            }
            duration.addListener(new C78149e(this));
            ObjectAnimator objectAnimator = this.f175485B;
            if (objectAnimator == null) {
                C89219l.m154715b();
            }
            objectAnimator.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        mo122096k();
        if (this.f175493J || !C63244g.m114602a().mo73275c().mo101852d()) {
            this.f175493J = false;
            C63244g.m114602a().mo73275c().mo101846a(true);
        } else if (!this.f175508n || !C78212bg.m136694a()) {
            mo122088c().f176295h.mo122386a();
            C78444c cVar = this.f175504j;
            if (cVar == null) {
                C89219l.m154710a("mAdapter");
            }
            cVar.f176267a.clear();
            cVar.notifyDataSetChanged();
            mo122089d();
        } else {
            String str = this.f175514t;
            if (str == null || str.length() == 0) {
                C84911q.m145921a("DraftFragment -> updateDraft: operatedDraftCreationId is null or empty");
            } else {
                AbstractC89568bz unused = C89624i.m155555a(this.f175517w, null, null, new C78173z(this, null), 3);
            }
        }
    }

    /* renamed from: h */
    public final void mo122093h() {
        Set<C78232c> set = mo122088c().f176289b;
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C23025b bVar = new C23025b(context);
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        String string = context2.getString(R.string.bc2);
        C89219l.m154716b(string, "");
        bVar.mo37421c(string, new C78164s(this, set));
        Context context3 = getContext();
        if (context3 == null) {
            C89219l.m154715b();
        }
        String string2 = context3.getString(R.string.bc3);
        C89219l.m154716b(string2, "");
        bVar.mo37419b(string2, C78166t.f175559a);
        Context context4 = getContext();
        if (context4 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context4, "");
        C23023b a = C23013a.C23015a.m43405a(context4).mo37411b((CharSequence) null);
        Context context5 = getContext();
        if (context5 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context5, "");
        a.mo37413d(context5.getResources().getQuantityString(R.plurals.b4, 1)).mo37407a(bVar).mo37405a().mo37396b().show();
    }

    /* renamed from: i */
    public final void mo122094i() {
        if (this.f175498d) {
            ButtonTitleBar buttonTitleBar = this.f175500f;
            if (buttonTitleBar == null) {
                C89219l.m154710a("mTitleBar");
            }
            buttonTitleBar.getEndBtn().setTextColor(buttonTitleBar.getResources().getColor(C33447a.f79499b));
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setText(getText(R.string.y9));
            ImageView startBtn = buttonTitleBar.getStartBtn();
            C89219l.m154716b(startBtn, "");
            startBtn.setVisibility(8);
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C89219l.m154716b(titleView, "");
            titleView.setVisibility(8);
        } else {
            ButtonTitleBar buttonTitleBar2 = this.f175500f;
            if (buttonTitleBar2 == null) {
                C89219l.m154710a("mTitleBar");
            }
            buttonTitleBar2.getEndBtn().setTextColor(buttonTitleBar2.getResources().getColor(C33447a.f79498a));
            DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
            C89219l.m154716b(endBtn2, "");
            endBtn2.setText(getText(R.string.y_));
            ImageView startBtn2 = buttonTitleBar2.getStartBtn();
            C89219l.m154716b(startBtn2, "");
            startBtn2.setVisibility(0);
            DmtTextView titleView2 = buttonTitleBar2.getTitleView();
            C89219l.m154716b(titleView2, "");
            titleView2.setVisibility(0);
            mo122096k();
        }
        C78444c cVar = this.f175504j;
        if (cVar == null) {
            C89219l.m154710a("mAdapter");
        }
        cVar.f176268b = this.f175498d;
        cVar.notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$e */
    public static final class C78149e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78144at f175532a;

        static {
            Covode.recordClassIndex(91264);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78149e(C78144at atVar) {
            this.f175532a = atVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            C78144at.m136633a(this.f175532a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$m */
    public static final class C78158m implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C78144at f175543a;

        static {
            Covode.recordClassIndex(91273);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78158m(C78144at atVar) {
            this.f175543a = atVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f175543a.mo122097l();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
            C78144at atVar = this.f175543a;
            atVar.f175498d = !atVar.f175498d;
            atVar.mo122094i();
            atVar.mo122088c().f176289b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$t */
    public static final class C78166t extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C78166t f175559a = new C78166t();

        static {
            Covode.recordClassIndex(91281);
        }

        C78166t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$u */
    public static final class C78167u extends IDraftService.DraftListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78144at f175560a;

        static {
            Covode.recordClassIndex(91282);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78167u(C78144at atVar) {
            this.f175560a = atVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(C43223c cVar) {
            C89219l.m154721d(cVar, "");
            this.f175560a.mo122089d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$w */
    static final class C78170w extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C78170w f175565a = new C78170w();

        static {
            Covode.recordClassIndex(91285);
        }

        C78170w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$x */
    public static final class C78171x extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78144at f175566a;

        static {
            Covode.recordClassIndex(91286);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78171x(C78144at atVar) {
            this.f175566a = atVar;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            C78144at.m136633a(this.f175566a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$l */
    static final class View$OnClickListenerC78157l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78144at f175542a;

        static {
            Covode.recordClassIndex(91272);
        }

        View$OnClickListenerC78157l(C78144at atVar) {
            this.f175542a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175542a.mo122093h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$n */
    static final class View$OnClickListenerC78159n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78144at f175544a;

        static {
            Covode.recordClassIndex(91274);
        }

        View$OnClickListenerC78159n(C78144at atVar) {
            this.f175544a = atVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175544a.mo122093h();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m136633a(C78144at atVar) {
        FrameLayout frameLayout = atVar.f175502h;
        if (frameLayout == null) {
            C89219l.m154710a("mLayoutDelete");
        }
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$v */
    public static final class C78168v extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78144at f175561a;

        /* renamed from: b */
        final /* synthetic */ C78232c f175562b;

        static {
            Covode.recordClassIndex(91283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78168v(C78144at atVar, C78232c cVar) {
            super(1);
            this.f175561a = atVar;
            this.f175562b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC89568bz unused = C89624i.m155555a(this.f175561a.f175517w, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78144at.C78168v.C781691 */

                /* renamed from: a */
                int f175563a;

                /* renamed from: b */
                final /* synthetic */ C78168v f175564b;

                static {
                    Covode.recordClassIndex(91284);
                }

                {
                    this.f175564b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$p */
                    static final class C78161p extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f175546a;

                        /* renamed from: b */
                        final /* synthetic */ C78144at f175547b;

                        /* renamed from: c */
                        final /* synthetic */ C78232c f175548c;

                        static {
                            Covode.recordClassIndex(91276);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C78161p(C78144at atVar, C78232c cVar, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f175547b = atVar;
                            this.f175548c = cVar;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C78161p(this.f175547b, this.f175548c, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C78161p) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                            int i = this.f175546a;
                            if (i == 0) {
                                C89382r.m154942a(obj);
                                DraftViewModel c = this.f175547b.mo122088c();
                                C78232c cVar = this.f175548c;
                                C78215b bVar = this.f175547b.f175503i;
                                if (bVar == null) {
                                    C89219l.m154710a("mDraftStickerDownloadMgr");
                                }
                                this.f175546a = 1;
                                if (c.mo122376a(cVar, bVar, this) == aVar) {
                                    return aVar;
                                }
                            } else if (i == 1) {
                                C89382r.m154942a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C89391z.f203057a;
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$r */
                    static final class C78163r extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f175553a;

                        /* renamed from: b */
                        final /* synthetic */ C78144at f175554b;

                        static {
                            Covode.recordClassIndex(91278);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C78163r(C78144at atVar, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f175554b = atVar;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C78163r(this.f175554b, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C78163r) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                            int i = this.f175553a;
                            if (i == 0) {
                                C89382r.m154942a(obj);
                                C78144at atVar = this.f175554b;
                                this.f175553a = 1;
                                if (atVar.mo122080a(this) == aVar) {
                                    return aVar;
                                }
                            } else if (i == 1) {
                                C89382r.m154942a(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C89391z.f203057a;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$s */
                    public static final class C78164s extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

                        /* renamed from: a */
                        final /* synthetic */ C78144at f175555a;

                        /* renamed from: b */
                        final /* synthetic */ Set f175556b;

                        static {
                            Covode.recordClassIndex(91279);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C78164s(C78144at atVar, Set set) {
                            super(1);
                            this.f175555a = atVar;
                            this.f175556b = set;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                            C89219l.m154721d(aVar, "");
                            AbstractC89568bz unused = C89624i.m155555a(this.f175555a.f175516v, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                /* class com.p2082ss.android.ugc.aweme.tools.draft.C78144at.C78164s.C781651 */

                                /* renamed from: a */
                                int f175557a;

                                /* renamed from: b */
                                final /* synthetic */ C78164s f175558b;

                                static {
                                    Covode.recordClassIndex(91280);
                                }

                                {
                                    this.f175558b = r2;
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                    C89219l.m154721d(dVar, "");
                                    return 

                                    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
                                    public final void onCreate(Bundle bundle) {
                                        super.onCreate(bundle);
                                        Bundle arguments = getArguments();
                                        if (arguments != null) {
                                            this.f175497c = arguments.getBoolean("is_disk_manage_mode", false);
                                        }
                                        this.f175503i = new C78215b(this);
                                        C78176aw.f175578c = true;
                                        this.f175512r = System.currentTimeMillis();
                                    }

                                    /* access modifiers changed from: package-private */
                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$f */
                                    public static final class C78150f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                        /* renamed from: a */
                                        int f175533a;

                                        /* renamed from: b */
                                        final /* synthetic */ C78144at f175534b;

                                        static {
                                            Covode.recordClassIndex(91265);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        C78150f(C78144at atVar, AbstractC89124d dVar) {
                                            super(2, dVar);
                                            this.f175534b = atVar;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return new C78150f(this.f175534b, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                            return ((C78150f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                        }

                                        /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                                            /*
                                                r6 = this;
                                                h.c.a.a r5 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                                                int r0 = r6.f175533a
                                                r4 = 3
                                                r3 = 2
                                                r2 = 1
                                                if (r0 == 0) goto L_0x0015
                                                if (r0 == r2) goto L_0x0038
                                                if (r0 == r3) goto L_0x0038
                                                if (r0 != r4) goto L_0x0046
                                                p4600h.C89382r.m154942a(r7)
                                            L_0x0012:
                                                h.z r0 = p4600h.C89391z.f203057a
                                                return r0
                                            L_0x0015:
                                                p4600h.C89382r.m154942a(r7)
                                                com.ss.android.ugc.aweme.tools.draft.at r0 = r6.f175534b
                                                boolean r0 = r0.f175509o
                                                if (r0 == 0) goto L_0x002b
                                                com.ss.android.ugc.aweme.tools.draft.at r1 = r6.f175534b
                                                java.util.List<java.lang.String> r0 = r1.f175511q
                                                r6.f175533a = r2
                                                java.lang.Object r0 = r1.mo122082a(r0, r6)
                                                if (r0 != r5) goto L_0x003b
                                                return r5
                                            L_0x002b:
                                                com.ss.android.ugc.aweme.tools.draft.at r1 = r6.f175534b
                                                java.lang.String r0 = r1.f175510p
                                                r6.f175533a = r3
                                                java.lang.Object r0 = r1.mo122081a(r0, r6)
                                                if (r0 != r5) goto L_0x003b
                                                return r5
                                            L_0x0038:
                                                p4600h.C89382r.m154942a(r7)
                                            L_0x003b:
                                                com.ss.android.ugc.aweme.tools.draft.at r0 = r6.f175534b
                                                r6.f175533a = r4
                                                java.lang.Object r0 = r0.mo122080a(r6)
                                                if (r0 != r5) goto L_0x0012
                                                return r5
                                            L_0x0046:
                                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                r1.<init>(r0)
                                                throw r1
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78144at.C78150f.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$h */
                                    static final class C78152h<T> implements AbstractC1214u {

                                        /* renamed from: a */
                                        final /* synthetic */ C78144at f175536a;

                                        static {
                                            Covode.recordClassIndex(91267);
                                        }

                                        C78152h(C78144at atVar) {
                                            this.f175536a = atVar;
                                        }

                                        @Override // androidx.lifecycle.AbstractC1214u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            C89378p pVar = (C89378p) obj;
                                            C43223c cVar = (C43223c) pVar.getFirst();
                                            if (((Boolean) pVar.getSecond()).booleanValue()) {
                                                C78144at atVar = this.f175536a;
                                                Long l = atVar.f175519y;
                                                if (l == null) {
                                                    C89219l.m154715b();
                                                }
                                                long longValue = l.longValue();
                                                if (atVar.f175520z) {
                                                    atVar.mo122091f();
                                                    C84911q.m145921a(atVar.f175496b + "loadStickersSuc -> draft : " + cVar.mo73726r());
                                                    C78135ak.m136630a(atVar.getActivity(), cVar, atVar.f175499e, longValue, atVar.mo122092g());
                                                    return;
                                                }
                                                return;
                                            }
                                            C78144at atVar2 = this.f175536a;
                                            if (atVar2.f175520z) {
                                                atVar2.mo122091f();
                                                new C79459a(atVar2.getContext()).mo123050a(R.string.awt).mo123053a();
                                            }
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$i */
                                    static final class C78153i<T> implements AbstractC1214u {

                                        /* renamed from: a */
                                        final /* synthetic */ C78144at f175537a;

                                        static {
                                            Covode.recordClassIndex(91268);
                                        }

                                        C78153i(C78144at atVar) {
                                            this.f175537a = atVar;
                                        }

                                        @Override // androidx.lifecycle.AbstractC1214u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            C43223c cVar = (C43223c) obj;
                                            if (this.f175537a.f175520z) {
                                                this.f175537a.mo122091f();
                                            }
                                            StringBuilder append = new StringBuilder().append(this.f175537a.f175496b).append("isUpdateDraftLiveData -> draft : ");
                                            C89219l.m154716b(cVar, "");
                                            C84911q.m145921a(append.append(cVar.mo73726r()).toString());
                                            C78144at atVar = this.f175537a;
                                            String f = cVar.mo73676f();
                                            C89219l.m154716b(f, "");
                                            atVar.f175514t = f;
                                            ActivityC0945e activity = this.f175537a.getActivity();
                                            int i = this.f175537a.f175499e;
                                            Long l = this.f175537a.f175519y;
                                            if (l == null) {
                                                C89219l.m154715b();
                                            }
                                            C78135ak.m136630a(activity, cVar, i, l.longValue(), this.f175537a.mo122092g());
                                        }
                                    }

                                    /* renamed from: a */
                                    public final Object mo122080a(AbstractC89124d<? super C89391z> dVar) {
                                        if (this.f175508n) {
                                            if (this.f175509o) {
                                                Object b = mo122088c().mo122382b(this.f175492I, this.f175507m, this.f175511q, dVar);
                                                if (b == EnumC89098a.COROUTINE_SUSPENDED) {
                                                    return b;
                                                }
                                            } else {
                                                Object b2 = mo122088c().mo122381b(this.f175492I, this.f175507m, this.f175510p, dVar);
                                                if (b2 == EnumC89098a.COROUTINE_SUSPENDED) {
                                                    return b2;
                                                }
                                            }
                                        } else if (this.f175509o) {
                                            Object a = mo122088c().mo122375a(this.f175492I, this.f175507m, this.f175511q, dVar);
                                            if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                                                return a;
                                            }
                                        } else {
                                            Object a2 = mo122088c().mo122374a(this.f175492I, this.f175507m, this.f175510p, dVar);
                                            if (a2 == EnumC89098a.COROUTINE_SUSPENDED) {
                                                return a2;
                                            }
                                        }
                                        return C89391z.f203057a;
                                    }

                                    @Override // androidx.fragment.app.Fragment
                                    public final void onActivityCreated(Bundle bundle) {
                                        super.onActivityCreated(bundle);
                                        C45989b.m88764a().mo77590a(getActivity());
                                        this.f175492I = 48;
                                        boolean d = C63244g.m114602a().mo73287o().mo104784d();
                                        this.f175509o = d;
                                        if (d) {
                                            this.f175511q = C63244g.m114602a().mo73287o().mo104787g();
                                        } else {
                                            C70005cr a = C70005cr.m123611a();
                                            C89219l.m154716b(a, "");
                                            String e = a.mo110455e();
                                            C89219l.m154716b(e, "");
                                            this.f175510p = e;
                                        }
                                        mo122089d();
                                        mo122088c().f176291d.observe(this, new C78151g(this));
                                        mo122088c().f176292e.observe(this, new C78152h(this));
                                        mo122088c().f176293f.observe(this, new C78153i(this));
                                        mo122088c().f176294g.observe(this, new C78154j(this));
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$j */
                                    static final class C78154j<T> implements AbstractC1214u {

                                        /* renamed from: a */
                                        final /* synthetic */ C78144at f175538a;

                                        static {
                                            Covode.recordClassIndex(91269);
                                        }

                                        C78154j(C78144at atVar) {
                                            this.f175538a = atVar;
                                        }

                                        @Override // androidx.lifecycle.AbstractC1214u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            C78469c cVar = (C78469c) obj;
                                            ActivityC0945e requireActivity = this.f175538a.requireActivity();
                                            C89219l.m154716b(requireActivity, "");
                                            String str = cVar.f176344a;
                                            String str2 = cVar.f176345b;
                                            int i = cVar.f176346c;
                                            String str3 = cVar.f176347d;
                                            String uuid = UUID.randomUUID().toString();
                                            C89219l.m154716b(uuid, "");
                                            ArrayList<String> a = C75466g.m132343a(str3);
                                            C89219l.m154716b(a, "");
                                            C89219l.m154721d(uuid, "");
                                            C89219l.m154721d(str, "");
                                            C89219l.m154721d(a, "");
                                            C84425b a2 = new C84425b().mo129406a("creation_id", uuid).mo129406a("shoot_way", "draft_again").mo129406a("music_id", str).mo129407a("is_ui_shoot", false).mo129406a("group_id", C70747dv.m124972a());
                                            if (!C84904k.m145909a(a) && !TextUtils.isEmpty(a.get(0))) {
                                                a2.mo129406a("prop_id", a.get(0));
                                            }
                                            C80322d.m139251a("shoot", a2.f188764a);
                                            C40970e.m82485a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i + ']');
                                            Intent intent = new Intent();
                                            intent.putExtra("path", str2);
                                            intent.putExtra("music_start", i);
                                            intent.putExtra("record_from", 1);
                                            intent.putExtra("translation_type", 3);
                                            intent.putExtra("shoot_way", "draft_again");
                                            intent.putExtra("creation_id", uuid);
                                            intent.putExtra("extra_sticker_from", "draft");
                                            intent.putStringArrayListExtra("reuse_sticker_ids", C75466g.m132343a(str3));
                                            C70005cr.m123611a().mo110456f();
                                            intent.setClass(requireActivity, VideoRecordPermissionActivity.class);
                                            C84349a.m145093a(intent, requireActivity);
                                            requireActivity.startActivity(intent);
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$q */
                                    static final class C78162q extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                        /* renamed from: a */
                                        int f175549a;

                                        /* renamed from: b */
                                        final /* synthetic */ C78144at f175550b;

                                        /* renamed from: c */
                                        final /* synthetic */ ActivityC0945e f175551c;

                                        /* renamed from: d */
                                        final /* synthetic */ String f175552d;

                                        static {
                                            Covode.recordClassIndex(91277);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        C78162q(C78144at atVar, ActivityC0945e eVar, String str, AbstractC89124d dVar) {
                                            super(2, dVar);
                                            this.f175550b = atVar;
                                            this.f175551c = eVar;
                                            this.f175552d = str;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return new C78162q(this.f175550b, this.f175551c, this.f175552d, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                            return ((C78162q) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                        }

                                        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                                            /*
                                            // Method dump skipped, instructions count: 142
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78144at.C78162q.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$z */
                                    static final class C78173z extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                        /* renamed from: a */
                                        int f175570a;

                                        /* renamed from: b */
                                        final /* synthetic */ C78144at f175571b;

                                        static {
                                            Covode.recordClassIndex(91288);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        C78173z(C78144at atVar, AbstractC89124d dVar) {
                                            super(2, dVar);
                                            this.f175571b = atVar;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return new C78173z(this.f175571b, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                            return ((C78173z) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final Object invokeSuspend(Object obj) {
                                            C78242m mVar;
                                            String str;
                                            String str2;
                                            Object obj2 = obj;
                                            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                            int i = this.f175570a;
                                            if (i == 0) {
                                                C89382r.m154942a(obj2);
                                                C84911q.m145921a("DraftFragment -> updateDraft: operatedDraftCreationId = " + this.f175571b.f175514t);
                                                this.f175571b.mo122088c().f176295h.mo122387b(this.f175571b.f175514t);
                                                String str3 = this.f175571b.f175514t;
                                                this.f175570a = 1;
                                                obj2 = C89624i.m155554a(C89546bf.f203267b, new C78188b.C78202m(str3, null), this);
                                                if (obj2 == aVar) {
                                                    return aVar;
                                                }
                                            } else if (i == 1) {
                                                C89382r.m154942a(obj2);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            C78237h hVar = (C78237h) obj2;
                                            if (hVar != null) {
                                                C89219l.m154721d(hVar, "");
                                                String str4 = hVar.f175728a;
                                                String str5 = hVar.f175729b.f175723c;
                                                long j = hVar.f175730c.f175719c;
                                                if (hVar.f175729b.f175724d.length() == 0) {
                                                    str2 = "";
                                                } else {
                                                    str2 = hVar.f175729b.f175724d;
                                                }
                                                mVar = new C78242m(106, str4, str5, j, str2, C78236g.m136718a(hVar), 64);
                                            } else {
                                                mVar = null;
                                            }
                                            Iterator<C78230a> it = this.f175571b.f175515u.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                C78230a next = it.next();
                                                if (next instanceof C78242m) {
                                                    String str6 = ((C78232c) next).f175706c;
                                                    if (mVar != null) {
                                                        str = ((C78232c) mVar).f175706c;
                                                    } else {
                                                        str = null;
                                                    }
                                                    if (C89219l.m154714a((Object) str6, (Object) str)) {
                                                        this.f175571b.f175515u.set(this.f175571b.f175515u.indexOf(next), mVar);
                                                        C78444c cVar = this.f175571b.f175504j;
                                                        if (cVar == null) {
                                                            C89219l.m154710a("mAdapter");
                                                        }
                                                        cVar.mo122371a(this.f175571b.f175515u);
                                                        this.f175571b.f175514t = "";
                                                    }
                                                }
                                            }
                                            return C89391z.f203057a;
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$g */
                                    static final class C78151g<T> implements AbstractC1214u {

                                        /* renamed from: a */
                                        final /* synthetic */ C78144at f175535a;

                                        static {
                                            Covode.recordClassIndex(91266);
                                        }

                                        C78151g(C78144at atVar) {
                                            this.f175535a = atVar;
                                        }

                                        @Override // androidx.lifecycle.AbstractC1214u
                                        public final /* synthetic */ void onChanged(Object obj) {
                                            Boolean bool = (Boolean) obj;
                                            C78144at atVar = this.f175535a;
                                            C89219l.m154716b(bool, "");
                                            boolean booleanValue = bool.booleanValue();
                                            atVar.f175505k = false;
                                            DmtStatusView dmtStatusView = atVar.f175501g;
                                            if (dmtStatusView == null) {
                                                C89219l.m154710a("mLoadingLayout");
                                            }
                                            dmtStatusView.setVisibility(8);
                                            atVar.f175515u = new ArrayList(atVar.mo122088c().f176290c);
                                            List<C78230a> list = atVar.f175515u;
                                            C89219l.m154721d(list, "");
                                            if (atVar.f175507m == 0) {
                                                boolean z = atVar.f175513s;
                                                String j = atVar.mo122095j();
                                                C89219l.m154721d(list, "");
                                                C89219l.m154721d(j, "");
                                                if (!z) {
                                                    C39162r.m79460a("click_draft_entrance", new C84425b().mo129403a("draft_cnt", C78176aw.m136663b(list)).mo129406a("enter_from", j).f188764a);
                                                }
                                                atVar.f175513s = true;
                                                long j2 = atVar.f175512r;
                                                if (!(j2 == 0 || list == null)) {
                                                    C39162r.m79460a("tool_performance_draft_preview_list", new C84425b().mo129403a("count", C78176aw.m136663b(list)).mo129404a("duration", System.currentTimeMillis() - j2).f188764a);
                                                }
                                                atVar.f175512r = 0;
                                                C78176aw.m136662a(list);
                                            }
                                            if (booleanValue) {
                                                atVar.f175518x = true;
                                                if (atVar.f175515u.isEmpty()) {
                                                    C78444c cVar = atVar.f175504j;
                                                    if (cVar == null) {
                                                        C89219l.m154710a("mAdapter");
                                                    }
                                                    cVar.mo122371a(atVar.f175515u);
                                                    C78397c.m136927a().notifyDraftClean();
                                                    atVar.mo122097l();
                                                    return;
                                                }
                                                List<C78230a> list2 = atVar.f175515u;
                                                if (atVar.f175507m == atVar.f175506l - 1) {
                                                    if (atVar.f175508n) {
                                                        list2.remove(list2.size() - 2);
                                                    } else {
                                                        list2.remove(list2.size() - 1);
                                                    }
                                                }
                                                C78444c cVar2 = atVar.f175504j;
                                                if (cVar2 == null) {
                                                    C89219l.m154710a("mAdapter");
                                                }
                                                cVar2.mo122371a(atVar.f175515u);
                                                return;
                                            }
                                            atVar.f175518x = false;
                                            List<C78230a> list3 = atVar.f175515u;
                                            if (list3.size() == 0) {
                                                DmtStatusView dmtStatusView2 = atVar.f175501g;
                                                if (dmtStatusView2 == null) {
                                                    C89219l.m154710a("mLoadingLayout");
                                                }
                                                dmtStatusView2.mo27384f();
                                                return;
                                            }
                                            C78240k kVar = new C78240k((byte) 0);
                                            kVar.f175733c = 1;
                                            if (atVar.f175508n) {
                                                list3.set(list3.size() - 2, kVar);
                                            } else {
                                                list3.set(list3.size() - 1, kVar);
                                            }
                                            C78444c cVar3 = atVar.f175504j;
                                            if (cVar3 == null) {
                                                C89219l.m154710a("mAdapter");
                                            }
                                            cVar3.mo122371a(list3);
                                        }
                                    }

                                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.at$y */
                                    static final class DialogInterface$OnClickListenerC78172y implements DialogInterface.OnClickListener {

                                        /* renamed from: a */
                                        final /* synthetic */ C78144at f175567a;

                                        /* renamed from: b */
                                        final /* synthetic */ View f175568b;

                                        /* renamed from: c */
                                        final /* synthetic */ C78232c f175569c;

                                        static {
                                            Covode.recordClassIndex(91287);
                                        }

                                        DialogInterface$OnClickListenerC78172y(C78144at atVar, View view, C78232c cVar) {
                                            this.f175567a = atVar;
                                            this.f175568b = view;
                                            this.f175569c = cVar;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            C89219l.m154721d(dialogInterface, "");
                                            C78144at atVar = this.f175567a;
                                            Context context = this.f175568b.getContext();
                                            C89219l.m154716b(context, "");
                                            C78232c cVar = this.f175569c;
                                            C23025b bVar = new C23025b(context);
                                            String string = context.getString(R.string.bc2);
                                            C89219l.m154716b(string, "");
                                            bVar.mo37421c(string, new C78168v(atVar, cVar));
                                            String string2 = context.getString(R.string.bc3);
                                            C89219l.m154716b(string2, "");
                                            bVar.mo37419b(string2, C78170w.f175565a);
                                            C23013a.C23015a.m43405a(context).mo37411b((CharSequence) null).mo37413d(context.getResources().getQuantityString(R.plurals.b4, 1)).mo37407a(bVar).mo37405a().mo37396b().show();
                                            dialogInterface.dismiss();
                                        }
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
                                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
                                    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object mo122081a(java.lang.String r7, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r8) {
                                        /*
                                        // Method dump skipped, instructions count: 127
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78144at.mo122081a(java.lang.String, h.c.d):java.lang.Object");
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
                                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
                                    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object mo122082a(java.util.List<java.lang.String> r7, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r8) {
                                        /*
                                        // Method dump skipped, instructions count: 127
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78144at.mo122082a(java.util.List, h.c.d):java.lang.Object");
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a
                                    /* renamed from: a */
                                    public final void mo122083a(int i, C78232c cVar) {
                                        C89219l.m154721d(cVar, "");
                                        this.f175519y = Long.valueOf(System.currentTimeMillis());
                                        this.f175520z = true;
                                        DmtStatusView dmtStatusView = this.f175501g;
                                        if (dmtStatusView == null) {
                                            C89219l.m154710a("mLoadingLayout");
                                        }
                                        dmtStatusView.mo27384f();
                                        C84911q.m145921a("DraftFragment -> onClick: position " + i + ", draftId " + cVar.f175706c);
                                        AbstractC89568bz unused = C89624i.m155555a(this.f175517w, null, null, new C78161p(this, cVar, null), 3);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.p3290j.C56815c, androidx.fragment.app.Fragment
                                    public final void onViewCreated(View view, Bundle bundle) {
                                        C89219l.m154721d(view, "");
                                        super.onViewCreated(view, bundle);
                                        View c = C0792v.m2762c(view, (int) R.id.eiz);
                                        C89219l.m154716b(c, "");
                                        this.f175500f = (ButtonTitleBar) c;
                                        View c2 = C0792v.m2762c(view, (int) R.id.e7_);
                                        C89219l.m154716b(c2, "");
                                        this.f175487D = c2;
                                        View c3 = C0792v.m2762c(view, (int) R.id.aoj);
                                        C89219l.m154716b(c3, "");
                                        this.f175501g = (DmtStatusView) c3;
                                        View c4 = C0792v.m2762c(view, (int) R.id.dgw);
                                        C89219l.m154716b(c4, "");
                                        this.f175488E = (RecyclerView) c4;
                                        View c5 = C0792v.m2762c(view, (int) R.id.eux);
                                        C89219l.m154716b(c5, "");
                                        this.f175489F = (TextView) c5;
                                        if (this.f175497c) {
                                            View c6 = C0792v.m2762c(view, (int) R.id.ewf);
                                            C89219l.m154716b(c6, "");
                                            TextView textView = (TextView) c6;
                                            this.f175490G = textView;
                                            if (textView == null) {
                                                C89219l.m154710a("mFreeupSize");
                                            }
                                            textView.setVisibility(0);
                                            TextView textView2 = this.f175490G;
                                            if (textView2 == null) {
                                                C89219l.m154710a("mFreeupSize");
                                            }
                                            textView2.setVisibility(0);
                                        }
                                        View c7 = C0792v.m2762c(view, (int) R.id.c3q);
                                        C89219l.m154716b(c7, "");
                                        FrameLayout frameLayout = (FrameLayout) c7;
                                        this.f175502h = frameLayout;
                                        if (this.f175497c) {
                                            if (frameLayout == null) {
                                                C89219l.m154710a("mLayoutDelete");
                                            }
                                            frameLayout.setOnClickListener(new View$OnClickListenerC78157l(this));
                                        }
                                        if (this.f175497c) {
                                            FrameLayout frameLayout2 = this.f175502h;
                                            if (frameLayout2 == null) {
                                                C89219l.m154710a("mLayoutDelete");
                                            }
                                            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                                            layoutParams2.height = C89241a.m154730a(C13628n.m24520b(getContext(), 60.0f));
                                            FrameLayout frameLayout3 = this.f175502h;
                                            if (frameLayout3 == null) {
                                                C89219l.m154710a("mLayoutDelete");
                                            }
                                            frameLayout3.setLayoutParams(layoutParams2);
                                        } else {
                                            TextView textView3 = this.f175489F;
                                            if (textView3 == null) {
                                                C89219l.m154710a("mDeleteTv");
                                            }
                                            ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                                            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                            layoutParams4.gravity = 17;
                                            layoutParams4.topMargin = 0;
                                            TextView textView4 = this.f175489F;
                                            if (textView4 == null) {
                                                C89219l.m154710a("mDeleteTv");
                                            }
                                            textView4.setLayoutParams(layoutParams4);
                                        }
                                        ButtonTitleBar buttonTitleBar = this.f175500f;
                                        if (buttonTitleBar == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        buttonTitleBar.setOnTitleBarClickListener(new C78158m(this));
                                        TextView textView5 = this.f175489F;
                                        if (textView5 == null) {
                                            C89219l.m154710a("mDeleteTv");
                                        }
                                        textView5.setOnClickListener(new View$OnClickListenerC78159n(this));
                                        int i = Build.VERSION.SDK_INT;
                                        ActivityC0945e activity = getActivity();
                                        if (activity != null) {
                                            View view2 = this.f175487D;
                                            if (view2 == null) {
                                                C89219l.m154710a("mStatusBar");
                                            }
                                            view2.getLayoutParams().height = C18247a.m33946a(activity);
                                        }
                                        ButtonTitleBar buttonTitleBar2 = this.f175500f;
                                        if (buttonTitleBar2 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        buttonTitleBar2.setTitle(getText(R.string.bbz));
                                        ImageView startBtn = buttonTitleBar2.getStartBtn();
                                        C89219l.m154716b(startBtn, "");
                                        startBtn.setVisibility(0);
                                        DmtTextView endBtn = buttonTitleBar2.getEndBtn();
                                        C89219l.m154716b(endBtn, "");
                                        endBtn.setVisibility(0);
                                        buttonTitleBar2.getEndBtn().setTextColor(buttonTitleBar2.getResources().getColor(C33447a.f79498a));
                                        DmtTextView endBtn2 = buttonTitleBar2.getEndBtn();
                                        C89219l.m154716b(endBtn2, "");
                                        endBtn2.setText(getText(R.string.y_));
                                        buttonTitleBar2.getEndBtn().setFontType(C17303d.f41573g);
                                        buttonTitleBar2.getEndBtn().setBackgroundColor(0);
                                        new SafeHandler(getActivity()).post(new RunnableC78160o(this));
                                        RecyclerView recyclerView = this.f175488E;
                                        if (recyclerView == null) {
                                            C89219l.m154710a("mListView");
                                        }
                                        recyclerView.setOverScrollMode(2);
                                        if (this.f175508n) {
                                            getActivity();
                                            this.f175494K = new WrapGridLayoutManager();
                                            RecyclerView recyclerView2 = this.f175488E;
                                            if (recyclerView2 == null) {
                                                C89219l.m154710a("mListView");
                                            }
                                            LinearLayoutManager linearLayoutManager = this.f175494K;
                                            if (linearLayoutManager == null) {
                                                C89219l.m154710a("layoutManager");
                                            }
                                            recyclerView2.setLayoutManager(linearLayoutManager);
                                            RecyclerView recyclerView3 = this.f175488E;
                                            if (recyclerView3 == null) {
                                                C89219l.m154710a("mListView");
                                            }
                                            recyclerView3.mo4415b(new C78174au((int) C13628n.m24520b(getContext(), 1.0f)));
                                        } else {
                                            getActivity();
                                            this.f175494K = new WrapLinearLayoutManager();
                                            RecyclerView recyclerView4 = this.f175488E;
                                            if (recyclerView4 == null) {
                                                C89219l.m154710a("mListView");
                                            }
                                            LinearLayoutManager linearLayoutManager2 = this.f175494K;
                                            if (linearLayoutManager2 == null) {
                                                C89219l.m154710a("layoutManager");
                                            }
                                            recyclerView4.setLayoutManager(linearLayoutManager2);
                                            RecyclerView recyclerView5 = this.f175488E;
                                            if (recyclerView5 == null) {
                                                C89219l.m154710a("mListView");
                                            }
                                            recyclerView5.mo4415b(new C78405c(getResources().getColor(R.color.c9), (int) C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f), C13628n.m24520b(getActivity(), 0.0f)));
                                        }
                                        LinearLayoutManager linearLayoutManager3 = this.f175494K;
                                        if (linearLayoutManager3 == null) {
                                            C89219l.m154710a("layoutManager");
                                        }
                                        C78176aw.f175577b = linearLayoutManager3.mo4730s();
                                        C78444c cVar = new C78444c(this, mo122088c().f176295h);
                                        this.f175504j = cVar;
                                        cVar.f176269c = this.f175497c;
                                        RecyclerView recyclerView6 = this.f175488E;
                                        if (recyclerView6 == null) {
                                            C89219l.m154710a("mListView");
                                        }
                                        C78444c cVar2 = this.f175504j;
                                        if (cVar2 == null) {
                                            C89219l.m154710a("mAdapter");
                                        }
                                        recyclerView6.setAdapter(cVar2);
                                        RecyclerView recyclerView7 = this.f175488E;
                                        if (recyclerView7 == null) {
                                            C89219l.m154710a("mListView");
                                        }
                                        LinearLayoutManager linearLayoutManager4 = this.f175494K;
                                        if (linearLayoutManager4 == null) {
                                            C89219l.m154710a("layoutManager");
                                        }
                                        recyclerView7.mo4405a(new C78155k(this, linearLayoutManager4));
                                        DmtStatusView dmtStatusView = this.f175501g;
                                        if (dmtStatusView == null) {
                                            C89219l.m154710a("mLoadingLayout");
                                        }
                                        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
                                        ButtonTitleBar buttonTitleBar3 = this.f175500f;
                                        if (buttonTitleBar3 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        DmtTextView endBtn3 = buttonTitleBar3.getEndBtn();
                                        ButtonTitleBar buttonTitleBar4 = this.f175500f;
                                        if (buttonTitleBar4 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        DmtTextView endBtn4 = buttonTitleBar4.getEndBtn();
                                        C89219l.m154716b(endBtn4, "");
                                        endBtn3.setTypeface(Typeface.create(endBtn4.getTypeface(), 0), 0);
                                        ButtonTitleBar buttonTitleBar5 = this.f175500f;
                                        if (buttonTitleBar5 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        buttonTitleBar5.getEndBtn().setFontType(C17303d.f41567a);
                                        ButtonTitleBar buttonTitleBar6 = this.f175500f;
                                        if (buttonTitleBar6 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        buttonTitleBar6.getEndBtn().setTextSize(1, 17.0f);
                                        ButtonTitleBar buttonTitleBar7 = this.f175500f;
                                        if (buttonTitleBar7 == null) {
                                            C89219l.m154710a("mTitleBar");
                                        }
                                        buttonTitleBar7.getTitleView().setTextSize(1, 17.0f);
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a
                                    /* renamed from: a */
                                    public final void mo122085a(View view, C78232c cVar) {
                                        C89219l.m154721d(cVar, "");
                                        if (view == null) {
                                            C89219l.m154715b();
                                        }
                                        C78402a aVar = new C78402a(view.getContext());
                                        Context context = view.getContext();
                                        C89219l.m154716b(context, "");
                                        aVar.mo122330a(new String[]{context.getResources().getString(R.string.y8)}, new DialogInterface$OnClickListenerC78172y(this, view, cVar));
                                        aVar.f176147a.mo458b();
                                    }

                                    @Override // androidx.fragment.app.Fragment
                                    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                        C89219l.m154721d(layoutInflater, "");
                                        super.onCreateView(layoutInflater, viewGroup, bundle);
                                        View a = C1764a.m5927a(layoutInflater, R.layout.a0u, viewGroup, false);
                                        C89219l.m154716b(a, "");
                                        return a;
                                    }

                                    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a
                                    /* renamed from: a */
                                    public final void mo122084a(View view, Context context, String str) {
                                        C89219l.m154721d(view, "");
                                        C89219l.m154721d(context, "");
                                        C89219l.m154721d(str, "");
                                        ActivityC0945e activity = getActivity();
                                        if (activity == null) {
                                            C89219l.m154715b();
                                        }
                                        C89219l.m154716b(activity, "");
                                        AbstractC89568bz unused = C89624i.m155555a(this.f175517w, null, null, new C78162q(this, activity, str, null), 3);
                                    }
                                }
