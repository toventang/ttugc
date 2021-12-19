package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65498u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import dmt.p4542av.video.C88151a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a */
public abstract class AbstractC78487a implements AbstractC78550l {

    /* renamed from: a */
    protected ExtractFramesModel f176391a = new ExtractFramesModel(mo122447e());

    /* renamed from: b */
    protected volatile boolean f176392b;

    /* renamed from: c */
    protected C78553n f176393c = new C78553n(C63238c.f143574a);

    /* renamed from: d */
    protected String f176394d = UUID.randomUUID().toString();

    static {
        Covode.recordClassIndex(91619);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract List<C78595z> mo122412d();

    /* renamed from: c */
    public final ExtractFramesModel mo122411c() {
        return this.f176391a;
    }

    /* renamed from: b */
    public static boolean m137043b() {
        if (C65498u.m117222a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo122408a() {
        this.f176392b = false;
        this.f176391a = new ExtractFramesModel(mo122447e());
        this.f176394d = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public void mo122410a(boolean z) {
        C88151a.m153229a("extracting_frame");
        this.f176392b = false;
    }

    /* renamed from: a */
    public void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "start extract frame for " + mo122447e());
        C88151a.m153230a("extracting_frame", mo122447e());
        if (!m137043b()) {
            aVar.mo122481a(false);
            return;
        }
        this.f176392b = true;
        C78553n nVar = this.f176393c;
        nVar.mo122484a(C78553n.m137133a(nVar.f176545a).getAbsolutePath(), mo122447e(), this.f176394d);
        this.f176391a.setExtractFramesDir(this.f176393c.f176546b);
        C63253l.f143623a.mo73315k().getFrameVerificationService().onExtractFrameContextActive(mo122447e(), this.f176394d, this.f176393c.f176546b, "creationId not available currently.");
        this.f176391a.addFrameSegment(new ArrayList<>(), null);
    }
}
