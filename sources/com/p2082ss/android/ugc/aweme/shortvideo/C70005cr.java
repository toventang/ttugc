package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43239n;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80532hf;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cr */
public class C70005cr implements AbstractC40891f, AbstractC43239n {

    /* renamed from: k */
    public static Boolean f156479k = false;

    /* renamed from: s */
    public static boolean f156480s = false;

    /* renamed from: t */
    private static C70005cr f156481t;

    /* renamed from: a */
    public C69905c f156482a;

    /* renamed from: b */
    public boolean f156483b;

    /* renamed from: c */
    public C69905c f156484c;

    /* renamed from: d */
    public List<AVChallenge> f156485d = new ArrayList();

    /* renamed from: e */
    public String f156486e;

    /* renamed from: f */
    public int f156487f;

    /* renamed from: g */
    public Boolean f156488g = false;

    /* renamed from: h */
    public Boolean f156489h = false;

    /* renamed from: i */
    public Boolean f156490i = false;

    /* renamed from: j */
    public Boolean f156491j = false;

    /* renamed from: l */
    public AVChallenge f156492l = null;

    /* renamed from: m */
    public Boolean f156493m = false;

    /* renamed from: n */
    public Boolean f156494n = false;

    /* renamed from: o */
    public String f156495o = null;

    /* renamed from: p */
    public String f156496p;

    /* renamed from: q */
    public RecordScene f156497q;

    /* renamed from: r */
    public volatile boolean f156498r = false;

    /* renamed from: u */
    private int f156499u;

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f
    /* renamed from: b */
    public final C69905c mo70084b() {
        return this.f156482a;
    }

    /* renamed from: c */
    public final void mo110453c() {
        this.f156494n = false;
    }

    /* renamed from: d */
    public final void mo110454d() {
        this.f156494n = true;
    }

    /* renamed from: e */
    public final String mo110455e() {
        String str = this.f156496p;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: f */
    public final void mo110456f() {
        this.f156485d.clear();
    }

    static {
        Covode.recordClassIndex(82419);
    }

    /* renamed from: g */
    public static boolean m123616g() {
        return AVServiceImpl.m113116a().isPublishing(null);
    }

    private C70005cr() {
        C63244g.m114602a().mo73275c().mo101845a(this);
    }

    /* renamed from: a */
    public static C70005cr m123611a() {
        MethodCollector.m26663i(6119);
        if (f156481t == null) {
            synchronized (C70005cr.class) {
                try {
                    if (f156481t == null) {
                        f156481t = new C70005cr();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6119);
                    throw th;
                }
            }
        }
        C70005cr crVar = f156481t;
        MethodCollector.m26664o(6119);
        return crVar;
    }

    /* renamed from: b */
    private static Context m123614b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo110449a(int i) {
        C63244g.m114602a();
        this.f156499u = i;
        m123615b(i);
    }

    /* renamed from: a */
    public static void m123612a(RecordScene recordScene) {
        if (recordScene != null && recordScene.extractFramesModel != null) {
            C80720e.m139938e(recordScene.extractFramesModel.getExtractFramesDir());
            C80720e.m139931c(recordScene.extractFramesModel.getExtractFramesDir());
        }
    }

    /* renamed from: b */
    private void m123615b(int i) {
        if (i == 9 || i == 10 || i == 12) {
            this.f156496p = "";
        }
    }

    /* renamed from: a */
    public static boolean m123613a(Context context) {
        boolean g = m123616g();
        if (!g && C63244g.m114602a().mo73287o().mo104784d()) {
            g = C63244g.m114602a().mo73287o().mo104785e() > 0;
        }
        if (g) {
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("open_camera", "check is already published: no ");
            new C79459a(m123614b(context)).mo123050a(R.string.f94).mo123053a();
            return false;
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("open_camera", "check is already published: yes ");
        return true;
    }

    /* renamed from: a */
    public final void mo110450a(AVChallenge aVChallenge) {
        if (aVChallenge != null && aVChallenge.getCid() != null) {
            this.f156485d.clear();
            if (this.f156492l != null && "challenge".equals(this.f156486e) && !aVChallenge.getCid().equals(this.f156492l.getCid())) {
                this.f156485d.add(this.f156492l);
            }
            this.f156485d.add(aVChallenge);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f
    /* renamed from: a */
    public final void mo70083a(C69905c cVar) {
        Object valueOf;
        this.f156482a = cVar;
        StringBuilder sb = new StringBuilder("PublishManager, set music, ");
        if (cVar == null) {
            valueOf = "null";
        } else {
            valueOf = Long.valueOf(cVar.f156195id);
        }
        C73991bj.m130133d(sb.append(valueOf).append(" stacktrack: ").append(C80532hf.m139602a(8)).toString());
        this.f156483b = false;
    }

    /* renamed from: a */
    public final void mo110452a(Collection<AVChallenge> collection) {
        if (collection != null) {
            this.f156485d.clear();
            this.f156485d.addAll(collection);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43239n
    /* renamed from: a */
    public final void mo69463a(C43223c cVar, boolean z) {
        if (!z) {
            this.f156496p = "";
        }
    }

    /* renamed from: a */
    public final void mo110451a(C69905c cVar, boolean z) {
        Object valueOf;
        this.f156482a = cVar;
        StringBuilder sb = new StringBuilder("PublishManager, set music, ");
        if (cVar == null) {
            valueOf = "null";
        } else {
            valueOf = Long.valueOf(cVar.f156195id);
        }
        C73991bj.m130133d(sb.append(valueOf).append(" stacktrack: ").append(C80532hf.m139602a(8)).append(" isPhotoMvMode:").append(z).toString());
        this.f156483b = z;
    }
}
