package com.p2082ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.s */
public final class C78560s extends AbstractC78487a {

    /* renamed from: f */
    private static final String f176552f = C78560s.class.getSimpleName();

    /* renamed from: e */
    private final List<String> f176553e;

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public final String mo122447e() {
        return "extract_movie";
    }

    static {
        Covode.recordClassIndex(91692);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        List<String> list = this.f176553e;
        if (C84904k.m145909a(list)) {
            return null;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            C78595z zVar = new C78595z();
            zVar.f176632a = str;
            arrayList.add(zVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Void mo122487f() {
        List<String> list = this.f176553e;
        if (list != null && !list.isEmpty()) {
            Iterator it = new HashSet(this.f176553e).iterator();
            while (it.hasNext()) {
                Bitmap a = C84891c.m145844a((String) it.next(), C78549k.f176544a);
                if (a != null) {
                    String a2 = this.f176393c.mo122482a();
                    C84891c.m145848a(a, new File(a2), 70, Bitmap.CompressFormat.JPEG);
                    this.f176391a.addFrameAtLastSegment(new FrameItem(a2));
                }
            }
        }
        return null;
    }

    public C78560s(List<String> list) {
        this.f176553e = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        super.mo122409a(aVar);
        if (m137043b()) {
            C1731i.m5640b(new CallableC78561t(this), C1731i.f5562a).mo5532a((AbstractC1729g) new C78562u(this, aVar));
        }
    }
}
