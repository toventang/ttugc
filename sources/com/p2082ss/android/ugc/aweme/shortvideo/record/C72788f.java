package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46873ec;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74294n;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83717a;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83723d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.f */
public final class C72788f {

    /* renamed from: a */
    public final ScrollableLinearLayout f163214a;

    /* renamed from: b */
    public final C83723d f163215b = new C83723d();

    /* renamed from: c */
    public AbstractC23317a f163216c;

    /* renamed from: d */
    public C74294n f163217d;

    /* renamed from: e */
    public final Set<String> f163218e = new LinkedHashSet();

    /* renamed from: f */
    public final C83717a f163219f = new C83717a();

    /* renamed from: g */
    public final Map<Integer, View> f163220g = new LinkedHashMap();

    /* renamed from: h */
    public final TabHost f163221h;

    /* renamed from: i */
    public final ShortVideoContext f163222i;

    static {
        Covode.recordClassIndex(85474);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.f$a */
    public static final class RunnableC72789a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72788f f163223a;

        static {
            Covode.recordClassIndex(85475);
        }

        public RunnableC72789a(C72788f fVar) {
            this.f163223a = fVar;
        }

        public final void run() {
            String str;
            AbstractC23317a aVar = this.f163223a.f163216c;
            if (aVar != null) {
                aVar.mo38001a();
            }
            C84425b a = new C84425b().mo129406a("event_page", "shoot");
            if (C46873ec.m90187a()) {
                str = "before_templates";
            } else {
                str = "after_templates";
            }
            C39162r.m79460a("livesdk_live_tab_popup_show", a.mo129406a("live_tab_position", str).f188764a);
        }
    }

    public C72788f(TabHost tabHost, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(tabHost, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f163221h = tabHost;
        this.f163222i = shortVideoContext;
        this.f163214a = (ScrollableLinearLayout) tabHost.findViewById(R.id.acf);
    }

    /* renamed from: a */
    public final void mo115071a(int i, String str, int i2, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        ScrollableLinearLayout scrollableLinearLayout = this.f163214a;
        C89219l.m154716b(scrollableLinearLayout, "");
        C74294n nVar = new C74294n(scrollableLinearLayout.getContext());
        nVar.setText(str);
        if (i2 != 0) {
            Context context = nVar.getContext();
            C89219l.m154716b(context, "");
            Drawable drawable = context.getResources().getDrawable(i2);
            C89219l.m154716b(drawable, "");
            drawable.setBounds(0, 1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + 1);
            nVar.getTextView().setCompoundDrawables(drawable, null, null, null);
            TextView textView = nVar.getTextView();
            C89219l.m154716b(textView, "");
            textView.setCompoundDrawablePadding((int) C13628n.m24520b(nVar.getContext(), 3.0f));
        }
        nVar.setTag(str2);
        this.f163218e.add(str2);
        this.f163214a.addView(nVar, i);
        if (C89219l.m154714a(nVar.getTag(), (Object) C80573ig.m139668a(R.string.f7u))) {
            this.f163217d = nVar;
        }
    }
}
