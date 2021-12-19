package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38158ae;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollApi;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3866b.C72889a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l */
public final class C73028l extends RelativeLayout implements AbstractC73037m {

    /* renamed from: l */
    public static final C73030b f163882l = new C73030b((byte) 0);

    /* renamed from: a */
    public final DispatchTouchEventView f163883a;

    /* renamed from: b */
    public final TextView f163884b;

    /* renamed from: c */
    public final TextView f163885c;

    /* renamed from: d */
    public final DispatchTouchEventView f163886d;

    /* renamed from: e */
    public final TextView f163887e;

    /* renamed from: f */
    public final TextView f163888f;

    /* renamed from: g */
    public String f163889g = "";

    /* renamed from: h */
    public final C88411a f163890h;

    /* renamed from: i */
    public long f163891i;

    /* renamed from: j */
    public PollStruct f163892j;

    /* renamed from: k */
    public AbstractC75400c f163893k;

    /* renamed from: m */
    private final TextView f163894m;

    /* renamed from: n */
    private final ViewGroup f163895n;

    /* renamed from: o */
    private final ViewGroup f163896o;

    /* renamed from: p */
    private boolean f163897p;

    /* renamed from: q */
    private final PollApi f163898q;

    /* renamed from: r */
    private C75391j f163899r;

    /* renamed from: s */
    private int f163900s;

    /* renamed from: t */
    private float[] f163901t;

    /* renamed from: u */
    private final Paint f163902u;

    /* renamed from: v */
    private final Path f163903v;

    /* renamed from: w */
    private final FrameLayout f163904w;

    /* renamed from: x */
    private InteractStickerStruct f163905x;

    /* renamed from: y */
    private C73029a f163906y;

    /* renamed from: z */
    private final AbstractC73031c f163907z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$c */
    public interface AbstractC73031c {
        static {
            Covode.recordClassIndex(85734);
        }

        /* renamed from: a */
        void mo115467a();
    }

    static {
        Covode.recordClassIndex(85731);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$b */
    public static final class C73030b {
        static {
            Covode.recordClassIndex(85733);
        }

        private C73030b() {
        }

        public /* synthetic */ C73030b(byte b) {
            this();
        }
    }

    public final AbstractC73031c getAnimEndListener() {
        return this.f163907z;
    }

    public final C75391j getInteractStickerParams() {
        return this.f163899r;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        return this.f163905x;
    }

    public final Path getPath() {
        return this.f163903v;
    }

    public final C73029a getPbListener() {
        return this.f163906y;
    }

    public final float[] getPoints() {
        return this.f163901t;
    }

    public final FrameLayout getPollView() {
        return this.f163904w;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC73037m
    public final int getStatus() {
        return this.f163900s;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC73037m
    /* renamed from: getStatus  reason: collision with other method in class */
    public final Integer m157066getStatus() {
        return Integer.valueOf(this.f163900s);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f163890h.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$d */
    public static final class C73032d implements AbstractC73031c {

        /* renamed from: a */
        final /* synthetic */ C73028l f163909a;

        static {
            Covode.recordClassIndex(85735);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73028l.AbstractC73031c
        /* renamed from: a */
        public final void mo115467a() {
            String str = this.f163909a.f163889g;
            if (str == null) {
                C89219l.m154715b();
            }
            AbstractC81915c.m141874a(new C72889a(str, this.f163909a.f163891i));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73032d(C73028l lVar) {
            this.f163909a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$g */
    static final class RunnableC73035g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73028l f163913a;

        /* renamed from: b */
        final /* synthetic */ PollStruct f163914b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75400c f163915c;

        static {
            Covode.recordClassIndex(85738);
        }

        RunnableC73035g(C73028l lVar, PollStruct pollStruct, AbstractC75400c cVar) {
            this.f163913a = lVar;
            this.f163914b = pollStruct;
            this.f163915c = cVar;
        }

        public final void run() {
            String str;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            TextView textView = this.f163913a.f163884b;
            C73028l lVar = this.f163913a;
            PollStruct pollStruct = this.f163914b;
            String str2 = null;
            if (pollStruct == null || (options2 = pollStruct.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
                str = null;
            } else {
                str = optionsBean2.getOptionText();
            }
            textView.setText(lVar.mo115447b(str));
            TextView textView2 = this.f163913a.f163887e;
            C73028l lVar2 = this.f163913a;
            PollStruct pollStruct2 = this.f163914b;
            if (!(pollStruct2 == null || (options = pollStruct2.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                str2 = optionsBean.getOptionText();
            }
            textView2.setText(lVar2.mo115447b(str2));
            DispatchTouchEventView dispatchTouchEventView = this.f163913a.f163883a;
            if (dispatchTouchEventView != null) {
                dispatchTouchEventView.setListener(this.f163915c);
            }
            DispatchTouchEventView dispatchTouchEventView2 = this.f163913a.f163886d;
            if (dispatchTouchEventView2 != null) {
                dispatchTouchEventView2.setListener(this.f163915c);
            }
            C73028l lVar3 = this.f163913a;
            lVar3.setStatus(lVar3.getPollStatus());
            this.f163913a.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73028l.RunnableC73035g.RunnableC730361 */

                /* renamed from: a */
                final /* synthetic */ RunnableC73035g f163916a;

                static {
                    Covode.recordClassIndex(85739);
                }

                {
                    this.f163916a = r1;
                }

                public final void run() {
                    C73028l lVar = this.f163916a.f163913a;
                    int status = this.f163916a.f163913a.getStatus();
                    if (status == 0) {
                        C73028l.m128929a(lVar.f163883a, lVar.f163884b, lVar.f163885c);
                        C73028l.m128929a(lVar.f163886d, lVar.f163887e, lVar.f163888f);
                    } else if (status == 1) {
                        lVar.f163883a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6j));
                        lVar.f163886d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6l));
                        float a = lVar.mo115441a(0, 0);
                        TextView textView = lVar.f163885c;
                        StringBuilder sb = new StringBuilder();
                        String a2 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a)}, 1));
                        C89219l.m154716b(a2, "");
                        textView.setText(sb.append(a2).append("%").toString());
                        TextView textView2 = lVar.f163888f;
                        StringBuilder sb2 = new StringBuilder();
                        String a3 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a)}, 1));
                        C89219l.m154716b(a3, "");
                        textView2.setText(sb2.append(a3).append("%").toString());
                        int i = (int) a;
                        lVar.mo115449c(lVar.f163883a, lVar.f163884b, lVar.f163885c, i);
                        lVar.mo115449c(lVar.f163886d, lVar.f163887e, lVar.f163888f, 100 - i);
                    } else if (status == 2) {
                        lVar.f163886d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6j));
                        lVar.f163883a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6l));
                        float a4 = lVar.mo115441a(0, 0);
                        TextView textView3 = lVar.f163885c;
                        StringBuilder sb3 = new StringBuilder();
                        String a5 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a4)}, 1));
                        C89219l.m154716b(a5, "");
                        textView3.setText(sb3.append(a5).append("%").toString());
                        TextView textView4 = lVar.f163888f;
                        StringBuilder sb4 = new StringBuilder();
                        String a6 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a4)}, 1));
                        C89219l.m154716b(a6, "");
                        textView4.setText(sb4.append(a6).append("%").toString());
                        int i2 = (int) a4;
                        lVar.mo115449c(lVar.f163883a, lVar.f163884b, lVar.f163885c, i2);
                        lVar.mo115449c(lVar.f163886d, lVar.f163887e, lVar.f163888f, 100 - i2);
                    } else if (status == 3) {
                        lVar.f163885c.setVisibility(0);
                        lVar.f163888f.setVisibility(0);
                        lVar.f163886d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6l));
                        lVar.f163883a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b6l));
                        float a7 = lVar.mo115441a(0, 0);
                        if (a7 == 101.0f) {
                            TextView textView5 = lVar.f163885c;
                            StringBuilder sb5 = new StringBuilder();
                            String a8 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                            C89219l.m154716b(a8, "");
                            textView5.setText(sb5.append(a8).append("%").toString());
                            TextView textView6 = lVar.f163888f;
                            StringBuilder sb6 = new StringBuilder();
                            String a9 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                            C89219l.m154716b(a9, "");
                            textView6.setText(sb6.append(a9).append("%").toString());
                            lVar.mo115449c(lVar.f163886d, lVar.f163887e, lVar.f163888f, 0);
                            lVar.mo115449c(lVar.f163883a, lVar.f163884b, lVar.f163885c, 0);
                            return;
                        }
                        TextView textView7 = lVar.f163885c;
                        StringBuilder sb7 = new StringBuilder();
                        String a10 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a7)}, 1));
                        C89219l.m154716b(a10, "");
                        textView7.setText(sb7.append(a10).append("%").toString());
                        TextView textView8 = lVar.f163888f;
                        StringBuilder sb8 = new StringBuilder();
                        String a11 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a7)}, 1));
                        C89219l.m154716b(a11, "");
                        textView8.setText(sb8.append(a11).append("%").toString());
                        int i3 = (int) a7;
                        lVar.mo115449c(lVar.f163883a, lVar.f163884b, lVar.f163885c, i3);
                        lVar.mo115449c(lVar.f163886d, lVar.f163887e, lVar.f163888f, 100 - i3);
                    }
                }
            });
        }
    }

    public final int getPollStatus() {
        Long l;
        Long l2;
        Long l3;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        if (this.f163897p) {
            return 3;
        }
        PollStruct pollStruct = this.f163892j;
        Long l4 = null;
        if (pollStruct != null) {
            l = Long.valueOf(pollStruct.getSelectOptionId());
        } else {
            l = null;
        }
        PollStruct pollStruct2 = this.f163892j;
        if (pollStruct2 == null || (options2 = pollStruct2.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(optionsBean2.getOptionId());
        }
        if (C89219l.m154714a(l, l2)) {
            return 1;
        }
        PollStruct pollStruct3 = this.f163892j;
        if (pollStruct3 != null) {
            l3 = Long.valueOf(pollStruct3.getSelectOptionId());
        } else {
            l3 = null;
        }
        PollStruct pollStruct4 = this.f163892j;
        if (!(pollStruct4 == null || (options = pollStruct4.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
            l4 = Long.valueOf(optionsBean.getOptionId());
        }
        if (C89219l.m154714a(l3, l4)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo115442a() {
        String str;
        String str2;
        String str3;
        String str4;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163899r;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163899r;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163899r;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163899r;
        if (!(jVar4 == null || (iVar = jVar4.f169463r) == null)) {
            str5 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str5);
        StickerAttrStruct b = C72890c.m128722b(this.f163905x);
        if (b == null || (str4 = b.getPollStickerId()) == null) {
            str4 = "";
        }
        C39162r.m79460a("guest_poll_click", a4.mo59983a("prop_id", str4).f79943a);
    }

    public final void setInteractStickerParams(C75391j jVar) {
        this.f163899r = jVar;
    }

    public final void setInteractStickerStruct(InteractStickerStruct interactStickerStruct) {
        this.f163905x = interactStickerStruct;
    }

    public final void setPoints(float[] fArr) {
        this.f163901t = fArr;
    }

    public final void setStatus(int i) {
        this.f163900s = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$a */
    public final class C73029a implements DispatchTouchEventView.AbstractC72945a {
        static {
            Covode.recordClassIndex(85732);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C73029a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView.AbstractC72945a
        /* renamed from: a */
        public final void mo115350a(int i) {
            long j;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            long j2;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            long j3;
            List<PollStruct.OptionsBean> options3;
            PollStruct.OptionsBean optionsBean3;
            List<PollStruct.OptionsBean> options4;
            PollStruct.OptionsBean optionsBean4;
            List<PollStruct.OptionsBean> options5;
            PollStruct.OptionsBean optionsBean5;
            String str;
            C75384i iVar;
            long j4;
            List<PollStruct.OptionsBean> options6;
            PollStruct.OptionsBean optionsBean6;
            long j5;
            List<PollStruct.OptionsBean> options7;
            PollStruct.OptionsBean optionsBean7;
            long j6;
            List<PollStruct.OptionsBean> options8;
            PollStruct.OptionsBean optionsBean8;
            List<PollStruct.OptionsBean> options9;
            PollStruct.OptionsBean optionsBean9;
            List<PollStruct.OptionsBean> options10;
            PollStruct.OptionsBean optionsBean10;
            String str2;
            C75384i iVar2;
            if (!C80580in.m139687c()) {
                Long l = null;
                if (i == R.id.d3q) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!g.isLogin()) {
                        Context context = C73028l.this.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) context;
                        C75391j interactStickerParams = C73028l.this.getInteractStickerParams();
                        if (interactStickerParams == null || (iVar2 = interactStickerParams.f169463r) == null || (str2 = iVar2.f169427a) == null) {
                            str2 = "";
                        }
                        C58957c.m108318a(activity, str2, "");
                        return;
                    }
                    C73028l lVar = C73028l.this;
                    PollStruct pollStruct = lVar.f163892j;
                    if (pollStruct == null || (options10 = pollStruct.getOptions()) == null || (optionsBean10 = options10.get(0)) == null) {
                        j4 = 0;
                    } else {
                        j4 = optionsBean10.getOptionId();
                    }
                    lVar.f163891i = j4;
                    float a = C73028l.this.mo115441a(0, 1);
                    TextView textView = C73028l.this.f163885c;
                    StringBuilder sb = new StringBuilder();
                    String a2 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a)}, 1));
                    C89219l.m154716b(a2, "");
                    textView.setText(sb.append(a2).append("%").toString());
                    TextView textView2 = C73028l.this.f163888f;
                    StringBuilder sb2 = new StringBuilder();
                    String a3 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a)}, 1));
                    C89219l.m154716b(a3, "");
                    textView2.setText(sb2.append(a3).append("%").toString());
                    C73028l lVar2 = C73028l.this;
                    int i2 = (int) a;
                    lVar2.mo115443a(lVar2.f163883a, C73028l.this.f163884b, C73028l.this.f163885c, i2);
                    C73028l lVar3 = C73028l.this;
                    lVar3.mo115448b(lVar3.f163886d, C73028l.this.f163887e, C73028l.this.f163888f, 100 - i2);
                    C73028l.this.setStatus(1);
                    C73028l lVar4 = C73028l.this;
                    PollStruct pollStruct2 = lVar4.f163892j;
                    if (!(pollStruct2 == null || (options9 = pollStruct2.getOptions()) == null || (optionsBean9 = options9.get(0)) == null)) {
                        l = Long.valueOf(optionsBean9.getOptionId());
                    }
                    lVar4.mo115445a(l);
                    PollStruct pollStruct3 = C73028l.this.f163892j;
                    if (pollStruct3 != null) {
                        PollStruct pollStruct4 = C73028l.this.f163892j;
                        if (pollStruct4 == null || (options8 = pollStruct4.getOptions()) == null || (optionsBean8 = options8.get(0)) == null) {
                            j6 = 0;
                        } else {
                            j6 = optionsBean8.getOptionId();
                        }
                        pollStruct3.setSelectOptionId(j6);
                    }
                    PollStruct pollStruct5 = C73028l.this.f163892j;
                    if (!(pollStruct5 == null || (options6 = pollStruct5.getOptions()) == null || (optionsBean6 = options6.get(0)) == null)) {
                        PollStruct pollStruct6 = C73028l.this.f163892j;
                        if (pollStruct6 == null || (options7 = pollStruct6.getOptions()) == null || (optionsBean7 = options7.get(0)) == null) {
                            j5 = 0;
                        } else {
                            j5 = optionsBean7.getPollCount();
                        }
                        optionsBean6.setPollCount(j5 + 1);
                    }
                    C73028l.this.mo115446a("A");
                    C73028l.this.mo115442a();
                } else if (i == R.id.d3r) {
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    if (!g2.isLogin()) {
                        Context context2 = C73028l.this.getContext();
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity2 = (Activity) context2;
                        C75391j interactStickerParams2 = C73028l.this.getInteractStickerParams();
                        if (interactStickerParams2 == null || (iVar = interactStickerParams2.f169463r) == null || (str = iVar.f169427a) == null) {
                            str = "";
                        }
                        C58957c.m108318a(activity2, str, "");
                        return;
                    }
                    C73028l lVar5 = C73028l.this;
                    PollStruct pollStruct7 = lVar5.f163892j;
                    if (pollStruct7 == null || (options5 = pollStruct7.getOptions()) == null || (optionsBean5 = options5.get(1)) == null) {
                        j = 0;
                    } else {
                        j = optionsBean5.getOptionId();
                    }
                    lVar5.f163891i = j;
                    float a4 = C73028l.this.mo115441a(1, 1);
                    TextView textView3 = C73028l.this.f163888f;
                    StringBuilder sb3 = new StringBuilder();
                    String a5 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a4)}, 1));
                    C89219l.m154716b(a5, "");
                    textView3.setText(sb3.append(a5).append("%").toString());
                    TextView textView4 = C73028l.this.f163885c;
                    StringBuilder sb4 = new StringBuilder();
                    String a6 = C1764a.m5928a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a4)}, 1));
                    C89219l.m154716b(a6, "");
                    textView4.setText(sb4.append(a6).append("%").toString());
                    C73028l lVar6 = C73028l.this;
                    int i3 = (int) a4;
                    lVar6.mo115443a(lVar6.f163886d, C73028l.this.f163887e, C73028l.this.f163888f, i3);
                    C73028l lVar7 = C73028l.this;
                    lVar7.mo115448b(lVar7.f163883a, C73028l.this.f163884b, C73028l.this.f163885c, 100 - i3);
                    C73028l.this.setStatus(2);
                    C73028l lVar8 = C73028l.this;
                    PollStruct pollStruct8 = lVar8.f163892j;
                    if (!(pollStruct8 == null || (options4 = pollStruct8.getOptions()) == null || (optionsBean4 = options4.get(1)) == null)) {
                        l = Long.valueOf(optionsBean4.getOptionId());
                    }
                    lVar8.mo115445a(l);
                    PollStruct pollStruct9 = C73028l.this.f163892j;
                    if (pollStruct9 != null) {
                        PollStruct pollStruct10 = C73028l.this.f163892j;
                        if (pollStruct10 == null || (options3 = pollStruct10.getOptions()) == null || (optionsBean3 = options3.get(1)) == null) {
                            j3 = 0;
                        } else {
                            j3 = optionsBean3.getOptionId();
                        }
                        pollStruct9.setSelectOptionId(j3);
                    }
                    PollStruct pollStruct11 = C73028l.this.f163892j;
                    if (!(pollStruct11 == null || (options = pollStruct11.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                        PollStruct pollStruct12 = C73028l.this.f163892j;
                        if (pollStruct12 == null || (options2 = pollStruct12.getOptions()) == null || (optionsBean2 = options2.get(1)) == null) {
                            j2 = 0;
                        } else {
                            j2 = optionsBean2.getPollCount();
                        }
                        optionsBean.setPollCount(j2 + 1);
                    }
                    C73028l.this.mo115446a("B");
                    C73028l.this.mo115442a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$f */
    public static final class C73034f implements AbstractC88986z<PollResponse> {

        /* renamed from: a */
        final /* synthetic */ C73028l f163912a;

        static {
            Covode.recordClassIndex(85737);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73034f(C73028l lVar) {
            this.f163912a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(PollResponse pollResponse) {
            C89219l.m154721d(pollResponse, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f163912a.f163890h.mo142945a(bVar);
        }
    }

    public final void setPbListener(C73029a aVar) {
        C89219l.m154721d(aVar, "");
        this.f163906y = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l$e */
    public static final class C73033e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C73028l f163910a;

        /* renamed from: b */
        final /* synthetic */ boolean f163911b;

        static {
            Covode.recordClassIndex(85736);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC75400c cVar;
            if (this.f163911b && (cVar = this.f163910a.f163893k) != null) {
                cVar.mo80254c();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f163911b) {
                AbstractC75400c cVar = this.f163910a.f163893k;
                if (cVar != null) {
                    cVar.mo80255d();
                }
                AbstractC73031c animEndListener = this.f163910a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo115467a();
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f163911b) {
                AbstractC75400c cVar = this.f163910a.f163893k;
                if (cVar != null) {
                    cVar.mo80255d();
                }
                AbstractC73031c animEndListener = this.f163910a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo115467a();
                }
            }
        }

        C73033e(C73028l lVar, boolean z) {
            this.f163910a = lVar;
            this.f163911b = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f163897p) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final String mo115447b(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C13628n.m24503a(getContext(), 15.0f));
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 < 0) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (C13628n.m24520b(getContext(), 20.0f) + ((float) rect.width()) + C13628n.m24520b(getContext(), 49.0f) < ((float) this.f163883a.getWidth())) {
                length = length2;
                break;
            }
            length2--;
        }
        if (length >= str.length() - 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, length);
        C89219l.m154716b(substring, "");
        return sb.append(substring).append("...").toString();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6364);
        super.onDraw(canvas);
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (C72890c.m128720a(context) && this.f163901t != null) {
            this.f163903v.reset();
            Path path = this.f163903v;
            float[] fArr = this.f163901t;
            if (fArr == null) {
                C89219l.m154715b();
            }
            float f = fArr[0];
            float[] fArr2 = this.f163901t;
            if (fArr2 == null) {
                C89219l.m154715b();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f163903v;
            float[] fArr3 = this.f163901t;
            if (fArr3 == null) {
                C89219l.m154715b();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f163901t;
            if (fArr4 == null) {
                C89219l.m154715b();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f163903v;
            float[] fArr5 = this.f163901t;
            if (fArr5 == null) {
                C89219l.m154715b();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f163901t;
            if (fArr6 == null) {
                C89219l.m154715b();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f163903v;
            float[] fArr7 = this.f163901t;
            if (fArr7 == null) {
                C89219l.m154715b();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f163901t;
            if (fArr8 == null) {
                C89219l.m154715b();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f163903v.close();
            if (canvas != null) {
                canvas.drawPath(this.f163903v, this.f163902u);
                MethodCollector.m26664o(6364);
                return;
            }
        }
        MethodCollector.m26664o(6364);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73028l(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6509);
        Object create = PollApi.C72885a.f163550a.createNewRetrofit(Api.f79771d).create(PollApi.class);
        C89219l.m154716b(create, "");
        this.f163898q = (PollApi) create;
        this.f163890h = new C88411a();
        this.f163902u = new Paint();
        this.f163903v = new Path();
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.biz, this, false);
        if (a != null) {
            FrameLayout frameLayout = (FrameLayout) a;
            this.f163904w = frameLayout;
            this.f163906y = new C73029a();
            View findViewById = frameLayout.findViewById(R.id.d3s);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.f163894m = textView;
            View findViewById2 = frameLayout.findViewById(R.id.dlq);
            C89219l.m154716b(findViewById2, "");
            ViewGroup viewGroup = (ViewGroup) findViewById2;
            this.f163895n = viewGroup;
            View findViewById3 = frameLayout.findViewById(R.id.d3q);
            C89219l.m154716b(findViewById3, "");
            DispatchTouchEventView dispatchTouchEventView = (DispatchTouchEventView) findViewById3;
            this.f163883a = dispatchTouchEventView;
            View findViewById4 = frameLayout.findViewById(R.id.egl);
            C89219l.m154716b(findViewById4, "");
            this.f163884b = (TextView) findViewById4;
            View findViewById5 = frameLayout.findViewById(R.id.d0c);
            C89219l.m154716b(findViewById5, "");
            TextView textView2 = (TextView) findViewById5;
            this.f163885c = textView2;
            View findViewById6 = frameLayout.findViewById(R.id.dlr);
            C89219l.m154716b(findViewById6, "");
            ViewGroup viewGroup2 = (ViewGroup) findViewById6;
            this.f163896o = viewGroup2;
            View findViewById7 = frameLayout.findViewById(R.id.d3r);
            C89219l.m154716b(findViewById7, "");
            DispatchTouchEventView dispatchTouchEventView2 = (DispatchTouchEventView) findViewById7;
            this.f163886d = dispatchTouchEventView2;
            View findViewById8 = frameLayout.findViewById(R.id.egm);
            C89219l.m154716b(findViewById8, "");
            this.f163887e = (TextView) findViewById8;
            View findViewById9 = frameLayout.findViewById(R.id.d0d);
            C89219l.m154716b(findViewById9, "");
            TextView textView3 = (TextView) findViewById9;
            this.f163888f = textView3;
            textView2.setAlpha(0.0f);
            textView3.setAlpha(0.0f);
            dispatchTouchEventView.setStatusView(this);
            dispatchTouchEventView2.setStatusView(this);
            dispatchTouchEventView.setClickListener(this.f163906y);
            dispatchTouchEventView2.setClickListener(this.f163906y);
            C0792v.m2739a(viewGroup, C13628n.m24520b(getContext(), 4.0f));
            C0792v.m2739a(viewGroup2, C13628n.m24520b(getContext(), 4.0f));
            Typeface typefaceByFontName = AVExternalServiceImpl.m113114a().typeFaceService().getTypefaceByFontName("");
            if (typefaceByFontName != null) {
                textView.setTypeface(typefaceByFontName);
            }
            int i = Build.VERSION.SDK_INT;
            frameLayout.setLayoutDirection(3);
            if (C80471gb.m139483a(getContext())) {
                viewGroup.setLayoutDirection(1);
                viewGroup2.setLayoutDirection(1);
            } else {
                viewGroup.setLayoutDirection(0);
                viewGroup2.setLayoutDirection(0);
            }
            addView(frameLayout);
            this.f163907z = new C73032d(this);
            MethodCollector.m26664o(6509);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(6509);
        throw nullPointerException;
    }

    /* renamed from: a */
    public final void mo115445a(Long l) {
        PollStruct pollStruct;
        long j;
        if (l != null && (pollStruct = this.f163892j) != null && Long.valueOf(pollStruct.getPollId()) != null) {
            PollApi pollApi = this.f163898q;
            PollStruct pollStruct2 = this.f163892j;
            if (pollStruct2 != null) {
                j = pollStruct2.getPollId();
            } else {
                j = 0;
            }
            pollApi.poll(j, l.longValue()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C73034f(this));
        }
    }

    /* renamed from: a */
    public final void mo115446a(String str) {
        String str2;
        String str3;
        String str4;
        Long l;
        C75391j jVar = this.f163899r;
        Long l2 = null;
        if (jVar != null && (str2 = jVar.f169453h) != null && str2.length() != 0) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C75391j jVar2 = this.f163899r;
            if (jVar2 != null) {
                str3 = jVar2.f169453h;
            } else {
                str3 = null;
            }
            C75391j jVar3 = this.f163899r;
            if (jVar3 != null) {
                str4 = jVar3.f169454i;
            } else {
                str4 = null;
            }
            C75391j jVar4 = this.f163899r;
            if (jVar4 != null) {
                l = Long.valueOf(jVar4.f169455j);
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            C75391j jVar5 = this.f163899r;
            if (jVar5 == null || (l2 = Long.valueOf(jVar5.f169456k)) == null) {
                C89219l.m154715b();
            }
            long longValue = l2.longValue();
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(valueOf, "");
            if (str3 != null && str3.length() != 0) {
                C38158ae.m77361a(context, "draw_ad", "poll_sticker_click", C38158ae.m77360a(C38158ae.m77359a(context, str3), str), str4, valueOf, longValue);
            }
        }
    }

    /* renamed from: a */
    public final float mo115441a(int i, int i2) {
        float f;
        float f2;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        List<PollStruct.OptionsBean> options3;
        PollStruct.OptionsBean optionsBean3;
        PollStruct pollStruct = this.f163892j;
        float f3 = 0.0f;
        if (pollStruct == null || (options3 = pollStruct.getOptions()) == null || (optionsBean3 = options3.get(0)) == null) {
            f = 0.0f;
        } else {
            f = (float) optionsBean3.getPollCount();
        }
        PollStruct pollStruct2 = this.f163892j;
        if (pollStruct2 == null || (options2 = pollStruct2.getOptions()) == null || (optionsBean2 = options2.get(1)) == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) optionsBean2.getPollCount();
        }
        float f4 = (float) i2;
        float f5 = f + f2 + f4;
        if (f5 != 0.0f) {
            PollStruct pollStruct3 = this.f163892j;
            if (!(pollStruct3 == null || (options = pollStruct3.getOptions()) == null || (optionsBean = options.get(i)) == null)) {
                f3 = (float) optionsBean.getPollCount();
            }
            return ((f3 + f4) / f5) * 100.0f;
        } else if (this.f163897p) {
            return 101.0f;
        } else {
            return 50.0f;
        }
    }

    /* renamed from: a */
    static void m128929a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2) {
        dispatchTouchEventView.setProgress(0);
        textView2.setAlpha(0.0f);
        textView.setTranslationX(0.0f);
    }

    /* renamed from: a */
    public final void mo115443a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i) {
        dispatchTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.b6j));
        m128930a(dispatchTouchEventView, textView, textView2, i, true);
    }

    /* renamed from: b */
    public final void mo115448b(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i) {
        dispatchTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.b6l));
        m128930a(dispatchTouchEventView, textView, textView2, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo115449c(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i) {
        float width = ((float) ((dispatchTouchEventView.getWidth() - textView.getWidth()) / 2)) - C13628n.m24520b(getContext(), 20.0f);
        if (C80471gb.m139483a(getContext())) {
            width = -width;
        }
        dispatchTouchEventView.setProgress(i);
        textView2.setAlpha(1.0f);
        textView.setTranslationX(-width);
    }

    /* renamed from: a */
    private final void m128930a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i, boolean z) {
        float width = ((float) ((dispatchTouchEventView.getWidth() - textView.getWidth()) / 2)) - C13628n.m24520b(getContext(), 20.0f);
        if (C80471gb.m139483a(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dispatchTouchEventView, "progress", 0, i);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, -width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new C73033e(this, z));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo115444a(PollStruct pollStruct, boolean z, String str, AbstractC75400c cVar, InteractStickerStruct interactStickerStruct) {
        String str2;
        this.f163892j = pollStruct;
        this.f163897p = z;
        if (str == null) {
            str = "";
        }
        this.f163889g = str;
        this.f163893k = cVar;
        this.f163905x = interactStickerStruct;
        String str3 = null;
        if (pollStruct != null) {
            str2 = pollStruct.getQuestion();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f163894m.setVisibility(8);
        } else {
            this.f163894m.setVisibility(0);
            TextView textView = this.f163894m;
            if (pollStruct != null) {
                str3 = pollStruct.getQuestion();
            }
            textView.setText(str3);
        }
        this.f163884b.post(new RunnableC73035g(this, pollStruct, cVar));
    }
}
