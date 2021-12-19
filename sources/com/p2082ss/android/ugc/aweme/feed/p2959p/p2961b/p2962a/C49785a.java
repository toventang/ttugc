package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.a.a */
public final class C49785a extends FrameLayout {

    /* renamed from: b */
    public static final C49786a f114533b = new C49786a((byte) 0);

    /* renamed from: a */
    final FrameLayout f114534a;

    /* renamed from: c */
    private final View f114535c;

    static {
        Covode.recordClassIndex(58890);
    }

    public C49785a(Context context, char c) {
        this(context, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.a.a$a */
    public static final class C49786a {
        static {
            Covode.recordClassIndex(58891);
        }

        private C49786a() {
        }

        public /* synthetic */ C49786a(byte b) {
            this();
        }
    }

    public final FrameLayout getContent() {
        return this.f114534a;
    }

    public final View getRoot() {
        return this.f114535c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C49785a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8232);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a0_, this, true);
        this.f114535c = a;
        FrameLayout frameLayout = (FrameLayout) a.findViewById(R.id.d0_);
        this.f114534a = frameLayout;
        if (C49783b.m93234a()) {
            View a2 = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aie, frameLayout, true);
            View findViewById = a2.findViewById(R.id.dlx);
            ImageView imageView = (ImageView) a2.findViewById(R.id.bwm);
            TextView textView = (TextView) a2.findViewById(R.id.eu6);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            C89219l.m154716b(textView, "");
            textView.setText(getContext().getString(R.string.dcq));
            findViewById.setBackgroundColor(C0643b.m2378c(getContext(), R.color.as));
            C89219l.m154716b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, ((int) C13628n.m24520b(getContext(), 52.0f)) + C13628n.m24525e(getContext()), 0, 0);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                MethodCollector.m26664o(8232);
                throw nullPointerException;
            }
        }
        MethodCollector.m26664o(8232);
    }

    private /* synthetic */ C49785a(Context context, byte b) {
        this(context);
    }
}
