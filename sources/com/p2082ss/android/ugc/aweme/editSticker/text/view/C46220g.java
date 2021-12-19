package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.g */
public final class C46220g extends FrameLayout {

    /* renamed from: a */
    public List<C46219f> f107668a = new ArrayList();

    /* renamed from: b */
    public String f107669b;

    /* renamed from: c */
    public C46216c f107670c;

    /* renamed from: d */
    public int f107671d;

    /* renamed from: e */
    private List<C45995c> f107672e = new ArrayList();

    /* renamed from: f */
    private AbstractC46222a f107673f;

    /* renamed from: g */
    private LinearLayout f107674g;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.g$a */
    public interface AbstractC46222a {
        static {
            Covode.recordClassIndex(54784);
        }

        /* renamed from: a */
        void mo78485a(C45995c cVar);
    }

    static {
        Covode.recordClassIndex(54782);
    }

    /* renamed from: a */
    public final void mo78481a() {
        for (C46219f fVar : this.f107668a) {
            String b = C45989b.m88764a().mo77593b(this.f107671d);
            if (TextUtils.isEmpty(b) || !b.equals(fVar.getTag())) {
                fVar.setBackground(0);
            } else if (fVar.mo78473a()) {
                fVar.setBackground(1);
                fVar.mo78474b();
                this.f107670c.mo78470a(fVar);
            }
        }
    }

    public final void setClickFontStyleListener(AbstractC46222a aVar) {
        this.f107673f = aVar;
    }

    /* renamed from: a */
    public final void mo78482a(C45995c cVar) {
        AbstractC46222a aVar = this.f107673f;
        if (aVar != null) {
            aVar.mo78485a(cVar);
        }
        mo78481a();
    }

    /* renamed from: a */
    public final void mo78483a(List<C45995c> list) {
        MethodCollector.m26663i(10270);
        if (!C84904k.m145909a(this.f107672e)) {
            MethodCollector.m26664o(10270);
        } else if (C84904k.m145909a(list)) {
            C45989b.m88764a().mo77590a(getContext());
            MethodCollector.m26664o(10270);
        } else {
            this.f107672e = list;
            for (int i = 0; i < this.f107672e.size(); i++) {
                if (this.f107672e.get(i) != null) {
                    C45995c cVar = this.f107672e.get(i);
                    C46219f fVar = new C46219f(getContext());
                    if (cVar != null) {
                        fVar.setFontData(cVar);
                        fVar.mo78475c();
                        fVar.mo78474b();
                    }
                    fVar.setBackground(0);
                    if (!"default".equals(C45989b.m88764a().mo77593b(this.f107671d))) {
                        String b = C45989b.m88764a().mo77593b(this.f107671d);
                        if (!TextUtils.isEmpty(b) && b.equals(cVar.f107121e) && fVar.mo78473a()) {
                            fVar.setBackground(1);
                        }
                    } else if (i == 0 && cVar != null && fVar.mo78473a()) {
                        C45989b.m88764a().mo77591a(cVar.f107121e, this.f107671d);
                        fVar.setBackground(1);
                    }
                    fVar.setTag(cVar.f107121e);
                    fVar.setOnClickListener(new View$OnClickListenerC46223h(this, fVar));
                    fVar.setDownloadCallback(new AbstractC45988a() {
                        /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.C46220g.C462211 */

                        static {
                            Covode.recordClassIndex(54783);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a
                        /* renamed from: a */
                        public final void mo77586a(boolean z) {
                        }

                        @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a
                        /* renamed from: a */
                        public final void mo77585a(C45995c cVar, boolean z, boolean z2) {
                            if (z && cVar != null && !TextUtils.isEmpty(cVar.f107121e) && cVar.f107121e.equals(C46220g.this.f107669b)) {
                                C46220g.this.mo78482a(cVar);
                            }
                        }
                    });
                    this.f107668a.add(fVar);
                    this.f107674g.addView(fVar);
                }
            }
            MethodCollector.m26664o(10270);
        }
    }

    public C46220g(Context context, int i) {
        super(context, null);
        MethodCollector.m26663i(10268);
        this.f107671d = i;
        this.f107674g = new LinearLayout(getContext());
        this.f107670c = new C46216c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f107674g.setPadding((int) C84912r.m145930a(getContext(), 12.0f), 0, 0, 0);
        this.f107670c.addView(this.f107674g, layoutParams);
        this.f107670c.setHorizontalScrollBarEnabled(false);
        addView(this.f107670c, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.m26664o(10268);
    }
}
