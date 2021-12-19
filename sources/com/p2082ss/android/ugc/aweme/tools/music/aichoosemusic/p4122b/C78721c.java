package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2432c.C35336c;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78727d;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.c */
public final class C78721c extends AbstractC78708a {

    /* renamed from: e */
    private final C35336c f176909e;

    static {
        Covode.recordClassIndex(91864);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a
    /* renamed from: e */
    public final void mo122572e() {
        if (this.f176909e.f83368a.isEmpty()) {
            mo122569a("");
        } else {
            super.mo122572e();
        }
    }

    public C78721c(C35336c cVar) {
        C89219l.m154721d(cVar, "");
        this.f176909e = cVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a
    /* renamed from: a */
    public final Object mo122566a(AbstractC89124d<? super String> dVar) {
        return C84915u.m145940a(mo122568a(), m137372a(C78727d.m137386a(C89070n.m154585g((Collection) this.f176909e.f83368a), m137360b())));
    }

    /* renamed from: a */
    private final List<String> m137372a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : list) {
            if (C84902i.m145892a((String) t)) {
                try {
                    Bitmap a = C84896h.m145856a(t, (BitmapFactory.Options) null);
                    if (a != null) {
                        String absolutePath = mo122565a(C78727d.m137385a(a), i).getAbsolutePath();
                        C89219l.m154716b(absolutePath, "");
                        arrayList.add(absolutePath);
                    }
                } catch (Exception e) {
                    C84911q.m145921a("resizePicturesForAI fail err: ".concat(String.valueOf(e)));
                }
            }
            i++;
        }
        return arrayList;
    }
}
