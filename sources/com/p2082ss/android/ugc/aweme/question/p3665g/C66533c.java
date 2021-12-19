package com.p2082ss.android.ugc.aweme.question.p3665g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.question.g.c */
public class C66533c {

    /* renamed from: b */
    private static C66533c f149599b;

    /* renamed from: a */
    HashMap<String, C66504c> f149600a = new HashMap<>();

    /* renamed from: c */
    private Set<String> f149601c = new HashSet();

    /* renamed from: d */
    private HashMap<String, C66504c> f149602d = new HashMap<>();

    /* renamed from: e */
    private Set<String> f149603e = new HashSet();

    static {
        Covode.recordClassIndex(78076);
    }

    private C66533c() {
    }

    /* renamed from: a */
    public static C66533c m118280a() {
        MethodCollector.m26663i(11508);
        if (f149599b == null) {
            synchronized (C66533c.class) {
                try {
                    if (f149599b == null) {
                        f149599b = new C66533c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11508);
                    throw th;
                }
            }
        }
        C66533c cVar = f149599b;
        MethodCollector.m26664o(11508);
        return cVar;
    }

    /* renamed from: b */
    private C66504c m118282b(String str) {
        return this.f149600a.get(str);
    }

    /* renamed from: a */
    public final C33943c<C66532b> mo105518a(String str) {
        this.f149603e.add(str);
        return C34603a.C34604a.f81659a.mo61063a(str);
    }

    /* renamed from: a */
    public final void mo105519a(C66504c cVar) {
        m118281a(cVar, this.f149602d.get(cVar.getId().toString()), false);
        m118280a().mo105518a(cVar.getId().toString()).setValue(new C66532b(cVar, true));
    }

    /* renamed from: a */
    public final void mo105521a(C66504c cVar, boolean z) {
        if (z) {
            this.f149601c.add(cVar.getId().toString());
        } else {
            this.f149601c.remove(cVar.getId().toString());
        }
    }

    /* renamed from: a */
    private static void m118281a(C66504c cVar, C66504c cVar2, boolean z) {
        if (cVar != null && cVar2 != null) {
            cVar.setTranslated(Boolean.valueOf(z));
            cVar.setContent(cVar2.getContent());
        }
    }

    /* renamed from: a */
    public final void mo105520a(C66504c cVar, C66530a aVar, CommentTranslationStatusView commentTranslationStatusView) {
        C66504c b = m118282b(cVar.getId().toString());
        if (b != null) {
            m118281a(cVar, b, true);
            m118280a().mo105518a(cVar.getId().toString()).setValue(new C66532b(cVar, true));
            return;
        }
        mo105521a(cVar, true);
        this.f149602d.put(cVar.getId().toString(), cVar.clone());
        if (commentTranslationStatusView != null) {
            commentTranslationStatusView.setLoadingText(R.string.am9);
            commentTranslationStatusView.setLoading(true);
        }
        C29339a.m58752a(new RunnableC66534d(cVar, aVar));
    }
}
