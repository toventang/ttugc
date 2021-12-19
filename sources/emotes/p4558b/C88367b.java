package emotes.p4558b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.C88365e;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: emotes.b.b */
public final class C88367b {

    /* renamed from: l */
    public static final C88368a f200603l = new C88368a((byte) 0);

    /* renamed from: a */
    public float f200604a;

    /* renamed from: b */
    public long f200605b;

    /* renamed from: c */
    public long f200606c;

    /* renamed from: d */
    public boolean f200607d = true;

    /* renamed from: e */
    public long f200608e;

    /* renamed from: f */
    public int f200609f = -1;

    /* renamed from: g */
    public final Handler f200610g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public float f200611h;

    /* renamed from: i */
    public float f200612i;

    /* renamed from: j */
    public C88365e f200613j;

    /* renamed from: k */
    public int f200614k = 5;

    /* renamed from: m */
    private View f200615m;

    static {
        Covode.recordClassIndex(104407);
    }

    /* renamed from: emotes.b.b$a */
    public static final class C88368a {
        static {
            Covode.recordClassIndex(104408);
        }

        private C88368a() {
        }

        public /* synthetic */ C88368a(byte b) {
            this();
        }
    }

    /* renamed from: emotes.b.b$b */
    public static final class RunnableC88369b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C88367b f200616a;

        /* renamed from: b */
        final /* synthetic */ View f200617b;

        /* renamed from: c */
        final /* synthetic */ int f200618c;

        /* renamed from: d */
        final /* synthetic */ EmoteModel f200619d;

        static {
            Covode.recordClassIndex(104409);
        }

        public RunnableC88369b(C88367b bVar, View view, int i, EmoteModel emoteModel) {
            this.f200616a = bVar;
            this.f200617b = view;
            this.f200618c = i;
            this.f200619d = emoteModel;
        }

        public final void run() {
            C88367b bVar = this.f200616a;
            bVar.mo142874a(bVar.f200611h, this.f200617b, this.f200618c, this.f200619d);
        }
    }

    /* renamed from: a */
    public final void mo142874a(float f, View view, int i, EmoteModel emoteModel) {
        View view2;
        if (this.f200609f != i && System.currentTimeMillis() - this.f200608e > 500 && Math.abs(f - this.f200604a) < 20.0f) {
            this.f200607d = false;
            this.f200610g.removeCallbacksAndMessages(null);
        }
        int i2 = this.f200609f;
        if (!(i2 < 0 || i == i2 || (view2 = this.f200615m) == null)) {
            view2.setBackground(new ColorDrawable(0));
        }
        if (!this.f200607d) {
            View findViewById = view.findViewById(R.id.bv_);
            if (emoteModel.f8728h != null) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                m153564a(i, emoteModel, findViewById, context);
            }
        }
    }

    /* renamed from: a */
    private final void m153564a(int i, EmoteModel emoteModel, View view, Context context) {
        int i2;
        MethodCollector.m26663i(9867);
        if (this.f200609f == i || view == null) {
            MethodCollector.m26664o(9867);
            return;
        }
        this.f200609f = i;
        this.f200615m = view;
        int a = (int) C89393b.m154948a(126.0f);
        int i3 = i % this.f200614k;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bap, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.c0q);
        C89219l.m154716b(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i3 == 0) {
                marginLayoutParams.setMarginStart(C3966y.m9653a(25.0f));
            } else if (i3 == this.f200614k - 1) {
                marginLayoutParams.setMarginStart(C3966y.m9653a(67.0f));
            } else {
                marginLayoutParams.setMarginStart(C3966y.m9653a(46.0f));
            }
            imageView.setLayoutParams(marginLayoutParams);
            C88365e eVar = this.f200613j;
            if (eVar == null || !eVar.isShowing()) {
                this.f200613j = new C88365e();
            } else {
                C88365e eVar2 = this.f200613j;
                if (eVar2 == null) {
                    C89219l.m154715b();
                }
                eVar2.dismiss();
            }
            C88365e eVar3 = this.f200613j;
            if (eVar3 != null) {
                eVar3.mo142872a(inflate, context, (int) C89393b.m154948a(126.0f), (int) C89393b.m154948a(130.0f));
            }
            C88365e eVar4 = this.f200613j;
            if (eVar4 != null) {
                eVar4.f200596a = 0;
            }
            if (i3 == this.f200614k - 1) {
                i2 = -(a - view.getWidth());
            } else {
                i2 = (-(a - view.getWidth())) / 2;
            }
            View findViewById = inflate.findViewById(R.id.bwq);
            C89219l.m154716b(findViewById, "");
            HSImageView hSImageView = (HSImageView) findViewById;
            if (emoteModel.f8728h != null) {
                C88365e eVar5 = this.f200613j;
                if (eVar5 == null) {
                    C89219l.m154715b();
                }
                eVar5.mo142871a(view, i2);
                C3951p.m9622a(hSImageView, emoteModel.f8728h, 0);
                C88365e eVar6 = this.f200613j;
                if (eVar6 == null) {
                    C89219l.m154715b();
                }
                eVar6.update((int) C89393b.m154948a(126.0f), (int) C89393b.m154948a(130.0f));
            }
            MethodCollector.m26664o(9867);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        MethodCollector.m26664o(9867);
        throw nullPointerException;
    }
}
